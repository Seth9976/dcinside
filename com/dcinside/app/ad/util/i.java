package com.dcinside.app.ad.util;

import android.view.ViewGroup;
import com.igaworks.ssp.AdSize;
import com.igaworks.ssp.BannerAnimType;
import com.igaworks.ssp.SSPErrorCode;
import com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd;
import com.igaworks.ssp.part.banner.listener.IBannerEventCallbackListener;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class i extends a implements IBannerEventCallbackListener {
    @l
    private final String c;
    @m
    private WeakReference d;
    @l
    private WeakReference e;
    private boolean f;

    public i(@l ViewGroup viewGroup0, @l String s) {
        L.p(viewGroup0, "parent");
        L.p(s, "id");
        super();
        this.c = s;
        this.e = new WeakReference(viewGroup0);
    }

    @Override  // com.igaworks.ssp.part.banner.listener.IBannerEventCallbackListener
    public void OnBannerAdClicked() {
    }

    @Override  // com.igaworks.ssp.part.banner.listener.IBannerEventCallbackListener
    public void OnBannerAdReceiveFailed(@m SSPErrorCode sSPErrorCode0) {
        if(this.a()) {
            return;
        }
        this.c("IgaworksBanner ads failed: " + (sSPErrorCode0 == null ? null : sSPErrorCode0.getErrorCode()));
    }

    @Override  // com.igaworks.ssp.part.banner.listener.IBannerEventCallbackListener
    public void OnBannerAdReceiveSuccess() {
    }

    @Override  // com.dcinside.app.ad.util.a
    public boolean a() {
        return this.f;
    }

    @Override  // com.dcinside.app.ad.util.a
    public void e() {
        this.i(true);
        WeakReference weakReference0 = this.d;
        if(weakReference0 != null) {
            AdPopcornSSPBannerAd adPopcornSSPBannerAd0 = (AdPopcornSSPBannerAd)weakReference0.get();
            if(adPopcornSSPBannerAd0 != null) {
                adPopcornSSPBannerAd0.stopAd();
            }
        }
        WeakReference weakReference1 = this.d;
        if(weakReference1 != null) {
            weakReference1.clear();
        }
        this.d = null;
        this.e.clear();
    }

    @Override  // com.dcinside.app.ad.util.a
    public void f() {
        if(this.a()) {
            return;
        }
        ViewGroup viewGroup0 = (ViewGroup)this.e.get();
        if(viewGroup0 == null) {
            return;
        }
        if(viewGroup0.getId() == 0x7F0B007D) {  // id:ad_container_view
            viewGroup0.setVisibility(0);
        }
        s.c(viewGroup0);
        AdPopcornSSPBannerAd adPopcornSSPBannerAd0 = new AdPopcornSSPBannerAd(viewGroup0.getContext());
        adPopcornSSPBannerAd0.setBannerEventCallbackListener(this);
        adPopcornSSPBannerAd0.setPlacementId(this.c);
        adPopcornSSPBannerAd0.setAdSize(AdSize.BANNER_320x50);
        adPopcornSSPBannerAd0.setBannerAnimType(BannerAnimType.NONE);
        adPopcornSSPBannerAd0.setRefreshTime(-1);
        adPopcornSSPBannerAd0.setAutoBgColor(false);
        this.d = new WeakReference(adPopcornSSPBannerAd0);
        viewGroup0.addView(adPopcornSSPBannerAd0);
        adPopcornSSPBannerAd0.loadAd();
    }

    @Override  // com.dcinside.app.ad.util.a
    public void g() {
        WeakReference weakReference0 = this.d;
        if(weakReference0 != null) {
            AdPopcornSSPBannerAd adPopcornSSPBannerAd0 = (AdPopcornSSPBannerAd)weakReference0.get();
            if(adPopcornSSPBannerAd0 != null) {
                adPopcornSSPBannerAd0.onPause();
            }
        }
    }

    @Override  // com.dcinside.app.ad.util.a
    public void h() {
        WeakReference weakReference0 = this.d;
        if(weakReference0 != null) {
            AdPopcornSSPBannerAd adPopcornSSPBannerAd0 = (AdPopcornSSPBannerAd)weakReference0.get();
            if(adPopcornSSPBannerAd0 != null) {
                adPopcornSSPBannerAd0.onResume();
            }
        }
    }

    @Override  // com.dcinside.app.ad.util.a
    public void i(boolean z) {
        this.f = z;
    }

    @l
    public final String j() {
        return this.c;
    }
}

