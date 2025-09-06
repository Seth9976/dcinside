package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import okhttp3.internal.http1.HeadersReader;
import okio.Z;
import okio.c0;
import okio.n;
import okio.o0;
import okio.o;
import okio.q0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nMultipartReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1#2:211\n*E\n"})
public final class MultipartReader implements Closeable {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final c0 getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }
    }

    public static final class Part implements Closeable {
        @l
        private final n body;
        @l
        private final Headers headers;

        public Part(@l Headers headers0, @l n n0) {
            L.p(headers0, "headers");
            L.p(n0, "body");
            super();
            this.headers = headers0;
            this.body = n0;
        }

        @l
        @i(name = "body")
        public final n body() {
            return this.body;
        }

        @Override
        public void close() {
            this.body.close();
        }

        @l
        @i(name = "headers")
        public final Headers headers() {
            return this.headers;
        }
    }

    @s0({"SMAP\nMultipartReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader$PartSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timeout.kt\nokio/Timeout\n*L\n1#1,210:1\n1#2:211\n268#3,26:212\n*S KotlinDebug\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader$PartSource\n*L\n159#1:212,26\n*E\n"})
    final class PartSource implements o0 {
        @l
        private final q0 timeout;

        public PartSource() {
            this.timeout = new q0();
        }

        @Override  // okio.o0
        public void close() {
            if(L.g(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        @Override  // okio.o0
        public long read(@l okio.l l0, long v) {
            long v8;
            long v6;
            L.p(l0, "sink");
            if(v < 0L) {
                throw new IllegalArgumentException(("byteCount < 0: " + v).toString());
            }
            if(!L.g(MultipartReader.this.currentPart, this)) {
                throw new IllegalStateException("closed");
            }
            q0 q00 = MultipartReader.this.source.timeout();
            q0 q01 = this.timeout;
            MultipartReader multipartReader0 = MultipartReader.this;
            long v1 = q00.timeoutNanos();
            long v2 = q01.timeoutNanos();
            long v3 = q00.timeoutNanos();
            TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
            q00.timeout(q0.Companion.a(v2, v3), timeUnit0);
            if(q00.hasDeadline()) {
                long v4 = q00.deadlineNanoTime();
                if(q01.hasDeadline()) {
                    q00.deadlineNanoTime(Math.min(q00.deadlineNanoTime(), q01.deadlineNanoTime()));
                }
                try {
                    long v5 = multipartReader0.currentPartBytesRemaining(v);
                    v6 = v5 == 0L ? -1L : multipartReader0.source.read(l0, v5);
                }
                catch(Throwable throwable0) {
                    q00.timeout(v1, TimeUnit.NANOSECONDS);
                    if(q01.hasDeadline()) {
                        q00.deadlineNanoTime(v4);
                    }
                    throw throwable0;
                }
                q00.timeout(v1, timeUnit0);
                if(q01.hasDeadline()) {
                    q00.deadlineNanoTime(v4);
                }
                return v6;
            }
            if(q01.hasDeadline()) {
                q00.deadlineNanoTime(q01.deadlineNanoTime());
            }
            try {
                long v7 = multipartReader0.currentPartBytesRemaining(v);
                v8 = v7 == 0L ? -1L : multipartReader0.source.read(l0, v7);
            }
            catch(Throwable throwable1) {
                q00.timeout(v1, TimeUnit.NANOSECONDS);
                if(q01.hasDeadline()) {
                    q00.clearDeadline();
                }
                throw throwable1;
            }
            q00.timeout(v1, timeUnit0);
            if(q01.hasDeadline()) {
                q00.clearDeadline();
            }
            return v8;
        }

        @Override  // okio.o0
        @l
        public q0 timeout() {
            return this.timeout;
        }
    }

    @l
    public static final Companion Companion;
    @l
    private static final c0 afterBoundaryOptions;
    @l
    private final String boundary;
    private boolean closed;
    @l
    private final o crlfDashDashBoundary;
    @m
    private PartSource currentPart;
    @l
    private final o dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    @l
    private final n source;

    static {
        MultipartReader.Companion = new Companion(null);
        o[] arr_o = {o.d.l("\r\n"), o.d.l("--"), o.d.l(" "), o.d.l("\t")};
        MultipartReader.afterBoundaryOptions = c0.e.d(arr_o);
    }

    public MultipartReader(@l ResponseBody responseBody0) throws IOException {
        L.p(responseBody0, "response");
        n n0 = responseBody0.source();
        MediaType mediaType0 = responseBody0.contentType();
        if(mediaType0 != null) {
            String s = mediaType0.parameter("boundary");
            if(s != null) {
                this(n0, s);
                return;
            }
        }
        throw new ProtocolException("expected the Content-Type to have a boundary parameter");
    }

    public MultipartReader(@l n n0, @l String s) throws IOException {
        L.p(n0, "source");
        L.p(s, "boundary");
        super();
        this.source = n0;
        this.boundary = s;
        this.dashDashBoundary = new okio.l().b3("--").b3(s).B1();
        this.crlfDashDashBoundary = new okio.l().b3("\r\n--").b3(s).B1();
    }

    @l
    @i(name = "boundary")
    public final String boundary() {
        return this.boundary;
    }

    @Override
    public void close() throws IOException {
        if(this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    private final long currentPartBytesRemaining(long v) {
        long v1 = (long)this.crlfDashDashBoundary.h0();
        this.source.X2(v1);
        long v2 = this.source.E().S(this.crlfDashDashBoundary);
        return v2 == -1L ? Math.min(v, this.source.E().size() - ((long)this.crlfDashDashBoundary.h0()) + 1L) : Math.min(v, v2);
    }

    @m
    public final Part nextPart() throws IOException {
        if(this.closed) {
            throw new IllegalStateException("closed");
        }
        if(this.noMoreParts) {
            return null;
        }
        if(this.partCount != 0 || !this.source.a0(0L, this.dashDashBoundary)) {
            long v1;
            while((v1 = this.currentPartBytesRemaining(0x2000L)) != 0L) {
                this.source.skip(v1);
            }
            long v2 = (long)this.crlfDashDashBoundary.h0();
            this.source.skip(v2);
        }
        else {
            long v = (long)this.dashDashBoundary.h0();
            this.source.skip(v);
        }
        boolean z = false;
        int v3;
        while((v3 = this.source.X3(MultipartReader.afterBoundaryOptions)) != -1) {
            switch(v3) {
                case 0: {
                    ++this.partCount;
                    Headers headers0 = new HeadersReader(this.source).readHeaders();
                    PartSource multipartReader$PartSource0 = new PartSource(this);
                    this.currentPart = multipartReader$PartSource0;
                    return new Part(headers0, Z.e(multipartReader$PartSource0));
                }
                case 1: {
                    if(z) {
                        throw new ProtocolException("unexpected characters after boundary");
                    }
                    if(this.partCount == 0) {
                        throw new ProtocolException("expected at least 1 part");
                    }
                    this.noMoreParts = true;
                    return null;
                label_29:
                    if(v3 == 2 || v3 == 3) {
                        break;
                    }
                    continue;
                }
                default: {
                    goto label_29;
                }
            }
            z = true;
        }
        throw new ProtocolException("unexpected characters after boundary");
    }
}

