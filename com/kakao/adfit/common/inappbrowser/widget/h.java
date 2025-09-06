package com.kakao.adfit.common.inappbrowser.widget;

import android.view.View.OnClickListener;
import android.view.View;

public final class h implements View.OnClickListener {
    public final IABNavigationBar a;

    public h(IABNavigationBar iABNavigationBar0) {
        this.a = iABNavigationBar0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        IABNavigationBar.b(this.a, view0);
    }
}

