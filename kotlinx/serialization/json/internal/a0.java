package kotlinx.serialization.json.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.reflect.d;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.descriptors.j;
import kotlinx.serialization.descriptors.k.b;
import kotlinx.serialization.descriptors.k.c;
import kotlinx.serialization.modules.i.a;
import kotlinx.serialization.modules.i;
import y4.l;

public final class a0 implements i {
    private final boolean a;
    @l
    private final String b;

    public a0(boolean z, @l String s) {
        L.p(s, "discriminator");
        super();
        this.a = z;
        this.b = s;
    }

    @Override  // kotlinx.serialization.modules.i
    public void a(@l d d0, @l Function1 function10) {
        L.p(d0, "baseClass");
        L.p(function10, "defaultDeserializerProvider");
    }

    @Override  // kotlinx.serialization.modules.i
    public void b(@l d d0, @l Function1 function10) {
        L.p(d0, "baseClass");
        L.p(function10, "defaultSerializerProvider");
    }

    @Override  // kotlinx.serialization.modules.i
    public void c(@l d d0, @l d d1, @l kotlinx.serialization.i i0) {
        L.p(d0, "baseClass");
        L.p(d1, "actualClass");
        L.p(i0, "actualSerializer");
        f f0 = i0.getDescriptor();
        this.h(f0, d1);
        if(!this.a) {
            this.g(f0, d1);
        }
    }

    @Override  // kotlinx.serialization.modules.i
    public void d(@l d d0, @l kotlinx.serialization.i i0) {
        a.a(this, d0, i0);
    }

    @Override  // kotlinx.serialization.modules.i
    public void e(@l d d0, @l Function1 function10) {
        a.b(this, d0, function10);
    }

    @Override  // kotlinx.serialization.modules.i
    public void f(@l d d0, @l Function1 function10) {
        L.p(d0, "kClass");
        L.p(function10, "provider");
    }

    private final void g(f f0, d d0) {
        int v = f0.e();
        for(int v1 = 0; v1 < v; ++v1) {
            String s = f0.f(v1);
            if(L.g(s, this.b)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + d0 + " has property \'" + s + "\' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    private final void h(f f0, d d0) {
        j j0 = f0.getKind();
        if(j0 instanceof kotlinx.serialization.descriptors.d || L.g(j0, kotlinx.serialization.descriptors.j.a.a)) {
            throw new IllegalArgumentException("Serializer for " + d0.u() + " can\'t be registered as a subclass for polymorphic serialization because its kind " + j0 + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if(this.a) {
            return;
        }
        if(L.g(j0, b.a) || L.g(j0, c.a) || j0 instanceof e || j0 instanceof kotlinx.serialization.descriptors.j.b) {
            throw new IllegalArgumentException("Serializer for " + d0.u() + " of kind " + j0 + " cannot be serialized polymorphically with class discriminator.");
        }
    }
}

