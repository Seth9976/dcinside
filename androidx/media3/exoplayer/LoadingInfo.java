package androidx.media3.exoplayer;

import O1.a;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.base.B;

@UnstableApi
public final class LoadingInfo {
    public static final class Builder {
        private long a;
        private float b;
        private long c;

        public Builder() {
            this.a = 0x8000000000000001L;
            this.b = -3.402823E+38f;
            this.c = 0x8000000000000001L;
        }

        private Builder(LoadingInfo loadingInfo0) {
            this.a = loadingInfo0.a;
            this.b = loadingInfo0.b;
            this.c = loadingInfo0.c;
        }

        Builder(LoadingInfo loadingInfo0, androidx.media3.exoplayer.LoadingInfo.1 loadingInfo$10) {
            this(loadingInfo0);
        }

        public LoadingInfo d() {
            return new LoadingInfo(this, null);
        }

        @a
        public Builder e(long v) {
            Assertions.a(v >= 0L || v == 0x8000000000000001L);
            this.c = v;
            return this;
        }

        @a
        public Builder f(long v) {
            this.a = v;
            return this;
        }

        @a
        public Builder g(float f) {
            Assertions.a(f > 0.0f || f == -3.402823E+38f);
            this.b = f;
            return this;
        }
    }

    public final long a;
    public final float b;
    public final long c;

    private LoadingInfo(Builder loadingInfo$Builder0) {
        this.a = loadingInfo$Builder0.a;
        this.b = loadingInfo$Builder0.b;
        this.c = loadingInfo$Builder0.c;
    }

    LoadingInfo(Builder loadingInfo$Builder0, androidx.media3.exoplayer.LoadingInfo.1 loadingInfo$10) {
        this(loadingInfo$Builder0);
    }

    public Builder a() {
        return new Builder(this, null);
    }

    public boolean b(long v) {
        return this.c != 0x8000000000000001L && v != 0x8000000000000001L && this.c >= v;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof LoadingInfo ? this.a == ((LoadingInfo)object0).a && this.b == ((LoadingInfo)object0).b && this.c == ((LoadingInfo)object0).c : false;
    }

    @Override
    public int hashCode() {
        return B.b(new Object[]{this.a, this.b, this.c});
    }

    class androidx.media3.exoplayer.LoadingInfo.1 {
    }

}

