package androidx.media3.exoplayer.dash.manifest;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.dash.DashSegmentIndex;
import com.google.common.collect.O2;
import j..util.DesugarCollections;
import java.util.Collections;
import java.util.List;

@UnstableApi
public abstract class Representation {
    public static class MultiSegmentRepresentation extends Representation implements DashSegmentIndex {
        @VisibleForTesting
        final MultiSegmentBase k;

        public MultiSegmentRepresentation(long v, Format format0, List list0, MultiSegmentBase segmentBase$MultiSegmentBase0, @Nullable List list1, List list2, List list3) {
            super(v, format0, list0, segmentBase$MultiSegmentBase0, list1, list2, list3, null);
            this.k = segmentBase$MultiSegmentBase0;
        }

        @Override  // androidx.media3.exoplayer.dash.manifest.Representation
        @Nullable
        public String a() {
            return null;
        }

        @Override  // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long b(long v) {
            return this.k.j(v);
        }

        @Override  // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long c(long v, long v1) {
            return this.k.h(v, v1);
        }

        @Override  // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long d(long v, long v1) {
            return this.k.d(v, v1);
        }

        @Override  // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long e(long v, long v1) {
            return this.k.f(v, v1);
        }

        @Override  // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long f(long v, long v1) {
            return this.k.i(v, v1);
        }

        @Override  // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long g(long v) {
            return this.k.g(v);
        }

        @Override  // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long h() {
            return this.k.e();
        }

        @Override  // androidx.media3.exoplayer.dash.DashSegmentIndex
        public RangedUri i(long v) {
            return this.k.k(this, v);
        }

        @Override  // androidx.media3.exoplayer.dash.DashSegmentIndex
        public boolean j() {
            return this.k.l();
        }

        @Override  // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long k(long v, long v1) {
            return this.k.c(v, v1);
        }

        @Override  // androidx.media3.exoplayer.dash.manifest.Representation
        public DashSegmentIndex l() {
            return this;
        }

        @Override  // androidx.media3.exoplayer.dash.manifest.Representation
        @Nullable
        public RangedUri m() {
            return null;
        }
    }

    public static class SingleSegmentRepresentation extends Representation {
        public final Uri k;
        public final long l;
        @Nullable
        private final String m;
        @Nullable
        private final RangedUri n;
        @Nullable
        private final SingleSegmentIndex o;

        public SingleSegmentRepresentation(long v, Format format0, List list0, SingleSegmentBase segmentBase$SingleSegmentBase0, @Nullable List list1, List list2, List list3, @Nullable String s, long v1) {
            super(v, format0, list0, segmentBase$SingleSegmentBase0, list1, list2, list3, null);
            this.k = Uri.parse(((BaseUrl)list0.get(0)).a);
            RangedUri rangedUri0 = segmentBase$SingleSegmentBase0.c();
            this.n = rangedUri0;
            this.m = s;
            this.l = v1;
            this.o = rangedUri0 == null ? new SingleSegmentIndex(new RangedUri(null, 0L, v1)) : null;
        }

        @Override  // androidx.media3.exoplayer.dash.manifest.Representation
        @Nullable
        public String a() {
            return this.m;
        }

        @Override  // androidx.media3.exoplayer.dash.manifest.Representation
        @Nullable
        public DashSegmentIndex l() {
            return this.o;
        }

        @Override  // androidx.media3.exoplayer.dash.manifest.Representation
        @Nullable
        public RangedUri m() {
            return this.n;
        }

        public static SingleSegmentRepresentation q(long v, Format format0, String s, long v1, long v2, long v3, long v4, List list0, @Nullable String s1, long v5) {
            SingleSegmentBase segmentBase$SingleSegmentBase0 = new SingleSegmentBase(new RangedUri(null, v1, v2 - v1 + 1L), 1L, 0L, v3, v4 - v3 + 1L);
            return new SingleSegmentRepresentation(v, format0, O2.B(new BaseUrl(s)), segmentBase$SingleSegmentBase0, list0, O2.A(), O2.A(), s1, v5);
        }
    }

    public final long b;
    public final Format c;
    public final O2 d;
    public final long e;
    public final List f;
    public final List g;
    public final List h;
    @Nullable
    private final RangedUri i;
    public static final long j = -1L;

    private Representation(long v, Format format0, List list0, SegmentBase segmentBase0, @Nullable List list1, List list2, List list3) {
        Assertions.a(!list0.isEmpty());
        this.b = v;
        this.c = format0;
        this.d = O2.r(list0);
        this.f = list1 == null ? Collections.emptyList() : DesugarCollections.unmodifiableList(list1);
        this.g = list2;
        this.h = list3;
        this.i = segmentBase0.a(this);
        this.e = segmentBase0.b();
    }

    Representation(long v, Format format0, List list0, SegmentBase segmentBase0, List list1, List list2, List list3, androidx.media3.exoplayer.dash.manifest.Representation.1 representation$10) {
        this(v, format0, list0, segmentBase0, list1, list2, list3);
    }

    @Nullable
    public abstract String a();

    @Nullable
    public abstract DashSegmentIndex l();

    @Nullable
    public abstract RangedUri m();

    @Nullable
    public RangedUri n() {
        return this.i;
    }

    public static Representation o(long v, Format format0, List list0, SegmentBase segmentBase0) {
        return Representation.p(v, format0, list0, segmentBase0, null, O2.A(), O2.A(), null);
    }

    public static Representation p(long v, Format format0, List list0, SegmentBase segmentBase0, @Nullable List list1, List list2, List list3, @Nullable String s) {
        if(segmentBase0 instanceof SingleSegmentBase) {
            return new SingleSegmentRepresentation(v, format0, list0, ((SingleSegmentBase)segmentBase0), list1, list2, list3, s, -1L);
        }
        if(!(segmentBase0 instanceof MultiSegmentBase)) {
            throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
        }
        return new MultiSegmentRepresentation(v, format0, list0, ((MultiSegmentBase)segmentBase0), list1, list2, list3);
    }

    class androidx.media3.exoplayer.dash.manifest.Representation.1 {
    }

}

