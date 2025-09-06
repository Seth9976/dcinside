package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions.Builder;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.client.zzy;
import java.util.ArrayList;

public final class zzfcj {
    @Nullable
    public final zzga zza;
    @Nullable
    public final zzblz zzb;
    @Nullable
    public final zzekn zzc;
    public final zzm zzd;
    public final zzs zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    @Nullable
    public final zzbfl zzi;
    public final zzy zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    @Nullable
    public final zzcm zzn;
    public final zzfbw zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final Bundle zzs;
    @Nullable
    public final zzcq zzt;

    zzfcj(zzfch zzfch0, zzfci zzfci0) {
        zzbfl zzbfl0;
        zzga zzga0;
        this.zze = zzfch0.zzb;
        this.zzf = zzfch0.zzc;
        this.zzt = zzfch0.zzu;
        int v = com.google.android.gms.ads.internal.util.zzs.zza(zzfch0.zza.zzw);
        this.zzd = new zzm(zzfch0.zza.zza, zzfch0.zza.zzb, zzfch0.zza.zzc, zzfch0.zza.zzd, zzfch0.zza.zze, zzfch0.zza.zzf, zzfch0.zza.zzg, zzfch0.zza.zzh || zzfch0.zze, zzfch0.zza.zzi, zzfch0.zza.zzj, zzfch0.zza.zzk, zzfch0.zza.zzl, zzfch0.zza.zzm, zzfch0.zza.zzn, zzfch0.zza.zzo, zzfch0.zza.zzp, zzfch0.zza.zzq, zzfch0.zza.zzr, zzfch0.zza.zzs, zzfch0.zza.zzt, zzfch0.zza.zzu, zzfch0.zza.zzv, v, zzfch0.zza.zzx, zzfch0.zza.zzy, zzfch0.zza.zzz);
        if(zzfch0.zzd == null) {
            zzga0 = zzfch0.zzh == null ? null : zzfch0.zzh.zzf;
        }
        else {
            zzga0 = zzfch0.zzd;
        }
        this.zza = zzga0;
        this.zzg = zzfch0.zzf;
        this.zzh = zzfch0.zzg;
        if(zzfch0.zzf == null) {
            zzbfl0 = null;
        }
        else {
            zzbfl0 = zzfch0.zzh == null ? new zzbfl(new Builder().build()) : zzfch0.zzh;
        }
        this.zzi = zzbfl0;
        this.zzj = zzfch0.zzi;
        this.zzk = zzfch0.zzm;
        this.zzl = zzfch0.zzj;
        this.zzm = zzfch0.zzk;
        this.zzn = zzfch0.zzl;
        this.zzb = zzfch0.zzn;
        this.zzo = new zzfbw(zzfch0.zzo, null);
        this.zzp = zzfch0.zzp;
        this.zzq = zzfch0.zzq;
        this.zzc = zzfch0.zzr;
        this.zzr = zzfch0.zzs;
        this.zzs = zzfch0.zzt;
    }

    @Nullable
    public final zzbhn zza() {
        PublisherAdViewOptions publisherAdViewOptions0 = this.zzm;
        if(publisherAdViewOptions0 == null && this.zzl == null) {
            return null;
        }
        return publisherAdViewOptions0 == null ? this.zzl.zza() : publisherAdViewOptions0.zzb();
    }

    public final boolean zzb() {
        String s = (String)zzbe.zzc().zza(zzbcl.zzdn);
        return this.zzf.matches(s);
    }
}

