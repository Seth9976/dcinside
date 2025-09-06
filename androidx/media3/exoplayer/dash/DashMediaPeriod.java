package androidx.media3.exoplayer.dash;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.StreamKey;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.dash.manifest.Descriptor;
import androidx.media3.exoplayer.dash.manifest.EventStream;
import androidx.media3.exoplayer.dash.manifest.Period;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory;
import androidx.media3.exoplayer.source.EmptySampleStream;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SequenceableLoader.Callback;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.source.chunk.ChunkSampleStream.EmbeddedSampleStream;
import androidx.media3.exoplayer.source.chunk.ChunkSampleStream.ReleaseCallback;
import androidx.media3.exoplayer.source.chunk.ChunkSampleStream;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoaderErrorThrower;
import com.google.common.collect.D3;
import com.google.common.collect.O2;
import com.google.common.collect.z3;
import com.google.common.primitives.l;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class DashMediaPeriod implements MediaPeriod, Callback, ReleaseCallback {
    static final class TrackGroupInfo {
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        @Target({ElementType.TYPE_USE})
        public @interface TrackGroupCategory {
        }

        public final int[] a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final O2 h;
        private static final int i = 0;
        private static final int j = 1;
        private static final int k = 2;

        private TrackGroupInfo(int v, int v1, int[] arr_v, int v2, int v3, int v4, int v5, O2 o20) {
            this.b = v;
            this.a = arr_v;
            this.c = v1;
            this.e = v2;
            this.f = v3;
            this.g = v4;
            this.d = v5;
            this.h = o20;
        }

        public static TrackGroupInfo a(int[] arr_v, int v, O2 o20) {
            return new TrackGroupInfo(3, 1, arr_v, v, -1, -1, -1, o20);
        }

        public static TrackGroupInfo b(int[] arr_v, int v) {
            return new TrackGroupInfo(5, 1, arr_v, v, -1, -1, -1, O2.A());
        }

        public static TrackGroupInfo c(int v) {
            return new TrackGroupInfo(5, 2, new int[0], -1, -1, -1, v, O2.A());
        }

        public static TrackGroupInfo d(int v, int[] arr_v, int v1, int v2, int v3) {
            return new TrackGroupInfo(v, 0, arr_v, v1, v2, v3, -1, O2.A());
        }
    }

    private static final Pattern A;
    final int a;
    private final Factory b;
    @Nullable
    private final TransferListener c;
    @Nullable
    private final CmcdConfiguration d;
    private final DrmSessionManager e;
    private final LoadErrorHandlingPolicy f;
    private final BaseUrlExclusionList g;
    private final long h;
    private final LoaderErrorThrower i;
    private final Allocator j;
    private final TrackGroupArray k;
    private final TrackGroupInfo[] l;
    private final CompositeSequenceableLoaderFactory m;
    private final PlayerEmsgHandler n;
    private final IdentityHashMap o;
    private final EventDispatcher p;
    private final androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher q;
    private final PlayerId r;
    @Nullable
    private androidx.media3.exoplayer.source.MediaPeriod.Callback s;
    private ChunkSampleStream[] t;
    private EventSampleStream[] u;
    private SequenceableLoader v;
    private DashManifest w;
    private int x;
    private List y;
    private static final Pattern z;

    static {
        DashMediaPeriod.z = Pattern.compile("CC([1-4])=(.+)");
        DashMediaPeriod.A = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    }

    public DashMediaPeriod(int v, DashManifest dashManifest0, BaseUrlExclusionList baseUrlExclusionList0, int v1, Factory dashChunkSource$Factory0, @Nullable TransferListener transferListener0, @Nullable CmcdConfiguration cmcdConfiguration0, DrmSessionManager drmSessionManager0, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher drmSessionEventListener$EventDispatcher0, LoadErrorHandlingPolicy loadErrorHandlingPolicy0, EventDispatcher mediaSourceEventListener$EventDispatcher0, long v2, LoaderErrorThrower loaderErrorThrower0, Allocator allocator0, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory0, PlayerEmsgCallback playerEmsgHandler$PlayerEmsgCallback0, PlayerId playerId0) {
        this.a = v;
        this.w = dashManifest0;
        this.g = baseUrlExclusionList0;
        this.x = v1;
        this.b = dashChunkSource$Factory0;
        this.c = transferListener0;
        this.d = cmcdConfiguration0;
        this.e = drmSessionManager0;
        this.q = drmSessionEventListener$EventDispatcher0;
        this.f = loadErrorHandlingPolicy0;
        this.p = mediaSourceEventListener$EventDispatcher0;
        this.h = v2;
        this.i = loaderErrorThrower0;
        this.j = allocator0;
        this.m = compositeSequenceableLoaderFactory0;
        this.r = playerId0;
        this.n = new PlayerEmsgHandler(dashManifest0, playerEmsgHandler$PlayerEmsgCallback0, allocator0);
        this.t = DashMediaPeriod.H(0);
        this.u = new EventSampleStream[0];
        this.o = new IdentityHashMap();
        this.v = compositeSequenceableLoaderFactory0.empty();
        Period period0 = dashManifest0.d(v1);
        this.y = period0.d;
        Pair pair0 = DashMediaPeriod.u(drmSessionManager0, dashChunkSource$Factory0, period0.c, period0.d);
        this.k = (TrackGroupArray)pair0.first;
        this.l = (TrackGroupInfo[])pair0.second;
    }

    private static int[][] A(List list0) {
        int v4;
        int v = list0.size();
        HashMap hashMap0 = D3.a0(v);
        ArrayList arrayList0 = new ArrayList(v);
        SparseArray sparseArray0 = new SparseArray(v);
        for(int v2 = 0; v2 < v; ++v2) {
            hashMap0.put(((AdaptationSet)list0.get(v2)).a, v2);
            ArrayList arrayList1 = new ArrayList();
            arrayList1.add(v2);
            arrayList0.add(arrayList1);
            sparseArray0.put(v2, arrayList1);
        }
        for(int v3 = 0; v3 < v; ++v3) {
            AdaptationSet adaptationSet0 = (AdaptationSet)list0.get(v3);
            Descriptor descriptor0 = DashMediaPeriod.y(adaptationSet0.e);
            if(descriptor0 == null) {
                descriptor0 = DashMediaPeriod.y(adaptationSet0.f);
            }
            if(descriptor0 == null) {
                v4 = v3;
            }
            else {
                Integer integer0 = (Integer)hashMap0.get(Long.parseLong(descriptor0.b));
                if(integer0 != null) {
                    v4 = (int)integer0;
                }
            }
            if(v4 == v3) {
                Descriptor descriptor1 = DashMediaPeriod.w(adaptationSet0.f);
                if(descriptor1 != null) {
                    String[] arr_s = Util.m2(descriptor1.b, ",");
                    for(int v5 = 0; v5 < arr_s.length; ++v5) {
                        Integer integer1 = (Integer)hashMap0.get(Long.parseLong(arr_s[v5]));
                        if(integer1 != null) {
                            v4 = Math.min(v4, ((int)integer1));
                        }
                    }
                }
            }
            if(v4 != v3) {
                List list1 = (List)sparseArray0.get(v3);
                List list2 = (List)sparseArray0.get(v4);
                list2.addAll(list1);
                sparseArray0.put(v3, list2);
                arrayList0.remove(list1);
            }
        }
        int v6 = arrayList0.size();
        int[][] arr2_v = new int[v6][];
        for(int v1 = 0; v1 < v6; ++v1) {
            int[] arr_v = l.D(((Collection)arrayList0.get(v1)));
            arr2_v[v1] = arr_v;
            Arrays.sort(arr_v);
        }
        return arr2_v;
    }

    private int B(int v, int[] arr_v) {
        int v1 = arr_v[v];
        if(v1 == -1) {
            return -1;
        }
        int v2 = this.l[v1].e;
        for(int v3 = 0; v3 < arr_v.length; ++v3) {
            int v4 = arr_v[v3];
            if(v4 == v2 && this.l[v4].c == 0) {
                return v3;
            }
        }
        return -1;
    }

    private int[] C(ExoTrackSelection[] arr_exoTrackSelection) {
        int[] arr_v = new int[arr_exoTrackSelection.length];
        for(int v = 0; v < arr_exoTrackSelection.length; ++v) {
            ExoTrackSelection exoTrackSelection0 = arr_exoTrackSelection[v];
            if(exoTrackSelection0 == null) {
                arr_v[v] = -1;
            }
            else {
                TrackGroup trackGroup0 = exoTrackSelection0.i();
                arr_v[v] = this.k.e(trackGroup0);
            }
        }
        return arr_v;
    }

    private static boolean D(List list0, int[] arr_v) {
        for(int v = 0; v < arr_v.length; ++v) {
            List list1 = ((AdaptationSet)list0.get(arr_v[v])).c;
            for(int v1 = 0; v1 < list1.size(); ++v1) {
                if(!((Representation)list1.get(v1)).f.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int E(int v, List list0, int[][] arr2_v, boolean[] arr_z, Format[][] arr2_format) {
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            if(DashMediaPeriod.D(list0, arr2_v[v1])) {
                arr_z[v1] = true;
                ++v2;
            }
            Format[] arr_format = DashMediaPeriod.z(list0, arr2_v[v1]);
            arr2_format[v1] = arr_format;
            if(arr_format.length != 0) {
                ++v2;
            }
        }
        return v2;
    }

    // 检测为 Lambda 实现
    private static List F(ChunkSampleStream chunkSampleStream0) [...]

    private static void G(Factory dashChunkSource$Factory0, Format[] arr_format) {
        for(int v = 0; v < arr_format.length; ++v) {
            arr_format[v] = dashChunkSource$Factory0.c(arr_format[v]);
        }
    }

    private static ChunkSampleStream[] H(int v) {
        return new ChunkSampleStream[v];
    }

    public void I(ChunkSampleStream chunkSampleStream0) {
        this.s.l(this);
    }

    private static Format[] J(Descriptor descriptor0, Pattern pattern0, Format format0) {
        String s = descriptor0.b;
        if(s == null) {
            return new Format[]{format0};
        }
        String[] arr_s = Util.m2(s, ";");
        Format[] arr_format = new Format[arr_s.length];
        for(int v = 0; v < arr_s.length; ++v) {
            Matcher matcher0 = pattern0.matcher(arr_s[v]);
            if(!matcher0.matches()) {
                return new Format[]{format0};
            }
            int v1 = Integer.parseInt(matcher0.group(1));
            arr_format[v] = format0.a().a0(format0.a + ":" + v1).L(v1).e0(matcher0.group(2)).K();
        }
        return arr_format;
    }

    public void K() {
        this.n.o();
        ChunkSampleStream[] arr_chunkSampleStream = this.t;
        for(int v = 0; v < arr_chunkSampleStream.length; ++v) {
            arr_chunkSampleStream[v].Q(this);
        }
        this.s = null;
    }

    private void L(ExoTrackSelection[] arr_exoTrackSelection, boolean[] arr_z, SampleStream[] arr_sampleStream) {
        for(int v = 0; v < arr_exoTrackSelection.length; ++v) {
            if(arr_exoTrackSelection[v] == null || !arr_z[v]) {
                SampleStream sampleStream0 = arr_sampleStream[v];
                if(sampleStream0 instanceof ChunkSampleStream) {
                    ((ChunkSampleStream)sampleStream0).Q(this);
                }
                else if(sampleStream0 instanceof EmbeddedSampleStream) {
                    ((EmbeddedSampleStream)sampleStream0).c();
                }
                arr_sampleStream[v] = null;
            }
        }
    }

    private void M(ExoTrackSelection[] arr_exoTrackSelection, SampleStream[] arr_sampleStream, int[] arr_v) {
        boolean z;
        for(int v = 0; v < arr_exoTrackSelection.length; ++v) {
            SampleStream sampleStream0 = arr_sampleStream[v];
            if(sampleStream0 instanceof EmptySampleStream || sampleStream0 instanceof EmbeddedSampleStream) {
                int v1 = this.B(v, arr_v);
                if(v1 == -1) {
                    z = arr_sampleStream[v] instanceof EmptySampleStream;
                }
                else {
                    SampleStream sampleStream1 = arr_sampleStream[v];
                    z = sampleStream1 instanceof EmbeddedSampleStream && ((EmbeddedSampleStream)sampleStream1).a == arr_sampleStream[v1];
                }
                if(!z) {
                    SampleStream sampleStream2 = arr_sampleStream[v];
                    if(sampleStream2 instanceof EmbeddedSampleStream) {
                        ((EmbeddedSampleStream)sampleStream2).c();
                    }
                    arr_sampleStream[v] = null;
                }
            }
        }
    }

    private void N(ExoTrackSelection[] arr_exoTrackSelection, SampleStream[] arr_sampleStream, boolean[] arr_z, long v, int[] arr_v) {
        for(int v2 = 0; v2 < arr_exoTrackSelection.length; ++v2) {
            ExoTrackSelection exoTrackSelection0 = arr_exoTrackSelection[v2];
            if(exoTrackSelection0 != null) {
                SampleStream sampleStream0 = arr_sampleStream[v2];
                if(sampleStream0 == null) {
                    arr_z[v2] = true;
                    TrackGroupInfo dashMediaPeriod$TrackGroupInfo0 = this.l[arr_v[v2]];
                    int v3 = dashMediaPeriod$TrackGroupInfo0.c;
                    if(v3 == 0) {
                        arr_sampleStream[v2] = this.r(dashMediaPeriod$TrackGroupInfo0, exoTrackSelection0, v);
                    }
                    else if(v3 == 2) {
                        arr_sampleStream[v2] = new EventSampleStream(((EventStream)this.y.get(dashMediaPeriod$TrackGroupInfo0.d)), exoTrackSelection0.i().c(0), this.w.d);
                    }
                }
                else if(sampleStream0 instanceof ChunkSampleStream) {
                    ((DashChunkSource)((ChunkSampleStream)sampleStream0).E()).f(exoTrackSelection0);
                }
            }
        }
        for(int v1 = 0; v1 < arr_exoTrackSelection.length; ++v1) {
            if(arr_sampleStream[v1] == null && arr_exoTrackSelection[v1] != null) {
                TrackGroupInfo dashMediaPeriod$TrackGroupInfo1 = this.l[arr_v[v1]];
                if(dashMediaPeriod$TrackGroupInfo1.c == 1) {
                    int v4 = this.B(v1, arr_v);
                    arr_sampleStream[v1] = v4 == -1 ? new EmptySampleStream() : ((ChunkSampleStream)arr_sampleStream[v4]).T(v, dashMediaPeriod$TrackGroupInfo1.b);
                }
            }
        }
    }

    public void O(DashManifest dashManifest0, int v) {
        this.w = dashManifest0;
        this.x = v;
        this.n.q(dashManifest0);
        ChunkSampleStream[] arr_chunkSampleStream = this.t;
        if(arr_chunkSampleStream != null) {
            for(int v1 = 0; v1 < arr_chunkSampleStream.length; ++v1) {
                ((DashChunkSource)arr_chunkSampleStream[v1].E()).h(dashManifest0, v);
            }
            this.s.l(this);
        }
        this.y = dashManifest0.d(v).d;
        EventSampleStream[] arr_eventSampleStream = this.u;
        for(int v2 = 0; v2 < arr_eventSampleStream.length; ++v2) {
            EventSampleStream eventSampleStream0 = arr_eventSampleStream[v2];
            for(Object object0: this.y) {
                EventStream eventStream0 = (EventStream)object0;
                if(eventStream0.a().equals(eventSampleStream0.a())) {
                    boolean z = true;
                    int v3 = dashManifest0.e() - 1;
                    if(!dashManifest0.d || v != v3) {
                        z = false;
                    }
                    eventSampleStream0.d(eventStream0, z);
                    break;
                }
                if(false) {
                    break;
                }
            }
        }
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public boolean a() {
        return this.v.a();
    }

    @Override  // androidx.media3.exoplayer.source.chunk.ChunkSampleStream$ReleaseCallback
    public void b(ChunkSampleStream chunkSampleStream0) {
        synchronized(this) {
            PlayerTrackEmsgHandler playerEmsgHandler$PlayerTrackEmsgHandler0 = (PlayerTrackEmsgHandler)this.o.remove(chunkSampleStream0);
            if(playerEmsgHandler$PlayerTrackEmsgHandler0 != null) {
                playerEmsgHandler$PlayerTrackEmsgHandler0.n();
            }
        }
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long c(long v, SeekParameters seekParameters0) {
        ChunkSampleStream[] arr_chunkSampleStream = this.t;
        for(int v1 = 0; v1 < arr_chunkSampleStream.length; ++v1) {
            ChunkSampleStream chunkSampleStream0 = arr_chunkSampleStream[v1];
            if(chunkSampleStream0.a == 2) {
                return chunkSampleStream0.c(v, seekParameters0);
            }
        }
        return v;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long d() {
        return this.v.d();
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void e(long v) {
        this.v.e(v);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public boolean f(LoadingInfo loadingInfo0) {
        return this.v.f(loadingInfo0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long g() {
        return this.v.g();
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public List i(List list0) {
        List list1 = this.w.d(this.x).c;
        List list2 = new ArrayList();
        for(Object object0: list0) {
            ExoTrackSelection exoTrackSelection0 = (ExoTrackSelection)object0;
            TrackGroup trackGroup0 = exoTrackSelection0.i();
            TrackGroupInfo dashMediaPeriod$TrackGroupInfo0 = this.l[this.k.e(trackGroup0)];
            if(dashMediaPeriod$TrackGroupInfo0.c == 0) {
                int[] arr_v = dashMediaPeriod$TrackGroupInfo0.a;
                int v = exoTrackSelection0.length();
                int[] arr_v1 = new int[v];
                for(int v2 = 0; v2 < exoTrackSelection0.length(); ++v2) {
                    arr_v1[v2] = exoTrackSelection0.e(v2);
                }
                Arrays.sort(arr_v1);
                int v3 = ((AdaptationSet)list1.get(arr_v[0])).c.size();
                int v4 = 0;
                int v5 = 0;
                for(int v1 = 0; v1 < v; ++v1) {
                    int v6 = arr_v1[v1];
                    while(true) {
                        int v7 = v5 + v3;
                        if(v6 < v7) {
                            break;
                        }
                        ++v4;
                        v3 = ((AdaptationSet)list1.get(arr_v[v4])).c.size();
                        v5 = v7;
                    }
                    list2.add(new StreamKey(this.x, arr_v[v4], v6 - v5));
                }
            }
        }
        return list2;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long j(long v) {
        ChunkSampleStream[] arr_chunkSampleStream = this.t;
        for(int v2 = 0; v2 < arr_chunkSampleStream.length; ++v2) {
            arr_chunkSampleStream[v2].S(v);
        }
        EventSampleStream[] arr_eventSampleStream = this.u;
        for(int v1 = 0; v1 < arr_eventSampleStream.length; ++v1) {
            arr_eventSampleStream[v1].c(v);
        }
        return v;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long k() {
        return 0x8000000000000001L;
    }

    @Override  // androidx.media3.exoplayer.source.SequenceableLoader$Callback
    public void l(SequenceableLoader sequenceableLoader0) {
        this.I(((ChunkSampleStream)sequenceableLoader0));
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray n() {
        return this.k;
    }

    private static void o(List list0, TrackGroup[] arr_trackGroup, TrackGroupInfo[] arr_dashMediaPeriod$TrackGroupInfo, int v) {
        int v1 = 0;
        while(v1 < list0.size()) {
            EventStream eventStream0 = (EventStream)list0.get(v1);
            arr_trackGroup[v] = new TrackGroup(eventStream0.a() + ":" + v1, new Format[]{new Builder().a0(eventStream0.a()).o0("application/x-emsg").K()});
            arr_dashMediaPeriod$TrackGroupInfo[v] = TrackGroupInfo.c(v1);
            ++v1;
            ++v;
        }
    }

    private static int p(DrmSessionManager drmSessionManager0, Factory dashChunkSource$Factory0, List list0, int[][] arr2_v, int v, boolean[] arr_z, Format[][] arr2_format, TrackGroup[] arr_trackGroup, TrackGroupInfo[] arr_dashMediaPeriod$TrackGroupInfo) {
        int v8;
        int v7;
        int v1 = 0;
        int v2;
        for(v2 = 0; v1 < v; v2 = v8) {
            int[] arr_v = arr2_v[v1];
            ArrayList arrayList0 = new ArrayList();
            for(int v3 = 0; v3 < arr_v.length; ++v3) {
                arrayList0.addAll(((AdaptationSet)list0.get(arr_v[v3])).c);
            }
            int v4 = arrayList0.size();
            Format[] arr_format = new Format[v4];
            for(int v5 = 0; v5 < v4; ++v5) {
                Format format0 = ((Representation)arrayList0.get(v5)).c;
                arr_format[v5] = format0.a().R(drmSessionManager0.a(format0)).K();
            }
            AdaptationSet adaptationSet0 = (AdaptationSet)list0.get(arr_v[0]);
            String s = adaptationSet0.a == -1L ? "unset:" + v1 : Long.toString(adaptationSet0.a);
            int v6 = v2 + 1;
            if(arr_z[v1]) {
                v7 = v2 + 2;
            }
            else {
                v7 = v6;
                v6 = -1;
            }
            if(arr2_format[v1].length == 0) {
                v8 = v7;
                v7 = -1;
            }
            else {
                v8 = v7 + 1;
            }
            DashMediaPeriod.G(dashChunkSource$Factory0, arr_format);
            arr_trackGroup[v2] = new TrackGroup(s, arr_format);
            arr_dashMediaPeriod$TrackGroupInfo[v2] = TrackGroupInfo.d(adaptationSet0.b, arr_v, v2, v6, v7);
            if(v6 != -1) {
                arr_trackGroup[v6] = new TrackGroup(s + ":emsg", new Format[]{new Builder().a0(s + ":emsg").o0("application/x-emsg").K()});
                arr_dashMediaPeriod$TrackGroupInfo[v6] = TrackGroupInfo.b(arr_v, v2);
            }
            if(v7 != -1) {
                arr_dashMediaPeriod$TrackGroupInfo[v7] = TrackGroupInfo.a(arr_v, v2, O2.x(arr2_format[v1]));
                DashMediaPeriod.G(dashChunkSource$Factory0, arr2_format[v1]);
                arr_trackGroup[v7] = new TrackGroup(s + ":cc", arr2_format[v1]);
            }
            ++v1;
        }
        return v2;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long q(ExoTrackSelection[] arr_exoTrackSelection, boolean[] arr_z, SampleStream[] arr_sampleStream, boolean[] arr_z1, long v) {
        int[] arr_v = this.C(arr_exoTrackSelection);
        this.L(arr_exoTrackSelection, arr_z, arr_sampleStream);
        this.M(arr_exoTrackSelection, arr_sampleStream, arr_v);
        this.N(arr_exoTrackSelection, arr_sampleStream, arr_z1, v, arr_v);
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(int v1 = 0; v1 < arr_sampleStream.length; ++v1) {
            SampleStream sampleStream0 = arr_sampleStream[v1];
            if(sampleStream0 instanceof ChunkSampleStream) {
                arrayList0.add(((ChunkSampleStream)sampleStream0));
            }
            else if(sampleStream0 instanceof EventSampleStream) {
                arrayList1.add(((EventSampleStream)sampleStream0));
            }
        }
        ChunkSampleStream[] arr_chunkSampleStream = DashMediaPeriod.H(arrayList0.size());
        this.t = arr_chunkSampleStream;
        arrayList0.toArray(arr_chunkSampleStream);
        EventSampleStream[] arr_eventSampleStream = new EventSampleStream[arrayList1.size()];
        this.u = arr_eventSampleStream;
        arrayList1.toArray(arr_eventSampleStream);
        List list0 = z3.D(arrayList0, (ChunkSampleStream chunkSampleStream0) -> O2.B(chunkSampleStream0.a));
        this.v = this.m.b(arrayList0, list0);
        return v;
    }

    private ChunkSampleStream r(TrackGroupInfo dashMediaPeriod$TrackGroupInfo0, ExoTrackSelection exoTrackSelection0, long v) {
        int v5;
        int v3;
        TrackGroup trackGroup0;
        int v1 = dashMediaPeriod$TrackGroupInfo0.f;
        PlayerTrackEmsgHandler playerEmsgHandler$PlayerTrackEmsgHandler0 = null;
        if(v1 == -1) {
            trackGroup0 = null;
            v3 = 0;
        }
        else {
            trackGroup0 = this.k.c(v1);
            v3 = 1;
        }
        O2 o20 = dashMediaPeriod$TrackGroupInfo0.g == -1 ? O2.A() : this.l[dashMediaPeriod$TrackGroupInfo0.g].h;
        int v4 = v3 + o20.size();
        Format[] arr_format = new Format[v4];
        int[] arr_v = new int[v4];
        if(v1 == -1) {
            v5 = 0;
        }
        else {
            arr_format[0] = trackGroup0.c(0);
            arr_v[0] = 5;
            v5 = 1;
        }
        ArrayList arrayList0 = new ArrayList();
        for(int v2 = 0; v2 < o20.size(); ++v2) {
            Format format0 = (Format)o20.get(v2);
            arr_format[v5] = format0;
            arr_v[v5] = 3;
            arrayList0.add(format0);
            ++v5;
        }
        if(this.w.d && v1 != -1) {
            playerEmsgHandler$PlayerTrackEmsgHandler0 = this.n.k();
        }
        DashChunkSource dashChunkSource0 = this.b.d(this.i, this.w, this.g, this.x, dashMediaPeriod$TrackGroupInfo0.a, exoTrackSelection0, dashMediaPeriod$TrackGroupInfo0.b, this.h, v1 != -1, arrayList0, playerEmsgHandler$PlayerTrackEmsgHandler0, this.c, this.r, this.d);
        ChunkSampleStream chunkSampleStream0 = new ChunkSampleStream(dashMediaPeriod$TrackGroupInfo0.b, arr_v, arr_format, dashChunkSource0, this, this.j, v, this.e, this.q, this.f, this.p);
        synchronized(this) {
            this.o.put(chunkSampleStream0, playerEmsgHandler$PlayerTrackEmsgHandler0);
            return chunkSampleStream0;
        }
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void s() throws IOException {
        this.i.b();
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void t(androidx.media3.exoplayer.source.MediaPeriod.Callback mediaPeriod$Callback0, long v) {
        this.s = mediaPeriod$Callback0;
        mediaPeriod$Callback0.h(this);
    }

    private static Pair u(DrmSessionManager drmSessionManager0, Factory dashChunkSource$Factory0, List list0, List list1) {
        int[][] arr2_v = DashMediaPeriod.A(list0);
        boolean[] arr_z = new boolean[arr2_v.length];
        Format[][] arr2_format = new Format[arr2_v.length][];
        int v = DashMediaPeriod.E(arr2_v.length, list0, arr2_v, arr_z, arr2_format) + arr2_v.length + list1.size();
        TrackGroup[] arr_trackGroup = new TrackGroup[v];
        TrackGroupInfo[] arr_dashMediaPeriod$TrackGroupInfo = new TrackGroupInfo[v];
        DashMediaPeriod.o(list1, arr_trackGroup, arr_dashMediaPeriod$TrackGroupInfo, DashMediaPeriod.p(drmSessionManager0, dashChunkSource$Factory0, list0, arr2_v, arr2_v.length, arr_z, arr2_format, arr_trackGroup, arr_dashMediaPeriod$TrackGroupInfo));
        return Pair.create(new TrackGroupArray(arr_trackGroup), arr_dashMediaPeriod$TrackGroupInfo);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void v(long v, boolean z) {
        ChunkSampleStream[] arr_chunkSampleStream = this.t;
        for(int v1 = 0; v1 < arr_chunkSampleStream.length; ++v1) {
            arr_chunkSampleStream[v1].v(v, z);
        }
    }

    @Nullable
    private static Descriptor w(List list0) {
        return DashMediaPeriod.x(list0, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    @Nullable
    private static Descriptor x(List list0, String s) {
        for(int v = 0; v < list0.size(); ++v) {
            Descriptor descriptor0 = (Descriptor)list0.get(v);
            if(s.equals(descriptor0.a)) {
                return descriptor0;
            }
        }
        return null;
    }

    @Nullable
    private static Descriptor y(List list0) {
        return DashMediaPeriod.x(list0, "http://dashif.org/guidelines/trickmode");
    }

    private static Format[] z(List list0, int[] arr_v) {
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            AdaptationSet adaptationSet0 = (AdaptationSet)list0.get(v1);
            List list1 = ((AdaptationSet)list0.get(v1)).d;
            for(int v2 = 0; v2 < list1.size(); ++v2) {
                Descriptor descriptor0 = (Descriptor)list1.get(v2);
                if("urn:scte:dash:cc:cea-608:2015".equals(descriptor0.a)) {
                    Format format0 = new Builder().o0("application/cea-608").a0(adaptationSet0.a + ":cea608").K();
                    return DashMediaPeriod.J(descriptor0, DashMediaPeriod.z, format0);
                }
                if("urn:scte:dash:cc:cea-708:2015".equals(descriptor0.a)) {
                    Format format1 = new Builder().o0("application/cea-708").a0(adaptationSet0.a + ":cea708").K();
                    return DashMediaPeriod.J(descriptor0, DashMediaPeriod.A, format1);
                }
            }
        }
        return new Format[0];
    }
}

