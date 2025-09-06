package okhttp3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import okhttp3.internal.Util;
import okio.o;
import y4.l;
import y4.m;
import z3.f;
import z3.i;
import z3.j;
import z3.n;

public final class MultipartBody extends RequestBody {
    @s0({"SMAP\nMultipartBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartBody.kt\nokhttp3/MultipartBody$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n1#2:346\n*E\n"})
    public static final class Builder {
        @l
        private final o boundary;
        @l
        private final List parts;
        @l
        private MediaType type;

        @j
        public Builder() {
            this(null, 1, null);
        }

        @j
        public Builder(@l String s) {
            L.p(s, "boundary");
            super();
            this.boundary = o.d.l(s);
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
        }

        public Builder(String s, int v, w w0) {
            if((v & 1) != 0) {
                s = "facecc52-00e7-4b61-a926-294669bb2f6f";
                L.o("facecc52-00e7-4b61-a926-294669bb2f6f", "randomUUID().toString()");
            }
            this(s);
        }

        @l
        public final Builder addFormDataPart(@l String s, @l String s1) {
            L.p(s, "name");
            L.p(s1, "value");
            this.addPart(Part.Companion.createFormData(s, s1));
            return this;
        }

        @l
        public final Builder addFormDataPart(@l String s, @m String s1, @l RequestBody requestBody0) {
            L.p(s, "name");
            L.p(requestBody0, "body");
            this.addPart(Part.Companion.createFormData(s, s1, requestBody0));
            return this;
        }

        @l
        public final Builder addPart(@m Headers headers0, @l RequestBody requestBody0) {
            L.p(requestBody0, "body");
            this.addPart(Part.Companion.create(headers0, requestBody0));
            return this;
        }

        @l
        public final Builder addPart(@l Part multipartBody$Part0) {
            L.p(multipartBody$Part0, "part");
            this.parts.add(multipartBody$Part0);
            return this;
        }

        @l
        public final Builder addPart(@l RequestBody requestBody0) {
            L.p(requestBody0, "body");
            this.addPart(Part.Companion.create(requestBody0));
            return this;
        }

        @l
        public final MultipartBody build() {
            if(this.parts.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            MediaType mediaType0 = this.type;
            List list0 = Util.toImmutableList(this.parts);
            return new MultipartBody(this.boundary, mediaType0, list0);
        }

        @l
        public final Builder setType(@l MediaType mediaType0) {
            L.p(mediaType0, "type");
            if(!L.g(mediaType0.type(), "multipart")) {
                throw new IllegalArgumentException(("multipart != " + mediaType0).toString());
            }
            this.type = mediaType0;
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        public final void appendQuotedString$okhttp(@l StringBuilder stringBuilder0, @l String s) {
            L.p(stringBuilder0, "<this>");
            L.p(s, "key");
            stringBuilder0.append('\"');
            int v = s.length();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = s.charAt(v1);
                if(v2 == 10) {
                    stringBuilder0.append("%0A");
                }
                else {
                    switch(v2) {
                        case 13: {
                            stringBuilder0.append("%0D");
                            break;
                        }
                        case 34: {
                            stringBuilder0.append("%22");
                            break;
                        }
                        default: {
                            stringBuilder0.append(((char)v2));
                        }
                    }
                }
            }
            stringBuilder0.append('\"');
        }
    }

    public static final class Part {
        @s0({"SMAP\nMultipartBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartBody.kt\nokhttp3/MultipartBody$Part$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n1#2:346\n*E\n"})
        public static final class okhttp3.MultipartBody.Part.Companion {
            private okhttp3.MultipartBody.Part.Companion() {
            }

            public okhttp3.MultipartBody.Part.Companion(w w0) {
            }

