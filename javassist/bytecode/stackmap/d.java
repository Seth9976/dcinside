package javassist.bytecode.stackmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javassist.E;
import javassist.bytecode.e;
import javassist.bytecode.t;
import javassist.bytecode.w;
import javassist.g;
import javassist.l;

public abstract class d {
    public static abstract class a extends d {
        @Override  // javassist.bytecode.stackmap.d
        public boolean g(d d0) {
            return this.i().equals(d0.i());
        }

        @Override  // javassist.bytecode.stackmap.d
        public int j(t t0) {
            return t0.a(this.i());
        }

        @Override  // javassist.bytecode.stackmap.d
        public int k() {
            return 7;
        }

        public abstract void v(d arg1);
    }

    public static class b extends a {
        private a a;

        private b(a d$a0) {
            this.a = d$a0;
        }

        @Override  // javassist.bytecode.stackmap.d
        public int e(List list0, int v, g g0) throws E {
            return this.a.e(list0, v, g0);
        }

        @Override  // javassist.bytecode.stackmap.d
        public d h(int v) throws E {
            return this.a.h(v - 1);
        }

        @Override  // javassist.bytecode.stackmap.d
        public String i() {
            return b.z(this.a.i());
        }

        @Override  // javassist.bytecode.stackmap.d
        public boolean l() {
            return false;
        }

        @Override  // javassist.bytecode.stackmap.d
        public javassist.bytecode.stackmap.d.d m() {
            return null;
        }

        @Override  // javassist.bytecode.stackmap.d
        public void r(String s, g g0) throws e {
            this.a.r(c.y(s), g0);
        }

        @Override  // javassist.bytecode.stackmap.d
        String t(Set set0) {
            return "*" + this.a.t(set0);
        }

        @Override  // javassist.bytecode.stackmap.d
        protected javassist.bytecode.stackmap.d.g u(int v) {
            return this.a.u(v - 1);
        }

        @Override  // javassist.bytecode.stackmap.d$a
        public void v(d d0) {
            try {
                if(!d0.n()) {
                    this.a.v(c.x(d0));
                }
            }
            catch(e e0) {
                throw new RuntimeException("fatal: " + e0);
            }
        }

        public a x() {
            return this.a;
        }

        public static d y(d d0) throws e {
            if(d0 instanceof c) {
                return ((c)d0).w();
            }
            if(d0 instanceof a) {
                return new b(((a)d0));
            }
            if(!(d0 instanceof javassist.bytecode.stackmap.d.e) || d0.n()) {
                throw new e("bad AASTORE: " + d0);
            }
            return new javassist.bytecode.stackmap.d.e(b.z(d0.i()));
        }

        private static String z(String s) {
            if(s.length() > 1 && s.charAt(0) == 91) {
                int v = s.charAt(1);
                if(v == 76) {
                    return s.substring(2, s.length() - 1).replace('/', '.');
                }
                return v == 91 ? s.substring(1) : "java.lang.Object";
            }
            return "java.lang.Object";
        }
    }

    public static class c extends a {
        private a a;

        private c(a d$a0) {
            this.a = d$a0;
        }

        @Override  // javassist.bytecode.stackmap.d
        public int e(List list0, int v, g g0) throws E {
            return this.a.e(list0, v, g0);
        }

        @Override  // javassist.bytecode.stackmap.d
        public d h(int v) throws E {
            return this.a.h(v + 1);
        }

        @Override  // javassist.bytecode.stackmap.d
        public String i() {
            return c.y(this.a.i());
        }

        @Override  // javassist.bytecode.stackmap.d
        public boolean l() {
            return false;
        }

        @Override  // javassist.bytecode.stackmap.d
        public javassist.bytecode.stackmap.d.d m() {
            return null;
        }

        @Override  // javassist.bytecode.stackmap.d
        public void r(String s, g g0) throws e {
            this.a.r(b.z(s), g0);
        }

        @Override  // javassist.bytecode.stackmap.d
        String t(Set set0) {
            return "[" + this.a.t(set0);
        }

        @Override  // javassist.bytecode.stackmap.d
        protected javassist.bytecode.stackmap.d.g u(int v) {
            return this.a.u(v + 1);
        }

