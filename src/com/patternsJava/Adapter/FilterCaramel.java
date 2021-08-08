package com.patternsJava.Adapter;

import com.patternsJava.Adapter.avaFilters.Caramel;

public class FilterCaramel implements Filter {
    private Caramel caramel;

    public FilterCaramel(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
