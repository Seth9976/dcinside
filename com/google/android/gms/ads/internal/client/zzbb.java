package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbeu;

abstract class zzbb {
    @Nullable
    private static final zzcp zza;

    static {
        zzcp zzcp0 = null;
        try {
            Object object0 = zzba.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if(!(object0 instanceof IBinder)) {
                zzo.zzj("ClientApi class is not an instance of IBinder.");
            }
            else if(((IBinder)object0) != null) {
                IInterface iInterface0 = ((IBinder)object0).queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                zzcp zzcp1 = iInterface0 instanceof zzcp ? ((zzcp)iInterface0) : new zzcn(((IBinder)object0));
                zzcp0 = zzcp1;
            }
        }
        catch(Exception unused_ex) {
            zzo.zzj("Failed to instantiate ClientApi class.");
        }
        zzbb.zza = zzcp0;
    }

    @NonNull
    protected abstract Object zza();

    @Nullable
    protected abstract Object zzb(zzcp arg1) throws RemoteException;

    @Nullable
    protected abstract Object zzc() throws RemoteException;

    public final Object zzd(Context context0, boolean z) {
        Object object0;
        boolean z1;
        if(!z && !zzf.zzs(context0, 12451000)) {
            zzo.zze("Google Play Services is not available.");
            z = true;
        }
        int v = 0;
        int v1 = DynamiteModule.getLocalVersion(context0, "com.google.android.gms.ads.dynamite") <= DynamiteModule.getRemoteVersion(context0, "com.google.android.gms.ads.dynamite") ? 1 : 0;
        zzbcl.zza(context0);
        if(((Boolean)zzbeg.zza.zze()).booleanValue()) {
            z1 = false;
        }
        else if(((Boolean)zzbeg.zzb.zze()).booleanValue()) {
            z1 = true;
            v = 1;
        }
        else {
            v = z | v1 ^ 1;
            z1 = false;
        }
        if(v == 0) {
            Object object1 = this.zzf();
            if(object1 == null && zzbc.zze().nextInt(((Long)zzbeu.zza.zze()).intValue()) == 0) {
                Bundle bundle0 = new Bundle();
                bundle0.putString("action", "dynamite_load");
                bundle0.putInt("is_missing", 1);
                zzbc.zzb().zzn(context0, zzbc.zzc().afmaVersion, "gmob-apps", bundle0, true);
            }
            object0 = object1 == null ? this.zze() : object1;
        }
        else {
            object0 = this.zze();
            if(object0 == null && !z1) {
                object0 = this.zzf();
                return object0 == null ? this.zza() : object0;
            }
        }
        return object0 == null ? this.zza() : object0;
    }

    @Nullable
    private final Object zze() {
        zzcp zzcp0 = zzbb.zza;
        if(zzcp0 != null) {
            try {
                return this.zzb(zzcp0);
            }
            catch(RemoteException remoteException0) {
                zzo.zzk("Cannot invoke local loader using ClientApi class.", remoteException0);
                return null;
            }
        }
        zzo.zzj("ClientApi class cannot be loaded.");
        return null;
    }

    @Nullable
    private final Object zzf() {
        try {
            return this.zzc();
        }
        catch(RemoteException remoteException0) {
            zzo.zzk("Cannot invoke remote loader.", remoteException0);
            return null;
        }
    }
}

