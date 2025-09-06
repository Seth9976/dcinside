package com.google.android.gms.internal.measurement;

public enum zzjn {
    DOUBLE(0, zzjp.zza, zzkd.zze),
    FLOAT(1, zzjp.zza, zzkd.zzd),
    INT64(2, zzjp.zza, zzkd.zzc),
    UINT64(3, zzjp.zza, zzkd.zzc),
    INT32(4, zzjp.zza, zzkd.zzb),
    FIXED64(5, zzjp.zza, zzkd.zzc),
    FIXED32(6, zzjp.zza, zzkd.zzb),
    BOOL(7, zzjp.zza, zzkd.zzf),
    STRING(8, zzjp.zza, zzkd.zzg),
    MESSAGE(9, zzjp.zza, zzkd.zzj),
    BYTES(10, zzjp.zza, zzkd.zzh),
    UINT32(11, zzjp.zza, zzkd.zzb),
    ENUM(12, zzjp.zza, zzkd.zzi),
    SFIXED32(13, zzjp.zza, zzkd.zzb),
    SFIXED64(14, zzjp.zza, zzkd.zzc),
    SINT32(15, zzjp.zza, zzkd.zzb),
    SINT64(16, zzjp.zza, zzkd.zzc),
    GROUP(17, zzjp.zza, zzkd.zzj),
    DOUBLE_LIST(18, zzjp.zzb, zzkd.zze),
    FLOAT_LIST(19, zzjp.zzb, zzkd.zzd),
    INT64_LIST(20, zzjp.zzb, zzkd.zzc),
    UINT64_LIST(21, zzjp.zzb, zzkd.zzc),
    INT32_LIST(22, zzjp.zzb, zzkd.zzb),
    FIXED64_LIST(23, zzjp.zzb, zzkd.zzc),
    FIXED32_LIST(24, zzjp.zzb, zzkd.zzb),
    BOOL_LIST(25, zzjp.zzb, zzkd.zzf),
    STRING_LIST(26, zzjp.zzb, zzkd.zzg),
    MESSAGE_LIST(27, zzjp.zzb, zzkd.zzj),
    BYTES_LIST(28, zzjp.zzb, zzkd.zzh),
    UINT32_LIST(29, zzjp.zzb, zzkd.zzb),
    ENUM_LIST(30, zzjp.zzb, zzkd.zzi),
    SFIXED32_LIST(0x1F, zzjp.zzb, zzkd.zzb),
    SFIXED64_LIST(0x20, zzjp.zzb, zzkd.zzc),
    SINT32_LIST(33, zzjp.zzb, zzkd.zzb),
    SINT64_LIST(34, zzjp.zzb, zzkd.zzc),
    DOUBLE_LIST_PACKED(35, zzjp.zzc, zzkd.zze),
    FLOAT_LIST_PACKED(36, zzjp.zzc, zzkd.zzd),
    INT64_LIST_PACKED(37, zzjp.zzc, zzkd.zzc),
    UINT64_LIST_PACKED(38, zzjp.zzc, zzkd.zzc),
    INT32_LIST_PACKED(39, zzjp.zzc, zzkd.zzb),
    FIXED64_LIST_PACKED(40, zzjp.zzc, zzkd.zzc),
    FIXED32_LIST_PACKED(41, zzjp.zzc, zzkd.zzb),
    BOOL_LIST_PACKED(42, zzjp.zzc, zzkd.zzf),
    UINT32_LIST_PACKED(43, zzjp.zzc, zzkd.zzb),
    ENUM_LIST_PACKED(44, zzjp.zzc, zzkd.zzi),
    SFIXED32_LIST_PACKED(45, zzjp.zzc, zzkd.zzb),
    SFIXED64_LIST_PACKED(46, zzjp.zzc, zzkd.zzc),
    SINT32_LIST_PACKED(0x2F, zzjp.zzc, zzkd.zzb),
    SINT64_LIST_PACKED(0x30, zzjp.zzc, zzkd.zzc),
    GROUP_LIST(49, zzjp.zzb, zzkd.zzj),
    MAP(50, zzjp.zzd, zzkd.zza);

