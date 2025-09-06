package K0;

import java.util.concurrent.ThreadFactory;

public final class a implements ThreadFactory {
    @Override
    public final Thread newThread(Runnable runnable0) {
        return b.c(runnable0);
    }
}

