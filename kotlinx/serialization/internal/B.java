package kotlinx.serialization.internal;

import kotlin.jvm.internal.L;
import kotlinx.serialization.d;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.h;
import kotlinx.serialization.i;
import kotlinx.serialization.n;
import kotlinx.serialization.v;
import kotlinx.serialization.w;
import y4.l;
import y4.m;

@h
public abstract class b implements i {
    private final Object b(c c0) {
        d d0 = n.a(this, c0, c0.i(this.getDescriptor(), 0));
        return kotlinx.serialization.encoding.c.b.d(c0, this.getDescriptor(), 1, d0, null, 8, null);
    }

    @h
    @m
    public d c(@l c c0, @m String s) {
        L.p(c0, "decoder");
        return c0.a().e(this.e(), s);
    }

    @h
    @m
    public w d(@l g g0, @l Object object0) {
        L.p(g0, "encoder");
        L.p(object0, "value");
        return g0.a().f(this.e(), object0);
    }

    @Override  // kotlinx.serialization.d
    @l
    public final Object deserialize(@l e e0) {
        Object object0;
        L.p(e0, "decoder");
        f f0 = this.getDescriptor();
        c c0 = e0.b(f0);
        kotlin.jvm.internal.l0.h l0$h0 = new kotlin.jvm.internal.l0.h();
        if(c0.k()) {
            object0 = this.b(c0);
            c0.c(f0);
            return object0;
        }
        object0 = null;
        while(true) {
            int v = c0.w(this.getDescriptor());
            switch(v) {
                case -1: {
                    if(object0 == null) {
                        throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String)l0$h0.a)).toString());
                    }
                    L.n(object0, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer.deserialize$lambda$3");
                    c0.c(f0);
                    return object0;
                }
                case 0: {
                    l0$h0.a = c0.i(this.getDescriptor(), 0);
                    break;
                }
                default: {
                    if(v != 1) {
                        StringBuilder stringBuilder0 = new StringBuilder();
                        stringBuilder0.append("Invalid index in polymorphic deserialization of ");
                        String s = (String)l0$h0.a;
                        if(s == null) {
                            s = "unknown class";
                        }
                        stringBuilder0.append(s);
                        stringBuilder0.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        stringBuilder0.append(v);
                        throw new v(stringBuilder0.toString());
                    }
                    Object object1 = l0$h0.a;
                    if(object1 == null) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                    }
                    l0$h0.a = object1;
                    d d0 = n.a(this, c0, ((String)object1));
                    object0 = kotlinx.serialization.encoding.c.b.d(c0, this.getDescriptor(), 1, d0, null, 8, null);
                    break;
                }
            }
        }
    }

    @l
    public abstract kotlin.reflect.d e();

    @Override  // kotlinx.serialization.w
    public final void serialize(@l g g0, @l Object object0) {
        L.p(g0, "encoder");
        L.p(object0, "value");
        w w0 = n.b(this, g0, object0);
        f f0 = this.getDescriptor();
        kotlinx.serialization.encoding.d d0 = g0.b(f0);
        d0.p(this.getDescriptor(), 0, w0.getDescriptor().h());
        f f1 = this.getDescriptor();
        L.n(w0, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        d0.G(f1, 1, w0, object0);
        d0.c(f0);
    }
}

