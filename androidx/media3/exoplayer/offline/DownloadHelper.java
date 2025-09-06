package androidx.media3.exoplayer.offline;

import android.content.Context;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem.DrmConfiguration;
import androidx.media3.common.MediaItem.LocalConfiguration;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Metadata;
import androidx.media3.common.Timeline.Window;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.LoadingInfo.Builder;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.RendererCapabilitiesList;
import androidx.media3.exoplayer.RenderersFactory;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import androidx.media3.exoplayer.trackselection.BaseTrackSelection;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo;
import androidx.media3.exoplayer.trackselection.TrackSelectionUtil;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.DefaultAllocator;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.extractor.ExtractorsFactory;
import com.google.common.collect.u5;
import h4.m;
import j..util.DesugarCollections;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@UnstableApi
public final class DownloadHelper {
    public interface Callback {
        void a(DownloadHelper arg1);

        void b(DownloadHelper arg1, IOException arg2);
    }

    static final class DownloadTrackSelection extends BaseTrackSelection {
        static final class Factory implements androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory {
            private Factory() {
            }

            Factory(androidx.media3.exoplayer.offline.DownloadHelper.1 downloadHelper$10) {
            }

            @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection$Factory
            public ExoTrackSelection[] a(Definition[] arr_exoTrackSelection$Definition, BandwidthMeter bandwidthMeter0, MediaPeriodId mediaSource$MediaPeriodId0, Timeline timeline0) {
                ExoTrackSelection[] arr_exoTrackSelection = new ExoTrackSelection[arr_exoTrackSelection$Definition.length];
                for(int v = 0; v < arr_exoTrackSelection$Definition.length; ++v) {
                    Definition exoTrackSelection$Definition0 = arr_exoTrackSelection$Definition[v];
                    arr_exoTrackSelection[v] = exoTrackSelection$Definition0 == null ? null : new DownloadTrackSelection(exoTrackSelection$Definition0.a, exoTrackSelection$Definition0.b);
                }
                return arr_exoTrackSelection;
            }
        }

        public DownloadTrackSelection(TrackGroup trackGroup0, int[] arr_v) {
            super(trackGroup0, arr_v);
        }

        @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int d() {
            return 0;
        }

        @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void r(long v, long v1, long v2, List list0, MediaChunkIterator[] arr_mediaChunkIterator) {
        }

        @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        @Nullable
        public Object t() {
            return null;
        }

        @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int v() {
            return 0;
        }
    }

    static final class FakeBandwidthMeter implements BandwidthMeter {
        private FakeBandwidthMeter() {
        }

        FakeBandwidthMeter(androidx.media3.exoplayer.offline.DownloadHelper.1 downloadHelper$10) {
        }

        @Override  // androidx.media3.exoplayer.upstream.BandwidthMeter
        public void a(EventListener bandwidthMeter$EventListener0) {
        }

        @Override  // androidx.media3.exoplayer.upstream.BandwidthMeter
        public long b() {
            return 0x8000000000000001L;
        }

        @Override  // androidx.media3.exoplayer.upstream.BandwidthMeter
        public void c(Handler handler0, EventListener bandwidthMeter$EventListener0) {
        }

        @Override  // androidx.media3.exoplayer.upstream.BandwidthMeter
        public long d() {
            return 0L;
        }

        @Override  // androidx.media3.exoplayer.upstream.BandwidthMeter
        @Nullable
        public TransferListener g() {
            return null;
        }
    }

    public static class LiveContentUnsupportedException extends IOException {
    }

    static final class MediaPreparer implements Handler.Callback, androidx.media3.exoplayer.source.MediaPeriod.Callback, MediaSourceCaller {
        private final MediaSource a;
        private final DownloadHelper b;
        private final Allocator c;
        private final ArrayList d;
        private final Handler e;
        private final HandlerThread f;
        private final Handler g;
        public Timeline h;
        public MediaPeriod[] i;
        private boolean j;
        private static final int k = 1;
        private static final int l = 2;
        private static final int m = 3;
        private static final int n = 4;
        private static final int o = 1;
        private static final int p = 2;

