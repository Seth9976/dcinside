package com.unity3d.scar.adapter.v2100.scarads;

import P2.b;
import P2.c;
import P2.d;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.unity3d.scar.adapter.common.h;

public class e extends a implements b {
    public e(Context context0, Q2.a a0, d d0, com.unity3d.scar.adapter.common.d d1, h h0) {
        super(context0, d0, a0, d1);
        this.e = new f(h0, this);
    }

    @Override  // P2.b
    public void a(Activity activity0) {
        Object object0 = this.a;
        if(object0 != null) {
            ((InterstitialAd)object0).show(activity0);
            return;
        }
        this.f.handleError(com.unity3d.scar.adapter.common.b.a(this.c));
    }

    @Override  // com.unity3d.scar.adapter.v2100.scarads.a
    protected void c(AdRequest adRequest0, c c0) {
        InterstitialAd.load(this.b, this.c.b(), adRequest0, ((f)this.e).e());
    }
}

