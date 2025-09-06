package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.ExecutionException;

public final class zzeeh implements zzedc {
    private final Context zza;
    private final zzcpq zzb;
    private View zzc;
    private zzbpn zzd;

    public zzeeh(Context context0, zzcpq zzcpq0) {
        this.zza = context0;
        this.zzb = zzcpq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedc
    public final Object zza(zzfca zzfca0, zzfbo zzfbo0, zzecz zzecz0) throws zzfcq, zzegu {
        View view0;
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzhJ)).booleanValue() || !zzfbo0.zzag) {
            view0 = this.zzc;
        }
        else {
            try {
                view0 = (View)ObjectWrapper.unwrap(this.zzd.zze());
                boolean z = this.zzd.zzf();
            }
            catch(RemoteException remoteException0) {
                throw new zzfcq(remoteException0);
            }
            if(view0 == null) {
                throw new zzfcq(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
            }
            if(z) {
                t0 t00 = zzgch.zzn(zzgch.zzh(null), (Object object0) -> zzgch.zzh(zzcql.zza(this.zza, view0, zzfbo0)), zzbzw.zzf);
                try {
                    view0 = (View)t00.get();
                    goto label_15;
                }
                catch(InterruptedException | ExecutionException interruptedException0) {
                    throw new zzfcq(interruptedException0);
                }
                throw new zzfcq(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
            }
        }
    label_15:
        zzcrp zzcrp0 = new zzcrp(zzfca0, zzfbo0, zzecz0.zza);
        zzcot zzcot0 = new zzcot(view0, null, new zzeed(zzecz0), ((zzfbp)zzfbo0.zzu.get(0)));
        zzcon zzcon0 = this.zzb.zza(zzcrp0, zzcot0);
        zzcon0.zzg().zza(view0);
        zzeie zzeie0 = zzcon0.zzj();
        ((zzees)zzecz0.zzc).zzc(zzeie0);
        return zzcon0.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzedc
    public final void zzb(zzfca zzfca0, zzfbo zzfbo0, zzecz zzecz0) throws zzfcq {
        try {
            ((zzbrd)zzecz0.zzb).zzq(zzfbo0.zzZ);
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzhJ)).booleanValue() && zzfbo0.zzag) {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
                zzeef zzeef0 = new zzeef(this, zzecz0, null);
                ((zzbrd)zzecz0.zzb).zzk(zzfbo0.zzU, zzfbo0.zzv.toString(), zzfca0.zza.zza.zzd, iObjectWrapper0, zzeef0, ((zzbpk)zzecz0.zzc), zzfca0.zza.zza.zze);
                return;
            }
            IObjectWrapper iObjectWrapper1 = ObjectWrapper.wrap(this.zza);
            zzeef zzeef1 = new zzeef(this, zzecz0, null);
            ((zzbrd)zzecz0.zzb).zzj(zzfbo0.zzU, zzfbo0.zzv.toString(), zzfca0.zza.zza.zzd, iObjectWrapper1, zzeef1, ((zzbpk)zzecz0.zzc), zzfca0.zza.zza.zze);
            return;
        }
        catch(RemoteException remoteException0) {
        }
        throw new zzfcq(remoteException0);
    }

    // 检测为 Lambda 实现
    final t0 zzc(View view0, zzfbo zzfbo0, Object object0) throws Exception [...]
}

