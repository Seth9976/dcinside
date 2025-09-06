package rx;

import java.util.concurrent.TimeUnit;
import rx.functions.p;
import rx.internal.schedulers.i;
import rx.internal.schedulers.l;

public abstract class j {
    public static abstract class a implements o {
        public long a() {
            return System.currentTimeMillis();
        }

        public abstract o c(rx.functions.a arg1);

        public abstract o d(rx.functions.a arg1, long arg2, TimeUnit arg3);

        public o e(rx.functions.a a0, long v, long v1, TimeUnit timeUnit0) {
            return i.a(this, a0, v, v1, timeUnit0, null);
        }
    }

    public abstract a a();

    public long b() {
        return System.currentTimeMillis();
    }

    public j c(p p0) {
        return new l(p0, this);
    }
}

