package com.google.android.gms.internal.ads;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import java.util.Arrays;

final class zzaks {
    private final zzdy zza;
    private final int[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    public zzaks() {
        this.zza = new zzdy();
        this.zzb = new int[0x100];
    }

    @Nullable
    public final zzco zza() {
        int v3;
        if(this.zzd != 0 && this.zze != 0 && this.zzh != 0 && this.zzi != 0) {
            zzdy zzdy0 = this.zza;
            if(zzdy0.zze() != 0 && zzdy0.zzd() == zzdy0.zze() && this.zzc) {
                zzdy0.zzL(0);
                int v = this.zzh * this.zzi;
                int[] arr_v = new int[v];
                int v1 = 0;
                while(v1 < v) {
                    int v2 = this.zza.zzm();
                    if(v2 == 0) {
                        int v4 = this.zza.zzm();
                        if(v4 == 0) {
                            continue;
                        }
                        v3 = ((v4 & 0x40) == 0 ? v4 & 0x3F : (v4 & 0x3F) << 8 | this.zza.zzm()) + v1;
                        Arrays.fill(arr_v, v1, v3, ((v4 & 0x80) == 0 ? this.zzb[0] : this.zzb[this.zza.zzm()]));
                    }
                    else {
                        v3 = v1 + 1;
                        arr_v[v1] = this.zzb[v2];
                    }
                    v1 = v3;
                }
                Bitmap bitmap0 = Bitmap.createBitmap(arr_v, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
                zzcm zzcm0 = new zzcm();
                zzcm0.zzc(bitmap0);
                zzcm0.zzh(((float)this.zzf) / ((float)this.zzd));
                zzcm0.zzi(0);
                zzcm0.zze(((float)this.zzg) / ((float)this.zze), 0);
                zzcm0.zzf(0);
                zzcm0.zzk(((float)this.zzh) / ((float)this.zzd));
                zzcm0.zzd(((float)this.zzi) / ((float)this.zze));
                return zzcm0.zzp();
            }
        }
        return null;
    }

    static void zzb(zzaks zzaks0, zzdy zzdy0, int v) {
        if(v >= 4) {
            zzdy0.zzM(3);
            int v1 = v - 4;
            if((zzdy0.zzm() & 0x80) == 0) {
            label_11:
                zzdy zzdy1 = zzaks0.zza;
                int v3 = zzdy1.zzd();
                int v4 = zzdy1.zze();
                if(v3 < v4 && v1 > 0) {
                    int v5 = Math.min(v1, v4 - v3);
                    zzdy0.zzH(zzdy1.zzN(), v3, v5);
                    zzaks0.zza.zzL(v3 + v5);
                }
            }
            else if(v1 >= 7) {
                int v2 = zzdy0.zzo();
                if(v2 >= 4) {
                    zzaks0.zzh = zzdy0.zzq();
                    zzaks0.zzi = zzdy0.zzq();
                    zzaks0.zza.zzI(v2 - 4);
                    v1 = v - 11;
                    goto label_11;
                }
            }
        }
    }

    static void zzc(zzaks zzaks0, zzdy zzdy0, int v) {
        if(v < 19) {
            return;
        }
        zzaks0.zzd = zzdy0.zzq();
        zzaks0.zze = zzdy0.zzq();
        zzdy0.zzM(11);
        zzaks0.zzf = zzdy0.zzq();
        zzaks0.zzg = zzdy0.zzq();
    }

    static void zzd(zzaks zzaks0, zzdy zzdy0, int v) {
        if(v % 5 != 2) {
            return;
        }
        zzdy0.zzM(2);
        Arrays.fill(zzaks0.zzb, 0);
        for(int v1 = 0; v1 < v / 5; ++v1) {
            int v2 = zzdy0.zzm();
            int v3 = zzdy0.zzm();
            int v4 = zzdy0.zzm();
            int v5 = zzdy0.zzm();
            zzaks0.zzb[v2] = Math.max(0, Math.min(((int)(((double)v3) + ((double)(v5 - 0x80)) * 1.772)), 0xFF)) | (zzdy0.zzm() << 24 | Math.max(0, Math.min(((int)(1.402 * ((double)(v4 - 0x80)) + ((double)v3))), 0xFF)) << 16 | Math.max(0, Math.min(((int)(((double)v3) - 0.34414 * ((double)(v5 - 0x80)) - ((double)(v4 - 0x80)) * 0.71414)), 0xFF)) << 8);
        }
        zzaks0.zzc = true;
    }

    public final void zze() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zzI(0);
        this.zzc = false;
    }
}

