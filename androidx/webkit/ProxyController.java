package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.webkit.internal.ProxyControllerImpl;
import java.util.concurrent.Executor;

public abstract class ProxyController {
    static class LAZY_HOLDER {
        static final ProxyController a;

        static {
            LAZY_HOLDER.a = new ProxyControllerImpl();
        }
    }

    public abstract void a(@NonNull Executor arg1, @NonNull Runnable arg2);

    @NonNull
    public static ProxyController b() {
        if(!WebViewFeature.a("PROXY_OVERRIDE")) {
            throw new UnsupportedOperationException("Proxy override not supported");
        }
        return LAZY_HOLDER.a;
    }

    public abstract void c(@NonNull ProxyConfig arg1, @NonNull Executor arg2, @NonNull Runnable arg3);
}

