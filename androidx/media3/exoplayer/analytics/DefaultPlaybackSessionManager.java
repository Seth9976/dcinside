package androidx.media3.exoplayer.analytics;

import androidx.annotation.Nullable;
import androidx.media3.common.Timeline.Period;
import androidx.media3.common.Timeline.Window;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import com.google.common.base.Q;
import h4.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

@UnstableApi
public final class DefaultPlaybackSessionManager implements PlaybackSessionManager {
    final class SessionDescriptor {
        private final String a;
        private int b;
        private long c;
        private MediaPeriodId d;
        private boolean e;
        private boolean f;
        final DefaultPlaybackSessionManager g;

        public SessionDescriptor(String s, int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
            this.a = s;
            this.b = v;
            this.c = mediaSource$MediaPeriodId0 == null ? -1L : mediaSource$MediaPeriodId0.d;
            if(mediaSource$MediaPeriodId0 != null && mediaSource$MediaPeriodId0.c()) {
                this.d = mediaSource$MediaPeriodId0;
            }
        }

        public boolean i(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
            if(mediaSource$MediaPeriodId0 == null) {
                return v == this.b;
            }
            return this.d == null ? !mediaSource$MediaPeriodId0.c() && mediaSource$MediaPeriodId0.d == this.c : mediaSource$MediaPeriodId0.d == this.d.d && mediaSource$MediaPeriodId0.b == this.d.b && mediaSource$MediaPeriodId0.c == this.d.c;
        }

        public boolean j(EventTime analyticsListener$EventTime0) {
            MediaPeriodId mediaSource$MediaPeriodId0 = analyticsListener$EventTime0.d;
            if(mediaSource$MediaPeriodId0 == null) {
                return this.b != analyticsListener$EventTime0.c;
            }
            long v = this.c;
            if(v == -1L) {
                return false;
            }
            if(mediaSource$MediaPeriodId0.d > v) {
                return true;
            }
            if(this.d == null) {
                return false;
            }
            int v1 = analyticsListener$EventTime0.b.f(mediaSource$MediaPeriodId0.a);
            int v2 = analyticsListener$EventTime0.b.f(this.d.a);
            MediaPeriodId mediaSource$MediaPeriodId1 = analyticsListener$EventTime0.d;
            if(mediaSource$MediaPeriodId1.d >= this.d.d && v1 >= v2) {
                if(v1 > v2) {
                    return true;
                }
                if(mediaSource$MediaPeriodId1.c()) {
                    int v3 = analyticsListener$EventTime0.d.b;
                    int v4 = this.d.b;
                    return v3 > v4 || v3 == v4 && analyticsListener$EventTime0.d.c > this.d.c;
                }
                int v5 = analyticsListener$EventTime0.d.e;
                return v5 == -1 || v5 > this.d.b;
            }
            return false;
        }

        public void k(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
            if(this.c == -1L && v == this.b && mediaSource$MediaPeriodId0 != null) {
                long v1 = DefaultPlaybackSessionManager.this.o();
                if(mediaSource$MediaPeriodId0.d >= v1) {
                    this.c = mediaSource$MediaPeriodId0.d;
                }
            }
        }

        private int l(Timeline timeline0, Timeline timeline1, int v) {
            if(v >= timeline0.v()) {
                return v < timeline1.v() ? v : -1;
            }
            timeline0.t(v, DefaultPlaybackSessionManager.this.a);
            for(int v1 = DefaultPlaybackSessionManager.this.a.n; v1 <= DefaultPlaybackSessionManager.this.a.o; ++v1) {
                int v2 = timeline1.f(timeline0.s(v1));
                if(v2 != -1) {
                    return timeline1.j(v2, DefaultPlaybackSessionManager.this.b).c;
                }
            }
            return -1;
        }

        public boolean m(Timeline timeline0, Timeline timeline1) {
            int v = this.l(timeline0, timeline1, this.b);
            this.b = v;
            if(v == -1) {
                return false;
            }
            return this.d == null ? true : timeline1.f(this.d.a) != -1;
        }
    }

    private final Window a;
    private final Period b;
    private final HashMap c;
    private final Q d;
    private Listener e;
    private Timeline f;
    @Nullable
    private String g;
    private long h;
    public static final Q i = null;
    private static final Random j = null;
    private static final int k = 12;

    static {
        DefaultPlaybackSessionManager.i = () -> // 去混淆评级： 低(20)
        "ddlKXU6kLLf7zogz";
        DefaultPlaybackSessionManager.j = new Random();
    }

