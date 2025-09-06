package kotlinx.coroutines.selects;

import A3.p;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.E0;
import kotlinx.coroutines.internal.V;
import y4.l;
import y4.m;

public final class o {
    static final class a extends N implements p {
        public static final a e;

        static {
            a.e = new a();
        }

        a() {
            super(3);
        }

        @m
        public final Void a(@l Object object0, @m Object object1, @m Object object2) [...] // Inlined contents

        @Override  // A3.p
        public Object invoke(Object object0, Object object1, Object object2) {
            return null;
        }
    }

    @l
    private static final p a = null;
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 3;
    @l
    private static final V f;
    @l
    private static final V g;
    @l
    private static final V h;
    @l
    private static final V i;
    @l
    private static final V j;

    static {
        o.a = a.e;
        o.f = new V("STATE_REG");
        o.g = new V("STATE_COMPLETED");
        o.h = new V("STATE_CANCELLED");
        o.i = new V("NO_RESULT");
        o.j = new V("PARAM_CLAUSE_0");
    }

    @E0
    public static void a() {
    }

    @E0
    public static void b() {
    }

    @E0
    public static void c() {
    }

    private static final r d(int v) {
        switch(v) {
            case 0: {
                return r.a;
            }
            case 1: {
                return r.b;
            }
            case 2: {
                return r.c;
            }
            case 3: {
                return r.d;
            }
            default: {
                throw new IllegalStateException(("Unexpected internal result: " + v).toString());
            }
        }
    }

    @l
    public static final V l() {
        return o.j;
    }

    @m
    public static final Object m(@l Function1 function10, @l d d0) {
        kotlinx.coroutines.selects.l l0 = new kotlinx.coroutines.selects.l(d0.getContext());
        function10.invoke(l0);
        return l0.w(d0);
    }

    private static final Object n(Function1 function10, d d0) {
        throw null;
    }

    private static final boolean o(kotlinx.coroutines.o o0, Function1 function10) {
        Object object0 = o0.U(S0.a, null, function10);
        if(object0 == null) {
            return false;
        }
        o0.E(object0);
        return true;
    }
}

