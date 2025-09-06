package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import java.util.Locale;
import java.util.regex.Pattern;

public final class zzdra implements zza, zzcvx, zzcwn, zzdan {
    private final Context zza;
    private final zzfdb zzb;
    private final zzdrw zzc;
    private final zzfca zzd;
    private final zzfbo zze;
    private final zzebk zzf;
    private final String zzg;
    @Nullable
    private Boolean zzh;
    private final boolean zzi;

    public zzdra(Context context0, zzfdb zzfdb0, zzdrw zzdrw0, zzfca zzfca0, zzfbo zzfbo0, zzebk zzebk0, String s) {
        this.zza = context0;
        this.zzb = zzfdb0;
        this.zzc = zzdrw0;
        this.zzd = zzfca0;
        this.zze = zzfbo0;
        this.zzf = zzebk0;
        this.zzi = ((Boolean)zzbe.zzc().zza(zzbcl.zzgF)).booleanValue();
        this.zzg = s;
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if(!this.zze.zzb()) {
            return;
        }
        this.zze(this.zzd("click"));
    }

    @Override  // com.google.android.gms.internal.ads.zzcvx
    public final void zza(zze zze0) {
        if(!this.zzi) {
            return;
        }
        zzdrv zzdrv0 = this.zzd("ifts");
        zzdrv0.zzb("reason", "adapter");
        int v = zze0.zza;
        String s = zze0.zzb;
        if(zze0.zzc.equals("com.google.android.gms.ads") && (zze0.zzd != null && !zze0.zzd.zzc.equals("com.google.android.gms.ads"))) {
            v = zze0.zzd.zza;
            s = zze0.zzd.zzb;
        }
        if(v >= 0) {
            zzdrv0.zzb("arec", String.valueOf(v));
        }
        String s1 = this.zzb.zza(s);
        if(s1 != null) {
            zzdrv0.zzb("areec", s1);
        }
        zzdrv0.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzcvx
    public final void zzb() {
        if(!this.zzi) {
            return;
        }
        zzdrv zzdrv0 = this.zzd("ifts");
        zzdrv0.zzb("reason", "blocked");
        zzdrv0.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzcvx
    public final void zzc(zzdgb zzdgb0) {
        if(!this.zzi) {
            return;
        }
        zzdrv zzdrv0 = this.zzd("ifts");
        zzdrv0.zzb("reason", "exception");
        if(!TextUtils.isEmpty(zzdgb0.getMessage())) {
            zzdrv0.zzb("msg", zzdgb0.getMessage());
        }
        zzdrv0.zzg();
    }

    private final zzdrv zzd(String s) {
        zzdrv zzdrv0 = this.zzc.zza();
        zzdrv0.zzd(this.zzd.zzb.zzb);
        zzdrv0.zzc(this.zze);
        zzdrv0.zzb("action", s);
        zzdrv0.zzb("ad_format", this.zzg.toUpperCase(Locale.ROOT));
        boolean z = false;
        if(!this.zze.zzt.isEmpty()) {
            zzdrv0.zzb("ancn", ((String)this.zze.zzt.get(0)));
        }
        if(this.zze.zzb()) {
            zzdrv0.zzb("device_connectivity", (zzv.zzp().zzA(this.zza) ? "online" : "offline"));
            zzdrv0.zzb("event_timestamp", String.valueOf(zzv.zzC().currentTimeMillis()));
            zzdrv0.zzb("offline_ad", "1");
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzgM)).booleanValue()) {
            if(zzaa.zzf(this.zzd.zza.zza) != 1) {
                z = true;
            }
            zzdrv0.zzb("scar", String.valueOf(z));
            if(z) {
                zzm zzm0 = this.zzd.zza.zza.zzd;
                zzdrv0.zzb("ragent", zzm0.zzp);
                zzdrv0.zzb("rtype", zzaa.zzb(zzaa.zzc(zzm0)));
            }
        }
        return zzdrv0;
    }

    private final void zze(zzdrv zzdrv0) {
        if(this.zze.zzb()) {
            String s = zzdrv0.zze();
            zzebm zzebm0 = new zzebm(zzv.zzC().currentTimeMillis(), this.zzd.zzb.zzb.zzb, s, 2);
            this.zzf.zzd(zzebm0);
            return;
        }
        zzdrv0.zzg();
    }

    private final boolean zzf() {
        boolean z;
        String s1;
        if(this.zzh == null) {
            synchronized(this) {
                if(this.zzh == null) {
                    String s = (String)zzbe.zzc().zza(zzbcl.zzbB);
                    try {
                        s1 = null;
                        s1 = zzs.zzq(this.zza);
                        z = false;
                    }
                    catch(RemoteException unused_ex) {
                    }
                    if(s != null && s1 != null) {
                        try {
                            z = Pattern.matches(s, s1);
                        }
                        catch(RuntimeException runtimeException0) {
                            zzv.zzp().zzw(runtimeException0, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzh = Boolean.valueOf(z);
                }
            }
        }
        return this.zzh.booleanValue();
    }

    @Override  // com.google.android.gms.internal.ads.zzdan
    public final void zzi() {
        if(!this.zzf()) {
            return;
        }
        this.zzd("adapter_shown").zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzdan
    public final void zzj() {
        if(!this.zzf()) {
            return;
        }
        this.zzd("adapter_impression").zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        if(!this.zzf() && !this.zze.zzb()) {
            return;
        }
        this.zze(this.zzd("impression"));
    }
}

