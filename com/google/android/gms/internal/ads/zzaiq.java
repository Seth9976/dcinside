package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import j..util.DesugarCollections;
import j..util.Objects;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public final class zzaiq implements zzacn {
    private long zzA;
    @Nullable
    private zzaip zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private zzacq zzH;
    private zzadt[] zzI;
    private zzadt[] zzJ;
    private boolean zzK;
    private static final byte[] zza;
    private static final zzab zzb;
    private final zzakd zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzdy zzg;
    private final zzdy zzh;
    private final zzdy zzi;
    private final byte[] zzj;
    private final zzdy zzk;
    private final zzafl zzl;
    private final zzdy zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzfo zzp;
    private zzfxn zzq;
    private int zzr;
    private int zzs;
    private long zzt;
    private int zzu;
    @Nullable
    private zzdy zzv;
    private long zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    static {
        zzaiq.zza = new byte[]{-94, 57, 0x4F, 82, 90, -101, 0x4F, 20, -94, 68, 108, 66, 0x7C, 100, (byte)0x8D, -12};
        zzz zzz0 = new zzz();
        zzz0.zzaa("application/x-emsg");
        zzaiq.zzb = zzz0.zzag();
    }

    @Deprecated
    public zzaiq() {
        this(zzakd.zza, 0x20, null, null, zzfxn.zzn(), null);
    }

    public zzaiq(zzakd zzakd0, int v, @Nullable zzef zzef0, @Nullable zzajb zzajb0, List list0, @Nullable zzadt zzadt0) {
        this.zzc = zzakd0;
        this.zzd = v;
        this.zze = DesugarCollections.unmodifiableList(list0);
        this.zzl = new zzafl();
        this.zzm = new zzdy(16);
        this.zzg = new zzdy(zzfk.zza);
        this.zzh = new zzdy(5);
        this.zzi = new zzdy();
        byte[] arr_b = new byte[16];
        this.zzj = arr_b;
        this.zzk = new zzdy(arr_b);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzq = zzfxn.zzn();
        this.zzz = 0x8000000000000001L;
        this.zzy = 0x8000000000000001L;
        this.zzA = 0x8000000000000001L;
        this.zzH = zzacq.zza;
        this.zzI = new zzadt[0];
        this.zzJ = new zzadt[0];
        this.zzp = new zzfo((long v, zzdy zzdy0) -> zzabz.zza(v, zzdy0, this.zzJ));
    }

    // 检测为 Lambda 实现
    final void zza(long v, zzdy zzdy0) [...]

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzaco0, zzadj zzadj0) throws IOException {
        int v18;
        boolean z;
        int v9;
        int v67;
        zzaip zzaip3;
        long v55;
        long v54;
        String s4;
        String s3;
        long v53;
        long v51;
        long v38;
        long v37;
    alab1:
        while(true) {
            long v = 0x7FFFFFFFFFFFFFFFL;
            switch(this.zzr) {
                case 0: {
                    if(this.zzu == 0) {
                        if(!zzaco0.zzn(this.zzm.zzN(), 0, 8, true)) {
                            this.zzp.zzc();
                            return -1;
                        }
                        this.zzu = 8;
                        this.zzm.zzL(0);
                        this.zzt = this.zzm.zzu();
                        this.zzs = this.zzm.zzg();
                    }
                    long v24 = this.zzt;
                    if(v24 == 1L) {
                        zzaco0.zzi(this.zzm.zzN(), 8, 8);
                        this.zzu += 8;
                        this.zzt = this.zzm.zzw();
                    }
                    else if(v24 == 0L) {
                        long v25 = zzaco0.zzd();
                        if(v25 == -1L) {
                            v25 = this.zzn.isEmpty() ? -1L : ((zzen)this.zzn.peek()).zza;
                        }
                        if(v25 != -1L) {
                            this.zzt = v25 - zzaco0.zzf() + ((long)this.zzu);
                        }
                    }
                    long v26 = (long)this.zzu;
                    if(this.zzt >= v26) {
                        long v27 = zzaco0.zzf() - v26;
                        if((this.zzs == 1835295092 || this.zzs == 0x6D6F6F66) && !this.zzK) {
                            this.zzH.zzO(new zzadl(this.zzz, v27));
                            this.zzK = true;
                        }
                        if(this.zzs == 0x6D6F6F66) {
                            int v28 = this.zzf.size();
                            for(int v29 = 0; v29 < v28; ++v29) {
                                zzajd zzajd0 = ((zzaip)this.zzf.valueAt(v29)).zzb;
                                zzajd0.zzc = v27;
                                zzajd0.zzb = v27;
                            }
                        }
                        int v30 = this.zzs;
                        switch(v30) {
                            case 1835295092: {
                                this.zzB = null;
                                this.zzw = v27 + this.zzt;
                                this.zzr = 2;
                                continue;
                            }
                            case 1701082227: 
                            case 0x6D646961: 
                            case 1835626086: 
                            case 0x6D6F6F66: 
                            case 0x6D6F6F76: 
                            case 0x6D766578: 
                            case 1937007212: 
                            case 1953653094: 
                            case 1953653099: {
                                long v31 = zzaco0.zzf() + this.zzt - 8L;
                                zzen zzen0 = new zzen(v30, v31);
                                this.zzn.push(zzen0);
                                if(this.zzt == ((long)this.zzu)) {
                                    this.zzl(v31);
                                }
                                else {
                                    this.zzj();
                                }
                                continue;
                            }
                            case 0x636F3634: 
                            case 0x63747473: 
                            case 1701606260: 
                            case 1701671783: 
                            case 0x68646C72: 
                            case 0x6D646864: 
                            case 1835362404: 
                            case 0x6D766864: 
                            case 0x70737368: 
                            case 0x7361696F: 
                            case 0x7361697A: 
                            case 0x73626770: 
                            case 1936027235: 
                            case 0x73677064: 
                            case 1936286840: 
                            case 1937007471: 
                            case 1937011555: 
                            case 1937011556: 
                            case 1937011571: 
                            case 1937011578: 
                            case 1937011827: 
                            case 1937013298: 
                            case 0x74666474: 
                            case 0x74666864: 
                            case 0x746B6864: 
                            case 0x74726578: 
                            case 0x7472756E: 
                            case 1970628964: {
                                if(this.zzu != 8) {
                                    throw zzbc.zzc("Leaf atom defines extended atom size (unsupported).");
                                }
                                if(this.zzt > 0x7FFFFFFFL) {
                                    throw zzbc.zzc("Leaf atom with length > 2147483647 (unsupported).");
                                }
                                zzdy zzdy1 = new zzdy(((int)this.zzt));
                                System.arraycopy(this.zzm.zzN(), 0, zzdy1.zzN(), 0, 8);
                                this.zzv = zzdy1;
                                this.zzr = 1;
                                continue;
                            }
                            default: {
                                if(this.zzt > 0x7FFFFFFFL) {
                                    throw zzbc.zzc("Skipping atom with length > 2147483647 (unsupported).");
                                }
                                this.zzv = null;
                                this.zzr = 1;
                                continue;
                            }
                        }
                    }
                    throw zzbc.zzc("Atom size less than header length (unsupported).");
                }
                case 1: {
                    int v32 = ((int)this.zzt) - this.zzu;
                    zzdy zzdy2 = this.zzv;
                    if(zzdy2 == null) {
                        zzaco0.zzk(v32);
                    }
                    else {
                        zzaco0.zzi(zzdy2.zzN(), 8, v32);
                        zzeo zzeo0 = new zzeo(this.zzs, zzdy2);
                        long v33 = zzaco0.zzf();
                        if(this.zzn.isEmpty()) {
                            int v34 = zzeo0.zzd;
                            if(v34 == 1936286840) {
                                zzdy zzdy3 = zzeo0.zza;
                                zzdy3.zzL(8);
                                int v35 = zzaik.zza(zzdy3.zzg());
                                zzdy3.zzM(4);
                                long v36 = zzdy3.zzu();
                                if(v35 == 0) {
                                    v37 = zzdy3.zzu();
                                    v38 = zzdy3.zzu();
                                }
                                else {
                                    v37 = zzdy3.zzw();
                                    v38 = zzdy3.zzw();
                                }
                                long v39 = v33 + v38;
                                long v40 = zzei.zzu(v37, 1000000L, v36, RoundingMode.DOWN);
                                zzdy3.zzM(2);
                                int v41 = zzdy3.zzq();
                                int[] arr_v = new int[v41];
                                long[] arr_v1 = new long[v41];
                                long[] arr_v2 = new long[v41];
                                long[] arr_v3 = new long[v41];
                                long v42 = v40;
                                int v43 = 0;
                                while(v43 < v41) {
                                    int v44 = zzdy3.zzg();
                                    if((v44 & 0x80000000) != 0) {
                                        throw zzbc.zza("Unhandled indirect reference", null);
                                    }
                                    long v45 = zzdy3.zzu();
                                    arr_v[v43] = v44 & 0x7FFFFFFF;
                                    arr_v1[v43] = v39;
                                    arr_v3[v43] = v42;
                                    long v46 = v37 + v45;
                                    long v47 = zzei.zzu(v46, 1000000L, v36, RoundingMode.DOWN);
                                    arr_v2[v43] = v47 - arr_v3[v43];
                                    zzdy3.zzM(4);
                                    v39 += (long)arr_v[v43];
                                    v37 = v46;
                                    ++v43;
                                    v42 = v47;
                                }
                                Pair pair0 = Pair.create(v40, new zzaca(arr_v, arr_v1, arr_v2, arr_v3));
                                this.zzA = (long)(((Long)pair0.first));
                                this.zzH.zzO(((zzadm)pair0.second));
                                this.zzK = true;
                            }
                            else if(v34 == 1701671783) {
                                zzdy zzdy4 = zzeo0.zza;
                                if(this.zzI.length != 0) {
                                    zzdy4.zzL(8);
                                    int v48 = zzaik.zza(zzdy4.zzg());
                                    switch(v48) {
                                        case 0: {
                                            String s1 = zzdy4.zzy('\u0000');
                                            s1.getClass();
                                            String s2 = zzdy4.zzy('\u0000');
                                            s2.getClass();
                                            long v49 = zzdy4.zzu();
                                            long v50 = zzdy4.zzu();
                                            RoundingMode roundingMode0 = RoundingMode.DOWN;
                                            v51 = zzei.zzu(v50, 1000000L, v49, roundingMode0);
                                            long v52 = this.zzA == 0x8000000000000001L ? 0x8000000000000001L : this.zzA + v51;
                                            v53 = zzei.zzu(zzdy4.zzu(), 1000L, v49, roundingMode0);
                                            s3 = s1;
                                            s4 = s2;
                                            v54 = zzdy4.zzu();
                                            v55 = v52;
                                            break;
                                        }
                                        case 1: {
                                            long v56 = zzdy4.zzu();
                                            long v57 = zzdy4.zzw();
                                            RoundingMode roundingMode1 = RoundingMode.DOWN;
                                            long v58 = zzei.zzu(v57, 1000000L, v56, roundingMode1);
                                            long v59 = zzei.zzu(zzdy4.zzu(), 1000L, v56, roundingMode1);
                                            long v60 = zzdy4.zzu();
                                            String s5 = zzdy4.zzy('\u0000');
                                            s5.getClass();
                                            String s6 = zzdy4.zzy('\u0000');
                                            s6.getClass();
                                            v53 = v59;
                                            v54 = v60;
                                            s3 = s5;
                                            s4 = s6;
                                            v55 = v58;
                                            v51 = 0x8000000000000001L;
                                            break;
                                        }
                                        default: {
                                            zzdo.zzf("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + v48);
                                            goto label_332;
                                        }
                                    }
                                    byte[] arr_b1 = new byte[zzdy4.zzb()];
                                    zzdy4.zzH(arr_b1, 0, zzdy4.zzb());
                                    zzafk zzafk0 = new zzafk(s3, s4, v53, v54, arr_b1);
                                    zzdy zzdy5 = new zzdy(this.zzl.zza(zzafk0));
                                    int v61 = zzdy5.zzb();
                                    zzadt[] arr_zzadt1 = this.zzI;
                                    for(int v62 = 0; v62 < arr_zzadt1.length; ++v62) {
                                        zzadt zzadt1 = arr_zzadt1[v62];
                                        zzdy5.zzL(0);
                                        zzadt1.zzr(zzdy5, v61);
                                    }
                                    if(v55 == 0x8000000000000001L) {
                                        zzaio zzaio1 = new zzaio(v51, true, v61);
                                        this.zzo.addLast(zzaio1);
                                        this.zzx += v61;
                                    }
                                    else if(this.zzo.isEmpty()) {
                                        zzadt[] arr_zzadt2 = this.zzI;
                                        for(int v63 = 0; v63 < arr_zzadt2.length; ++v63) {
                                            arr_zzadt2[v63].zzt(v55, 1, v61, 0, null);
                                        }
                                    }
                                    else {
                                        zzaio zzaio2 = new zzaio(v55, false, v61);
                                        this.zzo.addLast(zzaio2);
                                        this.zzx += v61;
                                    }
                                }
                            }
                        }
                        else {
                            ((zzen)this.zzn.peek()).zzd(zzeo0);
                        }
                    }
                label_332:
                    this.zzl(zzaco0.zzf());
                    continue;
                }
                case 2: {
                    int v64 = this.zzf.size();
                    zzaip3 = null;
                    for(int v65 = 0; v65 < v64; ++v65) {
                        zzajd zzajd1 = ((zzaip)this.zzf.valueAt(v65)).zzb;
                        if(zzajd1.zzo) {
                            long v66 = zzajd1.zzc;
                            if(v66 < v) {
                                zzaip3 = (zzaip)this.zzf.valueAt(v65);
                                v = v66;
                            }
                        }
                    }
                    if(zzaip3 == null) {
                        this.zzr = 3;
                        continue;
                    }
                    v67 = (int)(v - zzaco0.zzf());
                    if(v67 >= 0) {
                        break;
                    }
                    break alab1;
                }
                default: {
                    zzaip zzaip0 = this.zzB;
                    if(zzaip0 == null) {
                        SparseArray sparseArray0 = this.zzf;
                        int v1 = sparseArray0.size();
                        long v2 = 0x7FFFFFFFFFFFFFFFL;
                        zzaip zzaip1 = null;
                        for(int v3 = 0; v3 < v1; ++v3) {
                            zzaip zzaip2 = (zzaip)sparseArray0.valueAt(v3);
                            if((zzaip2.zzl || zzaip2.zzf != zzaip2.zzd.zzb) && (!zzaip2.zzl || zzaip2.zzh != zzaip2.zzb.zzd)) {
                                long v4 = zzaip2.zzd();
                                if(v4 < v2) {
                                    zzaip1 = zzaip2;
                                    v2 = v4;
                                }
                            }
                        }
                        if(zzaip1 == null) {
                            int v5 = (int)(this.zzw - zzaco0.zzf());
                            if(v5 < 0) {
                                throw zzbc.zza("Offset to end of mdat was negative.", null);
                            }
                            zzaco0.zzk(v5);
                            this.zzj();
                            continue;
                        }
                        else {
                            int v6 = (int)(zzaip1.zzd() - zzaco0.zzf());
                            if(v6 < 0) {
                                zzdo.zzf("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                v6 = 0;
                            }
                            zzaco0.zzk(v6);
                            this.zzB = zzaip1;
                            zzaip0 = zzaip1;
                        }
                    }
                    if(this.zzr == 3) {
                        int v7 = zzaip0.zzb();
                        this.zzC = v7;
                        this.zzF = true;
                        if(zzaip0.zzf < zzaip0.zzi) {
                            zzaco0.zzk(v7);
                            zzajc zzajc0 = zzaip0.zzf();
                            if(zzajc0 != null) {
                                zzdy zzdy0 = zzaip0.zzb.zzn;
                                int v8 = zzajc0.zzd;
                                if(v8 != 0) {
                                    zzdy0.zzM(v8);
                                }
                                if(zzaip0.zzb.zzb(zzaip0.zzf)) {
                                    zzdy0.zzM(zzdy0.zzq() * 6);
                                }
                            }
                            if(!zzaip0.zzk()) {
                                this.zzB = null;
                            }
                        }
                        else {
                            if(zzaip0.zzd.zza.zzh == 1) {
                                this.zzC = v7 - 8;
                                zzaco0.zzk(8);
                            }
                            if("audio/ac4".equals(zzaip0.zzd.zza.zzg.zzo)) {
                                this.zzD = zzaip0.zzc(this.zzC, 7);
                                zzabq.zzb(this.zzC, this.zzk);
                                zzaip0.zza.zzr(this.zzk, 7);
                                v9 = this.zzD + 7;
                            }
                            else {
                                v9 = zzaip0.zzc(this.zzC, 0);
                            }
                            this.zzD = v9;
                            this.zzC += v9;
                            this.zzr = 4;
                            this.zzE = 0;
                            goto label_64;
                        }
                    }
                    else {
                    label_64:
                        zzajb zzajb0 = zzaip0.zzd.zza;
                        zzadt zzadt0 = zzaip0.zza;
                        long v10 = zzaip0.zze();
                        int v11 = zzajb0.zzk;
                        if(v11 == 0) {
                            while(true) {
                                int v12 = this.zzD;
                                int v13 = this.zzC;
                                if(v12 >= v13) {
                                    break;
                                }
                                int v14 = zzadt0.zzf(zzaco0, v13 - v12, false);
                                this.zzD += v14;
                            }
                        }
                        else {
                            byte[] arr_b = this.zzh.zzN();
                            arr_b[0] = 0;
                            arr_b[1] = 0;
                            arr_b[2] = 0;
                            while(this.zzD < this.zzC) {
                                int v15 = this.zzE;
                                if(v15 == 0) {
                                    zzaco0.zzi(arr_b, 4 - v11, v11 + 1);
                                    this.zzh.zzL(0);
                                    int v16 = this.zzh.zzg();
                                    if(v16 <= 0) {
                                        throw zzbc.zza("Invalid NAL length", null);
                                    }
                                    this.zzE = v16 - 1;
                                    this.zzg.zzL(0);
                                    zzadt0.zzr(this.zzg, 4);
                                    zzadt0.zzr(this.zzh, 1);
                                    if(this.zzJ.length > 0) {
                                        int v17 = arr_b[4];
                                        String s = zzajb0.zzg.zzo;
                                        if("video/avc".equals(s) && (v17 & 0x1F) == 6) {
                                            z = true;
                                        }
                                        else if("video/hevc".equals(s) && (v17 & 0x7E) >> 1 == 39) {
                                            z = true;
                                        }
                                    }
                                    else {
                                        z = false;
                                    }
                                    this.zzG = z;
                                    this.zzD += 5;
                                    this.zzC += 4 - v11;
                                    if(this.zzF || !Objects.equals(zzaip0.zzd.zza.zzg.zzo, "video/avc") || !zzfk.zzi(arr_b[4])) {
                                        continue;
                                    }
                                    this.zzF = true;
                                }
                                else {
                                    if(this.zzG) {
                                        this.zzi.zzI(v15);
                                        zzaco0.zzi(this.zzi.zzN(), 0, this.zzE);
                                        zzadt0.zzr(this.zzi, this.zzE);
                                        v18 = this.zzE;
                                        int v19 = zzfk.zzb(this.zzi.zzN(), this.zzi.zze());
                                        this.zzi.zzL(((int)"video/hevc".equals(zzajb0.zzg.zzo)));
                                        this.zzi.zzK(v19);
                                        int v20 = zzajb0.zzg.zzq;
                                        if(v20 != -1 && v20 != this.zzp.zza()) {
                                            this.zzp.zzd(zzajb0.zzg.zzq);
                                        }
                                        this.zzp.zzb(v10, this.zzi);
                                        if((zzaip0.zza() & 5) != 0) {
                                            this.zzp.zzc();
                                        }
                                    }
                                    else {
                                        v18 = zzadt0.zzf(zzaco0, v15, false);
                                    }
                                    this.zzD += v18;
                                    this.zzE -= v18;
                                }
                            }
                        }
                        int v21 = zzaip0.zza();
                        zzajc zzajc1 = zzaip0.zzf();
                        zzadt0.zzt(v10, v21, this.zzC, 0, (zzajc1 == null ? null : zzajc1.zzc));
                        while(!this.zzo.isEmpty()) {
                            zzaio zzaio0 = (zzaio)this.zzo.removeFirst();
                            this.zzx -= zzaio0.zzc;
                            long v22 = zzaio0.zzb ? zzaio0.zza + v10 : zzaio0.zza;
                            zzadt[] arr_zzadt = this.zzI;
                            for(int v23 = 0; v23 < arr_zzadt.length; ++v23) {
                                arr_zzadt[v23].zzt(v22, 1, zzaio0.zzc, this.zzx, null);
                            }
                        }
                        if(!zzaip0.zzk()) {
                            this.zzB = null;
                        }
                    }
                    this.zzr = 3;
                    return 0;
                }
            }
            zzaco0.zzk(v67);
            zzaco0.zzi(zzaip3.zzb.zzn.zzN(), 0, zzaip3.zzb.zzn.zze());
            zzaip3.zzb.zzn.zzL(0);
            zzaip3.zzb.zzo = false;
        }
        throw zzbc.zza("Offset to encryption data was negative.", null);
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final zzacn zzc() {
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final List zzd() {
        return this.zzq;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final void zze(zzacq zzacq0) {
        int v2;
        if((this.zzd & 0x20) == 0) {
            zzacq0 = new zzakg(zzacq0, this.zzc);
        }
        this.zzH = zzacq0;
        this.zzj();
        zzadt[] arr_zzadt = new zzadt[2];
        this.zzI = arr_zzadt;
        int v = 100;
        int v1 = 0;
        if((this.zzd & 4) == 0) {
            v2 = 0;
        }
        else {
            arr_zzadt[0] = this.zzH.zzw(100, 5);
            v2 = 1;
            v = 101;
        }
        zzadt[] arr_zzadt1 = (zzadt[])zzei.zzN(this.zzI, v2);
        this.zzI = arr_zzadt1;
        for(int v3 = 0; v3 < arr_zzadt1.length; ++v3) {
            arr_zzadt1[v3].zzm(zzaiq.zzb);
        }
        this.zzJ = new zzadt[this.zze.size()];
        while(v1 < this.zzJ.length) {
            zzadt zzadt0 = this.zzH.zzw(v, 3);
            zzadt0.zzm(((zzab)this.zze.get(v1)));
            this.zzJ[v1] = zzadt0;
            ++v1;
            ++v;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long v, long v1) {
        int v2 = this.zzf.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            ((zzaip)this.zzf.valueAt(v3)).zzi();
        }
        this.zzo.clear();
        this.zzx = 0;
        this.zzp.zzc();
        this.zzy = v1;
        this.zzn.clear();
        this.zzj();
    }

    private static int zzg(int v) throws zzbc {
        if(v < 0) {
            throw zzbc.zza(("Unexpected negative value: " + v), null);
        }
        return v;
    }

    @Nullable
    private static zzu zzh(List list0) {
        zzaix zzaix0;
        List list2;
        int v8;
        UUID[] arr_uUID;
        int v = list0.size();
        int v1 = 0;
        List list1 = null;
        while(v1 < v) {
            zzeo zzeo0 = (zzeo)list0.get(v1);
            if(zzeo0.zzd == 0x70737368) {
                if(list1 == null) {
                    list1 = new ArrayList();
                }
                byte[] arr_b = zzeo0.zza.zzN();
                zzdy zzdy0 = new zzdy(arr_b);
                if(zzdy0.zze() >= 0x20) {
                    zzdy0.zzL(0);
                    int v2 = zzdy0.zzb();
                    int v3 = zzdy0.zzg();
                    if(v3 == v2) {
                        int v4 = zzdy0.zzg();
                        if(v4 == 0x70737368) {
                            int v5 = zzaik.zza(zzdy0.zzg());
                            if(v5 > 1) {
                                zzdo.zzf("PsshAtomUtil", "Unsupported pssh version: " + v5);
                            }
                            else {
                                UUID uUID0 = new UUID(zzdy0.zzt(), zzdy0.zzt());
                                if(v5 == 1) {
                                    int v6 = zzdy0.zzp();
                                    arr_uUID = new UUID[v6];
                                    for(int v7 = 0; v7 < v6; ++v7) {
                                        arr_uUID[v7] = new UUID(zzdy0.zzt(), zzdy0.zzt());
                                    }
                                    v8 = v1;
                                    list2 = list1;
                                }
                                else {
                                    v8 = v1;
                                    list2 = list1;
                                    arr_uUID = null;
                                }
                                int v9 = zzdy0.zzp();
                                int v10 = zzdy0.zzb();
                                if(v9 == v10) {
                                    byte[] arr_b1 = new byte[v9];
                                    zzdy0.zzH(arr_b1, 0, v9);
                                    zzaix0 = new zzaix(uUID0, v5, arr_b1, arr_uUID);
                                }
                                else {
                                    zzdo.zzf("PsshAtomUtil", "Atom data size (" + v9 + ") does not match the bytes left: " + v10);
                                    zzaix0 = null;
                                }
                                goto label_53;
                            }
                        }
                        else {
                            zzdo.zzf("PsshAtomUtil", "Atom type is not pssh: " + v4);
                        }
                    }
                    else {
                        zzdo.zzf("PsshAtomUtil", "Advertised atom size (" + v3 + ") does not match buffer size: " + v2);
                    }
                }
                v8 = v1;
                list2 = list1;
                zzaix0 = null;
            label_53:
                UUID uUID1 = zzaix0 == null ? null : zzaix0.zza;
                if(uUID1 == null) {
                    zzdo.zzf("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                    list1 = list2;
                }
                else {
                    list1 = list2;
                    ((ArrayList)list1).add(new zzt(uUID1, null, "video/mp4", arr_b));
                }
            }
            else {
                v8 = v1;
            }
            v1 = v8 + 1;
        }
        return list1 == null ? null : new zzu(list1);
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzaco0) throws IOException {
        zzadq zzadq0 = zzaja.zza(zzaco0);
        this.zzq = zzadq0 == null ? zzfxn.zzn() : zzfxn.zzo(zzadq0);
        return zzadq0 == null;
    }

    private final void zzj() {
        this.zzr = 0;
        this.zzu = 0;
    }

    private static void zzk(zzdy zzdy0, int v, zzajd zzajd0) throws zzbc {
        zzdy0.zzL(v + 8);
        int v1 = zzdy0.zzg();
        if((v1 & 1) != 0) {
            throw zzbc.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        int v2 = zzdy0.zzp();
        if(v2 == 0) {
            Arrays.fill(zzajd0.zzl, 0, zzajd0.zze, false);
            return;
        }
        int v3 = zzajd0.zze;
        if(v2 != v3) {
            throw zzbc.zza(("Senc sample count " + v2 + " is different from fragment sample count" + v3), null);
        }
        Arrays.fill(zzajd0.zzl, 0, v2, (v1 & 2) != 0);
        zzajd0.zza(zzdy0.zzb());
        zzdy0.zzH(zzajd0.zzn.zzN(), 0, zzajd0.zzn.zze());
        zzajd0.zzn.zzL(0);
        zzajd0.zzo = false;
    }

    private final void zzl(long v) throws zzbc {
        zzaiq zzaiq1;
        byte[] arr_b7;
        byte[] arr_b6;
        byte[] arr_b5;
        int v63;
        int v57;
        int v56;
        zzen zzen5;
        boolean z1;
        long v55;
        int v53;
        zzail zzail2;
        int v52;
        int v51;
        int v50;
        int v49;
        int v48;
        int v47;
        int v46;
        int v41;
        zzajd zzajd3;
        int v39;
        int v38;
        byte[] arr_b1;
        int v37;
        int v31;
        zzen zzen4;
        int v30;
        zzen zzen3;
        int v28;
        int v27;
        List list2;
        int v20;
        SparseArray sparseArray2;
        zzaiq zzaiq0 = this;
        while(!zzaiq0.zzn.isEmpty() && ((zzen)zzaiq0.zzn.peek()).zza == v) {
            zzen zzen0 = (zzen)zzaiq0.zzn.pop();
            int v1 = zzen0.zzd;
            if(v1 == 0x6D6F6F76) {
                zzu zzu0 = zzaiq.zzh(zzen0.zzb);
                zzen zzen1 = zzen0.zza(0x6D766578);
                zzen1.getClass();
                SparseArray sparseArray0 = new SparseArray();
                int v2 = zzen1.zzb.size();
                long v3 = 0x8000000000000001L;
                for(int v4 = 0; v4 < v2; ++v4) {
                    zzeo zzeo0 = (zzeo)zzen1.zzb.get(v4);
                    int v5 = zzeo0.zzd;
                    if(v5 == 0x74726578) {
                        zzeo0.zza.zzL(12);
                        Pair pair0 = Pair.create(zzeo0.zza.zzg(), new zzail(zzeo0.zza.zzg() - 1, zzeo0.zza.zzg(), zzeo0.zza.zzg(), zzeo0.zza.zzg()));
                        sparseArray0.put(((int)(((Integer)pair0.first))), ((zzail)pair0.second));
                    }
                    else if(v5 == 1835362404) {
                        zzeo0.zza.zzL(8);
                        v3 = zzaik.zza(zzeo0.zza.zzg()) == 0 ? zzeo0.zza.zzu() : zzeo0.zza.zzw();
                    }
                }
                List list0 = zzaik.zzf(zzen0, new zzadb(), v3, zzu0, (zzaiq0.zzd & 16) != 0, false, new zzaim(zzaiq0));
                int v6 = list0.size();
                if(zzaiq0.zzf.size() == 0) {
                    for(int v7 = 0; v7 < v6; ++v7) {
                        zzaje zzaje0 = (zzaje)list0.get(v7);
                        zzadt zzadt0 = zzaiq0.zzH.zzw(v7, zzaje0.zza.zzb);
                        zzadt0.zzl(zzaje0.zza.zze);
                        zzaip zzaip0 = new zzaip(zzadt0, zzaje0, zzaiq.zzm(sparseArray0, zzaje0.zza.zza));
                        zzaiq0.zzf.put(zzaje0.zza.zza, zzaip0);
                        zzaiq0.zzz = Math.max(zzaiq0.zzz, zzaje0.zza.zze);
                    }
                    zzaiq0.zzH.zzD();
                }
                else {
                    zzcw.zzf(zzaiq0.zzf.size() == v6);
                    for(int v8 = 0; v8 < v6; ++v8) {
                        zzaje zzaje1 = (zzaje)list0.get(v8);
                        ((zzaip)zzaiq0.zzf.get(zzaje1.zza.zza)).zzh(zzaje1, zzaiq.zzm(sparseArray0, zzaje1.zza.zza));
                    }
                }
            }
            else {
                if(v1 == 0x6D6F6F66) {
                    SparseArray sparseArray1 = zzaiq0.zzf;
                    int v9 = zzaiq0.zzd;
                    byte[] arr_b = zzaiq0.zzj;
                    int v10 = zzen0.zzc.size();
                    int v11 = 0;
                    while(v11 < v10) {
                        zzen zzen2 = (zzen)zzen0.zzc.get(v11);
                        if(zzen2.zzd == 1953653094) {
                            zzeo zzeo1 = zzen2.zzb(0x74666864);
                            zzeo1.getClass();
                            zzdy zzdy0 = zzeo1.zza;
                            zzdy0.zzL(8);
                            int v12 = zzdy0.zzg();
                            zzaip zzaip1 = (zzaip)sparseArray1.get(zzdy0.zzg());
                            if(zzaip1 == null) {
                                zzaip1 = null;
                            }
                            else {
                                if((v12 & 1) != 0) {
                                    long v13 = zzdy0.zzw();
                                    zzaip1.zzb.zzb = v13;
                                    zzaip1.zzb.zzc = v13;
                                }
                                zzail zzail0 = zzaip1.zze;
                                zzaip1.zzb.zza = new zzail(((v12 & 2) == 0 ? zzail0.zza : zzdy0.zzg() - 1), ((v12 & 8) == 0 ? zzail0.zzb : zzdy0.zzg()), ((v12 & 16) == 0 ? zzail0.zzc : zzdy0.zzg()), ((v12 & 0x20) == 0 ? zzail0.zzd : zzdy0.zzg()));
                            }
                            if(zzaip1 != null) {
                                zzajd zzajd0 = zzaip1.zzb;
                                long v14 = zzajd0.zzp;
                                boolean z = zzajd0.zzq;
                                zzaip1.zzi();
                                zzaip.zzg(zzaip1, true);
                                zzeo zzeo2 = zzen2.zzb(0x74666474);
                                if(zzeo2 == null || (v9 & 2) != 0) {
                                    zzajd0.zzp = v14;
                                    zzajd0.zzq = z;
                                }
                                else {
                                    zzeo2.zza.zzL(8);
                                    zzajd0.zzp = zzaik.zza(zzeo2.zza.zzg()) == 1 ? zzeo2.zza.zzw() : zzeo2.zza.zzu();
                                    zzajd0.zzq = true;
                                }
                                List list1 = zzen2.zzb;
                                int v15 = list1.size();
                                int v17 = 0;
                                int v18 = 0;
                                for(int v16 = 0; v16 < v15; ++v16) {
                                    zzeo zzeo3 = (zzeo)list1.get(v16);
                                    if(zzeo3.zzd == 0x7472756E) {
                                        zzeo3.zza.zzL(12);
                                        int v19 = zzeo3.zza.zzp();
                                        if(v19 > 0) {
                                            v18 += v19;
                                            ++v17;
                                        }
                                    }
                                }
                                sparseArray2 = sparseArray1;
                                v20 = v10;
                                zzaip1.zzh = 0;
                                zzaip1.zzg = 0;
                                zzaip1.zzf = 0;
                                zzajd zzajd1 = zzaip1.zzb;
                                zzajd1.zzd = v17;
                                zzajd1.zze = v18;
                                if(zzajd1.zzg.length < v17) {
                                    zzajd1.zzf = new long[v17];
                                    zzajd1.zzg = new int[v17];
                                }
                                if(zzajd1.zzh.length < v18) {
                                    int v21 = v18 * 0x7D / 100;
                                    zzajd1.zzh = new int[v21];
                                    zzajd1.zzi = new long[v21];
                                    zzajd1.zzj = new boolean[v21];
                                    zzajd1.zzl = new boolean[v21];
                                }
                                int v22 = 0;
                                int v23 = 0;
                                int v24 = 0;
                                while(true) {
                                    long v25 = 0L;
                                    if(v22 >= v15) {
                                        break;
                                    }
                                    zzeo zzeo4 = (zzeo)list1.get(v22);
                                    if(zzeo4.zzd == 0x7472756E) {
                                        zzdy zzdy1 = zzeo4.zza;
                                        zzdy1.zzL(8);
                                        int v26 = zzdy1.zzg();
                                        list2 = list1;
                                        zzajb zzajb0 = zzaip1.zzd.zza;
                                        v27 = v15;
                                        zzajd zzajd2 = zzaip1.zzb;
                                        zzail zzail1 = zzajd2.zza;
                                        int[] arr_v = zzajd2.zzg;
                                        arr_v[v23] = zzdy1.zzp();
                                        long[] arr_v1 = zzajd2.zzf;
                                        v28 = v22;
                                        zzen3 = zzen0;
                                        long v29 = zzajd2.zzb;
                                        arr_v1[v23] = v29;
                                        if((v26 & 1) == 0) {
                                            v30 = v11;
                                            zzen4 = zzen2;
                                            v31 = v24;
                                        }
                                        else {
                                            v30 = v11;
                                            zzen4 = zzen2;
                                            v31 = v24;
                                            arr_v1[v23] = v29 + ((long)zzdy1.zzg());
                                        }
                                        int v32 = (v26 & 4) == 0 ? 0 : 1;
                                        int v33 = v32 == 0 ? zzail1.zzd : zzdy1.zzg();
                                        int v34 = v26 & 0x100;
                                        int v35 = v26 & 0x200;
                                        int v36 = v26 & 0x800;
                                        long[] arr_v2 = zzajb0.zzi;
                                        if(arr_v2 == null) {
                                            v37 = v33;
                                            arr_b1 = arr_b;
                                            v39 = v26 & 0x400;
                                            v38 = v32;
                                        }
                                        else {
                                            v37 = v33;
                                            arr_b1 = arr_b;
                                            if(arr_v2.length == 1 && zzajb0.zzj != null) {
                                                long v40 = arr_v2[0];
                                                if(v40 == 0L) {
                                                    v38 = v32;
                                                    v39 = v26 & 0x400;
                                                    v25 = zzajb0.zzj[0];
                                                }
                                                else {
                                                    v38 = v32;
                                                    RoundingMode roundingMode0 = RoundingMode.DOWN;
                                                    v39 = v26 & 0x400;
                                                    if(zzei.zzu(v40, 1000000L, zzajb0.zzd, roundingMode0) + zzei.zzu(zzajb0.zzj[0], 1000000L, zzajb0.zzc, roundingMode0) >= zzajb0.zze) {
                                                        v25 = zzajb0.zzj[0];
                                                    }
                                                }
                                            }
                                            else {
                                                v38 = v32;
                                                v39 = v26 & 0x400;
                                            }
                                        }
                                        int[] arr_v3 = zzajd2.zzh;
                                        long[] arr_v4 = zzajd2.zzi;
                                        boolean[] arr_z = zzajd2.zzj;
                                        zzajd3 = zzajd0;
                                        v24 = v31 + zzajd2.zzg[v23];
                                        v41 = v9;
                                        int v42 = zzajb0.zzb != 2 || (v9 & 1) == 0 ? 0 : 1;
                                        long v43 = zzajb0.zzc;
                                        int[] arr_v5 = arr_v3;
                                        long[] arr_v6 = arr_v4;
                                        long v44 = zzajd2.zzp;
                                        int v45 = v31;
                                        while(v45 < v24) {
                                            if(v34 == 0) {
                                                v46 = 0;
                                                v47 = zzail1.zzb;
                                            }
                                            else {
                                                v46 = v34;
                                                v47 = zzdy1.zzg();
                                            }
                                            zzaiq.zzg(v47);
                                            if(v35 == 0) {
                                                v49 = 0;
                                                v48 = zzail1.zzc;
                                            }
                                            else {
                                                v48 = zzdy1.zzg();
                                                v49 = v35;
                                            }
                                            zzaiq.zzg(v48);
                                            if(v39 == 0) {
                                                if(v45 == 0) {
                                                    if(v38 == 0) {
                                                        v45 = 0;
                                                    }
                                                    else {
                                                        v50 = v37;
                                                        v45 = 0;
                                                        goto label_215;
                                                    }
                                                }
                                                v50 = zzail1.zzd;
                                            }
                                            else {
                                                v50 = zzdy1.zzg();
                                            }
                                        label_215:
                                            if(v36 == 0) {
                                                v51 = v38;
                                                v52 = v24;
                                                zzail2 = zzail1;
                                                v53 = 0;
                                            }
                                            else {
                                                v51 = v38;
                                                v52 = v24;
                                                zzail2 = zzail1;
                                                v53 = zzdy1.zzg();
                                            }
                                            long v54 = zzei.zzu(((long)v53) + v44 - v25, 1000000L, v43, RoundingMode.DOWN);
                                            arr_v6[v45] = v54;
                                            if(zzajd2.zzq) {
                                                v55 = v43;
                                            }
                                            else {
                                                v55 = v43;
                                                arr_v6[v45] = v54 + zzaip1.zzd.zzh;
                                            }
                                            arr_v5[v45] = v48;
                                            if((v50 >> 16 & 1) != 0) {
                                                z1 = false;
                                            }
                                            else if(v42 == 0) {
                                                z1 = true;
                                            }
                                            else if(v45 == 0) {
                                                z1 = true;
                                                v45 = 0;
                                            }
                                            arr_z[v45] = z1;
                                            v44 += (long)v47;
                                            ++v45;
                                            v43 = v55;
                                            v34 = v46;
                                            v35 = v49;
                                            v38 = v51;
                                            zzail1 = zzail2;
                                            v24 = v52;
                                        }
                                        zzajd2.zzp = v44;
                                        ++v23;
                                    }
                                    else {
                                        v28 = v22;
                                        zzen3 = zzen0;
                                        v41 = v9;
                                        zzajd3 = zzajd0;
                                        list2 = list1;
                                        arr_b1 = arr_b;
                                        v30 = v11;
                                        v27 = v15;
                                        zzen4 = zzen2;
                                    }
                                    v22 = v28 + 1;
                                    list1 = list2;
                                    v15 = v27;
                                    zzen0 = zzen3;
                                    v11 = v30;
                                    zzen2 = zzen4;
                                    arr_b = arr_b1;
                                    zzajd0 = zzajd3;
                                    v9 = v41;
                                }
                                zzen5 = zzen0;
                                v56 = v9;
                                byte[] arr_b2 = arr_b;
                                v57 = v11;
                                zzajb zzajb1 = zzaip1.zzd.zza;
                                zzajd zzajd4 = zzajd0;
                                zzail zzail3 = zzajd4.zza;
                                zzail3.getClass();
                                zzajc zzajc0 = zzajb1.zzb(zzail3.zza);
                                zzen zzen6 = zzen2;
                                zzeo zzeo5 = zzen6.zzb(0x7361697A);
                                if(zzeo5 != null) {
                                    zzajc0.getClass();
                                    int v58 = zzajc0.zzd;
                                    zzdy zzdy2 = zzeo5.zza;
                                    zzdy2.zzL(8);
                                    if((zzdy2.zzg() & 1) == 1) {
                                        zzdy2.zzM(8);
                                    }
                                    int v59 = zzdy2.zzm();
                                    int v60 = zzdy2.zzp();
                                    int v61 = zzajd4.zze;
                                    if(v60 > v61) {
                                        throw zzbc.zza(("Saiz sample count " + v60 + " is greater than fragment sample count" + v61), null);
                                    }
                                    if(v59 == 0) {
                                        boolean[] arr_z1 = zzajd4.zzl;
                                        v63 = 0;
                                        for(int v62 = 0; v62 < v60; ++v62) {
                                            int v64 = zzdy2.zzm();
                                            v63 += v64;
                                            arr_z1[v62] = v64 > v58;
                                        }
                                    }
                                    else {
                                        v63 = v59 * v60;
                                        Arrays.fill(zzajd4.zzl, 0, v60, v59 > v58);
                                    }
                                    Arrays.fill(zzajd4.zzl, v60, zzajd4.zze, false);
                                    if(v63 > 0) {
                                        zzajd4.zza(v63);
                                    }
                                }
                                zzeo zzeo6 = zzen6.zzb(0x7361696F);
                                if(zzeo6 != null) {
                                    zzdy zzdy3 = zzeo6.zza;
                                    zzdy3.zzL(8);
                                    int v65 = zzdy3.zzg();
                                    if((v65 & 1) == 1) {
                                        zzdy3.zzM(8);
                                    }
                                    int v66 = zzdy3.zzp();
                                    if(v66 != 1) {
                                        throw zzbc.zza(("Unexpected saio entry count: " + v66), null);
                                    }
                                    zzajd4.zzc += ((v65 >> 24 & 0xFF) == 0 ? zzdy3.zzu() : zzdy3.zzw());
                                }
                                zzeo zzeo7 = zzen6.zzb(1936027235);
                                if(zzeo7 != null) {
                                    zzaiq.zzk(zzeo7.zza, 0, zzajd4);
                                }
                                String s = zzajc0 == null ? null : zzajc0.zzb;
                                zzdy zzdy4 = null;
                                zzdy zzdy5 = null;
                                for(int v67 = 0; v67 < zzen6.zzb.size(); ++v67) {
                                    zzeo zzeo8 = (zzeo)zzen6.zzb.get(v67);
                                    zzdy zzdy6 = zzeo8.zza;
                                    int v68 = zzeo8.zzd;
                                    if(v68 == 0x73626770) {
                                        zzdy6.zzL(12);
                                        if(zzdy6.zzg() == 1936025959) {
                                            zzdy4 = zzdy6;
                                        }
                                    }
                                    else if(v68 == 0x73677064) {
                                        zzdy6.zzL(12);
                                        if(zzdy6.zzg() == 1936025959) {
                                            zzdy5 = zzdy6;
                                        }
                                    }
                                }
                                if(zzdy4 != null && zzdy5 != null) {
                                    zzdy4.zzL(8);
                                    int v69 = zzaik.zza(zzdy4.zzg());
                                    zzdy4.zzM(4);
                                    if(v69 == 1) {
                                        zzdy4.zzM(4);
                                    }
                                    if(zzdy4.zzg() != 1) {
                                        throw zzbc.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    zzdy5.zzL(8);
                                    int v70 = zzaik.zza(zzdy5.zzg());
                                    zzdy5.zzM(4);
                                    if(v70 == 1) {
                                        if(zzdy5.zzu() == 0L) {
                                            throw zzbc.zzc("Variable length description in sgpd found (unsupported)");
                                        }
                                    }
                                    else if(v70 >= 2) {
                                        zzdy5.zzM(4);
                                    }
                                    if(zzdy5.zzu() != 1L) {
                                        throw zzbc.zzc("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    zzdy5.zzM(1);
                                    int v71 = zzdy5.zzm();
                                    int v72 = (v71 & 0xF0) >> 4;
                                    int v73 = v71 & 15;
                                    if(zzdy5.zzm() == 1) {
                                        int v74 = zzdy5.zzm();
                                        byte[] arr_b3 = new byte[16];
                                        zzdy5.zzH(arr_b3, 0, 16);
                                        if(v74 == 0) {
                                            int v75 = zzdy5.zzm();
                                            byte[] arr_b4 = new byte[v75];
                                            zzdy5.zzH(arr_b4, 0, v75);
                                            arr_b5 = arr_b4;
                                        }
                                        else {
                                            arr_b5 = null;
                                        }
                                        zzajd4.zzk = true;
                                        zzajd4.zzm = new zzajc(true, s, v74, arr_b3, v72, v73, arr_b5);
                                    }
                                }
                                int v76 = zzen6.zzb.size();
                                int v77 = 0;
                                while(v77 < v76) {
                                    zzeo zzeo9 = (zzeo)zzen6.zzb.get(v77);
                                    if(zzeo9.zzd == 1970628964) {
                                        zzdy zzdy7 = zzeo9.zza;
                                        zzdy7.zzL(8);
                                        arr_b6 = arr_b2;
                                        zzdy7.zzH(arr_b6, 0, 16);
                                        if(Arrays.equals(arr_b6, zzaiq.zza)) {
                                            zzaiq.zzk(zzdy7, 16, zzajd4);
                                        }
                                    }
                                    else {
                                        arr_b6 = arr_b2;
                                    }
                                    ++v77;
                                    arr_b2 = arr_b6;
                                }
                                arr_b7 = arr_b2;
                            }
                        }
                        else {
                            sparseArray2 = sparseArray1;
                            zzen5 = zzen0;
                            v56 = v9;
                            arr_b7 = arr_b;
                            v20 = v10;
                            v57 = v11;
                        }
                        v11 = v57 + 1;
                        arr_b = arr_b7;
                        v10 = v20;
                        sparseArray1 = sparseArray2;
                        zzen0 = zzen5;
                        v9 = v56;
                    }
                    zzu zzu1 = zzaiq.zzh(zzen0.zzb);
                    zzaiq1 = this;
                    if(zzu1 != null) {
                        int v78 = zzaiq1.zzf.size();
                        for(int v79 = 0; v79 < v78; ++v79) {
                            zzaip zzaip2 = (zzaip)zzaiq1.zzf.valueAt(v79);
                            zzajc zzajc1 = zzaip2.zzd.zza.zzb(zzaip2.zzb.zza.zza);
                            zzu zzu2 = zzu1.zzb((zzajc1 == null ? null : zzajc1.zzb));
                            zzz zzz0 = zzaip2.zzd.zza.zzg.zzb();
                            zzz0.zzF(zzu2);
                            zzab zzab0 = zzz0.zzag();
                            zzaip2.zza.zzm(zzab0);
                        }
                    }
                    if(zzaiq1.zzy != 0x8000000000000001L) {
                        int v80 = zzaiq1.zzf.size();
                        for(int v81 = 0; v81 < v80; ++v81) {
                            zzaip zzaip3 = (zzaip)zzaiq1.zzf.valueAt(v81);
                            long v82 = zzaiq1.zzy;
                            for(int v83 = zzaip3.zzf; true; ++v83) {
                                zzajd zzajd5 = zzaip3.zzb;
                                if(v83 >= zzajd5.zze || zzajd5.zzi[v83] > v82) {
                                    break;
                                }
                                if(zzajd5.zzj[v83]) {
                                    zzaip3.zzi = v83;
                                }
                            }
                        }
                        zzaiq1.zzy = 0x8000000000000001L;
                    }
                }
                else {
                    zzaiq1 = zzaiq0;
                    if(!zzaiq1.zzn.isEmpty()) {
                        ((zzen)zzaiq1.zzn.peek()).zzc(zzen0);
                    }
                }
                zzaiq0 = zzaiq1;
            }
        }
        this.zzj();
    }

    private static final zzail zzm(SparseArray sparseArray0, int v) {
        if(sparseArray0.size() == 1) {
            return (zzail)sparseArray0.valueAt(0);
        }
        zzail zzail0 = (zzail)sparseArray0.get(v);
        zzail0.getClass();
        return zzail0;
    }
}

