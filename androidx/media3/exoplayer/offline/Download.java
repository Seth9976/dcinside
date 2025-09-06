package androidx.media3.exoplayer.offline;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
public final class Download {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    public @interface FailureReason {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    public @interface State {
    }

    public final DownloadRequest a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    final DownloadProgress h;
    public static final int i = 0;
    public static final int j = 1;
    public static final int k = 2;
    public static final int l = 3;
    public static final int m = 4;
    public static final int n = 5;
    public static final int o = 7;
    public static final int p = 0;
    public static final int q = 1;
    public static final int r;

    public Download(DownloadRequest downloadRequest0, int v, long v1, long v2, long v3, int v4, int v5) {
        this(downloadRequest0, v, v1, v2, v3, v4, v5, new DownloadProgress());
    }

    public Download(DownloadRequest downloadRequest0, int v, long v1, long v2, long v3, int v4, int v5, DownloadProgress downloadProgress0) {
        Assertions.g(downloadProgress0);
        boolean z = false;
        Assertions.a((v5 == 0 ? 1 : 0) == (v == 4 ? 0 : 1));
        if(v4 != 0) {
            if(v != 0 && v != 2) {
                z = true;
            }
            Assertions.a(z);
        }
        this.a = downloadRequest0;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = v4;
        this.g = v5;
        this.h = downloadProgress0;
    }

    public long a() {
        return this.h.a;
    }

    public float b() {
        return this.h.b;
    }

    public boolean c() {
        return this.b == 3 || this.b == 4;
    }
}

