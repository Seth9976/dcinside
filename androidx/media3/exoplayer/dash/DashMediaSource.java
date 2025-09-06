package androidx.media3.exoplayer.dash;

import O1.a;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem.Builder;
import androidx.media3.common.MediaItem.LiveConfiguration;
import androidx.media3.common.MediaItem.LocalConfiguration;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.ParserException;
import androidx.media3.common.Timeline.Period;
import androidx.media3.common.Timeline.Window;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.dash.manifest.DashManifestParser;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.dash.manifest.ServiceDescriptionElement;
import androidx.media3.exoplayer.dash.manifest.UtcTimingElement;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManagerProvider;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.offline.FilteringManifestParser;
import androidx.media3.exoplayer.source.BaseMediaSource;
import androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory;
import androidx.media3.exoplayer.source.DefaultCompositeSequenceableLoaderFactory;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher;
import androidx.media3.exoplayer.source.MediaSourceFactory;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader.Callback;
import androidx.media3.exoplayer.upstream.Loader.LoadErrorAction;
import androidx.media3.exoplayer.upstream.Loader.Loadable;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.LoaderErrorThrower.Placeholder;
import androidx.media3.exoplayer.upstream.LoaderErrorThrower;
import androidx.media3.exoplayer.upstream.ParsingLoadable.Parser;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.exoplayer.util.SntpClient.InitializationCallback;
import androidx.media3.exoplayer.util.SntpClient;
import com.google.common.base.f;
import com.google.common.math.h;
import j..util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@UnstableApi
public final class DashMediaSource extends BaseMediaSource {
    static final class DashTimeline extends Timeline {
        private final long e;
        private final long f;
        private final long g;
        private final int h;
        private final long i;
        private final long j;
        private final long k;
        private final DashManifest l;
        private final MediaItem m;
        @Nullable
        private final LiveConfiguration n;

        public DashTimeline(long v, long v1, long v2, int v3, long v4, long v5, long v6, DashManifest dashManifest0, MediaItem mediaItem0, @Nullable LiveConfiguration mediaItem$LiveConfiguration0) {
            Assertions.i(dashManifest0.d == (mediaItem$LiveConfiguration0 != null));
            this.e = v;
            this.f = v1;
            this.g = v2;
            this.h = v3;
            this.i = v4;
            this.j = v5;
            this.k = v6;
            this.l = dashManifest0;
            this.m = mediaItem0;
            this.n = mediaItem$LiveConfiguration0;
        }

        private static boolean A(DashManifest dashManifest0) {
            return dashManifest0.d && dashManifest0.e != 0x8000000000000001L && dashManifest0.b == 0x8000000000000001L;
        }

        @Override  // androidx.media3.common.Timeline
        public int f(Object object0) {
            if(!(object0 instanceof Integer)) {
                return -1;
            }
            int v = ((int)(((Integer)object0))) - this.h;
            return v < 0 || v >= this.m() ? -1 : v;
        }

        @Override  // androidx.media3.common.Timeline
        public Period k(int v, Period timeline$Period0, boolean z) {
            Assertions.c(v, 0, this.m());
            Integer integer0 = null;
            String s = z ? this.l.d(v).a : null;
            if(z) {
                integer0 = (int)(this.h + v);
            }
            long v1 = this.l.g(v);
            androidx.media3.exoplayer.dash.manifest.Period period0 = this.l.d(v);
            androidx.media3.exoplayer.dash.manifest.Period period1 = this.l.d(0);
            return timeline$Period0.w(s, integer0, 0, v1, Util.F1(period0.b - period1.b) - this.i);
        }

        @Override  // androidx.media3.common.Timeline
        public int m() {
            return this.l.e();
        }

        @Override  // androidx.media3.common.Timeline
        public Object s(int v) {
            Assertions.c(v, 0, this.m());
            return (int)(this.h + v);
        }

        @Override  // androidx.media3.common.Timeline
        public Window u(int v, Window timeline$Window0, long v1) {
            Assertions.c(v, 0, 1);
            long v2 = this.z(v1);
            boolean z = DashTimeline.A(this.l);
            int v3 = this.m();
            return timeline$Window0.j(Window.q, this.m, this.l, this.e, this.f, this.g, true, z, this.n, v2, this.j, 0, v3 - 1, this.i);
        }

        @Override  // androidx.media3.common.Timeline
        public int v() {
            return 1;
        }

        private long z(long v) {
            long v1 = this.k;
            if(!DashTimeline.A(this.l)) {
                return v1;
            }
            if(v > 0L) {
                v1 += v;
                if(v1 > this.j) {
                    return 0x8000000000000001L;
                }
            }
            long v2 = this.i + v1;
            long v3 = this.l.g(0);
            int v4 = 0;
            while(v4 < this.l.e() - 1 && v2 >= v3) {
                v2 -= v3;
                ++v4;
                v3 = this.l.g(v4);
            }
            androidx.media3.exoplayer.dash.manifest.Period period0 = this.l.d(v4);
            int v5 = period0.a(2);
            if(v5 == -1) {
                return v1;
            }
            DashSegmentIndex dashSegmentIndex0 = ((Representation)((AdaptationSet)period0.c.get(v5)).c.get(0)).l();
            return dashSegmentIndex0 == null || dashSegmentIndex0.g(v3) == 0L ? v1 : v1 + dashSegmentIndex0.b(dashSegmentIndex0.f(v2, v3)) - v2;
        }
    }

    final class DefaultPlayerEmsgCallback implements PlayerEmsgCallback {
        final DashMediaSource a;

        private DefaultPlayerEmsgCallback() {
        }

