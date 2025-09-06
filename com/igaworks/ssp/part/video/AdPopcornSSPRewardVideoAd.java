package com.igaworks.ssp.part.video;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.igaworks.ssp.E.j;
import com.igaworks.ssp.E;
import com.igaworks.ssp.M;
import com.igaworks.ssp.R.string;
import com.igaworks.ssp.SSPErrorCode;
import com.igaworks.ssp.a0;
import com.igaworks.ssp.common.adapter.BaseMediationAdapter;
import com.igaworks.ssp.d0;
import com.igaworks.ssp.e0;
import com.igaworks.ssp.i0;
import com.igaworks.ssp.i;
import com.igaworks.ssp.j0;
import com.igaworks.ssp.k;
import com.igaworks.ssp.l0;
import com.igaworks.ssp.p;
import com.igaworks.ssp.part.IMediationLogListener;
import com.igaworks.ssp.part.video.activity.AdPopcornSSPRewardPlusWebViewActivity;
import com.igaworks.ssp.part.video.listener.IRewardVideoAdEventCallbackListener;
import com.igaworks.ssp.s0;
import com.igaworks.ssp.t.e;
import com.igaworks.ssp.t0;
import com.igaworks.ssp.t;
import com.igaworks.ssp.y;
import com.igaworks.ssp.z;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

public class AdPopcornSSPRewardVideoAd {
    class g implements l0 {
        final AdPopcornSSPRewardVideoAd a;

        @Override  // com.igaworks.ssp.l0
        public void a() {
            AdPopcornSSPRewardVideoAd.this.callRewardVideoAdListenerClosed();
        }

        @Override  // com.igaworks.ssp.l0
        public void a(int v) {
            AdPopcornSSPRewardVideoAd.this.c();
            try {
                E.g().e();
                if(AdPopcornSSPRewardVideoAd.this.b != null) {
                    Locale locale0 = Locale.getDefault();
                    String s = "&usn=&AdNetworkNo=" + AdPopcornSSPRewardVideoAd.this.getCurrentNetwork() + "&isStartRequest=" + true + "&isCompleted=" + false + "&app_key=" + "" + "&adid=" + "" + "&placement_id=" + AdPopcornSSPRewardVideoAd.this.d + "&platform=android" + "&sdk_version=" + "3.8.2a";
                    if(locale0 != null) {
                        s = s + "&country=" + locale0.getCountry();
                    }
                    String s1 = Build.VERSION.RELEASE;
                    if(s1 != null && !s1.equalsIgnoreCase("")) {
                        s = s + "&os_version=" + s1;
                    }
                    E.g().d().a(((Context)AdPopcornSSPRewardVideoAd.this.c.get()).getApplicationContext(), e.r, "" + s);
                }
            }
            catch(Exception exception0) {
                exception0.printStackTrace();
            }
        }

        @Override  // com.igaworks.ssp.l0
        public void a(int v, boolean z) {
            class b implements M {
                final g a;

                @Override  // com.igaworks.ssp.M
                public void onNetResponseListener(e t$e0, String s, String s1, boolean z) {
                    if(s != null && s.length() > 0) {
                        try {
                            com.igaworks.ssp.b.a(Thread.currentThread(), "callbackNpayPoint result = " + s);
                            JSONObject jSONObject0 = new JSONObject(s);
                            int v = jSONObject0.getInt("ResultCode");
                            int v1 = jSONObject0.has("Reward") ? jSONObject0.getInt("Reward") : 0;
                            switch(v) {
                                case 200: {
                                    AdPopcornSSPRewardVideoAd.this.a(false, 200, 0);
                                    return;
                                }
                                case 6001: {
                                    String s3 = ((Context)AdPopcornSSPRewardVideoAd.this.c.get()).getResources().getString(string.apssp_npay_point_error_user_limit);
                                    AdPopcornSSPRewardVideoAd.this.a(s3);
                                    AdPopcornSSPRewardVideoAd.this.a(false, 6001, 0);
                                    return;
                                }
                                case 6002: {
                                    String s4 = ((Context)AdPopcornSSPRewardVideoAd.this.c.get()).getResources().getString(string.apssp_npay_point_error_ssp_limit);
                                    AdPopcornSSPRewardVideoAd.this.a(s4);
                                    AdPopcornSSPRewardVideoAd.this.a(false, 6002, 0);
                                    return;
                                }
                                case 6005: {
                                    String s5 = ((Context)AdPopcornSSPRewardVideoAd.this.c.get()).getResources().getString(string.apssp_npay_point_error_duplicate);
                                    AdPopcornSSPRewardVideoAd.this.a(s5);
                                    AdPopcornSSPRewardVideoAd.this.a(false, 6005, 0);
                                    return;
                                }
                                default: {
                                    String s2 = ((Context)AdPopcornSSPRewardVideoAd.this.c.get()).getResources().getString(string.apssp_npay_point_success);
                                    AdPopcornSSPRewardVideoAd.this.a(s2);
                                    AdPopcornSSPRewardVideoAd.this.a(true, 1, v1);
                                }
                            }
                        }
                        catch(Exception unused_ex) {
                            AdPopcornSSPRewardVideoAd.this.a(false, 200, 0);
                        }
                    }
                }
            }

            com.igaworks.ssp.b.a(Thread.currentThread(), "onComplete adNetworkNo : " + v + ", completed : " + z);
            AdPopcornSSPRewardVideoAd.this.callRewardVideoAdListenerCompleted(v, z);
            if(AdPopcornSSPRewardVideoAd.this.b != null) {
                try {
                    E.g().e();
                    Locale locale0 = Locale.getDefault();
                    String s = locale0 == null ? "&usn=&AdNetworkNo=" + v + "&isStartRequest=" + false + "&isCompleted=" + z + "&app_key=" + "" + "&adid=" + "" + "&placement_id=" + AdPopcornSSPRewardVideoAd.this.d + "&platform=android" + "&sdk_version=" + "3.8.2a" : "&usn=&AdNetworkNo=" + v + "&isStartRequest=" + false + "&isCompleted=" + z + "&app_key=" + "" + "&adid=" + "" + "&placement_id=" + AdPopcornSSPRewardVideoAd.this.d + "&platform=android" + "&sdk_version=" + "3.8.2a" + "&country=" + locale0.getCountry();
                    String s1 = Build.VERSION.RELEASE;
                    if(s1 != null && !s1.equalsIgnoreCase("")) {
                        s = s + "&os_version=" + s1;
                    }
                    E.g().d().a(((Context)AdPopcornSSPRewardVideoAd.this.c.get()).getApplicationContext(), e.r, "" + s);
                    if(z && AdPopcornSSPRewardVideoAd.this.b.k() > 0) {
                        if(E.g().c("reward_plus_use_state_") == 1) {
                            int v1 = E.g().c("reward_plus_apssp_daily_user_count_");
                            int v2 = E.g().c("reward_plus_apssp_daily_user_limit_");
                            if(v2 > 0 && v2 == v1) {
                                com.igaworks.ssp.b.a(Thread.currentThread(), "npay point : dailyUserLimit = dailyUserCount");
                                AdPopcornSSPRewardVideoAd.this.a(false, 6001, 0);
                                return;
                            }
                            JSONObject jSONObject0 = new JSONObject();
                            jSONObject0.put("ad_request_no", "");
                            jSONObject0.put("advertising_id", "");
                            if(AdPopcornSSPRewardVideoAd.this.getCurrentNetwork() > 0) {
                                jSONObject0.put("is_mediation", true);
                            }
                            else {
                                jSONObject0.put("is_mediation", false);
                            }
                            jSONObject0.put("media_key", "");
                            jSONObject0.put("placement_id", AdPopcornSSPRewardVideoAd.this.d);
                            jSONObject0.put("platform", "android");
                            jSONObject0.put("usn", "");
                            t t0 = E.g().d();
                            Context context0 = (Context)AdPopcornSSPRewardVideoAd.this.c.get();
                            b adPopcornSSPRewardVideoAd$g$b0 = new b(this);
                            t0.a(context0, e.D, jSONObject0, adPopcornSSPRewardVideoAd$g$b0);
                            return;
                        }
                        com.igaworks.ssp.b.a(Thread.currentThread(), "rewardPlusState off");
                        return;
                    }
                    return;
                }
                catch(Exception exception0) {
                }
                exception0.printStackTrace();
                AdPopcornSSPRewardVideoAd.this.a(false, 200, 0);
            }
        }

