package androidx.media3.common;

import O1.a;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public class FrameInfo {
    public static final class Builder {
        private ColorInfo a;
        private int b;
        private int c;
        private float d;
        private long e;

        public Builder(ColorInfo colorInfo0, int v, int v1) {
            this.a = colorInfo0;
            this.b = v;
            this.c = v1;
            this.d = 1.0f;
        }

        public Builder(FrameInfo frameInfo0) {
            this.a = frameInfo0.a;
            this.b = frameInfo0.b;
            this.c = frameInfo0.c;
            this.d = frameInfo0.d;
            this.e = frameInfo0.e;
        }

        public FrameInfo a() {
            return new FrameInfo(this.a, this.b, this.c, this.d, this.e, null);
        }

        @a
        public Builder b(ColorInfo colorInfo0) {
            this.a = colorInfo0;
            return this;
        }

        @a
        public Builder c(int v) {
            this.c = v;
            return this;
        }

        @a
        public Builder d(long v) {
            this.e = v;
            return this;
        }

        @a
        public Builder e(float f) {
            this.d = f;
            return this;
        }

        @a
        public Builder f(int v) {
            this.b = v;
            return this;
        }
    }

    public final ColorInfo a;
    public final int b;
    public final int c;
    public final float d;
    public final long e;

    private FrameInfo(ColorInfo colorInfo0, int v, int v1, float f, long v2) {
        boolean z = false;
        Assertions.b(v > 0, "width must be positive, but is: " + v);
        if(v1 > 0) {
            z = true;
        }
        Assertions.b(z, "height must be positive, but is: " + v1);
        this.a = colorInfo0;
        this.b = v;
        this.c = v1;
        this.d = f;
        this.e = v2;
    }

    FrameInfo(ColorInfo colorInfo0, int v, int v1, float f, long v2, androidx.media3.common.FrameInfo.1 frameInfo$10) {
        this(colorInfo0, v, v1, f, v2);
    }

    class androidx.media3.common.FrameInfo.1 {
    }

}

