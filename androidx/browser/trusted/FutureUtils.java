package androidx.browser.trusted;

import androidx.annotation.NonNull;
import androidx.concurrent.futures.ResolvableFuture;
import com.google.common.util.concurrent.t0;

class FutureUtils {
    @NonNull
    static t0 a(@NonNull Throwable throwable0) {
        t0 t00 = ResolvableFuture.w();
        ((ResolvableFuture)t00).s(throwable0);
        return t00;
    }
}

