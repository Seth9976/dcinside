package com.google.android.gms.internal.ads;

public final class zzanl implements zzany {
    private final zzank zza;
    private final zzdy zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzanl(zzank zzank0) {
        this.zza = zzank0;
        this.zzb = new zzdy(0x20);
    }

    @Override  // com.google.android.gms.internal.ads.zzany
    public final void zza(zzdy zzdy0, int v) {
        int v1 = (v & 1) == 0 ? -1 : zzdy0.zzd() + zzdy0.zzm();
        if(!this.zzf) {
        label_6:
            while(zzdy0.zzb() > 0) {
                int v2 = this.zzd;
                if(v2 < 3) {
                    if(v2 == 0) {
                        int v3 = zzdy0.zzm();
                        zzdy0.zzL(zzdy0.zzd() - 1);
                        if(v3 != 0xFF) {
                            goto label_13;
                        }
                        this.zzf = true;
                        return;
                    }
                label_13:
                    int v4 = Math.min(zzdy0.zzb(), 3 - this.zzd);
                    zzdy0.zzH(this.zzb.zzN(), this.zzd, v4);
                    int v5 = this.zzd + v4;
                    this.zzd = v5;
                    if(v5 != 3) {
                        continue;
                    }
                    this.zzb.zzL(0);
                    this.zzb.zzK(3);
                    this.zzb.zzM(1);
                    int v6 = this.zzb.zzm();
                    int v7 = this.zzb.zzm();
                    this.zze = (v6 & 0x80) != 0;
                    this.zzc = (v7 | (v6 & 15) << 8) + 3;
                    int v8 = this.zzc;
                    if(this.zzb.zzc() >= v8) {
                        continue;
                    }
                    int v9 = this.zzb.zzc();
                    this.zzb.zzF(Math.min(0x1002, Math.max(v8, v9 + v9)));
                }
                else {
                    int v10 = Math.min(zzdy0.zzb(), this.zzc - v2);
                    zzdy0.zzH(this.zzb.zzN(), this.zzd, v10);
                    int v11 = this.zzd + v10;
                    this.zzd = v11;
                    int v12 = this.zzc;
                    if(v11 == v12) {
                        if(this.zze) {
                            if(zzei.zzf(this.zzb.zzN(), 0, v12, -1) == 0) {
                                this.zzb.zzK(this.zzc - 4);
                                goto label_43;
                            }
                            this.zzf = true;
                            return;
                        }
                        else {
                            this.zzb.zzK(v12);
                        }
                    label_43:
                        this.zzb.zzL(0);
                        this.zza.zza(this.zzb);
                        this.zzd = 0;
                    }
                }
            }
        }
        else if((v & 1) != 0) {
            this.zzf = false;
            zzdy0.zzL(v1);
            this.zzd = 0;
            goto label_6;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzany
    public final void zzb(zzef zzef0, zzacq zzacq0, zzanx zzanx0) {
        this.zza.zzb(zzef0, zzacq0, zzanx0);
        this.zzf = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzany
    public final void zzc() {
        this.zzf = true;
    }
}

