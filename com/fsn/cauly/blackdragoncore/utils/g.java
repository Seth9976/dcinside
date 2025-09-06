package com.fsn.cauly.blackdragoncore.utils;

import android.util.Log;
import com.fsn.cauly.Y.m0;

public class g {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[b.values().length];
            a.a = arr_v;
            try {
                arr_v[b.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.e.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.f.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static enum b {
        None,
        Error,
        Warn,
        Info,
        Debug,
        Verbose;

    }

    static b a;

    static {
        g.a = b.c;
    }

    public static void a(b g$b0, String s) {
        if(g.a.ordinal() < g$b0.ordinal()) {
            return;
        }
        if(!m0.a && g$b0.ordinal() >= b.e.ordinal()) {
            return;
        }
        switch(g$b0) {
            case 1: {
                Log.i("Cauly", s);
                return;
            }
            case 2: {
                Log.e("Cauly", s);
                return;
            }
            case 3: {
                Log.w("Cauly", s);
                return;
            }
            case 4: {
                Log.i("Cauly", s);
                return;
            }
            case 5: {
                Log.d("Cauly", s);
                return;
            }
            case 6: {
                Log.v("Cauly", s);
            }
        }
    }

    public static void a(b g$b0, boolean z) {
        if(z) {
            m0.a = true;
            g.a = b.f;
            return;
        }
        g.a = g$b0;
    }
}

