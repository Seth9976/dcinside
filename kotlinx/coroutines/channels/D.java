package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.c0;
import kotlin.k;
import kotlin.m;
import kotlinx.coroutines.Z0;
import y4.l;

@k(level = m.a, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
@Z0
public interface d extends G {
    public static final class a {
        public static void a(d d0, CancellationException cancellationException0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if((v & 1) != 0) {
                cancellationException0 = null;
            }
            d0.e(cancellationException0);
        }

        public static boolean b(d d0, Throwable throwable0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if((v & 1) != 0) {
                throwable0 = null;
            }
            return d0.c(throwable0);
        }

        @k(level = m.b, message = "Deprecated in the favour of \'trySend\' method", replaceWith = @c0(expression = "trySend(element).isSuccess", imports = {}))
        public static boolean c(@l d d0, Object object0) {
            return kotlinx.coroutines.channels.G.a.c(d0, object0);
        }
    }

    @k(level = m.c, message = "Binary compatibility only")
    boolean c(Throwable arg1);

    void e(@y4.m CancellationException arg1);

    @l
    F g();
}

