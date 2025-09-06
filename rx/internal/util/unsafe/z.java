package rx.internal.util.unsafe;

import rx.internal.util.r;

@r
public final class z extends E {
    public z(int v) {
        super(v);
    }

    @Override  // rx.internal.util.unsafe.i
    public boolean isEmpty() {
        return this.n() == this.m();
    }

    private long m() {
        return N.a.getLongVolatile(this, B.W8);
    }

    private long n() {
        return N.a.getLongVolatile(this, F.O);
    }

    private void o(long v) {
        N.a.putOrderedLong(this, B.W8, v);
    }

    @Override  // rx.internal.util.unsafe.i
    public boolean offer(Object object0) {
        if(object0 == null) {
            throw new NullPointerException("null elements not allowed");
        }
        Object[] arr_object = this.r;
        long v = this.producerIndex;
        long v1 = this.a(v);
        if(this.h(arr_object, v1) != null) {
            return false;
        }
        this.j(arr_object, v1, object0);
        this.p(v + 1L);
        return true;
    }

    private void p(long v) {
        N.a.putOrderedLong(this, F.O, v);
    }

    @Override  // rx.internal.util.unsafe.i
    public Object peek() {
        return this.g(this.a(this.consumerIndex));
    }

    @Override  // rx.internal.util.unsafe.i
    public Object poll() {
        long v = this.consumerIndex;
        long v1 = this.a(v);
        Object[] arr_object = this.r;
        Object object0 = this.h(arr_object, v1);
        if(object0 == null) {
            return null;
        }
        this.j(arr_object, v1, null);
        this.o(v + 1L);
        return object0;
    }

    @Override  // rx.internal.util.unsafe.i
    public int size() {
        long v2;
        long v1;
        for(long v = this.m(); true; v = v2) {
            v1 = this.n();
            v2 = this.m();
            if(v == v2) {
                break;
            }
        }
        return (int)(v1 - v2);
    }
}

