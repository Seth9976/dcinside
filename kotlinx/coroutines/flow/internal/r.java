package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.g;
import kotlinx.coroutines.E0;
import kotlinx.coroutines.flow.i;
import y4.l;

@E0
public interface r extends i {
    public static final class a {
        public static i a(r r0, g g0, int v, kotlinx.coroutines.channels.i i0, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if((v1 & 1) != 0) {
                g0 = kotlin.coroutines.i.a;
            }
            if((v1 & 2) != 0) {
                v = -3;
            }
            if((v1 & 4) != 0) {
                i0 = kotlinx.coroutines.channels.i.a;
            }
            return r0.c(g0, v, i0);
        }
    }

    @l
    i c(@l g arg1, int arg2, @l kotlinx.coroutines.channels.i arg3);
}

