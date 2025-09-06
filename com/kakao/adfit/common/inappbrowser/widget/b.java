package com.kakao.adfit.common.inappbrowser.widget;

import android.view.View.OnClickListener;
import android.view.View;

public final class b implements View.OnClickListener {
    public final IABLayout a;

    public b(IABLayout iABLayout0) {
        this.a = iABLayout0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        IABLayout.a(this.a, view0);
    }
}

