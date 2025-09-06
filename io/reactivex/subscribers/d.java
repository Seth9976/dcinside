package io.reactivex.subscribers;

import io.reactivex.exceptions.b;
import io.reactivex.internal.subscriptions.g;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.plugins.a;
import io.reactivex.q;
import org.reactivestreams.e;

public final class d implements q, e {
    final org.reactivestreams.d a;
    e b;
    boolean c;

    public d(org.reactivestreams.d d0) {
        this.a = d0;
    }

    void a() {
        NullPointerException nullPointerException0 = new NullPointerException("Subscription not set!");
        try {
            this.a.g(g.a);
        }
        catch(Throwable throwable0) {
            b.b(throwable0);
            a.Y(new io.reactivex.exceptions.a(new Throwable[]{nullPointerException0, throwable0}));
            return;
        }
        try {
            this.a.onError(nullPointerException0);
        }
        catch(Throwable throwable1) {
            b.b(throwable1);
            a.Y(new io.reactivex.exceptions.a(new Throwable[]{nullPointerException0, throwable1}));
        }
    }

    void b() {
        this.c = true;
        NullPointerException nullPointerException0 = new NullPointerException("Subscription not set!");
        try {
            this.a.g(g.a);
        }
        catch(Throwable throwable0) {
            b.b(throwable0);
            a.Y(new io.reactivex.exceptions.a(new Throwable[]{nullPointerException0, throwable0}));
            return;
        }
        try {
            this.a.onError(nullPointerException0);
        }
        catch(Throwable throwable1) {
            b.b(throwable1);
            a.Y(new io.reactivex.exceptions.a(new Throwable[]{nullPointerException0, throwable1}));
        }
    }

    @Override  // org.reactivestreams.e
    public void cancel() {
        try {
            this.b.cancel();
        }
        catch(Throwable throwable0) {
            b.b(throwable0);
            a.Y(throwable0);
        }
    }

    @Override  // io.reactivex.q
    public void g(e e0) {
        if(j.k(this.b, e0)) {
            try {
                this.b = e0;
                this.a.g(this);
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                this.c = true;
                try {
                    e0.cancel();
                }
                catch(Throwable throwable1) {
                    b.b(throwable1);
                    a.Y(new io.reactivex.exceptions.a(new Throwable[]{throwable0, throwable1}));
                    return;
                }
                a.Y(throwable0);
            }
        }
    }

    @Override  // org.reactivestreams.d
    public void onComplete() {
        if(this.c) {
            return;
        }
        this.c = true;
        if(this.b == null) {
            this.a();
            return;
        }
        try {
            this.a.onComplete();
        }
        catch(Throwable throwable0) {
            b.b(throwable0);
            a.Y(throwable0);
        }
    }

    @Override  // org.reactivestreams.d
    public void onError(Throwable throwable0) {
        if(this.c) {
            a.Y(throwable0);
            return;
        }
        this.c = true;
        if(this.b == null) {
            NullPointerException nullPointerException0 = new NullPointerException("Subscription not set!");
            try {
                this.a.g(g.a);
            }
            catch(Throwable throwable1) {
                b.b(throwable1);
                a.Y(new io.reactivex.exceptions.a(new Throwable[]{throwable0, nullPointerException0, throwable1}));
                return;
            }
            try {
                io.reactivex.exceptions.a a0 = new io.reactivex.exceptions.a(new Throwable[]{throwable0, nullPointerException0});
                this.a.onError(a0);
            }
            catch(Throwable throwable2) {
                b.b(throwable2);
                a.Y(new io.reactivex.exceptions.a(new Throwable[]{throwable0, nullPointerException0, throwable2}));
            }
            return;
        }
        if(throwable0 == null) {
            throwable0 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        try {
            this.a.onError(throwable0);
        }
        catch(Throwable throwable3) {
            b.b(throwable3);
            a.Y(new io.reactivex.exceptions.a(new Throwable[]{throwable0, throwable3}));
        }
    }

    @Override  // org.reactivestreams.d
    public void onNext(Object object0) {
        if(this.c) {
            return;
        }
        if(this.b == null) {
            this.b();
            return;
        }
        if(object0 == null) {
            NullPointerException nullPointerException0 = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.b.cancel();
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                this.onError(new io.reactivex.exceptions.a(new Throwable[]{nullPointerException0, throwable0}));
                return;
            }
            this.onError(nullPointerException0);
            return;
        }
        try {
            this.a.onNext(object0);
        }
        catch(Throwable throwable1) {
            b.b(throwable1);
            try {
                this.b.cancel();
            }
            catch(Throwable throwable2) {
                b.b(throwable2);
                this.onError(new io.reactivex.exceptions.a(new Throwable[]{throwable1, throwable2}));
                return;
            }
            this.onError(throwable1);
        }
    }

    @Override  // org.reactivestreams.e
    public void request(long v) {
        try {
            this.b.request(v);
        }
        catch(Throwable throwable0) {
            b.b(throwable0);
            try {
                this.b.cancel();
            }
            catch(Throwable throwable1) {
                b.b(throwable1);
                a.Y(new io.reactivex.exceptions.a(new Throwable[]{throwable0, throwable1}));
                return;
            }
            a.Y(throwable0);
        }
    }
}

