package com.github.mikephil.charting.utils;

import com.github.mikephil.charting.data.Entry;
import java.util.Comparator;

public class b implements Comparator {
    public int b(Entry entry0, Entry entry1) {
        int v = Float.compare(entry0.l() - entry1.l(), 0.0f);
        if(v == 0) {
            return 0;
        }
        return v <= 0 ? -1 : 1;
    }

    @Override
    public int compare(Object object0, Object object1) {
        return this.b(((Entry)object0), ((Entry)object1));
    }
}

