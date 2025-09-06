package com.github.mikephil.charting.formatter;

import java.text.DecimalFormat;

public class i extends l {
    private String[] a;
    private int b;
    private DecimalFormat c;
    private String d;

    public i() {
        this.a = new String[]{"", "k", "m", "b", "t"};
        this.b = 5;
        this.d = "";
        this.c = new DecimalFormat("###E00");
    }

    public i(String s) {
        this.d = s;
    }

    @Override  // com.github.mikephil.charting.formatter.l
    public String h(float f) {
        return this.m(((double)f)) + this.d;
    }

    public int l() {
        return 0;
    }

    private String m(double f) {
        String s = this.c.format(f);
        String s1;
        for(s1 = s.replaceAll("E[0-9][0-9]", this.a[((int)Integer.valueOf((Character.getNumericValue(s.charAt(s.length() - 2)) + "" + Character.getNumericValue(s.charAt(s.length() - 1))))) / 3]); s1.length() > this.b || s1.matches("[0-9]+\\.[a-z]"); s1 = s1.substring(0, s1.length() - 2) + s1.substring(s1.length() - 1)) {
        }
        return s1;
    }

    public void n(String s) {
        this.d = s;
    }

    public void o(int v) {
        this.b = v;
    }

    public void p(String[] arr_s) {
        this.a = arr_s;
    }
}

