package rx.subscriptions;

import java.util.concurrent.Future;
import rx.o;

public final class f {
    static final class a implements o {
        final Future a;

        public a(Future future0) {
            this.a = future0;
        }

        @Override  // rx.o
        public boolean j() {
            return this.a.isCancelled();
        }

        @Override  // rx.o
        public void l() {
            this.a.cancel(true);
        }
    }

    static final class b implements o {
        @Override  // rx.o
        public boolean j() {
            return true;
        }

        @Override  // rx.o
        public void l() {
        }
    }

    private static final b a;

    static {
        f.a = new b();
    }

    private f() {
        throw new IllegalStateException("No instances!");
    }

    public static o a(rx.functions.a a0) {
        return rx.subscriptions.a.b(a0);
    }

    public static o b() {
        return rx.subscriptions.a.a();
    }

    public static o c(Future future0) {
        return new a(future0);
    }

    public static rx.subscriptions.b d(o[] arr_o) {
        return new rx.subscriptions.b(arr_o);
    }

    public static o e() {
        return f.a;
    }
}

