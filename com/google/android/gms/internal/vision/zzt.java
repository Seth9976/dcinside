package com.google.android.gms.internal.vision;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.vision.L;
import h4.m;
import p3.a;

public abstract class zzt {
    private final Context zza;
    private final Object zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private boolean zzf;
    private boolean zzg;
    @Nullable
    @a("lock")
    private Object zzh;

    public zzt(Context context0, String s, String s1) {
        this.zzb = new Object();
        this.zzf = false;
        this.zzg = false;
        this.zza = context0;
        this.zzc = s;
        String s2 = String.valueOf(s1);
        this.zzd = s2.length() == 0 ? new String("com.google.android.gms.vision.dynamite.") : "com.google.android.gms.vision.dynamite." + s2;
        this.zze = s1;
    }

    @Nullable
    protected abstract Object zza(DynamiteModule arg1, Context arg2) throws RemoteException, LoadingException;

    protected abstract void zza() throws RemoteException;

    public final boolean zzb() {
        return this.zzd() != null;
    }

    public final void zzc() {
        synchronized(this.zzb) {
            if(this.zzh == null) {
                return;
            }
            try {
                this.zza();
            }
            catch(RemoteException remoteException0) {
                Log.e(this.zzc, "Could not finalize native handle", remoteException0);
            }
        }
    }

    @Nullable
    @m({"context", "thickFeatureName", "featureName"})
    protected final Object zzd() {
        DynamiteModule dynamiteModule0;
        synchronized(this.zzb) {
            Object object1 = this.zzh;
            if(object1 != null) {
                return object1;
            }
            try {
                dynamiteModule0 = DynamiteModule.load(this.zza, DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION, this.zzd);
            }
            catch(LoadingException unused_ex) {
                String s = String.format("%s.%s", "com.google.android.gms.vision", this.zze);
                L.d("Cannot load thick client module, fall back to load optional module %s", new Object[]{s});
                try {
                    dynamiteModule0 = DynamiteModule.load(this.zza, DynamiteModule.PREFER_REMOTE, s);
                }
                catch(LoadingException dynamiteModule$LoadingException0) {
                    L.e(dynamiteModule$LoadingException0, "Error loading optional module %s", new Object[]{s});
                    if(!this.zzf) {
                        L.d("Broadcasting download intent for dependency %s", new Object[]{this.zze});
                        Intent intent0 = new Intent();
                        intent0.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                        intent0.putExtra("com.google.android.gms.vision.DEPENDENCIES", this.zze);
                        intent0.setAction("com.google.android.gms.vision.DEPENDENCY");
                        this.zza.sendBroadcast(intent0);
                        this.zzf = true;
                    }
                    dynamiteModule0 = null;
                }
            }
            if(dynamiteModule0 != null) {
                try {
                    this.zzh = this.zza(dynamiteModule0, this.zza);
                }
                catch(LoadingException | RemoteException dynamiteModule$LoadingException1) {
                    Log.e(this.zzc, "Error creating remote native handle", dynamiteModule$LoadingException1);
                }
            }
            boolean z = this.zzg;
            if(!z && this.zzh == null) {
                Log.w(this.zzc, "Native handle not yet available. Reverting to no-op handle.");
                this.zzg = true;
            }
            else if(z && this.zzh != null) {
                Log.w(this.zzc, "Native handle is now available.");
            }
            return this.zzh;
        }
    }
}

