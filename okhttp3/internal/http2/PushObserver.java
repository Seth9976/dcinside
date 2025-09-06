package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.L;
import okio.n;
import y4.l;
import z3.f;

public interface PushObserver {
    public static final class Companion {
        static final class PushObserverCancel implements PushObserver {
            @Override  // okhttp3.internal.http2.PushObserver
            public boolean onData(int v, @l n n0, int v1, boolean z) throws IOException {
                L.p(n0, "source");
                n0.skip(((long)v1));
                return true;
            }

            @Override  // okhttp3.internal.http2.PushObserver
            public boolean onHeaders(int v, @l List list0, boolean z) {
                L.p(list0, "responseHeaders");
                return true;
            }

            @Override  // okhttp3.internal.http2.PushObserver
            public boolean onRequest(int v, @l List list0) {
                L.p(list0, "requestHeaders");
                return true;
            }

            @Override  // okhttp3.internal.http2.PushObserver
            public void onReset(int v, @l ErrorCode errorCode0) {
                L.p(errorCode0, "errorCode");
            }
        }

        static final Companion $$INSTANCE;

        static {
            Companion.$$INSTANCE = new Companion();
        }
    }

    @l
    @f
    public static final PushObserver CANCEL;
    @l
    public static final Companion Companion;

    static {
        PushObserver.Companion = Companion.$$INSTANCE;
        PushObserver.CANCEL = new PushObserverCancel();
    }

    boolean onData(int arg1, @l n arg2, int arg3, boolean arg4) throws IOException;

    boolean onHeaders(int arg1, @l List arg2, boolean arg3);

    boolean onRequest(int arg1, @l List arg2);

    void onReset(int arg1, @l ErrorCode arg2);
}

