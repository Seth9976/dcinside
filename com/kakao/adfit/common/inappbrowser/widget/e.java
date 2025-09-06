package com.kakao.adfit.common.inappbrowser.widget;

import android.view.View.OnClickListener;
import android.view.View;

public final class e implements View.OnClickListener {
    public final IABNavigationBar a;

    public e(IABNavigationBar iABNavigationBar0) {
        this.a = iABNavigationBar0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        IABNavigationBar.g(this.a, view0);
    }
}