        public MediaPreparer(MediaSource mediaSource0, DownloadHelper downloadHelper0) {
            this.a = mediaSource0;
            this.b = downloadHelper0;
            this.c = new DefaultAllocator(true, 0x10000);
            this.d = new ArrayList();
            this.e = Util.K((Message message0) -> {
                if(this.j) {
                    return false;
                }
                switch(message0.what) {
                    case 1: {
                        try {
                            this.b.Q();
                        }
                        catch(ExoPlaybackException exoPlaybackException0) {
                            IOException iOException0 = new IOException(exoPlaybackException0);
                            this.e.obtainMessage(2, iOException0).sendToTarget();
                        }
                        return true;
                    }
                    case 2: {
                        this.d();
                        this.b.P(((IOException)message0.obj));
                        return true;
                    }
                    default: {
                        return false;
                    }
                }
            });
            HandlerThread handlerThread0 = new HandlerThread("ExoPlayer:DownloadHelper");
            this.f = handlerThread0;
            handlerThread0.start();
            Handler handler0 = Util.G(handlerThread0.getLooper(), this);
            this.g = handler0;
            handler0.sendEmptyMessage(1);
        }

        @Override  // androidx.media3.exoplayer.source.MediaSource$MediaSourceCaller
        public void H(MediaSource mediaSource0, Timeline timeline0) {
            MediaPeriod[] arr_mediaPeriod;
            if(this.h != null) {
                return;
            }
            if(timeline0.t(0, new Window()).i()) {
                LiveContentUnsupportedException downloadHelper$LiveContentUnsupportedException0 = new LiveContentUnsupportedException();
                this.e.obtainMessage(2, downloadHelper$LiveContentUnsupportedException0).sendToTarget();
                return;
            }
            this.h = timeline0;
            this.i = new MediaPeriod[timeline0.m()];
            for(int v1 = 0; true; ++v1) {
                arr_mediaPeriod = this.i;
                if(v1 >= arr_mediaPeriod.length) {
                    break;
                }
                MediaPeriodId mediaSource$MediaPeriodId0 = new MediaPeriodId(timeline0.s(v1));
                MediaPeriod mediaPeriod0 = this.a.C(mediaSource$MediaPeriodId0, this.c, 0L);
                this.i[v1] = mediaPeriod0;
                this.d.add(mediaPeriod0);
            }
            for(int v = 0; v < arr_mediaPeriod.length; ++v) {
                arr_mediaPeriod[v].t(this, 0L);
            }
        }

        // 检测为 Lambda 实现
        private boolean b(Message message0) [...]

        public void c(MediaPeriod mediaPeriod0) {
            if(this.d.contains(mediaPeriod0)) {
                this.g.obtainMessage(3, mediaPeriod0).sendToTarget();
            }
        }

        public void d() {
            if(this.j) {
                return;
            }
            this.j = true;
            this.g.sendEmptyMessage(4);
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod$Callback
        public void h(MediaPeriod mediaPeriod0) {
            this.d.remove(mediaPeriod0);
            if(this.d.isEmpty()) {
                this.g.removeMessages(2);
                this.e.sendEmptyMessage(1);
            }
        }

        @Override  // android.os.Handler$Callback
        public boolean handleMessage(Message message0) {
            int v = 0;
            switch(message0.what) {
                case 1: {
                    this.a.I(this, null, PlayerId.d);
                    this.g.sendEmptyMessage(2);
                    return true;
                }
                case 2: {
                    try {
                        if(this.i == null) {
                            this.a.w();
                        }
                        else {
                            while(v < this.d.size()) {
                                ((MediaPeriod)this.d.get(v)).s();
                                ++v;
                            }
                        }
                        this.g.sendEmptyMessageDelayed(2, 100L);
                        return true;
                    }
                    catch(IOException iOException0) {
                    }
                    this.e.obtainMessage(2, iOException0).sendToTarget();
                    return true;
                }
                case 3: {
                    MediaPeriod mediaPeriod0 = (MediaPeriod)message0.obj;
                    if(this.d.contains(mediaPeriod0)) {
                        mediaPeriod0.f(new Builder().f(0L).d());
                    }
                    return true;
                }
                case 4: {
                    MediaPeriod[] arr_mediaPeriod = this.i;
                    if(arr_mediaPeriod != null) {
                        while(v < arr_mediaPeriod.length) {
                            this.a.r(arr_mediaPeriod[v]);
                            ++v;
                        }
                    }
                    this.a.u(this);
                    this.g.removeCallbacksAndMessages(null);
                    this.f.quit();
                    return true;
                }
                default: {
                    return false;
                }
            }
        }

        @Override  // androidx.media3.exoplayer.source.SequenceableLoader$Callback
        public void l(SequenceableLoader sequenceableLoader0) {
            this.c(((MediaPeriod)sequenceableLoader0));
        }
    }

