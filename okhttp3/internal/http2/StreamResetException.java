package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.jvm.internal.L;
import y4.l;
import z3.f;

public final class StreamResetException extends IOException {
    @l
    @f
    public final ErrorCode errorCode;

    public StreamResetException(@l ErrorCode errorCode0) {
        L.p(errorCode0, "errorCode");
        super("stream was reset: " + errorCode0);
        this.errorCode = errorCode0;
    }
}

