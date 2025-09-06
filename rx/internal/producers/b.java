package rx.internal.producers;

import java.util.ArrayList;
import java.util.List;
import rx.exceptions.c;
import rx.h;
import rx.i;
import rx.n;

public final class b implements h, i {
    static final class a implements i {
        @Override  // rx.i
        public void request(long v) {
        }
    }

    final n a;
    boolean b;
    List c;
    i d;
    long e;
    long f;
    i g;
    Object h;
    volatile boolean i;
    static final i j;

    static {
        b.j = new a();
    }

    public b(n n0) {
        this.a = n0;
    }

    public void X(i i0) {
        synchronized(this) {
            if(this.b) {
                if(i0 == null) {
                    i0 = b.j;
                }
                this.g = i0;
                return;
            }
            this.b = true;
        }
        this.d = i0;
        long v = this.e;
        try {
            this.b();
        }
        catch(Throwable throwable0) {
            synchronized(this) {
                this.b = false;
            }
            throw throwable0;
        }
        if(i0 != null && v != 0L) {
            i0.request(v);
        }
    }

    void b() {
        long v3;
        boolean z1;
        n n0 = this.a;
        i i0 = null;
        long v = 0L;
    alab1:
        while(true) {
            __monitor_enter(this);
            long v1 = this.f;
            i i1 = this.g;
            Object object0 = this.h;
            List list0 = this.c;
            boolean z = true;
            int v2 = Long.compare(v1, 0L);
            if(v2 != 0 || i1 != null || list0 != null || object0 != null) {
                this.f = 0L;
                this.g = null;
                this.c = null;
                this.h = null;
                z1 = false;
            }
            else {
                this.b = false;
                z1 = true;
            }
            __monitor_exit(this);
            if(z1) {
                if(v != 0L && i0 != null) {
                    i0.request(v);
                }
                return;
            }
            if(list0 != null && !list0.isEmpty()) {
                z = false;
            }
            if(object0 != null) {
                if(object0 != Boolean.TRUE) {
                    n0.onError(((Throwable)object0));
                    return;
                }
                if(z) {
                    n0.d();
                    return;
                }
            }
            if(list0 == null) {
                v3 = 0L;
            }
            else {
                for(Object object1: list0) {
                    if(n0.j()) {
                        return;
                    }
                    if(this.i) {
                        continue alab1;
                    }
                    try {
                        n0.onNext(object1);
                    }
                    catch(Throwable throwable0) {
                        c.g(throwable0, n0, object1);
                        return;
                    }
                }
                v3 = (long)list0.size();
            }
            long v4 = this.e;
            if(v4 != 0x7FFFFFFFFFFFFFFFL) {
                if(v2 != 0) {
                    long v5 = v4 + v1;
                    v4 = v5 < 0L ? 0x7FFFFFFFFFFFFFFFL : v5;
                }
                if(v3 != 0L && v4 != 0x7FFFFFFFFFFFFFFFL) {
                    v4 -= v3;
                    if(v4 < 0L) {
                        throw new IllegalStateException("More produced than requested");
                    }
                }
                this.e = v4;
            }
            if(i1 == null) {
            label_67:
                i1 = this.d;
                if(i1 == null || v2 == 0) {
                    continue;
                }
                v = rx.internal.operators.a.a(v, v1);
            }
            else {
                if(i1 == b.j) {
                    this.d = null;
                    continue;
                }
                else {
                    this.d = i1;
                    if(v4 == 0L) {
                        continue;
                    }
                    v = rx.internal.operators.a.a(v, v4);
                    goto label_70;
                }
                goto label_67;
            }
        label_70:
            i0 = i1;
        }
    }

    @Override  // rx.h
    public void d() {
        synchronized(this) {
            if(this.b) {
                this.h = Boolean.TRUE;
                return;
            }
            this.b = true;
        }
        this.a.d();
    }

    @Override  // rx.h
    public void onError(Throwable throwable0) {
        boolean z;
        synchronized(this) {
            if(this.b) {
                this.h = throwable0;
                z = false;
            }
            else {
                this.b = true;
                z = true;
            }
        }
        if(z) {
            this.a.onError(throwable0);
            return;
        }
        this.i = true;
    }

    @Override  // rx.h
    public void onNext(Object object0) {
        synchronized(this) {
            if(this.b) {
                List list0 = this.c;
                if(list0 == null) {
                    list0 = new ArrayList(4);
                    this.c = list0;
                }
                list0.add(object0);
                return;
            }
            goto label_9;
        }
        return;
    label_9:
        this.b = true;
        try {
            this.a.onNext(object0);
            long v = this.e;
            if(v != 0x7FFFFFFFFFFFFFFFL) {
                this.e = v - 1L;
            }
            this.b();
            return;
        }
        catch(Throwable throwable1) {
        }
        synchronized(this) {
            this.b = false;
        }
        throw throwable1;
    }

    @Override  // rx.i
    public void request(long v) {
        int v1 = Long.compare(v, 0L);
        if(v1 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if(v1 == 0) {
            return;
        }
        synchronized(this) {
            if(this.b) {
                this.f += v;
                return;
            }
            this.b = true;
        }
        i i0 = this.d;
        try {
            this.e = this.e + v >= 0L ? this.e + v : 0x7FFFFFFFFFFFFFFFL;
            this.b();
        }
        catch(Throwable throwable0) {
            synchronized(this) {
                this.b = false;
            }
            throw throwable0;
        }
        if(i0 != null) {
            i0.request(v);
        }
    }
}

