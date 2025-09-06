package com.google.android.gms.internal.ads;

public enum zzgxh {
    DOUBLE(0, 1, zzgyi.zze),
    FLOAT(1, 1, zzgyi.zzd),
    INT64(2, 1, zzgyi.zzc),
    UINT64(3, 1, zzgyi.zzc),
    INT32(4, 1, zzgyi.zzb),
    FIXED64(5, 1, zzgyi.zzc),
    FIXED32(6, 1, zzgyi.zzb),
    BOOL(7, 1, zzgyi.zzf),
    STRING(8, 1, zzgyi.zzg),
    MESSAGE(9, 1, zzgyi.zzj),
    BYTES(10, 1, zzgyi.zzh),
    UINT32(11, 1, zzgyi.zzb),
    ENUM(12, 1, zzgyi.zzi),
    SFIXED32(13, 1, zzgyi.zzb),
    SFIXED64(14, 1, zzgyi.zzc),
    SINT32(15, 1, zzgyi.zzb),
    SINT64(16, 1, zzgyi.zzc),
    GROUP(17, 1, zzgyi.zzj),
    DOUBLE_LIST(18, 2, zzgyi.zze),
    FLOAT_LIST(19, 2, zzgyi.zzd),
    INT64_LIST(20, 2, zzgyi.zzc),
    UINT64_LIST(21, 2, zzgyi.zzc),
    INT32_LIST(22, 2, zzgyi.zzb),
    FIXED64_LIST(23, 2, zzgyi.zzc),
    FIXED32_LIST(24, 2, zzgyi.zzb),
    BOOL_LIST(25, 2, zzgyi.zzf),
    STRING_LIST(26, 2, zzgyi.zzg),
    MESSAGE_LIST(27, 2, zzgyi.zzj),
    BYTES_LIST(28, 2, zzgyi.zzh),
    UINT32_LIST(29, 2, zzgyi.zzb),
    ENUM_LIST(30, 2, zzgyi.zzi),
    SFIXED32_LIST(0x1F, 2, zzgyi.zzb),
    SFIXED64_LIST(0x20, 2, zzgyi.zzc),
    SINT32_LIST(33, 2, zzgyi.zzb),
    SINT64_LIST(34, 2, zzgyi.zzc),
    DOUBLE_LIST_PACKED(35, 3, zzgyi.zze),
    FLOAT_LIST_PACKED(36, 3, zzgyi.zzd),
    INT64_LIST_PACKED(37, 3, zzgyi.zzc),
    UINT64_LIST_PACKED(38, 3, zzgyi.zzc),
    INT32_LIST_PACKED(39, 3, zzgyi.zzb),
    FIXED64_LIST_PACKED(40, 3, zzgyi.zzc),
    FIXED32_LIST_PACKED(41, 3, zzgyi.zzb),
    BOOL_LIST_PACKED(42, 3, zzgyi.zzf),
    UINT32_LIST_PACKED(43, 3, zzgyi.zzb),
    ENUM_LIST_PACKED(44, 3, zzgyi.zzi),
    SFIXED32_LIST_PACKED(45, 3, zzgyi.zzb),
    SFIXED64_LIST_PACKED(46, 3, zzgyi.zzc),
    SINT32_LIST_PACKED(0x2F, 3, zzgyi.zzb),
    SINT64_LIST_PACKED(0x30, 3, zzgyi.zzc),
    GROUP_LIST(49, 2, zzgyi.zzj),
    MAP(50, 4, zzgyi.zza);

    private static final zzgxh[] zzZ;
    private static final zzgxh[] zzaa;
    private final int zzab;

    static {
        arr_zzgxh[0] = zzgxh.zza;
        arr_zzgxh[1] = zzgxh.zzb;
        arr_zzgxh[2] = zzgxh.zzc;
        arr_zzgxh[3] = zzgxh.zzd;
        arr_zzgxh[4] = zzgxh.zze;
        arr_zzgxh[5] = zzgxh.zzf;
        arr_zzgxh[6] = zzgxh.zzg;
        arr_zzgxh[7] = zzgxh.zzh;
        arr_zzgxh[8] = zzgxh.zzi;
        arr_zzgxh[9] = zzgxh.zzj;
        arr_zzgxh[10] = zzgxh.zzk;
        arr_zzgxh[11] = zzgxh.zzl;
        arr_zzgxh[12] = zzgxh.zzm;
        arr_zzgxh[13] = zzgxh.zzn;
        arr_zzgxh[14] = zzgxh.zzo;
        arr_zzgxh[15] = zzgxh.zzp;
        arr_zzgxh[16] = zzgxh.zzq;
        arr_zzgxh[17] = zzgxh.zzr;
        arr_zzgxh[18] = zzgxh.zzs;
        arr_zzgxh[19] = zzgxh.zzt;
        arr_zzgxh[20] = zzgxh.zzu;
        arr_zzgxh[21] = zzgxh.zzv;
        arr_zzgxh[22] = zzgxh.zzw;
        arr_zzgxh[23] = zzgxh.zzx;
        arr_zzgxh[24] = zzgxh.zzy;
        arr_zzgxh[25] = zzgxh.zzz;
        arr_zzgxh[26] = zzgxh.zzA;
        arr_zzgxh[27] = zzgxh.zzB;
        arr_zzgxh[28] = zzgxh.zzC;
        arr_zzgxh[29] = zzgxh.zzD;
        arr_zzgxh[30] = zzgxh.zzE;
        arr_zzgxh[0x1F] = zzgxh.zzF;
        arr_zzgxh[0x20] = zzgxh.zzG;
        arr_zzgxh[33] = zzgxh.zzH;
        arr_zzgxh[34] = zzgxh.zzI;
        arr_zzgxh[35] = zzgxh.zzJ;
        arr_zzgxh[36] = zzgxh.zzK;
        arr_zzgxh[37] = zzgxh.zzL;
        arr_zzgxh[38] = zzgxh.zzM;
        arr_zzgxh[39] = zzgxh.zzN;
        arr_zzgxh[40] = zzgxh.zzO;
        arr_zzgxh[41] = zzgxh.zzP;
        arr_zzgxh[42] = zzgxh.zzQ;
        arr_zzgxh[43] = zzgxh.zzR;
        arr_zzgxh[44] = zzgxh.zzS;
        arr_zzgxh[45] = zzgxh.zzT;
        arr_zzgxh[46] = zzgxh.zzU;
        arr_zzgxh[0x2F] = zzgxh.zzV;
        arr_zzgxh[0x30] = zzgxh.zzW;
        arr_zzgxh[49] = zzgxh.zzX;
        arr_zzgxh[50] = zzgxh.zzY;
        zzgxh.zzaa = arr_zzgxh;
        zzgxh[] arr_zzgxh1 = (zzgxh[])zzgxh.zzaa.clone();
        zzgxh.zzZ = new zzgxh[arr_zzgxh1.length];
        for(int v = 0; v < arr_zzgxh1.length; ++v) {
            zzgxh zzgxh0 = arr_zzgxh1[v];
            zzgxh.zzZ[zzgxh0.zzab] = zzgxh0;
        }
    }

    private zzgxh(int v1, int v2, zzgyi zzgyi0) {
        this.zzab = v1;
        if(v2 == 1) {
            zzgyi0.ordinal();
        }
    }

    public final int zza() {
        return this.zzab;
    }
}

