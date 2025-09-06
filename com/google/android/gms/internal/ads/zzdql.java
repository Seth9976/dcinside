package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import o3.h;

public final class zzdql implements zza, zzcvw, zzcwn, zzcxh, zzcyq, zzdbc {
    private final zzbbj zza;
    private boolean zzb;

    public zzdql(zzbbj zzbbj0, @h zzezj zzezj0) {
        this.zzb = false;
        this.zza = zzbbj0;
        zzbbj0.zzc(2);
        if(zzezj0 != null) {
            zzbbj0.zzc(1101);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        synchronized(this) {
            if(!this.zzb) {
                this.zza.zzc(7);
                this.zzb = true;
                return;
            }
            this.zza.zzc(8);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(zzbvk zzbvk0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(zzfca zzfca0) {
        zzdqh zzdqh0 = new zzdqh(zzfca0);
        this.zza.zzb(zzdqh0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcvw
    public final void zzdz(zze zze0) {
        switch(zze0.zza) {
            case 1: {
                this.zza.zzc(101);
                return;
            }
            case 2: {
                this.zza.zzc(102);
                return;
            }
            case 3: {
                this.zza.zzc(5);
                return;
            }
            case 4: {
                this.zza.zzc(103);
                return;
            }
            case 5: {
                this.zza.zzc(104);
                return;
            }
            case 6: {
                this.zza.zzc(105);
                return;
            }
            case 7: {
                this.zza.zzc(106);
                return;
            }
            default: {
                this.zza.zzc(4);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdbc
    public final void zzh() {
        this.zza.zzc(1109);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbc
    public final void zzi(zzbbq.zzb zzbbq$zzb0) {
        zzdqk zzdqk0 = new zzdqk(zzbbq$zzb0);
        this.zza.zzb(zzdqk0);
        this.zza.zzc(0x44F);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbc
    public final void zzj(zzbbq.zzb zzbbq$zzb0) {
        zzdqi zzdqi0 = new zzdqi(zzbbq$zzb0);
        this.zza.zzb(zzdqi0);
        this.zza.zzc(1102);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbc
    public final void zzl(boolean z) {
        this.zza.zzc((z ? 1107 : 1108));
    }

    @Override  // com.google.android.gms.internal.ads.zzdbc
    public final void zzm(zzbbq.zzb zzbbq$zzb0) {
        zzdqj zzdqj0 = new zzdqj(zzbbq$zzb0);
        this.zza.zzb(zzdqj0);
        this.zza.zzc(0x450);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbc
    public final void zzn(boolean z) {
        this.zza.zzc((z ? 1105 : 1106));
    }

    @Override  // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        synchronized(this) {
            this.zza.zzc(6);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        this.zza.zzc(3);
    }
}

