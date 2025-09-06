package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Type;

public enum zzcb {
    DOUBLE(0, zzcd.zzjg, zzcq.zzlb),
    FLOAT(1, zzcd.zzjg, zzcq.zzla),
    INT64(2, zzcd.zzjg, zzcq.zzkz),
    UINT64(3, zzcd.zzjg, zzcq.zzkz),
    INT32(4, zzcd.zzjg, zzcq.zzky),
    FIXED64(5, zzcd.zzjg, zzcq.zzkz),
    FIXED32(6, zzcd.zzjg, zzcq.zzky),
    BOOL(7, zzcd.zzjg, zzcq.zzlc),
    STRING(8, zzcd.zzjg, zzcq.zzld),
    MESSAGE(9, zzcd.zzjg, zzcq.zzlg),
    BYTES(10, zzcd.zzjg, zzcq.zzle),
    UINT32(11, zzcd.zzjg, zzcq.zzky),
    ENUM(12, zzcd.zzjg, zzcq.zzlf),
    SFIXED32(13, zzcd.zzjg, zzcq.zzky),
    SFIXED64(14, zzcd.zzjg, zzcq.zzkz),
    SINT32(15, zzcd.zzjg, zzcq.zzky),
    SINT64(16, zzcd.zzjg, zzcq.zzkz),
    GROUP(17, zzcd.zzjg, zzcq.zzlg),
    DOUBLE_LIST(18, zzcd.zzjh, zzcq.zzlb),
    FLOAT_LIST(19, zzcd.zzjh, zzcq.zzla),
    INT64_LIST(20, zzcd.zzjh, zzcq.zzkz),
    UINT64_LIST(21, zzcd.zzjh, zzcq.zzkz),
    INT32_LIST(22, zzcd.zzjh, zzcq.zzky),
    FIXED64_LIST(23, zzcd.zzjh, zzcq.zzkz),
    FIXED32_LIST(24, zzcd.zzjh, zzcq.zzky),
    BOOL_LIST(25, zzcd.zzjh, zzcq.zzlc),
    STRING_LIST(26, zzcd.zzjh, zzcq.zzld),
    MESSAGE_LIST(27, zzcd.zzjh, zzcq.zzlg),
    BYTES_LIST(28, zzcd.zzjh, zzcq.zzle),
    UINT32_LIST(29, zzcd.zzjh, zzcq.zzky),
    ENUM_LIST(30, zzcd.zzjh, zzcq.zzlf),
    SFIXED32_LIST(0x1F, zzcd.zzjh, zzcq.zzky),
    SFIXED64_LIST(0x20, zzcd.zzjh, zzcq.zzkz),
    SINT32_LIST(33, zzcd.zzjh, zzcq.zzky),
    SINT64_LIST(34, zzcd.zzjh, zzcq.zzkz),
    DOUBLE_LIST_PACKED(35, zzcd.zzji, zzcq.zzlb),
    FLOAT_LIST_PACKED(36, zzcd.zzji, zzcq.zzla),
    INT64_LIST_PACKED(37, zzcd.zzji, zzcq.zzkz),
    UINT64_LIST_PACKED(38, zzcd.zzji, zzcq.zzkz),
    INT32_LIST_PACKED(39, zzcd.zzji, zzcq.zzky),
    FIXED64_LIST_PACKED(40, zzcd.zzji, zzcq.zzkz),
    FIXED32_LIST_PACKED(41, zzcd.zzji, zzcq.zzky),
    BOOL_LIST_PACKED(42, zzcd.zzji, zzcq.zzlc),
    UINT32_LIST_PACKED(43, zzcd.zzji, zzcq.zzky),
    ENUM_LIST_PACKED(44, zzcd.zzji, zzcq.zzlf),
    SFIXED32_LIST_PACKED(45, zzcd.zzji, zzcq.zzky),
    SFIXED64_LIST_PACKED(46, zzcd.zzji, zzcq.zzkz),
    SINT32_LIST_PACKED(0x2F, zzcd.zzji, zzcq.zzky),
    SINT64_LIST_PACKED(0x30, zzcd.zzji, zzcq.zzkz),
    GROUP_LIST(49, zzcd.zzjh, zzcq.zzlg),
    MAP(50, zzcd.zzjj, zzcq.zzkx);