    static final class UnreleaseableRendererCapabilitiesList implements RendererCapabilitiesList {
        private final RendererCapabilities[] a;

        private UnreleaseableRendererCapabilitiesList(RendererCapabilities[] arr_rendererCapabilities) {
            this.a = arr_rendererCapabilities;
        }

        UnreleaseableRendererCapabilitiesList(RendererCapabilities[] arr_rendererCapabilities, androidx.media3.exoplayer.offline.DownloadHelper.1 downloadHelper$10) {
            this(arr_rendererCapabilities);
        }

        @Override  // androidx.media3.exoplayer.RendererCapabilitiesList
        public RendererCapabilities[] a() {
            return this.a;
        }

        @Override  // androidx.media3.exoplayer.RendererCapabilitiesList
        public void release() {
        }

        @Override  // androidx.media3.exoplayer.RendererCapabilitiesList
        public int size() {
            return this.a.length;
        }
    }

    private final LocalConfiguration a;
    @Nullable
    private final MediaSource b;
    private final DefaultTrackSelector c;
    private final RendererCapabilitiesList d;
    private final SparseIntArray e;
    private final Handler f;
    private final Window g;
    private boolean h;
    private Callback i;
    private MediaPreparer j;
    private TrackGroupArray[] k;
    private MappedTrackInfo[] l;
    private List[][] m;
    private List[][] n;
    public static final Parameters o;

    static {
        DownloadHelper.o = Parameters.B0.O().o1(true).i1(false).L0();
    }

    public DownloadHelper(MediaItem mediaItem0, @Nullable MediaSource mediaSource0, TrackSelectionParameters trackSelectionParameters0, RendererCapabilitiesList rendererCapabilitiesList0) {
        this.a = (LocalConfiguration)Assertions.g(mediaItem0.b);
        this.b = mediaSource0;
        DefaultTrackSelector defaultTrackSelector0 = new DefaultTrackSelector(trackSelectionParameters0, new Factory(null));
        this.c = defaultTrackSelector0;
        this.d = rendererCapabilitiesList0;
        this.e = new SparseIntArray();
        defaultTrackSelector0.e(new h(), new FakeBandwidthMeter(null));
        this.f = Util.J();
        this.g = new Window();
    }

    @Deprecated
    public DownloadHelper(MediaItem mediaItem0, @Nullable MediaSource mediaSource0, TrackSelectionParameters trackSelectionParameters0, RendererCapabilities[] arr_rendererCapabilities) {
        this(mediaItem0, mediaSource0, trackSelectionParameters0, new UnreleaseableRendererCapabilitiesList(arr_rendererCapabilities, null));
    }

    @Nullable
    public Object A() {
        if(this.b == null) {
            return null;
        }
        this.o();
        return this.j.h.v() <= 0 ? null : this.j.h.t(0, this.g).d;
    }

    public MappedTrackInfo B(int v) {
        this.o();
        return this.l[v];
    }

    public int C() {
        if(this.b == null) {
            return 0;
        }
        this.o();
        return this.k.length;
    }

