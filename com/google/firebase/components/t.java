package com.google.firebase.components;

import a2.a;
import android.util.Log;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import e2.c;
import e2.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public class t implements a, i {
    static class com.google.firebase.components.t.a {
    }

    public static final class b {
        private final Executor a;
        private final List b;
        private final List c;
        private n d;

        b(Executor executor0) {
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = n.a;
            this.a = executor0;
        }

        // 检测为 Lambda 实现
        public static ComponentRegistrar a(ComponentRegistrar componentRegistrar0) [...]

        @O1.a
        public b b(g g0) {
            this.c.add(g0);
            return this;
        }

        @O1.a
        public b c(ComponentRegistrar componentRegistrar0) {
            u u0 = () -> componentRegistrar0;
            this.b.add(u0);
            return this;
        }

        @O1.a
        public b d(Collection collection0) {
            this.b.addAll(collection0);
            return this;
        }

        public t e() {
            return new t(this.a, this.b, this.c, this.d, null);
        }

        private static ComponentRegistrar f(ComponentRegistrar componentRegistrar0) [...] // Inlined contents

        @O1.a
        public b g(n n0) {
            this.d = n0;
            return this;
        }
    }

    private final Map a;
    private final Map b;
    private final Map c;
    private final List d;
    private Set e;
    private final A f;
    private final AtomicReference g;
    private final n h;
    private static final h2.b i;

    static {
        t.i = new p();
    }

    private t(Executor executor0, Iterable iterable0, Collection collection0, n n0) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.e = new HashSet();
        this.g = new AtomicReference();
        A a0 = new A(executor0);
        this.f = a0;
        this.h = n0;
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(g.D(a0, A.class, new Class[]{d.class, c.class}));
        arrayList0.add(g.D(this, a.class, new Class[0]));
        for(Object object0: collection0) {
            g g0 = (g)object0;
            if(g0 != null) {
                arrayList0.add(g0);
            }
        }
        this.d = t.v(iterable0);
        this.q(arrayList0);
    }

    t(Executor executor0, Iterable iterable0, Collection collection0, n n0, com.google.firebase.components.t.a t$a0) {
        this(executor0, iterable0, collection0, n0);
    }

    @Deprecated
    public t(Executor executor0, Iterable iterable0, g[] arr_g) {
        this(executor0, t.E(iterable0), Arrays.asList(arr_g), n.a);
    }

    private void A() {
        Boolean boolean0 = (Boolean)this.g.get();
        if(boolean0 != null) {
            this.r(this.a, boolean0.booleanValue());
        }
    }

    private void B() {
        for(Object object0: this.a.keySet()) {
            g g0 = (g)object0;
            for(Object object1: g0.j()) {
                w w0 = (w)object1;
                if(w0.h() && !this.c.containsKey(w0.d())) {
                    D d0 = D.b(Collections.emptySet());
                    this.c.put(w0.d(), d0);
                }
                else if(!this.b.containsKey(w0.d())) {
                    if(w0.g()) {
                        throw new E(String.format("Unsatisfied dependency for component %s: %s", g0, w0.d()));
                    }
                    if(!w0.h()) {
                        I i0 = I.e();
                        this.b.put(w0.d(), i0);
                    }
                }
            }
        }
    }

    private List C(List list0) {
        List list1 = new ArrayList();
        for(Object object0: list0) {
            g g0 = (g)object0;
            if(g0.v()) {
                h2.b b0 = (h2.b)this.a.get(g0);
                for(Object object1: g0.m()) {
                    K k0 = (K)object1;
                    if(this.b.containsKey(k0)) {
                        ((ArrayList)list1).add(new r(((I)(((h2.b)this.b.get(k0)))), b0));
                    }
                    else {
                        this.b.put(k0, b0);
                    }
                }
            }
        }
        return list1;
    }

    private List D() {
        List list0 = new ArrayList();
        HashMap hashMap0 = new HashMap();
        for(Object object0: this.a.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            g g0 = (g)map$Entry0.getKey();
            if(!g0.v()) {
                h2.b b0 = (h2.b)map$Entry0.getValue();
                for(Object object1: g0.m()) {
                    K k0 = (K)object1;
                    if(!hashMap0.containsKey(k0)) {
                        hashMap0.put(k0, new HashSet());
                    }
                    ((Set)hashMap0.get(k0)).add(b0);
                }
            }
        }
        for(Object object2: hashMap0.entrySet()) {
            Map.Entry map$Entry1 = (Map.Entry)object2;
            Object object3 = map$Entry1.getKey();
            if(this.c.containsKey(object3)) {
                Object object4 = map$Entry1.getKey();
                D d1 = (D)this.c.get(object4);
                for(Object object5: ((Set)map$Entry1.getValue())) {
                    ((ArrayList)list0).add(new s(d1, ((h2.b)object5)));
                }
            }
            else {
                K k1 = (K)map$Entry1.getKey();
                D d0 = D.b(((Collection)map$Entry1.getValue()));
                this.c.put(k1, d0);
            }
        }
        return list0;
    }

    private static Iterable E(Iterable iterable0) {
        Iterable iterable1 = new ArrayList();
        for(Object object0: iterable0) {
            ((List)iterable1).add(() -> ((ComponentRegistrar)object0));
        }
        return iterable1;
    }

    @Override  // com.google.firebase.components.i
    public Object a(Class class0) {
        return h.b(this, class0);
    }

    @Override  // a2.a
    public void b() {
        synchronized(this) {
            if(this.d.isEmpty()) {
                return;
            }
        }
        this.q(new ArrayList());
    }

    @Override  // com.google.firebase.components.i
    public h2.b c(Class class0) {
        return h.g(this, class0);
    }

    @Override  // com.google.firebase.components.i
    public Set d(Class class0) {
        return h.f(this, class0);
    }

    @Override  // com.google.firebase.components.i
    public h2.b e(Class class0) {
        return h.d(this, class0);
    }

    @Override  // com.google.firebase.components.i
    public h2.a f(K k0) {
        h2.b b0 = this.g(k0);
        if(b0 == null) {
            return I.e();
        }
        return b0 instanceof I ? ((I)b0) : I.i(b0);
    }

    @Override  // com.google.firebase.components.i
    public h2.b g(K k0) {
        synchronized(this) {
            J.c(k0, "Null interface requested.");
            return (h2.b)this.b.get(k0);
        }
    }

    @Override  // com.google.firebase.components.i
    public Set h(K k0) {
        return h.e(this, k0);
    }

    @Override  // com.google.firebase.components.i
    public h2.b i(K k0) {
        synchronized(this) {
            h2.b b0 = (D)this.c.get(k0);
            return b0 != null ? b0 : t.i;
        }
    }

    @Override  // com.google.firebase.components.i
    public Object j(K k0) {
        return h.a(this, k0);
    }

    @Override  // com.google.firebase.components.i
    public h2.a k(Class class0) {
        return h.c(this, class0);
    }

    // 检测为 Lambda 实现
    public static ComponentRegistrar n(ComponentRegistrar componentRegistrar0) [...]

    public static b p(Executor executor0) {
        return new b(executor0);
    }

    private void q(List list0) {
        ArrayList arrayList0 = new ArrayList();
        synchronized(this) {
            Iterator iterator0 = this.d.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                h2.b b0 = (h2.b)object0;
                try {
                    ComponentRegistrar componentRegistrar0 = (ComponentRegistrar)b0.get();
                    if(componentRegistrar0 == null) {
                        continue;
                    }
                    list0.addAll(this.h.a(componentRegistrar0));
                    iterator0.remove();
                }
                catch(B b1) {
                    iterator0.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", b1);
                }
            }
            Iterator iterator1 = list0.iterator();
            while(iterator1.hasNext()) {
                Object object1 = iterator1.next();
                Object[] arr_object = ((g)object1).m().toArray();
                int v1 = 0;
            label_21:
                if(v1 >= arr_object.length) {
                    continue;
                }
                Object object2 = arr_object[v1];
                if(object2.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                    if(this.e.contains(object2.toString())) {
                        iterator1.remove();
                        continue;
                    }
                    this.e.add(object2.toString());
                }
                ++v1;
                goto label_21;
            }
            if(this.a.isEmpty()) {
                v.a(list0);
            }
            else {
                ArrayList arrayList1 = new ArrayList(this.a.keySet());
                arrayList1.addAll(list0);
                v.a(arrayList1);
            }
            for(Object object3: list0) {
                C c0 = new C(() -> ((g)object3).k().a(new M(((g)object3), this)));
                this.a.put(((g)object3), c0);
            }
            arrayList0.addAll(this.C(list0));
            arrayList0.addAll(this.D());
            this.B();
        }
        for(Object object4: arrayList0) {
            ((Runnable)object4).run();
        }
        this.A();
    }

    private void r(Map map0, boolean z) {
        for(Object object0: map0.entrySet()) {
            g g0 = (g)((Map.Entry)object0).getKey();
            h2.b b0 = (h2.b)((Map.Entry)object0).getValue();
            if(g0.s() || g0.t() && z) {
                b0.get();
            }
        }
        this.f.f();
    }

    @VisibleForTesting
    Collection s() {
        return this.a.keySet();
    }

    @RestrictTo({Scope.e})
    @VisibleForTesting
    public void t() {
        for(Object object0: this.a.values()) {
            ((h2.b)object0).get();
        }
    }

    public void u(boolean z) {
        HashMap hashMap0;
        if(!androidx.compose.animation.core.d.a(this.g, null, Boolean.valueOf(z))) {
            return;
        }
        synchronized(this) {
            hashMap0 = new HashMap(this.a);
        }
        this.r(hashMap0, z);
    }

    private static List v(Iterable iterable0) {
        List list0 = new ArrayList();
        for(Object object0: iterable0) {
            ((ArrayList)list0).add(object0);
        }
        return list0;
    }

    // 检测为 Lambda 实现
    private Object w(g g0) [...]

    private static ComponentRegistrar z(ComponentRegistrar componentRegistrar0) [...] // Inlined contents
}

