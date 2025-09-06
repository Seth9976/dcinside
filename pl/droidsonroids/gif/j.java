package pl.droidsonroids.gif;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;

final class j extends ScheduledThreadPoolExecutor {
    static class a {
    }

    static final class b {
        private static final j a;

        static {
            b.a = new j(null);
        }
    }

    private j() {
        super(1, new ThreadPoolExecutor.DiscardPolicy());
    }

    j(a j$a0) {
    }

    static j a() {
        return b.a;
    }
}