    @Deprecated
    public static RendererCapabilities[] D(RenderersFactory renderersFactory0) {
        Renderer[] arr_renderer = renderersFactory0.a(Util.J(), new VideoRendererEventListener() {
            @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
            public void a(VideoSize videoSize0) {
            }

            @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
            public void f(String s) {
            }

            @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
            public void j(DecoderCounters decoderCounters0) {
            }

            @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
            public void m(int v, long v1) {
            }

            @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
            public void o(long v, int v1) {
            }

            @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
            public void p(String s, long v, long v1) {
            }

            @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
            public void t(Exception exception0) {
            }

            @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
            public void v(Object object0, long v) {
            }

            @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
            public void y(Format format0, DecoderReuseEvaluation decoderReuseEvaluation0) {
            }

            @Override  // androidx.media3.exoplayer.video.VideoRendererEventListener
            public void z(DecoderCounters decoderCounters0) {
            }
        }, new AudioRendererEventListener() {
            @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
            public void B(int v, long v1, long v2) {
            }

            @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
            public void b(AudioTrackConfig audioSink$AudioTrackConfig0) {
            }

            @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
            public void c(AudioTrackConfig audioSink$AudioTrackConfig0) {
            }

            @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
            public void d(boolean z) {
            }

            @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
            public void e(Exception exception0) {
            }

            @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
            public void g(String s) {
            }

            @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
            public void h(String s, long v, long v1) {
            }

            @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
            public void i(DecoderCounters decoderCounters0) {
            }

            @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
            public void k(Format format0, DecoderReuseEvaluation decoderReuseEvaluation0) {
            }

            @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
            public void l(DecoderCounters decoderCounters0) {
            }

            @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
            public void n(Exception exception0) {
            }

            @Override  // androidx.media3.exoplayer.audio.AudioRendererEventListener
            public void s(long v) {
            }
        }, new c(), new d());
        RendererCapabilities[] arr_rendererCapabilities = new RendererCapabilities[arr_renderer.length];
        for(int v = 0; v < arr_renderer.length; ++v) {
            arr_rendererCapabilities[v] = arr_renderer[v].B();
        }
        return arr_rendererCapabilities;
    }

    public TrackGroupArray E(int v) {
        this.o();
        return this.k[v];
    }

    public List F(int v, int v1) {
        this.o();
        return this.n[v][v1];
    }

    public Tracks G(int v) {
        this.o();
        return TrackSelectionUtil.b(this.l[v], this.n[v]);
    }

    private static boolean H(LocalConfiguration mediaItem$LocalConfiguration0) {
        return Util.Y0(mediaItem$LocalConfiguration0.a, mediaItem$LocalConfiguration0.b) == 4;
    }

    private static DrmSessionManager I(DrmSessionManager drmSessionManager0, MediaItem mediaItem0) [...] // Inlined contents

    private static void J(CueGroup cueGroup0) {
    }

    private static void K(Metadata metadata0) {
    }

    private static void L() {
    }

    // 检测为 Lambda 实现
    private void M(IOException iOException0) [...]

    // 检测为 Lambda 实现
    private void N() [...]

    // 检测为 Lambda 实现
    private void O(Callback downloadHelper$Callback0) [...]

    private void P(IOException iOException0) {
        ((Handler)Assertions.g(this.f)).post(() -> ((Callback)Assertions.g(this.i)).b(this, iOException0));
    }

    private void Q() throws ExoPlaybackException {
        Assertions.g(this.j);
        Assertions.g(this.j.i);
        Assertions.g(this.j.h);
        int v = this.j.i.length;
        int v1 = this.d.size();
        int[] arr_v = new int[2];
        arr_v[1] = v1;
        arr_v[0] = v;
        this.m = (List[][])Array.newInstance(List.class, arr_v);
        this.n = new List[v][v1];
        for(int v3 = 0; v3 < v; ++v3) {
            for(int v4 = 0; v4 < v1; ++v4) {
                List[] arr_list = this.m[v3];
                arr_list[v4] = new ArrayList();
                List[] arr_list1 = this.n[v3];
                arr_list1[v4] = DesugarCollections.unmodifiableList(this.m[v3][v4]);
            }
        }
        this.k = new TrackGroupArray[v];
        this.l = new MappedTrackInfo[v];
        for(int v2 = 0; v2 < v; ++v2) {
            TrackGroupArray[] arr_trackGroupArray = this.k;
            arr_trackGroupArray[v2] = this.j.i[v2].n();
            TrackSelectorResult trackSelectorResult0 = this.U(v2);
            this.c.i(trackSelectorResult0.e);
            MappedTrackInfo[] arr_mappingTrackSelector$MappedTrackInfo = this.l;
            arr_mappingTrackSelector$MappedTrackInfo[v2] = (MappedTrackInfo)Assertions.g(this.c.o());
        }
        this.V();
        ((Handler)Assertions.g(this.f)).post(() -> ((Callback)Assertions.g(this.i)).a(this));
    }

