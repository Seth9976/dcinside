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

@b
@f
public final class a {
    @b
    static class com.google.common.primitives.a.a extends AbstractList implements Serializable, RandomAccess {
        final boolean[] a;
        final int b;
        final int c;
        private static final long d;

        com.google.common.primitives.a.a(boolean[] arr_z) {
            this(arr_z, 0, arr_z.length);
        }

        com.google.common.primitives.a.a(boolean[] arr_z, int v, int v1) {
            this.a = arr_z;
            this.b = v;
            this.c = v1;
        }

        public Boolean a(int v) {
            H.C(v, this.size());
            return Boolean.valueOf(this.a[this.b + v]);
        }

        public Boolean b(int v, Boolean boolean0) {
            H.C(v, this.size());
            boolean z = this.a[this.b + v];
            this.a[this.b + v] = ((Boolean)H.E(boolean0)).booleanValue();
            return Boolean.valueOf(z);
        }

        boolean[] c() {
            return Arrays.copyOfRange(this.a, this.b, this.c);
        }

        @Override
        public boolean contains(@o3.a Object object0) {
            return object0 instanceof Boolean && a.l(this.a, ((Boolean)object0).booleanValue(), this.b, this.c) != -1;
        }

        @Override
        public boolean equals(@o3.a Object object0) {
            if(object0 == this) {
                return true;
            }
            if(object0 instanceof com.google.common.primitives.a.a) {
                int v = this.size();
                if(((com.google.common.primitives.a.a)object0).size() != v) {
                    return false;
                }
                for(int v1 = 0; v1 < v; ++v1) {
                    if(this.a[this.b + v1] != ((com.google.common.primitives.a.a)object0).a[((com.google.common.primitives.a.a)object0).b + v1]) {
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
                v1 = v1 * 0x1F + a.j(this.a[v]);
                ++v;
            }
            return v1;
        }

        @Override
        public int indexOf(@o3.a Object object0) {
            if(object0 instanceof Boolean) {
                int v = a.l(this.a, ((Boolean)object0).booleanValue(), this.b, this.c);
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
            if(object0 instanceof Boolean) {
                int v = a.p(this.a, ((Boolean)object0).booleanValue(), this.b, this.c);
                return v < 0 ? -1 : v - this.b;
            }
            return -1;
        }

        @Override
        public Object set(int v, Object object0) {
            return this.b(v, ((Boolean)object0));
        }

        @Override
        public int size() {
            return this.c - this.b;
        }

        @Override
        public List subList(int v, int v1) {
            H.f0(v, v1, this.size());
            return v == v1 ? Collections.emptyList() : new com.google.common.primitives.a.a(this.a, v + this.b, this.b + v1);
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder(this.size() * 7);
            stringBuilder0.append((this.a[this.b] ? "[true" : "[false"));
            int v = this.b;
            while(true) {
                ++v;
                if(v >= this.c) {
                    break;
                }
                stringBuilder0.append((this.a[v] ? ", true" : ", false"));
            }
            stringBuilder0.append(']');
            return stringBuilder0.toString();
        }
    }

    static enum com.google.common.primitives.a.b implements Comparator {
        TRUE_FIRST(1, "Booleans.trueFirst()"),
        FALSE_FIRST(-1, "Booleans.falseFirst()");

        private final int a;
        private final String b;

        private com.google.common.primitives.a.b(int v1, String s1) {
            this.a = v1;
            this.b = s1;
        }

        private static com.google.common.primitives.a.b[] b() [...] // Inlined contents

        @Override
        public int compare(Object object0, Object object1) {
            return this.g(((Boolean)object0), ((Boolean)object1));
        }

        public int g(Boolean boolean0, Boolean boolean1) {
            int v = 0;
            int v1 = boolean0.booleanValue() ? this.a : 0;
            if(boolean1.booleanValue()) {
                v = this.a;
            }
            return v - v1;
        }

        @Override
        public String toString() {
            return this.b;
        }
    }

    static enum c implements Comparator {
        INSTANCE;

        private static c[] b() [...] // Inlined contents

        @Override
        public int compare(Object object0, Object object1) {
            return this.g(((boolean[])object0), ((boolean[])object1));
        }

        public int g(boolean[] arr_z, boolean[] arr_z1) {
            int v = Math.min(arr_z.length, arr_z1.length);
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = a.d(arr_z[v1], arr_z1[v1]);
                if(v2 != 0) {
                    return v2;
                }
            }
            return arr_z.length - arr_z1.length;
        }

        @Override
        public String toString() {
            return "Booleans.lexicographicalComparator()";
        }
    }

    public static List c(boolean[] arr_z) {
        return arr_z.length == 0 ? Collections.emptyList() : new com.google.common.primitives.a.a(arr_z);
    }

    public static int d(boolean z, boolean z1) {
        if(z == z1) {
            return 0;
        }
        return z ? 1 : -1;
    }

    public static boolean[] e(boolean[][] arr2_z) {
        int v1 = 0;
        for(int v = 0; v < arr2_z.length; ++v) {
            v1 += arr2_z[v].length;
        }
        boolean[] arr_z = new boolean[v1];
        int v3 = 0;
        for(int v2 = 0; v2 < arr2_z.length; ++v2) {
            boolean[] arr_z1 = arr2_z[v2];
            System.arraycopy(arr_z1, 0, arr_z, v3, arr_z1.length);
            v3 += arr_z1.length;
        }
        return arr_z;
    }

    public static boolean f(boolean[] arr_z, boolean z) {
        for(int v = 0; v < arr_z.length; ++v) {
            if(arr_z[v] == z) {
                return true;
            }
        }
        return false;
    }

    public static int g(boolean[] arr_z) {
        int v1 = 0;
        for(int v = 0; v < arr_z.length; ++v) {
            if(arr_z[v]) {
                ++v1;
            }
        }
        return v1;
    }

    public static boolean[] h(boolean[] arr_z, int v, int v1) {
        boolean z = false;
        H.k(v >= 0, "Invalid minLength: %s", v);
        if(v1 >= 0) {
            z = true;
        }
        H.k(z, "Invalid padding: %s", v1);
        return arr_z.length >= v ? arr_z : Arrays.copyOf(arr_z, v + v1);
    }

    public static Comparator i() {
        return com.google.common.primitives.a.b.d;
    }

    // 去混淆评级： 低(20)
    public static int j(boolean z) {
        return z ? 0x4CF : 0x4D5;
    }

    public static int k(boolean[] arr_z, boolean z) {
        return a.l(arr_z, z, 0, arr_z.length);
    }

    private static int l(boolean[] arr_z, boolean z, int v, int v1) {
        while(v < v1) {
            if(arr_z[v] == z) {
                return v;
            }
            ++v;
        }
        return -1;
    }

    public static int m(boolean[] arr_z, boolean[] arr_z1) {
        H.F(arr_z, "array");
        H.F(arr_z1, "target");
        if(arr_z1.length == 0) {
            return 0;
        }
        int v = 0;
    label_5:
        while(v < arr_z.length - arr_z1.length + 1) {
            int v1 = 0;
            while(v1 < arr_z1.length) {
                if(arr_z[v + v1] == arr_z1[v1]) {
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

    public static String n(String s, boolean[] arr_z) {
        H.E(s);
        if(arr_z.length == 0) {
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder(arr_z.length * 7);
        stringBuilder0.append(arr_z[0]);
        for(int v = 1; v < arr_z.length; ++v) {
            stringBuilder0.append(s);
            stringBuilder0.append(arr_z[v]);
        }
        return stringBuilder0.toString();
    }

    public static int o(boolean[] arr_z, boolean z) {
        return a.p(arr_z, z, 0, arr_z.length);
    }

    private static int p(boolean[] arr_z, boolean z, int v, int v1) {
        for(int v2 = v1 - 1; v2 >= v; --v2) {
            if(arr_z[v2] == z) {
                return v2;
            }
        }
        return -1;
    }

    public static Comparator q() {
        return c.a;
    }

    public static void r(boolean[] arr_z) {
        H.E(arr_z);
        a.s(arr_z, 0, arr_z.length);
    }

    public static void s(boolean[] arr_z, int v, int v1) {
        H.E(arr_z);
        H.f0(v, v1, arr_z.length);
        for(int v2 = v1 - 1; v < v2; --v2) {
            boolean z = arr_z[v];
            arr_z[v] = arr_z[v2];
            arr_z[v2] = z;
            ++v;
        }
    }

    public static void t(boolean[] arr_z, int v) {
        a.u(arr_z, v, 0, arr_z.length);
    }

    public static void u(boolean[] arr_z, int v, int v1, int v2) {
        H.E(arr_z);
        H.f0(v1, v2, arr_z.length);
        if(arr_z.length <= 1) {
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
        a.s(arr_z, v1, v5);
        a.s(arr_z, v5, v2);
        a.s(arr_z, v1, v2);
    }

    public static boolean[] v(Collection collection0) {
        if(collection0 instanceof com.google.common.primitives.a.a) {
            return ((com.google.common.primitives.a.a)collection0).c();
        }
        Object[] arr_object = collection0.toArray();
        boolean[] arr_z = new boolean[arr_object.length];
        for(int v = 0; v < arr_object.length; ++v) {
            arr_z[v] = ((Boolean)H.E(arr_object[v])).booleanValue();
        }
        return arr_z;
    }

    public static Comparator w() {
        return com.google.common.primitives.a.b.c;
    }
}

