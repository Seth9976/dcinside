package androidx.media3.exoplayer.dash;

import O1.a;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.UriUtil;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.BaseUrl;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.dash.manifest.RangedUri;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.source.chunk.BaseMediaChunkIterator;
import androidx.media3.exoplayer.source.chunk.BundledChunkExtractor;
import androidx.media3.exoplayer.source.chunk.Chunk;
import androidx.media3.exoplayer.source.chunk.ChunkExtractor;
import androidx.media3.exoplayer.source.chunk.ChunkHolder;
import androidx.media3.exoplayer.source.chunk.ContainerMediaChunk;
import androidx.media3.exoplayer.source.chunk.InitializationChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import androidx.media3.exoplayer.source.chunk.SingleSampleMediaChunk;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.FallbackOptions;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.FallbackSelection;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoaderErrorThrower;
import androidx.media3.extractor.ChunkIndex;
import com.google.common.collect.Q2;
import h4.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@UnstableApi
public class DefaultDashChunkSource implements DashChunkSource {
    public static final class Factory implements androidx.media3.exoplayer.dash.DashChunkSource.Factory {
        private final androidx.media3.datasource.DataSource.Factory a;
        private final int b;
        private final androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory c;

        public Factory(androidx.media3.datasource.DataSource.Factory dataSource$Factory0) {
            this(dataSource$Factory0, 1);
        }

        public Factory(androidx.media3.datasource.DataSource.Factory dataSource$Factory0, int v) {
            this(BundledChunkExtractor.j, dataSource$Factory0, v);
        }

        public Factory(androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory chunkExtractor$Factory0, androidx.media3.datasource.DataSource.Factory dataSource$Factory0, int v) {
            this.c = chunkExtractor$Factory0;
            this.a = dataSource$Factory0;
            this.b = v;
        }

        @Override  // androidx.media3.exoplayer.dash.DashChunkSource$Factory
        @a
        public androidx.media3.exoplayer.dash.DashChunkSource.Factory a(androidx.media3.extractor.text.SubtitleParser.Factory subtitleParser$Factory0) {
            return this.f(subtitleParser$Factory0);
        }

        @Override  // androidx.media3.exoplayer.dash.DashChunkSource$Factory
        @a
        public androidx.media3.exoplayer.dash.DashChunkSource.Factory b(boolean z) {
            return this.e(z);
        }

        @Override  // androidx.media3.exoplayer.dash.DashChunkSource$Factory
        public Format c(Format format0) {
            return this.c.c(format0);
        }

        @Override  // androidx.media3.exoplayer.dash.DashChunkSource$Factory
        public DashChunkSource d(LoaderErrorThrower loaderErrorThrower0, DashManifest dashManifest0, BaseUrlExclusionList baseUrlExclusionList0, int v, int[] arr_v, ExoTrackSelection exoTrackSelection0, int v1, long v2, boolean z, List list0, @Nullable PlayerTrackEmsgHandler playerEmsgHandler$PlayerTrackEmsgHandler0, @Nullable TransferListener transferListener0, PlayerId playerId0, @Nullable CmcdConfiguration cmcdConfiguration0) {
            DataSource dataSource0 = this.a.a();
            if(transferListener0 != null) {
                dataSource0.l(transferListener0);
            }
            return new DefaultDashChunkSource(this.c, loaderErrorThrower0, dashManifest0, baseUrlExclusionList0, v, arr_v, exoTrackSelection0, v1, dataSource0, v2, this.b, z, list0, playerEmsgHandler$PlayerTrackEmsgHandler0, playerId0, cmcdConfiguration0);
        }

        @a
        public Factory e(boolean z) {
            this.c.b(z);
            return this;
        }

        @a
        public Factory f(androidx.media3.extractor.text.SubtitleParser.Factory subtitleParser$Factory0) {
            this.c.a(subtitleParser$Factory0);
            return this;
        }
    }

    public static final class RepresentationHolder {
        @Nullable
        final ChunkExtractor a;
        public final Representation b;
        public final BaseUrl c;
        @Nullable
        public final DashSegmentIndex d;
        private final long e;
        private final long f;

