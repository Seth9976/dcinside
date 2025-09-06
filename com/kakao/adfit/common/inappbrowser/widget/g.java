package com.kakao.adfit.common.inappbrowser.widget;

import android.view.View.OnClickListener;
import android.view.View;

public final class g implements View.OnClickListener {
    public final IABNavigationBar a;

    public g(IABNavigationBar iABNavigationBar0) {
        this.a = iABNavigationBar0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        IABNavigationBar.a(this.a, view0);
    }
}

