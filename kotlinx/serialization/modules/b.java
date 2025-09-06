package kotlinx.serialization.modules;

import java.util.ArrayList;
import java.util.List;
import kotlin.V;
import kotlin.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlin.reflect.d;
import kotlinx.serialization.f;
import kotlinx.serialization.i;
import y4.l;
import y4.m;

public final class b {
    @l
    private final d a;
    @m
    private final i b;
    @l
    private final List c;
    @m
    private Function1 d;
    @m
    private Function1 e;

    @b0
    public b(@l d d0, @m i i0) {
        L.p(d0, "baseClass");
        super();
        this.a = d0;
        this.b = i0;
        this.c = new ArrayList();
    }

    public b(d d0, i i0, int v, w w0) {
        if((v & 2) != 0) {
            i0 = null;
        }
        this(d0, i0);
    }

    @b0
    public final void a(@l g g0) {
        L.p(g0, "builder");
        i i0 = this.b;
        if(i0 != null) {
            g.l(g0, this.a, this.a, i0, false, 8, null);
        }
        for(Object object0: this.c) {
            Object object1 = ((V)object0).a();
            Object object2 = ((V)object0).b();
            L.n(((d)object1), "null cannot be cast to non-null type kotlin.reflect.KClass<Base of kotlinx.serialization.modules.PolymorphicModuleBuilder.buildTo$lambda$1>");
            L.n(((i)object2), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            g.l(g0, this.a, ((d)object1), ((i)object2), false, 8, null);
        }
        Function1 function10 = this.d;
        if(function10 != null) {
            g0.j(this.a, function10, false);
        }
        Function1 function11 = this.e;
        if(function11 != null) {
            g0.i(this.a, function11, false);
        }
    }

    public final void b(@l Function1 function10) {
        L.p(function10, "defaultSerializerProvider");
        this.c(function10);
    }

    @f
    public final void c(@l Function1 function10) {
        L.p(function10, "defaultDeserializerProvider");
        if(this.e != null) {
            throw new IllegalArgumentException(("Default deserializer provider is already registered for class " + this.a + ": " + this.e).toString());
        }
        this.e = function10;
    }

    public final void d(@l d d0, @l i i0) {
        L.p(d0, "subclass");
        L.p(i0, "serializer");
        V v0 = r0.a(d0, i0);
        this.c.add(v0);
    }
}

