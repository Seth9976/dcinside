package com.dcinside.app.ad.util;

import android.content.Context;
import android.view.ViewGroup;
import com.fsn.cauly.CaulyAdInfo;
import com.fsn.cauly.CaulyAdInfoBuilder;
import com.fsn.cauly.CaulyAdView;
import com.fsn.cauly.CaulyAdViewListener;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class g extends a implements CaulyAdViewListener {
    @l
    private final String c;
    @m
    private WeakReference d;
    @l
    private WeakReference e;
    private boolean f;
    private boolean g;

    public g(@l ViewGroup viewGroup0, @l String s) {
        L.p(viewGroup0, "parent");
        L.p(s, "id");
        super();
        this.c = s;
        this.e = new WeakReference(viewGroup0);
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
            CaulyAdView caulyAdView0 = (CaulyAdView)weakReference0.get();
            if(caulyAdView0 != null) {
                caulyAdView0.setAdViewListener(null);
                caulyAdView0.destroy();
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
        Context context0 = viewGroup0.getContext();
        CaulyAdInfo caulyAdInfo0 = new CaulyAdInfoBuilder(this.c).testVersion(false).tagForChildDirectedTreatment(false).effect("None").bannerHeight("Fixed_50").build();
        CaulyAdView caulyAdView0 = new CaulyAdView(context0);
        caulyAdView0.setAdInfo(caulyAdInfo0);
        this.d = new WeakReference(caulyAdView0);
        viewGroup0.addView(caulyAdView0);
        caulyAdView0.reload();
    }

    @Override  // com.dcinside.app.ad.util.a
    public void g() {
        WeakReference weakReference0 = this.d;
        if(weakReference0 != null) {
            CaulyAdView caulyAdView0 = (CaulyAdView)weakReference0.get();
            if(caulyAdView0 != null) {
                caulyAdView0.pause();
            }
        }
    }

    @Override  // com.dcinside.app.ad.util.a
    public void h() {
        WeakReference weakReference0 = this.d;
        if(weakReference0 != null) {
            CaulyAdView caulyAdView0 = (CaulyAdView)weakReference0.get();
            if(caulyAdView0 != null) {
                if(!this.g) {
                    caulyAdView0.setAdViewListener(null);
                    caulyAdView0.destroy();
                    this.f();
                }
                caulyAdView0.resume();
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

    @Override  // com.fsn.cauly.CaulyAdViewListener
    public void onCloseLandingScreen(@m CaulyAdView caulyAdView0) {
    }

    @Override  // com.fsn.cauly.CaulyAdViewListener
    public void onFailedToReceiveAd(@m CaulyAdView caulyAdView0, int v, @m String s) {
        if(this.a()) {
            return;
        }
        this.c("Cauly ads failed: " + v);
    }

    @Override  // com.fsn.cauly.CaulyAdViewListener
    public void onReceiveAd(@m CaulyAdView caulyAdView0, boolean z) {
        this.g = true;
        if(!z) {
            a.d(this, null, 1, null);
        }
    }

    @Override  // com.fsn.cauly.CaulyAdViewListener
    public void onShowLandingScreen(@m CaulyAdView caulyAdView0) {
    }
}