        @Override  // com.igaworks.ssp.l0
        public void b(int v) {
            if(AdPopcornSSPRewardVideoAd.this.m != null) {
                int v1 = AdPopcornSSPRewardVideoAd.this.getCurrentNetwork();
                AdPopcornSSPRewardVideoAd.this.m.OnMediationLoadSuccess(AdPopcornSSPRewardVideoAd.this.d, v1);
            }
            AdPopcornSSPRewardVideoAd.this.f = v;
            AdPopcornSSPRewardVideoAd.this.b();
        }

        @Override  // com.igaworks.ssp.l0
        public void c(int v) {
            AdPopcornSSPRewardVideoAd.this.a(5005);
        }

        @Override  // com.igaworks.ssp.l0
        public void d(int v) {
            class a implements Runnable {
                final g a;

                @Override
                public void run() {
                    if(AdPopcornSSPRewardVideoAd.this.m != null) {
                        int v = AdPopcornSSPRewardVideoAd.this.getCurrentNetwork();
                        AdPopcornSSPRewardVideoAd.this.m.OnMediationLoadStart(AdPopcornSSPRewardVideoAd.this.d, v);
                    }
                    if(AdPopcornSSPRewardVideoAd.this.j != null) {
                        Object object0 = AdPopcornSSPRewardVideoAd.this.c.get();
                        AdPopcornSSPRewardVideoAd.this.j.loadRewardVideoAd(((Context)object0), AdPopcornSSPRewardVideoAd.this, AdPopcornSSPRewardVideoAd.this.b, AdPopcornSSPRewardVideoAd.this.n, AdPopcornSSPRewardVideoAd.this.f);
                        return;
                    }
                    AdPopcornSSPRewardVideoAd.this.b(200);
                }
            }

            i i0;
            try {
                if(AdPopcornSSPRewardVideoAd.this.m != null) {
                    int v1 = AdPopcornSSPRewardVideoAd.this.getCurrentNetwork();
                    AdPopcornSSPRewardVideoAd.this.m.OnMediationLoadFailed(AdPopcornSSPRewardVideoAd.this.d, v1);
                }
                if(AdPopcornSSPRewardVideoAd.this.j != null) {
                    com.igaworks.ssp.b.a(Thread.currentThread(), "AdPopcornSSPRewardVideoAd Fail in adapter : " + AdPopcornSSPRewardVideoAd.this.j.getNetworkName());
                    AdPopcornSSPRewardVideoAd.this.j.destroyRewardVideoAd();
                }
                if(AdPopcornSSPRewardVideoAd.this.b.e() == null) {
                    AdPopcornSSPRewardVideoAd.this.f = 0;
                    AdPopcornSSPRewardVideoAd.this.b(5002);
                    return;
                }
                if(v >= AdPopcornSSPRewardVideoAd.this.b.e().a().size() - 1) {
                    AdPopcornSSPRewardVideoAd.this.b(5002);
                    return;
                }
                AdPopcornSSPRewardVideoAd.this.f = v + 1;
                i0 = i.a(((a0)AdPopcornSSPRewardVideoAd.this.b.e().a().get(AdPopcornSSPRewardVideoAd.this.f)).a());
                AdPopcornSSPRewardVideoAd.this.n = false;
            }
            catch(Exception exception0) {
                com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
                AdPopcornSSPRewardVideoAd.this.b(200);
                return;
            }
            try {
                if(i0.b() == i.c.b() && y.a(AdPopcornSSPRewardVideoAd.this.b)) {
                    String s = ((com.igaworks.ssp.g)AdPopcornSSPRewardVideoAd.this.b.b().get(0)).k();
                    if(s != null) {
                        if(p.k(s) == k.c.b()) {
                            i0 = i.e;
                            AdPopcornSSPRewardVideoAd.this.n = true;
                        }
                        else if(p.k(s) == k.d.b()) {
                            i0 = i.r;
                            AdPopcornSSPRewardVideoAd.this.n = true;
                        }
                        else if(p.k(s) == k.e.b()) {
                            i0 = i.u;
                            AdPopcornSSPRewardVideoAd.this.n = true;
                        }
                        else if(p.k(s) == k.f.b()) {
                            i0 = i.l;
                            AdPopcornSSPRewardVideoAd.this.n = true;
                        }
                        else if(p.k(s) == k.g.b()) {
                            i0 = i.v;
                            AdPopcornSSPRewardVideoAd.this.n = true;
                        }
                    }
                }
            }
            catch(Exception unused_ex) {
            }
            try {
                BaseMediationAdapter baseMediationAdapter0 = AdPopcornSSPRewardVideoAd.this.a(i0);
                AdPopcornSSPRewardVideoAd.this.j = baseMediationAdapter0;
                AdPopcornSSPRewardVideoAd.this.j.setRewardVideoMediationAdapterEventListener(this);
                if(Looper.myLooper() == Looper.getMainLooper()) {
                    com.igaworks.ssp.b.a(Thread.currentThread(), "AdPopcornSSPRewardVideoAd onFail Main Thread.");
                    if(AdPopcornSSPRewardVideoAd.this.m != null) {
                        int v2 = AdPopcornSSPRewardVideoAd.this.getCurrentNetwork();
                        AdPopcornSSPRewardVideoAd.this.m.OnMediationLoadStart(AdPopcornSSPRewardVideoAd.this.d, v2);
                    }
                    Object object0 = AdPopcornSSPRewardVideoAd.this.c.get();
                    AdPopcornSSPRewardVideoAd.this.j.loadRewardVideoAd(((Context)object0), AdPopcornSSPRewardVideoAd.this, AdPopcornSSPRewardVideoAd.this.b, AdPopcornSSPRewardVideoAd.this.n, AdPopcornSSPRewardVideoAd.this.f);
                    return;
                }
                com.igaworks.ssp.b.a(Thread.currentThread(), "AdPopcornSSPRewardVideoAd onFail Another Thread");
                new Handler(Looper.getMainLooper()).post(new a(this));
                return;
            }
            catch(Exception exception0) {
            }
            com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
            AdPopcornSSPRewardVideoAd.this.b(200);
        }

