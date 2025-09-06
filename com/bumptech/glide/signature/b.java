package com.bumptech.glide.signature;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.g;
import j..util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class b {
    private static final String a = "AppVersionSignature";
    private static final ConcurrentMap b;

    static {
        b.b = new ConcurrentHashMap();
    }

    @Nullable
    private static PackageInfo a(@NonNull Context context0) {
        try {
            return context0.getPackageManager().getPackageInfo("com.dcinside.app.android", 0);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            Log.e("AppVersionSignature", "Cannot resolve info forcom.dcinside.app.android", packageManager$NameNotFoundException0);
            return null;
        }
    }

    // 去混淆评级： 低(20)
    @NonNull
    private static String b(@Nullable PackageInfo packageInfo0) {
        return packageInfo0 == null ? "1d525f9b-f89c-45ea-a461-d5bff655ccd7" : String.valueOf(packageInfo0.versionCode);
    }

    @NonNull
    public static g c(@NonNull Context context0) {
        ConcurrentMap concurrentMap0 = b.b;
        g g0 = (g)concurrentMap0.get("com.dcinside.app.android");
        if(g0 == null) {
            g0 = b.d(context0);
            g g1 = (g)concurrentMap0.putIfAbsent("com.dcinside.app.android", g0);
            return g1 == null ? g0 : g1;
        }
        return g0;
    }

    @NonNull
    private static g d(@NonNull Context context0) {
        return new e(b.b(b.a(context0)));
    }

    @VisibleForTesting
    static void e() {
        b.b.clear();
    }
}

