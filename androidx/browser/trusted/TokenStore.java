package androidx.browser.trusted;

import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;

public interface TokenStore {
    @BinderThread
    @Nullable
    Token w();

    @WorkerThread
    void x(@Nullable Token arg1);
}

