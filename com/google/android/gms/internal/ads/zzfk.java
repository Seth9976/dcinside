package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

public final class zzfk {
    public static final byte[] zza;
    public static final float[] zzb;
    private static final Object zzc;
    private static int[] zzd;

    static {
        zzfk.zza = new byte[]{0, 0, 0, 1};
        zzfk.zzb = new float[]{1.0f, 1.0f, 1.090909f, 0.909091f, 1.454545f, 1.212121f, 2.181818f, 1.818182f, 2.909091f, 2.424242f, 1.636364f, 1.363636f, 1.939394f, 1.616162f, 1.333333f, 1.5f, 2.0f};
        zzfk.zzc = new Object();
        zzfk.zzd = new int[10];
    }

    public static int zza(byte[] arr_b, int v, int v1, boolean[] arr_z) {
        boolean z2;
        boolean z1;
        int v2 = v1 - v;
        boolean z = false;
        zzcw.zzf(v2 >= 0);
        if(v2 == 0) {
            return v1;
        }
        if(arr_z[0]) {
            zzfk.zzh(arr_z);
            return v - 3;
        }
        if(v2 > 1 && arr_z[1] && arr_b[v] == 1) {
            zzfk.zzh(arr_z);
            return v - 2;
        }
        if(v2 > 2 && arr_z[2] && arr_b[v] == 0 && arr_b[v + 1] == 1) {
            zzfk.zzh(arr_z);
            return v - 1;
        }
        for(int v3 = v + 2; v3 < v1 - 1; v3 += 3) {
            int v4 = arr_b[v3];
            if((v4 & 0xFE) == 0) {
                if(arr_b[v3 - 2] == 0 && arr_b[v3 - 1] == 0 && v4 == 1) {
                    zzfk.zzh(arr_z);
                    return v3 - 2;
                }
                v3 -= 2;
            }
        }
        if(v2 <= 2) {
            if(v2 != 2) {
                z1 = arr_z[1] && arr_b[v1 - 1] == 1;
            }
            else if(arr_z[2] && arr_b[v1 - 2] == 0 && arr_b[v1 - 1] == 1) {
                z1 = true;
            }
            else {
                z1 = false;
            }
        }
        else if(arr_b[v1 - 3] == 0 && arr_b[v1 - 2] == 0 && arr_b[v1 - 1] == 1) {
            z1 = true;
        }
        else {
            z1 = false;
        }
        arr_z[0] = z1;
        if(v2 <= 1) {
            z2 = arr_z[2] && arr_b[v1 - 1] == 0;
        }
        else if(arr_b[v1 - 2] == 0 && arr_b[v1 - 1] == 0) {
            z2 = true;
        }
        else {
            z2 = false;
        }
        arr_z[1] = z2;
        if(arr_b[v1 - 1] == 0) {
            z = true;
        }
        arr_z[2] = z;
        return v1;
    }

    public static int zzb(byte[] arr_b, int v) {
        Object object0 = zzfk.zzc;
        __monitor_enter(object0);
        int v1 = 0;
        int v2 = 0;
        try {
            while(v1 < v) {
                while(true) {
                    if(v1 < v - 2) {
                        if(arr_b[v1] == 0 && arr_b[v1 + 1] == 0 && arr_b[v1 + 2] == 3) {
                            break;
                        }
                        else {
                            ++v1;
                            continue;
                        }
                    }
                    v1 = v;
                    break;
                }
                if(v1 < v) {
                    int[] arr_v = zzfk.zzd;
                    int v4 = arr_v.length;
                    if(v4 <= v2) {
                        zzfk.zzd = Arrays.copyOf(arr_v, v4 + v4);
                    }
                    zzfk.zzd[v2] = v1;
                    v1 += 3;
                    ++v2;
                }
            }
            int v5 = v - v2;
            int v7 = 0;
            int v8 = 0;
            for(int v6 = 0; v6 < v2; ++v6) {
                int v9 = zzfk.zzd[v6] - v7;
                System.arraycopy(arr_b, v7, arr_b, v8, v9);
                int v10 = v8 + v9;
                arr_b[v10] = 0;
                v8 = v10 + 2;
                arr_b[v10 + 1] = 0;
                v7 += v9 + 3;
            }
            System.arraycopy(arr_b, v7, arr_b, v8, v5 - v8);
            return v5;
        }
        finally {
            __monitor_exit(object0);
        }
    }