        @Override  // javassist.bytecode.stackmap.d$a
        public void v(d d0) {
            try {
                if(!d0.n()) {
                    this.a.v(b.y(d0));
                }
            }
            catch(e e0) {
                throw new RuntimeException("fatal: " + e0);
            }
        }

        public a w() {
            return this.a;
        }

        static d x(d d0) throws e {
            if(d0 instanceof b) {
                return ((b)d0).x();
            }
            if(d0 instanceof a) {
                return new c(((a)d0));
            }
            if(!(d0 instanceof javassist.bytecode.stackmap.d.e) || d0.n()) {
                throw new e("bad AASTORE: " + d0);
            }
            return new javassist.bytecode.stackmap.d.e(c.y(d0.i()));
        }

        public static String y(String s) {
            return s.charAt(0) == 91 ? "[" + s : "[L" + s.replace('.', '/') + ";";
        }
    }

    public static class javassist.bytecode.stackmap.d.d extends d {
        private String a;
        private int b;
        private char c;

        public javassist.bytecode.stackmap.d.d(String s, int v, char c) {
            this.a = s;
            this.b = v;
            this.c = c;
        }

        @Override  // javassist.bytecode.stackmap.d
        public boolean g(d d0) {
            return this == d0;
        }

        @Override  // javassist.bytecode.stackmap.d
        public d h(int v) throws E {
            if(this == javassist.bytecode.stackmap.e.b) {
                return this;
            }
            if(v < 0) {
                throw new E("no element type: " + this.a);
            }
            if(v == 0) {
                return this;
            }
            char[] arr_c = new char[v + 1];
            for(int v1 = 0; v1 < v; ++v1) {
                arr_c[v1] = '[';
            }
            arr_c[v] = this.c;
            return new javassist.bytecode.stackmap.d.e(new String(arr_c));
        }

        @Override  // javassist.bytecode.stackmap.d
        public String i() {
            return this.a;
        }

        @Override  // javassist.bytecode.stackmap.d
        public int j(t t0) {
            return 0;
        }

        @Override  // javassist.bytecode.stackmap.d
        public int k() {
            return this.b;
        }

        @Override  // javassist.bytecode.stackmap.d
        public boolean l() {
            return this.b == 3 || this.b == 4;
        }

        @Override  // javassist.bytecode.stackmap.d
        public javassist.bytecode.stackmap.d.d m() {
            return this;
        }

        @Override  // javassist.bytecode.stackmap.d
        public d p() {
            return this == javassist.bytecode.stackmap.e.b ? this : super.p();
        }

        @Override  // javassist.bytecode.stackmap.d
        public void r(String s, g g0) throws e {
            throw new e("conflict: " + this.a + " and " + s);
        }

        @Override  // javassist.bytecode.stackmap.d
        String t(Set set0) {
            return this.a;
        }

        public char w() {
            return this.c;
        }
    }

    public static class javassist.bytecode.stackmap.d.e extends d {
        private String a;

        public javassist.bytecode.stackmap.d.e(String s) {
            this.a = s;
        }

        @Override  // javassist.bytecode.stackmap.d
        public boolean g(d d0) {
            return this.a.equals(d0.i());
        }

        @Override  // javassist.bytecode.stackmap.d
        public d h(int v) throws E {
            if(v == 0) {
                return this;
            }
            if(v > 0) {
                char[] arr_c = new char[v];
                for(int v2 = 0; v2 < v; ++v2) {
                    arr_c[v2] = '[';
                }
                String s = this.i();
                return new javassist.bytecode.stackmap.d.e(new String(arr_c) + (s.charAt(0) == 91 ? this.i() : "L" + s.replace('.', '/') + ";"));
            }
            for(int v1 = 0; v1 < -v; ++v1) {
                if(this.a.charAt(v1) != 91) {
                    throw new E("no " + v + " dimensional array type: " + this.i());
                }
            }
            int v3 = this.a.charAt(-v);
            if(v3 == 91) {
                return new javassist.bytecode.stackmap.d.e(this.a.substring(-v));
            }
            if(v3 == 76) {
                return new javassist.bytecode.stackmap.d.e(this.a.substring(1 - v, this.a.length() - 1).replace('/', '.'));
            }
            d d0 = javassist.bytecode.stackmap.e.e;
            if(v3 == ((javassist.bytecode.stackmap.d.d)d0).c) {
                return d0;
            }
            d d1 = javassist.bytecode.stackmap.e.d;
            if(v3 == ((javassist.bytecode.stackmap.d.d)d1).c) {
                return d1;
            }
            d d2 = javassist.bytecode.stackmap.e.f;
            return v3 == ((javassist.bytecode.stackmap.d.d)d2).c ? d2 : javassist.bytecode.stackmap.e.c;
        }

