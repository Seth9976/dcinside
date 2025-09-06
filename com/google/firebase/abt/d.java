package com.google.firebase.abt;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.firebase.analytics.connector.a.c;
import h2.b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class d {
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
        public static final String c1 = "frc";
        public static final String d1 = "fiam";

    }

    private final b a;
    private final String b;
    @Nullable
    private Integer c;
    @VisibleForTesting
    static final String d = "com.google.firebase.abt";
    @VisibleForTesting
    static final String e = "%s_lastKnownExperimentStartTime";

    public d(Context context0, b b0, String s) {
        this.a = b0;
        this.b = s;
        this.c = null;
    }

    private void a(c a$c0) {
        ((com.google.firebase.analytics.connector.a)this.a.get()).f(a$c0);
    }

    private void b(List list0) {
        ArrayDeque arrayDeque0 = new ArrayDeque(this.f());
        int v = this.i();
        for(Object object0: list0) {
            while(arrayDeque0.size() >= v) {
                this.k(((c)arrayDeque0.pollFirst()).b);
            }
            c a$c0 = ((com.google.firebase.abt.b)object0).i(this.b);
            this.a(a$c0);
            arrayDeque0.offer(a$c0);
        }
    }

    private static List c(List list0) throws com.google.firebase.abt.a {
        List list1 = new ArrayList();
        for(Object object0: list0) {
            list1.add(com.google.firebase.abt.b.b(((Map)object0)));
        }
        return list1;
    }

    private boolean d(List list0, com.google.firebase.abt.b b0) {
        String s = b0.c();
        String s1 = b0.h();
        for(Object object0: list0) {
            if(((com.google.firebase.abt.b)object0).c().equals(s) && ((com.google.firebase.abt.b)object0).h().equals(s1)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @WorkerThread
    public List e() throws com.google.firebase.abt.a {
        this.p();
        List list0 = this.f();
        List list1 = new ArrayList();
        for(Object object0: list0) {
            list1.add(com.google.firebase.abt.b.a(((c)object0)));
        }
        return list1;
    }

    @WorkerThread
    private List f() {
        return ((com.google.firebase.analytics.connector.a)this.a.get()).d(this.b, "");
    }

    private ArrayList g(List list0, List list1) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            com.google.firebase.abt.b b0 = (com.google.firebase.abt.b)object0;
            if(!this.d(list1, b0)) {
                arrayList0.add(b0);
            }
        }
        return arrayList0;
    }

    private ArrayList h(List list0, List list1) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            com.google.firebase.abt.b b0 = (com.google.firebase.abt.b)object0;
            if(!this.d(list1, b0)) {
                arrayList0.add(b0.i(this.b));
            }
        }
        return arrayList0;
    }

    @WorkerThread
    private int i() {
        if(this.c == null) {
            this.c = ((com.google.firebase.analytics.connector.a)this.a.get()).c(this.b);
        }
        return (int)this.c;
    }

    @WorkerThread
    public void j() throws com.google.firebase.abt.a {
        this.p();
        this.l(this.f());
    }

    private void k(String s) {
        ((com.google.firebase.analytics.connector.a)this.a.get()).clearConditionalUserProperty(s, null, null);
    }

    private void l(Collection collection0) {
        for(Object object0: collection0) {
            this.k(((c)object0).b);
        }
    }

    @WorkerThread
    public void m(List list0) throws com.google.firebase.abt.a {
        this.p();
        if(list0 == null) {
            throw new IllegalArgumentException("The replacementExperiments list is null.");
        }
        this.n(d.c(list0));
    }

    private void n(List list0) throws com.google.firebase.abt.a {
        if(list0.isEmpty()) {
            this.j();
            return;
        }
        List list1 = this.e();
        this.l(this.h(list1, list0));
        this.b(this.g(list0, list1));
    }

    @WorkerThread
    public void o(com.google.firebase.abt.b b0) throws com.google.firebase.abt.a {
        this.p();
        com.google.firebase.abt.b.k(b0);
        ArrayList arrayList0 = new ArrayList();
        Map map0 = b0.j();
        map0.remove("triggerEvent");
        arrayList0.add(com.google.firebase.abt.b.b(map0));
        this.b(arrayList0);
    }

    private void p() throws com.google.firebase.abt.a {
        if(this.a.get() == null) {
            throw new com.google.firebase.abt.a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    @WorkerThread
    public void q(List list0) throws com.google.firebase.abt.a {
        this.p();
        this.l(this.h(this.e(), list0));
    }
}