    public void R(Callback downloadHelper$Callback0) {
        Assertions.i(this.i == null);
        this.i = downloadHelper$Callback0;
        MediaSource mediaSource0 = this.b;
        if(mediaSource0 != null) {
            this.j = new MediaPreparer(mediaSource0, this);
            return;
        }
        g g0 = () -> downloadHelper$Callback0.a(this);
        this.f.post(g0);
    }

    public void S() {
        MediaPreparer downloadHelper$MediaPreparer0 = this.j;
        if(downloadHelper$MediaPreparer0 != null) {
            downloadHelper$MediaPreparer0.d();
        }
        this.c.j();
        this.d.release();
    }

    public void T(int v, TrackSelectionParameters trackSelectionParameters0) {
        try {
            this.o();
            this.p(v);
            this.n(v, trackSelectionParameters0);
        }
        catch(ExoPlaybackException exoPlaybackException0) {
            throw new IllegalStateException(exoPlaybackException0);
        }
    }

    @m({"trackGroupArrays", "trackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline"})
    private TrackSelectorResult U(int v) throws ExoPlaybackException {
        RendererCapabilities[] arr_rendererCapabilities = this.d.a();
        TrackGroupArray trackGroupArray0 = this.k[v];
        MediaPeriodId mediaSource$MediaPeriodId0 = new MediaPeriodId(this.j.h.s(v));
        TrackSelectorResult trackSelectorResult0 = this.c.k(arr_rendererCapabilities, trackGroupArray0, mediaSource$MediaPeriodId0, this.j.h);
        int v1 = 0;
        while(v1 < trackSelectorResult0.a) {
            ExoTrackSelection exoTrackSelection0 = trackSelectorResult0.c[v1];
            if(exoTrackSelection0 != null) {
                List list0 = this.m[v][v1];
                int v2 = 0;
                while(true) {
                    if(v2 < list0.size()) {
                        ExoTrackSelection exoTrackSelection1 = (ExoTrackSelection)list0.get(v2);
                        if(exoTrackSelection1.i().equals(exoTrackSelection0.i())) {
                            this.e.clear();
                            for(int v3 = 0; v3 < exoTrackSelection1.length(); ++v3) {
                                int v4 = exoTrackSelection1.e(v3);
                                this.e.put(v4, 0);
                            }
                            for(int v5 = 0; v5 < exoTrackSelection0.length(); ++v5) {
                                int v6 = exoTrackSelection0.e(v5);
                                this.e.put(v6, 0);
                            }
                            int[] arr_v = new int[this.e.size()];
                            for(int v7 = 0; v7 < this.e.size(); ++v7) {
                                arr_v[v7] = this.e.keyAt(v7);
                            }
                            list0.set(v2, new DownloadTrackSelection(exoTrackSelection1.i(), arr_v));
                            break;
                        }
                        else {
                            ++v2;
                            continue;
                        }
                    }
                    list0.add(exoTrackSelection0);
                    break;
                }
            }
            ++v1;
        }
        return trackSelectorResult0;
    }

