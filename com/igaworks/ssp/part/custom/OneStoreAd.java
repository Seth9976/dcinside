package com.igaworks.ssp.part.custom;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.igaworks.ssp.E.j;
import com.igaworks.ssp.E;
import com.igaworks.ssp.M;
import com.igaworks.ssp.SSPErrorCode;
import com.igaworks.ssp.d0;
import com.igaworks.ssp.e0;
import com.igaworks.ssp.g;
import com.igaworks.ssp.p;
import com.igaworks.ssp.part.custom.listener.IOneStoreAdEventCallbackListener;
import com.igaworks.ssp.s0;
import com.igaworks.ssp.t.e;
import com.igaworks.ssp.t0;
import com.igaworks.ssp.y;
import com.igaworks.ssp.z;
import j..util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class OneStoreAd {
    class b implements M {
        final OneStoreAd a;

        @Override  // com.igaworks.ssp.M
        public void onNetResponseListener(e t$e0, String s, String s1, boolean z) {
            if(t$e0 == e.o) {
                try {
                    if(z) {
                        OneStoreAd.this.a(5000);
                        return;
                    }
                    if(s0.b(s)) {
                        OneStoreAd.this.a(0x270F);
                        return;
                    }
                    if(!e0.b(((Context)OneStoreAd.this.a.get()).getApplicationContext())) {
                        OneStoreAd.this.a(100001);
                        return;
                    }
                    d0 d00 = p.f(s);
                    if(d00 != null && d00.h() != 1) {
                        OneStoreAd.this.a(d00.h());
                        return;
                    }
                    OneStoreAd.this.e = d00;
                    if(OneStoreAd.this.e != null && OneStoreAd.this.e.d() != null) {
                        t0.a(((Context)OneStoreAd.this.a.get()), OneStoreAd.this.e.d());
                    }
                    OneStoreAd.this.a();
                    return;
                }
                catch(Exception exception0) {
                }
                com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
                OneStoreAd.this.a(200);
            }
        }
    }

    private WeakReference a;
    private String b;
    private String c;
    private boolean d;
    private d0 e;
    private List f;
    private IOneStoreAdEventCallbackListener g;
    private List h;
    private List i;
    private String j;
    private int k;
    M l;

    public OneStoreAd(Context context0) {
        this.j = "";
        this.k = 0;
        this.l = new b(this);
        this.a = new WeakReference(context0);
    }

    public OneStoreAd(Context context0, String s) {
        this.j = "";
        this.k = 0;
        this.l = new b(this);
        this.a = new WeakReference(context0);
        this.c = s;
    }

    private void a() {
        try {
            if(y.a(this.e)) {
                this.f = this.e.b();
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: this.f) {
                    if(((g)object0) != null && false) {
                        arrayList0.add("");
                    }
                }
                this.a(arrayList0);
                return;
            }
            this.a(this.e.h());
            return;
        }
        catch(Exception exception0) {
        }
        com.igaworks.ssp.b.a(Thread.currentThread(), exception0);
        this.a(200);
    }

    private void a(int v) {
        this.d = false;
        IOneStoreAdEventCallbackListener iOneStoreAdEventCallbackListener0 = this.g;
        if(iOneStoreAdEventCallbackListener0 != null) {
            iOneStoreAdEventCallbackListener0.OnLoadFailed(new SSPErrorCode(v));
        }
    }

    private void a(List list0) {
        this.d = false;
        IOneStoreAdEventCallbackListener iOneStoreAdEventCallbackListener0 = this.g;
        if(iOneStoreAdEventCallbackListener0 != null) {
            iOneStoreAdEventCallbackListener0.OnLoadSuccess(list0);
        }
    }

    public void destroy() {
        List list0 = this.f;
        if(list0 != null) {
            list0.clear();
            this.f = null;
        }
    }

    public void loadAd() {
        class a extends z {
            final OneStoreAd a;

            @Override  // com.igaworks.ssp.z
            public void a() {
                class com.igaworks.ssp.part.custom.OneStoreAd.a.a implements Runnable {
                    final a a;

                    @Override
                    public void run() {
                        OneStoreAd.this.d = false;
                        OneStoreAd.this.loadAd();
                    }
                }

                new Handler(Looper.getMainLooper()).post(new com.igaworks.ssp.part.custom.OneStoreAd.a.a(this));
            }
        }

        E.g().a(this);
        try {
            if(!E.g().f()) {
                com.igaworks.ssp.b.a(Thread.currentThread(), this.b + " : GDPR_CONSENT_UNAVAILABLE");
                this.a(5008);
                return;
            }
            if(this.d) {
                com.igaworks.ssp.b.b(Thread.currentThread(), this.b + " : OneStoreAd In Progress!!");
                return;
            }
            this.d = true;
            if(this.b != null && this.b.length() != 0) {
                if(!E.g().m()) {
                    com.igaworks.ssp.b.c(Thread.currentThread(), "Checking ADID...");
                    E.g().a(new a(this));
                    E e0 = E.g();
                    Objects.requireNonNull(e0);
                    new j(e0, ((Context)this.a.get()).getApplicationContext()).start();
                    return;
                }
                com.igaworks.ssp.b.c(Thread.currentThread(), "load OneStoreAd : " + this.b);
                if(!e0.b(((Context)this.a.get()).getApplicationContext())) {
                    this.a(100001);
                    return;
                }
                E.g().d().a(((Context)this.a.get()).getApplicationContext(), this.b, this.c, this.h, this.i, this.j, this.k, this.l);
                return;
            }
            this.a(2030);
        }
        catch(Exception unused_ex) {
            this.d = false;
        }
    }

    public void onClick(String s) {
        if(this.f == null) {
            return;
        }
        try {
            for(int v = 0; v < this.f.size(); ++v) {
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public void onImpression(String s) {
        if(this.f == null) {
            return;
        }
        try {
            for(int v = 0; v < this.f.size(); ++v) {
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public void setBAppList(List list0) {
        this.i = list0;
    }

    public void setBCatList(List list0) {
        this.h = list0;
    }

    public void setEventListener(IOneStoreAdEventCallbackListener iOneStoreAdEventCallbackListener0) {
        this.g = iOneStoreAdEventCallbackListener0;
    }

    public void setPlacementAppKey(String s) {
        this.c = s;
    }

    public void setPlacementId(String s) {
        this.b = s;
    }

    public void setPlcmtcnt(int v) {
        this.k = v;
    }

    public void setTagId(String s) {
        this.j = s;
    }
}

