package javassist.bytecode.stackmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javassist.bytecode.A;
import javassist.bytecode.T;
import javassist.bytecode.e;
import javassist.bytecode.p;
import javassist.bytecode.q;

public class a {
    public static class javassist.bytecode.stackmap.a.a {
        public javassist.bytecode.stackmap.a.a a;
        public a b;
        public int c;

        javassist.bytecode.stackmap.a.a(a a0, int v, javassist.bytecode.stackmap.a.a a$a0) {
            this.b = a0;
            this.c = v;
            this.a = a$a0;
        }
    }

    static class b extends e {
        private static final long b = 1L;

        b() {
            super("JSR");
        }
    }

    public static class c {
        private void a(a[] arr_a, A a0) throws e {
            if(a0 == null) {
                return;
            }
            int v = a0.p();
            while(true) {
                --v;
                if(v < 0) {
                    break;
                }
                a a1 = a.a(arr_a, a0.g(v));
                int v1 = a0.q(v);
                int v2 = a0.f(v);
                int v3 = a0.d(v);
                --a1.c;
                for(int v4 = 0; v4 < arr_a.length; ++v4) {
                    a a2 = arr_a[v4];
                    if(v1 <= a2.a && a2.a < v2) {
                        a2.f = new javassist.bytecode.stackmap.a.a(a1, v3, a2.f);
                        ++a1.c;
                    }
                }
            }
        }

        private static a b(d a$d0) {
            a a0 = a$d0.b;
            if(a0 != null) {
                int v = a$d0.e;
                if(v > 0) {
                    a0.d = a$d0.c;
                    a0.b = v;
                    a0.e = a$d0.d;
                }
            }
            return a0;
        }

        public a[] c(q q0, int v, int v1, A a0) throws e {
            a[] arr_a = this.i(this.o(q0, v, v1, a0));
            this.a(arr_a, a0);
            return arr_a;
        }

        public a[] d(T t0) throws e {
            p p0 = t0.f();
            if(p0 == null) {
                return null;
            }
            q q0 = p0.G();
            return this.c(q0, 0, q0.j(), p0.C());
        }

        protected a[] e(int v) {
            return new a[v];
        }

        private a[] f(a a0) {
            a[] arr_a = this.e(1);
            arr_a[0] = a0;
            return arr_a;
        }

        private a[] g(a a0, a a1) {
            a[] arr_a = this.e(2);
            arr_a[0] = a0;
            arr_a[1] = a1;
            return arr_a;
        }

        protected a h(int v) {
            return new a(v);
        }

        private a[] i(Map map0) {
            a a0;
            d[] arr_a$d = (d[])map0.values().toArray(new d[map0.size()]);
            Arrays.sort(arr_a$d);
            ArrayList arrayList0 = new ArrayList();
            int v = 0;
            if(arr_a$d.length > 0) {
                d a$d0 = arr_a$d[0];
                if(a$d0.a != 0 || a$d0.b == null) {
                    a0 = this.h(0);
                }
                else {
                    a0 = c.b(a$d0);
                    v = 1;
                }
            }
            else {
                a0 = this.h(0);
            }
            arrayList0.add(a0);
            while(v < arr_a$d.length) {
                d a$d1 = arr_a$d[v];
                a a1 = c.b(a$d1);
                if(a1 == null) {
                    int v1 = a0.b;
                    if(v1 > 0) {
                        a0 = this.h(a0.a + v1);
                        arrayList0.add(a0);
                    }
                    a0.b = a$d1.a + a$d1.e - a0.a;
                    a0.d = a$d1.c;
                    a0.e = a$d1.d;
                }
                else {
                    int v2 = a0.b;
                    if(v2 == 0) {
                        a0.b = a$d1.a - a0.a;
                        ++a1.c;
                        a0.d = this.f(a1);
                    }
                    else {
                        int v3 = a0.a;
                        if(v3 + v2 < a$d1.a) {
                            a a2 = this.h(v3 + v2);
                            arrayList0.add(a2);
                            a2.b = a$d1.a - a2.a;
                            a2.e = true;
                            a2.d = this.f(a1);
                        }
                    }
                    arrayList0.add(a1);
                    a0 = a1;
                }
                ++v;
            }
            return (a[])arrayList0.toArray(this.e(arrayList0.size()));
        }

        private void j(Map map0, int v, int v1, int v2) {
            this.m(map0, v, this.f(this.l(map0, v1).b), v2, true);
        }

        protected void k(Map map0, int v, int v1, int v2) throws e {
            throw new b();
        }

        private d l(Map map0, int v) {
            return this.n(map0, v, true, true);
        }

        private d m(Map map0, int v, a[] arr_a, int v1, boolean z) {
            d a$d0 = this.n(map0, v, false, false);
            a$d0.b(arr_a, v1, z);
            return a$d0;
        }

        private d n(Map map0, int v, boolean z, boolean z1) {
            Integer integer0 = v;
            d a$d0 = (d)map0.get(integer0);
            if(a$d0 == null) {
                a$d0 = new d(v);
                map0.put(integer0, a$d0);
            }
            if(z) {
                if(a$d0.b == null) {
                    a$d0.b = this.h(v);
                }
                if(z1) {
                    ++a$d0.b.c;
                }
            }
            return a$d0;
        }