        DefaultPlayerEmsgCallback(androidx.media3.exoplayer.dash.DashMediaSource.1 dashMediaSource$10) {
        }

        @Override  // androidx.media3.exoplayer.dash.PlayerEmsgHandler$PlayerEmsgCallback
        public void a(long v) {
            DashMediaSource.this.I0(v);
        }

        @Override  // androidx.media3.exoplayer.dash.PlayerEmsgHandler$PlayerEmsgCallback
        public void b() {
            DashMediaSource.this.J0();
        }
    }

    public static final class Factory implements MediaSourceFactory {
        private final androidx.media3.exoplayer.dash.DashChunkSource.Factory c;
        @Nullable
        private final androidx.media3.datasource.DataSource.Factory d;
        private androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory e;
        private DrmSessionManagerProvider f;
        private CompositeSequenceableLoaderFactory g;
        private LoadErrorHandlingPolicy h;
        private long i;
        private long j;
        @Nullable
        private Parser k;

        public Factory(androidx.media3.datasource.DataSource.Factory dataSource$Factory0) {
            this(new androidx.media3.exoplayer.dash.DefaultDashChunkSource.Factory(dataSource$Factory0), dataSource$Factory0);
        }

        public Factory(androidx.media3.exoplayer.dash.DashChunkSource.Factory dashChunkSource$Factory0, @Nullable androidx.media3.datasource.DataSource.Factory dataSource$Factory0) {
            this.c = (androidx.media3.exoplayer.dash.DashChunkSource.Factory)Assertions.g(dashChunkSource$Factory0);
            this.d = dataSource$Factory0;
            this.f = new DefaultDrmSessionManagerProvider();
            this.h = new DefaultLoadErrorHandlingPolicy();
            this.i = 30000L;
            this.j = 5000000L;
            this.g = new DefaultCompositeSequenceableLoaderFactory();
            this.k(true);
        }

        @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
        @a
        public androidx.media3.exoplayer.source.MediaSource.Factory a(androidx.media3.extractor.text.SubtitleParser.Factory subtitleParser$Factory0) {
            return this.s(subtitleParser$Factory0);
        }

        @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
        @a
        @Deprecated
        public androidx.media3.exoplayer.source.MediaSource.Factory b(boolean z) {
            return this.k(z);
        }

        @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
        @a
        public androidx.media3.exoplayer.source.MediaSource.Factory c(DrmSessionManagerProvider drmSessionManagerProvider0) {
            return this.n(drmSessionManagerProvider0);
        }

        @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
        public int[] d() {
            return new int[]{0};
        }

        @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
        @a
        public androidx.media3.exoplayer.source.MediaSource.Factory e(LoadErrorHandlingPolicy loadErrorHandlingPolicy0) {
            return this.p(loadErrorHandlingPolicy0);
        }

        @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
        @a
        public androidx.media3.exoplayer.source.MediaSource.Factory f(androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory cmcdConfiguration$Factory0) {
            return this.l(cmcdConfiguration$Factory0);
        }

        @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
        public MediaSource g(MediaItem mediaItem0) {
            return this.h(mediaItem0);
        }

        public DashMediaSource h(MediaItem mediaItem0) {
            Assertions.g(mediaItem0.b);
            Parser parsingLoadable$Parser0 = this.k;
            if(parsingLoadable$Parser0 == null) {
                parsingLoadable$Parser0 = new DashManifestParser();
            }
            List list0 = mediaItem0.b.e;
            Parser parsingLoadable$Parser1 = list0.isEmpty() ? parsingLoadable$Parser0 : new FilteringManifestParser(parsingLoadable$Parser0, list0);
            CmcdConfiguration cmcdConfiguration0 = this.e == null ? null : this.e.a(mediaItem0);
            CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory0 = this.g;
            DrmSessionManager drmSessionManager0 = this.f.a(mediaItem0);
            return new DashMediaSource(mediaItem0, null, this.d, parsingLoadable$Parser1, this.c, compositeSequenceableLoaderFactory0, cmcdConfiguration0, drmSessionManager0, this.h, this.i, this.j, null);
        }

        public DashMediaSource i(DashManifest dashManifest0) {
            return this.j(dashManifest0, new Builder().M(Uri.EMPTY).E("DashMediaSource").G("application/dash+xml").a());
        }

        public DashMediaSource j(DashManifest dashManifest0, MediaItem mediaItem0) {
            Assertions.a(!dashManifest0.d);
            Builder mediaItem$Builder0 = mediaItem0.a().G("application/dash+xml");
            if(mediaItem0.b == null) {
                mediaItem$Builder0.M(Uri.EMPTY);
            }
            MediaItem mediaItem1 = mediaItem$Builder0.a();
            CmcdConfiguration cmcdConfiguration0 = this.e == null ? null : this.e.a(mediaItem1);
            CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory0 = this.g;
            DrmSessionManager drmSessionManager0 = this.f.a(mediaItem1);
            return new DashMediaSource(mediaItem1, dashManifest0, null, null, this.c, compositeSequenceableLoaderFactory0, cmcdConfiguration0, drmSessionManager0, this.h, this.i, this.j, null);
        }

        @a
        @Deprecated
        public Factory k(boolean z) {
            this.c.b(z);
            return this;
        }

        @a
        public Factory l(androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory cmcdConfiguration$Factory0) {
            this.e = (androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory)Assertions.g(cmcdConfiguration$Factory0);
            return this;
        }

