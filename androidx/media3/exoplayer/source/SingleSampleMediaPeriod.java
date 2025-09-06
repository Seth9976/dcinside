package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource.Factory;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.StatsDataSource;
import androidx.media3.datasource.TransferListener;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader.Callback;
import androidx.media3.exoplayer.upstream.Loader.LoadErrorAction;
import androidx.media3.exoplayer.upstream.Loader.Loadable;
import androidx.media3.exoplayer.upstream.Loader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class SingleSampleMediaPeriod implements MediaPeriod, Callback {
    final class SampleStreamImpl implements SampleStream {
        private int a;
        private boolean b;
        final SingleSampleMediaPeriod c;
        private static final int d = 0;
        private static final int e = 1;
        private static final int f = 2;

        private SampleStreamImpl() {
        }

        SampleStreamImpl(androidx.media3.exoplayer.source.SingleSampleMediaPeriod.1 singleSampleMediaPeriod$10) {
        }

        private void a() {
            if(!this.b) {
                SingleSampleMediaPeriod.this.e.h(MimeTypes.m(SingleSampleMediaPeriod.this.j.n), SingleSampleMediaPeriod.this.j, 0, null, 0L);
                this.b = true;
            }
        }

        @Override  // androidx.media3.exoplayer.source.SampleStream
        public void b() throws IOException {
            SingleSampleMediaPeriod singleSampleMediaPeriod0 = SingleSampleMediaPeriod.this;
            if(!singleSampleMediaPeriod0.k) {
                singleSampleMediaPeriod0.i.b();
            }
        }

        public void c() {
            if(this.a == 2) {
                this.a = 1;
            }
        }

        @Override  // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return SingleSampleMediaPeriod.this.l;
        }

        @Override  // androidx.media3.exoplayer.source.SampleStream
        public int m(FormatHolder formatHolder0, DecoderInputBuffer decoderInputBuffer0, int v) {
            this.a();
            SingleSampleMediaPeriod singleSampleMediaPeriod0 = SingleSampleMediaPeriod.this;
            boolean z = singleSampleMediaPeriod0.l;
            if(z && singleSampleMediaPeriod0.m == null) {
                this.a = 2;
            }
            int v1 = this.a;
            if(v1 == 2) {
                decoderInputBuffer0.e(4);
                return -4;
            }
            if((v & 2) == 0 && v1 != 0) {
                if(!z) {
                    return -3;
                }
                Assertions.g(singleSampleMediaPeriod0.m);
                decoderInputBuffer0.e(1);
                decoderInputBuffer0.f = 0L;
                if((v & 4) == 0) {
                    decoderInputBuffer0.r(SingleSampleMediaPeriod.this.n);
                    decoderInputBuffer0.d.put(SingleSampleMediaPeriod.this.m, 0, SingleSampleMediaPeriod.this.n);
                }
                if((v & 1) == 0) {
                    this.a = 2;
                }
                return -4;
            }
            formatHolder0.b = singleSampleMediaPeriod0.j;
            this.a = 1;
            return -5;
        }

        @Override  // androidx.media3.exoplayer.source.SampleStream
        public int p(long v) {
            this.a();
            if(v > 0L && this.a != 2) {
                this.a = 2;
                return 1;
            }
            return 0;
        }
    }

    static final class SourceLoadable implements Loadable {
        public final long a;
        public final DataSpec b;
        private final StatsDataSource c;
        @Nullable
        private byte[] d;

        public SourceLoadable(DataSpec dataSpec0, DataSource dataSource0) {
            this.a = LoadEventInfo.a();
            this.b = dataSpec0;
            this.c = new StatsDataSource(dataSource0);
        }

        @Override  // androidx.media3.exoplayer.upstream.Loader$Loadable
        public void b() {
        }

        @Override  // androidx.media3.exoplayer.upstream.Loader$Loadable
        public void w() throws IOException {
            this.c.x();
            try {
                this.c.a(this.b);
                for(int v1 = 0; v1 != -1; v1 = this.c.read(this.d, v2, this.d.length - v2)) {
                    int v2 = (int)this.c.u();
                    byte[] arr_b = this.d;
                    if(arr_b == null) {
                        this.d = new byte[0x400];
                    }
                    else if(v2 == arr_b.length) {
                        this.d = Arrays.copyOf(arr_b, arr_b.length * 2);
                    }
                }
            }
            finally {
                DataSourceUtil.a(this.c);
            }
        }
    }

    private final DataSpec a;
    private final Factory b;
    @Nullable
    private final TransferListener c;
    private final LoadErrorHandlingPolicy d;
    private final EventDispatcher e;
    private final TrackGroupArray f;
    private final ArrayList g;
    private final long h;
    final Loader i;
    final Format j;
    final boolean k;
    boolean l;
    byte[] m;
    int n;
    private static final String o = "SingleSampleMediaPeriod";
    private static final int p = 0x400;

    public SingleSampleMediaPeriod(DataSpec dataSpec0, Factory dataSource$Factory0, @Nullable TransferListener transferListener0, Format format0, long v, LoadErrorHandlingPolicy loadErrorHandlingPolicy0, EventDispatcher mediaSourceEventListener$EventDispatcher0, boolean z) {
        this.a = dataSpec0;
        this.b = dataSource$Factory0;
        this.c = transferListener0;
        this.j = format0;
        this.h = v;
        this.d = loadErrorHandlingPolicy0;
        this.e = mediaSourceEventListener$EventDispatcher0;
        this.k = z;
        this.f = new TrackGroupArray(new TrackGroup[]{new TrackGroup(new Format[]{format0})});
        this.g = new ArrayList();
        this.i = new Loader("SingleSampleMediaPeriod");
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public boolean a() {
        return this.i.k();
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long c(long v, SeekParameters seekParameters0) {
        return v;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long d() {
        return this.l ? 0x8000000000000000L : 0L;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void e(long v) {
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public boolean f(LoadingInfo loadingInfo0) {
        if(!this.l && !this.i.k() && !this.i.j()) {
            DataSource dataSource0 = this.b.a();
            TransferListener transferListener0 = this.c;
            if(transferListener0 != null) {
                dataSource0.l(transferListener0);
            }
            SourceLoadable singleSampleMediaPeriod$SourceLoadable0 = new SourceLoadable(this.a, dataSource0);
            int v = this.d.d(1);
            long v1 = this.i.n(singleSampleMediaPeriod$SourceLoadable0, this, v);
            LoadEventInfo loadEventInfo0 = new LoadEventInfo(singleSampleMediaPeriod$SourceLoadable0.a, this.a, v1);
            this.e.z(loadEventInfo0, 1, -1, this.j, 0, null, 0L, this.h);
            return true;
        }
        return false;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long g() {
        return this.l || this.i.k() ? 0x8000000000000000L : 0L;
    }

    @Override  // androidx.media3.exoplayer.upstream.Loader$Callback
    public LoadErrorAction h(Loadable loader$Loadable0, long v, long v1, IOException iOException0, int v2) {
        return this.p(((SourceLoadable)loader$Loadable0), v, v1, iOException0, v2);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public List i(List list0) {
        return t.a(this, list0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long j(long v) {
        for(int v1 = 0; v1 < this.g.size(); ++v1) {
            ((SampleStreamImpl)this.g.get(v1)).c();
        }
        return v;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long k() {
        return 0x8000000000000001L;
    }

    public void l(SourceLoadable singleSampleMediaPeriod$SourceLoadable0, long v, long v1, boolean z) {
        StatsDataSource statsDataSource0 = singleSampleMediaPeriod$SourceLoadable0.c;
        LoadEventInfo loadEventInfo0 = new LoadEventInfo(singleSampleMediaPeriod$SourceLoadable0.a, singleSampleMediaPeriod$SourceLoadable0.b, statsDataSource0.v(), statsDataSource0.w(), v, v1, statsDataSource0.u());
        this.d.a(singleSampleMediaPeriod$SourceLoadable0.a);
        this.e.q(loadEventInfo0, 1, -1, null, 0, null, 0L, this.h);
    }

    public void m(SourceLoadable singleSampleMediaPeriod$SourceLoadable0, long v, long v1) {
        this.n = (int)singleSampleMediaPeriod$SourceLoadable0.c.u();
        this.m = (byte[])Assertions.g(singleSampleMediaPeriod$SourceLoadable0.d);
        this.l = true;
        StatsDataSource statsDataSource0 = singleSampleMediaPeriod$SourceLoadable0.c;
        LoadEventInfo loadEventInfo0 = new LoadEventInfo(singleSampleMediaPeriod$SourceLoadable0.a, singleSampleMediaPeriod$SourceLoadable0.b, statsDataSource0.v(), statsDataSource0.w(), v, v1, ((long)this.n));
        this.d.a(singleSampleMediaPeriod$SourceLoadable0.a);
        this.e.t(loadEventInfo0, 1, -1, this.j, 0, null, 0L, this.h);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray n() {
        return this.f;
    }

    @Override  // androidx.media3.exoplayer.upstream.Loader$Callback
    public void o(Loadable loader$Loadable0, long v, long v1, boolean z) {
        this.l(((SourceLoadable)loader$Loadable0), v, v1, z);
    }

    public LoadErrorAction p(SourceLoadable singleSampleMediaPeriod$SourceLoadable0, long v, long v1, IOException iOException0, int v2) {
        LoadErrorAction loader$LoadErrorAction0;
        StatsDataSource statsDataSource0 = singleSampleMediaPeriod$SourceLoadable0.c;
        LoadEventInfo loadEventInfo0 = new LoadEventInfo(singleSampleMediaPeriod$SourceLoadable0.a, singleSampleMediaPeriod$SourceLoadable0.b, statsDataSource0.v(), statsDataSource0.w(), v, v1, statsDataSource0.u());
        long v3 = Util.B2(this.h);
        LoadErrorInfo loadErrorHandlingPolicy$LoadErrorInfo0 = new LoadErrorInfo(loadEventInfo0, new MediaLoadData(1, -1, this.j, 0, null, 0L, v3), iOException0, v2);
        long v4 = this.d.c(loadErrorHandlingPolicy$LoadErrorInfo0);
        int v5 = Long.compare(v4, 0x8000000000000001L);
        boolean z = v5 == 0 || v2 >= this.d.d(1);
        if(!this.k || !z) {
            loader$LoadErrorAction0 = v5 == 0 ? Loader.l : Loader.i(false, v4);
        }
        else {
            Log.o("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException0);
            this.l = true;
            loader$LoadErrorAction0 = Loader.k;
        }
        boolean z1 = loader$LoadErrorAction0.c();
        this.e.v(loadEventInfo0, 1, -1, this.j, 0, null, 0L, this.h, iOException0, !z1);
        if(!z1) {
            this.d.a(singleSampleMediaPeriod$SourceLoadable0.a);
        }
        return loader$LoadErrorAction0;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long q(ExoTrackSelection[] arr_exoTrackSelection, boolean[] arr_z, SampleStream[] arr_sampleStream, boolean[] arr_z1, long v) {
        for(int v1 = 0; v1 < arr_exoTrackSelection.length; ++v1) {
            SampleStream sampleStream0 = arr_sampleStream[v1];
            if(sampleStream0 != null && (arr_exoTrackSelection[v1] == null || !arr_z[v1])) {
                this.g.remove(sampleStream0);
                arr_sampleStream[v1] = null;
            }
            if(arr_sampleStream[v1] == null && arr_exoTrackSelection[v1] != null) {
                SampleStreamImpl singleSampleMediaPeriod$SampleStreamImpl0 = new SampleStreamImpl(this, null);
                this.g.add(singleSampleMediaPeriod$SampleStreamImpl0);
                arr_sampleStream[v1] = singleSampleMediaPeriod$SampleStreamImpl0;
                arr_z1[v1] = true;
            }
        }
        return v;
    }

    public void r() {
        this.i.l();
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void s() {
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void t(androidx.media3.exoplayer.source.MediaPeriod.Callback mediaPeriod$Callback0, long v) {
        mediaPeriod$Callback0.h(this);
    }

    @Override  // androidx.media3.exoplayer.upstream.Loader$Callback
    public void u(Loadable loader$Loadable0, long v, long v1) {
        this.m(((SourceLoadable)loader$Loadable0), v, v1);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void v(long v, boolean z) {
    }

    class androidx.media3.exoplayer.source.SingleSampleMediaPeriod.1 {
    }

}

