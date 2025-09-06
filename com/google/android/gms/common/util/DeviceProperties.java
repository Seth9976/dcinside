package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.apps.common.proguard.SideEffectFree;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public final class DeviceProperties {
    @Nullable
    private static Boolean zza;
    @Nullable
    private static Boolean zzb;
    @Nullable
    private static Boolean zzc;
    @Nullable
    private static Boolean zzd;
    @Nullable
    private static Boolean zze;
    @Nullable
    private static Boolean zzf;
    @Nullable
    private static Boolean zzg;
    @Nullable
    private static Boolean zzh;
    @Nullable
    private static Boolean zzi;
    @Nullable
    private static Boolean zzj;
    @Nullable
    private static Boolean zzk;
    @Nullable
    private static Boolean zzl;
    @Nullable
    private static Boolean zzm;
    @Nullable
    private static Boolean zzn;

    @KeepForSdk
    public static boolean isAuto(@NonNull Context context0) {
        boolean z = false;
        PackageManager packageManager0 = context0.getPackageManager();
        if(DeviceProperties.zzj == null) {
            if(packageManager0.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            DeviceProperties.zzj = Boolean.valueOf(z);
        }
        return DeviceProperties.zzj.booleanValue();
    }

    @KeepForSdk
    public static boolean isBstar(@NonNull Context context0) {
        boolean z = false;
        if(DeviceProperties.zzm == null) {
            if(context0.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z = true;
            }
            DeviceProperties.zzm = Boolean.valueOf(z);
        }
        return DeviceProperties.zzm.booleanValue();
    }

    @KeepForSdk
    public static boolean isFoldable(@NonNull Context context0) {
        boolean z = false;
        if(DeviceProperties.zzc == null) {
            if(context0.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle")) {
                z = true;
            }
            DeviceProperties.zzc = Boolean.valueOf(z);
        }
        return DeviceProperties.zzc.booleanValue();
    }

    @KeepForSdk
    public static boolean isLatchsky(@NonNull Context context0) {
        if(DeviceProperties.zzg == null) {
            PackageManager packageManager0 = context0.getPackageManager();
            DeviceProperties.zzg = Boolean.valueOf(packageManager0.hasSystemFeature("com.google.android.feature.services_updater") && packageManager0.hasSystemFeature("cn.google.services"));
        }
        return DeviceProperties.zzg.booleanValue();
    }

    @KeepForSdk
    public static boolean isPhone(@NonNull Context context0) {
        boolean z = true;
        if(DeviceProperties.zza == null) {
            if(!DeviceProperties.isFoldable(context0)) {
                if(DeviceProperties.isTablet(context0) || DeviceProperties.isWearable(context0) || DeviceProperties.zzb(context0)) {
                    z = false;
                }
                else {
                    if(DeviceProperties.zzi == null) {
                        DeviceProperties.zzi = Boolean.valueOf(context0.getPackageManager().hasSystemFeature("org.chromium.arc"));
                    }
                    if(DeviceProperties.zzi.booleanValue() || DeviceProperties.isAuto(context0) || DeviceProperties.isTv(context0)) {
                        z = false;
                    }
                    else {
                        if(DeviceProperties.zzl == null) {
                            DeviceProperties.zzl = Boolean.valueOf(context0.getPackageManager().hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE"));
                        }
                        if(DeviceProperties.zzl.booleanValue() || DeviceProperties.isBstar(context0) || DeviceProperties.isXr(context0)) {
                            z = false;
                        }
                    }
                }
            }
            DeviceProperties.zza = Boolean.valueOf(z);
        }
        return DeviceProperties.zza.booleanValue();
    }

    @KeepForSdk
    public static boolean isSevenInchTablet(@NonNull Context context0) {
        return DeviceProperties.zzc(context0.getResources());
    }

    @TargetApi(21)
    @KeepForSdk
    public static boolean isSidewinder(@NonNull Context context0) {
        return DeviceProperties.zza(context0);
    }

    @KeepForSdk
    public static boolean isTablet(@NonNull Context context0) {
        return DeviceProperties.isTablet(context0.getResources());
    }

    @KeepForSdk
    public static boolean isTablet(@NonNull Resources resources0) {
        boolean z = false;
        if(resources0 == null) {
            return false;
        }
        if(DeviceProperties.zzb == null) {
            if((resources0.getConfiguration().screenLayout & 15) > 3) {
                z = true;
            }
            else if(DeviceProperties.zzc(resources0)) {
                z = true;
            }
            DeviceProperties.zzb = Boolean.valueOf(z);
        }
        return DeviceProperties.zzb.booleanValue();
    }

    @KeepForSdk
    public static boolean isTv(@NonNull Context context0) {
        boolean z = true;
        PackageManager packageManager0 = context0.getPackageManager();
        if(DeviceProperties.zzk == null) {
            if(!packageManager0.hasSystemFeature("com.google.android.tv") && !packageManager0.hasSystemFeature("android.hardware.type.television") && !packageManager0.hasSystemFeature("android.software.leanback") && !packageManager0.hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE")) {
                z = false;
            }
            DeviceProperties.zzk = Boolean.valueOf(z);
        }
        return DeviceProperties.zzk.booleanValue();
    }

    @KeepForSdk
    public static boolean isUserBuild() {
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    @SideEffectFree
    @KeepForSdk
    public static boolean isWearable(@NonNull Context context0) {
        return DeviceProperties.zzd(context0.getPackageManager());
    }

    // 去混淆评级： 中等(110)
    @TargetApi(26)
    @KeepForSdk
    public static boolean isWearableWithoutPlayStore(@NonNull Context context0) {
        return DeviceProperties.isWearable(context0) && false || DeviceProperties.zza(context0);
    }

    @KeepForSdk
    public static boolean isXr(@NonNull Context context0) {
        PackageManager packageManager0 = context0.getPackageManager();
        if(DeviceProperties.zzn == null) {
            DeviceProperties.zzn = Boolean.valueOf(packageManager0.hasSystemFeature("android.software.xr.immersive"));
        }
        return DeviceProperties.zzn.booleanValue();
    }

    @TargetApi(21)
    public static boolean zza(@NonNull Context context0) {
        if(DeviceProperties.zzf == null) {
            DeviceProperties.zzf = Boolean.valueOf(context0.getPackageManager().hasSystemFeature("cn.google"));
        }
        return DeviceProperties.zzf.booleanValue();
    }

    public static boolean zzb(@NonNull Context context0) {
        boolean z = true;
        if(DeviceProperties.zzh == null) {
            if(!context0.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context0.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            DeviceProperties.zzh = Boolean.valueOf(z);
        }
        return DeviceProperties.zzh.booleanValue();
    }

    public static boolean zzc(@NonNull Resources resources0) {
        boolean z = false;
        if(resources0 == null) {
            return false;
        }
        if(DeviceProperties.zzd == null) {
            Configuration configuration0 = resources0.getConfiguration();
            if((configuration0.screenLayout & 15) <= 3 && configuration0.smallestScreenWidthDp >= 600) {
                z = true;
            }
            DeviceProperties.zzd = Boolean.valueOf(z);
        }
        return DeviceProperties.zzd.booleanValue();
    }

    @TargetApi(20)
    @SideEffectFree
    public static boolean zzd(@NonNull PackageManager packageManager0) {
        if(DeviceProperties.zze == null) {
            DeviceProperties.zze = Boolean.valueOf(packageManager0.hasSystemFeature("android.hardware.type.watch"));
        }
        return DeviceProperties.zze.booleanValue();
    }
}

