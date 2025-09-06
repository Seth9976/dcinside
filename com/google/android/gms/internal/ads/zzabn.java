package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

public final class zzabn {
    public static final int zza;
    private static final int[] zzb;
    private static final int[] zzc;
    private static final int[] zzd;
    private static final int[] zze;
    private static final int[] zzf;
    private static final int[] zzg;

    static {
        zzabn.zzb = new int[]{1, 2, 3, 6};
        zzabn.zzc = new int[]{48000, 44100, 32000};
        zzabn.zzd = new int[]{24000, 22050, 16000};
        zzabn.zze = new int[]{2, 1, 2, 3, 3, 4, 4, 5};
        zzabn.zzf = new int[]{0x20, 40, 0x30, 56, 0x40, 80, 0x60, 0x70, 0x80, 0xA0, 0xC0, 0xE0, 0x100, 320, 0x180, 0x1C0, 0x200, 0x240, 640};
        zzabn.zzg = new int[]{69, 87, 104, 0x79, 0x8B, 0xAE, 0xD0, 0xF3, 278, 348, 417, 487, 557, 696, 835, 0x3CF, 0x45A, 0x4E5, 0x571};
    }

    public static int zza(ByteBuffer byteBuffer0) {
        int v = 3;
        if((byteBuffer0.get(byteBuffer0.position() + 5) & 0xF8) >> 3 > 10) {
            if((byteBuffer0.get(byteBuffer0.position() + 4) & 0xC0) >> 6 != 3) {
                v = (byteBuffer0.get(byteBuffer0.position() + 4) & 0x30) >> 4;
            }
            return zzabn.zzb[v] * 0x100;
        }
        return 0x600;
    }

    public static int zzb(byte[] arr_b) {
        if(arr_b.length < 6) {
            return -1;
        }
        if((arr_b[5] & 0xF8) >> 3 > 10) {
            int v = (arr_b[3] & 0xFF | (arr_b[2] & 7) << 8) + 1;
            return v + v;
        }
        return zzabn.zzf((arr_b[4] & 0xC0) >> 6, arr_b[4] & 0x3F);
    }

    public static zzab zzc(zzdy zzdy0, String s, String s1, @Nullable zzu zzu0) {
        zzdx zzdx0 = new zzdx();
        zzdx0.zzj(zzdy0);
        int v = zzabn.zzc[zzdx0.zzd(2)];
        zzdx0.zzn(8);
        int v1 = zzabn.zze[zzdx0.zzd(3)];
        if(zzdx0.zzd(1) != 0) {
            ++v1;
        }
        int v2 = zzabn.zzf[zzdx0.zzd(5)] * 1000;
        zzdx0.zzf();
        zzdy0.zzL(zzdx0.zzb());
        zzz zzz0 = new zzz();
        zzz0.zzM(s);
        zzz0.zzaa("audio/ac3");
        zzz0.zzz(v1);
        zzz0.zzab(v);
        zzz0.zzF(zzu0);
        zzz0.zzQ(s1);
        zzz0.zzy(v2);
        zzz0.zzV(v2);
        return zzz0.zzag();
    }

    public static zzab zzd(zzdy zzdy0, String s, String s1, @Nullable zzu zzu0) {
        String s2;
        zzdx zzdx0 = new zzdx();
        zzdx0.zzj(zzdy0);
        int v = zzdx0.zzd(13);
        zzdx0.zzn(3);
        int v1 = zzabn.zzc[zzdx0.zzd(2)];
        zzdx0.zzn(10);
        int v2 = zzabn.zze[zzdx0.zzd(3)];
        if(zzdx0.zzd(1) != 0) {
            ++v2;
        }
        zzdx0.zzn(3);
        int v3 = zzdx0.zzd(4);
        zzdx0.zzn(1);
        if(v3 > 0) {
            zzdx0.zzn(6);
            if(zzdx0.zzd(1) != 0) {
                v2 += 2;
            }
            zzdx0.zzn(1);
        }
        if(zzdx0.zza() > 7) {
            zzdx0.zzn(7);
            s2 = zzdx0.zzd(1) == 0 ? "audio/eac3" : "audio/eac3-joc";
        }
        else {
            s2 = "audio/eac3";
        }
        zzdx0.zzf();
        zzdy0.zzL(zzdx0.zzb());
        zzz zzz0 = new zzz();
        zzz0.zzM(s);
        zzz0.zzaa(s2);
        zzz0.zzz(v2);
        zzz0.zzab(v1);
        zzz0.zzF(zzu0);
        zzz0.zzQ(s1);
        zzz0.zzV(v * 1000);
        return zzz0.zzag();
    }

