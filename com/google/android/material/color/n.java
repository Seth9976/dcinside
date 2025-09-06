package com.google.android.material.color;

import android.content.Context;
import android.util.Pair;
import androidx.annotation.ColorInt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

final class n {
    class a implements Comparator {
        a() {
            super();
        }

        public int b(b n$b0, b n$b1) {
            return n$b0.c - n$b1.c;
        }

        @Override
        public int compare(Object object0, Object object1) {
            return this.b(((b)object0), ((b)object1));
        }
    }

    static class b {
        private final byte a;
        private final byte b;
        private final short c;
        private final String d;
        @ColorInt
        private final int e;

        b(int v, String s, int v1) {
            this.d = s;
            this.e = v1;
            this.c = (short)(0xFFFF & v);
            this.b = (byte)(v >> 16 & 0xFF);
            this.a = (byte)(v >> 24 & 0xFF);
        }
    }

    static class c {
        private final e a;
        private final d b;
        private final h c;
        private final h d;
        private final k e;
        private static final short f = 0x120;
        private static final int g = 0x80;

        c(d n$d0, List list0) {
            this.b = n$d0;
            this.c = new h(false, new String[]{"?1", "?2", "?3", "?4", "?5", "color"});
            String[] arr_s = new String[list0.size()];
            for(int v = 0; v < list0.size(); ++v) {
                arr_s[v] = ((b)list0.get(v)).d;
            }
            this.d = new h(true, arr_s);
            this.e = new k(list0);
            this.a = new e(0x200, 0x120, this.a());
        }

        int a() {
            int v = this.e.b();
            return this.c.a() + 0x120 + this.d.a() + v;
        }

        void b(ByteArrayOutputStream byteArrayOutputStream0) throws IOException {
            this.a.a(byteArrayOutputStream0);
            byteArrayOutputStream0.write(n.j(this.b.a));
            char[] arr_c = this.b.b.toCharArray();
            for(int v = 0; v < 0x80; ++v) {
                if(v < arr_c.length) {
                    byteArrayOutputStream0.write(n.h(arr_c[v]));
                }
                else {
                    byteArrayOutputStream0.write(new byte[]{0, 0});
                }
            }
            byteArrayOutputStream0.write(new byte[]{0x20, 1, 0, 0});
            byteArrayOutputStream0.write(new byte[]{0, 0, 0, 0});
            byteArrayOutputStream0.write(n.j(this.c.a() + 0x120));
            byteArrayOutputStream0.write(new byte[]{0, 0, 0, 0});
            byteArrayOutputStream0.write(new byte[]{0, 0, 0, 0});
            this.c.c(byteArrayOutputStream0);
            this.d.c(byteArrayOutputStream0);
            this.e.c(byteArrayOutputStream0);
        }
    }

    static class d {
        private final int a;
        private final String b;

        d(int v, String s) {
            this.a = v;
            this.b = s;
        }
    }

    static class e {
        private final short a;
        private final short b;
        private final int c;

        e(short v, short v1, int v2) {
            this.a = v;
            this.b = v1;
            this.c = v2;
        }

        void a(ByteArrayOutputStream byteArrayOutputStream0) throws IOException {
            byteArrayOutputStream0.write(n.k(this.a));
            byteArrayOutputStream0.write(n.k(this.b));
            byteArrayOutputStream0.write(n.j(this.c));
        }
    }

    static class f {
        private final int a;
        private final int b;
        private static final short c = 8;
        private static final short d = 2;
        private static final short e = 8;
        private static final byte f = 28;
        private static final int g = 16;

        f(int v, @ColorInt int v1) {
            this.a = v;
            this.b = v1;
        }

        void a(ByteArrayOutputStream byteArrayOutputStream0) throws IOException {
            byteArrayOutputStream0.write(new byte[]{8, 0});
            byteArrayOutputStream0.write(new byte[]{2, 0});
            byteArrayOutputStream0.write(n.j(this.a));
            byteArrayOutputStream0.write(new byte[]{8, 0});
            byteArrayOutputStream0.write(new byte[]{0, 28});
            byteArrayOutputStream0.write(n.j(this.b));
        }
    }

