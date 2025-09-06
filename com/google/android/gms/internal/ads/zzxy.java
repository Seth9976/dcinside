package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

public abstract class zzxy extends zzyb {
    protected abstract Pair zzd(zzxx arg1, int[][][] arg2, int[] arg3, zzug arg4, zzbq arg5) throws zzib;

    @Override  // com.google.android.gms.internal.ads.zzyb
    public final zzyc zzo(zzlm[] arr_zzlm, zzwj zzwj0, zzug zzug0, zzbq zzbq0) throws zzib {
        boolean z1;
        int[] arr_v2;
        int[] arr_v = new int[3];
        zzbr[][] arr2_zzbr = new zzbr[3][];
        int[][][] arr3_v = new int[3][][];
        for(int v = 0; v < 3; ++v) {
            arr2_zzbr[v] = new zzbr[zzwj0.zzb];
            arr3_v[v] = new int[zzwj0.zzb][];
        }
        int[] arr_v1 = new int[2];
        for(int v1 = 0; v1 < 2; ++v1) {
            arr_v1[v1] = arr_zzlm[v1].zze();
        }
        for(int v2 = 0; v2 < zzwj0.zzb; ++v2) {
            zzbr zzbr0 = zzwj0.zzb(v2);
            int v3 = zzbr0.zzc;
            int v4 = 2;
            int v5 = 0;
            int v6 = 1;
            for(int v7 = 0; v7 < 2; ++v7) {
                zzlm zzlm0 = arr_zzlm[v7];
                int v9 = 0;
                for(int v8 = 0; v8 < zzbr0.zza; ++v8) {
                    v9 = Math.max(v9, zzlm0.zzY(zzbr0.zzb(v8)) & 7);
                }
                int v10 = arr_v[v7] == 0 ? 1 : 0;
                if(v9 > v5) {
                    v6 = v10;
                    v4 = v7;
                    v5 = v9;
                }
                else if(v9 == v5 && v3 == 5 && v6 == 0 && v10 != 0) {
                    v4 = v7;
                    v5 = v9;
                    v6 = 1;
                }
            }
            if(v4 == 2) {
                arr_v2 = new int[zzbr0.zza];
            }
            else {
                zzlm zzlm1 = arr_zzlm[v4];
                int[] arr_v3 = new int[zzbr0.zza];
                for(int v11 = 0; v11 < zzbr0.zza; ++v11) {
                    arr_v3[v11] = zzlm1.zzY(zzbr0.zzb(v11));
                }
                arr_v2 = arr_v3;
            }
            int v12 = arr_v[v4];
            arr2_zzbr[v4][v12] = zzbr0;
            arr3_v[v4][v12] = arr_v2;
            arr_v[v4] = v12 + 1;
        }
        zzwj[] arr_zzwj = new zzwj[2];
        String[] arr_s = new String[2];
        int[] arr_v4 = new int[2];
        for(int v13 = 0; v13 < 2; ++v13) {
            int v14 = arr_v[v13];
            arr_zzwj[v13] = new zzwj(((zzbr[])zzei.zzN(arr2_zzbr[v13], v14)));
            arr3_v[v13] = (int[][])zzei.zzN(arr3_v[v13], v14);
            arr_s[v13] = arr_zzlm[v13].zzU();
            arr_v4[v13] = arr_zzlm[v13].zzb();
        }
        zzxx zzxx0 = new zzxx(arr_s, arr_v4, arr_zzwj, arr_v1, arr3_v, new zzwj(((zzbr[])zzei.zzN(arr2_zzbr[2], arr_v[2]))));
        Pair pair0 = this.zzd(zzxx0, arr3_v, arr_v1, zzug0, zzbq0);
        zzxz[] arr_zzxz = (zzxz[])pair0.second;
        List[] arr_list = new List[arr_zzxz.length];
        for(int v15 = 0; v15 < arr_zzxz.length; ++v15) {
            zzxz zzxz0 = arr_zzxz[v15];
            arr_list[v15] = zzxz0 == null ? zzfxn.zzn() : zzfxn.zzo(zzxz0);
        }
        zzfxk zzfxk0 = new zzfxk();
        int v16 = 0;
        while(v16 < 2) {
            zzwj zzwj1 = zzxx0.zzd(v16);
            List list0 = arr_list[v16];
            int v17 = 0;
            while(v17 < zzwj1.zzb) {
                zzbr zzbr1 = zzwj1.zzb(v17);
                boolean z = zzxx0.zza(v16, v17, false) != 0;
                int[] arr_v5 = new int[zzbr1.zza];
                boolean[] arr_z = new boolean[zzbr1.zza];
                int v18 = 0;
                while(v18 < zzbr1.zza) {
                    arr_v5[v18] = zzxx0.zzb(v16, v17, v18) & 7;
                    int v19 = 0;
                    while(true) {
                        z1 = false;
                        if(v19 < list0.size()) {
                            zzxz zzxz1 = (zzxz)list0.get(v19);
                            if(!zzxz1.zzg().equals(zzbr1) || zzxz1.zzc(v18) == -1) {
                                ++v19;
                                continue;
                            }
                            else {
                                z1 = true;
                            }
                        }
                        break;
                    }
                    arr_z[v18] = z1;
                    ++v18;
                }
                zzfxk0.zzf(new zzbx(zzbr1, z, arr_v5, arr_z));
                ++v17;
            }
            ++v16;
        }
        zzwj zzwj2 = zzxx0.zze();
        for(int v20 = 0; v20 < zzwj2.zzb; ++v20) {
            zzbr zzbr2 = zzwj2.zzb(v20);
            int[] arr_v6 = new int[zzbr2.zza];
            Arrays.fill(arr_v6, 0);
            zzfxk0.zzf(new zzbx(zzbr2, false, arr_v6, new boolean[zzbr2.zza]));
        }
        zzby zzby0 = new zzby(zzfxk0.zzi());
        return new zzyc(((zzln[])pair0.first), ((zzxv[])pair0.second), zzby0, zzxx0);
    }

    @Override  // com.google.android.gms.internal.ads.zzyb
    public final void zzp(@Nullable Object object0) {
        zzxx zzxx0 = (zzxx)object0;
    }
}

