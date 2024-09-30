package com.example.myfoodapp.ui.dailymeal;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.adapters.DailyMealAdapter;
import com.example.myfoodapp.models.DailyMealModel;

import java.util.ArrayList;
import java.util.List;

public class DailyMealFragment extends Fragment {
//ежедневаная еда

    RecyclerView recyclerView;
    List<DailyMealModel> dailyMealModels;
    DailyMealAdapter dailyMealAdapter;

    @SuppressLint("NotifyDataSetChanged")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_daily_meal, container, false);

        recyclerView = root.findViewById(R.id.daily_meal_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyMealModels = new ArrayList<>();

        dailyMealModels.add(new DailyMealModel(R.drawable.breakfast, "Breakfast", "10% off", "breakfast", "Important detail for a productive day"));
        dailyMealModels.add(new DailyMealModel(R.drawable.lunch, "Lunch", "30% off", "lunch", "Tasty and Nourishing"));
        dailyMealModels.add(new DailyMealModel(R.drawable.dinner, "Dinner", "30% off", "dinner", "Large portions"));
        dailyMealModels.add(new DailyMealModel(R.drawable.sweets, "Sweets", "15% off", "sweets", "Sweet and simple"));
        dailyMealModels.add(new DailyMealModel(R.drawable.coffe, "Coffee", "10% off", "coffee", "For full of energy"));

        dailyMealAdapter = new DailyMealAdapter(getContext(), dailyMealModels);
        recyclerView.setAdapter(dailyMealAdapter);
        dailyMealAdapter.notifyDataSetChanged();

        return root;
    }


}