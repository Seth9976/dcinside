package org.bson.codecs;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.bson.P;
import org.bson.S;
import org.bson.a0;

public class o0 implements N {
    static enum a {
        CANON_EQ(0x80, 'c', "Pattern.CANON_EQ"),
        UNIX_LINES(1, 'd', "Pattern.UNIX_LINES"),
        GLOBAL(0x100, 'g', null),
        CASE_INSENSITIVE(2, 'i', null),
        MULTILINE(8, 'm', null),
        DOTALL(0x20, 's', "Pattern.DOTALL"),
        LITERAL(16, 't', "Pattern.LITERAL"),
        UNICODE_CASE(0x40, 'u', "Pattern.UNICODE_CASE"),
        COMMENTS(4, 'x', null);

        private final int a;
        private final char b;
        private final String c;
        private static final Map m;
        private static final a[] n;

        static {
            arr_o0$a[0] = a.d;
            arr_o0$a[1] = a.e;
            arr_o0$a[2] = a.f;
            arr_o0$a[3] = a.g;
            arr_o0$a[4] = a.h;
            arr_o0$a[5] = a.i;
            arr_o0$a[6] = a.j;
            arr_o0$a[7] = a.k;
            arr_o0$a[8] = a.l;
            a.n = arr_o0$a;
            a.m = new HashMap();
            a[] arr_o0$a1 = (a[])a.n.clone();
            for(int v = 0; v < arr_o0$a1.length; ++v) {
                a o0$a0 = arr_o0$a1[v];
                a.m.put(Character.valueOf(o0$a0.b), o0$a0);
            }
        }

        private a(int v1, char c, String s1) {
            this.a = v1;
            this.b = c;
            this.c = s1;
        }

        static String c(a o0$a0) {
            return o0$a0.c;
        }

        public static a d(char c) {
            return (a)a.m.get(Character.valueOf(c));
        }
    }

    private static final int a = 0x100;

    public Pattern c(P p0, T t0) {
        S s0 = p0.m0();
        return Pattern.compile(s0.k0(), o0.i(s0));
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return Pattern.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((Pattern)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, Pattern pattern0, Y y0) {
        a00.h1(new S(pattern0.pattern(), o0.j(pattern0)));
    }

    private static int i(S s0) {
        String s1 = s0.j0();
        if(s1 != null && s1.length() != 0) {
            String s2 = s1.toLowerCase();
            int v1 = 0;
            for(int v = 0; v < s2.length(); ++v) {
                a o0$a0 = a.d(s2.charAt(v));
                if(o0$a0 == null) {
                    throw new IllegalArgumentException("unrecognized flag [" + s2.charAt(v) + "] " + s2.charAt(v));
                }
                v1 |= o0$a0.a;
            }
            return v1;
        }
        return 0;
    }

    private static String j(Pattern pattern0) {
        int v = pattern0.flags();
        StringBuilder stringBuilder0 = new StringBuilder();
        a[] arr_o0$a = a.values();
        for(int v1 = 0; v1 < arr_o0$a.length; ++v1) {
            a o0$a0 = arr_o0$a[v1];
            if((pattern0.flags() & o0$a0.a) > 0) {
                stringBuilder0.append(o0$a0.b);
                v -= o0$a0.a;
            }
        }
        if(v > 0) {
            throw new IllegalArgumentException("some flags could not be recognized.");
        }
        return stringBuilder0.toString();
    }
}

