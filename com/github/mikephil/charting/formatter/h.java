package com.github.mikephil.charting.formatter;

import java.util.Collection;

public class h extends l {
    private String[] a;
    private int b;

    public h() {
        this.a = new String[0];
        this.b = 0;
    }

    public h(Collection collection0) {
        this.a = new String[0];
        this.b = 0;
        if(collection0 != null) {
            this.m(((String[])collection0.toArray(new String[collection0.size()])));
        }
    }

    public h(String[] arr_s) {
        this.a = new String[0];
        this.b = 0;
        if(arr_s != null) {
            this.m(arr_s);
        }
    }

    @Override  // com.github.mikephil.charting.formatter.l
    public String h(float f) {
        int v = Math.round(f);
        return v < 0 || v >= this.b || v != ((int)f) ? "" : this.a[v];
    }

    public String[] l() {
        return this.a;
    }

    public void m(String[] arr_s) {
        if(arr_s == null) {
            arr_s = new String[0];
        }
        this.a = arr_s;
        this.b = arr_s.length;
    }
}