    public static zzfe zzc(byte[] arr_b, int v, int v1, @Nullable zzfh zzfh0) {
        int v62;
        int v61;
        int v58;
        zzez zzez1;
        int v38;
        int v34;
        int v33;
        int v32;
        int v28;
        int v21;
        int v20;
        int v17;
        int v13;
        int v11;
        int v10;
        int v9;
        int v8;
        int v7;
        boolean z;
        zzey zzey0 = zzfk.zzl(new zzfl(arr_b, v, v1));
        zzfl zzfl0 = new zzfl(arr_b, v + 2, v1);
        zzfl0.zzf(4);
        int v2 = zzfl0.zza(3);
        if(zzey0.zzb == 0 || v2 != 7) {
            z = false;
        }
        else {
            v2 = 7;
            z = true;
        }
        int v3 = zzfh0 == null || zzfh0.zza.isEmpty() ? 0 : ((zzex)zzfh0.zza.get(Math.min(zzey0.zzb, zzfh0.zza.size() - 1))).zza;
        zzez zzez0 = null;
        if(!z) {
            zzfl0.zze();
            zzez0 = zzfk.zzm(zzfl0, true, v2, null);
        }
        else if(zzfh0 != null) {
            int v4 = zzfh0.zzb.zzb[v3];
            if(zzfh0.zzb.zza.size() > v4) {
                zzez0 = (zzez)zzfh0.zzb.zza.get(v4);
            }
        }
        int v5 = zzfl0.zzc();
        if(z) {
            int v6 = zzfl0.zzh() ? zzfl0.zza(8) : -1;
            if(zzfh0 == null) {
            label_35:
                v8 = 0;
                v9 = 0;
                v11 = 0;
                v10 = 0;
                v7 = 0;
            }
            else {
                zzfc zzfc0 = zzfh0.zzc;
                if(zzfc0 != null) {
                    if(v6 == -1) {
                        v6 = zzfc0.zzb[v3];
                    }
                    if(v6 != -1 && zzfc0.zza.size() > v6) {
                        zzfb zzfb0 = (zzfb)zzfh0.zzc.zza.get(v6);
                        v7 = zzfb0.zze;
                        v8 = zzfb0.zzd;
                        v9 = zzfb0.zza;
                        v10 = zzfb0.zzc;
                        v11 = zzfb0.zzb;
                        goto label_56;
                    }
                }
                goto label_35;
            }
        }
        else {
            int v12 = zzfl0.zzc();
            if(v12 == 3) {
                zzfl0.zze();
                v13 = 3;
            }
            else {
                v13 = v12;
            }
            int v14 = zzfl0.zzc();
            v7 = zzfl0.zzc();
            if(zzfl0.zzh()) {
                v14 = zzfk.zzk(v14, v13, zzfl0.zzc(), zzfl0.zzc());
                v7 = zzfk.zzj(v7, v13, zzfl0.zzc(), zzfl0.zzc());
            }
            v11 = zzfl0.zzc();
            v9 = v12;
            v8 = v14;
            v10 = zzfl0.zzc();
        }
    label_56:
        int v15 = zzfl0.zzc();
        if(z) {
            v17 = -1;
        }
        else {
            int v16 = zzfl0.zzh() ? 0 : v2;
            v17 = -1;
            while(v16 <= v2) {
                zzfl0.zzc();
                v17 = Math.max(zzfl0.zzc(), v17);
                zzfl0.zzc();
                ++v16;
            }
        }
        zzfl0.zzc();
        zzfl0.zzc();
        zzfl0.zzc();
        zzfl0.zzc();
        zzfl0.zzc();
        zzfl0.zzc();
        if(zzfl0.zzh()) {
            if(z && zzfl0.zzh()) {
                zzfl0.zzf(6);
            }
            else if(zzfl0.zzh()) {
                for(int v18 = 0; v18 < 4; ++v18) {
                    int v19 = 0;
                    while(v19 < 6) {
                        if(zzfl0.zzh()) {
                            v21 = v17;
                            v20 = v8;
                            int v22 = Math.min(0x40, 1 << v18 * 2 + 4);
                            if(v18 > 1) {
                                zzfl0.zzb();
                            }
                            for(int v23 = 0; v23 < v22; ++v23) {
                                zzfl0.zzb();
                            }
                        }
                        else {
                            zzfl0.zzc();
                            v20 = v8;
                            v21 = v17;
                        }
                        v19 += (v18 == 3 ? 3 : 1);
                        v8 = v20;
                        v17 = v21;
                    }
                }
            }
        }
        zzfl0.zzf(2);
        if(zzfl0.zzh()) {
            zzfl0.zzf(8);
            zzfl0.zzc();
            zzfl0.zzc();
            zzfl0.zze();
        }
        int v24 = zzfl0.zzc();
        int[] arr_v = new int[0];
        int[] arr_v1 = new int[0];
        int v25 = -1;
        int v26 = -1;
        int v27 = 0;
        while(v27 < v24) {
            if(v27 == 0 || !zzfl0.zzh()) {
                v28 = v24;
                v34 = v9;
                v33 = v11;
                v32 = v10;
                zzez1 = zzez0;
                int v49 = zzfl0.zzc();
                int v50 = zzfl0.zzc();
                arr_v = new int[v49];
                for(int v51 = 0; v51 < v49; ++v51) {
                    arr_v[v51] = (v51 <= 0 ? 0 : arr_v[v51 - 1]) - (zzfl0.zzc() + 1);
                    zzfl0.zze();
                }
                int[] arr_v5 = new int[v50];
                for(int v52 = 0; v52 < v50; ++v52) {
                    arr_v5[v52] = (v52 <= 0 ? 0 : arr_v5[v52 - 1]) + (zzfl0.zzc() + 1);
                    zzfl0.zze();
                }
                v26 = v50;
                arr_v1 = arr_v5;
                v25 = v49;
            }
            else {
                v28 = v24;
                int v29 = v25 + v26;
                int v30 = zzfl0.zzh();
                int v31 = zzfl0.zzc();
                v32 = v10;
                v33 = v11;
                boolean[] arr_z = new boolean[v29 + 1];
                v34 = v9;
                for(int v35 = 0; v35 <= v29; ++v35) {
                    arr_z[v35] = zzfl0.zzh() ? true : zzfl0.zzh();
                }
                int v36 = v26 - 1;
                int[] arr_v2 = new int[v29 + 1];
                int[] arr_v3 = new int[v29 + 1];
                int v37 = 0;
                while(true) {
                    v38 = (v30 * -2 + 1) * (v31 + 1);
                    if(v36 < 0) {
                        break;
                    }
                    int v39 = arr_v1[v36] + v38;
                    if(v39 < 0 && arr_z[v25 + v36]) {
                        arr_v2[v37] = v39;
                        ++v37;
                    }
                    --v36;
                }
                if(v38 < 0 && arr_z[v29]) {
                    arr_v2[v37] = v38;
                    ++v37;
                }
                zzez1 = zzez0;
                int v40 = v37;
                for(int v41 = 0; v41 < v25; ++v41) {
                    int v42 = arr_v[v41] + v38;
                    if(v42 < 0 && arr_z[v41]) {
                        arr_v2[v40] = v42;
                        ++v40;
                    }
                }
                int[] arr_v4 = Arrays.copyOf(arr_v2, v40);
                int v43 = v25 - 1;
                int v44 = 0;
                while(v43 >= 0) {
                    int v45 = arr_v[v43] + v38;
                    if(v45 > 0 && arr_z[v43]) {
                        arr_v3[v44] = v45;
                        ++v44;
                    }
                    --v43;
                }
                if(v38 > 0 && arr_z[v29]) {
                    arr_v3[v44] = v38;
                    ++v44;
                }
                int v46 = v44;
                for(int v47 = 0; v47 < v26; ++v47) {
                    int v48 = arr_v1[v47] + v38;
                    if(v48 > 0 && arr_z[v25 + v47]) {
                        arr_v3[v46] = v48;
                        ++v46;
                    }
                }
                v26 = v46;
                arr_v1 = Arrays.copyOf(arr_v3, v46);
                arr_v = arr_v4;
                v25 = v40;
            }
            ++v27;
            v24 = v28;
            zzez0 = zzez1;
            v10 = v32;
            v11 = v33;
            v9 = v34;
        }
        if(zzfl0.zzh()) {
            int v53 = zzfl0.zzc();
            for(int v54 = 0; v54 < v53; ++v54) {
                zzfl0.zzf(v15 + 5);
            }
        }
        zzfl0.zzf(2);
        float f = 1.0f;
        if(zzfl0.zzh()) {
            if(zzfl0.zzh()) {
                int v55 = zzfl0.zza(8);
                if(v55 == 0xFF) {
                    int v56 = zzfl0.zza(16);
                    int v57 = zzfl0.zza(16);
                    if(v56 != 0 && v57 != 0) {
                        f = ((float)v56) / ((float)v57);
                    }
                }
                else if(v55 < 17) {
                    f = zzfk.zzb[v55];
                }
                else {
                    zzdo.zzf("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + v55);
                }
            }
            if(zzfl0.zzh()) {
                zzfl0.zze();
            }
            if(zzfl0.zzh()) {
                zzfl0.zzf(3);
                v58 = zzfl0.zzh() ? 1 : 2;
                if(zzfl0.zzh()) {
                    int v59 = zzfl0.zza(8);
                    int v60 = zzfl0.zza(8);
                    zzfl0.zzf(8);
                    v61 = zzk.zza(v59);
                    v62 = zzk.zzb(v60);
                }
                else {
                    v62 = -1;
                    v61 = -1;
                }
            }
            else if(zzfh0 == null) {
                v62 = -1;
                v58 = -1;
                v61 = -1;
            }
            else {
                zzfg zzfg0 = zzfh0.zzd;
                if(zzfg0 == null) {
                    v62 = -1;
                    v58 = -1;
                    v61 = -1;
                }
                else {
                    int v63 = zzfg0.zzb[v3];
                    if(zzfg0.zza.size() > v63) {
                        zzff zzff0 = (zzff)zzfh0.zzd.zza.get(v63);
                        v61 = zzff0.zza;
                        v62 = zzff0.zzc;
                        v58 = zzff0.zzb;
                    }
                    else {
                        v62 = -1;
                        v58 = -1;
                        v61 = -1;
                    }
                }
            }
            if(zzfl0.zzh()) {
                zzfl0.zzc();
                zzfl0.zzc();
            }
            zzfl0.zze();
            if(zzfl0.zzh()) {
                v7 += v7;
            }
            return new zzfe(zzey0, zzez0, v9, v11, v10, v5, v8, v7, f, v17, v61, v58, v62);
        }
        return new zzfe(zzey0, zzez0, v9, v11, v10, v5, v8, v7, 1.0f, v17, -1, -1, -1);
    }

    public static zzfh zzd(byte[] arr_b, int v, int v1) {
        int[] arr_v20;
        zzfxn zzfxn2;
        int v87;
        int v86;
        int v85;
        boolean[][] arr2_z5;
        int v77;
        int v76;
        int[] arr_v18;
        int v74;
        int v73;
        int[] arr_v16;
        boolean[][] arr2_z3;
        int[] arr_v13;
        int v35;
        int v29;
        int v17;
        int v16;
        int[] arr_v2;
        int v14;
        int v13;
        boolean z2;
        zzfl zzfl0 = new zzfl(arr_b, v, v1);
        zzey zzey0 = zzfk.zzl(zzfl0);
        zzfl0.zzf(4);
        boolean z = zzfl0.zzh();
        boolean z1 = zzfl0.zzh();
        int v2 = zzfl0.zza(6);
        int v3 = v2 + 1;
        int v4 = zzfl0.zza(3);
        zzfl0.zzf(17);
        int v5 = 1;
        zzez zzez0 = zzfk.zzm(zzfl0, true, v4, null);
        for(int v7 = zzfl0.zzh() ? 0 : v4; v7 <= v4; ++v7) {
            zzfl0.zzc();
            zzfl0.zzc();
            zzfl0.zzc();
        }
        int v8 = zzfl0.zza(6);
        int v9 = zzfl0.zzc();
        zzfa zzfa0 = new zzfa(zzfxn.zzo(zzez0), new int[1]);
        if(v3 >= 2 && v9 + 1 >= 2 && (z && z1) && v8 + 1 >= v3) {
            int[][] arr2_v = new int[v9 + 1][v8 + 1];
            int[] arr_v = new int[v9 + 1];
            int[] arr_v1 = new int[v9 + 1];
            arr2_v[0][0] = 0;
            arr_v[0] = 1;
            arr_v1[0] = 0;
            for(int v6 = 0; v5 < v9 + 1; v6 = 0) {
                int v10 = 0;
                while(v6 <= v8) {
                    if(zzfl0.zzh()) {
                        arr2_v[v5][v10] = v6;
                        arr_v1[v5] = v6;
                        ++v10;
                    }
                    arr_v[v5] = v10;
                    ++v6;
                }
                ++v5;
            }
            if(zzfl0.zzh()) {
                zzfl0.zzf(0x40);
                if(zzfl0.zzh()) {
                    zzfl0.zzc();
                }
                int v11 = zzfl0.zzc();
                int v12 = 0;
                while(v12 < v11) {
                    zzfl0.zzc();
                    if(v12 == 0 || zzfl0.zzh()) {
                        v13 = zzfl0.zzh();
                        v14 = zzfl0.zzh();
                        if(v13 || v14) {
                            z2 = zzfl0.zzh();
                            if(z2) {
                                zzfl0.zzf(19);
                            }
                            zzfl0.zzf(8);
                            if(z2) {
                                zzfl0.zzf(4);
                            }
                            zzfl0.zzf(15);
                            goto label_66;
                        }
                    }
                    else {
                        v13 = 0;
                        v14 = 0;
                    }
                    z2 = false;
                label_66:
                    int v15 = 0;
                    while(v15 <= v4) {
                        if(zzfl0.zzh() || zzfl0.zzh()) {
                            zzfl0.zzc();
                        }
                        else if(zzfl0.zzh()) {
                            arr_v2 = arr_v1;
                            v16 = v11;
                            v17 = 0;
                            goto label_78;
                        }
                        v16 = v11;
                        v17 = zzfl0.zzc();
                        arr_v2 = arr_v1;
                    label_78:
                        int v18 = v13 + v14;
                        for(int v19 = 0; v19 < v18; ++v19) {
                            for(int v20 = 0; v20 <= v17; ++v20) {
                                zzfl0.zzc();
                                zzfl0.zzc();
                                if(z2) {
                                    zzfl0.zzc();
                                    zzfl0.zzc();
                                }
                                zzfl0.zze();
                            }
                        }
                        ++v15;
                        arr_v1 = arr_v2;
                        v11 = v16;
                    }
                    ++v12;
                }
            }
            if(!zzfl0.zzh()) {
                return new zzfh(zzey0, null, zzfa0, null, null);
            }
            zzfl0.zzd();
            zzez zzez1 = zzfk.zzm(zzfl0, false, v4, zzez0);
            int v21 = zzfl0.zzh();
            boolean[] arr_z = new boolean[16];
            int v22 = 0;
            for(int v23 = 0; v23 < 16; ++v23) {
                boolean z3 = zzfl0.zzh();
                arr_z[v23] = z3;
                if(z3) {
                    ++v22;
                }
            }
            if(v22 == 0 || !arr_z[1]) {
                return new zzfh(zzey0, null, zzfa0, null, null);
            }
            int[] arr_v3 = new int[v22];
            for(int v24 = 0; v24 < v22 - v21; ++v24) {
                arr_v3[v24] = zzfl0.zza(3);
            }
            int[] arr_v4 = new int[v22 + 1];
            if(v21 != 0) {
                for(int v25 = 1; v25 < v22; ++v25) {
                    for(int v26 = 0; v26 < v25; ++v26) {
                        arr_v4[v25] += arr_v3[v26] + 1;
                    }
                }
                arr_v4[v22] = 6;
            }
            int[][] arr2_v1 = new int[v3][v22];
            int[] arr_v5 = new int[v3];
            arr_v5[0] = 0;
            boolean z4 = zzfl0.zzh();
            int v27 = 1;
            while(v27 < v3) {
                arr_v5[v27] = z4 ? zzfl0.zza(6) : v27;
                if(v21 == 0) {
                    for(int v28 = 0; v28 < v22; ++v28) {
                        int[] arr_v6 = arr2_v1[v27];
                        arr_v6[v28] = zzfl0.zza(arr_v3[v28] + 1);
                    }
                    v29 = 0;
                }
                else {
                    v29 = v21;
                    for(int v30 = 0; v30 < v22; ++v30) {
                        arr2_v1[v27][v30] = (arr_v5[v27] & (1 << arr_v4[v30 + 1]) - 1) >> arr_v4[v30];
                    }
                }
                ++v27;
                v21 = v29;
            }
            int[] arr_v7 = new int[v8 + 1];
            int v31 = 1;
            int v32 = 0;
            while(v32 < v3) {
                arr_v7[arr_v5[v32]] = -1;
                int v33 = 0;
                for(int v34 = 0; v34 < 16; ++v34) {
                    if(arr_z[v34]) {
                        if(v34 == 1) {
                            arr_v7[arr_v5[v32]] = arr2_v1[v32][v33];
                            v35 = 1;
                        }
                        else {
                            v35 = v34;
                        }
                        ++v33;
                        v34 = v35;
                    }
                }
                if(v32 > 0) {
                    int v36 = 0;
                    while(true) {
                        if(v36 < v32) {
                            if(arr_v7[arr_v5[v32]] == arr_v7[arr_v5[v36]]) {
                                break;
                            }
                            else {
                                ++v36;
                                continue;
                            }
                        }
                        ++v31;
                        break;
                    }
                }
                ++v32;
            }
            int v37 = zzfl0.zza(4);
            if(v31 < 2 || v37 == 0) {
                return new zzfh(zzey0, null, zzfa0, null, null);
            }
            int[] arr_v8 = new int[v31];
            for(int v38 = 0; v38 < v31; ++v38) {
                arr_v8[v38] = zzfl0.zza(v37);
            }
            int[] arr_v9 = new int[v8 + 1];
            for(int v39 = 0; v39 < v3; ++v39) {
                arr_v9[Math.min(arr_v5[v39], v8)] = v39;
            }
            zzfxk zzfxk0 = new zzfxk();
            for(int v40 = 0; v40 <= v8; ++v40) {
                int v41 = Math.min(arr_v7[v40], v31 - 1);
                zzfxk0.zzf(new zzex(arr_v9[v40], (v41 < 0 ? -1 : arr_v8[v41])));
            }
            zzfxn zzfxn0 = zzfxk0.zzi();
            if(((zzex)zzfxn0.get(0)).zzb == -1) {
                return new zzfh(zzey0, null, zzfa0, null, null);
            }
            int v42;
            for(v42 = 1; true; ++v42) {
                if(v42 > v8) {
                    v42 = -1;
                    break;
                }
                if(((zzex)zzfxn0.get(v42)).zzb != -1) {
                    break;
                }
            }
            if(v42 == -1) {
                return new zzfh(zzey0, null, zzfa0, null, null);
            }
            Class class0 = Boolean.TYPE;
            boolean[][] arr2_z = (boolean[][])Array.newInstance(class0, new int[]{v3, v3});
            boolean[][] arr2_z1 = (boolean[][])Array.newInstance(class0, new int[]{v3, v3});
            for(int v43 = 1; v43 < v3; ++v43) {
                for(int v44 = 0; v44 < v43; ++v44) {
                    boolean[] arr_z1 = arr2_z[v43];
                    boolean[] arr_z2 = arr2_z1[v43];
                    boolean z5 = zzfl0.zzh();
                    arr_z2[v44] = z5;
                    arr_z1[v44] = z5;
                }
            }
            for(int v45 = 1; v45 < v3; ++v45) {
                for(int v46 = 0; v46 < v2; ++v46) {
                    for(int v47 = 0; v47 < v45; ++v47) {
                        boolean[] arr_z3 = arr2_z1[v45];
                        if(arr_z3[v47] && arr2_z1[v47][v46]) {
                            arr_z3[v46] = true;
                            break;
                        }
                    }
                }
            }
            int[] arr_v10 = new int[v8 + 1];
            for(int v48 = 0; v48 < v3; ++v48) {
                int v50 = 0;
                for(int v49 = 0; v49 < v48; ++v49) {
                    v50 += arr2_z[v48][v49];
                }
                arr_v10[arr_v5[v48]] = v50;
            }
            int v52 = 0;
            for(int v51 = 0; v51 < v3; ++v51) {
                if(arr_v10[arr_v5[v51]] == 0) {
                    ++v52;
                }
            }
            if(v52 > 1) {
                return new zzfh(zzey0, null, zzfa0, null, null);
            }
            int[] arr_v11 = new int[v3];
            int[] arr_v12 = new int[v9 + 1];
            if(zzfl0.zzh()) {
                for(int v53 = 0; v53 < v3; ++v53) {
                    arr_v11[v53] = zzfl0.zza(3);
                }
                arr_v13 = arr_v5;
            }
            else {
                arr_v13 = arr_v5;
                Arrays.fill(arr_v11, 0, v3, v4);
            }
            for(int v54 = 0; v54 < v9 + 1; ++v54) {
                int v55 = 0;
                for(int v56 = 0; v56 < arr_v[v54]; ++v56) {
                    v55 = Math.max(v55, arr_v11[((zzex)zzfxn0.get(arr2_v[v54][v56])).zza]);
                }
                arr_v12[v54] = v55 + 1;
            }
            int v57 = v42;
            if(zzfl0.zzh()) {
                for(int v58 = 0; v58 < v2; ++v58) {
                    for(int v59 = v58 + 1; v59 < v3; ++v59) {
                        if(arr2_z[v59][v58]) {
                            zzfl0.zzf(3);
                        }
                    }
                }
            }
            zzfl0.zze();
            int v60 = zzfl0.zzc() + 1;
            zzfxk zzfxk1 = new zzfxk();
            zzfxk1.zzf(zzez0);
            if(v60 > 1) {
                zzez zzez2 = zzez1;
                zzfxk1.zzf(zzez2);
                for(int v61 = 2; v61 < v60; ++v61) {
                    zzez2 = zzfk.zzm(zzfl0, zzfl0.zzh(), v4, zzez2);
                    zzfxk1.zzf(zzez2);
                }
            }
            zzfxn zzfxn1 = zzfxk1.zzi();
            int v62 = zzfl0.zzc() + (v9 + 1);
            if(v62 > v9 + 1) {
                return new zzfh(zzey0, null, zzfa0, null, null);
            }
            int v63 = zzfl0.zza(2);
            boolean[][] arr2_z2 = new boolean[v62][v8 + 1];
            int[] arr_v14 = new int[v62];
            int[] arr_v15 = new int[v62];
            int v64 = 0;
            while(v64 < v9 + 1) {
                arr_v14[v64] = 0;
                int v65 = arr_v1[v64];
                arr_v15[v64] = v65;
                if(v63 == 0) {
                    arr2_z3 = arr2_z;
                    arr_v16 = arr_v12;
                    Arrays.fill(arr2_z2[v64], 0, arr_v[v64], true);
                    arr_v14[v64] = arr_v[v64];
                }
                else {
                    arr2_z3 = arr2_z;
                    arr_v16 = arr_v12;
                    if(v63 == 1) {
                        for(int v66 = 0; v66 < arr_v[v64]; ++v66) {
                            arr2_z2[v64][v66] = arr2_v[v64][v66] == v65;
                        }
                        arr_v14[v64] = 1;
                    }
                    else {
                        arr2_z2[0][0] = true;
                        arr_v14[0] = 1;
                    }
                }
                ++v64;
                arr2_z = arr2_z3;
                arr_v12 = arr_v16;
            }
            int[] arr_v17 = new int[v8 + 1];
            boolean[][] arr2_z4 = new boolean[v62][v8 + 1];
            int v67 = 0;
            int v68 = 1;
            while(v68 < v62) {
                if(v63 == 2) {
                    for(int v69 = 0; v69 < arr_v[v68]; ++v69) {
                        boolean[] arr_z4 = arr2_z2[v68];
                        arr_z4[v69] = zzfl0.zzh();
                        int v70 = arr_v14[v68];
                        int v71 = arr2_z2[v68][v69];
                        arr_v14[v68] = v70 + v71;
                        if(v71 != 0) {
                            arr_v15[v68] = arr2_v[v68][v69];
                        }
                    }
                }
                if(v67 != 0) {
                    v73 = v63;
                    v74 = v57;
                }
                else if(arr2_v[v68][0] == 0 && arr2_z2[v68][0]) {
                    v67 = 0;
                    for(int v72 = 1; v72 < arr_v[v68]; ++v72) {
                        if(arr2_v[v68][v72] == v57 && arr2_z2[v68][v57]) {
                            v67 = v68;
                        }
                    }
                    v73 = v63;
                    v74 = v57;
                }
                else {
                    v73 = v63;
                    v74 = v57;
                    v67 = 0;
                }
                int v75 = 0;
                while(v75 < arr_v[v68]) {
                    if(v60 > 1) {
                        arr2_z4[v68][v75] = arr2_z2[v68][v75];
                        arr_v18 = arr_v15;
                        v76 = v74;
                        v77 = v60;
                        int v78 = zzgag.zza(v60, RoundingMode.CEILING);
                        if(!arr2_z4[v68][v75]) {
                            int v79 = ((zzex)zzfxn0.get(arr2_v[v68][v75])).zza;
                            int v80 = 0;
                            while(v80 < v75) {
                                arr2_z5 = arr2_z2;
                                if(arr2_z1[v79][((zzex)zzfxn0.get(arr2_v[v68][v80])).zza]) {
                                    arr2_z4[v68][v75] = true;
                                    goto label_413;
                                }
                                ++v80;
                                arr2_z2 = arr2_z5;
                            }
                        }
                        arr2_z5 = arr2_z2;
                    label_413:
                        if(arr2_z4[v68][v75]) {
                            if(v67 <= 0 || v68 != v67) {
                                zzfl0.zzf(v78);
                            }
                            else {
                                arr_v17[v75] = zzfl0.zza(v78);
                            }
                        }
                    }
                    else {
                        v77 = v60;
                        arr_v18 = arr_v15;
                        v76 = v74;
                        arr2_z5 = arr2_z2;
                    }
                    ++v75;
                    arr_v15 = arr_v18;
                    v74 = v76;
                    v60 = v77;
                    arr2_z2 = arr2_z5;
                }
                v57 = v74;
                if(arr_v14[v68] == 1 && arr_v10[arr_v15[v68]] > 0) {
                    zzfl0.zze();
                }
                ++v68;
                v63 = v73;
            }
            if(v67 == 0) {
                return new zzfh(zzey0, null, zzfa0, null, null);
            }
            int v81 = zzfl0.zzc();
            zzfxk zzfxk2 = zzfxn.zzi(v81 + 1);
            int[] arr_v19 = new int[v3];
            int v82 = 0;
            while(v82 < v81 + 1) {
                int v83 = zzfl0.zza(16);
                int v84 = zzfl0.zza(16);
                if(zzfl0.zzh()) {
                    v85 = zzfl0.zza(2);
                    if(v85 == 3) {
                        zzfl0.zze();
                    }
                    v86 = zzfl0.zza(4);
                    v87 = zzfl0.zza(4);
                }
                else {
                    v85 = 0;
                    v86 = 0;
                    v87 = 0;
                }
                if(zzfl0.zzh()) {
                    zzfxn2 = zzfxn0;
                    arr_v20 = arr_v17;
                    v83 = zzfk.zzk(v83, v85, zzfl0.zzc(), zzfl0.zzc());
                    v84 = zzfk.zzj(v84, v85, zzfl0.zzc(), zzfl0.zzc());
                }
                else {
                    zzfxn2 = zzfxn0;
                    arr_v20 = arr_v17;
                }
                zzfxk2.zzf(new zzfb(v85, v86, v87, v83, v84));
                ++v82;
                zzfxn0 = zzfxn2;
                arr_v17 = arr_v20;
            }
            if(v81 + 1 <= 1 || !zzfl0.zzh()) {
                for(int v90 = 1; v90 < v3; ++v90) {
                    arr_v19[v90] = Math.min(v90, v81);
                }
            }
            else {
                int v88 = zzgag.zza(v81 + 1, RoundingMode.CEILING);
                for(int v89 = 1; v89 < v3; ++v89) {
                    arr_v19[v89] = zzfl0.zza(v88);
                }
            }
            zzfc zzfc0 = new zzfc(zzfxk2.zzi(), arr_v19);
            zzfl0.zzf(2);
            for(int v91 = 1; v91 < v3; ++v91) {
                if(arr_v10[arr_v13[v91]] == 0) {
                    zzfl0.zze();
                }
            }
            for(int v92 = 1; v92 < v62; ++v92) {
                boolean z6 = zzfl0.zzh();
                for(int v93 = 0; v93 < arr_v12[v92]; ++v93) {
                    if((v93 <= 0 || !z6 ? v93 == 0 : zzfl0.zzh())) {
                        for(int v94 = 0; v94 < arr_v[v92]; ++v94) {
                            if(arr2_z4[v92][v94]) {
                                zzfl0.zzc();
                            }
                        }
                        zzfl0.zzc();
                        zzfl0.zzc();
                    }
                }
            }
            int v95 = zzfl0.zzc();
            if(zzfl0.zzh()) {
                zzfl0.zzf(v95 + 2);
            }
            else {
                for(int v96 = 1; v96 < v3; ++v96) {
                    for(int v97 = 0; v97 < v96; ++v97) {
                        if(arr2_z[v96][v97]) {
                            zzfl0.zzf(v95 + 2);
                        }
                    }
                }
            }
            int v98 = zzfl0.zzc();
            for(int v99 = 1; v99 <= v98; ++v99) {
                zzfl0.zzf(8);
            }
            if(zzfl0.zzh()) {
                zzfl0.zzd();
                if(zzfl0.zzh() || zzfl0.zzh()) {
                    zzfl0.zze();
                }
                boolean z7 = zzfl0.zzh();
                boolean z8 = zzfl0.zzh();
                if(z7 || z8) {
                    for(int v100 = 0; v100 < v9 + 1; ++v100) {
                        for(int v101 = 0; v101 < arr_v12[v100]; ++v101) {
                            boolean z9 = z7 ? zzfl0.zzh() : false;
                            boolean z10 = z8 ? zzfl0.zzh() : false;
                            if(z9) {
                                zzfl0.zzf(0x20);
                            }
                            if(z10) {
                                zzfl0.zzf(18);
                            }
                        }
                    }
                }
                boolean z11 = zzfl0.zzh();
                int v102 = z11 ? zzfl0.zza(4) + 1 : v3;
                zzfxk zzfxk3 = zzfxn.zzi(v102);
                int[] arr_v21 = new int[v3];
                for(int v103 = 0; v103 < v102; ++v103) {
                    zzfl0.zzf(3);
                    int v104 = zzfl0.zzh() ? 1 : 2;
                    int v105 = zzk.zza(zzfl0.zza(8));
                    int v106 = zzk.zzb(zzfl0.zza(8));
                    zzfl0.zzf(8);
                    zzfxk3.zzf(new zzff(v105, v104, v106));
                }
                if(z11 && v102 > 1) {
                    for(int v107 = 0; v107 < v3; ++v107) {
                        arr_v21[v107] = zzfl0.zza(4);
                    }
                }
                zzfg zzfg0 = new zzfg(zzfxk3.zzi(), arr_v21);
                return new zzfh(zzey0, zzfxn0, new zzfa(zzfxn1, arr_v17), zzfc0, zzfg0);
            }
            return new zzfh(zzey0, zzfxn0, new zzfa(zzfxn1, arr_v17), zzfc0, null);
        }
        return new zzfh(zzey0, null, zzfa0, null, null);
    }

    public static zzfi zze(byte[] arr_b, int v, int v1) {
        zzfl zzfl0 = new zzfl(arr_b, 4, v1);
        int v2 = zzfl0.zzc();
        int v3 = zzfl0.zzc();
        zzfl0.zze();
        return new zzfi(v2, v3, zzfl0.zzh());
    }

    public static zzfj zzf(byte[] arr_b, int v, int v1) {
        int v43;
        int v42;
        float f;
        int v35;
        int v34;
        int v33;
        boolean z1;
        int v19;
        int v18;
        int v10;
        int v9;
        int v8;
        boolean z;
        int v7;
        zzfl zzfl0 = new zzfl(arr_b, v, v1);
        int v2 = zzfl0.zza(8);
        int v3 = zzfl0.zza(8);
        int v4 = zzfl0.zza(8);
        int v5 = zzfl0.zzc();
        int v6 = 1;
        if(v2 != 44 && v2 != 100 && v2 != 110 && v2 != 0x7A && v2 != 0xF4 && (v2 != 83 && v2 != 86)) {
            switch(v2) {
                case 0x76: 
                case 0x80: {
                    goto label_14;
                }
                case 0x8A: {
                    v2 = 0x8A;
                    goto label_14;
                }
                default: {
                    v7 = 1;
                    z = false;
                    v8 = 0;
                    v9 = 0;
                }
            }
        }
        else {
        label_14:
            v7 = zzfl0.zzc();
            if(v7 == 3) {
                z = zzfl0.zzh();
                v10 = 3;
            }
            else {
                v10 = v7;
                z = false;
            }
            v8 = zzfl0.zzc();
            v9 = zzfl0.zzc();
            zzfl0.zze();
            if(zzfl0.zzh()) {
                for(int v11 = 0; v11 < (v10 == 3 ? 12 : 8); ++v11) {
                    if(zzfl0.zzh()) {
                        int v12 = v11 >= 6 ? 0x40 : 16;
                        int v14 = 8;
                        int v15 = 8;
                        for(int v13 = 0; v13 < v12; ++v13) {
                            if(v14 != 0) {
                                v14 = (v15 + zzfl0.zzb() + 0x100) % 0x100;
                            }
                            if(v14 != 0) {
                                v15 = v14;
                            }
                        }
                    }
                }
            }
        }
        int v16 = zzfl0.zzc();
        int v17 = zzfl0.zzc();
        if(v17 == 0) {
            v18 = 0;
            v19 = zzfl0.zzc() + 4;
            z1 = false;
        }
        else if(v17 == 1) {
            boolean z2 = zzfl0.zzh();
            zzfl0.zzb();
            zzfl0.zzb();
            long v20 = (long)zzfl0.zzc();
            for(int v21 = 0; ((long)v21) < v20; ++v21) {
                zzfl0.zzc();
            }
            z1 = z2;
            v18 = 1;
            v19 = 0;
        }
        else {
            v18 = v17;
            v19 = 0;
            z1 = false;
        }
        int v22 = zzfl0.zzc();
        zzfl0.zze();
        int v23 = zzfl0.zzc();
        int v24 = zzfl0.zzc();
        int v25 = zzfl0.zzh();
        int v26 = 2 - v25;
        if(v25 == 0) {
            zzfl0.zze();
        }
        zzfl0.zze();
        int v27 = (v23 + 1) * 16;
        int v28 = (v24 + 1) * v26 * 16;
        if(zzfl0.zzh()) {
            int v29 = zzfl0.zzc();
            int v30 = zzfl0.zzc();
            int v31 = zzfl0.zzc();
            int v32 = zzfl0.zzc();
            if(v7 == 0) {
                v33 = 1;
            }
            else {
                v33 = v7 == 3 ? 1 : 2;
                v26 *= (v7 == 1 ? 2 : 1);
            }
            v27 -= (v29 + v30) * v33;
            v28 -= (v31 + v32) * v26;
        }
        switch(v2) {
            case 44: 
            case 86: 
            case 100: 
            case 110: 
            case 0x7A: {
            label_93:
                if((v3 & 16) == 0) {
                    v34 = v2;
                    v35 = 16;
                }
                else {
                    v34 = v2;
                    v35 = 0;
                }
                break;
            }
            case 0xF4: {
                v2 = 0xF4;
                goto label_93;
            }
            default: {
                v34 = v2;
                v35 = 16;
            }
        }
        int v36 = -1;
        if(zzfl0.zzh()) {
            if(zzfl0.zzh()) {
                int v37 = zzfl0.zza(8);
                if(v37 == 0xFF) {
                    int v38 = zzfl0.zza(16);
                    int v39 = zzfl0.zza(16);
                    f = v38 == 0 || v39 == 0 ? 1.0f : ((float)v38) / ((float)v39);
                }
                else if(v37 < 17) {
                    f = zzfk.zzb[v37];
                }
                else {
                    zzdo.zzf("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + v37);
                    f = 1.0f;
                }
            }
            else {
                f = 1.0f;
            }
            if(zzfl0.zzh()) {
                zzfl0.zze();
            }
            if(zzfl0.zzh()) {
                zzfl0.zzf(3);
                if(!zzfl0.zzh()) {
                    v6 = 2;
                }
                if(zzfl0.zzh()) {
                    int v40 = zzfl0.zza(8);
                    int v41 = zzfl0.zza(8);
                    zzfl0.zzf(8);
                    v42 = zzk.zzb(v41);
                    v43 = zzk.zza(v40);
                    v36 = v6;
                }
                else {
                    v36 = v6;
                    v43 = -1;
                    v42 = -1;
                }
            }
            else {
                v43 = -1;
                v42 = -1;
            }
            if(zzfl0.zzh()) {
                zzfl0.zzc();
                zzfl0.zzc();
            }
            if(zzfl0.zzh()) {
                zzfl0.zzf(65);
            }
            boolean z3 = zzfl0.zzh();
            if(z3) {
                zzfk.zzn(zzfl0);
            }
            boolean z4 = zzfl0.zzh();
            if(z4) {
                zzfk.zzn(zzfl0);
            }
            if(z3 || z4) {
                zzfl0.zze();
            }
            zzfl0.zze();
            if(zzfl0.zzh()) {
                zzfl0.zze();
                zzfl0.zzc();
                zzfl0.zzc();
                zzfl0.zzc();
                zzfl0.zzc();
                int v44 = zzfl0.zzc();
                zzfl0.zzc();
                return new zzfj(v34, v3, v4, v5, v22, v27, v28, f, v8, v9, z, ((boolean)v25), v16 + 4, v18, v19, z1, v43, v36, v42, v44);
            }
            return new zzfj(v34, v3, v4, v5, v22, v27, v28, f, v8, v9, z, ((boolean)v25), v16 + 4, v18, v19, z1, v43, v36, v42, v35);
        }
        return new zzfj(v34, v3, v4, v5, v22, v27, v28, 1.0f, v8, v9, z, ((boolean)v25), v16 + 4, v18, v19, z1, -1, -1, -1, v35);
    }

    @Nullable
    public static String zzg(List list0) {
        for(int v = 0; v < list0.size(); ++v) {
            byte[] arr_b = (byte[])list0.get(v);
            int v1 = arr_b.length;
            if(v1 > 3) {
                zzfxk zzfxk0 = new zzfxk();
                for(int v2 = 0; v2 < arr_b.length; v2 = v3 + 3) {
                    int v3 = zzfk.zza(arr_b, v2, arr_b.length, new boolean[3]);
                    if(v3 != arr_b.length) {
                        zzfxk0.zzf(v3);
                    }
                }
                zzfxn zzfxn0 = zzfxk0.zzi();
                for(int v4 = 0; v4 < zzfxn0.size(); ++v4) {
                    if(((int)(((Integer)zzfxn0.get(v4)))) + 3 < v1) {
                        zzfl zzfl0 = new zzfl(arr_b, ((int)(((Integer)zzfxn0.get(v4)))) + 3, v1);
                        zzey zzey0 = zzfk.zzl(zzfl0);
                        if(zzey0.zza == 33 && zzey0.zzb == 0) {
                            zzfl0.zzf(4);
                            int v5 = zzfl0.zza(3);
                            zzfl0.zze();
                            zzez zzez0 = zzfk.zzm(zzfl0, true, v5, null);
                            return zzcy.zzd(zzez0.zza, zzez0.zzb, zzez0.zzc, zzez0.zzd, zzez0.zze, zzez0.zzf);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static void zzh(boolean[] arr_z) {
        arr_z[0] = false;
        arr_z[1] = false;
        arr_z[2] = false;
    }

    public static boolean zzi(byte b) {
        if((b & 0x60) >> 5 != 0) {
            return true;
        }
        switch(b & 0x1F) {
            case 1: {
                return false;
            }
            case 9: {
                return false;
            }
            case 14: {
                return false;
            }
            default: {
                return true;
            }
        }
    }

    private static int zzj(int v, int v1, int v2, int v3) {
        return v - (v1 == 1 ? 2 : 1) * (v2 + v3);
    }

    private static int zzk(int v, int v1, int v2, int v3) {
        return v - (v1 == 1 || v1 == 2 ? 2 : 1) * (v2 + v3);
    }

    private static zzey zzl(zzfl zzfl0) {
        zzfl0.zze();
        return new zzey(zzfl0.zza(6), zzfl0.zza(6), zzfl0.zza(3) - 1);
    }

    private static zzez zzm(zzfl zzfl0, boolean z, int v, @Nullable zzez zzez0) {
        int v9;
        int v8;
        boolean z2;
        int[] arr_v1;
        int v7;
        int v4;
        int v3;
        boolean z1;
        int[] arr_v = new int[6];
        if(z) {
            int v2 = zzfl0.zza(2);
            z1 = zzfl0.zzh();
            v3 = zzfl0.zza(5);
            v4 = 0;
            for(int v5 = 0; v5 < 0x20; ++v5) {
                if(zzfl0.zzh()) {
                    v4 |= 1 << v5;
                }
            }
            for(int v6 = 0; v6 < 6; ++v6) {
                arr_v[v6] = zzfl0.zza(8);
            }
            v7 = v2;
            arr_v1 = arr_v;
            z2 = z1;
            v8 = v3;
            v9 = v4;
        }
        else if(zzez0 == null) {
            arr_v1 = arr_v;
            v7 = 0;
            z2 = false;
            v8 = 0;
            v9 = 0;
        }
        else {
            z1 = zzez0.zzb;
            v3 = zzez0.zzc;
            v4 = zzez0.zzd;
            arr_v = zzez0.zze;
            v7 = zzez0.zza;
            arr_v1 = arr_v;
            z2 = z1;
            v8 = v3;
            v9 = v4;
        }
        int v10 = zzfl0.zza(8);
        int v11 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            if(zzfl0.zzh()) {
                v11 += 88;
            }
            if(zzfl0.zzh()) {
                v11 += 8;
            }
        }
        zzfl0.zzf(v11);
        if(v > 0) {
            zzfl0.zzf(v * -2 + 16);
        }
        return new zzez(v7, z2, v8, v9, arr_v1, v10);
    }

    private static void zzn(zzfl zzfl0) {
        int v = zzfl0.zzc();
        zzfl0.zzf(8);
        for(int v1 = 0; v1 < v + 1; ++v1) {
            zzfl0.zzc();
            zzfl0.zzc();
            zzfl0.zze();
        }
        zzfl0.zzf(20);
    }
}

