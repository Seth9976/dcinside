package com.igaworks.ssp.part.popcontents;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.igaworks.ssp.E.j;
import com.igaworks.ssp.E;
import com.igaworks.ssp.M;
import com.igaworks.ssp.SSPErrorCode;
import com.igaworks.ssp.b;
import com.igaworks.ssp.d0;
import com.igaworks.ssp.e0;
import com.igaworks.ssp.f0;
import com.igaworks.ssp.part.popcontents.activity.AdPopcornSSPPopContentsAdActivity;
import com.igaworks.ssp.part.popcontents.listener.IPopContentsAdEventCallbackListener;
import com.igaworks.ssp.s0;
import com.igaworks.ssp.t.e;
import com.igaworks.ssp.t;
import com.igaworks.ssp.z;
import j..util.Objects;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public class AdPopcornSSPPopContentsAd {
    private IPopContentsAdEventCallbackListener a;
    private d0 b;
    private WeakReference c;
    private String d;
    private String e;
    private boolean f;
    private String g;
    private String h;
    private String i;
    private String j;

    public AdPopcornSSPPopContentsAd(Context context0) {
        this.d = "";
        this.f = false;
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.c = new WeakReference(context0);
        E.g().a(this);
    }

    private void a() {
        this.f = false;
        IPopContentsAdEventCallbackListener iPopContentsAdEventCallbackListener0 = this.a;
        if(iPopContentsAdEventCallbackListener0 != null) {
            iPopContentsAdEventCallbackListener0.OnPopContentsAdClosed();
        }
    }

    private void a(int v) {
        IPopContentsAdEventCallbackListener iPopContentsAdEventCallbackListener0 = this.a;
        if(iPopContentsAdEventCallbackListener0 != null) {
            iPopContentsAdEventCallbackListener0.OnPopContentsAdOpenFailed(new SSPErrorCode(v));
        }
    }

    private void b() {
        this.f = true;
        IPopContentsAdEventCallbackListener iPopContentsAdEventCallbackListener0 = this.a;
        if(iPopContentsAdEventCallbackListener0 != null) {
            iPopContentsAdEventCallbackListener0.OnPopContentsAdOpened();
        }
    }

    public void destroy() {
        synchronized(this) {
            try {
                b.c(Thread.currentThread(), "destroy contentsAd : " + this.e);
                if(this.b != null) {
                    this.b = null;
                }
                E.g().b(this);
            }
            catch(Exception exception0) {
                b.a(Thread.currentThread(), exception0);
            }
        }
    }

    public String getPlacementId() {
        return this.e;
    }

    public boolean isPlacementOpened() {
        return this.f;
    }

    public void openPopContents() {
        class a extends z {
            final AdPopcornSSPPopContentsAd a;

            @Override  // com.igaworks.ssp.z
            public void a() {
                class com.igaworks.ssp.part.popcontents.AdPopcornSSPPopContentsAd.a.a implements Runnable {
                    final a a;

                    @Override
                    public void run() {
                        AdPopcornSSPPopContentsAd.this.openPopContents();
                    }
                }

                new Handler(Looper.getMainLooper()).post(new com.igaworks.ssp.part.popcontents.AdPopcornSSPPopContentsAd.a.a(this));
            }
        }


        class com.igaworks.ssp.part.popcontents.AdPopcornSSPPopContentsAd.b implements M {
            final AdPopcornSSPPopContentsAd a;

            @Override  // com.igaworks.ssp.M
            public void onNetResponseListener(e t$e0, String s, String s1, boolean z) {
                class com.igaworks.ssp.part.popcontents.AdPopcornSSPPopContentsAd.b.a implements com.igaworks.ssp.f0.a {
                    final com.igaworks.ssp.part.popcontents.AdPopcornSSPPopContentsAd.b a;

                    @Override  // com.igaworks.ssp.f0$a
                    public void a() {
                        b.c(Thread.currentThread(), "PopContentsActivityEventManager onCloseEvent");
                        AdPopcornSSPPopContentsAd.this.a();
                    }

                    @Override  // com.igaworks.ssp.f0$a
                    public void b() {
                        b.c(Thread.currentThread(), "PopContentsActivityEventManager onOpenedEvent");
                        AdPopcornSSPPopContentsAd.this.b();
                    }
                }

                try {
                    if(s != null && s.length() > 0) {
                        b.a(Thread.currentThread(), "pop contents metadata result = " + s);
                        JSONObject jSONObject0 = new JSONObject(s);
                        if(jSONObject0.has("channel_id")) {
                            String s2 = jSONObject0.getString("channel_id");
                            AdPopcornSSPPopContentsAd.this.g = s2;
                        }
                        if(jSONObject0.has("page_id")) {
                            String s3 = jSONObject0.getString("page_id");
                            AdPopcornSSPPopContentsAd.this.i = s3;
                        }
                        if(jSONObject0.has("service_id")) {
                            String s4 = jSONObject0.getString("service_id");
                            AdPopcornSSPPopContentsAd.this.h = s4;
                        }
                        if(jSONObject0.has("landing_url")) {
                            String s5 = jSONObject0.getString("landing_url");
                            AdPopcornSSPPopContentsAd.this.j = s5;
                            AdPopcornSSPPopContentsAd.this.j = AdPopcornSSPPopContentsAd.this.j.replace("{USN}", AdPopcornSSPPopContentsAd.this.d + ":" + "");
                            AdPopcornSSPPopContentsAd.this.j = AdPopcornSSPPopContentsAd.this.j.replace("{CLIENT_SESSION_ID}", "adid:");
                        }
                        b.c(Thread.currentThread(), "load " + AdPopcornSSPPopContentsAd.this.e + ", popContentsAd : " + AdPopcornSSPPopContentsAd.this.j);
                        Intent intent0 = new Intent(((Context)AdPopcornSSPPopContentsAd.this.c.get()), AdPopcornSSPPopContentsAdActivity.class);
                        intent0.putExtra("popcontents_url", AdPopcornSSPPopContentsAd.this.j);
                        intent0.putExtra("popcontents_channel_id", AdPopcornSSPPopContentsAd.this.g);
                        intent0.putExtra("popcontents_page_id", AdPopcornSSPPopContentsAd.this.i);
                        intent0.putExtra("popcontents_serevice_id", AdPopcornSSPPopContentsAd.this.h);
                        intent0.putExtra("app_key", AdPopcornSSPPopContentsAd.this.d);
                        intent0.putExtra("placement_id", AdPopcornSSPPopContentsAd.this.e);
                        intent0.setFlags(0x10000000);
                        ((Context)AdPopcornSSPPopContentsAd.this.c.get()).getApplicationContext().startActivity(intent0);
                        f0.a().a(AdPopcornSSPPopContentsAd.this.e, new com.igaworks.ssp.part.popcontents.AdPopcornSSPPopContentsAd.b.a(this));
                        return;
                    }
                    AdPopcornSSPPopContentsAd.this.a(0x270F);
                }
                catch(Exception unused_ex) {
                    AdPopcornSSPPopContentsAd.this.a(200);
                }
            }
        }

        synchronized(this) {
            try {
                if(E.g().f()) {
                    if(this.f) {
                        b.b(Thread.currentThread(), this.e + " : PopContentsAd already running");
                        return;
                    }
                    if(this.e == null || this.e.length() == 0) {
                        this.a(2030);
                        return;
                    }
                    if(!E.g().m()) {
                        b.c(Thread.currentThread(), "Checking ADID...");
                        E.g().a(new a(this));
                        E e0 = E.g();
                        Objects.requireNonNull(e0);
                        new j(e0, ((Context)this.c.get()).getApplicationContext()).start();
                        return;
                    }
                    if(!e0.b(((Context)this.c.get()).getApplicationContext())) {
                        this.a(100001);
                        return;
                    }
                    t t0 = E.g().d();
                    if(s0.b(this.d)) {
                        this.d = "";
                    }
                    Object[] arr_object = {this.d, this.e, ""};
                    t0.b(((Context)this.c.get()).getApplicationContext(), String.format("https://popcontents-api-prod.adpopcorn.com/popcontents/metadata?media_key=%s&pid=%s&adid=%s", arr_object), new com.igaworks.ssp.part.popcontents.AdPopcornSSPPopContentsAd.b(this));
                    return;
                }
                b.a(Thread.currentThread(), this.e + " : GDPR_CONSENT_UNAVAILABLE");
                this.a(5008);
            }
            catch(Exception exception0) {
                b.a(Thread.currentThread(), exception0);
                this.a(200);
            }
        }
    }

    public void setPlacementId(String s) {
        this.e = s;
    }

    public void setPopContentsAdEventCallbackListener(IPopContentsAdEventCallbackListener iPopContentsAdEventCallbackListener0) {
        this.a = iPopContentsAdEventCallbackListener0;
    }

    public void setPopContentsAppKey(String s) {
        this.d = s;
    }
}

