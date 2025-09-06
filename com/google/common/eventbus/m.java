package com.google.common.eventbus;

import com.google.common.base.B;
import com.google.common.base.H;
import com.google.common.base.U;
import com.google.common.base.z;
import com.google.common.cache.d;
import com.google.common.cache.g;
import com.google.common.cache.l;
import com.google.common.collect.C2;
import com.google.common.collect.D3;
import com.google.common.collect.M3;
import com.google.common.collect.O2;
import com.google.common.collect.a3;
import com.google.common.collect.q3;
import com.google.common.collect.u5;
import com.google.common.collect.z3;
import com.google.common.reflect.q;
import com.google.common.util.concurrent.f1;
import com.google.j2objc.annotations.Weak;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

@e
final class m {
    class a extends g {
        a() {
            super();
        }

        @Override  // com.google.common.cache.g
        public Object d(Object object0) throws Exception {
            return this.g(((Class)object0));
        }

        public O2 g(Class class0) throws Exception {
            return m.e(class0);
        }
    }

    class b extends g {
        b() {
            super();
        }

        @Override  // com.google.common.cache.g
        public Object d(Object object0) throws Exception {
            return this.g(((Class)object0));
        }

        public a3 g(Class class0) {
            return a3.u(q.U(class0).F().z0());
        }
    }

    static final class c {
        private final String a;
        private final List b;

        c(Method method0) {
            this.a = method0.getName();
            this.b = Arrays.asList(method0.getParameterTypes());
        }

        // 去混淆评级： 低(30)
        @Override
        public boolean equals(@o3.a Object object0) {
            return object0 instanceof c && this.a.equals(((c)object0).a) && this.b.equals(((c)object0).b);
        }

        @Override
        public int hashCode() {
            return B.b(new Object[]{this.a, this.b});
        }
    }

    private final ConcurrentMap a;
    @Weak
    private final f b;
    private static final l c;
    private static final l d;

    static {
        m.c = d.D().M().b(new a());
        m.d = d.D().M().b(new b());
    }

    m(f f0) {
        this.a = D3.V();
        this.b = (f)H.E(f0);
    }

    private M3 b(Object object0) {
        M3 m30 = C2.Q();
        u5 u50 = m.d(object0.getClass()).i();
        while(u50.hasNext()) {
            Object object1 = u50.next();
            m30.put(((Method)object1).getParameterTypes()[0], j.c(this.b, object0, ((Method)object1)));
        }
        return m30;
    }

    @J1.e
    static a3 c(Class class0) {
        try {
            return (a3)m.d.D(class0);
        }
        catch(f1 f10) {
            throw U.q(f10.getCause());
        }
    }

    private static O2 d(Class class0) {
        try {
            return (O2)m.c.D(class0);
        }
        catch(f1 f10) {
            U.w(f10.getCause());
            throw f10;
        }
    }

    private static O2 e(Class class0) {
        Set set0 = q.U(class0).F().z0();
        HashMap hashMap0 = D3.Y();
        for(Object object0: set0) {
            Method[] arr_method = ((Class)object0).getDeclaredMethods();
            for(int v = 0; v < arr_method.length; ++v) {
                Method method0 = arr_method[v];
                if(method0.isAnnotationPresent(h.class) && !method0.isSynthetic()) {
                    Class[] arr_class = method0.getParameterTypes();
                    H.w(arr_class.length == 1, "Method %s has @Subscribe annotation but has %s parameters. Subscriber methods must have exactly 1 parameter.", method0, arr_class.length);
                    H.z(!arr_class[0].isPrimitive(), "@Subscribe method %s\'s parameter is %s. Subscriber methods cannot accept primitives. Consider changing the parameter to %s.", method0, arr_class[0].getName(), com.google.common.primitives.q.f(arr_class[0]).getSimpleName());
                    c m$c0 = new c(method0);
                    if(!hashMap0.containsKey(m$c0)) {
                        hashMap0.put(m$c0, method0);
                    }
                }
            }
        }
        return O2.r(hashMap0.values());
    }

    Iterator f(Object object0) {
        a3 a30 = m.c(object0.getClass());
        ArrayList arrayList0 = z3.u(a30.size());
        u5 u50 = a30.i();
        while(u50.hasNext()) {
            Object object1 = u50.next();
            CopyOnWriteArraySet copyOnWriteArraySet0 = (CopyOnWriteArraySet)this.a.get(((Class)object1));
            if(copyOnWriteArraySet0 != null) {
                arrayList0.add(copyOnWriteArraySet0.iterator());
            }
        }
        return q3.h(arrayList0.iterator());
    }

    @J1.e
    Set g(Class class0) {
        return (Set)z.a(((AbstractCollection)this.a.get(class0)), a3.B());
    }

    void h(Object object0) {
        for(Object object1: this.b(object0).c().entrySet()) {
            Class class0 = (Class)((Map.Entry)object1).getKey();
            Collection collection0 = (Collection)((Map.Entry)object1).getValue();
            CopyOnWriteArraySet copyOnWriteArraySet0 = (CopyOnWriteArraySet)this.a.get(class0);
            if(copyOnWriteArraySet0 == null) {
                CopyOnWriteArraySet copyOnWriteArraySet1 = new CopyOnWriteArraySet();
                copyOnWriteArraySet0 = (CopyOnWriteArraySet)z.a(((CopyOnWriteArraySet)this.a.putIfAbsent(class0, copyOnWriteArraySet1)), copyOnWriteArraySet1);
            }
            copyOnWriteArraySet0.addAll(collection0);
        }
    }

    void i(Object object0) {
        for(Object object1: this.b(object0).c().entrySet()) {
            Class class0 = (Class)((Map.Entry)object1).getKey();
            Collection collection0 = (Collection)((Map.Entry)object1).getValue();
            CopyOnWriteArraySet copyOnWriteArraySet0 = (CopyOnWriteArraySet)this.a.get(class0);
            if(copyOnWriteArraySet0 == null || !copyOnWriteArraySet0.removeAll(collection0)) {
                throw new IllegalArgumentException("missing event subscriber for an annotated method. Is " + object0 + " registered?");
            }
            if(false) {
                break;
            }
        }
    }
}

