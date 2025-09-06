package com.google.android.gms.internal.ads;

public final class zzadg {
    private static final String[] zza;
    private static final int[] zzb;
    private static final int[] zzc;
    private static final int[] zzd;
    private static final int[] zze;
    private static final int[] zzf;
    private static final int[] zzg;

    static {
        zzadg.zza = new String[]{"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
        zzadg.zzb = new int[]{44100, 48000, 32000};
        zzadg.zzc = new int[]{32000, 0xFA00, 96000, 0x1F400, 160000, 192000, 224000, 256000, 288000, 320000, 0x55F00, 384000, 416000, 448000};
        zzadg.zzd = new int[]{32000, 48000, 56000, 0xFA00, 80000, 96000, 112000, 0x1F400, 144000, 160000, 176000, 192000, 224000, 256000};
        zzadg.zze = new int[]{32000, 48000, 56000, 0xFA00, 80000, 96000, 112000, 0x1F400, 160000, 192000, 224000, 256000, 320000, 384000};
        zzadg.zzf = new int[]{32000, 40000, 48000, 56000, 0xFA00, 80000, 96000, 112000, 0x1F400, 160000, 192000, 224000, 256000, 320000};
        zzadg.zzg = new int[]{8000, 16000, 24000, 32000, 40000, 48000, 56000, 0xFA00, 80000, 96000, 112000, 0x1F400, 144000, 160000};
    }

    public static int zzb(int v) {
        int v7;
        if(zzadg.zzm(v)) {
            int v1 = v >>> 19 & 3;
            if(v1 != 1) {
                int v2 = v >>> 17 & 3;
                if(v2 != 0) {
                    int v3 = v >>> 12 & 15;
                    if(v3 != 0 && v3 != 15) {
                        int v4 = v >>> 10 & 3;
                        if(v4 != 3) {
                            int v5 = zzadg.zzb[v4];
                            if(v1 == 2) {
                                v5 /= 2;
                            }
                            else if(v1 == 0) {
                                v5 /= 4;
                            }
                            int v6 = v >>> 9 & 1;
                            if(v2 == 3) {
                                return v1 == 3 ? (zzadg.zzc[v3 - 1] * 12 / v5 + v6) * 4 : (zzadg.zzd[v3 - 1] * 12 / v5 + v6) * 4;
                            }
                            if(v1 != 3) {
                                v7 = zzadg.zzg[v3 - 1];
                            }
                            else if(v2 == 2) {
                                v7 = zzadg.zze[v3 - 1];
                            }
                            else {
                                v7 = zzadg.zzf[v3 - 1];
                            }
                            int v8 = 0x90;
                            if(v1 == 3) {
                                return v7 * 0x90 / v5 + v6;
                            }
                            if(v2 == 1) {
                                v8 = 72;
                            }
                            return v8 * v7 / v5 + v6;
                        }
                    }
                }
            }
        }
        return -1;
    }

    public static int zzc(int v) {
        if(zzadg.zzm(v)) {
            int v1 = v >>> 19 & 3;
            if(v1 != 1) {
                int v2 = v >>> 17 & 3;
                return v2 == 0 || ((v >>> 12 & 15) == 0 || (v >>> 12 & 15) == 15) || (v >>> 10 & 3) == 3 ? -1 : zzadg.zzl(v1, v2);
            }
        }
        return -1;
    }

    private static int zzl(int v, int v1) {
        switch(v1) {
            case 1: {
                return v == 3 ? 0x480 : 0x240;
            }
            case 2: {
                return 0x480;
            }
            default: {
                return 0x180;
            }
        }
    }

    private static boolean zzm(int v) {
        return (v & 0xFFE00000) == 0xFFE00000;
    }
}

