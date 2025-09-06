package com.unity3d.scar.adapter.v2100.scarads;

import P2.b;
import P2.c;
import P2.d;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.unity3d.scar.adapter.common.i;

public class g extends a implements b {
    public g(Context context0, Q2.a a0, d d0, com.unity3d.scar.adapter.common.d d1, i i0) {
        super(context0, d0, a0, d1);
        this.e = new h(i0, this);
    }

    @Override  // P2.b
    public void a(Activity activity0) {
        Object object0 = this.a;
        if(object0 != null) {
            ((RewardedAd)object0).show(activity0, ((h)this.e).f());
            return;
        }
        this.f.handleError(com.unity3d.scar.adapter.common.b.a(this.c));
    }

    @Override  // com.unity3d.scar.adapter.v2100.scarads.a
    protected void c(AdRequest adRequest0, c c0) {
        RewardedAd.load(this.b, this.c.b(), adRequest0, ((h)this.e).e());
    }
}

