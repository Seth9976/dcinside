package com.fasterxml.jackson.core.io;

import java.util.Arrays;

public final class c {
    static class a {
        private int[][] a;
        public static final a b;

        static {
            a.b = new a();
        }

        private a() {
            this.a = new int[0x80][];
        }

        public int[] a(int v) {
            int[] arr_v = this.a[v];
            if(arr_v == null) {
                arr_v = Arrays.copyOf(c.k, 0x80);
                if(arr_v[v] == 0) {
                    arr_v[v] = -1;
                }
                this.a[v] = arr_v;
            }
            return arr_v;
        }
    }

    protected static final char[] a;
    protected static final char[] b;
    protected static final byte[] c;
    protected static final byte[] d;
    protected static final int[] e;
    protected static final int[] f;
    protected static final int[] g;
    protected static final int[] h;
    protected static final int[] i;
    protected static final int[] j;
    protected static final int[] k;
    protected static final int[] l;

    static {
        char[] arr_c = "0123456789ABCDEF".toCharArray();
        c.a = arr_c;
        c.b = "0123456789abcdef".toCharArray();
        c.c = new byte[arr_c.length];
        c.d = new byte[arr_c.length];
        for(int v1 = 0; v1 < arr_c.length; ++v1) {
            c.c[v1] = (byte)c.a[v1];
            c.d[v1] = (byte)c.b[v1];
        }
        int[] arr_v = new int[0x100];
        for(int v2 = 0; v2 < 0x20; ++v2) {
            arr_v[v2] = -1;
        }
        arr_v[34] = 1;
        arr_v[92] = 1;
        c.e = arr_v;
        int[] arr_v1 = new int[0x100];
        System.arraycopy(arr_v, 0, arr_v1, 0, 0x100);
        int v3 = 0x80;
    alab1:
        while(true) {
            int v4 = -1;
            while(true) {
                arr_v1[v3] = v4;
                ++v3;
                if(v3 >= 0x100) {
                    break alab1;
                }
                if((v3 & 0xE0) == 0xC0) {
                    v4 = 2;
                }
                else if((v3 & 0xF0) == 0xE0) {
                    v4 = 3;
                }
                else {
                    if((v3 & 0xF8) != 0xF0) {
                        break;
                    }
                    v4 = 4;
                }
            }
        }
        c.f = arr_v1;
        int[] arr_v2 = new int[0x100];
        Arrays.fill(arr_v2, -1);
        for(int v5 = 33; v5 < 0x100; ++v5) {
            if(Character.isJavaIdentifierPart(((char)v5))) {
                arr_v2[v5] = 0;
            }
        }
        arr_v2[0x40] = 0;
        arr_v2[35] = 0;
        arr_v2[42] = 0;
        arr_v2[45] = 0;
        arr_v2[43] = 0;
        c.g = arr_v2;
        int[] arr_v3 = new int[0x100];
        System.arraycopy(arr_v2, 0, arr_v3, 0, 0x100);
        Arrays.fill(arr_v3, 0x80, 0x80, 0);
        c.h = arr_v3;
        int[] arr_v4 = new int[0x100];
        System.arraycopy(c.f, 0x80, arr_v4, 0x80, 0x80);
        Arrays.fill(arr_v4, 0, 0x20, -1);
        arr_v4[9] = 0;
        arr_v4[10] = 10;
        arr_v4[13] = 13;
        arr_v4[42] = 42;
        c.i = arr_v4;
        int[] arr_v5 = new int[0x100];
        System.arraycopy(c.f, 0x80, arr_v5, 0x80, 0x80);
        Arrays.fill(arr_v5, 0, 0x20, -1);
        arr_v5[0x20] = 1;
        arr_v5[9] = 1;
        arr_v5[10] = 10;
        arr_v5[13] = 13;
        arr_v5[0x2F] = 0x2F;
        arr_v5[35] = 35;
        c.j = arr_v5;
        int[] arr_v6 = new int[0x80];
        for(int v6 = 0; v6 < 0x20; ++v6) {
            arr_v6[v6] = -1;
        }
        arr_v6[34] = 34;
        arr_v6[92] = 92;
        arr_v6[8] = 98;
        arr_v6[9] = 0x74;
        arr_v6[12] = 102;
        arr_v6[10] = 110;
        arr_v6[13] = 0x72;
        c.k = arr_v6;
        int[] arr_v7 = new int[0x100];
        c.l = arr_v7;
        Arrays.fill(arr_v7, -1);
        for(int v7 = 0; v7 < 10; ++v7) {
            c.l[v7 + 0x30] = v7;
        }
        for(int v = 0; v < 6; ++v) {
            c.l[v + 97] = v + 10;
            c.l[v + 65] = v + 10;
        }
    }

    public static void a(StringBuilder stringBuilder0, String s) {
        int[] arr_v = c.k;
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = s.charAt(v1);
            if(v2 >= arr_v.length || arr_v[v2] == 0) {
                stringBuilder0.append(((char)v2));
            }
            else {
                stringBuilder0.append('\\');
                int v3 = arr_v[v2];
                if(v3 < 0) {
                    stringBuilder0.append('u');
                    stringBuilder0.append('0');
                    stringBuilder0.append('0');
                    stringBuilder0.append(c.a[v2 >> 4]);
                    stringBuilder0.append(c.a[v2 & 15]);
                }
                else {
                    stringBuilder0.append(((char)v3));
                }
            }
        }
    }

    public static int b(int v) {
        return c.l[v & 0xFF];
    }

    // 去混淆评级： 低(20)
    @Deprecated
    public static byte[] c() {
        return new byte[]{0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
    }

    // 去混淆评级： 低(20)
    public static byte[] d(boolean z) [...] // 潜在的解密器

    @Deprecated
    public static char[] e() {
        return c.f(true);
    }

    // 去混淆评级： 低(20)
    public static char[] f(boolean z) {
        return z ? ((char[])c.a.clone()) : ((char[])c.b.clone());
    }

    public static int[] g() {
        return c.k;
    }

    public static int[] h(int v) {
        return v == 34 ? c.k : a.b.a(v);
    }

    public static int[] i() {
        return c.i;
    }

    public static int[] j() {
        return c.e;
    }

    public static int[] k() {
        return c.g;
    }

    public static int[] l() {
        return c.f;
    }

    public static int[] m() {
        return c.h;
    }

    public static int[] n() {
        return c.j;
    }

    public static char o(int v) {
        return c.a[v];
    }
}

