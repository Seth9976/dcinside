package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzblu;
import com.google.android.gms.internal.ads.zzbpe;
import java.util.Collections;
import java.util.List;

public final class zzfm extends zzcy {
    private zzblu zza;

    // 检测为 Lambda 实现
    final void zzb() [...]

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final float zze() throws RemoteException {
        return 1.0f;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final String zzf() {
        return "";
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final List zzg() throws RemoteException {
        return Collections.emptyList();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzh(@Nullable String s) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzi() {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzj(boolean z) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzk() throws RemoteException {
        zzo.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzfl zzfl0 = () -> {
            zzblu zzblu0 = this.zza;
            if(zzblu0 != null) {
                try {
                    zzblu0.zzb(Collections.emptyList());
                }
                catch(RemoteException remoteException0) {
                    zzo.zzk("Could not notify onComplete event.", remoteException0);
                }
            }
        };
        zzf.zza.post(zzfl0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzl(@Nullable String s, IObjectWrapper iObjectWrapper0) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzm(zzdl zzdl0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzn(IObjectWrapper iObjectWrapper0, String s) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzo(zzbpe zzbpe0) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzp(boolean z) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzq(float f) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzr(String s) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzs(zzblu zzblu0) throws RemoteException {
        this.zza = zzblu0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzt(String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzu(zzfv zzfv0) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final boolean zzv() throws RemoteException {
        return false;
    }
}

