package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
public final class Track {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface Transformation {
    }

    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final Format f;
    public final int g;
    @Nullable
    public final long[] h;
    @Nullable
    public final long[] i;
    public final int j;
    @Nullable
    private final TrackEncryptionBox[] k;
    public static final int l = 0;
    public static final int m = 1;

    public Track(int v, int v1, long v2, long v3, long v4, Format format0, int v5, @Nullable TrackEncryptionBox[] arr_trackEncryptionBox, int v6, @Nullable long[] arr_v, @Nullable long[] arr_v1) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = format0;
        this.g = v5;
        this.k = arr_trackEncryptionBox;
        this.j = v6;
        this.h = arr_v;
        this.i = arr_v1;
    }

    public Track a(Format format0) {
        return new Track(this.a, this.b, this.c, this.d, this.e, format0, this.g, this.k, this.j, this.h, this.i);
    }

    public Track b() {
        return new Track(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.k, this.j, null, null);
    }

    @Nullable
    public TrackEncryptionBox c(int v) {
        return this.k == null ? null : this.k[v];
    }
}