            @l
            @n
            public final Part create(@m Headers headers0, @l RequestBody requestBody0) {
                L.p(requestBody0, "body");
                if((headers0 == null ? null : headers0.get("Content-Type")) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if((headers0 == null ? null : headers0.get("Content-Length")) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Length");
                }
                return new Part(headers0, requestBody0, null);
            }

            @l
            @n
            public final Part create(@l RequestBody requestBody0) {
                L.p(requestBody0, "body");
                return this.create(null, requestBody0);
            }

            @l
            @n
            public final Part createFormData(@l String s, @l String s1) {
                L.p(s, "name");
                L.p(s1, "value");
                return this.createFormData(s, null, okhttp3.RequestBody.Companion.create$default(RequestBody.Companion, s1, null, 1, null));
            }

            @l
            @n
            public final Part createFormData(@l String s, @m String s1, @l RequestBody requestBody0) {
                L.p(s, "name");
                L.p(requestBody0, "body");
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append("form-data; name=");
                Companion multipartBody$Companion0 = MultipartBody.Companion;
                multipartBody$Companion0.appendQuotedString$okhttp(stringBuilder0, s);
                if(s1 != null) {
                    stringBuilder0.append("; filename=");
                    multipartBody$Companion0.appendQuotedString$okhttp(stringBuilder0, s1);
                }
                String s2 = stringBuilder0.toString();
                L.o(s2, "StringBuilder().apply(builderAction).toString()");
                return this.create(new okhttp3.Headers.Builder().addUnsafeNonAscii("Content-Disposition", s2).build(), requestBody0);
            }
        }

        @l
        public static final okhttp3.MultipartBody.Part.Companion Companion;
        @l
        private final RequestBody body;
        @m
        private final Headers headers;

        @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "body", imports = {}))
        @l
        @i(name = "-deprecated_body")
        public final RequestBody -deprecated_body() {
            return this.body;
        }

