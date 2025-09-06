package rx.observers;

import java.util.Arrays;
import rx.exceptions.b;
import rx.exceptions.c;
import rx.exceptions.g;
import rx.exceptions.i;
import rx.n;
import rx.plugins.f;

public class e extends n {
    private final n f;
    boolean g;

    public e(n n0) {
        super(n0);
        this.f = n0;
    }

    public n Q() {
        return this.f;
    }

    @Override  // rx.h
    public void d() {
        if(!this.g) {
            try {
                this.g = true;
                this.f.d();
            }
            catch(Throwable throwable0) {
                try {
                    c.e(throwable0);
                    rx.plugins.c.I(throwable0);
                    throw new rx.exceptions.e(throwable0.getMessage(), throwable0);
                }
                catch(Throwable throwable1) {
                    try {
                        this.l();
                    }
                    catch(Throwable throwable2) {
                        rx.plugins.c.I(throwable2);
                        throw new i(throwable2.getMessage(), throwable2);
                    }
                    throw throwable1;
                }
            }
            try {
                this.l();
            }
            catch(Throwable throwable3) {
                rx.plugins.c.I(throwable3);
                throw new i(throwable3.getMessage(), throwable3);
            }
        }
    }

    @Override  // rx.h
    public void onError(Throwable throwable0) {
        c.e(throwable0);
        if(!this.g) {
            this.g = true;
            this.x(throwable0);
        }
    }

    @Override  // rx.h
    public void onNext(Object object0) {
        if(!this.g) {
            try {
                this.f.onNext(object0);
            }
            catch(Throwable throwable0) {
                c.f(throwable0, this);
            }
        }
    }

    protected void x(Throwable throwable0) {
        f.c().b().a(throwable0);
        try {
            this.f.onError(throwable0);
        }
        catch(g g0) {
            try {
                this.l();
            }
            catch(Throwable throwable2) {
                rx.plugins.c.I(throwable2);
                throw new g("Observer.onError not implemented and error while unsubscribing.", new b(Arrays.asList(new Throwable[]{throwable0, throwable2})));
            }
            throw g0;
        }
        catch(Throwable throwable1) {
            rx.plugins.c.I(throwable1);
            try {
                this.l();
            }
            catch(Throwable throwable3) {
                rx.plugins.c.I(throwable3);
                throw new rx.exceptions.f("Error occurred when trying to propagate error to Observer.onError and during unsubscription.", new b(Arrays.asList(new Throwable[]{throwable0, throwable1, throwable3})));
            }
            throw new rx.exceptions.f("Error occurred when trying to propagate error to Observer.onError", new b(Arrays.asList(new Throwable[]{throwable0, throwable1})));
        }
        try {
            this.l();
        }
        catch(Throwable throwable4) {
            rx.plugins.c.I(throwable4);
            throw new rx.exceptions.f(throwable4);
        }
    }
}

