package com.dcinside.app.view.dccon;

import com.dcinside.app.view.SwipeHandleTabLayout;
import kotlin.jvm.internal.l0.f;

public final class n implements Runnable {
    public final f a;
    public final DcConPickerView b;
    public final SwipeHandleTabLayout c;

    public n(f l0$f0, DcConPickerView dcConPickerView0, SwipeHandleTabLayout swipeHandleTabLayout0) {
        this.a = l0$f0;
        this.b = dcConPickerView0;
        this.c = swipeHandleTabLayout0;
    }

    @Override
    public final void run() {
        DcConPickerView.p0(this.a, this.b, this.c);
    }
}

