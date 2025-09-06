package com.unity3d.ads.injection;

import A3.a;
import java.util.Map;
import kotlin.D;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.W;
import y4.l;

@s0({"SMAP\nRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Registry.kt\ncom/unity3d/ads/injection/Registry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,74:1\n1#2:75\n230#3,5:76\n*S KotlinDebug\n*F\n+ 1 Registry.kt\ncom/unity3d/ads/injection/Registry\n*L\n46#1:76,5\n*E\n"})
public final class Registry {
    @l
    private final E _services;

    public Registry() {
        this._services = W.a(Y.z());
    }

    public final void add(@l EntryKey entryKey0, @l D d0) {
        L.p(entryKey0, "key");
        L.p(d0, "instance");
        if(this.getServices().containsKey(entryKey0)) {
            throw new IllegalStateException("Cannot have identical entries.");
        }
        E e0 = this._services;
        do {
            Object object0 = e0.getValue();
        }
        while(!e0.compareAndSet(object0, Y.n0(((Map)object0), Y.k(r0.a(entryKey0, d0)))));
    }

    public final EntryKey factory(String s, a a0) {
        L.p(s, "named");
        L.p(a0, "instance");
        L.y(4, "T");
        EntryKey entryKey0 = new EntryKey(s, m0.d(Object.class));
        this.add(entryKey0, new Factory(a0));
        return entryKey0;
    }

    public static EntryKey factory$default(Registry registry0, String s, a a0, int v, Object object0) {
        if((v & 1) != 0) {
            s = "";
        }
        L.p(s, "named");
        L.p(a0, "instance");
        L.y(4, "T");
        EntryKey entryKey0 = new EntryKey(s, m0.d(Object.class));
        registry0.add(entryKey0, new Factory(a0));
        return entryKey0;
    }

    public final Object get(String s) {
        L.p(s, "named");
        L.y(4, "T");
        EntryKey entryKey0 = new EntryKey(s, m0.d(Object.class));
        D d0 = (D)this.getServices().get(entryKey0);
        if(d0 == null) {
            throw new IllegalStateException("No entry found for " + entryKey0);
        }
        Object object0 = d0.getValue();
        L.y(1, "T");
        return object0;
    }

    public static Object get$default(Registry registry0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = "";
        }
        L.p(s, "named");
        L.y(4, "T");
        EntryKey entryKey0 = new EntryKey(s, m0.d(Object.class));
        D d0 = (D)registry0.getServices().get(entryKey0);
        if(d0 == null) {
            throw new IllegalStateException("No entry found for " + entryKey0);
        }
        Object object1 = d0.getValue();
        L.y(1, "T");
        return object1;
    }

    public final Object getOrNull(String s) {
        L.p(s, "named");
        L.y(4, "T");
        EntryKey entryKey0 = new EntryKey(s, m0.d(Object.class));
        D d0 = (D)this.getServices().get(entryKey0);
        if(d0 == null) {
            return null;
        }
        Object object0 = d0.getValue();
        L.y(1, "T");
        return object0;
    }

    public static Object getOrNull$default(Registry registry0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = "";
        }
        L.p(s, "named");
        L.y(4, "T");
        EntryKey entryKey0 = new EntryKey(s, m0.d(Object.class));
        D d0 = (D)registry0.getServices().get(entryKey0);
        if(d0 == null) {
            return null;
        }
        Object object1 = d0.getValue();
        L.y(1, "T");
        return object1;
    }

    @l
    public final Map getServices() {
        return (Map)this._services.getValue();
    }

    public final EntryKey single(String s, a a0) {
        L.p(s, "named");
        L.p(a0, "instance");
        L.y(4, "T");
        EntryKey entryKey0 = new EntryKey(s, m0.d(Object.class));
        this.add(entryKey0, kotlin.E.a(a0));
        return entryKey0;
    }

    public static EntryKey single$default(Registry registry0, String s, a a0, int v, Object object0) {
        if((v & 1) != 0) {
            s = "";
        }
        L.p(s, "named");
        L.p(a0, "instance");
        L.y(4, "T");
        EntryKey entryKey0 = new EntryKey(s, m0.d(Object.class));
        registry0.add(entryKey0, kotlin.E.a(a0));
        return entryKey0;
    }
}

