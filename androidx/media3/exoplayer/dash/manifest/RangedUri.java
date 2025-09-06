package androidx.media3.exoplayer.dash.manifest;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.UriUtil;

@UnstableApi
public final class RangedUri {
    public final long a;
    public final long b;
    private final String c;
    private int d;

    public RangedUri(@Nullable String s, long v, long v1) {
        if(s == null) {
            s = "";
        }
        this.c = s;
        this.a = v;
        this.b = v1;
    }

    @Nullable
    public RangedUri a(@Nullable RangedUri rangedUri0, String s) {
        String s1 = this.c(s);
        if(rangedUri0 != null && s1.equals(rangedUri0.c(s))) {
            long v = this.b;
            long v1 = -1L;
            if(v != -1L) {
                long v2 = this.a;
                if(v2 + v == rangedUri0.a) {
                    long v3 = rangedUri0.b;
                    if(v3 != -1L) {
                        v1 = v + v3;
                    }
                    return new RangedUri(s1, v2, v1);
                }
            }
            long v4 = rangedUri0.b;
            if(v4 != -1L) {
                long v5 = rangedUri0.a;
                if(v5 + v4 == this.a) {
                    if(v != -1L) {
                        v1 = v4 + v;
                    }
                    return new RangedUri(s1, v5, v1);
                }
            }
        }
        return null;
    }

    public Uri b(String s) {
        return UriUtil.g(s, this.c);
    }

    public String c(String s) {
        return UriUtil.f(s, this.c);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return RangedUri.class == class0 && (this.a == ((RangedUri)object0).a && this.b == ((RangedUri)object0).b && this.c.equals(((RangedUri)object0).c));
        }
        return false;
    }

    @Override
    public int hashCode() {
        if(this.d == 0) {
            this.d = ((0x20F + ((int)this.a)) * 0x1F + ((int)this.b)) * 0x1F + this.c.hashCode();
        }
        return this.d;
    }

    @Override
    public String toString() {
        return "RangedUri(referenceUri=" + this.c + ", start=" + this.a + ", length=" + this.b + ")";
    }
}