    static class g {
        private final e a;
        private final int b;
        private final h c;
        private final List d;
        private static final short e = 12;

        g(Map map0) {
            this.d = new ArrayList();
            this.b = map0.size();
            this.c = new h(new String[0]);
            for(Object object0: map0.entrySet()) {
                List list0 = (List)((Map.Entry)object0).getValue();
                Collections.sort(list0, n.k);
                c n$c0 = new c(((d)((Map.Entry)object0).getKey()), list0);
                this.d.add(n$c0);
            }
            this.a = new e(2, 12, this.a());
        }

        private int a() {
            int v = 0;
            for(Object object0: this.d) {
                v += ((c)object0).a();
            }
            return this.c.a() + 12 + v;
        }

        void b(ByteArrayOutputStream byteArrayOutputStream0) throws IOException {
            this.a.a(byteArrayOutputStream0);
            byteArrayOutputStream0.write(n.j(this.b));
            this.c.c(byteArrayOutputStream0);
            for(Object object0: this.d) {
                ((c)object0).b(byteArrayOutputStream0);
            }
        }
    }

    static class h {
        private final e a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private final List f;
        private final List g;
        private final List h;
        private final List i;
        private final boolean j;
        private final int k;
        private final int l;
        private static final short m = 28;
        private static final int n = 0x100;
        private static final int o = -1;

        h(boolean z, String[] arr_s) {
            this.f = new ArrayList();
            this.g = new ArrayList();
            this.h = new ArrayList();
            this.i = new ArrayList();
            this.j = z;
            int v = 0;
            int v2 = 0;
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                Pair pair0 = this.b(arr_s[v1]);
                this.f.add(v2);
                Object object0 = pair0.first;
                v2 += ((byte[])object0).length;
                this.h.add(((byte[])object0));
                this.i.add(((List)pair0.second));
            }
            int v3 = 0;
            for(Object object1: this.i) {
                for(Object object2: ((List)object1)) {
                    this.f.add(v2);
                    v2 += ((i)object2).a.length;
                    byte[] arr_b = ((i)object2).a;
                    this.h.add(arr_b);
                }
                this.g.add(v3);
                v3 += ((List)object1).size() * 12 + 4;
            }
            int v4 = v2 % 4 == 0 ? 0 : 4 - v2 % 4;
            this.k = v4;
            int v5 = this.h.size();
            this.b = v5;
            this.c = this.h.size() - arr_s.length;
            boolean z1 = this.h.size() - arr_s.length > 0;
            if(!z1) {
                this.g.clear();
                this.i.clear();
            }
            int v6 = v5 * 4 + 28 + this.g.size() * 4;
            this.d = v6;
            int v7 = v2 + v4;
            this.e = z1 ? v6 + v7 : 0;
            if(z1) {
                v = v3;
            }
            int v8 = v6 + v7 + v;
            this.l = v8;
            this.a = new e(1, 28, v8);
        }

        h(String[] arr_s) {
            this(false, arr_s);
        }

        int a() {
            return this.l;
        }

        // 去混淆评级： 低(20)
        private Pair b(String s) {
            return this.j ? new Pair(n.m(s), Collections.emptyList()) : new Pair(n.l(s), Collections.emptyList());
        }

