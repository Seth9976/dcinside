package kotlinx.serialization.descriptors;

import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.reflect.s;
import kotlin.text.v;
import kotlinx.serialization.h;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.P;
import kotlinx.serialization.z;
import y4.l;

public final class i {
    @l
    public static final f a(@l String s, @l e e0) {
        L.p(s, "serialName");
        L.p(e0, "kind");
        if(v.x3(s)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return E0.a(s, e0);
    }

    @kotlinx.serialization.f
    @l
    public static final f b(@l String s, @l f f0) {
        L.p(s, "serialName");
        L.p(f0, "original");
        if(v.x3(s)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if(f0.getKind() instanceof e) {
            throw new IllegalArgumentException("For primitive descriptors please use \'PrimitiveSerialDescriptor\' instead");
        }
        if(L.g(s, f0.h())) {
            throw new IllegalArgumentException(("The name of the wrapped descriptor (" + s + ") cannot be the same as the name of the original descriptor (" + f0.h() + ')').toString());
        }
        return new kotlinx.serialization.descriptors.l(s, f0);
    }

    @l
    public static final f c(@l String s, @l f[] arr_f, @l Function1 function10) {
        L.p(s, "serialName");
        L.p(arr_f, "typeParameters");
        L.p(function10, "builderAction");
        if(v.x3(s)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        a a0 = new a(s);
        function10.invoke(a0);
        List list0 = kotlin.collections.l.Ky(arr_f);
        return new g(s, kotlinx.serialization.descriptors.k.a.a, a0.g().size(), list0, a0);
    }

    public static f d(String s, f[] arr_f, Function1 function10, int v, Object object0) {
        static final class kotlinx.serialization.descriptors.i.a extends N implements Function1 {
            public static final kotlinx.serialization.descriptors.i.a e;

            static {
                kotlinx.serialization.descriptors.i.a.e = new kotlinx.serialization.descriptors.i.a();
            }

            kotlinx.serialization.descriptors.i.a() {
                super(1);
            }

            public final void a(@l a a0) {
                L.p(a0, "$this$null");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((a)object0));
                return S0.a;
            }
        }

        if((v & 4) != 0) {
            function10 = kotlinx.serialization.descriptors.i.a.e;
        }
        return i.c(s, arr_f, function10);
    }

    @h
    @l
    public static final f e(@l String s, @l j j0, @l f[] arr_f, @l Function1 function10) {
        L.p(s, "serialName");
        L.p(j0, "kind");
        L.p(arr_f, "typeParameters");
        L.p(function10, "builder");
        if(v.x3(s)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if(L.g(j0, kotlinx.serialization.descriptors.k.a.a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use \'buildClassSerialDescriptor\' instead");
        }
        a a0 = new a(s);
        function10.invoke(a0);
        return new g(s, j0, a0.g().size(), kotlin.collections.l.Ky(arr_f), a0);
    }

    public static f f(String s, j j0, f[] arr_f, Function1 function10, int v, Object object0) {
        static final class b extends N implements Function1 {
            public static final b e;

            static {
                b.e = new b();
            }

            b() {
                super(1);
            }

            public final void a(@l a a0) {
                L.p(a0, "$this$null");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((a)object0));
                return S0.a;
            }
        }

        if((v & 8) != 0) {
            function10 = b.e;
        }
        return i.e(s, j0, arr_f, function10);
    }

    public static final void g(a a0, String s, List list0, boolean z) {
        L.p(a0, "<this>");
        L.p(s, "elementName");
        L.p(list0, "annotations");
        L.y(6, "T");
        kotlinx.serialization.i i0 = z.h(null);
        L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        a0.a(s, i0.getDescriptor(), list0, z);
    }

    public static void h(a a0, String s, List list0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            list0 = u.H();
        }
        if((v & 4) != 0) {
            z = false;
        }
        L.p(a0, "<this>");
        L.p(s, "elementName");
        L.p(list0, "annotations");
        L.y(6, "T");
        kotlinx.serialization.i i0 = z.h(null);
        L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        a0.a(s, i0.getDescriptor(), list0, z);
    }

    @l
    public static final f i(@l f f0) {
        L.p(f0, "<this>");
        return f0.b() ? f0 : new G0(f0);
    }

    public static void j(f f0) {
    }

    @kotlinx.serialization.f
    public static final f k() {
        L.y(6, "T");
        kotlinx.serialization.i i0 = z.h(null);
        L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return i.l(i0.getDescriptor());
    }

    @kotlinx.serialization.f
    @l
    public static final f l(@l f f0) {
        L.p(f0, "elementDescriptor");
        return new kotlinx.serialization.internal.e(f0);
    }

    @kotlinx.serialization.f
    public static final f m() {
        L.y(6, "K");
        kotlinx.serialization.i i0 = z.h(null);
        L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        f f0 = i0.getDescriptor();
        L.y(6, "V");
        kotlinx.serialization.i i1 = z.h(null);
        L.n(i1, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return i.n(f0, i1.getDescriptor());
    }

    @kotlinx.serialization.f
    @l
    public static final f n(@l f f0, @l f f1) {
        L.p(f0, "keyDescriptor");
        L.p(f1, "valueDescriptor");
        return new kotlinx.serialization.internal.N(f0, f1);
    }

    public static final f o() {
        L.y(6, "T");
        kotlinx.serialization.i i0 = z.h(null);
        L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return i0.getDescriptor();
    }

    @l
    public static final f p(@l s s0) {
        L.p(s0, "type");
        return z.h(s0).getDescriptor();
    }

    @kotlinx.serialization.f
    public static final f q() {
        L.y(6, "T");
        kotlinx.serialization.i i0 = z.h(null);
        L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return i.r(i0.getDescriptor());
    }

    @kotlinx.serialization.f
    @l
    public static final f r(@l f f0) {
        L.p(f0, "elementDescriptor");
        return new P(f0);
    }
}

