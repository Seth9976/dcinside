package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.io.IOException;

@UnstableApi
public abstract class BinarySearchSeeker {
    public static class BinarySearchSeekMap implements SeekMap {
        private final SeekTimestampConverter d;
        private final long e;
        private final long f;
        private final long g;
        private final long h;
        private final long i;
        private final long j;

        public BinarySearchSeekMap(SeekTimestampConverter binarySearchSeeker$SeekTimestampConverter0, long v, long v1, long v2, long v3, long v4, long v5) {
            this.d = binarySearchSeeker$SeekTimestampConverter0;
            this.e = v;
            this.f = v1;
            this.g = v2;
            this.h = v3;
            this.i = v4;
            this.j = v5;
        }

        @Override  // androidx.media3.extractor.SeekMap
        public long c1() {
            return this.e;
        }

        @Override  // androidx.media3.extractor.SeekMap
        public SeekPoints d1(long v) {
            return new SeekPoints(new SeekPoint(v, SeekOperationParams.h(this.d.a(v), this.f, this.g, this.h, this.i, this.j)));
        }

        @Override  // androidx.media3.extractor.SeekMap
        public boolean e1() {
            return true;
        }

        public long h(long v) {
            return this.d.a(v);
        }
    }

    public static final class DefaultSeekTimestampConverter implements SeekTimestampConverter {
        @Override  // androidx.media3.extractor.BinarySearchSeeker$SeekTimestampConverter
        public long a(long v) {
            return v;
        }
    }

    public static class SeekOperationParams {
        private final long a;
        private final long b;
        private final long c;
        private long d;
        private long e;
        private long f;
        private long g;
        private long h;

        protected SeekOperationParams(long v, long v1, long v2, long v3, long v4, long v5, long v6) {
            this.a = v;
            this.b = v1;
            this.d = v2;
            this.e = v3;
            this.f = v4;
            this.g = v5;
            this.c = v6;
            this.h = SeekOperationParams.h(v1, v2, v3, v4, v5, v6);
        }

        protected static long h(long v, long v1, long v2, long v3, long v4, long v5) {
            if(v3 + 1L < v4 && v1 + 1L < v2) {
                long v6 = (long)(((float)(v - v1)) * (((float)(v4 - v3)) / ((float)(v2 - v1))));
                return Util.x(v6 + v3 - v5 - v6 / 20L, v3, v4 - 1L);
            }
            return v3;
        }

        private long i() {
            return this.g;
        }

        private long j() {
            return this.f;
        }

        private long k() {
            return this.h;
        }

        private long l() {
            return this.a;
        }

        private long m() {
            return this.b;
        }

        private void n() {
            this.h = SeekOperationParams.h(this.b, this.d, this.e, this.f, this.g, this.c);
        }

        private void o(long v, long v1) {
            this.e = v;
            this.g = v1;
            this.n();
        }

        private void p(long v, long v1) {
            this.d = v;
            this.f = v1;
            this.n();
        }
    }

    public interface SeekTimestampConverter {
        long a(long arg1);
    }

    public static final class TimestampSearchResult {
        private final int a;
        private final long b;
        private final long c;
        public static final int d = 0;
        public static final int e = -1;
        public static final int f = -2;
        public static final int g = -3;
        public static final TimestampSearchResult h;

        static {
            TimestampSearchResult.h = new TimestampSearchResult(-3, 0x8000000000000001L, -1L);
        }

        private TimestampSearchResult(int v, long v1, long v2) {
            this.a = v;
            this.b = v1;
            this.c = v2;
        }

        public static TimestampSearchResult d(long v, long v1) {
            return new TimestampSearchResult(-1, v, v1);
        }

        public static TimestampSearchResult e(long v) {
            return new TimestampSearchResult(0, 0x8000000000000001L, v);
        }

        public static TimestampSearchResult f(long v, long v1) {
            return new TimestampSearchResult(-2, v, v1);
        }
    }