        void c(ByteArrayOutputStream byteArrayOutputStream0) throws IOException {
            this.a.a(byteArrayOutputStream0);
            byteArrayOutputStream0.write(n.j(this.b));
            byteArrayOutputStream0.write(n.j(this.c));
            byteArrayOutputStream0.write(n.j((this.j ? 0x100 : 0)));
            byteArrayOutputStream0.write(n.j(this.d));
            byteArrayOutputStream0.write(n.j(this.e));
            for(Object object0: this.f) {
                byteArrayOutputStream0.write(n.j(((int)(((Integer)object0)))));
            }
            for(Object object1: this.g) {
                byteArrayOutputStream0.write(n.j(((int)(((Integer)object1)))));
            }
            for(Object object2: this.h) {
                byteArrayOutputStream0.write(((byte[])object2));
            }
            int v = this.k;
            if(v > 0) {
                byteArrayOutputStream0.write(new byte[v]);
            }
            for(Object object3: this.i) {
                for(Object object4: ((List)object3)) {
                    ((i)object4).b(byteArrayOutputStream0);
                }
                byteArrayOutputStream0.write(new byte[]{-1, -1, -1, -1});
            }
        }
    }

    static class i {
        private byte[] a;
        private int b;
        private int c;
        private int d;

        void b(ByteArrayOutputStream byteArrayOutputStream0) throws IOException {
            byteArrayOutputStream0.write(n.j(this.b));
            byteArrayOutputStream0.write(n.j(this.c));
            byteArrayOutputStream0.write(n.j(this.d));
        }
    }

    static class j {
        private final e a;
        private final int b;
        private final byte[] c;
        private final int[] d;
        private final f[] e;
        private static final int f = -1;
        private static final short g = 84;
        private static final byte h = 0x40;

        j(List list0, Set set0, int v) {
            byte[] arr_b = new byte[0x40];
            this.c = arr_b;
            this.b = v;
            arr_b[0] = 0x40;
            this.e = new f[list0.size()];
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                this.e[v2] = new f(v2, ((b)list0.get(v2)).e);
            }
            this.d = new int[v];
            int v3 = 0;
            for(int v1 = 0; v1 < v; v1 = (short)(v1 + 1)) {
                if(set0.contains(((short)v1))) {
                    this.d[v1] = v3;
                    v3 += 16;
                }
                else {
                    this.d[v1] = -1;
                }
            }
            this.a = new e(0x201, 84, this.a());
        }

        int a() {
            return this.b() + this.e.length * 16;
        }

        private int b() {
            return this.c() + 84;
        }

        private int c() {
            return this.d.length * 4;
        }

        void d(ByteArrayOutputStream byteArrayOutputStream0) throws IOException {
            this.a.a(byteArrayOutputStream0);
            byteArrayOutputStream0.write(new byte[]{0, 0, 0, 0});
            byteArrayOutputStream0.write(n.j(this.b));
            byteArrayOutputStream0.write(n.j(this.b()));
            byteArrayOutputStream0.write(this.c);
            int[] arr_v = this.d;
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                byteArrayOutputStream0.write(n.j(arr_v[v1]));
            }
            f[] arr_n$f = this.e;
            for(int v = 0; v < arr_n$f.length; ++v) {
                arr_n$f[v].a(byteArrayOutputStream0);
            }
        }
    }

    static class k {
        private final e a;
        private final int b;
        private final int[] c;
        private final j d;
        private static final short e = 16;
        private static final int f = 0x40000000;

        k(List list0) {
            this.b = ((b)list0.get(list0.size() - 1)).c + 1;
            HashSet hashSet0 = new HashSet();
            for(Object object0: list0) {
                hashSet0.add(((b)object0).c);
            }
            this.c = new int[this.b];
            for(int v = 0; v < this.b; v = (short)(v + 1)) {
                if(hashSet0.contains(((short)v))) {
                    this.c[v] = 0x40000000;
                }
            }
            this.a = new e(0x202, 16, this.a());
            this.d = new j(list0, hashSet0, this.b);
        }

        private int a() {
            return this.b * 4 + 16;
        }

        int b() {
            return this.a() + this.d.a();
        }

        void c(ByteArrayOutputStream byteArrayOutputStream0) throws IOException {
            this.a.a(byteArrayOutputStream0);
            byteArrayOutputStream0.write(new byte[]{0, 0, 0, 0});
            byteArrayOutputStream0.write(n.j(this.b));
            int[] arr_v = this.c;
            for(int v = 0; v < arr_v.length; ++v) {
                byteArrayOutputStream0.write(n.j(arr_v[v]));
            }
            this.d.d(byteArrayOutputStream0);
        }
    }

    private static final short a = 2;
    private static final short b = 1;
    private static final short c = 0x200;
    private static final short d = 0x201;
    private static final short e = 0x202;
    private static final byte f = 1;
    private static final byte g = 0x7F;
    private static final String h = "color";
    private static byte i;
    private static final d j;
    private static final Comparator k;

    static {
        n.j = new d(1, "android");
        n.k = new a();
    }

    static byte b() [...] // 潜在的解密器

    private static byte[] h(char c) {
        return new byte[]{((byte)(c & 0xFF)), ((byte)(c >> 8 & 0xFF))};
    }

    static byte[] i(Context context0, Map map0) throws IOException {
        d n$d1;
        if(map0.entrySet().isEmpty()) {
            throw new IllegalArgumentException("No color resources provided for harmonization.");
        }
        d n$d0 = new d(0x7F, "com.dcinside.app.android");
        HashMap hashMap0 = new HashMap();
        b n$b0 = null;
        for(Object object0: map0.entrySet()) {
            b n$b1 = new b(((int)(((Integer)((Map.Entry)object0).getKey()))), context0.getResources().getResourceName(((int)(((Integer)((Map.Entry)object0).getKey())))), ((int)(((Integer)((Map.Entry)object0).getValue()))));
            if(!context0.getResources().getResourceTypeName(((int)(((Integer)((Map.Entry)object0).getKey())))).equals("color")) {
                throw new IllegalArgumentException("Non color resource found: name=" + n$b1.d + ", typeId=" + Integer.toHexString(n$b1.b & 0xFF));
            }
            switch(n$b1.a) {
                case 1: {
                    n$d1 = n.j;
                    break;
                }
                case 0x7F: {
                    n$d1 = n$d0;
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Not supported with unknown package id: " + n$b1.a);
                }
            }
            if(!hashMap0.containsKey(n$d1)) {
                hashMap0.put(n$d1, new ArrayList());
            }
            ((List)hashMap0.get(n$d1)).add(n$b1);
            n$b0 = n$b1;
        }
        byte b = n$b0.b;
        n.i = b;
        if(b == 0) {
            throw new IllegalArgumentException("No color resources found for harmonization.");
        }
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        new g(hashMap0).b(byteArrayOutputStream0);
        return byteArrayOutputStream0.toByteArray();
    }

    private static byte[] j(int v) {
        return new byte[]{((byte)(v & 0xFF)), ((byte)(v >> 8 & 0xFF)), ((byte)(v >> 16 & 0xFF)), ((byte)(v >> 24 & 0xFF))};
    }

    private static byte[] k(short v) {
        return new byte[]{((byte)(v & 0xFF)), ((byte)(v >> 8 & 0xFF))};
    }

    private static byte[] l(String s) {
        char[] arr_c = s.toCharArray();
        int v = arr_c.length * 2;
        byte[] arr_b = new byte[v + 4];
        byte[] arr_b1 = n.k(((short)arr_c.length));
        arr_b[0] = arr_b1[0];
        arr_b[1] = arr_b1[1];
        for(int v1 = 0; v1 < arr_c.length; ++v1) {
            byte[] arr_b2 = n.h(arr_c[v1]);
            arr_b[v1 * 2 + 2] = arr_b2[0];
            arr_b[v1 * 2 + 3] = arr_b2[1];
        }
        arr_b[v + 2] = 0;
        arr_b[v + 3] = 0;
        return arr_b;
    }

    private static byte[] m(String s) {
        byte[] arr_b = s.getBytes(Charset.forName("UTF-8"));
        byte[] arr_b1 = new byte[arr_b.length + 3];
        System.arraycopy(arr_b, 0, arr_b1, 2, ((int)(((byte)arr_b.length))));
        arr_b1[1] = (byte)arr_b.length;
        arr_b1[0] = (byte)arr_b.length;
        arr_b1[arr_b.length + 2] = 0;
        return arr_b1;
    }
}

