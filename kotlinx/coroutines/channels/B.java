package kotlinx.coroutines.channels;

import A3.o;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.J;
import kotlinx.coroutines.O;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.Q;
import kotlinx.coroutines.Z0;
import y4.l;
import y4.m;

public final class b {
    @Z0
    @l
    public static final G a(@l O o0, @l g g0, int v, @l Q q0, @m Function1 function10, @l o o1) {
        G g1 = new a(J.e(o0, g0), kotlinx.coroutines.channels.o.d(v, null, null, 6, null), true);
        if(function10 != null) {
            ((Q0)g1).w(function10);
        }
        ((kotlinx.coroutines.a)g1).P1(q0, g1, o1);
        return g1;
    }

    public static G b(O o0, g g0, int v, Q q0, Function1 function10, o o1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            g0 = i.a;
        }
        if((v1 & 4) != 0) {
            q0 = Q.a;
        }
        if((v1 & 8) != 0) {
            function10 = null;
        }
        return b.a(o0, g0, ((v1 & 2) == 0 ? v : 0), q0, function10, o1);
    }
}

