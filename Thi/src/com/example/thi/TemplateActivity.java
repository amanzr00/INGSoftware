package com.example.thi;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class TemplateActivity extends Activity {
private static final int TOMAR_FOTO = 1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_template);
		getActionBar().setDisplayHomeAsUpEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.template, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * Method to select or take a picture for the new establishment
	 * 
	 * @param view
	 */
	public void upImageWithCamera(View view) {
		Intent camaraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
		startActivityForResult(camaraIntent, TOMAR_FOTO);
		
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data){
		if (requestCode == TOMAR_FOTO) {
			Bitmap image = (Bitmap) data.getExtras().get("data");
			ImageView iv_foto = (ImageView) findViewById(R.id.photoView);
			iv_foto.setImageBitmap(image);
		}
	}
	/**
	 * Method to cancel the operation
	 * 
	 * @param view
	 */
	public void cancel(View view) {
		finish();
	}
}
