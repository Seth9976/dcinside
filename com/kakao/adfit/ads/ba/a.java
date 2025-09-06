package com.kakao.adfit.ads.ba;

import android.content.Context;
import android.widget.RelativeLayout;
import com.kakao.adfit.a.q;
import java.util.concurrent.atomic.AtomicBoolean;

class a {
    private final RelativeLayout a;
    private q b;
    private q c;
    private final AtomicBoolean d;

    a(RelativeLayout relativeLayout0) {
        this.b = null;
        this.c = null;
        this.d = new AtomicBoolean(false);
        this.a = relativeLayout0;
    }

    q a(Context context0) {
        q q0 = this.c;
        if(q0 != null) {
            q0.destroy();
        }
        q q1 = new q(context0);
        this.c = q1;
        return q1;
    }

    void a() {
        if(this.d.getAndSet(true)) {
            return;
        }
        q q0 = this.c;
        if(q0 != null) {
            q0.destroy();
            this.c = null;
        }
        q q1 = this.b;
        if(q1 != null) {
            this.a.removeView(q1);
            this.b.destroy();
            this.b = null;
        }
    }

    void a(q q0) {
        if(this.c != q0) {
            return;
        }
        this.a.addView(q0);
        q q1 = this.b;
        if(q1 != null) {
            this.a.removeView(q1);
            this.b.destroy();
        }
        this.b = q0;
        this.c = null;
    }

    q[] b() {
        return new q[]{this.c, this.b};
    }

    boolean c() {
        return this.d.get();
    }
}