        RepresentationHolder(long v, Representation representation0, BaseUrl baseUrl0, @Nullable ChunkExtractor chunkExtractor0, long v1, @Nullable DashSegmentIndex dashSegmentIndex0) {
            this.e = v;
            this.b = representation0;
            this.c = baseUrl0;
            this.f = v1;
            this.a = chunkExtractor0;
            this.d = dashSegmentIndex0;
        }

        @CheckResult
        RepresentationHolder b(long v, Representation representation0) throws BehindLiveWindowException {
            DashSegmentIndex dashSegmentIndex0 = this.b.l();
            DashSegmentIndex dashSegmentIndex1 = representation0.l();
            if(dashSegmentIndex0 == null) {
                return new RepresentationHolder(v, representation0, this.c, this.a, this.f, null);
            }
            if(!dashSegmentIndex0.j()) {
                return new RepresentationHolder(v, representation0, this.c, this.a, this.f, dashSegmentIndex1);
            }
            long v1 = dashSegmentIndex0.g(v);
            if(v1 == 0L) {
                return new RepresentationHolder(v, representation0, this.c, this.a, this.f, dashSegmentIndex1);
            }
            Assertions.k(dashSegmentIndex1);
            long v2 = dashSegmentIndex0.h();
            long v3 = dashSegmentIndex0.b(v2);
            long v4 = v1 + v2;
            long v5 = dashSegmentIndex0.b(v4 - 1L);
            long v6 = dashSegmentIndex0.c(v4 - 1L, v);
            long v7 = dashSegmentIndex1.h();
            long v8 = dashSegmentIndex1.b(v7);
            long v9 = this.f;
            int v10 = Long.compare(v5 + v6, v8);
            if(v10 == 0) {
                return new RepresentationHolder(v, representation0, this.c, this.a, v9 + (v4 - v7), dashSegmentIndex1);
            }
            if(v10 < 0) {
                throw new BehindLiveWindowException();
            }
            if(v8 < v3) {
                long v11 = v9 - (dashSegmentIndex1.f(v3, v) - v2);
                return new RepresentationHolder(v, representation0, this.c, this.a, v11, dashSegmentIndex1);
            }
            v4 = dashSegmentIndex0.f(v8, v);
            return new RepresentationHolder(v, representation0, this.c, this.a, v9 + (v4 - v7), dashSegmentIndex1);
        }

        @CheckResult
        RepresentationHolder c(DashSegmentIndex dashSegmentIndex0) {
            return new RepresentationHolder(this.e, this.b, this.c, this.a, this.f, dashSegmentIndex0);
        }

        @CheckResult
        RepresentationHolder d(BaseUrl baseUrl0) {
            return new RepresentationHolder(this.e, this.b, baseUrl0, this.a, this.f, this.d);
        }

        public long e(long v) {
            return ((DashSegmentIndex)Assertions.k(this.d)).d(this.e, v) + this.f;
        }

        public long f() {
            return ((DashSegmentIndex)Assertions.k(this.d)).h() + this.f;
        }

        public long g(long v) {
            return this.e(v) + ((DashSegmentIndex)Assertions.k(this.d)).k(this.e, v) - 1L;
        }

        public long h() {
            return ((DashSegmentIndex)Assertions.k(this.d)).g(this.e);
        }

        public long i(long v) {
            return this.k(v) + ((DashSegmentIndex)Assertions.k(this.d)).c(v - this.f, this.e);
        }

        public long j(long v) {
            return ((DashSegmentIndex)Assertions.k(this.d)).f(v, this.e) + this.f;
        }

        public long k(long v) {
            return ((DashSegmentIndex)Assertions.k(this.d)).b(v - this.f);
        }

        public RangedUri l(long v) {
            return ((DashSegmentIndex)Assertions.k(this.d)).i(v - this.f);
        }

        // 去混淆评级： 低(20)
        public boolean m(long v, long v1) {
            return ((DashSegmentIndex)Assertions.k(this.d)).j() ? true : v1 == 0x8000000000000001L || this.i(v) <= v1;
        }
    }