        @Override  // javassist.bytecode.stackmap.d
        public String i() {
            return this.a;
        }

        @Override  // javassist.bytecode.stackmap.d
        public int j(t t0) {
            return t0.a(this.i());
        }

        @Override  // javassist.bytecode.stackmap.d
        public int k() {
            return 7;
        }

        @Override  // javassist.bytecode.stackmap.d
        public boolean l() {
            return false;
        }

        @Override  // javassist.bytecode.stackmap.d
        public javassist.bytecode.stackmap.d.d m() {
            return null;
        }

        @Override  // javassist.bytecode.stackmap.d
        public void r(String s, g g0) throws e {
        }

        @Override  // javassist.bytecode.stackmap.d
        String t(Set set0) {
            return this.a;
        }
    }

    public static class f extends javassist.bytecode.stackmap.d.e {
        public f() {
            super("null-type");
        }

        @Override  // javassist.bytecode.stackmap.d$e
        public d h(int v) {
            return this;
        }

        @Override  // javassist.bytecode.stackmap.d$e
        public int j(t t0) {
            return 0;
        }

        @Override  // javassist.bytecode.stackmap.d$e
        public int k() {
            return 5;
        }

        @Override  // javassist.bytecode.stackmap.d
        public boolean n() {
            return true;
        }
    }

    public static class javassist.bytecode.stackmap.d.g extends a {
        protected List a;
        protected List b;
        protected List c;
        protected String d;
        private boolean e;
        private int f;
        private int g;
        private boolean h;
        private int i;

        public javassist.bytecode.stackmap.d.g(d d0) {
            this.f = 0;
            this.g = 0;
            this.h = false;
            this.i = 0;
            this.c = null;
            this.a = new ArrayList(2);
            this.b = new ArrayList(2);
            this.v(d0);
            this.d = null;
            this.e = d0.l();
        }

        private static boolean A(l l0) throws E {
            return l0.k0() && l0.x().c0() == null;
        }

        @Override  // javassist.bytecode.stackmap.d
        public int e(List list0, int v, g g0) throws E {
            if(this.f > 0) {
                return v;
            }
            int v1 = v + 1;
            this.g = v1;
            this.f = v1;
            list0.add(this);
            this.h = true;
            int v2 = this.a.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                javassist.bytecode.stackmap.d.g d$g0 = ((d)this.a.get(v3)).u(this.i);
                if(d$g0 != null) {
                    int v4 = d$g0.f;
                    if(v4 == 0) {
                        v1 = d$g0.e(list0, v1, g0);
                        int v5 = d$g0.g;
                        if(v5 < this.g) {
                            this.g = v5;
                        }
                    }
                    else if(d$g0.h && v4 < this.g) {
                        this.g = v4;
                    }
                }
            }
            if(this.f == this.g) {
                ArrayList arrayList0 = new ArrayList();
                do {
                    javassist.bytecode.stackmap.d.g d$g1 = (javassist.bytecode.stackmap.d.g)list0.remove(list0.size() - 1);
                    d$g1.h = false;
                    arrayList0.add(d$g1);
                }
                while(d$g1 != this);
                this.x(arrayList0, g0);
            }
            return v1;
        }

        @Override  // javassist.bytecode.stackmap.d
        public d h(int v) throws E {
            if(v == 0) {
                return this;
            }
            javassist.bytecode.stackmap.d.d d$d0 = this.m();
            if(d$d0 == null) {
                return this.n() ? new f() : new javassist.bytecode.stackmap.d.e(this.i()).h(v);
            }
            return d$d0.h(v);
        }

