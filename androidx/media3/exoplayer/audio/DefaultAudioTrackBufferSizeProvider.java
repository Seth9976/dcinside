package androidx.media3.exoplayer.audio;

import O1.a;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.math.f;
import com.google.common.primitives.l;
import java.math.RoundingMode;

@UnstableApi
public class DefaultAudioTrackBufferSizeProvider implements AudioTrackBufferSizeProvider {
    public static class Builder {
        private int a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;

        public Builder() {
            this.a = 250000;
            this.b = 750000;
            this.c = 4;
            this.d = 250000;
            this.e = 50000000;
            this.f = 2;
            this.g = 4;
        }

        public DefaultAudioTrackBufferSizeProvider h() {
            return new DefaultAudioTrackBufferSizeProvider(this);
        }

        @a
        public Builder i(int v) {
            this.f = v;
            return this;
        }

        @a
        public Builder j(int v) {
            this.g = v;
            return this;
        }

        @a
        public Builder k(int v) {
            this.b = v;
            return this;
        }

        @a
        public Builder l(int v) {
            this.a = v;
            return this;
        }

        @a
        public Builder m(int v) {
            this.e = v;
            return this;
        }

        @a
        public Builder n(int v) {
            this.d = v;
            return this;
        }

        @a
        public Builder o(int v) {
            this.c = v;
            return this;
        }
    }

    protected final int b;
    protected final int c;
    protected final int d;
    protected final int e;
    protected final int f;
    public final int g;
    public final int h;
    private static final int i = 250000;
    private static final int j = 750000;
    private static final int k = 4;
    private static final int l = 250000;
    private static final int m = 50000000;
    private static final int n = 2;
    private static final int o = 4;

    protected DefaultAudioTrackBufferSizeProvider(Builder defaultAudioTrackBufferSizeProvider$Builder0) {
        this.b = defaultAudioTrackBufferSizeProvider$Builder0.a;
        this.c = defaultAudioTrackBufferSizeProvider$Builder0.b;
        this.d = defaultAudioTrackBufferSizeProvider$Builder0.c;
        this.e = defaultAudioTrackBufferSizeProvider$Builder0.d;
        this.f = defaultAudioTrackBufferSizeProvider$Builder0.e;
        this.g = defaultAudioTrackBufferSizeProvider$Builder0.f;
        this.h = defaultAudioTrackBufferSizeProvider$Builder0.g;
    }

    @Override  // androidx.media3.exoplayer.audio.DefaultAudioSink$AudioTrackBufferSizeProvider
    public int a(int v, int v1, int v2, int v3, int v4, int v5, double f) {
        return (Math.max(v, ((int)(((double)this.c(v, v1, v2, v3, v4, v5)) * f))) + v3 - 1) / v3 * v3;
    }

    protected static int b(int v, int v1, int v2) {
        return l.d(((long)v) * ((long)v1) * ((long)v2) / 1000000L);
    }

    protected int c(int v, int v1, int v2, int v3, int v4, int v5) {
        switch(v2) {
            case 0: {
                return this.g(v, v4, v3);
            }
            case 1: {
                return this.e(v1);
            }
            case 2: {
                return this.f(v1, v5);
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
    }

    protected static int d(int v) {
        switch(v) {
            case 5: {
                return 80000;
            }
            case 7: {
                return 192000;
            }
            case 9: {
                return 40000;
            }
            case 10: {
                return 100000;
            }
            case 11: {
                return 16000;
            }
            case 12: {
                return 7000;
            }
            case 14: {
                return 3062500;
            }
            case 15: {
                return 8000;
            }
            case 16: {
                return 256000;
            }
            case 17: {
                return 336000;
            }
            case 6: 
            case 18: {
                return 768000;
            }
            case 20: {
                return 0xF906;
            }
            case 8: 
            case 30: {
                return 2250000;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
    }

    protected int e(int v) {
        int v1 = DefaultAudioTrackBufferSizeProvider.d(v);
        return l.d(((long)this.f) * ((long)v1) / 1000000L);
    }

    protected int f(int v, int v1) {
        int v3;
        int v2 = this.e;
        if(v == 5) {
            v3 = this.g;
        }
        else if(v == 8) {
            v3 = this.h;
        }
        else {
            return v1 == -1 ? l.d(((long)v2) * ((long)DefaultAudioTrackBufferSizeProvider.d(v)) / 1000000L) : l.d(((long)v2) * ((long)f.g(v1, 8, RoundingMode.CEILING)) / 1000000L);
        }
        v2 *= v3;
        return v1 == -1 ? l.d(((long)v2) * ((long)DefaultAudioTrackBufferSizeProvider.d(v)) / 1000000L) : l.d(((long)v2) * ((long)f.g(v1, 8, RoundingMode.CEILING)) / 1000000L);
    }

    protected int g(int v, int v1, int v2) {
        int v3 = DefaultAudioTrackBufferSizeProvider.b(this.b, v1, v2);
        int v4 = DefaultAudioTrackBufferSizeProvider.b(this.c, v1, v2);
        return Util.w(v * this.d, v3, v4);
    }
}

