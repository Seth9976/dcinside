package com.vungle.ads.internal.signals;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.annotation.VisibleForTesting;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.k;
import com.vungle.ads.internal.model.p;
import com.vungle.ads.internal.session.d;
import com.vungle.ads.internal.util.q;
import j..util.concurrent.ConcurrentHashMap;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.w;
import kotlinx.serialization.i;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.f;
import kotlinx.serialization.json.s;
import kotlinx.serialization.z;
import y4.l;
import y4.m;

public final class c {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    public static final a Companion = null;
    @l
    public static final String SESSION_COUNT_KEY = "vungle_signal_session_count";
    private static final int SESSION_COUNT_NOT_SET = -1;
    @l
    public static final String SESSION_TIME_KEY = "vungle_signal_session_creation_time";
    public static final int SIGNAL_VERSION = 1;
    @l
    private static final String TAG = "SignalManager";
    public static final long TWENTY_FOUR_HOURS_MILLIS = 86400000L;
    @l
    private final Context context;
    @l
    private com.vungle.ads.internal.signals.a currentSession;
    private long enterBackgroundTime;
    private long enterForegroundTime;
    @l
    private final D filePreferences$delegate;
    @l
    private final b json;
    @l
    private ConcurrentHashMap mapOfLastLoadTimes;
    private int sessionCount;
    private long sessionDuration;
    private long sessionSeriesCreatedTime;
    @l
    private d unclosedAdDetector;

    static {
        c.Companion = new a(null);
    }

    public c(@l Context context0) {
        static final class com.vungle.ads.internal.signals.c.b extends N implements Function1 {
            public static final com.vungle.ads.internal.signals.c.b INSTANCE;

            static {
                com.vungle.ads.internal.signals.c.b.INSTANCE = new com.vungle.ads.internal.signals.c.b();
            }

            com.vungle.ads.internal.signals.c.b() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((f)object0));
                return S0.a;
            }

