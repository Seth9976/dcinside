package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;

final class MediaPeriodInfo {
    public final MediaPeriodId a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    MediaPeriodInfo(MediaPeriodId mediaSource$MediaPeriodId0, long v, long v1, long v2, long v3, boolean z, boolean z1, boolean z2, boolean z3) {
        boolean z4 = true;
        Assertions.a(!z3 || z1);
        Assertions.a(!z2 || z1);
        if(z && (z1 || z2 || z3)) {
            z4 = false;
        }
        Assertions.a(z4);
        this.a = mediaSource$MediaPeriodId0;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = z;
        this.g = z1;
        this.h = z2;
        this.i = z3;
    }

    public MediaPeriodInfo a(long v) {
        return v == this.c ? this : new MediaPeriodInfo(this.a, this.b, v, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public MediaPeriodInfo b(long v) {
        return v == this.b ? this : new MediaPeriodInfo(this.a, v, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return MediaPeriodInfo.class == class0 && (this.b == ((MediaPeriodInfo)object0).b && this.c == ((MediaPeriodInfo)object0).c && this.d == ((MediaPeriodInfo)object0).d && this.e == ((MediaPeriodInfo)object0).e && this.f == ((MediaPeriodInfo)object0).f && this.g == ((MediaPeriodInfo)object0).g && this.h == ((MediaPeriodInfo)object0).h && this.i == ((MediaPeriodInfo)object0).i && Util.g(this.a, ((MediaPeriodInfo)object0).a));
        }
        return false;
    }

    @Override
    public int hashCode() {
        return ((((((((this.a.hashCode() + 0x20F) * 0x1F + ((int)this.b)) * 0x1F + ((int)this.c)) * 0x1F + ((int)this.d)) * 0x1F + ((int)this.e)) * 0x1F + this.f) * 0x1F + this.g) * 0x1F + this.h) * 0x1F + this.i;
    }
}

