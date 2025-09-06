package androidx.media3.exoplayer.source;

import O1.a;
import android.content.Context;
import androidx.annotation.Nullable;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem.AdsConfiguration;
import androidx.media3.common.MediaItem.LiveConfiguration.Builder;
import androidx.media3.common.MediaItem.LiveConfiguration;
import androidx.media3.common.MediaItem.SubtitleConfiguration;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource.Factory;
import androidx.media3.datasource.DataSpec;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.source.ads.AdsLoader.Provider;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap.Unseekable;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.d;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.text.SubtitleExtractor;
import com.google.common.base.Q;
import com.google.common.collect.O2;
import com.google.common.primitives.l;
import j..util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class DefaultMediaSourceFactory implements MediaSourceFactory {
    @UnstableApi
    @Deprecated
    public interface AdsLoaderProvider extends Provider {
    }

    static final class DelegateFactoryLoader {
        private final ExtractorsFactory a;
        private final Map b;
        private final Map c;
        private Factory d;
        private boolean e;
        private androidx.media3.extractor.text.SubtitleParser.Factory f;
        @Nullable
        private androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory g;
        @Nullable
        private DrmSessionManagerProvider h;
        @Nullable
        private LoadErrorHandlingPolicy i;

        public DelegateFactoryLoader(ExtractorsFactory extractorsFactory0, androidx.media3.extractor.text.SubtitleParser.Factory subtitleParser$Factory0) {
            this.a = extractorsFactory0;
            this.f = subtitleParser$Factory0;
            this.b = new HashMap();
            this.c = new HashMap();
            this.e = true;
        }

        private void f() {
            this.o(0);
            this.o(1);
            this.o(2);
            this.o(3);
            this.o(4);
        }

        public androidx.media3.exoplayer.source.MediaSource.Factory g(int v) throws ClassNotFoundException {
            androidx.media3.exoplayer.source.MediaSource.Factory mediaSource$Factory0 = (androidx.media3.exoplayer.source.MediaSource.Factory)this.c.get(v);
            if(mediaSource$Factory0 != null) {
                return mediaSource$Factory0;
            }
            androidx.media3.exoplayer.source.MediaSource.Factory mediaSource$Factory1 = (androidx.media3.exoplayer.source.MediaSource.Factory)this.n(v).get();
            androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory cmcdConfiguration$Factory0 = this.g;
            if(cmcdConfiguration$Factory0 != null) {
                mediaSource$Factory1.f(cmcdConfiguration$Factory0);
            }
            DrmSessionManagerProvider drmSessionManagerProvider0 = this.h;
            if(drmSessionManagerProvider0 != null) {
                mediaSource$Factory1.c(drmSessionManagerProvider0);
            }
            LoadErrorHandlingPolicy loadErrorHandlingPolicy0 = this.i;
            if(loadErrorHandlingPolicy0 != null) {
                mediaSource$Factory1.e(loadErrorHandlingPolicy0);
            }
            mediaSource$Factory1.a(this.f);
            mediaSource$Factory1.b(this.e);
            this.c.put(v, mediaSource$Factory1);
            return mediaSource$Factory1;
        }

        public int[] h() {
            this.f();
            return l.D(this.b.keySet());
        }

        // 检测为 Lambda 实现
        private androidx.media3.exoplayer.source.MediaSource.Factory m(Factory dataSource$Factory0) [...]

        private Q n(int v) throws ClassNotFoundException {
            Q q1;
            Q q0 = (Q)this.b.get(v);
            if(q0 != null) {
                return q0;
            }
            Factory dataSource$Factory0 = (Factory)Assertions.g(this.d);
            Class class0 = androidx.media3.exoplayer.source.MediaSource.Factory.class;
            switch(v) {
                case 0: {
                    q1 = new f(androidx.media3.exoplayer.dash.DashMediaSource.Factory.class.asSubclass(class0), dataSource$Factory0);
                    break;
                }
                case 1: {
                    q1 = new g(Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(class0), dataSource$Factory0);
                    break;
                }
                case 2: {
                    q1 = new h(Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(class0), dataSource$Factory0);
                    break;
                }
                case 3: {
                    q1 = new i(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(class0));
                    break;
                }
                case 4: {
                    q1 = () -> new androidx.media3.exoplayer.source.ProgressiveMediaSource.Factory(dataSource$Factory0, this.a);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unrecognized contentType: " + v);
                }
            }
            this.b.put(v, q1);
            return q1;
        }

        @a
        @Nullable
        private Q o(int v) {
            try {
                return this.n(v);
            }
            catch(ClassNotFoundException unused_ex) {
                return null;
            }
        }

        public void p(androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory cmcdConfiguration$Factory0) {
            this.g = cmcdConfiguration$Factory0;
            for(Object object0: this.c.values()) {
                ((androidx.media3.exoplayer.source.MediaSource.Factory)object0).f(cmcdConfiguration$Factory0);
            }
        }

        public void q(Factory dataSource$Factory0) {
            if(dataSource$Factory0 != this.d) {
                this.d = dataSource$Factory0;
                this.b.clear();
                this.c.clear();
            }
        }

        public void r(DrmSessionManagerProvider drmSessionManagerProvider0) {
            this.h = drmSessionManagerProvider0;
            for(Object object0: this.c.values()) {
                ((androidx.media3.exoplayer.source.MediaSource.Factory)object0).c(drmSessionManagerProvider0);
            }
        }

        public void s(int v) {
            ExtractorsFactory extractorsFactory0 = this.a;
            if(extractorsFactory0 instanceof DefaultExtractorsFactory) {
                ((DefaultExtractorsFactory)extractorsFactory0).q(v);
            }
        }

        public void t(LoadErrorHandlingPolicy loadErrorHandlingPolicy0) {
            this.i = loadErrorHandlingPolicy0;
            for(Object object0: this.c.values()) {
                ((androidx.media3.exoplayer.source.MediaSource.Factory)object0).e(loadErrorHandlingPolicy0);
            }
        }

        public void u(boolean z) {
            this.e = z;
            this.a.b(z);
            for(Object object0: this.c.values()) {
                ((androidx.media3.exoplayer.source.MediaSource.Factory)object0).b(z);
            }
        }

        public void v(androidx.media3.extractor.text.SubtitleParser.Factory subtitleParser$Factory0) {
            this.f = subtitleParser$Factory0;
            this.a.a(subtitleParser$Factory0);
            for(Object object0: this.c.values()) {
                ((androidx.media3.exoplayer.source.MediaSource.Factory)object0).a(subtitleParser$Factory0);
            }
        }
    }

    static final class UnknownSubtitlesExtractor implements Extractor {
        private final Format d;

        public UnknownSubtitlesExtractor(Format format0) {
            this.d = format0;
        }

        @Override  // androidx.media3.extractor.Extractor
        public void a(long v, long v1) {
        }

        @Override  // androidx.media3.extractor.Extractor
        public Extractor c() {
            return this;
        }

        @Override  // androidx.media3.extractor.Extractor
        public List d() {
            return d.a(this);
        }

        @Override  // androidx.media3.extractor.Extractor
        public int e(ExtractorInput extractorInput0, PositionHolder positionHolder0) throws IOException {
            return extractorInput0.g(0x7FFFFFFF) == -1 ? -1 : 0;
        }

        @Override  // androidx.media3.extractor.Extractor
        public boolean g(ExtractorInput extractorInput0) {
            return true;
        }

        @Override  // androidx.media3.extractor.Extractor
        public void h(ExtractorOutput extractorOutput0) {
            TrackOutput trackOutput0 = extractorOutput0.b(0, 3);
            extractorOutput0.r(new Unseekable(0x8000000000000001L));
            extractorOutput0.m();
            trackOutput0.d(this.d.a().o0("text/x-unknown").O(this.d.n).K());
        }

        @Override  // androidx.media3.extractor.Extractor
        public void release() {
        }
    }

    private final DelegateFactoryLoader c;
    private Factory d;
    private androidx.media3.extractor.text.SubtitleParser.Factory e;
    @Nullable
    private androidx.media3.exoplayer.source.MediaSource.Factory f;
    @Nullable
    private ExternalLoader g;
    @Nullable
    private Provider h;
    @Nullable
    private AdViewProvider i;
    @Nullable
    private LoadErrorHandlingPolicy j;
    private long k;
    private long l;
    private long m;
    private float n;
    private float o;
    private boolean p;
    private static final String q = "DMediaSourceFactory";

    public DefaultMediaSourceFactory(Context context0) {
        this(new androidx.media3.datasource.DefaultDataSource.Factory(context0));
    }

    @UnstableApi
    public DefaultMediaSourceFactory(Context context0, ExtractorsFactory extractorsFactory0) {
        this(new androidx.media3.datasource.DefaultDataSource.Factory(context0), extractorsFactory0);
    }

    @UnstableApi
    public DefaultMediaSourceFactory(Factory dataSource$Factory0) {
        this(dataSource$Factory0, new DefaultExtractorsFactory());
    }

    @UnstableApi
    public DefaultMediaSourceFactory(Factory dataSource$Factory0, ExtractorsFactory extractorsFactory0) {
        this.d = dataSource$Factory0;
        DefaultSubtitleParserFactory defaultSubtitleParserFactory0 = new DefaultSubtitleParserFactory();
        this.e = defaultSubtitleParserFactory0;
        DelegateFactoryLoader defaultMediaSourceFactory$DelegateFactoryLoader0 = new DelegateFactoryLoader(extractorsFactory0, defaultSubtitleParserFactory0);
        this.c = defaultMediaSourceFactory$DelegateFactoryLoader0;
        defaultMediaSourceFactory$DelegateFactoryLoader0.q(dataSource$Factory0);
        this.k = 0x8000000000000001L;
        this.l = 0x8000000000000001L;
        this.m = 0x8000000000000001L;
        this.n = -3.402823E+38f;
        this.o = -3.402823E+38f;
        this.p = true;
    }

    @a
    @UnstableApi
    public DefaultMediaSourceFactory A(float f) {
        this.n = f;
        return this;
    }

    @a
    @UnstableApi
    public DefaultMediaSourceFactory B(long v) {
        this.k = v;
        return this;
    }

    @a
    @UnstableApi
    public DefaultMediaSourceFactory C(LoadErrorHandlingPolicy loadErrorHandlingPolicy0) {
        this.j = (LoadErrorHandlingPolicy)Assertions.h(loadErrorHandlingPolicy0, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.c.t(loadErrorHandlingPolicy0);
        return this;
    }

    @a
    public DefaultMediaSourceFactory D(Provider adsLoader$Provider0, AdViewProvider adViewProvider0) {
        this.h = (Provider)Assertions.g(adsLoader$Provider0);
        this.i = (AdViewProvider)Assertions.g(adViewProvider0);
        return this;
    }

    @a
    public DefaultMediaSourceFactory E(@Nullable androidx.media3.exoplayer.source.MediaSource.Factory mediaSource$Factory0) {
        this.f = mediaSource$Factory0;
        return this;
    }

    @a
    @UnstableApi
    public DefaultMediaSourceFactory F(androidx.media3.extractor.text.SubtitleParser.Factory subtitleParser$Factory0) {
        this.e = (androidx.media3.extractor.text.SubtitleParser.Factory)Assertions.g(subtitleParser$Factory0);
        this.c.v(subtitleParser$Factory0);
        return this;
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
    @a
    @UnstableApi
    public androidx.media3.exoplayer.source.MediaSource.Factory a(androidx.media3.extractor.text.SubtitleParser.Factory subtitleParser$Factory0) {
        return this.F(subtitleParser$Factory0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
    @a
    @UnstableApi
    @Deprecated
    public androidx.media3.exoplayer.source.MediaSource.Factory b(boolean z) {
        return this.l(z);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
    @a
    @UnstableApi
    public androidx.media3.exoplayer.source.MediaSource.Factory c(DrmSessionManagerProvider drmSessionManagerProvider0) {
        return this.v(drmSessionManagerProvider0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
    @UnstableApi
    public int[] d() {
        return this.c.h();
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
    @a
    @UnstableApi
    public androidx.media3.exoplayer.source.MediaSource.Factory e(LoadErrorHandlingPolicy loadErrorHandlingPolicy0) {
        return this.C(loadErrorHandlingPolicy0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
    @a
    @UnstableApi
    public androidx.media3.exoplayer.source.MediaSource.Factory f(androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory cmcdConfiguration$Factory0) {
        return this.t(cmcdConfiguration$Factory0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
    @UnstableApi
    public MediaSource g(MediaItem mediaItem0) {
        androidx.media3.exoplayer.source.MediaSource.Factory mediaSource$Factory0;
        Assertions.g(mediaItem0.b);
        String s = mediaItem0.b.a.getScheme();
        if(s != null && s.equals("ssai")) {
            return ((androidx.media3.exoplayer.source.MediaSource.Factory)Assertions.g(this.f)).g(mediaItem0);
        }
        if(Objects.equals(mediaItem0.b.b, "application/x-image-uri")) {
            return new androidx.media3.exoplayer.source.ExternallyLoadedMediaSource.Factory(Util.F1(mediaItem0.b.j), ((ExternalLoader)Assertions.g(this.g))).h(mediaItem0);
        }
        int v = Util.Y0(mediaItem0.b.a, mediaItem0.b.b);
        if(mediaItem0.b.j != 0x8000000000000001L) {
            this.c.s(1);
        }
        try {
            mediaSource$Factory0 = this.c.g(v);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new IllegalStateException(classNotFoundException0);
        }
        Builder mediaItem$LiveConfiguration$Builder0 = mediaItem0.d.a();
        if(mediaItem0.d.a == 0x8000000000000001L) {
            mediaItem$LiveConfiguration$Builder0.k(this.k);
        }
        if(mediaItem0.d.d == -3.402823E+38f) {
            mediaItem$LiveConfiguration$Builder0.j(this.n);
        }
        if(mediaItem0.d.e == -3.402823E+38f) {
            mediaItem$LiveConfiguration$Builder0.h(this.o);
        }
        if(mediaItem0.d.b == 0x8000000000000001L) {
            mediaItem$LiveConfiguration$Builder0.i(this.l);
        }
        if(mediaItem0.d.c == 0x8000000000000001L) {
            mediaItem$LiveConfiguration$Builder0.g(this.m);
        }
        LiveConfiguration mediaItem$LiveConfiguration0 = mediaItem$LiveConfiguration$Builder0.f();
        if(!mediaItem$LiveConfiguration0.equals(mediaItem0.d)) {
            mediaItem0 = mediaItem0.a().y(mediaItem$LiveConfiguration0).a();
        }
        MediaSource mediaSource0 = mediaSource$Factory0.g(mediaItem0);
        O2 o20 = mediaItem0.b.g;
        if(!o20.isEmpty()) {
            MediaSource[] arr_mediaSource = new MediaSource[o20.size() + 1];
            arr_mediaSource[0] = mediaSource0;
            for(int v1 = 0; v1 < o20.size(); ++v1) {
                if(this.p) {
                    e e0 = new e(this, new androidx.media3.common.Format.Builder().o0(((SubtitleConfiguration)o20.get(v1)).b).e0(((SubtitleConfiguration)o20.get(v1)).c).q0(((SubtitleConfiguration)o20.get(v1)).d).m0(((SubtitleConfiguration)o20.get(v1)).e).c0(((SubtitleConfiguration)o20.get(v1)).f).a0(((SubtitleConfiguration)o20.get(v1)).g).K());
                    androidx.media3.exoplayer.source.ProgressiveMediaSource.Factory progressiveMediaSource$Factory0 = new androidx.media3.exoplayer.source.ProgressiveMediaSource.Factory(this.d, e0);
                    LoadErrorHandlingPolicy loadErrorHandlingPolicy0 = this.j;
                    if(loadErrorHandlingPolicy0 != null) {
                        progressiveMediaSource$Factory0.m(loadErrorHandlingPolicy0);
                    }
                    arr_mediaSource[v1 + 1] = progressiveMediaSource$Factory0.i(MediaItem.d(((SubtitleConfiguration)o20.get(v1)).a.toString()));
                }
                else {
                    androidx.media3.exoplayer.source.SingleSampleMediaSource.Factory singleSampleMediaSource$Factory0 = new androidx.media3.exoplayer.source.SingleSampleMediaSource.Factory(this.d);
                    LoadErrorHandlingPolicy loadErrorHandlingPolicy1 = this.j;
                    if(loadErrorHandlingPolicy1 != null) {
                        singleSampleMediaSource$Factory0.b(loadErrorHandlingPolicy1);
                    }
                    arr_mediaSource[v1 + 1] = singleSampleMediaSource$Factory0.a(((SubtitleConfiguration)o20.get(v1)), 0x8000000000000001L);
                }
            }
            mediaSource0 = new MergingMediaSource(arr_mediaSource);
        }
        return this.o(mediaItem0, DefaultMediaSourceFactory.n(mediaItem0, mediaSource0));
    }

    @a
    public DefaultMediaSourceFactory k() {
        this.h = null;
        this.i = null;
        return this;
    }

    @a
    @UnstableApi
    @Deprecated
    public DefaultMediaSourceFactory l(boolean z) {
        this.p = z;
        this.c.u(z);
        return this;
    }

    // 去混淆评级： 低(20)
    private Extractor[] m(Format format0) {
        return this.e.a(format0) ? new Extractor[]{new SubtitleExtractor(this.e.c(format0), format0)} : new Extractor[]{new UnknownSubtitlesExtractor(format0)};
    }

    private static MediaSource n(MediaItem mediaItem0, MediaSource mediaSource0) {
        return mediaItem0.f.b == 0L && mediaItem0.f.d == 0x8000000000000000L && !mediaItem0.f.f ? mediaSource0 : new ClippingMediaSource(mediaSource0, mediaItem0.f.b, mediaItem0.f.d, !mediaItem0.f.g, mediaItem0.f.e, mediaItem0.f.f);
    }

    private MediaSource o(MediaItem mediaItem0, MediaSource mediaSource0) {
        Assertions.g(mediaItem0.b);
        AdsConfiguration mediaItem$AdsConfiguration0 = mediaItem0.b.d;
        if(mediaItem$AdsConfiguration0 == null) {
            return mediaSource0;
        }
        Provider adsLoader$Provider0 = this.h;
        AdViewProvider adViewProvider0 = this.i;
        if(adsLoader$Provider0 != null && adViewProvider0 != null) {
            AdsLoader adsLoader0 = adsLoader$Provider0.a(mediaItem$AdsConfiguration0);
            if(adsLoader0 == null) {
                Log.n("DMediaSourceFactory", "Playing media without ads, as no AdsLoader was provided.");
                return mediaSource0;
            }
            DataSpec dataSpec0 = new DataSpec(mediaItem$AdsConfiguration0.a);
            return mediaItem$AdsConfiguration0.b == null ? new AdsMediaSource(mediaSource0, dataSpec0, O2.D(mediaItem0.a, mediaItem0.b.a, mediaItem$AdsConfiguration0.a), this, adsLoader0, adViewProvider0) : new AdsMediaSource(mediaSource0, dataSpec0, mediaItem$AdsConfiguration0.b, this, adsLoader0, adViewProvider0);
        }
        Log.n("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
        return mediaSource0;
    }

    private static androidx.media3.exoplayer.source.MediaSource.Factory p(Class class0) {
        try {
            return (androidx.media3.exoplayer.source.MediaSource.Factory)class0.getConstructor(null).newInstance(null);
        }
        catch(Exception exception0) {
            throw new IllegalStateException(exception0);
        }
    }

    private static androidx.media3.exoplayer.source.MediaSource.Factory q(Class class0, Factory dataSource$Factory0) {
        try {
            return (androidx.media3.exoplayer.source.MediaSource.Factory)class0.getConstructor(Factory.class).newInstance(dataSource$Factory0);
        }
        catch(Exception exception0) {
            throw new IllegalStateException(exception0);
        }
    }

    @a
    @UnstableApi
    @Deprecated
    public DefaultMediaSourceFactory r(@Nullable AdViewProvider adViewProvider0) {
        this.i = adViewProvider0;
        return this;
    }

    @a
    @UnstableApi
    @Deprecated
    public DefaultMediaSourceFactory s(@Nullable Provider adsLoader$Provider0) {
        this.h = adsLoader$Provider0;
        return this;
    }

    @a
    @UnstableApi
    public DefaultMediaSourceFactory t(androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory cmcdConfiguration$Factory0) {
        androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory cmcdConfiguration$Factory1 = (androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory)Assertions.g(cmcdConfiguration$Factory0);
        this.c.p(cmcdConfiguration$Factory1);
        return this;
    }

    @a
    public DefaultMediaSourceFactory u(Factory dataSource$Factory0) {
        this.d = dataSource$Factory0;
        this.c.q(dataSource$Factory0);
        return this;
    }

    @a
    @UnstableApi
    public DefaultMediaSourceFactory v(DrmSessionManagerProvider drmSessionManagerProvider0) {
        DrmSessionManagerProvider drmSessionManagerProvider1 = (DrmSessionManagerProvider)Assertions.h(drmSessionManagerProvider0, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.c.r(drmSessionManagerProvider1);
        return this;
    }

    @a
    @UnstableApi
    public DefaultMediaSourceFactory w(@Nullable ExternalLoader externalLoader0) {
        this.g = externalLoader0;
        return this;
    }

    @a
    @UnstableApi
    public DefaultMediaSourceFactory x(long v) {
        this.m = v;
        return this;
    }

    @a
    @UnstableApi
    public DefaultMediaSourceFactory y(float f) {
        this.o = f;
        return this;
    }

    @a
    @UnstableApi
    public DefaultMediaSourceFactory z(long v) {
        this.l = v;
        return this;
    }
}