    private final int id;
    private final zzcq zzix;
    private final zzcd zziy;
    private final Class zziz;
    private final boolean zzja;
    private static final zzcb[] zzjb;
    private static final Type[] zzjc;
    private static final zzcb[] zzjd;

    static {
        arr_zzcb[0] = zzcb.zzgy;
        arr_zzcb[1] = zzcb.zzgz;
        arr_zzcb[2] = zzcb.zzha;
        arr_zzcb[3] = zzcb.zzhb;
        arr_zzcb[4] = zzcb.zzhc;
        arr_zzcb[5] = zzcb.zzhd;
        arr_zzcb[6] = zzcb.zzhe;
        arr_zzcb[7] = zzcb.zzhf;
        arr_zzcb[8] = zzcb.zzhg;
        arr_zzcb[9] = zzcb.zzhh;
        arr_zzcb[10] = zzcb.zzhi;
        arr_zzcb[11] = zzcb.zzhj;
        arr_zzcb[12] = zzcb.zzhk;
        arr_zzcb[13] = zzcb.zzhl;
        arr_zzcb[14] = zzcb.zzhm;
        arr_zzcb[15] = zzcb.zzhn;
        arr_zzcb[16] = zzcb.zzho;
        arr_zzcb[17] = zzcb.zzhp;
        arr_zzcb[18] = zzcb.zzhq;
        arr_zzcb[19] = zzcb.zzhr;
        arr_zzcb[20] = zzcb.zzhs;
        arr_zzcb[21] = zzcb.zzht;
        arr_zzcb[22] = zzcb.zzhu;
        arr_zzcb[23] = zzcb.zzhv;
        arr_zzcb[24] = zzcb.zzhw;
        arr_zzcb[25] = zzcb.zzhx;
        arr_zzcb[26] = zzcb.zzhy;
        arr_zzcb[27] = zzcb.zzhz;
        arr_zzcb[28] = zzcb.zzia;
        arr_zzcb[29] = zzcb.zzib;
        arr_zzcb[30] = zzcb.zzic;
        arr_zzcb[0x1F] = zzcb.zzid;
        arr_zzcb[0x20] = zzcb.zzie;
        arr_zzcb[33] = zzcb.zzif;
        arr_zzcb[34] = zzcb.zzig;
        arr_zzcb[35] = zzcb.zzih;
        arr_zzcb[36] = zzcb.zzii;
        arr_zzcb[37] = zzcb.zzij;
        arr_zzcb[38] = zzcb.zzik;
        arr_zzcb[39] = zzcb.zzil;
        arr_zzcb[40] = zzcb.zzim;
        arr_zzcb[41] = zzcb.zzin;
        arr_zzcb[42] = zzcb.zzio;
        arr_zzcb[43] = zzcb.zzip;
        arr_zzcb[44] = zzcb.zziq;
        arr_zzcb[45] = zzcb.zzir;
        arr_zzcb[46] = zzcb.zzis;
        arr_zzcb[0x2F] = zzcb.zzit;
        arr_zzcb[0x30] = zzcb.zziu;
        arr_zzcb[49] = zzcb.zziv;
        arr_zzcb[50] = zzcb.zziw;
        zzcb.zzjd = arr_zzcb;
        zzcb.zzjc = new Type[0];
        zzcb[] arr_zzcb1 = (zzcb[])zzcb.zzjd.clone();
        zzcb.zzjb = new zzcb[arr_zzcb1.length];
        for(int v = 0; v < arr_zzcb1.length; ++v) {
            zzcb zzcb0 = arr_zzcb1[v];
            zzcb.zzjb[zzcb0.id] = zzcb0;
        }
    }

    private zzcb(int v1, zzcd zzcd0, zzcq zzcq0) {
        Class class0;
        this.id = v1;
        this.zziy = zzcd0;
        this.zzix = zzcq0;
        boolean z = true;
        switch(zzcd0) {
            case 1: 
            case 2: {
                class0 = zzcq0.zzbq();
                break;
            }
            default: {
                class0 = null;
            }
        }
        this.zziz = class0;
        if(zzcd0 == zzcd.zzjg) {
            int v2 = zzcc.zzjf[zzcq0.ordinal()];
            if(v2 == 1 || v2 == 2 || v2 == 3) {
                z = false;
            }
        }
        else {
            z = false;
        }
        this.zzja = z;
    }

    public final int id() {
        return this.id;
    }
}

