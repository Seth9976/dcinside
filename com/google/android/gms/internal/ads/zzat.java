package com.google.android.gms.internal.ads;

import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import j..util.Objects;

public final class zzat {
    @Nullable
    private CharSequence zza;
    @Nullable
    private CharSequence zzb;
    @Nullable
    private CharSequence zzc;
    @Nullable
    private CharSequence zzd;
    @Nullable
    private CharSequence zze;
    @Nullable
    private byte[] zzf;
    @Nullable
    private Integer zzg;
    @Nullable
    private Integer zzh;
    @Nullable
    private Integer zzi;
    @Nullable
    private Integer zzj;
    @Nullable
    private Boolean zzk;
    @Nullable
    private Integer zzl;
    @Nullable
    private Integer zzm;
    @Nullable
    private Integer zzn;
    @Nullable
    private Integer zzo;
    @Nullable
    private Integer zzp;
    @Nullable
    private Integer zzq;
    @Nullable
    private CharSequence zzr;
    @Nullable
    private CharSequence zzs;
    @Nullable
    private CharSequence zzt;
    @Nullable
    private CharSequence zzu;
    @Nullable
    private CharSequence zzv;
    @Nullable
    private Integer zzw;
    private final zzfxn zzx;

    public zzat() {
        this.zzx = zzfxn.zzn();
    }

    zzat(zzav zzav0, zzau zzau0) {
        this.zza = zzav0.zzb;
        this.zzb = zzav0.zzc;
        this.zzc = zzav0.zzd;
        this.zzd = zzav0.zze;
        this.zze = zzav0.zzf;
        this.zzf = zzav0.zzg;
        this.zzg = zzav0.zzh;
        this.zzh = zzav0.zzi;
        this.zzi = zzav0.zzj;
        this.zzj = zzav0.zzk;
        this.zzk = zzav0.zzl;
        this.zzl = zzav0.zzn;
        this.zzm = zzav0.zzo;
        this.zzn = zzav0.zzp;
        this.zzo = zzav0.zzq;
        this.zzp = zzav0.zzr;
        this.zzq = zzav0.zzs;
        this.zzr = zzav0.zzt;
        this.zzs = zzav0.zzu;
        this.zzt = zzav0.zzv;
        this.zzu = zzav0.zzw;
        this.zzv = zzav0.zzx;
        this.zzw = zzav0.zzy;
        this.zzx = zzav0.zzz;
    }

    public final zzat zza(byte[] arr_b, int v) {
        if(this.zzf == null || v.equals(3) || !Objects.equals(this.zzg, 3)) {
            this.zzf = (byte[])arr_b.clone();
            this.zzg = v;
        }
        return this;
    }

