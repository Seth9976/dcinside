package kotlinx.serialization.modules;

import java.util.List;
import kotlin.c0;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import kotlin.reflect.d;
import y4.l;

public abstract class f {
    private f() {
    }

    public f(w w0) {
    }

    @kotlinx.serialization.f
    public abstract void a(@l i arg1);

    @k(level = m.c, message = "Deprecated in favor of overload with default parameter", replaceWith = @c0(expression = "getContextual(kclass)", imports = {}))
    @kotlinx.serialization.f
    public final kotlinx.serialization.i b(d d0) {
        L.p(d0, "kclass");
        return this.c(d0, u.H());
    }

    @kotlinx.serialization.f
    @y4.m
    public abstract kotlinx.serialization.i c(@l d arg1, @l List arg2);

    public static kotlinx.serialization.i d(f f0, d d0, List list0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if((v & 2) != 0) {
            list0 = u.H();
        }
        return f0.c(d0, list0);
    }

    @kotlinx.serialization.f
    @y4.m
    public abstract kotlinx.serialization.d e(@l d arg1, @y4.m String arg2);

    @kotlinx.serialization.f
    @y4.m
    public abstract kotlinx.serialization.w f(@l d arg1, @l Object arg2);
}

