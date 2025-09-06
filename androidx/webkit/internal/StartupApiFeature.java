package androidx.webkit.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.ComponentInfoFlags;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.webkit.WebViewCompat;
import j..util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

public abstract class StartupApiFeature {
    public static class NoFramework extends StartupApiFeature {
        NoFramework(@NonNull String s, @NonNull String s1) {
            super(s, s1);
        }

        @Override  // androidx.webkit.internal.StartupApiFeature
        public final boolean e() {
            return false;
        }
    }

    public static class P extends StartupApiFeature {
        P(@NonNull String s, @NonNull String s1) {
            super(s, s1);
        }

        @Override  // androidx.webkit.internal.StartupApiFeature
        public final boolean e() [...] // 潜在的解密器
    }

    private final String a;
    private final String b;
    private static final Set c = null;
    @VisibleForTesting
    public static final String d = "org.chromium.android_webview.services.StartupFeatureMetadataHolder";
    static final boolean e;

    static {
        StartupApiFeature.c = new HashSet();
    }

    StartupApiFeature(@NonNull String s, @NonNull String s1) {
        this.a = s;
        this.b = s1;
        StartupApiFeature.c.add(this);
    }

    @Nullable
    private static Bundle a(@NonNull Context context0) {
        PackageInfo packageInfo0 = WebViewCompat.g(context0);
        if(packageInfo0 == null) {
            return null;
        }
        ComponentName componentName0 = new ComponentName(packageInfo0.packageName, "org.chromium.android_webview.services.StartupFeatureMetadataHolder");
        int v = Build.VERSION.SDK_INT;
        if(v >= 33) {
            PackageManager.ComponentInfoFlags packageManager$ComponentInfoFlags0 = ApiHelperForTiramisu.b(640L);
            try {
                return ApiHelperForTiramisu.a(context0.getPackageManager(), componentName0, packageManager$ComponentInfoFlags0).metaData;
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                return null;
            }
        }
        try {
            return StartupApiFeature.c(context0, componentName0, (v < 24 ? 0x80 : 640)).metaData;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return null;
        }
    }

    @NonNull
    public String b() {
        return this.a;
    }

    private static ServiceInfo c(@NonNull Context context0, ComponentName componentName0, int v) throws PackageManager.NameNotFoundException {
        return context0.getPackageManager().getServiceInfo(componentName0, v);
    }

    // 去混淆评级： 低(20)
    public boolean d(@NonNull Context context0) {
        return this.e() || this.f(context0);
    }

    public abstract boolean e();

    @ChecksSdkIntAtLeast(api = 21)
    public boolean f(@NonNull Context context0) {
        Bundle bundle0 = StartupApiFeature.a(context0);
        return bundle0 == null ? false : bundle0.containsKey(this.b);
    }

    @NonNull
    public static Set g() {
        return DesugarCollections.unmodifiableSet(StartupApiFeature.c);
    }
}

