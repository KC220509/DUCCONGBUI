package com.example.ezcook.model;

import java.util.List;

public class category_list_vertical{
    private String title_list;
    private List<category_suggest_model> category_suggest_horizonal;

    public category_list_vertical(String title_list, List<category_suggest_model> category_suggest_horizonal) {
        this.title_list = title_list;
        this.category_suggest_horizonal = category_suggest_horizonal;
    }

    public String getTitle_list() {
        return title_list;
    }

    public void setTitle_list(String title_list) {
        this.title_list = title_list;
    }

    public List<category_suggest_model> getCategory_suggest_horizonal() {
        return category_suggest_horizonal;
    }

    public void setCategory_suggest_horizonal(List<category_suggest_model> category_suggest_horizonal) {
        this.category_suggest_horizonal = category_suggest_horizonal;
    }
}
