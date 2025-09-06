package okhttp3.internal.http1;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import okhttp3.Headers.Builder;
import okhttp3.Headers;
import okio.n;
import y4.l;

public final class HeadersReader {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion = null;
    private static final int HEADER_LIMIT = 0x40000;
    private long headerLimit;
    @l
    private final n source;

    static {
        HeadersReader.Companion = new Companion(null);
    }

    public HeadersReader(@l n n0) {
        L.p(n0, "source");
        super();
        this.source = n0;
        this.headerLimit = 0x40000L;
    }

    @l
    public final n getSource() {
        return this.source;
    }

    @l
    public final Headers readHeaders() {
        Builder headers$Builder0 = new Builder();
        while(true) {
            String s = this.readLine();
            if(s.length() == 0) {
                break;
            }
            headers$Builder0.addLenient$okhttp(s);
        }
        return headers$Builder0.build();
    }

    @l
    public final String readLine() {
        String s = this.source.q2(this.headerLimit);
        this.headerLimit -= (long)s.length();
        return s;
    }
}

