package kotlinx.serialization.modules;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import kotlinx.serialization.f;
import y4.l;

@f
public interface i {
    public static final class a {
        public static void a(@l i i0, @l d d0, @l kotlinx.serialization.i i1) {
            static final class kotlinx.serialization.modules.i.a.a extends N implements Function1 {
                final kotlinx.serialization.i e;

                kotlinx.serialization.modules.i.a.a(kotlinx.serialization.i i0) {
                    this.e = i0;
                    super(1);
                }

                @l
                public final kotlinx.serialization.i a(@l List list0) {
                    L.p(list0, "it");
                    return this.e;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((List)object0));
                }
            }

            L.p(d0, "kClass");
            L.p(i1, "serializer");
            i0.f(d0, new kotlinx.serialization.modules.i.a.a(i1));
        }

        public static void b(@l i i0, @l d d0, @l Function1 function10) {
            L.p(d0, "baseClass");
            L.p(function10, "defaultDeserializerProvider");
            i0.a(d0, function10);
        }
    }

    @f
    void a(@l d arg1, @l Function1 arg2);

    @f
    void b(@l d arg1, @l Function1 arg2);

    void c(@l d arg1, @l d arg2, @l kotlinx.serialization.i arg3);

    void d(@l d arg1, @l kotlinx.serialization.i arg2);

    void e(@l d arg1, @l Function1 arg2);

    void f(@l d arg1, @l Function1 arg2);
}

