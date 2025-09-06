package com.dcinside.app.ad.util;

import android.view.ViewGroup;
import com.gomfactory.adpie.sdk.AdPieError;
import com.gomfactory.adpie.sdk.AdView.AdListener;
import com.gomfactory.adpie.sdk.AdView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class f extends a implements AdListener {
    @l
    private final String c;
    @m
    private WeakReference d;
    @l
    private WeakReference e;
    private boolean f;

    public f(@l ViewGroup viewGroup0, @l String s) {
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
            AdView adView0 = (AdView)weakReference0.get();
            if(adView0 != null) {
                adView0.destroy();
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
        AdView adView0 = new AdView(viewGroup0.getContext());
        adView0.setSlotId(this.c);
        adView0.setAdListener(this);
        adView0.setInRecyclerView(true);
        viewGroup0.addView(adView0);
        adView0.load();
        this.d = new WeakReference(adView0);
    }

    @Override  // com.dcinside.app.ad.util.a
    public void g() {
    }

    @Override  // com.dcinside.app.ad.util.a
    public void h() {
    }

    @Override  // com.dcinside.app.ad.util.a
    public void i(boolean z) {
        this.f = z;
    }

    @l
    public final String j() {
        return this.c;
    }

    @Override  // com.gomfactory.adpie.sdk.AdView$AdListener
    public void onAdClicked() {
    }

    @Override  // com.gomfactory.adpie.sdk.AdView$AdListener
    public void onAdFailedToLoad(int v) {
        if(this.a()) {
            return;
        }
        this.c(AdPieError.getMessage(v));
    }

    @Override  // com.gomfactory.adpie.sdk.AdView$AdListener
    public void onAdLoaded() {
    }
}

