package okhttp3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import okhttp3.internal.Util;
import y4.l;
import y4.m;
import z3.i;
import z3.j;

public final class FormBody extends RequestBody {
    public static final class Builder {
        @m
        private final Charset charset;
        @l
        private final List names;
        @l
        private final List values;

        @j
        public Builder() {
            this(null, 1, null);
        }

        @j
        public Builder(@m Charset charset0) {
            this.charset = charset0;
            this.names = new ArrayList();
            this.values = new ArrayList();
        }

        public Builder(Charset charset0, int v, w w0) {
            if((v & 1) != 0) {
                charset0 = null;
            }
            this(charset0);
        }

        @l
        public final Builder add(@l String s, @l String s1) {
            L.p(s, "name");
            L.p(s1, "value");
            String s2 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, 0, 0, " \"\':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.charset, 91, null);
            this.names.add(s2);
            String s3 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, s1, 0, 0, " \"\':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.charset, 91, null);
            this.values.add(s3);
            return this;
        }

        @l
        public final Builder addEncoded(@l String s, @l String s1) {
            L.p(s, "name");
            L.p(s1, "value");
            String s2 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, 0, 0, " \"\':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.charset, 83, null);
            this.names.add(s2);
            String s3 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, s1, 0, 0, " \"\':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.charset, 83, null);
            this.values.add(s3);
            return this;
        }

        @l
        public final FormBody build() {
            return new FormBody(this.names, this.values);
        }
    }

    public static final class okhttp3.FormBody.Companion {
        private okhttp3.FormBody.Companion() {
        }

        public okhttp3.FormBody.Companion(w w0) {
        }
    }

    @l
    private static final MediaType CONTENT_TYPE;
    @l
    public static final okhttp3.FormBody.Companion Companion;
    @l
    private final List encodedNames;
    @l
    private final List encodedValues;

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "size", imports = {}))
    @i(name = "-deprecated_size")
    public final int -deprecated_size() {
        return this.size();
    }

    static {
        FormBody.Companion = new okhttp3.FormBody.Companion(null);
        FormBody.CONTENT_TYPE = MediaType.Companion.get("application/x-www-form-urlencoded");
    }

    public FormBody(@l List list0, @l List list1) {
        L.p(list0, "encodedNames");
        L.p(list1, "encodedValues");
        super();
        this.encodedNames = Util.toImmutableList(list0);
        this.encodedValues = Util.toImmutableList(list1);
    }

    @Override  // okhttp3.RequestBody
    public long contentLength() {
        return this.writeOrCountBytes(null, true);
    }

    @Override  // okhttp3.RequestBody
    @l
    public MediaType contentType() {
        return FormBody.CONTENT_TYPE;
    }

    @l
    public final String encodedName(int v) {
        return (String)this.encodedNames.get(v);
    }

    @l
    public final String encodedValue(int v) {
        return (String)this.encodedValues.get(v);
    }

    @l
    public final String name(int v) {
        String s = this.encodedName(v);
        return Companion.percentDecode$okhttp$default(HttpUrl.Companion, s, 0, 0, true, 3, null);
    }

    @i(name = "size")
    public final int size() {
        return this.encodedNames.size();
    }

    @l
    public final String value(int v) {
        String s = this.encodedValue(v);
        return Companion.percentDecode$okhttp$default(HttpUrl.Companion, s, 0, 0, true, 3, null);
    }

    private final long writeOrCountBytes(okio.m m0, boolean z) {
        okio.l l0;
        if(z) {
            l0 = new okio.l();
        }
        else {
            L.m(m0);
            l0 = m0.E();
        }
        int v = this.encodedNames.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(v1 > 0) {
                l0.e2(38);
            }
            l0.b3(((String)this.encodedNames.get(v1)));
            l0.e2(61);
            l0.b3(((String)this.encodedValues.get(v1)));
        }
        if(z) {
            l0.c();
            return l0.size();
        }
        return 0L;
    }

    @Override  // okhttp3.RequestBody
    public void writeTo(@l okio.m m0) throws IOException {
        L.p(m0, "sink");
        this.writeOrCountBytes(m0, false);
    }
}

