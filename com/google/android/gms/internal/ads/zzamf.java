package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;

public final class zzamf implements zzamj {
    private static final byte[] zza;
    private final boolean zzb;
    private final zzdx zzc;
    private final zzdy zzd;
    @Nullable
    private final String zze;
    private final int zzf;
    private String zzg;
    private zzadt zzh;
    private zzadt zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private long zzs;
    private int zzt;
    private long zzu;
    private zzadt zzv;
    private long zzw;

    static {
        zzamf.zza = new byte[]{73, 68, 51};
    }

    public zzamf(boolean z, @Nullable String s, int v) {
        this.zzc = new zzdx(new byte[7], 7);
        this.zzd = new zzdy(Arrays.copyOf(zzamf.zza, 10));
        this.zzh();
        this.zzo = -1;
        this.zzp = -1;
        this.zzs = 0x8000000000000001L;
        this.zzu = 0x8000000000000001L;
        this.zzb = z;
        this.zze = s;
        this.zzf = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zza(zzdy zzdy0) throws zzbc {
        this.zzh.getClass();
    label_1:
        while(zzdy0.zzb() > 0) {
            switch(this.zzj) {
                case 0: {
                    byte[] arr_b = zzdy0.zzN();
                    int v2 = zzdy0.zzd();
                    int v3 = zzdy0.zze();
                    while(v2 < v3) {
                        int v4 = arr_b[v2];
                        int v5 = v4 & 0xFF;
                        if(this.zzl == 0x200 && zzamf.zzl(((byte)-1), ((byte)v5))) {
                            if(this.zzn) {
                            label_46:
                                this.zzq = (v4 & 8) >> 3;
                                this.zzm = 1 == (v4 & 1 ^ 1);
                                if(this.zzn) {
                                    this.zzi();
                                }
                                else {
                                    this.zzj = 1;
                                    this.zzk = 0;
                                }
                                zzdy0.zzL(v2 + 1);
                                continue label_1;
                            }
                            else {
                                zzdy0.zzL(v2);
                                if(zzamf.zzm(zzdy0, this.zzc.zza, 1)) {
                                    this.zzc.zzl(4);
                                    int v6 = this.zzc.zzd(1);
                                    if(this.zzo == -1 || v6 == this.zzo) {
                                        if(this.zzp == -1) {
                                        label_31:
                                            if(zzamf.zzm(zzdy0, this.zzc.zza, 4)) {
                                                this.zzc.zzl(14);
                                                int v7 = this.zzc.zzd(13);
                                                if(v7 >= 7) {
                                                    byte[] arr_b1 = zzdy0.zzN();
                                                    int v8 = zzdy0.zze();
                                                    int v9 = v2 - 1 + v7;
                                                    if(v9 < v8) {
                                                        int v10 = arr_b1[v9];
                                                        if(v10 != -1) {
                                                            if(v10 == 73 && (v9 + 1 == v8 || arr_b1[v9 + 1] == 68 && (v9 + 2 == v8 || arr_b1[v9 + 2] == 51))) {
                                                                goto label_46;
                                                            }
                                                        }
                                                        else if(v9 + 1 != v8) {
                                                            int v11 = arr_b1[v9 + 1];
                                                            if(zzamf.zzl(((byte)-1), ((byte)v11)) && (v11 & 8) >> 3 == v6) {
                                                                goto label_46;
                                                            }
                                                        }
                                                        else {
                                                            goto label_46;
                                                        }
                                                    }
                                                    else {
                                                        goto label_46;
                                                    }
                                                }
                                            }
                                            else {
                                                goto label_46;
                                            }
                                        }
                                        else if(zzamf.zzm(zzdy0, this.zzc.zza, 1)) {
                                            this.zzc.zzl(2);
                                            if(this.zzc.zzd(4) == this.zzp) {
                                                zzdy0.zzL(v2 + 1);
                                                goto label_31;
                                            }
                                        }
                                        else {
                                            goto label_46;
                                        }
                                    }
                                }
                            }
                        }
                        int v12 = this.zzl;
                        switch(v12 | v5) {
                            case 329: {
                                this.zzl = 0x300;
                                ++v2;
                                continue;
                            }
                            case 0x1FF: {
                                this.zzl = 0x200;
                                ++v2;
                                continue;
                            }
                            case 836: {
                                this.zzl = 0x400;
                                ++v2;
                                continue;
                            }
                            case 1075: {
                                break;
                            }
                            default: {
                                if(v12 != 0x100) {
                                    this.zzl = 0x100;
                                    continue;
                                }
                                ++v2;
                                continue;
                            }
                        }
                        this.zzj = 2;
                        this.zzk = 3;
                        this.zzt = 0;
                        this.zzd.zzL(0);
                        zzdy0.zzL(v2 + 1);
                        continue label_1;
                    }
                    zzdy0.zzL(v2);
                    continue;
                }
                case 1: {
                    if(zzdy0.zzb() == 0) {
                        continue;
                    }
                    this.zzc.zza[0] = zzdy0.zzN()[zzdy0.zzd()];
                    this.zzc.zzl(2);
                    int v13 = this.zzc.zzd(4);
                    if(this.zzp == -1 || v13 == this.zzp) {
                        if(!this.zzn) {
                            this.zzn = true;
                            this.zzo = this.zzq;
                            this.zzp = v13;
                        }
                        this.zzi();
                    }
                    else {
                        this.zzg();
                    }
                    continue;
                }
                case 2: {
                    if(!this.zzk(zzdy0, this.zzd.zzN(), 10)) {
                        continue;
                    }
                    this.zzi.zzr(this.zzd, 10);
                    this.zzd.zzL(6);
                    this.zzj(this.zzi, 0L, 10, this.zzd.zzl() + 10);
                    continue;
                }
                case 3: {
                    if(!this.zzk(zzdy0, this.zzc.zza, (this.zzm ? 7 : 5))) {
                        continue;
                    }
                    this.zzc.zzl(0);
                    if(this.zzr) {
                        this.zzc.zzn(10);
                    }
                    else {
                        int v14 = this.zzc.zzd(2) + 1;
                        if(v14 != 2) {
                            zzdo.zzf("AdtsReader", "Detected audio object type: " + v14 + ", but assuming AAC LC.");
                        }
                        this.zzc.zzn(5);
                        byte b = (byte)(this.zzc.zzd(3) << 3 & 120 | this.zzp << 7 & 0x80);
                        byte[] arr_b2 = {((byte)(this.zzp >> 1 & 7 | 16)), b};
                        zzabi zzabi0 = zzabk.zza(arr_b2);
                        zzz zzz0 = new zzz();
                        zzz0.zzM(this.zzg);
                        zzz0.zzaa("audio/mp4a-latm");
                        zzz0.zzA(zzabi0.zzc);
                        zzz0.zzz(zzabi0.zzb);
                        zzz0.zzab(zzabi0.zza);
                        zzz0.zzN(Collections.singletonList(arr_b2));
                        zzz0.zzQ(this.zze);
                        zzz0.zzY(this.zzf);
                        zzab zzab0 = zzz0.zzag();
                        this.zzs = 1024000000L / ((long)zzab0.zzE);
                        this.zzh.zzm(zzab0);
                        this.zzr = true;
                    }
                    break;
                }
                default: {
                    int v = Math.min(zzdy0.zzb(), this.zzt - this.zzk);
                    this.zzv.zzr(zzdy0, v);
                    int v1 = this.zzk + v;
                    this.zzk = v1;
                    if(v1 != this.zzt) {
                        continue;
                    }
                    zzcw.zzf(this.zzu != 0x8000000000000001L);
                    this.zzv.zzt(this.zzu, 1, this.zzt, 0, null);
                    this.zzu += this.zzw;
                    this.zzh();
                    continue;
                }
            }
            this.zzc.zzn(4);
            int v15 = this.zzc.zzd(13);
            this.zzj(this.zzh, this.zzs, 0, (this.zzm ? v15 - 9 : v15 - 7));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zzb(zzacq zzacq0, zzanx zzanx0) {
        zzanx0.zzc();
        this.zzg = zzanx0.zzb();
        zzadt zzadt0 = zzacq0.zzw(zzanx0.zza(), 1);
        this.zzh = zzadt0;
        this.zzv = zzadt0;
        if(this.zzb) {
            zzanx0.zzc();
            zzadt zzadt1 = zzacq0.zzw(zzanx0.zza(), 5);
            this.zzi = zzadt1;
            zzz zzz0 = new zzz();
            zzz0.zzM(zzanx0.zzb());
            zzz0.zzaa("application/id3");
            zzadt1.zzm(zzz0.zzag());
            return;
        }
        this.zzi = new zzaci();
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zzc(boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zzd(long v, int v1) {
        this.zzu = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        this.zzu = 0x8000000000000001L;
        this.zzg();
    }

    public static boolean zzf(int v) {
        return (v & 0xFFF6) == 0xFFF0;
    }

    private final void zzg() {
        this.zzn = false;
        this.zzh();
    }

    private final void zzh() {
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = 0x100;
    }

    private final void zzi() {
        this.zzj = 3;
        this.zzk = 0;
    }

    private final void zzj(zzadt zzadt0, long v, int v1, int v2) {
        this.zzj = 4;
        this.zzk = v1;
        this.zzv = zzadt0;
        this.zzw = v;
        this.zzt = v2;
    }

    private final boolean zzk(zzdy zzdy0, byte[] arr_b, int v) {
        int v1 = Math.min(zzdy0.zzb(), v - this.zzk);
        zzdy0.zzH(arr_b, this.zzk, v1);
        int v2 = this.zzk + v1;
        this.zzk = v2;
        return v2 == v;
    }

    private static final boolean zzl(byte b, byte b1) {
        return zzamf.zzf(b1 & 0xFF | 0xFF00);
    }

    private static final boolean zzm(zzdy zzdy0, byte[] arr_b, int v) {
        if(zzdy0.zzb() < v) {
            return false;
        }
        zzdy0.zzH(arr_b, 0, v);
        return true;
    }
}