        @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "headers", imports = {}))
        @m
        @i(name = "-deprecated_headers")
        public final Headers -deprecated_headers() {
            return this.headers;
        }

        static {
            Part.Companion = new okhttp3.MultipartBody.Part.Companion(null);
        }

        private Part(Headers headers0, RequestBody requestBody0) {
            this.headers = headers0;
            this.body = requestBody0;
        }

        public Part(Headers headers0, RequestBody requestBody0, w w0) {
            this(headers0, requestBody0);
        }

        @l
        @i(name = "body")
        public final RequestBody body() {
            return this.body;
        }

        @l
        @n
        public static final Part create(@m Headers headers0, @l RequestBody requestBody0) {
            return Part.Companion.create(headers0, requestBody0);
        }

        @l
        @n
        public static final Part create(@l RequestBody requestBody0) {
            return Part.Companion.create(requestBody0);
        }

        @l
        @n
        public static final Part createFormData(@l String s, @l String s1) {
            return Part.Companion.createFormData(s, s1);
        }

        @l
        @n
        public static final Part createFormData(@l String s, @m String s1, @l RequestBody requestBody0) {
            return Part.Companion.createFormData(s, s1, requestBody0);
        }

        @m
        @i(name = "headers")
        public final Headers headers() {
            return this.headers;
        }
    }

    @l
    @f
    public static final MediaType ALTERNATIVE;
    @l
    private static final byte[] COLONSPACE;
    @l
    private static final byte[] CRLF;
    @l
    public static final Companion Companion;
    @l
    private static final byte[] DASHDASH;
    @l
    @f
    public static final MediaType DIGEST;
    @l
    @f
    public static final MediaType FORM;
    @l
    @f
    public static final MediaType MIXED;
    @l
    @f
    public static final MediaType PARALLEL;
    @l
    private final o boundaryByteString;
    private long contentLength;
    @l
    private final MediaType contentType;
    @l
    private final List parts;
    @l
    private final MediaType type;

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "boundary", imports = {}))
    @l
    @i(name = "-deprecated_boundary")
    public final String -deprecated_boundary() {
        return this.boundary();
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "parts", imports = {}))
    @l
    @i(name = "-deprecated_parts")
    public final List -deprecated_parts() {
        return this.parts;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "size", imports = {}))
    @i(name = "-deprecated_size")
    public final int -deprecated_size() {
        return this.size();
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "type", imports = {}))
    @l
    @i(name = "-deprecated_type")
    public final MediaType -deprecated_type() {
        return this.type;
    }

    static {
        MultipartBody.Companion = new Companion(null);
        MultipartBody.MIXED = MediaType.Companion.get("multipart/mixed");
        MultipartBody.ALTERNATIVE = MediaType.Companion.get("multipart/alternative");
        MultipartBody.DIGEST = MediaType.Companion.get("multipart/digest");
        MultipartBody.PARALLEL = MediaType.Companion.get("multipart/parallel");
        MultipartBody.FORM = MediaType.Companion.get("multipart/form-data");
        MultipartBody.COLONSPACE = new byte[]{58, 0x20};
        MultipartBody.CRLF = new byte[]{13, 10};
        MultipartBody.DASHDASH = new byte[]{45, 45};
    }

    public MultipartBody(@l o o0, @l MediaType mediaType0, @l List list0) {
        L.p(o0, "boundaryByteString");
        L.p(mediaType0, "type");
        L.p(list0, "parts");
        super();
        this.boundaryByteString = o0;
        this.type = mediaType0;
        this.parts = list0;
        this.contentType = MediaType.Companion.get(mediaType0 + "; boundary=" + this.boundary());
        this.contentLength = -1L;
    }

    @l
    @i(name = "boundary")
    public final String boundary() {
        return this.boundaryByteString.t0();
    }

    @Override  // okhttp3.RequestBody
    public long contentLength() throws IOException {
        long v = this.contentLength;
        if(v == -1L) {
            v = this.writeOrCountBytes(null, true);
            this.contentLength = v;
        }
        return v;
    }

    @Override  // okhttp3.RequestBody
    @l
    public MediaType contentType() {
        return this.contentType;
    }

    @l
    public final Part part(int v) {
        return (Part)this.parts.get(v);
    }

    @l
    @i(name = "parts")
    public final List parts() {
        return this.parts;
    }

    @i(name = "size")
    public final int size() {
        return this.parts.size();
    }

    @l
    @i(name = "type")
    public final MediaType type() {
        return this.type;
    }

    private final long writeOrCountBytes(okio.m m0, boolean z) throws IOException {
        okio.m m1;
        if(z) {
            m0 = new okio.l();
            m1 = m0;
        }
        else {
            m1 = null;
        }
        int v = this.parts.size();
        long v1 = 0L;
        for(int v2 = 0; v2 < v; ++v2) {
            Part multipartBody$Part0 = (Part)this.parts.get(v2);
            Headers headers0 = multipartBody$Part0.headers();
            RequestBody requestBody0 = multipartBody$Part0.body();
            L.m(m0);
            m0.write(MultipartBody.DASHDASH);
            m0.M1(this.boundaryByteString);
            m0.write(MultipartBody.CRLF);
            if(headers0 != null) {
                int v3 = headers0.size();
                for(int v4 = 0; v4 < v3; ++v4) {
                    m0.D2(headers0.name(v4)).write(MultipartBody.COLONSPACE).D2(headers0.value(v4)).write(MultipartBody.CRLF);
                }
            }
            MediaType mediaType0 = requestBody0.contentType();
            if(mediaType0 != null) {
                m0.D2("Content-Type: ").D2(mediaType0.toString()).write(MultipartBody.CRLF);
            }
            long v5 = requestBody0.contentLength();
            if(v5 != -1L) {
                m0.D2("Content-Length: ").v0(v5).write(MultipartBody.CRLF);
            }
            else if(z) {
                L.m(m1);
                ((okio.l)m1).c();
                return -1L;
            }
            byte[] arr_b = MultipartBody.CRLF;
            m0.write(arr_b);
            if(z) {
                v1 += v5;
            }
            else {
                requestBody0.writeTo(m0);
            }
            m0.write(arr_b);
        }
        L.m(m0);
        m0.write(MultipartBody.DASHDASH);
        m0.M1(this.boundaryByteString);
        m0.write(MultipartBody.DASHDASH);
        m0.write(MultipartBody.CRLF);
        if(z) {
            L.m(m1);
            v1 += ((okio.l)m1).size();
            ((okio.l)m1).c();
        }
        return v1;
    }

    @Override  // okhttp3.RequestBody
    public void writeTo(@l okio.m m0) throws IOException {
        L.p(m0, "sink");
        this.writeOrCountBytes(m0, false);
    }
}

