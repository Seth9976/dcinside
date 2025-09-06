package androidx.media3.datasource;

import O1.a;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import j..util.DesugarCollections;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@UnstableApi
public final class DataSpec {
    public static final class Builder {
        @Nullable
        private Uri a;
        private long b;
        private int c;
        @Nullable
        private byte[] d;
        private Map e;
        private long f;
        private long g;
        @Nullable
        private String h;
        private int i;
        @Nullable
        private Object j;

        public Builder() {
            this.c = 1;
            this.e = Collections.emptyMap();
            this.g = -1L;
        }

        private Builder(DataSpec dataSpec0) {
            this.a = dataSpec0.a;
            this.b = dataSpec0.b;
            this.c = dataSpec0.c;
            this.d = dataSpec0.d;
            this.e = dataSpec0.e;
            this.f = dataSpec0.g;
            this.g = dataSpec0.h;
            this.h = dataSpec0.i;
            this.i = dataSpec0.j;
            this.j = dataSpec0.k;
        }

        Builder(DataSpec dataSpec0, androidx.media3.datasource.DataSpec.1 dataSpec$10) {
            this(dataSpec0);
        }

        public DataSpec a() {
            Assertions.l(this.a, "The uri must be set.");
            return new DataSpec(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, null);
        }

        @a
        public Builder b(@Nullable Object object0) {
            this.j = object0;
            return this;
        }

        @a
        public Builder c(int v) {
            this.i = v;
            return this;
        }

        @a
        public Builder d(@Nullable byte[] arr_b) {
            this.d = arr_b;
            return this;
        }

        @a
        public Builder e(int v) {
            this.c = v;
            return this;
        }

        @a
        public Builder f(Map map0) {
            this.e = map0;
            return this;
        }

        @a
        public Builder g(@Nullable String s) {
            this.h = s;
            return this;
        }

        @a
        public Builder h(long v) {
            this.g = v;
            return this;
        }

        @a
        public Builder i(long v) {
            this.f = v;
            return this;
        }

        @a
        public Builder j(Uri uri0) {
            this.a = uri0;
            return this;
        }

        @a
        public Builder k(String s) {
            this.a = Uri.parse(s);
            return this;
        }

        @a
        public Builder l(long v) {
            this.b = v;
            return this;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface Flags {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface HttpMethod {
    }

    public final Uri a;
    public final long b;
    public final int c;
    @Nullable
    public final byte[] d;
    public final Map e;
    @Deprecated
    public final long f;
    public final long g;
    public final long h;
    @Nullable
    public final String i;
    public final int j;
    @Nullable
    public final Object k;
    public static final int l = 1;
    public static final int m = 2;
    public static final int n = 4;
    public static final int o = 8;
    public static final int p = 1;
    public static final int q = 2;
    public static final int r = 3;

    static {
        MediaLibraryInfo.a("media3.datasource");
    }

    public DataSpec(Uri uri0) {
        this(uri0, 0L, -1L);
    }

    private DataSpec(Uri uri0, long v, int v1, @Nullable byte[] arr_b, Map map0, long v2, long v3, @Nullable String s, int v4, @Nullable Object object0) {
        long v5 = v + v2;
        boolean z = false;
        Assertions.a(v5 >= 0L);
        Assertions.a(v2 >= 0L);
        if(v3 > 0L || v3 == -1L) {
            z = true;
        }
        Assertions.a(z);
        this.a = (Uri)Assertions.g(uri0);
        this.b = v;
        this.c = v1;
        if(arr_b == null || arr_b.length == 0) {
            arr_b = null;
        }
        this.d = arr_b;
        this.e = DesugarCollections.unmodifiableMap(new HashMap(map0));
        this.g = v2;
        this.f = v5;
        this.h = v3;
        this.i = s;
        this.j = v4;
        this.k = object0;
    }

    DataSpec(Uri uri0, long v, int v1, byte[] arr_b, Map map0, long v2, long v3, String s, int v4, Object object0, androidx.media3.datasource.DataSpec.1 dataSpec$10) {
        this(uri0, v, v1, arr_b, map0, v2, v3, s, v4, object0);
    }

    public DataSpec(Uri uri0, long v, long v1) {
        this(uri0, v, v1, null);
    }

    @Deprecated
    public DataSpec(Uri uri0, long v, long v1, @Nullable String s) {
        this(uri0, 0L, 1, null, Collections.emptyMap(), v, v1, s, 0, null);
    }

    public Builder a() {
        return new Builder(this, null);
    }

    public final String b() {
        return DataSpec.c(this.c);
    }

    public static String c(int v) {
        switch(v) {
            case 1: {
                return "GET";
            }
            case 2: {
                return "POST";
            }
            case 3: {
                return "HEAD";
            }
            default: {
                throw new IllegalStateException();
            }
        }
    }

    public boolean d(int v) {
        return (this.j & v) == v;
    }

    public DataSpec e(long v) {
        return this.f(v, (this.h == -1L ? -1L : this.h - v));
    }

    public DataSpec f(long v, long v1) {
        return v != 0L || this.h != v1 ? new DataSpec(this.a, this.b, this.c, this.d, this.e, this.g + v, v1, this.i, this.j, this.k) : this;
    }

    public DataSpec g(Map map0) {
        HashMap hashMap0 = new HashMap(this.e);
        hashMap0.putAll(map0);
        return new DataSpec(this.a, this.b, this.c, this.d, hashMap0, this.g, this.h, this.i, this.j, this.k);
    }

    public DataSpec h(Map map0) {
        return new DataSpec(this.a, this.b, this.c, this.d, map0, this.g, this.h, this.i, this.j, this.k);
    }

    public DataSpec i(Uri uri0) {
        return new DataSpec(uri0, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k);
    }

    @Override
    public String toString() {
        return "DataSpec[" + this.b() + " " + this.a + ", " + this.g + ", " + this.h + ", " + this.i + ", " + this.j + "]";
    }

    class androidx.media3.datasource.DataSpec.1 {
    }

}

