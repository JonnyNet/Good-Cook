package com.example.good;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class GridAdacter extends BaseAdapter {

	private final String[] datos = { "Unidad", "Kg", "Libra", "Gramo", "Miligramo",
			"Mililitro", "Onza", "Botella" };
	private Context c;

	public GridAdacter(Context context) {
		super();
		c = context;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		LayoutInflater inflater = (LayoutInflater) c
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		View listView;

		if (convertView == null) {
			listView = new View(c);
			listView = inflater.inflate(R.layout.itemgrid, null);

			TextView codigo = (TextView) listView.findViewById(R.id.codigo);
			codigo.setText("00" + (position + 1));

			TextView info = (TextView) listView.findViewById(R.id.detalle);
			info.setText(datos[position]);
		} else {

			listView = (View) convertView;
		}

		return listView;

	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return datos.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return datos[position];
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}
}