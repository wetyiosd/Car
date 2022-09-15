package com.example.is2011_car;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    //ArrayList<String> selectedUsers = new ArrayList<String>();
    //ArrayList<Car> cars;
    CarKol adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<Car> cars = new ArrayList<Car>();
        if(cars.size()==0){
            cars.add(new Car ("Porsche 911", "500 лошадиных сил, спорткар", R.drawable.porsche, "шт."));
            cars.add(new Car ("McLaren F1", "627 лошадиных сил, спорткар", R.drawable.mclaren, "шт."));
            cars.add(new Car ("Tesla Roadster", "248 лошадиных сил, кабриолет", R.drawable.tesla, "шт."));
            cars.add(new Car ("Mercedes-Benz S500", "388 лошадиных сил, кабриолет", R.drawable.merc, "шт."));
            cars.add(new Car ("Lamborghini Aventador S", "740 лошадиных сил, кабриолет", R.drawable.lamborg, "шт."));
        }
        ListView productList = findViewById(R.id.productList);
        adapter = new CarKol(this, R.layout.list_item, cars);
        productList.setAdapter(adapter);
    }



    private void setInitialData(){


    }

}