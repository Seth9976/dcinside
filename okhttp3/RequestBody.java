package okhttp3;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.c0;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.text.f;
import okhttp3.internal.Util;
import okio.Z;
import okio.o0;
import okio.o;
import y4.l;
import y4.m;
import z3.i;
import z3.j;
import z3.n;

public abstract class RequestBody {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        @i(name = "create")
        @n
        public final RequestBody create(@l File file0, @m MediaType mediaType0) {
            L.p(file0, "<this>");
            return new RequestBody() {
                @Override  // okhttp3.RequestBody
                public long contentLength() {
                    return this.$this_asRequestBody.length();
                }

                @Override  // okhttp3.RequestBody
                @m
                public MediaType contentType() {
                    return file0;
                }

                @Override  // okhttp3.RequestBody
                public void writeTo(@l okio.m m0) {
                    L.p(m0, "sink");
                    o0 o00 = Z.t(this.$this_asRequestBody);
                    try {
                        m0.K2(o00);
                    }
                    catch(Throwable throwable0) {
                        c.a(o00, throwable0);
                        throw throwable0;
                    }
                    c.a(o00, null);
                }
            };
        }

        @l
        @i(name = "create")
        @n
        public final RequestBody create(@l String s, @m MediaType mediaType0) {
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
            byte[] arr_b = s.getBytes(charset0);
            L.o(arr_b, "this as java.lang.String).getBytes(charset)");
            return this.create(arr_b, mediaType0, 0, arr_b.length);
        }

