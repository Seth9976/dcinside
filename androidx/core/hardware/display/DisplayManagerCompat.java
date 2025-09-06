package androidx.core.hardware.display;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build.VERSION;
import android.view.Display;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import j..util.Objects;

public final class DisplayManagerCompat {
    private final Context a;
    @RestrictTo({Scope.a})
    @VisibleForTesting
    static final String b = "android.hardware.display.category.ALL_INCLUDING_DISABLED";
    @RestrictTo({Scope.a})
    @VisibleForTesting
    static final int c = 1;
    public static final String d = "android.hardware.display.category.PRESENTATION";
    @ExperimentalDisplayApi
    public static final String e = "android.hardware.display.category.BUILT_IN_DISPLAYS";

    private DisplayManagerCompat(Context context0) {
        this.a = context0;
    }

    private static Display[] a(DisplayManager displayManager0) {
        Display[] arr_display = Build.VERSION.SDK_INT < 0x20 ? displayManager0.getDisplays() : displayManager0.getDisplays("android.hardware.display.category.ALL_INCLUDING_DISABLED");
        Display[] arr_display1 = new Display[DisplayManagerCompat.g(1, arr_display)];
        int v1 = 0;
        for(int v = 0; v < arr_display.length; ++v) {
            Display display0 = arr_display[v];
            if(1 == DisplayManagerCompat.f(display0)) {
                arr_display1[v1] = display0;
                ++v1;
            }
        }
        return arr_display1;
    }

    public Display b(int v) {
        return ((DisplayManager)this.a.getSystemService("display")).getDisplay(v);
    }

    public Display[] c() {
        return ((DisplayManager)this.a.getSystemService("display")).getDisplays();
    }

    // 去混淆评级： 低(20)
    public Display[] d(String s) {
        return "android.hardware.display.category.BUILT_IN_DISPLAYS".equals(s) ? DisplayManagerCompat.a(((DisplayManager)this.a.getSystemService("display"))) : ((DisplayManager)this.a.getSystemService("display")).getDisplays(s);
    }

    public static DisplayManagerCompat e(Context context0) {
        return new DisplayManagerCompat(context0);
    }

    @SuppressLint({"BanUncheckedReflection"})
    @RestrictTo({Scope.a})
    @VisibleForTesting
    static int f(Display display0) {
        try {
            Object object0 = Display.class.getMethod("getType", null).invoke(display0, null);
            Objects.requireNonNull(object0);
            return (int)(((Integer)object0));
        }
        catch(NoSuchMethodException unused_ex) {
            return 0;
        }
        catch(Exception exception0) {
            throw new RuntimeException(exception0);
        }
    }

    private static int g(int v, Display[] arr_display) {
        int v2 = 0;
        for(int v1 = 0; v1 < arr_display.length; ++v1) {
            if(v == DisplayManagerCompat.f(arr_display[v1])) {
                ++v2;
            }
        }
        return v2;
    }
}

