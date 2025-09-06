package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.annotation.K;
import com.fasterxml.jackson.annotation.k;
import java.util.HashMap;
import java.util.Map;

public enum d {
    STRING,
    NUMBER,
    INTEGER,
    BOOLEAN,
    OBJECT,
    ARRAY,
    NULL,
    ANY;

    private static final Map i;

    static {
        d.i = new HashMap();
        d[] arr_d = (d[])d.j.clone();
        for(int v = 0; v < arr_d.length; ++v) {
            d d0 = arr_d[v];
            d.i.put(d0.name().toLowerCase(), d0);
        }
    }

    @k
    public static d a(String s) {
        return (d)d.i.get(s);
    }

    @K
    public String b() {
        return this.name().toLowerCase();
    }
}

