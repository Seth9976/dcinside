package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.Executor;

@KeepForSdk
public abstract class GmsClientSupervisor {
    @Nullable
    @VisibleForTesting
    static HandlerThread zza = null;
    private static final Object zzb = null;
    private static int zzc = 9;
    @Nullable
    private static zzs zzd = null;
    @Nullable
    private static Executor zze = null;
    private static boolean zzf = false;

    static {
        GmsClientSupervisor.zzb = new Object();
    }

    @KeepForSdk
    public boolean bindService(@NonNull ComponentName componentName0, @NonNull ServiceConnection serviceConnection0, @NonNull String s) {
        return this.zza(new zzo(componentName0, 0x1081), serviceConnection0, s, null).isSuccess();
    }

    @KeepForSdk
    public boolean bindService(@NonNull ComponentName componentName0, @NonNull ServiceConnection serviceConnection0, @NonNull String s, @Nullable Executor executor0) {
        return this.zza(new zzo(componentName0, 0x1081), serviceConnection0, s, executor0).isSuccess();
    }

    @KeepForSdk
    public boolean bindService(@NonNull String s, @NonNull ServiceConnection serviceConnection0, @NonNull String s1) {
        return this.zza(new zzo(s, 0x1081, false), serviceConnection0, s1, null).isSuccess();
    }

    @KeepForSdk
    public static int getDefaultBindFlags() [...] // Inlined contents

    @NonNull
    @KeepForSdk
    public static GmsClientSupervisor getInstance(@NonNull Context context0) {
        synchronized(GmsClientSupervisor.zzb) {
            if(GmsClientSupervisor.zzd == null) {
                GmsClientSupervisor.zzd = new zzs(context0.getApplicationContext(), (GmsClientSupervisor.zzf ? GmsClientSupervisor.getOrStartHandlerThread().getLooper() : context0.getMainLooper()), GmsClientSupervisor.zze);
            }
            return GmsClientSupervisor.zzd;
        }
    }

    @NonNull
    @KeepForSdk
    public static HandlerThread getOrStartHandlerThread() {
        synchronized(GmsClientSupervisor.zzb) {
            HandlerThread handlerThread0 = GmsClientSupervisor.zza;
            if(handlerThread0 != null) {
                return handlerThread0;
            }
            HandlerThread handlerThread1 = new HandlerThread("GoogleApiHandler", GmsClientSupervisor.zzc);
            GmsClientSupervisor.zza = handlerThread1;
            handlerThread1.start();
            return GmsClientSupervisor.zza;
        }
    }

    @NonNull
    @KeepForSdk
    public static HandlerThread getOrStartHandlerThread(int v) {
        synchronized(GmsClientSupervisor.zzb) {
            HandlerThread handlerThread0 = GmsClientSupervisor.zza;
            if(handlerThread0 != null) {
                return handlerThread0;
            }
            HandlerThread handlerThread1 = new HandlerThread("GoogleApiHandler", v);
            GmsClientSupervisor.zza = handlerThread1;
            handlerThread1.start();
            return GmsClientSupervisor.zza;
        }
    }

    @KeepForSdk
    public static void setDefaultBindExecutor(@Nullable Executor executor0) {
        synchronized(GmsClientSupervisor.zzb) {
            zzs zzs0 = GmsClientSupervisor.zzd;
            if(zzs0 != null) {
                zzs0.zzi(executor0);
            }
            GmsClientSupervisor.zze = executor0;
        }
    }

    @KeepForSdk
    public static boolean setGamHandlerThreadPriorityIfNotInitialized(int v) {
        synchronized(GmsClientSupervisor.zzb) {
            if(GmsClientSupervisor.zza == null) {
                GmsClientSupervisor.zzc = v;
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    public static void setUseHandlerThreadForCallbacks() {
        synchronized(GmsClientSupervisor.zzb) {
            zzs zzs0 = GmsClientSupervisor.zzd;
            if(zzs0 != null && !GmsClientSupervisor.zzf) {
                zzs0.zzj(GmsClientSupervisor.getOrStartHandlerThread().getLooper());
            }
            GmsClientSupervisor.zzf = true;
        }
    }

    @KeepForSdk
    public void unbindService(@NonNull ComponentName componentName0, @NonNull ServiceConnection serviceConnection0, @NonNull String s) {
        this.zzb(new zzo(componentName0, 0x1081), serviceConnection0, s);
    }

    @KeepForSdk
    public void unbindService(@NonNull String s, @NonNull ServiceConnection serviceConnection0, @NonNull String s1) {
        this.zzb(new zzo(s, 0x1081, false), serviceConnection0, s1);
    }

    protected abstract ConnectionResult zza(zzo arg1, ServiceConnection arg2, String arg3, @Nullable Executor arg4);

    protected abstract void zzb(zzo arg1, ServiceConnection arg2, String arg3);

    public final void zzc(@NonNull String s, @NonNull String s1, int v, @NonNull ServiceConnection serviceConnection0, @NonNull String s2, boolean z) {
        this.zzb(new zzo(s, s1, 0x1081, z), serviceConnection0, s2);
    }
}

