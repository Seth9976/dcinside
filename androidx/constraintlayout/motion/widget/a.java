package androidx.constraintlayout.motion.widget;

import android.view.View;

public final class a implements Runnable {
    public final ViewTransition a;
    public final View[] b;

    public a(ViewTransition viewTransition0, View[] arr_view) {
        this.a = viewTransition0;
        this.b = arr_view;
    }

    @Override
    public final void run() {
        this.a.l(this.b);
    }
}

