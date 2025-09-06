package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.deser.y;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.i;
import com.fasterxml.jackson.databind.jsontype.f;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.util.H;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class g {
    public static class a {
        private final m a;
        private final List b;
        private final Map c;

        protected a(m m0) {
            this.b = new ArrayList();
            this.c = new HashMap();
            this.a = m0;
        }

        private void a(String s, Integer integer0) {
            Object object0 = this.c.get(s);
            if(object0 == null) {
                this.c.put(s, integer0);
                return;
            }
            if(object0 instanceof List) {
                ((List)object0).add(integer0);
                return;
            }
            LinkedList linkedList0 = new LinkedList();
            linkedList0.add(object0);
            linkedList0.add(integer0);
            this.c.put(s, linkedList0);
        }

        public void b(y y0, f f0) {
            Integer integer0 = this.b.size();
            b g$b0 = new b(y0, f0);
            this.b.add(g$b0);
            this.a(y0.getName(), integer0);
            this.a(f0.i(), integer0);
        }

        public g c(c c0) {
            int v = this.b.size();
            b[] arr_g$b = new b[v];
            for(int v1 = 0; v1 < v; ++v1) {
                b g$b0 = (b)this.b.get(v1);
                y y0 = c0.p(g$b0.d());
                if(y0 != null) {
                    g$b0.g(y0);
                }
                arr_g$b[v1] = g$b0;
            }
            return new g(this.a, arr_g$b, this.c, null, null);
        }
    }

    static final class b {
        private final y a;
        private final f b;
        private final String c;
        private y d;

        public b(y y0, f f0) {
            this.a = y0;
            this.b = f0;
            this.c = f0.i();
        }

        public String a() {
            Class class0 = this.b.h();
            return class0 == null ? null : this.b.j().e(null, class0);
        }

        public y b() {
            return this.a;
        }

        public y c() {
            return this.d;
        }

        public String d() {
            return this.c;
        }

        public boolean e() {
            return this.b.l();
        }

        public boolean f(String s) {
            return s.equals(this.c);
        }

        public void g(y y0) {
            this.d = y0;
        }
    }

    private final m a;
    private final b[] b;
    private final Map c;
    private final String[] d;
    private final H[] e;

    protected g(g g0) {
        this.a = g0.a;
        this.b = g0.b;
        this.c = g0.c;
        this.d = new String[g0.b.length];
        this.e = new H[g0.b.length];
    }

    protected g(m m0, b[] arr_g$b, Map map0, String[] arr_s, H[] arr_h) {
        this.a = m0;
        this.b = arr_g$b;
        this.c = map0;
        this.d = arr_s;
        this.e = arr_h;
    }

    protected final Object a(n n0, h h0, int v, String s) throws IOException {
        n n1 = this.e[v].b5(n0);
        if(n1.m4() == r.v) {
            return null;
        }
        H h1 = h0.O(n0);
        h1.z4();
        h1.d(s);
        h1.T(n1);
        h1.n3();
        n n2 = h1.b5(n0);
        n2.m4();
        return this.b[v].b().q(n2, h0);
    }

    protected final void b(n n0, h h0, Object object0, int v, String s) throws IOException {
        if(s == null) {
            h0.Z0(this.a, "Internal error in external Type Id handling: `null` type id passed", new Object[0]);
        }
        n n1 = this.e[v].b5(n0);
        if(n1.m4() == r.v) {
            this.b[v].b().M(object0, null);
            return;
        }
        H h1 = h0.O(n0);
        h1.z4();
        h1.d(s);
        h1.T(n1);
        h1.n3();
        n n2 = h1.b5(n0);
        n2.m4();
        this.b[v].b().r(n2, h0, object0);
    }

    protected final Object c(n n0, h h0, int v, String s) throws IOException {
        H h1 = h0.O(n0);
        h1.z4();
        h1.d(s);
        h1.n3();
        n n1 = h1.b5(n0);
        n1.m4();
        return this.b[v].b().q(n1, h0);
    }

    private final boolean d(n n0, h h0, String s, Object object0, String s1, int v) throws IOException {
        if(!this.b[v].f(s)) {
            return false;
        }
        if(object0 != null && this.e[v] != null) {
            this.b(n0, h0, object0, v, s1);
            this.e[v] = null;
            return true;
        }
        this.d[v] = s1;
        return true;
    }

    public static a e(m m0) {
        return new a(m0);
    }

    public Object f(n n0, h h0, com.fasterxml.jackson.databind.deser.impl.y y0, v v0) throws IOException {
        Object[] arr_object = new Object[this.b.length];
        int v2 = 0;
        while(v2 < this.b.length) {
            String s = this.d[v2];
            b g$b0 = this.b[v2];
            if(s == null) {
                H h1 = this.e[v2];
                if(h1 != null && h1.g5() != r.v) {
                    if(g$b0.e()) {
                        s = g$b0.a();
                    }
                    else {
                        String s1 = g$b0.b().getName();
                        h0.d1(this.a, s1, "Missing external type id property \'%s\'", new Object[]{g$b0.d()});
                    }
                    goto label_14;
                }
            }
            else {
            label_14:
                if(this.e[v2] == null) {
                    if(h0.J0(i.p)) {
                        y y1 = g$b0.b();
                        String s2 = y1.getName();
                        String s3 = y1.getName();
                        h0.d1(this.a, s2, "Missing property \'%s\' for external type id \'%s\'", new Object[]{s3, this.b[v2].d()});
                    }
                    arr_object[v2] = this.c(n0, h0, v2, s);
                }
                else {
                    arr_object[v2] = this.a(n0, h0, v2, s);
                }
                y y2 = g$b0.b();
                if(y2.x() >= 0) {
                    y0.b(y2, arr_object[v2]);
                    y y3 = g$b0.c();
                    if(y3 != null && y3.x() >= 0) {
                        if(!y3.getType().j(String.class)) {
                            H h2 = h0.O(n0);
                            h2.d(s);
                            s = y3.E().g(h2.e5(), h0);
                            h2.close();
                        }
                        y0.b(y3, s);
                    }
                }
            }
            ++v2;
        }
        Object object0 = v0.a(h0, y0);
        for(int v1 = 0; v1 < this.b.length; ++v1) {
            y y4 = this.b[v1].b();
            if(y4.x() < 0) {
                y4.M(object0, arr_object[v1]);
            }
        }
        return object0;
    }

    public Object g(n n0, h h0, Object object0) throws IOException {
        for(int v = 0; v < this.b.length; ++v) {
            String s = this.d[v];
            b g$b0 = this.b[v];
            if(s == null) {
                H h1 = this.e[v];
                if(h1 != null) {
                    if(h1.g5().g()) {
                        n n1 = h1.b5(n0);
                        n1.m4();
                        y y0 = g$b0.b();
                        Object object1 = f.a(n1, h0, y0.getType());
                        if(object1 != null) {
                            y0.M(object0, object1);
                            continue;
                        }
                    }
                    if(g$b0.e()) {
                        s = g$b0.a();
                        if(s == null) {
                            String s2 = g$b0.b().getName();
                            h0.d1(this.a, s2, "Invalid default type id for property \'%s\': `null` returned by TypeIdResolver", new Object[]{g$b0.d()});
                        }
                    }
                    else {
                        String s1 = g$b0.b().getName();
                        h0.d1(this.a, s1, "Missing external type id property \'%s\' (and no \'defaultImpl\' specified)", new Object[]{g$b0.d()});
                    }
                    this.b(n0, h0, object0, v, s);
                }
            }
            else {
                if(this.e[v] == null) {
                    y y1 = g$b0.b();
                    if(y1.c() || h0.J0(i.p)) {
                        h0.e1(object0.getClass(), y1.getName(), "Missing property \'%s\' for external type id \'%s\'", new Object[]{y1.getName(), g$b0.d()});
                    }
                    return object0;
                }
                this.b(n0, h0, object0, v, s);
            }
        }
        return object0;
    }

    public boolean h(n n0, h h0, String s, Object object0) throws IOException {
        Object object1 = this.c.get(s);
        if(object1 == null) {
            return false;
        }
        if(object1 instanceof List) {
            Iterator iterator0 = ((List)object1).iterator();
            Object object2 = iterator0.next();
            if(this.b[((int)(((Integer)object2)))].f(s)) {
                String s1 = n0.R2();
                n0.I4();
                this.d[((int)(((Integer)object2)))] = s1;
                while(iterator0.hasNext()) {
                    Object object3 = iterator0.next();
                    this.d[((int)(((Integer)object3)))] = s1;
                }
                return true;
            }
            H h1 = h0.M(n0);
            this.e[((int)(((Integer)object2)))] = h1;
            while(iterator0.hasNext()) {
                Object object4 = iterator0.next();
                this.e[((int)(((Integer)object4)))] = h1;
            }
            return true;
        }
        int v = (int)(((Integer)object1));
        if(this.b[v].f(s)) {
            this.d[v] = n0.F3();
            n0.I4();
            if(object0 != null && this.e[v] != null) {
                goto label_30;
            }
        }
        else {
            this.e[v] = h0.M(n0);
            if(object0 != null && this.d[v] != null) {
            label_30:
                String s2 = this.d[v];
                this.d[v] = null;
                this.b(n0, h0, object0, v, s2);
                this.e[v] = null;
            }
        }
        return true;
    }

    public boolean i(n n0, h h0, String s, Object object0) throws IOException {
        Object object1 = this.c.get(s);
        boolean z = false;
        if(object1 == null) {
            return false;
        }
        String s1 = n0.R2();
        if(object1 instanceof List) {
            for(Object object2: ((List)object1)) {
                if(this.d(n0, h0, s, object0, s1, ((int)(((Integer)object2))))) {
                    z = true;
                }
            }
            return z;
        }
        return this.d(n0, h0, s, object0, s1, ((int)(((Integer)object1))));
    }

    public g j() {
        return new g(this);
    }
}

