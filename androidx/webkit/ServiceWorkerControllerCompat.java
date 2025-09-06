package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.internal.ServiceWorkerControllerImpl;

public abstract class ServiceWorkerControllerCompat {
    static class LAZY_HOLDER {
        static final ServiceWorkerControllerCompat a;

        static {
            LAZY_HOLDER.a = new ServiceWorkerControllerImpl();
        }
    }

    @NonNull
    public static ServiceWorkerControllerCompat a() {
        return LAZY_HOLDER.a;
    }

    @NonNull
    public abstract ServiceWorkerWebSettingsCompat b();

    public abstract void c(@Nullable ServiceWorkerClientCompat arg1);
}

