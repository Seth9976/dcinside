package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;

public final class zzamo implements zzamj {
    private static final float[] zza;
    @Nullable
    private final zzaoa zzb;
    @Nullable
    private final zzdy zzc;
    private final boolean[] zzd;
    private final zzamm zze;
    @Nullable
    private final zzanb zzf;
    private zzamn zzg;
    private long zzh;
    private String zzi;
    private zzadt zzj;
    private boolean zzk;
    private long zzl;

    static {
        zzamo.zza = new float[]{1.0f, 1.0f, 1.090909f, 0.909091f, 1.454545f, 1.212121f, 1.0f};
    }

    public zzamo() {
        this(null);
    }

    zzamo(@Nullable zzaoa zzaoa0) {
        zzdy zzdy0;
        this.zzb = zzaoa0;
        this.zzd = new boolean[4];
        this.zze = new zzamm(0x80);
        this.zzl = 0x8000000000000001L;
        if(zzaoa0 == null) {
            zzdy0 = null;
            this.zzf = null;
        }
        else {
            this.zzf = new zzanb(0xB2, 0x80);
            zzdy0 = new zzdy();
        }
        this.zzc = zzdy0;
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zza(zzdy zzdy0) {
        int v14;
        float f;
        zzcw.zzb(this.zzg);
        zzcw.zzb(this.zzj);
        int v = zzdy0.zzd();
        int v1 = zzdy0.zze();
        byte[] arr_b = zzdy0.zzN();
        this.zzh += (long)zzdy0.zzb();
        this.zzj.zzr(zzdy0, zzdy0.zzb());
        int v2;
        while((v2 = zzfk.zza(arr_b, v, v1, this.zzd)) != v1) {
            int v3 = zzdy0.zzN()[v2 + 3] & 0xFF;
            int v4 = v2 - v;
            if(!this.zzk) {
                if(v4 > 0) {
                    this.zze.zza(arr_b, v, v2);
                }
                if(this.zze.zzc(v3, (v4 >= 0 ? 0 : -v4))) {
                    zzadt zzadt0 = this.zzj;
                    int v5 = this.zze.zzb;
                    String s = this.zzi;
                    s.getClass();
                    byte[] arr_b1 = Arrays.copyOf(this.zze.zzc, this.zze.zza);
                    zzdx zzdx0 = new zzdx(arr_b1, arr_b1.length);
                    zzdx0.zzo(v5);
                    zzdx0.zzo(4);
                    zzdx0.zzm();
                    zzdx0.zzn(8);
                    if(zzdx0.zzp()) {
                        zzdx0.zzn(4);
                        zzdx0.zzn(3);
                    }
                    int v6 = zzdx0.zzd(4);
                    if(v6 == 15) {
                        int v7 = zzdx0.zzd(8);
                        int v8 = zzdx0.zzd(8);
                        if(v8 == 0) {
                            zzdo.zzf("H263Reader", "Invalid aspect ratio");
                            goto label_41;
                        }
                        else {
                            f = ((float)v7) / ((float)v8);
                            goto label_42;
                        }
                        goto label_37;
                    }
                    else {
                    label_37:
                        if(v6 < 7) {
                            f = zzamo.zza[v6];
                            goto label_42;
                        }
                        else {
                            zzdo.zzf("H263Reader", "Invalid aspect ratio");
                        }
                    }
                label_41:
                    f = 1.0f;
                label_42:
                    if(zzdx0.zzp()) {
                        zzdx0.zzn(2);
                        zzdx0.zzn(1);
                        if(zzdx0.zzp()) {
                            zzdx0.zzn(15);
                            zzdx0.zzm();
                            zzdx0.zzn(15);
                            zzdx0.zzm();
                            zzdx0.zzn(15);
                            zzdx0.zzm();
                            zzdx0.zzn(3);
                            zzdx0.zzn(11);
                            zzdx0.zzm();
                            zzdx0.zzn(15);
                            zzdx0.zzm();
                        }
                    }
                    if(zzdx0.zzd(2) != 0) {
                        zzdo.zzf("H263Reader", "Unhandled video object layer shape");
                    }
                    zzdx0.zzm();
                    int v9 = zzdx0.zzd(16);
                    zzdx0.zzm();
                    if(zzdx0.zzp()) {
                        if(v9 == 0) {
                            zzdo.zzf("H263Reader", "Invalid vop_increment_time_resolution");
                        }
                        else {
                            int v10 = v9 - 1;
                            int v11;
                            for(v11 = 0; v10 > 0; ++v11) {
                                v10 >>= 1;
                            }
                            zzdx0.zzn(v11);
                        }
                    }
                    zzdx0.zzm();
                    int v12 = zzdx0.zzd(13);
                    zzdx0.zzm();
                    int v13 = zzdx0.zzd(13);
                    zzdx0.zzm();
                    zzdx0.zzm();
                    zzz zzz0 = new zzz();
                    zzz0.zzM(s);
                    zzz0.zzaa("video/mp4v-es");
                    zzz0.zzaf(v12);
                    zzz0.zzK(v13);
                    zzz0.zzW(f);
                    zzz0.zzN(Collections.singletonList(arr_b1));
                    zzadt0.zzm(zzz0.zzag());
                    this.zzk = true;
                }
            }
            this.zzg.zza(arr_b, v, v2);
            zzanb zzanb0 = this.zzf;
            if(zzanb0 != null) {
                if(v4 > 0) {
                    zzanb0.zza(arr_b, v, v2);
                    v14 = 0;
                }
                else {
                    v14 = -v4;
                }
                if(this.zzf.zzd(v14)) {
                    int v15 = zzfk.zzb(this.zzf.zza, this.zzf.zzb);
                    this.zzc.zzJ(this.zzf.zza, v15);
                    this.zzb.zza(this.zzl, this.zzc);
                }
                if(v3 == 0xB2) {
                    if(zzdy0.zzN()[v2 + 2] == 1) {
                        this.zzf.zzc(0xB2);
                    }
                    v3 = 0xB2;
                }
            }
            this.zzg.zzb(this.zzh - ((long)(v1 - v2)), v1 - v2, this.zzk);
            this.zzg.zzc(v3, this.zzl);
            v = v2 + 3;
        }
        if(!this.zzk) {
            this.zze.zza(arr_b, v, v1);
        }
        this.zzg.zza(arr_b, v, v1);
        zzanb zzanb1 = this.zzf;
        if(zzanb1 != null) {
            zzanb1.zza(arr_b, v, v1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zzb(zzacq zzacq0, zzanx zzanx0) {
        zzanx0.zzc();
        this.zzi = zzanx0.zzb();
        zzadt zzadt0 = zzacq0.zzw(zzanx0.zza(), 2);
        this.zzj = zzadt0;
        this.zzg = new zzamn(zzadt0);
        zzaoa zzaoa0 = this.zzb;
        if(zzaoa0 != null) {
            zzaoa0.zzb(zzacq0, zzanx0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zzc(boolean z) {
        zzcw.zzb(this.zzg);
        if(z) {
            this.zzg.zzb(this.zzh, 0, this.zzk);
            this.zzg.zzd();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zzd(long v, int v1) {
        this.zzl = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        zzfk.zzh(this.zzd);
        this.zze.zzb();
        zzamn zzamn0 = this.zzg;
        if(zzamn0 != null) {
            zzamn0.zzd();
        }
        zzanb zzanb0 = this.zzf;
        if(zzanb0 != null) {
            zzanb0.zzb();
        }
        this.zzh = 0L;
        this.zzl = 0x8000000000000001L;
    }
}

