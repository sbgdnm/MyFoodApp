package com.example.myfoodapp.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.adapters.DetailedDailyAdapter;
import com.example.myfoodapp.models.DetailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter detailedDailyAdapter;
    ImageView imageView;


    @SuppressLint("NotifyDataSetChanged")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_detailed_daily_meal);

        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.detailed_rec);
        imageView = findViewById(R.id.detailed_image);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelList = new ArrayList<>();
        detailedDailyAdapter = new DetailedDailyAdapter(detailedDailyModelList);
        recyclerView.setAdapter(detailedDailyAdapter);

        if(type != null && type.equalsIgnoreCase("breakfast")){
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav1,"Breakfast", "Nice start of day","4.9", "10 to 23","15$"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav2,"Breakfast", "Nice start of day","4.9", "10 to 23","15$"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav3,"Breakfast", "Nice start of day","4.9", "10 to 23","15$"));
            detailedDailyAdapter.notifyDataSetChanged();
        }
        if(type != null && type.equalsIgnoreCase("sweets")){
            imageView.setImageResource(R.drawable.sweets);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s1,"Sweets", "Delicious","4.9", "10 to 23","15$"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s2,"Sweets", "Delicious","4.9", "10 to 23","15$"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s3,"Sweets", "Delicious","4.9", "10 to 23","15$"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s4,"Sweets", "Delicious","4.9", "10 to 23","15$"));
            detailedDailyAdapter.notifyDataSetChanged();
        }
        if(type != null && type.equalsIgnoreCase("dinner")){
            imageView.setImageResource(R.drawable.dinner);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.sandwich1,"Dinner", "Delicious","4.9", "10 to 23","15$"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.sandwich2,"Dinner", "Delicious","4.9", "10 to 23","15$"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.sandwich3,"Dinner", "Delicious","4.9", "10 to 23","15$"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.sandwich4,"Dinner", "Delicious","4.9", "10 to 23","15$"));
            detailedDailyAdapter.notifyDataSetChanged();
        }
        if(type != null && type.equalsIgnoreCase("lunch")){
            imageView.setImageResource(R.drawable.lunch);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.lunch,"Lunch", "Food","4.9", "10 to 23","15$"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.lunch,"Lunch", "Food","4.9", "10 to 23","15$"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.lunch,"Lunch", "Food","4.9", "10 to 23","15$"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.lunch,"Lunch", "Food","4.9", "10 to 23","15$"));
            detailedDailyAdapter.notifyDataSetChanged();
        }
        if(type != null && type.equalsIgnoreCase("coffee")){
            imageView.setImageResource(R.drawable.coffe);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.coffe,"Sweets", "Full Energy","4.9", "10 to 23","15$"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.coffe,"Sweets", "Full Energy","4.9", "10 to 23","15$"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.coffe,"Sweets", "Full Energy","4.9", "10 to 23","15$"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.coffe,"Sweets", "Full Energy","4.9", "10 to 23","15$"));
            detailedDailyAdapter.notifyDataSetChanged();
        }

    }
}