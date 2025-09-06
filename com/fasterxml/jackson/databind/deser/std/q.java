package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.x;
import com.fasterxml.jackson.databind.annotation.b;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.deser.j;
import com.fasterxml.jackson.databind.deser.w;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.i;
import com.fasterxml.jackson.databind.jsontype.f;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.type.q;
import com.fasterxml.jackson.databind.util.A;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@b
public class Q extends D implements j, w {
    @b
    @Deprecated
    public static class a extends D {
        protected final boolean f;
        private static final long g = 1L;
        public static final a h;

        static {
            a.h = new a();
        }

        public a() {
            this(false);
        }

        protected a(boolean z) {
            super(Object.class);
            this.f = z;
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object g(n n0, h h0) throws IOException {
            switch(n0.d0()) {
                case 1: {
                    if(n0.m4() == r.l) {
                        return new LinkedHashMap(2);
                    }
                    break;
                }
                case 2: {
                    return new LinkedHashMap(2);
                }
                case 3: {
                    if(n0.m4() == r.n) {
                        return h0.J0(i.f) ? Q.n : new ArrayList(2);
                    }
                    return h0.J0(i.f) ? this.v1(n0, h0) : this.u1(n0, h0);
                }
                case 5: {
                    break;
                }
                case 6: {
                    return n0.R2();
                }
                case 7: {
                    return h0.E0(D.d) ? this.P(n0, h0) : n0.j2();
                }
                case 8: {
                    return h0.J0(i.c) ? n0.i1() : n0.j2();
                }
                case 9: {
                    return true;
                }
                case 10: {
                    return false;
                }
                case 11: {
                    return null;
                }
                case 12: {
                    return n0.l1();
                }
                default: {
                    return h0.v0(Object.class, n0);
                }
            }
            return this.w1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object h(n n0, h h0, Object object0) throws IOException {
            if(this.f) {
                return this.g(n0, h0);
            }
            switch(n0.d0()) {
                case 1: {
                    if(n0.m4() == r.l) {
                        return object0;
                    }
                    goto label_12;
                }
                case 3: {
                    if(n0.m4() == r.n) {
                        return object0;
                    }
                    if(object0 instanceof Collection) {
                        while(true) {
                            ((Collection)object0).add(this.g(n0, h0));
                            if(n0.m4() != r.n) {
                                continue;
                            }
                            return object0;
                        }
                    }
                    break;
                }
                case 2: 
                case 4: {
                    return object0;
                }
                case 5: {
                label_12:
                    if(object0 instanceof Map) {
                        String s = n0.T();
                        do {
                            n0.m4();
                            Object object1 = ((Map)object0).get(s);
                            Object object2 = object1 == null ? this.g(n0, h0) : this.h(n0, h0, object1);
                            if(object2 != object1) {
                                ((Map)object0).put(s, object2);
                            }
                            s = n0.h4();
                        }
                        while(s != null);
                        return object0;
                    }
                    break;
                }
                default: {
                    return this.g(n0, h0);
                }
            }
            return this.g(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.D
        public Object i(n n0, h h0, f f0) throws IOException {
            int v = n0.d0();
            if(v != 1 && v != 3) {
                switch(v) {
                    case 5: {
                        break;
                    }
                    case 6: {
                        return n0.R2();
                    }
                    case 7: {
                        return h0.J0(i.d) ? n0.x0() : n0.j2();
                    }
                    case 8: {
                        return h0.J0(i.c) ? n0.i1() : n0.j2();
                    }
                    case 9: {
                        return true;
                    }
                    case 10: {
                        return false;
                    }
                    case 11: {
                        return null;
                    }
                    case 12: {
                        return n0.l1();
                    }
                    default: {
                        return h0.v0(Object.class, n0);
                    }
                }
            }
            return f0.c(n0, h0);
        }

        protected Object r1(n n0, h h0, Map map0, String s, Object object0, Object object1, String s1) throws IOException {
            boolean z = h0.I0(x.c);
            if(z) {
                this.s1(map0, s, object0, object1);
            }
            while(s1 != null) {
                n0.m4();
                Object object2 = this.g(n0, h0);
                Object object3 = map0.put(s1, object2);
                if(object3 != null && z) {
                    this.s1(map0, s1, object3, object2);
                }
                s1 = n0.h4();
            }
            return map0;
        }

        private void s1(Map map0, String s, Object object0, Object object1) {
            if(object0 instanceof List) {
                ((List)object0).add(object1);
                map0.put(s, object0);
                return;
            }
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(object0);
            arrayList0.add(object1);
            map0.put(s, arrayList0);
        }

        // 去混淆评级： 低(20)
        public static a t1(boolean z) {
            return z ? new a(true) : a.h;
        }

        protected Object u1(n n0, h h0) throws IOException {
            Object object0 = this.g(n0, h0);
            if(n0.m4() == r.n) {
                ArrayList arrayList0 = new ArrayList(2);
                arrayList0.add(object0);
                return arrayList0;
            }
            A a0 = h0.L0();
            Object[] arr_object = a0.i();
            arr_object[0] = object0;
            int v = 1;
            int v1;
            for(v1 = 1; true; ++v1) {
                Object object1 = this.g(n0, h0);
                ++v;
                if(v1 >= arr_object.length) {
                    arr_object = a0.c(arr_object);
                    v1 = 0;
                }
                arr_object[v1] = object1;
                if(n0.m4() == r.n) {
                    break;
                }
            }
            ArrayList arrayList1 = new ArrayList(v);
            a0.e(arr_object, v1 + 1, arrayList1);
            h0.k1(a0);
            return arrayList1;
        }

        protected Object[] v1(n n0, h h0) throws IOException {
            A a0 = h0.L0();
            Object[] arr_object = a0.i();
            int v;
            for(v = 0; true; ++v) {
                Object object0 = this.g(n0, h0);
                if(v >= arr_object.length) {
                    arr_object = a0.c(arr_object);
                    v = 0;
                }
                arr_object[v] = object0;
                if(n0.m4() == r.n) {
                    break;
                }
            }
            Object[] arr_object1 = a0.f(arr_object, v + 1);
            h0.k1(a0);
            return arr_object1;
        }

        @Override  // com.fasterxml.jackson.databind.n
        public com.fasterxml.jackson.databind.type.h w() {
            return com.fasterxml.jackson.databind.type.h.e;
        }

        protected Object w1(n n0, h h0) throws IOException {
            String s = n0.T();
            n0.m4();
            Object object0 = this.g(n0, h0);
            String s1 = n0.h4();
            if(s1 == null) {
                LinkedHashMap linkedHashMap0 = new LinkedHashMap(2);
                linkedHashMap0.put(s, object0);
                return linkedHashMap0;
            }
            LinkedHashMap linkedHashMap1 = new LinkedHashMap();
            linkedHashMap1.put(s, object0);
            String s2 = s1;
            do {
                n0.m4();
                Object object1 = this.g(n0, h0);
                Object object2 = linkedHashMap1.put(s2, object1);
                if(object2 != null) {
                    return this.r1(n0, h0, linkedHashMap1, s2, object2, object1, n0.h4());
                }
                s2 = n0.h4();
            }
            while(s2 != null);
            return linkedHashMap1;
        }

        // 去混淆评级： 低(20)
        @Override  // com.fasterxml.jackson.databind.n
        public Boolean y(g g0) {
            return this.f ? false : null;
        }
    }

    protected com.fasterxml.jackson.databind.n f;
    protected com.fasterxml.jackson.databind.n g;
    protected com.fasterxml.jackson.databind.n h;
    protected com.fasterxml.jackson.databind.n i;
    protected m j;
    protected m k;
    protected final boolean l;
    private static final long m = 1L;
    protected static final Object[] n;

    static {
        Q.n = new Object[0];
    }

    @Deprecated
    public Q() {
        this(null, null);
    }

    public Q(Q q0, com.fasterxml.jackson.databind.n n0, com.fasterxml.jackson.databind.n n1, com.fasterxml.jackson.databind.n n2, com.fasterxml.jackson.databind.n n3) {
        super(Object.class);
        this.f = n0;
        this.g = n1;
        this.h = n2;
        this.i = n3;
        this.j = q0.j;
        this.k = q0.k;
        this.l = q0.l;
    }

    protected Q(Q q0, boolean z) {
        super(Object.class);
        this.f = q0.f;
        this.g = q0.g;
        this.h = q0.h;
        this.i = q0.i;
        this.j = q0.j;
        this.k = q0.k;
        this.l = z;
    }

    public Q(m m0, m m1) {
        super(Object.class);
        this.j = m0;
        this.k = m1;
        this.l = false;
    }

    @Override  // com.fasterxml.jackson.databind.deser.j
    public com.fasterxml.jackson.databind.n a(h h0, d d0) throws o {
        boolean z;
        if(d0 == null) {
            Boolean boolean0 = h0.g0().A(Object.class);
            z = Boolean.FALSE.equals(boolean0);
        }
        else {
            z = false;
        }
        if(this.h == null && this.i == null && this.f == null && this.g == null && this.getClass() == Q.class) {
            return S.w1(z);
        }
        return z == this.l ? this : new Q(this, z);
    }

    @Override  // com.fasterxml.jackson.databind.deser.w
    public void b(h h0) throws o {
        m m0 = h0.R(Object.class);
        m m1 = h0.R(String.class);
        q q0 = h0.x();
        m m2 = this.j;
        this.g = m2 == null ? this.r1(this.s1(h0, q0.H(List.class, m0))) : this.s1(h0, m2);
        m m3 = this.k;
        this.f = m3 == null ? this.r1(this.s1(h0, q0.N(Map.class, m1, m0))) : this.s1(h0, m3);
        this.h = this.r1(this.s1(h0, m1));
        this.i = this.r1(this.s1(h0, q0.f0(Number.class)));
        m m4 = q.v0();
        this.f = h0.s0(this.f, null, m4);
        this.g = h0.s0(this.g, null, m4);
        this.h = h0.s0(this.h, null, m4);
        this.i = h0.s0(this.i, null, m4);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object g(n n0, h h0) throws IOException {
        switch(n0.d0()) {
            case 3: {
                if(h0.J0(i.f)) {
                    return this.x1(n0, h0);
                }
                com.fasterxml.jackson.databind.n n2 = this.g;
                return n2 == null ? this.v1(n0, h0) : n2.g(n0, h0);
            }
            case 1: 
            case 2: 
            case 5: {
                com.fasterxml.jackson.databind.n n1 = this.f;
                return n1 == null ? this.y1(n0, h0) : n1.g(n0, h0);
            }
            case 6: {
                com.fasterxml.jackson.databind.n n3 = this.h;
                return n3 != null ? n3.g(n0, h0) : n0.R2();
            }
            case 7: {
                com.fasterxml.jackson.databind.n n4 = this.i;
                if(n4 != null) {
                    return n4.g(n0, h0);
                }
                return h0.E0(D.d) ? this.P(n0, h0) : n0.j2();
            }
            case 8: {
                com.fasterxml.jackson.databind.n n5 = this.i;
                if(n5 != null) {
                    return n5.g(n0, h0);
                }
                return h0.J0(i.c) ? n0.i1() : n0.j2();
            }
            case 9: {
                return true;
            }
            case 10: {
                return false;
            }
            case 11: {
                return null;
            }
            case 12: {
                return n0.l1();
            }
            default: {
                return h0.v0(Object.class, n0);
            }
        }
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object h(n n0, h h0, Object object0) throws IOException {
        if(this.l) {
            return this.g(n0, h0);
        }
        switch(n0.d0()) {
            case 3: {
                com.fasterxml.jackson.databind.n n2 = this.g;
                if(n2 != null) {
                    return n2.h(n0, h0, object0);
                }
                if(object0 instanceof Collection) {
                    return this.w1(n0, h0, ((Collection)object0));
                }
                return h0.J0(i.f) ? this.x1(n0, h0) : this.v1(n0, h0);
            }
            case 1: 
            case 2: 
            case 5: {
                com.fasterxml.jackson.databind.n n1 = this.f;
                if(n1 != null) {
                    return n1.h(n0, h0, object0);
                }
                return object0 instanceof Map ? this.z1(n0, h0, ((Map)object0)) : this.y1(n0, h0);
            }
            case 6: {
                com.fasterxml.jackson.databind.n n3 = this.h;
                return n3 != null ? n3.h(n0, h0, object0) : n0.R2();
            }
            case 7: {
                com.fasterxml.jackson.databind.n n4 = this.i;
                if(n4 != null) {
                    return n4.h(n0, h0, object0);
                }
                return h0.E0(D.d) ? this.P(n0, h0) : n0.j2();
            }
            case 8: {
                com.fasterxml.jackson.databind.n n5 = this.i;
                if(n5 != null) {
                    return n5.h(n0, h0, object0);
                }
                return h0.J0(i.c) ? n0.i1() : n0.j2();
            }
            case 9: {
                return true;
            }
            case 10: {
                return false;
            }
            case 11: {
                return null;
            }
            case 12: {
                return n0.l1();
            }
            default: {
                return this.g(n0, h0);
            }
        }
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.D
    public Object i(n n0, h h0, f f0) throws IOException {
        int v = n0.d0();
        if(v != 1 && v != 3) {
            switch(v) {
                case 5: {
                    break;
                }
                case 6: {
                    com.fasterxml.jackson.databind.n n1 = this.h;
                    return n1 != null ? n1.g(n0, h0) : n0.R2();
                }
                case 7: {
                    com.fasterxml.jackson.databind.n n2 = this.i;
                    if(n2 != null) {
                        return n2.g(n0, h0);
                    }
                    return h0.E0(D.d) ? this.P(n0, h0) : n0.j2();
                }
                case 8: {
                    com.fasterxml.jackson.databind.n n3 = this.i;
                    if(n3 != null) {
                        return n3.g(n0, h0);
                    }
                    return h0.J0(i.c) ? n0.i1() : n0.j2();
                }
                case 9: {
                    return true;
                }
                case 10: {
                    return false;
                }
                case 11: {
                    return null;
                }
                case 12: {
                    return n0.l1();
                }
                default: {
                    return h0.v0(Object.class, n0);
                }
            }
        }
        return f0.c(n0, h0);
    }

    // 去混淆评级： 低(20)
    protected com.fasterxml.jackson.databind.n r1(com.fasterxml.jackson.databind.n n0) {
        return com.fasterxml.jackson.databind.util.h.c0(n0) ? null : n0;
    }

    protected com.fasterxml.jackson.databind.n s1(h h0, m m0) throws o {
        return h0.a0(m0);
    }

    protected Object t1(n n0, h h0, Map map0, String s, Object object0, Object object1, String s1) throws IOException {
        boolean z = h0.I0(x.c);
        if(z) {
            this.u1(map0, s, object0, object1);
        }
        while(s1 != null) {
            n0.m4();
            Object object2 = this.g(n0, h0);
            Object object3 = map0.put(s1, object2);
            if(object3 != null && z) {
                this.u1(map0, s, object3, object2);
            }
            s1 = n0.h4();
        }
        return map0;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public boolean u() {
        return true;
    }

    private void u1(Map map0, String s, Object object0, Object object1) {
        if(object0 instanceof List) {
            ((List)object0).add(object1);
            map0.put(s, object0);
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(object0);
        arrayList0.add(object1);
        map0.put(s, arrayList0);
    }

    protected Object v1(n n0, h h0) throws IOException {
        r r0 = n0.m4();
        r r1 = r.n;
        int v = 2;
        if(r0 == r1) {
            return new ArrayList(2);
        }
        Object object0 = this.g(n0, h0);
        if(n0.m4() == r1) {
            ArrayList arrayList0 = new ArrayList(2);
            arrayList0.add(object0);
            return arrayList0;
        }
        Object object1 = this.g(n0, h0);
        if(n0.m4() == r1) {
            ArrayList arrayList1 = new ArrayList(2);
            arrayList1.add(object0);
            arrayList1.add(object1);
            return arrayList1;
        }
        A a0 = h0.L0();
        Object[] arr_object = a0.i();
        arr_object[0] = object0;
        arr_object[1] = object1;
        int v1;
        for(v1 = 2; true; ++v1) {
            Object object2 = this.g(n0, h0);
            ++v;
            if(v1 >= arr_object.length) {
                arr_object = a0.c(arr_object);
                v1 = 0;
            }
            arr_object[v1] = object2;
            if(n0.m4() == r.n) {
                break;
            }
        }
        ArrayList arrayList2 = new ArrayList(v);
        a0.e(arr_object, v1 + 1, arrayList2);
        h0.k1(a0);
        return arrayList2;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public com.fasterxml.jackson.databind.type.h w() {
        return com.fasterxml.jackson.databind.type.h.e;
    }

    protected Object w1(n n0, h h0, Collection collection0) throws IOException {
        while(n0.m4() != r.n) {
            collection0.add(this.g(n0, h0));
        }
        return collection0;
    }

    protected Object[] x1(n n0, h h0) throws IOException {
        if(n0.m4() == r.n) {
            return Q.n;
        }
        A a0 = h0.L0();
        Object[] arr_object = a0.i();
        int v;
        for(v = 0; true; ++v) {
            Object object0 = this.g(n0, h0);
            if(v >= arr_object.length) {
                arr_object = a0.c(arr_object);
                v = 0;
            }
            arr_object[v] = object0;
            if(n0.m4() == r.n) {
                break;
            }
        }
        Object[] arr_object1 = a0.f(arr_object, v + 1);
        h0.k1(a0);
        return arr_object1;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Boolean y(g g0) {
        return null;
    }

    protected Object y1(n n0, h h0) throws IOException {
        String s;
        r r0 = n0.Y();
        if(r0 == r.k) {
            s = n0.h4();
        }
        else if(r0 == r.o) {
            s = n0.T();
        }
        else {
            if(r0 != r.l) {
                return h0.v0(this.s(), n0);
            }
            s = null;
        }
        if(s == null) {
            return new LinkedHashMap(2);
        }
        n0.m4();
        Object object0 = this.g(n0, h0);
        String s1 = n0.h4();
        if(s1 == null) {
            LinkedHashMap linkedHashMap0 = new LinkedHashMap(2);
            linkedHashMap0.put(s, object0);
            return linkedHashMap0;
        }
        n0.m4();
        Object object1 = this.g(n0, h0);
        String s2 = n0.h4();
        if(s2 == null) {
            LinkedHashMap linkedHashMap1 = new LinkedHashMap(4);
            linkedHashMap1.put(s, object0);
            return linkedHashMap1.put(s1, object1) != null ? this.t1(n0, h0, linkedHashMap1, s, object0, object1, null) : linkedHashMap1;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(s, object0);
        if(linkedHashMap2.put(s1, object1) != null) {
            return this.t1(n0, h0, linkedHashMap2, s, object0, object1, s2);
        }
        do {
            n0.m4();
            Object object2 = this.g(n0, h0);
            Object object3 = linkedHashMap2.put(s2, object2);
            if(object3 != null) {
                return this.t1(n0, h0, linkedHashMap2, s2, object3, object2, n0.h4());
            }
            s2 = n0.h4();
        }
        while(s2 != null);
        return linkedHashMap2;
    }

    protected Object z1(n n0, h h0, Map map0) throws IOException {
        r r0 = n0.Y();
        if(r0 == r.k) {
            r0 = n0.m4();
        }
        if(r0 == r.l) {
            return map0;
        }
        String s = n0.T();
        do {
            n0.m4();
            Object object0 = map0.get(s);
            Object object1 = object0 == null ? this.g(n0, h0) : this.h(n0, h0, object0);
            if(object1 != object0) {
                map0.put(s, object1);
            }
            s = n0.h4();
        }
        while(s != null);
        return map0;
    }
}

