package com.google.common.graph;

import com.google.common.base.H;
import com.google.common.base.t;
import com.google.common.collect.O2;
import com.google.common.collect.c;
import com.google.common.collect.q3;
import com.google.common.collect.u5;
import j..util.DesugarCollections;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

@x
final class s implements G {
    static class e {
        static final int[] a;

        static {
            int[] arr_v = new int[b.values().length];
            e.a = arr_v;
            try {
                arr_v[b.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                e.a[b.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static abstract class f {
        static final class a extends f {
            a(Object object0) {
                super(object0);
            }

            // 去混淆评级： 低(20)
            @Override
            public boolean equals(@o3.a Object object0) {
                return object0 instanceof a ? this.a.equals(((a)object0).a) : false;
            }

            @Override
            public int hashCode() {
                return a.class.hashCode() + this.a.hashCode();
            }
        }

        static final class com.google.common.graph.s.f.b extends f {
            com.google.common.graph.s.f.b(Object object0) {
                super(object0);
            }

            // 去混淆评级： 低(20)
            @Override
            public boolean equals(@o3.a Object object0) {
                return object0 instanceof com.google.common.graph.s.f.b ? this.a.equals(((com.google.common.graph.s.f.b)object0).a) : false;
            }

            @Override
            public int hashCode() {
                return com.google.common.graph.s.f.b.class.hashCode() + this.a.hashCode();
            }
        }

        final Object a;

        f(Object object0) {
            this.a = H.E(object0);
        }
    }

    static final class g {
        private final Object a;

        g(Object object0) {
            this.a = object0;
        }
    }

    private final Map a;
    @o3.a
    private final List b;
    private int c;
    private int d;
    private static final Object e;

    static {
        s.e = new Object();
    }

    private s(Map map0, @o3.a List list0, int v, int v1) {
        this.a = (Map)H.E(map0);
        this.b = list0;
        this.c = I.b(v);
        this.d = I.b(v1);
        H.g0(v <= map0.size() && v1 <= map0.size());
    }

    @Override  // com.google.common.graph.G
    public Set a() {
        class com.google.common.graph.s.a extends AbstractSet {
            final s a;

            public u5 a() {
                class com.google.common.graph.s.a.a extends c {
                    final Iterator c;
                    final Set d;

                    com.google.common.graph.s.a.a(Iterator iterator0, Set set0) {
                        this.c = iterator0;
                        this.d = set0;
                        super();
                    }

                    @Override  // com.google.common.collect.c
                    @o3.a
                    protected Object a() {
                        while(this.c.hasNext()) {
                            Object object0 = this.c.next();
                            f s$f0 = (f)object0;
                            if(this.d.add(s$f0.a)) {
                                return s$f0.a;
                            }
                            if(false) {
                                break;
                            }
                        }
                        return this.b();
                    }
                }

                return new com.google.common.graph.s.a.a(this, s.this.b.iterator(), new HashSet());
            }

            @Override
            public boolean contains(@o3.a Object object0) {
                return s.this.a.containsKey(object0);
            }

            @Override
            public Iterator iterator() {
                return this.a();
            }

            @Override
            public int size() {
                return s.this.a.size();
            }
        }

        return this.b == null ? DesugarCollections.unmodifiableSet(this.a.keySet()) : new com.google.common.graph.s.a(this);
    }

    @Override  // com.google.common.graph.G
    public Set b() {
        class com.google.common.graph.s.c extends AbstractSet {
            final s a;

            public u5 a() {
                class com.google.common.graph.s.c.a extends c {
                    final Iterator c;

                    com.google.common.graph.s.c.a(Iterator iterator0) {
                        this.c = iterator0;
                        super();
                    }

                    @Override  // com.google.common.collect.c
                    @o3.a
                    protected Object a() {
                        while(this.c.hasNext()) {
                            Object object0 = this.c.next();
                            Map.Entry map$Entry0 = (Map.Entry)object0;
                            if(s.t(map$Entry0.getValue())) {
                                return map$Entry0.getKey();
                            }
                            if(false) {
                                break;
                            }
                        }
                        return this.b();
                    }
                }


                class com.google.common.graph.s.c.b extends c {
                    final Iterator c;

                    com.google.common.graph.s.c.b(Iterator iterator0) {
                        this.c = iterator0;
                        super();
                    }

                    @Override  // com.google.common.collect.c
                    @o3.a
                    protected Object a() {
                        while(this.c.hasNext()) {
                            Object object0 = this.c.next();
                            f s$f0 = (f)object0;
                            if(s$f0 instanceof com.google.common.graph.s.f.b) {
                                return s$f0.a;
                            }
                            if(false) {
                                break;
                            }
                        }
                        return this.b();
                    }
                }

                return s.this.b == null ? new com.google.common.graph.s.c.a(this, s.this.a.entrySet().iterator()) : new com.google.common.graph.s.c.b(this, s.this.b.iterator());
            }

            @Override
            public boolean contains(@o3.a Object object0) {
                return s.t(s.this.a.get(object0));
            }

            @Override
            public Iterator iterator() {
                return this.a();
            }

            @Override
            public int size() {
                return s.this.d;
            }
        }

        return new com.google.common.graph.s.c(this);
    }

    @Override  // com.google.common.graph.G
    public Set c() {
        class com.google.common.graph.s.b extends AbstractSet {
            final s a;

            public u5 a() {
                class com.google.common.graph.s.b.a extends c {
                    final Iterator c;

                    com.google.common.graph.s.b.a(Iterator iterator0) {
                        this.c = iterator0;
                        super();
                    }

                    @Override  // com.google.common.collect.c
                    @o3.a
                    protected Object a() {
                        while(this.c.hasNext()) {
                            Object object0 = this.c.next();
                            Map.Entry map$Entry0 = (Map.Entry)object0;
                            if(s.s(map$Entry0.getValue())) {
                                return map$Entry0.getKey();
                            }
                            if(false) {
                                break;
                            }
                        }
                        return this.b();
                    }
                }


                class com.google.common.graph.s.b.b extends c {
                    final Iterator c;

                    com.google.common.graph.s.b.b(Iterator iterator0) {
                        this.c = iterator0;
                        super();
                    }

                    @Override  // com.google.common.collect.c
                    @o3.a
                    protected Object a() {
                        while(this.c.hasNext()) {
                            Object object0 = this.c.next();
                            f s$f0 = (f)object0;
                            if(s$f0 instanceof a) {
                                return s$f0.a;
                            }
                            if(false) {
                                break;
                            }
                        }
                        return this.b();
                    }
                }

                return s.this.b == null ? new com.google.common.graph.s.b.a(this, s.this.a.entrySet().iterator()) : new com.google.common.graph.s.b.b(this, s.this.b.iterator());
            }

            @Override
            public boolean contains(@o3.a Object object0) {
                return s.s(s.this.a.get(object0));
            }

            @Override
            public Iterator iterator() {
                return this.a();
            }

            @Override
            public int size() {
                return s.this.c;
            }
        }

        return new com.google.common.graph.s.b(this);
    }

    @Override  // com.google.common.graph.G
    public void d(Object object0, Object object1) {
        Object object2 = s.e;
        Object object3 = this.a.put(object0, object2);
        if(object3 == null) {
        label_9:
            int v = this.c + 1;
            this.c = v;
            I.d(v);
            List list0 = this.b;
            if(list0 != null) {
                list0.add(new a(object0));
            }
        }
        else {
            if(object3 instanceof g) {
                this.a.put(object0, object3);
                return;
            }
            if(object3 != object2) {
                g s$g0 = new g(object3);
                this.a.put(object0, s$g0);
                goto label_9;
            }
        }
    }

    @Override  // com.google.common.graph.G
    @o3.a
    public Object e(Object object0) {
        H.E(object0);
        Object object1 = this.a.get(object0);
        if(object1 == s.e) {
            return null;
        }
        return object1 instanceof g ? ((g)object1).a : object1;
    }

    @Override  // com.google.common.graph.G
    @o3.a
    public Object f(Object object0) {
        H.E(object0);
        Object object1 = this.a.get(object0);
        if(object1 == null) {
            object1 = null;
        }
        else {
            Object object2 = s.e;
            if(object1 == object2) {
                object1 = null;
            }
            else if(object1 instanceof g) {
                this.a.put(object0, object2);
                object1 = ((g)object1).a;
            }
            else {
                this.a.remove(object0);
            }
        }
        if(object1 != null) {
            int v = this.d - 1;
            this.d = v;
            I.b(v);
            List list0 = this.b;
            if(list0 != null) {
                list0.remove(new com.google.common.graph.s.f.b(object0));
            }
        }
        return object1 == null ? null : object1;
    }

    @Override  // com.google.common.graph.G
    public void g(Object object0) {
        H.E(object0);
        Object object1 = this.a.get(object0);
        if(object1 == s.e) {
            this.a.remove(object0);
            goto label_8;
        }
        else if(object1 instanceof g) {
            Object object2 = ((g)object1).a;
            this.a.put(object0, object2);
        label_8:
            int v = this.c - 1;
            this.c = v;
            I.b(v);
            List list0 = this.b;
            if(list0 != null) {
                list0.remove(new a(object0));
            }
        }
    }

    @Override  // com.google.common.graph.G
    public Iterator h(Object object0) {
        class d extends c {
            final Iterator c;
            final AtomicBoolean d;

            d(Iterator iterator0, AtomicBoolean atomicBoolean0) {
                this.c = iterator0;
                this.d = atomicBoolean0;
                super();
            }

            @Override  // com.google.common.collect.c
            @o3.a
            protected Object a() {
                return this.d();
            }

            @o3.a
            protected y d() {
                while(this.c.hasNext()) {
                    Object object0 = this.c.next();
                    y y0 = (y)object0;
                    if(!y0.d().equals(y0.g()) || !this.d.getAndSet(true)) {
                        return y0;
                    }
                    if(false) {
                        break;
                    }
                }
                return (y)this.b();
            }
        }

        H.E(object0);
        return this.b == null ? new d(this, q3.i(q3.b0(this.c().iterator(), (Object object1) -> y.j(object1, object0)), q3.b0(this.b().iterator(), (Object object1) -> y.j(object0, object1))), new AtomicBoolean(false)) : new d(this, q3.b0(this.b.iterator(), (f s$f0) -> // 去混淆评级： 低(20)
        (s$f0 instanceof com.google.common.graph.s.f.b ? y.j(object0, s$f0.a) : y.j(s$f0.a, object0))), new AtomicBoolean(false));
    }

    @Override  // com.google.common.graph.G
    @o3.a
    public Object i(Object object0, Object object1) {
        Object object2 = this.a.put(object0, object1);
        if(object2 == null) {
            object2 = null;
        }
        else if(object2 instanceof g) {
            g s$g0 = new g(object1);
            this.a.put(object0, s$g0);
            object2 = ((g)object2).a;
        }
        else if(object2 == s.e) {
            g s$g1 = new g(object1);
            this.a.put(object0, s$g1);
            object2 = null;
        }
        if(object2 == null) {
            int v = this.d + 1;
            this.d = v;
            I.d(v);
            List list0 = this.b;
            if(list0 != null) {
                list0.add(new com.google.common.graph.s.f.b(object0));
            }
        }
        return object2 == null ? null : object2;
    }

    private static boolean s(@o3.a Object object0) {
        return object0 == s.e || object0 instanceof g;
    }

    private static boolean t(@o3.a Object object0) {
        return object0 != s.e && object0 != null;
    }

    // 检测为 Lambda 实现
    private static y u(Object object0, Object object1) [...]

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static y w(Object object0, f s$f0) [...]

    static s x(w w0) {
        switch(w0.h()) {
            case 1: {
                return new s(new HashMap(4, 1.0f), null, 0, 0);
            }
            case 2: {
                ArrayList arrayList0 = new ArrayList();
                return new s(new HashMap(4, 1.0f), arrayList0, 0, 0);
            }
            default: {
                throw new AssertionError(w0.h());
            }
        }
    }

    static s y(Object object0, Iterable iterable0, t t0) {
        H.E(object0);
        H.E(t0);
        HashMap hashMap0 = new HashMap();
        com.google.common.collect.O2.a o2$a0 = O2.n();
        int v = 0;
        int v1 = 0;
        for(Object object1: iterable0) {
            y y0 = (y)object1;
            if(y0.d().equals(object0) && y0.g().equals(object0)) {
                hashMap0.put(object0, new g(t0.apply(object0)));
                o2$a0.j(new a(object0));
                o2$a0.j(new com.google.common.graph.s.f.b(object0));
                ++v;
            }
            else if(y0.g().equals(object0)) {
                Object object2 = y0.d();
                Object object3 = hashMap0.put(object2, s.e);
                if(object3 != null) {
                    hashMap0.put(object2, new g(object3));
                }
                o2$a0.j(new a(object2));
                ++v;
                continue;
            }
            else {
                H.d(y0.d().equals(object0));
                Object object4 = y0.g();
                Object object5 = t0.apply(object4);
                Object object6 = hashMap0.put(object4, object5);
                if(object6 != null) {
                    H.d(object6 == s.e);
                    hashMap0.put(object4, new g(object5));
                }
                o2$a0.j(new com.google.common.graph.s.f.b(object4));
            }
            ++v1;
        }
        return new s(hashMap0, o2$a0.n(), v, v1);
    }
}

