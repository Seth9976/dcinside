package androidx.constraintlayout.motion.utils;

import android.view.View;

public class ViewState {
    public float a;
    public int b;
    public int c;
    public int d;
    public int e;

    public void a(View view0) {
        this.b = view0.getLeft();
        this.c = view0.getTop();
        this.d = view0.getRight();
        this.e = view0.getBottom();
        this.a = view0.getRotation();
    }

    public int b() {
        return this.e - this.c;
    }

    public int c() {
        return this.d - this.b;
    }
}

