package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata.Entry;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec.Builder;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.StatsDataSource;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader.Callback;
import androidx.media3.exoplayer.upstream.Loader.LoadErrorAction;
import androidx.media3.exoplayer.upstream.Loader.Loadable;
import androidx.media3.exoplayer.upstream.Loader.ReleaseCallback;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ForwardingSeekMap;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap.SeekPoints;
import androidx.media3.extractor.SeekMap.Unseekable;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import h4.d;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class ProgressiveMediaPeriod implements MediaPeriod, UpstreamFormatChangedListener, Callback, ReleaseCallback, ExtractorOutput {
    final class ExtractingLoadable implements Listener, Loadable {
        private final long a;
        private final Uri b;
        private final StatsDataSource c;
        private final ProgressiveMediaExtractor d;
        private final ExtractorOutput e;
        private final ConditionVariable f;
        private final PositionHolder g;
        private volatile boolean h;
        private boolean i;
        private long j;
        private DataSpec k;
        @Nullable
        private TrackOutput l;
        private boolean m;
        final ProgressiveMediaPeriod n;

        public ExtractingLoadable(Uri uri0, DataSource dataSource0, ProgressiveMediaExtractor progressiveMediaExtractor0, ExtractorOutput extractorOutput0, ConditionVariable conditionVariable0) {
            this.b = uri0;
            this.c = new StatsDataSource(dataSource0);
            this.d = progressiveMediaExtractor0;
            this.e = extractorOutput0;
            this.f = conditionVariable0;
            this.g = new PositionHolder();
            this.i = true;
            this.a = LoadEventInfo.a();
            this.k = this.h(0L);
        }

        @Override  // androidx.media3.exoplayer.source.IcyDataSource$Listener
        public void a(ParsableByteArray parsableByteArray0) {
            long v = this.m ? Math.max(ProgressiveMediaPeriod.this.P(true), this.j) : this.j;
            int v1 = parsableByteArray0.a();
            Object object0 = Assertions.g(this.l);
            ((TrackOutput)object0).b(parsableByteArray0, v1);
            ((TrackOutput)object0).f(v, 1, v1, 0, null);
            this.m = true;
        }

        @Override  // androidx.media3.exoplayer.upstream.Loader$Loadable
        public void b() {
            this.h = true;
        }

        private DataSpec h(long v) {
            return new Builder().j(this.b).i(v).g(ProgressiveMediaPeriod.this.i).c(6).f(ProgressiveMediaPeriod.Q).a();
        }

        private void i(long v, long v1) {
            this.g.a = v;
            this.j = v1;
            this.i = true;
            this.m = false;
        }

        @Override  // androidx.media3.exoplayer.upstream.Loader$Loadable
        public void w() throws IOException {
            int v = 0;
            while(v == 0 && !this.h) {
                try {
                    long v1 = this.g.a;
                    DataSpec dataSpec0 = this.h(v1);
                    this.k = dataSpec0;
                    long v2 = this.c.a(dataSpec0);
                    if(this.h) {
                        goto label_50;
                    }
                    if(v2 != -1L) {
                        v2 += v1;
                        ProgressiveMediaPeriod.this.b0();
                    }
                    IcyHeaders icyHeaders0 = IcyHeaders.a(this.c.b());
                    ProgressiveMediaPeriod.this.s = icyHeaders0;
                    StatsDataSource statsDataSource0 = this.c;
                    if(ProgressiveMediaPeriod.this.s != null && ProgressiveMediaPeriod.this.s.f != -1) {
                        statsDataSource0 = new IcyDataSource(this.c, ProgressiveMediaPeriod.this.s.f, this);
                        TrackOutput trackOutput0 = ProgressiveMediaPeriod.this.Q();
                        this.l = trackOutput0;
                        trackOutput0.d(ProgressiveMediaPeriod.X);
                    }
                    Map map0 = this.c.b();
                    long v3 = v1;
                    this.d.b(statsDataSource0, this.b, map0, v1, v2, this.e);
                    if(ProgressiveMediaPeriod.this.s != null) {
                        this.d.d();
                    }
                    if(this.i) {
                        this.d.a(v3, this.j);
                        this.i = false;
                    }
                    while(true) {
                        long v4 = v3;
                    label_27:
                        if(v != 0 || this.h) {
                            goto label_43;
                        }
                        try {
                            this.f.a();
                        }
                        catch(InterruptedException unused_ex) {
                            throw new InterruptedIOException();
                        }
                        v = this.d.e(this.g);
                        v3 = this.d.c();
                        if(v3 <= ProgressiveMediaPeriod.this.j + v4) {
                            goto label_27;
                        }
                        this.f.d();
                        ProgressiveMediaPeriod.this.q.post(ProgressiveMediaPeriod.this.p);
                    }
                }
                catch(Throwable throwable0) {
                }
                if(v != 1 && this.d.c() != -1L) {
                    this.g.a = this.d.c();
                }
                DataSourceUtil.a(this.c);
                throw throwable0;
            label_43:
                if(v == 1) {
                    v = 0;
                }
                else if(this.d.c() != -1L) {
                    this.g.a = this.d.c();
                }
                DataSourceUtil.a(this.c);
                continue;
            label_50:
                if(this.d.c() != -1L) {
                    this.g.a = this.d.c();
                }
                DataSourceUtil.a(this.c);
                return;
            }
        }
    }

    interface androidx.media3.exoplayer.source.ProgressiveMediaPeriod.Listener {
        void Q(long arg1, boolean arg2, boolean arg3);
    }

    final class SampleStreamImpl implements SampleStream {
        private final int a;
        final ProgressiveMediaPeriod b;

        public SampleStreamImpl(int v) {
            this.a = v;
        }

        @Override  // androidx.media3.exoplayer.source.SampleStream
        public void b() throws IOException {
            ProgressiveMediaPeriod.this.a0(this.a);
        }

        @Override  // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return ProgressiveMediaPeriod.this.S(this.a);
        }

        @Override  // androidx.media3.exoplayer.source.SampleStream
        public int m(FormatHolder formatHolder0, DecoderInputBuffer decoderInputBuffer0, int v) {
            return ProgressiveMediaPeriod.this.g0(this.a, formatHolder0, decoderInputBuffer0, v);
        }

        @Override  // androidx.media3.exoplayer.source.SampleStream
        public int p(long v) {
            return ProgressiveMediaPeriod.this.k0(this.a, v);
        }
    }

    static final class TrackId {
        public final int a;
        public final boolean b;

        public TrackId(int v, boolean z) {
            this.a = v;
            this.b = z;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                return TrackId.class == class0 && (this.a == ((TrackId)object0).a && this.b == ((TrackId)object0).b);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.a * 0x1F + this.b;
        }
    }

    static final class TrackState {
        public final TrackGroupArray a;
        public final boolean[] b;
        public final boolean[] c;
        public final boolean[] d;

        public TrackState(TrackGroupArray trackGroupArray0, boolean[] arr_z) {
            this.a = trackGroupArray0;
            this.b = arr_z;
            this.c = new boolean[trackGroupArray0.a];
            this.d = new boolean[trackGroupArray0.a];
        }
    }

    private SeekMap A;
    private long B;
    private boolean C;
    private int D;
    private boolean E;
    private boolean F;
    private int G;
    private boolean H;
    private long I;
    private long J;
    private boolean K;
    private int L;
    private boolean M;
    private boolean N;
    private static final String O = "ProgressiveMediaPeriod";
    private static final long P = 10000L;
    private static final Map Q;
    private static final Format X;
    private final Uri a;
    private final DataSource b;
    private final DrmSessionManager c;
    private final LoadErrorHandlingPolicy d;
    private final EventDispatcher e;
    private final androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher f;
    private final androidx.media3.exoplayer.source.ProgressiveMediaPeriod.Listener g;
    private final Allocator h;
    @Nullable
    private final String i;
    private final long j;
    private final long k;
    private final Loader l;
    private final ProgressiveMediaExtractor m;
    private final ConditionVariable n;
    private final Runnable o;
    private final Runnable p;
    private final Handler q;
    @Nullable
    private androidx.media3.exoplayer.source.MediaPeriod.Callback r;
    @Nullable
    private IcyHeaders s;
    private SampleQueue[] t;
    private TrackId[] u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private TrackState z;

    static {
        ProgressiveMediaPeriod.Q = ProgressiveMediaPeriod.N();
        ProgressiveMediaPeriod.X = new androidx.media3.common.Format.Builder().a0("icy").o0("application/x-icy").K();
    }

    public ProgressiveMediaPeriod(Uri uri0, DataSource dataSource0, ProgressiveMediaExtractor progressiveMediaExtractor0, DrmSessionManager drmSessionManager0, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher drmSessionEventListener$EventDispatcher0, LoadErrorHandlingPolicy loadErrorHandlingPolicy0, EventDispatcher mediaSourceEventListener$EventDispatcher0, androidx.media3.exoplayer.source.ProgressiveMediaPeriod.Listener progressiveMediaPeriod$Listener0, Allocator allocator0, @Nullable String s, int v, long v1) {
        this.a = uri0;
        this.b = dataSource0;
        this.c = drmSessionManager0;
        this.f = drmSessionEventListener$EventDispatcher0;
        this.d = loadErrorHandlingPolicy0;
        this.e = mediaSourceEventListener$EventDispatcher0;
        this.g = progressiveMediaPeriod$Listener0;
        this.h = allocator0;
        this.i = s;
        this.j = (long)v;
        this.l = new Loader("ProgressiveMediaPeriod");
        this.m = progressiveMediaExtractor0;
        this.k = v1;
        this.n = new ConditionVariable();
        this.o = () -> {
            if(!this.N && !this.w && this.v && this.A != null) {
                SampleQueue[] arr_sampleQueue = this.t;
                for(int v = 0; v < arr_sampleQueue.length; ++v) {
                    if(arr_sampleQueue[v].I() == null) {
                        return;
                    }
                }
                this.n.d();
                int v1 = this.t.length;
                TrackGroup[] arr_trackGroup = new TrackGroup[v1];
                boolean[] arr_z = new boolean[v1];
                for(int v2 = 0; v2 < v1; ++v2) {
                    Format format0 = (Format)Assertions.g(this.t[v2].I());
                    boolean z = MimeTypes.q(format0.n);
                    boolean z1 = z || MimeTypes.u(format0.n);
                    arr_z[v2] = z1;
                    this.x |= z1;
                    this.y = this.k != 0x8000000000000001L && v1 == 1 && MimeTypes.r(format0.n);
                    IcyHeaders icyHeaders0 = this.s;
                    if(icyHeaders0 != null) {
                        if(z || this.u[v2].b) {
                            Metadata metadata0 = format0.k == null ? new Metadata(new Entry[]{icyHeaders0}) : format0.k.a(new Entry[]{icyHeaders0});
                            format0 = format0.a().h0(metadata0).K();
                        }
                        if(z && format0.g == -1 && format0.h == -1 && icyHeaders0.a != -1) {
                            format0 = format0.a().M(icyHeaders0.a).K();
                        }
                    }
                    arr_trackGroup[v2] = new TrackGroup(Integer.toString(v2), new Format[]{format0.b(this.c.a(format0))});
                }
                this.z = new TrackState(new TrackGroupArray(arr_trackGroup), arr_z);
                if(this.y && this.B == 0x8000000000000001L) {
                    this.B = this.k;
                    this.A = new ForwardingSeekMap(this.A) {
                        final ProgressiveMediaPeriod e;

                        @Override  // androidx.media3.extractor.ForwardingSeekMap
                        public long c1() {
                            return ProgressiveMediaPeriod.this.B;
                        }
                    };
                }
                long v3 = this.B;
                boolean z2 = this.A.e1();
                this.g.Q(v3, z2, this.C);
                this.w = true;
                ((androidx.media3.exoplayer.source.MediaPeriod.Callback)Assertions.g(this.r)).h(this);
            }
        };
        this.p = () -> if(!this.N) {
            ((androidx.media3.exoplayer.source.MediaPeriod.Callback)Assertions.g(this.r)).l(this);
        };
        this.q = Util.H();
        this.u = new TrackId[0];
        this.t = new SampleQueue[0];
        this.J = 0x8000000000000001L;
        this.D = 1;
    }

    @d({"trackState", "seekMap"})
    private void L() {
        Assertions.i(this.w);
        Assertions.g(this.z);
        Assertions.g(this.A);
    }

    private boolean M(ExtractingLoadable progressiveMediaPeriod$ExtractingLoadable0, int v) {
        if(!this.H && (this.A == null || this.A.c1() == 0x8000000000000001L)) {
            if(this.w && !this.m0()) {
                this.K = true;
                return false;
            }
            this.F = this.w;
            this.I = 0L;
            this.L = 0;
            SampleQueue[] arr_sampleQueue = this.t;
            for(int v1 = 0; v1 < arr_sampleQueue.length; ++v1) {
                arr_sampleQueue[v1].Y();
            }
            progressiveMediaPeriod$ExtractingLoadable0.i(0L, 0L);
            return true;
        }
        this.L = v;
        return true;
    }

    private static Map N() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("Icy-MetaData", "1");
        return DesugarCollections.unmodifiableMap(hashMap0);
    }

    private int O() {
        SampleQueue[] arr_sampleQueue = this.t;
        int v1 = 0;
        for(int v = 0; v < arr_sampleQueue.length; ++v) {
            v1 += arr_sampleQueue[v].J();
        }
        return v1;
    }

    private long P(boolean z) {
        long v = 0x8000000000000000L;
        for(int v1 = 0; v1 < this.t.length; ++v1) {
            if(z || ((TrackState)Assertions.g(this.z)).c[v1]) {
                v = Math.max(v, this.t[v1].C());
            }
        }
        return v;
    }

    TrackOutput Q() {
        return this.f0(new TrackId(0, true));
    }

    private boolean R() {
        return this.J != 0x8000000000000001L;
    }

    // 去混淆评级： 低(20)
    boolean S(int v) {
        return !this.m0() && this.t[v].N(this.M);
    }

    // 检测为 Lambda 实现
    private void T() [...]

    // 检测为 Lambda 实现
    private void U() [...]

    // 检测为 Lambda 实现
    private void V(SeekMap seekMap0) [...]

    // 检测为 Lambda 实现
    private void W() [...]

    private void X(int v) {
        this.L();
        TrackState progressiveMediaPeriod$TrackState0 = this.z;
        boolean[] arr_z = progressiveMediaPeriod$TrackState0.d;
        if(!arr_z[v]) {
            Format format0 = progressiveMediaPeriod$TrackState0.a.c(v).c(0);
            int v1 = MimeTypes.m(format0.n);
            this.e.h(v1, format0, 0, null, this.I);
            arr_z[v] = true;
        }
    }

    private void Y(int v) {
        this.L();
        if(this.K && this.z.b[v] && !this.t[v].N(false)) {
            this.J = 0L;
            this.K = false;
            this.F = true;
            this.I = 0L;
            this.L = 0;
            SampleQueue[] arr_sampleQueue = this.t;
            for(int v1 = 0; v1 < arr_sampleQueue.length; ++v1) {
                arr_sampleQueue[v1].Y();
            }
            ((androidx.media3.exoplayer.source.MediaPeriod.Callback)Assertions.g(this.r)).l(this);
        }
    }

    void Z() throws IOException {
        int v = this.d.d(this.D);
        this.l.a(v);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public boolean a() {
        return this.l.k() && this.n.e();
    }

    void a0(int v) throws IOException {
        this.t[v].Q();
        this.Z();
    }

    @Override  // androidx.media3.extractor.ExtractorOutput
    public TrackOutput b(int v, int v1) {
        return this.f0(new TrackId(v, false));
    }

    private void b0() {
        E e0 = () -> this.H = true;
        this.q.post(e0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long c(long v, SeekParameters seekParameters0) {
        this.L();
        if(!this.A.e1()) {
            return 0L;
        }
        SeekPoints seekMap$SeekPoints0 = this.A.d1(v);
        return seekParameters0.a(v, seekMap$SeekPoints0.a.a, seekMap$SeekPoints0.b.a);
    }

    public void c0(ExtractingLoadable progressiveMediaPeriod$ExtractingLoadable0, long v, long v1, boolean z) {
        StatsDataSource statsDataSource0 = progressiveMediaPeriod$ExtractingLoadable0.c;
        LoadEventInfo loadEventInfo0 = new LoadEventInfo(progressiveMediaPeriod$ExtractingLoadable0.a, progressiveMediaPeriod$ExtractingLoadable0.k, statsDataSource0.v(), statsDataSource0.w(), v, v1, statsDataSource0.u());
        this.d.a(progressiveMediaPeriod$ExtractingLoadable0.a);
        this.e.q(loadEventInfo0, 1, -1, null, 0, null, progressiveMediaPeriod$ExtractingLoadable0.j, this.B);
        if(!z) {
            SampleQueue[] arr_sampleQueue = this.t;
            for(int v2 = 0; v2 < arr_sampleQueue.length; ++v2) {
                arr_sampleQueue[v2].Y();
            }
            if(this.G > 0) {
                ((androidx.media3.exoplayer.source.MediaPeriod.Callback)Assertions.g(this.r)).l(this);
            }
        }
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long d() {
        long v;
        this.L();
        if(!this.M && this.G != 0) {
            if(this.R()) {
                return this.J;
            }
            if(this.x) {
                v = 0x7FFFFFFFFFFFFFFFL;
                for(int v1 = 0; v1 < this.t.length; ++v1) {
                    if(this.z.b[v1] && this.z.c[v1] && !this.t[v1].M()) {
                        v = Math.min(v, this.t[v1].C());
                    }
                }
            }
            else {
                v = 0x7FFFFFFFFFFFFFFFL;
            }
            if(v == 0x7FFFFFFFFFFFFFFFL) {
                v = this.P(false);
            }
            return v == 0x8000000000000000L ? this.I : v;
        }
        return 0x8000000000000000L;
    }

    public void d0(ExtractingLoadable progressiveMediaPeriod$ExtractingLoadable0, long v, long v1) {
        if(this.B == 0x8000000000000001L) {
            SeekMap seekMap0 = this.A;
            if(seekMap0 != null) {
                boolean z = seekMap0.e1();
                long v2 = this.P(true);
                long v3 = v2 == 0x8000000000000000L ? 0L : v2 + 10000L;
                this.B = v3;
                this.g.Q(v3, z, this.C);
            }
        }
        StatsDataSource statsDataSource0 = progressiveMediaPeriod$ExtractingLoadable0.c;
        LoadEventInfo loadEventInfo0 = new LoadEventInfo(progressiveMediaPeriod$ExtractingLoadable0.a, progressiveMediaPeriod$ExtractingLoadable0.k, statsDataSource0.v(), statsDataSource0.w(), v, v1, statsDataSource0.u());
        this.d.a(progressiveMediaPeriod$ExtractingLoadable0.a);
        this.e.t(loadEventInfo0, 1, -1, null, 0, null, progressiveMediaPeriod$ExtractingLoadable0.j, this.B);
        this.M = true;
        ((androidx.media3.exoplayer.source.MediaPeriod.Callback)Assertions.g(this.r)).l(this);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void e(long v) {
    }

    public LoadErrorAction e0(ExtractingLoadable progressiveMediaPeriod$ExtractingLoadable0, long v, long v1, IOException iOException0, int v2) {
        LoadErrorAction loader$LoadErrorAction0;
        StatsDataSource statsDataSource0 = progressiveMediaPeriod$ExtractingLoadable0.c;
        LoadEventInfo loadEventInfo0 = new LoadEventInfo(progressiveMediaPeriod$ExtractingLoadable0.a, progressiveMediaPeriod$ExtractingLoadable0.k, statsDataSource0.v(), statsDataSource0.w(), v, v1, statsDataSource0.u());
        LoadErrorInfo loadErrorHandlingPolicy$LoadErrorInfo0 = new LoadErrorInfo(loadEventInfo0, new MediaLoadData(1, -1, null, 0, null, Util.B2(progressiveMediaPeriod$ExtractingLoadable0.j), Util.B2(this.B)), iOException0, v2);
        long v3 = this.d.c(loadErrorHandlingPolicy$LoadErrorInfo0);
        if(v3 == 0x8000000000000001L) {
            loader$LoadErrorAction0 = Loader.l;
        }
        else {
            int v4 = this.O();
            boolean z = v4 > this.L;
            loader$LoadErrorAction0 = this.M(progressiveMediaPeriod$ExtractingLoadable0, v4) ? Loader.i(z, v3) : Loader.k;
        }
        boolean z1 = loader$LoadErrorAction0.c();
        this.e.v(loadEventInfo0, 1, -1, null, 0, null, progressiveMediaPeriod$ExtractingLoadable0.j, this.B, iOException0, !z1);
        if(!z1) {
            this.d.a(progressiveMediaPeriod$ExtractingLoadable0.a);
        }
        return loader$LoadErrorAction0;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public boolean f(LoadingInfo loadingInfo0) {
        if(!this.M && !this.l.j() && !this.K && (!this.w || this.G != 0)) {
            boolean z = this.n.f();
            if(!this.l.k()) {
                this.l0();
                return true;
            }
            return z;
        }
        return false;
    }

    private TrackOutput f0(TrackId progressiveMediaPeriod$TrackId0) {
        int v = this.t.length;
        for(int v1 = 0; v1 < v; ++v1) {
            if(progressiveMediaPeriod$TrackId0.equals(this.u[v1])) {
                return this.t[v1];
            }
        }
        if(this.v) {
            Log.n("ProgressiveMediaPeriod", "Extractor added new track (id=" + progressiveMediaPeriod$TrackId0.a + ") after finishing tracks.");
            return new DiscardingTrackOutput();
        }
        SampleQueue sampleQueue0 = SampleQueue.l(this.h, this.c, this.f);
        sampleQueue0.g0(this);
        TrackId[] arr_progressiveMediaPeriod$TrackId = (TrackId[])Arrays.copyOf(this.u, v + 1);
        arr_progressiveMediaPeriod$TrackId[v] = progressiveMediaPeriod$TrackId0;
        this.u = arr_progressiveMediaPeriod$TrackId;
        SampleQueue[] arr_sampleQueue = (SampleQueue[])Arrays.copyOf(this.t, v + 1);
        arr_sampleQueue[v] = sampleQueue0;
        this.t = arr_sampleQueue;
        return sampleQueue0;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long g() {
        return this.d();
    }

    int g0(int v, FormatHolder formatHolder0, DecoderInputBuffer decoderInputBuffer0, int v1) {
        if(this.m0()) {
            return -3;
        }
        this.X(v);
        int v2 = this.t[v].V(formatHolder0, decoderInputBuffer0, v1, this.M);
        if(v2 == -3) {
            this.Y(v);
        }
        return v2;
    }

    @Override  // androidx.media3.exoplayer.upstream.Loader$Callback
    public LoadErrorAction h(Loadable loader$Loadable0, long v, long v1, IOException iOException0, int v2) {
        return this.e0(((ExtractingLoadable)loader$Loadable0), v, v1, iOException0, v2);
    }

    public void h0() {
        if(this.w) {
            SampleQueue[] arr_sampleQueue = this.t;
            for(int v = 0; v < arr_sampleQueue.length; ++v) {
                arr_sampleQueue[v].U();
            }
        }
        this.l.m(this);
        this.q.removeCallbacksAndMessages(null);
        this.r = null;
        this.N = true;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public List i(List list0) {
        return t.a(this, list0);
    }

    private boolean i0(boolean[] arr_z, long v) {
        for(int v1 = 0; v1 < this.t.length; ++v1) {
            SampleQueue sampleQueue0 = this.t[v1];
            if(!(this.y ? sampleQueue0.b0(sampleQueue0.A()) : sampleQueue0.c0(v, false)) && (arr_z[v1] || !this.x)) {
                return false;
            }
        }
        return true;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long j(long v) {
        this.L();
        boolean[] arr_z = this.z.b;
        if(!this.A.e1()) {
            v = 0L;
        }
        int v1 = 0;
        this.F = false;
        this.I = v;
        if(this.R()) {
            this.J = v;
            return v;
        }
        if(this.D != 7 && (this.M || this.l.k()) && this.i0(arr_z, v)) {
            return v;
        }
        this.K = false;
        this.J = v;
        this.M = false;
        if(this.l.k()) {
            SampleQueue[] arr_sampleQueue = this.t;
            while(v1 < arr_sampleQueue.length) {
                arr_sampleQueue[v1].s();
                ++v1;
            }
            this.l.g();
            return v;
        }
        this.l.h();
        SampleQueue[] arr_sampleQueue1 = this.t;
        while(v1 < arr_sampleQueue1.length) {
            arr_sampleQueue1[v1].Y();
            ++v1;
        }
        return v;
    }

    private void j0(SeekMap seekMap0) {
        SeekMap seekMap1 = this.s == null ? seekMap0 : new Unseekable(0x8000000000000001L);
        this.A = seekMap1;
        this.B = seekMap0.c1();
        int v = 1;
        boolean z = !this.H && seekMap0.c1() == 0x8000000000000001L;
        this.C = z;
        if(z) {
            v = 7;
        }
        this.D = v;
        if(this.w) {
            long v1 = this.B;
            boolean z1 = seekMap0.e1();
            this.g.Q(v1, z1, this.C);
            return;
        }
        this.W();
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long k() {
        if(this.F && (this.M || this.O() > this.L)) {
            this.F = false;
            return this.I;
        }
        return 0x8000000000000001L;
    }

    int k0(int v, long v1) {
        if(this.m0()) {
            return 0;
        }
        this.X(v);
        SampleQueue sampleQueue0 = this.t[v];
        int v2 = sampleQueue0.H(v1, this.M);
        sampleQueue0.h0(v2);
        if(v2 == 0) {
            this.Y(v);
        }
        return v2;
    }

    @Override  // androidx.media3.exoplayer.upstream.Loader$ReleaseCallback
    public void l() {
        SampleQueue[] arr_sampleQueue = this.t;
        for(int v = 0; v < arr_sampleQueue.length; ++v) {
            arr_sampleQueue[v].W();
        }
        this.m.release();
    }

    private void l0() {
        ExtractingLoadable progressiveMediaPeriod$ExtractingLoadable0 = new ExtractingLoadable(this, this.a, this.b, this.m, this, this.n);
        if(this.w) {
            Assertions.i(this.R());
            if(this.B != 0x8000000000000001L && this.J > this.B) {
                this.M = true;
                this.J = 0x8000000000000001L;
                return;
            }
            progressiveMediaPeriod$ExtractingLoadable0.i(((SeekMap)Assertions.g(this.A)).d1(this.J).a.b, this.J);
            SampleQueue[] arr_sampleQueue = this.t;
            for(int v = 0; v < arr_sampleQueue.length; ++v) {
                arr_sampleQueue[v].e0(this.J);
            }
            this.J = 0x8000000000000001L;
        }
        this.L = this.O();
        int v1 = this.d.d(this.D);
        LoadEventInfo loadEventInfo0 = new LoadEventInfo(progressiveMediaPeriod$ExtractingLoadable0.a, progressiveMediaPeriod$ExtractingLoadable0.k, this.l.n(progressiveMediaPeriod$ExtractingLoadable0, this, v1));
        this.e.z(loadEventInfo0, 1, -1, null, 0, null, progressiveMediaPeriod$ExtractingLoadable0.j, this.B);
    }

    @Override  // androidx.media3.extractor.ExtractorOutput
    public void m() {
        this.v = true;
        this.q.post(this.o);
    }

    // 去混淆评级： 低(20)
    private boolean m0() {
        return this.F || this.R();
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray n() {
        this.L();
        return this.z.a;
    }

    @Override  // androidx.media3.exoplayer.upstream.Loader$Callback
    public void o(Loadable loader$Loadable0, long v, long v1, boolean z) {
        this.c0(((ExtractingLoadable)loader$Loadable0), v, v1, z);
    }

    @Override  // androidx.media3.exoplayer.source.SampleQueue$UpstreamFormatChangedListener
    public void p(Format format0) {
        this.q.post(this.o);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long q(ExoTrackSelection[] arr_exoTrackSelection, boolean[] arr_z, SampleStream[] arr_sampleStream, boolean[] arr_z1, long v) {
        boolean z;
        this.L();
        TrackGroupArray trackGroupArray0 = this.z.a;
        boolean[] arr_z2 = this.z.c;
        int v1 = this.G;
        int v2 = 0;
        for(int v3 = 0; v3 < arr_exoTrackSelection.length; ++v3) {
            SampleStream sampleStream0 = arr_sampleStream[v3];
            if(sampleStream0 != null && (arr_exoTrackSelection[v3] == null || !arr_z[v3])) {
                int v4 = ((SampleStreamImpl)sampleStream0).a;
                Assertions.i(arr_z2[v4]);
                --this.G;
                arr_z2[v4] = false;
                arr_sampleStream[v3] = null;
            }
        }
        if(!this.E) {
            z = v != 0L && !this.y;
        }
        else if(v1 == 0) {
            z = true;
        }
        else {
            z = false;
        }
        for(int v5 = 0; v5 < arr_exoTrackSelection.length; ++v5) {
            if(arr_sampleStream[v5] == null) {
                ExoTrackSelection exoTrackSelection0 = arr_exoTrackSelection[v5];
                if(exoTrackSelection0 != null) {
                    Assertions.i(exoTrackSelection0.length() == 1);
                    Assertions.i(exoTrackSelection0.e(0) == 0);
                    int v6 = trackGroupArray0.e(exoTrackSelection0.i());
                    Assertions.i(!arr_z2[v6]);
                    ++this.G;
                    arr_z2[v6] = true;
                    arr_sampleStream[v5] = new SampleStreamImpl(this, v6);
                    arr_z1[v5] = true;
                    if(!z) {
                        SampleQueue sampleQueue0 = this.t[v6];
                        z = sampleQueue0.F() != 0 && !sampleQueue0.c0(v, true);
                    }
                }
            }
        }
        if(this.G == 0) {
            this.K = false;
            this.F = false;
            if(this.l.k()) {
                SampleQueue[] arr_sampleQueue = this.t;
                while(v2 < arr_sampleQueue.length) {
                    arr_sampleQueue[v2].s();
                    ++v2;
                }
                this.l.g();
            }
            else {
                this.M = false;
                SampleQueue[] arr_sampleQueue1 = this.t;
                while(v2 < arr_sampleQueue1.length) {
                    arr_sampleQueue1[v2].Y();
                    ++v2;
                }
            }
        }
        else if(z) {
            v = this.j(v);
            while(v2 < arr_sampleStream.length) {
                if(arr_sampleStream[v2] != null) {
                    arr_z1[v2] = true;
                }
                ++v2;
            }
        }
        this.E = true;
        return v;
    }

    @Override  // androidx.media3.extractor.ExtractorOutput
    public void r(SeekMap seekMap0) {
        H h0 = () -> this.j0(seekMap0);
        this.q.post(h0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void s() throws IOException {
        this.Z();
        if(this.M && !this.w) {
            throw ParserException.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void t(androidx.media3.exoplayer.source.MediaPeriod.Callback mediaPeriod$Callback0, long v) {
        this.r = mediaPeriod$Callback0;
        this.n.f();
        this.l0();
    }

    @Override  // androidx.media3.exoplayer.upstream.Loader$Callback
    public void u(Loadable loader$Loadable0, long v, long v1) {
        this.d0(((ExtractingLoadable)loader$Loadable0), v, v1);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void v(long v, boolean z) {
        if(this.y) {
            return;
        }
        this.L();
        if(this.R()) {
            return;
        }
        boolean[] arr_z = this.z.c;
        for(int v1 = 0; v1 < this.t.length; ++v1) {
            this.t[v1].r(v, z, arr_z[v1]);
        }
    }
}

