package com.example.thi.establishments;

import com.example.thi.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HotelsFragment extends Fragment {
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_hotels, container,
				false);
		TextView texto = (TextView) rootView.findViewById(R.id.list_hotels);
		texto.setText("Tab seleccionada" + "\n\n" + "Hoteles");
		
		return rootView;
	}
}