package com.google.common.primitives;

import J1.b;
import com.google.common.base.H;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

@b(emulated = true)
@f
public final class c {
    @b
    static class a extends AbstractList implements Serializable, RandomAccess {
        final char[] a;
        final int b;
        final int c;
        private static final long d;

        a(char[] arr_c) {
            this(arr_c, 0, arr_c.length);
        }

        a(char[] arr_c, int v, int v1) {
            this.a = arr_c;
            this.b = v;
            this.c = v1;
        }

        public Character a(int v) {
            H.C(v, this.size());
            return Character.valueOf(this.a[this.b + v]);
        }

        public Character b(int v, Character character0) {
            H.C(v, this.size());
            int v1 = this.a[this.b + v];
            this.a[this.b + v] = ((Character)H.E(character0)).charValue();
            return Character.valueOf(((char)v1));
        }

        char[] c() {
            return Arrays.copyOfRange(this.a, this.b, this.c);
        }

        @Override
        public boolean contains(@o3.a Object object0) {
            return object0 instanceof Character && c.n(this.a, ((Character)object0).charValue(), this.b, this.c) != -1;
        }

        @Override
        public boolean equals(@o3.a Object object0) {
            if(object0 == this) {
                return true;
            }
            if(object0 instanceof a) {
                int v = this.size();
                if(((a)object0).size() != v) {
                    return false;
                }
                for(int v1 = 0; v1 < v; ++v1) {
                    if(this.a[this.b + v1] != ((a)object0).a[((a)object0).b + v1]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(object0);
        }

        @Override
        public Object get(int v) {
            return this.a(v);
        }

        @Override
        public int hashCode() {
            int v = this.b;
            int v1 = 1;
            while(v < this.c) {
                v1 = v1 * 0x1F + c.l(this.a[v]);
                ++v;
            }
            return v1;
        }

        @Override
        public int indexOf(@o3.a Object object0) {
            if(object0 instanceof Character) {
                int v = c.n(this.a, ((Character)object0).charValue(), this.b, this.c);
                return v < 0 ? -1 : v - this.b;
            }
            return -1;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public int lastIndexOf(@o3.a Object object0) {
            if(object0 instanceof Character) {
                int v = c.r(this.a, ((Character)object0).charValue(), this.b, this.c);
                return v < 0 ? -1 : v - this.b;
            }
            return -1;
        }

        @Override
        public Object set(int v, Object object0) {
            return this.b(v, ((Character)object0));
        }

        @Override
        public int size() {
            return this.c - this.b;
        }

        @Override
        public List subList(int v, int v1) {
            H.f0(v, v1, this.size());
            return v == v1 ? Collections.emptyList() : new a(this.a, v + this.b, this.b + v1);
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder(this.size() * 3);
            stringBuilder0.append('[');
            stringBuilder0.append(this.a[this.b]);
            int v = this.b;
            while(true) {
                ++v;
                if(v >= this.c) {
                    break;
                }
                stringBuilder0.append(", ");
                stringBuilder0.append(this.a[v]);
            }
            stringBuilder0.append(']');
            return stringBuilder0.toString();
        }
    }

    static enum com.google.common.primitives.c.b implements Comparator {
        INSTANCE;

        private static com.google.common.primitives.c.b[] b() [...] // Inlined contents

        @Override
        public int compare(Object object0, Object object1) {
            return this.g(((char[])object0), ((char[])object1));
        }

        public int g(char[] arr_c, char[] arr_c1) {
            int v = Math.min(arr_c.length, arr_c1.length);
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = c.e(arr_c[v1], arr_c1[v1]);
                if(v2 != 0) {
                    return v2;
                }
            }
            return arr_c.length - arr_c1.length;
        }

        @Override
        public String toString() {
            return "Chars.lexicographicalComparator()";
        }
    }

    public static final int a = 2;

    public static void A(char[] arr_c) {
        H.E(arr_c);
        c.B(arr_c, 0, arr_c.length);
    }

    public static void B(char[] arr_c, int v, int v1) {
        H.E(arr_c);
        H.f0(v, v1, arr_c.length);
        Arrays.sort(arr_c, v, v1);
        c.w(arr_c, v, v1);
    }

    public static char[] C(Collection collection0) {
        if(collection0 instanceof a) {
            return ((a)collection0).c();
        }
        Object[] arr_object = collection0.toArray();
        char[] arr_c = new char[arr_object.length];
        for(int v = 0; v < arr_object.length; ++v) {
            arr_c[v] = ((Character)H.E(arr_object[v])).charValue();
        }
        return arr_c;
    }

    @J1.c
    public static byte[] D(char c) {
        return new byte[]{((byte)(c >> 8)), ((byte)c)};
    }

    public static List c(char[] arr_c) {
        return arr_c.length == 0 ? Collections.emptyList() : new a(arr_c);
    }

    public static char d(long v) {
        H.p(((long)(((char)(((int)v))))) == v, "Out of range: %s", v);
        return (char)(((int)v));
    }

    public static int e(char c, char c1) {
        return c - c1;
    }

    public static char[] f(char[][] arr2_c) {
        int v1 = 0;
        for(int v = 0; v < arr2_c.length; ++v) {
            v1 += arr2_c[v].length;
        }
        char[] arr_c = new char[v1];
        int v3 = 0;
        for(int v2 = 0; v2 < arr2_c.length; ++v2) {
            char[] arr_c1 = arr2_c[v2];
            System.arraycopy(arr_c1, 0, arr_c, v3, arr_c1.length);
            v3 += arr_c1.length;
        }
        return arr_c;
    }

    public static char g(char c, char c1, char c2) {
        H.g(c1 <= c2, "min (%s) must be less than or equal to max (%s)", c1, c2);
        if(c < c1) {
            return c1;
        }
        return c < c2 ? c : c2;
    }

    public static boolean h(char[] arr_c, char c) {
        for(int v = 0; v < arr_c.length; ++v) {
            if(arr_c[v] == c) {
                return true;
            }
        }
        return false;
    }

    public static char[] i(char[] arr_c, int v, int v1) {
        boolean z = false;
        H.k(v >= 0, "Invalid minLength: %s", v);
        if(v1 >= 0) {
            z = true;
        }
        H.k(z, "Invalid padding: %s", v1);
        return arr_c.length >= v ? arr_c : Arrays.copyOf(arr_c, v + v1);
    }

    @J1.c
    public static char j(byte[] arr_b) {
        H.m(arr_b.length >= 2, "array too small: %s < %s", arr_b.length, 2);
        return c.k(arr_b[0], arr_b[1]);
    }

    @J1.c
    public static char k(byte b, byte b1) {
        return (char)(b << 8 | b1 & 0xFF);
    }

    public static int l(char c) {
        return c;
    }

    public static int m(char[] arr_c, char c) {
        return c.n(arr_c, c, 0, arr_c.length);
    }

    private static int n(char[] arr_c, char c, int v, int v1) {
        while(v < v1) {
            if(arr_c[v] == c) {
                return v;
            }
            ++v;
        }
        return -1;
    }

    public static int o(char[] arr_c, char[] arr_c1) {
        H.F(arr_c, "array");
        H.F(arr_c1, "target");
        if(arr_c1.length == 0) {
            return 0;
        }
        int v = 0;
    label_5:
        while(v < arr_c.length - arr_c1.length + 1) {
            int v1 = 0;
            while(v1 < arr_c1.length) {
                if(arr_c[v + v1] == arr_c1[v1]) {
                    ++v1;
                    continue;
                }
                ++v;
                continue label_5;
            }
            return v;
        }
        return -1;
    }

    public static String p(String s, char[] arr_c) {
        H.E(s);
        if(arr_c.length == 0) {
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder(s.length() * (arr_c.length - 1) + arr_c.length);
        stringBuilder0.append(arr_c[0]);
        for(int v = 1; v < arr_c.length; ++v) {
            stringBuilder0.append(s);
            stringBuilder0.append(arr_c[v]);
        }
        return stringBuilder0.toString();
    }

    public static int q(char[] arr_c, char c) {
        return c.r(arr_c, c, 0, arr_c.length);
    }

    private static int r(char[] arr_c, char c, int v, int v1) {
        for(int v2 = v1 - 1; v2 >= v; --v2) {
            if(arr_c[v2] == c) {
                return v2;
            }
        }
        return -1;
    }

    public static Comparator s() {
        return com.google.common.primitives.c.b.a;
    }

    public static char t(char[] arr_c) {
        H.d(arr_c.length > 0);
        char c = arr_c[0];
        for(int v = 1; v < arr_c.length; ++v) {
            char c1 = arr_c[v];
            if(c1 > c) {
                c = c1;
            }
        }
        return c;
    }

    public static char u(char[] arr_c) {
        H.d(arr_c.length > 0);
        char c = arr_c[0];
        for(int v = 1; v < arr_c.length; ++v) {
            char c1 = arr_c[v];
            if(c1 < c) {
                c = c1;
            }
        }
        return c;
    }

    public static void v(char[] arr_c) {
        H.E(arr_c);
        c.w(arr_c, 0, arr_c.length);
    }

    public static void w(char[] arr_c, int v, int v1) {
        H.E(arr_c);
        H.f0(v, v1, arr_c.length);
        for(int v2 = v1 - 1; v < v2; --v2) {
            char c = arr_c[v];
            arr_c[v] = arr_c[v2];
            arr_c[v2] = c;
            ++v;
        }
    }

    public static void x(char[] arr_c, int v) {
        c.y(arr_c, v, 0, arr_c.length);
    }

    public static void y(char[] arr_c, int v, int v1, int v2) {
        H.E(arr_c);
        H.f0(v1, v2, arr_c.length);
        if(arr_c.length <= 1) {
            return;
        }
        int v3 = v2 - v1;
        int v4 = -v % v3;
        if(v4 < 0) {
            v4 += v3;
        }
        int v5 = v4 + v1;
        if(v5 == v1) {
            return;
        }
        c.w(arr_c, v1, v5);
        c.w(arr_c, v5, v2);
        c.w(arr_c, v1, v2);
    }

    public static char z(long v) {
        if(v > 0xFFFFL) {
            return '\uFFFF';
        }
        return v >= 0L ? ((char)(((int)v))) : '\u0000';
    }
}