        @a
        public Factory m(CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory0) {
            this.g = (CompositeSequenceableLoaderFactory)Assertions.h(compositeSequenceableLoaderFactory0, "DashMediaSource.Factory#setCompositeSequenceableLoaderFactory no longer handles null by instantiating a new DefaultCompositeSequenceableLoaderFactory. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @a
        public Factory n(DrmSessionManagerProvider drmSessionManagerProvider0) {
            this.f = (DrmSessionManagerProvider)Assertions.h(drmSessionManagerProvider0, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @a
        public Factory o(long v) {
            this.i = v;
            return this;
        }

        @a
        public Factory p(LoadErrorHandlingPolicy loadErrorHandlingPolicy0) {
            this.h = (LoadErrorHandlingPolicy)Assertions.h(loadErrorHandlingPolicy0, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @a
        public Factory q(@Nullable Parser parsingLoadable$Parser0) {
            this.k = parsingLoadable$Parser0;
            return this;
        }

        @a
        public Factory r(long v) {
            this.j = v;
            return this;
        }

        @a
        public Factory s(androidx.media3.extractor.text.SubtitleParser.Factory subtitleParser$Factory0) {
            androidx.media3.extractor.text.SubtitleParser.Factory subtitleParser$Factory1 = (androidx.media3.extractor.text.SubtitleParser.Factory)Assertions.g(subtitleParser$Factory0);
            this.c.a(subtitleParser$Factory1);
            return this;
        }
    }

    static final class Iso8601Parser implements Parser {
        private static final Pattern a;

        static {
            Iso8601Parser.a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");
        }

        @Override  // androidx.media3.exoplayer.upstream.ParsingLoadable$Parser
        public Object a(Uri uri0, InputStream inputStream0) throws IOException {
            return this.b(uri0, inputStream0);
        }

        public Long b(Uri uri0, InputStream inputStream0) throws IOException {
            String s = new BufferedReader(new InputStreamReader(inputStream0, f.c)).readLine();
            try {
                Matcher matcher0 = Iso8601Parser.a.matcher(s);
                if(!matcher0.matches()) {
                    throw ParserException.c(("Couldn\'t parse timestamp: " + s), null);
                }
                String s1 = matcher0.group(1);
                SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss", Locale.US);
                simpleDateFormat0.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                long v = simpleDateFormat0.parse(s1).getTime();
                if(!"Z".equals(matcher0.group(2))) {
                    long v1 = "+".equals(matcher0.group(4)) ? 1L : -1L;
                    long v2 = Long.parseLong(matcher0.group(5));
                    String s2 = matcher0.group(7);
                    v -= v1 * ((v2 * 60L + (TextUtils.isEmpty(s2) ? 0L : Long.parseLong(s2))) * 60000L);
                }
                return v;
            }
            catch(ParseException parseException0) {
            }
            throw ParserException.c(null, parseException0);
        }
    }

    final class ManifestCallback implements Callback {
        final DashMediaSource a;

        private ManifestCallback() {
        }

        ManifestCallback(androidx.media3.exoplayer.dash.DashMediaSource.1 dashMediaSource$10) {
        }

        public void a(ParsingLoadable parsingLoadable0, long v, long v1, boolean z) {
            DashMediaSource.this.K0(parsingLoadable0, v, v1);
        }

        public void b(ParsingLoadable parsingLoadable0, long v, long v1) {
            DashMediaSource.this.L0(parsingLoadable0, v, v1);
        }

        public LoadErrorAction c(ParsingLoadable parsingLoadable0, long v, long v1, IOException iOException0, int v2) {
            return DashMediaSource.this.M0(parsingLoadable0, v, v1, iOException0, v2);
        }

        @Override  // androidx.media3.exoplayer.upstream.Loader$Callback
        public LoadErrorAction h(Loadable loader$Loadable0, long v, long v1, IOException iOException0, int v2) {
            return this.c(((ParsingLoadable)loader$Loadable0), v, v1, iOException0, v2);
        }

        @Override  // androidx.media3.exoplayer.upstream.Loader$Callback
        public void o(Loadable loader$Loadable0, long v, long v1, boolean z) {
            this.a(((ParsingLoadable)loader$Loadable0), v, v1, z);
        }

        @Override  // androidx.media3.exoplayer.upstream.Loader$Callback
        public void u(Loadable loader$Loadable0, long v, long v1) {
            this.b(((ParsingLoadable)loader$Loadable0), v, v1);
        }
    }

    final class ManifestLoadErrorThrower implements LoaderErrorThrower {
        final DashMediaSource a;

        @Override  // androidx.media3.exoplayer.upstream.LoaderErrorThrower
        public void a(int v) throws IOException {
            DashMediaSource.this.B.a(v);
            this.c();
        }

        @Override  // androidx.media3.exoplayer.upstream.LoaderErrorThrower
        public void b() throws IOException {
            DashMediaSource.this.B.b();
            this.c();
        }

        private void c() throws IOException {
            if(DashMediaSource.this.D != null) {
                throw DashMediaSource.this.D;
            }
        }
    }

    final class UtcTimestampCallback implements Callback {
        final DashMediaSource a;

        private UtcTimestampCallback() {
        }

        UtcTimestampCallback(androidx.media3.exoplayer.dash.DashMediaSource.1 dashMediaSource$10) {
        }

        public void a(ParsingLoadable parsingLoadable0, long v, long v1, boolean z) {
            DashMediaSource.this.K0(parsingLoadable0, v, v1);
        }

        public void b(ParsingLoadable parsingLoadable0, long v, long v1) {
            DashMediaSource.this.N0(parsingLoadable0, v, v1);
        }

        public LoadErrorAction c(ParsingLoadable parsingLoadable0, long v, long v1, IOException iOException0, int v2) {
            return DashMediaSource.this.O0(parsingLoadable0, v, v1, iOException0);
        }

        @Override  // androidx.media3.exoplayer.upstream.Loader$Callback
        public LoadErrorAction h(Loadable loader$Loadable0, long v, long v1, IOException iOException0, int v2) {
            return this.c(((ParsingLoadable)loader$Loadable0), v, v1, iOException0, v2);
        }

        @Override  // androidx.media3.exoplayer.upstream.Loader$Callback
        public void o(Loadable loader$Loadable0, long v, long v1, boolean z) {
            this.a(((ParsingLoadable)loader$Loadable0), v, v1, z);
        }

        @Override  // androidx.media3.exoplayer.upstream.Loader$Callback
        public void u(Loadable loader$Loadable0, long v, long v1) {
            this.b(((ParsingLoadable)loader$Loadable0), v, v1);
        }
    }

    static final class XsDateTimeParser implements Parser {
        private XsDateTimeParser() {
        }

        XsDateTimeParser(androidx.media3.exoplayer.dash.DashMediaSource.1 dashMediaSource$10) {
        }

        @Override  // androidx.media3.exoplayer.upstream.ParsingLoadable$Parser
        public Object a(Uri uri0, InputStream inputStream0) throws IOException {
            return this.b(uri0, inputStream0);
        }

        public Long b(Uri uri0, InputStream inputStream0) throws IOException {
            return Util.O1(new BufferedReader(new InputStreamReader(inputStream0)).readLine());
        }
    }

    private DataSource A;
    private Loader B;
    @Nullable
    private TransferListener C;
    private IOException D;
    private Handler E;
    private LiveConfiguration F;
    private Uri G;
    private Uri H;
    private DashManifest I;
    private boolean J;
    private long K;
    private long L;
    private long M;
    private static final long M8 = 5000L;
    private int N;
    private static final String N8 = "DashMediaSource";
    private long O;
    private int P;
    @GuardedBy("this")
    private MediaItem Q;
    public static final long X = 30000L;
    public static final String Y = "DashMediaSource";
    public static final long Z = 5000000L;
    private final boolean h;
    private final androidx.media3.datasource.DataSource.Factory i;
    private final androidx.media3.exoplayer.dash.DashChunkSource.Factory j;
    private final CompositeSequenceableLoaderFactory k;
    @Nullable
    private final CmcdConfiguration l;
    private final DrmSessionManager m;
    private final LoadErrorHandlingPolicy n;
    private final BaseUrlExclusionList o;
    private final long p;
    private final long q;
    private final EventDispatcher r;
    private final Parser s;
    private final ManifestCallback t;
    private final Object u;
    private final SparseArray v;
    private final Runnable w;
    private final Runnable x;
    private final PlayerEmsgCallback y;
    private final LoaderErrorThrower z;

    static {
        MediaLibraryInfo.a("media3.exoplayer.dash");
    }

    private DashMediaSource(MediaItem mediaItem0, @Nullable DashManifest dashManifest0, @Nullable androidx.media3.datasource.DataSource.Factory dataSource$Factory0, @Nullable Parser parsingLoadable$Parser0, androidx.media3.exoplayer.dash.DashChunkSource.Factory dashChunkSource$Factory0, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory0, @Nullable CmcdConfiguration cmcdConfiguration0, DrmSessionManager drmSessionManager0, LoadErrorHandlingPolicy loadErrorHandlingPolicy0, long v, long v1) {
        this.Q = mediaItem0;
        this.F = mediaItem0.d;
        this.G = ((LocalConfiguration)Assertions.g(mediaItem0.b)).a;
        this.H = mediaItem0.b.a;
        this.I = dashManifest0;
        this.i = dataSource$Factory0;
        this.s = parsingLoadable$Parser0;
        this.j = dashChunkSource$Factory0;
        this.l = cmcdConfiguration0;
        this.m = drmSessionManager0;
        this.n = loadErrorHandlingPolicy0;
        this.p = v;
        this.q = v1;
        this.k = compositeSequenceableLoaderFactory0;
        this.o = new BaseUrlExclusionList();
        this.h = dashManifest0 != null;
        this.r = this.a0(null);
        this.u = new Object();
        this.v = new SparseArray();
        this.y = new DefaultPlayerEmsgCallback(this, null);
        this.O = 0x8000000000000001L;
        this.M = 0x8000000000000001L;
        if(dashManifest0 != null) {
            Assertions.i(((boolean)(true ^ dashManifest0.d)));
            this.t = null;
            this.w = null;
            this.x = null;
            this.z = new Placeholder();
            return;
        }
        this.t = new ManifestCallback(this, null);
        this.z = new ManifestLoadErrorThrower(this);
        this.w = () -> {
            this.E.removeCallbacks(this.w);
            if(this.B.j()) {
                return;
            }
            if(this.B.k()) {
                this.J = true;
                return;
            }
            this.J = false;
            ParsingLoadable parsingLoadable0 = new ParsingLoadable(this.A, this.G, 4, this.s);
            int v = this.n.d(4);
            this.X0(parsingLoadable0, this.t, v);
        };
        this.x = () -> this.R0(false);
    }

    DashMediaSource(MediaItem mediaItem0, DashManifest dashManifest0, androidx.media3.datasource.DataSource.Factory dataSource$Factory0, Parser parsingLoadable$Parser0, androidx.media3.exoplayer.dash.DashChunkSource.Factory dashChunkSource$Factory0, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory0, CmcdConfiguration cmcdConfiguration0, DrmSessionManager drmSessionManager0, LoadErrorHandlingPolicy loadErrorHandlingPolicy0, long v, long v1, androidx.media3.exoplayer.dash.DashMediaSource.1 dashMediaSource$10) {
        this(mediaItem0, dashManifest0, dataSource$Factory0, parsingLoadable$Parser0, dashChunkSource$Factory0, compositeSequenceableLoaderFactory0, cmcdConfiguration0, drmSessionManager0, loadErrorHandlingPolicy0, v, v1);
    }

    private static long A0(androidx.media3.exoplayer.dash.manifest.Period period0, long v, long v1) {
        long v2 = Util.F1(period0.b);
        boolean z = DashMediaSource.E0(period0);
        long v3 = 0x7FFFFFFFFFFFFFFFL;
        for(int v4 = 0; v4 < period0.c.size(); ++v4) {
            AdaptationSet adaptationSet0 = (AdaptationSet)period0.c.get(v4);
            List list0 = adaptationSet0.c;
            if((!z || (adaptationSet0.b == 1 || adaptationSet0.b == 2)) && !list0.isEmpty()) {
                DashSegmentIndex dashSegmentIndex0 = ((Representation)list0.get(0)).l();
                if(dashSegmentIndex0 == null) {
                    return v2 + v;
                }
                long v5 = dashSegmentIndex0.k(v, v1);
                if(v5 == 0L) {
                    return v2;
                }
                long v6 = dashSegmentIndex0.d(v, v1) + v5 - 1L;
                long v7 = dashSegmentIndex0.b(v6);
                v3 = Math.min(v3, dashSegmentIndex0.c(v6, v) + (v7 + v2));
            }
        }
        return v3;
    }

    private static long B0(androidx.media3.exoplayer.dash.manifest.Period period0, long v, long v1) {
        long v2 = Util.F1(period0.b);
        boolean z = DashMediaSource.E0(period0);
        long v3 = v2;
        for(int v4 = 0; v4 < period0.c.size(); ++v4) {
            AdaptationSet adaptationSet0 = (AdaptationSet)period0.c.get(v4);
            List list0 = adaptationSet0.c;
            if((!z || (adaptationSet0.b == 1 || adaptationSet0.b == 2)) && !list0.isEmpty()) {
                DashSegmentIndex dashSegmentIndex0 = ((Representation)list0.get(0)).l();
                if(dashSegmentIndex0 == null) {
                    return v2;
                }
                if(dashSegmentIndex0.k(v, v1) == 0L) {
                    return v2;
                }
                v3 = Math.max(v3, dashSegmentIndex0.b(dashSegmentIndex0.d(v, v1)) + v2);
            }
        }
        return v3;
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod C(MediaPeriodId mediaSource$MediaPeriodId0, Allocator allocator0, long v) {
        int v1 = ((int)(((Integer)mediaSource$MediaPeriodId0.a))) - this.P;
        EventDispatcher mediaSourceEventListener$EventDispatcher0 = this.a0(mediaSource$MediaPeriodId0);
        androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher drmSessionEventListener$EventDispatcher0 = this.V(mediaSource$MediaPeriodId0);
        int v2 = v1 + this.P;
        DashManifest dashManifest0 = this.I;
        TransferListener transferListener0 = this.C;
        long v3 = this.M;
        PlayerId playerId0 = this.h0();
        DashMediaPeriod dashMediaPeriod0 = new DashMediaPeriod(v2, dashManifest0, this.o, v1, this.j, transferListener0, this.l, this.m, drmSessionEventListener$EventDispatcher0, this.n, mediaSourceEventListener$EventDispatcher0, v3, this.z, allocator0, this.k, this.y, playerId0);
        this.v.put(dashMediaPeriod0.a, dashMediaPeriod0);
        return dashMediaPeriod0;
    }

    private static long C0(DashManifest dashManifest0, long v) {
        int v1 = dashManifest0.e();
        androidx.media3.exoplayer.dash.manifest.Period period0 = dashManifest0.d(v1 - 1);
        long v2 = Util.F1(period0.b);
        long v3 = dashManifest0.g(v1 - 1);
        long v4 = Util.F1(v);
        long v5 = Util.F1(dashManifest0.a);
        long v6 = 5000000L;
        for(int v7 = 0; v7 < period0.c.size(); ++v7) {
            List list0 = ((AdaptationSet)period0.c.get(v7)).c;
            if(!list0.isEmpty()) {
                DashSegmentIndex dashSegmentIndex0 = ((Representation)list0.get(0)).l();
                if(dashSegmentIndex0 != null) {
                    long v8 = v5 + v2 + dashSegmentIndex0.e(v3, v4) - v4;
                    if(v8 < v6 - 100000L || v8 > v6 && v8 < v6 + 100000L) {
                        v6 = v8;
                    }
                }
            }
        }
        return h.g(v6, 1000L, RoundingMode.CEILING);
    }

    private long D0() {
        return (long)Math.min((this.N - 1) * 1000, 5000);
    }

    private static boolean E0(androidx.media3.exoplayer.dash.manifest.Period period0) {
        for(int v = 0; v < period0.c.size(); ++v) {
            switch(((AdaptationSet)period0.c.get(v)).b) {
                case 1: 
                case 2: {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean F0(androidx.media3.exoplayer.dash.manifest.Period period0) {
        int v = 0;
        while(v < period0.c.size()) {
            DashSegmentIndex dashSegmentIndex0 = ((Representation)((AdaptationSet)period0.c.get(v)).c.get(0)).l();
            if(dashSegmentIndex0 != null && !dashSegmentIndex0.j()) {
                ++v;
                continue;
            }
            return true;
        }
        return false;
    }

    // 检测为 Lambda 实现
    private void G0() [...]

    private void H0() {
        SntpClient.j(this.B, new InitializationCallback() {
            final DashMediaSource a;

            @Override  // androidx.media3.exoplayer.util.SntpClient$InitializationCallback
            public void a(IOException iOException0) {
                DashMediaSource.this.P0(iOException0);
            }

            @Override  // androidx.media3.exoplayer.util.SntpClient$InitializationCallback
            public void b() {
                long v = SntpClient.h();
                DashMediaSource.this.Q0(v);
            }
        });
    }

    void I0(long v) {
        if(this.O == 0x8000000000000001L || this.O < v) {
            this.O = v;
        }
    }

    void J0() {
        this.E.removeCallbacks(this.x);
        this.Y0();
    }

    void K0(ParsingLoadable parsingLoadable0, long v, long v1) {
        Uri uri0 = parsingLoadable0.e();
        Map map0 = parsingLoadable0.c();
        long v2 = parsingLoadable0.a();
        LoadEventInfo loadEventInfo0 = new LoadEventInfo(parsingLoadable0.a, parsingLoadable0.b, uri0, map0, v, v1, v2);
        this.n.a(parsingLoadable0.a);
        this.r.p(loadEventInfo0, parsingLoadable0.c);
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    public void L(MediaItem mediaItem0) {
        synchronized(this) {
            this.Q = mediaItem0;
        }
    }

    void L0(ParsingLoadable parsingLoadable0, long v, long v1) {
        Uri uri0 = parsingLoadable0.e();
        Map map0 = parsingLoadable0.c();
        long v2 = parsingLoadable0.a();
        LoadEventInfo loadEventInfo0 = new LoadEventInfo(parsingLoadable0.a, parsingLoadable0.b, uri0, map0, v, v1, v2);
        this.n.a(parsingLoadable0.a);
        this.r.s(loadEventInfo0, parsingLoadable0.c);
        DashManifest dashManifest0 = (DashManifest)parsingLoadable0.d();
        int v3 = this.I == null ? 0 : this.I.e();
        long v4 = dashManifest0.d(0).b;
        int v5;
        for(v5 = 0; v5 < v3 && this.I.d(v5).b < v4; ++v5) {
        }
        if(dashManifest0.d) {
            boolean z = false;
            if(v3 - v5 > dashManifest0.e()) {
                z = true;
                Log.n("DashMediaSource", "Loaded out of sync manifest");
            }
            else if(this.O != 0x8000000000000001L && dashManifest0.h * 1000L <= this.O) {
                z = true;
                Log.n("DashMediaSource", "Loaded stale dynamic manifest: " + dashManifest0.h + ", " + this.O);
            }
            if(z) {
                int v6 = this.N;
                this.N = v6 + 1;
                if(v6 < this.n.d(parsingLoadable0.c)) {
                    this.W0(this.D0());
                    return;
                }
                this.D = new DashManifestStaleException();
                return;
            }
            this.N = 0;
        }
        this.I = dashManifest0;
        this.J &= dashManifest0.d;
        this.K = v - v1;
        this.L = v;
        this.P += v5;
        synchronized(this.u) {
            if(parsingLoadable0.b.a == this.G) {
                this.G = this.I.k == null ? parsingLoadable0.e() : this.I.k;
            }
        }
        DashManifest dashManifest1 = this.I;
        if(dashManifest1.d && this.M == 0x8000000000000001L) {
            UtcTimingElement utcTimingElement0 = dashManifest1.i;
            if(utcTimingElement0 != null) {
                this.T0(utcTimingElement0);
                return;
            }
            this.H0();
            return;
        }
        this.R0(true);
    }

    LoadErrorAction M0(ParsingLoadable parsingLoadable0, long v, long v1, IOException iOException0, int v2) {
        Uri uri0 = parsingLoadable0.e();
        Map map0 = parsingLoadable0.c();
        long v3 = parsingLoadable0.a();
        LoadEventInfo loadEventInfo0 = new LoadEventInfo(parsingLoadable0.a, parsingLoadable0.b, uri0, map0, v, v1, v3);
        LoadErrorInfo loadErrorHandlingPolicy$LoadErrorInfo0 = new LoadErrorInfo(loadEventInfo0, new MediaLoadData(parsingLoadable0.c), iOException0, v2);
        long v4 = this.n.c(loadErrorHandlingPolicy$LoadErrorInfo0);
        LoadErrorAction loader$LoadErrorAction0 = v4 == 0x8000000000000001L ? Loader.l : Loader.i(false, v4);
        boolean z = loader$LoadErrorAction0.c();
        this.r.w(loadEventInfo0, parsingLoadable0.c, iOException0, !z);
        if(!z) {
            this.n.a(parsingLoadable0.a);
        }
        return loader$LoadErrorAction0;
    }

    void N0(ParsingLoadable parsingLoadable0, long v, long v1) {
        Uri uri0 = parsingLoadable0.e();
        Map map0 = parsingLoadable0.c();
        long v2 = parsingLoadable0.a();
        LoadEventInfo loadEventInfo0 = new LoadEventInfo(parsingLoadable0.a, parsingLoadable0.b, uri0, map0, v, v1, v2);
        this.n.a(parsingLoadable0.a);
        this.r.s(loadEventInfo0, parsingLoadable0.c);
        this.Q0(((long)(((Long)parsingLoadable0.d()))) - v);
    }

    LoadErrorAction O0(ParsingLoadable parsingLoadable0, long v, long v1, IOException iOException0) {
        Uri uri0 = parsingLoadable0.e();
        Map map0 = parsingLoadable0.c();
        long v2 = parsingLoadable0.a();
        LoadEventInfo loadEventInfo0 = new LoadEventInfo(parsingLoadable0.a, parsingLoadable0.b, uri0, map0, v, v1, v2);
        this.r.w(loadEventInfo0, parsingLoadable0.c, iOException0, true);
        this.n.a(parsingLoadable0.a);
        this.P0(iOException0);
        return Loader.k;
    }

    private void P0(IOException iOException0) {
        Log.e("DashMediaSource", "Failed to resolve time offset.", iOException0);
        this.M = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        this.R0(true);
    }

    private void Q0(long v) {
        this.M = v;
        this.R0(true);
    }

    private void R0(boolean z) {
        androidx.media3.exoplayer.dash.manifest.Period period2;
        long v15;
        long v14;
        for(int v = 0; v < this.v.size(); ++v) {
            int v1 = this.v.keyAt(v);
            if(v1 >= this.P) {
                ((DashMediaPeriod)this.v.valueAt(v)).O(this.I, v1 - this.P);
            }
        }
        androidx.media3.exoplayer.dash.manifest.Period period0 = this.I.d(0);
        int v2 = this.I.e();
        androidx.media3.exoplayer.dash.manifest.Period period1 = this.I.d(v2 - 1);
        long v3 = this.I.g(v2 - 1);
        long v4 = Util.F1(Util.y0(this.M));
        long v5 = DashMediaSource.B0(period0, this.I.g(0), v4);
        long v6 = DashMediaSource.A0(period1, v3, v4);
        boolean z1 = this.I.d && !DashMediaSource.F0(period1);
        if(z1) {
            long v7 = this.I.f;
            if(v7 != 0x8000000000000001L) {
                v5 = Math.max(v5, v6 - Util.F1(v7));
            }
        }
        long v8 = v6 - v5;
        DashManifest dashManifest0 = this.I;
        if(dashManifest0.d) {
            Assertions.i(dashManifest0.a != 0x8000000000000001L);
            long v9 = v4 - Util.F1(this.I.a) - v5;
            this.Z0(v9, v8);
            long v10 = this.I.a;
            long v11 = Util.B2(v5);
            long v12 = v9 - Util.F1(this.F.a);
            long v13 = Math.min(this.q, v8 / 2L);
            v14 = v10 + v11;
            v15 = Long.compare(v12, v13) >= 0 ? v12 : v13;
            period2 = period0;
        }
        else {
            period2 = period0;
            v14 = 0x8000000000000001L;
            v15 = 0L;
        }
        DashManifest dashManifest1 = this.I;
        long v16 = this.M;
        int v17 = this.P;
        MediaItem mediaItem0 = this.d();
        this.p0(new DashTimeline(dashManifest1.a, v14, v16, v17, v5 - Util.F1(period2.b), v8, v15, dashManifest1, mediaItem0, (this.I.d ? this.F : null)));
        if(!this.h) {
            this.E.removeCallbacks(this.x);
            if(z1) {
                Handler handler0 = this.E;
                long v18 = DashMediaSource.C0(this.I, Util.y0(this.M));
                handler0.postDelayed(this.x, v18);
            }
            if(this.J) {
                this.Y0();
                return;
            }
            if(z) {
                DashManifest dashManifest2 = this.I;
                if(dashManifest2.d) {
                    long v19 = dashManifest2.e;
                    if(v19 != 0x8000000000000001L) {
                        if(v19 == 0L) {
                            v19 = 5000L;
                        }
                        this.W0(Math.max(0L, this.K + v19 - SystemClock.elapsedRealtime()));
                    }
                }
            }
        }
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    public boolean S(MediaItem mediaItem0) {
        MediaItem mediaItem1 = this.d();
        LocalConfiguration mediaItem$LocalConfiguration0 = (LocalConfiguration)Assertions.g(mediaItem1.b);
        return mediaItem0.b != null && mediaItem0.b.a.equals(mediaItem$LocalConfiguration0.a) && mediaItem0.b.e.equals(mediaItem$LocalConfiguration0.e) && Util.g(mediaItem0.b.c, mediaItem$LocalConfiguration0.c) && mediaItem1.d.equals(mediaItem0.d);
    }

    public void S0(Uri uri0) {
        synchronized(this.u) {
            this.G = uri0;
            this.H = uri0;
        }
    }

    private void T0(UtcTimingElement utcTimingElement0) {
        String s = utcTimingElement0.a;
        if(!Util.g(s, "urn:mpeg:dash:utc:direct:2014") && !Util.g(s, "urn:mpeg:dash:utc:direct:2012")) {
            if(!Util.g(s, "urn:mpeg:dash:utc:http-iso:2014") && !Util.g(s, "urn:mpeg:dash:utc:http-iso:2012")) {
                if(!Util.g(s, "urn:mpeg:dash:utc:http-xsdate:2014") && !Util.g(s, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                    if(!Util.g(s, "urn:mpeg:dash:utc:ntp:2014") && !Util.g(s, "urn:mpeg:dash:utc:ntp:2012")) {
                        this.P0(new IOException("Unsupported UTC timing scheme"));
                        return;
                    }
                    this.H0();
                    return;
                }
                this.V0(utcTimingElement0, new XsDateTimeParser(null));
                return;
            }
            this.V0(utcTimingElement0, new Iso8601Parser());
            return;
        }
        this.U0(utcTimingElement0);
    }

    private void U0(UtcTimingElement utcTimingElement0) {
        try {
            this.Q0(Util.O1(utcTimingElement0.b) - this.L);
        }
        catch(ParserException parserException0) {
            this.P0(parserException0);
        }
    }

    private void V0(UtcTimingElement utcTimingElement0, Parser parsingLoadable$Parser0) {
        this.X0(new ParsingLoadable(this.A, Uri.parse(utcTimingElement0.b), 5, parsingLoadable$Parser0), new UtcTimestampCallback(this, null), 1);
    }

    private void W0(long v) {
        this.E.postDelayed(this.w, v);
    }

    private void X0(ParsingLoadable parsingLoadable0, Callback loader$Callback0, int v) {
        long v1 = this.B.n(parsingLoadable0, loader$Callback0, v);
        LoadEventInfo loadEventInfo0 = new LoadEventInfo(parsingLoadable0.a, parsingLoadable0.b, v1);
        this.r.y(loadEventInfo0, parsingLoadable0.c);
    }

    // 检测为 Lambda 实现
    private void Y0() [...]

    private void Z0(long v, long v1) {
        long v4;
        LiveConfiguration mediaItem$LiveConfiguration0 = this.d().d;
        long v2 = Util.B2(v);
        long v3 = mediaItem$LiveConfiguration0.c;
        if(v3 == 0x8000000000000001L) {
            ServiceDescriptionElement serviceDescriptionElement0 = this.I.j;
            if(serviceDescriptionElement0 == null) {
                v4 = v2;
            }
            else {
                long v5 = serviceDescriptionElement0.c;
                v4 = v5 == 0x8000000000000001L ? v2 : Math.min(v2, v5);
            }
        }
        else {
            v4 = Math.min(v2, v3);
        }
        long v6 = Util.B2(v - v1);
        if(v6 < 0L && v4 > 0L) {
            v6 = 0L;
        }
        long v7 = this.I.c;
        if(v7 != 0x8000000000000001L) {
            v6 = Math.min(v6 + v7, v2);
        }
        long v8 = v6;
        long v9 = mediaItem$LiveConfiguration0.b;
        if(v9 == 0x8000000000000001L) {
            ServiceDescriptionElement serviceDescriptionElement1 = this.I.j;
            if(serviceDescriptionElement1 != null) {
                long v10 = serviceDescriptionElement1.b;
                if(v10 != 0x8000000000000001L) {
                    v8 = Util.x(v10, v8, v2);
                }
            }
        }
        else {
            v8 = Util.x(v9, v8, v2);
        }
        if(v8 > v4) {
            v4 = v8;
        }
        long v11 = this.F.a;
        if(v11 == 0x8000000000000001L) {
            DashManifest dashManifest0 = this.I;
            ServiceDescriptionElement serviceDescriptionElement2 = dashManifest0.j;
            if(serviceDescriptionElement2 == null) {
            label_42:
                v11 = dashManifest0.g;
                if(v11 == 0x8000000000000001L) {
                    v11 = this.p;
                }
            }
            else {
                long v12 = serviceDescriptionElement2.a;
                if(v12 != 0x8000000000000001L) {
                    v11 = v12;
                    goto label_45;
                }
                goto label_42;
            }
        }
    label_45:
        if(v11 < v8) {
            v11 = v8;
        }
        if(v11 > v4) {
            v11 = Util.x(Util.B2(v - Math.min(this.q, v1 / 2L)), v8, v4);
        }
        float f = mediaItem$LiveConfiguration0.d;
        if(f == -3.402823E+38f) {
            ServiceDescriptionElement serviceDescriptionElement3 = this.I.j;
            f = serviceDescriptionElement3 == null ? -3.402823E+38f : serviceDescriptionElement3.d;
        }
        float f1 = mediaItem$LiveConfiguration0.e;
        if(f1 == -3.402823E+38f) {
            ServiceDescriptionElement serviceDescriptionElement4 = this.I.j;
            f1 = serviceDescriptionElement4 == null ? -3.402823E+38f : serviceDescriptionElement4.e;
        }
        if(f == -3.402823E+38f && f1 == -3.402823E+38f) {
            ServiceDescriptionElement serviceDescriptionElement5 = this.I.j;
            if(serviceDescriptionElement5 == null || serviceDescriptionElement5.a == 0x8000000000000001L) {
                f = 1.0f;
                f1 = 1.0f;
            }
        }
        this.F = new androidx.media3.common.MediaItem.LiveConfiguration.Builder().k(v11).i(v8).g(v4).j(f).h(f1).f();
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public MediaItem d() {
        synchronized(this) {
        }
        return this.Q;
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    protected void o0(@Nullable TransferListener transferListener0) {
        this.C = transferListener0;
        Looper looper0 = Looper.myLooper();
        PlayerId playerId0 = this.h0();
        this.m.b(looper0, playerId0);
        this.m.n();
        if(this.h) {
            this.R0(false);
            return;
        }
        this.A = this.i.a();
        this.B = new Loader("DashMediaSource");
        this.E = Util.H();
        this.Y0();
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    protected void q0() {
        this.J = false;
        this.A = null;
        Loader loader0 = this.B;
        if(loader0 != null) {
            loader0.l();
            this.B = null;
        }
        this.K = 0L;
        this.L = 0L;
        this.G = this.H;
        this.D = null;
        Handler handler0 = this.E;
        if(handler0 != null) {
            handler0.removeCallbacksAndMessages(null);
            this.E = null;
        }
        this.M = 0x8000000000000001L;
        this.N = 0;
        this.O = 0x8000000000000001L;
        this.v.clear();
        this.o.i();
        this.m.release();
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public void r(MediaPeriod mediaPeriod0) {
        ((DashMediaPeriod)mediaPeriod0).K();
        this.v.remove(((DashMediaPeriod)mediaPeriod0).a);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public void w() throws IOException {
        this.z.b();
    }
}

