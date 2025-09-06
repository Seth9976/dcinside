package top.defaults.colorpicker;

import android.view.MotionEvent;

class i {
    private int a;
    private j b;
    private long c;

    private i(int v, j j0) {
        this.c = 0L;
        this.a = v;
        this.b = j0;
    }

    i(j j0) {
        this(16, j0);
    }

    void a(MotionEvent motionEvent0) {
        if(this.b == null) {
            return;
        }
        long v = System.currentTimeMillis();
        if(v - this.c <= ((long)this.a)) {
            return;
        }
        this.c = v;
        this.b.a(motionEvent0);
    }
}

