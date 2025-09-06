package kotlinx.serialization.json.internal;

import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.descriptors.j.b;
import kotlinx.serialization.h;
import kotlinx.serialization.w;
import y4.l;

public final class m0 {
    @l
    public static final String a = "primitive";

    public static final kotlinx.serialization.json.l b(kotlinx.serialization.json.l l0, f f0) {
        L.p(l0, "value");
        L.p(f0, "descriptor");
        L.y(3, "T");
        if(l0 instanceof kotlinx.serialization.json.l) {
            return l0;
        }
        L.y(4, "T");
        throw E.e(-1, "Expected " + kotlin.jvm.internal.m0.d(kotlinx.serialization.json.l.class) + " as the serialized body of " + f0.h() + ", but had " + kotlin.jvm.internal.m0.d(l0.getClass()));
    }

    private static final boolean c(f f0) {
        return f0.getKind() instanceof e || f0.getKind() == b.a;
    }

    @h
    @l
    public static final kotlinx.serialization.json.l d(@l kotlinx.serialization.json.b b0, Object object0, @l w w0) {
        static final class a extends N implements Function1 {
            final kotlin.jvm.internal.l0.h e;

            a(kotlin.jvm.internal.l0.h l0$h0) {
                this.e = l0$h0;
                super(1);
            }

            public final void a(@l kotlinx.serialization.json.l l0) {
                L.p(l0, "it");
                this.e.a = l0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((kotlinx.serialization.json.l)object0));
                return S0.a;
            }
        }

        L.p(b0, "<this>");
        L.p(w0, "serializer");
        kotlin.jvm.internal.l0.h l0$h0 = new kotlin.jvm.internal.l0.h();
        new S(b0, new a(l0$h0)).e(w0, object0);
        Object object1 = l0$h0.a;
        if(object1 == null) {
            L.S("result");
            return null;
        }
        return (kotlinx.serialization.json.l)object1;
    }
}

