package androidx.core.os;

import android.os.Handler;
import androidx.core.util.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class ExecutorCompat {
    static class HandlerExecutor implements Executor {
        private final Handler a;

        HandlerExecutor(Handler handler0) {
            this.a = (Handler)Preconditions.l(handler0);
        }

        @Override
        public void execute(Runnable runnable0) {
            Runnable runnable1 = (Runnable)Preconditions.l(runnable0);
            if(!this.a.post(runnable1)) {
                throw new RejectedExecutionException(this.a + " is shutting down");
            }
        }
    }

    public static Executor a(Handler handler0) {
        return new HandlerExecutor(handler0);
    }
}

