package androidx.webkit;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class WebViewRenderProcessClient {
    public abstract void a(@NonNull WebView arg1, @Nullable WebViewRenderProcess arg2);

    public abstract void b(@NonNull WebView arg1, @Nullable WebViewRenderProcess arg2);
}

