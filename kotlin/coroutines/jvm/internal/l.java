package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import y4.m;

final class l implements d {
    @m
    private e0 a;

    public final void a() {
        synchronized(this) {
            e0 e00;
            while((e00 = this.a) == null) {
                L.n(this, "null cannot be cast to non-null type java.lang.Object");
                this.wait();
            }
            f0.n(e00.l());
        }
    }

    @m
    public final e0 b() {
        return this.a;
    }

    public final void d(@m e0 e00) {
        this.a = e00;
    }

    @Override  // kotlin.coroutines.d
    @y4.l
    public g getContext() {
        return i.a;
    }

    @Override  // kotlin.coroutines.d
    public void resumeWith(@y4.l Object object0) {
        synchronized(this) {
            this.a = e0.a(object0);
            L.n(this, "null cannot be cast to non-null type java.lang.Object");
            this.notifyAll();
        }
    }
}

