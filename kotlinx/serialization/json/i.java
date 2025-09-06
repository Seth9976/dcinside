package kotlinx.serialization.json;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.reflect.d;
import kotlin.y;
import kotlinx.serialization.descriptors.d.b;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.v;
import kotlinx.serialization.w;
import kotlinx.serialization.z;
import y4.l;

public abstract class i implements kotlinx.serialization.i {
    @l
    private final d a;
    @l
    private final f b;

    public i(@l d d0) {
        L.p(d0, "baseClass");
        super();
        this.a = d0;
        this.b = kotlinx.serialization.descriptors.i.f(("JsonContentPolymorphicSerializer<" + d0.u() + '>'), b.a, new f[0], null, 8, null);
    }

    @l
    protected abstract kotlinx.serialization.d a(@l kotlinx.serialization.json.l arg1);

    private final Void b(d d0, d d1) {
        String s = d0.u();
        if(s == null) {
            s = String.valueOf(d0);
        }
        throw new v("Class \'" + s + "\' is not registered for polymorphic serialization " + ("in the scope of \'" + d1.u() + '\'') + ".\nMark the base class as \'sealed\' or register the serializer explicitly.");
    }

    @Override  // kotlinx.serialization.d
    @l
    public final Object deserialize(@l e e0) {
        L.p(e0, "decoder");
        j j0 = p.d(e0);
        kotlinx.serialization.json.l l0 = j0.t();
        kotlinx.serialization.d d0 = this.a(l0);
        L.n(d0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
        return j0.d().f(((kotlinx.serialization.i)d0), l0);
    }

    @Override  // kotlinx.serialization.i
    @l
    public f getDescriptor() {
        return this.b;
    }

    @Override  // kotlinx.serialization.w
    public final void serialize(@l g g0, @l Object object0) {
        L.p(g0, "encoder");
        L.p(object0, "value");
        w w0 = g0.a().f(this.a, object0);
        if(w0 == null) {
            w0 = z.m(m0.d(object0.getClass()));
            if(w0 == null) {
                this.b(m0.d(object0.getClass()), this.a);
                throw new y();
            }
        }
        ((kotlinx.serialization.i)w0).serialize(g0, object0);
    }
}

