package com.coupang.ads.view.base;

import android.view.View.OnClickListener;
import android.view.View;
import com.coupang.ads.dto.DTO;

public final class a implements View.OnClickListener {
    public final AdsBaseView a;
    public final DTO b;

    public a(AdsBaseView adsBaseView0, DTO dTO0) {
        this.a = adsBaseView0;
        this.b = dTO0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        AdsBaseView.e(this.a, this.b, view0);
    }
}

