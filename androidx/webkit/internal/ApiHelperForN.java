package androidx.webkit.internal;

import android.content.Context;
import android.webkit.ServiceWorkerClient;
import android.webkit.ServiceWorkerController;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.ServiceWorkerClientCompat;
import java.io.File;

@RequiresApi(24)
public class ApiHelperForN {
    @DoNotInline
    public static boolean a(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings0) {
        return serviceWorkerWebSettings0.getAllowContentAccess();
    }

    @DoNotInline
    public static boolean b(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings0) {
        return serviceWorkerWebSettings0.getAllowFileAccess();
    }

    @DoNotInline
    public static boolean c(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings0) {
        return serviceWorkerWebSettings0.getBlockNetworkLoads();
    }

    @DoNotInline
    public static int d(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings0) {
        return serviceWorkerWebSettings0.getCacheMode();
    }

    @DoNotInline
    @NonNull
    public static File e(@NonNull Context context0) {
        return context0.getDataDir();
    }

    @DoNotInline
    public static int f(@NonNull WebSettings webSettings0) {
        return webSettings0.getDisabledActionModeMenuItems();
    }

    @DoNotInline
    @NonNull
    public static ServiceWorkerController g() {
        return ServiceWorkerController.getInstance();
    }

    @DoNotInline
    @NonNull
    public static ServiceWorkerWebSettings h(@NonNull ServiceWorkerController serviceWorkerController0) {
        return serviceWorkerController0.getServiceWorkerWebSettings();
    }

    @DoNotInline
    @NonNull
    public static ServiceWorkerWebSettingsImpl i(@NonNull ServiceWorkerController serviceWorkerController0) {
        return new ServiceWorkerWebSettingsImpl(ApiHelperForN.h(serviceWorkerController0));
    }

    @DoNotInline
    public static boolean j(@NonNull WebResourceRequest webResourceRequest0) {
        return webResourceRequest0.isRedirect();
    }

    @DoNotInline
    public static void k(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings0, boolean z) {
        serviceWorkerWebSettings0.setAllowContentAccess(z);
    }

    @DoNotInline
    public static void l(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings0, boolean z) {
        serviceWorkerWebSettings0.setAllowFileAccess(z);
    }

    @DoNotInline
    public static void m(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings0, boolean z) {
        serviceWorkerWebSettings0.setBlockNetworkLoads(z);
    }

    @DoNotInline
    public static void n(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings0, int v) {
        serviceWorkerWebSettings0.setCacheMode(v);
    }

    @DoNotInline
    public static void o(@NonNull WebSettings webSettings0, int v) {
        webSettings0.setDisabledActionModeMenuItems(v);
    }

    @DoNotInline
    public static void p(@NonNull ServiceWorkerController serviceWorkerController0, @Nullable ServiceWorkerClient serviceWorkerClient0) {
        serviceWorkerController0.setServiceWorkerClient(serviceWorkerClient0);
    }

    @DoNotInline
    public static void q(@NonNull ServiceWorkerController serviceWorkerController0, @NonNull ServiceWorkerClientCompat serviceWorkerClientCompat0) {
        serviceWorkerController0.setServiceWorkerClient(new FrameworkServiceWorkerClient(serviceWorkerClientCompat0));
    }
}

