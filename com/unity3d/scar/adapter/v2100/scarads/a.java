package com.unity3d.scar.adapter.v2100.scarads;

import P2.c;
import P2.d;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;

public abstract class a implements P2.a {
    protected Object a;
    protected Context b;
    protected d c;
    protected Q2.a d;
    protected b e;
    protected com.unity3d.scar.adapter.common.d f;

    public a(Context context0, d d0, Q2.a a0, com.unity3d.scar.adapter.common.d d1) {
        this.b = context0;
        this.c = d0;
        this.d = a0;
        this.f = d1;
    }

    @Override  // P2.a
    public void b(c c0) {
        AdRequest adRequest0 = this.d.b(this.c.a());
        if(c0 != null) {
            this.e.a(c0);
        }
        this.c(adRequest0, c0);
    }

    protected abstract void c(AdRequest arg1, c arg2);

    public void d(Object object0) {
        this.a = object0;
    }
}