        @Override  // javassist.bytecode.stackmap.d
        public String i() {
            return this.d == null ? ((d)this.a.get(0)).i() : this.d;
        }

        @Override  // javassist.bytecode.stackmap.d$a
        public int j(t t0) {
            return this.d == null ? ((d)this.a.get(0)).j(t0) : super.j(t0);
        }

        @Override  // javassist.bytecode.stackmap.d$a
        public int k() {
            return this.d == null ? ((d)this.a.get(0)).k() : super.k();
        }

        @Override  // javassist.bytecode.stackmap.d
        public boolean l() {
            return this.d == null ? this.e : false;
        }

        @Override  // javassist.bytecode.stackmap.d
        public javassist.bytecode.stackmap.d.d m() {
            return this.d == null ? ((d)this.a.get(0)).m() : null;
        }

        @Override  // javassist.bytecode.stackmap.d
        public boolean n() {
            return this.d == null ? ((d)this.a.get(0)).n() : false;
        }

        @Override  // javassist.bytecode.stackmap.d
        public boolean o() {
            return this.d == null ? ((d)this.a.get(0)).o() : false;
        }

        @Override  // javassist.bytecode.stackmap.d
        public void r(String s, g g0) throws e {
            if(this.c == null) {
                this.c = new ArrayList();
            }
            this.c.add(s);
        }

        @Override  // javassist.bytecode.stackmap.d
        String t(Set set0) {
            set0.add(this);
            if(this.a.size() > 0) {
                d d0 = (d)this.a.get(0);
                return d0 == null || set0.contains(d0) ? "?" : d0.t(set0);
            }
            return "?";
        }

        @Override  // javassist.bytecode.stackmap.d
        protected javassist.bytecode.stackmap.d.g u(int v) {
            this.i = v;
            return this;
        }

        @Override  // javassist.bytecode.stackmap.d$a
        public void v(d d0) {
            this.a.add(d0);
            if(d0 instanceof javassist.bytecode.stackmap.d.g) {
                ((javassist.bytecode.stackmap.d.g)d0).b.add(this);
            }
        }