    public static final class RepresentationSegmentIterator extends BaseMediaChunkIterator {
        private final RepresentationHolder e;
        private final long f;

        public RepresentationSegmentIterator(RepresentationHolder defaultDashChunkSource$RepresentationHolder0, long v, long v1, long v2) {
            super(v, v1);
            this.e = defaultDashChunkSource$RepresentationHolder0;
            this.f = v2;
        }

        @Override  // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public long a() {
            this.e();
            return this.e.i(this.f());
        }

        @Override  // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public long c() {
            this.e();
            return this.e.k(this.f());
        }

        @Override  // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public DataSpec d() {
            this.e();
            long v = this.f();
            RangedUri rangedUri0 = this.e.l(v);
            return this.e.m(v, this.f) ? DashUtil.c(this.e.b, this.e.c.a, rangedUri0, 0, Q2.u()) : DashUtil.c(this.e.b, this.e.c.a, rangedUri0, 8, Q2.u());
        }
    }

    private final LoaderErrorThrower a;
    private final BaseUrlExclusionList b;
    private final int[] c;
    private final int d;
    private final DataSource e;
    private final long f;
    private final int g;
    @Nullable
    private final PlayerTrackEmsgHandler h;
    @Nullable
    private final CmcdConfiguration i;
    protected final RepresentationHolder[] j;
    private ExoTrackSelection k;
    private DashManifest l;
    private int m;
    @Nullable
    private IOException n;
    private boolean o;
    private long p;

    public DefaultDashChunkSource(androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory chunkExtractor$Factory0, LoaderErrorThrower loaderErrorThrower0, DashManifest dashManifest0, BaseUrlExclusionList baseUrlExclusionList0, int v, int[] arr_v, ExoTrackSelection exoTrackSelection0, int v1, DataSource dataSource0, long v2, int v3, boolean z, List list0, @Nullable PlayerTrackEmsgHandler playerEmsgHandler$PlayerTrackEmsgHandler0, PlayerId playerId0, @Nullable CmcdConfiguration cmcdConfiguration0) {
        this.a = loaderErrorThrower0;
        this.l = dashManifest0;
        this.b = baseUrlExclusionList0;
        this.c = arr_v;
        this.k = exoTrackSelection0;
        this.d = v1;
        this.e = dataSource0;
        this.m = v;
        this.f = v2;
        this.g = v3;
        this.h = playerEmsgHandler$PlayerTrackEmsgHandler0;
        this.i = cmcdConfiguration0;
        this.p = 0x8000000000000001L;
        long v4 = dashManifest0.g(v);
        ArrayList arrayList0 = this.n();
        this.j = new RepresentationHolder[exoTrackSelection0.length()];
        for(int v5 = 0; v5 < this.j.length; ++v5) {
            Representation representation0 = (Representation)arrayList0.get(exoTrackSelection0.e(v5));
            BaseUrl baseUrl0 = baseUrlExclusionList0.j(representation0.d);
            RepresentationHolder[] arr_defaultDashChunkSource$RepresentationHolder = this.j;
            if(baseUrl0 == null) {
                baseUrl0 = (BaseUrl)representation0.d.get(0);
            }
            arr_defaultDashChunkSource$RepresentationHolder[v5] = new RepresentationHolder(v4, representation0, baseUrl0, chunkExtractor$Factory0.d(v1, representation0.c, z, list0, playerEmsgHandler$PlayerTrackEmsgHandler0, playerId0), 0L, representation0.l());
        }
    }

    @Override  // androidx.media3.exoplayer.source.chunk.ChunkSource
    public boolean a(Chunk chunk0, boolean z, LoadErrorInfo loadErrorHandlingPolicy$LoadErrorInfo0, LoadErrorHandlingPolicy loadErrorHandlingPolicy0) {
        if(!z) {
            return false;
        }
        if(this.h != null && this.h.j(chunk0)) {
            return true;
        }
        if(!this.l.d && chunk0 instanceof MediaChunk && (loadErrorHandlingPolicy$LoadErrorInfo0.c instanceof InvalidResponseCodeException && ((InvalidResponseCodeException)loadErrorHandlingPolicy$LoadErrorInfo0.c).h == 404)) {
            RepresentationHolder defaultDashChunkSource$RepresentationHolder0 = this.j[this.k.p(chunk0.d)];
            long v = defaultDashChunkSource$RepresentationHolder0.h();
            if(v != -1L && v != 0L) {
                long v1 = defaultDashChunkSource$RepresentationHolder0.f();
                if(((MediaChunk)chunk0).f() > v1 + v - 1L) {
                    this.o = true;
                    return true;
                }
            }
        }
        RepresentationHolder defaultDashChunkSource$RepresentationHolder1 = this.j[this.k.p(chunk0.d)];
        BaseUrl baseUrl0 = this.b.j(defaultDashChunkSource$RepresentationHolder1.b.d);
        if(baseUrl0 != null && !defaultDashChunkSource$RepresentationHolder1.c.equals(baseUrl0)) {
            return true;
        }
        FallbackOptions loadErrorHandlingPolicy$FallbackOptions0 = this.j(this.k, defaultDashChunkSource$RepresentationHolder1.b.d);
        if(!loadErrorHandlingPolicy$FallbackOptions0.a(2) && !loadErrorHandlingPolicy$FallbackOptions0.a(1)) {
            return false;
        }
        FallbackSelection loadErrorHandlingPolicy$FallbackSelection0 = loadErrorHandlingPolicy0.b(loadErrorHandlingPolicy$FallbackOptions0, loadErrorHandlingPolicy$LoadErrorInfo0);
        if(loadErrorHandlingPolicy$FallbackSelection0 != null && loadErrorHandlingPolicy$FallbackOptions0.a(loadErrorHandlingPolicy$FallbackSelection0.a)) {
            int v2 = loadErrorHandlingPolicy$FallbackSelection0.a;
            if(v2 == 2) {
                return this.k.f(this.k.p(chunk0.d), loadErrorHandlingPolicy$FallbackSelection0.b);
            }
            if(v2 == 1) {
                this.b.e(defaultDashChunkSource$RepresentationHolder1.c, loadErrorHandlingPolicy$FallbackSelection0.b);
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.media3.exoplayer.source.chunk.ChunkSource
    public void b() throws IOException {
        IOException iOException0 = this.n;
        if(iOException0 != null) {
            throw iOException0;
        }
        this.a.b();
    }

    @Override  // androidx.media3.exoplayer.source.chunk.ChunkSource
    public long c(long v, SeekParameters seekParameters0) {
        RepresentationHolder[] arr_defaultDashChunkSource$RepresentationHolder = this.j;
        for(int v1 = 0; v1 < arr_defaultDashChunkSource$RepresentationHolder.length; ++v1) {
            RepresentationHolder defaultDashChunkSource$RepresentationHolder0 = arr_defaultDashChunkSource$RepresentationHolder[v1];
            if(defaultDashChunkSource$RepresentationHolder0.d != null) {
                long v2 = defaultDashChunkSource$RepresentationHolder0.h();
                if(v2 != 0L) {
                    long v3 = defaultDashChunkSource$RepresentationHolder0.j(v);
                    long v4 = defaultDashChunkSource$RepresentationHolder0.k(v3);
                    return v4 >= v || v2 != -1L && v3 >= defaultDashChunkSource$RepresentationHolder0.f() + v2 - 1L ? seekParameters0.a(v, v4, v4) : seekParameters0.a(v, v4, defaultDashChunkSource$RepresentationHolder0.k(v3 + 1L));
                }
            }
        }
        return v;
    }

    @Override  // androidx.media3.exoplayer.source.chunk.ChunkSource
    public void d(Chunk chunk0) {
        if(chunk0 instanceof InitializationChunk) {
            int v = this.k.p(((InitializationChunk)chunk0).d);
            RepresentationHolder defaultDashChunkSource$RepresentationHolder0 = this.j[v];
            if(defaultDashChunkSource$RepresentationHolder0.d == null) {
                ChunkIndex chunkIndex0 = ((ChunkExtractor)Assertions.k(defaultDashChunkSource$RepresentationHolder0.a)).d();
                if(chunkIndex0 != null) {
                    this.j[v] = defaultDashChunkSource$RepresentationHolder0.c(new DashWrappingSegmentIndex(chunkIndex0, defaultDashChunkSource$RepresentationHolder0.b.e));
                }
            }
        }
        PlayerTrackEmsgHandler playerEmsgHandler$PlayerTrackEmsgHandler0 = this.h;
        if(playerEmsgHandler$PlayerTrackEmsgHandler0 != null) {
            playerEmsgHandler$PlayerTrackEmsgHandler0.i(chunk0);
        }
    }

    @Override  // androidx.media3.exoplayer.source.chunk.ChunkSource
    public void e(LoadingInfo loadingInfo0, long v, List list0, ChunkHolder chunkHolder0) {
        androidx.media3.exoplayer.upstream.CmcdData.Factory cmcdData$Factory0;
        long v12;
        long v11;
        MediaChunkIterator[] arr_mediaChunkIterator1;
        int v10;
        int v9;
        if(this.n != null) {
            return;
        }
        long v1 = loadingInfo0.a;
        long v2 = v - v1;
        long v3 = Util.F1(this.l.a);
        long v4 = Util.F1(this.l.d(this.m).b);
        if(this.h != null && this.h.h(v3 + v4 + v)) {
            return;
        }
        long v5 = Util.F1(Util.y0(this.f));
        long v6 = this.m(v5);
        MediaChunk mediaChunk0 = list0.isEmpty() ? null : ((MediaChunk)list0.get(list0.size() - 1));
        int v7 = this.k.length();
        MediaChunkIterator[] arr_mediaChunkIterator = new MediaChunkIterator[v7];
        int v8 = 0;
        while(v8 < v7) {
            RepresentationHolder defaultDashChunkSource$RepresentationHolder0 = this.j[v8];
            if(defaultDashChunkSource$RepresentationHolder0.d == null) {
                arr_mediaChunkIterator[v8] = MediaChunkIterator.a;
                v9 = v8;
                v10 = v7;
                arr_mediaChunkIterator1 = arr_mediaChunkIterator;
                v11 = v2;
                v12 = v5;
            }
            else {
                long v13 = defaultDashChunkSource$RepresentationHolder0.e(v5);
                long v14 = defaultDashChunkSource$RepresentationHolder0.g(v5);
                v9 = v8;
                v10 = v7;
                arr_mediaChunkIterator1 = arr_mediaChunkIterator;
                v11 = v2;
                v12 = v5;
                long v15 = this.o(defaultDashChunkSource$RepresentationHolder0, mediaChunk0, v, v13, v14);
                arr_mediaChunkIterator1[v9] = v15 < v13 ? MediaChunkIterator.a : new RepresentationSegmentIterator(this.r(v9), v15, v14, v6);
            }
            v8 = v9 + 1;
            v5 = v12;
            v7 = v10;
            arr_mediaChunkIterator = arr_mediaChunkIterator1;
            v2 = v11;
        }
        long v16 = this.k(v5, v1);
        this.k.r(v1, v2, v16, list0, arr_mediaChunkIterator);
        int v17 = this.k.d();
        if(this.i == null) {
            cmcdData$Factory0 = null;
        }
        else {
            ExoTrackSelection exoTrackSelection0 = this.k;
            boolean z = this.l.d;
            boolean z1 = loadingInfo0.b(this.p);
            cmcdData$Factory0 = new androidx.media3.exoplayer.upstream.CmcdData.Factory(this.i, exoTrackSelection0, Math.max(0L, v2), loadingInfo0.b, "d", z, z1, list0.isEmpty());
        }
        this.p = SystemClock.elapsedRealtime();
        RepresentationHolder defaultDashChunkSource$RepresentationHolder1 = this.r(v17);
        ChunkExtractor chunkExtractor0 = defaultDashChunkSource$RepresentationHolder1.a;
        if(chunkExtractor0 != null) {
            RangedUri rangedUri0 = chunkExtractor0.e() == null ? defaultDashChunkSource$RepresentationHolder1.b.n() : null;
            RangedUri rangedUri1 = defaultDashChunkSource$RepresentationHolder1.d == null ? defaultDashChunkSource$RepresentationHolder1.b.m() : null;
            if(rangedUri0 != null || rangedUri1 != null) {
                Format format0 = this.k.n();
                int v18 = this.k.v();
                Object object0 = this.k.t();
                chunkHolder0.a = this.p(defaultDashChunkSource$RepresentationHolder1, this.e, format0, v18, object0, rangedUri0, rangedUri1, cmcdData$Factory0);
                return;
            }
        }
        long v19 = defaultDashChunkSource$RepresentationHolder1.e;
        boolean z2 = this.l.d && this.m == this.l.e() - 1;
        long v20 = 0x8000000000000001L;
        boolean z3 = !z2 || v19 != 0x8000000000000001L;
        if(defaultDashChunkSource$RepresentationHolder1.h() == 0L) {
            chunkHolder0.b = z3;
            return;
        }
        long v21 = defaultDashChunkSource$RepresentationHolder1.e(v5);
        long v22 = defaultDashChunkSource$RepresentationHolder1.g(v5);
        if(z2) {
            long v23 = defaultDashChunkSource$RepresentationHolder1.i(v22);
            z3 &= v23 + (v23 - defaultDashChunkSource$RepresentationHolder1.k(v22)) >= v19;
        }
        long v24 = this.o(defaultDashChunkSource$RepresentationHolder1, mediaChunk0, v, v21, v22);
        if(v24 < v21) {
            this.n = new BehindLiveWindowException();
            return;
        }
        int v25 = Long.compare(v24, v22);
        if(v25 > 0 || this.o && v25 >= 0) {
            chunkHolder0.b = z3;
            return;
        }
        if(z3 && defaultDashChunkSource$RepresentationHolder1.k(v24) >= v19) {
            chunkHolder0.b = true;
            return;
        }
        int v26 = (int)Math.min(this.g, v22 - v24 + 1L);
        if(v19 != 0x8000000000000001L) {
            while(v26 > 1 && defaultDashChunkSource$RepresentationHolder1.k(((long)v26) + v24 - 1L) >= v19) {
                --v26;
            }
        }
        if(list0.isEmpty()) {
            v20 = v;
        }
        Format format1 = this.k.n();
        int v27 = this.k.v();
        Object object1 = this.k.t();
        chunkHolder0.a = this.q(defaultDashChunkSource$RepresentationHolder1, this.e, this.d, format1, v27, object1, v24, v26, v20, v6, cmcdData$Factory0);
    }

    @Override  // androidx.media3.exoplayer.dash.DashChunkSource
    public void f(ExoTrackSelection exoTrackSelection0) {
        this.k = exoTrackSelection0;
    }

    @Override  // androidx.media3.exoplayer.source.chunk.ChunkSource
    public int g(long v, List list0) {
        return this.n != null || this.k.length() < 2 ? list0.size() : this.k.l(v, list0);
    }

    @Override  // androidx.media3.exoplayer.dash.DashChunkSource
    public void h(DashManifest dashManifest0, int v) {
        try {
            this.l = dashManifest0;
            this.m = v;
            long v1 = dashManifest0.g(v);
            ArrayList arrayList0 = this.n();
        label_5:
            for(int v2 = 0; v2 < this.j.length; ++v2) {
                Representation representation0 = (Representation)arrayList0.get(this.k.e(v2));
                this.j[v2] = this.j[v2].b(v1, representation0);
            }
        }
        catch(BehindLiveWindowException behindLiveWindowException0) {
            this.n = behindLiveWindowException0;
            if(true) {
                return;
            }
            goto label_5;
        }
    }

    @Override  // androidx.media3.exoplayer.source.chunk.ChunkSource
    public boolean i(long v, Chunk chunk0, List list0) {
        return this.n == null ? this.k.j(v, chunk0, list0) : false;
    }

    private FallbackOptions j(ExoTrackSelection exoTrackSelection0, List list0) {
        long v = SystemClock.elapsedRealtime();
        int v1 = exoTrackSelection0.length();
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            if(exoTrackSelection0.b(v2, v)) {
                ++v3;
            }
        }
        int v4 = BaseUrlExclusionList.f(list0);
        return new FallbackOptions(v4, v4 - this.b.g(list0), v1, v3);
    }

    private long k(long v, long v1) {
        if(this.l.d && this.j[0].h() != 0L) {
            long v2 = this.j[0].g(v);
            long v3 = this.j[0].i(v2);
            return Math.max(0L, Math.min(this.m(v), v3) - v1);
        }
        return 0x8000000000000001L;
    }

    @Nullable
    private Pair l(long v, RangedUri rangedUri0, RepresentationHolder defaultDashChunkSource$RepresentationHolder0) {
        if(v + 1L >= defaultDashChunkSource$RepresentationHolder0.h()) {
            return null;
        }
        RangedUri rangedUri1 = defaultDashChunkSource$RepresentationHolder0.l(v + 1L);
        return new Pair(UriUtil.a(rangedUri0.b(defaultDashChunkSource$RepresentationHolder0.c.a), rangedUri1.b(defaultDashChunkSource$RepresentationHolder0.c.a)), (rangedUri1.b == -1L ? rangedUri1.a + "-" : rangedUri1.a + "-" + (rangedUri1.a + rangedUri1.b)));
    }

    private long m(long v) {
        long v1 = this.l.a;
        return v1 == 0x8000000000000001L ? 0x8000000000000001L : v - Util.F1(v1 + this.l.d(this.m).b);
    }

    @m({"manifest", "adaptationSetIndices"})
    private ArrayList n() {
        List list0 = this.l.d(this.m).c;
        ArrayList arrayList0 = new ArrayList();
        int[] arr_v = this.c;
        for(int v = 0; v < arr_v.length; ++v) {
            arrayList0.addAll(((AdaptationSet)list0.get(arr_v[v])).c);
        }
        return arrayList0;
    }

    private long o(RepresentationHolder defaultDashChunkSource$RepresentationHolder0, @Nullable MediaChunk mediaChunk0, long v, long v1, long v2) {
        return mediaChunk0 == null ? Util.x(defaultDashChunkSource$RepresentationHolder0.j(v), v1, v2) : mediaChunk0.f();
    }

    @m({"#1.chunkExtractor"})
    protected Chunk p(RepresentationHolder defaultDashChunkSource$RepresentationHolder0, DataSource dataSource0, Format format0, int v, @Nullable Object object0, @Nullable RangedUri rangedUri0, @Nullable RangedUri rangedUri1, @Nullable androidx.media3.exoplayer.upstream.CmcdData.Factory cmcdData$Factory0) {
        Representation representation0 = defaultDashChunkSource$RepresentationHolder0.b;
        if(rangedUri0 == null) {
            rangedUri0 = (RangedUri)Assertions.g(rangedUri1);
        }
        else {
            RangedUri rangedUri2 = rangedUri0.a(rangedUri1, defaultDashChunkSource$RepresentationHolder0.c.a);
            if(rangedUri2 != null) {
                rangedUri0 = rangedUri2;
            }
        }
        DataSpec dataSpec0 = DashUtil.c(representation0, defaultDashChunkSource$RepresentationHolder0.c.a, rangedUri0, 0, Q2.u());
        if(cmcdData$Factory0 != null) {
            dataSpec0 = cmcdData$Factory0.g("i").a().a(dataSpec0);
        }
        return new InitializationChunk(dataSource0, dataSpec0, format0, v, object0, defaultDashChunkSource$RepresentationHolder0.a);
    }

    protected Chunk q(RepresentationHolder defaultDashChunkSource$RepresentationHolder0, DataSource dataSource0, int v, Format format0, int v1, @Nullable Object object0, long v2, int v3, long v4, long v5, @Nullable androidx.media3.exoplayer.upstream.CmcdData.Factory cmcdData$Factory0) {
        Representation representation0 = defaultDashChunkSource$RepresentationHolder0.b;
        long v6 = defaultDashChunkSource$RepresentationHolder0.k(v2);
        RangedUri rangedUri0 = defaultDashChunkSource$RepresentationHolder0.l(v2);
        if(defaultDashChunkSource$RepresentationHolder0.a == null) {
            long v7 = defaultDashChunkSource$RepresentationHolder0.i(v2);
            int v8 = defaultDashChunkSource$RepresentationHolder0.m(v2, v5) ? 0 : 8;
            DataSpec dataSpec0 = DashUtil.c(representation0, defaultDashChunkSource$RepresentationHolder0.c.a, rangedUri0, v8, Q2.u());
            if(cmcdData$Factory0 != null) {
                cmcdData$Factory0.d(v7 - v6).g(androidx.media3.exoplayer.upstream.CmcdData.Factory.c(this.k));
                Pair pair0 = this.l(v2, rangedUri0, defaultDashChunkSource$RepresentationHolder0);
                if(pair0 != null) {
                    cmcdData$Factory0.e(((String)pair0.first)).f(((String)pair0.second));
                }
                return new SingleSampleMediaChunk(dataSource0, cmcdData$Factory0.a().a(dataSpec0), format0, v1, object0, v6, v7, v2, v, format0);
            }
            return new SingleSampleMediaChunk(dataSource0, dataSpec0, format0, v1, object0, v6, v7, v2, v, format0);
        }
        int v9 = 1;
        int v10 = 1;
        while(v9 < v3) {
            RangedUri rangedUri1 = rangedUri0.a(defaultDashChunkSource$RepresentationHolder0.l(((long)v9) + v2), defaultDashChunkSource$RepresentationHolder0.c.a);
            if(rangedUri1 == null) {
                break;
            }
            ++v10;
            ++v9;
            rangedUri0 = rangedUri1;
        }
        long v11 = ((long)v10) + v2 - 1L;
        long v12 = defaultDashChunkSource$RepresentationHolder0.i(v11);
        long v13 = defaultDashChunkSource$RepresentationHolder0.e;
        int v14 = defaultDashChunkSource$RepresentationHolder0.m(v11, v5) ? 0 : 8;
        DataSpec dataSpec1 = DashUtil.c(representation0, defaultDashChunkSource$RepresentationHolder0.c.a, rangedUri0, v14, Q2.u());
        if(cmcdData$Factory0 != null) {
            cmcdData$Factory0.d(v12 - v6).g(androidx.media3.exoplayer.upstream.CmcdData.Factory.c(this.k));
            Pair pair1 = this.l(v2, rangedUri0, defaultDashChunkSource$RepresentationHolder0);
            if(pair1 != null) {
                cmcdData$Factory0.e(((String)pair1.first)).f(((String)pair1.second));
            }
            dataSpec1 = cmcdData$Factory0.a().a(dataSpec1);
        }
        return new ContainerMediaChunk(dataSource0, dataSpec1, format0, v1, object0, v6, v12, v4, (v13 == 0x8000000000000001L || v13 > v12 ? 0x8000000000000001L : v13), v2, v10, (MimeTypes.r(format0.n) ? v6 - representation0.e : -representation0.e), defaultDashChunkSource$RepresentationHolder0.a);
    }

    private RepresentationHolder r(int v) {
        RepresentationHolder defaultDashChunkSource$RepresentationHolder0 = this.j[v];
        BaseUrl baseUrl0 = this.b.j(defaultDashChunkSource$RepresentationHolder0.b.d);
        if(baseUrl0 != null && !baseUrl0.equals(defaultDashChunkSource$RepresentationHolder0.c)) {
            defaultDashChunkSource$RepresentationHolder0 = defaultDashChunkSource$RepresentationHolder0.d(baseUrl0);
            this.j[v] = defaultDashChunkSource$RepresentationHolder0;
        }
        return defaultDashChunkSource$RepresentationHolder0;
    }

    @Override  // androidx.media3.exoplayer.source.chunk.ChunkSource
    public void release() {
        RepresentationHolder[] arr_defaultDashChunkSource$RepresentationHolder = this.j;
        for(int v = 0; v < arr_defaultDashChunkSource$RepresentationHolder.length; ++v) {
            ChunkExtractor chunkExtractor0 = arr_defaultDashChunkSource$RepresentationHolder[v].a;
            if(chunkExtractor0 != null) {
                chunkExtractor0.release();
            }
        }
    }
}

