package io.realm.transformer;

import h3.b;
import java.util.ArrayList;
import java.util.List;
import javassist.D;
import javassist.E;
import javassist.expr.d;
import javassist.expr.e;
import javassist.g;
import javassist.k;
import javassist.o;
import javassist.q;
import javassist.t;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;
import z3.n;

public final class a {
    public static final class io.realm.transformer.a.a {
        private io.realm.transformer.a.a() {
        }

        public io.realm.transformer.a.a(w w0) {
        }

        @n
        public final void a(@l javassist.l l0) {
            L.p(l0, "clazz");
            q[] arr_q = l0.J();
            L.o(arr_q, "clazz.declaredMethods");
            ArrayList arrayList0 = new ArrayList(arr_q.length);
            for(int v1 = 0; v1 < arr_q.length; ++v1) {
                arrayList0.add(arr_q[v1].i());
            }
            o[] arr_o = l0.G();
            L.o(arr_o, "clazz.declaredFields");
            ArrayList arrayList1 = new ArrayList();
            for(int v = 0; v < arr_o.length; ++v) {
                o o0 = arr_o[v];
                L.o(o0, "it");
                if(a.a.d(o0)) {
                    arrayList1.add(o0);
                }
            }
            for(Object object0: arrayList1) {
                o o1 = (o)object0;
                if(!arrayList0.contains("realmGet$" + o1.i())) {
                    l0.f(t.f(("realmGet$" + o1.i()), o1));
                }
                if(!arrayList0.contains("realmSet$" + o1.i())) {
                    l0.f(t.k(("realmSet$" + o1.i()), o1));
                }
            }
        }

        @n
        public final void b(@l javassist.l l0, @l g g0) {
            L.p(l0, "clazz");
            L.p(g0, "classPool");
            String s = l0.X();
            L.o(s, "clazz.getName()");
            javassist.l l1 = g0.s("io.realm." + v.l2(s, ".", "_", false, 4, null) + "RealmProxyInterface");
            L.o(l1, "classPool.get(\"io.realm.…_\")}RealmProxyInterface\")");
            l0.e(l1);
        }

        public final void c(@l javassist.l l0) {
            L.p(l0, "clazz");
            javassist.n[] arr_n = l0.z();
            L.o(arr_n, "clazz.constructors");
            for(int v = 0; v < arr_n.length; ++v) {
                arr_n[v].d0("if ($0 instanceof io.realm.internal.RealmObjectProxy) { ((io.realm.internal.RealmObjectProxy) $0).realm$injectObjectContext(); }");
            }
        }

        public final boolean d(@l o o0) {
            L.p(o0, "<this>");
            return !o0.k(b.class) && !D.o(o0.h()) && !D.l(o0.h());
        }

        public final void e(@l javassist.l l0) {
            L.p(l0, "clazz");
            f.a().n("  Realm: Marking as transformed " + l0.b0());
            try {
                l0.H("transformerApplied");
            }
            catch(E unused_ex) {
                l0.f(t.g(1, javassist.l.e, "transformerApplied", new javassist.l[0], new javassist.l[0], "{return true;}", l0));
            }
        }

