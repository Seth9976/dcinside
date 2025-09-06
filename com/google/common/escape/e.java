package com.google.common.escape;

import J1.b;
import com.google.common.base.H;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

@b
@f
public final class e {
    static class a extends d {
        private final char[][] c;
        private final int d;

        a(char[][] arr2_c) {
            this.c = arr2_c;
            this.d = arr2_c.length;
        }

        @Override  // com.google.common.escape.d
        public String b(String s) {
            int v = s.length();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = s.charAt(v1);
                if(v2 < this.c.length && this.c[v2] != null) {
                    return this.d(s, v1);
                }
            }
            return s;
        }

        @Override  // com.google.common.escape.d
        @o3.a
        protected char[] c(char c) {
            return c >= this.d ? null : this.c[c];
        }
    }

    private final Map a;
    private int b;

    public e() {
        this.b = -1;
        this.a = new HashMap();
    }

    @O1.a
    public e a(char c, String s) {
        String s1 = (String)H.E(s);
        this.a.put(Character.valueOf(c), s1);
        if(c > this.b) {
            this.b = c;
        }
        return this;
    }

    @O1.a
    public e b(char[] arr_c, String s) {
        H.E(s);
        for(int v = 0; v < arr_c.length; ++v) {
            this.a(arr_c[v], s);
        }
        return this;
    }

    public char[][] c() {
        char[][] arr2_c = new char[this.b + 1][];
        for(Object object0: this.a.entrySet()) {
            int v = ((Character)((Map.Entry)object0).getKey()).charValue();
            arr2_c[v] = ((String)((Map.Entry)object0).getValue()).toCharArray();
        }
        return arr2_c;
    }

    public h d() {
        return new a(this.c());
    }
}

