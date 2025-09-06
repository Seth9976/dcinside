package kotlin;

import kotlin.coroutines.d;
import kotlin.coroutines.j;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@W0(markerClass = {r.class})
@j
@h0(version = "1.7")
public abstract class i {
    private i() {
    }

    public i(w w0) {
    }

    @m
    public abstract Object a(Object arg1, @l d arg2);

    @m
    public abstract Object b(@l g arg1, Object arg2, @l d arg3);

    @k(level = kotlin.m.b, message = "\'invoke\' should not be called from DeepRecursiveScope. Use \'callRecursive\' to do recursion in the heap instead of the call stack.", replaceWith = @c0(expression = "this.callRecursive(value)", imports = {}))
    @l
    public final Void d(@l g g0, @m Object object0) {
        L.p(g0, "<this>");
        throw new UnsupportedOperationException("Should not be called from DeepRecursiveScope");
    }
}

