package io.reactivex.observers;

import d3.f;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.disposables.e;
import io.reactivex.plugins.a;

public final class l implements I, c {
    final I a;
    c b;
    boolean c;

    public l(@f I i0) {
        this.a = i0;
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return this.b.a();
    }

    @Override  // io.reactivex.I
    public void b(@f c c0) {
        if(d.i(this.b, c0)) {
            try {
                this.b = c0;
                this.a.b(this);
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                this.c = true;
                try {
                    c0.dispose();
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

    void c() {
        NullPointerException nullPointerException0 = new NullPointerException("Subscription not set!");
        try {
            this.a.b(e.a);
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

    void d() {
        this.c = true;
        NullPointerException nullPointerException0 = new NullPointerException("Subscription not set!");
        try {
            this.a.b(e.a);
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

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        this.b.dispose();
    }

    @Override  // io.reactivex.I
    public void onComplete() {
        if(this.c) {
            return;
        }
        this.c = true;
        if(this.b == null) {
            this.c();
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

    @Override  // io.reactivex.I
    public void onError(@f Throwable throwable0) {
        if(this.c) {
            a.Y(throwable0);
            return;
        }
        this.c = true;
        if(this.b == null) {
            NullPointerException nullPointerException0 = new NullPointerException("Subscription not set!");
            try {
                this.a.b(e.a);
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

    @Override  // io.reactivex.I
    public void onNext(@f Object object0) {
        if(this.c) {
            return;
        }
        if(this.b == null) {
            this.d();
            return;
        }
        if(object0 == null) {
            NullPointerException nullPointerException0 = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.b.dispose();
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
                this.b.dispose();
            }
            catch(Throwable throwable2) {
                b.b(throwable2);
                this.onError(new io.reactivex.exceptions.a(new Throwable[]{throwable1, throwable2}));
                return;
            }
            this.onError(throwable1);
        }
    }
}

