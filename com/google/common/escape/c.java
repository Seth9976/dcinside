package com.google.common.escape;

import J1.b;
import com.google.common.base.H;
import java.util.Map;
import o3.a;

@b
@f
public abstract class c extends l {
    private final char[][] c;
    private final int d;
    private final int e;
    private final int f;
    private final char g;
    private final char h;

    protected c(com.google.common.escape.b b0, int v, int v1, String s) {
        H.E(b0);
        char[][] arr2_c = b0.c();
        this.c = arr2_c;
        this.d = arr2_c.length;
        if(v1 < v) {
            v1 = -1;
            v = 0x7FFFFFFF;
        }
        this.e = v;
        this.f = v1;
        if(v >= 0xD800) {
            this.g = '\uFFFF';
            this.h = '\u0000';
            return;
        }
        this.g = (char)v;
        this.h = (char)Math.min(v1, 0xD7FF);
    }

    protected c(Map map0, int v, int v1, String s) {
        this(com.google.common.escape.b.a(map0), v, v1, s);
    }

    @Override  // com.google.common.escape.l
    public final String b(String s) {
        H.E(s);
        int v = 0;
        while(v < s.length()) {
            int v1 = s.charAt(v);
            if((v1 >= this.d || this.c[v1] == null) && v1 <= this.h && v1 >= this.g) {
                ++v;
                continue;
            }
            return this.e(s, v);
        }
        return s;
    }

    @Override  // com.google.common.escape.l
    @a
    protected final char[] d(int v) {
        if(v < this.d) {
            char[] arr_c = this.c[v];
            if(arr_c != null) {
                return arr_c;
            }
        }
        return v < this.e || v > this.f ? this.h(v) : null;
    }

    @Override  // com.google.common.escape.l
    protected final int g(CharSequence charSequence0, int v, int v1) {
        while(v < v1) {
            int v2 = charSequence0.charAt(v);
            if(v2 < this.d && this.c[v2] != null || v2 > this.h || v2 < this.g) {
                break;
            }
            ++v;
        }
        return v;
    }

    @a
    protected abstract char[] h(int arg1);
}

