package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.MotionWidget;

public class ViewState {
    public float a;
    public int b;
    public int c;
    public int d;
    public int e;

    public void a(MotionWidget motionWidget0) {
        this.b = motionWidget0.l();
        this.c = motionWidget0.w();
        this.d = motionWidget0.q();
        this.e = motionWidget0.h();
        this.a = (float)(((int)motionWidget0.t()));
    }

    public int b() {
        return this.e - this.c;
    }

    public int c() {
        return this.d - this.b;
    }
}

