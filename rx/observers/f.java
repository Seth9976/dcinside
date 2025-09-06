package rx.observers;

import rx.exceptions.c;
import rx.h;
import rx.internal.operators.x;

public class f implements h {
    static final class a {
        Object[] a;
        int b;

        public void a(Object object0) {
            int v = this.b;
            Object[] arr_object = this.a;
            if(arr_object == null) {
                arr_object = new Object[16];
                this.a = arr_object;
            }
            else if(v == arr_object.length) {
                Object[] arr_object1 = new Object[(v >> 2) + v];
                System.arraycopy(arr_object, 0, arr_object1, 0, v);
                this.a = arr_object1;
                arr_object = arr_object1;
            }
            arr_object[v] = object0;
            this.b = v + 1;
        }
    }

    private final h a;
    private boolean b;
    private volatile boolean c;
    private a d;

    public f(h h0) {
        this.a = h0;
    }

    @Override  // rx.h
    public void d() {
        if(this.c) {
            return;
        }
        synchronized(this) {
            if(this.c) {
                return;
            }
            this.c = true;
            if(this.b) {
                a f$a0 = this.d;
                if(f$a0 == null) {
                    f$a0 = new a();
                    this.d = f$a0;
                }
                f$a0.a(x.b());
                return;
            }
            this.b = true;
        }
        this.a.d();
    }

    @Override  // rx.h
    public void onError(Throwable throwable0) {
        c.e(throwable0);
        if(this.c) {
            return;
        }
        synchronized(this) {
            if(this.c) {
                return;
            }
            this.c = true;
            if(this.b) {
                a f$a0 = this.d;
                if(f$a0 == null) {
                    f$a0 = new a();
                    this.d = f$a0;
                }
                f$a0.a(x.c(throwable0));
                return;
            }
            this.b = true;
        }
        this.a.onError(throwable0);
    }

    @Override  // rx.h
    public void onNext(Object object0) {
        a f$a1;
        Object[] arr_object;
        int v;
        if(this.c) {
            return;
        }
        synchronized(this) {
            if(!this.c) {
                if(this.b) {
                    a f$a0 = this.d;
                    if(f$a0 == null) {
                        f$a0 = new a();
                        this.d = f$a0;
                    }
                    f$a0.a(x.j(object0));
                    return;
                }
                goto label_12;
            }
            return;
        }
        return;
    label_12:
        this.b = true;
        try {
            this.a.onNext(object0);
        }
        catch(Throwable throwable1) {
            this.c = true;
            c.g(throwable1, this.a, object0);
            return;
        }
        do {
            do {
                synchronized(this) {
                    f$a1 = this.d;
                    v = 0;
                    if(f$a1 == null) {
                        this.b = false;
                        return;
                    }
                    this.d = null;
                }
                arr_object = f$a1.a;
            label_34:
            }
            while(v >= arr_object.length);
            Object object1 = arr_object[v];
        }
        while(object1 == null);
        try {
            if(x.a(this.a, object1)) {
                this.c = true;
                return;
            }
            ++v;
            goto label_34;
        }
        catch(Throwable throwable2) {
            this.c = true;
            c.e(throwable2);
            Throwable throwable3 = rx.exceptions.h.a(throwable2, object0);
            this.a.onError(throwable3);
        }
    }
}

