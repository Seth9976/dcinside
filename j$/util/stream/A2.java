package j$.util.stream;

import j..util.Spliterator;
import java.util.concurrent.CountedCompleter;

final class a2 extends e {
    private final x0 h;

    a2(a2 a20, Spliterator spliterator0) {
        super(a20, spliterator0);
        this.h = a20.h;
    }

    a2(x0 x00, b b0, Spliterator spliterator0) {
        super(b0, spliterator0);
        this.h = x00;
    }

    @Override  // j$.util.stream.e
    protected final Object a() {
        T1 t10 = this.h.b0();
        this.a.W(this.b, t10);
        return t10;
    }

    @Override  // j$.util.stream.e
    protected final e e(Spliterator spliterator0) {
        return new a2(this, spliterator0);
    }

    @Override  // j$.util.stream.e
    public final void onCompletion(CountedCompleter countedCompleter0) {
        e e0 = this.d;
        if(e0 != null) {
            T1 t10 = (T1)((a2)e0).c();
            t10.g(((T1)((a2)this.e).c()));
            this.f(t10);
        }
        super.onCompletion(countedCompleter0);
    }
}

