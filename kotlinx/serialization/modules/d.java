package kotlinx.serialization.modules;

import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.v0;
import kotlinx.serialization.internal.t0;
import kotlinx.serialization.w;
import y4.l;
import y4.m;

public final class d extends f {
    @l
    private final Map a;
    @l
    @z3.f
    public final Map b;
    @l
    private final Map c;
    @l
    private final Map d;
    @l
    private final Map e;

    public d(@l Map map0, @l Map map1, @l Map map2, @l Map map3, @l Map map4) {
        L.p(map0, "class2ContextualFactory");
        L.p(map1, "polyBase2Serializers");
        L.p(map2, "polyBase2DefaultSerializerProvider");
        L.p(map3, "polyBase2NamedSerializers");
        L.p(map4, "polyBase2DefaultDeserializerProvider");
        super(null);
        this.a = map0;
        this.b = map1;
        this.c = map2;
        this.d = map3;
        this.e = map4;
    }

    @Override  // kotlinx.serialization.modules.f
    public void a(@l i i0) {
        L.p(i0, "collector");
        for(Object object0: this.a.entrySet()) {
            kotlin.reflect.d d0 = (kotlin.reflect.d)((Map.Entry)object0).getKey();
            a a0 = (a)((Map.Entry)object0).getValue();
            if(a0 instanceof kotlinx.serialization.modules.a.a) {
                L.n(d0, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                kotlinx.serialization.i i1 = ((kotlinx.serialization.modules.a.a)a0).b();
                L.n(i1, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                i0.d(d0, i1);
            }
            else if(a0 instanceof b) {
                i0.f(d0, ((b)a0).b());
            }
        }
        for(Object object1: this.b.entrySet()) {
            kotlin.reflect.d d1 = (kotlin.reflect.d)((Map.Entry)object1).getKey();
            for(Object object2: ((Map)((Map.Entry)object1).getValue()).entrySet()) {
                kotlin.reflect.d d2 = (kotlin.reflect.d)((Map.Entry)object2).getKey();
                kotlinx.serialization.i i2 = (kotlinx.serialization.i)((Map.Entry)object2).getValue();
                L.n(d1, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                L.n(d2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                L.n(i2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                i0.c(d1, d2, i2);
            }
        }
        for(Object object3: this.c.entrySet()) {
            kotlin.reflect.d d3 = (kotlin.reflect.d)((Map.Entry)object3).getKey();
            Function1 function10 = (Function1)((Map.Entry)object3).getValue();
            L.n(d3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            L.n(function10, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \'value\')] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicSerializerProvider<kotlin.Any> }");
            i0.b(d3, ((Function1)v0.q(function10, 1)));
        }
        for(Object object4: this.e.entrySet()) {
            kotlin.reflect.d d4 = (kotlin.reflect.d)((Map.Entry)object4).getKey();
            Function1 function11 = (Function1)((Map.Entry)object4).getValue();
            L.n(d4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            L.n(function11, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \'className\')] kotlin.String?, kotlinx.serialization.DeserializationStrategy<out kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicDeserializerProvider<out kotlin.Any> }");
            i0.a(d4, ((Function1)v0.q(function11, 1)));
        }
    }

    @Override  // kotlinx.serialization.modules.f
    @m
    public kotlinx.serialization.i c(@l kotlin.reflect.d d0, @l List list0) {
        L.p(d0, "kClass");
        L.p(list0, "typeArgumentsSerializers");
        a a0 = (a)this.a.get(d0);
        kotlinx.serialization.i i0 = a0 == null ? null : a0.a(list0);
        return i0 instanceof kotlinx.serialization.i ? i0 : null;
    }

    @Override  // kotlinx.serialization.modules.f
    @m
    public kotlinx.serialization.d e(@l kotlin.reflect.d d0, @m String s) {
        L.p(d0, "baseClass");
        Map map0 = (Map)this.d.get(d0);
        kotlinx.serialization.d d1 = map0 == null ? null : ((kotlinx.serialization.i)map0.get(s));
        if(!(d1 instanceof kotlinx.serialization.i)) {
            d1 = null;
        }
        if(d1 != null) {
            return d1;
        }
        Object object0 = this.e.get(d0);
        Function1 function10 = v0.B(object0, 1) ? ((Function1)object0) : null;
        return function10 == null ? null : ((kotlinx.serialization.d)function10.invoke(s));
    }

    @Override  // kotlinx.serialization.modules.f
    @m
    public w f(@l kotlin.reflect.d d0, @l Object object0) {
        L.p(d0, "baseClass");
        L.p(object0, "value");
        if(!t0.k(object0, d0)) {
            return null;
        }
        Map map0 = (Map)this.b.get(d0);
        w w0 = map0 == null ? null : ((kotlinx.serialization.i)map0.get(m0.d(object0.getClass())));
        if(!(w0 instanceof w)) {
            w0 = null;
        }
        if(w0 != null) {
            return w0;
        }
        Object object1 = this.c.get(d0);
        Function1 function10 = v0.B(object1, 1) ? ((Function1)object1) : null;
        return function10 == null ? null : ((w)function10.invoke(object0));
    }
}

