package com.kakao.adfit.m;

import android.view.View;

public final class M implements Runnable {
    public final View a;

    public M(View view0) {
        this.a = view0;
    }

    @Override
    public final void run() {
        G.a(this.a);
    }
}