        private Map o(q q0, int v, int v1, A a0) throws e {
            q0.e();
            q0.H(v);
            Map map0 = new HashMap();
            while(true) {
                int v2 = 1;
                if(!q0.l()) {
                    break;
                }
                int v3 = q0.J();
                if(v3 >= v1) {
                    break;
                }
                int v4 = q0.f(v3);
                if(0x99 <= v4 && v4 <= 0xA6 || v4 == 0xC6 || v4 == 0xC7) {
                    d a$d0 = this.l(map0, q0.L(v3 + 1) + v3);
                    d a$d1 = this.l(map0, v3 + 3);
                    this.m(map0, v3, this.g(a$d0.b, a$d1.b), 3, false);
                }
                else if(0xA7 > v4 || v4 > 0xAB) {
                    if(0xAC > v4 || v4 > 0xB1) {
                        switch(v4) {
                            case 0xBF: {
                                break;
                            }
                            case 0xC4: {
                                if(q0.f(v3 + 1) != 0xA9) {
                                    continue;
                                }
                                this.m(map0, v3, null, 4, true);
                                continue;
                            }
                            case 200: {
                                this.j(map0, v3, q0.M(v3 + 1) + v3, 5);
                                continue;
                            }
                            case 201: {
                                this.k(map0, v3, q0.M(v3 + 1) + v3, 5);
                                continue;
                            }
                            default: {
                                continue;
                            }
                        }
                    }
                    this.m(map0, v3, null, 1, true);
                }
                else {
                    switch(v4) {
                        case 0xA7: {
                            this.j(map0, v3, q0.L(v3 + 1) + v3, 3);
                            break;
                        }
                        case 0xA8: {
                            this.k(map0, v3, q0.L(v3 + 1) + v3, 3);
                            break;
                        }
                        case 0xA9: {
                            this.m(map0, v3, null, 2, true);
                            break;
                        }
                        case 170: {
                            int v5 = q0.M((v3 & -4) + 12) - q0.M((v3 & -4) + 8);
                            a[] arr_a = this.e(v5 + 2);
                            arr_a[0] = this.l(map0, q0.M((v3 & -4) + 4) + v3).b;
                            int v6 = (v3 & -4) + 16;
                            int v7 = (v5 + 1) * 4 + v6;
                            while(v6 < v7) {
                                arr_a[v2] = this.l(map0, q0.M(v6) + v3).b;
                                v6 += 4;
                                ++v2;
                            }
                            this.m(map0, v3, arr_a, v7 - v3, true);
                            break;
                        }
                        case 0xAB: {
                            int v8 = q0.M((v3 & -4) + 8);
                            a[] arr_a1 = this.e(v8 + 1);
                            arr_a1[0] = this.l(map0, q0.M((v3 & -4) + 4) + v3).b;
                            int v9 = (v3 & -4) + 16;
                            int v10 = v8 * 8 + v9 - 4;
                            while(v9 < v10) {
                                arr_a1[v2] = this.l(map0, q0.M(v9) + v3).b;
                                v9 += 8;
                                ++v2;
                            }
                            this.m(map0, v3, arr_a1, v10 - v3, true);
                        }
                    }
                }
            }
            if(a0 != null) {
                int v11 = a0.p();
                while(true) {
                    --v11;
                    if(v11 < 0) {
                        break;
                    }
                    this.n(map0, a0.q(v11), true, false);
                    this.l(map0, a0.g(v11));
                }
            }
            return map0;
        }
    }

    static class d implements Comparable {
        int a;
        a b;
        a[] c;
        boolean d;
        int e;
        javassist.bytecode.stackmap.a.a f;

        d(int v) {
            this.a = v;
            this.b = null;
            this.c = null;
            this.d = false;
            this.e = 0;
            this.f = null;
        }

        public int a(d a$d0) {
            return a$d0 == null ? -1 : this.a - a$d0.a;
        }

        void b(a[] arr_a, int v, boolean z) {
            this.c = arr_a;
            this.e = v;
            this.d = z;
        }

        @Override
        public int compareTo(Object object0) {
            return this.a(((d)object0));
        }
    }

    protected int a;
    protected int b;
    protected int c;
    protected a[] d;
    protected boolean e;
    protected javassist.bytecode.stackmap.a.a f;

    protected a(int v) {
        this.a = v;
        this.b = 0;
        this.c = 0;
    }

    public static a a(a[] arr_a, int v) throws e {
        for(int v1 = 0; v1 < arr_a.length; ++v1) {
            a a0 = arr_a[v1];
            if(a0.a <= v && v < a0.a + a0.b) {
                return a0;
            }
        }
        throw new e("no basic block at " + v);
    }

    protected void b(StringBuffer stringBuffer0) {
        stringBuffer0.append("pos=");
        stringBuffer0.append(this.a);
        stringBuffer0.append(", len=");
        stringBuffer0.append(this.b);
        stringBuffer0.append(", in=");
        stringBuffer0.append(this.c);
        stringBuffer0.append(", exit{");
        a[] arr_a = this.d;
        if(arr_a != null) {
            for(int v = 0; v < arr_a.length; ++v) {
                stringBuffer0.append(arr_a[v].a);
                stringBuffer0.append(",");
            }
        }
        stringBuffer0.append("}, {");
        for(javassist.bytecode.stackmap.a.a a$a0 = this.f; a$a0 != null; a$a0 = a$a0.a) {
            stringBuffer0.append("(");
            stringBuffer0.append(a$a0.b.a);
            stringBuffer0.append(", ");
            stringBuffer0.append(a$a0.c);
            stringBuffer0.append("), ");
        }
        stringBuffer0.append("}");
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer0 = new StringBuffer();
        String s = this.getClass().getName();
        int v = s.lastIndexOf(46);
        if(v >= 0) {
            s = s.substring(v + 1);
        }
        stringBuffer0.append(s);
        stringBuffer0.append("[");
        this.b(stringBuffer0);
        stringBuffer0.append("]");
        return stringBuffer0.toString();
    }
}

