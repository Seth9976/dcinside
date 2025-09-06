package kotlinx.serialization.internal;

import P3.a;
import java.util.Map;
import kotlin.A0;
import kotlin.D0;
import kotlin.H0;
import kotlin.I0;
import kotlin.N0;
import kotlin.O0;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x;
import kotlin.r0;
import kotlin.reflect.d;
import kotlin.text.c;
import kotlin.text.v;
import kotlin.time.e;
import kotlin.z0;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.i;
import y4.l;

public final class E0 {
    @l
    private static final Map a;

    static {
        E0.a = Y.W(new V[]{r0.a(m0.d(String.class), a.J(u0.a)), r0.a(m0.d(Character.TYPE), a.D(r.a)), r0.a(m0.d(char[].class), a.e()), r0.a(m0.d(Double.TYPE), a.E(x.a)), r0.a(m0.d(double[].class), a.f()), r0.a(m0.d(Float.TYPE), a.F(A.a)), r0.a(m0.d(float[].class), a.g()), r0.a(m0.d(Long.TYPE), a.H(Q.a)), r0.a(m0.d(long[].class), a.j()), r0.a(m0.d(H0.class), a.y(H0.b)), r0.a(m0.d(I0.class), a.s()), r0.a(m0.d(Integer.TYPE), a.G(J.a)), r0.a(m0.d(int[].class), a.h()), r0.a(m0.d(D0.class), a.x(D0.b)), r0.a(m0.d(kotlin.E0.class), a.r()), r0.a(m0.d(Short.TYPE), a.I(q0.a)), r0.a(m0.d(short[].class), a.o()), r0.a(m0.d(N0.class), a.z(N0.b)), r0.a(m0.d(O0.class), a.t()), r0.a(m0.d(Byte.TYPE), a.C(o.a)), r0.a(m0.d(byte[].class), a.d()), r0.a(m0.d(z0.class), a.w(z0.b)), r0.a(m0.d(A0.class), a.q()), r0.a(m0.d(Boolean.TYPE), a.B(m.a)), r0.a(m0.d(boolean[].class), a.c()), r0.a(m0.d(S0.class), a.A(S0.a)), r0.a(m0.d(e.class), a.K(e.b))});
    }

    @l
    public static final f a(@l String s, @l kotlinx.serialization.descriptors.e e0) {
        L.p(s, "serialName");
        L.p(e0, "kind");
        E0.d(s);
        return new kotlinx.serialization.internal.D0(s, e0);
    }

    @y4.m
    public static final i b(@l d d0) {
        L.p(d0, "<this>");
        return (i)E0.a.get(d0);
    }

    private static final String c(String s) {
        if(s.length() > 0) {
            int v = s.charAt(0);
            String s1 = s.substring(1);
            L.o(s1, "this as java.lang.String).substring(startIndex)");
            return (Character.isLowerCase(((char)v)) ? c.N(((char)v)) : String.valueOf(((char)v))) + s1;
        }
        return s;
    }

    private static final void d(String s) {
        for(Object object0: E0.a.keySet()) {
            String s1 = ((d)object0).u();
            L.m(s1);
            String s2 = E0.c(s1);
            if(v.O1(s, "kotlin." + s2, true) || v.O1(s, s2, true)) {
                throw new IllegalArgumentException(v.p(("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + s + " there already exist " + E0.c(s2) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            ")));
            }
            if(false) {
                break;
            }
        }
    }

    private static void e() {
    }
}

