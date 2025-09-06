package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.jvm.internal.L;
import y4.l;

public final class Http2Connection.Listener.Companion.REFUSE_INCOMING_STREAMS.1 extends Listener {
    @Override  // okhttp3.internal.http2.Http2Connection$Listener
    public void onStream(@l Http2Stream http2Stream0) throws IOException {
        L.p(http2Stream0, "stream");
        http2Stream0.close(ErrorCode.REFUSED_STREAM, null);
    }
}

