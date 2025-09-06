package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri.Builder;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzfr.zzd;
import com.google.android.gms.internal.measurement.zzpu;
import w4.d;

public final class zznu extends zzns {
    zznu(zznv zznv0) {
        super(zznv0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzoo g_() {
        return super.g_();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final Context zza() {
        return super.zza();
    }

    public final zznw zza(String s) {
        if(zzpu.zza() && this.zze().zza(zzbh.zzbx)) {
            this.zzq();
            if(zzos.zzf(s)) {
                this.zzj().zzp().zza("sgtm feature flag enabled.");
                zzg zzg0 = this.zzh().zze(s);
                if(zzg0 == null) {
                    return new zznw(this.zzb(s), zznt.zza);
                }
                String s1 = zzg0.zzad();
                zzd zzfr$zzd0 = this.zzm().zzc(s);
                if(zzfr$zzd0 == null) {
                    return new zznw(this.zzb(s), zznt.zza);
                }
                zzg zzg1 = this.zzh().zze(s);
                if(zzg1 == null) {
                    return new zznw(this.zzb(s), zznt.zza);
                }
                if((!zzfr$zzd0.zzq() || zzfr$zzd0.zzh().zza() != 100) && !this.zzq().zzd(s, zzg1.zzam())) {
                    if(!this.zze().zza(zzbh.zzbz)) {
                        if(!TextUtils.isEmpty(s1) && s1.hashCode() % 100 < zzfr$zzd0.zzh().zza()) {
                            goto label_17;
                        }
                        return new zznw(this.zzb(s), zznt.zza);
                    }
                    else if(TextUtils.isEmpty(s1) || Math.abs(s1.hashCode() % 100) >= zzfr$zzd0.zzh().zza()) {
                        return new zznw(this.zzb(s), zznt.zza);
                    }
                }
            label_17:
                if(zzg0.zzat()) {
                    this.zzj().zzp().zza("sgtm upload enabled in manifest.");
                    zzd zzfr$zzd1 = this.zzm().zzc(zzg0.zzac());
                    boolean z = zzfr$zzd1 == null || !zzfr$zzd1.zzq();
                    return new zznw(this.zzb(s), zznt.zza);
                }
            }
        }
        return new zznw(this.zzb(s), zznt.zza);
    }

    public final String zza(zzg zzg0) {
        Uri.Builder uri$Builder0 = new Uri.Builder();
        String s = zzg0.zzah();
        if(TextUtils.isEmpty(s)) {
            s = zzg0.zzaa();
        }
        uri$Builder0.scheme("https").encodedAuthority("app-measurement.com").path("config/app/" + s).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "106000").appendQueryParameter("runtime_version", "0");
        return uri$Builder0.build().toString();
    }

    private final String zzb(String s) {
        String s1 = this.zzm().zzf(s);
        if(!TextUtils.isEmpty(s1)) {
            Uri uri0 = Uri.parse("https://app-measurement.com/a");
            Uri.Builder uri$Builder0 = uri0.buildUpon();
            uri$Builder0.authority(s1 + "." + uri0.getAuthority());
            return uri$Builder0.build().toString();
        }
        return "https://app-measurement.com/a";
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final Clock zzb() {
        return super.zzb();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final zzab zzd() {
        return super.zzd();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzag zze() {
        return super.zze();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzaz zzf() {
        return super.zzf();
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzt zzg() {
        return super.zzg();
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzal zzh() {
        return super.zzh();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzgh zzi() {
        return super.zzi();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final zzgo zzj() {
        return super.zzj();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzha zzk() {
        return super.zzk();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final zzhv zzl() {
        return super.zzl();
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzhl zzm() {
        return super.zzm();
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzmw zzn() {
        return super.zzn();
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zznu zzo() {
        return super.zzo();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzos zzq() {
        return super.zzq();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    public final void zzr() {
        super.zzr();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    public final void zzs() {
        super.zzs();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    public final void zzt() {
        super.zzt();
    }
}

