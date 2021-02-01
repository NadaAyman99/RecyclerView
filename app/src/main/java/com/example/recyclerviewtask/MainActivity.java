package com.example.recyclerviewtask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<DataModel> list = new ArrayList<>();
    RecyclerView recyclerView;
    ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemAdapter = new ItemAdapter(list);
        recyclerView.setAdapter(itemAdapter);
        itemAdapter.setOnItemClicklListener(new ItemAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this, "Clicked item position: " +
                        (position+1), Toast.LENGTH_LONG).show();
            }
        });

        list.add(new DataModel("item 1","price:100"));
        list.add(new DataModel("item 2","price:150"));
        list.add(new DataModel("item 3","price:200"));
        list.add(new DataModel("item 4","price:250"));
        list.add(new DataModel("item 5","price:300"));
        list.add(new DataModel("item 6","price:350"));
        list.add(new DataModel("item 7","price:400"));
        list.add(new DataModel("item 8","price:450"));
        list.add(new DataModel("item 9","price:500"));
        list.add(new DataModel("item 10","price:550"));
        list.add(new DataModel("item 11","price:600"));
        list.add(new DataModel("item 12","price:650"));
        list.add(new DataModel("item 13","price:700"));
        list.add(new DataModel("item 14","price:750"));
        list.add(new DataModel("item 15","price:800"));
    }
}
