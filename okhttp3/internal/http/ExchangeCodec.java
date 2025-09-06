package okhttp3.internal.http;

import java.io.IOException;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response.Builder;
import okhttp3.Response;
import okhttp3.internal.connection.RealConnection;
import okio.m0;
import okio.o0;
import y4.l;
import y4.m;

public interface ExchangeCodec {
    public static final class Companion {
        static final Companion $$INSTANCE = null;
        public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

        static {
            Companion.$$INSTANCE = new Companion();
        }
    }

    @l
    public static final Companion Companion = null;
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

    static {
        ExchangeCodec.Companion = Companion.$$INSTANCE;
    }

    void cancel();

    @l
    m0 createRequestBody(@l Request arg1, long arg2) throws IOException;

    void finishRequest() throws IOException;

    void flushRequest() throws IOException;

    @l
    RealConnection getConnection();

    @l
    o0 openResponseBodySource(@l Response arg1) throws IOException;

    @m
    Builder readResponseHeaders(boolean arg1) throws IOException;

    long reportedContentLength(@l Response arg1) throws IOException;

    @l
    Headers trailers() throws IOException;

    void writeRequestHeaders(@l Request arg1) throws IOException;
}

