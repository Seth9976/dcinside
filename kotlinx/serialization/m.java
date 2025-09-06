package kotlinx.serialization;

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
import kotlin.jvm.internal.u0;
import kotlin.reflect.d;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.descriptors.i;
import kotlinx.serialization.internal.b;
import y4.l;

public final class m extends b {
    @l
    private final d a;
    @l
    private List b;
    @l
    private final D c;

    public m(@l d d0) {
        static final class a extends N implements A3.a {
            final m e;

            a(m m0) {
                this.e = m0;
                super(0);
            }

            @l
            public final f b() {
                static final class kotlinx.serialization.m.a.a extends N implements Function1 {
                    final m e;

                    kotlinx.serialization.m.a.a(m m0) {
                        this.e = m0;
                        super(1);
                    }

                    public final void a(@l kotlinx.serialization.descriptors.a a0) {
                        L.p(a0, "$this$buildSerialDescriptor");
                        kotlinx.serialization.descriptors.a.b(a0, "type", P3.a.J(u0.a).getDescriptor(), null, false, 12, null);
                        kotlinx.serialization.descriptors.a.b(a0, "value", i.f(("kotlinx.serialization.Polymorphic<" + this.e.e().u() + '>'), kotlinx.serialization.descriptors.j.a.a, new f[0], null, 8, null), null, false, 12, null);
                        a0.l(this.e.b);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((kotlinx.serialization.descriptors.a)object0));
                        return S0.a;
                    }
                }

                kotlinx.serialization.m.a.a m$a$a0 = new kotlinx.serialization.m.a.a(this.e);
                return kotlinx.serialization.descriptors.b.e(i.e("kotlinx.serialization.Polymorphic", kotlinx.serialization.descriptors.d.a.a, new f[0], m$a$a0), this.e.e());
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(d0, "baseClass");
        super();
        this.a = d0;
        this.b = u.H();
        a m$a0 = new a(this);
        this.c = E.c(H.b, m$a0);
    }

    @b0
    public m(@l d d0, @l Annotation[] arr_annotation) {
        L.p(d0, "baseClass");
        L.p(arr_annotation, "classAnnotations");
        this(d0);
        this.b = kotlin.collections.l.t(arr_annotation);
    }

    @Override  // kotlinx.serialization.internal.b
    @l
    public d e() {
        return this.a;
    }

    @Override  // kotlinx.serialization.i
    @l
    public f getDescriptor() {
        return (f)this.c.getValue();
    }

    @Override
    @l
    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.e() + ')';
    }
}

