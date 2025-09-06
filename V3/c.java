package v3;

import kotlin.h0;
import kotlin.internal.b;
import kotlin.v;
import y4.l;
import y4.m;

@h0(version = "1.3")
@b
@f
public interface c {
    public static final class a {
        public static v3.a a(c c0, v v0, g g0, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callsInPlace");
            }
            if((v1 & 2) != 0) {
                g0 = g.d;
            }
            return c0.d(v0, g0);
        }
    }

    @b
    @l
    h a();

    @b
    @l
    h b(@m Object arg1);

    @b
    @l
    i c();

    @b
    @l
    v3.a d(@l v arg1, @l g arg2);
}

