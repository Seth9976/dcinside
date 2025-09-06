package com.vungle.ads.internal.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.X;
import com.vungle.ads.d1;
import com.vungle.ads.internal.executor.i;
import com.vungle.ads.internal.model.b;
import com.vungle.ads.internal.model.e;
import com.vungle.ads.internal.presenter.k;
import com.vungle.ads.internal.presenter.p;
import com.vungle.ads.internal.signals.c;
import com.vungle.ads.internal.util.o;
import com.vungle.ads.internal.util.s;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public abstract class a extends Activity {
    public static final class com.vungle.ads.internal.ui.a.a {
        private com.vungle.ads.internal.ui.a.a() {
        }

        public com.vungle.ads.internal.ui.a.a(w w0) {
        }

        @l
        public final Intent createIntent(@m Context context0, @l String s, @m String s1) {
            L.p(s, "placement");
            Intent intent0 = new Intent(context0, VungleActivity.class);
            if(!(context0 instanceof Activity)) {
                intent0.addFlags(0x10000000);
            }
            Bundle bundle0 = new Bundle();
            bundle0.putString("request", s);
            bundle0.putString("request_eventId", s1);
            intent0.putExtras(bundle0);
            return intent0;
        }

        @m
        public final b getAdvertisement$vungle_ads_release() {
            return a.advertisement;
        }

        @m
        public final e getBidPayload$vungle_ads_release() {
            return a.bidPayload;
        }

        private final String getEventId(Intent intent0) {
            try {
                Bundle bundle0 = intent0.getExtras();
                return bundle0 == null ? null : bundle0.getString("request_eventId");
            }
            catch(Exception unused_ex) {
            }
            return null;
        }

        @VisibleForTesting
        @m
        public final com.vungle.ads.internal.presenter.a getEventListener$vungle_ads_release() {
            return a.eventListener;
        }

        private final String getPlacement(Intent intent0) {
            try {
                Bundle bundle0 = intent0.getExtras();
                return bundle0 == null ? null : bundle0.getString("request");
            }
            catch(Exception unused_ex) {
            }
            return null;
        }

        @m
        public final p getPresenterDelegate$vungle_ads_release() {
            return a.presenterDelegate;
        }

        @VisibleForTesting
        public static void getREQUEST_KEY_EVENT_ID_EXTRA$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static void getREQUEST_KEY_EXTRA$vungle_ads_release$annotations() {
        }

        public final void setAdvertisement$vungle_ads_release(@m b b0) {
            a.advertisement = b0;
        }

        public final void setBidPayload$vungle_ads_release(@m e e0) {
            a.bidPayload = e0;
        }

        public final void setEventListener$vungle_ads_release(@m com.vungle.ads.internal.presenter.a a0) {
            a.eventListener = a0;
        }

        public final void setPresenterDelegate$vungle_ads_release(@m p p0) {
            a.presenterDelegate = p0;
        }
    }

    @l
    public static final com.vungle.ads.internal.ui.a.a Companion = null;
    @l
    public static final String REQUEST_KEY_EVENT_ID_EXTRA = "request_eventId";
    @l
    public static final String REQUEST_KEY_EXTRA = "request";
    @l
    private static final String TAG = "AdActivity";
    @m
    private static b advertisement;
    @m
    private static e bidPayload;
    @m
    private static com.vungle.ads.internal.presenter.a eventListener;
    private boolean isReceiverRegistered;
    @m
    private com.vungle.ads.internal.ui.view.b mraidAdWidget;
    @m
    private k mraidPresenter;
    @l
    private String placementRefId;
    @m
    private static p presenterDelegate;
    @l
    private final s ringerModeReceiver;
    @m
    private com.vungle.ads.internal.model.p unclosedAd;

    static {
        a.Companion = new com.vungle.ads.internal.ui.a.a(null);
    }

    public a() {
        this.placementRefId = "";
        this.ringerModeReceiver = new s();
    }

    @VisibleForTesting(otherwise = 4)
    public boolean canRotate$vungle_ads_release() {
        return false;
    }

    @m
    public final com.vungle.ads.internal.ui.view.b getMraidAdWidget$vungle_ads_release() {
        return this.mraidAdWidget;
    }

    @VisibleForTesting
    public static void getMraidAdWidget$vungle_ads_release$annotations() {
    }

    @m
    public final k getMraidPresenter$vungle_ads_release() {
        return this.mraidPresenter;
    }

    @VisibleForTesting
    public static void getMraidPresenter$vungle_ads_release$annotations() {
    }

    @l
    public final String getPlacementRefId$vungle_ads_release() {
        return this.placementRefId;
    }

    @VisibleForTesting
    public static void getPlacementRefId$vungle_ads_release$annotations() {
    }

    private final void hideSystemUi() {
        WindowInsetsControllerCompat windowInsetsControllerCompat0 = WindowCompat.a(this.getWindow(), this.getWindow().getDecorView());
        L.o(windowInsetsControllerCompat0, "getInsetsController(window, window.decorView)");
        windowInsetsControllerCompat0.j(2);
        windowInsetsControllerCompat0.d(0x207);
    }

    @Override  // android.app.Activity
    public void onBackPressed() {
        k k0 = this.mraidPresenter;
        if(k0 != null) {
            k0.handleExit();
        }
    }

    private final void onConcurrentPlaybackError(String s) {
        d1 d10 = new X().setLogEntry$vungle_ads_release((a.advertisement == null ? null : a.advertisement.getLogEntry$vungle_ads_release())).logError$vungle_ads_release();
        com.vungle.ads.internal.presenter.a a0 = a.eventListener;
        if(a0 != null) {
            a0.onError(d10, s);
        }
        com.vungle.ads.internal.util.p.Companion.e("AdActivity", "onConcurrentPlaybackError: " + d10.getLocalizedMessage());
    }

    @Override  // android.app.Activity
    public void onConfigurationChanged(@l Configuration configuration0) {
        L.p(configuration0, "newConfig");
        try {
            super.onConfigurationChanged(configuration0);
            int v = configuration0.orientation;
            if(v == 2) {
                com.vungle.ads.internal.util.p.Companion.d("AdActivity", "landscape");
            }
            else if(v == 1) {
                com.vungle.ads.internal.util.p.Companion.d("AdActivity", "portrait");
            }
            k k0 = this.mraidPresenter;
            if(k0 != null) {
                k0.onViewConfigurationChanged();
            }
        }
        catch(Exception exception0) {
            com.vungle.ads.internal.util.p.Companion.e("AdActivity", "onConfigurationChanged: " + exception0.getLocalizedMessage());
        }
    }

    @Override  // android.app.Activity
    protected void onCreate(@m Bundle bundle0) {
        public static final class com.vungle.ads.internal.ui.a.b extends N implements A3.a {
            final Context $context;

            public com.vungle.ads.internal.ui.a.b(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(c.class);
            }
        }


        public static final class com.vungle.ads.internal.ui.a.c extends N implements A3.a {
            final Context $context;

            public com.vungle.ads.internal.ui.a.c(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.a.class);
            }
        }


        public static final class d extends N implements A3.a {
            final Context $context;

            public d(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.platform.d.class);
            }
        }


        public static final class com.vungle.ads.internal.ui.a.e extends N implements A3.a {
            final Context $context;

            public com.vungle.ads.internal.ui.a.e(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.omsdk.e.b.class);
            }
        }


        public static final class f implements com.vungle.ads.internal.ui.view.b.c {
            final D $signalManager$delegate;

            f(a a0, D d0) {
                a.this = a0;
                this.$signalManager$delegate = d0;
                super();
            }

            @Override  // com.vungle.ads.internal.ui.view.b$c
            public void close() {
                com.vungle.ads.internal.model.p p0 = a.this.unclosedAd;
                if(p0 != null) {
                    a.onCreate$lambda-0(this.$signalManager$delegate).removeUnclosedAd(p0);
                }
                a.this.finish();
            }
        }


        public static final class g implements com.vungle.ads.internal.ui.view.b.f {
            g(a a0) {
                a.this = a0;
                super();
            }

            @Override  // com.vungle.ads.internal.ui.view.b$f
            public boolean onTouch(@m MotionEvent motionEvent0) {
                k k0 = a.this.getMraidPresenter$vungle_ads_release();
                if(k0 != null) {
                    k0.onViewTouched(motionEvent0);
                }
                return false;
            }
        }


        public static final class h implements com.vungle.ads.internal.ui.view.b.g {
            h(a a0) {
                a.this = a0;
                super();
            }

            @Override  // com.vungle.ads.internal.ui.view.b$g
            public void setOrientation(int v) {
                a.this.setRequestedOrientation(v);
            }
        }

        com.vungle.ads.internal.ui.view.b b1;
        super.onCreate(bundle0);
        boolean z = true;
        this.requestWindowFeature(1);
        this.getWindow().setFlags(0x1000000, 0x1000000);
        com.vungle.ads.internal.ui.a.a a$a0 = a.Companion;
        Intent intent0 = this.getIntent();
        L.o(intent0, "intent");
        String s = a$a0.getPlacement(intent0);
        if(s == null) {
            s = "";
        }
        this.placementRefId = s;
        b b0 = a.advertisement;
        com.vungle.ads.internal.k k0 = com.vungle.ads.internal.k.INSTANCE;
        com.vungle.ads.internal.model.m m0 = k0.getPlacement(s);
        o o0 = null;
        if(m0 != null && b0 != null) {
            this.getWindow().getDecorView().setBackgroundColor(0xFF000000);
            try {
                b1 = new com.vungle.ads.internal.ui.view.b(this);
            }
            catch(InstantiationException unused_ex) {
                com.vungle.ads.internal.presenter.a a0 = a.eventListener;
                if(a0 != null) {
                    a0.onError(new com.vungle.ads.c().setLogEntry$vungle_ads_release(b0.getLogEntry$vungle_ads_release()).logError$vungle_ads_release(), this.placementRefId);
                }
                this.finish();
                return;
            }
            H h0 = H.a;
            D d0 = E.c(h0, new com.vungle.ads.internal.ui.a.b(this));
            Intent intent1 = this.getIntent();
            L.o(intent1, "intent");
            String s1 = a$a0.getEventId(intent1);
            if(s1 != null) {
                o0 = new com.vungle.ads.internal.model.p(s1, null, 2, null);
            }
            this.unclosedAd = o0;
            if(o0 != null) {
                a.onCreate$lambda-0(d0).recordUnclosedAd(((com.vungle.ads.internal.model.p)o0));
            }
            b1.setCloseDelegate(new f(this, d0));
            b1.setOnViewTouchListener(new g(this));
            b1.setOrientationDelegate(new h(this));
            D d1 = E.c(h0, new com.vungle.ads.internal.ui.a.c(this));
            D d2 = E.c(h0, new d(this));
            com.vungle.ads.internal.ui.h h1 = new com.vungle.ads.internal.ui.h(b0, m0, a.onCreate$lambda-4(d1).getOffloadExecutor(), a.onCreate$lambda-0(d0), a.onCreate$lambda-5(d2));
            com.vungle.ads.internal.omsdk.e.b e$b0 = a.onCreate$lambda-6(E.c(h0, new com.vungle.ads.internal.ui.a.e(this)));
            if(!k0.omEnabled() || !b0.omEnabled()) {
                z = false;
            }
            com.vungle.ads.internal.omsdk.e e0 = e$b0.make(z);
            i i0 = a.onCreate$lambda-4(d1).getJobExecutor();
            h1.setWebViewObserver(e0);
            this.ringerModeReceiver.setWebClient(h1);
            k k1 = new k(b1, b0, m0, h1, i0, e0, a.bidPayload, a.onCreate$lambda-5(d2));
            k1.setEventListener(a.eventListener);
            k1.setPresenterDelegate$vungle_ads_release(a.presenterDelegate);
            k1.prepare();
            this.setContentView(b1, b1.getLayoutParams());
            com.vungle.ads.d d3 = b0.getAdConfig();
            if(d3 != null) {
                String s2 = d3.getWatermark$vungle_ads_release();
                if(s2 != null) {
                    com.vungle.ads.internal.ui.i i1 = new com.vungle.ads.internal.ui.i(this, s2);
                    ((FrameLayout)this.getWindow().getDecorView().findViewById(0x1020002)).addView(i1);
                    i1.bringToFront();
                }
            }
            this.mraidAdWidget = b1;
            this.mraidPresenter = k1;
            return;
        }
        com.vungle.ads.internal.presenter.a a1 = a.eventListener;
        if(a1 != null) {
            com.vungle.ads.i i2 = new com.vungle.ads.i("Can not play fullscreen ad");
            if(b0 != null) {
                o0 = b0.getLogEntry$vungle_ads_release();
            }
            a1.onError(i2.setLogEntry$vungle_ads_release(o0).logError$vungle_ads_release(), this.placementRefId);
        }
        this.finish();
    }

    private static final c onCreate$lambda-0(D d0) {
        return (c)d0.getValue();
    }

    private static final com.vungle.ads.internal.executor.a onCreate$lambda-4(D d0) {
        return (com.vungle.ads.internal.executor.a)d0.getValue();
    }

    private static final com.vungle.ads.internal.platform.d onCreate$lambda-5(D d0) {
        return (com.vungle.ads.internal.platform.d)d0.getValue();
    }

    private static final com.vungle.ads.internal.omsdk.e.b onCreate$lambda-6(D d0) {
        return (com.vungle.ads.internal.omsdk.e.b)d0.getValue();
    }

    @Override  // android.app.Activity
    protected void onDestroy() {
        k k0 = this.mraidPresenter;
        if(k0 != null) {
            k0.detach(this.isChangingConfigurations() | 2);
        }
        super.onDestroy();
    }

    @Override  // android.app.Activity
    protected void onNewIntent(@l Intent intent0) {
        L.p(intent0, "intent");
        super.onNewIntent(intent0);
        Intent intent1 = this.getIntent();
        L.o(intent1, "getIntent()");
        String s = a.Companion.getPlacement(intent1);
        String s1 = a.Companion.getPlacement(intent0);
        Intent intent2 = this.getIntent();
        L.o(intent2, "getIntent()");
        String s2 = a.Companion.getEventId(intent2);
        String s3 = a.Companion.getEventId(intent0);
        if(s != null && s1 != null && !L.g(s, s1) || s2 != null && s3 != null && !L.g(s2, s3)) {
            com.vungle.ads.internal.util.p.Companion.d("AdActivity", "Tried to play another placement " + s1 + " while playing " + s);
            this.onConcurrentPlaybackError(s1);
        }
    }

    @Override  // android.app.Activity
    protected void onPause() {
        super.onPause();
        if(this.isReceiverRegistered) {
            try {
                this.unregisterReceiver(this.ringerModeReceiver);
                this.isReceiverRegistered = false;
                com.vungle.ads.internal.util.p.Companion.d("AdActivity", "unregisterReceiver(): " + this.ringerModeReceiver.hashCode());
            }
            catch(Exception exception0) {
                com.vungle.ads.internal.util.p.Companion.e("AdActivity", "unregisterReceiver error: " + exception0.getLocalizedMessage());
            }
        }
        k k0 = this.mraidPresenter;
        if(k0 != null) {
            k0.stop();
        }
    }

    @Override  // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.hideSystemUi();
        if(!this.isReceiverRegistered) {
            try {
                IntentFilter intentFilter0 = new IntentFilter("android.media.RINGER_MODE_CHANGED");
                this.registerReceiver(this.ringerModeReceiver, intentFilter0);
                this.isReceiverRegistered = true;
                com.vungle.ads.internal.util.p.Companion.d("AdActivity", "registerReceiver(): " + this.ringerModeReceiver.hashCode());
            }
            catch(Exception exception0) {
                com.vungle.ads.internal.util.p.Companion.e("AdActivity", "registerReceiver error: " + exception0.getLocalizedMessage());
            }
        }
        k k0 = this.mraidPresenter;
        if(k0 != null) {
            k0.start();
        }
    }

    public final void setMraidAdWidget$vungle_ads_release(@m com.vungle.ads.internal.ui.view.b b0) {
        this.mraidAdWidget = b0;
    }

    public final void setMraidPresenter$vungle_ads_release(@m k k0) {
        this.mraidPresenter = k0;
    }

    public final void setPlacementRefId$vungle_ads_release(@l String s) {
        L.p(s, "<set-?>");
        this.placementRefId = s;
    }

    @Override  // android.app.Activity
    public void setRequestedOrientation(int v) {
        if(this.canRotate$vungle_ads_release()) {
            super.setRequestedOrientation(v);
        }
    }
}

