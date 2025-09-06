package com.google.android.gms.internal.common;

import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;

public final class zzl {
    @Nullable
    public static Object zza(Class class0, String s, zzj[] arr_zzj) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return zzl.zzc(class0, "isIsolated", null, false, arr_zzj);
    }

    @Nullable
    public static Object zzb(String s, String s1, ClassLoader classLoader0, zzj[] arr_zzj) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
        return zzl.zzc(classLoader0.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", null, false, arr_zzj);
    }

    @Nullable
    private static Object zzc(Class class0, String s, @Nullable Object object0, boolean z, zzj[] arr_zzj) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Class[] arr_class = new Class[arr_zzj.length];
        Object[] arr_object = new Object[arr_zzj.length];
        for(int v = 0; v < arr_zzj.length; ++v) {
            zzj zzj0 = arr_zzj[v];
            zzj0.getClass();
            arr_class[v] = zzj0.zzc();
            arr_object[v] = arr_zzj[v].zzd();
        }
        return class0.getDeclaredMethod(s, arr_class).invoke(null, arr_object);
    }
}

