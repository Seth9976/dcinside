package com.google.common.escape;

import J1.b;
import com.google.common.base.H;
import java.util.HashMap;
import java.util.Map;

@b
@f
public final class i {
    class a extends d {
        a() {
            super();
        }

        @Override  // com.google.common.escape.d
        public String b(String s) {
            return (String)H.E(s);
        }

        @Override  // com.google.common.escape.d
        @o3.a
        protected char[] c(char c) {
            return null;
        }
    }

    public static final class c {
        private final Map a;
        private char b;
        private char c;
        @o3.a
        private String d;

        private c() {
            this.a = new HashMap();
            this.b = '\u0000';
            this.c = '\uFFFF';
            this.d = null;
        }

        c(a i$a0) {
        }

        @O1.a
        public c b(char c, String s) {
            H.E(s);
            this.a.put(Character.valueOf(c), s);
            return this;
        }

        public h c() {
            class com.google.common.escape.i.c.a extends com.google.common.escape.a {
                @o3.a
                private final char[] g;
                final c h;

                com.google.common.escape.i.c.a(Map map0, char c, char c1) {
                    super(map0, c, c1);
                    this.g = i$c0.d == null ? null : i$c0.d.toCharArray();
                }

                @Override  // com.google.common.escape.a
                @o3.a
                protected char[] f(char c) {
                    return this.g;
                }
            }

            return new com.google.common.escape.i.c.a(this, this.a, this.b, this.c);
        }

        @O1.a
        public c d(char c, char c1) {
            this.b = c;
            this.c = c1;
            return this;
        }

        @O1.a
        public c e(String s) {
            this.d = s;
            return this;
        }
    }

    private static final h a;

    static {
        i.a = new a();
    }

    static l a(h h0) {
        H.E(h0);
        if(h0 instanceof l) {
            return (l)h0;
        }
        if(!(h0 instanceof d)) {
            throw new IllegalArgumentException("Cannot create a UnicodeEscaper from: " + h0.getClass().getName());
        }
        return i.g(((d)h0));
    }

    public static c b() {
        return new c(null);
    }

    @o3.a
    public static String c(d d0, char c) {
        return i.f(d0.c(c));
    }

    @o3.a
    public static String d(l l0, int v) {
        return i.f(l0.d(v));
    }

    public static h e() {
        return i.a;
    }

    @o3.a
    private static String f(@o3.a char[] arr_c) {
        return arr_c == null ? null : new String(arr_c);
    }

    private static l g(d d0) {
        class com.google.common.escape.i.b extends l {
            final d c;

            com.google.common.escape.i.b(d d0) {
            }

            @Override  // com.google.common.escape.l
            @o3.a
            protected char[] d(int v) {
                if(v < 0x10000) {
                    return this.c.c(((char)v));
                }
                char[] arr_c = this.c.c('\u0000');
                char[] arr_c1 = this.c.c('\u0000');
                if(arr_c == null && arr_c1 == null) {
                    return null;
                }
                int v2 = arr_c == null ? 1 : arr_c.length;
                char[] arr_c2 = new char[(arr_c1 == null ? 1 : arr_c1.length) + v2];
                if(arr_c == null) {
                    arr_c2[0] = '\u0000';
                }
                else {
                    for(int v3 = 0; v3 < arr_c.length; ++v3) {
                        arr_c2[v3] = arr_c[v3];
                    }
                }
                if(arr_c1 != null) {
                    for(int v1 = 0; v1 < arr_c1.length; ++v1) {
                        arr_c2[v2 + v1] = arr_c1[v1];
                    }
                    return arr_c2;
                }
                arr_c2[v2] = '\u0000';
                return arr_c2;
            }
        }

        return new com.google.common.escape.i.b(d0);
    }
}

