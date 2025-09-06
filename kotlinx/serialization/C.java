package kotlinx.serialization;

import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import kotlin.y;
import kotlinx.serialization.descriptors.b;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.internal.u0;
import kotlinx.serialization.internal.y0;
import y4.l;
import y4.m;

@f
public final class c implements i {
    @l
    private final d a;
    @m
    private final i b;
    @l
    private final List c;
    @l
    private final kotlinx.serialization.descriptors.f d;

    public c(@l d d0) {
        L.p(d0, "serializableClass");
        this(d0, null, y0.a);
    }

    public c(@l d d0, @m i i0, @l i[] arr_i) {
        static final class a extends N implements Function1 {
            final c e;

            a(c c0) {
                this.e = c0;
                super(1);
            }

            public final void a(@l kotlinx.serialization.descriptors.a a0) {
                List list0;
                L.p(a0, "$this$buildSerialDescriptor");
                i i0 = this.e.b;
                if(i0 == null) {
                    list0 = null;
                }
                else {
                    kotlinx.serialization.descriptors.f f0 = i0.getDescriptor();
                    list0 = f0 == null ? null : f0.getAnnotations();
                }
                if(list0 == null) {
                    list0 = u.H();
                }
                a0.l(list0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((kotlinx.serialization.descriptors.a)object0));
                return S0.a;
            }
        }

        L.p(d0, "serializableClass");
        L.p(arr_i, "typeArgumentsSerializers");
        super();
        this.a = d0;
        this.b = i0;
        this.c = kotlin.collections.l.t(arr_i);
        a c$a0 = new a(this);
        this.d = b.e(kotlinx.serialization.descriptors.i.e("kotlinx.serialization.ContextualSerializer", kotlinx.serialization.descriptors.j.a.a, new kotlinx.serialization.descriptors.f[0], c$a0), d0);
    }

    private final i b(kotlinx.serialization.modules.f f0) {
        i i0 = f0.c(this.a, this.c);
        if(i0 == null) {
            i0 = this.b;
            if(i0 == null) {
                u0.i(this.a);
                throw new y();
            }
        }
        return i0;
    }

    @Override  // kotlinx.serialization.d
    @l
    public Object deserialize(@l e e0) {
        L.p(e0, "decoder");
        return e0.G(this.b(e0.a()));
    }

    @Override  // kotlinx.serialization.i
    @l
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return this.d;
    }

    @Override  // kotlinx.serialization.w
    public void serialize(@l g g0, @l Object object0) {
        L.p(g0, "encoder");
        L.p(object0, "value");
        g0.e(this.b(g0.a()), object0);
    }
}

