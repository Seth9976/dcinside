package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j..util.Objects;
import java.util.Arrays;

public final class zzav {
    public static final zzav zza;
    @Nullable
    public final CharSequence zzb;
    @Nullable
    public final CharSequence zzc;
    @Nullable
    public final CharSequence zzd;
    @Nullable
    public final CharSequence zze;
    @Nullable
    public final CharSequence zzf;
    @Nullable
    public final byte[] zzg;
    @Nullable
    public final Integer zzh;
    @Nullable
    public final Integer zzi;
    @Nullable
    public final Integer zzj;
    @Nullable
    @Deprecated
    public final Integer zzk;
    @Nullable
    public final Boolean zzl;
    @Nullable
    @Deprecated
    public final Integer zzm;
    @Nullable
    public final Integer zzn;
    @Nullable
    public final Integer zzo;
    @Nullable
    public final Integer zzp;
    @Nullable
    public final Integer zzq;
    @Nullable
    public final Integer zzr;
    @Nullable
    public final Integer zzs;
    @Nullable
    public final CharSequence zzt;
    @Nullable
    public final CharSequence zzu;
    @Nullable
    public final CharSequence zzv;
    @Nullable
    public final CharSequence zzw;
    @Nullable
    public final CharSequence zzx;
    @Nullable
    public final Integer zzy;
    public final zzfxn zzz;

    static {
        zzav.zza = new zzav(new zzat());
    }

    private zzav(zzat zzat0) {
        Boolean boolean0 = zzat0.zzk;
        Integer integer0 = zzat0.zzj;
        Integer integer1 = zzat0.zzw;
        boolean z = true;
        int v = 0;
        if(boolean0 == null) {
            if(integer0 == null) {
                integer0 = null;
            }
            else {
                if(((int)integer0) == -1) {
                    z = false;
                }
                boolean0 = Boolean.valueOf(z);
                if(z && integer1 == null) {
                    switch(((int)integer0)) {
                        case 1: {
                            break;
                        }
                        case 2: {
                            v = 21;
                            break;
                        }
                        case 3: {
                            v = 22;
                            break;
                        }
                        case 4: {
                            v = 23;
                            break;
                        }
                        case 5: {
                            v = 24;
                            break;
                        }
                        case 6: {
                            v = 25;
                            break;
                        }
                        default: {
                            v = 20;
                        }
                    }
                    integer1 = v;
                }
            }
        }
        else if(!boolean0.booleanValue()) {
            integer0 = -1;
        }
        else if(integer0 == null || ((int)integer0) == -1) {
            if(integer1 == null) {
                z = false;
            }
            else {
                switch(((int)integer1)) {
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: 
                    case 7: 
                    case 8: 
                    case 9: 
                    case 10: 
                    case 11: 
                    case 12: 
                    case 13: 
                    case 14: 
                    case 15: 
                    case 16: 
                    case 17: 
                    case 18: 
                    case 19: {
                        break;
                    }
                    case 21: {
                        z = false;
                        break;
                    }
                    case 22: {
                        z = true;
                        break;
                    }
                    case 23: {
                        z = false;
                        break;
                    }
                    case 24: {
                        z = true;
                        break;
                    }
                    case 25: {
                        z = false;
                        break;
                    }
                    default: {
                        z = false;
                    }
                }
            }
            integer0 = (int)z;
        }
        this.zzb = zzat0.zza;
        this.zzc = zzat0.zzb;
        this.zzd = zzat0.zzc;
        this.zze = zzat0.zzd;
        this.zzf = zzat0.zze;
        this.zzg = zzat0.zzf;
        this.zzh = zzat0.zzg;
        this.zzi = zzat0.zzh;
        this.zzj = zzat0.zzi;
        this.zzk = integer0;
        this.zzl = boolean0;
        this.zzm = zzat0.zzl;
        this.zzn = zzat0.zzl;
        this.zzo = zzat0.zzm;
        this.zzp = zzat0.zzn;
        this.zzq = zzat0.zzo;
        this.zzr = zzat0.zzp;
        this.zzs = zzat0.zzq;
        this.zzt = zzat0.zzr;
        this.zzu = zzat0.zzs;
        this.zzv = zzat0.zzt;
        this.zzw = zzat0.zzu;
        this.zzx = zzat0.zzv;
        this.zzy = integer1;
        this.zzz = zzat0.zzx;
    }

    zzav(zzat zzat0, zzau zzau0) {
        this(zzat0);
    }

    // 去混淆评级： 低(28)
    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(zzav.class == class0) {
                zzav zzav0 = (zzav)object0;
                return Objects.equals(this.zzb, zzav0.zzb) && Objects.equals(this.zzc, zzav0.zzc) && Objects.equals(this.zzd, zzav0.zzd) && Objects.equals(this.zze, zzav0.zze) && Objects.equals(this.zzf, zzav0.zzf) && Arrays.equals(this.zzg, zzav0.zzg) && Objects.equals(this.zzh, zzav0.zzh) && Objects.equals(this.zzi, zzav0.zzi) && Objects.equals(this.zzj, zzav0.zzj) && Objects.equals(this.zzk, zzav0.zzk) && Objects.equals(this.zzl, zzav0.zzl) && Objects.equals(this.zzn, zzav0.zzn) && Objects.equals(this.zzo, zzav0.zzo) && Objects.equals(this.zzp, zzav0.zzp) && Objects.equals(this.zzq, zzav0.zzq) && Objects.equals(this.zzr, zzav0.zzr) && Objects.equals(this.zzs, zzav0.zzs) && Objects.equals(this.zzt, zzav0.zzt) && Objects.equals(this.zzu, zzav0.zzu) && Objects.equals(this.zzv, zzav0.zzv) && Objects.equals(this.zzw, zzav0.zzw) && Objects.equals(this.zzx, zzav0.zzx) && Objects.equals(this.zzy, zzav0.zzy);
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Arrays.hashCode(this.zzg);
        return Arrays.hashCode(new Object[]{this.zzb, this.zzc, this.zzd, this.zze, null, null, this.zzf, null, null, null, integer0, this.zzh, null, this.zzi, this.zzj, this.zzk, this.zzl, null, this.zzn, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, null, null, this.zzw, null, this.zzx, this.zzy, Boolean.TRUE});
    }

    public final zzat zza() {
        return new zzat(this, null);
    }
}

