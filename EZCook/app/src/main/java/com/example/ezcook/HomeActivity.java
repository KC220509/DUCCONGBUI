package com.example.ezcook;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ezcook.adapter.category_regime_eat_adapter;
import com.example.ezcook.model.category_regime_eat_model;
import com.example.ezcook.adapter.category_suggest_adapter;
import com.example.ezcook.model.category_suggest_model;
import com.example.ezcook.adapter.category_list_vertical_adapter;
import com.example.ezcook.model.category_list_vertical;
import com.example.ezcook.adapter.category_regime_eat_adapter;
import com.example.ezcook.model.category_regime_eat_model;
import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private RecyclerView recyclerViewCategory, recyclerViewRegimeEat, recyclerViewCategory_suggest;

//    private category_list_vertical_adapter categoryListVerticalAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Anhxa();
        Regime_recyclerView();
        Category_listrecyclerview();
    }
    private void Anhxa(){
        recyclerViewRegimeEat = findViewById(R.id.recycler_category_regime_eat);
        recyclerViewCategory = findViewById(R.id.recycler_category);
//        recyclerViewCategory_suggest = findViewById(R.id.recycler_category_suggest);
    }

    private void Regime_recyclerView(){
        recyclerViewRegimeEat.setHasFixedSize(true);
        recyclerViewRegimeEat.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        List<category_regime_eat_model> categoryRegimeEatModels = new ArrayList<>();

        categoryRegimeEatModels.add(new category_regime_eat_model(R.drawable.image_buoisang,"Ăn sáng"));
        categoryRegimeEatModels.add(new category_regime_eat_model(R.drawable.cat_1,"Ăn trưa"));
        categoryRegimeEatModels.add(new category_regime_eat_model(R.drawable.cat_2,"Ăn tối"));
        categoryRegimeEatModels.add(new category_regime_eat_model(R.drawable.cat_3,"Ăn kiêng"));
        categoryRegimeEatModels.add(new category_regime_eat_model(R.drawable.cat_4,"Ăn chay"));

        category_regime_eat_adapter categoryRegimeEatAdapter = new category_regime_eat_adapter();
        categoryRegimeEatAdapter.setData(categoryRegimeEatModels);
        recyclerViewRegimeEat.setAdapter(categoryRegimeEatAdapter);
    }
    private void Category_listrecyclerview(){
        recyclerViewCategory.setHasFixedSize(true);
        category_list_vertical_adapter categoryListVerticalAdapter = new category_list_vertical_adapter(this);

        recyclerViewCategory.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));


        categoryListVerticalAdapter.setData(getCategory_list_verticals());
        recyclerViewCategory.setAdapter(categoryListVerticalAdapter);
    }

    private List<category_list_vertical> getCategory_list_verticals(){

        List<category_suggest_model> categorySuggestModels = new ArrayList<>();
        categorySuggestModels.add(new category_suggest_model(R.drawable.image_test, "Thịt kho tàu", "20 phút", "300 kcal"));
        categorySuggestModels.add(new category_suggest_model(R.drawable.fast_1, "Tàu hũ nướng", "15 phút", "310 kcal"));
        categorySuggestModels.add(new category_suggest_model(R.drawable.fast_2, "Cơm chiên trứng", "25 phút", "290 kcal"));
        categorySuggestModels.add(new category_suggest_model(R.drawable.fast_3, "Cơm hải sản", "10 phút", "120 kcal"));
        categorySuggestModels.add(new category_suggest_model(R.drawable.fast_3, "Cơm hải sản", "10 phút", "120 kcal"));


        List<category_list_vertical> categoryListVerticals = new ArrayList<>();
        categoryListVerticals.add(new category_list_vertical("Gợi ý hôm nay !!!", categorySuggestModels));
        categoryListVerticals.add(new category_list_vertical("Chế độ ăn !!!", categorySuggestModels));
        categoryListVerticals.add(new category_list_vertical("Món ăn mới nhất !!!", categorySuggestModels));
        categoryListVerticals.add(new category_list_vertical("Gợi ý hôm nay !!!", categorySuggestModels));
        categoryListVerticals.add(new category_list_vertical("Chế độ ăn !!!", categorySuggestModels));
        categoryListVerticals.add(new category_list_vertical("Món ăn mới nhất !!!", categorySuggestModels));
        categoryListVerticals.add(new category_list_vertical("Gợi ý hôm nay !!!", categorySuggestModels));
        categoryListVerticals.add(new category_list_vertical("Chế độ ăn !!!", categorySuggestModels));
        return categoryListVerticals;
        
    }
}
