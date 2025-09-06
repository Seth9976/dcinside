package androidx.media3.common;

import O1.a;
import O1.g;
import android.graphics.Rect;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.O2;
import com.google.common.util.concurrent.t0;
import h4.d;
import h4.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

@UnstableApi
public abstract class SimpleBasePlayer extends BasePlayer {
    public static final class MediaItemData {
        public static final class Builder {
            private Object a;
            private Tracks b;
            private MediaItem c;
            @Nullable
            private MediaMetadata d;
            @Nullable
            private Object e;
            @Nullable
            private LiveConfiguration f;
            private long g;
            private long h;
            private long i;
            private boolean j;
            private boolean k;
            private long l;
            private long m;
            private long n;
            private boolean o;
            private O2 p;

            private Builder(MediaItemData simpleBasePlayer$MediaItemData0) {
                this.a = simpleBasePlayer$MediaItemData0.a;
                this.b = simpleBasePlayer$MediaItemData0.b;
                this.c = simpleBasePlayer$MediaItemData0.c;
                this.d = simpleBasePlayer$MediaItemData0.d;
                this.e = simpleBasePlayer$MediaItemData0.e;
                this.f = simpleBasePlayer$MediaItemData0.f;
                this.g = simpleBasePlayer$MediaItemData0.g;
                this.h = simpleBasePlayer$MediaItemData0.h;
                this.i = simpleBasePlayer$MediaItemData0.i;
                this.j = simpleBasePlayer$MediaItemData0.j;
                this.k = simpleBasePlayer$MediaItemData0.k;
                this.l = simpleBasePlayer$MediaItemData0.l;
                this.m = simpleBasePlayer$MediaItemData0.m;
                this.n = simpleBasePlayer$MediaItemData0.n;
                this.o = simpleBasePlayer$MediaItemData0.o;
                this.p = simpleBasePlayer$MediaItemData0.p;
            }

            Builder(MediaItemData simpleBasePlayer$MediaItemData0, androidx.media3.common.SimpleBasePlayer.1 simpleBasePlayer$10) {
                this(simpleBasePlayer$MediaItemData0);
            }

            public Builder(Object object0) {
                this.a = object0;
                this.b = Tracks.b;
                this.c = MediaItem.j;
                this.d = null;
                this.e = null;
                this.f = null;
                this.g = 0x8000000000000001L;
                this.h = 0x8000000000000001L;
                this.i = 0x8000000000000001L;
                this.j = false;
                this.k = false;
                this.l = 0L;
                this.m = 0x8000000000000001L;
                this.n = 0L;
                this.o = false;
                this.p = O2.A();
            }

            @a
            public Builder A(@Nullable MediaMetadata mediaMetadata0) {
                this.d = mediaMetadata0;
                return this;
            }

            @a
            public Builder B(List list0) {
                int v = list0.size();
                for(int v1 = 0; v1 < v - 1; ++v1) {
                    Assertions.b(((PeriodData)list0.get(v1)).b != 0x8000000000000001L, "Periods other than last need a duration");
                    for(int v2 = v1 + 1; v2 < v; ++v2) {
                        Assertions.b(!((PeriodData)list0.get(v1)).a.equals(((PeriodData)list0.get(v2)).a), "Duplicate PeriodData UIDs in period list");
                    }
                }
                this.p = O2.r(list0);
                return this;
            }

            @a
            public Builder C(long v) {
                Assertions.a(v >= 0L);
                this.n = v;
                return this;
            }

            @a
            public Builder D(long v) {
                this.g = v;
                return this;
            }

            @a
            public Builder E(Tracks tracks0) {
                this.b = tracks0;
                return this;
            }

            @a
            public Builder F(Object object0) {
                this.a = object0;
                return this;
            }

            @a
            public Builder G(long v) {
                this.h = v;
                return this;
            }

            public MediaItemData q() {
                return new MediaItemData(this, null);
            }

            @a
            public Builder r(long v) {
                Assertions.a(v >= 0L);
                this.l = v;
                return this;
            }

            @a
            public Builder s(long v) {
                Assertions.a(v == 0x8000000000000001L || v >= 0L);
                this.m = v;
                return this;
            }

            @a
            public Builder t(long v) {
                this.i = v;
                return this;
            }

            @a
            public Builder u(boolean z) {
                this.k = z;
                return this;
            }

            @a
            public Builder v(boolean z) {
                this.o = z;
                return this;
            }

            @a
            public Builder w(boolean z) {
                this.j = z;
                return this;
            }

            @a
            public Builder x(@Nullable LiveConfiguration mediaItem$LiveConfiguration0) {
                this.f = mediaItem$LiveConfiguration0;
                return this;
            }

            @a
            public Builder y(@Nullable Object object0) {
                this.e = object0;
                return this;
            }

            @a
            public Builder z(MediaItem mediaItem0) {
                this.c = mediaItem0;
                return this;
            }
        }

        public final Object a;
        public final Tracks b;
        public final MediaItem c;
        @Nullable
        public final MediaMetadata d;
        @Nullable
        public final Object e;
        @Nullable
        public final LiveConfiguration f;
        public final long g;
        public final long h;
        public final long i;
        public final boolean j;
        public final boolean k;
        public final long l;
        public final long m;
        public final long n;
        public final boolean o;
        public final O2 p;
        private final long[] q;
        private final MediaMetadata r;

        private MediaItemData(Builder simpleBasePlayer$MediaItemData$Builder0) {
            if(simpleBasePlayer$MediaItemData$Builder0.f == null) {
                Assertions.b(simpleBasePlayer$MediaItemData$Builder0.g == 0x8000000000000001L, "presentationStartTimeMs can only be set if liveConfiguration != null");
                Assertions.b(simpleBasePlayer$MediaItemData$Builder0.h == 0x8000000000000001L, "windowStartTimeMs can only be set if liveConfiguration != null");
                Assertions.b(simpleBasePlayer$MediaItemData$Builder0.i == 0x8000000000000001L, "elapsedRealtimeEpochOffsetMs can only be set if liveConfiguration != null");
            }
            else if(simpleBasePlayer$MediaItemData$Builder0.g != 0x8000000000000001L && simpleBasePlayer$MediaItemData$Builder0.h != 0x8000000000000001L) {
                Assertions.b(simpleBasePlayer$MediaItemData$Builder0.h >= simpleBasePlayer$MediaItemData$Builder0.g, "windowStartTimeMs can\'t be less than presentationStartTimeMs");
            }
            int v1 = simpleBasePlayer$MediaItemData$Builder0.p.size();
            if(simpleBasePlayer$MediaItemData$Builder0.m != 0x8000000000000001L) {
                Assertions.b(simpleBasePlayer$MediaItemData$Builder0.l <= simpleBasePlayer$MediaItemData$Builder0.m, "defaultPositionUs can\'t be greater than durationUs");
            }
            this.a = simpleBasePlayer$MediaItemData$Builder0.a;
            this.b = simpleBasePlayer$MediaItemData$Builder0.b;
            this.c = simpleBasePlayer$MediaItemData$Builder0.c;
            this.d = simpleBasePlayer$MediaItemData$Builder0.d;
            this.e = simpleBasePlayer$MediaItemData$Builder0.e;
            this.f = simpleBasePlayer$MediaItemData$Builder0.f;
            this.g = simpleBasePlayer$MediaItemData$Builder0.g;
            this.h = simpleBasePlayer$MediaItemData$Builder0.h;
            this.i = simpleBasePlayer$MediaItemData$Builder0.i;
            this.j = simpleBasePlayer$MediaItemData$Builder0.j;
            this.k = simpleBasePlayer$MediaItemData$Builder0.k;
            this.l = simpleBasePlayer$MediaItemData$Builder0.l;
            this.m = simpleBasePlayer$MediaItemData$Builder0.m;
            long v2 = simpleBasePlayer$MediaItemData$Builder0.n;
            this.n = v2;
            this.o = simpleBasePlayer$MediaItemData$Builder0.o;
            O2 o20 = simpleBasePlayer$MediaItemData$Builder0.p;
            this.p = o20;
            long[] arr_v = new long[o20.size()];
            this.q = arr_v;
            if(!o20.isEmpty()) {
                arr_v[0] = -v2;
                for(int v = 0; v < v1 - 1; ++v) {
                    this.q[v + 1] = this.q[v] + ((PeriodData)this.p.get(v)).b;
                }
            }
            this.r = this.d == null ? MediaItemData.f(this.c, this.b) : this.d;
        }

        MediaItemData(Builder simpleBasePlayer$MediaItemData$Builder0, androidx.media3.common.SimpleBasePlayer.1 simpleBasePlayer$10) {
            this(simpleBasePlayer$MediaItemData$Builder0);
        }

        public Builder e() {
            return new Builder(this, null);
        }

        // 去混淆评级： 低(26)
        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof MediaItemData ? this.a.equals(((MediaItemData)object0).a) && this.b.equals(((MediaItemData)object0).b) && this.c.equals(((MediaItemData)object0).c) && Util.g(this.d, ((MediaItemData)object0).d) && Util.g(this.e, ((MediaItemData)object0).e) && Util.g(this.f, ((MediaItemData)object0).f) && this.g == ((MediaItemData)object0).g && this.h == ((MediaItemData)object0).h && this.i == ((MediaItemData)object0).i && this.j == ((MediaItemData)object0).j && this.k == ((MediaItemData)object0).k && this.l == ((MediaItemData)object0).l && this.m == ((MediaItemData)object0).m && this.n == ((MediaItemData)object0).n && this.o == ((MediaItemData)object0).o && this.p.equals(((MediaItemData)object0).p) : false;
        }

        private static MediaMetadata f(MediaItem mediaItem0, Tracks tracks0) {
            androidx.media3.common.MediaMetadata.Builder mediaMetadata$Builder0 = new androidx.media3.common.MediaMetadata.Builder();
            int v = tracks0.c().size();
            for(int v1 = 0; v1 < v; ++v1) {
                Group tracks$Group0 = (Group)tracks0.c().get(v1);
                for(int v2 = 0; v2 < tracks$Group0.a; ++v2) {
                    if(tracks$Group0.k(v2)) {
                        Format format0 = tracks$Group0.d(v2);
                        if(format0.k != null) {
                            for(int v3 = 0; v3 < format0.k.f(); ++v3) {
                                format0.k.e(v3).r3(mediaMetadata$Builder0);
                            }
                        }
                    }
                }
            }
            return mediaMetadata$Builder0.K(mediaItem0.e).I();
        }

        private Period g(int v, int v1, Period timeline$Period0) {
            if(this.p.isEmpty()) {
                timeline$Period0.x(this.a, this.a, v, this.n + this.m, 0L, AdPlaybackState.l, this.o);
                return timeline$Period0;
            }
            PeriodData simpleBasePlayer$PeriodData0 = (PeriodData)this.p.get(v1);
            Pair pair0 = Pair.create(this.a, simpleBasePlayer$PeriodData0.a);
            timeline$Period0.x(simpleBasePlayer$PeriodData0.a, pair0, v, simpleBasePlayer$PeriodData0.b, this.q[v1], simpleBasePlayer$PeriodData0.c, simpleBasePlayer$PeriodData0.d);
            return timeline$Period0;
        }

        private Object h(int v) {
            if(this.p.isEmpty()) {
                return this.a;
            }
            Object object0 = ((PeriodData)this.p.get(v)).a;
            return Pair.create(this.a, object0);
        }

        @Override
        public int hashCode() {
            int v = this.a.hashCode();
            int v1 = this.b.hashCode();
            int v2 = this.c.hashCode();
            int v3 = 0;
            int v4 = this.d == null ? 0 : this.d.hashCode();
            int v5 = this.e == null ? 0 : this.e.hashCode();
            LiveConfiguration mediaItem$LiveConfiguration0 = this.f;
            if(mediaItem$LiveConfiguration0 != null) {
                v3 = mediaItem$LiveConfiguration0.hashCode();
            }
            return (((((((((((((((v + 0xD9) * 0x1F + v1) * 0x1F + v2) * 0x1F + v4) * 0x1F + v5) * 0x1F + v3) * 0x1F + ((int)(this.g ^ this.g >>> 0x20))) * 0x1F + ((int)(this.h ^ this.h >>> 0x20))) * 0x1F + ((int)(this.i ^ this.i >>> 0x20))) * 0x1F + this.j) * 0x1F + this.k) * 0x1F + ((int)(this.l ^ this.l >>> 0x20))) * 0x1F + ((int)(this.m ^ this.m >>> 0x20))) * 0x1F + ((int)(this.n ^ this.n >>> 0x20))) * 0x1F + this.o) * 0x1F + this.p.hashCode();
        }

