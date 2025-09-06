package kotlinx.serialization.modules;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.b0;
import kotlin.collections.Y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.reflect.d;
import kotlinx.serialization.f;
import y4.l;

public final class g implements i {
    @l
    private final Map a;
    @l
    private final Map b;
    @l
    private final Map c;
    @l
    private final Map d;
    @l
    private final Map e;

    @b0
    public g() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
    }

    @Override  // kotlinx.serialization.modules.i
    @f
    public void a(@l d d0, @l Function1 function10) {
        L.p(d0, "baseClass");
        L.p(function10, "defaultDeserializerProvider");
        this.i(d0, function10, false);
    }

    @Override  // kotlinx.serialization.modules.i
    @f
    public void b(@l d d0, @l Function1 function10) {
        L.p(d0, "baseClass");
        L.p(function10, "defaultSerializerProvider");
        this.j(d0, function10, false);
    }

    @Override  // kotlinx.serialization.modules.i
    public void c(@l d d0, @l d d1, @l kotlinx.serialization.i i0) {
        L.p(d0, "baseClass");
        L.p(d1, "actualClass");
        L.p(i0, "actualSerializer");
        g.l(this, d0, d1, i0, false, 8, null);
    }

    @Override  // kotlinx.serialization.modules.i
    public void d(@l d d0, @l kotlinx.serialization.i i0) {
        L.p(d0, "kClass");
        L.p(i0, "serializer");
        g.n(this, d0, new a(i0), false, 4, null);
    }

    @Override  // kotlinx.serialization.modules.i
    public void e(@l d d0, @l Function1 function10) {
        kotlinx.serialization.modules.i.a.b(this, d0, function10);
    }

    @Override  // kotlinx.serialization.modules.i
    public void f(@l d d0, @l Function1 function10) {
        L.p(d0, "kClass");
        L.p(function10, "provider");
        g.n(this, d0, new b(function10), false, 4, null);
    }

    @b0
    @l
    public final kotlinx.serialization.modules.f g() {
        return new kotlinx.serialization.modules.d(this.a, this.b, this.c, this.d, this.e);
    }

    public final void h(@l kotlinx.serialization.modules.f f0) {
        L.p(f0, "module");
        f0.a(this);
    }

    @z3.i(name = "registerDefaultPolymorphicDeserializer")
    public final void i(@l d d0, @l Function1 function10, boolean z) {
        L.p(d0, "baseClass");
        L.p(function10, "defaultDeserializerProvider");
        Function1 function11 = (Function1)this.e.get(d0);
        if(function11 != null && !L.g(function11, function10) && !z) {
            throw new IllegalArgumentException("Default deserializers provider for " + d0 + " is already registered: " + function11);
        }
        this.e.put(d0, function10);
    }

    @z3.i(name = "registerDefaultPolymorphicSerializer")
    public final void j(@l d d0, @l Function1 function10, boolean z) {
        L.p(d0, "baseClass");
        L.p(function10, "defaultSerializerProvider");
        Function1 function11 = (Function1)this.c.get(d0);
        if(function11 != null && !L.g(function11, function10) && !z) {
            throw new IllegalArgumentException("Default serializers provider for " + d0 + " is already registered: " + function11);
        }
        this.c.put(d0, function10);
    }

    @z3.i(name = "registerPolymorphicSerializer")
    public final void k(@l d d0, @l d d1, @l kotlinx.serialization.i i0, boolean z) {
        L.p(d0, "baseClass");
        L.p(d1, "concreteClass");
        L.p(i0, "concreteSerializer");
        String s = i0.getDescriptor().h();
        Map map0 = this.b;
        HashMap hashMap0 = map0.get(d0);
        if(hashMap0 == null) {
            hashMap0 = new HashMap();
            map0.put(d0, hashMap0);
        }
        kotlinx.serialization.i i1 = (kotlinx.serialization.i)hashMap0.get(d1);
        Map map1 = this.d;
        HashMap hashMap1 = map1.get(d0);
        if(hashMap1 == null) {
            hashMap1 = new HashMap();
            map1.put(d0, hashMap1);
        }
        if(z) {
            if(i1 != null) {
                hashMap1.remove(i1.getDescriptor().h());
            }
            hashMap0.put(d1, i0);
            hashMap1.put(s, i0);
            return;
        }
        if(i1 != null) {
            if(!L.g(i1, i0)) {
                throw new e(d0, d1);
            }
            hashMap1.remove(i1.getDescriptor().h());
        }
        kotlinx.serialization.i i2 = (kotlinx.serialization.i)hashMap1.get(s);
        if(i2 != null) {
            Object object0 = null;
            Object object1 = this.b.get(d0);
            L.m(object1);
            for(Object object2: Y.T0(((Map)object1))) {
                if(((Map.Entry)object2).getValue() == i2) {
                    object0 = object2;
                    break;
                }
            }
            throw new IllegalArgumentException("Multiple polymorphic serializers for base class \'" + d0 + "\' have the same serial name \'" + s + "\': \'" + d1 + "\' and \'" + ((Map.Entry)object0) + '\'');
        }
        hashMap0.put(d1, i0);
        hashMap1.put(s, i0);
    }

    public static void l(g g0, d d0, d d1, kotlinx.serialization.i i0, boolean z, int v, Object object0) {
        if((v & 8) != 0) {
            z = false;
        }
        g0.k(d0, d1, i0, z);
    }

    @z3.i(name = "registerSerializer")
    public final void m(@l d d0, @l kotlinx.serialization.modules.a a0, boolean z) {
        L.p(d0, "forClass");
        L.p(a0, "provider");
        if(!z) {
            kotlinx.serialization.modules.a a1 = (kotlinx.serialization.modules.a)this.a.get(d0);
            if(a1 != null && !L.g(a1, a0)) {
                throw new e("Contextual serializer or serializer provider for " + d0 + " already registered in this module");
            }
        }
        this.a.put(d0, a0);
    }

    public static void n(g g0, d d0, kotlinx.serialization.modules.a a0, boolean z, int v, Object object0) {
        if((v & 4) != 0) {
            z = false;
        }
        g0.m(d0, a0, z);
    }
}