        @Override  // com.igaworks.ssp.l0
        public void onClickAd() {
            AdPopcornSSPRewardVideoAd.this.callRewardVideoAdListenerClicked();
        }
    }

    private IRewardVideoAdEventCallbackListener a;
    private d0 b;
    private WeakReference c;
    private String d;
    private String e;
    private int f;
    private boolean g;
    private boolean h;
    private ConcurrentHashMap i;
    private BaseMediationAdapter j;
    private long k;
    private boolean l;
    private IMediationLogListener m;
    private boolean n;
    private boolean o;
    private l0 p;

    public AdPopcornSSPRewardVideoAd(Context context0) {
        this.f = 0;
        this.g = false;
        this.h = false;
        this.k = 10000L;
        this.n = false;
        this.o = false;
        this.p = new g(this);
        this.c = new WeakReference(context0);
        E.g().a(this);
        this.l = false;
    }

    public AdPopcornSSPRewardVideoAd(Context context0, String s) {
        this.f = 0;
        this.g = false;
        this.h = false;
        this.k = 10000L;
        this.n = false;
        this.o = false;
        this.p = new g(this);
        this.c = new WeakReference(context0);
        E.g().a(this);
        this.l = false;
        this.e = s;
    }

    private BaseMediationAdapter a(i i0) {
        if(this.i == null) {
            this.i = new ConcurrentHashMap();
        }
        BaseMediationAdapter baseMediationAdapter0 = (BaseMediationAdapter)this.i.get(i0);
        if(baseMediationAdapter0 == null) {
            baseMediationAdapter0 = i0.e();
            if(baseMediationAdapter0 != null) {
                this.i.put(i0, baseMediationAdapter0);
            }
        }
        return baseMediationAdapter0;
    }

    private void a() {
        try {
            if(this.b != null && !this.b.n()) {
                this.b.b(true);
                Object[] arr_object = {"", this.getCurrentNetwork(), this.d};
                E.g().d().a(((Context)this.c.get()).getApplicationContext(), e.i, "" + String.format("&advertising_id=%s&ad_network_no=%d&placement_id=%s", arr_object));
                return;
            }
            com.igaworks.ssp.b.a(Thread.currentThread(), "callMediationImpTracking null or already fired.");
        }
        catch(Exception unused_ex) {
        }
    }

    private void a(int v) {
        this.h = false;
        this.l = false;
        com.igaworks.ssp.b.a(Thread.currentThread(), "callRewardVideoAdListenerOpenFailed : " + this.a);
        IRewardVideoAdEventCallbackListener iRewardVideoAdEventCallbackListener0 = this.a;
        if(iRewardVideoAdEventCallbackListener0 != null) {
            iRewardVideoAdEventCallbackListener0.OnRewardVideoAdOpenFalied();
        }
    }

    private void a(d0 d00) {
        i i1;
        i i0;
        try {
            if(!y.c(d00)) {
                if(!y.a(d00)) {
                    this.a(d00.h());
                    return;
                }
                i0 = i.c;
                this.n = false;
                goto label_6;
            }
            goto label_32;
        }
        catch(Exception exception0) {
            com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
            this.a(200);
            return;
        }
        try {
        label_6:
            String s = ((com.igaworks.ssp.g)this.b.b().get(0)).k();
            if(s != null) {
                if(p.k(s) == k.c.b()) {
                    i0 = i.e;
                    this.n = true;
                }
                else if(p.k(s) == k.d.b()) {
                    i0 = i.r;
                    this.n = true;
                }
                else if(p.k(s) == k.e.b()) {
                    i0 = i.u;
                    this.n = true;
                }
                else if(p.k(s) == k.f.b()) {
                    i0 = i.l;
                    this.n = true;
                }
                else if(p.k(s) == k.g.b()) {
                    i0 = i.v;
                    this.n = true;
                }
            }
        }
        catch(Exception unused_ex) {
        }
        try {
            BaseMediationAdapter baseMediationAdapter0 = this.a(i0);
            this.j = baseMediationAdapter0;
            baseMediationAdapter0.setRewardVideoMediationAdapterEventListener(this.p);
            this.j.showRewardVideoAd(((Context)this.c.get()), d00, this.n, this.f);
            return;
        label_32:
            y.a(d00, this.i);
            i1 = i.a(((a0)d00.e().a().get(this.f)).a());
            this.n = false;
        }
        catch(Exception exception0) {
            com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
            this.a(200);
            return;
        }
        try {
            if(i1.b() == i.c.b() && y.a(this.b)) {
                String s1 = ((com.igaworks.ssp.g)this.b.b().get(0)).k();
                if(s1 != null) {
                    if(p.k(s1) == k.c.b()) {
                        i1 = i.e;
                        this.n = true;
                    }
                    else if(p.k(s1) == k.d.b()) {
                        i1 = i.r;
                        this.n = true;
                    }
                    else if(p.k(s1) == k.e.b()) {
                        i1 = i.u;
                        this.n = true;
                    }
                    else if(p.k(s1) == k.f.b()) {
                        i1 = i.l;
                        this.n = true;
                    }
                    else if(p.k(s1) == k.g.b()) {
                        i1 = i.v;
                        this.n = true;
                    }
                }
            }
        }
        catch(Exception unused_ex) {
        }
        try {
            BaseMediationAdapter baseMediationAdapter1 = this.a(i1);
            this.j = baseMediationAdapter1;
            baseMediationAdapter1.setRewardVideoMediationAdapterEventListener(this.p);
            this.j.showRewardVideoAd(((Context)this.c.get()), d00, this.n, this.f);
            return;
        }
        catch(Exception exception0) {
        }
        com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
        this.a(200);
    }

