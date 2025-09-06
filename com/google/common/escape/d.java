package com.google.common.escape;

import J1.b;
import com.google.common.base.H;
import o3.a;

@b
@f
public abstract class d extends h {
    private static final int b = 2;

    @Override  // com.google.common.escape.h
    public String b(String s) {
        H.E(s);
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.c(s.charAt(v1)) != null) {
                return this.d(s, v1);
            }
        }
        return s;
    }

    @a
    protected abstract char[] c(char arg1);

    protected final String d(String s, int v) {
        int v1 = s.length();
        char[] arr_c = k.a();
        int v2 = arr_c.length;
        int v3 = 0;
        int v4 = 0;
        while(v < v1) {
            char[] arr_c1 = this.c(s.charAt(v));
            if(arr_c1 != null) {
                int v5 = v - v3;
                int v6 = v4 + v5;
                int v7 = v6 + arr_c1.length;
                if(v2 < v7) {
                    v2 = (v1 - v) * 2 + v7;
                    arr_c = d.e(arr_c, v4, v2);
                }
                if(v5 > 0) {
                    v4 = v6;
                }
                if(arr_c1.length > 0) {
                    System.arraycopy(arr_c1, 0, arr_c, v4, arr_c1.length);
                    v4 += arr_c1.length;
                }
                v3 = v + 1;
            }
            ++v;
        }
        int v8 = v1 - v3;
        if(v8 > 0) {
            int v9 = v8 + v4;
            if(v2 < v9) {
                arr_c = d.e(arr_c, v4, v9);
            }
            v4 = v9;
        }
        return new String(arr_c, 0, v4);
    }

    private static char[] e(char[] arr_c, int v, int v1) {
        if(v1 < 0) {
            throw new AssertionError("Cannot increase internal buffer any further");
        }
        char[] arr_c1 = new char[v1];
        if(v > 0) {
            System.arraycopy(arr_c, 0, arr_c1, 0, v);
        }
        return arr_c1;
    }
}