    public static zzabl zze(zzdx zzdx0) {
        int v14;
        int v13;
        int v6;
        int v5;
        int v4;
        zzdx0.zzn(40);
        int v = zzdx0.zzd(5);
        zzdx0.zzl(zzdx0.zzc());
        int v1 = -1;
        if(v > 10) {
            zzdx0.zzn(16);
            switch(zzdx0.zzd(2)) {
                case 0: {
                    v1 = 0;
                    break;
                }
                case 1: {
                    v1 = 1;
                    break;
                }
                case 2: {
                    v1 = 2;
                }
            }
            zzdx0.zzn(3);
            int v2 = zzdx0.zzd(11);
            int v3 = zzdx0.zzd(2);
            if(v3 == 3) {
                v4 = zzabn.zzd[zzdx0.zzd(2)];
                v5 = 3;
                v6 = 6;
            }
            else {
                int v7 = zzdx0.zzd(2);
                int v8 = zzabn.zzb[v7];
                v5 = v7;
                v4 = zzabn.zzc[v3];
                v6 = v8;
            }
            int v9 = v2 * 2 + 2;
            int v10 = zzdx0.zzd(3);
            int v11 = zzdx0.zzp();
            int v12 = zzabn.zze[v10] + v11;
            zzdx0.zzn(10);
            if(zzdx0.zzp()) {
                zzdx0.zzn(8);
            }
            if(v10 == 0) {
                zzdx0.zzn(5);
                if(zzdx0.zzp()) {
                    zzdx0.zzn(8);
                }
                v13 = 0;
                v10 = 0;
            }
            else {
                v13 = v10;
            }
            if(v1 == 1) {
                if(zzdx0.zzp()) {
                    zzdx0.zzn(16);
                }
                v14 = 1;
            }
            else {
                v14 = v1;
            }
            if(zzdx0.zzp()) {
                if(v13 > 2) {
                    zzdx0.zzn(2);
                }
                if((v13 & 1) != 0 && v13 > 2) {
                    zzdx0.zzn(6);
                }
                if((v13 & 4) != 0) {
                    zzdx0.zzn(6);
                }
                if(v11 != 0 && zzdx0.zzp()) {
                    zzdx0.zzn(5);
                }
                if(v14 == 0) {
                    if(zzdx0.zzp()) {
                        zzdx0.zzn(6);
                    }
                    if(v13 == 0 && zzdx0.zzp()) {
                        zzdx0.zzn(6);
                    }
                    if(zzdx0.zzp()) {
                        zzdx0.zzn(6);
                    }
                    int v15 = zzdx0.zzd(2);
                    if(v15 == 1) {
                        zzdx0.zzn(5);
                    }
                    else if(v15 == 2) {
                        zzdx0.zzn(12);
                    }
                    else if(v15 == 3) {
                        int v16 = zzdx0.zzd(5);
                        if(zzdx0.zzp()) {
                            zzdx0.zzn(5);
                            if(zzdx0.zzp()) {
                                zzdx0.zzn(4);
                            }
                            if(zzdx0.zzp()) {
                                zzdx0.zzn(4);
                            }
                            if(zzdx0.zzp()) {
                                zzdx0.zzn(4);
                            }
                            if(zzdx0.zzp()) {
                                zzdx0.zzn(4);
                            }
                            if(zzdx0.zzp()) {
                                zzdx0.zzn(4);
                            }
                            if(zzdx0.zzp()) {
                                zzdx0.zzn(4);
                            }
                            if(zzdx0.zzp()) {
                                zzdx0.zzn(4);
                            }
                            if(zzdx0.zzp()) {
                                if(zzdx0.zzp()) {
                                    zzdx0.zzn(4);
                                }
                                if(zzdx0.zzp()) {
                                    zzdx0.zzn(4);
                                }
                            }
                        }
                        if(zzdx0.zzp()) {
                            zzdx0.zzn(5);
                            if(zzdx0.zzp()) {
                                zzdx0.zzn(7);
                                if(zzdx0.zzp()) {
                                    zzdx0.zzn(8);
                                }
                            }
                        }
                        zzdx0.zzn((v16 + 2) * 8);
                        zzdx0.zzf();
                    }
                    if(v13 < 2) {
                        if(zzdx0.zzp()) {
                            zzdx0.zzn(14);
                        }
                        if(v10 == 0 && zzdx0.zzp()) {
                            zzdx0.zzn(14);
                        }
                    }
                    if(!zzdx0.zzp()) {
                        v14 = 0;
                    }
                    else if(v5 == 0) {
                        zzdx0.zzn(5);
                        v14 = 0;
                        v5 = 0;
                    }
                    else {
                        for(int v17 = 0; v17 < v6; ++v17) {
                            if(zzdx0.zzp()) {
                                zzdx0.zzn(5);
                            }
                        }
                        v14 = 0;
                    }
                }
            }
            if(zzdx0.zzp()) {
                zzdx0.zzn(5);
                if(v13 == 2) {
                    zzdx0.zzn(4);
                    v13 = 2;
                }
                if(v13 >= 6) {
                    zzdx0.zzn(2);
                }
                if(zzdx0.zzp()) {
                    zzdx0.zzn(8);
                }
                if(v13 == 0 && zzdx0.zzp()) {
                    zzdx0.zzn(8);
                }
                if(v3 < 3) {
                    zzdx0.zzm();
                }
            }
            if(v14 == 0 && v5 != 3) {
                zzdx0.zzm();
            }
            if(v14 == 2 && (v5 == 3 || zzdx0.zzp())) {
                zzdx0.zzn(6);
            }
            return !zzdx0.zzp() || zzdx0.zzd(6) != 1 || zzdx0.zzd(8) != 1 ? new zzabl("audio/eac3", v1, v12, v4, v9, v6 * 0x100, v9 * v4 / (v6 * 0x20), null) : new zzabl("audio/eac3-joc", v1, v12, v4, v9, v6 * 0x100, v9 * v4 / (v6 * 0x20), null);
        }
        zzdx0.zzn(0x20);
        int v18 = zzdx0.zzd(2);
        int v19 = zzdx0.zzd(6);
        int v20 = zzabn.zzf[v19 / 2] * 1000;
        int v21 = zzabn.zzf(v18, v19);
        zzdx0.zzn(8);
        int v22 = zzdx0.zzd(3);
        if((v22 & 1) != 0 && v22 != 1) {
            zzdx0.zzn(2);
        }
        if((v22 & 4) != 0) {
            zzdx0.zzn(2);
        }
        if(v22 == 2) {
            zzdx0.zzn(2);
        }
        int v23 = v18 >= 3 ? -1 : zzabn.zzc[v18];
        int v24 = zzdx0.zzp();
        return new zzabl((v18 == 3 ? null : "audio/ac3"), -1, zzabn.zze[v22] + v24, v23, v21, 0x600, v20, null);
    }

    private static int zzf(int v, int v1) {
        if(v >= 0 && v < 3 && v1 >= 0 && v1 >> 1 < 19) {
            int v2 = zzabn.zzc[v];
            if(v2 == 44100) {
                int v3 = zzabn.zzg[v1 >> 1] + (v1 & 1);
                return v3 + v3;
            }
            int v4 = zzabn.zzf[v1 >> 1];
            return v2 == 32000 ? v4 * 6 : v4 * 4;
        }
        return -1;
    }
}

