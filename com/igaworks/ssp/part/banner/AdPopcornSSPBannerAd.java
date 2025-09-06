package com.igaworks.ssp.part.banner;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import com.igaworks.ssp.AdSize;
import com.igaworks.ssp.BannerAnimType;
import com.igaworks.ssp.C;
import com.igaworks.ssp.E;
import com.igaworks.ssp.J;
import com.igaworks.ssp.M;
import com.igaworks.ssp.SSPErrorCode;
import com.igaworks.ssp.Z;
import com.igaworks.ssp.a0;
import com.igaworks.ssp.common.adapter.BaseMediationAdapter;
import com.igaworks.ssp.d0;
import com.igaworks.ssp.e0;
import com.igaworks.ssp.h0;
import com.igaworks.ssp.i;
import com.igaworks.ssp.k;
import com.igaworks.ssp.p;
import com.igaworks.ssp.part.IMediationLogListener;
import com.igaworks.ssp.part.banner.listener.IBannerEventCallbackListener;
import com.igaworks.ssp.s0;
import com.igaworks.ssp.t.e;
import com.igaworks.ssp.t0;
import com.igaworks.ssp.x;
import com.igaworks.ssp.y;
import com.igaworks.ssp.z;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public class AdPopcornSSPBannerAd extends LinearLayout {
    public class MediationExtraData {
        public static final String CAULY_DYNAMIC_RELOAD_INTERVAL = "CAULY_DYNAMIC_RELOAD_INTERVAL";
        public static final String CAULY_ENABLE_LOCK = "CAULY_ENABLE_LOCK";
        public static final String CAULY_RELOAD_INTERVAL = "CAULY_RELOAD_INTERVAL";
        public static final String CAULY_THREAD_PRIORITY = "CAULY_THREAD_PRIORITY";
        public static final String MEZZO_AGE_LEVEL = "MEZZO_AGE_LEVEL";
        public static final String MEZZO_IS_USED_BACKGROUND_CHECK = "MEZZO_IS_USED_BACKGROUND_CHECK";
        public static final String MEZZO_STORE_URL = "MEZZO_STORE_URL";
        public static final String NAM_OBSERVING_ON_BACKGROUND = "NAM_OBSERVING_ON_BACKGROUND";
        final AdPopcornSSPBannerAd a;

    }

    class g implements C {
        final AdPopcornSSPBannerAd a;

        @Override  // com.igaworks.ssp.C
        public void a() {
            AdPopcornSSPBannerAd.this.g();
        }

        @Override  // com.igaworks.ssp.C
        public void a(int v) {
            class b implements Runnable {
                final g a;

                @Override
                public void run() {
                    AdPopcornSSPBannerAd adPopcornSSPBannerAd0 = AdPopcornSSPBannerAd.this;
                    if(adPopcornSSPBannerAd0 != null) {
                        adPopcornSSPBannerAd0.setBackgroundColor(0);
                    }
                }
            }


            class c implements Runnable {
                final g a;

                @Override
                public void run() {
                    if(AdPopcornSSPBannerAd.this.u != null) {
                        int v = AdPopcornSSPBannerAd.this.getCurrentNetwork();
                        AdPopcornSSPBannerAd.this.u.OnMediationLoadStart(AdPopcornSSPBannerAd.this.a, v);
                    }
                    if(AdPopcornSSPBannerAd.this.g != null) {
                        Object object0 = AdPopcornSSPBannerAd.this.d.get();
                        AdPopcornSSPBannerAd.this.g.startBannerAd(((Context)object0), AdPopcornSSPBannerAd.this.c, AdPopcornSSPBannerAd.this, AdPopcornSSPBannerAd.this.i, AdPopcornSSPBannerAd.this.v, AdPopcornSSPBannerAd.this.h);
                        return;
                    }
                    AdPopcornSSPBannerAd.this.a(200);
                }
            }

            i i0;
            try {
                if(AdPopcornSSPBannerAd.this.u != null) {
                    int v1 = AdPopcornSSPBannerAd.this.getCurrentNetwork();
                    AdPopcornSSPBannerAd.this.u.OnMediationLoadFailed(AdPopcornSSPBannerAd.this.a, v1);
                }
                if(AdPopcornSSPBannerAd.this.g != null) {
                    com.igaworks.ssp.b.a(Thread.currentThread(), "Fail in adapter : " + AdPopcornSSPBannerAd.this.g.getNetworkName());
                    AdPopcornSSPBannerAd.this.a(AdPopcornSSPBannerAd.this.g);
                    new Handler(Looper.getMainLooper()).post(new b(this));
                }
                Z z0 = AdPopcornSSPBannerAd.this.i.e();
                if(z0 == null) {
                    AdPopcornSSPBannerAd.this.h = 0;
                    AdPopcornSSPBannerAd.this.a(5002);
                    return;
                }
                ArrayList arrayList0 = z0.a();
                if(!e0.b(((Context)AdPopcornSSPBannerAd.this.d.get()).getApplicationContext())) {
                    AdPopcornSSPBannerAd.this.a(100001);
                    return;
                }
                if(v >= arrayList0.size() - 1) {
                    AdPopcornSSPBannerAd.this.h = 0;
                    AdPopcornSSPBannerAd.this.a(5002);
                    return;
                }
                AdPopcornSSPBannerAd.this.h = v + 1;
                i0 = i.a(((a0)z0.a().get(AdPopcornSSPBannerAd.this.h)).a());
                AdPopcornSSPBannerAd.this.v = false;
            }
            catch(Exception exception0) {
                com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
                AdPopcornSSPBannerAd.this.a(200);
                return;
            }
            try {
                if(i0.b() == i.c.b() && y.a(AdPopcornSSPBannerAd.this.i)) {
                    String s = ((com.igaworks.ssp.g)AdPopcornSSPBannerAd.this.i.b().get(0)).k();
                    if(s != null) {
                        if(p.k(s) == k.c.b()) {
                            i0 = i.e;
                            AdPopcornSSPBannerAd.this.v = true;
                        }
                        else if(p.k(s) == k.d.b()) {
                            i0 = i.r;
                            AdPopcornSSPBannerAd.this.v = true;
                        }
                        else if(p.k(s) == k.f.b()) {
                            i0 = i.l;
                            AdPopcornSSPBannerAd.this.v = true;
                        }
                        else if(p.k(s) == k.g.b()) {
                            i0 = i.v;
                            AdPopcornSSPBannerAd.this.v = true;
                        }
                    }
                }
            }
            catch(Exception unused_ex) {
            }
            try {
                BaseMediationAdapter baseMediationAdapter0 = AdPopcornSSPBannerAd.this.a(i0);
                AdPopcornSSPBannerAd.this.g = baseMediationAdapter0;
                AdPopcornSSPBannerAd.this.g.setBannerMediationAdapterEventListener(this);
                if(Looper.myLooper() == Looper.getMainLooper()) {
                    com.igaworks.ssp.b.a(Thread.currentThread(), "onFail Main Thread.");
                    if(AdPopcornSSPBannerAd.this.u != null) {
                        int v2 = AdPopcornSSPBannerAd.this.getCurrentNetwork();
                        AdPopcornSSPBannerAd.this.u.OnMediationLoadStart(AdPopcornSSPBannerAd.this.a, v2);
                    }
                    if(AdPopcornSSPBannerAd.this.g != null) {
                        Object object0 = AdPopcornSSPBannerAd.this.d.get();
                        AdPopcornSSPBannerAd.this.g.startBannerAd(((Context)object0), AdPopcornSSPBannerAd.this.c, AdPopcornSSPBannerAd.this, AdPopcornSSPBannerAd.this.i, AdPopcornSSPBannerAd.this.v, AdPopcornSSPBannerAd.this.h);
                        return;
                    }
                    AdPopcornSSPBannerAd.this.a(200);
                    return;
                }
                com.igaworks.ssp.b.a(Thread.currentThread(), "onFail Another Thread");
                new Handler(Looper.getMainLooper()).post(new c(this));
                return;
            }
            catch(Exception exception0) {
            }
            com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
            AdPopcornSSPBannerAd.this.a(200);
        }

        @Override  // com.igaworks.ssp.C
        public void b(int v) {
            class a extends z {
                final g a;

                @Override  // com.igaworks.ssp.z
                public void a() {
                    AdPopcornSSPBannerAd.this.f();
                }
            }

            try {
                if(AdPopcornSSPBannerAd.this.u != null) {
                    int v1 = AdPopcornSSPBannerAd.this.getCurrentNetwork();
                    AdPopcornSSPBannerAd.this.u.OnMediationLoadSuccess(AdPopcornSSPBannerAd.this.a, v1);
                }
                if(AdPopcornSSPBannerAd.this.g != null) {
                    com.igaworks.ssp.b.a(Thread.currentThread(), "Success in adapter : " + AdPopcornSSPBannerAd.this.g.getNetworkName());
                }
                AdPopcornSSPBannerAd.this.j();
                AdPopcornSSPBannerAd.this.a(AdPopcornSSPBannerAd.this.e);
                AdPopcornSSPBannerAd.this.h();
                long v2 = Calendar.getInstance().getTimeInMillis();
                AdPopcornSSPBannerAd.this.k = v2;
                if(AdPopcornSSPBannerAd.this.g.getNetworkName().contentEquals("ADPOPCORN") && AdPopcornSSPBannerAd.this.j != -1L) {
                    if(AdPopcornSSPBannerAd.this.e == null) {
                        x x0 = new x();
                        AdPopcornSSPBannerAd.this.e = x0;
                    }
                    AdPopcornSSPBannerAd.this.a(AdPopcornSSPBannerAd.this.e);
                    AdPopcornSSPBannerAd.this.e.a(AdPopcornSSPBannerAd.this.j, new a(this));
                }
            }
            catch(Exception exception0) {
                AdPopcornSSPBannerAd.this.a(200);
                com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
            }
        }
    }

    class com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd.i implements C {
        final AdPopcornSSPBannerAd a;

        @Override  // com.igaworks.ssp.C
        public void a() {
            AdPopcornSSPBannerAd.this.g();
        }

        @Override  // com.igaworks.ssp.C
        public void a(int v) {
            try {
                if(AdPopcornSSPBannerAd.this.u != null) {
                    int v1 = AdPopcornSSPBannerAd.this.getCurrentNetwork();
                    AdPopcornSSPBannerAd.this.u.OnMediationLoadFailed(AdPopcornSSPBannerAd.this.a, v1);
                }
                AdPopcornSSPBannerAd.this.a(AdPopcornSSPBannerAd.this.e);
                if(!e0.b(((Context)AdPopcornSSPBannerAd.this.d.get()).getApplicationContext())) {
                    AdPopcornSSPBannerAd.this.a(100001);
                    return;
                }
                AdPopcornSSPBannerAd.this.a(5002);
            }
            catch(Exception unused_ex) {
            }
        }

        @Override  // com.igaworks.ssp.C
        public void b(int v) {
            class com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd.i.a extends z {
                final com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd.i a;

                @Override  // com.igaworks.ssp.z
                public void a() {
                    AdPopcornSSPBannerAd.this.f();
                }
            }

            try {
                if(AdPopcornSSPBannerAd.this.u != null) {
                    int v1 = AdPopcornSSPBannerAd.this.getCurrentNetwork();
                    AdPopcornSSPBannerAd.this.u.OnMediationLoadSuccess(AdPopcornSSPBannerAd.this.a, v1);
                }
                AdPopcornSSPBannerAd.this.j();
                AdPopcornSSPBannerAd.this.h();
                long v2 = Calendar.getInstance().getTimeInMillis();
                AdPopcornSSPBannerAd.this.k = v2;
                AdPopcornSSPBannerAd.this.a(AdPopcornSSPBannerAd.this.e);
                if(AdPopcornSSPBannerAd.this.j != -1L) {
                    com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd.i.a adPopcornSSPBannerAd$i$a0 = new com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd.i.a(this);
                    AdPopcornSSPBannerAd.this.e.a(AdPopcornSSPBannerAd.this.j, adPopcornSSPBannerAd$i$a0);
                }
            }
            catch(Exception unused_ex) {
                AdPopcornSSPBannerAd.this.a(AdPopcornSSPBannerAd.this.e);
                AdPopcornSSPBannerAd.this.a(5002);
            }
        }
    }

    private String a;
    private String b;
    private AdSize c;
    private WeakReference d;
    private x e;
    private IBannerEventCallbackListener f;
    private BaseMediationAdapter g;
    private int h;
    private d0 i;
    private long j;
    private long k;
    private ConcurrentHashMap l;
    private boolean m;
    private boolean n;
    private BannerAnimType o;
    private HashMap p;
    private int q;
    private boolean r;
    private long s;
    private boolean t;
    private IMediationLogListener u;
    private boolean v;
    private int w;
    private C x;
    private C y;

    public AdPopcornSSPBannerAd(Context context0) {
        super(context0);
        this.h = 0;
        this.j = 60000L;
        this.k = 0L;
        this.m = false;
        this.n = true;
        this.o = BannerAnimType.FADE_IN;
        this.q = 30;
        this.r = false;
        this.s = 5000L;
        this.t = false;
        this.v = false;
        this.w = 21600;
        this.x = new g(this);
        this.y = new com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd.i(this);
        this.d = new WeakReference(context0);
    }

    public AdPopcornSSPBannerAd(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.h = 0;
        this.j = 60000L;
        this.k = 0L;
        this.m = false;
        this.n = true;
        this.o = BannerAnimType.FADE_IN;
        this.q = 30;
        this.r = false;
        this.s = 5000L;
        this.t = false;
        this.v = false;
        this.w = 21600;
        this.x = new g(this);
        this.y = new com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd.i(this);
        this.d = new WeakReference(context0);
    }

    public AdPopcornSSPBannerAd(Context context0, String s) {
        super(context0);
        this.h = 0;
        this.j = 60000L;
        this.k = 0L;
        this.m = false;
        this.n = true;
        this.o = BannerAnimType.FADE_IN;
        this.q = 30;
        this.r = false;
        this.s = 5000L;
        this.t = false;
        this.v = false;
        this.w = 21600;
        this.x = new g(this);
        this.y = new com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd.i(this);
        this.d = new WeakReference(context0);
        this.b = s;
    }

    private BaseMediationAdapter a(i i0) {
        if(this.l == null) {
            this.l = new ConcurrentHashMap();
        }
        BaseMediationAdapter baseMediationAdapter0 = (BaseMediationAdapter)this.l.get(i0);
        if(baseMediationAdapter0 == null) {
            baseMediationAdapter0 = i0.e();
            if(baseMediationAdapter0 != null) {
                this.l.put(i0, baseMediationAdapter0);
            }
        }
        return baseMediationAdapter0;
    }

    private void a() {
        try {
            if(this.i != null && !this.i.n()) {
                this.i.b(true);
                Object[] arr_object = {"", this.getCurrentNetwork(), this.a};
                E.g().d().a(((Context)this.d.get()).getApplicationContext(), e.i, "" + String.format("&advertising_id=%s&ad_network_no=%d&placement_id=%s", arr_object));
                return;
            }
            com.igaworks.ssp.b.a(Thread.currentThread(), "callMediationImpTracking null or already fired.");
        }
        catch(Exception unused_ex) {
        }
    }

    private void a(int v) {
        this.m = false;
        this.r = false;
        IBannerEventCallbackListener iBannerEventCallbackListener0 = this.f;
        if(iBannerEventCallbackListener0 != null) {
            iBannerEventCallbackListener0.OnBannerAdReceiveFailed(new SSPErrorCode(v));
        }
        this.c();
        this.k = 0L;
    }

    private void a(BaseMediationAdapter baseMediationAdapter0) {
        if(baseMediationAdapter0 == null) {
            return;
        }
        baseMediationAdapter0.setBannerMediationAdapterEventListener(null);
        baseMediationAdapter0.internalStopBannerAd();
    }

    private void a(x x0) {
        if(x0 == null) {
            return;
        }
        x0.a();
    }

    private void a(boolean z) {
        try {
            if(z) {
                this.setVisibility(8);
                return;
            }
            this.setVisibility(0);
            return;
        }
        catch(Exception exception0) {
        }
        com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
    }

    private boolean a(View view0) {
        if(view0 == null) {
            return false;
        }
        else {
            try {
                if(view0.isShown() && view0.getWindowVisibility() != 8) {
                    Rect rect0 = new Rect();
                    view0.getWindowVisibleDisplayFrame(rect0);
                    Context context0 = view0.getContext();
                    int v = !(context0 instanceof Activity) || ((Activity)context0).getActionBar() == null ? 0 : ((Activity)context0).getActionBar().getHeight();
                    Rect rect1 = new Rect(rect0.left, rect0.top + v, rect0.right, rect0.bottom);
                    int[] arr_v = new int[2];
                    view0.getLocationInWindow(arr_v);
                    int v1 = arr_v[0];
                    int v2 = arr_v[1];
                    Rect rect2 = new Rect(v1, v2, view0.getWidth() + v1, view0.getHeight() + v2);
                    return view0.getWidth() == 0 || view0.getHeight() == 0 ? false : rect1.intersect(rect2);
                }
                return false;
            }
            catch(Exception unused_ex) {
            }
        }
        return true;
    }

    private void b() {
        ConcurrentHashMap concurrentHashMap0 = this.l;
        if(concurrentHashMap0 != null) {
            concurrentHashMap0.clear();
            this.l = null;
        }
    }

    private void c() {
        com.igaworks.ssp.b.c(Thread.currentThread(), "internalStopAd : " + this.a);
        BaseMediationAdapter baseMediationAdapter0 = this.g;
        if(baseMediationAdapter0 != null) {
            baseMediationAdapter0.internalStopBannerAd();
            this.g.setBannerMediationAdapterEventListener(null);
            this.g = null;
        }
        this.h = 0;
        this.m = false;
        x x0 = this.e;
        if(x0 != null) {
            x0.a();
            this.e = null;
        }
        if(this.i != null) {
            this.i = null;
        }
        this.a(true);
        this.setBackgroundColor(0);
    }

    private boolean d() {
        boolean z;
        try {
            PowerManager powerManager0 = (PowerManager)((Context)this.d.get()).getSystemService("power");
            com.igaworks.ssp.b.a(Thread.currentThread(), "isInteractive : " + powerManager0.isInteractive());
            z = powerManager0.isInteractive();
        }
        catch(Exception unused_ex) {
            return true;
        }
        if(z) {
            try {
                DisplayManager displayManager0 = (DisplayManager)((Context)this.d.get()).getSystemService("display");
                if(displayManager0 != null) {
                    Display[] arr_display = displayManager0.getDisplays();
                    int v = 0;
                    while(v < arr_display.length) {
                        Display display0 = arr_display[v];
                        switch(display0.getState()) {
                            case 0: 
                            case 2: {
                                com.igaworks.ssp.b.a(Thread.currentThread(), "Display.STATE : " + display0.getState());
                                return true;
                            }
                        }
                        ++v;
                        z = false;
                    }
                }
                return z;
            }
            catch(Exception unused_ex) {
            }
        }
        else {
            return z;
        }
        return z;
    }

    private void e() {
        class com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd.b implements Runnable {
            final AdPopcornSSPBannerAd a;

            @Override
            public void run() {
                if(AdPopcornSSPBannerAd.this.u != null) {
                    AdPopcornSSPBannerAd.this.u.OnMediationLoadStart(AdPopcornSSPBannerAd.this.a, AdPopcornSSPBannerAd.this.getCurrentNetwork());
                }
                if(AdPopcornSSPBannerAd.this.g != null) {
                    Object object0 = AdPopcornSSPBannerAd.this.d.get();
                    AdPopcornSSPBannerAd.this.g.startBannerAd(((Context)object0), AdPopcornSSPBannerAd.this.c, AdPopcornSSPBannerAd.this, AdPopcornSSPBannerAd.this.i, AdPopcornSSPBannerAd.this.v, AdPopcornSSPBannerAd.this.h);
                    return;
                }
                AdPopcornSSPBannerAd.this.a(200);
            }
        }

        i i0;
        try {
            com.igaworks.ssp.b.c(Thread.currentThread(), "navigateToNextSchedule");
            this.a(this.e);
            if(this.g != null) {
                com.igaworks.ssp.b.a(Thread.currentThread(), String.format("navigateToNextSchedule currentAdapter %s stop", this.g.getNetworkName()));
                this.a(this.g);
                this.setBackgroundColor(0);
            }
            if(!e0.b(((Context)this.d.get()).getApplicationContext())) {
                this.a(100001);
                return;
            }
            if(this.i == null || this.i.e() == null) {
                this.h = 0;
                this.a(5002);
                return;
            }
            ArrayList arrayList0 = this.i.e().a();
            if(this.h >= arrayList0.size() - 1) {
                this.h = 0;
                this.a(5002);
                return;
            }
            int v = this.h + 1;
            this.h = v;
            i0 = i.a(((a0)arrayList0.get(v)).a());
            this.v = false;
        }
        catch(Exception exception0) {
            this.a(200);
            com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
            return;
        }
        try {
            if(i0.b() == i.c.b() && y.a(this.i)) {
                String s = ((com.igaworks.ssp.g)this.i.b().get(0)).k();
                if(s != null) {
                    if(p.k(s) == k.c.b()) {
                        i0 = i.e;
                        this.v = true;
                    }
                    else if(p.k(s) == k.d.b()) {
                        i0 = i.r;
                        this.v = true;
                    }
                    else if(p.k(s) == k.f.b()) {
                        i0 = i.l;
                        this.v = true;
                    }
                    else if(p.k(s) == k.g.b()) {
                        i0 = i.v;
                        this.v = true;
                    }
                }
            }
        }
        catch(Exception unused_ex) {
        }
        try {
            BaseMediationAdapter baseMediationAdapter0 = this.a(i0);
            this.g = baseMediationAdapter0;
            baseMediationAdapter0.setBannerMediationAdapterEventListener(this.x);
            if(Looper.myLooper() == Looper.getMainLooper()) {
                com.igaworks.ssp.b.a(Thread.currentThread(), "navigateToNextSchedule Main Thread.");
                IMediationLogListener iMediationLogListener0 = this.u;
                if(iMediationLogListener0 != null) {
                    iMediationLogListener0.OnMediationLoadStart(this.a, this.getCurrentNetwork());
                }
                BaseMediationAdapter baseMediationAdapter1 = this.g;
                if(baseMediationAdapter1 != null) {
                    baseMediationAdapter1.startBannerAd(((Context)this.d.get()), this.c, this, this.i, this.v, this.h);
                    return;
                }
                this.a(200);
                return;
            }
            com.igaworks.ssp.b.a(Thread.currentThread(), "navigateToNextSchedule Another Thread");
            new Handler(Looper.getMainLooper()).post(new com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd.b(this));
            return;
        }
        catch(Exception exception0) {
        }
        this.a(200);
        com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
    }

    private void f() {
        class j extends z {
            final AdPopcornSSPBannerAd a;

            @Override  // com.igaworks.ssp.z
            public void a() {
                AdPopcornSSPBannerAd.this.f();
            }
        }


        class com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd.k extends z {
            final AdPopcornSSPBannerAd a;

            @Override  // com.igaworks.ssp.z
            public void a() {
                AdPopcornSSPBannerAd.this.f();
            }
        }


        class l implements M {
            final AdPopcornSSPBannerAd a;

            @Override  // com.igaworks.ssp.M
            public void onNetResponseListener(e t$e0, String s, String s1, boolean z) {
                try {
                    if(s0.b(s)) {
                        AdPopcornSSPBannerAd.this.i.a(null);
                        AdPopcornSSPBannerAd.this.e();
                        return;
                    }
                    d0 d00 = p.f(s);
                    if(d00 != null && d00.h() != 1) {
                        AdPopcornSSPBannerAd.this.i.a(null);
                        AdPopcornSSPBannerAd.this.e();
                        return;
                    }
                    if(AdPopcornSSPBannerAd.this.i != null && AdPopcornSSPBannerAd.this.i.d() != null) {
                        t0.a(((Context)AdPopcornSSPBannerAd.this.d.get()), AdPopcornSSPBannerAd.this.i.d());
                    }
                    if(y.a(d00)) {
                        AdPopcornSSPBannerAd.this.i.a(d00.b());
                        AdPopcornSSPBannerAd.this.k();
                        return;
                    }
                    AdPopcornSSPBannerAd.this.i.a(null);
                    AdPopcornSSPBannerAd.this.e();
                    return;
                }
                catch(Exception exception0) {
                }
                com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
            }
        }

        JSONObject jSONObject1;
        JSONObject jSONObject0;
        e t$e0;
        AdSize adSize0 = this.c;
        if(adSize0 == AdSize.BANNER_300x250 || adSize0 == AdSize.BANNER_ADAPTIVE_SIZE) {
            t$e0 = e.f;
        }
        else if(adSize0 == AdSize.BANNER_320x100) {
            t$e0 = e.g;
        }
        else {
            t$e0 = e.e;
        }
        if(!this.d()) {
            this.a(this.e);
            if(this.e == null) {
                this.e = new x();
            }
            long v = this.j;
            if(v != -1L) {
                this.e.a(v, new j(this));
            }
            return;
        }
        if(!this.a(this)) {
            com.igaworks.ssp.b.a(Thread.currentThread(), "AdPopcornSSPBanner isViewFullyVisible false. Not refreshing ad");
            this.a(this.e);
            if(this.e == null) {
                this.e = new x();
            }
            long v1 = this.j;
            if(v1 != -1L) {
                this.e.a(v1, new com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd.k(this));
            }
            return;
        }
        com.igaworks.ssp.b.a(Thread.currentThread(), "AdPopcornSSPBanner is visible. Refreshing ad...");
        try {
            List list0 = E.g().a(this.a);
            if(list0 == null) {
                jSONObject1 = null;
            }
            else {
                jSONObject0 = new JSONObject();
                goto label_29;
            }
            goto label_60;
        }
        catch(Exception exception0) {
            goto label_56;
        }
        try {
        label_29:
            k k0 = k.c;
            if(list0.contains(k0.b())) {
                i i0 = i.e;
                if(y.a(i0, this.l)) {
                    jSONObject0.put(k0.b() + "", this.a(i0).getBiddingToken(((Context)this.d.get()).getApplicationContext()));
                }
            }
            k k1 = k.d;
            if(list0.contains(k1.b())) {
                i i1 = i.r;
                if(y.a(i1, this.l)) {
                    jSONObject0.put(k1.b() + "", this.a(i1).getBiddingToken(((Context)this.d.get()).getApplicationContext()));
                }
            }
            k k2 = k.f;
            if(list0.contains(k2.b())) {
                i i2 = i.l;
                if(y.a(i2, this.l)) {
                    jSONObject0.put(k2.b() + "", this.a(i2).getBiddingToken(((Context)this.d.get()).getApplicationContext()));
                }
            }
            k k3 = k.g;
            if(list0.contains(k3.b())) {
                i i3 = i.v;
                if(y.a(i3, this.l)) {
                    jSONObject0.put(k3.b() + "", this.a(i3).getBiddingToken(((Context)this.d.get()).getApplicationContext()));
                }
            }
            com.igaworks.ssp.b.c(Thread.currentThread(), "load Banner biddingTokenParameter : " + jSONObject0);
            goto label_59;
        }
        catch(Exception exception1) {
        }
        com.igaworks.ssp.b.a(Thread.currentThread(), exception1);
        jSONObject1 = jSONObject0;
        E.g().d().a(((Context)this.d.get()).getApplicationContext(), t$e0, this.a, this.b, jSONObject1, new l(this));
        return;
        try {
            jSONObject1 = null;
            goto label_60;
        }
        catch(Exception exception0) {
        label_56:
            jSONObject0 = null;
            exception1 = exception0;
        }
        com.igaworks.ssp.b.a(Thread.currentThread(), exception1);
    label_59:
        jSONObject1 = jSONObject0;
    label_60:
        E.g().d().a(((Context)this.d.get()).getApplicationContext(), t$e0, this.a, this.b, jSONObject1, new l(this));
    }

    private void g() {
        IBannerEventCallbackListener iBannerEventCallbackListener0 = this.f;
        if(iBannerEventCallbackListener0 != null) {
            iBannerEventCallbackListener0.OnBannerAdClicked();
        }
    }

    public boolean getAutoBgColor() {
        return this.n;
    }

    public int getCurrentNetwork() {
        try {
            return this.g == null ? -1 : i.a(this.g.getNetworkName()).b();
        }
        catch(Exception unused_ex) {
        }
        return -1;
    }

    public Object getMediationExtraData(String s) {
        try {
            if(this.p == null) {
                this.p = new HashMap();
            }
            return this.p.containsKey(s) ? this.p.get(s) : null;
        }
        catch(Exception unused_ex) {
        }
        return null;
    }

    public long getNetworkScheduleTimeout() {
        return this.s > 0L ? this.s : 5000L;
    }

    public String getPlacementId() {
        return this.a;
    }

    public long getRefreshTime() {
        return this.j;
    }

    private void h() {
        this.m = false;
        this.r = true;
        this.a();
        IBannerEventCallbackListener iBannerEventCallbackListener0 = this.f;
        if(iBannerEventCallbackListener0 != null) {
            iBannerEventCallbackListener0.OnBannerAdReceiveSuccess();
        }
    }

    private void i() {
        class h implements Runnable {
            final AdPopcornSSPBannerAd a;

            @Override
            public void run() {
                if(AdPopcornSSPBannerAd.this.u != null) {
                    int v = AdPopcornSSPBannerAd.this.getCurrentNetwork();
                    AdPopcornSSPBannerAd.this.u.OnMediationLoadStart(AdPopcornSSPBannerAd.this.a, v);
                }
                if(AdPopcornSSPBannerAd.this.g != null) {
                    Object object0 = AdPopcornSSPBannerAd.this.d.get();
                    AdPopcornSSPBannerAd.this.g.startBannerAd(((Context)object0), AdPopcornSSPBannerAd.this.c, AdPopcornSSPBannerAd.this, AdPopcornSSPBannerAd.this.i, AdPopcornSSPBannerAd.this.v, 0);
                    return;
                }
                AdPopcornSSPBannerAd.this.a(200);
            }
        }

        i i0;
        ArrayList arrayList0 = this.i.b();
        if(!e0.b(((Context)this.d.get()).getApplicationContext())) {
            this.a(100001);
            return;
        }
        if(arrayList0 != null && arrayList0.size() > 0) {
            if(this.e == null) {
                this.e = new x();
            }
            try {
                i0 = i.c;
                this.v = false;
                String s = ((com.igaworks.ssp.g)this.i.b().get(0)).k();
                if(s != null) {
                    if(p.k(s) == k.c.b()) {
                        i0 = i.e;
                        this.v = true;
                    }
                    else if(p.k(s) == k.d.b()) {
                        i0 = i.r;
                        this.v = true;
                    }
                    else if(p.k(s) == k.f.b()) {
                        i0 = i.l;
                        this.v = true;
                    }
                    else if(p.k(s) == k.g.b()) {
                        i0 = i.v;
                        this.v = true;
                    }
                }
            }
            catch(Exception unused_ex) {
            }
            BaseMediationAdapter baseMediationAdapter0 = this.a(i0);
            this.g = baseMediationAdapter0;
            baseMediationAdapter0.setBannerMediationAdapterEventListener(this.y);
            if(Looper.myLooper() == Looper.getMainLooper()) {
                com.igaworks.ssp.b.a(Thread.currentThread(), "showAdPopcornCampaign CampaignMain Thread.");
                IMediationLogListener iMediationLogListener0 = this.u;
                if(iMediationLogListener0 != null) {
                    iMediationLogListener0.OnMediationLoadStart(this.a, this.getCurrentNetwork());
                }
                BaseMediationAdapter baseMediationAdapter1 = this.g;
                if(baseMediationAdapter1 == null) {
                    this.a(200);
                }
                else {
                    baseMediationAdapter1.startBannerAd(((Context)this.d.get()), this.c, this, this.i, this.v, 0);
                }
            }
            else {
                com.igaworks.ssp.b.a(Thread.currentThread(), "showAdPopcornCampaign Another Thread");
                new Handler(Looper.getMainLooper()).post(new h(this));
            }
            this.m = false;
            return;
        }
        this.a(5002);
    }

    public boolean isDisplayed() {
        return this.r;
    }

    public boolean isExpired() {
        boolean z;
        if(this.k > 0L) {
            try {
                if(((long)this.w) - (Calendar.getInstance().getTimeInMillis() - this.k) / 1000L > 0L) {
                    z = false;
                    goto label_5;
                }
            }
            catch(Exception unused_ex) {
            }
            z = true;
            com.igaworks.ssp.b.c(Thread.currentThread(), "placementId : " + this.a + ", isExpired : " + z);
            return z;
        }
        else {
            z = true;
        }
    label_5:
        com.igaworks.ssp.b.c(Thread.currentThread(), "placementId : " + this.a + ", isExpired : " + z);
        return z;
    }

    private void j() {
        class com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd.c implements Runnable {
            final AdPopcornSSPBannerAd a;

            @Override
            public void run() {
                int v;
                if(AdPopcornSSPBannerAd.this.c == AdSize.BANNER_320x50) {
                    v = (int)J.a(AdPopcornSSPBannerAd.this.getContext(), 50.0f);
                }
                else if(AdPopcornSSPBannerAd.this.c == AdSize.BANNER_320x100) {
                    v = (int)J.a(AdPopcornSSPBannerAd.this.getContext(), 100.0f);
                }
                else {
                    v = AdPopcornSSPBannerAd.this.c == AdSize.BANNER_ADAPTIVE_SIZE ? -2 : ((int)J.a(AdPopcornSSPBannerAd.this.getContext(), 250.0f));
                }
                if(AdPopcornSSPBannerAd.this.getLayoutParams() == null) {
                    LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, v);
                    AdPopcornSSPBannerAd.this.setLayoutParams(linearLayout$LayoutParams0);
                }
                else {
                    AdPopcornSSPBannerAd.this.getLayoutParams().width = -1;
                    AdPopcornSSPBannerAd.this.getLayoutParams().height = v;
                }
                AdPopcornSSPBannerAd.this.setBackgroundColor(0);
                AdPopcornSSPBannerAd.this.setGravity(17);
                AdPopcornSSPBannerAd.this.setVisibility(0);
                AdPopcornSSPBannerAd.this.l();
            }
        }

        try {
            new Handler(Looper.getMainLooper()).post(new com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd.c(this));
        }
        catch(Exception exception0) {
            com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
        }
    }

    private void k() {
        class f implements Runnable {
            final int a;
            final AdPopcornSSPBannerAd b;

            f(int v) {
                this.a = v;
                super();
            }

            @Override
            public void run() {
                if(AdPopcornSSPBannerAd.this.u != null) {
                    int v = AdPopcornSSPBannerAd.this.getCurrentNetwork();
                    AdPopcornSSPBannerAd.this.u.OnMediationLoadStart(AdPopcornSSPBannerAd.this.a, v);
                }
                if(AdPopcornSSPBannerAd.this.g != null) {
                    Object object0 = AdPopcornSSPBannerAd.this.d.get();
                    AdPopcornSSPBannerAd.this.g.startBannerAd(((Context)object0), AdPopcornSSPBannerAd.this.c, AdPopcornSSPBannerAd.this, AdPopcornSSPBannerAd.this.i, AdPopcornSSPBannerAd.this.v, this.a);
                    return;
                }
                AdPopcornSSPBannerAd.this.a(200);
            }
        }

        i i0;
        int v;
        try {
            com.igaworks.ssp.b.c(Thread.currentThread(), "startAd");
            if(!e0.b(((Context)this.d.get()).getApplicationContext())) {
                this.a(100001);
                return;
            }
            if(!y.c(this.i)) {
                if(y.a(this.i)) {
                    this.v = false;
                    com.igaworks.ssp.b.a(Thread.currentThread(), "Campaign that do not contain mediation start");
                    this.i();
                    return;
                }
                this.a(this.i.h());
                return;
            }
            com.igaworks.ssp.b.a(Thread.currentThread(), "Campaign that contain mediation start ");
            y.a(this.i, this.l);
            v = this.h;
            i0 = i.a(((a0)this.i.e().a().get(v)).a());
            this.v = false;
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
            this.a(200);
            return;
        }
        try {
            if(i0.b() == i.c.b() && y.a(this.i)) {
                String s = ((com.igaworks.ssp.g)this.i.b().get(0)).k();
                if(s != null) {
                    if(p.k(s) == k.c.b()) {
                        i0 = i.e;
                        this.v = true;
                    }
                    else if(p.k(s) == k.d.b()) {
                        i0 = i.r;
                        this.v = true;
                    }
                    else if(p.k(s) == k.f.b()) {
                        i0 = i.l;
                        this.v = true;
                    }
                    else if(p.k(s) == k.g.b()) {
                        i0 = i.v;
                        this.v = true;
                    }
                }
            }
        }
        catch(Exception unused_ex) {
        }
        try {
            BaseMediationAdapter baseMediationAdapter0 = this.a(i0);
            this.g = baseMediationAdapter0;
            baseMediationAdapter0.setBannerMediationAdapterEventListener(this.x);
            if(Looper.myLooper() == Looper.getMainLooper()) {
                com.igaworks.ssp.b.a(Thread.currentThread(), "startAd Main Thread.");
                IMediationLogListener iMediationLogListener0 = this.u;
                if(iMediationLogListener0 != null) {
                    iMediationLogListener0.OnMediationLoadStart(this.a, this.getCurrentNetwork());
                }
                BaseMediationAdapter baseMediationAdapter1 = this.g;
                if(baseMediationAdapter1 != null) {
                    baseMediationAdapter1.startBannerAd(((Context)this.d.get()), this.c, this, this.i, this.v, v);
                    return;
                }
                this.a(200);
                return;
            }
            com.igaworks.ssp.b.a(Thread.currentThread(), "startAd Another Thread");
            new Handler(Looper.getMainLooper()).post(new f(this, v));
            return;
        }
        catch(Exception exception0) {
        }
        exception0.printStackTrace();
        com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
        this.a(200);
    }

    private void l() {
        class d implements Animation.AnimationListener {
            final AdPopcornSSPBannerAd a;

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationEnd(Animation animation0) {
            }

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationRepeat(Animation animation0) {
            }

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationStart(Animation animation0) {
            }
        }

        Animation animation0;
        try {
            BannerAnimType bannerAnimType0 = this.o;
            if(bannerAnimType0 == BannerAnimType.FADE_IN) {
                animation0 = AnimationUtils.loadAnimation(((Context)this.d.get()), h0.a(((Context)this.d.get()), "fade_in", "anim"));
                this.setAnimation(animation0);
                animation0.start();
                animation0.setAnimationListener(new d(this));
            }
            else if(bannerAnimType0 == BannerAnimType.SLIDE_LEFT) {
                animation0 = AnimationUtils.loadAnimation(((Context)this.d.get()), h0.a(((Context)this.d.get()), "slide_left", "anim"));
                this.setAnimation(animation0);
                animation0.start();
                animation0.setAnimationListener(new d(this));
            }
            else if(bannerAnimType0 == BannerAnimType.SLIDE_RIGHT) {
                animation0 = AnimationUtils.loadAnimation(((Context)this.d.get()), h0.a(((Context)this.d.get()), "slide_right", "anim"));
                this.setAnimation(animation0);
                animation0.start();
                animation0.setAnimationListener(new d(this));
            }
            else if(bannerAnimType0 == BannerAnimType.TOP_SLIDE) {
                animation0 = AnimationUtils.loadAnimation(((Context)this.d.get()), h0.a(((Context)this.d.get()), "top_slide", "anim"));
                this.setAnimation(animation0);
                animation0.start();
                animation0.setAnimationListener(new d(this));
            }
            else if(bannerAnimType0 == BannerAnimType.BOTTOM_SLIDE) {
                animation0 = AnimationUtils.loadAnimation(((Context)this.d.get()), h0.a(((Context)this.d.get()), "bottom_slide", "anim"));
                this.setAnimation(animation0);
                animation0.start();
                animation0.setAnimationListener(new d(this));
            }
            else if(bannerAnimType0 == BannerAnimType.CIRCLE) {
                animation0 = AnimationUtils.loadAnimation(((Context)this.d.get()), h0.a(((Context)this.d.get()), "circle", "anim"));
                this.setAnimation(animation0);
                animation0.start();
                animation0.setAnimationListener(new d(this));
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public void loadAd() {
        class com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd.a extends z {
            final AdPopcornSSPBannerAd a;

            @Override  // com.igaworks.ssp.z
            public void a() {
                class com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd.a.a implements Runnable {
                    final com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd.a a;

                    @Override
                    public void run() {
                        AdPopcornSSPBannerAd.this.m = false;
                        AdPopcornSSPBannerAd.this.loadAd();
                    }
                }

                new Handler(Looper.getMainLooper()).post(new com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd.a.a(this));
            }
        }


        class com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd.e implements M {
            final AdPopcornSSPBannerAd a;

            @Override  // com.igaworks.ssp.M
            public void onNetResponseListener(e t$e0, String s, String s1, boolean z) {
                try {
                    AdPopcornSSPBannerAd.this.h = 0;
                    if(z) {
                        AdPopcornSSPBannerAd.this.a(5000);
                        return;
                    }
                    if(s0.b(s)) {
                        AdPopcornSSPBannerAd.this.a(0x270F);
                        return;
                    }
                    d0 d00 = p.f(s);
                    if(d00 != null && d00.h() != 1) {
                        AdPopcornSSPBannerAd.this.a(d00.h());
                        return;
                    }
                    AdPopcornSSPBannerAd.this.i = d00;
                    if(AdPopcornSSPBannerAd.this.i != null && AdPopcornSSPBannerAd.this.i.d() != null) {
                        t0.a(((Context)AdPopcornSSPBannerAd.this.d.get()), AdPopcornSSPBannerAd.this.i.d());
                    }
                    AdPopcornSSPBannerAd.this.k();
                    return;
                }
                catch(Exception exception0) {
                }
                com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
                AdPopcornSSPBannerAd.this.a(200);
            }
        }

        JSONObject jSONObject1;
        e t$e0;
        try {
            if(!E.g().f()) {
                com.igaworks.ssp.b.a(Thread.currentThread(), this.a + " : GDPR_CONSENT_UNAVAILABLE");
                this.a(5008);
                return;
            }
            if(this.k > 0L) {
                goto label_5;
            }
            goto label_10;
        }
        catch(Exception exception0) {
            this.m = false;
            com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
            this.a(200);
            return;
        }
        try {
        label_5:
            long v = ((long)this.q) - (Calendar.getInstance().getTimeInMillis() - this.k) / 1000L;
            if(v > 0L && v <= ((long)this.q)) {
                com.igaworks.ssp.b.a(Thread.currentThread(), this.a + " : already load success.LoadAd API is available in " + v + " seconds");
                this.h();
                return;
            }
            goto label_10;
        }
        catch(Exception unused_ex) {
            try {
            label_10:
                if(this.m) {
                    com.igaworks.ssp.b.b(Thread.currentThread(), this.a + " : Banner In Progress!!");
                    return;
                }
                this.m = true;
                this.r = false;
                if(this.a != null && this.a.length() != 0) {
                    if(this.c == null) {
                        this.c = AdSize.BANNER_320x50;
                    }
                    if(!E.g().m()) {
                        com.igaworks.ssp.b.c(Thread.currentThread(), "Checking ADID...");
                        E.g().a(new com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd.a(this));
                        E e0 = E.g();
                        Objects.requireNonNull(e0);
                        new com.igaworks.ssp.E.j(e0, ((Context)this.d.get()).getApplicationContext()).start();
                        return;
                    }
                    E.g().a(this);
                    com.igaworks.ssp.b.c(Thread.currentThread(), "loadAd : " + this.a);
                    if(!e0.b(((Context)this.d.get()).getApplicationContext())) {
                        this.a(100001);
                        return;
                    }
                    x x0 = this.e;
                    if(x0 == null) {
                        this.e = new x();
                    }
                    else {
                        x0.a();
                    }
                    AdSize adSize0 = this.c;
                    if(adSize0 == AdSize.BANNER_320x100) {
                        t$e0 = e.d;
                    }
                    else {
                        t$e0 = adSize0 == AdSize.BANNER_300x250 || adSize0 == AdSize.BANNER_ADAPTIVE_SIZE ? e.c : e.b;
                    }
                    this.k = 0L;
                    List list0 = E.g().a(this.a);
                    if(list0 == null) {
                        jSONObject1 = null;
                    }
                    else {
                        JSONObject jSONObject0 = new JSONObject();
                        k k0 = k.c;
                        if(list0.contains(k0.b())) {
                            i i0 = i.e;
                            if(y.a(i0, this.l)) {
                                jSONObject0.put(k0.b() + "", this.a(i0).getBiddingToken(((Context)this.d.get()).getApplicationContext()));
                            }
                        }
                        k k1 = k.d;
                        if(list0.contains(k1.b())) {
                            i i1 = i.r;
                            if(y.a(i1, this.l)) {
                                jSONObject0.put(k1.b() + "", this.a(i1).getBiddingToken(((Context)this.d.get()).getApplicationContext()));
                            }
                        }
                        k k2 = k.f;
                        if(list0.contains(k2.b())) {
                            i i2 = i.l;
                            if(y.a(i2, this.l)) {
                                jSONObject0.put(k2.b() + "", this.a(i2).getBiddingToken(((Context)this.d.get()).getApplicationContext()));
                            }
                        }
                        k k3 = k.g;
                        if(list0.contains(k3.b())) {
                            i i3 = i.v;
                            if(y.a(i3, this.l)) {
                                jSONObject0.put(k3.b() + "", this.a(i3).getBiddingToken(((Context)this.d.get()).getApplicationContext()));
                            }
                        }
                        com.igaworks.ssp.b.c(Thread.currentThread(), "load Banner biddingTokenParameter : " + jSONObject0);
                        jSONObject1 = jSONObject0;
                    }
                    E.g().d().a(((Context)this.d.get()).getApplicationContext(), t$e0, this.a, this.b, jSONObject1, new com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd.e(this));
                    return;
                }
                this.a(2030);
                return;
            }
            catch(Exception exception0) {
            }
        }
        this.m = false;
        com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
        this.a(200);
    }

    public void onPause() {
        try {
            BaseMediationAdapter baseMediationAdapter0 = this.g;
            if(baseMediationAdapter0 != null) {
                baseMediationAdapter0.onPauseBanner();
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public void onResume() {
        try {
            BaseMediationAdapter baseMediationAdapter0 = this.g;
            if(baseMediationAdapter0 != null) {
                baseMediationAdapter0.onResumeBanner();
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public void setAdSize(AdSize adSize0) {
        this.c = adSize0;
    }

    public void setAutoBgColor(boolean z) {
        com.igaworks.ssp.b.c(Thread.currentThread(), "setAutoBgColor : " + z);
        this.n = z;
    }

    public void setBannerAnimType(BannerAnimType bannerAnimType0) {
        com.igaworks.ssp.b.c(Thread.currentThread(), "setBannerAnimType : " + bannerAnimType0);
        this.o = bannerAnimType0;
    }

    public void setBannerEventCallbackListener(IBannerEventCallbackListener iBannerEventCallbackListener0) {
        this.f = iBannerEventCallbackListener0;
    }

    public void setMediationExtras(HashMap hashMap0) {
        if(hashMap0 != null) {
            try {
                if(this.p == null) {
                    this.p = new HashMap();
                }
                if(hashMap0.containsKey("CAULY_DYNAMIC_RELOAD_INTERVAL")) {
                    this.p.put("CAULY_DYNAMIC_RELOAD_INTERVAL", hashMap0.get("CAULY_DYNAMIC_RELOAD_INTERVAL"));
                }
                if(hashMap0.containsKey("CAULY_RELOAD_INTERVAL")) {
                    this.p.put("CAULY_RELOAD_INTERVAL", hashMap0.get("CAULY_RELOAD_INTERVAL"));
                }
                if(hashMap0.containsKey("CAULY_THREAD_PRIORITY")) {
                    this.p.put("CAULY_THREAD_PRIORITY", hashMap0.get("CAULY_THREAD_PRIORITY"));
                }
                if(hashMap0.containsKey("CAULY_ENABLE_LOCK")) {
                    this.p.put("CAULY_ENABLE_LOCK", hashMap0.get("CAULY_ENABLE_LOCK"));
                }
                if(hashMap0.containsKey("MEZZO_STORE_URL")) {
                    this.p.put("MEZZO_STORE_URL", hashMap0.get("MEZZO_STORE_URL"));
                }
                if(hashMap0.containsKey("MEZZO_IS_USED_BACKGROUND_CHECK")) {
                    this.p.put("MEZZO_IS_USED_BACKGROUND_CHECK", hashMap0.get("MEZZO_IS_USED_BACKGROUND_CHECK"));
                }
                if(hashMap0.containsKey("MEZZO_AGE_LEVEL")) {
                    this.p.put("MEZZO_AGE_LEVEL", hashMap0.get("MEZZO_AGE_LEVEL"));
                }
                if(hashMap0.containsKey("NAM_OBSERVING_ON_BACKGROUND")) {
                    this.p.put("NAM_OBSERVING_ON_BACKGROUND", hashMap0.get("NAM_OBSERVING_ON_BACKGROUND"));
                    return;
                }
                return;
            }
            catch(Exception exception0) {
            }
            exception0.printStackTrace();
        }
    }

    public void setMediationLogListener(IMediationLogListener iMediationLogListener0) {
        this.u = iMediationLogListener0;
    }

    public void setNetworkScheduleTimeout(int v) {
        com.igaworks.ssp.b.c(Thread.currentThread(), "setNetworkScheduleTimeout : " + v);
        if(v <= 0) {
            this.s = 5000L;
            return;
        }
        this.s = (long)(v * 1000);
    }

    public void setPlacementAppKey(String s) {
        this.b = s;
    }

    public void setPlacementId(String s) {
        this.a = s;
        E.g().a(this);
    }

    public void setRefreshTime(int v) {
        com.igaworks.ssp.b.c(Thread.currentThread(), "refreshTime : " + v);
        if(v == -1) {
            this.j = -1L;
            return;
        }
        if(v < 15) {
            this.j = 15000L;
            return;
        }
        if(v > 300) {
            this.j = 300000L;
            return;
        }
        this.j = (long)(v * 1000);
    }

    public void stopAd() {
        try {
            com.igaworks.ssp.b.c(Thread.currentThread(), "stopAd : " + this.a);
            BaseMediationAdapter baseMediationAdapter0 = this.g;
            if(baseMediationAdapter0 != null) {
                baseMediationAdapter0.destroyBannerAd();
                this.g.setBannerMediationAdapterEventListener(null);
                this.g = null;
            }
            this.h = 0;
            this.m = false;
            x x0 = this.e;
            if(x0 != null) {
                x0.a();
                this.e = null;
            }
            if(this.i != null) {
                this.i = null;
            }
            this.a(true);
            this.b();
            E.g().b(this);
            this.setBackgroundColor(0);
            this.k = 0L;
            this.r = false;
            return;
        }
        catch(Exception exception0) {
        }
        com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
        this.m = false;
    }
}

