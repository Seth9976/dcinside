package rx.subjects;

import rx.n;

public class e extends f {
    private final rx.observers.f b;
    private final f c;

    public e(f f0) {
        class a implements rx.g.a {
            final f a;

            a(f f0) {
            }

            public void a(n n0) {
                this.a.N6(n0);
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((n)object0));
            }
        }

        super(new a(f0));
        this.c = f0;
        this.b = new rx.observers.f(f0);
    }

    @Override  // rx.subjects.f
    public boolean A7() {
        return this.c.A7();
    }

    @Override  // rx.h
    public void d() {
        this.b.d();
    }

    @Override  // rx.h
    public void onError(Throwable throwable0) {
        this.b.onError(throwable0);
    }

    @Override  // rx.h
    public void onNext(Object object0) {
        this.b.onNext(object0);
    }
}