        @k(level = kotlin.m.a, message = "Moved to extension function. Put the \'file\' argument first to fix Java", replaceWith = @c0(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
        @l
        @n
        public final RequestBody create(@m MediaType mediaType0, @l File file0) {
            L.p(file0, "file");
            return this.create(file0, mediaType0);
        }

        @k(level = kotlin.m.a, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @c0(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @l
        @n
        public final RequestBody create(@m MediaType mediaType0, @l String s) {
            L.p(s, "content");
            return this.create(s, mediaType0);
        }

        @k(level = kotlin.m.a, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @c0(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @l
        @n
        public final RequestBody create(@m MediaType mediaType0, @l o o0) {
            L.p(o0, "content");
            return this.create(o0, mediaType0);
        }

        @k(level = kotlin.m.a, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @c0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @l
        @j
        @n
        public final RequestBody create(@m MediaType mediaType0, @l byte[] arr_b) {
            L.p(arr_b, "content");
            return Companion.create$default(this, mediaType0, arr_b, 0, 0, 12, null);
        }

        @k(level = kotlin.m.a, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @c0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @l
        @j
        @n
        public final RequestBody create(@m MediaType mediaType0, @l byte[] arr_b, int v) {
            L.p(arr_b, "content");
            return Companion.create$default(this, mediaType0, arr_b, v, 0, 8, null);
        }

        @k(level = kotlin.m.a, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @c0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @l
        @j
        @n
        public final RequestBody create(@m MediaType mediaType0, @l byte[] arr_b, int v, int v1) {
            L.p(arr_b, "content");
            return this.create(arr_b, mediaType0, v, v1);
        }

        @l
        @i(name = "create")
        @n
        public final RequestBody create(@l o o0, @m MediaType mediaType0) {
            L.p(o0, "<this>");
            return new RequestBody() {
                @Override  // okhttp3.RequestBody
                public long contentLength() {
                    return (long)this.$this_toRequestBody.h0();
                }

                @Override  // okhttp3.RequestBody
                @m
                public MediaType contentType() {
                    return o0;
                }

                @Override  // okhttp3.RequestBody
                public void writeTo(@l okio.m m0) {
                    L.p(m0, "sink");
                    m0.M1(this.$this_toRequestBody);
                }
            };
        }

        @l
        @i(name = "create")
        @j
        @n
        public final RequestBody create(@l byte[] arr_b) {
            L.p(arr_b, "<this>");
            return Companion.create$default(this, arr_b, null, 0, 0, 7, null);
        }

        @l
        @i(name = "create")
        @j
        @n
        public final RequestBody create(@l byte[] arr_b, @m MediaType mediaType0) {
            L.p(arr_b, "<this>");
            return Companion.create$default(this, arr_b, mediaType0, 0, 0, 6, null);
        }

        @l
        @i(name = "create")
        @j
        @n
        public final RequestBody create(@l byte[] arr_b, @m MediaType mediaType0, int v) {
            L.p(arr_b, "<this>");
            return Companion.create$default(this, arr_b, mediaType0, v, 0, 4, null);
        }

        @l
        @i(name = "create")
        @j
        @n
        public final RequestBody create(@l byte[] arr_b, @m MediaType mediaType0, int v, int v1) {
            L.p(arr_b, "<this>");
            Util.checkOffsetAndCount(arr_b.length, v, v1);
            return new RequestBody() {
                @Override  // okhttp3.RequestBody
                public long contentLength() {
                    return (long)arr_b;
                }

                @Override  // okhttp3.RequestBody
                @m
                public MediaType contentType() {
                    return v1;
                }

                @Override  // okhttp3.RequestBody
                public void writeTo(@l okio.m m0) {
                    L.p(m0, "sink");
                    m0.write(v, this.$offset, arr_b);
                }
            };
        }

        public static RequestBody create$default(Companion requestBody$Companion0, File file0, MediaType mediaType0, int v, Object object0) {
            if((v & 1) != 0) {
                mediaType0 = null;
            }
            return requestBody$Companion0.create(file0, mediaType0);
        }

        public static RequestBody create$default(Companion requestBody$Companion0, String s, MediaType mediaType0, int v, Object object0) {
            if((v & 1) != 0) {
                mediaType0 = null;
            }
            return requestBody$Companion0.create(s, mediaType0);
        }

        public static RequestBody create$default(Companion requestBody$Companion0, MediaType mediaType0, byte[] arr_b, int v, int v1, int v2, Object object0) {
            if((v2 & 4) != 0) {
                v = 0;
            }
            if((v2 & 8) != 0) {
                v1 = arr_b.length;
            }
            return requestBody$Companion0.create(mediaType0, arr_b, v, v1);
        }

        public static RequestBody create$default(Companion requestBody$Companion0, o o0, MediaType mediaType0, int v, Object object0) {
            if((v & 1) != 0) {
                mediaType0 = null;
            }
            return requestBody$Companion0.create(o0, mediaType0);
        }

        public static RequestBody create$default(Companion requestBody$Companion0, byte[] arr_b, MediaType mediaType0, int v, int v1, int v2, Object object0) {
            if((v2 & 1) != 0) {
                mediaType0 = null;
            }
            if((v2 & 2) != 0) {
                v = 0;
            }
            if((v2 & 4) != 0) {
                v1 = arr_b.length;
            }
            return requestBody$Companion0.create(arr_b, mediaType0, v, v1);
        }
    }

    @l
    public static final Companion Companion;

    static {
        RequestBody.Companion = new Companion(null);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    @m
    public abstract MediaType contentType();

    @l
    @i(name = "create")
    @n
    public static final RequestBody create(@l File file0, @m MediaType mediaType0) {
        return RequestBody.Companion.create(file0, mediaType0);
    }

    @l
    @i(name = "create")
    @n
    public static final RequestBody create(@l String s, @m MediaType mediaType0) {
        return RequestBody.Companion.create(s, mediaType0);
    }

    @k(level = kotlin.m.a, message = "Moved to extension function. Put the \'file\' argument first to fix Java", replaceWith = @c0(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @l
    @n
    public static final RequestBody create(@m MediaType mediaType0, @l File file0) {
        return RequestBody.Companion.create(mediaType0, file0);
    }

    @k(level = kotlin.m.a, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @c0(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @l
    @n
    public static final RequestBody create(@m MediaType mediaType0, @l String s) {
        return RequestBody.Companion.create(mediaType0, s);
    }

    @k(level = kotlin.m.a, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @c0(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @l
    @n
    public static final RequestBody create(@m MediaType mediaType0, @l o o0) {
        return RequestBody.Companion.create(mediaType0, o0);
    }

    @k(level = kotlin.m.a, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @c0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @l
    @j
    @n
    public static final RequestBody create(@m MediaType mediaType0, @l byte[] arr_b) {
        return RequestBody.Companion.create(mediaType0, arr_b);
    }

    @k(level = kotlin.m.a, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @c0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @l
    @j
    @n
    public static final RequestBody create(@m MediaType mediaType0, @l byte[] arr_b, int v) {
        return RequestBody.Companion.create(mediaType0, arr_b, v);
    }

    @k(level = kotlin.m.a, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @c0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @l
    @j
    @n
    public static final RequestBody create(@m MediaType mediaType0, @l byte[] arr_b, int v, int v1) {
        return RequestBody.Companion.create(mediaType0, arr_b, v, v1);
    }

    @l
    @i(name = "create")
    @n
    public static final RequestBody create(@l o o0, @m MediaType mediaType0) {
        return RequestBody.Companion.create(o0, mediaType0);
    }

    @l
    @i(name = "create")
    @j
    @n
    public static final RequestBody create(@l byte[] arr_b) {
        return RequestBody.Companion.create(arr_b);
    }

    @l
    @i(name = "create")
    @j
    @n
    public static final RequestBody create(@l byte[] arr_b, @m MediaType mediaType0) {
        return RequestBody.Companion.create(arr_b, mediaType0);
    }

    @l
    @i(name = "create")
    @j
    @n
    public static final RequestBody create(@l byte[] arr_b, @m MediaType mediaType0, int v) {
        return RequestBody.Companion.create(arr_b, mediaType0, v);
    }

    @l
    @i(name = "create")
    @j
    @n
    public static final RequestBody create(@l byte[] arr_b, @m MediaType mediaType0, int v, int v1) {
        return RequestBody.Companion.create(arr_b, mediaType0, v, v1);
    }

    public boolean isDuplex() [...] // Inlined contents

    public boolean isOneShot() [...] // Inlined contents

    public abstract void writeTo(@l okio.m arg1) throws IOException;
}

