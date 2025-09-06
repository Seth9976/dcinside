package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import h4.d;
import h4.m;
import j..util.DesugarCollections;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

public final class zzahm implements zzacn {
    private long zzA;
    @Nullable
    private zzahk zzB;
    private boolean zzC;
    private int zzD;
    private long zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private long zzI;
    @Nullable
    private zzdp zzJ;
    @Nullable
    private zzdp zzK;
    private boolean zzL;
    private boolean zzM;
    private int zzN;
    private long zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private int[] zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private int zzZ;
    private static final byte[] zza;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private int zzaf;
    private byte zzag;
    private boolean zzah;
    private zzacq zzai;
    private final zzahh zzaj;
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final UUID zze;
    private static final Map zzf;
    private final zzaho zzg;
    private final SparseArray zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final zzakd zzk;
    private final zzdy zzl;
    private final zzdy zzm;
    private final zzdy zzn;
    private final zzdy zzo;
    private final zzdy zzp;
    private final zzdy zzq;
    private final zzdy zzr;
    private final zzdy zzs;
    private final zzdy zzt;
    private final zzdy zzu;
    private ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        zzahm.zza = new byte[]{49, 10, 0x30, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 44, 0x30, 0x30, 0x30, 0x20, 45, 45, 62, 0x20, 0x30, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 44, 0x30, 0x30, 0x30, 10};
        zzahm.zzb = new byte[]{70, 0x6F, 0x72, 109, 97, 0x74, 58, 0x20, 83, 0x74, 97, 0x72, 0x74, 44, 0x20, 69, 110, 100, 44, 0x20, 82, 101, 97, 100, 0x4F, 0x72, 100, 101, 0x72, 44, 0x20, 76, 97, 0x79, 101, 0x72, 44, 0x20, 83, 0x74, 0x79, 108, 101, 44, 0x20, 78, 97, 109, 101, 44, 0x20, 77, 97, 0x72, 103, 105, 110, 76, 44, 0x20, 77, 97, 0x72, 103, 105, 110, 82, 44, 0x20, 77, 97, 0x72, 103, 105, 110, 86, 44, 0x20, 69, 102, 102, 101, 99, 0x74, 44, 0x20, 84, 101, 120, 0x74};
        zzahm.zzc = new byte[]{68, 105, 97, 108, 0x6F, 103, 0x75, 101, 58, 0x20, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 44, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 44};
        zzahm.zzd = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 0x30, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 46, 0x30, 0x30, 0x30, 0x20, 45, 45, 62, 0x20, 0x30, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 46, 0x30, 0x30, 0x30, 10};
        zzahm.zze = new UUID(0x100000000001000L, 0x800000AA00389B71L);
        HashMap hashMap0 = new HashMap();
        hashMap0.put("htc_video_rotA-000", 0);
        hashMap0.put("htc_video_rotA-090", 90);
        hashMap0.put("htc_video_rotA-180", 180);
        hashMap0.put("htc_video_rotA-270", 270);
        zzahm.zzf = DesugarCollections.unmodifiableMap(hashMap0);
    }

    @Deprecated
    public zzahm() {
        this(new zzahh(), 2, zzakd.zza);
    }

    zzahm(zzahh zzahh0, int v, zzakd zzakd0) {
        this.zzx = -1L;
        this.zzy = 0x8000000000000001L;
        this.zzz = 0x8000000000000001L;
        this.zzA = 0x8000000000000001L;
        this.zzG = -1L;
        this.zzH = -1L;
        this.zzI = 0x8000000000000001L;
        this.zzaj = zzahh0;
        zzahh0.zza(new zzahj(this, null));
        this.zzk = zzakd0;
        boolean z = false;
        this.zzi = 1 == (v & 1 ^ 1);
        if((v & 2) == 0) {
            z = true;
        }
        this.zzj = z;
        this.zzg = new zzaho();
        this.zzh = new SparseArray();
        this.zzn = new zzdy(4);
        this.zzo = new zzdy(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzp = new zzdy(4);
        this.zzl = new zzdy(zzfk.zza);
        this.zzm = new zzdy(4);
        this.zzq = new zzdy();
        this.zzr = new zzdy();
        this.zzs = new zzdy(8);
        this.zzt = new zzdy();
        this.zzu = new zzdy();
        this.zzS = new int[1];
    }

    public zzahm(zzakd zzakd0, int v) {
        this(new zzahh(), 0, zzakd0);
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzaco0, zzadj zzadj0) throws IOException {
        this.zzM = false;
        while(this.zzaj.zzc(zzaco0)) {
            long v1 = zzaco0.zzf();
            if(this.zzF) {
                this.zzH = v1;
                zzadj0.zza = this.zzG;
                this.zzF = false;
                return 1;
            }
            if(this.zzC) {
                long v2 = this.zzH;
                if(v2 != -1L) {
                    zzadj0.zza = v2;
                    this.zzH = -1L;
                    return 1;
                }
                if(false) {
                    break;
                }
            }
        }
        for(int v = 0; v < this.zzh.size(); ++v) {
            zzahk zzahk0 = (zzahk)this.zzh.valueAt(v);
            zzahk.zzd(zzahk0);
            zzadu zzadu0 = zzahk0.zzT;
            if(zzadu0 != null) {
                zzadu0.zza(zzahk0.zzW, zzahk0.zzi);
            }
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final zzacn zzc() {
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final List zzd() {
        return zzfxn.zzn();
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final void zze(zzacq zzacq0) {
        if(this.zzj) {
            zzacq0 = new zzakg(zzacq0, this.zzk);
        }
        this.zzai = zzacq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    @CallSuper
    public final void zzf(long v, long v1) {
        this.zzI = 0x8000000000000001L;
        this.zzN = 0;
        this.zzaj.zzb();
        this.zzg.zze();
        this.zzw();
        for(int v2 = 0; v2 < this.zzh.size(); ++v2) {
            zzadu zzadu0 = ((zzahk)this.zzh.valueAt(v2)).zzT;
            if(zzadu0 != null) {
                zzadu0.zzb();
            }
        }
    }

    @CallSuper
    protected final void zzh(int v, int v1, zzaco zzaco0) throws IOException {
        int v22;
        int v20;
        long v18;
        int v14;
        int v10;
        int v8;
        int v2 = v;
        if(v2 == 0xA1 || v2 == 0xA3) {
            if(this.zzN == 0) {
                this.zzT = (int)this.zzg.zzd(zzaco0, false, true, 8);
                this.zzU = this.zzg.zza();
                this.zzP = 0x8000000000000001L;
                this.zzN = 1;
                this.zzn.zzI(0);
            }
            Object object0 = this.zzh.get(this.zzT);
            if(((zzahk)object0) == null) {
                zzaco0.zzk(v1 - this.zzU);
                this.zzN = 0;
                return;
            }
            zzahk.zzd(((zzahk)object0));
            if(this.zzN == 1) {
                this.zzv(zzaco0, 3);
                int v3 = (this.zzn.zzN()[2] & 6) >> 1;
                if(v3 == 0) {
                    this.zzR = 1;
                    int[] arr_v = zzahm.zzz(this.zzS, 1);
                    this.zzS = arr_v;
                    arr_v[0] = v1 - this.zzU - 3;
                    goto label_141;
                }
                else {
                    this.zzv(zzaco0, 4);
                    int v4 = (this.zzn.zzN()[3] & 0xFF) + 1;
                    this.zzR = v4;
                    int[] arr_v1 = zzahm.zzz(this.zzS, v4);
                    this.zzS = arr_v1;
                    if(v3 == 2) {
                        Arrays.fill(arr_v1, 0, this.zzR, (v1 - this.zzU - 4) / this.zzR);
                        goto label_141;
                    }
                    else if(v3 == 1) {
                        int v5 = 0;
                        int v6 = 0;
                        int v7;
                        for(v7 = 4; true; ++v7) {
                            v8 = this.zzR - 1;
                            if(v5 >= v8) {
                                break;
                            }
                            this.zzS[v5] = 0;
                            while(true) {
                                this.zzv(zzaco0, v7 + 1);
                                int v9 = this.zzn.zzN()[v7] & 0xFF;
                                int[] arr_v2 = this.zzS;
                                v10 = arr_v2[v5] + v9;
                                arr_v2[v5] = v10;
                                if(v9 != 0xFF) {
                                    break;
                                }
                                ++v7;
                            }
                            v6 += v10;
                            ++v5;
                        }
                        this.zzS[v8] = v1 - this.zzU - v7 - v6;
                        goto label_141;
                    }
                    else {
                        if(v3 != 3) {
                            throw zzbc.zza("Unexpected lacing value: 2", null);
                        }
                        int v11 = 0;
                        int v12 = 4;
                        int v13 = 0;
                        while(true) {
                            v14 = this.zzR - 1;
                            if(v11 >= v14) {
                                goto label_140;
                            }
                            this.zzS[v11] = 0;
                            this.zzv(zzaco0, v12 + 1);
                            if(this.zzn.zzN()[v12] == 0) {
                                throw zzbc.zza("No valid varint length mask found", null);
                            }
                            int v15 = 0;
                            while(true) {
                                if(v15 < 8) {
                                    int v16 = 1 << 7 - v15;
                                    if((this.zzn.zzN()[v12] & v16) == 0) {
                                        ++v15;
                                        continue;
                                    }
                                    else {
                                        int v17 = v12 + 1 + v15;
                                        this.zzv(zzaco0, v17);
                                        v18 = (long)(this.zzn.zzN()[v12] & 0xFF & ~v16);
                                        for(int v19 = v12 + 1; v19 < v17; ++v19) {
                                            v18 = v18 << 8 | ((long)(this.zzn.zzN()[v19] & 0xFF));
                                        }
                                        v20 = v17;
                                        if(v11 > 0) {
                                            v18 -= (1L << v15 * 7 + 6) - 1L;
                                        }
                                        break;
                                    }
                                }
                                v18 = 0L;
                                v20 = v12 + 1;
                                break;
                            }
                            if(v18 < 0xFFFFFFFF80000000L || v18 > 0x7FFFFFFFL) {
                                break;
                            }
                            int[] arr_v3 = this.zzS;
                            int v21 = v11 == 0 ? ((int)v18) : ((int)v18) + arr_v3[v11 - 1];
                            arr_v3[v11] = v21;
                            v13 += v21;
                            ++v11;
                            v12 = v20;
                        }
                        throw zzbc.zza("EBML lacing sample size out of range.", null);
                    label_140:
                        this.zzS[v14] = v1 - this.zzU - v12 - v13;
                    label_141:
                        this.zzO = this.zzI + this.zzr(((long)(this.zzn.zzN()[0] << 8 | this.zzn.zzN()[1] & 0xFF)));
                        if(((zzahk)object0).zzd == 2) {
                            v22 = 1;
                        }
                        else if(v2 != 0xA3) {
                            v22 = 0;
                        }
                        else if((this.zzn.zzN()[2] & 0x80) == 0x80) {
                            v2 = 0xA3;
                            v22 = 1;
                        }
                        else {
                            v2 = 0xA3;
                            v22 = 0;
                        }
                        this.zzV = v22;
                        this.zzN = 2;
                        this.zzQ = 0;
                    }
                }
            }
            if(v2 == 0xA3) {
                int v23;
                while((v23 = this.zzQ) < this.zzR) {
                    int v24 = this.zzp(zzaco0, ((zzahk)object0), this.zzS[v23], false);
                    this.zzu(((zzahk)object0), ((long)(this.zzQ * ((zzahk)object0).zze / 1000)) + this.zzO, this.zzV, v24, 0);
                    ++this.zzQ;
                }
                this.zzN = 0;
                return;
            }
            int v25;
            while((v25 = this.zzQ) < this.zzR) {
                int[] arr_v4 = this.zzS;
                arr_v4[v25] = this.zzp(zzaco0, ((zzahk)object0), arr_v4[v25], true);
                ++this.zzQ;
            }
        }
        else {
            switch(v2) {
                case 0xA5: {
                    goto label_42;
                }
                case 0x41ED: {
                    goto label_33;
                }
                case 0x4255: {
                    goto label_27;
                }
                case 18402: {
                    goto label_21;
                }
                case 0x53AB: {
                    goto label_16;
                }
                case 25506: {
                    goto label_10;
                }
                case 30322: {
                    goto label_4;
                }
            }
            throw zzbc.zza(("Unexpected id: " + v2), null);
        label_4:
            this.zzt(v);
            zzahk zzahk0 = this.zzB;
            byte[] arr_b = new byte[v1];
            zzahk0.zzv = arr_b;
            zzaco0.zzi(arr_b, 0, v1);
            return;
        label_10:
            this.zzt(v);
            zzahk zzahk1 = this.zzB;
            byte[] arr_b1 = new byte[v1];
            zzahk1.zzj = arr_b1;
            zzaco0.zzi(arr_b1, 0, v1);
            return;
        label_16:
            Arrays.fill(this.zzp.zzN(), 0);
            zzaco0.zzi(this.zzp.zzN(), 4 - v1, v1);
            this.zzp.zzL(0);
            this.zzD = (int)this.zzp.zzu();
            return;
        label_21:
            byte[] arr_b2 = new byte[v1];
            zzaco0.zzi(arr_b2, 0, v1);
            this.zzt(v);
            zzahk zzahk2 = this.zzB;
            zzahk2.zzi = new zzads(1, arr_b2, 0, 0);
            return;
        label_27:
            this.zzt(v);
            zzahk zzahk3 = this.zzB;
            byte[] arr_b3 = new byte[v1];
            zzahk3.zzh = arr_b3;
            zzaco0.zzi(arr_b3, 0, v1);
            return;
        label_33:
            this.zzt(v);
            zzahk zzahk4 = this.zzB;
            if(zzahk4.zzY != 1685480259 && zzahk4.zzY != 0x64767643) {
                zzaco0.zzk(v1);
                return;
            }
            byte[] arr_b4 = new byte[v1];
            zzahk4.zzN = arr_b4;
            zzaco0.zzi(arr_b4, 0, v1);
            return;
        label_42:
            if(this.zzN == 2) {
                zzahk zzahk5 = (zzahk)this.zzh.get(this.zzT);
                if(this.zzW == 4 && "V_VP9".equals(zzahk5.zzb)) {
                    this.zzu.zzI(v1);
                    zzaco0.zzi(this.zzu.zzN(), 0, v1);
                    return;
                }
                zzaco0.zzk(v1);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzaco0) throws IOException {
        return new zzahn().zza(zzaco0);
    }

    @CallSuper
    protected final void zzj(int v) throws zzbc {
        zzadl zzadl0;
        int v10;
        zzcw.zzb(this.zzai);
        switch(v) {
            case 0xA0: {
                if(this.zzN == 2) {
                    Object object0 = this.zzh.get(this.zzT);
                    zzahk.zzd(((zzahk)object0));
                    if(this.zzY > 0L && "A_OPUS".equals(((zzahk)object0).zzb)) {
                        byte[] arr_b = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzY).array();
                        this.zzu.zzJ(arr_b, arr_b.length);
                    }
                    int v6 = 0;
                    for(int v5 = 0; v5 < this.zzR; ++v5) {
                        v6 += this.zzS[v5];
                    }
                    int v7 = 0;
                    while(v7 < this.zzR) {
                        long v8 = this.zzO + ((long)(((zzahk)object0).zze * v7 / 1000));
                        int v9 = this.zzV;
                        if(v7 == 0) {
                            if(!this.zzX) {
                                v9 |= 1;
                            }
                            v10 = 0;
                        }
                        else {
                            v10 = v7;
                        }
                        int v11 = this.zzS[v10];
                        int v12 = v6 - v11;
                        this.zzu(((zzahk)object0), v8, v9, v11, v12);
                        v7 = v10 + 1;
                        v6 = v12;
                    }
                    this.zzN = 0;
                    return;
                }
                break;
            }
            case 0xAE: {
                zzahk zzahk0 = this.zzB;
                zzcw.zzb(zzahk0);
                String s = zzahk0.zzb;
                if(s == null) {
                    throw zzbc.zza("CodecId is missing in TrackEntry element", null);
                }
                switch(s) {
                    case "A_AAC": 
                    case "A_AC3": 
                    case "A_DTS": 
                    case "A_DTS/EXPRESS": 
                    case "A_DTS/LOSSLESS": 
                    case "A_EAC3": 
                    case "A_FLAC": 
                    case "A_MPEG/L2": 
                    case "A_MPEG/L3": 
                    case "A_MS/ACM": 
                    case "A_OPUS": 
                    case "A_PCM/FLOAT/IEEE": 
                    case "A_PCM/INT/BIG": 
                    case "A_PCM/INT/LIT": 
                    case "A_TRUEHD": 
                    case "A_VORBIS": 
                    case "S_DVBSUB": 
                    case "S_HDMV/PGS": 
                    case "S_TEXT/ASS": 
                    case "S_TEXT/UTF8": 
                    case "S_TEXT/WEBVTT": 
                    case "S_VOBSUB": 
                    case "V_AV1": 
                    case "V_MPEG2": 
                    case "V_MPEG4/ISO/AP": 
                    case "V_MPEG4/ISO/ASP": 
                    case "V_MPEG4/ISO/AVC": 
                    case "V_MPEG4/ISO/SP": 
                    case "V_MPEGH/ISO/HEVC": 
                    case "V_MS/VFW/FOURCC": 
                    case "V_THEORA": 
                    case "V_VP8": 
                    case "V_VP9": {
                        zzahk0.zze(this.zzai, zzahk0.zzc);
                        this.zzh.put(zzahk0.zzc, zzahk0);
                    }
                }
                this.zzB = null;
                return;
            }
            case 0x4DBB: {
                int v13 = this.zzD;
                if(v13 == -1) {
                    throw zzbc.zza("Mandatory element SeekID or SeekPosition not found", null);
                }
                long v14 = this.zzE;
                if(v14 == -1L) {
                    throw zzbc.zza("Mandatory element SeekID or SeekPosition not found", null);
                }
                if(v13 == 0x1C53BB6B) {
                    this.zzG = v14;
                    return;
                }
                break;
            }
            case 0x6240: {
                this.zzt(0x6240);
                zzahk zzahk1 = this.zzB;
                if(zzahk1.zzg) {
                    if(zzahk1.zzi == null) {
                        throw zzbc.zza("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    zzahk1.zzk = new zzu(null, new zzt[]{new zzt(zzh.zza, null, "video/webm", this.zzB.zzi.zzb)});
                    return;
                }
                break;
            }
            case 0x6D80: {
                this.zzt(0x6D80);
                if(this.zzB.zzg && this.zzB.zzh != null) {
                    throw zzbc.zza("Combining encryption and compression is not supported", null);
                }
                break;
            }
            case 357149030: {
                if(this.zzy == 0x8000000000000001L) {
                    this.zzy = 1000000L;
                }
                long v15 = this.zzz;
                if(v15 != 0x8000000000000001L) {
                    this.zzA = this.zzr(v15);
                    return;
                }
                break;
            }
            case 0x1654AE6B: {
                if(this.zzh.size() == 0) {
                    throw zzbc.zza("No valid tracks were found", null);
                }
                this.zzai.zzD();
                return;
            }
            case 0x1C53BB6B: {
                if(!this.zzC) {
                    zzacq zzacq0 = this.zzai;
                    zzdp zzdp0 = this.zzJ;
                    zzdp zzdp1 = this.zzK;
                    if(this.zzx == -1L || this.zzA == 0x8000000000000001L || zzdp0 == null || zzdp0.zza() == 0 || zzdp1 == null || zzdp1.zza() != zzdp0.zza()) {
                        zzadl0 = new zzadl(this.zzA, 0L);
                    }
                    else {
                        int v2 = zzdp0.zza();
                        int[] arr_v = new int[v2];
                        long[] arr_v1 = new long[v2];
                        long[] arr_v2 = new long[v2];
                        long[] arr_v3 = new long[v2];
                        for(int v3 = 0; v3 < v2; ++v3) {
                            arr_v3[v3] = zzdp0.zzb(v3);
                            arr_v1[v3] = this.zzx + zzdp1.zzb(v3);
                        }
                        for(int v1 = 0; v1 < v2 - 1; ++v1) {
                            arr_v[v1] = (int)(arr_v1[v1 + 1] - arr_v1[v1]);
                            arr_v2[v1] = arr_v3[v1 + 1] - arr_v3[v1];
                        }
                        arr_v[v2 - 1] = (int)(this.zzx + this.zzw - arr_v1[v2 - 1]);
                        long v4 = this.zzA - arr_v3[v2 - 1];
                        arr_v2[v2 - 1] = v4;
                        if(v4 <= 0L) {
                            zzdo.zzf("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + v4);
                            arr_v = Arrays.copyOf(arr_v, v2 - 1);
                            arr_v1 = Arrays.copyOf(arr_v1, v2 - 1);
                            arr_v2 = Arrays.copyOf(arr_v2, v2 - 1);
                            arr_v3 = Arrays.copyOf(arr_v3, v2 - 1);
                        }
                        zzadl0 = new zzaca(arr_v, arr_v1, arr_v2, arr_v3);
                    }
                    zzacq0.zzO(zzadl0);
                    this.zzC = true;
                }
                this.zzJ = null;
                this.zzK = null;
            }
        }
    }

    @CallSuper
    protected final void zzk(int v, double f) throws zzbc {
        switch(v) {
            case 0xB5: {
                this.zzt(0xB5);
                this.zzB.zzQ = (int)f;
                return;
            }
            case 0x4489: {
                this.zzz = (long)f;
                return;
            }
            case 0x55D1: {
                this.zzt(0x55D1);
                this.zzB.zzD = (float)f;
                return;
            }
            case 21970: {
                this.zzt(21970);
                this.zzB.zzE = (float)f;
                return;
            }
            case 0x55D3: {
                this.zzt(0x55D3);
                this.zzB.zzF = (float)f;
                return;
            }
            case 0x55D4: {
                this.zzt(0x55D4);
                this.zzB.zzG = (float)f;
                return;
            }
            case 0x55D5: {
                this.zzt(0x55D5);
                this.zzB.zzH = (float)f;
                return;
            }
            case 0x55D6: {
                this.zzt(0x55D6);
                this.zzB.zzI = (float)f;
                return;
            }
            case 0x55D7: {
                this.zzt(0x55D7);
                this.zzB.zzJ = (float)f;
                return;
            }
            case 0x55D8: {
                this.zzt(0x55D8);
                this.zzB.zzK = (float)f;
                return;
            }
            case 0x55D9: {
                this.zzt(0x55D9);
                this.zzB.zzL = (float)f;
                return;
            }
            case 0x55DA: {
                this.zzt(0x55DA);
                this.zzB.zzM = (float)f;
                return;
            }
            case 30323: {
                this.zzt(30323);
                this.zzB.zzs = (float)f;
                return;
            }
            case 30324: {
                this.zzt(30324);
                this.zzB.zzt = (float)f;
                return;
            }
            case 30325: {
                this.zzt(30325);
                this.zzB.zzu = (float)f;
            }
        }
    }

    @CallSuper
    protected final void zzl(int v, long v1) throws zzbc {
        switch(v) {
            case 0x5031: {
                if(v1 != 0L) {
                    throw zzbc.zza(("ContentEncodingOrder " + v1 + " not supported"), null);
                }
                break;
            }
            case 20530: {
                if(v1 != 1L) {
                    throw zzbc.zza(("ContentEncodingScope " + v1 + " not supported"), null);
                }
                break;
            }
            default: {
                boolean z = false;
                switch(v) {
                    case 0x83: {
                        this.zzt(0x83);
                        this.zzB.zzd = (int)v1;
                        return;
                    }
                    case 0x88: {
                        if(v1 == 1L) {
                            z = true;
                        }
                        this.zzt(0x88);
                        this.zzB.zzV = z;
                        return;
                    }
                    case 0x9B: {
                        this.zzP = this.zzr(v1);
                        return;
                    }
                    case 0x9F: {
                        this.zzt(0x9F);
                        this.zzB.zzO = (int)v1;
                        return;
                    }
                    case 0xB0: {
                        this.zzt(0xB0);
                        this.zzB.zzl = (int)v1;
                        return;
                    }
                    case 0xB3: {
                        this.zzs(0xB3);
                        this.zzJ.zzc(this.zzr(v1));
                        return;
                    }
                    case 0xBA: {
                        this.zzt(0xBA);
                        this.zzB.zzm = (int)v1;
                        return;
                    }
                    case 0xD7: {
                        this.zzt(0xD7);
                        this.zzB.zzc = (int)v1;
                        return;
                    }
                    case 0xE7: {
                        this.zzI = this.zzr(v1);
                        return;
                    }
                    case 0xEE: {
                        this.zzW = (int)v1;
                        return;
                    }
                    case 0xF1: {
                        if(!this.zzL) {
                            this.zzs(0xF1);
                            this.zzK.zzc(v1);
                            this.zzL = true;
                            return;
                        }
                        break;
                    }
                    case 0xFB: {
                        this.zzX = true;
                        return;
                    }
                    case 0x41E7: {
                        this.zzt(0x41E7);
                        this.zzB.zzY = (int)v1;
                        return;
                    }
                    case 16980: {
                        if(v1 != 3L) {
                            throw zzbc.zza(("ContentCompAlgo " + v1 + " not supported"), null);
                        }
                        break;
                    }
                    case 17029: {
                        if(v1 < 1L || v1 > 2L) {
                            throw zzbc.zza(("DocTypeReadVersion " + v1 + " not supported"), null);
                        }
                        break;
                    }
                    case 0x42F7: {
                        if(v1 != 1L) {
                            throw zzbc.zza(("EBMLReadVersion " + v1 + " not supported"), null);
                        }
                        break;
                    }
                    case 18401: {
                        if(v1 != 5L) {
                            throw zzbc.zza(("ContentEncAlgo " + v1 + " not supported"), null);
                        }
                        break;
                    }
                    case 18408: {
                        if(v1 != 1L) {
                            throw zzbc.zza(("AESSettingsCipherMode " + v1 + " not supported"), null);
                        }
                        break;
                    }
                    case 21420: {
                        this.zzE = v1 + this.zzx;
                        return;
                    }
                    case 0x53B8: {
                        this.zzt(0x53B8);
                        switch(((int)v1)) {
                            case 0: {
                                this.zzB.zzw = 0;
                                return;
                            }
                            case 1: {
                                this.zzB.zzw = 2;
                                return;
                            }
                            case 3: {
                                this.zzB.zzw = 1;
                                return;
                            }
                        }
                        if(((int)v1) == 15) {
                            this.zzB.zzw = 3;
                            return;
                        }
                        break;
                    }
                    case 0x54B0: {
                        this.zzt(0x54B0);
                        this.zzB.zzo = (int)v1;
                        return;
                    }
                    case 0x54B2: {
                        this.zzt(0x54B2);
                        this.zzB.zzq = (int)v1;
                        return;
                    }
                    case 21690: {
                        this.zzt(21690);
                        this.zzB.zzp = (int)v1;
                        return;
                    }
                    case 21930: {
                        if(v1 == 1L) {
                            z = true;
                        }
                        this.zzt(21930);
                        this.zzB.zzU = z;
                        return;
                    }
                    case 0x55B2: {
                        this.zzt(0x55B2);
                        this.zzB.zzx = true;
                        this.zzB.zzn = (int)v1;
                        return;
                    }
                    case 0x55B9: {
                        this.zzt(0x55B9);
                        switch(((int)v1)) {
                            case 1: {
                                this.zzB.zzA = 2;
                                return;
                            }
                            case 2: {
                                this.zzB.zzA = 1;
                                return;
                            }
                            default: {
                                return;
                            }
                        }
                    }
                    case 0x55BA: {
                        this.zzt(0x55BA);
                        int v2 = zzk.zzb(((int)v1));
                        if(v2 != -1) {
                            this.zzB.zzz = v2;
                            return;
                        }
                        break;
                    }
                    case 0x55BB: {
                        this.zzt(0x55BB);
                        this.zzB.zzx = true;
                        int v3 = zzk.zza(((int)v1));
                        if(v3 != -1) {
                            this.zzB.zzy = v3;
                            return;
                        }
                        break;
                    }
                    case 0x55BC: {
                        this.zzt(0x55BC);
                        this.zzB.zzB = (int)v1;
                        return;
                    }
                    case 0x55BD: {
                        this.zzt(0x55BD);
                        this.zzB.zzC = (int)v1;
                        return;
                    }
                    case 0x55EE: {
                        this.zzt(0x55EE);
                        this.zzB.zzf = (int)v1;
                        return;
                    }
                    case 0x56AA: {
                        this.zzt(0x56AA);
                        this.zzB.zzR = v1;
                        return;
                    }
                    case 22203: {
                        this.zzt(22203);
                        this.zzB.zzS = v1;
                        return;
                    }
                    case 0x6264: {
                        this.zzt(0x6264);
                        this.zzB.zzP = (int)v1;
                        return;
                    }
                    case 30114: {
                        this.zzY = v1;
                        return;
                    }
                    case 30321: {
                        this.zzt(30321);
                        switch(((int)v1)) {
                            case 0: {
                                this.zzB.zzr = 0;
                                return;
                            }
                            case 1: {
                                this.zzB.zzr = 1;
                                return;
                            }
                            case 2: {
                                this.zzB.zzr = 2;
                                return;
                            }
                            case 3: {
                                this.zzB.zzr = 3;
                                return;
                            }
                            default: {
                                return;
                            }
                        }
                    }
                    case 2352003: {
                        this.zzt(2352003);
                        this.zzB.zze = (int)v1;
                        return;
                    }
                    case 2807729: {
                        this.zzy = v1;
                    }
                }
            }
        }
    }

    @CallSuper
    protected final void zzm(int v, long v1, long v2) throws zzbc {
        zzcw.zzb(this.zzai);
        switch(v) {
            case 0xA0: {
                this.zzX = false;
                this.zzY = 0L;
                return;
            }
            case 0xAE: {
                this.zzB = new zzahk();
                return;
            }
            case 0xBB: {
                this.zzL = false;
                return;
            }
            case 0x4DBB: {
                this.zzD = -1;
                this.zzE = -1L;
                return;
            }
            case 0x5035: {
                this.zzt(0x5035);
                this.zzB.zzg = true;
                return;
            }
            case 0x55D0: {
                this.zzt(0x55D0);
                this.zzB.zzx = true;
                return;
            }
            case 0x18538067: {
                if(this.zzx != -1L && this.zzx != v1) {
                    throw zzbc.zza("Multiple Segment elements not supported", null);
                }
                this.zzx = v1;
                this.zzw = v2;
                return;
            }
            case 0x1C53BB6B: {
                this.zzJ = new zzdp(0x20);
                this.zzK = new zzdp(0x20);
                return;
            }
            case 0x1F43B675: {
                if(!this.zzC) {
                    if(this.zzi && this.zzG != -1L) {
                        this.zzF = true;
                        return;
                    }
                    this.zzai.zzO(new zzadl(this.zzA, 0L));
                    this.zzC = true;
                }
            }
        }
    }

    @CallSuper
    protected final void zzn(int v, String s) throws zzbc {
        switch(v) {
            case 0x86: {
                this.zzt(0x86);
                this.zzB.zzb = s;
                return;
            }
            case 17026: {
                if(!"webm".equals(s) && !"matroska".equals(s)) {
                    throw zzbc.zza(("DocType " + s + " not supported"), null);
                }
                return;
            }
            case 0x536E: {
                this.zzt(0x536E);
                this.zzB.zza = s;
                return;
            }
            case 0x22B59C: {
                this.zzt(0x22B59C);
                this.zzB.zzZ = s;
            }
        }
    }

    @m({"#2.output"})
    private final int zzp(zzaco zzaco0, zzahk zzahk0, int v, boolean z) throws IOException {
        if("S_TEXT/UTF8".equals(zzahk0.zzb)) {
            this.zzx(zzaco0, zzahm.zza, v);
            int v1 = this.zzaa;
            this.zzw();
            return v1;
        }
        if("S_TEXT/ASS".equals(zzahk0.zzb)) {
            this.zzx(zzaco0, zzahm.zzc, v);
            int v2 = this.zzaa;
            this.zzw();
            return v2;
        }
        if("S_TEXT/WEBVTT".equals(zzahk0.zzb)) {
            this.zzx(zzaco0, zzahm.zzd, v);
            int v3 = this.zzaa;
            this.zzw();
            return v3;
        }
        zzadt zzadt0 = zzahk0.zzW;
        boolean z1 = true;
        if(!this.zzac) {
            if(zzahk0.zzg) {
                this.zzV &= 0xBFFFFFFF;
                int v4 = 0x80;
                if(!this.zzad) {
                    zzaco0.zzi(this.zzn.zzN(), 0, 1);
                    ++this.zzZ;
                    if((this.zzn.zzN()[0] & 0x80) == 0x80) {
                        throw zzbc.zza("Extension bit is set in signal byte", null);
                    }
                    this.zzag = this.zzn.zzN()[0];
                    this.zzad = true;
                }
                int v5 = this.zzag;
                if((v5 & 1) == 1) {
                    this.zzV |= 0x40000000;
                    if(!this.zzah) {
                        zzaco0.zzi(this.zzs.zzN(), 0, 8);
                        this.zzZ += 8;
                        this.zzah = true;
                        zzdy zzdy0 = this.zzn;
                        if((v5 & 2) != 2) {
                            v4 = 0;
                        }
                        zzdy0.zzN()[0] = (byte)(v4 | 8);
                        this.zzn.zzL(0);
                        zzadt0.zzs(this.zzn, 1, 1);
                        ++this.zzaa;
                        this.zzs.zzL(0);
                        zzadt0.zzs(this.zzs, 8, 1);
                        this.zzaa += 8;
                    }
                    if((v5 & 2) == 2) {
                        if(!this.zzae) {
                            zzaco0.zzi(this.zzn.zzN(), 0, 1);
                            ++this.zzZ;
                            this.zzn.zzL(0);
                            this.zzaf = this.zzn.zzm();
                            this.zzae = true;
                        }
                        int v6 = this.zzaf * 4;
                        this.zzn.zzI(v6);
                        zzaco0.zzi(this.zzn.zzN(), 0, v6);
                        this.zzZ += v6;
                        int v7 = (this.zzaf >> 1) + 1;
                        int v8 = v7 * 6 + 2;
                        if(this.zzv == null || this.zzv.capacity() < v8) {
                            this.zzv = ByteBuffer.allocate(v8);
                        }
                        this.zzv.position(0);
                        this.zzv.putShort(((short)v7));
                        int v9 = 0;
                        int v10;
                        for(v10 = 0; true; v10 = v12) {
                            int v11 = this.zzaf;
                            if(v9 >= v11) {
                                break;
                            }
                            int v12 = this.zzn.zzp();
                            int v13 = v12 - v10;
                            if(v9 % 2 == 0) {
                                this.zzv.putShort(((short)v13));
                            }
                            else {
                                this.zzv.putInt(v13);
                            }
                            ++v9;
                        }
                        int v14 = v - this.zzZ - v10;
                        if((v11 & 1) == 1) {
                            this.zzv.putInt(v14);
                        }
                        else {
                            this.zzv.putShort(((short)v14));
                            this.zzv.putInt(0);
                        }
                        byte[] arr_b = this.zzv.array();
                        this.zzt.zzJ(arr_b, v8);
                        zzadt0.zzs(this.zzt, v8, 1);
                        this.zzaa += v8;
                    }
                }
            }
            else {
                byte[] arr_b1 = zzahk0.zzh;
                if(arr_b1 != null) {
                    this.zzq.zzJ(arr_b1, arr_b1.length);
                }
            }
            if(!"A_OPUS".equals(zzahk0.zzb)) {
                if(zzahk0.zzf > 0) {
                label_94:
                    this.zzV |= 0x10000000;
                    this.zzu.zzI(0);
                    int v15 = this.zzq.zze() + v - this.zzZ;
                    this.zzn.zzI(4);
                    this.zzn.zzN()[0] = (byte)(v15 >> 24 & 0xFF);
                    this.zzn.zzN()[1] = (byte)(v15 >> 16 & 0xFF);
                    this.zzn.zzN()[2] = (byte)(v15 >> 8 & 0xFF);
                    this.zzn.zzN()[3] = (byte)(v15 & 0xFF);
                    zzadt0.zzs(this.zzn, 4, 2);
                    this.zzaa += 4;
                }
            }
            else if(z) {
                goto label_94;
            }
            this.zzac = true;
        }
        int v16 = v + this.zzq.zze();
        if("V_MPEG4/ISO/AVC".equals(zzahk0.zzb) || "V_MPEGH/ISO/HEVC".equals(zzahk0.zzb)) {
            byte[] arr_b2 = this.zzm.zzN();
            arr_b2[0] = 0;
            arr_b2[1] = 0;
            arr_b2[2] = 0;
            int v19 = zzahk0.zzX;
            while(this.zzZ < v16) {
                int v20 = this.zzab;
                if(v20 == 0) {
                    int v21 = Math.min(v19, this.zzq.zzb());
                    zzaco0.zzi(arr_b2, 4 - v19 + v21, v19 - v21);
                    if(v21 > 0) {
                        this.zzq.zzH(arr_b2, 4 - v19, v21);
                    }
                    this.zzZ += v19;
                    this.zzm.zzL(0);
                    this.zzab = this.zzm.zzp();
                    this.zzl.zzL(0);
                    zzadt0.zzr(this.zzl, 4);
                    this.zzaa += 4;
                }
                else {
                    int v22 = this.zzq(zzaco0, zzadt0, v20);
                    this.zzZ += v22;
                    this.zzaa += v22;
                    this.zzab -= v22;
                }
            }
        }
        else {
            if(zzahk0.zzT != null) {
                if(this.zzq.zze() != 0) {
                    z1 = false;
                }
                zzcw.zzf(z1);
                zzahk0.zzT.zzd(zzaco0);
            }
            int v17;
            while((v17 = this.zzZ) < v16) {
                int v18 = this.zzq(zzaco0, zzadt0, v16 - v17);
                this.zzZ += v18;
                this.zzaa += v18;
            }
        }
        if("A_VORBIS".equals(zzahk0.zzb)) {
            this.zzo.zzL(0);
            zzadt0.zzr(this.zzo, 4);
            this.zzaa += 4;
        }
        int v23 = this.zzaa;
        this.zzw();
        return v23;
    }

    private final int zzq(zzaco zzaco0, zzadt zzadt0, int v) throws IOException {
        int v1 = this.zzq.zzb();
        if(v1 > 0) {
            int v2 = Math.min(v, v1);
            zzadt0.zzr(this.zzq, v2);
            return v2;
        }
        return zzadt0.zzf(zzaco0, v, false);
    }

    private final long zzr(long v) throws zzbc {
        long v1 = this.zzy;
        if(v1 == 0x8000000000000001L) {
            throw zzbc.zza("Can\'t scale timecode prior to timecodeScale being set.", null);
        }
        return zzei.zzu(v, v1, 1000L, RoundingMode.DOWN);
    }

    @d({"cueTimesUs", "cueClusterPositions"})
    private final void zzs(int v) throws zzbc {
        if(this.zzJ == null || this.zzK == null) {
            throw zzbc.zza(("Element " + v + " must be in a Cues"), null);
        }
    }

    @d({"currentTrack"})
    private final void zzt(int v) throws zzbc {
        if(this.zzB == null) {
            throw zzbc.zza(("Element " + v + " must be in a TrackEntry"), null);
        }
    }

    @m({"#1.output"})
    private final void zzu(zzahk zzahk0, long v, int v1, int v2, int v3) {
        int v6;
        byte[] arr_b1;
        int v4;
        zzadu zzadu0 = zzahk0.zzT;
        if(zzadu0 == null) {
            if(!"S_TEXT/UTF8".equals(zzahk0.zzb) && !"S_TEXT/ASS".equals(zzahk0.zzb) && !"S_TEXT/WEBVTT".equals(zzahk0.zzb)) {
                v4 = v2;
            }
            else if(this.zzR > 1) {
                zzdo.zzf("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                v4 = v2;
            }
            else {
                long v5 = this.zzP;
                if(v5 == 0x8000000000000001L) {
                    zzdo.zzf("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    v4 = v2;
                }
                else {
                    String s = zzahk0.zzb;
                    byte[] arr_b = this.zzr.zzN();
                    switch(s) {
                        case "S_TEXT/ASS": {
                            arr_b1 = zzahm.zzy(v5, "%01d:%02d:%02d:%02d", 10000L);
                            v6 = 21;
                            break;
                        }
                        case "S_TEXT/UTF8": {
                            arr_b1 = zzahm.zzy(v5, "%02d:%02d:%02d,%03d", 1000L);
                            v6 = 19;
                            break;
                        }
                        case "S_TEXT/WEBVTT": {
                            arr_b1 = zzahm.zzy(v5, "%02d:%02d:%02d.%03d", 1000L);
                            v6 = 25;
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException();
                        }
                    }
                    System.arraycopy(arr_b1, 0, arr_b, v6, arr_b1.length);
                    for(int v7 = this.zzr.zzd(); v7 < this.zzr.zze(); ++v7) {
                        if(this.zzr.zzN()[v7] == 0) {
                            this.zzr.zzK(v7);
                            break;
                        }
                    }
                    zzahk0.zzW.zzr(this.zzr, this.zzr.zze());
                    v4 = v2 + this.zzr.zze();
                }
            }
            if((v1 & 0x10000000) != 0) {
                if(this.zzR > 1) {
                    this.zzu.zzI(0);
                }
                else {
                    int v8 = this.zzu.zze();
                    zzahk0.zzW.zzs(this.zzu, v8, 2);
                    v4 += v8;
                }
            }
            zzahk0.zzW.zzt(v, v1, v4, v3, zzahk0.zzi);
        }
        else {
            zzadu0.zzc(zzahk0.zzW, v, v1, v2, v3, zzahk0.zzi);
        }
        this.zzM = true;
    }

    private final void zzv(zzaco zzaco0, int v) throws IOException {
        if(this.zzn.zze() >= v) {
            return;
        }
        if(this.zzn.zzc() < v) {
            int v1 = this.zzn.zzc();
            this.zzn.zzF(Math.max(v1 + v1, v));
        }
        zzaco0.zzi(this.zzn.zzN(), this.zzn.zze(), v - this.zzn.zze());
        this.zzn.zzK(v);
    }

    private final void zzw() {
        this.zzZ = 0;
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = false;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = 0;
        this.zzag = 0;
        this.zzah = false;
        this.zzq.zzI(0);
    }

    private final void zzx(zzaco zzaco0, byte[] arr_b, int v) throws IOException {
        int v1 = arr_b.length + v;
        if(this.zzr.zzc() < v1) {
            byte[] arr_b1 = Arrays.copyOf(arr_b, v1 + v);
            this.zzr.zzJ(arr_b1, arr_b1.length);
        }
        else {
            System.arraycopy(arr_b, 0, this.zzr.zzN(), 0, arr_b.length);
        }
        zzaco0.zzi(this.zzr.zzN(), arr_b.length, v);
        this.zzr.zzL(0);
        this.zzr.zzK(v1);
    }

    private static byte[] zzy(long v, String s, long v1) {
        zzcw.zzd(v != 0x8000000000000001L);
        long v2 = v - ((long)(((int)(v / 3600000000L)))) * 3600000000L;
        long v3 = v2 - ((long)(((int)(v2 / 60000000L)))) * 60000000L;
        return String.format(Locale.US, s, ((int)(v / 3600000000L)), ((int)(v2 / 60000000L)), ((int)(v3 / 1000000L)), ((int)((v3 - ((long)(((int)(v3 / 1000000L)))) * 1000000L) / v1))).getBytes(StandardCharsets.UTF_8);
    }

    private static int[] zzz(@Nullable int[] arr_v, int v) {
        if(arr_v == null) {
            return new int[v];
        }
        return arr_v.length < v ? new int[Math.max(arr_v.length + arr_v.length, v)] : arr_v;
    }
}

