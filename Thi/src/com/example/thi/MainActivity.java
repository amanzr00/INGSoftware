package com.example.thi;
import java.util.ArrayList;

import android.app.ActionBar;
import android.app.ActionBar.OnNavigationListener;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;

@SuppressWarnings("deprecation")
public class MainActivity extends Activity implements ActionBar.TabListener,
		OnPageChangeListener {

	//
	private ViewPager mViewPager;;
	// Create the Array list of to do items
	final ArrayList<String> toDoItems = new ArrayList<String>();

	// Create the Array Adapter to bin the array to the ListView
	ArrayAdapter<String> aa;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_pager);

		PagerAdapter adapter = new PagerAdapter(getFragmentManager());
		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setAdapter(adapter);
		mViewPager.setOnPageChangeListener(this);
		ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		Tab tab1 = actionBar.newTab().setText(R.string.hotels)
				.setTabListener(this);
		actionBar.addTab(tab1);
		Tab tab2 = actionBar.newTab().setText("Peluquerias")
				.setTabListener(this);
		actionBar.addTab(tab2);
	}

	/**
	 * Method used to create the tab listeners in ActionBar
	 * 
	 * @return
	 */
	public TabListener createTabListeners() {
		// Create a tab listener that is called when the user changes tabs.
		ActionBar.TabListener tabListener = new ActionBar.TabListener() {
			public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
				// show the given tab
			}

			public void onTabUnselected(ActionBar.Tab tab,
					FragmentTransaction ft) {
				// hide the given tab
			}

			public void onTabReselected(ActionBar.Tab tab,
					FragmentTransaction ft) {
				// probably ignore this event
			}
		};

		return tabListener;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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

		if (id == R.id.action_new_establishment) {
			startActivity(new Intent(this, TemplateActivity.class));
		}

		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onPageScrollStateChanged(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPageSelected(int arg0) {
		getActionBar().setSelectedNavigationItem(arg0);

	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		mViewPager.setCurrentItem(tab.getPosition());

	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub

	}

}
