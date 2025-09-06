package com.vungle.ads.internal.util;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class b implements Application.ActivityLifecycleCallbacks {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void addLifecycleListener(@l com.vungle.ads.internal.util.b.b b$b0) {
            L.p(b$b0, "listener");
            this.getInstance$vungle_ads_release().addListener(b$b0);
        }

        public final void deInit(@l Context context0) {
            L.p(context0, "context");
            this.getInstance$vungle_ads_release().deInit$vungle_ads_release(context0);
        }

        @l
        public final b getInstance$vungle_ads_release() {
            return b.instance;
        }

        @VisibleForTesting
        public static void getInstance$vungle_ads_release$annotations() {
        }

        public final void init(@l Context context0) {
            L.p(context0, "context");
            this.getInstance$vungle_ads_release().init(context0);
        }

        public final boolean isForeground() {
            return this.getInstance$vungle_ads_release().isAppInForeground();
        }

        private final boolean startActivityHandleException(Context context0, Intent intent0, Intent intent1, com.vungle.ads.internal.ui.b b0) {
            if(intent0 == null && intent1 == null) {
                return false;
            }
            try {
                if(intent0 == null) {
                    context0.startActivity(intent1);
                    return true;
                }
                context0.startActivity(intent0);
                if(b0 != null) {
                    b0.onDeeplinkClick(true);
                    return true;
                }
                return true;
            }
            catch(Exception exception0) {
            }
            p.Companion.e("ActivityManager", "Cannot launch/find activity to handle the Implicit intent: " + exception0);
            try {
                if(intent0 != null && b0 != null) {
                    b0.onDeeplinkClick(false);
                }
                if(intent0 != null && intent1 != null) {
                    context0.startActivity(intent1);
                    return true;
                }
            }
            catch(Exception unused_ex) {
            }
            return false;
        }

        public final boolean startWhenForeground(@l Context context0, @m Intent intent0, @m Intent intent1, @m com.vungle.ads.internal.ui.b b0) {
            L.p(context0, "context");
            if(this.isForeground()) {
                return this.startActivityHandleException(context0, intent0, intent1, b0);
            }
            this.getInstance$vungle_ads_release().targetActivityInfo = new c(new WeakReference(context0), intent0, intent1, b0);
            return false;
        }
    }

    public static class com.vungle.ads.internal.util.b.b {
        public void onBackground() {
        }

        public void onForeground() {
        }
    }

    static final class c {
        @m
        private final com.vungle.ads.internal.ui.b adOpenCallback;
        @l
        private final WeakReference context;
        @m
        private final Intent deepLinkOverrideIntent;
        @m
        private final Intent defaultIntent;

        public c(@l WeakReference weakReference0, @m Intent intent0, @m Intent intent1, @m com.vungle.ads.internal.ui.b b0) {
            L.p(weakReference0, "context");
            super();
            this.context = weakReference0;
            this.deepLinkOverrideIntent = intent0;
            this.defaultIntent = intent1;
            this.adOpenCallback = b0;
        }

        @l
        public final WeakReference component1() {
            return this.context;
        }

        @m
        public final Intent component2() {
            return this.deepLinkOverrideIntent;
        }

        @m
        public final Intent component3() {
            return this.defaultIntent;
        }

        @m
        public final com.vungle.ads.internal.ui.b component4() {
            return this.adOpenCallback;
        }

        @l
        public final c copy(@l WeakReference weakReference0, @m Intent intent0, @m Intent intent1, @m com.vungle.ads.internal.ui.b b0) {
            L.p(weakReference0, "context");
            return new c(weakReference0, intent0, intent1, b0);
        }

        public static c copy$default(c b$c0, WeakReference weakReference0, Intent intent0, Intent intent1, com.vungle.ads.internal.ui.b b0, int v, Object object0) {
            if((v & 1) != 0) {
                weakReference0 = b$c0.context;
            }
            if((v & 2) != 0) {
                intent0 = b$c0.deepLinkOverrideIntent;
            }
            if((v & 4) != 0) {
                intent1 = b$c0.defaultIntent;
            }
            if((v & 8) != 0) {
                b0 = b$c0.adOpenCallback;
            }
            return b$c0.copy(weakReference0, intent0, intent1, b0);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof c)) {
                return false;
            }
            if(!L.g(this.context, ((c)object0).context)) {
                return false;
            }
            if(!L.g(this.deepLinkOverrideIntent, ((c)object0).deepLinkOverrideIntent)) {
                return false;
            }
            return L.g(this.defaultIntent, ((c)object0).defaultIntent) ? L.g(this.adOpenCallback, ((c)object0).adOpenCallback) : false;
        }

        @m
        public final com.vungle.ads.internal.ui.b getAdOpenCallback() {
            return this.adOpenCallback;
        }

        @l
        public final WeakReference getContext() {
            return this.context;
        }

        @m
        public final Intent getDeepLinkOverrideIntent() {
            return this.deepLinkOverrideIntent;
        }

        @m
        public final Intent getDefaultIntent() {
            return this.defaultIntent;
        }

        @Override
        public int hashCode() {
            int v = this.context.hashCode();
            int v1 = 0;
            int v2 = this.deepLinkOverrideIntent == null ? 0 : this.deepLinkOverrideIntent.hashCode();
            int v3 = this.defaultIntent == null ? 0 : this.defaultIntent.hashCode();
            com.vungle.ads.internal.ui.b b0 = this.adOpenCallback;
            if(b0 != null) {
                v1 = b0.hashCode();
            }
            return ((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v1;
        }

        @Override
        @l
        public String toString() {
            return "TargetActivityInfo(context=" + this.context + ", deepLinkOverrideIntent=" + this.deepLinkOverrideIntent + ", defaultIntent=" + this.defaultIntent + ", adOpenCallback=" + this.adOpenCallback + ')';
        }
    }

    @l
    public static final a Companion = null;
    @l
    private static final String TAG = "ActivityManager";
    @l
    private final CopyOnWriteArraySet callbacks;
    @l
    private final AtomicBoolean inBackground;
    @l
    private static final b instance;
    @l
    private AtomicBoolean isInitialized;
    @m
    private String lastStoppedActivityName;
    @l
    private final CopyOnWriteArraySet startedActivities;
    @m
    private c targetActivityInfo;

    static {
        b.Companion = new a(null);
        b.instance = new b();
    }

    private b() {
        this.isInitialized = new AtomicBoolean(false);
        this.startedActivities = new CopyOnWriteArraySet();
        this.callbacks = new CopyOnWriteArraySet();
        this.inBackground = new AtomicBoolean(false);
    }

    public final void addListener(@l com.vungle.ads.internal.util.b.b b$b0) {
        L.p(b$b0, "callback");
        this.callbacks.add(b$b0);
    }

    public final void deInit$vungle_ads_release(@l Context context0) {
        L.p(context0, "context");
        Context context1 = context0.getApplicationContext();
        L.n(context1, "null cannot be cast to non-null type android.app.Application");
        ((Application)context1).unregisterActivityLifecycleCallbacks(this);
        this.startedActivities.clear();
        this.isInitialized.set(false);
        this.callbacks.clear();
    }

    private final void init(Context context0) {
        if(this.isInitialized.getAndSet(true)) {
            return;
        }
        try {
            com.vungle.ads.internal.util.a a0 = () -> {
                L.p(context0, "$context");
                L.p(this, "this$0");
                Context context1 = context0.getApplicationContext();
                L.n(context1, "null cannot be cast to non-null type android.app.Application");
                ((Application)context1).registerActivityLifecycleCallbacks(this);
            };
            v.INSTANCE.runOnUiThread(a0);
        }
        catch(Exception exception0) {
            p.Companion.e("ActivityManager", "Error initializing ActivityManager", exception0);
            this.isInitialized.set(false);
        }
    }

    // 检测为 Lambda 实现
    private static final void init$lambda-0(Context context0, b b0) [...]

    private final boolean isAppForeground() {
        return !this.startedActivities.isEmpty();
    }

    // 去混淆评级： 低(20)
    private final boolean isAppInForeground() {
        return !this.isInitialized.get() || this.lastStoppedActivityName == null || this.isAppForeground();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityCreated(@l Activity activity0, @m Bundle bundle0) {
        L.p(activity0, "activity");
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityDestroyed(@l Activity activity0) {
        L.p(activity0, "activity");
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityPaused(@l Activity activity0) {
        L.p(activity0, "activity");
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityResumed(@l Activity activity0) {
        L.p(activity0, "activity");
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@l Activity activity0, @l Bundle bundle0) {
        L.p(activity0, "activity");
        L.p(bundle0, "outState");
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStarted(@l Activity activity0) {
        L.p(activity0, "activity");
        this.startedActivities.add(activity0.toString());
        if(!this.inBackground.getAndSet(false)) {
            return;
        }
        for(Object object0: this.callbacks) {
            ((com.vungle.ads.internal.util.b.b)object0).onForeground();
        }
        c b$c0 = this.targetActivityInfo;
        if(b$c0 != null) {
            Context context0 = (Context)b$c0.getContext().get();
            if(context0 != null) {
                b.Companion.startWhenForeground(context0, b$c0.getDeepLinkOverrideIntent(), b$c0.getDefaultIntent(), b$c0.getAdOpenCallback());
            }
            this.targetActivityInfo = null;
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStopped(@l Activity activity0) {
        L.p(activity0, "activity");
        this.lastStoppedActivityName = activity0.toString();
        this.startedActivities.remove(activity0.toString());
        boolean z = this.isAppInForeground();
        this.inBackground.set(!z);
        if(z) {
            return;
        }
        for(Object object0: this.callbacks) {
            ((com.vungle.ads.internal.util.b.b)object0).onBackground();
        }
    }
}

