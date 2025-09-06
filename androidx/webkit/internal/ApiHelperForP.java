package androidx.webkit.internal;

import android.os.Looper;
import android.webkit.TracingController;
import android.webkit.WebView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.TracingConfig;
import java.io.OutputStream;
import java.util.concurrent.Executor;

@RequiresApi(28)
public class ApiHelperForP {
    @DoNotInline
    @NonNull
    public static TracingController a() {
        return TracingController.getInstance();
    }

    @DoNotInline
    @NonNull
    public static ClassLoader b() {
        return WebView.getWebViewClassLoader();
    }

    @DoNotInline
    @NonNull
    public static Looper c(@NonNull WebView webView0) {
        return webView0.getWebViewLooper();
    }

    @DoNotInline
    public static boolean d(@NonNull TracingController tracingController0) {
        return tracingController0.isTracing();
    }

    @DoNotInline
    public static void e(@NonNull String s) {
        WebView.setDataDirectorySuffix(s);
    }

    @DoNotInline
    public static void f(@NonNull TracingController tracingController0, @NonNull TracingConfig tracingConfig0) {
        tracingController0.start(S.a().addCategories(new int[]{tracingConfig0.b()}).addCategories(tracingConfig0.a()).setTracingMode(tracingConfig0.c()).build());
    }

    @DoNotInline
    public static boolean g(@NonNull TracingController tracingController0, @Nullable OutputStream outputStream0, @NonNull Executor executor0) {
        return tracingController0.stop(outputStream0, executor0);
    }
}

