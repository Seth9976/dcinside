package com.google.common.primitives;

import J1.b;
import com.google.common.base.H;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

@b
@f
public final class com.google.common.primitives.b {
    @b
    static class a extends AbstractList implements Serializable, RandomAccess {
        final byte[] a;
        final int b;
        final int c;
        private static final long d;

        a(byte[] arr_b) {
            this(arr_b, 0, arr_b.length);
        }

        a(byte[] arr_b, int v, int v1) {
            this.a = arr_b;
            this.b = v;
            this.c = v1;
        }

        public Byte a(int v) {
            H.C(v, this.size());
            return (byte)this.a[this.b + v];
        }

        public Byte b(int v, Byte byte0) {
            H.C(v, this.size());
            int v1 = this.a[this.b + v];
            this.a[this.b + v] = (byte)(((Byte)H.E(byte0)));
            return (byte)v1;
        }

        byte[] c() {
            return Arrays.copyOfRange(this.a, this.b, this.c);
        }

        @Override
        public boolean contains(@o3.a Object object0) {
            return object0 instanceof Byte && com.google.common.primitives.b.i(this.a, ((byte)(((Byte)object0))), this.b, this.c) != -1;
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
                v1 = v1 * 0x1F + com.google.common.primitives.b.g(this.a[v]);
                ++v;
            }
            return v1;
        }

        @Override
        public int indexOf(@o3.a Object object0) {
            if(object0 instanceof Byte) {
                int v = com.google.common.primitives.b.i(this.a, ((byte)(((Byte)object0))), this.b, this.c);
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
            if(object0 instanceof Byte) {
                int v = com.google.common.primitives.b.l(this.a, ((byte)(((Byte)object0))), this.b, this.c);
                return v < 0 ? -1 : v - this.b;
            }
            return -1;
        }

        @Override
        public Object set(int v, Object object0) {
            return this.b(v, ((Byte)object0));
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
            StringBuilder stringBuilder0 = new StringBuilder(this.size() * 5);
            stringBuilder0.append('[');
            stringBuilder0.append(((int)this.a[this.b]));
            int v = this.b;
            while(true) {
                ++v;
                if(v >= this.c) {
                    break;
                }
                stringBuilder0.append(", ");
                stringBuilder0.append(((int)this.a[v]));
            }
            stringBuilder0.append(']');
            return stringBuilder0.toString();
        }
    }

    public static List c(byte[] arr_b) {
        return arr_b.length == 0 ? Collections.emptyList() : new a(arr_b);
    }

    public static byte[] d(byte[][] arr2_b) {
        int v1 = 0;
        for(int v = 0; v < arr2_b.length; ++v) {
            v1 += arr2_b[v].length;
        }
        byte[] arr_b = new byte[v1];
        int v3 = 0;
        for(int v2 = 0; v2 < arr2_b.length; ++v2) {
            byte[] arr_b1 = arr2_b[v2];
            System.arraycopy(arr_b1, 0, arr_b, v3, arr_b1.length);
            v3 += arr_b1.length;
        }
        return arr_b;
    }

    public static boolean e(byte[] arr_b, byte b) {
        for(int v = 0; v < arr_b.length; ++v) {
            if(arr_b[v] == b) {
                return true;
            }
        }
        return false;
    }

    public static byte[] f(byte[] arr_b, int v, int v1) {
        boolean z = false;
        H.k(v >= 0, "Invalid minLength: %s", v);
        if(v1 >= 0) {
            z = true;
        }
        H.k(z, "Invalid padding: %s", v1);
        return arr_b.length >= v ? arr_b : Arrays.copyOf(arr_b, v + v1);
    }

    public static int g(byte b) {
        return b;
    }

    public static int h(byte[] arr_b, byte b) {
        return com.google.common.primitives.b.i(arr_b, b, 0, arr_b.length);
    }

    private static int i(byte[] arr_b, byte b, int v, int v1) {
        while(v < v1) {
            if(arr_b[v] == b) {
                return v;
            }
            ++v;
        }
        return -1;
    }

    public static int j(byte[] arr_b, byte[] arr_b1) {
        H.F(arr_b, "array");
        H.F(arr_b1, "target");
        if(arr_b1.length == 0) {
            return 0;
        }
        int v = 0;
    label_5:
        while(v < arr_b.length - arr_b1.length + 1) {
            int v1 = 0;
            while(v1 < arr_b1.length) {
                if(arr_b[v + v1] == arr_b1[v1]) {
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

    public static int k(byte[] arr_b, byte b) {
        return com.google.common.primitives.b.l(arr_b, b, 0, arr_b.length);
    }

    private static int l(byte[] arr_b, byte b, int v, int v1) {
        for(int v2 = v1 - 1; v2 >= v; --v2) {
            if(arr_b[v2] == b) {
                return v2;
            }
        }
        return -1;
    }

    public static void m(byte[] arr_b) {
        H.E(arr_b);
        com.google.common.primitives.b.n(arr_b, 0, arr_b.length);
    }

    public static void n(byte[] arr_b, int v, int v1) {
        H.E(arr_b);
        H.f0(v, v1, arr_b.length);
        for(int v2 = v1 - 1; v < v2; --v2) {
            byte b = arr_b[v];
            arr_b[v] = arr_b[v2];
            arr_b[v2] = b;
            ++v;
        }
    }

    public static void o(byte[] arr_b, int v) {
        com.google.common.primitives.b.p(arr_b, v, 0, arr_b.length);
    }

    public static void p(byte[] arr_b, int v, int v1, int v2) {
        H.E(arr_b);
        H.f0(v1, v2, arr_b.length);
        if(arr_b.length <= 1) {
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
        com.google.common.primitives.b.n(arr_b, v1, v5);
        com.google.common.primitives.b.n(arr_b, v5, v2);
        com.google.common.primitives.b.n(arr_b, v1, v2);
    }

    public static byte[] q(Collection collection0) {
        if(collection0 instanceof a) {
            return ((a)collection0).c();
        }
        Object[] arr_object = collection0.toArray();
        byte[] arr_b = new byte[arr_object.length];
        for(int v = 0; v < arr_object.length; ++v) {
            arr_b[v] = ((Number)H.E(arr_object[v])).byteValue();
        }
        return arr_b;
    }
}

