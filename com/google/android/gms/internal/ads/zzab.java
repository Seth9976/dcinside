package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import j..util.Objects;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class zzab {
    @Nullable
    public final byte[] zzA;
    public final int zzB;
    @Nullable
    public final zzk zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    public final int zzG;
    public final int zzH;
    public final int zzI;
    public final int zzJ;
    public final int zzK;
    public static final int zzL;
    private int zzM;
    @Nullable
    public final String zza;
    @Nullable
    public final String zzb;
    public final List zzc;
    @Nullable
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    @Nullable
    public final String zzk;
    @Nullable
    public final zzay zzl;
    @Nullable
    public final Object zzm;
    @Nullable
    public final String zzn;
    @Nullable
    public final String zzo;
    public final int zzp;
    public final int zzq;
    public final List zzr;
    @Nullable
    public final zzu zzs;
    public final long zzt;
    public final boolean zzu;
    public final int zzv;
    public final int zzw;
    public final float zzx;
    public final int zzy;
    public final float zzz;

    static {
        new zzab(new zzz());
    }

    private zzab(zzz zzz0) {
        String s1;
        boolean z;
        this.zza = zzz0.zza;
        String s = zzei.zzE(zzz0.zzd);
        this.zzd = s;
        int v = 0;
        if(zzz0.zzc.isEmpty() && zzz0.zzb != null) {
            this.zzc = zzfxn.zzo(new zzad(s, zzz0.zzb));
            this.zzb = zzz0.zzb;
        }
        else if(zzz0.zzc.isEmpty() || zzz0.zzb != null) {
            if(!zzz0.zzc.isEmpty() || zzz0.zzb != null) {
                z = false;
                int v1 = 0;
                while(v1 < zzz0.zzc.size()) {
                    if(((zzad)zzz0.zzc.get(v1)).zzb.equals(zzz0.zzb)) {
                        goto label_30;
                    }
                    ++v1;
                }
            }
            else {
            label_30:
                z = true;
            }
            zzcw.zzf(z);
            this.zzc = zzz0.zzc;
            this.zzb = zzz0.zzb;
        }
        else {
            this.zzc = zzz0.zzc;
            List list0 = zzz0.zzc;
            for(Object object0: list0) {
                zzad zzad0 = (zzad)object0;
                if(!TextUtils.equals(zzad0.zza, s)) {
                    continue;
                }
                s1 = zzad0.zzb;
                goto label_20;
            }
            s1 = ((zzad)list0.get(0)).zzb;
        label_20:
            this.zzb = s1;
        }
        this.zze = zzz0.zze;
        zzcw.zzg(true, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.zzf = zzz0.zzf;
        this.zzg = 0;
        int v2 = zzz0.zzh;
        this.zzh = v2;
        int v3 = zzz0.zzi;
        this.zzi = v3;
        if(v3 != -1) {
            v2 = v3;
        }
        this.zzj = v2;
        this.zzk = zzz0.zzj;
        this.zzl = zzz0.zzk;
        this.zzm = null;
        this.zzn = zzz0.zzl;
        this.zzo = zzz0.zzm;
        this.zzp = zzz0.zzn;
        this.zzq = zzz0.zzo;
        this.zzr = zzz0.zzp == null ? Collections.emptyList() : zzz0.zzp;
        zzu zzu0 = zzz0.zzq;
        this.zzs = zzu0;
        this.zzt = zzz0.zzr;
        this.zzu = zzz0.zzs;
        this.zzv = zzz0.zzt;
        this.zzw = zzz0.zzu;
        this.zzx = zzz0.zzv;
        this.zzy = zzz0.zzw == -1 ? 0 : zzz0.zzw;
        this.zzz = zzz0.zzx == -1.0f ? 1.0f : zzz0.zzx;
        this.zzA = zzz0.zzy;
        this.zzB = zzz0.zzz;
        this.zzC = zzz0.zzA;
        this.zzD = zzz0.zzB;
        this.zzE = zzz0.zzC;
        this.zzF = zzz0.zzD;
        this.zzG = zzz0.zzE == -1 ? 0 : zzz0.zzE;
        if(zzz0.zzF != -1) {
            v = zzz0.zzF;
        }
        this.zzH = v;
        this.zzI = zzz0.zzG;
        this.zzJ = zzz0.zzH;
        if(zzz0.zzI == 0 && zzu0 != null) {
            this.zzK = 1;
            return;
        }
        this.zzK = zzz0.zzI;
    }

    zzab(zzz zzz0, zzaa zzaa0) {
        this(zzz0);
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(zzab.class == class0) {
                zzab zzab0 = (zzab)object0;
                return this.zzM == 0 || (zzab0.zzM == 0 || this.zzM == zzab0.zzM) ? this.zze == zzab0.zze && this.zzf == zzab0.zzf && this.zzh == zzab0.zzh && this.zzi == zzab0.zzi && this.zzp == zzab0.zzp && this.zzt == zzab0.zzt && this.zzv == zzab0.zzv && this.zzw == zzab0.zzw && this.zzy == zzab0.zzy && this.zzB == zzab0.zzB && this.zzD == zzab0.zzD && this.zzE == zzab0.zzE && this.zzF == zzab0.zzF && this.zzG == zzab0.zzG && this.zzH == zzab0.zzH && this.zzI == zzab0.zzI && this.zzK == zzab0.zzK && Float.compare(this.zzx, zzab0.zzx) == 0 && Float.compare(this.zzz, zzab0.zzz) == 0 && Objects.equals(this.zza, zzab0.zza) && Objects.equals(this.zzb, zzab0.zzb) && this.zzc.equals(zzab0.zzc) && Objects.equals(this.zzk, zzab0.zzk) && Objects.equals(this.zzn, zzab0.zzn) && Objects.equals(this.zzo, zzab0.zzo) && Objects.equals(this.zzd, zzab0.zzd) && Arrays.equals(this.zzA, zzab0.zzA) && Objects.equals(this.zzl, zzab0.zzl) && Objects.equals(this.zzC, zzab0.zzC) && Objects.equals(this.zzs, zzab0.zzs) && this.zzd(zzab0) : false;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zzM;
        if(v == 0) {
            int v1 = 0;
            int v2 = (((((((((this.zza == null ? 0 : this.zza.hashCode()) + 0x20F) * 0x1F + (this.zzb == null ? 0 : this.zzb.hashCode())) * 0x1F + this.zzc.hashCode()) * 0x1F + (this.zzd == null ? 0 : this.zzd.hashCode())) * 0x1F + this.zze) * 0x1F + this.zzf) * 961 + this.zzh) * 0x1F + this.zzi) * 0x1F;
            int v3 = this.zzk == null ? 0 : this.zzk.hashCode();
            int v4 = this.zzl == null ? 0 : this.zzl.hashCode();
            int v5 = this.zzn == null ? 0 : this.zzn.hashCode();
            String s = this.zzo;
            if(s != null) {
                v1 = s.hashCode();
            }
            v = ((((((((((((((((((((v2 + v3) * 0x1F + v4) * 961 + v5) * 0x1F + v1) * 0x1F + this.zzp) * 0x1F + ((int)this.zzt)) * 0x1F + this.zzv) * 0x1F + this.zzw) * 0x1F + Float.floatToIntBits(this.zzx)) * 0x1F + this.zzy) * 0x1F + Float.floatToIntBits(this.zzz)) * 0x1F + this.zzB) * 0x1F + this.zzD) * 0x1F + this.zzE) * 0x1F + this.zzF) * 0x1F + this.zzG) * 0x1F + this.zzH) * 0x1F + this.zzI) * 0x1F - 1) * 0x1F - 1) * 0x1F + this.zzK;
            this.zzM = v;
        }
        return v;
    }

    @Override
    public final String toString() {
        return "Format(" + this.zza + ", " + this.zzb + ", " + this.zzn + ", " + this.zzo + ", " + this.zzk + ", " + this.zzj + ", " + this.zzd + ", [" + this.zzv + ", " + this.zzw + ", " + this.zzx + ", " + this.zzC + "], [" + this.zzD + ", " + this.zzE + "])";
    }

    public final int zza() {
        int v = this.zzv;
        if(v != -1) {
            return this.zzw == -1 ? -1 : v * this.zzw;
        }
        return -1;
    }

    public final zzz zzb() {
        return new zzz(this, null);
    }

    public final zzab zzc(int v) {
        zzz zzz0 = new zzz(this, null);
        zzz0.zzD(v);
        return new zzab(zzz0);
    }

    public final boolean zzd(zzab zzab0) {
        if(this.zzr.size() == zzab0.zzr.size()) {
            for(int v = 0; v < this.zzr.size(); ++v) {
                if(!Arrays.equals(((byte[])this.zzr.get(v)), ((byte[])zzab0.zzr.get(v)))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}

