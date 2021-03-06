package com.example.thi.establishments;

import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;

@SuppressWarnings("deprecation")
public class TabsListener<T extends Fragment> implements TabListener {
	private Fragment fragment;
	private final String tag;

	public TabsListener(Activity activity, String tag, Class<T> cls) {
		this.tag = tag;
		fragment = Fragment.instantiate(activity, cls.getName());
	}

	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		ft.replace(android.R.id.content, fragment, tag);
	}

	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		ft.remove(fragment);
	}

	public void onTabReselected(Tab tab, FragmentTransaction ft) {
	}
}
