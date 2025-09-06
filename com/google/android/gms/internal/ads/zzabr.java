package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public final class zzabr {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final float zzk;
    @Nullable
    public final String zzl;

    private zzabr(List list0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, float f, @Nullable String s) {
        this.zza = list0;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
        this.zze = v3;
        this.zzf = v4;
        this.zzg = v5;
        this.zzh = v6;
        this.zzi = v7;
        this.zzj = v8;
        this.zzk = f;
        this.zzl = s;
    }

    public static zzabr zza(zzdy zzdy0) throws zzbc {
        int v13;
        int v12;
        int v11;
        int v10;
        int v9;
        int v8;
        float f;
        int v7;
        int v6;
        String s;
        try {
            zzdy0.zzM(4);
            int v = zzdy0.zzm();
            int v1 = (v & 3) + 1;
            if(v1 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList0 = new ArrayList();
            int v2 = zzdy0.zzm();
            for(int v3 = 0; v3 < (v2 & 0x1F); ++v3) {
                arrayList0.add(zzabr.zzb(zzdy0));
            }
            int v4 = zzdy0.zzm();
            for(int v5 = 0; v5 < v4; ++v5) {
                arrayList0.add(zzabr.zzb(zzdy0));
            }
            if((v2 & 0x1F) > 0) {
                byte[] arr_b = (byte[])arrayList0.get(0);
                zzfj zzfj0 = zzfk.zzf(((byte[])arrayList0.get(0)), (v & 3) + 2, arr_b.length);
                s = zzcy.zzc(zzfj0.zza, zzfj0.zzb, zzfj0.zzc);
                v6 = zzfj0.zzl;
                v7 = zzfj0.zzm;
                f = zzfj0.zzg;
                v8 = zzfj0.zzi + 8;
                v9 = zzfj0.zzj;
                v10 = zzfj0.zzk;
                v11 = zzfj0.zze;
                v12 = zzfj0.zzf;
                v13 = zzfj0.zzh + 8;
            }
            else {
                s = null;
                v11 = -1;
                v12 = -1;
                v13 = -1;
                v8 = -1;
                v9 = -1;
                v10 = -1;
                v6 = -1;
                v7 = 16;
                f = 1.0f;
            }
            return new zzabr(arrayList0, v1, v11, v12, v13, v8, v9, v10, v6, v7, f, s);
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
        }
        throw zzbc.zza("Error parsing AVC config", arrayIndexOutOfBoundsException0);
    }

    private static byte[] zzb(zzdy zzdy0) {
        int v = zzdy0.zzq();
        zzdy0.zzM(v);
        return zzcy.zze(zzdy0.zzN(), zzdy0.zzd(), v);
    }
}

