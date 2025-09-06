package com.unity3d.scar.adapter.v2300.scarads;

import P2.d;
import android.content.Context;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.unity3d.scar.adapter.common.g;

public class c extends a {
    private RelativeLayout g;
    private int h;
    private int i;
    private AdView j;

    public c(Context context0, RelativeLayout relativeLayout0, R2.a a0, d d0, int v, int v1, com.unity3d.scar.adapter.common.d d1, g g0) {
        super(context0, d0, a0, d1);
        this.g = relativeLayout0;
        this.h = v;
        this.i = v1;
        this.j = new AdView(this.b);
        this.e = new com.unity3d.scar.adapter.v2300.scarads.d(g0, this);
    }

    @Override  // com.unity3d.scar.adapter.v2300.scarads.a
    protected void c(AdRequest adRequest0, P2.c c0) {
        RelativeLayout relativeLayout0 = this.g;
        if(relativeLayout0 != null) {
            AdView adView0 = this.j;
            if(adView0 != null) {
                relativeLayout0.addView(adView0);
                this.j.setAdSize(new AdSize(this.h, this.i));
                this.j.setAdUnitId(this.c.b());
                this.j.setAdListener(((com.unity3d.scar.adapter.v2300.scarads.d)this.e).d());
                this.j.loadAd(adRequest0);
            }
        }
    }

    public void e() {
        RelativeLayout relativeLayout0 = this.g;
        if(relativeLayout0 != null) {
            AdView adView0 = this.j;
            if(adView0 != null) {
                relativeLayout0.removeView(adView0);
            }
        }
    }
}

