package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class zzwq extends zzws {
    protected zzwq(zzbr zzbr0, int[] arr_v, int v, zzyj zzyj0, long v1, long v2, long v3, int v4, int v5, float f, float f1, List list0, zzcx zzcx0) {
        super(zzbr0, arr_v, 0);
        zzfxn.zzl(list0);
    }

    static zzfxn zzh(zzxu[] arr_zzxu) {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < 2; ++v) {
            zzxu zzxu0 = arr_zzxu[v];
            if(zzxu0 == null || zzxu0.zzb.length <= 1) {
                arrayList0.add(null);
            }
            else {
                zzfxk zzfxk0 = new zzfxk();
                zzfxk0.zzf(new zzwo(0L, 0L));
                arrayList0.add(zzfxk0);
            }
        }
        long[][] arr2_v = new long[2][];
        for(int v1 = 0; v1 < 2; ++v1) {
            zzxu zzxu1 = arr_zzxu[v1];
            if(zzxu1 == null) {
                arr2_v[v1] = new long[0];
            }
            else {
                arr2_v[v1] = new long[zzxu1.zzb.length];
                for(int v2 = 0; true; ++v2) {
                    int[] arr_v = zzxu1.zzb;
                    if(v2 >= arr_v.length) {
                        break;
                    }
                    long v3 = (long)zzxu1.zza.zzb(arr_v[v2]).zzj;
                    long[] arr_v1 = arr2_v[v1];
                    if(v3 == -1L) {
                        v3 = 0L;
                    }
                    arr_v1[v2] = v3;
                }
                Arrays.sort(arr2_v[v1]);
            }
        }
        int[] arr_v2 = new int[2];
        long[] arr_v3 = new long[2];
        for(int v4 = 0; v4 < 2; ++v4) {
            long[] arr_v4 = arr2_v[v4];
            arr_v3[v4] = arr_v4.length == 0 ? 0L : arr_v4[0];
        }
        zzwq.zzi(arrayList0, arr_v3);
        zzfxy zzfxy0 = zzfyt.zzc(zzfyy.zzc()).zzb(2).zza();
        for(int v5 = 0; v5 < 2; ++v5) {
            int v6 = arr2_v[v5].length;
            if(v6 > 1) {
                double[] arr_f = new double[v6];
                for(int v7 = 0; true; ++v7) {
                    long[] arr_v5 = arr2_v[v5];
                    double f = 0.0;
                    if(v7 >= arr_v5.length) {
                        break;
                    }
                    long v8 = arr_v5[v7];
                    if(v8 != -1L) {
                        f = Math.log(v8);
                    }
                    arr_f[v7] = f;
                }
                int v9 = v6 - 1;
                double f1 = arr_f[v9] - arr_f[0];
                int v10 = 0;
                while(v10 < v9) {
                    double f2 = arr_f[v10];
                    ++v10;
                    zzfxy0.zzq(((double)(f1 == 0.0 ? 1.0 : ((f2 + arr_f[v10]) * 0.5 - arr_f[0]) / f1)), v5);
                }
            }
        }
        zzfxn zzfxn0 = zzfxn.zzl(zzfxy0.zzr());
        for(int v11 = 0; v11 < zzfxn0.size(); ++v11) {
            int v12 = (int)(((Integer)zzfxn0.get(v11)));
            int v13 = arr_v2[v12] + 1;
            arr_v2[v12] = v13;
            arr_v3[v12] = arr2_v[v12][v13];
            zzwq.zzi(arrayList0, arr_v3);
        }
        for(int v14 = 0; v14 < 2; ++v14) {
            if(arrayList0.get(v14) != null) {
                long v15 = arr_v3[v14];
                arr_v3[v14] = v15 + v15;
            }
        }
        zzwq.zzi(arrayList0, arr_v3);
        zzfxk zzfxk1 = new zzfxk();
        for(int v16 = 0; v16 < arrayList0.size(); ++v16) {
            zzfxk zzfxk2 = (zzfxk)arrayList0.get(v16);
            zzfxk1.zzf((zzfxk2 == null ? zzfxn.zzn() : zzfxk2.zzi()));
        }
        return zzfxk1.zzi();
    }

    private static void zzi(List list0, long[] arr_v) {
        long v1 = 0L;
        for(int v2 = 0; v2 < 2; ++v2) {
            v1 += arr_v[v2];
        }
        for(int v = 0; v < list0.size(); ++v) {
            zzfxk zzfxk0 = (zzfxk)list0.get(v);
            if(zzfxk0 != null) {
                zzfxk0.zzf(new zzwo(v1, arr_v[v]));
            }
        }
    }
}

