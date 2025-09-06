package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public final class zzagg {
    public static final zzage zza;

    static {
        zzagg.zza = new zzage();
    }

    @Nullable
    public static final zzay zza(byte[] arr_b, int v, zzage zzage0, zzafi zzafi0) {
        zzagf zzagf0;
        ArrayList arrayList0 = new ArrayList();
        zzdy zzdy0 = new zzdy(arr_b, v);
        boolean z = false;
        int v1 = 10;
        if(zzdy0.zzb() < 10) {
            zzdo.zzf("Id3Decoder", "Data too short to be an ID3 tag");
            zzagf0 = null;
        }
        else {
            int v2 = zzdy0.zzo();
            if(v2 == 4801587) {
                int v3 = zzdy0.zzm();
                zzdy0.zzM(1);
                int v4 = zzdy0.zzm();
                int v5 = zzdy0.zzl();
                if(v3 != 2) {
                    switch(v3) {
                        case 3: {
                            if((v4 & 0x40) != 0) {
                                int v6 = zzdy0.zzg();
                                zzdy0.zzM(v6);
                                v5 -= v6 + 4;
                            }
                            zzagf0 = new zzagf(3, (v4 & 0x80) != 0, v5);
                            break;
                        }
                        case 4: {
                            if((v4 & 0x40) != 0) {
                                int v7 = zzdy0.zzl();
                                zzdy0.zzM(v7 - 4);
                                v5 -= v7;
                            }
                            if((v4 & 16) != 0) {
                                v5 -= 10;
                            }
                            zzagf0 = new zzagf(4, false, v5);
                            break;
                        }
                        default: {
                            zzdo.zzf("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + v3);
                            zzagf0 = null;
                        }
                    }
                }
                else if((v4 & 0x40) != 0) {
                    zzdo.zzf("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    zzagf0 = null;
                }
                else {
                    zzagf0 = new zzagf(2, (v4 & 0x80) != 0, v5);
                }
            }
            else {
                zzdo.zzf("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", v2));
                zzagf0 = null;
            }
        }
        if(zzagf0 == null) {
            return null;
        }
        int v8 = zzdy0.zzd();
        if(zzagf0.zza == 2) {
            v1 = 6;
        }
        zzdy0.zzK(v8 + (zzagf0.zzb ? zzagg.zze(zzdy0, zzagf0.zzc) : zzagf0.zzc));
        if(!zzagg.zzj(zzdy0, zzagf0.zza, v1, false)) {
            if(zzagf0.zza == 4 && zzagg.zzj(zzdy0, 4, v1, true)) {
                z = true;
                goto label_53;
            }
            zzdo.zzf("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + zzagf0.zza);
            return null;
        }
    label_53:
        while(zzdy0.zzb() >= v1) {
            zzagh zzagh0 = zzagg.zzl(zzagf0.zza, zzdy0, z, v1, zzage0);
            if(zzagh0 != null) {
                arrayList0.add(zzagh0);
            }
        }
        return new zzay(arrayList0);
    }

    private static int zzb(int v) {
        return v == 0 || v == 3 ? 1 : 2;
    }

    private static int zzc(byte[] arr_b, int v, int v1) {
        int v2 = zzagg.zzd(arr_b, v);
        if(v1 != 0 && v1 != 3) {
            while(v2 < arr_b.length - 1) {
                if((v2 - v) % 2 == 0 && arr_b[v2 + 1] == 0) {
                    return v2;
                }
                v2 = zzagg.zzd(arr_b, v2 + 1);
            }
            return arr_b.length;
        }
        return v2;
    }

    private static int zzd(byte[] arr_b, int v) {
        while(v < arr_b.length) {
            if(arr_b[v] == 0) {
                return v;
            }
            ++v;
        }
        return arr_b.length;
    }

    private static int zze(zzdy zzdy0, int v) {
        byte[] arr_b = zzdy0.zzN();
        int v1 = zzdy0.zzd();
        for(int v2 = v1; v2 + 1 < v1 + v; ++v2) {
            if((arr_b[v2] & 0xFF) == 0xFF && arr_b[v2 + 1] == 0) {
                System.arraycopy(arr_b, v2 + 2, arr_b, v2 + 1, v - (v2 - v1) - 2);
                --v;
            }
        }
        return v;
    }

    private static zzfxn zzf(byte[] arr_b, int v, int v1) {
        if(v1 >= arr_b.length) {
            return zzfxn.zzo("");
        }
        zzfxk zzfxk0 = new zzfxk();
        for(int v2 = zzagg.zzc(arr_b, v1, v); v1 < v2; v2 = zzagg.zzc(arr_b, v1, v)) {
            zzfxk0.zzf(new String(arr_b, v1, v2 - v1, zzagg.zzi(v)));
            v1 = zzagg.zzb(v) + v2;
        }
        zzfxn zzfxn0 = zzfxk0.zzi();
        return zzfxn0.isEmpty() ? zzfxn.zzo("") : zzfxn0;
    }

    private static String zzg(byte[] arr_b, int v, int v1, Charset charset0) {
        return v1 <= v || v1 > arr_b.length ? "" : new String(arr_b, v, v1 - v, charset0);
    }

    private static String zzh(int v, int v1, int v2, int v3, int v4) {
        return v == 2 ? String.format(Locale.US, "%c%c%c", v1, v2, v3) : String.format(Locale.US, "%c%c%c%c", v1, v2, v3, v4);
    }

    private static Charset zzi(int v) {
        switch(v) {
            case 1: {
                return StandardCharsets.UTF_16;
            }
            case 2: {
                return StandardCharsets.UTF_16BE;
            }
            case 3: {
                return StandardCharsets.UTF_8;
            }
            default: {
                return StandardCharsets.ISO_8859_1;
            }
        }
    }

    private static boolean zzj(zzdy zzdy0, int v, int v1, boolean z) {
        int v7;
        int v6;
        long v5;
        int v4;
        boolean z1;
        int v2 = zzdy0.zzd();
        try {
            while(true) {
                z1 = true;
                if(zzdy0.zzb() < v1) {
                    break;
                }
                if(v >= 3) {
                    v4 = zzdy0.zzg();
                    v5 = zzdy0.zzu();
                    v6 = zzdy0.zzq();
                }
                else {
                    v4 = zzdy0.zzo();
                    v5 = (long)zzdy0.zzo();
                    v6 = 0;
                }
                if(v4 == 0 && v5 == 0L && v6 == 0) {
                    break;
                }
                if(v != 4 || z) {
                label_16:
                    if(v == 4) {
                        if((v6 & 0x40) == 0) {
                            z1 = false;
                        }
                        boolean z2 = z1;
                        z1 = v6 & 1;
                        v7 = z2;
                    }
                    else if(v == 3) {
                        v7 = (v6 & 0x20) == 0 ? 0 : 1;
                        if((v6 & 0x80) == 0) {
                            z1 = false;
                        }
                    }
                    else {
                        v7 = 0;
                        z1 = false;
                    }
                    if(z1) {
                        v7 += 4;
                    }
                    if(v5 >= ((long)v7) && ((long)zzdy0.zzb()) >= v5) {
                        zzdy0.zzM(((int)v5));
                        continue;
                    }
                }
                else if((0x808080L & v5) == 0L) {
                    v5 = v5 >> 24 << 21 | ((v5 >> 16 & 0xFFL) << 14 | (v5 & 0xFFL | (v5 >> 8 & 0xFFL) << 7));
                    goto label_16;
                }
                z1 = false;
                break;
            }
            return z1;
        }
        finally {
            zzdy0.zzL(v2);
        }
    }

    private static byte[] zzk(byte[] arr_b, int v, int v1) {
        return v1 > v ? Arrays.copyOfRange(arr_b, v, v1) : zzei.zzf;
    }

    @Nullable
    private static zzagh zzl(int v, zzdy zzdy0, boolean z, int v1, @Nullable zzage zzage0) {
        int v15;
        zzagq zzagq1;
        zzagq zzagq0;
        int v23;
        OutOfMemoryError outOfMemoryError3;
        int v27;
        int v26;
        String s4;
        int v25;
        byte[] arr_b5;
        Charset charset1;
        int v24;
        zzagh zzagh2;
        Throwable throwable3;
        int v43;
        int v42;
        int v41;
        String[] arr_s;
        int v39;
        String s7;
        boolean z1;
        int v12;
        int v11;
        int v10;
        int v9;
        int v6;
        int v2 = zzdy0.zzm();
        int v3 = zzdy0.zzm();
        int v4 = zzdy0.zzm();
        int v5 = v < 3 ? 0 : zzdy0.zzm();
        switch(v) {
            case 3: {
                v6 = zzdy0.zzp();
                break;
            }
            case 4: {
                v6 = zzdy0.zzp();
                if(!z) {
                    v6 = v6 >> 24 << 21 | (v6 & 0xFF | (v6 >> 8 & 0xFF) << 7 | (v6 >> 16 & 0xFF) << 14);
                }
                break;
            }
            default: {
                v6 = zzdy0.zzo();
            }
        }
        int v7 = v < 3 ? 0 : zzdy0.zzq();
        if(v2 == 0 && v3 == 0 && v4 == 0 && v5 == 0 && v6 == 0 && v7 == 0) {
            zzdy0.zzL(zzdy0.zze());
            return null;
        }
        int v8 = zzdy0.zzd() + v6;
        if(v8 > zzdy0.zze()) {
            zzdo.zzf("Id3Decoder", "Frame size exceeds remaining tag data");
            zzdy0.zzL(zzdy0.zze());
            return null;
        }
        if(zzage0 == null) {
            switch(v) {
                case 3: {
                    v9 = (v7 & 0x80) == 0 ? 0 : 1;
                    v10 = (v7 & 0x20) == 0 ? 0 : 1;
                    v12 = (v7 & 0x40) == 0 ? 0 : 1;
                    z1 = false;
                    v11 = v9;
                    break;
                }
                case 4: {
                    v11 = (v7 & 8) == 0 ? 0 : 1;
                    v12 = (v7 & 4) == 0 ? 0 : 1;
                    z1 = (v7 & 2) != 0;
                    v10 = (v7 & 0x40) == 0 ? 0 : 1;
                    v9 = v7 & 1;
                    break;
                }
                default: {
                    v9 = 0;
                    v10 = 0;
                    v11 = 0;
                    v12 = 0;
                    z1 = false;
                }
            }
            if(v11 != 0 || v12 != 0) {
                zzdo.zzf("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
                zzdy0.zzL(v8);
                return null;
            }
            if(v10 != 0) {
                zzdy0.zzM(1);
                --v6;
            }
            if(v9 != 0) {
                zzdy0.zzM(4);
                v6 -= 4;
            }
            if(z1) {
                v6 = zzagg.zze(zzdy0, v6);
            }
            if(v2 != 84 || v3 != 88 || v4 != 88 || v != 2 && v5 != 88) {
                goto label_62;
            label_106:
                if(v != 2) {
                    if(v15 != 65 || v3 != 80 || v4 != 73 || v5 != 67) {
                        goto label_136;
                    label_173:
                        if(v15 == 67 && v3 == 84 && v4 == 0x4F && v5 == 67) {
                            try {
                                try {
                                    int v37 = zzdy0.zzd();
                                    int v38 = zzagg.zzd(zzdy0.zzN(), v37);
                                    s7 = new String(zzdy0.zzN(), v37, v38 - v37, StandardCharsets.ISO_8859_1);
                                    zzdy0.zzL(v38 + 1);
                                    v39 = zzdy0.zzm();
                                    int v40 = zzdy0.zzm();
                                    arr_s = new String[v40];
                                    v41 = 0;
                                    while(true) {
                                    label_182:
                                        if(v41 >= v40) {
                                            goto label_194;
                                        }
                                        v42 = zzdy0.zzd();
                                        v43 = zzagg.zzd(zzdy0.zzN(), v42);
                                        goto label_189;
                                    }
                                }
                                catch(OutOfMemoryError | Exception outOfMemoryError4) {
                                    try {
                                        outOfMemoryError3 = outOfMemoryError4;
                                        v8 = v23;
                                        goto label_269;
                                    label_189:
                                        arr_s[v41] = new String(zzdy0.zzN(), v42, v43 - v42, StandardCharsets.ISO_8859_1);
                                        zzdy0.zzL(v43 + 1);
                                        ++v41;
                                        v5 = 67;
                                        goto label_182;
                                    label_194:
                                        ArrayList arrayList1 = new ArrayList();
                                        while(zzdy0.zzd() < v37 + v6) {
                                            zzagh zzagh1 = zzagg.zzl(v, zzdy0, z, v1, null);
                                            if(zzagh1 != null) {
                                                arrayList1.add(zzagh1);
                                            }
                                        }
                                        zzagq0 = new zzafz(s7, (v39 & 2) != 0, 1 == (v39 & 1), arr_s, ((zzagh[])arrayList1.toArray(new zzagh[0])));
                                        v5 = 67;
                                        v8 = v23;
                                        goto label_274;
                                    }
                                    catch(OutOfMemoryError | Exception outOfMemoryError5) {
                                    }
                                    outOfMemoryError3 = outOfMemoryError5;
                                    v5 = 67;
                                    v8 = v23;
                                    goto label_269;
                                }
                            }
                            catch(Throwable throwable2) {
                                throwable3 = throwable2;
                                v8 = v23;
                                goto label_272;
                            }
                        }
                        else if(v15 != 77 || v3 != 76 || v4 != 76 || v5 != 84) {
                            try {
                                String s8 = zzagg.zzh(v, v15, v3, v4, v5);
                                byte[] arr_b8 = new byte[v6];
                                zzdy0.zzH(arr_b8, 0, v6);
                                zzagq0 = new zzafv(s8, arr_b8);
                                v8 = v23;
                                goto label_274;
                            }
                            catch(OutOfMemoryError | Exception outOfMemoryError0) {
                                v8 = v23;
                                outOfMemoryError3 = outOfMemoryError0;
                                goto label_269;
                            }
                            catch(Throwable throwable1) {
                                v8 = v23;
                            }
                            try {
                                throwable3 = throwable1;
                                goto label_272;
                            }
                            catch(OutOfMemoryError | Exception outOfMemoryError2) {
                                outOfMemoryError3 = outOfMemoryError2;
                                v8 = v23;
                                goto label_269;
                            }
                            catch(Throwable throwable2) {
                                throwable3 = throwable2;
                                v8 = v23;
                                goto label_272;
                            }
                        }
                        else {
                            try {
                                int v44 = zzdy0.zzq();
                                int v45 = zzdy0.zzo();
                                int v46 = zzdy0.zzo();
                                int v47 = zzdy0.zzm();
                                int v48 = zzdy0.zzm();
                                zzdx zzdx0 = new zzdx();
                                zzdx0.zzj(zzdy0);
                                int v49 = (v6 - 10) * 8 / (v47 + v48);
                                int[] arr_v = new int[v49];
                                int[] arr_v1 = new int[v49];
                                for(int v50 = 0; v50 < v49; ++v50) {
                                    int v51 = zzdx0.zzd(v47);
                                    int v52 = zzdx0.zzd(v48);
                                    arr_v[v50] = v51;
                                    arr_v1[v50] = v52;
                                }
                                zzagq0 = new zzagm(v44, v45, v46, arr_v, arr_v1);
                                v8 = v23;
                                goto label_274;
                            }
                            catch(OutOfMemoryError | Exception outOfMemoryError6) {
                                outOfMemoryError3 = outOfMemoryError6;
                                v8 = v23;
                                goto label_269;
                            }
                            catch(Throwable throwable2) {
                                throwable3 = throwable2;
                                v8 = v23;
                                goto label_272;
                            }
                        }
                        v8 = v23;
                        goto label_274;
                        try {
                        label_253:
                            if(v6 > 0) {
                                int v53 = zzdy0.zzm();
                                byte[] arr_b9 = new byte[v6 - 1];
                                zzdy0.zzH(arr_b9, 0, v6 - 1);
                                int v54 = zzagg.zzc(arr_b9, 0, v53);
                                int v55 = v54 + zzagg.zzb(v53);
                                zzagq1 = new zzags("WXXX", new String(arr_b9, 0, v54, zzagg.zzi(v53)), zzagg.zzg(arr_b9, v55, zzagg.zzd(arr_b9, v55), StandardCharsets.ISO_8859_1));
                                zzagq0 = zzagq1;
                            }
                            else {
                                zzagq0 = null;
                            }
                            goto label_274;
                        }
                        catch(OutOfMemoryError | Exception outOfMemoryError0) {
                            outOfMemoryError3 = outOfMemoryError0;
                        }
                        catch(Throwable throwable0) {
                            throwable3 = throwable0;
                            goto label_272;
                        }
                    label_269:
                        zzdy0.zzL(v8);
                        zzagh2 = null;
                        goto label_277;
                    label_272:
                        zzdy0.zzL(v8);
                        throw throwable3;
                    }
                    else {
                        try {
                        label_111:
                            v24 = zzdy0.zzm();
                            charset1 = zzagg.zzi(v24);
                            arr_b5 = new byte[v6 - 1];
                            zzdy0.zzH(arr_b5, 0, v6 - 1);
                            if(v == 2) {
                                goto label_121;
                            }
                            else {
                                v25 = zzagg.zzd(arr_b5, 0);
                                s4 = zzftt.zza(new String(arr_b5, 0, v25, StandardCharsets.ISO_8859_1));
                                if(s4.indexOf(0x2F) == -1) {
                                    s4 = "image/" + s4;
                                    v26 = arr_b5[v25 + 1] & 0xFF;
                                    v27 = zzagg.zzc(arr_b5, v25 + 2, v24);
                                    v23 = v8;
                                    zzagq0 = new zzaft(s4, new String(arr_b5, v25 + 2, v27 - (v25 + 2), charset1), v26, zzagg.zzk(arr_b5, v27 + zzagg.zzb(v24), v6 - 1));
                                    v8 = v23;
                                    goto label_274;
                                }
                            }
                            v26 = arr_b5[v25 + 1] & 0xFF;
                            v27 = zzagg.zzc(arr_b5, v25 + 2, v24);
                            v23 = v8;
                            zzagq0 = new zzaft(s4, new String(arr_b5, v25 + 2, v27 - (v25 + 2), charset1), v26, zzagg.zzk(arr_b5, v27 + zzagg.zzb(v24), v6 - 1));
                            v8 = v23;
                            goto label_274;
                        }
                        catch(OutOfMemoryError | Exception outOfMemoryError1) {
                            outOfMemoryError3 = outOfMemoryError1;
                            goto label_269;
                        }
                        catch(Throwable throwable1) {
                            throwable3 = throwable1;
                            goto label_272;
                        }
                        try {
                            s4 = "image/" + s4;
                            v26 = arr_b5[v25 + 1] & 0xFF;
                            v27 = zzagg.zzc(arr_b5, v25 + 2, v24);
                            v23 = v8;
                            zzagq0 = new zzaft(s4, new String(arr_b5, v25 + 2, v27 - (v25 + 2), charset1), v26, zzagg.zzk(arr_b5, v27 + zzagg.zzb(v24), v6 - 1));
                            v8 = v23;
                            goto label_274;
                        label_121:
                            s4 = "image/" + zzftt.zza(new String(arr_b5, 0, 3, StandardCharsets.ISO_8859_1));
                            if("image/jpg".equals(s4)) {
                                s4 = "image/jpeg";
                            }
                            v25 = 2;
                        }
                        catch(OutOfMemoryError | Exception outOfMemoryError0) {
                            outOfMemoryError3 = outOfMemoryError0;
                            goto label_269;
                        }
                        catch(Throwable throwable0) {
                            throwable3 = throwable0;
                            goto label_272;
                        }
                        try {
                            v26 = arr_b5[v25 + 1] & 0xFF;
                            v27 = zzagg.zzc(arr_b5, v25 + 2, v24);
                            v23 = v8;
                            zzagq0 = new zzaft(s4, new String(arr_b5, v25 + 2, v27 - (v25 + 2), charset1), v26, zzagg.zzk(arr_b5, v27 + zzagg.zzb(v24), v6 - 1));
                            v8 = v23;
                            goto label_274;
                        }
                        catch(OutOfMemoryError | Exception outOfMemoryError1) {
                        }
                        catch(Throwable throwable1) {
                            throwable3 = throwable1;
                            goto label_272;
                        }
                        try {
                            outOfMemoryError3 = outOfMemoryError1;
                            goto label_269;
                        label_136:
                            v23 = v8;
                        label_137:
                            if(v15 != 67 || v3 != 0x4F || v4 != 77 || v5 != 77 && v != 2) {
                                if(v15 == 67 && v3 == 72 && v4 == 65 && v5 == 80) {
                                    int v31 = zzdy0.zzd();
                                    int v32 = zzagg.zzd(zzdy0.zzN(), v31);
                                    String s6 = new String(zzdy0.zzN(), v31, v32 - v31, StandardCharsets.ISO_8859_1);
                                    zzdy0.zzL(v32 + 1);
                                    int v33 = zzdy0.zzg();
                                    int v34 = zzdy0.zzg();
                                    long v35 = zzdy0.zzu();
                                    if(v35 == 0xFFFFFFFFL) {
                                        v35 = -1L;
                                    }
                                    long v36 = zzdy0.zzu();
                                    if(v36 == 0xFFFFFFFFL) {
                                        v36 = -1L;
                                    }
                                    ArrayList arrayList0 = new ArrayList();
                                    while(zzdy0.zzd() < v31 + v6) {
                                        zzagh zzagh0 = zzagg.zzl(v, zzdy0, z, v1, null);
                                        if(zzagh0 != null) {
                                            arrayList0.add(zzagh0);
                                        }
                                    }
                                    zzagq0 = new zzafx(s6, v33, v34, v35, v36, ((zzagh[])arrayList0.toArray(new zzagh[0])));
                                    v8 = v23;
                                    goto label_274;
                                }
                                goto label_173;
                            }
                            else if(v6 >= 4) {
                                int v28 = zzdy0.zzm();
                                Charset charset2 = zzagg.zzi(v28);
                                byte[] arr_b6 = new byte[3];
                                zzdy0.zzH(arr_b6, 0, 3);
                                String s5 = new String(arr_b6, 0, 3);
                                byte[] arr_b7 = new byte[v6 - 4];
                                zzdy0.zzH(arr_b7, 0, v6 - 4);
                                int v29 = zzagg.zzc(arr_b7, 0, v28);
                                int v30 = v29 + zzagg.zzb(v28);
                                zzagq0 = new zzagb(s5, new String(arr_b7, 0, v29, charset2), zzagg.zzg(arr_b7, v30, zzagg.zzc(arr_b7, v30, v28), charset2));
                                v8 = v23;
                            }
                            else {
                                v8 = v23;
                                zzagq0 = null;
                            }
                        }
                        catch(OutOfMemoryError | Exception outOfMemoryError2) {
                            outOfMemoryError3 = outOfMemoryError2;
                            v8 = v23;
                            goto label_269;
                        }
                        catch(Throwable throwable2) {
                            throwable3 = throwable2;
                            v8 = v23;
                            goto label_272;
                        }
                    }
                }
                else if(v15 != 80 || v3 != 73 || v4 != 67) {
                    v23 = v8;
                    goto label_137;
                }
                else {
                    goto label_111;
                }
            }
            else if(v6 <= 0) {
                zzagq0 = null;
            }
            else {
                try {
                    int v13 = zzdy0.zzm();
                    byte[] arr_b = new byte[v6 - 1];
                    zzdy0.zzH(arr_b, 0, v6 - 1);
                    int v14 = zzagg.zzc(arr_b, 0, v13);
                    zzagq1 = new zzagq("TXXX", new String(arr_b, 0, v14, zzagg.zzi(v13)), zzagg.zzf(arr_b, v13, v14 + zzagg.zzb(v13)));
                    zzagq0 = zzagq1;
                    goto label_274;
                label_62:
                    switch(v2) {
                        case 84: {
                            goto label_65;
                        }
                        case 87: {
                            goto label_74;
                        }
                    }
                    v15 = v2;
                    goto label_76;
                label_65:
                    String s = zzagg.zzh(v, 84, v3, v4, v5);
                    if(v6 > 0) {
                        int v16 = zzdy0.zzm();
                        byte[] arr_b1 = new byte[v6 - 1];
                        zzdy0.zzH(arr_b1, 0, v6 - 1);
                        zzagq0 = new zzagq(s, null, zzagg.zzf(arr_b1, v16, 0));
                    }
                    else {
                        zzagq0 = null;
                        goto label_274;
                    label_74:
                        if(v3 == 88 && v4 == 88 && (v == 2 || v5 == 88)) {
                            goto label_253;
                        }
                        else {
                            v15 = 87;
                        label_76:
                            if(v15 == 87) {
                                String s1 = zzagg.zzh(v, 87, v3, v4, v5);
                                byte[] arr_b2 = new byte[v6];
                                zzdy0.zzH(arr_b2, 0, v6);
                                zzagq1 = new zzags(s1, null, new String(arr_b2, 0, zzagg.zzd(arr_b2, 0), StandardCharsets.ISO_8859_1));
                                zzagq0 = zzagq1;
                            }
                            else if(v15 != 80) {
                            label_90:
                                if(v15 != 71) {
                                    goto label_106;
                                }
                                else if(v3 != 69 || v4 != 0x4F || v5 != 66 && v != 2) {
                                    v15 = 71;
                                    goto label_106;
                                }
                                else {
                                    int v18 = zzdy0.zzm();
                                    Charset charset0 = zzagg.zzi(v18);
                                    byte[] arr_b4 = new byte[v6 - 1];
                                    zzdy0.zzH(arr_b4, 0, v6 - 1);
                                    int v19 = zzagg.zzd(arr_b4, 0);
                                    String s2 = zzbb.zze(new String(arr_b4, 0, v19, StandardCharsets.ISO_8859_1));
                                    int v20 = zzagg.zzc(arr_b4, v19 + 1, v18);
                                    String s3 = zzagg.zzg(arr_b4, v19 + 1, v20, charset0);
                                    int v21 = v20 + zzagg.zzb(v18);
                                    int v22 = zzagg.zzc(arr_b4, v21, v18);
                                    zzagq0 = new zzagd(s2, s3, zzagg.zzg(arr_b4, v21, v22, charset0), zzagg.zzk(arr_b4, v22 + zzagg.zzb(v18), v6 - 1));
                                }
                            }
                            else if(v3 == 82 && v4 == 73 && v5 == 86) {
                                byte[] arr_b3 = new byte[v6];
                                zzdy0.zzH(arr_b3, 0, v6);
                                int v17 = zzagg.zzd(arr_b3, 0);
                                zzagq0 = new zzago(new String(arr_b3, 0, v17, StandardCharsets.ISO_8859_1), zzagg.zzk(arr_b3, v17 + 1, v6));
                            }
                            else {
                                v15 = 80;
                                goto label_90;
                            }
                        }
                    }
                }
                catch(OutOfMemoryError | Exception outOfMemoryError0) {
                    outOfMemoryError3 = outOfMemoryError0;
                    goto label_269;
                }
                catch(Throwable throwable0) {
                    throwable3 = throwable0;
                    goto label_272;
                }
            }
        label_274:
            zzdy0.zzL(v8);
            zzagh2 = zzagq0;
            outOfMemoryError3 = null;
        label_277:
            if(zzagh2 == null) {
                zzdo.zzg("Id3Decoder", "Failed to decode frame: id=" + zzagg.zzh(v, v2, v3, v4, v5) + ", frameSize=" + v6, outOfMemoryError3);
            }
            return zzagh2;
        }
        zzdy0.zzL(v8);
        return null;
    }
}

