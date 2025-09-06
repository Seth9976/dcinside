package androidx.media3.exoplayer.dash.manifest;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.math.b;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

@UnstableApi
public abstract class SegmentBase {
    public static abstract class MultiSegmentBase extends SegmentBase {
        final long d;
        final long e;
        @Nullable
        final List f;
        private final long g;
        private final long h;
        @VisibleForTesting
        final long i;

        public MultiSegmentBase(@Nullable RangedUri rangedUri0, long v, long v1, long v2, long v3, @Nullable List list0, long v4, long v5, long v6) {
            super(rangedUri0, v, v1);
            this.d = v2;
            this.e = v3;
            this.f = list0;
            this.i = v4;
            this.g = v5;
            this.h = v6;
        }

        public long c(long v, long v1) {
            long v2 = this.g(v);
            return v2 == -1L ? ((long)(((int)(this.i(v1 - this.h + this.i, v) - this.d(v, v1))))) : v2;
        }

        public long d(long v, long v1) {
            if(this.g(v) == -1L) {
                return this.g == 0x8000000000000001L ? this.e() : Math.max(this.e(), this.i(v1 - this.h - this.g, v));
            }
            return this.e();
        }

        public long e() {
            return this.d;
        }

        public long f(long v, long v1) {
            if(this.f != null) {
                return 0x8000000000000001L;
            }
            long v2 = this.d(v, v1) + this.c(v, v1);
            return this.j(v2) + this.h(v2, v) - this.i;
        }

        public abstract long g(long arg1);

        public final long h(long v, long v1) {
            List list0 = this.f;
            if(list0 != null) {
                return ((SegmentTimelineElement)list0.get(((int)(v - this.d)))).b * 1000000L / this.b;
            }
            long v2 = this.g(v1);
            return v2 == -1L || v != this.e() + v2 - 1L ? this.e * 1000000L / this.b : v1 - this.j(v);
        }

        public long i(long v, long v1) {
            long v2 = this.e();
            long v3 = this.g(v1);
            if(v3 == 0L) {
                return v2;
            }
            if(this.f == null) {
                long v4 = this.d + v / (this.e * 1000000L / this.b);
                if(v4 >= v2) {
                    return v3 == -1L ? v4 : Math.min(v4, v2 + v3 - 1L);
                }
                return v2;
            }
            long v5 = v3 + v2 - 1L;
            long v6 = v2;
            while(v6 <= v5) {
                long v7 = (v5 - v6) / 2L + v6;
                int v8 = Long.compare(this.j(v7), v);
                if(v8 < 0) {
                    v6 = v7 + 1L;
                    continue;
                }
                if(v8 > 0) {
                    v5 = v7 - 1L;
                    continue;
                }
                return v7;
            }
            return v6 == v2 ? v6 : v5;
        }

        public final long j(long v) {
            return this.f == null ? Util.Z1((v - this.d) * this.e, 1000000L, this.b) : Util.Z1(((SegmentTimelineElement)this.f.get(((int)(v - this.d)))).a - this.c, 1000000L, this.b);
        }

        public abstract RangedUri k(Representation arg1, long arg2);

        public boolean l() {
            return this.f != null;
        }
    }

    public static final class SegmentList extends MultiSegmentBase {
        @Nullable
        final List j;

        public SegmentList(RangedUri rangedUri0, long v, long v1, long v2, long v3, @Nullable List list0, long v4, @Nullable List list1, long v5, long v6) {
            super(rangedUri0, v, v1, v2, v3, list0, v4, v5, v6);
            this.j = list1;
        }

        @Override  // androidx.media3.exoplayer.dash.manifest.SegmentBase$MultiSegmentBase
        public long g(long v) {
            return (long)this.j.size();
        }

        @Override  // androidx.media3.exoplayer.dash.manifest.SegmentBase$MultiSegmentBase
        public RangedUri k(Representation representation0, long v) {
            return (RangedUri)this.j.get(((int)(v - this.d)));
        }

        @Override  // androidx.media3.exoplayer.dash.manifest.SegmentBase$MultiSegmentBase
        public boolean l() {
            return true;
        }
    }

    public static final class SegmentTemplate extends MultiSegmentBase {
        @Nullable
        final UrlTemplate j;
        @Nullable
        final UrlTemplate k;
        final long l;

        public SegmentTemplate(RangedUri rangedUri0, long v, long v1, long v2, long v3, long v4, @Nullable List list0, long v5, @Nullable UrlTemplate urlTemplate0, @Nullable UrlTemplate urlTemplate1, long v6, long v7) {
            super(rangedUri0, v, v1, v2, v4, list0, v5, v6, v7);
            this.j = urlTemplate0;
            this.k = urlTemplate1;
            this.l = v3;
        }

        @Override  // androidx.media3.exoplayer.dash.manifest.SegmentBase
        @Nullable
        public RangedUri a(Representation representation0) {
            return this.j == null ? super.a(representation0) : new RangedUri(this.j.a(representation0.c.a, 0L, representation0.c.i, 0L), 0L, -1L);
        }

        @Override  // androidx.media3.exoplayer.dash.manifest.SegmentBase$MultiSegmentBase
        public long g(long v) {
            List list0 = this.f;
            if(list0 != null) {
                return (long)list0.size();
            }
            long v1 = this.l;
            if(v1 != -1L) {
                return v1 - this.d + 1L;
            }
            return v == 0x8000000000000001L ? -1L : b.c(BigInteger.valueOf(v).multiply(BigInteger.valueOf(this.b)), BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
        }

        @Override  // androidx.media3.exoplayer.dash.manifest.SegmentBase$MultiSegmentBase
        public RangedUri k(Representation representation0, long v) {
            List list0 = this.f;
            if(list0 != null) {
                long v1 = ((SegmentTimelineElement)list0.get(((int)(v - this.d)))).a;
                return new RangedUri(this.k.a(representation0.c.a, v, representation0.c.i, v1), 0L, -1L);
            }
            return new RangedUri(this.k.a(representation0.c.a, v, representation0.c.i, (v - this.d) * this.e), 0L, -1L);
        }
    }

    public static final class SegmentTimelineElement {
        final long a;
        final long b;

        public SegmentTimelineElement(long v, long v1) {
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
                return SegmentTimelineElement.class == class0 && (this.a == ((SegmentTimelineElement)object0).a && this.b == ((SegmentTimelineElement)object0).b);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return ((int)this.a) * 0x1F + ((int)this.b);
        }
    }

    public static class SingleSegmentBase extends SegmentBase {
        final long d;
        final long e;

        public SingleSegmentBase() {
            this(null, 1L, 0L, 0L, 0L);
        }

        public SingleSegmentBase(@Nullable RangedUri rangedUri0, long v, long v1, long v2, long v3) {
            super(rangedUri0, v, v1);
            this.d = v2;
            this.e = v3;
        }

        @Nullable
        public RangedUri c() {
            return this.e > 0L ? new RangedUri(null, this.d, this.e) : null;
        }
    }

    @Nullable
    final RangedUri a;
    final long b;
    final long c;

    public SegmentBase(@Nullable RangedUri rangedUri0, long v, long v1) {
        this.a = rangedUri0;
        this.b = v;
        this.c = v1;
    }

    @Nullable
    public RangedUri a(Representation representation0) {
        return this.a;
    }

    public long b() {
        return Util.Z1(this.c, 1000000L, this.b);
    }
}

