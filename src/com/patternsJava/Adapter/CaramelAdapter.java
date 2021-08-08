package com.patternsJava.Adapter;

import com.patternsJava.Adapter.avaFilters.Caramel;

public class CaramelAdapter extends Caramel implements Filter {

    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