        @n
        public final void f(@l g g0, @l javassist.l l0, @m List list0) {
            L.p(g0, "classPool");
            L.p(l0, "clazz");
            k[] arr_k = l0.A();
            L.o(arr_k, "clazz.declaredBehaviors");
            ArrayList arrayList0 = new ArrayList();
            for(int v1 = 0; v1 < arr_k.length; ++v1) {
                k k0 = arr_k[v1];
                if(k0 instanceof q) {
                    arrayList0.add(k0);
                }
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object0: arrayList0) {
                String s = ((q)object0).i();
                L.o(s, "it.name");
                if(!v.v2(s, "realmGet$", false, 2, null)) {
                    arrayList1.add(object0);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for(Object object1: arrayList1) {
                String s1 = ((q)object1).i();
                L.o(s1, "it.name");
                if(!v.v2(s1, "realmSet$", false, 2, null)) {
                    arrayList2.add(object1);
                }
            }
            k[] arr_k1 = l0.A();
            L.o(arr_k1, "clazz.declaredBehaviors");
            ArrayList arrayList3 = new ArrayList();
            for(int v = 0; v < arr_k1.length; ++v) {
                k k1 = arr_k1[v];
                if(k1 instanceof javassist.n) {
                    arrayList3.add(k1);
                }
            }
            for(Object object2: u.D4(arrayList2, arrayList3)) {
                k k2 = (k)object2;
                f.a().n("    Behavior: " + k2.i());
                if(list0 == null) {
                    k2.U(new io.realm.transformer.a.b(g0, l0, k2));
                }
                else {
                    k2.U(new c(list0, l0, k2));
                }
            }
        }

        public static void g(io.realm.transformer.a.a a$a0, g g0, javassist.l l0, List list0, int v, Object object0) {
            if((v & 4) != 0) {
                list0 = null;
            }
            a$a0.f(g0, l0, list0);
        }
    }

    static final class io.realm.transformer.a.b extends d {
        @l
        private final g a;
        @l
        private final javassist.l b;
        @l
        private final k c;
        @l
        private final javassist.l d;

        public io.realm.transformer.a.b(@l g g0, @l javassist.l l0, @l k k0) {
            L.p(g0, "classPool");
            L.p(l0, "ctClass");
            L.p(k0, "behaviour");
            super();
            this.a = g0;
            this.b = l0;
            this.c = k0;
            javassist.l l1 = g0.s("io.realm.internal.RealmObjectProxy");
            L.o(l1, "classPool.get(\"io.realm.…ternal.RealmObjectProxy\")");
            this.d = l1;
        }

        @Override  // javassist.expr.d
        public void e(@l e e0) throws javassist.b {
            L.p(e0, "fieldAccess");
            f.a().n("      Field being accessed: " + e0.t() + "." + e0.w());
            javassist.l l0 = this.l(e0);
            if(l0 != null && this.q(l0)) {
                io.realm.transformer.a.a a$a0 = a.a;
                o o0 = e0.v();
                L.o(o0, "fieldAccess.field");
                if(a$a0.d(o0)) {
                    f.a().n("        Realm: Manipulating " + this.b.b0() + "." + this.c.i() + "(): " + e0.w());
                    f.a().n("        Methods: " + this.b.J());
                    a$a0.a(l0);
                    String s = e0.w();
                    L.o(s, "fieldAccess.fieldName");
                    if(e0.y()) {
                        e0.k("$_ = $0.realmGet$" + s + "();");
                        return;
                    }
                    if(e0.B()) {
                        e0.k("$0.realmSet$" + s + "($1);");
                    }
                }
            }
        }

        private final javassist.l l(e e0) {
            try {
                String s = e0.t();
                return this.a.s(s);
            }
            catch(E unused_ex) {
                return null;
            }
        }

        @l
        public final k m() {
            return this.c;
        }

        @l
        public final g n() {
            return this.a;
        }

        @l
        public final javassist.l o() {
            return this.b;
        }

        @l
        public final javassist.l p() {
            return this.d;
        }

        // 去混淆评级： 低(20)
        public final boolean q(@l javassist.l l0) {
            L.p(l0, "<this>");
            return !L.g(l0.X(), "io.realm.RealmObject") && (l0.e0(h3.f.class) || m3.a.a(l0.c0())) && !m3.a.b(l0, this.d);
        }
    }

    static final class c extends d {
        @l
        private final List a;
        @l
        private final javassist.l b;
        @l
        private final k c;

        public c(@l List list0, @l javassist.l l0, @l k k0) {
            L.p(list0, "managedFields");
            L.p(l0, "ctClass");
            L.p(k0, "behaviour");
            super();
            this.a = list0;
            this.b = l0;
            this.c = k0;
        }

        @Override  // javassist.expr.d
        public void e(@l e e0) throws javassist.b {
            Object object0 = null;
            L.p(e0, "fieldAccess");
            f.a().n("      Field being accessed: " + e0.t() + "." + e0.w());
            for(Object object1: this.a) {
                if(e0.t().equals(((o)object1).f().X()) && e0.w().equals(((o)object1).i())) {
                    object0 = object1;
                    break;
                }
            }
            if(((o)object0) != null) {
                f.a().n("        Realm: Manipulating " + this.b.b0() + "." + this.c.i() + "(): " + e0.w());
                f.a().n("        Methods: " + this.b.J());
                String s = e0.w();
                L.o(s, "fieldAccess.fieldName");
                if(e0.y()) {
                    e0.k("$_ = $0.realmGet$" + s + "();");
                    return;
                }
                if(e0.B()) {
                    e0.k("$0.realmSet$" + s + "($1);");
                }
            }
        }

        @l
        public final k l() {
            return this.c;
        }

        @l
        public final javassist.l m() {
            return this.b;
        }

        @l
        public final List n() {
            return this.a;
        }
    }

    @l
    public static final io.realm.transformer.a.a a;

    static {
        a.a = new io.realm.transformer.a.a(null);
    }

    @n
    public static final void a(@l javassist.l l0) {
        a.a.a(l0);
    }

    @n
    public static final void b(@l javassist.l l0, @l g g0) {
        a.a.b(l0, g0);
    }

    @n
    public static final void c(@l g g0, @l javassist.l l0, @m List list0) {
        a.a.f(g0, l0, list0);
    }
}

