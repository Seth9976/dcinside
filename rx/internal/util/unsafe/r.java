package rx.internal.util.unsafe;

import rx.internal.util.r;

@r
public final class rx.internal.util.unsafe.r extends v {
    public rx.internal.util.unsafe.r(int v) {
        super(v);
    }

    @Override  // rx.internal.util.unsafe.i
    public boolean isEmpty() {
        return this.p() == this.m();
    }

    @Override  // rx.internal.util.unsafe.i
    public boolean offer(Object object0) {
        if(object0 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        Object[] arr_object = this.r;
        long v = this.q;
        long v1 = this.m();
        long v2 = this.a(v1);
        if(this.h(arr_object, v2) != null) {
            if(v1 - this.p() > v) {
                return false;
            }
            while(this.h(arr_object, v2) != null) {
            }
        }
        this.l(arr_object, v2, object0);
        this.n(v1 + 1L);
        return true;
    }

    @Override  // rx.internal.util.unsafe.i
    public Object peek() {
        Object object0;
        long v = this.q();
        do {
            long v1 = this.p();
            if(v1 >= v) {
                long v2 = this.m();
                if(v1 >= v2) {
                    return null;
                }
                this.r(v2);
            }
            object0 = this.g(this.a(v1));
        }
        while(object0 == null);
        return object0;
    }

    @Override  // rx.internal.util.unsafe.i
    public Object poll() {
        long v1;
        long v = this.q();
        do {
            v1 = this.p();
            if(v1 >= v) {
                long v2 = this.m();
                if(v1 >= v2) {
                    return null;
                }
                this.r(v2);
            }
        }
        while(!this.o(v1, v1 + 1L));
        long v3 = this.a(v1);
        Object object0 = this.d(this.r, v3);
        this.j(this.r, v3, null);
        return object0;
    }

    @Override  // rx.internal.util.unsafe.i
    public int size() {
        long v2;
        long v1;
        for(long v = this.p(); true; v = v2) {
            v1 = this.m();
            v2 = this.p();
            if(v == v2) {
                break;
            }
        }
        return (int)(v1 - v2);
    }
}

