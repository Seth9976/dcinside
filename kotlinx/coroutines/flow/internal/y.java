package kotlinx.coroutines.flow.internal;

import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlinx.coroutines.E0;
import kotlinx.coroutines.channels.G;
import kotlinx.coroutines.flow.j;
import y4.l;
import y4.m;

@E0
public final class y implements j {
    @l
    private final G a;

    public y(@l G g0) {
        this.a = g0;
    }

    @Override  // kotlinx.coroutines.flow.j
    @m
    public Object emit(Object object0, @l d d0) {
        Object object1 = this.a.I(object0, d0);
        return object1 == b.l() ? object1 : S0.a;
    }
}

