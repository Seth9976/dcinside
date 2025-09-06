package com.github.mikephil.charting.data;

import com.github.mikephil.charting.highlight.d;
import java.util.Arrays;
import java.util.List;
import t1.j;

public class t extends k {
    private List j;

    public t() {
    }

    public t(List list0) {
        super(list0);
    }

    public t(j[] arr_j) {
        super(arr_j);
    }

    public List Q() {
        return this.j;
    }

    public void R(List list0) {
        this.j = list0;
    }

    public void S(String[] arr_s) {
        this.j = Arrays.asList(arr_s);
    }

    @Override  // com.github.mikephil.charting.data.k
    public Entry s(d d0) {
        return ((j)this.k(d0.d())).l(((int)d0.h()));
    }
}