    public interface TimestampSeeker {
        TimestampSearchResult a(ExtractorInput arg1, long arg2) throws IOException;

        void b();
    }

    protected final BinarySearchSeekMap a;
    protected final TimestampSeeker b;
    @Nullable
    protected SeekOperationParams c;
    private final int d;
    private static final long e = 0x40000L;

    protected BinarySearchSeeker(SeekTimestampConverter binarySearchSeeker$SeekTimestampConverter0, TimestampSeeker binarySearchSeeker$TimestampSeeker0, long v, long v1, long v2, long v3, long v4, long v5, int v6) {
        this.b = binarySearchSeeker$TimestampSeeker0;
        this.d = v6;
        this.a = new BinarySearchSeekMap(binarySearchSeeker$SeekTimestampConverter0, v, v1, v2, v3, v4, v5);
    }

    protected SeekOperationParams a(long v) {
        return new SeekOperationParams(v, this.a.h(v), this.a.f, this.a.g, this.a.h, this.a.i, this.a.j);
    }

    public final SeekMap b() {
        return this.a;
    }

    public int c(ExtractorInput extractorInput0, PositionHolder positionHolder0) throws IOException {
        while(true) {
            SeekOperationParams binarySearchSeeker$SeekOperationParams0 = (SeekOperationParams)Assertions.k(this.c);
            long v = binarySearchSeeker$SeekOperationParams0.j();
            long v1 = binarySearchSeeker$SeekOperationParams0.i();
            long v2 = binarySearchSeeker$SeekOperationParams0.k();
            if(v1 - v <= ((long)this.d)) {
                this.e(false, v);
                return this.g(extractorInput0, v, positionHolder0);
            }
            if(!this.i(extractorInput0, v2)) {
                return this.g(extractorInput0, v2, positionHolder0);
            }
            extractorInput0.o();
            long v3 = binarySearchSeeker$SeekOperationParams0.m();
            TimestampSearchResult binarySearchSeeker$TimestampSearchResult0 = this.b.a(extractorInput0, v3);
            switch(binarySearchSeeker$TimestampSearchResult0.a) {
                case -3: {
                    this.e(false, v2);
                    return this.g(extractorInput0, v2, positionHolder0);
                }
                case -2: {
                    binarySearchSeeker$SeekOperationParams0.p(binarySearchSeeker$TimestampSearchResult0.b, binarySearchSeeker$TimestampSearchResult0.c);
                    break;
                }
                case -1: {
                    binarySearchSeeker$SeekOperationParams0.o(binarySearchSeeker$TimestampSearchResult0.b, binarySearchSeeker$TimestampSearchResult0.c);
                    break;
                }
                case 0: {
                    this.i(extractorInput0, binarySearchSeeker$TimestampSearchResult0.c);
                    this.e(true, binarySearchSeeker$TimestampSearchResult0.c);
                    return this.g(extractorInput0, binarySearchSeeker$TimestampSearchResult0.c, positionHolder0);
                }
                default: {
                    throw new IllegalStateException("Invalid case");
                }
            }
        }
    }

    public final boolean d() {
        return this.c != null;
    }

    protected final void e(boolean z, long v) {
        this.c = null;
        this.b.b();
    }

    protected void f(boolean z, long v) {
    }

    protected final int g(ExtractorInput extractorInput0, long v, PositionHolder positionHolder0) {
        if(v == extractorInput0.getPosition()) {
            return 0;
        }
        positionHolder0.a = v;
        return 1;
    }

    public final void h(long v) {
        if(this.c != null && this.c.l() == v) {
            return;
        }
        this.c = this.a(v);
    }

    protected final boolean i(ExtractorInput extractorInput0, long v) throws IOException {
        long v1 = v - extractorInput0.getPosition();
        if(v1 >= 0L && v1 <= 0x40000L) {
            extractorInput0.r(((int)v1));
            return true;
        }
        return false;
    }
}

