package io.reactivex.internal.operators.observable;

import d3.g;
import io.reactivex.B;
import io.reactivex.I;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.observers.c;

public final class d0 extends B {
    static final class a extends c {
        final I a;
        final Object[] b;
        int c;
        boolean d;
        volatile boolean e;

        a(I i0, Object[] arr_object) {
            this.a = i0;
            this.b = arr_object;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.e;
        }

        void c() {
            Object[] arr_object = this.b;
            for(int v = 0; v < arr_object.length && !this.a(); ++v) {
                Object object0 = arr_object[v];
                if(object0 == null) {
                    NullPointerException nullPointerException0 = new NullPointerException("The element at index " + v + " is null");
                    this.a.onError(nullPointerException0);
                    return;
                }
                this.a.onNext(object0);
            }
            if(!this.a()) {
                this.a.onComplete();
            }
        }

        @Override  // f3.o
        public void clear() {
            this.c = this.b.length;
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.e = true;
        }

        @Override  // f3.k
        public int i(int v) {
            if((v & 1) != 0) {
                this.d = true;
                return 1;
            }
            return 0;
        }

        @Override  // f3.o
        public boolean isEmpty() {
            return this.c == this.b.length;
        }

        @Override  // f3.o
        @g
        public Object poll() {
            int v = this.c;
            Object[] arr_object = this.b;
            if(v != arr_object.length) {
                this.c = v + 1;
                return b.g(arr_object[v], "The array element is null");
            }
            return null;
        }
    }

    final Object[] a;

    public d0(Object[] arr_object) {
        this.a = arr_object;
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        a d0$a0 = new a(i0, this.a);
        i0.b(d0$a0);
        if(d0$a0.d) {
            return;
        }
        d0$a0.c();
    }
}

