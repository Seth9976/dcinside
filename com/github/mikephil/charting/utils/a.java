package com.github.mikephil.charting.utils;

import android.content.res.Resources;
import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

public class a {
    public static final int a = 0x112233;
    public static final int b = 0x112234;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;
    public static final int[] h;

    static {
        a.c = new int[]{Color.rgb(0xCF, 0xF8, 0xF6), Color.rgb(0x94, 0xD4, 0xD4), Color.rgb(0x88, 180, 0xBB), Color.rgb(0x76, 0xAE, 0xAF), Color.rgb(42, 109, 130)};
        a.d = new int[]{Color.rgb(0xD9, 80, 0x8A), Color.rgb(0xFE, 0x95, 7), Color.rgb(0xFE, 0xF7, 120), Color.rgb(106, 0xA7, 0x86), Color.rgb(53, 0xC2, 209)};
        a.e = new int[]{Color.rgb(0x40, 89, 0x80), Color.rgb(0x95, 0xA5, 0x7C), Color.rgb(0xD9, 0xB8, 0xA2), Color.rgb(0xBF, 0x86, 0x86), Color.rgb(0xB3, 0x30, 80)};
        a.f = new int[]{Color.rgb(0xC1, 37, 82), Color.rgb(0xFF, 102, 0), Color.rgb(0xF5, 0xC7, 0), Color.rgb(106, 150, 0x1F), Color.rgb(0xB3, 100, 53)};
        a.g = new int[]{Color.rgb(0xC0, 0xFF, 140), Color.rgb(0xFF, 0xF7, 140), Color.rgb(0xFF, 0xD0, 140), Color.rgb(140, 0xEA, 0xFF), Color.rgb(0xFF, 140, 0x9D)};
        a.h = new int[]{a.e("#2ecc71"), a.e("#f1c40f"), a.e("#e74c3c"), a.e("#3498db")};
    }

    public static int a(int v, int v1) {
        return v & 0xFFFFFF | (v1 & 0xFF) << 24;
    }

    public static List b(Resources resources0, int[] arr_v) {
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            list0.add(resources0.getColor(arr_v[v]));
        }
        return list0;
    }

    public static List c(int[] arr_v) {
        List list0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            list0.add(((int)arr_v[v]));
        }
        return list0;
    }

    public static int d() {
        return Color.rgb(51, 0xB5, 0xE5);
    }

    public static int e(String s) {
        int v = (int)Long.parseLong(s.replace("#", ""), 16);
        return Color.rgb(v >> 16 & 0xFF, v >> 8 & 0xFF, v & 0xFF);
    }
}

