package rx.internal.util.unsafe;

import com.google.android.gms.internal.ads.p;
import rx.internal.util.atomic.c;
import rx.internal.util.r;

@r
public final class o extends a {
    public o() {
        c c0 = new c();
        this.consumerNode = c0;
        this.i(c0);
    }

    protected c i(c c0) {
        c c1;
        do {
            c1 = this.producerNode;
        }
        while(!p.a(N.a, this, e.q, c1, c0));
        return c1;
    }

    @Override
    public boolean offer(Object object0) {
        if(object0 == null) {
            throw new NullPointerException("null elements not allowed");
        }
        c c0 = new c(object0);
        this.i(c0).d(c0);
        return true;
    }

    @Override
    public Object peek() {
        c c2;
        c c0 = this.consumerNode;
        c c1 = c0.c();
        if(c1 != null) {
            return c1.b();
        }
        if(c0 != this.b()) {
            do {
                c2 = c0.c();
            }
            while(c2 == null);
            return c2.b();
        }
        return null;
    }

    @Override
    public Object poll() {
        c c2;
        c c0 = this.d();
        c c1 = c0.c();
        if(c1 != null) {
            Object object0 = c1.a();
            this.h(c1);
            return object0;
        }
        if(c0 != this.b()) {
            do {
                c2 = c0.c();
            }
            while(c2 == null);
            Object object1 = c2.a();
            this.consumerNode = c2;
            return object1;
        }
        return null;
    }
}

