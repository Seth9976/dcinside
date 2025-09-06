package com.google.android.gms.internal.vision;

import java.lang.reflect.Type;

public enum zziv {
    DOUBLE(0, zzix.zza, zzjm.zze),
    FLOAT(1, zzix.zza, zzjm.zzd),
    INT64(2, zzix.zza, zzjm.zzc),
    UINT64(3, zzix.zza, zzjm.zzc),
    INT32(4, zzix.zza, zzjm.zzb),
    FIXED64(5, zzix.zza, zzjm.zzc),
    FIXED32(6, zzix.zza, zzjm.zzb),
    BOOL(7, zzix.zza, zzjm.zzf),
    STRING(8, zzix.zza, zzjm.zzg),
    MESSAGE(9, zzix.zza, zzjm.zzj),
    BYTES(10, zzix.zza, zzjm.zzh),
    UINT32(11, zzix.zza, zzjm.zzb),
    ENUM(12, zzix.zza, zzjm.zzi),
    SFIXED32(13, zzix.zza, zzjm.zzb),
    SFIXED64(14, zzix.zza, zzjm.zzc),
    SINT32(15, zzix.zza, zzjm.zzb),
    SINT64(16, zzix.zza, zzjm.zzc),
    GROUP(17, zzix.zza, zzjm.zzj),
    DOUBLE_LIST(18, zzix.zzb, zzjm.zze),
    FLOAT_LIST(19, zzix.zzb, zzjm.zzd),
    INT64_LIST(20, zzix.zzb, zzjm.zzc),
    UINT64_LIST(21, zzix.zzb, zzjm.zzc),
    INT32_LIST(22, zzix.zzb, zzjm.zzb),
    FIXED64_LIST(23, zzix.zzb, zzjm.zzc),
    FIXED32_LIST(24, zzix.zzb, zzjm.zzb),
    BOOL_LIST(25, zzix.zzb, zzjm.zzf),
    STRING_LIST(26, zzix.zzb, zzjm.zzg),
    MESSAGE_LIST(27, zzix.zzb, zzjm.zzj),
    BYTES_LIST(28, zzix.zzb, zzjm.zzh),
    UINT32_LIST(29, zzix.zzb, zzjm.zzb),
    ENUM_LIST(30, zzix.zzb, zzjm.zzi),
    SFIXED32_LIST(0x1F, zzix.zzb, zzjm.zzb),
    SFIXED64_LIST(0x20, zzix.zzb, zzjm.zzc),
    SINT32_LIST(33, zzix.zzb, zzjm.zzb),
    SINT64_LIST(34, zzix.zzb, zzjm.zzc),
    DOUBLE_LIST_PACKED(35, zzix.zzc, zzjm.zze),
    FLOAT_LIST_PACKED(36, zzix.zzc, zzjm.zzd),
    INT64_LIST_PACKED(37, zzix.zzc, zzjm.zzc),
    UINT64_LIST_PACKED(38, zzix.zzc, zzjm.zzc),
    INT32_LIST_PACKED(39, zzix.zzc, zzjm.zzb),
    FIXED64_LIST_PACKED(40, zzix.zzc, zzjm.zzc),
    FIXED32_LIST_PACKED(41, zzix.zzc, zzjm.zzb),
    BOOL_LIST_PACKED(42, zzix.zzc, zzjm.zzf),
    UINT32_LIST_PACKED(43, zzix.zzc, zzjm.zzb),
    ENUM_LIST_PACKED(44, zzix.zzc, zzjm.zzi),
    SFIXED32_LIST_PACKED(45, zzix.zzc, zzjm.zzb),
    SFIXED64_LIST_PACKED(46, zzix.zzc, zzjm.zzc),
    SINT32_LIST_PACKED(0x2F, zzix.zzc, zzjm.zzb),
    SINT64_LIST_PACKED(0x30, zzix.zzc, zzjm.zzc),
    GROUP_LIST(49, zzix.zzb, zzjm.zzj),
    MAP(50, zzix.zzd, zzjm.zza);

