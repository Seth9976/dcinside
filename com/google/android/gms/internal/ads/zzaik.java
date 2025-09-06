package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import j..util.Objects;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class zzaik {
    public static final int zza;
    private static final byte[] zzb;

    static {
        zzaik.zzb = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int zza(int v) [...] // Inlined contents

    @Nullable
    public static zzay zzb(zzen zzen0) {
        zzem zzem0;
        zzeo zzeo0 = zzen0.zzb(0x68646C72);
        zzeo zzeo1 = zzen0.zzb(1801812339);
        zzeo zzeo2 = zzen0.zzb(0x696C7374);
        if(zzeo0 != null && zzeo1 != null && zzeo2 != null && zzaik.zzi(zzeo0.zza) == 0x6D647461) {
            zzdy zzdy0 = zzeo1.zza;
            zzdy0.zzL(12);
            int v = zzdy0.zzg();
            String[] arr_s = new String[v];
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = zzdy0.zzg();
                zzdy0.zzM(4);
                arr_s[v1] = zzdy0.zzB(v2 - 8, StandardCharsets.UTF_8);
            }
            zzdy zzdy1 = zzeo2.zza;
            zzdy1.zzL(8);
            ArrayList arrayList0 = new ArrayList();
            while(zzdy1.zzb() > 8) {
                int v3 = zzdy1.zzd() + zzdy1.zzg();
                int v4 = zzdy1.zzg() - 1;
                if(v4 < 0 || v4 >= v) {
                    zzdo.zzf("BoxParsers", "Skipped metadata with unknown key index: " + v4);
                }
                else {
                    String s = arr_s[v4];
                    while(true) {
                        zzem0 = null;
                        int v5 = zzdy1.zzd();
                        if(v5 < v3) {
                            int v6 = zzdy1.zzg();
                            if(zzdy1.zzg() == 1684108385) {
                                int v7 = zzdy1.zzg();
                                int v8 = zzdy1.zzg();
                                byte[] arr_b = new byte[v6 - 16];
                                zzdy1.zzH(arr_b, 0, v6 - 16);
                                zzem0 = new zzem(s, arr_b, v8, v7);
                            }
                            else {
                                zzdy1.zzL(v5 + v6);
                                continue;
                            }
                        }
                        break;
                    }
                    if(zzem0 != null) {
                        arrayList0.add(zzem0);
                    }
                }
                zzdy1.zzL(v3);
            }
            return arrayList0.isEmpty() ? null : new zzay(arrayList0);
        }
        return null;
    }

    public static zzay zzc(zzeo zzeo0) {
        int v12;
        zzdy zzdy0 = zzeo0.zza;
        zzdy0.zzL(8);
        zzay zzay0 = new zzay(0x8000000000000001L, new zzax[0]);
        while(zzdy0.zzb() >= 8) {
            int v = zzdy0.zzd();
            int v1 = zzdy0.zzg() + v;
            int v2 = zzdy0.zzg();
            zzay zzay1 = null;
            if(v2 == 0x6D657461) {
                zzdy0.zzL(v);
                zzdy0.zzM(8);
                zzaik.zzg(zzdy0);
                while(zzdy0.zzd() < v1) {
                    int v3 = zzdy0.zzd();
                    int v4 = zzdy0.zzg() + v3;
                    if(zzdy0.zzg() == 0x696C7374) {
                        zzdy0.zzL(v3);
                        zzdy0.zzM(8);
                        ArrayList arrayList0 = new ArrayList();
                        while(zzdy0.zzd() < v4) {
                            zzax zzax0 = zzais.zza(zzdy0);
                            if(zzax0 != null) {
                                arrayList0.add(zzax0);
                            }
                        }
                        if(!arrayList0.isEmpty()) {
                            zzay1 = new zzay(arrayList0);
                        }
                        break;
                    }
                    zzdy0.zzL(v4);
                }
                zzay0 = zzay0.zzd(zzay1);
            }
            else {
                switch(v2) {
                    case 0xA978797A: {
                        zzay0 = zzay0.zzd(zzaik.zzl(zzdy0));
                        break;
                    }
                    case 1936553057: {
                        zzdy0.zzL(v);
                        zzdy0.zzM(12);
                        while(zzdy0.zzd() < v1) {
                            int v5 = zzdy0.zzd();
                            int v6 = zzdy0.zzg();
                            if(zzdy0.zzg() == 1935766900) {
                                if(v6 >= 16) {
                                    zzdy0.zzM(4);
                                    int v7 = -1;
                                    int v8 = 0;
                                    for(int v9 = 0; v9 < 2; ++v9) {
                                        int v10 = zzdy0.zzm();
                                        int v11 = zzdy0.zzm();
                                        if(v10 == 0) {
                                            v7 = v11;
                                        }
                                        else if(v10 == 1) {
                                            v8 = v11;
                                        }
                                    }
                                    switch(v7) {
                                        case 12: {
                                            v12 = 0xF0;
                                            break;
                                        }
                                        case 13: {
                                            v12 = 120;
                                            break;
                                        }
                                        case 21: {
                                            v12 = zzdy0.zzb() < 8 || zzdy0.zzd() + 8 > v1 || (zzdy0.zzg() < 12 || zzdy0.zzg() != 1936877170) ? 0x80000001 : zzdy0.zzn();
                                            break;
                                        }
                                        default: {
                                            v12 = 0x80000001;
                                        }
                                    }
                                    if(v12 != 0x80000001) {
                                        zzay1 = new zzay(0x8000000000000001L, new zzax[]{new zzahc(((float)v12), v8)});
                                    }
                                }
                                break;
                            }
                            zzdy0.zzL(v5 + v6);
                        }
                        zzay0 = zzay0.zzd(zzay1);
                    }
                }
            }
            zzdy0.zzL(v1);
        }
        return zzay0;
    }

    public static zzew zzd(zzdy zzdy0) {
        zzdy0.zzL(8);
        return zzaik.zza(zzdy0.zzg()) == 0 ? new zzew(zzdy0.zzu(), zzdy0.zzu(), zzdy0.zzu()) : new zzew(zzdy0.zzt(), zzdy0.zzt(), zzdy0.zzu());
    }

    public static zzaje zze(zzajb zzajb0, zzen zzen0, zzadb zzadb0) throws zzbc {
        int[] arr_v28;
        int v79;
        int v69;
        int v63;
        long[] arr_v22;
        int v53;
        int[] arr_v9;
        long[] arr_v8;
        zzajb zzajb2;
        int[] arr_v7;
        long[] arr_v6;
        long v24;
        int v15;
        int[] arr_v15;
        long[] arr_v14;
        int v47;
        int v46;
        int v45;
        int v44;
        int v43;
        int v42;
        int v37;
        zzdy zzdy4;
        zzdy zzdy3;
        int v36;
        int v7;
        int v6;
        int v5;
        boolean z;
        zzaig zzaig0;
        zzajb zzajb1 = zzajb0;
        zzeo zzeo0 = zzen0.zzb(1937011578);
        if(zzeo0 == null) {
            zzeo zzeo1 = zzen0.zzb(1937013298);
            if(zzeo1 == null) {
                throw zzbc.zza("Track has no sample table size information", null);
            }
            zzaig0 = new zzaih(zzeo1);
        }
        else {
            zzaig0 = new zzaig(zzeo0, zzajb1.zzg);
        }
        int v = zzaig0.zzb();
        if(v == 0) {
            return new zzaje(zzajb0, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        if(zzajb1.zzb == 2) {
            long v1 = zzajb1.zzf;
            if(v1 > 0L) {
                zzz zzz0 = zzajb1.zzg.zzb();
                zzz0.zzI(((float)v) / (((float)v1) / 1000000.0f));
                zzajb1 = zzajb1.zza(zzz0.zzag());
            }
        }
        zzeo zzeo2 = zzen0.zzb(1937007471);
        if(zzeo2 == null) {
            zzeo2 = zzen0.zzb(0x636F3634);
            zzeo2.getClass();
            z = true;
        }
        else {
            z = false;
        }
        zzeo zzeo3 = zzen0.zzb(1937011555);
        zzeo3.getClass();
        zzeo zzeo4 = zzen0.zzb(1937011827);
        zzeo4.getClass();
        zzdy zzdy0 = zzeo4.zza;
        zzeo zzeo5 = zzen0.zzb(1937011571);
        zzdy zzdy1 = zzeo5 == null ? null : zzeo5.zza;
        zzeo zzeo6 = zzen0.zzb(0x63747473);
        zzdy zzdy2 = zzeo6 == null ? null : zzeo6.zza;
        zzahz zzahz0 = new zzahz(zzeo3.zza, zzeo2.zza, z);
        zzdy0.zzL(12);
        int v2 = zzdy0.zzp() - 1;
        int v3 = zzdy0.zzp();
        int v4 = zzdy0.zzp();
        if(zzdy2 == null) {
            v5 = 0;
        }
        else {
            zzdy2.zzL(12);
            v5 = zzdy2.zzp();
        }
        if(zzdy1 == null) {
            v6 = 0;
            v7 = -1;
        }
        else {
            zzdy1.zzL(12);
            v6 = zzdy1.zzp();
            if(v6 > 0) {
                v7 = zzdy1.zzp() - 1;
            }
            else {
                zzdy1 = null;
                v7 = -1;
            }
        }
        int v8 = zzaig0.zza();
        if(v8 == -1 || (!"audio/raw".equals(zzajb1.zzg.zzo) && !"audio/g711-mlaw".equals(zzajb1.zzg.zzo) && !"audio/g711-alaw".equals(zzajb1.zzg.zzo) || v2 != 0)) {
        label_110:
            long[] arr_v10 = new long[v];
            int[] arr_v11 = new int[v];
            long[] arr_v12 = new long[v];
            int[] arr_v13 = new int[v];
            int v25 = v2;
            int v26 = v7;
            int v27 = 0;
            long v28 = 0L;
            long v29 = 0L;
            int v30 = 0;
            int v31 = 0;
            int v32 = 0;
            int v33 = v5;
            int v34 = 0;
            while(v34 < v) {
                long v35 = v28;
                boolean z1 = true;
                while(v30 == 0) {
                    z1 = zzahz0.zza();
                    if(z1) {
                        v30 = zzahz0.zzc;
                        v35 = zzahz0.zzd;
                        continue;
                    }
                    v36 = v;
                    zzdy3 = zzdy0;
                    zzdy4 = zzdy1;
                    v37 = 0;
                    goto label_142;
                }
                v36 = v;
                zzdy3 = zzdy0;
                zzdy4 = zzdy1;
                v37 = v30;
            label_142:
                if(z1) {
                    int v38 = v32;
                    if(zzdy2 != null) {
                        while(v31 == 0) {
                            v31 = 0;
                            if(v33 > 0) {
                                --v33;
                                v31 = zzdy2.zzp();
                                v38 = zzdy2.zzg();
                            }
                            else if(true) {
                                break;
                            }
                        }
                        --v31;
                    }
                    arr_v10[v34] = v35;
                    int v39 = zzaig0.zzc();
                    arr_v11[v34] = v39;
                    if(v39 > v27) {
                        v27 = v39;
                    }
                    arr_v12[v34] = v29 + ((long)v38);
                    arr_v13[v34] = zzdy4 == null ? 1 : 0;
                    if(v34 == v26) {
                        arr_v13[v34] = 1;
                        --v6;
                        if(v6 > 0) {
                            zzdy4.getClass();
                            v26 = zzdy4.zzp() - 1;
                        }
                    }
                    v29 += (long)v4;
                    --v3;
                    if(v3 == 0) {
                        if(v25 > 0) {
                            --v25;
                            v3 = zzdy3.zzp();
                            v4 = zzdy3.zzg();
                        }
                        else {
                            v3 = 0;
                        }
                    }
                    long v40 = v35 + ((long)arr_v11[v34]);
                    v30 = v37 - 1;
                    ++v34;
                    v32 = v38;
                    v = v36;
                    zzdy0 = zzdy3;
                    v28 = v40;
                    zzdy1 = zzdy4;
                    continue;
                }
                else {
                    zzdo.zzf("BoxParsers", "Unexpected end of chunk data");
                    arr_v10 = Arrays.copyOf(arr_v10, v34);
                    arr_v11 = Arrays.copyOf(arr_v11, v34);
                    arr_v12 = Arrays.copyOf(arr_v12, v34);
                    arr_v13 = Arrays.copyOf(arr_v13, v34);
                    v = v34;
                    break;
                }
                goto label_201;
            }
            int v41 = 1;
            if(zzdy2 != null) {
                while(v33 > 0) {
                    if(zzdy2.zzp() != 0) {
                        v41 = 0;
                        break;
                    }
                    zzdy2.zzg();
                    --v33;
                }
            }
        label_201:
            if(v6 != 0) {
                v47 = v41;
                v42 = v;
                v43 = v3;
                v44 = v30;
                v45 = v25;
                zzajb2 = zzajb1;
                v46 = v31;
            label_264:
                arr_v14 = arr_v10;
                arr_v15 = arr_v11;
                zzdo.zzf("BoxParsers", "Inconsistent stbl box for track " + zzajb2.zza + ": remainingSynchronizationSamples " + v6 + ", remainingSamplesAtTimestampDelta " + v43 + ", remainingSamplesInChunk " + v44 + ", remainingTimestampDeltaChanges " + v45 + ", remainingSamplesAtTimestampOffset " + v46 + (1 == v47 ? "" : ", ctts invalid"));
            }
            else if(v3 != 0) {
                v47 = v41;
                v42 = v;
                v43 = v3;
                v44 = v30;
                v45 = v25;
                zzajb2 = zzajb1;
                v46 = v31;
                v6 = 0;
                goto label_264;
            }
            else if(v30 != 0) {
                v47 = v41;
                v42 = v;
                v44 = v30;
                v45 = v25;
                zzajb2 = zzajb1;
                v46 = v31;
                v43 = 0;
                v6 = 0;
                goto label_264;
            }
            else if(v25 != 0) {
                v47 = v41;
                v42 = v;
                v45 = v25;
                zzajb2 = zzajb1;
                v46 = v31;
                v43 = 0;
                v6 = 0;
                v44 = 0;
                goto label_264;
            }
            else if(v31 != 0) {
                v47 = v41;
                v42 = v;
                zzajb2 = zzajb1;
                v46 = v31;
                v43 = 0;
                v6 = 0;
                v44 = 0;
                v45 = 0;
                goto label_264;
            }
            else if(v41 == 0) {
                v42 = v;
                zzajb2 = zzajb1;
                v43 = 0;
                v6 = 0;
                v44 = 0;
                v45 = 0;
                v46 = 0;
                v47 = 0;
                goto label_264;
            }
            else {
                v42 = v;
                arr_v14 = arr_v10;
                arr_v15 = arr_v11;
                zzajb2 = zzajb1;
            }
            arr_v8 = arr_v12;
            v24 = v29 + ((long)v32);
            v = v42;
            arr_v9 = arr_v15;
            v15 = v27;
            arr_v7 = arr_v13;
            arr_v6 = arr_v14;
        }
        else if(v5 == 0 && v6 == 0) {
            int v9 = zzahz0.zza;
            long[] arr_v = new long[v9];
            int[] arr_v1 = new int[v9];
            while(zzahz0.zza()) {
                int v10 = zzahz0.zzb;
                arr_v[v10] = zzahz0.zzd;
                arr_v1[v10] = zzahz0.zzc;
            }
            int v12 = 0;
            for(int v11 = 0; v11 < v9; ++v11) {
                v12 += (arr_v1[v11] + 0x2000 / v8 - 1) / (0x2000 / v8);
            }
            long[] arr_v2 = new long[v12];
            int[] arr_v3 = new int[v12];
            long[] arr_v4 = new long[v12];
            int[] arr_v5 = new int[v12];
            int v13 = 0;
            int v14 = 0;
            v15 = 0;
            for(int v16 = 0; v14 < v9; v16 = v20) {
                int v17 = arr_v1[v14];
                long v18 = arr_v[v14];
                int v19 = v15;
                int v20 = v16;
                int v21 = v17;
                while(v21 > 0) {
                    int v22 = Math.min(0x2000 / v8, v21);
                    arr_v2[v20] = v18;
                    int v23 = v8 * v22;
                    arr_v3[v20] = v23;
                    v19 = Math.max(v19, v23);
                    arr_v4[v20] = ((long)v13) * ((long)v4);
                    arr_v5[v20] = 1;
                    v18 += (long)arr_v3[v20];
                    v13 += v22;
                    v21 -= v22;
                    ++v20;
                }
                ++v14;
                v15 = v19;
            }
            v24 = ((long)v4) * ((long)v13);
            arr_v6 = arr_v2;
            arr_v7 = arr_v5;
            zzajb2 = zzajb1;
            arr_v8 = arr_v4;
            arr_v9 = arr_v3;
        }
        else {
            v2 = 0;
            goto label_110;
        }
        RoundingMode roundingMode0 = RoundingMode.DOWN;
        long v48 = zzei.zzu(v24, 1000000L, zzajb2.zzc, roundingMode0);
        long[] arr_v16 = zzajb2.zzi;
        if(arr_v16 == null) {
            zzei.zzF(arr_v8, 1000000L, zzajb2.zzc);
            return new zzaje(zzajb2, arr_v6, arr_v9, v15, arr_v8, arr_v7, v48);
        }
        if(arr_v16.length != 1 || zzajb2.zzb != 1 || arr_v8.length < 2) {
            v53 = v;
        }
        else {
            zzajb2.zzj.getClass();
            long v49 = zzajb2.zzj[0];
            long v50 = v49 + zzei.zzu(arr_v16[0], zzajb2.zzc, zzajb2.zzd, roundingMode0);
            long v51 = arr_v8[0];
            if(v51 > v49 || v49 >= arr_v8[Math.max(0, Math.min(4, arr_v8.length - 1))] || arr_v8[Math.max(0, Math.min(arr_v8.length - 4, arr_v8.length - 1))] >= v50 || v50 > v24) {
                v53 = v;
            }
            else {
                long v52 = zzei.zzu(v49 - v51, zzajb2.zzg.zzE, zzajb2.zzc, roundingMode0);
                v53 = v;
                long v54 = zzei.zzu(v24 - v50, zzajb2.zzg.zzE, zzajb2.zzc, roundingMode0);
                if(v52 != 0L) {
                label_292:
                    if(v52 <= 0x7FFFFFFFL && v54 <= 0x7FFFFFFFL) {
                        zzadb0.zza = (int)v52;
                        zzadb0.zzb = (int)v54;
                        zzei.zzF(arr_v8, 1000000L, zzajb2.zzc);
                        return new zzaje(zzajb2, arr_v6, arr_v9, v15, arr_v8, arr_v7, zzei.zzu(zzajb2.zzi[0], 1000000L, zzajb2.zzd, roundingMode0));
                    }
                }
                else if(v54 != 0L) {
                    v52 = 0L;
                    goto label_292;
                }
            }
        }
        long[] arr_v17 = zzajb2.zzi;
        int v55 = arr_v17.length;
        if(v55 == 1) {
            if(arr_v17[0] == 0L) {
                zzajb2.zzj.getClass();
                long v56 = zzajb2.zzj[0];
                for(int v57 = 0; v57 < arr_v8.length; ++v57) {
                    arr_v8[v57] = zzei.zzu(arr_v8[v57] - v56, 1000000L, zzajb2.zzc, RoundingMode.DOWN);
                }
                return new zzaje(zzajb2, arr_v6, arr_v9, v15, arr_v8, arr_v7, zzei.zzu(v24 - v56, 1000000L, zzajb2.zzc, RoundingMode.DOWN));
            }
            v55 = 1;
        }
        boolean z2 = zzajb2.zzb == 1;
        long[] arr_v18 = zzajb2.zzj;
        int[] arr_v19 = new int[v55];
        int[] arr_v20 = new int[v55];
        arr_v18.getClass();
        int v58 = 0;
        int v59 = 0;
        int v60 = 0;
        int v61 = 0;
        while(true) {
            long[] arr_v21 = zzajb2.zzi;
            if(v61 >= arr_v21.length) {
                break;
            }
            long v62 = arr_v18[v61];
            if(v62 == -1L) {
                arr_v22 = arr_v6;
                v63 = v53;
                v69 = v59;
            }
            else {
                arr_v22 = arr_v6;
                v63 = v53;
                int v64 = v60;
                long v65 = zzei.zzu(arr_v21[v61], zzajb2.zzc, zzajb2.zzd, RoundingMode.DOWN);
                arr_v19[v61] = zzei.zzd(arr_v8, v62, true, true);
                while(true) {
                    int v66 = arr_v19[v61];
                    if(v66 < 0 || (arr_v7[v66] & 1) != 0) {
                        break;
                    }
                    arr_v19[v61] = v66 - 1;
                }
                long v67 = v62 + v65;
                v60 = zzei.zza(arr_v8, v67, z2, false);
                arr_v20[v61] = v60;
                if(zzajb2.zzb == 2) {
                    while(true) {
                        v60 = arr_v20[v61];
                        if(v60 >= arr_v8.length - 1 || arr_v8[v60 + 1] > v67) {
                            break;
                        }
                        arr_v20[v61] = v60 + 1;
                    }
                }
                int v68 = arr_v19[v61];
                v58 += v60 - v68;
                v69 = v59 | (v64 == v68 ? 0 : 1);
            }
            ++v61;
            v53 = v63;
            v59 = v69;
            arr_v6 = arr_v22;
        }
        int[] arr_v23 = arr_v9;
        int v70 = v59 | (v58 == v53 ? 0 : 1);
        long[] arr_v24 = v70 == 0 ? arr_v6 : new long[v58];
        int[] arr_v25 = v70 == 0 ? arr_v23 : new int[v58];
        if(1 == v70) {
            v15 = 0;
        }
        int[] arr_v26 = v70 == 0 ? arr_v7 : new int[v58];
        long[] arr_v27 = new long[v58];
        int v71 = 0;
        long v72 = 0L;
        int v73 = 0;
        int v74 = 0;
        while(v71 < zzajb2.zzi.length) {
            long v75 = zzajb2.zzj[v71];
            int v76 = arr_v19[v71];
            int v77 = arr_v20[v71];
            if(v70 == 0) {
                v79 = v73;
                arr_v28 = arr_v23;
            }
            else {
                int v78 = v77 - v76;
                v79 = v73;
                System.arraycopy(arr_v6, v76, arr_v24, v74, v78);
                arr_v28 = arr_v23;
                System.arraycopy(arr_v28, v76, arr_v25, v74, v78);
                System.arraycopy(arr_v7, v76, arr_v26, v74, v78);
            }
            int v80 = v79;
            int v81 = v15;
            while(v76 < v77) {
                RoundingMode roundingMode1 = RoundingMode.DOWN;
                long v82 = zzei.zzu(v72, 1000000L, zzajb2.zzd, roundingMode1);
                long v83 = zzei.zzu(arr_v8[v76] - v75, 1000000L, zzajb2.zzc, roundingMode1);
                v80 |= (v83 >= 0L ? 1 : 0) ^ 1;
                arr_v27[v74] = v82 + v83;
                if(v70 != 0 && arr_v25[v74] > v81) {
                    v81 = arr_v28[v76];
                }
                ++v74;
                ++v76;
            }
            v72 += zzajb2.zzi[v71];
            ++v71;
            v15 = v81;
            arr_v23 = arr_v28;
            v73 = v80;
        }
        long v84 = zzei.zzu(v72, 1000000L, zzajb2.zzd, RoundingMode.DOWN);
        if(v73 != 0) {
            zzz zzz1 = zzajb2.zzg.zzb();
            zzz1.zzJ(true);
            return new zzaje(zzajb2.zza(zzz1.zzag()), arr_v24, arr_v25, v15, arr_v27, arr_v26, v84);
        }
        return new zzaje(zzajb2, arr_v24, arr_v25, v15, arr_v27, arr_v26, v84);
    }

    // This method was un-flattened
    public static List zzf(zzen zzen0, zzadb zzadb0, long v, @Nullable zzu zzu0, boolean z, boolean z1, zzfuc zzfuc0) throws zzbc {
        String s1;
        ArrayList arrayList1;
        int v3;
        long[] arr_v3;
        long[] arr_v2;
        Pair pair1;
        zzfxn zzfxn1;
        long v104;
        String s10;
        int v103;
        int v102;
        zzaif zzaif4;
        int v101;
        int v100;
        int v72;
        int v71;
        zzfh zzfh1;
        int v67;
        int v66;
        int v65;
        int v99;
        boolean z5;
        int v98;
        boolean z4;
        zzaif zzaif3;
        boolean z3;
        int v89;
        int v64;
        zzaif zzaif2;
        List list2;
        int v63;
        boolean z2;
        int v61;
        int v60;
        int v59;
        int v47;
        String s5;
        zzu zzu1;
        zzaif zzaif1;
        zzdy zzdy3;
        zzen zzen9;
        ArrayList arrayList4;
        int v41;
        int v40;
        String s4;
        String s3;
        int v39;
        zzen zzen8;
        zzaii zzaii1;
        long v38;
        int v20;
        long v12;
        zzen zzen4;
        long v10;
        int v9;
        zzen zzen3;
        zzajb zzajb0;
        ArrayList arrayList2;
        int v4;
        String s = "video/hevc";
        int v1 = 8;
        ArrayList arrayList0 = new ArrayList();
        int v2 = 0;
        while(v2 < zzen0.zzc.size()) {
            zzen zzen1 = (zzen)zzen0.zzc.get(v2);
            if(zzen1.zzd == 1953653099) {
                zzeo zzeo0 = zzen0.zzb(0x6D766864);
                zzeo0.getClass();
                zzen zzen2 = zzen1.zza(0x6D646961);
                zzen2.getClass();
                zzeo zzeo1 = zzen2.zzb(0x68646C72);
                zzeo1.getClass();
                switch(zzaik.zzi(zzeo1.zza)) {
                    case 0x6D657461: {
                        v4 = 5;
                        break;
                    }
                    case 0x736F756E: {
                        v4 = 1;
                        break;
                    }
                    case 0x636C6370: 
                    case 0x7362746C: 
                    case 1937072756: 
                    case 1952807028: {
                        v4 = 3;
                        break;
                    }
                    case 0x76696465: {
                        v4 = 2;
                        break;
                    }
                    default: {
                        v3 = v2;
                        arrayList2 = arrayList0;
                        s1 = s;
                        zzajb0 = null;
                        zzen3 = zzen1;
                        goto label_772;
                    }
                }
                zzeo zzeo2 = zzen1.zzb(0x746B6864);
                zzeo2.getClass();
                zzdy zzdy0 = zzeo2.zza;
                zzdy0.zzL(8);
                int v5 = zzaik.zza(zzdy0.zzg());
                if(v5 != 0) {
                    v1 = 16;
                }
                zzdy0.zzM(v1);
                int v6 = zzdy0.zzg();
                zzdy0.zzM(4);
                int v7 = zzdy0.zzd();
                int v8 = 0;
                while(true) {
                    v9 = v5 == 0 ? 4 : 8;
                    v10 = 0x8000000000000001L;
                    if(v8 >= v9) {
                        break;
                    }
                    if(zzdy0.zzN()[v7 + v8] != -1) {
                        long v11 = v5 == 0 ? zzdy0.zzu() : zzdy0.zzw();
                        if(v11 == 0L) {
                            goto label_55;
                        }
                        else {
                            zzen4 = zzen1;
                            v12 = v11;
                            goto label_57;
                        }
                    }
                    ++v8;
                }
                zzdy0.zzM(v9);
            label_55:
                zzen4 = zzen1;
                v12 = 0x8000000000000001L;
            label_57:
                zzdy0.zzM(16);
                int v13 = zzdy0.zzg();
                int v14 = v2;
                int v15 = zzdy0.zzg();
                int v16 = v4;
                zzdy0.zzM(4);
                int v17 = zzdy0.zzg();
                int v18 = zzdy0.zzg();
                ArrayList arrayList3 = arrayList0;
                int v19 = 0x10000;
                zzen zzen5 = zzen4;
                if(v13 == 0) {
                    if(v15 == 0x10000) {
                        if(v17 == 0xFFFF0000) {
                            if(v18 == 0) {
                                v20 = 90;
                                goto label_94;
                            }
                            else {
                                v15 = 0x10000;
                                v13 = 0;
                                v17 = 0xFFFF0000;
                                goto label_80;
                            }
                            goto label_78;
                        }
                        else {
                        label_78:
                            v15 = 0x10000;
                        }
                    }
                    v13 = 0;
                }
            label_80:
                if(v13 == 0) {
                    if(v15 == 0xFFFF0000) {
                        if(v17 != 0x10000) {
                            v19 = v17;
                        }
                        else if(v18 == 0) {
                            v20 = 270;
                            goto label_94;
                        }
                        v15 = 0xFFFF0000;
                    }
                    else {
                        v19 = v17;
                    }
                    v13 = 0;
                }
                else {
                    v19 = v17;
                }
                v20 = v13 != 0xFFFF0000 || v15 != 0 || v19 != 0 || v18 != 0xFFFF0000 ? 0 : 180;
            label_94:
                zzaii zzaii0 = new zzaii(v6, v12, v20);
                long v21 = v == 0x8000000000000001L ? zzaii0.zzb : v;
                long v22 = zzaik.zzd(zzeo0.zza).zzc;
                long v23 = v21 == 0x8000000000000001L ? 0x8000000000000001L : zzei.zzu(v21, 1000000L, v22, RoundingMode.DOWN);
                zzen zzen6 = zzen2.zza(1835626086);
                zzen6.getClass();
                zzen zzen7 = zzen6.zza(1937007212);
                zzen7.getClass();
                zzeo zzeo3 = zzen2.zzb(0x6D646864);
                zzeo3.getClass();
                zzdy zzdy1 = zzeo3.zza;
                zzdy1.zzL(8);
                int v24 = zzaik.zza(zzdy1.zzg());
                zzdy1.zzM((v24 == 0 ? 8 : 16));
                long v25 = zzdy1.zzu();
                int v26 = zzdy1.zzd();
                int v27 = 0;
                while(true) {
                    int v28 = v24 == 0 ? 4 : 8;
                    if(v27 < v28) {
                        if(zzdy1.zzN()[v26 + v27] == -1) {
                            ++v27;
                            continue;
                        }
                        else {
                            long v29 = v24 == 0 ? zzdy1.zzu() : zzdy1.zzw();
                            if(v29 != 0L) {
                                v10 = zzei.zzu(v29, 1000000L, v25, RoundingMode.DOWN);
                            }
                            break;
                        }
                    }
                    zzdy1.zzM(v28);
                    break;
                }
                int v30 = zzdy1.zzq();
                zzaic zzaic0 = new zzaic(v25, v10, ((char)((v30 >> 10 & 0x1F) + 0x60)) + ((char)((v30 >> 5 & 0x1F) + 0x60)) + ((char)((v30 & 0x1F) + 0x60)));
                zzeo zzeo4 = zzen7.zzb(1937011556);
                if(zzeo4 == null) {
                    throw zzbc.zza("Malformed sample table (stbl) missing sample description (stsd)", null);
                }
                int v31 = zzaii0.zza;
                int v32 = zzaii0.zzc;
                String s2 = zzaic0.zzc;
                zzdy zzdy2 = zzeo4.zza;
                zzdy2.zzL(12);
                int v33 = zzdy2.zzg();
                zzaif zzaif0 = new zzaif(v33);
                int v34 = 0;
                while(v34 < v33) {
                    int v35 = zzdy2.zzd();
                    int v36 = zzdy2.zzg();
                    zzacr.zzb(v36 > 0, "childAtomSize must be positive");
                    int v37 = zzdy2.zzg();
                    switch(v37) {
                        case 0x63616D6D: {
                            zzz zzz2 = new zzz();
                            zzz2.zzL(v31);
                            zzz2.zzaa("application/x-camera-motion");
                            zzaif0.zzb = zzz2.zzag();
                            goto label_705;
                        }
                        case 0x69616D66: {
                            v38 = v22;
                            zzaii1 = zzaii0;
                            zzen8 = zzen5;
                            v39 = v33;
                        label_682:
                            v40 = v14;
                            s4 = s;
                            zzdy3 = zzdy2;
                            s3 = s2;
                            zzen9 = zzen8;
                            arrayList4 = arrayList3;
                            v41 = v16;
                            zzaik.zzo(zzdy2, v37, v35, v36, v31, s3, z1, zzu0, zzaif0, v34);
                            v100 = v35;
                            v101 = v36;
                            v47 = v34;
                            zzaif4 = zzaif0;
                            v102 = v32;
                            v103 = v31;
                            break;
                        }
                        case 0x6D657474: {
                            zzdy2.zzL(v35 + 16);
                            zzdy2.zzy('\u0000');
                            String s11 = zzdy2.zzy('\u0000');
                            if(s11 != null) {
                                zzz zzz3 = new zzz();
                                zzz3.zzL(v31);
                                zzz3.zzaa(s11);
                                zzaif0.zzb = zzz3.zzag();
                            }
                        label_705:
                            s3 = s2;
                            v38 = v22;
                            zzaii1 = zzaii0;
                        label_708:
                            s4 = s;
                            zzaif4 = zzaif0;
                            v47 = v34;
                            v40 = v14;
                            v41 = v16;
                            arrayList4 = arrayList3;
                            zzen9 = zzen5;
                            v39 = v33;
                            v100 = v35;
                            zzdy3 = zzdy2;
                            v103 = v31;
                            v101 = v36;
                            v102 = v32;
                            break;
                        }
                        case 0x2E6D7032: 
                        case 0x2E6D7033: 
                        case 0x4F707573: 
                        case 0x61632D33: 
                        case 0x61632D34: 
                        case 0x616C6163: 
                        case 0x616C6177: 
                        case 0x64747363: 
                        case 0x64747365: 
                        case 1685353320: 
                        case 0x6474736C: 
                        case 0x64747378: 
                        case 1700998451: 
                        case 1701733217: 
                        case 0x664C6143: 
                        case 0x6C70636D: 
                        case 0x6D686131: 
                        case 1835560241: 
                        case 0x6D6C7061: 
                        case 0x6D703461: 
                        case 1935764850: 
                        case 0x73617762: 
                        case 0x736F7774: 
                        case 0x74776F73: 
                        case 1970037111: {
                            v38 = v22;
                            zzaii1 = zzaii0;
                            zzen8 = zzen5;
                            v39 = v33;
                            goto label_682;
                        }
                        case 1211250227: 
                        case 0x61763031: 
                        case 0x61766331: 
                        case 0x61766333: 
                        case 0x64766131: 
                        case 0x64766176: 
                        case 0x64766831: 
                        case 0x64766865: 
                        case 1701733238: 
                        case 0x68323633: 
                        case 0x68657631: 
                        case 1752589105: 
                        case 0x6D317620: 
                        case 1836070006: 
                        case 1932670515: 
                        case 0x76703038: 
                        case 0x76703039: {
                            s3 = s2;
                            v38 = v22;
                            zzaii1 = zzaii0;
                            s4 = s;
                            v40 = v14;
                            v41 = v16;
                            arrayList4 = arrayList3;
                            zzen9 = zzen5;
                            v39 = v33;
                            zzdy3 = zzdy2;
                            zzdy3.zzL(v35 + 16);
                            zzdy3.zzM(16);
                            int v42 = zzdy3.zzq();
                            int v43 = zzdy3.zzq();
                            zzdy3.zzM(50);
                            int v44 = zzdy3.zzd();
                            if(v37 == 1701733238) {
                                Pair pair0 = zzaik.zzj(zzdy3, v35, v36);
                                if(pair0 == null) {
                                    zzaif1 = zzaif0;
                                    zzu1 = zzu0;
                                    v37 = 1701733238;
                                }
                                else {
                                    int v45 = (int)(((Integer)pair0.first));
                                    if(zzu0 == null) {
                                        zzaif1 = zzaif0;
                                        zzu1 = null;
                                    }
                                    else {
                                        zzu1 = zzu0.zzb(((zzajc)pair0.second).zzb);
                                        zzaif1 = zzaif0;
                                    }
                                    zzaif1.zza[v34] = (zzajc)pair0.second;
                                    v37 = v45;
                                }
                                zzdy3.zzL(v44);
                            }
                            else {
                                zzaif1 = zzaif0;
                                zzu1 = zzu0;
                            }
                            if(v37 == 0x6D317620) {
                                s5 = "video/mpeg";
                            }
                            else if(v37 == 1211250227) {
                                s5 = "video/3gpp";
                                v37 = 1211250227;
                            }
                            else {
                                s5 = null;
                            }
                            int v46 = v37;
                            String s6 = s5;
                            v47 = v34;
                            List list0 = null;
                            zzfh zzfh0 = null;
                            int v48 = -1;
                            int v49 = 8;
                            int v50 = -1;
                            int v51 = -1;
                            int v52 = 8;
                            int v53 = 0;
                            int v54 = -1;
                            ByteBuffer byteBuffer0 = null;
                            zzaia zzaia0 = null;
                            String s7 = null;
                            byte[] arr_b = null;
                            float f = 1.0f;
                            int v55 = v44;
                            int v56 = -1;
                            while(v55 - v35 < v36) {
                                zzdy3.zzL(v55);
                                int v57 = zzdy3.zzd();
                                int v58 = zzdy3.zzg();
                                if(v58 == 0) {
                                    v59 = v55;
                                    if(zzdy3.zzd() - v35 == v36) {
                                        break;
                                    }
                                    else {
                                        v60 = 0;
                                        goto label_220;
                                    }
                                    goto label_218;
                                }
                                else {
                                label_218:
                                    v59 = v55;
                                    v60 = v58;
                                }
                            label_220:
                                if(v60 > 0) {
                                    v61 = v35;
                                    z2 = true;
                                }
                                else {
                                    v61 = v35;
                                    z2 = false;
                                }
                                zzacr.zzb(z2, "childAtomSize must be positive");
                                int v62 = zzdy3.zzg();
                                if(v62 == 0x61766343) {
                                    zzacr.zzb(s6 == null, null);
                                    zzdy3.zzL(v57 + 8);
                                    zzabr zzabr0 = zzabr.zza(zzdy3);
                                    List list1 = zzabr0.zza;
                                    zzaif1.zzc = zzabr0.zzb;
                                    if(v53 == 0) {
                                        f = zzabr0.zzk;
                                        v63 = 0;
                                    }
                                    else {
                                        v63 = 1;
                                    }
                                    v51 = zzabr0.zzh;
                                    list2 = list1;
                                    zzaif2 = zzaif1;
                                    s7 = zzabr0.zzl;
                                    v54 = zzabr0.zzj;
                                    s6 = "video/avc";
                                    v64 = v46;
                                    v49 = zzabr0.zzf;
                                    v53 = v63;
                                    v48 = zzabr0.zzg;
                                    v50 = zzabr0.zzi;
                                    v52 = zzabr0.zze;
                                }
                                else {
                                alab1:
                                    switch(v62) {
                                        case 0x68766343: {
                                            zzacr.zzb(s6 == null, null);
                                            zzdy3.zzL(v57 + 8);
                                            zzadc zzadc0 = zzadc.zza(zzdy3);
                                            List list3 = zzadc0.zza;
                                            zzaif1.zzc = zzadc0.zzb;
                                            if(v53 == 0) {
                                                f = zzadc0.zzi;
                                                v89 = 0;
                                            }
                                            else {
                                                v89 = 1;
                                            }
                                            v51 = zzadc0.zzf;
                                            list2 = list3;
                                            v53 = v89;
                                            v54 = zzadc0.zzj;
                                            s7 = zzadc0.zzk;
                                            zzaif2 = zzaif1;
                                            v48 = zzadc0.zze;
                                            v50 = zzadc0.zzg;
                                            v64 = v46;
                                            zzfh0 = zzadc0.zzl;
                                            v52 = zzadc0.zzc;
                                            s6 = s4;
                                            v49 = zzadc0.zzd;
                                            v56 = zzadc0.zzh == -1 ? v56 : zzadc0.zzh;
                                            break;
                                        }
                                        case 0x6C687643: {
                                            zzacr.zzb(s4.equals(s6), "lhvC must follow hvcC atom");
                                            if(zzfh0 == null) {
                                                z3 = false;
                                                zzfh0 = null;
                                            }
                                            else if(zzfh0.zza.size() >= 2) {
                                                z3 = true;
                                            }
                                            else {
                                                z3 = false;
                                            }
                                            zzacr.zzb(z3, "must have at least two layers");
                                            zzdy3.zzL(v57 + 8);
                                            zzfh0.getClass();
                                            zzadc zzadc1 = zzadc.zzb(zzdy3, zzfh0);
                                            zzacr.zzb(zzaif1.zzc == zzadc1.zzb, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                                            int v90 = zzadc1.zze;
                                            if(v90 != -1) {
                                                zzacr.zzb(v48 == v90, "colorSpace must be the same for both views");
                                            }
                                            int v91 = zzadc1.zzf;
                                            if(v91 != -1) {
                                                zzacr.zzb(v51 == v91, "colorRange must be the same for both views");
                                            }
                                            int v92 = zzadc1.zzg;
                                            if(v92 != -1) {
                                                zzacr.zzb(v50 == v92, "colorTransfer must be the same for both views");
                                            }
                                            zzacr.zzb(v52 == zzadc1.zzc, "bitdepthLuma must be the same for both views");
                                            zzacr.zzb(v49 == zzadc1.zzd, "bitdepthChroma must be the same for both views");
                                            if(list0 == null) {
                                                zzacr.zzb(false, "initializationData must be already set from hvcC atom");
                                            }
                                            else {
                                                zzfxk zzfxk0 = new zzfxk();
                                                zzfxk0.zzh(list0);
                                                zzfxk0.zzh(zzadc1.zza);
                                                list0 = zzfxk0.zzi();
                                            }
                                            s7 = zzadc1.zzk;
                                            list2 = list0;
                                            s6 = "video/mv-hevc";
                                            zzaif2 = zzaif1;
                                            v64 = v46;
                                            break;
                                        }
                                        case 0x76657875: {
                                            zzdy3.zzL(v57 + 8);
                                            int v93 = zzdy3.zzd();
                                            zzaib zzaib0 = null;
                                            while(v93 - v57 < v60) {
                                                zzdy3.zzL(v93);
                                                int v94 = zzdy3.zzg();
                                                if(v94 > 0) {
                                                    zzaif3 = zzaif1;
                                                    z4 = true;
                                                }
                                                else {
                                                    zzaif3 = zzaif1;
                                                    z4 = false;
                                                }
                                                zzacr.zzb(z4, "childAtomSize must be positive");
                                                if(zzdy3.zzg() == 1702454643) {
                                                    zzdy3.zzL(v93 + 8);
                                                    int v95 = zzdy3.zzd();
                                                    while(v95 - v93 < v94) {
                                                        zzdy3.zzL(v95);
                                                        int v96 = zzdy3.zzg();
                                                        zzacr.zzb(v96 > 0, "childAtomSize must be positive");
                                                        if(zzdy3.zzg() == 1937011305) {
                                                            zzdy3.zzM(4);
                                                            int v97 = zzdy3.zzm();
                                                            if((v97 & 2) == 2) {
                                                                v98 = v52;
                                                                z5 = true;
                                                            }
                                                            else {
                                                                v98 = v52;
                                                                z5 = false;
                                                            }
                                                            v99 = v51;
                                                            zzaib0 = new zzaib(new zzaie(1 == (v97 & 1), z5, (v97 & 8) == 8, (v97 & 4) == 4));
                                                            goto label_551;
                                                        }
                                                        v95 += v96;
                                                    }
                                                    v99 = v51;
                                                    v98 = v52;
                                                    zzaib0 = null;
                                                }
                                                else {
                                                    v99 = v51;
                                                    v98 = v52;
                                                }
                                            label_551:
                                                v93 += v94;
                                                zzaif1 = zzaif3;
                                                v52 = v98;
                                                v51 = v99;
                                            }
                                            zzaif2 = zzaif1;
                                            v65 = v49;
                                            v66 = v51;
                                            v67 = v52;
                                            zzaij zzaij0 = zzaib0 == null ? null : new zzaij(zzaib0);
                                            if(zzaij0 == null) {
                                                list2 = list0;
                                                v64 = v46;
                                            }
                                            else {
                                                if(zzfh0 == null) {
                                                    zzfh0 = null;
                                                }
                                                else if(zzfh0.zza.size() >= 2) {
                                                    zzacr.zzb(zzaij0.zzb(), "both eye views must be marked as available");
                                                    zzacr.zzb(!zzaij0.zza.zza.zzc, "for MV-HEVC, eye_views_reversed must be set to false");
                                                    list2 = list0;
                                                    v64 = v46;
                                                    goto label_589;
                                                }
                                                if(v56 == -1) {
                                                    list2 = list0;
                                                    v64 = v46;
                                                    v49 = v65;
                                                    v52 = v67;
                                                    v51 = v66;
                                                    v56 = zzaij0.zza.zza.zzc ? 5 : 4;
                                                }
                                                else {
                                                    list2 = list0;
                                                    v64 = v46;
                                                    v49 = v65;
                                                    v52 = v67;
                                                    v51 = v66;
                                                }
                                                break;
                                            }
                                        label_589:
                                            zzfh1 = zzfh0;
                                        label_590:
                                            zzfh0 = zzfh1;
                                            v49 = v65;
                                            v52 = v67;
                                            v51 = v66;
                                            break;
                                        }
                                        default: {
                                            zzaif2 = zzaif1;
                                            v65 = v49;
                                            v66 = v51;
                                            v67 = v52;
                                            if(v62 == 1685480259) {
                                            label_440:
                                                list2 = list0;
                                                v64 = v46;
                                                zzfh1 = zzfh0;
                                                zzacj zzacj0 = zzacj.zza(zzdy3);
                                                if(zzacj0 != null) {
                                                    s7 = zzacj0.zza;
                                                    s6 = "video/dolby-vision";
                                                }
                                            }
                                            else {
                                                switch(v62) {
                                                    case 0x61763143: {
                                                        byte[] arr_b2 = new byte[v60 - 8];
                                                        zzdy3.zzH(arr_b2, 0, v60 - 8);
                                                        zzfxn zzfxn0 = zzfxn.zzo(arr_b2);
                                                        zzdy3.zzL(v57 + 8);
                                                        zzk zzk0 = zzaik.zzk(zzdy3);
                                                        list2 = zzfxn0;
                                                        v49 = zzk0.zzg;
                                                        v48 = zzk0.zzb;
                                                        v51 = zzk0.zzc;
                                                        v64 = v46;
                                                        s6 = "video/av01";
                                                        v50 = zzk0.zzd;
                                                        v52 = zzk0.zzf;
                                                        break alab1;
                                                    }
                                                    case 1668050025: {
                                                        if(byteBuffer0 == null) {
                                                            byteBuffer0 = zzaik.zzn();
                                                        }
                                                        byteBuffer0.position(21);
                                                        byteBuffer0.putShort(zzdy3.zzE());
                                                        byteBuffer0.putShort(zzdy3.zzE());
                                                        list2 = list0;
                                                        v64 = v46;
                                                        v49 = v65;
                                                        v52 = v67;
                                                        v51 = v66;
                                                        break alab1;
                                                    }
                                                    case 0x64767643: {
                                                        goto label_440;
                                                    }
                                                    case 1835295606: {
                                                        if(byteBuffer0 == null) {
                                                            byteBuffer0 = zzaik.zzn();
                                                        }
                                                        int v79 = zzdy3.zzE();
                                                        int v80 = zzdy3.zzE();
                                                        int v81 = zzdy3.zzE();
                                                        int v82 = zzdy3.zzE();
                                                        int v83 = zzdy3.zzE();
                                                        int v84 = zzdy3.zzE();
                                                        v64 = v46;
                                                        int v85 = zzdy3.zzE();
                                                        int v86 = zzdy3.zzE();
                                                        long v87 = zzdy3.zzu();
                                                        long v88 = zzdy3.zzu();
                                                        list2 = list0;
                                                        byteBuffer0.position(1);
                                                        byteBuffer0.putShort(((short)v83));
                                                        byteBuffer0.putShort(((short)v84));
                                                        byteBuffer0.putShort(((short)v79));
                                                        byteBuffer0.putShort(((short)v80));
                                                        byteBuffer0.putShort(((short)v81));
                                                        byteBuffer0.putShort(((short)v82));
                                                        byteBuffer0.putShort(((short)v85));
                                                        byteBuffer0.putShort(((short)v86));
                                                        byteBuffer0.putShort(((short)(((int)(v87 / 10000L)))));
                                                        byteBuffer0.putShort(((short)(((int)(v88 / 10000L)))));
                                                        v49 = v65;
                                                        v52 = v67;
                                                        v51 = v66;
                                                        break alab1;
                                                    }
                                                    case 0x76706343: {
                                                        zzacr.zzb(s6 == null, null);
                                                        zzdy3.zzL(v57 + 12);
                                                        byte b = (byte)zzdy3.zzm();
                                                        byte b1 = (byte)zzdy3.zzm();
                                                        int v76 = zzdy3.zzm();
                                                        int v77 = v76 >> 4;
                                                        int v78 = v76 >> 1;
                                                        String s9 = v46 == 0x76703038 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                        if(s9.equals("video/x-vnd.on2.vp9")) {
                                                            list0 = zzfxn.zzo(new byte[]{1, 1, b, 2, 1, b1, 3, 1, ((byte)v77), 4, 1, ((byte)(v78 & 7))});
                                                        }
                                                        v48 = zzk.zza(zzdy3.zzm());
                                                        list2 = list0;
                                                        v51 = 1 == (v76 & 1) ? 1 : 2;
                                                        v64 = v46;
                                                        v52 = v77;
                                                        s6 = s9;
                                                        v50 = zzk.zzb(zzdy3.zzm());
                                                        v49 = v52;
                                                        break alab1;
                                                    }
                                                    default: {
                                                        list2 = list0;
                                                        zzfh1 = zzfh0;
                                                        v64 = v46;
                                                        switch(v62) {
                                                            case 0x636F6C72: {
                                                                if(v48 == -1) {
                                                                    if(v50 == -1) {
                                                                        int v68 = zzdy3.zzg();
                                                                        if(v68 == 1852009571 || v68 == 1852009592) {
                                                                            int v69 = zzdy3.zzq();
                                                                            int v70 = zzdy3.zzq();
                                                                            zzdy3.zzM(2);
                                                                            if(v60 == 19) {
                                                                                if((zzdy3.zzm() & 0x80) == 0) {
                                                                                    v60 = 19;
                                                                                    v71 = zzk.zza(v69);
                                                                                    goto label_289;
                                                                                }
                                                                                else {
                                                                                    v60 = 19;
                                                                                    v71 = zzk.zza(v69);
                                                                                    v72 = 1;
                                                                                    goto label_290;
                                                                                }
                                                                                goto label_288;
                                                                            }
                                                                            else {
                                                                            label_288:
                                                                                v71 = zzk.zza(v69);
                                                                            }
                                                                        label_289:
                                                                            v72 = 2;
                                                                        label_290:
                                                                            v48 = v71;
                                                                            v50 = zzk.zzb(v70);
                                                                            v51 = v72;
                                                                            zzfh0 = zzfh1;
                                                                            v49 = v65;
                                                                            v52 = v67;
                                                                        }
                                                                        else {
                                                                            zzdo.zzf("BoxParsers", "Unsupported color type: " + zzeq.zze(v68));
                                                                            zzfh0 = zzfh1;
                                                                            v49 = v65;
                                                                            v52 = v67;
                                                                            v51 = v66;
                                                                            v48 = -1;
                                                                            v50 = -1;
                                                                        }
                                                                    }
                                                                    else {
                                                                        zzfh0 = zzfh1;
                                                                        v49 = v65;
                                                                        v52 = v67;
                                                                        v51 = v66;
                                                                        v48 = -1;
                                                                    }
                                                                    break alab1;
                                                                }
                                                                break;
                                                            }
                                                            case 1702061171: {
                                                                zzacr.zzb(s6 == null, null);
                                                                zzaia zzaia1 = zzaik.zzm(zzdy3, v57);
                                                                String s8 = zzaia1.zza;
                                                                byte[] arr_b1 = zzaia1.zzb;
                                                                if(arr_b1 == null) {
                                                                    zzaia0 = zzaia1;
                                                                    s6 = s8;
                                                                }
                                                                else {
                                                                    zzaia0 = zzaia1;
                                                                    s6 = s8;
                                                                    list2 = zzfxn.zzo(arr_b1);
                                                                }
                                                                zzfh0 = zzfh1;
                                                                v49 = v65;
                                                                v52 = v67;
                                                                v51 = v66;
                                                                break alab1;
                                                            }
                                                            case 0x70617370: {
                                                                zzdy3.zzL(v57 + 8);
                                                                f = ((float)zzdy3.zzp()) / ((float)zzdy3.zzp());
                                                                zzfh0 = zzfh1;
                                                                v49 = v65;
                                                                v52 = v67;
                                                                v51 = v66;
                                                                v53 = 1;
                                                                break alab1;
                                                            }
                                                            case 0x73743364: {
                                                                int v73 = zzdy3.zzm();
                                                                zzdy3.zzM(3);
                                                                if(v73 == 0) {
                                                                    switch(zzdy3.zzm()) {
                                                                        case 0: {
                                                                            zzfh0 = zzfh1;
                                                                            v49 = v65;
                                                                            v52 = v67;
                                                                            v51 = v66;
                                                                            v56 = 0;
                                                                            break alab1;
                                                                        }
                                                                        case 1: {
                                                                            zzfh0 = zzfh1;
                                                                            v49 = v65;
                                                                            v52 = v67;
                                                                            v51 = v66;
                                                                            v56 = 1;
                                                                            break alab1;
                                                                        }
                                                                        case 2: {
                                                                            zzfh0 = zzfh1;
                                                                            v49 = v65;
                                                                            v52 = v67;
                                                                            v51 = v66;
                                                                            v56 = 2;
                                                                            break alab1;
                                                                        }
                                                                        case 3: {
                                                                            zzfh0 = zzfh1;
                                                                            v49 = v65;
                                                                            v52 = v67;
                                                                            v51 = v66;
                                                                            v56 = 3;
                                                                            break alab1;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                            }
                                                            case 0x73763364: {
                                                                for(int v74 = v57 + 8; v74 - v57 < v60; v74 = v75) {
                                                                    zzdy3.zzL(v74);
                                                                    int v75 = zzdy3.zzg() + v74;
                                                                    if(zzdy3.zzg() == 0x70726F6A) {
                                                                        arr_b = Arrays.copyOfRange(zzdy3.zzN(), v74, v75);
                                                                        zzfh0 = zzfh1;
                                                                        v49 = v65;
                                                                        v52 = v67;
                                                                        v51 = v66;
                                                                        break alab1;
                                                                    }
                                                                }
                                                                zzfh0 = zzfh1;
                                                                v49 = v65;
                                                                v52 = v67;
                                                                v51 = v66;
                                                                arr_b = null;
                                                                break alab1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            goto label_590;
                                        }
                                    }
                                }
                                v55 = v59 + v60;
                                v35 = v61;
                                v46 = v64;
                                zzaif1 = zzaif2;
                                list0 = list2;
                            }
                            v100 = v35;
                            v101 = v36;
                            if(s6 == null) {
                                zzaif4 = zzaif1;
                                v102 = v32;
                                v103 = v31;
                            }
                            else {
                                zzz zzz0 = new zzz();
                                v103 = v31;
                                zzz0.zzL(v103);
                                zzz0.zzaa(s6);
                                zzz0.zzA(s7);
                                zzz0.zzaf(v42);
                                zzz0.zzK(v43);
                                zzz0.zzW(f);
                                v102 = v32;
                                zzz0.zzZ(v102);
                                zzz0.zzX(arr_b);
                                zzz0.zzad(v56);
                                zzz0.zzN(list0);
                                zzz0.zzS(v54);
                                zzz0.zzF(zzu1);
                                zzi zzi0 = new zzi();
                                zzi0.zzc(v48);
                                zzi0.zzb(v51);
                                zzi0.zzd(v50);
                                zzi0.zze((byteBuffer0 == null ? null : byteBuffer0.array()));
                                zzi0.zzf(v52);
                                zzi0.zza(v49);
                                zzz0.zzB(zzi0.zzg());
                                if(zzaia0 != null) {
                                    zzz0.zzy(zzgaq.zze(zzaia0.zzc));
                                    zzz0.zzV(zzgaq.zze(zzaia0.zzd));
                                }
                                zzaif4 = zzaif1;
                                zzaif4.zzb = zzz0.zzag();
                            }
                            break;
                        }
                        case 1414810956: 
                        case 0x63363038: 
                        case 1937010800: 
                        case 1954034535: 
                        case 2004251764: {
                            zzdy2.zzL(v35 + 16);
                            if(v37 == 1414810956) {
                                zzaii1 = zzaii0;
                                s10 = "application/ttml+xml";
                            }
                            else {
                                switch(v37) {
                                    case 1954034535: {
                                    label_653:
                                        byte[] arr_b3 = new byte[v36 - 16];
                                        zzdy2.zzH(arr_b3, 0, v36 - 16);
                                        zzfxn1 = zzfxn.zzo(arr_b3);
                                        s10 = "application/x-quicktime-tx3g";
                                        zzaii1 = zzaii0;
                                        goto label_662;
                                    }
                                    case 2004251764: {
                                        s10 = "application/x-mp4-vtt";
                                        zzaii1 = zzaii0;
                                        break;
                                    }
                                    default: {
                                        zzaii1 = zzaii0;
                                        if(v37 == 1937010800) {
                                            v38 = v22;
                                            s10 = "application/ttml+xml";
                                            v104 = 0L;
                                            zzfxn1 = null;
                                            goto label_664;
                                        }
                                        else {
                                            zzaif0.zzd = 1;
                                            s10 = "application/x-mp4-cea-608";
                                            zzfxn1 = null;
                                            goto label_662;
                                        }
                                        goto label_653;
                                    }
                                }
                            }
                            zzfxn1 = null;
                        label_662:
                            v104 = 0x7FFFFFFFFFFFFFFFL;
                            v38 = v22;
                        label_664:
                            zzz zzz1 = new zzz();
                            zzz1.zzL(v31);
                            zzz1.zzaa(s10);
                            zzz1.zzQ(s2);
                            zzz1.zzae(v104);
                            zzz1.zzN(zzfxn1);
                            zzaif0.zzb = zzz1.zzag();
                            s3 = s2;
                            goto label_708;
                        }
                        default: {
                            goto label_705;
                        }
                    }
                    zzdy3.zzL(v100 + v101);
                    v34 = v47 + 1;
                    zzaif0 = zzaif4;
                    v32 = v102;
                    v33 = v39;
                    zzaii0 = zzaii1;
                    v14 = v40;
                    v16 = v41;
                    s2 = s3;
                    v22 = v38;
                    arrayList3 = arrayList4;
                    zzen5 = zzen9;
                    v31 = v103;
                    zzdy2 = zzdy3;
                    s = s4;
                }
                s1 = s;
                v3 = v14;
                arrayList2 = arrayList3;
                if(z) {
                    zzen3 = zzen5;
                }
                else {
                    zzen3 = zzen5;
                    zzen zzen10 = zzen3.zza(1701082227);
                    if(zzen10 != null) {
                        zzeo zzeo5 = zzen10.zzb(1701606260);
                        if(zzeo5 == null) {
                            pair1 = null;
                        }
                        else {
                            zzdy zzdy4 = zzeo5.zza;
                            zzdy4.zzL(8);
                            int v105 = zzaik.zza(zzdy4.zzg());
                            int v106 = zzdy4.zzp();
                            long[] arr_v = new long[v106];
                            long[] arr_v1 = new long[v106];
                            for(int v107 = 0; v107 < v106; ++v107) {
                                arr_v[v107] = v105 == 1 ? zzdy4.zzw() : zzdy4.zzu();
                                arr_v1[v107] = v105 == 1 ? zzdy4.zzt() : ((long)zzdy4.zzg());
                                if(zzdy4.zzE() != 1) {
                                    throw new IllegalArgumentException("Unsupported media rate.");
                                }
                                zzdy4.zzM(2);
                            }
                            pair1 = Pair.create(arr_v, arr_v1);
                        }
                        if(pair1 != null) {
                            arr_v2 = (long[])pair1.first;
                            arr_v3 = (long[])pair1.second;
                            goto label_771;
                        }
                    }
                }
                arr_v2 = null;
                arr_v3 = null;
            label_771:
                zzajb0 = zzaif0.zzb == null ? null : new zzajb(zzaii0.zza, v16, zzaic0.zza, v22, v23, zzaic0.zzb, zzaif0.zzb, zzaif0.zzd, zzaif0.zza, zzaif0.zzc, arr_v2, arr_v3);
            label_772:
                zzajb zzajb1 = (zzajb)zzfuc0.apply(zzajb0);
                if(zzajb1 == null) {
                    arrayList1 = arrayList2;
                }
                else {
                    zzen zzen11 = zzen3.zza(0x6D646961);
                    zzen11.getClass();
                    zzen zzen12 = zzen11.zza(1835626086);
                    zzen12.getClass();
                    zzen zzen13 = zzen12.zza(1937007212);
                    zzen13.getClass();
                    arrayList1 = arrayList2;
                    arrayList1.add(zzaik.zze(zzajb1, zzen13, zzadb0));
                }
            }
            else {
                v3 = v2;
                arrayList1 = arrayList0;
                s1 = s;
            }
            arrayList0 = arrayList1;
            v2 = v3 + 1;
            s = s1;
            v1 = 8;
        }
        return arrayList0;
    }

    public static void zzg(zzdy zzdy0) {
        int v = zzdy0.zzd();
        zzdy0.zzM(4);
        if(zzdy0.zzg() != 0x68646C72) {
            v += 4;
        }
        zzdy0.zzL(v);
    }

    private static int zzh(zzdy zzdy0) {
        int v = zzdy0.zzm();
        int v1;
        for(v1 = v & 0x7F; (v & 0x80) == 0x80; v1 = v1 << 7 | v & 0x7F) {
            v = zzdy0.zzm();
        }
        return v1;
    }

    private static int zzi(zzdy zzdy0) {
        zzdy0.zzL(16);
        return zzdy0.zzg();
    }

    @Nullable
    private static Pair zzj(zzdy zzdy0, int v, int v1) throws zzbc {
        Pair pair0;
        zzajc zzajc0;
        Integer integer1;
        byte[] arr_b2;
        int v13;
        int v12;
        int v2 = zzdy0.zzd();
        while(v2 - v < v1) {
            zzdy0.zzL(v2);
            int v3 = zzdy0.zzg();
            boolean z = true;
            zzacr.zzb(v3 > 0, "childAtomSize must be positive");
            if(zzdy0.zzg() == 0x73696E66) {
                int v4 = v2 + 8;
                int v5 = -1;
                int v6 = 0;
                String s = null;
                Integer integer0 = null;
                while(v4 - v2 < v3) {
                    zzdy0.zzL(v4);
                    int v7 = zzdy0.zzg();
                    int v8 = zzdy0.zzg();
                    if(v8 == 0x66726D61) {
                        integer0 = zzdy0.zzg();
                    }
                    else {
                        switch(v8) {
                            case 0x73636869: {
                                v5 = v4;
                                v6 = v7;
                                break;
                            }
                            case 0x7363686D: {
                                zzdy0.zzM(4);
                                s = zzdy0.zzB(4, StandardCharsets.UTF_8);
                            }
                        }
                    }
                    v4 += v7;
                }
                if("cenc".equals(s) || "cbc1".equals(s) || "cens".equals(s) || "cbcs".equals(s)) {
                    zzacr.zzb(integer0 != null, "frma atom is mandatory");
                    zzacr.zzb(v5 != -1, "schi atom is mandatory");
                    int v9 = v5 + 8;
                    while(true) {
                        if(v9 - v5 < v6) {
                            zzdy0.zzL(v9);
                            int v10 = zzdy0.zzg();
                            if(zzdy0.zzg() == 1952804451) {
                                int v11 = zzaik.zza(zzdy0.zzg());
                                zzdy0.zzM(1);
                                if(v11 == 0) {
                                    zzdy0.zzM(1);
                                    v12 = 0;
                                    v13 = 0;
                                }
                                else {
                                    int v14 = zzdy0.zzm();
                                    v12 = v14 & 15;
                                    v13 = (v14 & 0xF0) >> 4;
                                }
                                boolean z1 = zzdy0.zzm() == 1;
                                int v15 = zzdy0.zzm();
                                byte[] arr_b = new byte[16];
                                zzdy0.zzH(arr_b, 0, 16);
                                if(!z1 || v15 != 0) {
                                    arr_b2 = null;
                                }
                                else {
                                    int v16 = zzdy0.zzm();
                                    byte[] arr_b1 = new byte[v16];
                                    zzdy0.zzH(arr_b1, 0, v16);
                                    arr_b2 = arr_b1;
                                }
                                integer1 = integer0;
                                zzajc0 = new zzajc(z1, s, v15, arr_b, v13, v12, arr_b2);
                                break;
                            }
                            else {
                                v9 += v10;
                                continue;
                            }
                        }
                        integer1 = integer0;
                        zzajc0 = null;
                        break;
                    }
                    if(zzajc0 == null) {
                        z = false;
                    }
                    zzacr.zzb(z, "tenc atom is mandatory");
                    pair0 = Pair.create(integer1, zzajc0);
                }
                else {
                    pair0 = null;
                }
                if(pair0 != null) {
                    return pair0;
                }
            }
            v2 += v3;
        }
        return null;
    }

    private static zzk zzk(zzdy zzdy0) {
        int v13;
        zzi zzi0 = new zzi();
        byte[] arr_b = zzdy0.zzN();
        zzdx zzdx0 = new zzdx(arr_b, arr_b.length);
        zzdx0.zzl(zzdy0.zzd() * 8);
        int v = 1;
        zzdx0.zzo(1);
        int v1 = zzdx0.zzd(3);
        zzdx0.zzn(6);
        boolean z = zzdx0.zzp();
        boolean z1 = zzdx0.zzp();
        int v2 = 10;
        boolean z2 = false;
        if(v1 != 2) {
        label_21:
            if(v1 <= 2) {
                if(!z) {
                    v2 = 8;
                }
                zzi0.zzf(v2);
                zzi0.zza(v2);
            }
        }
        else if(z) {
            if(z1) {
                v2 = 12;
            }
            zzi0.zzf(v2);
            zzi0.zza(v2);
        }
        else {
            z = false;
            v1 = 2;
            goto label_21;
        }
        int v3 = 13;
        zzdx0.zzn(13);
        zzdx0.zzm();
        int v4 = zzdx0.zzd(4);
        if(v4 != 1) {
            zzdo.zze("BoxParsers", "Unsupported obu_type: " + v4);
            return zzi0.zzg();
        }
        if(zzdx0.zzp()) {
            zzdo.zze("BoxParsers", "Unsupported obu_extension_flag");
            return zzi0.zzg();
        }
        boolean z3 = zzdx0.zzp();
        zzdx0.zzm();
        if(z3 && zzdx0.zzd(8) > 0x7F) {
            zzdo.zze("BoxParsers", "Excessive obu_size");
            return zzi0.zzg();
        }
        int v5 = zzdx0.zzd(3);
        zzdx0.zzm();
        if(zzdx0.zzp()) {
            zzdo.zze("BoxParsers", "Unsupported reduced_still_picture_header");
            return zzi0.zzg();
        }
        if(zzdx0.zzp()) {
            zzdo.zze("BoxParsers", "Unsupported timing_info_present_flag");
            return zzi0.zzg();
        }
        if(zzdx0.zzp()) {
            zzdo.zze("BoxParsers", "Unsupported initial_display_delay_present_flag");
            return zzi0.zzg();
        }
        int v6 = zzdx0.zzd(5);
        for(int v7 = 0; v7 <= v6; ++v7) {
            zzdx0.zzn(12);
            if(zzdx0.zzd(5) > 7) {
                zzdx0.zzm();
            }
        }
        int v8 = zzdx0.zzd(4);
        int v9 = zzdx0.zzd(4);
        zzdx0.zzn(v8 + 1);
        zzdx0.zzn(v9 + 1);
        if(zzdx0.zzp()) {
            zzdx0.zzn(7);
        }
        zzdx0.zzn(7);
        boolean z4 = zzdx0.zzp();
        if(z4) {
            zzdx0.zzn(2);
        }
        if((zzdx0.zzp() || zzdx0.zzd(1) > 0) && !zzdx0.zzp()) {
            zzdx0.zzn(1);
        }
        if(z4) {
            zzdx0.zzn(3);
        }
        zzdx0.zzn(3);
        boolean z5 = zzdx0.zzp();
        if(v5 != 2) {
            if(v5 != 1) {
            label_81:
                if(zzdx0.zzp()) {
                    z2 = true;
                }
            }
        }
        else if(z5) {
            zzdx0.zzm();
            goto label_81;
        }
        else {
            goto label_81;
        }
        if(zzdx0.zzp()) {
            int v10 = zzdx0.zzd(8);
            int v11 = zzdx0.zzd(8);
            int v12 = zzdx0.zzd(8);
            if(z2 || v10 != 1) {
                v3 = v11;
                v13 = zzdx0.zzd(1);
            }
            else if(v11 != 13) {
                v3 = v11;
                v10 = 1;
                v13 = zzdx0.zzd(1);
            }
            else if(v12 == 0) {
                v13 = 1;
                v10 = 1;
            }
            else {
                v10 = 1;
                v13 = zzdx0.zzd(1);
            }
            zzi0.zzc(zzk.zza(v10));
            if(v13 != 1) {
                v = 2;
            }
            zzi0.zzb(v);
            zzi0.zzd(zzk.zzb(v3));
        }
        return zzi0.zzg();
    }

    @Nullable
    private static zzay zzl(zzdy zzdy0) {
        int v = zzdy0.zzE();
        zzdy0.zzM(2);
        String s = zzdy0.zzB(v, StandardCharsets.UTF_8);
        int v1 = Math.max(s.lastIndexOf(43), s.lastIndexOf(45));
        try {
            return new zzay(0x8000000000000001L, new zzax[]{new zzet(Float.parseFloat(s.substring(0, v1)), Float.parseFloat(s.substring(v1, s.length() - 1)))});
        }
        catch(IndexOutOfBoundsException | NumberFormatException unused_ex) {
            return null;
        }
    }

    private static zzaia zzm(zzdy zzdy0, int v) {
        zzdy0.zzL(v + 12);
        zzdy0.zzM(1);
        zzaik.zzh(zzdy0);
        zzdy0.zzM(2);
        int v1 = zzdy0.zzm();
        if((v1 & 0x80) != 0) {
            zzdy0.zzM(2);
        }
        if((v1 & 0x40) != 0) {
            zzdy0.zzM(zzdy0.zzm());
        }
        if((v1 & 0x20) != 0) {
            zzdy0.zzM(2);
        }
        zzdy0.zzM(1);
        zzaik.zzh(zzdy0);
        String s = zzbb.zzd(zzdy0.zzm());
        if(!"audio/mpeg".equals(s) && !"audio/vnd.dts".equals(s) && !"audio/vnd.dts.hd".equals(s)) {
            zzdy0.zzM(4);
            long v2 = zzdy0.zzu();
            long v3 = zzdy0.zzu();
            zzdy0.zzM(1);
            int v4 = zzaik.zzh(zzdy0);
            byte[] arr_b = new byte[v4];
            zzdy0.zzH(arr_b, 0, v4);
            long v5 = v3 > 0L ? v3 : -1L;
            return v2 <= 0L ? new zzaia(s, arr_b, v5, -1L) : new zzaia(s, arr_b, v5, v2);
        }
        return new zzaia(s, null, -1L, -1L);
    }

    private static ByteBuffer zzn() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static void zzo(zzdy zzdy0, int v, int v1, int v2, int v3, String s, boolean z, @Nullable zzu zzu0, zzaif zzaif0, int v4) throws zzbc {
        int v12;
        int v11;
        int v10;
        int v7;
        int v26;
        int v24;
        int v23;
        String s1;
        int v5;
        zzdy0.zzL(v1 + 16);
        if(z) {
            v5 = zzdy0.zzq();
            zzdy0.zzM(6);
        }
        else {
            zzdy0.zzM(8);
            v5 = 0;
        }
        if(v5 == 0 || v5 == 1) {
            int v13 = zzdy0.zzq();
            zzdy0.zzM(6);
            int v14 = zzdy0.zzn();
            zzdy0.zzL(zzdy0.zzd() - 4);
            v12 = zzdy0.zzg();
            if(v5 == 1) {
                zzdy0.zzM(16);
            }
            v11 = v14;
            v7 = v13;
            v10 = -1;
        label_52:
            if(v == 0x69616D66) {
                v11 = -1;
            }
            if(v == 0x69616D66) {
                v7 = -1;
            }
            int v15 = zzdy0.zzd();
            int v16 = 1701733217;
            if(v == 1701733217) {
                Pair pair0 = zzaik.zzj(zzdy0, v1, v2);
                if(pair0 != null) {
                    v16 = (int)(((Integer)pair0.first));
                    zzu0 = zzu0 == null ? null : zzu0.zzb(((zzajc)pair0.second).zzb);
                    zzaif0.zza[v4] = (zzajc)pair0.second;
                }
                zzdy0.zzL(v15);
            }
            else {
                v16 = v;
            }
            switch(v16) {
                case 0x2E6D7032: 
                case 0x2E6D7033: {
                    s1 = "audio/mpeg";
                    break;
                }
                case 0x4F707573: {
                    s1 = "audio/opus";
                    break;
                }
                case 0x61632D33: {
                    s1 = "audio/ac3";
                    break;
                }
                case 0x61632D34: {
                    s1 = "audio/ac4";
                    break;
                }
                case 0x616C6163: {
                    s1 = "audio/alac";
                    break;
                }
                case 0x616C6177: {
                    s1 = "audio/g711-alaw";
                    break;
                }
                case 0x64747363: {
                    s1 = "audio/vnd.dts";
                    break;
                }
                case 0x64747365: {
                    s1 = "audio/vnd.dts.hd;profile=lbr";
                    break;
                }
                case 1685353320: 
                case 0x6474736C: {
                    s1 = "audio/vnd.dts.hd";
                    break;
                }
                case 0x64747378: {
                    s1 = "audio/vnd.dts.uhd;profile=p2";
                    break;
                }
                case 1700998451: {
                    s1 = "audio/eac3";
                    break;
                }
                case 0x664C6143: {
                    s1 = "audio/flac";
                    break;
                }
                case 0x69616D66: {
                    s1 = "audio/iamf";
                    break;
                }
                case 0x6C70636D: {
                    if(v10 == -1) {
                        s1 = "audio/raw";
                        v10 = 2;
                    }
                    else {
                        s1 = "audio/raw";
                    }
                    break;
                }
                case 0x6D686131: {
                    s1 = "audio/mha1";
                    break;
                }
                case 1835560241: {
                    s1 = "audio/mhm1";
                    break;
                }
                case 0x6D6C7061: {
                    s1 = "audio/true-hd";
                    break;
                }
                case 1935764850: {
                    s1 = "audio/3gpp";
                    break;
                }
                case 0x73617762: {
                    s1 = "audio/amr-wb";
                    break;
                }
                case 0x736F7774: {
                    s1 = "audio/raw";
                    v10 = 2;
                    break;
                }
                case 0x74776F73: {
                    s1 = "audio/raw";
                    v10 = 0x10000000;
                    break;
                }
                case 1970037111: {
                    s1 = "audio/g711-mlaw";
                    break;
                }
                default: {
                    s1 = null;
                }
            }
            List list0 = null;
            zzaia zzaia0 = null;
            String s2 = null;
            while(v15 - v1 < v2) {
                zzdy0.zzL(v15);
                int v17 = zzdy0.zzg();
                zzacr.zzb(v17 > 0, "childAtomSize must be positive");
                int v18 = zzdy0.zzg();
                if(v18 == 0x6D686143) {
                    zzdy0.zzL(v15 + 8);
                    zzdy0.zzM(1);
                    int v19 = zzdy0.zzm();
                    zzdy0.zzM(1);
                    String s3 = Objects.equals(s1, "audio/mhm1") ? String.format("mhm1.%02X", v19) : String.format("mha1.%02X", v19);
                    int v20 = zzdy0.zzq();
                    byte[] arr_b = new byte[v20];
                    zzdy0.zzH(arr_b, 0, v20);
                    list0 = list0 == null ? zzfxn.zzo(arr_b) : zzfxn.zzp(arr_b, ((byte[])list0.get(0)));
                    s2 = s3;
                    v26 = v12;
                }
                else {
                alab1:
                    switch(v18) {
                        case 1702061171: {
                            v24 = v11;
                            v23 = v15;
                        label_240:
                            if(v23 != -1) {
                                zzaia0 = zzaik.zzm(zzdy0, v23);
                                s1 = zzaia0.zza;
                                byte[] arr_b5 = zzaia0.zzb;
                                if(arr_b5 != null) {
                                    if("audio/vorbis".equals(s1)) {
                                        zzdy zzdy2 = new zzdy(arr_b5);
                                        zzdy2.zzM(1);
                                        int v31 = 0;
                                        while(true) {
                                            if(zzdy2.zzb() > 0) {
                                                v26 = v12;
                                                if(zzdy2.zzf() == 0xFF) {
                                                    zzdy2.zzM(1);
                                                    v31 += 0xFF;
                                                    v12 = v26;
                                                    continue;
                                                }
                                                else {
                                                    break;
                                                }
                                            }
                                            v26 = v12;
                                            break;
                                        }
                                        int v32 = v31 + zzdy2.zzm();
                                        int v33;
                                        for(v33 = 0; zzdy2.zzb() > 0 && zzdy2.zzf() == 0xFF; v33 += 0xFF) {
                                            zzdy2.zzM(1);
                                        }
                                        int v34 = zzdy2.zzm();
                                        byte[] arr_b6 = new byte[v32];
                                        int v35 = zzdy2.zzd();
                                        System.arraycopy(arr_b5, v35, arr_b6, 0, v32);
                                        int v36 = v35 + v32 + (v33 + v34);
                                        int v37 = arr_b5.length - v36;
                                        byte[] arr_b7 = new byte[v37];
                                        System.arraycopy(arr_b5, v36, arr_b7, 0, v37);
                                        list0 = zzfxn.zzp(arr_b6, arr_b7);
                                        break;
                                    }
                                    else {
                                        v26 = v12;
                                        if("audio/mp4a-latm".equals(s1)) {
                                            zzabi zzabi0 = zzabk.zza(arr_b5);
                                            v11 = zzabi0.zza;
                                            v7 = zzabi0.zzb;
                                            s2 = zzabi0.zzc;
                                        }
                                        else {
                                            v11 = v24;
                                        }
                                        list0 = zzfxn.zzo(arr_b5);
                                        goto label_297;
                                    }
                                }
                            }
                        label_284:
                            v26 = v12;
                            break;
                        }
                        case 1835557200: {
                            zzdy0.zzL(v15 + 8);
                            int v38 = zzdy0.zzm();
                            if(v38 > 0) {
                                byte[] arr_b8 = new byte[v38];
                                zzdy0.zzH(arr_b8, 0, v38);
                                list0 = list0 == null ? zzfxn.zzo(arr_b8) : zzfxn.zzp(((byte[])list0.get(0)), arr_b8);
                                v26 = v12;
                                goto label_297;
                            }
                            else {
                                v24 = v11;
                                v26 = v12;
                            }
                            break;
                        }
                        default: {
                            if(z) {
                                switch(v18) {
                                    case 0x616C6163: {
                                        goto label_217;
                                    }
                                    case 0x644F7073: {
                                        goto label_203;
                                    }
                                    case 1684103987: {
                                        zzdy0.zzL(v15 + 8);
                                        zzaif0.zzb = zzabn.zzc(zzdy0, Integer.toString(v3), s, zzu0);
                                        v24 = v11;
                                        v26 = v12;
                                        break alab1;
                                    }
                                    case 1684103988: {
                                        goto label_173;
                                    }
                                    case 0x64656333: {
                                        zzdy0.zzL(v15 + 8);
                                        zzaif0.zzb = zzabn.zzd(zzdy0, Integer.toString(v3), s, zzu0);
                                        v24 = v11;
                                        v26 = v12;
                                        break alab1;
                                    }
                                    case 0x64664C61: {
                                        goto label_208;
                                    }
                                    case 0x646D6C70: {
                                        goto label_187;
                                    }
                                    case 1767990114: {
                                        break;
                                    }
                                    case 1684305011: 
                                    case 0x75647473: {
                                        goto label_193;
                                    }
                                    case 2002876005: {
                                        int v21 = zzdy0.zzd();
                                        zzacr.zzb(v21 >= v15, null);
                                        while(v21 - v15 < v17) {
                                            zzdy0.zzL(v21);
                                            int v22 = zzdy0.zzg();
                                            zzacr.zzb(v22 > 0, "childAtomSize must be positive");
                                            if(zzdy0.zzg() != 1702061171) {
                                                v21 += v22;
                                                continue;
                                            }
                                            v23 = v21;
                                            v24 = v11;
                                            goto label_240;
                                        }
                                        v24 = v11;
                                        v23 = -1;
                                        goto label_240;
                                    }
                                    default: {
                                        v24 = v11;
                                        v26 = v12;
                                        break alab1;
                                    }
                                }
                            }
                            else {
                                switch(v18) {
                                    case 0x616C6163: {
                                    label_217:
                                        byte[] arr_b3 = new byte[v17 - 12];
                                        zzdy0.zzL(v15 + 12);
                                        zzdy0.zzH(arr_b3, 0, v17 - 12);
                                        zzdy zzdy1 = new zzdy(arr_b3);
                                        zzdy1.zzL(9);
                                        int v27 = zzdy1.zzm();
                                        zzdy1.zzL(20);
                                        Pair pair1 = Pair.create(zzdy1.zzp(), v27);
                                        int v28 = (int)(((Integer)pair1.first));
                                        int v29 = (int)(((Integer)pair1.second));
                                        v11 = v28;
                                        list0 = zzfxn.zzo(arr_b3);
                                        v26 = v12;
                                        v7 = v29;
                                        goto label_297;
                                    }
                                    case 0x644F7073: {
                                    label_203:
                                        byte[] arr_b1 = Arrays.copyOf(zzaik.zzb, zzaik.zzb.length + (v17 - 8));
                                        zzdy0.zzL(v15 + 8);
                                        zzdy0.zzH(arr_b1, zzaik.zzb.length, v17 - 8);
                                        list0 = zzadi.zze(arr_b1);
                                        v26 = v12;
                                        goto label_297;
                                    }
                                    case 1684103987: {
                                        zzdy0.zzL(v15 + 8);
                                        zzaif0.zzb = zzabn.zzc(zzdy0, Integer.toString(v3), s, zzu0);
                                        v24 = v11;
                                        v26 = v12;
                                        break alab1;
                                    }
                                    case 1684103988: {
                                    label_173:
                                        zzdy0.zzL(v15 + 8);
                                        zzdy0.zzM(1);
                                        int v25 = zzdy0.zzm();
                                        zzz zzz0 = new zzz();
                                        zzz0.zzM(Integer.toString(v3));
                                        zzz0.zzaa("audio/ac4");
                                        zzz0.zzz(2);
                                        zzz0.zzab((1 == (v25 & 0x20) >> 5 ? 48000 : 44100));
                                        zzz0.zzF(zzu0);
                                        zzz0.zzQ(s);
                                        zzaif0.zzb = zzz0.zzag();
                                        v24 = v11;
                                        v26 = v12;
                                        break alab1;
                                    }
                                    case 0x64656333: {
                                        zzdy0.zzL(v15 + 8);
                                        zzaif0.zzb = zzabn.zzd(zzdy0, Integer.toString(v3), s, zzu0);
                                        v24 = v11;
                                        v26 = v12;
                                        break alab1;
                                    }
                                    case 0x64664C61: {
                                    label_208:
                                        byte[] arr_b2 = new byte[v17 - 8];
                                        arr_b2[0] = 102;
                                        arr_b2[1] = 76;
                                        arr_b2[2] = 97;
                                        arr_b2[3] = 67;
                                        zzdy0.zzL(v15 + 12);
                                        zzdy0.zzH(arr_b2, 4, v17 - 12);
                                        list0 = zzfxn.zzo(arr_b2);
                                        v26 = v12;
                                        goto label_297;
                                    }
                                    case 0x646D6C70: {
                                    label_187:
                                        if(v12 <= 0) {
                                            throw zzbc.zza(("Invalid sample rate for Dolby TrueHD MLP stream: " + v12), null);
                                        }
                                        v11 = v12;
                                        v26 = v11;
                                        v7 = 2;
                                        goto label_297;
                                    }
                                    case 1767990114: {
                                        break;
                                    }
                                    case 1684305011: 
                                    case 0x75647473: {
                                    label_193:
                                        zzz zzz1 = new zzz();
                                        zzz1.zzL(v3);
                                        zzz1.zzaa(s1);
                                        zzz1.zzz(v7);
                                        v24 = v11;
                                        zzz1.zzab(v24);
                                        zzz1.zzF(zzu0);
                                        zzz1.zzQ(s);
                                        zzaif0.zzb = zzz1.zzag();
                                        goto label_284;
                                    }
                                    default: {
                                        v24 = v11;
                                        goto label_284;
                                    }
                                }
                            }
                            zzdy0.zzL(v15 + 9);
                            int v30 = zzgaq.zzb(zzdy0.zzv());
                            byte[] arr_b4 = new byte[v30];
                            zzdy0.zzH(arr_b4, 0, v30);
                            list0 = zzfxn.zzo(arr_b4);
                            v26 = v12;
                            goto label_297;
                        }
                    }
                    v11 = v24;
                }
            label_297:
                v15 += v17;
                v12 = v26;
            }
            if(zzaif0.zzb == null && s1 != null) {
                zzz zzz2 = new zzz();
                zzz2.zzL(v3);
                zzz2.zzaa(s1);
                zzz2.zzA(s2);
                zzz2.zzz(v7);
                zzz2.zzab(v11);
                zzz2.zzU(v10);
                zzz2.zzN(list0);
                zzz2.zzF(zzu0);
                zzz2.zzQ(s);
                if(zzaia0 != null) {
                    zzz2.zzy(zzgaq.zze(zzaia0.zzc));
                    zzz2.zzV(zzgaq.zze(zzaia0.zzd));
                }
                zzaif0.zzb = zzz2.zzag();
            }
        }
        else if(v5 == 2) {
            zzdy0.zzM(16);
            int v6 = (int)Math.round(Double.longBitsToDouble(zzdy0.zzt()));
            v7 = zzdy0.zzp();
            zzdy0.zzM(4);
            int v8 = zzdy0.zzp();
            int v9 = zzdy0.zzp();
            if((v9 & 1) != 0) {
                v10 = v8 == 0x20 ? 4 : -1;
            }
            else if(v8 == 8) {
                v10 = 3;
            }
            else {
                switch(v8) {
                    case 16: {
                        v10 = (v9 & 2) == 0 ? 2 : 0x10000000;
                        break;
                    }
                    case 24: {
                        v10 = (v9 & 2) == 0 ? 21 : 0x50000000;
                        break;
                    }
                    case 0x20: {
                        v10 = (v9 & 2) == 0 ? 22 : 0x60000000;
                        break;
                    }
                    default: {
                        v10 = -1;
                    }
                }
            }
            zzdy0.zzM(8);
            v11 = v6;
            v12 = 0;
            goto label_52;
        }
    }
}

