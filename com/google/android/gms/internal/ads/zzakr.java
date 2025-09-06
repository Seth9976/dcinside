package com.google.android.gms.internal.ads;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public final class zzakr implements zzakf {
    private static final byte[] zza;
    private static final byte[] zzb;
    private static final byte[] zzc;
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzakk zzg;
    private final zzakj zzh;
    private final zzakq zzi;
    private Bitmap zzj;

    static {
        zzakr.zza = new byte[]{0, 7, 8, 15};
        zzakr.zzb = new byte[]{0, 0x77, -120, -1};
        zzakr.zzc = new byte[]{0, 17, 34, 51, 68, 85, 102, 0x77, -120, -103, -86, -69, -52, -35, -18, -1};
    }

    public zzakr(List list0) {
        zzdy zzdy0 = new zzdy(((byte[])list0.get(0)));
        int v = zzdy0.zzq();
        int v1 = zzdy0.zzq();
        Paint paint0 = new Paint();
        this.zzd = paint0;
        paint0.setStyle(Paint.Style.FILL_AND_STROKE);
        paint0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint0.setPathEffect(null);
        Paint paint1 = new Paint();
        this.zze = paint1;
        paint1.setStyle(Paint.Style.FILL);
        paint1.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint1.setPathEffect(null);
        this.zzf = new Canvas();
        this.zzg = new zzakk(0x2CF, 0x23F, 0, 0x2CF, 0, 0x23F);
        this.zzh = new zzakj(0, zzakr.zzg(), zzakr.zzh(), zzakr.zzi());
        this.zzi = new zzakq(v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzakf
    public final void zza(byte[] arr_b, int v, int v1, zzake zzake0, zzdb zzdb0) {
        int v51;
        int v49;
        int[] arr_v;
        SparseArray sparseArray6;
        SparseArray sparseArray5;
        zzajx zzajx0;
        int v37;
        int v36;
        int v35;
        int v34;
        int v28;
        int v27;
        int v26;
        zzdx zzdx0 = new zzdx(arr_b, v + v1);
        zzdx0.zzl(v);
        while(zzdx0.zza() >= 0x30 && zzdx0.zzd(8) == 15) {
            zzakq zzakq0 = this.zzi;
            int v2 = zzdx0.zzd(8);
            int v3 = zzdx0.zzd(16);
            int v4 = zzdx0.zzd(16);
            int v5 = zzdx0.zzb() + v4;
            if(v4 * 8 > zzdx0.zza()) {
                zzdo.zzf("DvbParser", "Data field length exceeds limit");
                zzdx0.zzn(zzdx0.zza());
            }
            else {
                switch(v2) {
                    case 16: {
                        if(v3 == zzakq0.zza) {
                            zzakm zzakm0 = zzakq0.zzi;
                            int v6 = zzdx0.zzd(8);
                            int v7 = zzdx0.zzd(4);
                            int v8 = zzdx0.zzd(2);
                            zzdx0.zzn(2);
                            int v9 = v4 - 2;
                            SparseArray sparseArray0 = new SparseArray();
                            while(v9 > 0) {
                                int v10 = zzdx0.zzd(8);
                                zzdx0.zzn(8);
                                sparseArray0.put(v10, new zzakn(zzdx0.zzd(16), zzdx0.zzd(16)));
                                v9 -= 6;
                            }
                            zzakm zzakm1 = new zzakm(v6, v7, v8, sparseArray0);
                            if(zzakm1.zzb != 0) {
                                zzakq0.zzi = zzakm1;
                                zzakq0.zzc.clear();
                                zzakq0.zzd.clear();
                                zzakq0.zze.clear();
                            }
                            else if(zzakm0 != null && zzakm0.zza != zzakm1.zza) {
                                zzakq0.zzi = zzakm1;
                            }
                        }
                        break;
                    }
                    case 17: {
                        zzakm zzakm2 = zzakq0.zzi;
                        if(v3 == zzakq0.zza && zzakm2 != null) {
                            int v11 = zzdx0.zzd(8);
                            zzdx0.zzn(4);
                            boolean z = zzdx0.zzp();
                            zzdx0.zzn(3);
                            int v12 = zzdx0.zzd(16);
                            int v13 = zzdx0.zzd(16);
                            int v14 = zzdx0.zzd(3);
                            int v15 = zzdx0.zzd(3);
                            zzdx0.zzn(2);
                            int v16 = zzdx0.zzd(8);
                            int v17 = zzdx0.zzd(8);
                            int v18 = zzdx0.zzd(4);
                            int v19 = zzdx0.zzd(2);
                            zzdx0.zzn(2);
                            int v20 = v4 - 10;
                            SparseArray sparseArray1 = new SparseArray();
                            while(v20 > 0) {
                                int v21 = zzdx0.zzd(16);
                                int v22 = zzdx0.zzd(2);
                                int v23 = zzdx0.zzd(2);
                                int v24 = zzdx0.zzd(12);
                                zzdx0.zzn(4);
                                int v25 = zzdx0.zzd(12);
                                if(v22 == 1) {
                                label_72:
                                    v20 -= 8;
                                    v26 = v22;
                                    v27 = zzdx0.zzd(8);
                                    v28 = zzdx0.zzd(8);
                                }
                                else if(v22 == 2) {
                                    v22 = 2;
                                    goto label_72;
                                }
                                else {
                                    v26 = v22;
                                    v20 -= 6;
                                    v27 = 0;
                                    v28 = 0;
                                }
                                sparseArray1.put(v21, new zzakp(v26, v23, v24, v25, v27, v28));
                            }
                            zzako zzako0 = new zzako(v11, z, v12, v13, v14, v15, v16, v17, v18, v19, sparseArray1);
                            if(zzakm2.zzb == 0) {
                                zzako zzako1 = (zzako)zzakq0.zzc.get(zzako0.zza);
                                if(zzako1 != null) {
                                    for(int v29 = 0; true; ++v29) {
                                        SparseArray sparseArray2 = zzako1.zzj;
                                        if(v29 >= sparseArray2.size()) {
                                            break;
                                        }
                                        int v30 = sparseArray2.keyAt(v29);
                                        zzakp zzakp0 = (zzakp)sparseArray2.valueAt(v29);
                                        zzako0.zzj.put(v30, zzakp0);
                                    }
                                }
                            }
                            zzakq0.zzc.put(zzako0.zza, zzako0);
                        }
                        break;
                    }
                    case 18: {
                        if(v3 == zzakq0.zza) {
                            zzakj zzakj0 = zzakr.zzc(zzdx0, v4);
                            zzakq0.zzd.put(zzakj0.zza, zzakj0);
                        }
                        else if(v3 == zzakq0.zzb) {
                            zzakj zzakj1 = zzakr.zzc(zzdx0, v4);
                            zzakq0.zzf.put(zzakj1.zza, zzakj1);
                        }
                        break;
                    }
                    case 19: {
                        if(v3 == zzakq0.zza) {
                            zzakl zzakl0 = zzakr.zzd(zzdx0);
                            zzakq0.zze.put(zzakl0.zza, zzakl0);
                        }
                        else if(v3 == zzakq0.zzb) {
                            zzakl zzakl1 = zzakr.zzd(zzdx0);
                            zzakq0.zzg.put(zzakl1.zza, zzakl1);
                        }
                        break;
                    }
                    case 20: {
                        if(v3 == zzakq0.zza) {
                            zzdx0.zzn(4);
                            boolean z1 = zzdx0.zzp();
                            zzdx0.zzn(3);
                            int v31 = zzdx0.zzd(16);
                            int v32 = zzdx0.zzd(16);
                            if(z1) {
                                int v33 = zzdx0.zzd(16);
                                v34 = zzdx0.zzd(16);
                                v35 = zzdx0.zzd(16);
                                v36 = zzdx0.zzd(16);
                                v37 = v33;
                            }
                            else {
                                v34 = v31;
                                v36 = v32;
                                v37 = 0;
                                v35 = 0;
                            }
                            zzakq0.zzh = new zzakk(v31, v32, v37, v34, v35, v36);
                        }
                    }
                }
                zzdx0.zzo(v5 - zzdx0.zzb());
            }
        }
        zzakq zzakq1 = this.zzi;
        zzakm zzakm3 = zzakq1.zzi;
        if(zzakm3 == null) {
            zzajx0 = new zzajx(zzfxn.zzn(), 0x8000000000000001L, 0x8000000000000001L);
        }
        else {
            zzakk zzakk0 = zzakq1.zzh == null ? this.zzg : zzakq1.zzh;
            Bitmap bitmap0 = this.zzj;
            if(bitmap0 == null) {
            label_140:
                Bitmap bitmap1 = Bitmap.createBitmap(zzakk0.zza + 1, zzakk0.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = bitmap1;
                this.zzf.setBitmap(bitmap1);
            }
            else {
                int v38 = bitmap0.getWidth();
                if(zzakk0.zza + 1 == v38) {
                    int v39 = this.zzj.getHeight();
                    if(zzakk0.zzb + 1 != v39) {
                        goto label_140;
                    }
                }
                else {
                    goto label_140;
                }
            }
            ArrayList arrayList0 = new ArrayList();
            SparseArray sparseArray3 = zzakm3.zzc;
            for(int v40 = 0; v40 < sparseArray3.size(); ++v40) {
                this.zzf.save();
                zzakn zzakn0 = (zzakn)sparseArray3.valueAt(v40);
                int v41 = sparseArray3.keyAt(v40);
                zzako zzako2 = (zzako)this.zzi.zzc.get(v41);
                int v42 = zzakn0.zza + zzakk0.zzc;
                int v43 = zzakn0.zzb + zzakk0.zze;
                this.zzf.clipRect(v42, v43, Math.min(zzako2.zzc + v42, zzakk0.zzd), Math.min(zzako2.zzd + v43, zzakk0.zzf));
                zzakj zzakj2 = (zzakj)this.zzi.zzd.get(zzako2.zzf);
                if(zzakj2 == null) {
                    zzakj zzakj3 = (zzakj)this.zzi.zzf.get(zzako2.zzf);
                    zzakj2 = zzakj3 == null ? this.zzh : zzakj3;
                }
                SparseArray sparseArray4 = zzako2.zzj;
                int v44 = 0;
                while(v44 < sparseArray4.size()) {
                    int v45 = sparseArray4.keyAt(v44);
                    zzakp zzakp1 = (zzakp)sparseArray4.valueAt(v44);
                    zzakl zzakl2 = (zzakl)this.zzi.zze.get(v45);
                    if(zzakl2 == null) {
                        zzakl2 = (zzakl)this.zzi.zzg.get(v45);
                    }
                    if(zzakl2 == null) {
                        sparseArray5 = sparseArray3;
                        v49 = v40;
                        sparseArray6 = sparseArray4;
                    }
                    else {
                        Paint paint0 = zzakl2.zzb ? null : this.zzd;
                        int v46 = zzako2.zze;
                        int v47 = zzakp1.zza + v42;
                        int v48 = zzakp1.zzb + v43;
                        sparseArray5 = sparseArray3;
                        Canvas canvas0 = this.zzf;
                        sparseArray6 = sparseArray4;
                        if(v46 == 3) {
                            arr_v = zzakj2.zzd;
                        }
                        else {
                            arr_v = v46 == 2 ? zzakj2.zzc : zzakj2.zzb;
                        }
                        v49 = v40;
                        zzakr.zze(zzakl2.zzc, arr_v, v46, v47, v48, paint0, canvas0);
                        zzakr.zze(zzakl2.zzd, arr_v, v46, v47, v48 + 1, paint0, canvas0);
                    }
                    ++v44;
                    sparseArray3 = sparseArray5;
                    sparseArray4 = sparseArray6;
                    v40 = v49;
                }
                if(zzako2.zzb) {
                    int v50 = zzako2.zze;
                    if(v50 == 3) {
                        v51 = zzakj2.zzd[zzako2.zzg];
                    }
                    else {
                        v51 = v50 == 2 ? zzakj2.zzc[zzako2.zzh] : zzakj2.zzb[zzako2.zzi];
                    }
                    this.zze.setColor(v51);
                    this.zzf.drawRect(((float)v42), ((float)v43), ((float)(zzako2.zzc + v42)), ((float)(zzako2.zzd + v43)), this.zze);
                }
                zzcm zzcm0 = new zzcm();
                zzcm0.zzc(Bitmap.createBitmap(this.zzj, v42, v43, zzako2.zzc, zzako2.zzd));
                zzcm0.zzh(((float)v42) / ((float)zzakk0.zza));
                zzcm0.zzi(0);
                zzcm0.zze(((float)v43) / ((float)zzakk0.zzb), 0);
                zzcm0.zzf(0);
                zzcm0.zzk(((float)zzako2.zzc) / ((float)zzakk0.zza));
                zzcm0.zzd(((float)zzako2.zzd) / ((float)zzakk0.zzb));
                arrayList0.add(zzcm0.zzp());
                this.zzf.drawColor(0, PorterDuff.Mode.CLEAR);
                this.zzf.restore();
            }
            zzajx0 = new zzajx(arrayList0, 0x8000000000000001L, 0x8000000000000001L);
        }
        zzdb0.zza(zzajx0);
    }

    private static int zzb(int v, int v1, int v2, int v3) [...] // Inlined contents

    private static zzakj zzc(zzdx zzdx0, int v) {
        int v8;
        int v7;
        int v6;
        int v5;
        int[] arr_v3;
        int v1 = zzdx0.zzd(8);
        zzdx0.zzn(8);
        int[] arr_v = zzakr.zzg();
        int[] arr_v1 = zzakr.zzh();
        int[] arr_v2 = zzakr.zzi();
        int v2 = v - 2;
        while(v2 > 0) {
            int v3 = zzdx0.zzd(8);
            int v4 = zzdx0.zzd(8);
            if((v4 & 0x80) == 0) {
                arr_v3 = (v4 & 0x40) == 0 ? arr_v2 : arr_v1;
            }
            else {
                arr_v3 = arr_v;
            }
            if((v4 & 1) == 0) {
                int v9 = zzdx0.zzd(6);
                int v10 = zzdx0.zzd(4);
                v2 -= 4;
                v7 = zzdx0.zzd(4) << 4;
                v8 = zzdx0.zzd(2) << 6;
                v5 = v9 << 2;
                v6 = v10 << 4;
            }
            else {
                v5 = zzdx0.zzd(8);
                v6 = zzdx0.zzd(8);
                v7 = zzdx0.zzd(8);
                v8 = zzdx0.zzd(8);
                v2 -= 6;
            }
            if(v5 == 0) {
                v8 = 0xFF;
            }
            if(v5 == 0) {
                v7 = 0;
            }
            if(v5 == 0) {
                v6 = 0;
            }
            arr_v3[v3] = ((int)(((byte)(~v8 & 0xFF)))) << 24 | Math.max(0, Math.min(((int)(((double)v5) + 1.402 * ((double)(v6 - 0x80)))), 0xFF)) << 16 | Math.max(0, Math.min(((int)(((double)v5) - 0.34414 * ((double)(v7 - 0x80)) - ((double)(v6 - 0x80)) * 0.71414)), 0xFF)) << 8 | Math.max(0, Math.min(((int)(((double)v5) + ((double)(v7 - 0x80)) * 1.772)), 0xFF));
        }
        return new zzakj(v1, arr_v, arr_v1, arr_v2);
    }

    private static zzakl zzd(zzdx zzdx0) {
        int v = zzdx0.zzd(16);
        zzdx0.zzn(4);
        int v1 = zzdx0.zzd(2);
        boolean z = zzdx0.zzp();
        zzdx0.zzn(1);
        byte[] arr_b = zzei.zzf;
        if(v1 == 1) {
            zzdx0.zzn(zzdx0.zzd(8) * 16);
            return new zzakl(v, z, arr_b, arr_b);
        }
        if(v1 == 0) {
            int v2 = zzdx0.zzd(16);
            int v3 = zzdx0.zzd(16);
            if(v2 > 0) {
                arr_b = new byte[v2];
                zzdx0.zzi(arr_b, 0, v2);
            }
            if(v3 > 0) {
                byte[] arr_b1 = new byte[v3];
                zzdx0.zzi(arr_b1, 0, v3);
                return new zzakl(v, z, arr_b, arr_b1);
            }
        }
        return new zzakl(v, z, arr_b, arr_b);
    }

    private static void zze(byte[] arr_b, int[] arr_v, int v, int v1, int v2, @Nullable Paint paint0, Canvas canvas0) {
        int v19;
        boolean z2;
        int v16;
        int v15;
        int v14;
        int v12;
        boolean z1;
        byte[] arr_b5;
        int v9;
        int v8;
        boolean z;
        byte[] arr_b4;
        zzdx zzdx0 = new zzdx(arr_b, arr_b.length);
        int v3 = v1;
        int v4 = v2;
        byte[] arr_b1 = null;
        byte[] arr_b2 = null;
        byte[] arr_b3 = null;
        while(zzdx0.zza() != 0) {
            int v5 = zzdx0.zzd(8);
            if(v5 == 0xF0) {
                v4 += 2;
                v3 = v1;
            }
            else {
                switch(v5) {
                    case 16: {
                        switch(v) {
                            case 2: {
                                arr_b4 = arr_b3 == null ? zzakr.zza : arr_b3;
                                break;
                            }
                            case 3: {
                                arr_b4 = arr_b1 == null ? zzakr.zzb : arr_b1;
                                break;
                            }
                            default: {
                                arr_b4 = null;
                            }
                        }
                        int v6 = v3;
                        do {
                            int v7 = zzdx0.zzd(2);
                            if(v7 != 0) {
                                z = false;
                                v8 = 1;
                            }
                            else if(zzdx0.zzp()) {
                                v8 = zzdx0.zzd(3) + 3;
                                v7 = zzdx0.zzd(2);
                                z = false;
                            }
                            else if(zzdx0.zzp()) {
                                z = false;
                                v7 = 0;
                                v8 = 1;
                            }
                            else {
                                switch(zzdx0.zzd(2)) {
                                    case 0: {
                                        v7 = 0;
                                        v8 = 0;
                                        z = true;
                                        break;
                                    }
                                    case 1: {
                                        z = false;
                                        v7 = 0;
                                        v8 = 2;
                                        break;
                                    }
                                    case 2: {
                                        v8 = zzdx0.zzd(4) + 12;
                                        v7 = zzdx0.zzd(2);
                                        z = false;
                                        break;
                                    }
                                    case 3: {
                                        v8 = zzdx0.zzd(8) + 29;
                                        v7 = zzdx0.zzd(2);
                                        z = false;
                                        break;
                                    }
                                    default: {
                                        z = false;
                                        v7 = 0;
                                        v8 = 0;
                                    }
                                }
                            }
                            if(v8 == 0 || paint0 == null) {
                                v9 = v6;
                            }
                            else {
                                if(arr_b4 != null) {
                                    v7 = arr_b4[v7];
                                }
                                paint0.setColor(arr_v[v7]);
                                v9 = v6;
                                canvas0.drawRect(((float)v6), ((float)v4), ((float)(v6 + v8)), ((float)(v4 + 1)), paint0);
                            }
                            v6 = v9 + v8;
                        }
                        while(!z);
                        zzdx0.zzf();
                        v3 = v6;
                        break;
                    }
                    case 17: {
                        if(v != 3) {
                            arr_b5 = null;
                        }
                        else if(arr_b2 == null) {
                            arr_b5 = zzakr.zzc;
                        }
                        else {
                            arr_b5 = arr_b2;
                        }
                        int v10 = v3;
                        do {
                            int v11 = zzdx0.zzd(4);
                            if(v11 != 0) {
                                z1 = false;
                                v12 = 1;
                            }
                            else if(zzdx0.zzp()) {
                                if(zzdx0.zzp()) {
                                    switch(zzdx0.zzd(2)) {
                                        case 0: {
                                            z1 = false;
                                            v11 = 0;
                                            v12 = 1;
                                            goto label_118;
                                        }
                                        case 1: {
                                            z1 = false;
                                            v11 = 0;
                                            v12 = 2;
                                            goto label_118;
                                        }
                                        case 2: {
                                            v14 = zzdx0.zzd(4) + 9;
                                            v15 = zzdx0.zzd(4);
                                            break;
                                        }
                                        case 3: {
                                            v14 = zzdx0.zzd(8) + 25;
                                            v15 = zzdx0.zzd(4);
                                            break;
                                        }
                                        default: {
                                            z1 = false;
                                            v11 = 0;
                                            v12 = 0;
                                            goto label_118;
                                        }
                                    }
                                }
                                else {
                                    v14 = zzdx0.zzd(2) + 4;
                                    v15 = zzdx0.zzd(4);
                                }
                                z1 = false;
                                v12 = v14;
                                v11 = v15;
                            }
                            else {
                                int v13 = zzdx0.zzd(3);
                                if(v13 == 0) {
                                    v11 = 0;
                                    z1 = true;
                                    v12 = 0;
                                }
                                else {
                                    z1 = false;
                                    v12 = v13 + 2;
                                    v11 = 0;
                                }
                            }
                        label_118:
                            if(v12 == 0 || paint0 == null) {
                                v16 = v10;
                            }
                            else {
                                if(arr_b5 != null) {
                                    v11 = arr_b5[v11];
                                }
                                paint0.setColor(arr_v[v11]);
                                v16 = v10;
                                canvas0.drawRect(((float)v10), ((float)v4), ((float)(v10 + v12)), ((float)(v4 + 1)), paint0);
                            }
                            v10 = v16 + v12;
                        }
                        while(!z1);
                        zzdx0.zzf();
                        v3 = v10;
                        break;
                    }
                    case 18: {
                        int v17 = v3;
                        do {
                            int v18 = zzdx0.zzd(8);
                            if(v18 != 0) {
                                z2 = false;
                                v19 = 1;
                            }
                            else if(zzdx0.zzp()) {
                                z2 = false;
                                v19 = zzdx0.zzd(7);
                                v18 = zzdx0.zzd(8);
                            }
                            else {
                                int v20 = zzdx0.zzd(7);
                                if(v20 == 0) {
                                    v18 = 0;
                                    z2 = true;
                                    v19 = 0;
                                }
                                else {
                                    z2 = false;
                                    v19 = v20;
                                    v18 = 0;
                                }
                            }
                            if(v19 != 0 && paint0 != null) {
                                paint0.setColor(arr_v[v18]);
                                canvas0.drawRect(((float)v17), ((float)v4), ((float)(v17 + v19)), ((float)(v4 + 1)), paint0);
                            }
                            v17 += v19;
                        }
                        while(!z2);
                        v3 = v17;
                        break;
                    }
                    case 0x20: {
                        arr_b3 = zzakr.zzf(4, 4, zzdx0);
                        break;
                    }
                    case 33: {
                        arr_b1 = zzakr.zzf(4, 8, zzdx0);
                        break;
                    }
                    case 34: {
                        arr_b2 = zzakr.zzf(16, 8, zzdx0);
                    }
                }
            }
        }
    }

    private static byte[] zzf(int v, int v1, zzdx zzdx0) {
        byte[] arr_b = new byte[v];
        for(int v2 = 0; v2 < v; ++v2) {
            arr_b[v2] = (byte)zzdx0.zzd(v1);
        }
        return arr_b;
    }

    private static int[] zzg() {
        return new int[]{0, -1, 0xFF000000, 0xFF7F7F7F};
    }

    private static int[] zzh() {
        int[] arr_v = new int[16];
        arr_v[0] = 0;
        for(int v = 1; true; ++v) {
            int v1 = 0x7F;
            if(v >= 16) {
                break;
            }
            if(v < 8) {
                arr_v[v] = 0xFF000000 | (1 == (v & 1) ? 0xFF : 0) << 16 | ((v & 2) == 0 ? 0 : 0xFF) << 8 | ((v & 4) == 0 ? 0 : 0xFF);
            }
            else {
                if((v & 4) == 0) {
                    v1 = 0;
                }
                arr_v[v] = 0xFF000000 | (1 == (v & 1) ? 0x7F : 0) << 16 | ((v & 2) == 0 ? 0 : 0x7F) << 8 | v1;
            }
        }
        return arr_v;
    }

    private static int[] zzi() {
        int[] arr_v = new int[0x100];
        arr_v[0] = 0;
        for(int v = 0; true; ++v) {
            int v1 = 0xFF;
            if(v >= 0x100) {
                break;
            }
            if(v < 8) {
                if((v & 4) == 0) {
                    v1 = 0;
                }
                arr_v[v] = 0x3F000000 | (1 == (v & 1) ? 0xFF : 0) << 16 | ((v & 2) == 0 ? 0 : 0xFF) << 8 | v1;
            }
            else {
                int v2 = 43;
                int v3 = 170;
                int v4 = 85;
                switch(v & 0x88) {
                    case 0: {
                        if((v & 4) == 0) {
                            v4 = 0;
                        }
                        if((v & 0x40) == 0) {
                            v3 = 0;
                        }
                        arr_v[v] = 0xFF000000 | (1 == (v & 1) ? 85 : 0) + ((v & 16) == 0 ? 0 : 170) << 16 | ((v & 2) == 0 ? 0 : 85) + ((v & 0x20) == 0 ? 0 : 170) << 8 | v4 + v3;
                        break;
                    }
                    case 8: {
                        if((v & 4) == 0) {
                            v4 = 0;
                        }
                        if((v & 0x40) == 0) {
                            v3 = 0;
                        }
                        arr_v[v] = 0x7F000000 | (1 == (v & 1) ? 85 : 0) + ((v & 16) == 0 ? 0 : 170) << 16 | ((v & 2) == 0 ? 0 : 85) + ((v & 0x20) == 0 ? 0 : 170) << 8 | v4 + v3;
                        break;
                    }
                    default: {
                        switch(v & 0x88) {
                            case 0x80: {
                                if((v & 4) == 0) {
                                    v2 = 0;
                                }
                                if((v & 0x40) == 0) {
                                    v4 = 0;
                                }
                                arr_v[v] = 0xFF000000 | (1 == (v & 1) ? 43 : 0) + 0x7F + ((v & 16) == 0 ? 0 : 85) << 16 | ((v & 2) == 0 ? 0 : 43) + 0x7F + ((v & 0x20) == 0 ? 0 : 85) << 8 | v2 + 0x7F + v4;
                                break;
                            }
                            case 0x88: {
                                if((v & 4) == 0) {
                                    v2 = 0;
                                }
                                if((v & 0x40) == 0) {
                                    v4 = 0;
                                }
                                arr_v[v] = 0xFF000000 | (1 == (v & 1) ? 43 : 0) + ((v & 16) == 0 ? 0 : 85) << 16 | ((v & 2) == 0 ? 0 : 43) + ((v & 0x20) == 0 ? 0 : 85) << 8 | v2 + v4;
                            }
                        }
                    }
                }
            }
        }
        return arr_v;
    }
}