    private void a(String s) {
        class h implements Runnable {
            final String a;
            final AdPopcornSSPRewardVideoAd b;

            h(String s) {
                this.a = s;
                super();
            }

            @Override
            public void run() {
                Toast.makeText(((Context)AdPopcornSSPRewardVideoAd.this.c.get()), this.a, 1).show();
            }
        }

        try {
            new Handler(Looper.getMainLooper()).post(new h(this, s));
        }
        catch(Exception unused_ex) {
        }
    }

    private void a(boolean z, int v, int v1) {
        IRewardVideoAdEventCallbackListener iRewardVideoAdEventCallbackListener0 = this.a;
        if(iRewardVideoAdEventCallbackListener0 != null) {
            iRewardVideoAdEventCallbackListener0.OnRewardPlusCompleted(z, v, v1);
        }
    }

    private void b() {
        this.g = false;
        this.h = true;
        com.igaworks.ssp.b.a(Thread.currentThread(), "AdPopcornSSPRewardVideoAd OnRewardVideoAdLoaded isPlayingRewardVideo : " + this.l + ", listener : " + this.a);
        if(!this.l) {
            IRewardVideoAdEventCallbackListener iRewardVideoAdEventCallbackListener0 = this.a;
            if(iRewardVideoAdEventCallbackListener0 != null) {
                iRewardVideoAdEventCallbackListener0.OnRewardVideoAdLoaded();
            }
        }
    }

    private void b(int v) {
        this.g = false;
        this.h = false;
        com.igaworks.ssp.b.a(Thread.currentThread(), "AdPopcornSSPRewardVideoAd OnRewardVideoAdLoadFailed isPlayingRewardVideo : " + this.l + ", listener : " + this.a);
        if(!this.l) {
            IRewardVideoAdEventCallbackListener iRewardVideoAdEventCallbackListener0 = this.a;
            if(iRewardVideoAdEventCallbackListener0 != null) {
                iRewardVideoAdEventCallbackListener0.OnRewardVideoAdLoadFailed(new SSPErrorCode(v));
            }
        }
    }

    private void c() {
        this.h = false;
        this.l = true;
        this.o = true;
        this.a();
        com.igaworks.ssp.b.a(Thread.currentThread(), "callRewardVideoAdListenerOpened : " + this.a);
        IRewardVideoAdEventCallbackListener iRewardVideoAdEventCallbackListener0 = this.a;
        if(iRewardVideoAdEventCallbackListener0 != null) {
            iRewardVideoAdEventCallbackListener0.OnRewardVideoAdOpened();
        }
    }

    public void callRewardVideoAdListenerClicked() {
        com.igaworks.ssp.b.a(Thread.currentThread(), "callRewardVideoAdListenerClicked : " + this.a);
        IRewardVideoAdEventCallbackListener iRewardVideoAdEventCallbackListener0 = this.a;
        if(iRewardVideoAdEventCallbackListener0 != null) {
            iRewardVideoAdEventCallbackListener0.OnRewardVideoAdClicked();
        }
    }

    public void callRewardVideoAdListenerClosed() {
        this.l = false;
        com.igaworks.ssp.b.a(Thread.currentThread(), "callRewardVideoAdListenerClosed : " + this.a);
        IRewardVideoAdEventCallbackListener iRewardVideoAdEventCallbackListener0 = this.a;
        if(iRewardVideoAdEventCallbackListener0 != null) {
            iRewardVideoAdEventCallbackListener0.OnRewardVideoAdClosed();
        }
    }

