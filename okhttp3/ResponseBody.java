package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.S0;
import kotlin.c0;
import kotlin.io.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.text.f;
import okhttp3.internal.Util;
import okio.n;
import okio.o;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nResponseBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody\n*L\n1#1,321:1\n140#1,11:322\n140#1,11:333\n*S KotlinDebug\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody\n*L\n124#1:322,11\n134#1:333,11\n*E\n"})
public abstract class ResponseBody implements Closeable {
    @s0({"SMAP\nResponseBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody$BomAwareReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,321:1\n1#2:322\n*E\n"})
    public static final class BomAwareReader extends Reader {
        @l
        private final Charset charset;
        private boolean closed;
        @m
        private Reader delegate;
        @l
        private final n source;

        public BomAwareReader(@l n n0, @l Charset charset0) {
            L.p(n0, "source");
            L.p(charset0, "charset");
            super();
            this.source = n0;
            this.charset = charset0;
        }

        @Override
        public void close() throws IOException {
            S0 s00;
            this.closed = true;
            Reader reader0 = this.delegate;
            if(reader0 == null) {
                s00 = null;
            }
            else {
                reader0.close();
                s00 = S0.a;
            }
            if(s00 == null) {
                this.source.close();
            }
        }

        @Override
        public int read(@l char[] arr_c, int v, int v1) throws IOException {
            L.p(arr_c, "cbuf");
            if(this.closed) {
                throw new IOException("Stream closed");
            }
            Reader reader0 = this.delegate;
            if(reader0 == null) {
                reader0 = new InputStreamReader(this.source.J(), Util.readBomAsCharset(this.source, this.charset));
                this.delegate = reader0;
            }
            return reader0.read(arr_c, v, v1);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        @i(name = "create")
        @z3.n
        public final ResponseBody create(@l String s, @m MediaType mediaType0) {
            L.p(s, "<this>");
            Charset charset0 = f.b;
            if(mediaType0 != null) {
                Charset charset1 = MediaType.charset$default(mediaType0, null, 1, null);
                if(charset1 == null) {
                    mediaType0 = MediaType.Companion.parse(mediaType0 + "; charset=utf-8");
                }
                else {
                    charset0 = charset1;
                }
            }
            okio.l l0 = new okio.l().L2(s, charset0);
            return this.create(l0, mediaType0, l0.size());
        }

        @k(level = kotlin.m.a, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @c0(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
        @l
        @z3.n
        public final ResponseBody create(@m MediaType mediaType0, long v, @l n n0) {
            L.p(n0, "content");
            return this.create(n0, mediaType0, v);
        }

        @k(level = kotlin.m.a, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @c0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @l
        @z3.n
        public final ResponseBody create(@m MediaType mediaType0, @l String s) {
            L.p(s, "content");
            return this.create(s, mediaType0);
        }

        @k(level = kotlin.m.a, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @c0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @l
        @z3.n
        public final ResponseBody create(@m MediaType mediaType0, @l o o0) {
            L.p(o0, "content");
            return this.create(o0, mediaType0);
        }

        @k(level = kotlin.m.a, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @c0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @l
        @z3.n
        public final ResponseBody create(@m MediaType mediaType0, @l byte[] arr_b) {
            L.p(arr_b, "content");
            return this.create(arr_b, mediaType0);
        }

        @l
        @i(name = "create")
        @z3.n
        public final ResponseBody create(@l n n0, @m MediaType mediaType0, long v) {
            L.p(n0, "<this>");
            return new ResponseBody() {
                @Override  // okhttp3.ResponseBody
                public long contentLength() {
                    return n0;
                }

                @Override  // okhttp3.ResponseBody
                @m
                public MediaType contentType() {
                    return v;
                }

                @Override  // okhttp3.ResponseBody
                @l
                public n source() {
                    return this.$this_asResponseBody;
                }
            };
        }

        @l
        @i(name = "create")
        @z3.n
        public final ResponseBody create(@l o o0, @m MediaType mediaType0) {
            L.p(o0, "<this>");
            return this.create(new okio.l().t1(o0), mediaType0, ((long)o0.h0()));
        }

        @l
        @i(name = "create")
        @z3.n
        public final ResponseBody create(@l byte[] arr_b, @m MediaType mediaType0) {
            L.p(arr_b, "<this>");
            return this.create(new okio.l().Q1(arr_b), mediaType0, ((long)arr_b.length));
        }

        public static ResponseBody create$default(Companion responseBody$Companion0, String s, MediaType mediaType0, int v, Object object0) {
            if((v & 1) != 0) {
                mediaType0 = null;
            }
            return responseBody$Companion0.create(s, mediaType0);
        }

        public static ResponseBody create$default(Companion responseBody$Companion0, n n0, MediaType mediaType0, long v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                mediaType0 = null;
            }
            if((v1 & 2) != 0) {
                v = -1L;
            }
            return responseBody$Companion0.create(n0, mediaType0, v);
        }

        public static ResponseBody create$default(Companion responseBody$Companion0, o o0, MediaType mediaType0, int v, Object object0) {
            if((v & 1) != 0) {
                mediaType0 = null;
            }
            return responseBody$Companion0.create(o0, mediaType0);
        }

        public static ResponseBody create$default(Companion responseBody$Companion0, byte[] arr_b, MediaType mediaType0, int v, Object object0) {
            if((v & 1) != 0) {
                mediaType0 = null;
            }
            return responseBody$Companion0.create(arr_b, mediaType0);
        }
    }

    @l
    public static final Companion Companion;
    @m
    private Reader reader;

    static {
        ResponseBody.Companion = new Companion(null);
    }

    @l
    public final InputStream byteStream() {
        return this.source().J();
    }

    @l
    public final o byteString() throws IOException {
        o o0;
        long v = this.contentLength();
        if(v > 0x7FFFFFFFL) {
            throw new IOException("Cannot buffer entire body for content length: " + v);
        }
        n n0 = this.source();
        try {
            o0 = n0.B1();
        }
        catch(Throwable throwable0) {
            c.a(n0, throwable0);
            throw throwable0;
        }
        c.a(n0, null);
        int v1 = o0.h0();
        if(v != -1L && v != ((long)v1)) {
            throw new IOException("Content-Length (" + v + ") and stream length (" + v1 + ") disagree");
        }
        return o0;
    }

    @l
    public final byte[] bytes() throws IOException {
        byte[] arr_b;
        long v = this.contentLength();
        if(v > 0x7FFFFFFFL) {
            throw new IOException("Cannot buffer entire body for content length: " + v);
        }
        n n0 = this.source();
        try {
            arr_b = n0.Z0();
        }
        catch(Throwable throwable0) {
            c.a(n0, throwable0);
            throw throwable0;
        }
        c.a(n0, null);
        if(v != -1L && v != ((long)arr_b.length)) {
            throw new IOException("Content-Length (" + v + ") and stream length (" + arr_b.length + ") disagree");
        }
        return arr_b;
    }

    @l
    public final Reader charStream() {
        Reader reader0 = this.reader;
        if(reader0 == null) {
            reader0 = new BomAwareReader(this.source(), this.charset());
            this.reader = reader0;
        }
        return reader0;
    }

    private final Charset charset() {
        MediaType mediaType0 = this.contentType();
        if(mediaType0 != null) {
            Charset charset0 = mediaType0.charset(f.b);
            return charset0 == null ? f.b : charset0;
        }
        return f.b;
    }

    @Override
    public void close() {
        Util.closeQuietly(this.source());
    }

    private final Object consumeSource(Function1 function10, Function1 function11) {
        Object object0;
        long v = this.contentLength();
        if(v > 0x7FFFFFFFL) {
            throw new IOException("Cannot buffer entire body for content length: " + v);
        }
        n n0 = this.source();
        try {
            object0 = function10.invoke(n0);
        }
        catch(Throwable throwable0) {
            c.a(n0, throwable0);
            throw throwable0;
        }
        c.a(n0, null);
        int v1 = ((Number)function11.invoke(object0)).intValue();
        if(v != -1L && v != ((long)v1)) {
            throw new IOException("Content-Length (" + v + ") and stream length (" + v1 + ") disagree");
        }
        return object0;
    }

    public abstract long contentLength();

    @m
    public abstract MediaType contentType();

    @l
    @i(name = "create")
    @z3.n
    public static final ResponseBody create(@l String s, @m MediaType mediaType0) {
        return ResponseBody.Companion.create(s, mediaType0);
    }

    @k(level = kotlin.m.a, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @c0(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    @l
    @z3.n
    public static final ResponseBody create(@m MediaType mediaType0, long v, @l n n0) {
        return ResponseBody.Companion.create(mediaType0, v, n0);
    }

    @k(level = kotlin.m.a, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @c0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @l
    @z3.n
    public static final ResponseBody create(@m MediaType mediaType0, @l String s) {
        return ResponseBody.Companion.create(mediaType0, s);
    }

    @k(level = kotlin.m.a, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @c0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @l
    @z3.n
    public static final ResponseBody create(@m MediaType mediaType0, @l o o0) {
        return ResponseBody.Companion.create(mediaType0, o0);
    }

    @k(level = kotlin.m.a, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @c0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @l
    @z3.n
    public static final ResponseBody create(@m MediaType mediaType0, @l byte[] arr_b) {
        return ResponseBody.Companion.create(mediaType0, arr_b);
    }

    @l
    @i(name = "create")
    @z3.n
    public static final ResponseBody create(@l n n0, @m MediaType mediaType0, long v) {
        return ResponseBody.Companion.create(n0, mediaType0, v);
    }

    @l
    @i(name = "create")
    @z3.n
    public static final ResponseBody create(@l o o0, @m MediaType mediaType0) {
        return ResponseBody.Companion.create(o0, mediaType0);
    }

    @l
    @i(name = "create")
    @z3.n
    public static final ResponseBody create(@l byte[] arr_b, @m MediaType mediaType0) {
        return ResponseBody.Companion.create(arr_b, mediaType0);
    }

    @l
    public abstract n source();

    @l
    public final String string() throws IOException {
        String s;
        n n0 = this.source();
        try {
            s = n0.w1(Util.readBomAsCharset(n0, this.charset()));
        }
        catch(Throwable throwable0) {
            c.a(n0, throwable0);
            throw throwable0;
        }
        c.a(n0, null);
        return s;
    }
}

