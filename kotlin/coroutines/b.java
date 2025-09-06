package kotlin.coroutines;

import kotlin.h0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.r;
import y4.l;
import y4.m;

@h0(version = "1.3")
@r
public abstract class b implements c {
    @l
    private final Function1 a;
    @l
    private final c b;

    public b(@l c g$c0, @l Function1 function10) {
        L.p(g$c0, "baseKey");
        L.p(function10, "safeCast");
        super();
        this.a = function10;
        if(g$c0 instanceof b) {
            g$c0 = ((b)g$c0).b;
        }
        this.b = g$c0;
    }

    public final boolean a(@l c g$c0) {
        L.p(g$c0, "key");
        return g$c0 == this || this.b == g$c0;
    }

    @m
    public final kotlin.coroutines.g.b b(@l kotlin.coroutines.g.b g$b0) {
        L.p(g$b0, "element");
        return (kotlin.coroutines.g.b)this.a.invoke(g$b0);
    }
}