    private final zzjm zzaz;
    private final int zzba;
    private final zzix zzbb;
    private final Class zzbc;
    private final boolean zzbd;
    private static final zziv[] zzbe;
    private static final Type[] zzbf;
    private static final zziv[] zzbg;

    static {
        arr_zziv[0] = zziv.zzc;
        arr_zziv[1] = zziv.zzd;
        arr_zziv[2] = zziv.zze;
        arr_zziv[3] = zziv.zzf;
        arr_zziv[4] = zziv.zzg;
        arr_zziv[5] = zziv.zzh;
        arr_zziv[6] = zziv.zzi;
        arr_zziv[7] = zziv.zzj;
        arr_zziv[8] = zziv.zzk;
        arr_zziv[9] = zziv.zzl;
        arr_zziv[10] = zziv.zzm;
        arr_zziv[11] = zziv.zzn;
        arr_zziv[12] = zziv.zzo;
        arr_zziv[13] = zziv.zzp;
        arr_zziv[14] = zziv.zzq;
        arr_zziv[15] = zziv.zzr;
        arr_zziv[16] = zziv.zzs;
        arr_zziv[17] = zziv.zzt;
        arr_zziv[18] = zziv.zzu;
        arr_zziv[19] = zziv.zzv;
        arr_zziv[20] = zziv.zzw;
        arr_zziv[21] = zziv.zzx;
        arr_zziv[22] = zziv.zzy;
        arr_zziv[23] = zziv.zzz;
        arr_zziv[24] = zziv.zzaa;
        arr_zziv[25] = zziv.zzab;
        arr_zziv[26] = zziv.zzac;
        arr_zziv[27] = zziv.zzad;
        arr_zziv[28] = zziv.zzae;
        arr_zziv[29] = zziv.zzaf;
        arr_zziv[30] = zziv.zzag;
        arr_zziv[0x1F] = zziv.zzah;
        arr_zziv[0x20] = zziv.zzai;
        arr_zziv[33] = zziv.zzaj;
        arr_zziv[34] = zziv.zzak;
        arr_zziv[35] = zziv.zza;
        arr_zziv[36] = zziv.zzal;
        arr_zziv[37] = zziv.zzam;
        arr_zziv[38] = zziv.zzan;
        arr_zziv[39] = zziv.zzao;
        arr_zziv[40] = zziv.zzap;
        arr_zziv[41] = zziv.zzaq;
        arr_zziv[42] = zziv.zzar;
        arr_zziv[43] = zziv.zzas;
        arr_zziv[44] = zziv.zzat;
        arr_zziv[45] = zziv.zzau;
        arr_zziv[46] = zziv.zzav;
        arr_zziv[0x2F] = zziv.zzaw;
        arr_zziv[0x30] = zziv.zzb;
        arr_zziv[49] = zziv.zzax;
        arr_zziv[50] = zziv.zzay;
        zziv.zzbg = arr_zziv;
        zziv.zzbf = new Type[0];
        zziv[] arr_zziv1 = (zziv[])zziv.zzbg.clone();
        zziv.zzbe = new zziv[arr_zziv1.length];
        for(int v = 0; v < arr_zziv1.length; ++v) {
            zziv zziv0 = arr_zziv1[v];
            zziv.zzbe[zziv0.zzba] = zziv0;
        }
    }

    private zziv(int v1, zzix zzix0, zzjm zzjm0) {
        this.zzba = v1;
        this.zzbb = zzix0;
        this.zzaz = zzjm0;
        boolean z = true;
        switch(zzix0) {
            case 1: {
                this.zzbc = zzjm0.zza();
                break;
            }
            case 2: {
                this.zzbc = zzjm0.zza();
                break;
            }
            default: {
                this.zzbc = null;
            }
        }
        if(zzix0 == zzix.zza) {
            int v2 = zziy.zzb[zzjm0.ordinal()];
            if(v2 == 1 || v2 == 2 || v2 == 3) {
                z = false;
            }
        }
        else {
            z = false;
        }
        this.zzbd = z;
    }

    public final int zza() {
        return this.zzba;
    }
}

