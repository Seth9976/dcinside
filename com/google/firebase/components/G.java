package com.google.firebase.components;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import j..util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class g {
    static class a {
    }

    public static class b {
        private String a;
        private final Set b;
        private final Set c;
        private int d;
        private int e;
        private l f;
        private final Set g;

        @SafeVarargs
        private b(K k0, K[] arr_k) {
            this.a = null;
            HashSet hashSet0 = new HashSet();
            this.b = hashSet0;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            J.c(k0, "Null interface");
            hashSet0.add(k0);
            for(int v = 0; v < arr_k.length; ++v) {
                J.c(arr_k[v], "Null interface");
            }
            Collections.addAll(this.b, arr_k);
        }

        b(K k0, K[] arr_k, a g$a0) {
            this(k0, arr_k);
        }

        @SafeVarargs
        private b(Class class0, Class[] arr_class) {
            this.a = null;
            HashSet hashSet0 = new HashSet();
            this.b = hashSet0;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            J.c(class0, "Null interface");
            hashSet0.add(K.b(class0));
            for(int v = 0; v < arr_class.length; ++v) {
                Class class1 = arr_class[v];
                J.c(class1, "Null interface");
                K k0 = K.b(class1);
                this.b.add(k0);
            }
        }

        b(Class class0, Class[] arr_class, a g$a0) {
            this(class0, arr_class);
        }

        @O1.a
        public b b(w w0) {
            J.c(w0, "Null dependency");
            this.k(w0.d());
            this.c.add(w0);
            return this;
        }

        @O1.a
        public b c() {
            return this.j(1);
        }

        public g d() {
            J.d(this.f != null, "Missing required property: factory.");
            return new g(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g, null);
        }

        @O1.a
        public b e() {
            return this.j(2);
        }

        @O1.a
        public b f(l l0) {
            this.f = (l)J.c(l0, "Null factory");
            return this;
        }

        @O1.a
        private b g() {
            this.e = 1;
            return this;
        }

        public b h(@NonNull String s) {
            this.a = s;
            return this;
        }

        @O1.a
        public b i(Class class0) {
            this.g.add(class0);
            return this;
        }

        @O1.a
        private b j(int v) {
            J.d(this.d == 0, "Instantiation type has already been set.");
            this.d = v;
            return this;
        }

        private void k(K k0) {
            J.a(!this.b.contains(k0), "Components are not allowed to depend on interfaces they themselves provide.");
        }
    }

    private final String a;
    private final Set b;
    private final Set c;
    private final int d;
    private final int e;
    private final l f;
    private final Set g;

    private g(@Nullable String s, Set set0, Set set1, int v, int v1, l l0, Set set2) {
        this.a = s;
        this.b = DesugarCollections.unmodifiableSet(set0);
        this.c = DesugarCollections.unmodifiableSet(set1);
        this.d = v;
        this.e = v1;
        this.f = l0;
        this.g = DesugarCollections.unmodifiableSet(set2);
    }

    g(String s, Set set0, Set set1, int v, int v1, l l0, Set set2, a g$a0) {
        this(s, set0, set1, v, v1, l0, set2);
    }

    private static Object A(Object object0, i i0) [...] // Inlined contents

    @Deprecated
    public static g B(Class class0, Object object0) {
        return g.h(class0).f((i i0) -> object0).d();
    }

    @SafeVarargs
    public static g C(Object object0, K k0, K[] arr_k) {
        return g.g(k0, arr_k).f((i i0) -> object0).d();
    }

    @SafeVarargs
    public static g D(Object object0, Class class0, Class[] arr_class) {
        return g.i(class0, arr_class).f((i i0) -> object0).d();
    }

    public g E(l l0) {
        return new g(this.a, this.b, this.c, this.d, this.e, l0, this.g);
    }

    // 检测为 Lambda 实现
    public static Object a(Object object0, i i0) [...]

    // 检测为 Lambda 实现
    public static Object b(Object object0, i i0) [...]

    // 检测为 Lambda 实现
    public static Object c(Object object0, i i0) [...]

    // 检测为 Lambda 实现
    public static Object d(Object object0, i i0) [...]

    // 检测为 Lambda 实现
    public static Object e(Object object0, i i0) [...]

    public static b f(K k0) {
        return new b(k0, new K[0], null);
    }

    @SafeVarargs
    public static b g(K k0, K[] arr_k) {
        return new b(k0, arr_k, null);
    }

    public static b h(Class class0) {
        return new b(class0, new Class[0], null);
    }

    @SafeVarargs
    public static b i(Class class0, Class[] arr_class) {
        return new b(class0, arr_class, null);
    }

    public Set j() {
        return this.c;
    }

    public l k() {
        return this.f;
    }

    @Nullable
    public String l() {
        return this.a;
    }

    public Set m() {
        return this.b;
    }

    public Set n() {
        return this.g;
    }

    public static g o(Object object0, K k0) {
        return g.q(k0).f((i i0) -> object0).d();
    }

    public static g p(Object object0, Class class0) {
        return g.r(class0).f((i i0) -> object0).d();
    }

    public static b q(K k0) {
        return g.f(k0).g();
    }

    public static b r(Class class0) {
        return g.h(class0).g();
    }

    public boolean s() {
        return this.d == 1;
    }

    public boolean t() {
        return this.d == 2;
    }

    @Override
    public String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }

    public boolean u() {
        return this.d == 0;
    }

    public boolean v() {
        return this.e == 0;
    }

    private static Object w(Object object0, i i0) [...] // Inlined contents

    private static Object x(Object object0, i i0) [...] // Inlined contents

    private static Object y(Object object0, i i0) [...] // Inlined contents

    private static Object z(Object object0, i i0) [...] // Inlined contents
}