    @m({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    private void V() {
        this.h = true;
    }

    public static void a(CueGroup cueGroup0) {
    }

    public static void b() {
    }

    // 检测为 Lambda 实现
    public static DrmSessionManager d(DrmSessionManager drmSessionManager0, MediaItem mediaItem0) [...]

    public static void f(Metadata metadata0) {
    }

    public void j(String[] arr_s) {
        try {
            this.o();
            androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder defaultTrackSelector$Parameters$Builder0 = DownloadHelper.o.O();
            defaultTrackSelector$Parameters$Builder0.P(true);
            RendererCapabilities[] arr_rendererCapabilities = this.d.a();
            for(int v = 0; v < arr_rendererCapabilities.length; ++v) {
                int v1 = arr_rendererCapabilities[v].g();
                defaultTrackSelector$Parameters$Builder0.q0(v1, v1 != 1);
            }
            int v2 = this.C();
            for(int v3 = 0; v3 < arr_s.length; ++v3) {
                TrackSelectionParameters trackSelectionParameters0 = defaultTrackSelector$Parameters$Builder0.c0(arr_s[v3]).D();
                for(int v4 = 0; v4 < v2; ++v4) {
                    this.n(v4, trackSelectionParameters0);
                }
            }
            return;
        }
        catch(ExoPlaybackException exoPlaybackException0) {
        }
        throw new IllegalStateException(exoPlaybackException0);
    }

    public void k(boolean z, String[] arr_s) {
        try {
            this.o();
            androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder defaultTrackSelector$Parameters$Builder0 = DownloadHelper.o.O();
            defaultTrackSelector$Parameters$Builder0.p0(z);
            defaultTrackSelector$Parameters$Builder0.P(true);
            RendererCapabilities[] arr_rendererCapabilities = this.d.a();
            for(int v = 0; v < arr_rendererCapabilities.length; ++v) {
                int v1 = arr_rendererCapabilities[v].g();
                defaultTrackSelector$Parameters$Builder0.q0(v1, v1 != 3);
            }
            int v2 = this.C();
            for(int v3 = 0; v3 < arr_s.length; ++v3) {
                TrackSelectionParameters trackSelectionParameters0 = defaultTrackSelector$Parameters$Builder0.h0(arr_s[v3]).D();
                for(int v4 = 0; v4 < v2; ++v4) {
                    this.n(v4, trackSelectionParameters0);
                }
            }
            return;
        }
        catch(ExoPlaybackException exoPlaybackException0) {
        }
        throw new IllegalStateException(exoPlaybackException0);
    }

    public void l(int v, TrackSelectionParameters trackSelectionParameters0) {
        try {
            this.o();
            this.n(v, trackSelectionParameters0);
        }
        catch(ExoPlaybackException exoPlaybackException0) {
            throw new IllegalStateException(exoPlaybackException0);
        }
    }

    public void m(int v, int v1, Parameters defaultTrackSelector$Parameters0, List list0) {
        try {
            this.o();
            androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder defaultTrackSelector$Parameters$Builder0 = defaultTrackSelector$Parameters0.O();
            for(int v3 = 0; v3 < this.l[v].d(); ++v3) {
                defaultTrackSelector$Parameters$Builder0.N1(v3, v3 != v1);
            }
            if(list0.isEmpty()) {
                this.n(v, defaultTrackSelector$Parameters$Builder0.L0());
                return;
            }
            TrackGroupArray trackGroupArray0 = this.l[v].h(v1);
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                defaultTrackSelector$Parameters$Builder0.P1(v1, trackGroupArray0, ((SelectionOverride)list0.get(v2)));
                this.n(v, defaultTrackSelector$Parameters$Builder0.L0());
            }
            return;
        }
        catch(ExoPlaybackException exoPlaybackException0) {
        }
        throw new IllegalStateException(exoPlaybackException0);
    }

    @m({"trackGroupArrays", "trackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline"})
    private void n(int v, TrackSelectionParameters trackSelectionParameters0) throws ExoPlaybackException {
        this.c.m(trackSelectionParameters0);
        this.U(v);
        u5 u50 = trackSelectionParameters0.A.K().i();
        while(u50.hasNext()) {
            Object object0 = u50.next();
            TrackSelectionParameters trackSelectionParameters1 = trackSelectionParameters0.F().b0(((TrackSelectionOverride)object0)).D();
            this.c.m(trackSelectionParameters1);
            this.U(v);
        }
    }

    @h4.d({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    private void o() {
        Assertions.i(this.h);
    }

    public void p(int v) {
        this.o();
        for(int v1 = 0; v1 < this.d.size(); ++v1) {
            this.m[v][v1].clear();
        }
    }

    public static MediaSource q(DownloadRequest downloadRequest0, androidx.media3.datasource.DataSource.Factory dataSource$Factory0) {
        return DownloadHelper.r(downloadRequest0, dataSource$Factory0, null);
    }

    public static MediaSource r(DownloadRequest downloadRequest0, androidx.media3.datasource.DataSource.Factory dataSource$Factory0, @Nullable DrmSessionManager drmSessionManager0) {
        return DownloadHelper.s(downloadRequest0.e(), dataSource$Factory0, drmSessionManager0);
    }

    private static MediaSource s(MediaItem mediaItem0, androidx.media3.datasource.DataSource.Factory dataSource$Factory0, @Nullable DrmSessionManager drmSessionManager0) {
        DefaultMediaSourceFactory defaultMediaSourceFactory0 = new DefaultMediaSourceFactory(dataSource$Factory0, ExtractorsFactory.a);
        if(drmSessionManager0 != null) {
            defaultMediaSourceFactory0.v((MediaItem mediaItem0) -> drmSessionManager0);
        }
        return defaultMediaSourceFactory0.g(mediaItem0);
    }

    public static DownloadHelper t(Context context0, MediaItem mediaItem0) {
        Assertions.a(DownloadHelper.H(((LocalConfiguration)Assertions.g(mediaItem0.b))));
        return DownloadHelper.w(mediaItem0, DownloadHelper.x(context0), null, null, null);
    }

    public static DownloadHelper u(Context context0, MediaItem mediaItem0, @Nullable RenderersFactory renderersFactory0, @Nullable androidx.media3.datasource.DataSource.Factory dataSource$Factory0) {
        return DownloadHelper.w(mediaItem0, DownloadHelper.x(context0), renderersFactory0, dataSource$Factory0, null);
    }

    public static DownloadHelper v(MediaItem mediaItem0, TrackSelectionParameters trackSelectionParameters0, @Nullable RenderersFactory renderersFactory0, @Nullable androidx.media3.datasource.DataSource.Factory dataSource$Factory0) {
        return DownloadHelper.w(mediaItem0, trackSelectionParameters0, renderersFactory0, dataSource$Factory0, null);
    }

    public static DownloadHelper w(MediaItem mediaItem0, TrackSelectionParameters trackSelectionParameters0, @Nullable RenderersFactory renderersFactory0, @Nullable androidx.media3.datasource.DataSource.Factory dataSource$Factory0, @Nullable DrmSessionManager drmSessionManager0) {
        boolean z = DownloadHelper.H(((LocalConfiguration)Assertions.g(mediaItem0.b)));
        Assertions.a(z || dataSource$Factory0 != null);
        MediaSource mediaSource0 = z ? null : DownloadHelper.s(mediaItem0, dataSource$Factory0, drmSessionManager0);
        return renderersFactory0 == null ? new DownloadHelper(mediaItem0, mediaSource0, trackSelectionParameters0, new UnreleaseableRendererCapabilitiesList(new RendererCapabilities[0], null)) : new DownloadHelper(mediaItem0, mediaSource0, trackSelectionParameters0, new androidx.media3.exoplayer.DefaultRendererCapabilitiesList.Factory(renderersFactory0).d());
    }

    public static Parameters x(Context context0) {
        return Parameters.Q(context0).O().o1(true).i1(false).L0();
    }

    public DownloadRequest y(String s, @Nullable byte[] arr_b) {
        androidx.media3.exoplayer.offline.DownloadRequest.Builder downloadRequest$Builder0 = new androidx.media3.exoplayer.offline.DownloadRequest.Builder(s, this.a.a).e(this.a.b);
        DrmConfiguration mediaItem$DrmConfiguration0 = this.a.c;
        androidx.media3.exoplayer.offline.DownloadRequest.Builder downloadRequest$Builder1 = downloadRequest$Builder0.d((mediaItem$DrmConfiguration0 == null ? null : mediaItem$DrmConfiguration0.d())).b(this.a.f).c(arr_b);
        if(this.b == null) {
            return downloadRequest$Builder1.a();
        }
        this.o();
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(int v = 0; v < this.m.length; ++v) {
            arrayList1.clear();
            int v1 = this.m[v].length;
            for(int v2 = 0; v2 < v1; ++v2) {
                arrayList1.addAll(this.m[v][v2]);
            }
            arrayList0.addAll(this.j.i[v].i(arrayList1));
        }
        return downloadRequest$Builder1.f(arrayList0).a();
    }

    public DownloadRequest z(@Nullable byte[] arr_b) {
        return this.y(this.a.a.toString(), arr_b);
    }
}

