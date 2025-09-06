package com.igaworks.ssp.part.contents;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.igaworks.ssp.E.j;
import com.igaworks.ssp.E;
import com.igaworks.ssp.H;
import com.igaworks.ssp.SSPErrorCode;
import com.igaworks.ssp.b;
import com.igaworks.ssp.d0;
import com.igaworks.ssp.e0;
import com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity;
import com.igaworks.ssp.part.contents.listener.IContentsAdEventCallbackListener;
import com.igaworks.ssp.z;
import j..util.Objects;
import java.lang.ref.WeakReference;

public class AdPopcornSSPContentsAd {
    private IContentsAdEventCallbackListener a;
    private d0 b;
    private WeakReference c;
    private String d;
    private String e;
    private boolean f;

    public AdPopcornSSPContentsAd(Context context0) {
        this.f = false;
        this.c = new WeakReference(context0);
        E.g().a(this);
    }

    private void a() {
        this.f = false;
        IContentsAdEventCallbackListener iContentsAdEventCallbackListener0 = this.a;
        if(iContentsAdEventCallbackListener0 != null) {
            iContentsAdEventCallbackListener0.OnContentsAdClosed();
        }
    }

    private void a(int v) {
        IContentsAdEventCallbackListener iContentsAdEventCallbackListener0 = this.a;
        if(iContentsAdEventCallbackListener0 != null) {
            iContentsAdEventCallbackListener0.OnContentsAdOpenFailed(new SSPErrorCode(v));
        }
    }

    private void a(long v, String s) {
        IContentsAdEventCallbackListener iContentsAdEventCallbackListener0 = this.a;
        if(iContentsAdEventCallbackListener0 != null) {
            iContentsAdEventCallbackListener0.OnContentsAdCompleted(v, s);
        }
    }

    private void b() {
        this.f = true;
        IContentsAdEventCallbackListener iContentsAdEventCallbackListener0 = this.a;
        if(iContentsAdEventCallbackListener0 != null) {
            iContentsAdEventCallbackListener0.OnContentsAdOpened();
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

    public void openContents() {
        class a extends z {
            final AdPopcornSSPContentsAd a;

            @Override  // com.igaworks.ssp.z
            public void a() {
                class com.igaworks.ssp.part.contents.AdPopcornSSPContentsAd.a.a implements Runnable {
                    final a a;

                    @Override
                    public void run() {
                        AdPopcornSSPContentsAd.this.openContents();
                    }
                }

                new Handler(Looper.getMainLooper()).post(new com.igaworks.ssp.part.contents.AdPopcornSSPContentsAd.a.a(this));
            }
        }


        class com.igaworks.ssp.part.contents.AdPopcornSSPContentsAd.b implements com.igaworks.ssp.H.a {
            final AdPopcornSSPContentsAd a;

            @Override  // com.igaworks.ssp.H$a
            public void a() {
                b.c(Thread.currentThread(), "ContentsActivityEventManager onCloseEvent");
                AdPopcornSSPContentsAd.this.a();
            }

            @Override  // com.igaworks.ssp.H$a
            public void a(long v, String s) {
                b.c(Thread.currentThread(), "ContentsActivityEventManager onCompleteEvent : " + v + ", rewardKey : " + s);
                AdPopcornSSPContentsAd.this.a(v, s);
            }

            @Override  // com.igaworks.ssp.H$a
            public void b() {
                b.c(Thread.currentThread(), "ContentsActivityEventManager onOpenedEvent");
                AdPopcornSSPContentsAd.this.b();
            }
        }

        synchronized(this) {
            try {
                if(E.g().f()) {
                    if(this.f) {
                        b.b(Thread.currentThread(), this.e + " : ContentsAd already running");
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
                    this.d = "";
                    b.c(Thread.currentThread(), "load contentsAd : " + this.e);
                    Intent intent0 = new Intent(((Context)this.c.get()), AdPopcornSSPContentsAdActivity.class);
                    intent0.putExtra("appKey", this.d);
                    intent0.putExtra("placementId", this.e);
                    intent0.putExtra("usn", "");
                    intent0.setFlags(0x10000000);
                    ((Context)this.c.get()).getApplicationContext().startActivity(intent0);
                    H.a().a(this.e, new com.igaworks.ssp.part.contents.AdPopcornSSPContentsAd.b(this));
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

    public void setContentsAdEventCallbackListener(IContentsAdEventCallbackListener iContentsAdEventCallbackListener0) {
        this.a = iContentsAdEventCallbackListener0;
    }

    public void setPlacementId(String s) {
        this.e = s;
    }
}

