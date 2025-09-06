package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.Window;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.WindowCompat;
import com.google.android.material.color.v;

@RestrictTo({Scope.b})
public class e {
    private static final int a = 0x80;

    public static void a(@NonNull Window window0, boolean z) {
        e.b(window0, z, null, null);
    }

    public static void b(@NonNull Window window0, boolean z, @ColorInt @Nullable Integer integer0, @ColorInt @Nullable Integer integer1) {
        boolean z1 = false;
        boolean z2 = integer0 == null || ((int)integer0) == 0;
        if(integer1 == null || ((int)integer1) == 0) {
            z1 = true;
        }
        if(z2 || z1) {
            int v = v.b(window0.getContext(), 0x1010031, 0xFF000000);
            if(z2) {
                integer0 = v;
            }
            if(z1) {
                integer1 = v;
            }
        }
        WindowCompat.c(window0, !z);
        int v1 = e.d(window0.getContext(), z);
        int v2 = e.c(window0.getContext(), z);
        window0.setStatusBarColor(v1);
        window0.setNavigationBarColor(v2);
        e.g(window0, e.e(v1, v.q(((int)integer0))));
        e.f(window0, e.e(v2, v.q(((int)integer1))));
    }

    @TargetApi(21)
    private static int c(Context context0, boolean z) {
        if(z && Build.VERSION.SDK_INT < 27) {
            return ColorUtils.D(v.b(context0, 0x1010452, 0xFF000000), 0x80);
        }
        return z ? 0 : v.b(context0, 0x1010452, 0xFF000000);
    }

    @TargetApi(21)
    private static int d(Context context0, boolean z) {
        if(z && Build.VERSION.SDK_INT < 23) {
            return ColorUtils.D(v.b(context0, 0x1010451, 0xFF000000), 0x80);
        }
        return z ? 0 : v.b(context0, 0x1010451, 0xFF000000);
    }

    // 去混淆评级： 低(30)
    private static boolean e(int v, boolean z) {
        return v.q(v) || v == 0 && z;
    }

    public static void f(@NonNull Window window0, boolean z) {
        WindowCompat.a(window0, window0.getDecorView()).h(z);
    }

    public static void g(@NonNull Window window0, boolean z) {
        WindowCompat.a(window0, window0.getDecorView()).i(z);
    }
}

