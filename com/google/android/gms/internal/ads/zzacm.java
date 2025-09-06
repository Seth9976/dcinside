package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzacm {
    public static final int zza;
    private static final int[] zzb;
    private static final int[] zzc;
    private static final int[] zzd;
    private static final int[] zze;
    private static final int[] zzf;
    private static final int[] zzg;
    private static final int[] zzh;
    private static final int[] zzi;
    private static final int[] zzj;

    static {
        zzacm.zzb = new int[]{1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
        zzacm.zzc = new int[]{-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
        zzacm.zzd = new int[]{0x40, 0x70, 0x80, 0xC0, 0xE0, 0x100, 0x180, 0x1C0, 0x200, 640, 0x300, 0x380, 0x400, 0x480, 0x500, 0x600, 0x780, 0x800, 0x900, 0xA00, 0xA80, 0xB00, 0xB07, 0xB80, 0xC00, 0xF00, 0x1000, 0x1800, 0x1E00};
        zzacm.zze = new int[]{8000, 16000, 32000, 0xFA00, 0x1F400, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
        zzacm.zzf = new int[]{5, 8, 10, 12};
        zzacm.zzg = new int[]{6, 9, 12, 15};
        zzacm.zzh = new int[]{2, 4, 6, 8};
        zzacm.zzi = new int[]{9, 11, 13, 16};
        zzacm.zzj = new int[]{5, 8, 10, 12};
    }

    public static int zza(byte[] arr_b) {
        zzdx zzdx0 = zzacm.zzg(arr_b);
        zzdx0.zzn(42);
        return zzdx0.zzp() ? zzdx0.zzd(12) + 1 : zzdx0.zzd(8) + 1;
    }

    public static int zzb(byte[] arr_b) {
        zzdx zzdx0 = zzacm.zzg(arr_b);
        zzdx0.zzn(0x20);
        return zzacm.zzf(zzdx0, zzacm.zzj, true) + 1;
    }

    public static zzab zzc(byte[] arr_b, @Nullable String s, @Nullable String s1, int v, @Nullable zzu zzu0) {
        zzdx zzdx0 = zzacm.zzg(arr_b);
        zzdx0.zzn(60);
        int v1 = zzacm.zzb[zzdx0.zzd(6)];
        int v2 = zzacm.zzc[zzdx0.zzd(4)];
        int v3 = zzdx0.zzd(5);
        int v4 = v3 < 29 ? zzacm.zzd[v3] * 1000 / 2 : -1;
        zzdx0.zzn(10);
        int v5 = zzdx0.zzd(2) <= 0 ? 0 : 1;
        zzz zzz0 = new zzz();
        zzz0.zzM(s);
        zzz0.zzaa("audio/vnd.dts");
        zzz0.zzy(v4);
        zzz0.zzz(v1 + v5);
        zzz0.zzab(v2);
        zzz0.zzF(null);
        zzz0.zzQ(s1);
        zzz0.zzY(v);
        return zzz0.zzag();
    }

    public static zzack zzd(byte[] arr_b) throws zzbc {
        int v11;
        int v10;
        int v3;
        zzdx zzdx0 = zzacm.zzg(arr_b);
        zzdx0.zzn(40);
        int v = zzdx0.zzd(2);
        boolean z = zzdx0.zzp();
        zzdx0.zzn((z ? 12 : 8));
        int v1 = zzdx0.zzd((z ? 20 : 16));
        boolean z1 = zzdx0.zzp();
        int v2 = 0;
        if(z1) {
            v3 = zzdx0.zzd(2);
            int v4 = zzdx0.zzd(3);
            if(zzdx0.zzp()) {
                zzdx0.zzn(36);
            }
            if(zzdx0.zzd(3) + 1 != 1 || zzdx0.zzd(3) + 1 != 1) {
                throw zzbc.zzc("Multiple audio presentations or assets not supported");
            }
            int v5 = zzdx0.zzd(v + 1);
            for(int v6 = 0; v6 < v + 1; ++v6) {
                if((v5 >> v6 & 1) == 1) {
                    zzdx0.zzn(8);
                }
            }
            if(zzdx0.zzp()) {
                zzdx0.zzn(2);
                int v7 = zzdx0.zzd(2);
                int v8 = zzdx0.zzd(2);
                while(v2 < v8 + 1) {
                    zzdx0.zzn(v7 + 1 << 2);
                    ++v2;
                }
            }
            v2 = (v4 + 1) * 0x200;
        }
        else {
            v3 = -1;
        }
        zzdx0.zzn((z ? 20 : 16));
        zzdx0.zzn(12);
        if(z1) {
            if(zzdx0.zzp()) {
                zzdx0.zzn(4);
            }
            if(zzdx0.zzp()) {
                zzdx0.zzn(24);
            }
            if(zzdx0.zzp()) {
                zzdx0.zzo(zzdx0.zzd(10) + 1);
            }
            zzdx0.zzn(5);
            int v9 = zzacm.zze[zzdx0.zzd(4)];
            v10 = zzdx0.zzd(8) + 1;
            v11 = v9;
        }
        else {
            v10 = -1;
            v11 = 0x80000001;
        }
        if(z1) {
            switch(v3) {
                case 0: {
                    return new zzack("audio/vnd.dts.hd;profile=lbr", v10, v11, v1 + 1, zzei.zzu(v2, 1000000L, 32000L, RoundingMode.DOWN), 0, null);
                }
                case 1: {
                    return new zzack("audio/vnd.dts.hd;profile=lbr", v10, v11, v1 + 1, zzei.zzu(v2, 1000000L, 44100L, RoundingMode.DOWN), 0, null);
                }
                case 2: {
                    return new zzack("audio/vnd.dts.hd;profile=lbr", v10, v11, v1 + 1, zzei.zzu(v2, 1000000L, 48000L, RoundingMode.DOWN), 0, null);
                }
                default: {
                    throw zzbc.zza(("Unsupported reference clock code in DTS HD header: " + v3), null);
                }
            }
        }
        return new zzack("audio/vnd.dts.hd;profile=lbr", v10, v11, v1 + 1, 0x8000000000000001L, 0, null);
    }

    public static zzack zze(byte[] arr_b, AtomicInteger atomicInteger0) throws zzbc {
        long v9;
        int v8;
        int v7;
        int v4;
        zzdx zzdx0 = zzacm.zzg(arr_b);
        int v = zzdx0.zzd(0x20);
        int v1 = zzacm.zzf(zzdx0, zzacm.zzf, true);
        int v2 = v == 1078008818 ? 1 : 0;
        if(v2 == 0) {
            v9 = 0x8000000000000001L;
            v8 = 0x80000001;
        }
        else {
            if(!zzdx0.zzp()) {
                throw zzbc.zzc("Only supports full channel mask-based audio presentation");
            }
            if((arr_b[v1] & 0xFF | ((char)(arr_b[v1 - 1] << 8))) != zzei.zze(arr_b, 0, v1 - 1, 0xFFFF)) {
                throw zzbc.zza("CRC check failed", null);
            }
            int v3 = zzdx0.zzd(2);
            switch(v3) {
                case 0: {
                    v4 = 0x200;
                    break;
                }
                case 1: {
                    v4 = 480;
                    break;
                }
                case 2: {
                    v4 = 0x180;
                    break;
                }
                default: {
                    throw zzbc.zza(("Unsupported base duration index in DTS UHD header: " + v3), null);
                }
            }
            int v5 = zzdx0.zzd(3);
            int v6 = zzdx0.zzd(2);
            switch(v6) {
                case 0: {
                    v7 = 32000;
                    break;
                }
                case 1: {
                    v7 = 44100;
                    break;
                }
                case 2: {
                    v7 = 48000;
                    break;
                }
                default: {
                    throw zzbc.zza(("Unsupported clock rate index in DTS UHD header: " + v6), null);
                }
            }
            if(zzdx0.zzp()) {
                zzdx0.zzn(36);
            }
            v8 = (1 << zzdx0.zzd(2)) * v7;
            v9 = zzei.zzu(v4 * (v5 + 1), 1000000L, v7, RoundingMode.DOWN);
        }
        int v11 = 0;
        for(int v10 = 0; v10 < v2; v10 = 1) {
            v11 += zzacm.zzf(zzdx0, zzacm.zzg, true);
        }
        for(int v12 = 0; v12 <= 0; ++v12) {
            if(v2 != 0) {
                atomicInteger0.set(zzacm.zzf(zzdx0, zzacm.zzh, true));
            }
            v11 += (atomicInteger0.get() == 0 ? 0 : zzacm.zzf(zzdx0, zzacm.zzi, true));
        }
        return new zzack("audio/vnd.dts.uhd;profile=p2", 2, v8, v1 + 1 + v11, v9, 0, null);
    }

    private static int zzf(zzdx zzdx0, int[] arr_v, boolean z) {
        int v2 = 0;
        for(int v1 = 0; v1 < 3 && zzdx0.zzp(); ++v1) {
            ++v2;
        }
        int v3 = 0;
        for(int v = 0; v < v2; ++v) {
            v3 += 1 << arr_v[v];
        }
        return v3 + zzdx0.zzd(arr_v[v2]);
    }

    private static zzdx zzg(byte[] arr_b) {
        switch(arr_b[0]) {
            case 0x40: 
            case 100: 
            case 0x71: 
            case 0x7F: {
                return new zzdx(arr_b, arr_b.length);
            }
            default: {
                byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
                int v = arr_b1[0];
                if(v == -2 || v == -1 || (v == -24 || v == -14 || v == 37)) {
                    for(int v1 = 0; v1 < arr_b1.length - 1; v1 += 2) {
                        byte b = arr_b1[v1];
                        arr_b1[v1] = arr_b1[v1 + 1];
                        arr_b1[v1 + 1] = b;
                    }
                }
                zzdx zzdx0 = new zzdx(arr_b1, arr_b1.length);
                if(arr_b1[0] == 0x1F) {
                    zzdx zzdx1 = new zzdx(arr_b1, arr_b1.length);
                    while(zzdx1.zza() >= 16) {
                        zzdx1.zzn(2);
                        zzdx0.zzg(zzdx1.zzd(14), 14);
                    }
                }
                zzdx0.zzk(arr_b1, arr_b1.length);
                return zzdx0;
            }
        }
    }
}

