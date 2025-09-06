package com.kakao.adfit.common.inappbrowser.widget;

import android.view.View.OnClickListener;
import android.view.View;

public final class d implements View.OnClickListener {
    public final IABNavigationBar a;

    public d(IABNavigationBar iABNavigationBar0) {
        this.a = iABNavigationBar0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        IABNavigationBar.f(this.a, view0);
    }
}

