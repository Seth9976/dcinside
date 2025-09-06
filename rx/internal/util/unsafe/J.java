package rx.internal.util.unsafe;

import rx.internal.util.r;

@r
public class j extends k {
    long X8;
    long Y8;
    long Z8;
    long a9;
    long b9;
    long c9;
    long d9;
    long e9;
    long f9;
    long g9;
    long h9;
    long i9;
    long j9;
    long k9;
    long l9;

    public j(int v) {
        super(Math.max(2, v));
    }

    @Override  // rx.internal.util.unsafe.i
    public boolean isEmpty() {
        return this.t() == this.q();
    }

    @Override  // rx.internal.util.unsafe.i
    public boolean offer(Object object0) {
        long v2;
        if(object0 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        long v = this.q + 1L;
        long[] arr_v = this.w;
        long v1 = 0x7FFFFFFFFFFFFFFFL;
        do {
            do {
                do {
                    while(true) {
                        v2 = this.q();
                        long v3 = this.m(v2);
                        int v4 = Long.compare(this.n(arr_v, v3) - v2, 0L);
                        if(v4 != 0) {
                            break;
                        }
                        if(this.p(v2, v2 + 1L)) {
                            this.k(this.a(v2), object0);
                            this.o(arr_v, v3, v2 + 1L);
                            return true;
                        }
                    }
                }
                while(v4 >= 0);
                long v5 = v2 - v;
            }
            while(v5 > v1);
            v1 = this.t();
        }
        while(v5 > v1);
        return false;
    }

    @Override  // rx.internal.util.unsafe.i
    public Object peek() {
        Object object0;
        do {
            long v = this.t();
            object0 = this.c(this.a(v));
        }
        while(object0 == null && v != this.q());
        return object0;
    }

    @Override  // rx.internal.util.unsafe.i
    public Object poll() {
        long[] arr_v = this.w;
        long v = -1L;
        do {
            do {
                while(true) {
                    long v1 = this.t();
                    long v2 = this.m(v1);
                    long v3 = v1 + 1L;
                    int v4 = Long.compare(this.n(arr_v, v2) - v3, 0L);
                    if(v4 != 0) {
                        break;
                    }
                    if(this.r(v1, v3)) {
                        long v5 = this.a(v1);
                        Object object0 = this.c(v5);
                        this.k(v5, null);
                        this.o(arr_v, v2, v1 + this.q + 1L);
                        return object0;
                    }
                }
            }
            while(v4 >= 0 || v1 < v);
            v = this.q();
        }
        while(v1 != v);
        return null;
    }

    @Override  // rx.internal.util.unsafe.i
    public int size() {
        long v2;
        long v1;
        for(long v = this.t(); true; v = v2) {
            v1 = this.q();
            v2 = this.t();
            if(v == v2) {
                break;
            }
        }
        return (int)(v1 - v2);
    }
}

