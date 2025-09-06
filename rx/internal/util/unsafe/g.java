package rx.internal.util.unsafe;

import rx.internal.util.atomic.c;

public final class G extends a {
    public G() {
        this.c(new c());
        this.h(this.producerNode);
        this.consumerNode.d(null);
    }

    @Override
    public boolean offer(Object object0) {
        if(object0 == null) {
            throw new NullPointerException("null elements not allowed");
        }
        c c0 = new c(object0);
        this.producerNode.d(c0);
        this.producerNode = c0;
        return true;
    }

    @Override
    public Object peek() {
        c c0 = this.consumerNode.c();
        return c0 == null ? null : c0.b();
    }

    @Override
    public Object poll() {
        c c0 = this.consumerNode.c();
        if(c0 != null) {
            Object object0 = c0.a();
            this.consumerNode = c0;
            return object0;
        }
        return null;
    }
}

