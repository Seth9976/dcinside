package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

final class zzcop extends zzcom {
    private final Context zzc;
    private final View zzd;
    @Nullable
    private final zzcex zze;
    private final zzfbp zzf;
    private final zzcqx zzg;
    private final zzdiq zzh;
    private final zzddu zzi;
    private final zzhel zzj;
    private final Executor zzk;
    private zzs zzl;

    zzcop(zzcqy zzcqy0, Context context0, zzfbp zzfbp0, View view0, @Nullable zzcex zzcex0, zzcqx zzcqx0, zzdiq zzdiq0, zzddu zzddu0, zzhel zzhel0, Executor executor0) {
        super(zzcqy0);
        this.zzc = context0;
        this.zzd = view0;
        this.zze = zzcex0;
        this.zzf = zzfbp0;
        this.zzg = zzcqx0;
        this.zzh = zzdiq0;
        this.zzi = zzddu0;
        this.zzj = zzhel0;
        this.zzk = executor0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcom
    public final int zza() {
        return this.zza.zzb.zzb.zzd;
    }

    // 去混淆评级： 低(30)
    @Override  // com.google.android.gms.internal.ads.zzcom
    public final int zzc() {
        return !((Boolean)zzbe.zzc().zza(zzbcl.zzhJ)).booleanValue() || !this.zzb.zzag || ((Boolean)zzbe.zzc().zza(zzbcl.zzhK)).booleanValue() ? this.zza.zzb.zzb.zzc : 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcom
    public final View zzd() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzcom
    @Nullable
    public final zzeb zze() {
        try {
            return this.zzg.zza();
        }
        catch(zzfcq unused_ex) {
            return null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcom
    public final zzfbp zzf() {
        zzs zzs0 = this.zzl;
        if(zzs0 != null) {
            return zzfcp.zzb(zzs0);
        }
        zzfbo zzfbo0 = this.zzb;
        if(zzfbo0.zzac) {
            for(Object object0: zzfbo0.zza) {
                if(((String)object0) != null && ((String)object0).contains("FirstParty")) {
                    return (zzfbp)this.zzb.zzr.get(0);
                }
                if(false) {
                    break;
                }
            }
            return new zzfbp(this.zzd.getWidth(), this.zzd.getHeight(), false);
        }
        return (zzfbp)this.zzb.zzr.get(0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcom
    public final zzfbp zzg() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.internal.ads.zzcom
    public final void zzh() {
        this.zzi.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzcom
    public final void zzi(ViewGroup viewGroup0, zzs zzs0) {
        if(viewGroup0 != null) {
            zzcex zzcex0 = this.zze;
            if(zzcex0 != null) {
                zzcex0.zzaj(zzcgr.zzc(zzs0));
                viewGroup0.setMinimumHeight(zzs0.zzc);
                viewGroup0.setMinimumWidth(zzs0.zzf);
                this.zzl = zzs0;
            }
        }
    }

    // 检测为 Lambda 实现
    public static void zzj(zzcop zzcop0) [...]

    @Override  // com.google.android.gms.internal.ads.zzcqz
    public final void zzk() {
        zzcoo zzcoo0 = () -> {
            zzbhh zzbhh0 = this.zzh.zze();
            if(zzbhh0 == null) {
                return;
            }
            try {
                zzbhh0.zze(((zzby)this.zzj.zzb()), ObjectWrapper.wrap(this.zzc));
            }
            catch(RemoteException remoteException0) {
                zzo.zzh("RemoteException when notifyAdLoad is called", remoteException0);
            }
        };
        this.zzk.execute(zzcoo0);
        super.zzk();
    }
}

