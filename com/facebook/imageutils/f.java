package com.facebook.imageutils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.n;

public final class f {
    @l
    public static final f a = null;
    public static final int b = 0xFF;
    public static final int c = 0;
    public static final int d = 0xD8;
    public static final int e = 1;
    public static final int f = 0xD9;
    public static final int g = 0xDA;
    public static final int h = 0xE1;
    public static final int i = 0xC0;
    public static final int j = 0xD0;
    public static final int k = 0xD7;
    public static final int l = 1165519206;

    static {
        f.a = new f();
    }

    @n
    public static final int a(int v) {
        return h.a(v);
    }

    @n
    public static final int b(@l InputStream inputStream0) {
        L.p(inputStream0, "inputStream");
        try {
            int v = f.a.e(inputStream0);
            return v == 0 ? 0 : h.d(inputStream0, v);
        }
        catch(IOException unused_ex) {
        }
        return 0;
    }

    @n
    public static final int c(@m byte[] arr_b) {
        return f.b(new ByteArrayInputStream(arr_b));
    }

    private final boolean d(int v) {
        switch(v) {
            case 0xC0: 
            case 0xC1: 
            case 0xC2: 
            case 0xC3: 
            case 0xC5: 
            case 0xC6: 
            case 0xC7: 
            case 201: 
            case 202: 
            case 203: 
            case 205: 
            case 206: 
            case 0xCF: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    private final int e(InputStream inputStream0) throws IOException {
        if(f.f(inputStream0, 0xE1)) {
            int v = g.a(inputStream0, 2, false);
            return v - 2 <= 6 || (g.a(inputStream0, 4, false) != 1165519206 || g.a(inputStream0, 2, false) != 0) ? 0 : v - 8;
        }
        return 0;
    }

    @n
    public static final boolean f(@l InputStream inputStream0, int v) throws IOException {
        L.p(inputStream0, "inputStream");
    label_1:
        while(g.a(inputStream0, 1, false) == 0xFF) {
            int v1;
            for(v1 = 0xFF; v1 == 0xFF; v1 = g.a(inputStream0, 1, false)) {
            }
            if(v == 0xC0 && f.a.d(v1)) {
                return true;
            }
            if(v1 == v) {
                return true;
            }
            switch(v1) {
                case 1: 
                case 0xD8: {
                    continue;
                }
                case 0xD9: 
                case 0xDA: {
                    break label_1;
                }
                default: {
                    inputStream0.skip(((long)(g.a(inputStream0, 2, false) - 2)));
                }
            }
        }
        return false;
    }
}

