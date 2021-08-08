package com.patternsJava;

import com.patternsJava.Adapter.FilterCaramel;
import com.patternsJava.Adapter.FilterVivid;
import com.patternsJava.Adapter.Image;
import com.patternsJava.Adapter.ImageView;
import com.patternsJava.Adapter.avaFilters.Caramel;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var imageView = new ImageView(new Image());
        imageView.apply(new FilterCaramel(new Caramel()));
    }
}
