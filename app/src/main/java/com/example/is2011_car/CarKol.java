package com.example.is2011_car;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class CarKol extends ArrayAdapter<Car> {

    private LayoutInflater inflater;
    private int layout;
    private ArrayList<Car> productList;

    CarKol(Context context, int resource, ArrayList<Car> cars) {
        super(context, resource, cars);
        this.productList = cars;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }




    public View getView(int position, View convertView, ViewGroup parent) {

        final ViewHolder viewHolder;
        if (convertView == null) {
            convertView = inflater.inflate(this.layout, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        final Car product = productList.get(position);

        viewHolder.nameView.setText(product.getName());
        viewHolder.countView.setText(product.getCount() + " " + product.getUnit());
        viewHolder.opisCar.setText(product.getOpis());
        viewHolder.imageCar.setImageResource(product.getimageCar());



        viewHolder.removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = product.getCount() - 1;
                if (count < 0) count = 0;
                product.setCount(count);
                viewHolder.countView.setText(count + " " + product.getUnit());
            }
        });
        viewHolder.addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = product.getCount() + 1;
                product.setCount(count);
                viewHolder.countView.setText(count + " " + product.getUnit());
            }
        });

        return convertView;
    }

    public static class ViewHolder {
        final Button addButton, removeButton;
        final TextView nameView, countView, opisCar;
        final ImageView imageCar;

        ViewHolder(View view) {

            addButton = view.findViewById(R.id.addbutton);
            removeButton = view.findViewById(R.id.removebutton);
            nameView = view.findViewById(R.id.nameCar);
            countView = view.findViewById(R.id.countcar);
            opisCar = view.findViewById(R.id.opisCar);
            imageCar = view.findViewById(R.id.imageCar);
        }
    }
}


