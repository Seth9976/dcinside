package com.google.common.escape;

import J1.b;
import com.google.common.base.H;
import java.util.Map;

@b
@f
public abstract class a extends d {
    private final char[][] c;
    private final int d;
    private final char e;
    private final char f;

    protected a(com.google.common.escape.b b0, char c, char c1) {
        H.E(b0);
        char[][] arr2_c = b0.c();
        this.c = arr2_c;
        this.d = arr2_c.length;
        if(c1 < c) {
            c1 = '\u0000';
            c = '\uFFFF';
        }
        this.e = c;
        this.f = c1;
    }

    protected a(Map map0, char c, char c1) {
        this(com.google.common.escape.b.a(map0), c, c1);
    }

    @Override  // com.google.common.escape.d
    public final String b(String s) {
        H.E(s);
        int v = 0;
        while(v < s.length()) {
            int v1 = s.charAt(v);
            if((v1 >= this.d || this.c[v1] == null) && v1 <= this.f && v1 >= this.e) {
                ++v;
                continue;
            }
            return this.d(s, v);
        }
        return s;
    }

    @Override  // com.google.common.escape.d
    @o3.a
    protected final char[] c(char c) {
        if(c < this.d) {
            char[] arr_c = this.c[c];
            if(arr_c != null) {
                return arr_c;
            }
        }
        return c < this.e || c > this.f ? this.f(c) : null;
    }

    @o3.a
    protected abstract char[] f(char arg1);
}

