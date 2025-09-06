package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.S0;
import kotlin.b0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.descriptors.k.d;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.i;
import kotlinx.serialization.v;
import y4.l;

@b0
public final class p0 implements i {
    @l
    private final Object a;
    @l
    private List b;
    @l
    private final D c;

    public p0(@l String s, @l Object object0) {
        static final class a extends N implements A3.a {
            final String e;
            final p0 f;

            a(String s, p0 p00) {
                this.e = s;
                this.f = p00;
                super(0);
            }

            @l
            public final f b() {
                static final class kotlinx.serialization.internal.p0.a.a extends N implements Function1 {
                    final p0 e;

                    kotlinx.serialization.internal.p0.a.a(p0 p00) {
                        this.e = p00;
                        super(1);
                    }

                    public final void a(@l kotlinx.serialization.descriptors.a a0) {
                        L.p(a0, "$this$buildSerialDescriptor");
                        a0.l(this.e.b);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((kotlinx.serialization.descriptors.a)object0));
                        return S0.a;
                    }
                }

                kotlinx.serialization.internal.p0.a.a p0$a$a0 = new kotlinx.serialization.internal.p0.a.a(this.f);
                return kotlinx.serialization.descriptors.i.e(this.e, d.a, new f[0], p0$a$a0);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(s, "serialName");
        L.p(object0, "objectInstance");
        super();
        this.a = object0;
        this.b = u.H();
        a p0$a0 = new a(s, this);
        this.c = E.c(H.b, p0$a0);
    }

    @b0
    public p0(@l String s, @l Object object0, @l Annotation[] arr_annotation) {
        L.p(s, "serialName");
        L.p(object0, "objectInstance");
        L.p(arr_annotation, "classAnnotations");
        this(s, object0);
        this.b = kotlin.collections.l.t(arr_annotation);
    }

    @Override  // kotlinx.serialization.d
    @l
    public Object deserialize(@l e e0) {
        L.p(e0, "decoder");
        f f0 = this.getDescriptor();
        c c0 = e0.b(f0);
        int v = c0.w(this.getDescriptor());
        if(v != -1) {
            throw new v("Unexpected index " + v);
        }
        c0.c(f0);
        return this.a;
    }

    @Override  // kotlinx.serialization.i
    @l
    public f getDescriptor() {
        return (f)this.c.getValue();
    }

    @Override  // kotlinx.serialization.w
    public void serialize(@l g g0, @l Object object0) {
        L.p(g0, "encoder");
        L.p(object0, "value");
        g0.b(this.getDescriptor()).c(this.getDescriptor());
    }
}

