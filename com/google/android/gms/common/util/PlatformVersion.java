package com.google.android.gms.common.util;

import android.os.Build.VERSION;
import androidx.annotation.ChecksSdkIntAtLeast;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public final class PlatformVersion {
    @ChecksSdkIntAtLeast(api = 11)
    @KeepForSdk
    @Deprecated
    public static boolean isAtLeastHoneycomb() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 12)
    @KeepForSdk
    public static boolean isAtLeastHoneycombMR1() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 14)
    @KeepForSdk
    public static boolean isAtLeastIceCreamSandwich() [...] // Inlined contents

    @ChecksSdkIntAtLeast(api = 15)
    @KeepForSdk
    public static boolean isAtLeastIceCreamSandwichMR1() [...] // Inlined contents

    @ChecksSdkIntAtLeast(api = 16)
    @KeepForSdk
    public static boolean isAtLeastJellyBean() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 17)
    @KeepForSdk
    public static boolean isAtLeastJellyBeanMR1() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 18)
    @KeepForSdk
    public static boolean isAtLeastJellyBeanMR2() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 19)
    @KeepForSdk
    public static boolean isAtLeastKitKat() [...] // Inlined contents

    @ChecksSdkIntAtLeast(api = 20)
    @KeepForSdk
    public static boolean isAtLeastKitKatWatch() [...] // Inlined contents

    @ChecksSdkIntAtLeast(api = 21)
    @KeepForSdk
    public static boolean isAtLeastLollipop() [...] // Inlined contents

    @ChecksSdkIntAtLeast(api = 22)
    @KeepForSdk
    public static boolean isAtLeastLollipopMR1() {
        return Build.VERSION.SDK_INT >= 22;
    }

    @ChecksSdkIntAtLeast(api = 23)
    @KeepForSdk
    public static boolean isAtLeastM() [...] // 潜在的解密器

    @ChecksSdkIntAtLeast(api = 24)
    @KeepForSdk
    public static boolean isAtLeastN() [...] // 潜在的解密器

    @ChecksSdkIntAtLeast(api = 26)
    @KeepForSdk
    public static boolean isAtLeastO() [...] // 潜在的解密器

    @ChecksSdkIntAtLeast(api = 28)
    @KeepForSdk
    public static boolean isAtLeastP() [...] // 潜在的解密器

    @ChecksSdkIntAtLeast(api = 29)
    @KeepForSdk
    public static boolean isAtLeastQ() [...] // 潜在的解密器

    @ChecksSdkIntAtLeast(api = 30)
    @KeepForSdk
    public static boolean isAtLeastR() [...] // 潜在的解密器

    @ChecksSdkIntAtLeast(api = 0x1F)
    @KeepForSdk
    public static boolean isAtLeastS() [...] // 潜在的解密器

    @ChecksSdkIntAtLeast(api = 0x20)
    @KeepForSdk
    public static boolean isAtLeastSv2() {
        return Build.VERSION.SDK_INT >= 0x20;
    }

    @ChecksSdkIntAtLeast(api = 33)
    @KeepForSdk
    public static boolean isAtLeastT() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @ChecksSdkIntAtLeast(api = 34)
    @KeepForSdk
    public static boolean isAtLeastU() [...] // 潜在的解密器

    // 去混淆评级： 低(30)
    @ChecksSdkIntAtLeast(api = 35, codename = "VanillaIceCream")
    @KeepForSdk
    public static boolean isAtLeastV() {
        return false;
    }
}

