package com.google.android.gms.internal.ads;

import android.text.Layout.Alignment;
import androidx.annotation.Nullable;

final class zzali {
    @Nullable
    private String zza;
    private int zzb;
    private boolean zzc;
    private int zzd;
    private boolean zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private float zzk;
    @Nullable
    private String zzl;
    private int zzm;
    private int zzn;
    @Nullable
    private Layout.Alignment zzo;
    @Nullable
    private Layout.Alignment zzp;
    private int zzq;
    @Nullable
    private zzalb zzr;
    private float zzs;

    public zzali() {
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = -1;
        this.zzi = -1;
        this.zzj = -1;
        this.zzm = -1;
        this.zzn = -1;
        this.zzq = -1;
        this.zzs = 3.402823E+38f;
    }

    public final zzali zzA(boolean z) {
        this.zzq = z;
        return this;
    }

    public final zzali zzB(@Nullable zzalb zzalb0) {
        this.zzr = zzalb0;
        return this;
    }

    public final zzali zzC(boolean z) {
        this.zzg = z;
        return this;
    }

    @Nullable
    public final String zzD() {
        return this.zza;
    }

    @Nullable
    public final String zzE() {
        return this.zzl;
    }

    public final boolean zzF() {
        return this.zzq == 1;
    }

    public final boolean zzG() {
        return this.zze;
    }

    public final boolean zzH() {
        return this.zzc;
    }

    public final boolean zzI() {
        return this.zzf == 1;
    }

    public final boolean zzJ() {
        return this.zzg == 1;
    }

    public final float zza() {
        return this.zzk;
    }

    public final float zzb() {
        return this.zzs;
    }

    public final int zzc() {
        if(!this.zze) {
            throw new IllegalStateException("Background color has not been defined.");
        }
        return this.zzd;
    }

    public final int zzd() {
        if(!this.zzc) {
            throw new IllegalStateException("Font color has not been defined.");
        }
        return this.zzb;
    }

    public final int zze() {
        return this.zzj;
    }

    public final int zzf() {
        return this.zzn;
    }

    public final int zzg() {
        return this.zzm;
    }

    public final int zzh() {
        int v = 0;
        int v1 = this.zzh;
        if(v1 == -1 && this.zzi == -1) {
            return -1;
        }
        if(this.zzi == 1) {
            v = 2;
        }
        return (v1 == 1 ? 1 : 0) | v;
    }

    @Nullable
    public final Layout.Alignment zzi() {
        return this.zzp;
    }

    @Nullable
    public final Layout.Alignment zzj() {
        return this.zzo;
    }

    @Nullable
    public final zzalb zzk() {
        return this.zzr;
    }

    public final zzali zzl(@Nullable zzali zzali0) {
        if(zzali0 != null) {
            if(!this.zzc && zzali0.zzc) {
                this.zzo(zzali0.zzb);
            }
            if(this.zzh == -1) {
                this.zzh = zzali0.zzh;
            }
            if(this.zzi == -1) {
                this.zzi = zzali0.zzi;
            }
            if(this.zza == null) {
                String s = zzali0.zza;
                if(s != null) {
                    this.zza = s;
                }
            }
            if(this.zzf == -1) {
                this.zzf = zzali0.zzf;
            }
            if(this.zzg == -1) {
                this.zzg = zzali0.zzg;
            }
            if(this.zzn == -1) {
                this.zzn = zzali0.zzn;
            }
            if(this.zzo == null) {
                Layout.Alignment layout$Alignment0 = zzali0.zzo;
                if(layout$Alignment0 != null) {
                    this.zzo = layout$Alignment0;
                }
            }
            if(this.zzp == null) {
                Layout.Alignment layout$Alignment1 = zzali0.zzp;
                if(layout$Alignment1 != null) {
                    this.zzp = layout$Alignment1;
                }
            }
            if(this.zzq == -1) {
                this.zzq = zzali0.zzq;
            }
            if(this.zzj == -1) {
                this.zzj = zzali0.zzj;
                this.zzk = zzali0.zzk;
            }
            if(this.zzr == null) {
                this.zzr = zzali0.zzr;
            }
            if(this.zzs == 3.402823E+38f) {
                this.zzs = zzali0.zzs;
            }
            if(!this.zze && zzali0.zze) {
                this.zzm(zzali0.zzd);
            }
            if(this.zzm == -1) {
                int v = zzali0.zzm;
                if(v != -1) {
                    this.zzm = v;
                }
            }
        }
        return this;
    }

    public final zzali zzm(int v) {
        this.zzd = v;
        this.zze = true;
        return this;
    }

    public final zzali zzn(boolean z) {
        this.zzh = z;
        return this;
    }

    public final zzali zzo(int v) {
        this.zzb = v;
        this.zzc = true;
        return this;
    }

    public final zzali zzp(@Nullable String s) {
        this.zza = s;
        return this;
    }

    public final zzali zzq(float f) {
        this.zzk = f;
        return this;
    }

    public final zzali zzr(int v) {
        this.zzj = v;
        return this;
    }

    public final zzali zzs(@Nullable String s) {
        this.zzl = s;
        return this;
    }

    public final zzali zzt(boolean z) {
        this.zzi = z;
        return this;
    }

    public final zzali zzu(boolean z) {
        this.zzf = z;
        return this;
    }

    public final zzali zzv(@Nullable Layout.Alignment layout$Alignment0) {
        this.zzp = layout$Alignment0;
        return this;
    }

    public final zzali zzw(int v) {
        this.zzn = v;
        return this;
    }

    public final zzali zzx(int v) {
        this.zzm = v;
        return this;
    }

    public final zzali zzy(float f) {
        this.zzs = f;
        return this;
    }

    public final zzali zzz(@Nullable Layout.Alignment layout$Alignment0) {
        this.zzo = layout$Alignment0;
        return this;
    }
}

