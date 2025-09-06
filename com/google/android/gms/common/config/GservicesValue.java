package com.google.android.gms.common.config;

import android.os.Binder;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public abstract class GservicesValue {
    @NonNull
    protected final String zza;
    @NonNull
    protected final Object zzb;
    private static final Object zzc;
    @Nullable
    private Object zzd;

    static {
        GservicesValue.zzc = new Object();
    }

    protected GservicesValue(@NonNull String s, @NonNull Object object0) {
        this.zzd = null;
        this.zza = s;
        this.zzb = object0;
    }

    @NonNull
    @KeepForSdk
    public final Object get() {
        Object object2;
        Object object1;
        Object object0 = this.zzd;
        if(object0 != null) {
            return object0;
        }
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
        try {
            object1 = this.zza(this.zza);
        }
        catch(SecurityException unused_ex) {
            long v1 = Binder.clearCallingIdentity();
            try {
                object2 = this.zza(this.zza);
            }
            catch(Throwable throwable0) {
                Binder.restoreCallingIdentity(v1);
                throw throwable0;
            }
            Binder.restoreCallingIdentity(v1);
            object1 = object2;
        }
        finally {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        }
        return object1;
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public final Object getBinderSafe() {
        return this.get();
    }

    @KeepForSdk
    public static boolean isInitialized() {
        synchronized(GservicesValue.zzc) {
        }
        return false;
    }

    @VisibleForTesting
    @KeepForSdk
    public void override(@NonNull Object object0) {
        Log.w("GservicesValue", "GservicesValue.override(): test should probably call initForTests() first");
        this.zzd = object0;
        synchronized(GservicesValue.zzc) {
        }
    }

    @VisibleForTesting
    @KeepForSdk
    public void resetOverride() {
        this.zzd = null;
    }

    @NonNull
    @KeepForSdk
    public static GservicesValue value(@NonNull String s, @NonNull Float float0) {
        return new zzd(s, float0);
    }

    @NonNull
    @KeepForSdk
    public static GservicesValue value(@NonNull String s, @NonNull Integer integer0) {
        return new zzc(s, integer0);
    }

    @NonNull
    @KeepForSdk
    public static GservicesValue value(@NonNull String s, @NonNull Long long0) {
        return new zzb(s, long0);
    }

    @NonNull
    @KeepForSdk
    public static GservicesValue value(@NonNull String s, @NonNull String s1) {
        return new zze(s, s1);
    }

    @NonNull
    @KeepForSdk
    public static GservicesValue value(@NonNull String s, boolean z) {
        return new zza(s, Boolean.valueOf(z));
    }

    @NonNull
    protected abstract Object zza(@NonNull String arg1);
}

