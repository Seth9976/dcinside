package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import org.json.JSONObject;

public final class zzeib implements zzecy {
    private final zzejf zza;
    private final zzdpm zzb;

    zzeib(zzejf zzejf0, zzdpm zzdpm0) {
        this.zza = zzejf0;
        this.zzb = zzdpm0;
    }

    @Override  // com.google.android.gms.internal.ads.zzecy
    @Nullable
    public final zzecz zza(String s, JSONObject jSONObject0) throws zzfcq {
        zzbrd zzbrd0;
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzbM)).booleanValue()) {
            try {
                zzbrd0 = this.zzb.zzb(s);
                return zzbrd0 == null ? null : new zzecz(zzbrd0, new zzees(), s);
            }
            catch(RemoteException remoteException0) {
                zzo.zzh("Coundn\'t create RTB adapter: ", remoteException0);
                return null;
            }
        }
        zzbrd0 = this.zza.zza(s);
        return zzbrd0 == null ? null : new zzecz(zzbrd0, new zzees(), s);
    }
}

