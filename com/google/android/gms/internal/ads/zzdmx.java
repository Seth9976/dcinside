package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;

public final class zzdmx implements zzbjp {
    @Nullable
    private final zzbha zza;
    private final zzdnl zzb;
    private final zzhel zzc;

    public zzdmx(zzdiq zzdiq0, zzdif zzdif0, zzdnl zzdnl0, zzhel zzhel0) {
        this.zza = zzdiq0.zzc(zzdif0.zzA());
        this.zzb = zzdnl0;
        this.zzc = zzhel0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        String s = (String)map0.get("asset");
        try {
            zzbgq zzbgq0 = (zzbgq)this.zzc.zzb();
            this.zza.zze(zzbgq0, s);
        }
        catch(RemoteException remoteException0) {
            zzo.zzk(("Failed to call onCustomClick for asset " + s + "."), remoteException0);
        }
    }

    public final void zzb() {
        if(this.zza == null) {
            return;
        }
        this.zzb.zzl("/nativeAdCustomClick", this);
    }
}

