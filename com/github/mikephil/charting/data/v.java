package com.github.mikephil.charting.data;

import java.util.List;
import t1.k;

public class v extends c {
    public v() {
    }

    public v(List list0) {
        super(list0);
    }

    public v(k[] arr_k) {
        super(arr_k);
    }

    public float Q() {
        float f = 0.0f;
        for(Object object0: this.i) {
            float f1 = ((k)object0).p();
            if(f1 > f) {
                f = f1;
            }
        }
        return f;
    }
}

