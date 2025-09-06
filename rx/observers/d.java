package rx.observers;

import rx.exceptions.b;
import rx.exceptions.c;
import rx.exceptions.e;
import rx.exceptions.f;
import rx.o;

public final class d implements rx.d, o {
    final rx.d a;
    o b;
    boolean c;

    public d(rx.d d0) {
        this.a = d0;
    }

    @Override  // rx.d
    public void a(o o0) {
        try {
            this.b = o0;
            this.a.a(this);
        }
        catch(Throwable throwable0) {
            c.e(throwable0);
            o0.l();
            this.onError(throwable0);
        }
    }

    @Override  // rx.d
    public void d() {
        if(this.c) {
            return;
        }
        try {
            this.c = true;
            this.a.d();
        }
        catch(Throwable throwable0) {
            c.e(throwable0);
            throw new e(throwable0);
        }
    }

    // 去混淆评级： 低(20)
    @Override  // rx.o
    public boolean j() {
        return this.c || this.b.j();
    }

    @Override  // rx.o
    public void l() {
        this.b.l();
    }

    @Override  // rx.d
    public void onError(Throwable throwable0) {
        if(this.c) {
            rx.plugins.c.I(throwable0);
            return;
        }
        try {
            this.c = true;
            this.a.onError(throwable0);
        }
        catch(Throwable throwable1) {
            c.e(throwable1);
            throw new f(new b(new Throwable[]{throwable0, throwable1}));
        }
    }
}

