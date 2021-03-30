package com.example.scannerapp.advancedDirectSelect;

import java.util.Arrays;
import java.util.List;
import com.example.scannerapp.R;

class AdvancedExampleCountryPOJO {


    String title;
    int icon;
    public AdvancedExampleCountryPOJO(String title, int icon) {
        this.title = title;
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }





    public static  List<AdvancedExampleCountryPOJO> getExampleDataset(){
        return Arrays.asList(
                new AdvancedExampleCountryPOJO("Russian Federation", R.drawable.ds_countries_ru),
                new AdvancedExampleCountryPOJO("Canada", R.drawable.ds_countries_ca),
                new AdvancedExampleCountryPOJO("United States of America", R.drawable.ds_countries_us),
                new AdvancedExampleCountryPOJO("China", R.drawable.ds_countries_cn),
                new AdvancedExampleCountryPOJO("Brazil", R.drawable.ds_countries_br),
                new AdvancedExampleCountryPOJO("Australia", R.drawable.ds_countries_au),
                new AdvancedExampleCountryPOJO("India", R.drawable.ds_countries_in),
                new AdvancedExampleCountryPOJO("Argentina", R.drawable.ds_countries_ar),
                new AdvancedExampleCountryPOJO("Kazakhstan", R.drawable.ds_countries_kz)

        );
    }
}
