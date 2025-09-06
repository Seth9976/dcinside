package okhttp3.internal.http;

import kotlin.jvm.internal.L;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.n;
import y4.l;
import y4.m;

public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    @m
    private final String contentTypeString;
    @l
    private final n source;

    public RealResponseBody(@m String s, long v, @l n n0) {
        L.p(n0, "source");
        super();
        this.contentTypeString = s;
        this.contentLength = v;
        this.source = n0;
    }

    @Override  // okhttp3.ResponseBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override  // okhttp3.ResponseBody
    @m
    public MediaType contentType() {
        return this.contentTypeString == null ? null : MediaType.Companion.parse(this.contentTypeString);
    }

    @Override  // okhttp3.ResponseBody
    @l
    public n source() {
        return this.source;
    }
}

