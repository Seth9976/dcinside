package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class SeekPoint {
    public final long a;
    public final long b;
    public static final SeekPoint c;

    static {
        SeekPoint.c = new SeekPoint(0L, 0L);
    }

    public SeekPoint(long v, long v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return SeekPoint.class == class0 && (this.a == ((SeekPoint)object0).a && this.b == ((SeekPoint)object0).b);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return ((int)this.a) * 0x1F + ((int)this.b);
    }

    @Override
    public String toString() {
        return "[timeUs=" + this.a + ", position=" + this.b + "]";
    }
}