    public DefaultPlaybackSessionManager() {
        this(DefaultPlaybackSessionManager.i);
    }

    public DefaultPlaybackSessionManager(Q q0) {
        this.d = q0;
        this.a = new Window();
        this.b = new Period();
        this.c = new HashMap();
        this.f = Timeline.a;
        this.h = -1L;
    }

    @Override  // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public void a(EventTime analyticsListener$EventTime0) {
        SessionDescriptor defaultPlaybackSessionManager$SessionDescriptor4;
        SessionDescriptor defaultPlaybackSessionManager$SessionDescriptor3;
        synchronized(this) {
            Assertions.g(this.e);
            if(analyticsListener$EventTime0.b.w()) {
                return;
            }
            MediaPeriodId mediaSource$MediaPeriodId0 = analyticsListener$EventTime0.d;
            if(mediaSource$MediaPeriodId0 != null) {
                long v1 = this.o();
                if(mediaSource$MediaPeriodId0.d < v1) {
                    return;
                }
                SessionDescriptor defaultPlaybackSessionManager$SessionDescriptor0 = (SessionDescriptor)this.c.get(this.g);
                if(defaultPlaybackSessionManager$SessionDescriptor0 != null && defaultPlaybackSessionManager$SessionDescriptor0.c == -1L && defaultPlaybackSessionManager$SessionDescriptor0.b != analyticsListener$EventTime0.c) {
                    return;
                }
            }
            SessionDescriptor defaultPlaybackSessionManager$SessionDescriptor1 = this.p(analyticsListener$EventTime0.c, analyticsListener$EventTime0.d);
            if(this.g == null) {
                this.g = defaultPlaybackSessionManager$SessionDescriptor1.a;
            }
            if(analyticsListener$EventTime0.d == null || !analyticsListener$EventTime0.d.c()) {
                defaultPlaybackSessionManager$SessionDescriptor3 = defaultPlaybackSessionManager$SessionDescriptor1;
            }
            else {
                MediaPeriodId mediaSource$MediaPeriodId1 = new MediaPeriodId(analyticsListener$EventTime0.d.a, analyticsListener$EventTime0.d.d, analyticsListener$EventTime0.d.b);
                SessionDescriptor defaultPlaybackSessionManager$SessionDescriptor2 = this.p(analyticsListener$EventTime0.c, mediaSource$MediaPeriodId1);
                if(defaultPlaybackSessionManager$SessionDescriptor2.e) {
                    defaultPlaybackSessionManager$SessionDescriptor3 = defaultPlaybackSessionManager$SessionDescriptor1;
                }
                else {
                    defaultPlaybackSessionManager$SessionDescriptor2.e = true;
                    analyticsListener$EventTime0.b.l(analyticsListener$EventTime0.d.a, this.b);
                    long v2 = Math.max(0L, Util.B2(this.b.h(analyticsListener$EventTime0.d.b)) + this.b.q());
                    defaultPlaybackSessionManager$SessionDescriptor3 = defaultPlaybackSessionManager$SessionDescriptor1;
                    EventTime analyticsListener$EventTime1 = new EventTime(analyticsListener$EventTime0.a, analyticsListener$EventTime0.b, analyticsListener$EventTime0.c, mediaSource$MediaPeriodId1, v2, analyticsListener$EventTime0.f, analyticsListener$EventTime0.g, analyticsListener$EventTime0.h, analyticsListener$EventTime0.i, analyticsListener$EventTime0.j);
                    this.e.x0(analyticsListener$EventTime1, defaultPlaybackSessionManager$SessionDescriptor2.a);
                }
            }
            if(defaultPlaybackSessionManager$SessionDescriptor3.e) {
                defaultPlaybackSessionManager$SessionDescriptor4 = defaultPlaybackSessionManager$SessionDescriptor3;
            }
            else {
                defaultPlaybackSessionManager$SessionDescriptor4 = defaultPlaybackSessionManager$SessionDescriptor3;
                defaultPlaybackSessionManager$SessionDescriptor4.e = true;
                this.e.x0(analyticsListener$EventTime0, defaultPlaybackSessionManager$SessionDescriptor4.a);
            }
            if(defaultPlaybackSessionManager$SessionDescriptor4.a.equals(this.g) && !defaultPlaybackSessionManager$SessionDescriptor4.f) {
                defaultPlaybackSessionManager$SessionDescriptor4.f = true;
                this.e.z0(analyticsListener$EventTime0, defaultPlaybackSessionManager$SessionDescriptor4.a);
            }
        }
    }

    @Override  // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public void b(Listener playbackSessionManager$Listener0) {
        this.e = playbackSessionManager$Listener0;
    }

    @Override  // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public void c(EventTime analyticsListener$EventTime0, int v) {
        synchronized(this) {
            Assertions.g(this.e);
            Iterator iterator0 = this.c.values().iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                SessionDescriptor defaultPlaybackSessionManager$SessionDescriptor0 = (SessionDescriptor)object0;
                if(defaultPlaybackSessionManager$SessionDescriptor0.j(analyticsListener$EventTime0)) {
                    iterator0.remove();
                    if(defaultPlaybackSessionManager$SessionDescriptor0.e) {
                        boolean z = defaultPlaybackSessionManager$SessionDescriptor0.a.equals(this.g);
                        boolean z1 = v == 0 && z && defaultPlaybackSessionManager$SessionDescriptor0.f;
                        if(z) {
                            this.m(defaultPlaybackSessionManager$SessionDescriptor0);
                        }
                        this.e.E(analyticsListener$EventTime0, defaultPlaybackSessionManager$SessionDescriptor0.a, z1);
                    }
                }
            }
            this.q(analyticsListener$EventTime0);
        }
    }

    @Override  // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    @Nullable
    public String d() {
        synchronized(this) {
        }
        return this.g;
    }

    @Override  // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public String e(Timeline timeline0, MediaPeriodId mediaSource$MediaPeriodId0) {
        synchronized(this) {
            return this.p(timeline0.l(mediaSource$MediaPeriodId0.a, this.b).c, mediaSource$MediaPeriodId0).a;
        }
    }

    @Override  // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public boolean f(EventTime analyticsListener$EventTime0, String s) {
        synchronized(this) {
            SessionDescriptor defaultPlaybackSessionManager$SessionDescriptor0 = (SessionDescriptor)this.c.get(s);
            if(defaultPlaybackSessionManager$SessionDescriptor0 == null) {
                return false;
            }
            defaultPlaybackSessionManager$SessionDescriptor0.k(analyticsListener$EventTime0.c, analyticsListener$EventTime0.d);
            return defaultPlaybackSessionManager$SessionDescriptor0.i(analyticsListener$EventTime0.c, analyticsListener$EventTime0.d);
        }
    }

    @Override  // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public void g(EventTime analyticsListener$EventTime0) {
        synchronized(this) {
            Assertions.g(this.e);
            Timeline timeline0 = this.f;
            this.f = analyticsListener$EventTime0.b;
            Iterator iterator0 = this.c.values().iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                SessionDescriptor defaultPlaybackSessionManager$SessionDescriptor0 = (SessionDescriptor)object0;
                if(!defaultPlaybackSessionManager$SessionDescriptor0.m(timeline0, this.f) || defaultPlaybackSessionManager$SessionDescriptor0.j(analyticsListener$EventTime0)) {
                    iterator0.remove();
                    if(defaultPlaybackSessionManager$SessionDescriptor0.e) {
                        if(defaultPlaybackSessionManager$SessionDescriptor0.a.equals(this.g)) {
                            this.m(defaultPlaybackSessionManager$SessionDescriptor0);
                        }
                        this.e.E(analyticsListener$EventTime0, defaultPlaybackSessionManager$SessionDescriptor0.a, false);
                    }
                }
            }
            this.q(analyticsListener$EventTime0);
        }
    }

    @Override  // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public void h(EventTime analyticsListener$EventTime0) {
        synchronized(this) {
            String s = this.g;
            if(s != null) {
                this.m(((SessionDescriptor)Assertions.g(((SessionDescriptor)this.c.get(s)))));
            }
            Iterator iterator0 = this.c.values().iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                SessionDescriptor defaultPlaybackSessionManager$SessionDescriptor0 = (SessionDescriptor)object0;
                iterator0.remove();
                if(defaultPlaybackSessionManager$SessionDescriptor0.e) {
                    Listener playbackSessionManager$Listener0 = this.e;
                    if(playbackSessionManager$Listener0 != null) {
                        playbackSessionManager$Listener0.E(analyticsListener$EventTime0, defaultPlaybackSessionManager$SessionDescriptor0.a, false);
                    }
                }
            }
        }
    }

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    public static String i() [...]

    private void m(SessionDescriptor defaultPlaybackSessionManager$SessionDescriptor0) {
        if(defaultPlaybackSessionManager$SessionDescriptor0.c != -1L) {
            this.h = defaultPlaybackSessionManager$SessionDescriptor0.c;
        }
        this.g = null;
    }

    private static String n() [...] // 潜在的解密器

    private long o() {
        SessionDescriptor defaultPlaybackSessionManager$SessionDescriptor0 = (SessionDescriptor)this.c.get(this.g);
        return defaultPlaybackSessionManager$SessionDescriptor0 == null || defaultPlaybackSessionManager$SessionDescriptor0.c == -1L ? this.h + 1L : defaultPlaybackSessionManager$SessionDescriptor0.c;
    }

    private SessionDescriptor p(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
        SessionDescriptor defaultPlaybackSessionManager$SessionDescriptor0 = null;
        long v1 = 0x7FFFFFFFFFFFFFFFL;
        for(Object object0: this.c.values()) {
            SessionDescriptor defaultPlaybackSessionManager$SessionDescriptor1 = (SessionDescriptor)object0;
            defaultPlaybackSessionManager$SessionDescriptor1.k(v, mediaSource$MediaPeriodId0);
            if(defaultPlaybackSessionManager$SessionDescriptor1.i(v, mediaSource$MediaPeriodId0)) {
                long v2 = defaultPlaybackSessionManager$SessionDescriptor1.c;
                if(v2 != -1L) {
                    int v3 = Long.compare(v2, v1);
                    if(v3 >= 0) {
                        if(v3 != 0 || defaultPlaybackSessionManager$SessionDescriptor0.d == null || defaultPlaybackSessionManager$SessionDescriptor1.d == null) {
                            continue;
                        }
                        defaultPlaybackSessionManager$SessionDescriptor0 = defaultPlaybackSessionManager$SessionDescriptor1;
                        continue;
                    }
                }
                defaultPlaybackSessionManager$SessionDescriptor0 = defaultPlaybackSessionManager$SessionDescriptor1;
                v1 = v2;
            }
        }
        if(defaultPlaybackSessionManager$SessionDescriptor0 == null) {
            String s = (String)this.d.get();
            defaultPlaybackSessionManager$SessionDescriptor0 = new SessionDescriptor(this, s, v, mediaSource$MediaPeriodId0);
            this.c.put(s, defaultPlaybackSessionManager$SessionDescriptor0);
        }
        return defaultPlaybackSessionManager$SessionDescriptor0;
    }

    @m({"listener"})
    private void q(EventTime analyticsListener$EventTime0) {
        if(analyticsListener$EventTime0.b.w()) {
            String s = this.g;
            if(s != null) {
                this.m(((SessionDescriptor)Assertions.g(((SessionDescriptor)this.c.get(s)))));
            }
            return;
        }
        SessionDescriptor defaultPlaybackSessionManager$SessionDescriptor0 = (SessionDescriptor)this.c.get(this.g);
        SessionDescriptor defaultPlaybackSessionManager$SessionDescriptor1 = this.p(analyticsListener$EventTime0.c, analyticsListener$EventTime0.d);
        this.g = defaultPlaybackSessionManager$SessionDescriptor1.a;
        this.a(analyticsListener$EventTime0);
        if(analyticsListener$EventTime0.d != null && analyticsListener$EventTime0.d.c() && (defaultPlaybackSessionManager$SessionDescriptor0 == null || defaultPlaybackSessionManager$SessionDescriptor0.c != analyticsListener$EventTime0.d.d || defaultPlaybackSessionManager$SessionDescriptor0.d == null || defaultPlaybackSessionManager$SessionDescriptor0.d.b != analyticsListener$EventTime0.d.b || defaultPlaybackSessionManager$SessionDescriptor0.d.c != analyticsListener$EventTime0.d.c)) {
            MediaPeriodId mediaSource$MediaPeriodId0 = new MediaPeriodId(analyticsListener$EventTime0.d.a, analyticsListener$EventTime0.d.d);
            SessionDescriptor defaultPlaybackSessionManager$SessionDescriptor2 = this.p(analyticsListener$EventTime0.c, mediaSource$MediaPeriodId0);
            this.e.a(analyticsListener$EventTime0, defaultPlaybackSessionManager$SessionDescriptor2.a, defaultPlaybackSessionManager$SessionDescriptor1.a);
        }
    }
}