        private l w(List list0, g g0, Set set0, l l0) throws E {
            if(list0 == null) {
                return l0;
            }
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                javassist.bytecode.stackmap.d.g d$g0 = (javassist.bytecode.stackmap.d.g)list0.get(v1);
                if(!set0.add(d$g0)) {
                    return l0;
                }
                List list1 = d$g0.c;
                if(list1 != null) {
                    int v2 = list1.size();
                    for(int v3 = 0; v3 < v2; ++v3) {
                        l l1 = g0.s(((String)d$g0.c.get(v3)));
                        if(l1.K0(l0)) {
                            l0 = l1;
                        }
                    }
                }
                l0 = this.w(d$g0.b, g0, set0, l0);
            }
            return l0;
        }

        private void x(List list0, g g0) throws E {
            HashSet hashSet0 = new HashSet();
            int v = list0.size();
            d d0 = null;
            int v1 = 0;
            boolean z = false;
            while(v1 < v) {
                javassist.bytecode.stackmap.d.g d$g0 = (javassist.bytecode.stackmap.d.g)list0.get(v1);
                List list1 = d$g0.a;
                int v2 = list1.size();
                int v3 = 0;
                while(v3 < v2) {
                    d d1 = ((d)list1.get(v3)).h(d$g0.i);
                    javassist.bytecode.stackmap.d.d d$d0 = d1.m();
                    if(d0 == null) {
                        if(d$d0 != null) {
                        }
                        else if(d1.o()) {
                            d0 = d1;
                            z = false;
                            break;
                        }
                        else {
                            d0 = d1;
                            z = false;
                            goto label_29;
                        }
                        d0 = d$d0;
                        z = true;
                    }
                    else if(d$d0 == null && z || d$d0 != null && d0 != d$d0) {
                        d0 = javassist.bytecode.stackmap.e.b;
                        z = true;
                        break;
                    }
                label_29:
                    if(d$d0 == null && !d1.n()) {
                        hashSet0.add(d1.i());
                    }
                    ++v3;
                }
                ++v1;
            }
            if(z) {
                this.e = d0.l();
                this.y(list0, d0);
                return;
            }
            this.y(list0, new javassist.bytecode.stackmap.d.e(this.z(list0, hashSet0, g0)));
        }

        private void y(List list0, d d0) throws E {
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                javassist.bytecode.stackmap.d.g d$g0 = (javassist.bytecode.stackmap.d.g)list0.get(v1);
                d d1 = d0.h(-d$g0.i);
                if(d1.m() == null) {
                    d$g0.d = d1.i();
                }
                else {
                    d$g0.a.clear();
                    d$g0.a.add(d1);
                    d$g0.e = d1.l();
                }
            }
        }

        private String z(List list0, Set set0, g g0) throws E {
            Iterator iterator0 = set0.iterator();
            if(set0.size() == 0) {
                return null;
            }
            if(set0.size() == 1) {
                return iterator0.next();
            }
            Object object1 = iterator0.next();
            l l0;
            for(l0 = g0.s(((String)object1)); iterator0.hasNext(); l0 = d.c(l0, g0.s(((String)object2)))) {
                Object object2 = iterator0.next();
            }
            if(l0.c0() == null || javassist.bytecode.stackmap.d.g.A(l0)) {
                l0 = this.w(list0, g0, new HashSet(), l0);
            }
            return l0.k0() ? w.C(l0) : l0.X();
        }
    }

    public static class h extends javassist.bytecode.stackmap.d.e {
        int b;
        boolean c;

        h(int v, String s) {
            super(s);
            this.b = v;
            this.c = false;
        }

        @Override  // javassist.bytecode.stackmap.d
        public void d(int v) {
            if(v == this.b) {
                this.c = true;
            }
        }

        // 去混淆评级： 低(20)
        @Override  // javassist.bytecode.stackmap.d$e
        public boolean g(d d0) {
            return d0 instanceof h && this.b == ((h)d0).b && this.i().equals(((h)d0).i());
        }

        @Override  // javassist.bytecode.stackmap.d$e
        public int j(t t0) {
            return this.b;
        }

        @Override  // javassist.bytecode.stackmap.d$e
        public int k() {
            return 8;
        }

        @Override  // javassist.bytecode.stackmap.d
        public boolean o() {
            return true;
        }

        @Override  // javassist.bytecode.stackmap.d
        public d p() {
            return this.c ? new javassist.bytecode.stackmap.d.g(new javassist.bytecode.stackmap.d.e(this.i())) : new j(this.v());
        }

        @Override  // javassist.bytecode.stackmap.d$e
        String t(Set set0) {
            return this.i() + "," + this.b;
        }

        public h v() {
            return new h(this.b, this.i());
        }

        public int w() {
            return this.b;
        }
    }

    public static class i extends h {
        i(String s) {
            super(-1, s);
        }

        @Override  // javassist.bytecode.stackmap.d$h
        public int j(t t0) {
            return 0;
        }

        @Override  // javassist.bytecode.stackmap.d$h
        public int k() {
            return 6;
        }

        @Override  // javassist.bytecode.stackmap.d$h
        String t(Set set0) {
            return "uninit:this";
        }

        @Override  // javassist.bytecode.stackmap.d$h
        public h v() {
            return new i(this.i());
        }
    }

    public static class j extends a {
        protected d a;

        public j(h d$h0) {
            this.a = d$h0;
        }

        @Override  // javassist.bytecode.stackmap.d
        public void d(int v) {
            this.a.d(v);
        }

        @Override  // javassist.bytecode.stackmap.d$a
        public boolean g(d d0) {
            return this.a.g(d0);
        }

        @Override  // javassist.bytecode.stackmap.d
        public d h(int v) throws E {
            return this.a.h(v);
        }

        @Override  // javassist.bytecode.stackmap.d
        public String i() {
            return this.a.i();
        }

        @Override  // javassist.bytecode.stackmap.d$a
        public int j(t t0) {
            return this.a.j(t0);
        }

        @Override  // javassist.bytecode.stackmap.d$a
        public int k() {
            return this.a.k();
        }

        @Override  // javassist.bytecode.stackmap.d
        public boolean l() {
            return this.a.l();
        }

        @Override  // javassist.bytecode.stackmap.d
        public javassist.bytecode.stackmap.d.d m() {
            return this.a.m();
        }

        @Override  // javassist.bytecode.stackmap.d
        public boolean o() {
            return this.a.o();
        }

        @Override  // javassist.bytecode.stackmap.d
        public d p() {
            return this.a.p();
        }

        @Override  // javassist.bytecode.stackmap.d
        public void r(String s, g g0) throws e {
            this.a.r(s, g0);
        }

        @Override  // javassist.bytecode.stackmap.d
        String t(Set set0) {
            return "";
        }

        @Override  // javassist.bytecode.stackmap.d
        protected javassist.bytecode.stackmap.d.g u(int v) {
            return null;
        }

        @Override  // javassist.bytecode.stackmap.d$a
        public void v(d d0) {
            if(!d0.g(this.a)) {
                this.a = javassist.bytecode.stackmap.e.b;
            }
        }

        public int w() {
            d d0 = this.a;
            if(!(d0 instanceof h)) {
                throw new RuntimeException("not available");
            }
            return ((h)d0).b;
        }
    }

    public static void a(d d0, d d1, g g0) throws e {
        if(d0 instanceof a && !d1.n()) {
            ((a)d0).v(c.x(d1));
        }
        if(d1 instanceof a) {
            if(d0 instanceof a) {
                b.y(d0);
                return;
            }
            if(!(d0 instanceof javassist.bytecode.stackmap.d.e)) {
                throw new e("bad AASTORE: " + d0);
            }
            if(!d0.n()) {
                d1.r(b.z(d0.i()), g0);
            }
        }
    }

    public static l b(l l0, l l1) throws E {
        l l2 = l0;
        for(l l3 = l1; true; l3 = l5) {
            if(d.f(l2, l3) && l2.c0() != null) {
                return l2;
            }
            l l4 = l2.c0();
            l l5 = l3.c0();
            if(l5 == null) {
                break;
            }
            if(l4 == null) {
                l2 = l3;
                l l6 = l1;
                l1 = l0;
                l0 = l6;
                break;
            }
            l2 = l4;
        }
        while(true) {
            l2 = l2.c0();
            if(l2 == null) {
                break;
            }
            l0 = l0.c0();
        }
        while(!d.f(l0, l1)) {
            l0 = l0.c0();
            l1 = l1.c0();
        }
        return l0;
    }

    public static l c(l l0, l l1) throws E {
        String s = "java.lang.Object";
        if(l0 == l1) {
            return l0;
        }
        if(l0.k0() && l1.k0()) {
            l l2 = l0.x();
            l l3 = l1.x();
            l l4 = d.c(l2, l3);
            if(l4 == l2) {
                return l0;
            }
            if(l4 == l3) {
                return l1;
            }
            g g0 = l0.w();
            if(l4 != null) {
                s = l4.X() + "[]";
            }
            return g0.s(s);
        }
        if(!l0.p0() && !l1.p0()) {
            return l0.k0() || l1.k0() ? l0.w().s("java.lang.Object") : d.b(l0, l1);
        }
        return null;
    }

    public void d(int v) {
    }

    public int e(List list0, int v, g g0) throws E {
        return v;
    }

    // 去混淆评级： 低(20)
    static boolean f(l l0, l l1) {
        return l0 == l1 || l0 != null && l1 != null && l0.X().equals(l1.X());
    }

    public abstract boolean g(d arg1);

    public abstract d h(int arg1) throws E;

    public abstract String i();

    public abstract int j(t arg1);

    public abstract int k();

    public abstract boolean l();

    public abstract javassist.bytecode.stackmap.d.d m();

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public d p() {
        return new javassist.bytecode.stackmap.d.g(this);
    }

    public static d[] q(int v) {
        d[] arr_d = new d[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_d[v1] = javassist.bytecode.stackmap.e.b;
        }
        return arr_d;
    }

    public abstract void r(String arg1, g arg2) throws e;

    private static void s(d d0, String s, g g0) throws e {
        d0.r(s, g0);
    }

    abstract String t(Set arg1);

    @Override
    public String toString() {
        return super.toString() + "(" + this.t(new HashSet()) + ")";
    }

    protected javassist.bytecode.stackmap.d.g u(int v) {
        return null;
    }
}

