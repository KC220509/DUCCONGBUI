package com.example.ezcook.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ezcook.R;
import com.example.ezcook.model.category_list_vertical;
import com.example.ezcook.model.category_suggest_model;
import com.example.ezcook.adapter.category_suggest_adapter;

import java.util.List;

public class category_list_vertical_adapter extends RecyclerView.Adapter<category_list_vertical_adapter.listcategory> {
    private Context context;
    private List <category_list_vertical> categoryListVerticals;

    public category_list_vertical_adapter(Context context) {
        this.context = context;
    }
    public void setData(List<category_list_vertical> categoryListVerticals){
        this.categoryListVerticals = categoryListVerticals;
    }

    public class listcategory extends RecyclerView.ViewHolder{
        private TextView title_list;
        private RecyclerView recyclerViewSuggest;
        public listcategory(@NonNull View itemView){
            super(itemView);
            title_list = itemView.findViewById(R.id.title_list_category);
            recyclerViewSuggest = itemView.findViewById(R.id.recycler_list_category);
        }
    }
    @NonNull
    @Override
    public category_list_vertical_adapter.listcategory onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view_category = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list_category, parent, false);
        return new listcategory(view_category);
    }

    @Override
    public void onBindViewHolder(@NonNull category_list_vertical_adapter.listcategory holder, int position) {
        category_list_vertical categoryListVertical = categoryListVerticals.get(position);
        if(categoryListVertical == null){
            return;
        }

        holder.title_list.setText(categoryListVertical.getTitle_list());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false);
        holder.recyclerViewSuggest.setLayoutManager(linearLayoutManager);

        category_suggest_adapter categorySuggestAdapter = new category_suggest_adapter();
        categorySuggestAdapter.setData(categoryListVertical.getCategory_suggest_horizonal());
        holder.recyclerViewSuggest.setAdapter(categorySuggestAdapter);
    }

    @Override
    public int getItemCount() {
        if(categoryListVerticals != null){
            return categoryListVerticals.size();
        }
        return 0;
    }
}
