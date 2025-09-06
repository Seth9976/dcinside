package com.google.android.gms.internal.ads;

import java.util.Collections;

final class zzaet extends zzaex {
    private static final int[] zzb;
    private boolean zzc;
    private boolean zzd;
    private int zze;

    static {
        zzaet.zzb = new int[]{5512, 11025, 22050, 44100};
    }

    public zzaet(zzadt zzadt0) {
        super(zzadt0);
    }

    @Override  // com.google.android.gms.internal.ads.zzaex
    protected final boolean zza(zzdy zzdy0) throws zzaew {
        if(!this.zzc) {
            int v = zzdy0.zzm();
            this.zze = v >> 4;
            if(v >> 4 == 2) {
                int v1 = zzaet.zzb[v >> 2 & 3];
                zzz zzz0 = new zzz();
                zzz0.zzaa("audio/mpeg");
                zzz0.zzz(1);
                zzz0.zzab(v1);
                zzab zzab0 = zzz0.zzag();
                this.zza.zzm(zzab0);
                this.zzd = true;
            }
            else {
                switch(v >> 4) {
                    case 7: 
                    case 8: {
                        zzz zzz1 = new zzz();
                        zzz1.zzaa((v >> 4 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw"));
                        zzz1.zzz(1);
                        zzz1.zzab(8000);
                        zzab zzab1 = zzz1.zzag();
                        this.zza.zzm(zzab1);
                        this.zzd = true;
                        break;
                    }
                    case 10: {
                        break;
                    }
                    default: {
                        throw new zzaew("Audio format not supported: " + (v >> 4));
                    }
                }
            }
            this.zzc = true;
            return true;
        }
        zzdy0.zzM(1);
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzaex
    protected final boolean zzb(zzdy zzdy0, long v) throws zzbc {
        if(this.zze == 2) {
            int v1 = zzdy0.zzb();
            this.zza.zzr(zzdy0, v1);
            this.zza.zzt(v, 1, v1, 0, null);
            return true;
        }
        int v2 = zzdy0.zzm();
        if(v2 == 0 && !this.zzd) {
            int v3 = zzdy0.zzb();
            byte[] arr_b = new byte[v3];
            zzdy0.zzH(arr_b, 0, v3);
            zzabi zzabi0 = zzabk.zza(arr_b);
            zzz zzz0 = new zzz();
            zzz0.zzaa("audio/mp4a-latm");
            zzz0.zzA(zzabi0.zzc);
            zzz0.zzz(zzabi0.zzb);
            zzz0.zzab(zzabi0.zza);
            zzz0.zzN(Collections.singletonList(arr_b));
            zzab zzab0 = zzz0.zzag();
            this.zza.zzm(zzab0);
            this.zzd = true;
            return false;
        }
        if(this.zze == 10 && v2 != 1) {
            return false;
        }
        int v4 = zzdy0.zzb();
        this.zza.zzr(zzdy0, v4);
        this.zza.zzt(v, 1, v4, 0, null);
        return true;
    }
}