            public final void invoke(@l f f0) {
                L.p(f0, "$this$Json");
                f0.w(true);
                f0.u(true);
                f0.v(false);
            }
        }


        public static final class com.vungle.ads.internal.signals.c.d extends N implements A3.a {
            final Context $context;

            public com.vungle.ads.internal.signals.c.d(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.persistence.b.class);
            }
        }


        public static final class e extends N implements A3.a {
            final Context $context;

            public e(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.a.class);
            }
        }


        public static final class com.vungle.ads.internal.signals.c.f extends N implements A3.a {
            final Context $context;

            public com.vungle.ads.internal.signals.c.f(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(q.class);
            }
        }

        L.p(context0, "context");
        super();
        this.context = context0;
        this.json = s.b(null, com.vungle.ads.internal.signals.c.b.INSTANCE, 1, null);
        this.enterForegroundTime = System.currentTimeMillis();
        this.sessionCount = -1;
        this.mapOfLastLoadTimes = new ConcurrentHashMap();
        com.vungle.ads.internal.signals.c.d c$d0 = new com.vungle.ads.internal.signals.c.d(context0);
        this.filePreferences$delegate = E.c(H.a, c$d0);
        this.registerNotifications();
        this.sessionSeriesCreatedTime = this.getFilePreferences().getLong("vungle_signal_session_creation_time", -1L);
        this.updateSessionCount();
        this.currentSession = new com.vungle.ads.internal.signals.a(-1);
        e c$e0 = new e(context0);
        D d0 = E.c(H.a, c$e0);
        com.vungle.ads.internal.signals.c.f c$f0 = new com.vungle.ads.internal.signals.c.f(context0);
        D d1 = E.c(H.a, c$f0);
        d d2 = new d(context0, this.currentSession.getSessionId(), c._init_$lambda-0(d0), c._init_$lambda-1(d1));
        this.unclosedAdDetector = d2;
        this.currentSession.setUnclosedAd(d2.retrieveUnclosedAd());
    }

    private static final com.vungle.ads.internal.executor.a _init_$lambda-0(D d0) {
        return (com.vungle.ads.internal.executor.a)d0.getValue();
    }

    private static final q _init_$lambda-1(D d0) {
        return (q)d0.getValue();
    }

    public final void createNewSessionData() {
        this.updateSessionCount();
        this.currentSession = new com.vungle.ads.internal.signals.a(this.sessionCount);
    }

    @m
    public final String generateSignals() {
        this.updateSessionDuration();
        try {
            com.vungle.ads.internal.signals.a a0 = this.currentSession;
            i i0 = z.k(this.json.a(), m0.A(com.vungle.ads.internal.signals.a.class));
            L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            return "1:" + this.json.c(i0, a0);
        }
        catch(Exception | Error unused_ex) {
            return null;
        }
    }

    @l
    public final Context getContext() {
        return this.context;
    }

    @l
    public final com.vungle.ads.internal.signals.a getCurrentSession$vungle_ads_release() {
        return this.currentSession;
    }

    @VisibleForTesting(otherwise = 2)
    public static void getCurrentSession$vungle_ads_release$annotations() {
    }

    public final long getEnterBackgroundTime() {
        return this.enterBackgroundTime;
    }

    public final long getEnterForegroundTime() {
        return this.enterForegroundTime;
    }

    @l
    public final com.vungle.ads.internal.persistence.b getFilePreferences() {
        return (com.vungle.ads.internal.persistence.b)this.filePreferences$delegate.getValue();
    }

    @l
    public final ConcurrentHashMap getMapOfLastLoadTimes() {
        return this.mapOfLastLoadTimes;
    }

    public final int getSessionCount() {
        return this.sessionCount;
    }

    public final long getSessionDuration() {
        return this.sessionDuration;
    }

    public final long getSessionSeriesCreatedTime() {
        return this.sessionSeriesCreatedTime;
    }

    @l
    public final com.vungle.ads.internal.signals.d getSignaledAd(@l String s) {
        synchronized(this) {
            L.p(s, "placementId");
            long v1 = System.currentTimeMillis();
            Long long0 = this.mapOfLastLoadTimes.containsKey(s) ? ((Long)this.mapOfLastLoadTimes.get(s)) : null;
            this.mapOfLastLoadTimes.put(s, v1);
            return new com.vungle.ads.internal.signals.d(long0, v1);
        }
    }

    @l
    public final String getUuid() {
        return this.currentSession.getSessionId();
    }

    public final void increaseSessionDepthCounter() {
        synchronized(this) {
            this.currentSession.setSessionDepthCounter(this.currentSession.getSessionDepthCounter() + 1);
        }
    }

    public final void recordUnclosedAd(@l p p0) {
        L.p(p0, "unclosedAd");
        if(k.INSTANCE.signalsDisabled()) {
            return;
        }
        this.unclosedAdDetector.addUnclosedAd(p0);
    }

    private final void registerNotifications() {
        public static final class com.vungle.ads.internal.signals.c.c extends com.vungle.ads.internal.util.b.b {
            com.vungle.ads.internal.signals.c.c(c c0) {
                c.this = c0;
                super();
            }

            @Override  // com.vungle.ads.internal.util.b$b
            public void onBackground() {
                com.vungle.ads.internal.util.p.Companion.d("SignalManager", "SignalManager#onBackground()");
                c.this.setEnterBackgroundTime(System.currentTimeMillis());
                long v = c.this.getSessionDuration();
                long v1 = c.this.getEnterBackgroundTime();
                long v2 = c.this.getEnterForegroundTime();
                c.this.setSessionDuration(v + (v1 - v2));
            }

            @Override  // com.vungle.ads.internal.util.b$b
            public void onForeground() {
                com.vungle.ads.internal.util.p.Companion.d("SignalManager", "SignalManager#onForeground()");
                long v = System.currentTimeMillis();
                if(v - c.this.getEnterBackgroundTime() > k.INSTANCE.getSignalsSessionTimeout()) {
                    c.this.createNewSessionData();
                }
                c.this.setEnterForegroundTime(v);
                c.this.setEnterBackgroundTime(0L);
            }
        }

        com.vungle.ads.internal.signals.c.c c$c0 = new com.vungle.ads.internal.signals.c.c(this);
        com.vungle.ads.internal.util.b.Companion.addLifecycleListener(c$c0);
    }

    public final void registerSignaledAd(@m Context context0, @l com.vungle.ads.internal.signals.d d0) {
        L.p(d0, "signaledAd");
        this.currentSession.getSignaledAd().clear();
        this.currentSession.getSignaledAd().add(d0);
        ((com.vungle.ads.internal.signals.d)this.currentSession.getSignaledAd().get(0)).setScreenOrientation(this.screenOrientation(context0));
    }

    public final void removeUnclosedAd(@l p p0) {
        L.p(p0, "unclosedAd");
        if(k.INSTANCE.signalsDisabled()) {
            return;
        }
        this.unclosedAdDetector.removeUnclosedAd(p0);
    }

    public final int screenOrientation(@m Context context0) {
        Integer integer0;
        if(context0 == null) {
            context0 = this.context;
        }
        Resources resources0 = context0.getResources();
        if(resources0 == null) {
            integer0 = null;
        }
        else {
            Configuration configuration0 = resources0.getConfiguration();
            integer0 = configuration0 == null ? null : configuration0.orientation;
        }
        if((integer0 == null || ((int)integer0) != 2) && (integer0 == null || ((int)integer0) != 1)) {
            return integer0 == null || ((int)integer0) != 0 ? -1 : 0;
        }
        return 2;
    }

    public final void setCurrentSession$vungle_ads_release(@l com.vungle.ads.internal.signals.a a0) {
        L.p(a0, "<set-?>");
        this.currentSession = a0;
    }

    public final void setEnterBackgroundTime(long v) {
        this.enterBackgroundTime = v;
    }

    public final void setEnterForegroundTime(long v) {
        this.enterForegroundTime = v;
    }

    public final void setMapOfLastLoadTimes(@l ConcurrentHashMap concurrentHashMap0) {
        L.p(concurrentHashMap0, "<set-?>");
        this.mapOfLastLoadTimes = concurrentHashMap0;
    }

    public final void setSessionCount(int v) {
        this.sessionCount = v;
    }

    public final void setSessionDuration(long v) {
        this.sessionDuration = v;
    }

    public final void setSessionSeriesCreatedTime(long v) {
        this.sessionSeriesCreatedTime = v;
    }

    private final void updateSessionCount() {
        if(this.sessionCount == -1) {
            this.sessionCount = this.getFilePreferences().getInt("vungle_signal_session_count", 0);
        }
        long v = System.currentTimeMillis();
        if(this.sessionSeriesCreatedTime < 0L || v - this.sessionSeriesCreatedTime >= 86400000L) {
            this.sessionCount = 1;
            this.getFilePreferences().put("vungle_signal_session_creation_time", v);
            this.sessionSeriesCreatedTime = v;
        }
        else {
            ++this.sessionCount;
        }
        this.getFilePreferences().put("vungle_signal_session_count", this.sessionCount);
        this.getFilePreferences().apply();
    }

    private final void updateSessionDuration() {
        this.currentSession.setSessionDuration(this.sessionDuration + System.currentTimeMillis() - this.enterForegroundTime);
    }

    public final void updateTemplateSignals(@m String s) {
        if(s != null && s.length() != 0 && !this.currentSession.getSignaledAd().isEmpty()) {
            ((com.vungle.ads.internal.signals.d)this.currentSession.getSignaledAd().get(0)).setTemplateSignals(s);
        }
    }
}

