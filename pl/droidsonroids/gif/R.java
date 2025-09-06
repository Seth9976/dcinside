package pl.droidsonroids.gif;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

class r extends s {
    r(e e0) {
        super(e0);
    }

    @Override  // pl.droidsonroids.gif.s
    public void a() {
        long v = this.a.g.B(this.a.f);
        if(v >= 0L) {
            this.a.c = SystemClock.uptimeMillis() + v;
            if(this.a.isVisible() && this.a.b) {
                e e0 = this.a;
                if(!e0.l) {
                    e0.a.remove(this);
                    this.a.p = this.a.a.schedule(this, v, TimeUnit.MILLISECONDS);
                }
            }
            if(!this.a.h.isEmpty() && this.a.k() == this.a.g.n() - 1) {
                int v1 = this.a.l();
                this.a.m.sendEmptyMessageAtTime(v1, this.a.c);
            }
        }
        else {
            this.a.c = 0x8000000000000000L;
            this.a.b = false;
        }
        if(this.a.isVisible() && !this.a.m.hasMessages(-1)) {
            this.a.m.sendEmptyMessageAtTime(-1, 0L);
        }
    }
}