    public final zzat zzb(@Nullable zzav zzav0) {
        if(zzav0 != null) {
            CharSequence charSequence0 = zzav0.zzb;
            if(charSequence0 != null) {
                this.zza = charSequence0;
            }
            CharSequence charSequence1 = zzav0.zzc;
            if(charSequence1 != null) {
                this.zzb = charSequence1;
            }
            CharSequence charSequence2 = zzav0.zzd;
            if(charSequence2 != null) {
                this.zzc = charSequence2;
            }
            CharSequence charSequence3 = zzav0.zze;
            if(charSequence3 != null) {
                this.zzd = charSequence3;
            }
            CharSequence charSequence4 = zzav0.zzf;
            if(charSequence4 != null) {
                this.zze = charSequence4;
            }
            byte[] arr_b = zzav0.zzg;
            if(arr_b != null) {
                this.zzf = (byte[])arr_b.clone();
                this.zzg = zzav0.zzh;
            }
            Integer integer0 = zzav0.zzi;
            if(integer0 != null) {
                this.zzh = integer0;
            }
            Integer integer1 = zzav0.zzj;
            if(integer1 != null) {
                this.zzi = integer1;
            }
            Integer integer2 = zzav0.zzk;
            if(integer2 != null) {
                this.zzj = integer2;
            }
            Boolean boolean0 = zzav0.zzl;
            if(boolean0 != null) {
                this.zzk = boolean0;
            }
            Integer integer3 = zzav0.zzm;
            if(integer3 != null) {
                this.zzl = integer3;
            }
            Integer integer4 = zzav0.zzn;
            if(integer4 != null) {
                this.zzl = integer4;
            }
            Integer integer5 = zzav0.zzo;
            if(integer5 != null) {
                this.zzm = integer5;
            }
            Integer integer6 = zzav0.zzp;
            if(integer6 != null) {
                this.zzn = integer6;
            }
            Integer integer7 = zzav0.zzq;
            if(integer7 != null) {
                this.zzo = integer7;
            }
            Integer integer8 = zzav0.zzr;
            if(integer8 != null) {
                this.zzp = integer8;
            }
            Integer integer9 = zzav0.zzs;
            if(integer9 != null) {
                this.zzq = integer9;
            }
            CharSequence charSequence5 = zzav0.zzt;
            if(charSequence5 != null) {
                this.zzr = charSequence5;
            }
            CharSequence charSequence6 = zzav0.zzu;
            if(charSequence6 != null) {
                this.zzs = charSequence6;
            }
            CharSequence charSequence7 = zzav0.zzv;
            if(charSequence7 != null) {
                this.zzt = charSequence7;
            }
            CharSequence charSequence8 = zzav0.zzw;
            if(charSequence8 != null) {
                this.zzu = charSequence8;
            }
            CharSequence charSequence9 = zzav0.zzx;
            if(charSequence9 != null) {
                this.zzv = charSequence9;
            }
            Integer integer10 = zzav0.zzy;
            if(integer10 != null) {
                this.zzw = integer10;
            }
        }
        return this;
    }

    public final zzat zzc(@Nullable CharSequence charSequence0) {
        this.zzd = charSequence0;
        return this;
    }

    public final zzat zzd(@Nullable CharSequence charSequence0) {
        this.zzc = charSequence0;
        return this;
    }

    public final zzat zze(@Nullable CharSequence charSequence0) {
        this.zzb = charSequence0;
        return this;
    }

    public final zzat zzf(@Nullable CharSequence charSequence0) {
        this.zzs = charSequence0;
        return this;
    }

    public final zzat zzg(@Nullable CharSequence charSequence0) {
        this.zzt = charSequence0;
        return this;
    }

    public final zzat zzh(@Nullable CharSequence charSequence0) {
        this.zze = charSequence0;
        return this;
    }

    public final zzat zzi(@Nullable CharSequence charSequence0) {
        this.zzu = charSequence0;
        return this;
    }

    public final zzat zzj(@IntRange(from = 1L, to = 0x1FL) @Nullable Integer integer0) {
        this.zzn = integer0;
        return this;
    }

    public final zzat zzk(@IntRange(from = 1L, to = 12L) @Nullable Integer integer0) {
        this.zzm = integer0;
        return this;
    }

    public final zzat zzl(@Nullable Integer integer0) {
        this.zzl = integer0;
        return this;
    }

    public final zzat zzm(@IntRange(from = 1L, to = 0x1FL) @Nullable Integer integer0) {
        this.zzq = integer0;
        return this;
    }

    public final zzat zzn(@IntRange(from = 1L, to = 12L) @Nullable Integer integer0) {
        this.zzp = integer0;
        return this;
    }

    public final zzat zzo(@Nullable Integer integer0) {
        this.zzo = integer0;
        return this;
    }

    public final zzat zzp(@Nullable CharSequence charSequence0) {
        this.zzv = charSequence0;
        return this;
    }

    public final zzat zzq(@Nullable CharSequence charSequence0) {
        this.zza = charSequence0;
        return this;
    }

    public final zzat zzr(@Nullable Integer integer0) {
        this.zzi = integer0;
        return this;
    }

    public final zzat zzs(@Nullable Integer integer0) {
        this.zzh = integer0;
        return this;
    }

    public final zzat zzt(@Nullable CharSequence charSequence0) {
        this.zzr = charSequence0;
        return this;
    }

    public final zzav zzu() {
        return new zzav(this, null);
    }
}

