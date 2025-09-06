package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

public final class zzfch {
    private zzm zza;
    private zzs zzb;
    private String zzc;
    @Nullable
    private zzga zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    @Nullable
    private zzbfl zzh;
    private zzy zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;
    @Nullable
    private zzcm zzl;
    private int zzm;
    @Nullable
    private zzblz zzn;
    private final zzfbu zzo;
    private boolean zzp;
    private boolean zzq;
    @Nullable
    private zzekn zzr;
    private boolean zzs;
    private Bundle zzt;
    @Nullable
    private zzcq zzu;

    public zzfch() {
        this.zzm = 1;
        this.zzo = new zzfbu();
        this.zzp = false;
        this.zzq = false;
        this.zzs = false;
    }

    public final zzfch zzA(Bundle bundle0) {
        this.zzt = bundle0;
        return this;
    }

    public final zzfch zzB(boolean z) {
        this.zze = z;
        return this;
    }

    public final zzfch zzC(int v) {
        this.zzm = v;
        return this;
    }

    public final zzfch zzD(@Nullable zzbfl zzbfl0) {
        this.zzh = zzbfl0;
        return this;
    }

    public final zzfch zzE(ArrayList arrayList0) {
        this.zzf = arrayList0;
        return this;
    }

    public final zzfch zzF(ArrayList arrayList0) {
        this.zzg = arrayList0;
        return this;
    }

    public final zzfch zzG(PublisherAdViewOptions publisherAdViewOptions0) {
        this.zzk = publisherAdViewOptions0;
        if(publisherAdViewOptions0 != null) {
            this.zze = publisherAdViewOptions0.zzc();
            this.zzl = publisherAdViewOptions0.zza();
        }
        return this;
    }

    public final zzfch zzH(zzm zzm0) {
        this.zza = zzm0;
        return this;
    }

    public final zzfch zzI(@Nullable zzga zzga0) {
        this.zzd = zzga0;
        return this;
    }

    public final zzfcj zzJ() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzfcj(this, null);
    }

    public final String zzL() {
        return this.zzc;
    }

    public final boolean zzS() {
        return this.zzp;
    }

    public final boolean zzT() {
        return this.zzq;
    }

    public final zzfch zzV(@Nullable zzcq zzcq0) {
        this.zzu = zzcq0;
        return this;
    }

    public final zzm zzf() {
        return this.zza;
    }

    public final zzs zzh() {
        return this.zzb;
    }

    public final zzfbu zzp() {
        return this.zzo;
    }

    public final zzfch zzq(zzfcj zzfcj0) {
        this.zzo.zza(zzfcj0.zzo.zza);
        this.zza = zzfcj0.zzd;
        this.zzb = zzfcj0.zze;
        this.zzu = zzfcj0.zzt;
        this.zzc = zzfcj0.zzf;
        this.zzd = zzfcj0.zza;
        this.zzf = zzfcj0.zzg;
        this.zzg = zzfcj0.zzh;
        this.zzh = zzfcj0.zzi;
        this.zzi = zzfcj0.zzj;
        this.zzr(zzfcj0.zzl);
        this.zzG(zzfcj0.zzm);
        this.zzp = zzfcj0.zzp;
        this.zzq = zzfcj0.zzq;
        this.zzr = zzfcj0.zzc;
        this.zzs = zzfcj0.zzr;
        this.zzt = zzfcj0.zzs;
        return this;
    }

    public final zzfch zzr(AdManagerAdViewOptions adManagerAdViewOptions0) {
        this.zzj = adManagerAdViewOptions0;
        if(adManagerAdViewOptions0 != null) {
            this.zze = adManagerAdViewOptions0.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfch zzs(zzs zzs0) {
        this.zzb = zzs0;
        return this;
    }

    public final zzfch zzt(String s) {
        this.zzc = s;
        return this;
    }

    public final zzfch zzu(zzy zzy0) {
        this.zzi = zzy0;
        return this;
    }

    public final zzfch zzv(@Nullable zzekn zzekn0) {
        this.zzr = zzekn0;
        return this;
    }

    public final zzfch zzw(@Nullable zzblz zzblz0) {
        this.zzn = zzblz0;
        this.zzd = new zzga(false, true, false);
        return this;
    }

    public final zzfch zzx(boolean z) {
        this.zzp = z;
        return this;
    }

    public final zzfch zzy(boolean z) {
        this.zzq = z;
        return this;
    }

    public final zzfch zzz(boolean z) {
        this.zzs = true;
        return this;
    }
}

