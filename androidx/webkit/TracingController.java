package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.internal.TracingControllerImpl;
import java.io.OutputStream;
import java.util.concurrent.Executor;

public abstract class TracingController {
    static class LAZY_HOLDER {
        static final TracingController a;

        static {
            LAZY_HOLDER.a = new TracingControllerImpl();
        }
    }

    @NonNull
    public static TracingController a() {
        return LAZY_HOLDER.a;
    }

    public abstract boolean b();

    public abstract void c(@NonNull TracingConfig arg1);

    public abstract boolean d(@Nullable OutputStream arg1, @NonNull Executor arg2);
}