        private Window i(int v, Window timeline$Window0) {
            timeline$Window0.j(this.a, this.c, this.e, this.g, this.h, this.i, this.j, this.k, this.f, this.l, this.m, v, v + (this.p.isEmpty() ? 1 : this.p.size()) - 1, this.n);
            timeline$Window0.k = this.o;
            return timeline$Window0;
        }
    }

    public static final class PeriodData {
        public static final class androidx.media3.common.SimpleBasePlayer.PeriodData.Builder {
            private Object a;
            private long b;
            private AdPlaybackState c;
            private boolean d;

            private androidx.media3.common.SimpleBasePlayer.PeriodData.Builder(PeriodData simpleBasePlayer$PeriodData0) {
                this.a = simpleBasePlayer$PeriodData0.a;
                this.b = simpleBasePlayer$PeriodData0.b;
                this.c = simpleBasePlayer$PeriodData0.c;
                this.d = simpleBasePlayer$PeriodData0.d;
            }

            androidx.media3.common.SimpleBasePlayer.PeriodData.Builder(PeriodData simpleBasePlayer$PeriodData0, androidx.media3.common.SimpleBasePlayer.1 simpleBasePlayer$10) {
                this(simpleBasePlayer$PeriodData0);
            }

            public androidx.media3.common.SimpleBasePlayer.PeriodData.Builder(Object object0) {
                this.a = object0;
                this.b = 0L;
                this.c = AdPlaybackState.l;
                this.d = false;
            }

            public PeriodData e() {
                return new PeriodData(this, null);
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.PeriodData.Builder f(AdPlaybackState adPlaybackState0) {
                this.c = adPlaybackState0;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.PeriodData.Builder g(long v) {
                Assertions.a(v == 0x8000000000000001L || v >= 0L);
                this.b = v;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.PeriodData.Builder h(boolean z) {
                this.d = z;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.PeriodData.Builder i(Object object0) {
                this.a = object0;
                return this;
            }
        }

        public final Object a;
        public final long b;
        public final AdPlaybackState c;
        public final boolean d;

        private PeriodData(androidx.media3.common.SimpleBasePlayer.PeriodData.Builder simpleBasePlayer$PeriodData$Builder0) {
            this.a = simpleBasePlayer$PeriodData$Builder0.a;
            this.b = simpleBasePlayer$PeriodData$Builder0.b;
            this.c = simpleBasePlayer$PeriodData$Builder0.c;
            this.d = simpleBasePlayer$PeriodData$Builder0.d;
        }

        PeriodData(androidx.media3.common.SimpleBasePlayer.PeriodData.Builder simpleBasePlayer$PeriodData$Builder0, androidx.media3.common.SimpleBasePlayer.1 simpleBasePlayer$10) {
            this(simpleBasePlayer$PeriodData$Builder0);
        }

        public androidx.media3.common.SimpleBasePlayer.PeriodData.Builder a() {
            return new androidx.media3.common.SimpleBasePlayer.PeriodData.Builder(this, null);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof PeriodData ? this.a.equals(((PeriodData)object0).a) && this.b == ((PeriodData)object0).b && this.c.equals(((PeriodData)object0).c) && this.d == ((PeriodData)object0).d : false;
        }

        @Override
        public int hashCode() {
            return (((this.a.hashCode() + 0xD9) * 0x1F + ((int)(this.b ^ this.b >>> 0x20))) * 0x1F + this.c.hashCode()) * 0x1F + this.d;
        }
    }

    static final class PlaceholderUid {
        private PlaceholderUid() {
        }

        PlaceholderUid(androidx.media3.common.SimpleBasePlayer.1 simpleBasePlayer$10) {
        }
    }

    static final class PlaylistTimeline extends Timeline {
        private final O2 e;
        private final int[] f;
        private final int[] g;
        private final HashMap h;

        public PlaylistTimeline(O2 o20) {
            int v = o20.size();
            this.e = o20;
            this.f = new int[v];
            int v2 = 0;
            for(int v1 = 0; v1 < v; ++v1) {
                MediaItemData simpleBasePlayer$MediaItemData0 = (MediaItemData)o20.get(v1);
                this.f[v1] = v2;
                v2 += PlaylistTimeline.z(simpleBasePlayer$MediaItemData0);
            }
            this.g = new int[v2];
            this.h = new HashMap();
            int v4 = 0;
            for(int v3 = 0; v3 < v; ++v3) {
                MediaItemData simpleBasePlayer$MediaItemData1 = (MediaItemData)o20.get(v3);
                for(int v5 = 0; v5 < PlaylistTimeline.z(simpleBasePlayer$MediaItemData1); ++v5) {
                    Object object0 = simpleBasePlayer$MediaItemData1.h(v5);
                    this.h.put(object0, v4);
                    this.g[v4] = v3;
                    ++v4;
                }
            }
        }

        @Override  // androidx.media3.common.Timeline
        public int e(boolean z) {
            return super.e(z);
        }

        @Override  // androidx.media3.common.Timeline
        public int f(Object object0) {
            Integer integer0 = (Integer)this.h.get(object0);
            return integer0 == null ? -1 : ((int)integer0);
        }

        @Override  // androidx.media3.common.Timeline
        public int g(boolean z) {
            return super.g(z);
        }

        @Override  // androidx.media3.common.Timeline
        public int i(int v, int v1, boolean z) {
            return super.i(v, v1, z);
        }

        @Override  // androidx.media3.common.Timeline
        public Period k(int v, Period timeline$Period0, boolean z) {
            int v1 = this.g[v];
            int v2 = v - this.f[v1];
            return ((MediaItemData)this.e.get(v1)).g(v1, v2, timeline$Period0);
        }

        @Override  // androidx.media3.common.Timeline
        public Period l(Object object0, Period timeline$Period0) {
            return this.k(((int)(((Integer)Assertions.g(((Integer)this.h.get(object0)))))), timeline$Period0, true);
        }

        @Override  // androidx.media3.common.Timeline
        public int m() {
            return this.g.length;
        }

        @Override  // androidx.media3.common.Timeline
        public int r(int v, int v1, boolean z) {
            return super.r(v, v1, z);
        }

        @Override  // androidx.media3.common.Timeline
        public Object s(int v) {
            int v1 = this.g[v];
            int v2 = v - this.f[v1];
            return ((MediaItemData)this.e.get(v1)).h(v2);
        }

        @Override  // androidx.media3.common.Timeline
        public Window u(int v, Window timeline$Window0, long v1) {
            return ((MediaItemData)this.e.get(v)).i(this.f[v], timeline$Window0);
        }

        @Override  // androidx.media3.common.Timeline
        public int v() {
            return this.e.size();
        }

        // 去混淆评级： 低(20)
        private static int z(MediaItemData simpleBasePlayer$MediaItemData0) {
            return simpleBasePlayer$MediaItemData0.p.isEmpty() ? 1 : simpleBasePlayer$MediaItemData0.p.size();
        }
    }

    public interface PositionSupplier {
        public static final PositionSupplier a;

        static {
            PositionSupplier.a = G0.a(0L);
        }

        long get();
    }

    public static final class State {
        public static final class androidx.media3.common.SimpleBasePlayer.State.Builder {
            private MediaMetadata A;
            private int B;
            private int C;
            private int D;
            @Nullable
            private Long E;
            private PositionSupplier F;
            @Nullable
            private Long G;
            private PositionSupplier H;
            private PositionSupplier I;
            private PositionSupplier J;
            private PositionSupplier K;
            private boolean L;
            private int M;
            private long N;
            private Commands a;
            private boolean b;
            private int c;
            private int d;
            private int e;
            @Nullable
            private PlaybackException f;
            private int g;
            private boolean h;
            private boolean i;
            private long j;
            private long k;
            private long l;
            private PlaybackParameters m;
            private TrackSelectionParameters n;
            private AudioAttributes o;
            private float p;
            private VideoSize q;
            private CueGroup r;
            private DeviceInfo s;
            private int t;
            private boolean u;
            private Size v;
            private boolean w;
            private Metadata x;
            private O2 y;
            private Timeline z;

            public androidx.media3.common.SimpleBasePlayer.State.Builder() {
                this.a = Commands.b;
                this.b = false;
                this.c = 1;
                this.d = 1;
                this.e = 0;
                this.f = null;
                this.g = 0;
                this.h = false;
                this.i = false;
                this.j = 5000L;
                this.k = 15000L;
                this.l = 3000L;
                this.m = PlaybackParameters.d;
                this.n = TrackSelectionParameters.C;
                this.o = AudioAttributes.g;
                this.p = 1.0f;
                this.q = VideoSize.i;
                this.r = CueGroup.c;
                this.s = DeviceInfo.g;
                this.t = 0;
                this.u = false;
                this.v = Size.c;
                this.w = false;
                this.x = new Metadata(0x8000000000000001L, new Entry[0]);
                this.y = O2.A();
                this.z = Timeline.a;
                this.A = MediaMetadata.W0;
                this.B = -1;
                this.C = -1;
                this.D = -1;
                this.E = null;
                this.F = G0.a(0x8000000000000001L);
                this.G = null;
                this.H = PositionSupplier.a;
                this.I = G0.a(0x8000000000000001L);
                this.J = PositionSupplier.a;
                this.K = PositionSupplier.a;
                this.L = false;
                this.M = 5;
                this.N = 0L;
            }

            private androidx.media3.common.SimpleBasePlayer.State.Builder(State simpleBasePlayer$State0) {
                this.a = simpleBasePlayer$State0.a;
                this.b = simpleBasePlayer$State0.b;
                this.c = simpleBasePlayer$State0.c;
                this.d = simpleBasePlayer$State0.d;
                this.e = simpleBasePlayer$State0.e;
                this.f = simpleBasePlayer$State0.f;
                this.g = simpleBasePlayer$State0.g;
                this.h = simpleBasePlayer$State0.h;
                this.i = simpleBasePlayer$State0.i;
                this.j = simpleBasePlayer$State0.j;
                this.k = simpleBasePlayer$State0.k;
                this.l = simpleBasePlayer$State0.l;
                this.m = simpleBasePlayer$State0.m;
                this.n = simpleBasePlayer$State0.n;
                this.o = simpleBasePlayer$State0.o;
                this.p = simpleBasePlayer$State0.p;
                this.q = simpleBasePlayer$State0.q;
                this.r = simpleBasePlayer$State0.r;
                this.s = simpleBasePlayer$State0.s;
                this.t = simpleBasePlayer$State0.t;
                this.u = simpleBasePlayer$State0.u;
                this.v = simpleBasePlayer$State0.v;
                this.w = simpleBasePlayer$State0.w;
                this.x = simpleBasePlayer$State0.x;
                this.y = simpleBasePlayer$State0.y;
                this.z = simpleBasePlayer$State0.z;
                this.A = simpleBasePlayer$State0.A;
                this.B = simpleBasePlayer$State0.B;
                this.C = simpleBasePlayer$State0.C;
                this.D = simpleBasePlayer$State0.D;
                this.E = null;
                this.F = simpleBasePlayer$State0.E;
                this.G = null;
                this.H = simpleBasePlayer$State0.F;
                this.I = simpleBasePlayer$State0.G;
                this.J = simpleBasePlayer$State0.H;
                this.K = simpleBasePlayer$State0.I;
                this.L = simpleBasePlayer$State0.J;
                this.M = simpleBasePlayer$State0.K;
                this.N = simpleBasePlayer$State0.L;
            }

            androidx.media3.common.SimpleBasePlayer.State.Builder(State simpleBasePlayer$State0, androidx.media3.common.SimpleBasePlayer.1 simpleBasePlayer$10) {
                this(simpleBasePlayer$State0);
            }

            public State O() {
                return new State(this, null);
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder P() {
                this.L = false;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder Q(PositionSupplier simpleBasePlayer$PositionSupplier0) {
                this.J = simpleBasePlayer$PositionSupplier0;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder R(long v) {
                this.G = v;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder S(PositionSupplier simpleBasePlayer$PositionSupplier0) {
                this.G = null;
                this.H = simpleBasePlayer$PositionSupplier0;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder T(AudioAttributes audioAttributes0) {
                this.o = audioAttributes0;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder U(Commands player$Commands0) {
                this.a = player$Commands0;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder V(PositionSupplier simpleBasePlayer$PositionSupplier0) {
                this.I = simpleBasePlayer$PositionSupplier0;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder W(long v) {
                this.E = v;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder X(PositionSupplier simpleBasePlayer$PositionSupplier0) {
                this.E = null;
                this.F = simpleBasePlayer$PositionSupplier0;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder Y(int v, int v1) {
                Assertions.a((v == -1 ? 1 : 0) == (v1 == -1 ? 1 : 0));
                this.C = v;
                this.D = v1;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder Z(CueGroup cueGroup0) {
                this.r = cueGroup0;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder a0(int v) {
                this.B = v;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder b0(DeviceInfo deviceInfo0) {
                this.s = deviceInfo0;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder c0(@IntRange(from = 0L) int v) {
                Assertions.a(v >= 0);
                this.t = v;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder d0(boolean z) {
                this.u = z;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder e0(boolean z) {
                this.i = z;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder f0(long v) {
                this.l = v;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder g0(boolean z) {
                this.w = z;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder h0(boolean z, int v) {
                this.b = z;
                this.c = v;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder i0(PlaybackParameters playbackParameters0) {
                this.m = playbackParameters0;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder j0(int v) {
                this.d = v;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder k0(int v) {
                this.e = v;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder l0(@Nullable PlaybackException playbackException0) {
                this.f = playbackException0;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder m0(List list0) {
                HashSet hashSet0 = new HashSet();
                for(int v = 0; v < list0.size(); ++v) {
                    Assertions.b(hashSet0.add(((MediaItemData)list0.get(v)).a), "Duplicate MediaItemData UID in playlist");
                }
                this.y = O2.r(list0);
                this.z = new PlaylistTimeline(this.y);
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder n0(MediaMetadata mediaMetadata0) {
                this.A = mediaMetadata0;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder o0(int v, long v1) {
                this.L = true;
                this.M = v;
                this.N = v1;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder p0(int v) {
                this.g = v;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder q0(long v) {
                this.j = v;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder r0(long v) {
                this.k = v;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder s0(boolean z) {
                this.h = z;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder t0(Size size0) {
                this.v = size0;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder u0(Metadata metadata0) {
                this.x = metadata0;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder v0(PositionSupplier simpleBasePlayer$PositionSupplier0) {
                this.K = simpleBasePlayer$PositionSupplier0;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder w0(TrackSelectionParameters trackSelectionParameters0) {
                this.n = trackSelectionParameters0;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder x0(VideoSize videoSize0) {
                this.q = videoSize0;
                return this;
            }

            @a
            public androidx.media3.common.SimpleBasePlayer.State.Builder y0(@FloatRange(from = 0.0, to = 1.0) float f) {
                Assertions.a(f >= 0.0f && f <= 1.0f);
                this.p = f;
                return this;
            }
        }

        public final MediaMetadata A;
        public final int B;
        public final int C;
        public final int D;
        public final PositionSupplier E;
        public final PositionSupplier F;
        public final PositionSupplier G;
        public final PositionSupplier H;
        public final PositionSupplier I;
        public final boolean J;
        public final int K;
        public final long L;
        public final Commands a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        @Nullable
        public final PlaybackException f;
        public final int g;
        public final boolean h;
        public final boolean i;
        public final long j;
        public final long k;
        public final long l;
        public final PlaybackParameters m;
        public final TrackSelectionParameters n;
        public final AudioAttributes o;
        @FloatRange(from = 0.0, to = 1.0)
        public final float p;
        public final VideoSize q;
        public final CueGroup r;
        public final DeviceInfo s;
        @IntRange(from = 0L)
        public final int t;
        public final boolean u;
        public final Size v;
        public final boolean w;
        public final Metadata x;
        public final O2 y;
        public final Timeline z;

        private State(androidx.media3.common.SimpleBasePlayer.State.Builder simpleBasePlayer$State$Builder0) {
            int v1;
            boolean z = false;
            if(simpleBasePlayer$State$Builder0.z.w()) {
                Assertions.b(simpleBasePlayer$State$Builder0.d == 1 || simpleBasePlayer$State$Builder0.d == 4, "Empty playlist only allowed in STATE_IDLE or STATE_ENDED");
                Assertions.b(simpleBasePlayer$State$Builder0.C == -1 && simpleBasePlayer$State$Builder0.D == -1, "Ads not allowed if playlist is empty");
            }
            else {
                int v = simpleBasePlayer$State$Builder0.B;
                if(v == -1) {
                    v1 = 0;
                }
                else {
                    Assertions.b(simpleBasePlayer$State$Builder0.B < simpleBasePlayer$State$Builder0.z.v(), "currentMediaItemIndex must be less than playlist.size()");
                    v1 = v;
                }
                if(simpleBasePlayer$State$Builder0.C != -1) {
                    Period timeline$Period0 = new Period();
                    Window timeline$Window0 = new Window();
                    simpleBasePlayer$State$Builder0.z.j(SimpleBasePlayer.f4(simpleBasePlayer$State$Builder0.z, v1, (simpleBasePlayer$State$Builder0.E == null ? simpleBasePlayer$State$Builder0.F.get() : ((long)simpleBasePlayer$State$Builder0.E)), timeline$Window0, timeline$Period0), timeline$Period0);
                    Assertions.b(simpleBasePlayer$State$Builder0.C < timeline$Period0.e(), "PeriodData has less ad groups than adGroupIndex");
                    int v2 = timeline$Period0.c(simpleBasePlayer$State$Builder0.C);
                    if(v2 != -1) {
                        Assertions.b(simpleBasePlayer$State$Builder0.D < v2, "Ad group has less ads than adIndexInGroupIndex");
                    }
                }
            }
            if(simpleBasePlayer$State$Builder0.f != null) {
                if(simpleBasePlayer$State$Builder0.d == 1) {
                    z = true;
                }
                Assertions.b(z, "Player error only allowed in STATE_IDLE");
            }
            if(simpleBasePlayer$State$Builder0.d == 1 || simpleBasePlayer$State$Builder0.d == 4) {
                Assertions.b(!simpleBasePlayer$State$Builder0.i, "isLoading only allowed when not in STATE_IDLE or STATE_ENDED");
            }
            PositionSupplier simpleBasePlayer$PositionSupplier0 = simpleBasePlayer$State$Builder0.F;
            if(simpleBasePlayer$State$Builder0.E != null) {
                simpleBasePlayer$PositionSupplier0 = simpleBasePlayer$State$Builder0.C != -1 || !simpleBasePlayer$State$Builder0.b || simpleBasePlayer$State$Builder0.d != 3 || simpleBasePlayer$State$Builder0.e != 0 || ((long)simpleBasePlayer$State$Builder0.E) == 0x8000000000000001L ? G0.a(((long)simpleBasePlayer$State$Builder0.E)) : G0.b(((long)simpleBasePlayer$State$Builder0.E), simpleBasePlayer$State$Builder0.m.a);
            }
            PositionSupplier simpleBasePlayer$PositionSupplier1 = simpleBasePlayer$State$Builder0.H;
            if(simpleBasePlayer$State$Builder0.G != null) {
                simpleBasePlayer$PositionSupplier1 = simpleBasePlayer$State$Builder0.C == -1 || !simpleBasePlayer$State$Builder0.b || simpleBasePlayer$State$Builder0.d != 3 || simpleBasePlayer$State$Builder0.e != 0 ? G0.a(((long)simpleBasePlayer$State$Builder0.G)) : G0.b(((long)simpleBasePlayer$State$Builder0.G), 1.0f);
            }
            this.a = simpleBasePlayer$State$Builder0.a;
            this.b = simpleBasePlayer$State$Builder0.b;
            this.c = simpleBasePlayer$State$Builder0.c;
            this.d = simpleBasePlayer$State$Builder0.d;
            this.e = simpleBasePlayer$State$Builder0.e;
            this.f = simpleBasePlayer$State$Builder0.f;
            this.g = simpleBasePlayer$State$Builder0.g;
            this.h = simpleBasePlayer$State$Builder0.h;
            this.i = simpleBasePlayer$State$Builder0.i;
            this.j = simpleBasePlayer$State$Builder0.j;
            this.k = simpleBasePlayer$State$Builder0.k;
            this.l = simpleBasePlayer$State$Builder0.l;
            this.m = simpleBasePlayer$State$Builder0.m;
            this.n = simpleBasePlayer$State$Builder0.n;
            this.o = simpleBasePlayer$State$Builder0.o;
            this.p = simpleBasePlayer$State$Builder0.p;
            this.q = simpleBasePlayer$State$Builder0.q;
            this.r = simpleBasePlayer$State$Builder0.r;
            this.s = simpleBasePlayer$State$Builder0.s;
            this.t = simpleBasePlayer$State$Builder0.t;
            this.u = simpleBasePlayer$State$Builder0.u;
            this.v = simpleBasePlayer$State$Builder0.v;
            this.w = simpleBasePlayer$State$Builder0.w;
            this.x = simpleBasePlayer$State$Builder0.x;
            this.y = simpleBasePlayer$State$Builder0.y;
            this.z = simpleBasePlayer$State$Builder0.z;
            this.A = simpleBasePlayer$State$Builder0.A;
            this.B = simpleBasePlayer$State$Builder0.B;
            this.C = simpleBasePlayer$State$Builder0.C;
            this.D = simpleBasePlayer$State$Builder0.D;
            this.E = simpleBasePlayer$PositionSupplier0;
            this.F = simpleBasePlayer$PositionSupplier1;
            this.G = simpleBasePlayer$State$Builder0.I;
            this.H = simpleBasePlayer$State$Builder0.J;
            this.I = simpleBasePlayer$State$Builder0.K;
            this.J = simpleBasePlayer$State$Builder0.L;
            this.K = simpleBasePlayer$State$Builder0.M;
            this.L = simpleBasePlayer$State$Builder0.N;
        }

        State(androidx.media3.common.SimpleBasePlayer.State.Builder simpleBasePlayer$State$Builder0, androidx.media3.common.SimpleBasePlayer.1 simpleBasePlayer$10) {
            this(simpleBasePlayer$State$Builder0);
        }

        public androidx.media3.common.SimpleBasePlayer.State.Builder a() {
            return new androidx.media3.common.SimpleBasePlayer.State.Builder(this, null);
        }

        // 去混淆评级： 低(30)
        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof State)) {
                return false;
            }
            State simpleBasePlayer$State0 = (State)object0;
            return this.b == simpleBasePlayer$State0.b && this.c == simpleBasePlayer$State0.c && this.a.equals(simpleBasePlayer$State0.a) && this.d == simpleBasePlayer$State0.d && this.e == simpleBasePlayer$State0.e && Util.g(this.f, simpleBasePlayer$State0.f) && this.g == simpleBasePlayer$State0.g && this.h == simpleBasePlayer$State0.h && this.i == simpleBasePlayer$State0.i && this.j == simpleBasePlayer$State0.j && this.k == simpleBasePlayer$State0.k && this.l == simpleBasePlayer$State0.l && this.m.equals(simpleBasePlayer$State0.m) && this.n.equals(simpleBasePlayer$State0.n) && this.o.equals(simpleBasePlayer$State0.o) && this.p == simpleBasePlayer$State0.p && this.q.equals(simpleBasePlayer$State0.q) && this.r.equals(simpleBasePlayer$State0.r) && this.s.equals(simpleBasePlayer$State0.s) && this.t == simpleBasePlayer$State0.t && this.u == simpleBasePlayer$State0.u && this.v.equals(simpleBasePlayer$State0.v) && this.w == simpleBasePlayer$State0.w && this.x.equals(simpleBasePlayer$State0.x) && this.y.equals(simpleBasePlayer$State0.y) && this.A.equals(simpleBasePlayer$State0.A) && this.B == simpleBasePlayer$State0.B && this.C == simpleBasePlayer$State0.C && this.D == simpleBasePlayer$State0.D && this.E.equals(simpleBasePlayer$State0.E) && this.F.equals(simpleBasePlayer$State0.F) && this.G.equals(simpleBasePlayer$State0.G) && this.H.equals(simpleBasePlayer$State0.H) && this.I.equals(simpleBasePlayer$State0.I) && this.J == simpleBasePlayer$State0.J && this.K == simpleBasePlayer$State0.K && this.L == simpleBasePlayer$State0.L;
        }

        @Override
        public int hashCode() {
            int v = (((((this.a.hashCode() + 0xD9) * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d) * 0x1F + this.e) * 0x1F;
            return this.f == null ? ((((((((((((((((((((((((((((((v * 0x1F + this.g) * 0x1F + this.h) * 0x1F + this.i) * 0x1F + ((int)(this.j ^ this.j >>> 0x20))) * 0x1F + ((int)(this.k ^ this.k >>> 0x20))) * 0x1F + ((int)(this.l ^ this.l >>> 0x20))) * 0x1F + this.m.hashCode()) * 0x1F + this.n.hashCode()) * 0x1F + this.o.hashCode()) * 0x1F + Float.floatToRawIntBits(this.p)) * 0x1F + this.q.hashCode()) * 0x1F + this.r.hashCode()) * 0x1F + this.s.hashCode()) * 0x1F + this.t) * 0x1F + this.u) * 0x1F + this.v.hashCode()) * 0x1F + this.w) * 0x1F + this.x.hashCode()) * 0x1F + this.y.hashCode()) * 0x1F + this.A.hashCode()) * 0x1F + this.B) * 0x1F + this.C) * 0x1F + this.D) * 0x1F + this.E.hashCode()) * 0x1F + this.F.hashCode()) * 0x1F + this.G.hashCode()) * 0x1F + this.H.hashCode()) * 0x1F + this.I.hashCode()) * 0x1F + this.J) * 0x1F + this.K) * 0x1F + ((int)(this.L ^ this.L >>> 0x20)) : (((((((((((((((((((((((((((((((v + this.f.hashCode()) * 0x1F + this.g) * 0x1F + this.h) * 0x1F + this.i) * 0x1F + ((int)(this.j ^ this.j >>> 0x20))) * 0x1F + ((int)(this.k ^ this.k >>> 0x20))) * 0x1F + ((int)(this.l ^ this.l >>> 0x20))) * 0x1F + this.m.hashCode()) * 0x1F + this.n.hashCode()) * 0x1F + this.o.hashCode()) * 0x1F + Float.floatToRawIntBits(this.p)) * 0x1F + this.q.hashCode()) * 0x1F + this.r.hashCode()) * 0x1F + this.s.hashCode()) * 0x1F + this.t) * 0x1F + this.u) * 0x1F + this.v.hashCode()) * 0x1F + this.w) * 0x1F + this.x.hashCode()) * 0x1F + this.y.hashCode()) * 0x1F + this.A.hashCode()) * 0x1F + this.B) * 0x1F + this.C) * 0x1F + this.D) * 0x1F + this.E.hashCode()) * 0x1F + this.F.hashCode()) * 0x1F + this.G.hashCode()) * 0x1F + this.H.hashCode()) * 0x1F + this.I.hashCode()) * 0x1F + this.J) * 0x1F + this.K) * 0x1F + ((int)(this.L ^ this.L >>> 0x20));
        }
    }

    private final ListenerSet c1;
    private final Looper d1;
    private final HandlerWrapper e1;
    private final HashSet f1;
    private final Period g1;
    private State h1;
    private boolean i1;
    private static final long j1 = 1000L;

    protected SimpleBasePlayer(Looper looper0) {
        this(looper0, Clock.a);
    }

    protected SimpleBasePlayer(Looper looper0, Clock clock0) {
        this.d1 = looper0;
        this.e1 = clock0.c(looper0, null);
        this.f1 = new HashSet();
        this.g1 = new Period();
        this.c1 = new ListenerSet(looper0, clock0, (Listener player$Listener0, FlagSet flagSet0) -> player$Listener0.N(this, new Events(flagSet0)));
    }

    @Override  // androidx.media3.common.Player
    public final TrackSelectionParameters A0() {
        this.i6();
        return this.h1.n;
    }

    @g
    protected t0 A4(int v, long v1, int v2) {
        throw new IllegalStateException("Missing implementation to handle one of the COMMAND_SEEK_*");
    }

    // 检测为 Lambda 实现
    private static void A5(State simpleBasePlayer$State0, Listener player$Listener0) [...]

    @Override  // androidx.media3.common.Player
    public final void B(@Nullable TextureView textureView0) {
        this.V3(textureView0);
    }

    @Override  // androidx.media3.common.BasePlayer
    @VisibleForTesting(otherwise = 4)
    public final void B2(int v, long v1, int v2, boolean z) {
        this.i6();
        int v3 = 0;
        Assertions.a(v == -1 || v >= 0);
        State simpleBasePlayer$State0 = this.h1;
        if(!this.d6(v2)) {
            return;
        }
        if(v == -1 || this.W() || !simpleBasePlayer$State0.y.isEmpty() && v >= simpleBasePlayer$State0.y.size()) {
            v3 = 1;
        }
        this.g6(this.A4(v, v1, v2), () -> (v3 ? simpleBasePlayer$State0 : SimpleBasePlayer.o4(simpleBasePlayer$State0, simpleBasePlayer$State0.y, v, v1)), ((boolean)(v3 ^ 1)), z);
    }

    @g
    protected t0 B4(AudioAttributes audioAttributes0, boolean z) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_AUDIO_ATTRIBUTES");
    }

    // 检测为 Lambda 实现
    private static void B5(State simpleBasePlayer$State0, Listener player$Listener0) [...]

    @Override  // androidx.media3.common.Player
    public final void C(AudioAttributes audioAttributes0, boolean z) {
        this.i6();
        State simpleBasePlayer$State0 = this.h1;
        if(!this.d6(35)) {
            return;
        }
        this.f6(this.B4(audioAttributes0, z), () -> simpleBasePlayer$State0.a().T(audioAttributes0).O());
    }

    @g
    protected t0 C4(boolean z, int v) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    // 检测为 Lambda 实现
    private static void C5(Tracks tracks0, Listener player$Listener0) [...]

    @Override  // androidx.media3.common.Player
    public final boolean D() {
        this.i6();
        return this.h1.u;
    }

    @Override  // androidx.media3.common.Player
    public final boolean D0() {
        this.i6();
        return this.h1.b;
    }

    @Override  // androidx.media3.common.Player
    public final void D1(boolean z) {
        this.i6();
        State simpleBasePlayer$State0 = this.h1;
        if(!this.d6(1)) {
            return;
        }
        this.f6(this.F4(z), () -> simpleBasePlayer$State0.a().h0(z, 1).O());
    }

    @g
    protected t0 D4(@IntRange(from = 0L) int v, int v1) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_DEVICE_VOLUME or COMMAND_SET_DEVICE_VOLUME_WITH_FLAGS");
    }

    // 检测为 Lambda 实现
    private static void D5(MediaMetadata mediaMetadata0, Listener player$Listener0) [...]

    @Override  // androidx.media3.common.Player
    public final void E0(boolean z) {
        this.i6();
        State simpleBasePlayer$State0 = this.h1;
        if(!this.d6(14)) {
            return;
        }
        this.f6(this.J4(z), () -> simpleBasePlayer$State0.a().s0(z).O());
    }

    @g
    protected t0 E4(List list0, int v, long v1) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_MEDIA_ITEM(S)");
    }

    // 检测为 Lambda 实现
    private static void E5(State simpleBasePlayer$State0, Listener player$Listener0) [...]

    @Override  // androidx.media3.common.Player
    public final void F1(int v) {
        this.i6();
        State simpleBasePlayer$State0 = this.h1;
        if(!this.d6(34)) {
            return;
        }
        this.f6(this.t4(v), () -> simpleBasePlayer$State0.a().c0(Math.max(0, simpleBasePlayer$State0.t - 1)).O());
    }

    @g
    protected t0 F4(boolean z) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_PLAY_PAUSE");
    }

    // 检测为 Lambda 实现
    private static void F5(State simpleBasePlayer$State0, Listener player$Listener0) [...]

    @Override  // androidx.media3.common.Player
    public final void G(@Nullable Surface surface0) {
        this.V3(surface0);
    }

    @g
    protected t0 G4(PlaybackParameters playbackParameters0) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_SPEED_AND_PITCH");
    }

    // 检测为 Lambda 实现
    private static void G5(State simpleBasePlayer$State0, Listener player$Listener0) [...]

    @Override  // androidx.media3.common.Player
    @Deprecated
    public final void H() {
        this.i6();
        State simpleBasePlayer$State0 = this.h1;
        if(!this.d6(26)) {
            return;
        }
        this.f6(this.t4(1), () -> simpleBasePlayer$State0.a().c0(Math.max(0, simpleBasePlayer$State0.t - 1)).O());
    }

    @Override  // androidx.media3.common.Player
    public final long H0() {
        this.i6();
        return this.h1.l;
    }

    @g
    protected t0 H4(MediaMetadata mediaMetadata0) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_PLAYLIST_METADATA");
    }

    // 检测为 Lambda 实现
    private static void H5(State simpleBasePlayer$State0, Listener player$Listener0) [...]

    @Override  // androidx.media3.common.Player
    public final void I(int v, int v1, List list0) {
        this.i6();
        Assertions.a(v >= 0 && v <= v1);
        State simpleBasePlayer$State0 = this.h1;
        int v2 = simpleBasePlayer$State0.y.size();
        if(this.d6(20) && v <= v2) {
            int v3 = Math.min(v1, v2);
            this.f6(this.z4(v, v3, list0), () -> {
                State simpleBasePlayer$State1;
                ArrayList arrayList0 = new ArrayList(simpleBasePlayer$State0.y);
                for(int v2 = 0; v2 < list0.size(); ++v2) {
                    arrayList0.add(v2 + v3, this.h4(((MediaItem)list0.get(v2))));
                }
                if(simpleBasePlayer$State0.y.isEmpty()) {
                    long v3 = simpleBasePlayer$State0.E.get();
                    simpleBasePlayer$State1 = SimpleBasePlayer.o4(simpleBasePlayer$State0, arrayList0, simpleBasePlayer$State0.B, v3);
                }
                else {
                    simpleBasePlayer$State1 = SimpleBasePlayer.n4(simpleBasePlayer$State0, arrayList0, this.g1);
                }
                if(v < v3) {
                    Util.V1(arrayList0, v, v3);
                    return SimpleBasePlayer.n4(simpleBasePlayer$State1, arrayList0, this.g1);
                }
                return simpleBasePlayer$State1;
            });
        }
    }

    @g
    protected t0 I4(int v) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_REPEAT_MODE");
    }

    // 检测为 Lambda 实现
    private static void I5(State simpleBasePlayer$State0, Listener player$Listener0) [...]

    @Override  // androidx.media3.common.Player
    public final void J1(Listener player$Listener0) {
        this.i6();
        this.c1.l(player$Listener0);
    }

    @g
    protected t0 J4(boolean z) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_SHUFFLE_MODE");
    }

    // 检测为 Lambda 实现
    private static void J5(State simpleBasePlayer$State0, Listener player$Listener0) [...]

    @g
    protected t0 K4(TrackSelectionParameters trackSelectionParameters0) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_TRACK_SELECTION_PARAMETERS");
    }

    // 检测为 Lambda 实现
    private static void K5(State simpleBasePlayer$State0, Listener player$Listener0) [...]

    @Override  // androidx.media3.common.Player
    public final CueGroup L() {
        this.i6();
        return this.h1.r;
    }

    @Override  // androidx.media3.common.Player
    public final int L0() {
        this.i6();
        return SimpleBasePlayer.Z3(this.h1, this.b1, this.g1);
    }

    @g
    protected t0 L4(Object object0) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
    }

    // 检测为 Lambda 实现
    private static void L5(State simpleBasePlayer$State0, Listener player$Listener0) [...]

    @Override  // androidx.media3.common.Player
    public final void M1(Listener player$Listener0) {
        Listener player$Listener1 = (Listener)Assertions.g(player$Listener0);
        this.c1.c(player$Listener1);
    }

    @g
    protected t0 M4(@FloatRange(from = 0.0, to = 1.0) float f) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VOLUME");
    }

    // 检测为 Lambda 实现
    private static void M5(State simpleBasePlayer$State0, Listener player$Listener0) [...]

    @Override  // androidx.media3.common.Player
    public final void N(@Nullable TextureView textureView0) {
        this.i6();
        State simpleBasePlayer$State0 = this.h1;
        if(!this.d6(27)) {
            return;
        }
        if(textureView0 == null) {
            this.Q();
            return;
        }
        Size size0 = textureView0.isAvailable() ? new Size(textureView0.getWidth(), textureView0.getHeight()) : Size.d;
        this.f6(this.L4(textureView0), () -> simpleBasePlayer$State0.a().t0(size0).O());
    }

    @Override  // androidx.media3.common.Player
    public final int N0() {
        this.i6();
        return this.h1.D;
    }

    @Override  // androidx.media3.common.Player
    public final int N1() {
        this.i6();
        return this.h1.e;
    }

    @g
    protected t0 N4() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_STOP");
    }

    // 检测为 Lambda 实现
    private static void N5(State simpleBasePlayer$State0, Listener player$Listener0) [...]

    @Override  // androidx.media3.common.Player
    public final VideoSize O() {
        this.i6();
        return this.h1.q;
    }

    @Override  // androidx.media3.common.Player
    public final Timeline O1() {
        this.i6();
        return this.h1.z;
    }

    protected final void O4() {
        this.i6();
        if(this.f1.isEmpty() && !this.i1) {
            this.e6(this.m4(), false, false);
        }
    }

    // 检测为 Lambda 实现
    private static void O5(State simpleBasePlayer$State0, Listener player$Listener0) [...]

    @Override  // androidx.media3.common.Player
    public final Looper P1() {
        return this.d1;
    }

    private static boolean P4(State simpleBasePlayer$State0) {
        return simpleBasePlayer$State0.b && simpleBasePlayer$State0.d == 3 && simpleBasePlayer$State0.e == 0;
    }

    // 检测为 Lambda 实现
    private static void P5(State simpleBasePlayer$State0, Listener player$Listener0) [...]

    @Override  // androidx.media3.common.Player
    public final void Q() {
        this.V3(null);
    }

    // 检测为 Lambda 实现
    private State Q4(State simpleBasePlayer$State0, List list0, int v) [...]

    // 检测为 Lambda 实现
    private static void Q5(State simpleBasePlayer$State0, Listener player$Listener0) [...]

    @Override  // androidx.media3.common.Player
    public final void R0(List list0, int v, long v1) {
        this.i6();
        if(v == -1) {
            v = this.h1.B;
            v1 = this.h1.E.get();
        }
        this.c6(list0, v, v1);
    }

    // 检测为 Lambda 实现
    private static State R4(State simpleBasePlayer$State0) [...]

    // 检测为 Lambda 实现
    private static void R5(State simpleBasePlayer$State0, Listener player$Listener0) [...]

    @Override  // androidx.media3.common.Player
    public final void S(@Nullable SurfaceView surfaceView0) {
        this.V3(surfaceView0);
    }

    // 检测为 Lambda 实现
    public static State S3(State simpleBasePlayer$State0) [...]

    // 检测为 Lambda 实现
    private static State S4(State simpleBasePlayer$State0) [...]

    // 检测为 Lambda 实现
    private static void S5(State simpleBasePlayer$State0, Listener player$Listener0) [...]

    @Override  // androidx.media3.common.Player
    public final long T0() {
        this.i6();
        return this.h1.k;
    }

    // 检测为 Lambda 实现
    private static State T4(State simpleBasePlayer$State0) [...]

    // 检测为 Lambda 实现
    private static void T5(State simpleBasePlayer$State0, Listener player$Listener0) [...]

    @Override  // androidx.media3.common.Player
    @Deprecated
    public final void U(int v) {
        this.i6();
        State simpleBasePlayer$State0 = this.h1;
        if(!this.d6(25)) {
            return;
        }
        this.f6(this.D4(v, 1), () -> simpleBasePlayer$State0.a().c0(v).O());
    }

    private static State U3(androidx.media3.common.SimpleBasePlayer.State.Builder simpleBasePlayer$State$Builder0, State simpleBasePlayer$State0, long v, List list0, int v1, long v2, boolean z) {
        long v3 = SimpleBasePlayer.l4(v, simpleBasePlayer$State0);
        boolean z1 = false;
        if(!list0.isEmpty() && (v1 == -1 || v1 >= list0.size())) {
            v2 = 0x8000000000000001L;
            v1 = 0;
        }
        if(!list0.isEmpty() && v2 == 0x8000000000000001L) {
            v2 = Util.B2(((MediaItemData)list0.get(v1)).l);
        }
        boolean z2 = simpleBasePlayer$State0.y.isEmpty() || list0.isEmpty();
        if(!z2) {
            int v4 = SimpleBasePlayer.Y3(simpleBasePlayer$State0);
            if(!((MediaItemData)simpleBasePlayer$State0.y.get(v4)).a.equals(((MediaItemData)list0.get(v1)).a)) {
                z1 = true;
            }
        }
        if(!z2 && !z1) {
            int v5 = Long.compare(v2, v3);
            if(v5 >= 0) {
                if(v5 == 0) {
                    simpleBasePlayer$State$Builder0.a0(v1);
                    if(simpleBasePlayer$State0.C != -1 && z) {
                        simpleBasePlayer$State$Builder0.v0(G0.a(simpleBasePlayer$State0.H.get() - simpleBasePlayer$State0.F.get()));
                        return simpleBasePlayer$State$Builder0.O();
                    }
                    simpleBasePlayer$State$Builder0.Y(-1, -1).v0(G0.a(SimpleBasePlayer.W3(simpleBasePlayer$State0) - v3));
                    return simpleBasePlayer$State$Builder0.O();
                }
                long v6 = Math.max(SimpleBasePlayer.W3(simpleBasePlayer$State0), v2);
                long v7 = Math.max(0L, simpleBasePlayer$State0.I.get() - (v2 - v3));
                simpleBasePlayer$State$Builder0.a0(v1).Y(-1, -1).W(v2).V(G0.a(v6)).v0(G0.a(v7));
                return simpleBasePlayer$State$Builder0.O();
            }
        }
        simpleBasePlayer$State$Builder0.a0(v1).Y(-1, -1).W(v2).V(G0.a(v2)).v0(PositionSupplier.a);
        return simpleBasePlayer$State$Builder0.O();
    }

    private static t0 U4(t0 t00, Object object0) throws Exception [...] // Inlined contents

    // 检测为 Lambda 实现
    private static void U5(State simpleBasePlayer$State0, Listener player$Listener0) [...]

    private void V3(@Nullable Object object0) {
        this.i6();
        State simpleBasePlayer$State0 = this.h1;
        if(!this.d6(27)) {
            return;
        }
        this.f6(this.s4(object0), () -> simpleBasePlayer$State0.a().t0(Size.d).O());
    }

    // 检测为 Lambda 实现
    private static State V4(State simpleBasePlayer$State0) [...]

    // 检测为 Lambda 实现
    private static void V5(State simpleBasePlayer$State0, Listener player$Listener0) [...]

    @Override  // androidx.media3.common.Player
    public final boolean W() {
        this.i6();
        return this.h1.C != -1;
    }

    @Override  // androidx.media3.common.Player
    public final MediaMetadata W0() {
        this.i6();
        return this.h1.A;
    }

    private static long W3(State simpleBasePlayer$State0) {
        return SimpleBasePlayer.l4(simpleBasePlayer$State0.G.get(), simpleBasePlayer$State0);
    }

    // 检测为 Lambda 实现
    private static State W4(State simpleBasePlayer$State0) [...]

    // 检测为 Lambda 实现
    private static void W5(State simpleBasePlayer$State0, Listener player$Listener0) [...]

    @Override  // androidx.media3.common.Player
    public final Commands X1() {
        this.i6();
        return this.h1.a;
    }

    private static long X3(State simpleBasePlayer$State0) {
        return SimpleBasePlayer.l4(simpleBasePlayer$State0.E.get(), simpleBasePlayer$State0);
    }

    // 检测为 Lambda 实现
    private State X4(State simpleBasePlayer$State0, int v, int v1, int v2) [...]

    // 检测为 Lambda 实现
    private static void X5(State simpleBasePlayer$State0, Listener player$Listener0) [...]

    @Override  // androidx.media3.common.Player
    public final long Y() {
        this.i6();
        return this.h1.I.get();
    }

    @Override  // androidx.media3.common.Player
    public final void Y1(int v, int v1) {
        this.i6();
        State simpleBasePlayer$State0 = this.h1;
        if(!this.d6(33)) {
            return;
        }
        this.f6(this.D4(v, v1), () -> simpleBasePlayer$State0.a().c0(v).O());
    }

    // 检测为 Lambda 实现
    public static t0 Y2(t0 t00, Object object0) [...]

    private static int Y3(State simpleBasePlayer$State0) {
        return simpleBasePlayer$State0.B == -1 ? 0 : simpleBasePlayer$State0.B;
    }

    // 检测为 Lambda 实现
    private void Y4(Listener player$Listener0, FlagSet flagSet0) [...]

    // 检测为 Lambda 实现
    private static void Y5(State simpleBasePlayer$State0, Listener player$Listener0) [...]

    @Override  // androidx.media3.common.Player
    public final void Z0(TrackSelectionParameters trackSelectionParameters0) {
        this.i6();
        State simpleBasePlayer$State0 = this.h1;
        if(!this.d6(29)) {
            return;
        }
        this.f6(this.K4(trackSelectionParameters0), () -> simpleBasePlayer$State0.a().w0(trackSelectionParameters0).O());
    }

    private static int Z3(State simpleBasePlayer$State0, Window timeline$Window0, Period timeline$Period0) {
        int v = SimpleBasePlayer.Y3(simpleBasePlayer$State0);
        if(simpleBasePlayer$State0.z.w()) {
            return v;
        }
        long v1 = SimpleBasePlayer.X3(simpleBasePlayer$State0);
        return SimpleBasePlayer.f4(simpleBasePlayer$State0.z, v, v1, timeline$Window0, timeline$Period0);
    }

    // 检测为 Lambda 实现
    private static State Z4(State simpleBasePlayer$State0) [...]

    // 检测为 Lambda 实现
    private static void Z5(State simpleBasePlayer$State0, Listener player$Listener0) [...]

    @Override  // androidx.media3.common.Player
    public final boolean a() {
        this.i6();
        return this.h1.i;
    }

    private static long a4(State simpleBasePlayer$State0, Object object0, Period timeline$Period0) {
        return simpleBasePlayer$State0.C == -1 ? SimpleBasePlayer.X3(simpleBasePlayer$State0) - simpleBasePlayer$State0.z.l(object0, timeline$Period0).q() : simpleBasePlayer$State0.F.get();
    }

    private static State a5(State simpleBasePlayer$State0) [...] // Inlined contents

    // 检测为 Lambda 实现
    private void a6(t0 t00) [...]

    @Override  // androidx.media3.common.Player
    public final int b() {
        this.i6();
        return this.h1.d;
    }

    private static Tracks b4(State simpleBasePlayer$State0) {
        if(simpleBasePlayer$State0.y.isEmpty()) {
            return Tracks.b;
        }
        int v = SimpleBasePlayer.Y3(simpleBasePlayer$State0);
        return ((MediaItemData)simpleBasePlayer$State0.y.get(v)).b;
    }

    // 检测为 Lambda 实现
    private State b5(State simpleBasePlayer$State0, int v, int v1) [...]

    // 检测为 Lambda 实现
    private void b6(Runnable runnable0) [...]

    @Override  // androidx.media3.common.Player
    public final void c0(List list0, boolean z) {
        this.i6();
        this.c6(list0, (z ? -1 : this.h1.B), (z ? 0x8000000000000001L : this.h1.E.get()));
    }

    private static int c4(List list0, Timeline timeline0, int v, Period timeline$Period0) {
        if(list0.isEmpty()) {
            return v < timeline0.v() ? v : -1;
        }
        Object object0 = ((MediaItemData)list0.get(v)).h(0);
        return timeline0.f(object0) == -1 ? -1 : timeline0.l(object0, timeline$Period0).c;
    }

    // 检测为 Lambda 实现
    private State c5(State simpleBasePlayer$State0, List list0, int v, int v1) [...]

    @m({"state"})
    private void c6(List list0, int v, long v1) {
        Assertions.a(v == -1 || v >= 0);
        State simpleBasePlayer$State0 = this.h1;
        if(!this.d6(20) && (list0.size() != 1 || !this.d6(0x1F))) {
            return;
        }
        this.f6(this.E4(list0, v, v1), () -> {
            ArrayList arrayList0 = new ArrayList();
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                arrayList0.add(this.h4(((MediaItem)list0.get(v2))));
            }
            return SimpleBasePlayer.o4(simpleBasePlayer$State0, arrayList0, v, v1);
        });
    }

    @Override  // androidx.media3.common.Player
    public final AudioAttributes d() {
        this.i6();
        return this.h1.o;
    }

    @Override  // androidx.media3.common.Player
    public final long d2() {
        this.i6();
        return SimpleBasePlayer.X3(this.h1);
    }

    private static int d4(State simpleBasePlayer$State0, State simpleBasePlayer$State1, int v, boolean z, Window timeline$Window0) {
        Timeline timeline0 = simpleBasePlayer$State0.z;
        Timeline timeline1 = simpleBasePlayer$State1.z;
        if(timeline1.w() && timeline0.w()) {
            return -1;
        }
        if(timeline1.w() != timeline0.w()) {
            return 3;
        }
        int v1 = SimpleBasePlayer.Y3(simpleBasePlayer$State0);
        Object object0 = simpleBasePlayer$State0.z.t(v1, timeline$Window0).a;
        int v2 = SimpleBasePlayer.Y3(simpleBasePlayer$State1);
        Object object1 = simpleBasePlayer$State1.z.t(v2, timeline$Window0).a;
        if(object0 instanceof PlaceholderUid && !(object1 instanceof PlaceholderUid)) {
            return -1;
        }
        if(!object0.equals(object1)) {
            if(v == 0) {
                return 1;
            }
            return v == 1 ? 2 : 3;
        }
        if(v == 0 && SimpleBasePlayer.X3(simpleBasePlayer$State0) > SimpleBasePlayer.X3(simpleBasePlayer$State1)) {
            return 0;
        }
        return v != 1 || !z ? -1 : 2;
    }

    // 检测为 Lambda 实现
    private static State d5(boolean z, State simpleBasePlayer$State0, int v, long v1) [...]

    // 去混淆评级： 低(20)
    @m({"state"})
    private boolean d6(int v) {
        return !this.i1 && this.h1.a.c(v);
    }

    @Override  // androidx.media3.common.Player
    public final long e1() {
        this.i6();
        return Math.max(SimpleBasePlayer.W3(this.h1), SimpleBasePlayer.X3(this.h1));
    }

    private static MediaMetadata e4(State simpleBasePlayer$State0) {
        if(simpleBasePlayer$State0.y.isEmpty()) {
            return MediaMetadata.W0;
        }
        int v = SimpleBasePlayer.Y3(simpleBasePlayer$State0);
        return ((MediaItemData)simpleBasePlayer$State0.y.get(v)).r;
    }

    // 检测为 Lambda 实现
    private static State e5(State simpleBasePlayer$State0, AudioAttributes audioAttributes0) [...]

    @m({"state"})
    private void e6(State simpleBasePlayer$State0, boolean z, boolean z1) {
        MediaItem mediaItem0;
        State simpleBasePlayer$State1 = this.h1;
        this.h1 = simpleBasePlayer$State0;
        if(simpleBasePlayer$State0.J || simpleBasePlayer$State0.w) {
            this.h1 = simpleBasePlayer$State0.a().P().g0(false).O();
        }
        boolean z2 = simpleBasePlayer$State1.b != simpleBasePlayer$State0.b;
        boolean z3 = simpleBasePlayer$State1.d != simpleBasePlayer$State0.d;
        Tracks tracks0 = SimpleBasePlayer.b4(simpleBasePlayer$State1);
        Tracks tracks1 = SimpleBasePlayer.b4(simpleBasePlayer$State0);
        MediaMetadata mediaMetadata0 = SimpleBasePlayer.e4(simpleBasePlayer$State1);
        MediaMetadata mediaMetadata1 = SimpleBasePlayer.e4(simpleBasePlayer$State0);
        int v = SimpleBasePlayer.j4(simpleBasePlayer$State1, simpleBasePlayer$State0, z, this.b1, this.g1);
        boolean z4 = simpleBasePlayer$State1.z.equals(simpleBasePlayer$State0.z);
        int v1 = SimpleBasePlayer.d4(simpleBasePlayer$State1, simpleBasePlayer$State0, v, z1, this.b1);
        if(!z4) {
            Y y0 = (Listener player$Listener0) -> player$Listener0.Q(simpleBasePlayer$State0.z, SimpleBasePlayer.q4(simpleBasePlayer$State1.y, simpleBasePlayer$State0.y));
            this.c1.j(0, y0);
        }
        if(v != -1) {
            u u0 = (Listener player$Listener0) -> {
                player$Listener0.o0(v);
                player$Listener0.Y(SimpleBasePlayer.k4(simpleBasePlayer$State1, false, this.b1, this.g1), SimpleBasePlayer.k4(simpleBasePlayer$State0, simpleBasePlayer$State0.J, this.b1, this.g1), v);
            };
            this.c1.j(11, u0);
        }
        if(v1 != -1) {
            if(simpleBasePlayer$State0.z.w()) {
                mediaItem0 = null;
            }
            else {
                int v2 = SimpleBasePlayer.Y3(simpleBasePlayer$State0);
                mediaItem0 = ((MediaItemData)simpleBasePlayer$State0.y.get(v2)).c;
            }
            H h0 = (Listener player$Listener0) -> player$Listener0.i0(mediaItem0, v1);
            this.c1.j(1, h0);
        }
        if(!Util.g(simpleBasePlayer$State1.f, simpleBasePlayer$State0.f)) {
            J j0 = (Listener player$Listener0) -> player$Listener0.w0(simpleBasePlayer$State0.f);
            this.c1.j(10, j0);
            if(simpleBasePlayer$State0.f != null) {
                K k0 = (Listener player$Listener0) -> player$Listener0.J(simpleBasePlayer$State0.f);
                this.c1.j(10, k0);
            }
        }
        if(!simpleBasePlayer$State1.n.equals(simpleBasePlayer$State0.n)) {
            L l0 = (Listener player$Listener0) -> player$Listener0.g0(simpleBasePlayer$State0.n);
            this.c1.j(19, l0);
        }
        if(!tracks0.equals(tracks1)) {
            N n0 = (Listener player$Listener0) -> player$Listener0.S(tracks1);
            this.c1.j(2, n0);
        }
        if(!mediaMetadata0.equals(mediaMetadata1)) {
            O o0 = (Listener player$Listener0) -> player$Listener0.I(mediaMetadata1);
            this.c1.j(14, o0);
        }
        if(simpleBasePlayer$State1.i != simpleBasePlayer$State0.i) {
            P p0 = (Listener player$Listener0) -> {
                player$Listener0.C(simpleBasePlayer$State0.i);
                player$Listener0.p0(simpleBasePlayer$State0.i);
            };
            this.c1.j(3, p0);
        }
        if(z2 || z3) {
            Q q0 = (Listener player$Listener0) -> player$Listener0.u0(simpleBasePlayer$State0.b, simpleBasePlayer$State0.d);
            this.c1.j(-1, q0);
        }
        if(z3) {
            j0 j00 = (Listener player$Listener0) -> player$Listener0.c0(simpleBasePlayer$State0.d);
            this.c1.j(4, j00);
        }
        if(z2 || simpleBasePlayer$State1.c != simpleBasePlayer$State0.c) {
            u0 u00 = (Listener player$Listener0) -> player$Listener0.V(simpleBasePlayer$State0.b, simpleBasePlayer$State0.c);
            this.c1.j(5, u00);
        }
        if(simpleBasePlayer$State1.e != simpleBasePlayer$State0.e) {
            A0 a00 = (Listener player$Listener0) -> player$Listener0.a0(simpleBasePlayer$State0.e);
            this.c1.j(6, a00);
        }
        if(SimpleBasePlayer.P4(simpleBasePlayer$State1) != SimpleBasePlayer.P4(simpleBasePlayer$State0)) {
            B0 b00 = (Listener player$Listener0) -> player$Listener0.Z(SimpleBasePlayer.P4(simpleBasePlayer$State0));
            this.c1.j(7, b00);
        }
        if(!simpleBasePlayer$State1.m.equals(simpleBasePlayer$State0.m)) {
            C0 c00 = (Listener player$Listener0) -> player$Listener0.q(simpleBasePlayer$State0.m);
            this.c1.j(12, c00);
        }
        if(simpleBasePlayer$State1.g != simpleBasePlayer$State0.g) {
            D0 d00 = (Listener player$Listener0) -> player$Listener0.A(simpleBasePlayer$State0.g);
            this.c1.j(8, d00);
        }
        if(simpleBasePlayer$State1.h != simpleBasePlayer$State0.h) {
            q q1 = (Listener player$Listener0) -> player$Listener0.F(simpleBasePlayer$State0.h);
            this.c1.j(9, q1);
        }
        if(simpleBasePlayer$State1.j != simpleBasePlayer$State0.j) {
            r r0 = (Listener player$Listener0) -> player$Listener0.f0(simpleBasePlayer$State0.j);
            this.c1.j(16, r0);
        }
        if(simpleBasePlayer$State1.k != simpleBasePlayer$State0.k) {
            s s0 = (Listener player$Listener0) -> player$Listener0.R(simpleBasePlayer$State0.k);
            this.c1.j(17, s0);
        }
        if(simpleBasePlayer$State1.l != simpleBasePlayer$State0.l) {
            t t0 = (Listener player$Listener0) -> player$Listener0.x0(simpleBasePlayer$State0.l);
            this.c1.j(18, t0);
        }
        if(!simpleBasePlayer$State1.o.equals(simpleBasePlayer$State0.o)) {
            v v3 = (Listener player$Listener0) -> player$Listener0.r0(simpleBasePlayer$State0.o);
            this.c1.j(20, v3);
        }
        if(!simpleBasePlayer$State1.q.equals(simpleBasePlayer$State0.q)) {
            w w0 = (Listener player$Listener0) -> player$Listener0.a(simpleBasePlayer$State0.q);
            this.c1.j(25, w0);
        }
        if(!simpleBasePlayer$State1.s.equals(simpleBasePlayer$State0.s)) {
            x x0 = (Listener player$Listener0) -> player$Listener0.T(simpleBasePlayer$State0.s);
            this.c1.j(29, x0);
        }
        if(!simpleBasePlayer$State1.A.equals(simpleBasePlayer$State0.A)) {
            y y1 = (Listener player$Listener0) -> player$Listener0.v0(simpleBasePlayer$State0.A);
            this.c1.j(15, y1);
        }
        if(simpleBasePlayer$State0.w) {
            z z5 = new z();
            this.c1.j(26, z5);
        }
        if(!simpleBasePlayer$State1.v.equals(simpleBasePlayer$State0.v)) {
            B b0 = (Listener player$Listener0) -> player$Listener0.l0(simpleBasePlayer$State0.v.b(), simpleBasePlayer$State0.v.a());
            this.c1.j(24, b0);
        }
        if(simpleBasePlayer$State1.p != simpleBasePlayer$State0.p) {
            D d0 = (Listener player$Listener0) -> player$Listener0.q0(simpleBasePlayer$State0.p);
            this.c1.j(22, d0);
        }
        if(simpleBasePlayer$State1.t != simpleBasePlayer$State0.t || simpleBasePlayer$State1.u != simpleBasePlayer$State0.u) {
            E e0 = (Listener player$Listener0) -> player$Listener0.H(simpleBasePlayer$State0.t, simpleBasePlayer$State0.u);
            this.c1.j(30, e0);
        }
        if(!simpleBasePlayer$State1.r.equals(simpleBasePlayer$State0.r)) {
            F f0 = (Listener player$Listener0) -> {
                player$Listener0.r(simpleBasePlayer$State0.r.a);
                player$Listener0.w(simpleBasePlayer$State0.r);
            };
            this.c1.j(27, f0);
        }
        if(!simpleBasePlayer$State1.x.equals(simpleBasePlayer$State0.x) && simpleBasePlayer$State0.x.b != 0x8000000000000001L) {
            G g0 = (Listener player$Listener0) -> player$Listener0.x(simpleBasePlayer$State0.x);
            this.c1.j(28, g0);
        }
        if(!simpleBasePlayer$State1.a.equals(simpleBasePlayer$State0.a)) {
            I i0 = (Listener player$Listener0) -> player$Listener0.L(simpleBasePlayer$State0.a);
            this.c1.j(13, i0);
        }
        this.c1.g();
    }

    @Override  // androidx.media3.common.Player
    @Nullable
    public final PlaybackException f() {
        this.i6();
        return this.h1.f;
    }

    @Override  // androidx.media3.common.Player
    public final void f2(int v, List list0) {
        this.i6();
        Assertions.a(v >= 0);
        State simpleBasePlayer$State0 = this.h1;
        int v1 = simpleBasePlayer$State0.y.size();
        if(this.d6(20) && !list0.isEmpty()) {
            int v2 = Math.min(v, v1);
            this.f6(this.r4(v2, list0), () -> {
                ArrayList arrayList0 = new ArrayList(simpleBasePlayer$State0.y);
                for(int v1 = 0; v1 < list0.size(); ++v1) {
                    arrayList0.add(v1 + v2, this.h4(((MediaItem)list0.get(v1))));
                }
                if(!simpleBasePlayer$State0.y.isEmpty()) {
                    return SimpleBasePlayer.n4(simpleBasePlayer$State0, arrayList0, this.g1);
                }
                long v2 = simpleBasePlayer$State0.E.get();
                return SimpleBasePlayer.o4(simpleBasePlayer$State0, arrayList0, simpleBasePlayer$State0.B, v2);
            });
        }
    }

    private static int f4(Timeline timeline0, int v, long v1, Window timeline$Window0, Period timeline$Period0) {
        return timeline0.f(timeline0.p(timeline$Window0, timeline$Period0, v, Util.F1(v1)).first);
    }

    // 检测为 Lambda 实现
    private static State f5(State simpleBasePlayer$State0, boolean z) [...]

    @m({"state"})
    private void f6(t0 t00, com.google.common.base.Q q0) {
        this.g6(t00, q0, false, false);
    }

    @Override  // androidx.media3.common.Player
    public final void g0(int v) {
        this.i6();
        State simpleBasePlayer$State0 = this.h1;
        if(!this.d6(34)) {
            return;
        }
        this.f6(this.u4(v), () -> simpleBasePlayer$State0.a().c0(simpleBasePlayer$State0.t + 1).O());
    }

    private static long g4(State simpleBasePlayer$State0, Object object0, Period timeline$Period0) {
        simpleBasePlayer$State0.z.l(object0, timeline$Period0);
        return simpleBasePlayer$State0.C == -1 ? Util.B2(timeline$Period0.d) : Util.B2(timeline$Period0.d(simpleBasePlayer$State0.C, simpleBasePlayer$State0.D));
    }

    // 检测为 Lambda 实现
    private static State g5(State simpleBasePlayer$State0, boolean z) [...]

    @m({"state"})
    private void g6(t0 t00, com.google.common.base.Q q0, boolean z, boolean z1) {
        if(t00.isDone() && this.f1.isEmpty()) {
            this.e6(this.m4(), z, z1);
            return;
        }
        this.f1.add(t00);
        this.e6(this.i4(((State)q0.get())), z, z1);
        t00.addListener(() -> {
            this.f1.remove(t00);
            if(this.f1.isEmpty() && !this.i1) {
                this.e6(this.m4(), false, false);
            }
        }, (Runnable runnable0) -> {
            if(this.e1.j() == Looper.myLooper()) {
                runnable0.run();
                return;
            }
            this.e1.k(runnable0);
        });
    }

    @Override  // androidx.media3.common.Player
    public final long getCurrentPosition() {
        this.i6();
        return this.W() ? this.h1.F.get() : this.d2();
    }

    @Override  // androidx.media3.common.Player
    public final DeviceInfo getDeviceInfo() {
        this.i6();
        return this.h1.s;
    }

    @Override  // androidx.media3.common.Player
    public final long getDuration() {
        this.i6();
        if(this.W()) {
            this.h1.z.j(this.L0(), this.g1);
            return Util.B2(this.g1.d(this.h1.C, this.h1.D));
        }
        return this.K0();
    }

    @Override  // androidx.media3.common.Player
    public final float getVolume() {
        this.i6();
        return this.h1.p;
    }

    @g
    protected MediaItemData h4(MediaItem mediaItem0) {
        return new Builder(new PlaceholderUid(null)).z(mediaItem0).u(true).v(true).q();
    }

    // 检测为 Lambda 实现
    private static State h5(State simpleBasePlayer$State0, int v) [...]

    protected final void h6() {
        if(Thread.currentThread() != this.d1.getThread()) {
            throw new IllegalStateException(Util.S("Player is accessed on the wrong thread.\nCurrent thread: \'%s\'\nExpected thread: \'%s\'\n", new Object[]{"jeb-dexdec-sb-st-2649", this.d1.getThread().getName()}));
        }
    }

    @Override  // androidx.media3.common.Player
    public final int i() {
        this.i6();
        return this.h1.g;
    }

    @Override  // androidx.media3.common.Player
    public final void i0(MediaMetadata mediaMetadata0) {
        this.i6();
        State simpleBasePlayer$State0 = this.h1;
        if(!this.d6(19)) {
            return;
        }
        this.f6(this.H4(mediaMetadata0), () -> simpleBasePlayer$State0.a().n0(mediaMetadata0).O());
    }

    @Override  // androidx.media3.common.Player
    public final long i2() {
        this.i6();
        return this.W() ? Math.max(this.h1.H.get(), this.h1.F.get()) : this.e1();
    }

    @g
    protected State i4(State simpleBasePlayer$State0) {
        return simpleBasePlayer$State0;
    }

    // 检测为 Lambda 实现
    private static State i5(State simpleBasePlayer$State0, int v) [...]

    @d({"state"})
    private void i6() {
        this.h6();
        if(this.h1 == null) {
            this.h1 = this.m4();
        }
    }

    private static int j4(State simpleBasePlayer$State0, State simpleBasePlayer$State1, boolean z, Window timeline$Window0, Period timeline$Period0) {
        if(simpleBasePlayer$State1.J) {
            return simpleBasePlayer$State1.K;
        }
        if(z) {
            return 1;
        }
        if(simpleBasePlayer$State0.y.isEmpty()) {
            return -1;
        }
        if(simpleBasePlayer$State1.y.isEmpty()) {
            return 4;
        }
        int v = SimpleBasePlayer.Z3(simpleBasePlayer$State0, timeline$Window0, timeline$Period0);
        Object object0 = simpleBasePlayer$State0.z.s(v);
        int v1 = SimpleBasePlayer.Z3(simpleBasePlayer$State1, timeline$Window0, timeline$Period0);
        Object object1 = simpleBasePlayer$State1.z.s(v1);
        if(object0 instanceof PlaceholderUid && !(object1 instanceof PlaceholderUid)) {
            return -1;
        }
        if(object1.equals(object0) && simpleBasePlayer$State0.C == simpleBasePlayer$State1.C && simpleBasePlayer$State0.D == simpleBasePlayer$State1.D) {
            long v2 = SimpleBasePlayer.a4(simpleBasePlayer$State0, object0, timeline$Period0);
            if(Math.abs(v2 - SimpleBasePlayer.a4(simpleBasePlayer$State1, object1, timeline$Period0)) < 1000L) {
                return -1;
            }
            long v3 = SimpleBasePlayer.g4(simpleBasePlayer$State0, object0, timeline$Period0);
            return v3 != 0x8000000000000001L && v2 >= v3 ? 0 : 5;
        }
        if(simpleBasePlayer$State1.z.f(object0) == -1) {
            return 4;
        }
        long v4 = SimpleBasePlayer.a4(simpleBasePlayer$State0, object0, timeline$Period0);
        long v5 = SimpleBasePlayer.g4(simpleBasePlayer$State0, object0, timeline$Period0);
        return v5 != 0x8000000000000001L && v4 >= v5 ? 0 : 3;
    }

    // 检测为 Lambda 实现
    private State j5(List list0, State simpleBasePlayer$State0, int v, long v1) [...]

    @Override  // androidx.media3.common.Player
    public final void k0(int v, int v1) {
        this.i6();
        Assertions.a(v >= 0 && v1 >= v);
        State simpleBasePlayer$State0 = this.h1;
        int v2 = simpleBasePlayer$State0.y.size();
        if(this.d6(20) && v2 != 0 && v < v2) {
            int v3 = Math.min(v1, v2);
            if(v == v3) {
                return;
            }
            this.f6(this.y4(v, v3), () -> {
                ArrayList arrayList0 = new ArrayList(simpleBasePlayer$State0.y);
                Util.V1(arrayList0, v, v3);
                return SimpleBasePlayer.n4(simpleBasePlayer$State0, arrayList0, this.g1);
            });
        }
    }

    @Override  // androidx.media3.common.Player
    public final void k1(boolean z, int v) {
        this.i6();
        State simpleBasePlayer$State0 = this.h1;
        if(!this.d6(34)) {
            return;
        }
        this.f6(this.C4(z, v), () -> simpleBasePlayer$State0.a().d0(z).O());
    }

    private static PositionInfo k4(State simpleBasePlayer$State0, boolean z, Window timeline$Window0, Period timeline$Period0) {
        Object object2;
        Object object1;
        MediaItem mediaItem0;
        int v2;
        int v = SimpleBasePlayer.Y3(simpleBasePlayer$State0);
        if(simpleBasePlayer$State0.z.w()) {
            object1 = null;
            mediaItem0 = null;
            object2 = null;
            v2 = -1;
        }
        else {
            int v1 = SimpleBasePlayer.Z3(simpleBasePlayer$State0, timeline$Window0, timeline$Period0);
            Object object0 = simpleBasePlayer$State0.z.k(v1, timeline$Period0, true).b;
            Window timeline$Window1 = simpleBasePlayer$State0.z.t(v, timeline$Window0);
            v2 = v1;
            mediaItem0 = timeline$Window0.c;
            object1 = timeline$Window1.a;
            object2 = object0;
        }
        if(z) {
            return simpleBasePlayer$State0.C == -1 ? new PositionInfo(object1, v, mediaItem0, object2, v2, simpleBasePlayer$State0.L, simpleBasePlayer$State0.L, simpleBasePlayer$State0.C, simpleBasePlayer$State0.D) : new PositionInfo(object1, v, mediaItem0, object2, v2, simpleBasePlayer$State0.L, SimpleBasePlayer.X3(simpleBasePlayer$State0), simpleBasePlayer$State0.C, simpleBasePlayer$State0.D);
        }
        long v3 = SimpleBasePlayer.X3(simpleBasePlayer$State0);
        return simpleBasePlayer$State0.C == -1 ? new PositionInfo(object1, v, mediaItem0, object2, v2, v3, v3, simpleBasePlayer$State0.C, simpleBasePlayer$State0.D) : new PositionInfo(object1, v, mediaItem0, object2, v2, simpleBasePlayer$State0.F.get(), v3, simpleBasePlayer$State0.C, simpleBasePlayer$State0.D);
    }

    // 检测为 Lambda 实现
    private static State k5(State simpleBasePlayer$State0, boolean z) [...]

    @Override  // androidx.media3.common.Player
    public final void l(PlaybackParameters playbackParameters0) {
        this.i6();
        State simpleBasePlayer$State0 = this.h1;
        if(!this.d6(13)) {
            return;
        }
        this.f6(this.G4(playbackParameters0), () -> simpleBasePlayer$State0.a().i0(playbackParameters0).O());
    }

    private static long l4(long v, State simpleBasePlayer$State0) {
        if(v != 0x8000000000000001L) {
            return v;
        }
        if(simpleBasePlayer$State0.y.isEmpty()) {
            return 0L;
        }
        int v1 = SimpleBasePlayer.Y3(simpleBasePlayer$State0);
        return Util.B2(((MediaItemData)simpleBasePlayer$State0.y.get(v1)).l);
    }

    // 检测为 Lambda 实现
    private static State l5(State simpleBasePlayer$State0, PlaybackParameters playbackParameters0) [...]

    @Override  // androidx.media3.common.Player
    public final PlaybackParameters m() {
        this.i6();
        return this.h1.m;
    }

    @g
    protected abstract State m4();

    // 检测为 Lambda 实现
    private static State m5(State simpleBasePlayer$State0, MediaMetadata mediaMetadata0) [...]

    @Override  // androidx.media3.common.Player
    public final void n() {
        this.i6();
        State simpleBasePlayer$State0 = this.h1;
        if(!this.d6(2)) {
            return;
        }
        this.f6(this.w4(), () -> {
            androidx.media3.common.SimpleBasePlayer.State.Builder simpleBasePlayer$State$Builder0 = simpleBasePlayer$State0.a().l0(null);
            return simpleBasePlayer$State0.z.w() ? simpleBasePlayer$State$Builder0.j0(4).O() : simpleBasePlayer$State$Builder0.j0(2).O();
        });
    }

    @Override  // androidx.media3.common.Player
    public final int n2() {
        this.i6();
        return SimpleBasePlayer.Y3(this.h1);
    }

    private static State n4(State simpleBasePlayer$State0, List list0, Period timeline$Period0) {
        androidx.media3.common.SimpleBasePlayer.State.Builder simpleBasePlayer$State$Builder0 = simpleBasePlayer$State0.a();
        simpleBasePlayer$State$Builder0.m0(list0);
        Timeline timeline0 = simpleBasePlayer$State$Builder0.z;
        long v = simpleBasePlayer$State0.E.get();
        int v1 = SimpleBasePlayer.Y3(simpleBasePlayer$State0);
        int v2 = SimpleBasePlayer.c4(simpleBasePlayer$State0.y, timeline0, v1, timeline$Period0);
        long v3 = v2 == -1 ? 0x8000000000000001L : v;
        for(int v4 = v1 + 1; v2 == -1 && v4 < simpleBasePlayer$State0.y.size(); ++v4) {
            v2 = SimpleBasePlayer.c4(simpleBasePlayer$State0.y, timeline0, v4, timeline$Period0);
        }
        if(simpleBasePlayer$State0.d != 1 && v2 == -1) {
            simpleBasePlayer$State$Builder0.j0(4).e0(false);
        }
        return SimpleBasePlayer.U3(simpleBasePlayer$State$Builder0, simpleBasePlayer$State0, v, list0, v2, v3, true);
    }

    // 检测为 Lambda 实现
    private static State n5(State simpleBasePlayer$State0, int v) [...]

    @Override  // androidx.media3.common.Player
    public final void o(float f) {
        this.i6();
        State simpleBasePlayer$State0 = this.h1;
        if(!this.d6(24)) {
            return;
        }
        this.f6(this.M4(f), () -> simpleBasePlayer$State0.a().y0(f).O());
    }

    private static State o4(State simpleBasePlayer$State0, List list0, int v, long v1) {
        androidx.media3.common.SimpleBasePlayer.State.Builder simpleBasePlayer$State$Builder0 = simpleBasePlayer$State0.a();
        simpleBasePlayer$State$Builder0.m0(list0);
        if(simpleBasePlayer$State0.d != 1) {
            if(!list0.isEmpty() && (v == -1 || v < list0.size())) {
                simpleBasePlayer$State$Builder0.j0(2);
                return SimpleBasePlayer.U3(simpleBasePlayer$State$Builder0, simpleBasePlayer$State0, simpleBasePlayer$State0.E.get(), list0, v, v1, false);
            }
            simpleBasePlayer$State$Builder0.j0(4).e0(false);
        }
        return SimpleBasePlayer.U3(simpleBasePlayer$State$Builder0, simpleBasePlayer$State0, simpleBasePlayer$State0.E.get(), list0, v, v1, false);
    }

    // 检测为 Lambda 实现
    private static State o5(State simpleBasePlayer$State0, boolean z) [...]

    private static Size p4(SurfaceHolder surfaceHolder0) {
        if(!surfaceHolder0.getSurface().isValid()) {
            return Size.d;
        }
        Rect rect0 = surfaceHolder0.getSurfaceFrame();
        return new Size(rect0.width(), rect0.height());
    }

    // 检测为 Lambda 实现
    private static State p5(State simpleBasePlayer$State0, TrackSelectionParameters trackSelectionParameters0) [...]

    @Override  // androidx.media3.common.Player
    public final void q(int v) {
        this.i6();
        State simpleBasePlayer$State0 = this.h1;
        if(!this.d6(15)) {
            return;
        }
        this.f6(this.I4(v), () -> simpleBasePlayer$State0.a().p0(v).O());
    }

    private static int q4(List list0, List list1) {
        if(list0.size() != list1.size()) {
            return 0;
        }
        for(int v = 0; true; ++v) {
            boolean z = true;
            if(v >= list0.size()) {
                break;
            }
            Object object0 = ((MediaItemData)list0.get(v)).a;
            Object object1 = ((MediaItemData)list1.get(v)).a;
            if(!(object0 instanceof PlaceholderUid) || object1 instanceof PlaceholderUid) {
                z = false;
            }
            if(!object0.equals(object1) && !z) {
                return 0;
            }
        }
        return 1;
    }

    // 检测为 Lambda 实现
    private static State q5(State simpleBasePlayer$State0) [...]

    @Override  // androidx.media3.common.Player
    public final Tracks r0() {
        this.i6();
        return SimpleBasePlayer.b4(this.h1);
    }

    @Override  // androidx.media3.common.Player
    public final void r2(int v, int v1, int v2) {
        this.i6();
        Assertions.a(v >= 0 && v1 >= v && v2 >= 0);
        State simpleBasePlayer$State0 = this.h1;
        int v3 = simpleBasePlayer$State0.y.size();
        if(this.d6(20) && v3 != 0 && v < v3) {
            int v4 = Math.min(v1, v3);
            int v5 = Math.min(v2, simpleBasePlayer$State0.y.size() - (v4 - v));
            if(v != v4 && v5 != v) {
                this.f6(this.v4(v, v4, v5), () -> {
                    ArrayList arrayList0 = new ArrayList(simpleBasePlayer$State0.y);
                    Util.E1(arrayList0, v, v4, v5);
                    return SimpleBasePlayer.n4(simpleBasePlayer$State0, arrayList0, this.g1);
                });
            }
        }
    }

    @g
    protected t0 r4(int v, List list0) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    // 检测为 Lambda 实现
    private static State r5(State simpleBasePlayer$State0, SurfaceHolder surfaceHolder0) [...]

    @Override  // androidx.media3.common.Player
    public final void release() {
        this.i6();
        State simpleBasePlayer$State0 = this.h1;
        if(!this.d6(0x20)) {
            return;
        }
        this.f6(this.x4(), () -> simpleBasePlayer$State0);
        this.i1 = true;
        this.c1.k();
        this.h1 = this.h1.a().j0(1).v0(PositionSupplier.a).V(G0.a(SimpleBasePlayer.X3(simpleBasePlayer$State0))).Q(simpleBasePlayer$State0.F).e0(false).O();
    }

    @Override  // androidx.media3.common.Player
    public final void s(@Nullable Surface surface0) {
        this.i6();
        State simpleBasePlayer$State0 = this.h1;
        if(!this.d6(27)) {
            return;
        }
        if(surface0 == null) {
            this.Q();
            return;
        }
        this.f6(this.L4(surface0), () -> simpleBasePlayer$State0.a().t0(Size.c).O());
    }

    @g
    protected t0 s4(@Nullable Object object0) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
    }

    // 检测为 Lambda 实现
    private static State s5(State simpleBasePlayer$State0, SurfaceView surfaceView0) [...]

    @Override  // androidx.media3.common.Player
    public final void stop() {
        this.i6();
        State simpleBasePlayer$State0 = this.h1;
        if(!this.d6(3)) {
            return;
        }
        this.f6(this.N4(), () -> simpleBasePlayer$State0.a().j0(1).v0(PositionSupplier.a).V(G0.a(SimpleBasePlayer.X3(simpleBasePlayer$State0))).Q(simpleBasePlayer$State0.F).e0(false).O());
    }

    @Override  // androidx.media3.common.Player
    public final void t(@Nullable SurfaceView surfaceView0) {
        this.i6();
        State simpleBasePlayer$State0 = this.h1;
        if(!this.d6(27)) {
            return;
        }
        if(surfaceView0 == null) {
            this.Q();
            return;
        }
        this.f6(this.L4(surfaceView0), () -> simpleBasePlayer$State0.a().t0(SimpleBasePlayer.p4(surfaceView0.getHolder())).O());
    }

    @Override  // androidx.media3.common.Player
    public final boolean t2() {
        this.i6();
        return this.h1.h;
    }

    @g
    protected t0 t4(int v) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    // 检测为 Lambda 实现
    private static State t5(State simpleBasePlayer$State0, Size size0) [...]

    @Override  // androidx.media3.common.Player
    public final void u(@Nullable SurfaceHolder surfaceHolder0) {
        this.i6();
        State simpleBasePlayer$State0 = this.h1;
        if(!this.d6(27)) {
            return;
        }
        if(surfaceHolder0 == null) {
            this.Q();
            return;
        }
        this.f6(this.L4(surfaceHolder0), () -> simpleBasePlayer$State0.a().t0(SimpleBasePlayer.p4(surfaceHolder0)).O());
    }

    @Override  // androidx.media3.common.Player
    public final int u0() {
        this.i6();
        return this.h1.C;
    }

    @g
    protected t0 u4(int v) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    // 检测为 Lambda 实现
    private static State u5(State simpleBasePlayer$State0, float f) [...]

    @Override  // androidx.media3.common.Player
    @Deprecated
    public final void v(boolean z) {
        this.i6();
        State simpleBasePlayer$State0 = this.h1;
        if(!this.d6(26)) {
            return;
        }
        this.f6(this.C4(z, 1), () -> simpleBasePlayer$State0.a().d0(z).O());
    }

    @Override  // androidx.media3.common.Player
    public final Size v1() {
        this.i6();
        return this.h1.v;
    }

    @g
    protected t0 v4(int v, int v1, int v2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    // 检测为 Lambda 实现
    private static State v5(State simpleBasePlayer$State0) [...]

    @Override  // androidx.media3.common.Player
    @Deprecated
    public final void w() {
        this.i6();
        State simpleBasePlayer$State0 = this.h1;
        if(!this.d6(26)) {
            return;
        }
        this.f6(this.u4(1), () -> simpleBasePlayer$State0.a().c0(simpleBasePlayer$State0.t + 1).O());
    }

    @Override  // androidx.media3.common.Player
    public final MediaMetadata w2() {
        this.i6();
        return SimpleBasePlayer.e4(this.h1);
    }

    @g
    protected t0 w4() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_PREPARE");
    }

    // 检测为 Lambda 实现
    private static void w5(State simpleBasePlayer$State0, int v, Listener player$Listener0) [...]

    @Override  // androidx.media3.common.Player
    public final void x(@Nullable SurfaceHolder surfaceHolder0) {
        this.V3(surfaceHolder0);
    }

    @Override  // androidx.media3.common.Player
    public final long x2() {
        this.i6();
        return this.h1.j;
    }

    @g
    protected t0 x4() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_RELEASE");
    }

    // 检测为 Lambda 实现
    private static void x5(int v, PositionInfo player$PositionInfo0, PositionInfo player$PositionInfo1, Listener player$Listener0) [...]

    @g
    protected t0 y4(int v, int v1) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    // 检测为 Lambda 实现
    private static void y5(MediaItem mediaItem0, int v, Listener player$Listener0) [...]

    @Override  // androidx.media3.common.Player
    public final int z() {
        this.i6();
        return this.h1.t;
    }

    @g
    protected t0 z4(int v, int v1, List list0) {
        return Util.z2(this.r4(v1, list0), (Object object0) -> this.y4(v, v1));
    }

    // 检测为 Lambda 实现
    private static void z5(State simpleBasePlayer$State0, Listener player$Listener0) [...]

    class androidx.media3.common.SimpleBasePlayer.1 {
    }

}

