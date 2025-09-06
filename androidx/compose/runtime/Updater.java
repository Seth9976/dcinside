package androidx.compose.runtime;

import A3.o;
import kotlin.S0;
import kotlin.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import z3.g;

@g
public final class Updater {
    @l
    private final Composer a;

    private Updater(Composer composer0) {
        this.a = composer0;
    }

    public static final Updater a(Composer composer0) {
        return new Updater(composer0);
    }

    @l
    public static Composer b(@l Composer composer0) {
        L.p(composer0, "composer");
        return composer0;
    }

    // 去混淆评级： 低(20)
    public static boolean c(Composer composer0, Object object0) {
        return object0 instanceof Updater ? L.g(composer0, ((Updater)object0).l()) : false;
    }

    public static final boolean d(Composer composer0, Composer composer1) {
        return L.g(composer0, composer1);
    }

    @b0
    public static void e() {
    }

    @Override
    public boolean equals(Object object0) {
        return Updater.c(this.a, object0);
    }

    public static int f(Composer composer0) {
        return composer0.hashCode();
    }

    public static final void g(Composer composer0, @l Function1 function10) {
        L.p(function10, "block");
        if(composer0.E()) {
            androidx.compose.runtime.Updater.init.1 updater$init$10 = new o(function10) {
                final Function1 e;

                {
                    this.e = function10;
                    super(2);
                }

                public final void a(Object object0, @l S0 s00) {
                    L.p(s00, "it");
                    this.e.invoke(object0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(object0, ((S0)object1));
                    return S0.a;
                }
            };
            composer0.N(S0.a, updater$init$10);
        }
    }

    public static final void h(Composer composer0, @l Function1 function10) {
        L.p(function10, "block");
        androidx.compose.runtime.Updater.reconcile.1 updater$reconcile$10 = new o(function10) {
            final Function1 e;

            {
                this.e = function10;
                super(2);
            }

            public final void a(Object object0, @l S0 s00) {
                L.p(s00, "it");
                this.e.invoke(object0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(object0, ((S0)object1));
                return S0.a;
            }
        };
        composer0.N(S0.a, updater$reconcile$10);
    }

    @Override
    public int hashCode() {
        return Updater.f(this.a);
    }

    public static final void i(Composer composer0, int v, @l o o0) {
        L.p(o0, "block");
        if(composer0.E() || !L.g(composer0.W(), v)) {
            composer0.O(v);
            composer0.N(v, o0);
        }
    }

    public static final void j(Composer composer0, Object object0, @l o o0) {
        L.p(o0, "block");
        if(composer0.E() || !L.g(composer0.W(), object0)) {
            composer0.O(object0);
            composer0.N(object0, o0);
        }
    }

    public static String k(Composer composer0) [...] // Inlined contents

    public final Composer l() {
        return this.a;
    }

    public static final void m(Composer composer0, int v, @l o o0) {
        L.p(o0, "block");
        boolean z = composer0.E();
        if(z || !L.g(composer0.W(), v)) {
            composer0.O(v);
            if(!z) {
                composer0.N(v, o0);
            }
        }
    }

    public static final void n(Composer composer0, Object object0, @l o o0) {
        L.p(o0, "block");
        boolean z = composer0.E();
        if(z || !L.g(composer0.W(), object0)) {
            composer0.O(object0);
            if(!z) {
                composer0.N(object0, o0);
            }
        }
    }

    @Override
    public String toString() {
        return "Updater(composer=" + this.a + ')';
    }
}

