package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.ArrayList;

public final class zzejq extends zzbt {
    @VisibleForTesting
    final zzfch zza;
    @VisibleForTesting
    final zzdio zzb;
    private final Context zzc;
    private final zzcgx zzd;
    private zzbl zze;

    public zzejq(zzcgx zzcgx0, Context context0, String s) {
        zzfch zzfch0 = new zzfch();
        this.zza = zzfch0;
        this.zzb = new zzdio();
        this.zzd = zzcgx0;
        zzfch0.zzt(s);
        this.zzc = context0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzbr zze() {
        zzdiq zzdiq0 = this.zzb.zzg();
        ArrayList arrayList0 = zzdiq0.zzi();
        this.zza.zzE(arrayList0);
        ArrayList arrayList1 = zzdiq0.zzh();
        this.zza.zzF(arrayList1);
        zzfch zzfch0 = this.zza;
        if(zzfch0.zzh() == null) {
            zzfch0.zzs(zzs.zzc());
        }
        return new zzejr(this.zzc, this.zzd, this.zza, zzdiq0, this.zze);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzf(zzbgu zzbgu0) {
        this.zzb.zza(zzbgu0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg(zzbgx zzbgx0) {
        this.zzb.zzb(zzbgx0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzh(String s, zzbhd zzbhd0, @Nullable zzbha zzbha0) {
        this.zzb.zzc(s, zzbhd0, zzbha0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(zzbmi zzbmi0) {
        this.zzb.zzd(zzbmi0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzj(zzbhh zzbhh0, zzs zzs0) {
        this.zzb.zze(zzbhh0);
        this.zza.zzs(zzs0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzk(zzbhk zzbhk0) {
        this.zzb.zzf(zzbhk0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl(zzbl zzbl0) {
        this.zze = zzbl0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions0) {
        this.zza.zzr(adManagerAdViewOptions0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzn(zzblz zzblz0) {
        this.zza.zzw(zzblz0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(zzbfl zzbfl0) {
        this.zza.zzD(zzbfl0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions0) {
        this.zza.zzG(publisherAdViewOptions0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzq(zzcq zzcq0) {
        this.zza.zzV(zzcq0);
    }
}