    private static final zzjn[] zzaz;
    private static final zzjn[] zzba;
    private final int zzbb;

    static {
        arr_zzjn[0] = zzjn.zzc;
        arr_zzjn[1] = zzjn.zzd;
        arr_zzjn[2] = zzjn.zze;
        arr_zzjn[3] = zzjn.zzf;
        arr_zzjn[4] = zzjn.zzg;
        arr_zzjn[5] = zzjn.zzh;
        arr_zzjn[6] = zzjn.zzi;
        arr_zzjn[7] = zzjn.zzj;
        arr_zzjn[8] = zzjn.zzk;
        arr_zzjn[9] = zzjn.zzl;
        arr_zzjn[10] = zzjn.zzm;
        arr_zzjn[11] = zzjn.zzn;
        arr_zzjn[12] = zzjn.zzo;
        arr_zzjn[13] = zzjn.zzp;
        arr_zzjn[14] = zzjn.zzq;
        arr_zzjn[15] = zzjn.zzr;
        arr_zzjn[16] = zzjn.zzs;
        arr_zzjn[17] = zzjn.zzt;
        arr_zzjn[18] = zzjn.zzu;
        arr_zzjn[19] = zzjn.zzv;
        arr_zzjn[20] = zzjn.zzw;
        arr_zzjn[21] = zzjn.zzx;
        arr_zzjn[22] = zzjn.zzy;
        arr_zzjn[23] = zzjn.zzz;
        arr_zzjn[24] = zzjn.zzaa;
        arr_zzjn[25] = zzjn.zzab;
        arr_zzjn[26] = zzjn.zzac;
        arr_zzjn[27] = zzjn.zzad;
        arr_zzjn[28] = zzjn.zzae;
        arr_zzjn[29] = zzjn.zzaf;
        arr_zzjn[30] = zzjn.zzag;
        arr_zzjn[0x1F] = zzjn.zzah;
        arr_zzjn[0x20] = zzjn.zzai;
        arr_zzjn[33] = zzjn.zzaj;
        arr_zzjn[34] = zzjn.zzak;
        arr_zzjn[35] = zzjn.zza;
        arr_zzjn[36] = zzjn.zzal;
        arr_zzjn[37] = zzjn.zzam;
        arr_zzjn[38] = zzjn.zzan;
        arr_zzjn[39] = zzjn.zzao;
        arr_zzjn[40] = zzjn.zzap;
        arr_zzjn[41] = zzjn.zzaq;
        arr_zzjn[42] = zzjn.zzar;
        arr_zzjn[43] = zzjn.zzas;
        arr_zzjn[44] = zzjn.zzat;
        arr_zzjn[45] = zzjn.zzau;
        arr_zzjn[46] = zzjn.zzav;
        arr_zzjn[0x2F] = zzjn.zzaw;
        arr_zzjn[0x30] = zzjn.zzb;
        arr_zzjn[49] = zzjn.zzax;
        arr_zzjn[50] = zzjn.zzay;
        zzjn.zzba = arr_zzjn;
        zzjn[] arr_zzjn1 = (zzjn[])zzjn.zzba.clone();
        zzjn.zzaz = new zzjn[arr_zzjn1.length];
        for(int v = 0; v < arr_zzjn1.length; ++v) {
            zzjn zzjn0 = arr_zzjn1[v];
            zzjn.zzaz[zzjn0.zzbb] = zzjn0;
        }
    }

    private zzjn(int v1, zzjp zzjp0, zzkd zzkd0) {
        this.zzbb = v1;
        boolean z = zzjp0.ordinal() == 3;
        if(zzjp0 == zzjp.zza) {
            int v2 = zzjq.zza[zzkd0.ordinal()];
        }
    }

    public final int zza() {
        return this.zzbb;
    }
}

