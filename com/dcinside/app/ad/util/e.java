package com.dcinside.app.ad.util;

import Q.c;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class e extends a {
    @l
    private final String c;
    @l
    private final c d;
    @m
    private WeakReference e;
    @l
    private WeakReference f;
    private boolean g;

    public e(@l ViewGroup viewGroup0, @l String s, @l c c0) {
        L.p(viewGroup0, "parent");
        L.p(s, "id");
        L.p(c0, "adHost");
        super();
        this.c = s;
        this.d = c0;
        this.f = new WeakReference(viewGroup0);
    }

    @Override  // com.dcinside.app.ad.util.a
    public boolean a() {
        return this.g;
    }

    @Override  // com.dcinside.app.ad.util.a
    public void e() {
        this.i(true);
        WeakReference weakReference0 = this.e;
        if(weakReference0 != null) {
            AdView adView0 = (AdView)weakReference0.get();
            if(adView0 != null) {
                adView0.destroy();
            }
        }
        WeakReference weakReference1 = this.e;
        if(weakReference1 != null) {
            weakReference1.clear();
        }
        this.e = null;
        this.f.clear();
    }

    @Override  // com.dcinside.app.ad.util.a
    public void f() {
        public static final class com.dcinside.app.ad.util.e.a extends AdListener {
            final e c;

            com.dcinside.app.ad.util.e.a(e e0) {
                this.c = e0;
                super();
            }

            @Override  // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(@l LoadAdError loadAdError0) {
                L.p(loadAdError0, "p0");
                if(this.c.a()) {
                    return;
                }
                int v = loadAdError0.getCode();
                this.c.c("AdMob ads failed: " + v);
            }
        }

        if(this.a()) {
            return;
        }
        ViewGroup viewGroup0 = (ViewGroup)this.f.get();
        if(viewGroup0 == null) {
            return;
        }
        if(viewGroup0.getId() == 0x7F0B007D) {  // id:ad_container_view
            viewGroup0.setVisibility(0);
        }
        s.c(viewGroup0);
        AdView adView0 = new AdView(viewGroup0.getContext());
        adView0.setAdSize(AdSize.BANNER);
        adView0.setAdUnitId(this.c);
        adView0.setAdListener(new com.dcinside.app.ad.util.e.a(this));
        viewGroup0.addView(adView0, new ViewGroup.LayoutParams(-1, -2));
        this.e = new WeakReference(adView0);
        adView0.loadAd(this.d.d());
    }

    @Override  // com.dcinside.app.ad.util.a
    public void g() {
        WeakReference weakReference0 = this.e;
        if(weakReference0 != null) {
            AdView adView0 = (AdView)weakReference0.get();
            if(adView0 != null) {
                adView0.pause();
            }
        }
    }

    @Override  // com.dcinside.app.ad.util.a
    public void h() {
        WeakReference weakReference0 = this.e;
        if(weakReference0 != null) {
            AdView adView0 = (AdView)weakReference0.get();
            if(adView0 != null) {
                adView0.resume();
            }
        }
    }

    @Override  // com.dcinside.app.ad.util.a
    public void i(boolean z) {
        this.g = z;
    }

    @l
    public final c j() {
        return this.d;
    }

    @l
    public final String k() {
        return this.c;
    }
}

