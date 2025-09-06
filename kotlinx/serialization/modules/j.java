package kotlinx.serialization.modules;

import kotlin.c0;
import kotlin.collections.Y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlin.m;
import y4.l;

public final class j {
    @l
    private static final f a;

    static {
        j.a = new d(Y.z(), Y.z(), Y.z(), Y.z(), Y.z());
    }

    @l
    public static final f a() {
        return j.a;
    }

    @k(level = m.a, message = "Deprecated in the favour of \'EmptySerializersModule()\'", replaceWith = @c0(expression = "EmptySerializersModule()", imports = {}))
    public static void b() {
    }

    @l
    public static final f c(@l f f0, @l f f1) {
        public static final class a implements i {
            final g a;

            a(g g0) {
                this.a = g0;
                super();
            }

            @Override  // kotlinx.serialization.modules.i
            public void a(@l kotlin.reflect.d d0, @l Function1 function10) {
                L.p(d0, "baseClass");
                L.p(function10, "defaultDeserializerProvider");
                this.a.i(d0, function10, true);
            }

            @Override  // kotlinx.serialization.modules.i
            public void b(@l kotlin.reflect.d d0, @l Function1 function10) {
                L.p(d0, "baseClass");
                L.p(function10, "defaultSerializerProvider");
                this.a.j(d0, function10, true);
            }

            @Override  // kotlinx.serialization.modules.i
            public void c(@l kotlin.reflect.d d0, @l kotlin.reflect.d d1, @l kotlinx.serialization.i i0) {
                L.p(d0, "baseClass");
                L.p(d1, "actualClass");
                L.p(i0, "actualSerializer");
                this.a.k(d0, d1, i0, true);
            }

            @Override  // kotlinx.serialization.modules.i
            public void d(@l kotlin.reflect.d d0, @l kotlinx.serialization.i i0) {
                L.p(d0, "kClass");
                L.p(i0, "serializer");
                kotlinx.serialization.modules.a.a a$a0 = new kotlinx.serialization.modules.a.a(i0);
                this.a.m(d0, a$a0, true);
            }

            @Override  // kotlinx.serialization.modules.i
            public void e(@l kotlin.reflect.d d0, @l Function1 function10) {
                kotlinx.serialization.modules.i.a.b(this, d0, function10);
            }

            @Override  // kotlinx.serialization.modules.i
            public void f(@l kotlin.reflect.d d0, @l Function1 function10) {
                L.p(d0, "kClass");
                L.p(function10, "provider");
                b a$b0 = new b(function10);
                this.a.m(d0, a$b0, true);
            }
        }

        L.p(f0, "<this>");
        L.p(f1, "other");
        g g0 = new g();
        g0.h(f0);
        f1.a(new a(g0));
        return g0.g();
    }

    @l
    public static final f d(@l f f0, @l f f1) {
        L.p(f0, "<this>");
        L.p(f1, "other");
        g g0 = new g();
        g0.h(f0);
        g0.h(f1);
        return g0.g();
    }
}

