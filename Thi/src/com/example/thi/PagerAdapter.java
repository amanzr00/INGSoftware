package com.example.thi;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;

import com.example.thi.establishments.*;

public class PagerAdapter extends FragmentPagerAdapter {
	public PagerAdapter(FragmentManager fm) {
		super(fm);
	}

	/*
	 * Con este metodo indicamos que cuando tenga que cargar dicha vista, nos
	 * cree un nuevo fragmento(non-Javadoc)
	 * 
	 * @see android.support.v13.app.FragmentPagerAdapter#getItem(int)
	 */
	public Fragment getItem(int arg0) {
		switch (arg0) {
		case 0:
			return new HairdressersFragment();
		case 1:
			return new HotelsFragment();
		default:
			return null;
		}
	}

	/*
	 * Nos devuelve el numero de vistas(non-Javadoc)
	 * 
	 * @see android.support.v4.view.PagerAdapter#getCount()
	 */
	public int getCount() {
		return 2;
	}
	/*
	 * De esta manera siempre tenga cargado en memoria el fragmento o pesta�a
	 * visible en pantalla y tambien el mas cercano a la izquierda y al derecha
	 * (el resto no exisitran hasta que nos acerquemos a ellos)
	 */
}