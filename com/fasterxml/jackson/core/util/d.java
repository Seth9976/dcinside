package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.k;
import java.io.IOException;

public class d extends c {
    private final char[] b;
    private final int c;
    private final String d;
    private static final long e = 1L;
    public static final String f = null;
    public static final d g = null;
    private static final int h = 16;

    // 去混淆评级： 低(30)
    static {
        d.g = new d("  ", "\n");
    }

    public d() {
        this("  ", "\n");
    }

    public d(String s, String s1) {
        this.c = s.length();
        this.b = new char[s.length() * 16];
        int v = 0;
        for(int v1 = 0; v1 < 16; ++v1) {
            v += s.length();
        }
        this.d = s1;
    }

    @Override  // com.fasterxml.jackson.core.util.e$c
    public void a(k k0, int v) throws IOException {
        char[] arr_c;
        k0.r4(this.d);
        if(v > 0) {
            int v1;
            for(v1 = v * this.c; true; v1 -= this.b.length) {
                arr_c = this.b;
                if(v1 <= arr_c.length) {
                    break;
                }
                k0.t4(arr_c, 0, arr_c.length);
            }
            k0.t4(arr_c, 0, v1);
        }
    }

    public String b() {
        return this.d;
    }

    public String c() [...] // 潜在的解密器

    // 去混淆评级： 低(40)
    public d d(String s) {
        return s.equals("  ") ? this : new d(s, this.d);
    }

    // 去混淆评级： 低(40)
    public d e(String s) {
        return s.equals(this.d) ? this : new d("  ", s);
    }

    @Override  // com.fasterxml.jackson.core.util.e$c
    public boolean isInline() {
        return false;
    }
}

