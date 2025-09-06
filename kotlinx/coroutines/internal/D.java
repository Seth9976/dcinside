package kotlinx.coroutines.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import y4.m;

@IgnoreJRERequirement
final class d extends l {
    public static final class a extends ClassValue {
        @y4.l
        protected Function1 a(@m Class class0) {
            L.n(class0, "null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
            return q.b(class0);
        }

        @Override
        public Object computeValue(Class class0) {
            return this.a(class0);
        }
    }

    @y4.l
    public static final d a;
    @y4.l
    private static final a b;

    static {
        d.a = new d();
        d.b = new a();
    }

    @Override  // kotlinx.coroutines.internal.l
    @y4.l
    public Function1 a(@y4.l Class class0) {
        return (Function1)d.b.get(class0);
    }
}