    public void callRewardVideoAdListenerCompleted(int v, boolean z) {
        try {
            this.l = false;
            com.igaworks.ssp.b.a(Thread.currentThread(), "callRewardVideoAdListenerCompleted : " + this.a);
            if(z) {
                this.d();
            }
            IRewardVideoAdEventCallbackListener iRewardVideoAdEventCallbackListener0 = this.a;
            if(iRewardVideoAdEventCallbackListener0 != null) {
                iRewardVideoAdEventCallbackListener0.OnRewardVideoPlayCompleted(v, z);
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
    }

    private void d() {
        try {
            if(E.g().e(this.d)) {
                com.igaworks.ssp.b.a(Thread.currentThread(), "claimPointBox : " + this.o);
                if(this.o) {
                    this.o = false;
                    JSONObject jSONObject0 = new JSONObject();
                    E.g().e();
                    jSONObject0.put("ad_request_no", "");
                    jSONObject0.put("advertising_id", "");
                    jSONObject0.put("impression_campaign_type", 13);
                    jSONObject0.put("media_key", "");
                    jSONObject0.put("placement_id", this.d);
                    jSONObject0.put("platform", "android");
                    jSONObject0.put("usn", "");
                    i0.a(((Context)this.c.get()), jSONObject0);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public void destroy() {
        synchronized(this) {
            try {
                com.igaworks.ssp.b.c(Thread.currentThread(), "destroy : " + this.d);
                BaseMediationAdapter baseMediationAdapter0 = this.j;
                if(baseMediationAdapter0 != null) {
                    baseMediationAdapter0.destroyRewardVideoAd();
                    this.j.setRewardVideoMediationAdapterEventListener(null);
                    this.j = null;
                }
                if(this.b != null) {
                    this.b = null;
                }
                this.g = false;
                this.e();
                E.g().b(this);
            }
            catch(Exception exception0) {
                com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
            }
        }
    }

    private void e() {
        ConcurrentHashMap concurrentHashMap0 = this.i;
        if(concurrentHashMap0 != null) {
            concurrentHashMap0.clear();
            this.i = null;
        }
    }

    private void f() {
        class f implements Runnable {
            final AdPopcornSSPRewardVideoAd a;

            @Override
            public void run() {
                if(AdPopcornSSPRewardVideoAd.this.m != null) {
                    AdPopcornSSPRewardVideoAd.this.m.OnMediationLoadStart(AdPopcornSSPRewardVideoAd.this.d, AdPopcornSSPRewardVideoAd.this.getCurrentNetwork());
                }
                if(AdPopcornSSPRewardVideoAd.this.j != null) {
                    Object object0 = AdPopcornSSPRewardVideoAd.this.c.get();
                    AdPopcornSSPRewardVideoAd.this.j.loadRewardVideoAd(((Context)object0), AdPopcornSSPRewardVideoAd.this, AdPopcornSSPRewardVideoAd.this.b, AdPopcornSSPRewardVideoAd.this.n, AdPopcornSSPRewardVideoAd.this.f);
                    return;
                }
                AdPopcornSSPRewardVideoAd.this.b(200);
            }
        }

        i i1;
        i i0;
        try {
            if(!y.c(this.b)) {
                if(!y.a(this.b)) {
                    this.b(this.b.h());
                    return;
                }
                i0 = i.c;
                this.n = false;
                goto label_6;
            }
            goto label_35;
        }
        catch(Exception exception0) {
            com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
            this.b(200);
            return;
        }
        try {
        label_6:
            String s = ((com.igaworks.ssp.g)this.b.b().get(0)).k();
            if(s != null) {
                if(p.k(s) == k.c.b()) {
                    i0 = i.e;
                    this.n = true;
                }
                else if(p.k(s) == k.d.b()) {
                    i0 = i.r;
                    this.n = true;
                }
                else if(p.k(s) == k.e.b()) {
                    i0 = i.u;
                    this.n = true;
                }
                else if(p.k(s) == k.f.b()) {
                    i0 = i.l;
                    this.n = true;
                }
                else if(p.k(s) == k.g.b()) {
                    i0 = i.v;
                    this.n = true;
                }
            }
        }
        catch(Exception unused_ex) {
        }
        try {
            BaseMediationAdapter baseMediationAdapter0 = this.a(i0);
            this.j = baseMediationAdapter0;
            baseMediationAdapter0.setRewardVideoMediationAdapterEventListener(this.p);
            IMediationLogListener iMediationLogListener0 = this.m;
            if(iMediationLogListener0 != null) {
                iMediationLogListener0.OnMediationLoadStart(this.d, this.getCurrentNetwork());
            }
            this.j.loadRewardVideoAd(((Context)this.c.get()), this, this.b, this.n, this.f);
            return;
        label_35:
            y.a(this.b, this.i);
            this.f = 0;
            i1 = i.a(((a0)this.b.e().a().get(0)).a());
            this.n = false;
        }
        catch(Exception exception0) {
            com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
            this.b(200);
            return;
        }
        try {
            if(i1.b() == i.c.b() && y.a(this.b)) {
                String s1 = ((com.igaworks.ssp.g)this.b.b().get(0)).k();
                if(s1 != null) {
                    if(p.k(s1) == k.c.b()) {
                        i1 = i.e;
                        this.n = true;
                    }
                    else if(p.k(s1) == k.d.b()) {
                        i1 = i.r;
                        this.n = true;
                    }
                    else if(p.k(s1) == k.e.b()) {
                        i1 = i.u;
                        this.n = true;
                    }
                    else if(p.k(s1) == k.f.b()) {
                        i1 = i.l;
                        this.n = true;
                    }
                    else if(p.k(s1) == k.g.b()) {
                        i1 = i.v;
                        this.n = true;
                    }
                }
            }
        }
        catch(Exception unused_ex) {
        }
        try {
            BaseMediationAdapter baseMediationAdapter1 = this.a(i1);
            this.j = baseMediationAdapter1;
            baseMediationAdapter1.setRewardVideoMediationAdapterEventListener(this.p);
            if(Looper.myLooper() == Looper.getMainLooper()) {
                com.igaworks.ssp.b.a(Thread.currentThread(), "AdPopcornSSPRewardVideoAd loadRewardVideoAd Main Thread.");
                IMediationLogListener iMediationLogListener1 = this.m;
                if(iMediationLogListener1 != null) {
                    iMediationLogListener1.OnMediationLoadStart(this.d, this.getCurrentNetwork());
                }
                this.j.loadRewardVideoAd(((Context)this.c.get()), this, this.b, this.n, this.f);
                return;
            }
            com.igaworks.ssp.b.a(Thread.currentThread(), "AdPopcornSSPRewardVideoAd loadRewardVideoAd Another Thread");
            new Handler(Looper.getMainLooper()).post(new f(this));
            return;
        }
        catch(Exception exception0) {
        }
        com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
        this.b(200);
    }

    // 去混淆评级： 低(20)
    public String getAdRequestNo() [...] // 潜在的解密器

    public int getCurrentNetwork() {
        try {
            return this.j == null ? -1 : i.a(this.j.getNetworkName()).b();
        }
        catch(Exception unused_ex) {
        }
        return -1;
    }

    public long getNetworkScheduleTimeout() {
        return this.k;
    }

    public String getPlacementId() {
        return this.d;
    }

    public boolean isReady() {
        return this.h;
    }

    public void loadAd() {
        class com.igaworks.ssp.part.video.AdPopcornSSPRewardVideoAd.a extends z {
            final AdPopcornSSPRewardVideoAd a;

            @Override  // com.igaworks.ssp.z
            public void a() {
                class com.igaworks.ssp.part.video.AdPopcornSSPRewardVideoAd.a.a implements Runnable {
                    final com.igaworks.ssp.part.video.AdPopcornSSPRewardVideoAd.a a;

                    @Override
                    public void run() {
                        AdPopcornSSPRewardVideoAd.this.g = false;
                        AdPopcornSSPRewardVideoAd.this.loadAd();
                    }
                }

                new Handler(Looper.getMainLooper()).post(new com.igaworks.ssp.part.video.AdPopcornSSPRewardVideoAd.a.a(this));
            }
        }


        class com.igaworks.ssp.part.video.AdPopcornSSPRewardVideoAd.b implements M {
            final AdPopcornSSPRewardVideoAd a;

            @Override  // com.igaworks.ssp.M
            public void onNetResponseListener(e t$e0, String s, String s1, boolean z) {
                try {
                    if(z) {
                        AdPopcornSSPRewardVideoAd.this.b(5000);
                        return;
                    }
                    if(s0.b(s)) {
                        AdPopcornSSPRewardVideoAd.this.b(0x270F);
                        return;
                    }
                    d0 d00 = p.f(s);
                    if(d00 != null && d00.h() != 1) {
                        AdPopcornSSPRewardVideoAd.this.b(d00.h());
                        return;
                    }
                    AdPopcornSSPRewardVideoAd.this.b = d00;
                    if(AdPopcornSSPRewardVideoAd.this.b != null && AdPopcornSSPRewardVideoAd.this.b.d() != null) {
                        t0.a(((Context)AdPopcornSSPRewardVideoAd.this.c.get()), AdPopcornSSPRewardVideoAd.this.b.d());
                    }
                    E.g().c(AdPopcornSSPRewardVideoAd.this.b.q());
                    AdPopcornSSPRewardVideoAd.this.f();
                    return;
                }
                catch(Exception exception0) {
                }
                com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
                AdPopcornSSPRewardVideoAd.this.b(200);
            }
        }

        JSONObject jSONObject0;
        synchronized(this) {
            try {
                if(E.g().f()) {
                    if(this.g) {
                        com.igaworks.ssp.b.b(Thread.currentThread(), "loadAd() -> " + this.d + " : RewardVideoAd In Progress!!");
                        return;
                    }
                    this.g = true;
                    this.h = false;
                    if(this.d == null || this.d.isEmpty()) {
                        this.b(2030);
                        return;
                    }
                    if(!E.g().m()) {
                        com.igaworks.ssp.b.c(Thread.currentThread(), "Checking ADID...");
                        E.g().a(new com.igaworks.ssp.part.video.AdPopcornSSPRewardVideoAd.a(this));
                        E e0 = E.g();
                        Objects.requireNonNull(e0);
                        new j(e0, ((Context)this.c.get()).getApplicationContext()).start();
                        return;
                    }
                    if(!e0.b(((Context)this.c.get()).getApplicationContext())) {
                        this.b(100001);
                        return;
                    }
                    com.igaworks.ssp.b.c(Thread.currentThread(), "load RewardVideoAd : " + this.d);
                    List list0 = E.g().a(this.d);
                    if(list0 == null) {
                        jSONObject0 = null;
                    }
                    else {
                        jSONObject0 = new JSONObject();
                        k k0 = k.c;
                        if(list0.contains(k0.b())) {
                            i i0 = i.e;
                            if(y.a(i0, this.i)) {
                                jSONObject0.put(k0.b() + "", this.a(i0).getBiddingToken(((Context)this.c.get()).getApplicationContext()));
                            }
                        }
                        k k1 = k.d;
                        if(list0.contains(k1.b())) {
                            i i1 = i.r;
                            if(y.a(i1, this.i)) {
                                jSONObject0.put(k1.b() + "", this.a(i1).getBiddingToken(((Context)this.c.get()).getApplicationContext()));
                            }
                        }
                        k k2 = k.e;
                        if(list0.contains(k2.b())) {
                            i i2 = i.u;
                            if(y.a(i2, this.i)) {
                                jSONObject0.put(k2.b() + "", this.a(i2).getBiddingToken(((Context)this.c.get()).getApplicationContext()));
                            }
                        }
                        k k3 = k.f;
                        if(list0.contains(k3.b())) {
                            i i3 = i.l;
                            if(y.a(i3, this.i)) {
                                jSONObject0.put(k3.b() + "", this.a(i3).getBiddingToken(((Context)this.c.get()).getApplicationContext()));
                            }
                        }
                        k k4 = k.g;
                        if(list0.contains(k4.b())) {
                            i i4 = i.v;
                            if(y.a(i4, this.i)) {
                                jSONObject0.put(k4.b() + "", this.a(i4).getBiddingToken(((Context)this.c.get()).getApplicationContext()));
                            }
                        }
                        com.igaworks.ssp.b.c(Thread.currentThread(), "load RewardVideoAd biddingTokenParameter : " + jSONObject0);
                    }
                    t t0 = E.g().d();
                    Context context0 = ((Context)this.c.get()).getApplicationContext();
                    String s = this.d;
                    String s1 = this.e;
                    com.igaworks.ssp.part.video.AdPopcornSSPRewardVideoAd.b adPopcornSSPRewardVideoAd$b0 = new com.igaworks.ssp.part.video.AdPopcornSSPRewardVideoAd.b(this);
                    t0.a(context0, e.l, s, s1, jSONObject0, adPopcornSSPRewardVideoAd$b0);
                    return;
                }
                com.igaworks.ssp.b.a(Thread.currentThread(), this.d + " : GDPR_CONSENT_UNAVAILABLE");
                this.b(5008);
            }
            catch(Exception exception0) {
                com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
                this.b(200);
            }
        }
    }

    public void onPause() {
        try {
            BaseMediationAdapter baseMediationAdapter0 = this.j;
            if(baseMediationAdapter0 != null) {
                baseMediationAdapter0.pauseRewardVideoAd();
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public void onResume() {
        try {
            BaseMediationAdapter baseMediationAdapter0 = this.j;
            if(baseMediationAdapter0 != null) {
                baseMediationAdapter0.resumeRewardVideoAd();
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public void setCurrentActivity(Activity activity0) {
        WeakReference weakReference0 = this.c;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        this.c = new WeakReference(activity0);
    }

    public void setMediationLogListener(IMediationLogListener iMediationLogListener0) {
        this.m = iMediationLogListener0;
    }

    public void setNetworkScheduleTimeout(int v) {
        com.igaworks.ssp.b.c(Thread.currentThread(), "setNetworkScheduleTimeout : " + v);
        this.k = (long)(v * 1000);
    }

    public void setPlacementAppKey(String s) {
        this.e = s;
    }

    public void setPlacementId(String s) {
        this.d = s;
    }

    public void setRewardVideoAdEventCallbackListener(IRewardVideoAdEventCallbackListener iRewardVideoAdEventCallbackListener0) {
        this.a = iRewardVideoAdEventCallbackListener0;
    }

    public void showAd() {
        class c implements M {
            final AdPopcornSSPRewardVideoAd a;

            @Override  // com.igaworks.ssp.M
            public void onNetResponseListener(e t$e0, String s, String s1, boolean z) {
                class com.igaworks.ssp.part.video.AdPopcornSSPRewardVideoAd.c.a implements Runnable {
                    final c a;

                    @Override
                    public void run() {
                        try {
                            d0 d00 = new d0(AdPopcornSSPRewardVideoAd.this.b);
                            AdPopcornSSPRewardVideoAd.this.a(d00);
                            AdPopcornSSPRewardVideoAd.this.h = false;
                        }
                        catch(Exception exception0) {
                            com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
                            AdPopcornSSPRewardVideoAd.this.a(200);
                        }
                    }
                }


                class com.igaworks.ssp.part.video.AdPopcornSSPRewardVideoAd.c.b implements Runnable {
                    final c a;

                    @Override
                    public void run() {
                        try {
                            d0 d00 = new d0(AdPopcornSSPRewardVideoAd.this.b);
                            AdPopcornSSPRewardVideoAd.this.a(d00);
                            AdPopcornSSPRewardVideoAd.this.h = false;
                        }
                        catch(Exception exception0) {
                            com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
                            AdPopcornSSPRewardVideoAd.this.a(200);
                        }
                    }
                }

                int v5;
                String s2 = "";
                if(s == null || s.length() <= 0) {
                    String s8 = ((Context)AdPopcornSSPRewardVideoAd.this.c.get()).getResources().getString(string.apssp_default_unknown_error);
                    AdPopcornSSPRewardVideoAd.this.a(s8);
                    try {
                    label_61:
                        v5 = 5;
                    }
                    catch(Exception unused_ex) {
                        v5 = 0;
                    }
                }
                else {
                    try {
                        com.igaworks.ssp.b.a(Thread.currentThread(), "callbackGetNpayUser result = " + s);
                        JSONObject jSONObject0 = new JSONObject(s);
                        int v = jSONObject0.getInt("ResultCode");
                        switch(v) {
                            case 1: {
                                int v6 = jSONObject0.has("DailyUserCount") ? jSONObject0.getInt("DailyUserCount") : -1;
                                int v7 = jSONObject0.has("DailyUserLimit") ? jSONObject0.getInt("DailyUserLimit") : -1;
                                String s5 = jSONObject0.has("NaverMaskingId") ? jSONObject0.getString("NaverMaskingId") : "";
                                if(v6 > -1) {
                                    E.g().a("reward_plus_apssp_daily_user_count_", v6);
                                }
                                if(v7 > -1) {
                                    E.g().a("reward_plus_apssp_daily_user_limit_", v7);
                                }
                                if(s5 == null || s5.length() <= 0) {
                                    v5 = 5;
                                }
                                else {
                                    E.g().a("reward_plus_apssp_npay_masking_id_", s5);
                                    goto label_61;
                                }
                                break;
                            }
                            case 6001: {
                                int v8 = jSONObject0.has("DailyUserCount") ? jSONObject0.getInt("DailyUserCount") : -1;
                                int v9 = jSONObject0.has("DailyUserLimit") ? jSONObject0.getInt("DailyUserLimit") : -1;
                                String s6 = jSONObject0.has("NaverMaskingId") ? jSONObject0.getString("NaverMaskingId") : "";
                                if(v8 > -1) {
                                    E.g().a("reward_plus_apssp_daily_user_count_", v8);
                                }
                                if(v9 > -1) {
                                    E.g().a("reward_plus_apssp_daily_user_limit_", v9);
                                }
                                if(s6 != null && s6.length() > 0) {
                                    E.g().a("reward_plus_apssp_npay_masking_id_", s6);
                                }
                                int v10 = Calendar.getInstance().get(6);
                                int v11 = E.g().c("reward_plus_user_daily_cap_day_");
                                if(E.g().c("reward_plus_enable_notice_") == 0) {
                                    String s7 = ((Context)AdPopcornSSPRewardVideoAd.this.c.get()).getResources().getString(string.apssp_npay_point_error_user_limit);
                                    AdPopcornSSPRewardVideoAd.this.a(s7);
                                    goto label_61;
                                }
                                else if(v10 == v11) {
                                    v5 = 5;
                                }
                                else {
                                    s2 = "type=1&daily_cap=" + v9;
                                    v5 = 3;
                                }
                                break;
                            }
                            default: {
                                if(v == 6002) {
                                    int v1 = jSONObject0.has("DailyUserCount") ? jSONObject0.getInt("DailyUserCount") : 0;
                                    int v2 = jSONObject0.has("DailyUserLimit") ? jSONObject0.getInt("DailyUserLimit") : 0;
                                    String s3 = jSONObject0.getString("NaverMaskingId");
                                    E.g().a("reward_plus_apssp_daily_user_count_", v1);
                                    E.g().a("reward_plus_apssp_daily_user_limit_", v2);
                                    E.g().a("reward_plus_apssp_npay_masking_id_", s3);
                                    int v3 = Calendar.getInstance().get(6);
                                    int v4 = E.g().c("reward_plus_apssp_daily_cap_day_");
                                    if(E.g().c("reward_plus_enable_notice_") == 0) {
                                        String s4 = ((Context)AdPopcornSSPRewardVideoAd.this.c.get()).getResources().getString(string.apssp_npay_point_error_ssp_limit);
                                        AdPopcornSSPRewardVideoAd.this.a(s4);
                                        goto label_61;
                                    }
                                    else if(v3 == v4) {
                                        goto label_61;
                                    }
                                    else {
                                        s2 = "type=2";
                                        v5 = 4;
                                    }
                                }
                                else if(v == 6003) {
                                    v5 = 1;
                                }
                                else {
                                    v5 = 0;
                                }
                            }
                        }
                    }
                    catch(Exception unused_ex) {
                        v5 = 0;
                    }
                }
                if(v5 == 5) {
                    if(Looper.myLooper() == Looper.getMainLooper()) {
                        com.igaworks.ssp.b.a(Thread.currentThread(), "REWARD_PLUS_GET_USER_NEXT_ACTION.SHOW_VIDEO Main Thread : " + s1);
                        d0 d00 = new d0(AdPopcornSSPRewardVideoAd.this.b);
                        AdPopcornSSPRewardVideoAd.this.a(d00);
                        AdPopcornSSPRewardVideoAd.this.h = false;
                        return;
                    }
                    com.igaworks.ssp.b.a(Thread.currentThread(), "REWARD_PLUS_GET_USER_NEXT_ACTION.SHOW_VIDEO Main Another Thread : " + s1);
                    new Handler(Looper.getMainLooper()).post(new com.igaworks.ssp.part.video.AdPopcornSSPRewardVideoAd.c.a(this));
                    return;
                }
                Class class0 = AdPopcornSSPRewardPlusWebViewActivity.class;
                switch(v5) {
                    case 1: {
                        if(E.g().c("reward_plus_use_state_") == -1) {
                            Intent intent0 = AdPopcornSSPRewardVideoAd.this.b.q() ? new Intent(((Context)AdPopcornSSPRewardVideoAd.this.c.get()), class0).putExtra("reward_plus_url", "https://reward-plus-dev.adpopcorn.com/init-npay?isFromSetting=false").putExtra("reward_plus_test_mode", true) : new Intent(((Context)AdPopcornSSPRewardVideoAd.this.c.get()), class0).putExtra("reward_plus_url", "https://reward-plus.adpopcorn.com/init-npay?isFromSetting=false").putExtra("reward_plus_test_mode", false);
                            intent0.setFlags(0x10000000);
                            ((Context)AdPopcornSSPRewardVideoAd.this.c.get()).startActivity(intent0);
                            return;
                        }
                        if(Looper.myLooper() == Looper.getMainLooper()) {
                            com.igaworks.ssp.b.a(Thread.currentThread(), "rewardPlusUseState AGREE Main Thread : " + s1);
                            d0 d01 = new d0(AdPopcornSSPRewardVideoAd.this.b);
                            AdPopcornSSPRewardVideoAd.this.a(d01);
                            AdPopcornSSPRewardVideoAd.this.h = false;
                            return;
                        }
                        com.igaworks.ssp.b.a(Thread.currentThread(), "rewardPlusUseState AGREE Main Another Thread : " + s1);
                        new Handler(Looper.getMainLooper()).post(new com.igaworks.ssp.part.video.AdPopcornSSPRewardVideoAd.c.b(this));
                        return;
                    }
                    case 3: 
                    case 4: {
                        Intent intent1 = AdPopcornSSPRewardVideoAd.this.b.q() ? new Intent(((Context)AdPopcornSSPRewardVideoAd.this.c.get()), class0).putExtra("reward_plus_url", "https://reward-plus-dev.adpopcorn.com/notice?" + s2).putExtra("reward_plus_test_mode", true) : new Intent(((Context)AdPopcornSSPRewardVideoAd.this.c.get()), class0).putExtra("reward_plus_url", "https://reward-plus.adpopcorn.com/notice?" + s2).putExtra("reward_plus_test_mode", false);
                        intent1.setFlags(0x10000000);
                        ((Context)AdPopcornSSPRewardVideoAd.this.c.get()).startActivity(intent1);
                    }
                }
            }
        }


        class d implements com.igaworks.ssp.j0.a {
            final AdPopcornSSPRewardVideoAd a;

            @Override  // com.igaworks.ssp.j0$a
            public void a() {
                class com.igaworks.ssp.part.video.AdPopcornSSPRewardVideoAd.d.a implements Runnable {
                    final d a;

                    @Override
                    public void run() {
                        try {
                            d0 d00 = new d0(AdPopcornSSPRewardVideoAd.this.b);
                            AdPopcornSSPRewardVideoAd.this.a(d00);
                            AdPopcornSSPRewardVideoAd.this.h = false;
                        }
                        catch(Exception exception0) {
                            com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
                            AdPopcornSSPRewardVideoAd.this.a(200);
                        }
                    }
                }

                if(Looper.myLooper() == Looper.getMainLooper()) {
                    com.igaworks.ssp.b.a(Thread.currentThread(), "RewardPlusEventManager showAd Main Thread");
                    d0 d00 = new d0(AdPopcornSSPRewardVideoAd.this.b);
                    AdPopcornSSPRewardVideoAd.this.a(d00);
                    AdPopcornSSPRewardVideoAd.this.h = false;
                    return;
                }
                com.igaworks.ssp.b.a(Thread.currentThread(), "RewardPlusEventManager showAd Another Thread");
                new Handler(Looper.getMainLooper()).post(new com.igaworks.ssp.part.video.AdPopcornSSPRewardVideoAd.d.a(this));
            }
        }


        class com.igaworks.ssp.part.video.AdPopcornSSPRewardVideoAd.e implements Runnable {
            final AdPopcornSSPRewardVideoAd a;

            @Override
            public void run() {
                try {
                    d0 d00 = new d0(AdPopcornSSPRewardVideoAd.this.b);
                    AdPopcornSSPRewardVideoAd.this.a(d00);
                    AdPopcornSSPRewardVideoAd.this.h = false;
                }
                catch(Exception exception0) {
                    com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
                    AdPopcornSSPRewardVideoAd.this.a(200);
                }
            }
        }

        synchronized(this) {
            try {
                if(this.l) {
                    com.igaworks.ssp.b.b(Thread.currentThread(), "rewardVideoAd playing...");
                    return;
                }
                if(this.b == null || !this.h) {
                    com.igaworks.ssp.b.c(Thread.currentThread(), "showAd : NO_REWARD_VIDEO_AD_LOADED");
                    this.a(5005);
                    return;
                }
                if(!e0.b(((Context)this.c.get()).getApplicationContext())) {
                    this.a(100001);
                }
                else if(this.b.k() == 1) {
                    t t0 = E.g().d();
                    Context context0 = (Context)this.c.get();
                    JSONObject jSONObject0 = new JSONObject();
                    c adPopcornSSPRewardVideoAd$c0 = new c(this);
                    t0.a(context0, e.B, jSONObject0, adPopcornSSPRewardVideoAd$c0);
                    j0.b().a(new d(this));
                }
                else if(Looper.myLooper() == Looper.getMainLooper()) {
                    com.igaworks.ssp.b.a(Thread.currentThread(), "showAd RewardVideo Main Thread : " + this.d);
                    this.a(new d0(this.b));
                    this.h = false;
                }
                else {
                    com.igaworks.ssp.b.a(Thread.currentThread(), "showAd RewardVideo Another Thread : " + this.d);
                    new Handler(Looper.getMainLooper()).post(new com.igaworks.ssp.part.video.AdPopcornSSPRewardVideoAd.e(this));
                }
            }
            catch(Exception exception0) {
                com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
                this.a(200);
            }
        }
    }
}

