package androidx.webkit;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;

public abstract class ServiceWorkerClientCompat {
    @Nullable
    @WorkerThread
    public abstract WebResourceResponse a(@NonNull WebResourceRequest arg1);
}

