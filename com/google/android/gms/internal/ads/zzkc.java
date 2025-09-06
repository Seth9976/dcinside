package com.google.android.gms.internal.ads;

import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import j..util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

final class zzkc implements Handler.Callback, zzhz, zzkz, zzld, zzud, zzya {
    private boolean zzA;
    private boolean zzB;
    private boolean zzC;
    private boolean zzD;
    private long zzE;
    private boolean zzF;
    private int zzG;
    private boolean zzH;
    private boolean zzI;
    private int zzJ;
    @Nullable
    private zzka zzK;
    private long zzL;
    private long zzM;
    private int zzN;
    private boolean zzO;
    @Nullable
    private zzib zzP;
    private long zzQ;
    private zzil zzR;
    private final zzix zzS;
    private final zzhv zzT;
    private static final long zza;
    private final zzlo[] zzb;
    private final zzlm[] zzc;
    private final boolean[] zzd;
    private final zzyb zze;
    private final zzyc zzf;
    private final zzkg zzg;
    private final zzyj zzh;
    private final zzdh zzi;
    private final zzlc zzj;
    private final Looper zzk;
    private final zzbp zzl;
    private final zzbo zzm;
    private final long zzn;
    private final zzia zzo;
    private final ArrayList zzp;
    private final zzcx zzq;
    private final zzko zzr;
    private final zzla zzs;
    private final long zzt;
    private final zzog zzu;
    private final zzlt zzv;
    private final zzdh zzw;
    private zzlp zzx;
    private zzlb zzy;
    private zzjz zzz;

    static {
        zzkc.zza = zzei.zzv(10000L);
    }

    public zzkc(zzlj[] arr_zzlj, zzyb zzyb0, zzyc zzyc0, zzkg zzkg0, zzyj zzyj0, int v, boolean z, zzlt zzlt0, zzlp zzlp0, zzhv zzhv0, long v1, boolean z1, boolean z2, Looper looper0, zzcx zzcx0, zzix zzix0, zzog zzog0, @Nullable zzlc zzlc0, zzil zzil0) {
        this.zzS = zzix0;
        this.zze = zzyb0;
        this.zzf = zzyc0;
        this.zzg = zzkg0;
        this.zzh = zzyj0;
        this.zzG = 0;
        this.zzH = false;
        this.zzx = zzlp0;
        this.zzT = zzhv0;
        this.zzt = v1;
        this.zzB = false;
        this.zzq = zzcx0;
        this.zzu = zzog0;
        this.zzR = zzil0;
        this.zzv = zzlt0;
        this.zzQ = 0x8000000000000001L;
        this.zzE = 0x8000000000000001L;
        this.zzn = zzkg0.zzb(zzog0);
        zzkg0.zzg(zzog0);
        zzlb zzlb0 = zzlb.zzg(zzyc0);
        this.zzy = zzlb0;
        this.zzz = new zzjz(zzlb0);
        this.zzc = new zzlm[2];
        this.zzd = new boolean[2];
        zzll zzll0 = zzyb0.zze();
        this.zzb = new zzlo[2];
        for(int v2 = 0; v2 < 2; ++v2) {
            arr_zzlj[v2].zzv(v2, zzog0, zzcx0);
            this.zzc[v2] = arr_zzlj[v2].zzm();
            this.zzc[v2].zzL(zzll0);
            this.zzb[v2] = new zzlo(arr_zzlj[v2], v2);
        }
        this.zzo = new zzia(this, zzcx0);
        this.zzp = new ArrayList();
        this.zzl = new zzbp();
        this.zzm = new zzbo();
        zzyb0.zzr(this, zzyj0);
        this.zzO = true;
        zzdh zzdh0 = zzcx0.zzd(looper0, null);
        this.zzw = zzdh0;
        this.zzr = new zzko(zzlt0, zzdh0, new zzjs(this), zzil0);
        this.zzs = new zzla(this, zzlt0, zzdh0, zzog0);
        zzlc zzlc1 = new zzlc(null);
        this.zzj = zzlc1;
        Looper looper1 = zzlc1.zza();
        this.zzk = looper1;
        this.zzi = zzcx0.zzd(looper1, this);
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        int v42;
        zzib zzib1;
        zzqy zzqy1;
        zzbc zzbc1;
        zzfz zzfz1;
        zztg zztg1;
        IOException iOException1;
        RuntimeException runtimeException1;
        AtomicBoolean atomicBoolean1;
        Throwable throwable2;
        long v33;
        long v32;
        zzlb zzlb2;
        long v31;
        zzlb zzlb1;
        long v30;
        int v28;
        zzug zzug3;
        long v27;
        long v26;
        zzka zzka0;
        boolean z6;
        long v18;
        long v17;
        int v15;
        boolean z4;
        int v12;
        long v5;
        try {
            switch(message0.what) {
                case 1: {
                    this.zzY(message0.arg1 != 0, message0.arg2 >> 4, true, message0.arg2 & 15);
                    goto label_566;
                }
                case 2: {
                    long v3 = SystemClock.uptimeMillis();
                    this.zzi.zzf(2);
                    if(!this.zzy.zza.zzo() && this.zzs.zzj()) {
                        this.zzr.zzo(this.zzL);
                        if(this.zzr.zzv()) {
                            zzkm zzkm0 = this.zzr.zzi(this.zzL, this.zzy);
                            if(zzkm0 != null) {
                                zzkl zzkl0 = this.zzr.zzc(zzkm0);
                                if(!zzkl0.zzd) {
                                    zzkl0.zzm(this, zzkm0.zzb);
                                }
                                else if(zzkl0.zze) {
                                    this.zzi.zzc(8, zzkl0.zza).zza();
                                }
                                if(this.zzr.zze() == zzkl0) {
                                    this.zzT(zzkm0.zzb);
                                }
                                this.zzG(false);
                            }
                        }
                        if(this.zzF) {
                            this.zzF = zzkc.zzap(this.zzr.zzd());
                            this.zzad();
                        }
                        else {
                            this.zzK();
                        }
                        zzkl zzkl1 = this.zzr.zzh();
                        if(zzkl1 == null) {
                        label_100:
                            v5 = v3;
                        }
                        else if(zzkl1.zzg() != null && !this.zzC) {
                            zzkl zzkl2 = this.zzr.zzh();
                            if(zzkl2.zze) {
                                int v4 = 0;
                                while(true) {
                                    zzlo[] arr_zzlo = this.zzb;
                                    if(v4 >= 2) {
                                        break;
                                    }
                                    if(!arr_zzlo[v4].zzu(zzkl2)) {
                                        goto label_100;
                                    }
                                    ++v4;
                                }
                                if(!zzkl1.zzg().zze && this.zzL < zzkl1.zzg().zzf()) {
                                    v5 = v3;
                                }
                                else {
                                    zzyc zzyc0 = zzkl1.zzi();
                                    zzkl zzkl3 = this.zzr.zzb();
                                    zzyc zzyc1 = zzkl3.zzi();
                                    v5 = v3;
                                    this.zzag(this.zzy.zza, zzkl3.zzg.zza, this.zzy.zza, zzkl1.zzg.zza, 0x8000000000000001L, false);
                                    if(!zzkl3.zze || zzkl3.zza.zzd() == 0x8000000000000001L) {
                                        for(int v8 = 0; v8 < 2; ++v8) {
                                            boolean z = zzyc0.zzb(v8);
                                            boolean z1 = zzyc1.zzb(v8);
                                            if(z && !this.zzb[v8].zzw()) {
                                                this.zzc[v8].zzb();
                                                if(!z1 || !zzyc1.zzb[v8].equals(zzyc0.zzb[v8])) {
                                                    this.zzb[v8].zzn(zzkl3.zzf());
                                                }
                                            }
                                        }
                                    }
                                    else {
                                        long v6 = zzkl3.zzf();
                                        zzlo[] arr_zzlo1 = this.zzb;
                                        for(int v7 = 0; v7 < 2; ++v7) {
                                            arr_zzlo1[v7].zzn(v6);
                                        }
                                        if(!zzkl3.zzs()) {
                                            this.zzr.zzu(zzkl3);
                                            this.zzG(false);
                                            this.zzK();
                                        }
                                    }
                                }
                            }
                            else {
                                goto label_100;
                            }
                        }
                        else {
                            v5 = v3;
                            if(zzkl1.zzg.zzi || this.zzC) {
                                for(int v9 = 0; true; ++v9) {
                                    zzlo[] arr_zzlo2 = this.zzb;
                                    if(v9 >= 2) {
                                        break;
                                    }
                                    zzlo zzlo0 = arr_zzlo2[v9];
                                    if(zzlo0.zzy(zzkl1) && zzlo0.zzv()) {
                                        long v10 = zzkl1.zzg.zze;
                                        zzlo0.zzn((v10 == 0x8000000000000001L || v10 == 0x8000000000000000L ? 0x8000000000000001L : zzkl1.zze() + v10));
                                    }
                                }
                            }
                        }
                        zzkl zzkl4 = this.zzr.zzh();
                        if(zzkl4 != null && this.zzr.zze() != zzkl4 && !zzkl4.zzh) {
                            zzkl zzkl5 = this.zzr.zzh();
                            zzyc zzyc2 = zzkl5.zzi();
                            boolean z2 = false;
                            for(int v11 = 0; true; ++v11) {
                                zzlo[] arr_zzlo3 = this.zzb;
                                if(v11 >= 2) {
                                    break;
                                }
                                zzlo zzlo1 = arr_zzlo3[v11];
                                if(zzlo1.zza() != 0 && (!zzyc2.zzb(v11) || !zzlo1.zzy(zzkl5))) {
                                    if(!zzlo1.zzw()) {
                                        zzlo1.zzk(zzkc.zzan(zzyc2.zzc[v11]), zzkl5.zzc[v11], zzkl5.zzf(), zzkl5.zze(), zzkl5.zzg.zza);
                                    }
                                    else if(zzlo1.zzx()) {
                                        this.zzB(v11);
                                    }
                                    else {
                                        z2 = true;
                                    }
                                }
                            }
                            if(!z2) {
                                this.zzD();
                            }
                        }
                        for(boolean z3 = false; this.zzal() && !this.zzC; z3 = true) {
                            zzkl zzkl6 = this.zzr.zze();
                            if(zzkl6 == null) {
                                break;
                            }
                            zzkl zzkl7 = zzkl6.zzg();
                            if(zzkl7 == null || this.zzL < zzkl7.zzf() || !zzkl7.zzh) {
                                break;
                            }
                            if(z3) {
                                this.zzM();
                            }
                            zzkl zzkl8 = this.zzr.zza();
                            if(zzkl8 == null) {
                                throw null;
                            }
                            if(this.zzy.zzb.zza.equals(zzkl8.zzg.zza.zza)) {
                                zzug zzug0 = this.zzy.zzb;
                                if(zzug0.zzb == -1) {
                                    zzug zzug1 = zzkl8.zzg.zza;
                                    if(zzug1.zzb == -1 && zzug0.zze != zzug1.zze) {
                                        v12 = 1;
                                    }
                                }
                            }
                            else {
                                v12 = 0;
                            }
                            this.zzy = this.zzA(zzkl8.zzg.zza, zzkl8.zzg.zzb, zzkl8.zzg.zzc, zzkl8.zzg.zzb, ((boolean)(v12 ^ 1)), 0);
                            this.zzS();
                            this.zzaf();
                            if(this.zzy.zze == 3) {
                                this.zzaa();
                            }
                            zzyc zzyc3 = this.zzr.zze().zzi();
                            for(int v13 = 0; v13 < 2; ++v13) {
                                if(zzyc3.zzb(v13)) {
                                    this.zzb[v13].zzf();
                                }
                            }
                        }
                    }
                    else {
                        v5 = v3;
                    }
                    if(this.zzy.zze != 1 && this.zzy.zze != 4) {
                        zzkl zzkl9 = this.zzr.zze();
                        if(zzkl9 == null) {
                            this.zzV(v5);
                        }
                        else {
                            long v14 = v5;
                            Trace.beginSection("doSomeWork");
                            this.zzaf();
                            if(zzkl9.zze) {
                                this.zzM = zzei.zzs(SystemClock.elapsedRealtime());
                                zzkl9.zza.zzj(this.zzy.zzs - this.zzn, false);
                                z4 = true;
                                v15 = 1;
                                int v16 = 0;
                                while(true) {
                                    zzlo[] arr_zzlo4 = this.zzb;
                                    if(v16 >= 2) {
                                        break;
                                    }
                                    zzlo zzlo2 = arr_zzlo4[v16];
                                    if(zzlo2.zza() == 0) {
                                        this.zzO(v16, false);
                                        v17 = v14;
                                    }
                                    else {
                                        v17 = v14;
                                        zzlo2.zzj(this.zzL, this.zzM);
                                        z4 = z4 && zzlo2.zzx();
                                        boolean z5 = zzlo2.zzt(zzkl9);
                                        this.zzO(v16, z5);
                                        if(!z5) {
                                            this.zzN(v16);
                                        }
                                        v15 = v15 == 0 || !z5 ? 0 : 1;
                                    }
                                    ++v16;
                                    v14 = v17;
                                }
                                v18 = v14;
                            }
                            else {
                                v18 = v14;
                                zzkl9.zza.zzk();
                                z4 = true;
                                v15 = 1;
                            }
                            long v19 = zzkl9.zzg.zze;
                            if(!z4 || !zzkl9.zze || v19 != 0x8000000000000001L && v19 > this.zzy.zzs) {
                            label_202:
                                zzlb zzlb0 = this.zzy;
                                if(zzlb0.zze != 2 || v15 == 0) {
                                label_228:
                                    if(this.zzy.zze == 3) {
                                        if(this.zzJ != 0) {
                                            if(v15 == 0) {
                                            label_233:
                                                this.zzah(this.zzal(), false);
                                                this.zzZ(2);
                                                if(this.zzD) {
                                                    for(zzkl zzkl12 = this.zzr.zze(); zzkl12 != null; zzkl12 = zzkl12.zzg()) {
                                                        zzxv[] arr_zzxv = zzkl12.zzi().zzc;
                                                        for(int v23 = 0; v23 < arr_zzxv.length; ++v23) {
                                                            zzxv zzxv0 = arr_zzxv[v23];
                                                        }
                                                    }
                                                    this.zzT.zzc();
                                                }
                                                this.zzac();
                                            }
                                        }
                                        else if(!this.zzaj()) {
                                            goto label_233;
                                        }
                                    }
                                }
                                else if(this.zzJ == 0) {
                                    z6 = this.zzaj();
                                    goto label_220;
                                }
                                else if(zzlb0.zzg) {
                                    zzkl zzkl10 = this.zzr.zze();
                                    long v20 = this.zzam(this.zzy.zza, zzkl10.zzg.zza) ? this.zzT.zzb() : 0x8000000000000001L;
                                    zzkl zzkl11 = this.zzr.zzd();
                                    if(zzkl11.zzs() && zzkl11.zzg.zzi || zzkl11.zzg.zza.zzb() && !zzkl11.zze) {
                                        goto label_221;
                                    }
                                    else {
                                        long v21 = this.zzv(zzkl11.zzc());
                                        zzbq zzbq0 = this.zzy.zza;
                                        zzug zzug2 = zzkl10.zzg.zza;
                                        long v22 = this.zzL;
                                        zzbe zzbe0 = this.zzo.zzc();
                                        zzkf zzkf0 = new zzkf(this.zzu, zzbq0, zzug2, v22 - zzkl10.zze(), v21, zzbe0.zzb, this.zzy.zzl, this.zzD, v20);
                                        z6 = this.zzg.zzj(zzkf0);
                                    label_220:
                                        if(z6) {
                                            goto label_221;
                                        }
                                        else {
                                            goto label_228;
                                        }
                                    }
                                }
                                else {
                                label_221:
                                    this.zzZ(3);
                                    this.zzP = null;
                                    if(this.zzal()) {
                                        this.zzah(false, false);
                                        this.zzo.zzh();
                                        this.zzaa();
                                    }
                                }
                            }
                            else {
                                if(this.zzC) {
                                    this.zzC = false;
                                    this.zzY(false, this.zzy.zzn, false, 5);
                                }
                                if(zzkl9.zzg.zzi) {
                                    this.zzZ(4);
                                    this.zzac();
                                    goto label_248;
                                }
                                goto label_202;
                            }
                        label_248:
                            if(this.zzy.zze == 2) {
                                for(int v24 = 0; true; ++v24) {
                                    zzlo[] arr_zzlo5 = this.zzb;
                                    if(v24 >= 2) {
                                        break;
                                    }
                                    if(arr_zzlo5[v24].zzy(zzkl9)) {
                                        this.zzN(v24);
                                    }
                                }
                                if(this.zzy.zzg || this.zzy.zzr >= 500000L || !zzkc.zzap(this.zzr.zzd())) {
                                    this.zzQ = 0x8000000000000001L;
                                }
                                else if(this.zzQ == 0x8000000000000001L) {
                                    this.zzQ = SystemClock.elapsedRealtime();
                                }
                                else if(SystemClock.elapsedRealtime() - this.zzQ >= 4000L) {
                                    throw new IllegalStateException("Playback stuck buffering and not loading");
                                }
                            }
                            else {
                                this.zzQ = 0x8000000000000001L;
                            }
                            int v25 = this.zzy.zze;
                            if(v25 != 4 && (this.zzal() && this.zzy.zze == 3 || v25 == 2 || v25 == 3 && this.zzJ != 0)) {
                                this.zzV(v18);
                            }
                            Trace.endSection();
                        }
                    }
                    goto label_566;
                }
                case 3: {
                    zzka0 = (zzka)message0.obj;
                    this.zzz.zza(1);
                    Pair pair0 = zzkc.zzz(this.zzy.zza, zzka0, true, this.zzG, this.zzH, this.zzl, this.zzm);
                    if(pair0 == null) {
                        Pair pair1 = this.zzy(this.zzy.zza);
                        zzug zzug4 = (zzug)pair1.first;
                        long v29 = (long)(((Long)pair1.second));
                        v28 = !this.zzy.zza.zzo();
                        zzug3 = zzug4;
                        v26 = v29;
                        v27 = 0x8000000000000001L;
                    }
                    else {
                        Object object0 = pair0.first;
                        v26 = (long)(((Long)pair0.second));
                        v27 = zzka0.zzc == 0x8000000000000001L ? 0x8000000000000001L : v26;
                        zzug3 = this.zzr.zzk(this.zzy.zza, object0, v26);
                        if(zzug3.zzb()) {
                            this.zzy.zza.zzn(zzug3.zza, this.zzm);
                            boolean z7 = this.zzm.zze(zzug3.zzb) != zzug3.zzc;
                            v26 = 0L;
                            v28 = 1;
                        }
                        else {
                            v28 = zzka0.zzc == 0x8000000000000001L ? 1 : 0;
                        }
                    }
                    break;
                }
                case 4: {
                    goto label_332;
                }
                case 5: {
                    this.zzx = (zzlp)message0.obj;
                    goto label_566;
                }
                case 6: {
                    goto label_337;
                }
                case 7: {
                    try {
                        this.zzR(true, false, true, false);
                        for(int v1 = 0; v1 < 2; ++v1) {
                            this.zzc[v1].zzq();
                            this.zzb[v1].zzi();
                        }
                        this.zzg.zzd(this.zzu);
                        this.zzZ(1);
                        return true;
                    }
                    finally {
                        this.zzj.zzb();
                        synchronized(this) {
                            this.zzA = true;
                            this.notifyAll();
                        }
                    }
                }
                case 8: {
                    goto label_339;
                }
                case 9: {
                    goto label_360;
                }
                case 10: {
                    goto label_368;
                }
                case 11: {
                    goto label_370;
                }
                case 12: {
                    goto label_375;
                }
                case 13: {
                    goto label_380;
                }
                case 14: {
                    goto label_402;
                }
                case 15: {
                    goto label_410;
                }
                case 16: {
                    goto label_418;
                }
                case 17: {
                    goto label_420;
                }
                case 18: {
                    goto label_426;
                }
                case 19: {
                    goto label_434;
                }
                case 20: {
                    goto label_438;
                }
                case 21: {
                    goto label_444;
                }
                case 22: {
                    goto label_448;
                }
                case 23: {
                    goto label_450;
                }
                case 25: {
                    goto label_456;
                }
                case 26: {
                    goto label_458;
                }
                case 27: {
                    goto label_460;
                }
                case 28: {
                    goto label_466;
                }
                case 29: {
                    goto label_469;
                }
                case 30: {
                    goto label_477;
                }
                default: {
                    return false;
                }
            }
        }
        catch(zzib zzib0) {
            goto label_513;
        }
        catch(zzqy zzqy0) {
            zzqy1 = zzqy0;
            this.zzF(zzqy1, zzqy1.zza);
            goto label_566;
        }
        catch(zzbc zzbc0) {
            zzbc1 = zzbc0;
            goto label_547;
        }
        catch(zzfz zzfz0) {
            zzfz1 = zzfz0;
            this.zzF(zzfz1, zzfz1.zza);
            goto label_566;
        }
        catch(zztg zztg0) {
            zztg1 = zztg0;
            this.zzF(zztg1, 1002);
            goto label_566;
        }
        catch(IOException iOException0) {
            iOException1 = iOException0;
            this.zzF(iOException1, 2000);
            goto label_566;
        }
        catch(RuntimeException runtimeException0) {
            runtimeException1 = runtimeException0;
            goto label_562;
        }
        try {
            if(this.zzy.zza.zzo()) {
                this.zzK = zzka0;
                v32 = v26;
                zzlb2 = this.zzA(zzug3, v32, v27, v32, ((boolean)v28), 2);
                this.zzy = zzlb2;
                goto label_566;
            }
            else if(pair0 == null) {
                if(this.zzy.zze != 1) {
                    this.zzZ(4);
                }
                this.zzR(false, true, false, true);
                v32 = v26;
                zzlb2 = this.zzA(zzug3, v32, v27, v32, ((boolean)v28), 2);
                this.zzy = zzlb2;
                goto label_566;
            }
            else if(zzug3.equals(this.zzy.zzb)) {
                zzkl zzkl13 = this.zzr.zze();
                v30 = zzkl13 == null || !zzkl13.zze || v26 == 0L ? v26 : zzkl13.zza.zza(v26, this.zzx);
                if(zzei.zzv(v30) == zzei.zzv(this.zzy.zzs)) {
                    zzlb1 = this.zzy;
                    if(zzlb1.zze != 2 && zzlb1.zze != 3) {
                        v31 = this.zzw(zzug3, v30, this.zzy.zze == 4);
                        goto label_313;
                    }
                    zzlb2 = this.zzA(zzug3, zzlb1.zzs, v27, zzlb1.zzs, ((boolean)v28), 2);
                    this.zzy = zzlb2;
                    goto label_566;
                }
                else {
                    goto label_312;
                }
            }
            else {
                goto label_311;
            }
            this.zzy = zzlb2;
            goto label_566;
        }
        catch(Throwable throwable0) {
            throwable2 = throwable0;
            v33 = v26;
            this.zzy = this.zzA(zzug3, v33, v27, v33, ((boolean)v28), 2);
            throw throwable2;
        }
        try {
            zzlb2 = this.zzA(zzug3, zzlb1.zzs, v27, zzlb1.zzs, ((boolean)v28), 2);
            this.zzy = zzlb2;
            goto label_566;
        }
        catch(zzib zzib0) {
            goto label_513;
        }
        catch(zzqy zzqy0) {
            zzqy1 = zzqy0;
            this.zzF(zzqy1, zzqy1.zza);
            goto label_566;
        }
        catch(zzbc zzbc0) {
            zzbc1 = zzbc0;
            goto label_547;
        }
        catch(zzfz zzfz0) {
            zzfz1 = zzfz0;
            this.zzF(zzfz1, zzfz1.zza);
            goto label_566;
        }
        catch(zztg zztg0) {
            zztg1 = zztg0;
            this.zzF(zztg1, 1002);
            goto label_566;
        }
        catch(IOException iOException0) {
            iOException1 = iOException0;
            this.zzF(iOException1, 2000);
            goto label_566;
        }
        catch(RuntimeException runtimeException0) {
            runtimeException1 = runtimeException0;
            goto label_562;
        }
        try {
        label_311:
            v30 = v26;
        label_312:
            v31 = this.zzw(zzug3, v30, this.zzy.zze == 4);
        }
        catch(Throwable throwable0) {
            throwable2 = throwable0;
            v33 = v26;
            this.zzy = this.zzA(zzug3, v33, v27, v33, ((boolean)v28), 2);
            throw throwable2;
        }
        try {
        label_313:
            v28 |= (v26 == v31 ? 0 : 1);
            this.zzag(this.zzy.zza, zzug3, this.zzy.zza, this.zzy.zzb, v27, true);
            v32 = v31;
            zzlb2 = this.zzA(zzug3, v32, v27, v32, ((boolean)v28), 2);
            this.zzy = zzlb2;
            goto label_566;
        }
        catch(Throwable throwable1) {
            try {
                v33 = v31;
                throwable2 = throwable1;
                this.zzy = this.zzA(zzug3, v33, v27, v33, ((boolean)v28), 2);
                throw throwable2;
            }
            catch(zzib zzib0) {
                goto label_513;
            }
            catch(zzqy zzqy0) {
                zzqy1 = zzqy0;
                this.zzF(zzqy1, zzqy1.zza);
                goto label_566;
            }
            catch(zzbc zzbc0) {
                zzbc1 = zzbc0;
                goto label_547;
            }
            catch(zzfz zzfz0) {
                zzfz1 = zzfz0;
                this.zzF(zzfz1, zzfz1.zza);
                goto label_566;
            }
            catch(zztg zztg0) {
                zztg1 = zztg0;
                this.zzF(zztg1, 1002);
                goto label_566;
            }
            catch(IOException iOException0) {
                iOException1 = iOException0;
                this.zzF(iOException1, 2000);
                goto label_566;
            }
            catch(RuntimeException runtimeException0) {
                runtimeException1 = runtimeException0;
                goto label_562;
            }
        }
        try {
            this.zzK = zzka0;
            v32 = v26;
            zzlb2 = this.zzA(zzug3, v32, v27, v32, ((boolean)v28), 2);
            this.zzy = zzlb2;
            goto label_566;
        }
        catch(Throwable throwable0) {
            try {
                throwable2 = throwable0;
                v33 = v26;
                this.zzy = this.zzA(zzug3, v33, v27, v33, ((boolean)v28), 2);
                throw throwable2;
            label_332:
                this.zzX(((zzbe)message0.obj));
                this.zzI(this.zzo.zzc(), true);
                goto label_566;
            label_337:
                this.zzab(false, true);
                goto label_566;
            label_339:
                zzue zzue0 = (zzue)message0.obj;
                if(this.zzr.zzs(zzue0)) {
                    zzkl zzkl14 = this.zzr.zzd();
                    if(zzkl14 == null) {
                        throw null;
                    }
                    if(!zzkl14.zze) {
                        zzkl14.zzl(this.zzo.zzc().zzb, this.zzy.zza, this.zzy.zzl);
                    }
                    this.zzae(zzkl14.zzg.zza, zzkl14.zzh(), zzkl14.zzi());
                    if(zzkl14 == this.zzr.zze()) {
                        this.zzT(zzkl14.zzg.zzb);
                        this.zzD();
                        this.zzy = this.zzA(this.zzy.zzb, zzkl14.zzg.zzb, this.zzy.zzc, zzkl14.zzg.zzb, false, 5);
                    }
                    this.zzK();
                }
                else {
                    zzkl zzkl15 = this.zzr.zzf(zzue0);
                    if(zzkl15 != null) {
                        zzcw.zzf(!zzkl15.zze);
                        zzkl15.zzl(this.zzo.zzc().zzb, this.zzy.zza, this.zzy.zzl);
                        if(this.zzr.zzt(zzue0)) {
                            this.zzL();
                            goto label_566;
                        label_360:
                            zzue zzue1 = (zzue)message0.obj;
                            if(this.zzr.zzs(zzue1)) {
                                this.zzr.zzo(this.zzL);
                                this.zzK();
                            }
                            else if(this.zzr.zzt(zzue1)) {
                                this.zzL();
                                goto label_566;
                            label_368:
                                this.zzP();
                                goto label_566;
                            label_370:
                                this.zzG = message0.arg1;
                                if(!this.zzr.zzx(this.zzy.zza, message0.arg1)) {
                                    this.zzW(true);
                                }
                                this.zzG(false);
                                goto label_566;
                            label_375:
                                this.zzH = message0.arg1 != 0;
                                if(!this.zzr.zzy(this.zzy.zza, message0.arg1 != 0)) {
                                    this.zzW(true);
                                }
                                this.zzG(false);
                                goto label_566;
                            label_380:
                                boolean z8 = message0.arg1 != 0;
                                AtomicBoolean atomicBoolean0 = (AtomicBoolean)message0.obj;
                                if(this.zzI != z8) {
                                    this.zzI = z8;
                                    if(!z8) {
                                        zzlo[] arr_zzlo6 = this.zzb;
                                        for(int v34 = 0; v34 < 2; ++v34) {
                                            zzlo zzlo3 = arr_zzlo6[v34];
                                            if(zzlo3.zza() == 0) {
                                                zzlo3.zzl();
                                            }
                                        }
                                    }
                                }
                                if(atomicBoolean0 != null) {
                                    synchronized(this) {
                                        atomicBoolean0.set(true);
                                        this.notifyAll();
                                    }
                                    goto label_566;
                                label_402:
                                    zzlf zzlf0 = (zzlf)message0.obj;
                                    if(zzlf0.zzb() == this.zzk) {
                                        zzkc.zzao(zzlf0);
                                        if(this.zzy.zze == 2 || this.zzy.zze == 3) {
                                            this.zzi.zzi(2);
                                        }
                                    }
                                    else {
                                        this.zzi.zzc(15, zzlf0).zza();
                                        goto label_566;
                                    label_410:
                                        zzlf zzlf1 = (zzlf)message0.obj;
                                        Looper looper0 = zzlf1.zzb();
                                        if(looper0.getThread().isAlive()) {
                                            this.zzq.zzd(looper0, null).zzh(() -> try {
                                                zzkc.zzao(zzlf1);
                                            }
                                            catch(zzib zzib0) {
                                                zzdo.zzd("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", zzib0);
                                                throw new RuntimeException(zzib0);
                                            });
                                            goto label_566;
                                        label_418:
                                            this.zzI(((zzbe)message0.obj), false);
                                            goto label_566;
                                        label_420:
                                            zzjw zzjw0 = (zzjw)message0.obj;
                                            this.zzz.zza(1);
                                            if(zzjw0.zzb != -1) {
                                                this.zzK = new zzka(new zzlh(zzjw0.zza, zzjw0.zzd), zzjw0.zzb, zzjw0.zzc);
                                            }
                                            this.zzH(this.zzs.zzn(zzjw0.zza, zzjw0.zzd), false);
                                            goto label_566;
                                        label_426:
                                            zzjw zzjw1 = (zzjw)message0.obj;
                                            int v36 = message0.arg1;
                                            this.zzz.zza(1);
                                            zzla zzla0 = this.zzs;
                                            if(v36 == -1) {
                                                v36 = zzla0.zza();
                                            }
                                            this.zzH(zzla0.zzk(v36, zzjw1.zza, zzjw1.zzd), false);
                                            goto label_566;
                                        label_434:
                                            zzjx zzjx0 = (zzjx)message0.obj;
                                            this.zzz.zza(1);
                                            this.zzH(this.zzs.zzl(0, 0, 0, null), false);
                                            goto label_566;
                                        label_438:
                                            int v37 = message0.arg1;
                                            int v38 = message0.arg2;
                                            zzwb zzwb0 = (zzwb)message0.obj;
                                            this.zzz.zza(1);
                                            this.zzH(this.zzs.zzm(v37, v38, zzwb0), false);
                                            goto label_566;
                                        label_444:
                                            zzwb zzwb1 = (zzwb)message0.obj;
                                            this.zzz.zza(1);
                                            this.zzH(this.zzs.zzo(zzwb1), false);
                                            goto label_566;
                                        label_448:
                                            this.zzH(this.zzs.zzb(), true);
                                            goto label_566;
                                        label_450:
                                            this.zzB = message0.arg1 != 0;
                                            this.zzS();
                                            if(this.zzC && this.zzr.zzh() != this.zzr.zze()) {
                                                this.zzW(true);
                                                this.zzG(false);
                                                goto label_566;
                                            label_456:
                                                this.zzQ();
                                                goto label_566;
                                            label_458:
                                                this.zzQ();
                                                goto label_566;
                                            label_460:
                                                int v39 = message0.arg1;
                                                int v40 = message0.arg2;
                                                List list0 = (List)message0.obj;
                                                this.zzz.zza(1);
                                                this.zzH(this.zzs.zzc(v39, v40, list0), false);
                                                goto label_566;
                                            label_466:
                                                this.zzR = (zzil)message0.obj;
                                                this.zzr.zzq(this.zzy.zza, ((zzil)message0.obj));
                                                goto label_566;
                                            label_469:
                                                this.zzz.zza(1);
                                                this.zzR(false, false, false, true);
                                                this.zzg.zzc(this.zzu);
                                                this.zzZ((this.zzy.zza.zzo() ? 4 : 2));
                                                zzgy zzgy0 = this.zzh.zze();
                                                this.zzs.zzg(zzgy0);
                                                this.zzi.zzi(2);
                                                goto label_566;
                                            label_477:
                                                Object object1 = ((Pair)message0.obj).first;
                                                atomicBoolean1 = (AtomicBoolean)((Pair)message0.obj).second;
                                                zzlo[] arr_zzlo7 = this.zzb;
                                                for(int v41 = 0; v41 < 2; ++v41) {
                                                    arr_zzlo7[v41].zzq(object1);
                                                }
                                                if(atomicBoolean1 != null) {
                                                    __monitor_enter(this);
                                                    goto label_487;
                                                }
                                            }
                                        }
                                        else {
                                            zzdo.zzf("TAG", "Trying to send message on a dead thread.");
                                            zzlf1.zzh(false);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                goto label_566;
            }
            catch(zzib zzib0) {
                goto label_513;
            }
            catch(zzqy zzqy0) {
                zzqy1 = zzqy0;
                this.zzF(zzqy1, zzqy1.zza);
                goto label_566;
            }
            catch(zzbc zzbc0) {
                zzbc1 = zzbc0;
                goto label_547;
            }
            catch(zzfz zzfz0) {
                zzfz1 = zzfz0;
                this.zzF(zzfz1, zzfz1.zza);
                goto label_566;
            }
            catch(zztg zztg0) {
                zztg1 = zztg0;
                this.zzF(zztg1, 1002);
                goto label_566;
            }
            catch(IOException iOException0) {
                iOException1 = iOException0;
                this.zzF(iOException1, 2000);
                goto label_566;
            }
            catch(RuntimeException runtimeException0) {
                runtimeException1 = runtimeException0;
                goto label_562;
            }
        }
        try {
        label_487:
            atomicBoolean1.set(true);
            this.notifyAll();
        }
        catch(Throwable throwable3) {
            goto label_492;
        }
        try {
            __monitor_exit(this);
        }
        catch(zzib zzib0) {
            goto label_513;
        }
        catch(zzqy zzqy0) {
            zzqy1 = zzqy0;
            this.zzF(zzqy1, zzqy1.zza);
        }
        catch(zzbc zzbc0) {
            zzbc1 = zzbc0;
            goto label_547;
        }
        catch(zzfz zzfz0) {
            zzfz1 = zzfz0;
            this.zzF(zzfz1, zzfz1.zza);
        }
        catch(zztg zztg0) {
            zztg1 = zztg0;
            this.zzF(zztg1, 1002);
        }
        catch(IOException iOException0) {
            iOException1 = iOException0;
            this.zzF(iOException1, 2000);
        }
        catch(RuntimeException runtimeException0) {
            runtimeException1 = runtimeException0;
            goto label_562;
        }
        try {
            goto label_566;
        }
        catch(Throwable throwable3) {
            try {
            label_492:
                __monitor_exit(this);
                throw throwable3;
            label_513:
                zzib1 = zzib0;
                if(zzib1.zzc == 1) {
                    goto label_515;
                }
                goto label_518;
            }
            catch(zzib zzib0) {
                goto label_513;
            }
            catch(zzqy zzqy0) {
                zzqy1 = zzqy0;
                this.zzF(zzqy1, zzqy1.zza);
                goto label_566;
            }
            catch(zzbc zzbc0) {
                zzbc1 = zzbc0;
                goto label_547;
            }
            catch(zzfz zzfz0) {
                zzfz1 = zzfz0;
                this.zzF(zzfz1, zzfz1.zza);
                goto label_566;
            }
            catch(zztg zztg0) {
                zztg1 = zztg0;
                this.zzF(zztg1, 1002);
                goto label_566;
            }
            catch(IOException iOException0) {
                iOException1 = iOException0;
                this.zzF(iOException1, 2000);
                goto label_566;
            }
            catch(RuntimeException runtimeException0) {
                runtimeException1 = runtimeException0;
                goto label_562;
            }
        }
    label_515:
        zzkl zzkl16 = this.zzr.zzh();
        if(zzkl16 != null) {
            zzib1 = zzib1.zza(zzkl16.zzg.zza);
        }
    label_518:
        if(!zzib1.zzi || this.zzP != null && (zzib1.zza != 5003 && zzib1.zza != 5004)) {
            zzib zzib3 = this.zzP;
            if(zzib3 != null) {
                zzib3.addSuppressed(zzib1);
                zzib1 = this.zzP;
            }
            zzdo.zzd("ExoPlayerImplInternal", "Playback error", zzib1);
            if(zzib1.zzc == 1 && this.zzr.zze() != this.zzr.zzh()) {
                while(this.zzr.zze() != this.zzr.zzh()) {
                    this.zzr.zza();
                }
                zzkl zzkl17 = this.zzr.zze();
                zzkl17.getClass();
                this.zzM();
                this.zzy = this.zzA(zzkl17.zzg.zza, zzkl17.zzg.zzb, zzkl17.zzg.zzc, zzkl17.zzg.zzb, true, 0);
            }
            this.zzab(true, false);
            this.zzy = this.zzy.zzd(zzib1);
            goto label_566;
        label_547:
            if(zzbc1.zzb != 1) {
                v42 = 1000;
            }
            else if(!zzbc1.zza) {
                v42 = 3003;
            }
            else {
                v42 = 3001;
            }
            this.zzF(zzbc1, v42);
            goto label_566;
        label_562:
            zzib zzib4 = zzib.zzd(runtimeException1, (!(runtimeException1 instanceof IllegalStateException) && !(runtimeException1 instanceof IllegalArgumentException) ? 1000 : 1004));
            zzdo.zzd("ExoPlayerImplInternal", "Playback error", zzib4);
            this.zzab(true, false);
            this.zzy = this.zzy.zzd(zzib4);
        }
        else {
            zzdo.zzg("ExoPlayerImplInternal", "Recoverable renderer error", zzib1);
            zzib zzib2 = this.zzP;
            if(zzib2 == null) {
                this.zzP = zzib1;
            }
            else {
                zzib2.addSuppressed(zzib1);
                zzib1 = this.zzP;
            }
            zzdg zzdg0 = this.zzi.zzc(25, zzib1);
            this.zzi.zzk(zzdg0);
        }
    label_566:
        this.zzM();
        return true;
    }

    @CheckResult
    private final zzlb zzA(zzug zzug0, long v, long v1, long v2, boolean z, int v3) {
        zzyc zzyc2;
        zzwj zzwj1;
        List list1;
        this.zzO = this.zzO || v != this.zzy.zzs || !zzug0.equals(this.zzy.zzb);
        this.zzS();
        zzwj zzwj0 = this.zzy.zzh;
        zzyc zzyc0 = this.zzy.zzi;
        List list0 = this.zzy.zzj;
        if(this.zzs.zzj()) {
            zzkl zzkl0 = this.zzr.zze();
            zzwj0 = zzkl0 == null ? zzwj.zza : zzkl0.zzh();
            zzyc0 = zzkl0 == null ? this.zzf : zzkl0.zzi();
            zzxv[] arr_zzxv = zzyc0.zzc;
            zzfxk zzfxk0 = new zzfxk();
            boolean z1 = false;
            for(int v5 = 0; v5 < arr_zzxv.length; ++v5) {
                zzxv zzxv0 = arr_zzxv[v5];
                if(zzxv0 != null) {
                    zzay zzay0 = zzxv0.zze(0).zzl;
                    if(zzay0 == null) {
                        zzfxk0.zzf(new zzay(0x8000000000000001L, new zzax[0]));
                    }
                    else {
                        zzfxk0.zzf(zzay0);
                        z1 = true;
                    }
                }
            }
            zzfxn zzfxn0 = z1 ? zzfxk0.zzi() : zzfxn.zzn();
            if(zzkl0 != null) {
                zzkm zzkm0 = zzkl0.zzg;
                if(zzkm0.zzc != v1) {
                    zzkl0.zzg = zzkm0.zza(v1);
                }
            }
            zzkl zzkl1 = this.zzr.zze();
            if(zzkl1 != null) {
                zzyc zzyc1 = zzkl1.zzi();
                for(int v4 = 0; v4 < 2; ++v4) {
                    if(zzyc1.zzb(v4)) {
                        if(this.zzb[v4].zzb() != 1) {
                            break;
                        }
                        zzln zzln0 = zzyc1.zzb[v4];
                    }
                }
            }
            list1 = zzfxn0;
            zzwj1 = zzwj0;
            zzyc2 = zzyc0;
        }
        else if(zzug0.equals(this.zzy.zzb)) {
            list1 = list0;
            zzwj1 = zzwj0;
            zzyc2 = zzyc0;
        }
        else {
            zzyc2 = this.zzf;
            zzwj1 = zzwj.zza;
            list1 = zzfxn.zzn();
        }
        if(z) {
            this.zzz.zzc(v3);
        }
        return this.zzy.zzb(zzug0, v, v1, v2, this.zzu(), zzwj1, zzyc2, list1);
    }

    private final void zzB(int v) {
        int v1 = this.zzb[v].zza();
        this.zzb[v].zzd(this.zzo);
        this.zzO(v, false);
        this.zzJ -= v1;
    }

    private final void zzC() {
        for(int v = 0; v < 2; ++v) {
            this.zzB(v);
        }
    }

    private final void zzD() throws zzib {
        long v = this.zzr.zzh().zzf();
        this.zzE(new boolean[2], v);
    }

    private final void zzE(boolean[] arr_z, long v) throws zzib {
        zzkl zzkl0 = this.zzr.zzh();
        zzyc zzyc0 = zzkl0.zzi();
        for(int v1 = 0; v1 < 2; ++v1) {
            if(!zzyc0.zzb(v1)) {
                this.zzb[v1].zzl();
            }
        }
        for(int v2 = 0; v2 < 2; ++v2) {
            if(zzyc0.zzb(v2)) {
                boolean z = arr_z[v2];
                zzkl zzkl1 = this.zzr.zzh();
                zzlo zzlo0 = this.zzb[v2];
                if(zzlo0.zza() <= 0) {
                    boolean z1 = zzkl1 == this.zzr.zze();
                    zzyc zzyc1 = zzkl1.zzi();
                    zzln zzln0 = zzyc1.zzb[v2];
                    zzab[] arr_zzab = zzkc.zzan(zzyc1.zzc[v2]);
                    boolean z2 = this.zzal() && this.zzy.zze == 3;
                    ++this.zzJ;
                    zzlo0.zze(zzln0, arr_zzab, zzkl1.zzc[v2], this.zzL, !z && z2, z1, v, zzkl1.zze(), zzkl1.zzg.zza, this.zzo);
                    zzlo0.zzg(11, new zzjv(this));
                    if(z2 && z1) {
                        zzlo0.zzr();
                    }
                }
            }
        }
        zzkl0.zzh = true;
    }

    private final void zzF(IOException iOException0, int v) {
        zzib zzib0 = zzib.zzc(iOException0, v);
        zzkl zzkl0 = this.zzr.zze();
        if(zzkl0 != null) {
            zzib0 = zzib0.zza(zzkl0.zzg.zza);
        }
        zzdo.zzd("ExoPlayerImplInternal", "Playback error", zzib0);
        this.zzab(false, false);
        this.zzy = this.zzy.zzd(zzib0);
    }

    private final void zzG(boolean z) {
        zzkl zzkl0 = this.zzr.zzd();
        zzug zzug0 = zzkl0 == null ? this.zzy.zzb : zzkl0.zzg.zza;
        boolean z1 = this.zzy.zzk.equals(zzug0);
        if(!z1) {
            this.zzy = this.zzy.zza(zzug0);
        }
        zzlb zzlb0 = this.zzy;
        zzlb0.zzq = zzkl0 == null ? zzlb0.zzs : zzkl0.zzc();
        this.zzy.zzr = this.zzu();
        if((!z1 || z) && zzkl0 != null && zzkl0.zze) {
            this.zzae(zzkl0.zzg.zza, zzkl0.zzh(), zzkl0.zzi());
        }
    }

    private final void zzH(zzbq zzbq0, boolean z) throws zzib {
        zzkc zzkc1;
        long v23;
        int v22;
        zzkl zzkl0;
        int v20;
        long v16;
        int v13;
        zzbp zzbp1;
        int v12;
        int v11;
        boolean z5;
        int v10;
        int v9;
        boolean z4;
        int v8;
        Object object1;
        long v7;
        int v6;
        zzbo zzbo1;
        zzug zzug2;
        int v15;
        long v4;
        int v3;
        int v2;
        boolean z2;
        long v1;
        zzug zzug0;
        zzkc zzkc0 = this;
        zzlb zzlb0 = zzkc0.zzy;
        zzka zzka0 = zzkc0.zzK;
        int v = zzkc0.zzG;
        boolean z1 = zzkc0.zzH;
        if(zzbq0.zzo()) {
            zzug0 = zzlb.zzh();
            v1 = 0x8000000000000001L;
            z2 = false;
            v2 = 1;
            v3 = 0;
            v4 = 0L;
        }
        else {
            zzbo zzbo0 = zzkc0.zzm;
            zzug zzug1 = zzlb0.zzb;
            Object object0 = zzug1.zza;
            boolean z3 = zzkc.zzak(zzlb0, zzbo0);
            long v5 = zzlb0.zzb.zzb() || z3 ? zzlb0.zzc : zzlb0.zzs;
            zzbp zzbp0 = zzkc0.zzl;
            if(zzka0 == null) {
                zzug2 = zzug1;
                zzbo1 = zzbo0;
                if(zzlb0.zza.zzo()) {
                    v12 = zzbq0.zzg(z1);
                    zzbp1 = zzbp0;
                    v7 = v5;
                    object1 = object0;
                    z5 = false;
                    v11 = 0;
                    v13 = 0;
                }
                else if(zzbq0.zza(object0) == -1) {
                    int v14 = zzkc.zzb(zzbp0, zzbo1, v, z1, object0, zzlb0.zza, zzbq0);
                    if(v14 == -1) {
                        v14 = zzbq0.zzg(z1);
                        v15 = 1;
                    }
                    else {
                        v15 = 0;
                    }
                    v12 = v14;
                    v11 = v15;
                    object1 = object0;
                    zzbp1 = zzbp0;
                    v7 = v5;
                    z5 = false;
                    v13 = 0;
                }
                else if(v5 == 0x8000000000000001L) {
                    v12 = zzbq0.zzn(object0, zzbo1).zzc;
                    object1 = object0;
                    zzbp1 = zzbp0;
                    v7 = 0x8000000000000001L;
                    z5 = false;
                    v11 = 0;
                    v13 = 0;
                }
                else if(z3) {
                    zzlb0.zza.zzn(zzug2.zza, zzbo1);
                    zzbp1 = zzbp0;
                    if(zzlb0.zza.zze(zzbo1.zzc, zzbp1, 0L).zzn == zzlb0.zza.zza(zzug2.zza)) {
                        Pair pair1 = zzbq0.zzl(zzbp1, zzbo1, zzbq0.zzn(object0, zzbo1).zzc, v5);
                        Object object3 = pair1.first;
                        v7 = (long)(((Long)pair1.second));
                        object1 = object3;
                    }
                    else {
                        object1 = object0;
                        v7 = v5;
                    }
                    v12 = -1;
                    z5 = false;
                    v11 = 0;
                    v13 = 1;
                }
                else {
                    zzbp1 = zzbp0;
                    object1 = object0;
                    v7 = v5;
                    z5 = false;
                    v11 = 0;
                    v13 = 0;
                    v12 = -1;
                }
            }
            else {
                zzug2 = zzug1;
                zzbo1 = zzbo0;
                Pair pair0 = zzkc.zzz(zzbq0, zzka0, true, v, z1, zzbp0, zzbo1);
                if(pair0 == null) {
                    v6 = zzbq0.zzg(z1);
                    v7 = v5;
                    object1 = object0;
                    v8 = 0;
                    z4 = false;
                    v9 = 1;
                }
                else {
                    if(zzka0.zzc == 0x8000000000000001L) {
                        v6 = zzbq0.zzn(pair0.first, zzbo1).zzc;
                        v7 = v5;
                        object1 = object0;
                        v10 = 0;
                    }
                    else {
                        Object object2 = pair0.first;
                        v7 = (long)(((Long)pair0.second));
                        object1 = object2;
                        v10 = 1;
                        v6 = -1;
                    }
                    z4 = zzlb0.zze == 4;
                    v8 = v10;
                    v9 = 0;
                }
                z5 = z4;
                v11 = v9;
                v12 = v6;
                zzbp1 = zzbp0;
                v13 = v8;
            }
            if(v12 == -1) {
                v16 = v7;
            }
            else {
                Pair pair2 = zzbq0.zzl(zzbp1, zzbo1, v12, 0x8000000000000001L);
                object1 = pair2.first;
                v16 = (long)(((Long)pair2.second));
                v7 = 0x8000000000000001L;
            }
            zzug zzug3 = zzkc0.zzr.zzk(zzbq0, object1, v16);
            int v17 = !zzug2.zza.equals(object1) || zzug2.zzb() || zzug3.zzb() || zzug3.zze != -1 && (zzug2.zze == -1 || zzug3.zze < zzug2.zze) ? 0 : 1;
            zzbq0.zzn(object1, zzbo1);
            if(!z3 && v5 == v7 && zzug2.zza.equals(zzug3.zza)) {
                boolean z6 = !zzug2.zzb();
                boolean z7 = !zzug3.zzb();
            }
            if(1 == v17) {
                zzug3 = zzug2;
            }
            if(zzug3.zzb()) {
                if(zzug3.equals(zzug2)) {
                    v16 = zzlb0.zzs;
                }
                else {
                    zzbq0.zzn(zzug3.zza, zzbo1);
                    v16 = 0L;
                }
            }
            v4 = v16;
            z2 = z5;
            v2 = v11;
            v3 = v13;
            zzug0 = zzug3;
            v1 = v7;
        }
        boolean z8 = !zzkc0.zzy.zzb.equals(zzug0) || v4 != zzkc0.zzy.zzs;
        int v18 = 3;
        try {
            if(v2 != 0) {
                if(zzkc0.zzy.zze != 1) {
                    zzkc0.zzZ(4);
                }
                zzkc0.zzR(false, false, false, true);
            }
            zzlo[] arr_zzlo = zzkc0.zzb;
            for(int v19 = 0; v19 < 2; ++v19) {
                arr_zzlo[v19].zzp(zzbq0);
            }
            if(z8) {
                goto label_197;
            }
            else {
                goto label_153;
            }
            goto label_231;
        }
        catch(Throwable throwable0) {
            v20 = v3;
            goto label_212;
        }
        try {
        label_153:
            zzko zzko0 = zzkc0.zzr;
            long v21 = zzkc0.zzL;
            zzkl0 = zzko0.zzh();
            if(zzkl0 == null) {
                v22 = v3;
                v23 = 0L;
            }
            else {
                v23 = zzkl0.zze();
                v22 = v3;
                goto label_167;
            }
            goto label_187;
        }
        catch(Throwable throwable0) {
            try {
                v22 = v3;
                zzkc1 = zzkc0;
            }
            catch(Throwable throwable0) {
            }
            zzkc0 = zzkc1;
            v20 = v22;
            goto label_212;
        }
    label_167:
        if(zzkl0.zze) {
            long v24 = v23;
            int v25 = 0;
            try {
                while(true) {
                    zzlo[] arr_zzlo1 = zzkc0.zzb;
                    if(v25 >= 2) {
                        v23 = v24;
                        goto label_187;
                    }
                    if(arr_zzlo1[v25].zzy(zzkl0)) {
                        long v26 = zzkc0.zzb[v25].zzc(zzkl0);
                        if(v26 == 0x8000000000000000L) {
                            break;
                        }
                        v24 = Math.max(v26, v24);
                    }
                    ++v25;
                    zzkc0 = this;
                }
                v23 = 0x8000000000000000L;
                goto label_187;
            }
            catch(Throwable throwable0) {
                zzkc0 = this;
                v20 = v22;
            }
        }
        else {
            try {
            label_187:
                if(zzko0.zzw(zzbq0, v21, v23)) {
                    zzkc1 = this;
                }
                else {
                    goto label_192;
                }
                goto label_231;
            }
            catch(Throwable throwable0) {
                try {
                    zzkc1 = this;
                    zzkc0 = zzkc1;
                    v20 = v22;
                    goto label_212;
                label_192:
                    zzkc1 = this;
                    zzkc1.zzW(false);
                    goto label_231;
                label_197:
                    v22 = v3;
                    zzkc1 = zzkc0;
                    if(!zzbq0.zzo()) {
                        for(zzkl zzkl1 = zzkc1.zzr.zze(); zzkl1 != null; zzkl1 = zzkl1.zzg()) {
                            if(zzkl1.zzg.zza.equals(zzug0)) {
                                zzkl1.zzg = zzkc1.zzr.zzj(zzbq0, zzkl1.zzg);
                                zzkl1.zzr();
                            }
                        }
                        v4 = zzkc1.zzw(zzug0, v4, z2);
                    }
                    goto label_231;
                }
                catch(Throwable throwable0) {
                    zzkc0 = zzkc1;
                    v20 = v22;
                }
            }
        }
    label_212:
        boolean z9 = true;
        this.zzag(zzbq0, zzug0, zzkc0.zzy.zza, zzkc0.zzy.zzb, (1 == v20 ? v4 : 0x8000000000000001L), false);
        if(z8 || v1 != zzkc0.zzy.zzc) {
            Object object4 = zzkc0.zzy.zzb.zza;
            zzbq zzbq1 = zzkc0.zzy.zza;
            if(!z8 || !z || zzbq1.zzo() || zzbq1.zzn(object4, zzkc0.zzm).zzf) {
                z9 = false;
            }
            long v27 = zzkc0.zzy.zzd;
            if(zzbq0.zza(object4) == -1) {
                v18 = 4;
            }
            zzkc0.zzy = this.zzA(zzug0, v4, v1, v27, z9, v18);
        }
        this.zzS();
        zzkc0.zzU(zzbq0, zzkc0.zzy.zza);
        zzkc0.zzy = zzkc0.zzy.zzf(zzbq0);
        if(!zzbq0.zzo()) {
            zzkc0.zzK = null;
        }
        zzkc0.zzG(false);
        zzkc0.zzi.zzi(2);
        throw throwable0;
    label_231:
        this.zzag(zzbq0, zzug0, zzkc1.zzy.zza, zzkc1.zzy.zzb, (1 == v22 ? v4 : 0x8000000000000001L), false);
        if(z8 || v1 != zzkc1.zzy.zzc) {
            Object object5 = zzkc1.zzy.zzb.zza;
            zzbq zzbq2 = zzkc1.zzy.zza;
            boolean z10 = z8 && z && !zzbq2.zzo() && !zzbq2.zzn(object5, zzkc1.zzm).zzf;
            long v28 = zzkc1.zzy.zzd;
            if(zzbq0.zza(object5) == -1) {
                v18 = 4;
            }
            zzkc1.zzy = this.zzA(zzug0, v4, v1, v28, z10, v18);
        }
        this.zzS();
        zzkc1.zzU(zzbq0, zzkc1.zzy.zza);
        zzkc1.zzy = zzkc1.zzy.zzf(zzbq0);
        if(!zzbq0.zzo()) {
            zzkc1.zzK = null;
        }
        zzkc1.zzG(false);
        zzkc1.zzi.zzi(2);
    }

    private final void zzI(zzbe zzbe0, boolean z) throws zzib {
        this.zzJ(zzbe0, zzbe0.zzb, true, z);
    }

    private final void zzJ(zzbe zzbe0, float f, boolean z, boolean z1) throws zzib {
        int v;
        if(z) {
            if(z1) {
                this.zzz.zza(1);
            }
            this.zzy = new zzlb(this.zzy.zza, this.zzy.zzb, this.zzy.zzc, this.zzy.zzd, this.zzy.zze, this.zzy.zzf, this.zzy.zzg, this.zzy.zzh, this.zzy.zzi, this.zzy.zzj, this.zzy.zzk, this.zzy.zzl, this.zzy.zzm, this.zzy.zzn, zzbe0, this.zzy.zzq, this.zzy.zzr, this.zzy.zzs, this.zzy.zzt, false);
        }
        for(zzkl zzkl0 = this.zzr.zze(); true; zzkl0 = zzkl0.zzg()) {
            v = 0;
            if(zzkl0 == null) {
                break;
            }
            zzxv[] arr_zzxv = zzkl0.zzi().zzc;
            while(v < arr_zzxv.length) {
                zzxv zzxv0 = arr_zzxv[v];
                ++v;
            }
        }
        zzlo[] arr_zzlo = this.zzb;
        while(v < 2) {
            arr_zzlo[v].zzo(f, zzbe0.zzb);
            ++v;
        }
    }

    private final void zzK() {
        boolean z;
        long v2;
        long v1;
        if(zzkc.zzap(this.zzr.zzd())) {
            zzkl zzkl0 = this.zzr.zzd();
            long v = this.zzv(zzkl0.zzd());
            if(zzkl0 == this.zzr.zze()) {
                v1 = this.zzL;
                v2 = zzkl0.zze();
            }
            else {
                v1 = this.zzL - zzkl0.zze();
                v2 = zzkl0.zzg.zzb;
            }
            long v3 = this.zzam(this.zzy.zza, zzkl0.zzg.zza) ? this.zzT.zzb() : 0x8000000000000001L;
            zzbq zzbq0 = this.zzy.zza;
            zzug zzug0 = zzkl0.zzg.zza;
            zzbe zzbe0 = this.zzo.zzc();
            zzkf zzkf0 = new zzkf(this.zzu, zzbq0, zzug0, v1 - v2, v, zzbe0.zzb, this.zzy.zzl, this.zzD, v3);
            boolean z1 = this.zzg.zzh(zzkf0);
            zzkl zzkl1 = this.zzr.zze();
            if(z1 || !zzkl1.zze || v >= 500000L || this.zzn <= 0L) {
                z = z1;
            }
            else {
                zzkl1.zza.zzj(this.zzy.zzs, false);
                z = this.zzg.zzh(zzkf0);
            }
        }
        else {
            z = false;
        }
        this.zzF = z;
        if(z) {
            zzkl zzkl2 = this.zzr.zzd();
            zzkl2.getClass();
            zzkh zzkh0 = new zzkh();
            zzkh0.zze(this.zzL - zzkl2.zze());
            zzkh0.zzf(this.zzo.zzc().zzb);
            zzkh0.zzd(this.zzE);
            zzkl2.zzk(new zzkj(zzkh0, null));
        }
        this.zzad();
    }

    private final void zzL() {
        this.zzr.zzn();
        zzkl zzkl0 = this.zzr.zzg();
        if(zzkl0 != null && (!zzkl0.zzd || zzkl0.zze) && !zzkl0.zza.zzp()) {
            zzbq zzbq0 = this.zzy.zza;
            zzug zzug0 = zzkl0.zzg.zza;
            long v = zzkl0.zze ? zzkl0.zza.zzb() : 0L;
            if(this.zzg.zzi(zzbq0, zzug0, v)) {
                if(!zzkl0.zzd) {
                    zzkl0.zzm(this, zzkl0.zzg.zzb);
                    return;
                }
                zzkh zzkh0 = new zzkh();
                zzkh0.zze(this.zzL - zzkl0.zze());
                zzkh0.zzf(this.zzo.zzc().zzb);
                zzkh0.zzd(this.zzE);
                zzkl0.zzk(new zzkj(zzkh0, null));
            }
        }
    }

    private final void zzM() {
        this.zzz.zzb(this.zzy);
        if(this.zzz.zze) {
            this.zzS.zza.zzN(this.zzz);
            this.zzz = new zzjz(this.zzy);
        }
    }

    private final void zzN(int v) throws IOException, zzib {
        zzlo zzlo0 = this.zzb[v];
        try {
            zzlo0.zzh();
        }
        catch(IOException | RuntimeException iOException0) {
            zzlo0.zzb();
            throw iOException0;
        }
    }

    private final void zzO(int v, boolean z) {
        boolean[] arr_z = this.zzd;
        if(arr_z[v] != z) {
            arr_z[v] = z;
            zzjr zzjr0 = () -> {
                int v1 = this.zzb[v].zzb();
                this.zzv.zzI(v, v1, z);
            };
            this.zzw.zzh(zzjr0);
        }
    }

    private final void zzP() throws zzib {
        zzkl zzkl4;
        float f = this.zzo.zzc().zzb;
        zzkl zzkl0 = this.zzr.zze();
        zzkl zzkl1 = this.zzr.zzh();
        zzyc zzyc0 = null;
        int v = 1;
        while(zzkl0 != null && zzkl0.zze) {
            zzyc zzyc1 = zzkl0.zzj(f, this.zzy.zza, this.zzy.zzl);
            zzyc zzyc2 = zzkl0 == this.zzr.zze() ? zzyc1 : zzyc0;
            zzyc zzyc3 = zzkl0.zzi();
            int v1 = 0;
            if(zzyc3 != null && zzyc3.zzc.length == zzyc1.zzc.length) {
                int v2 = 0;
                while(v2 < zzyc1.zzc.length) {
                    if(!zzyc1.zza(zzyc3, v2)) {
                        goto label_22;
                    }
                    ++v2;
                }
                if(zzkl0 != zzkl1) {
                    v1 = 1;
                }
                v &= v1;
                zzkl0 = zzkl0.zzg();
                zzyc0 = zzyc2;
            }
            else {
            label_22:
                if(v == 0) {
                    this.zzr.zzu(zzkl0);
                    if(zzkl0.zze) {
                        zzkl0.zza(zzyc1, Math.max(zzkl0.zzg.zzb, this.zzL - zzkl0.zze()), false);
                    }
                }
                else {
                    zzkl zzkl2 = this.zzr.zze();
                    boolean z = this.zzr.zzu(zzkl2);
                    boolean[] arr_z = new boolean[2];
                    zzyc2.getClass();
                    long v3 = zzkl2.zzb(zzyc2, this.zzy.zzs, z, arr_z);
                    boolean z1 = this.zzy.zze != 4 && v3 != this.zzy.zzs;
                    zzkl zzkl3 = zzkl2;
                    this.zzy = this.zzA(this.zzy.zzb, v3, this.zzy.zzc, this.zzy.zzd, z1, 5);
                    if(z1) {
                        this.zzT(v3);
                    }
                    boolean[] arr_z1 = new boolean[2];
                    int v4 = 0;
                    while(true) {
                        zzlo[] arr_zzlo = this.zzb;
                        if(v4 >= 2) {
                            break;
                        }
                        int v5 = arr_zzlo[v4].zza();
                        arr_z1[v4] = 1 == v5;
                        if(v5 == 0) {
                            zzkl4 = zzkl3;
                        }
                        else {
                            zzkl4 = zzkl3;
                            if(!this.zzb[v4].zzy(zzkl4)) {
                                this.zzB(v4);
                            }
                            else if(arr_z[v4]) {
                                this.zzb[v4].zzm(this.zzL);
                            }
                        }
                        ++v4;
                        zzkl3 = zzkl4;
                    }
                    this.zzE(arr_z1, this.zzL);
                }
                this.zzG(true);
                if(this.zzy.zze == 4) {
                    break;
                }
                this.zzK();
                this.zzaf();
                this.zzi.zzi(2);
                if(true) {
                    break;
                }
            }
        }
    }

    private final void zzQ() throws zzib {
        this.zzP();
        this.zzW(true);
    }

    private final void zzR(boolean z, boolean z1, boolean z2, boolean z3) {
        zzug zzug1;
        zzbq zzbq1;
        long v4;
        long v3;
        this.zzi.zzf(2);
        zzib zzib0 = null;
        this.zzP = null;
        boolean z4 = true;
        this.zzah(false, true);
        this.zzo.zzi();
        this.zzL = 1000000000000L;
        try {
            this.zzC();
        }
        catch(RuntimeException runtimeException0) {
            zzdo.zzd("ExoPlayerImplInternal", "Disable failed.", runtimeException0);
        }
        if(z) {
            zzlo[] arr_zzlo = this.zzb;
            for(int v = 0; v < 2; ++v) {
                zzlo zzlo0 = arr_zzlo[v];
                try {
                    zzlo0.zzl();
                }
                catch(RuntimeException runtimeException1) {
                    zzdo.zzd("ExoPlayerImplInternal", "Reset failed.", runtimeException1);
                }
            }
        }
        this.zzJ = 0;
        zzug zzug0 = this.zzy.zzb;
        long v1 = this.zzy.zzs;
        long v2 = this.zzy.zzb.zzb() || zzkc.zzak(this.zzy, this.zzm) ? this.zzy.zzc : this.zzy.zzs;
        if(z1) {
            this.zzK = null;
            Pair pair0 = this.zzy(this.zzy.zza);
            zzug0 = (zzug)pair0.first;
            v1 = (long)(((Long)pair0.second));
            v2 = 0x8000000000000001L;
            if(!zzug0.equals(this.zzy.zzb)) {
                v3 = v1;
                v4 = 0x8000000000000001L;
                goto label_39;
            }
            goto label_36;
        }
        else {
        label_36:
            v3 = v1;
            v4 = v2;
            z4 = false;
        }
    label_39:
        this.zzr.zzl();
        this.zzF = false;
        zzbq zzbq0 = this.zzy.zza;
        if(!z2 || !(zzbq0 instanceof zzlh)) {
            zzbq1 = zzbq0;
            zzug1 = zzug0;
        }
        else {
            zzbq0 = ((zzlh)zzbq0).zzx(this.zzs.zzq());
            if(zzug0.zzb == -1) {
                zzbq1 = zzbq0;
                zzug1 = zzug0;
            }
            else {
                zzbq0.zzn(zzug0.zza, this.zzm);
                zzbq0.zze(this.zzm.zzc, this.zzl, 0L);
                if(this.zzl.zzb()) {
                    zzbq1 = zzbq0;
                    zzug1 = new zzug(zzug0.zza, zzug0.zzd);
                }
                else {
                    zzbq1 = zzbq0;
                    zzug1 = zzug0;
                }
            }
        }
        zzlb zzlb0 = this.zzy;
        int v5 = zzlb0.zze;
        if(!z3) {
            zzib0 = zzlb0.zzf;
        }
        zzwj zzwj0 = z4 ? zzwj.zza : zzlb0.zzh;
        zzyc zzyc0 = z4 ? this.zzf : zzlb0.zzi;
        List list0 = z4 ? zzfxn.zzn() : zzlb0.zzj;
        this.zzy = new zzlb(zzbq1, zzug1, v4, v3, v5, zzib0, false, zzwj0, zzyc0, list0, zzug1, this.zzy.zzl, this.zzy.zzm, this.zzy.zzn, this.zzy.zzo, v3, 0L, v3, 0L, false);
        if(z2) {
            this.zzr.zzp();
            this.zzs.zzh();
        }
    }

    private final void zzS() {
        zzkl zzkl0 = this.zzr.zze();
        this.zzC = zzkl0 != null && zzkl0.zzg.zzh && this.zzB;
    }

    private final void zzT(long v) throws zzib {
        zzkl zzkl0 = this.zzr.zze();
        long v1 = v + (zzkl0 == null ? 1000000000000L : zzkl0.zze());
        this.zzL = v1;
        this.zzo.zzf(v1);
        zzlo[] arr_zzlo = this.zzb;
        for(int v2 = 0; v2 < 2; ++v2) {
            arr_zzlo[v2].zzm(this.zzL);
        }
        for(zzkl zzkl1 = this.zzr.zze(); zzkl1 != null; zzkl1 = zzkl1.zzg()) {
            zzxv[] arr_zzxv = zzkl1.zzi().zzc;
            for(int v3 = 0; v3 < arr_zzxv.length; ++v3) {
                zzxv zzxv0 = arr_zzxv[v3];
            }
        }
    }

    private final void zzU(zzbq zzbq0, zzbq zzbq1) {
        if(zzbq0.zzo() && zzbq1.zzo()) {
            return;
        }
        int v = this.zzp.size();
        if(v - 1 < 0) {
            Collections.sort(this.zzp);
            return;
        }
        zzjy zzjy0 = (zzjy)this.zzp.get(v - 1);
        throw null;
    }

    private final void zzV(long v) {
        long v1 = this.zzy.zze != 3 || this.zzal() ? zzkc.zza : 1000L;
        this.zzi.zzj(2, v + v1);
    }

    private final void zzW(boolean z) throws zzib {
        zzug zzug0 = this.zzr.zze().zzg.zza;
        long v = this.zzx(zzug0, this.zzy.zzs, true, false);
        if(v != this.zzy.zzs) {
            this.zzy = this.zzA(zzug0, v, this.zzy.zzc, this.zzy.zzd, z, 5);
        }
    }

    private final void zzX(zzbe zzbe0) {
        this.zzi.zzf(16);
        this.zzo.zzg(zzbe0);
    }

    private final void zzY(boolean z, int v, boolean z1, int v1) throws zzib {
        this.zzz.zza(((int)z1));
        this.zzy = this.zzy.zzc(z, v1, v);
        this.zzah(false, false);
        for(zzkl zzkl0 = this.zzr.zze(); zzkl0 != null; zzkl0 = zzkl0.zzg()) {
            zzxv[] arr_zzxv = zzkl0.zzi().zzc;
            for(int v2 = 0; v2 < arr_zzxv.length; ++v2) {
                zzxv zzxv0 = arr_zzxv[v2];
            }
        }
        if(!this.zzal()) {
            this.zzac();
            this.zzaf();
            return;
        }
        int v3 = this.zzy.zze;
        if(v3 == 3) {
            this.zzo.zzh();
            this.zzaa();
            this.zzi.zzi(2);
            return;
        }
        if(v3 == 2) {
            this.zzi.zzi(2);
        }
    }

    private final void zzZ(int v) {
        zzlb zzlb0 = this.zzy;
        if(zzlb0.zze != v) {
            if(v != 2) {
                this.zzQ = 0x8000000000000001L;
            }
            this.zzy = zzlb0.zze(v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzhz
    public final void zza(zzbe zzbe0) {
        this.zzi.zzc(16, zzbe0).zza();
    }

    private final void zzaa() throws zzib {
        zzkl zzkl0 = this.zzr.zze();
        if(zzkl0 != null) {
            zzyc zzyc0 = zzkl0.zzi();
            for(int v = 0; v < 2; ++v) {
                if(zzyc0.zzb(v)) {
                    this.zzb[v].zzr();
                }
            }
        }
    }

    private final void zzab(boolean z, boolean z1) {
        this.zzR(z || !this.zzI, false, true, false);
        this.zzz.zza(((int)z1));
        this.zzg.zze(this.zzu);
        this.zzZ(1);
    }

    private final void zzac() throws zzib {
        this.zzo.zzi();
        for(int v = 0; true; ++v) {
            zzlo[] arr_zzlo = this.zzb;
            if(v >= 2) {
                break;
            }
            arr_zzlo[v].zzs();
        }
    }

    private final void zzad() {
        zzkl zzkl0 = this.zzr.zzd();
        boolean z = this.zzF || zzkl0 != null && zzkl0.zza.zzp();
        zzlb zzlb0 = this.zzy;
        if(z != zzlb0.zzg) {
            this.zzy = new zzlb(zzlb0.zza, zzlb0.zzb, zzlb0.zzc, zzlb0.zzd, zzlb0.zze, zzlb0.zzf, z, zzlb0.zzh, zzlb0.zzi, zzlb0.zzj, zzlb0.zzk, zzlb0.zzl, zzlb0.zzm, zzlb0.zzn, zzlb0.zzo, zzlb0.zzq, zzlb0.zzr, zzlb0.zzs, zzlb0.zzt, false);
        }
    }

    private final void zzae(zzug zzug0, zzwj zzwj0, zzyc zzyc0) {
        long v1;
        long v;
        zzkl zzkl0 = this.zzr.zzd();
        zzkl0.getClass();
        if(zzkl0 == this.zzr.zze()) {
            v = this.zzL;
            v1 = zzkl0.zze();
        }
        else {
            v = this.zzL - zzkl0.zze();
            v1 = zzkl0.zzg.zzb;
        }
        long v2 = this.zzv(zzkl0.zzc());
        long v3 = this.zzam(this.zzy.zza, zzkl0.zzg.zza) ? this.zzT.zzb() : 0x8000000000000001L;
        zzbq zzbq0 = this.zzy.zza;
        zzbe zzbe0 = this.zzo.zzc();
        zzkf zzkf0 = new zzkf(this.zzu, zzbq0, zzug0, v - v1, v2, zzbe0.zzb, this.zzy.zzl, this.zzD, v3);
        this.zzg.zzf(zzkf0, zzwj0, zzyc0.zzc);
    }

    private final void zzaf() throws zzib {
        zzjy zzjy0;
        zzkl zzkl0 = this.zzr.zze();
        if(zzkl0 != null) {
            long v = zzkl0.zze ? zzkl0.zza.zzd() : 0x8000000000000001L;
            if(v == 0x8000000000000001L) {
                long v1 = this.zzo.zzb(zzkl0 != this.zzr.zzh());
                this.zzL = v1;
                long v2 = v1 - zzkl0.zze();
                long v3 = this.zzy.zzs;
                if(!this.zzp.isEmpty() && !this.zzy.zzb.zzb()) {
                    if(this.zzO) {
                        --v3;
                        this.zzO = false;
                    }
                    int v4 = this.zzy.zza.zza(this.zzy.zzb.zza);
                    int v5 = Math.min(this.zzN, this.zzp.size());
                    if(v5 > 0) {
                        zzjy0 = (zzjy)this.zzp.get(v5 - 1);
                        goto label_26;
                    }
                alab1:
                    while(true) {
                        zzjy0 = null;
                        while(true) {
                        label_26:
                            if(zzjy0 == null || v4 >= 0 && (v4 != 0 || v3 >= 0L)) {
                                break alab1;
                            }
                            if(v5 - 1 <= 0) {
                                --v5;
                                break;
                            }
                            zzjy0 = (zzjy)this.zzp.get(v5 - 2);
                            --v5;
                        }
                    }
                    if(v5 < this.zzp.size()) {
                        zzjy zzjy1 = (zzjy)this.zzp.get(v5);
                    }
                    this.zzN = v5;
                }
                if(this.zzo.zzj()) {
                    this.zzy = this.zzA(this.zzy.zzb, v2, this.zzy.zzc, v2, !this.zzz.zzc, 6);
                }
                else {
                    zzlb zzlb0 = this.zzy;
                    zzlb0.zzs = v2;
                    zzlb0.zzt = SystemClock.elapsedRealtime();
                }
            }
            else {
                if(!zzkl0.zzs()) {
                    this.zzr.zzu(zzkl0);
                    this.zzG(false);
                    this.zzK();
                }
                this.zzT(v);
                if(v != this.zzy.zzs) {
                    this.zzy = this.zzA(this.zzy.zzb, v, this.zzy.zzc, v, true, 5);
                }
            }
            zzlb zzlb1 = this.zzy;
            zzlb1.zzq = this.zzr.zzd().zzc();
            this.zzy.zzr = this.zzu();
            if(this.zzy.zzl && this.zzy.zze == 3 && this.zzam(this.zzy.zza, this.zzy.zzb)) {
                zzlb zzlb2 = this.zzy;
                if(zzlb2.zzo.zzb == 1.0f) {
                    long v6 = this.zzt(zzlb2.zza, zzlb2.zzb.zza, zzlb2.zzs);
                    float f = this.zzT.zza(v6, this.zzy.zzr);
                    if(this.zzo.zzc().zzb != f) {
                        this.zzX(new zzbe(f, this.zzy.zzo.zzc));
                        this.zzJ(this.zzy.zzo, this.zzo.zzc().zzb, false, false);
                    }
                }
            }
        }
    }

    private final void zzag(zzbq zzbq0, zzug zzug0, zzbq zzbq1, zzug zzug1, long v, boolean z) throws zzib {
        if(!this.zzam(zzbq0, zzug0)) {
            zzbe zzbe0 = zzug0.zzb() ? zzbe.zza : this.zzy.zzo;
            if(this.zzo.zzc().equals(zzbe0)) {
                return;
            }
            this.zzX(zzbe0);
            this.zzJ(this.zzy.zzo, zzbe0.zzb, false, false);
            return;
        }
        zzbq0.zze(zzbq0.zzn(zzug0.zza, this.zzm).zzc, this.zzl, 0L);
        this.zzT.zzd(this.zzl.zzj);
        if(v != 0x8000000000000001L) {
            long v1 = this.zzt(zzbq0, zzug0.zza, v);
            this.zzT.zze(v1);
            return;
        }
        Object object0 = this.zzl.zzb;
        if(Objects.equals((zzbq1.zzo() ? null : zzbq1.zze(zzbq1.zzn(zzug1.zza, this.zzm).zzc, this.zzl, 0L).zzb), object0) && !z) {
            return;
        }
        this.zzT.zze(0x8000000000000001L);
    }

    private final void zzah(boolean z, boolean z1) {
        this.zzD = z;
        this.zzE = !z || z1 ? 0x8000000000000001L : SystemClock.elapsedRealtime();
    }

    private final void zzai(zzfvf zzfvf0, long v) {
        synchronized(this) {
            long v2 = SystemClock.elapsedRealtime() + v;
            boolean z = false;
            while(!((Boolean)zzfvf0.zza()).booleanValue() && v > 0L) {
                try {
                    this.wait(v);
                }
                catch(InterruptedException unused_ex) {
                    z = true;
                }
                v = v2 - SystemClock.elapsedRealtime();
            }
            if(z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private final boolean zzaj() {
        zzkl zzkl0 = this.zzr.zze();
        long v = zzkl0.zzg.zze;
        return zzkl0.zze && (v == 0x8000000000000001L || this.zzy.zzs < v || !this.zzal());
    }

    // 去混淆评级： 低(20)
    private static boolean zzak(zzlb zzlb0, zzbo zzbo0) {
        return zzlb0.zza.zzo() || zzlb0.zza.zzn(zzlb0.zzb.zza, zzbo0).zzf;
    }

    private final boolean zzal() {
        return this.zzy.zzl && this.zzy.zzn == 0;
    }

    private final boolean zzam(zzbq zzbq0, zzug zzug0) {
        if(!zzug0.zzb() && !zzbq0.zzo()) {
            zzbq0.zze(zzbq0.zzn(zzug0.zza, this.zzm).zzc, this.zzl, 0L);
            return this.zzl.zzb() && (this.zzl.zzi && this.zzl.zzf != 0x8000000000000001L);
        }
        return false;
    }

    private static zzab[] zzan(zzxv zzxv0) {
        int v1 = zzxv0 == null ? 0 : zzxv0.zzd();
        zzab[] arr_zzab = new zzab[v1];
        for(int v = 0; v < v1; ++v) {
            arr_zzab[v] = zzxv0.zze(v);
        }
        return arr_zzab;
    }

    private static final void zzao(zzlf zzlf0) throws zzib {
        try {
            zzlf0.zzc().zzu(zzlf0.zza(), zzlf0.zzg());
        }
        finally {
            zzlf0.zzh(true);
        }
    }

    private static final boolean zzap(@Nullable zzkl zzkl0) {
        if(zzkl0 != null) {
            try {
                if(!zzkl0.zze) {
                    zzkl0.zza.zzk();
                    return zzkl0.zzd() != 0x8000000000000000L;
                }
                zzvy[] arr_zzvy = zzkl0.zzc;
                for(int v = 0; v < 2; ++v) {
                    zzvy zzvy0 = arr_zzvy[v];
                    if(zzvy0 != null) {
                        zzvy0.zzd();
                    }
                }
            }
            catch(IOException unused_ex) {
                return false;
            }
            return zzkl0.zzd() != 0x8000000000000000L;
        }
        return false;
    }

    static int zzb(zzbp zzbp0, zzbo zzbo0, int v, boolean z, Object object0, zzbq zzbq0, zzbq zzbq1) {
        Object object1 = zzbq0.zze(zzbq0.zzn(object0, zzbo0).zzc, zzbp0, 0L).zzb;
        for(int v1 = 0; v1 < zzbq1.zzc(); ++v1) {
            if(zzbq1.zze(v1, zzbp0, 0L).zzb.equals(object1)) {
                return v1;
            }
        }
        int v2 = zzbq0.zza(object0);
        int v3 = zzbq0.zzb();
        int v4 = v2;
        int v5 = -1;
        for(int v6 = 0; v6 < v3 && v5 == -1; ++v6) {
            v4 = zzbq0.zzi(v4, zzbo0, zzbp0, v, z);
            if(v4 == -1) {
                return -1;
            }
            v5 = zzbq1.zza(zzbq0.zzf(v4));
        }
        return v5 == -1 ? -1 : zzbq1.zzd(v5, zzbo0, false).zzc;
    }

    public final Looper zzc() {
        return this.zzk;
    }

    public static zzkl zzd(zzkc zzkc0, zzkm zzkm0, long v) {
        zzyk zzyk0 = zzkc0.zzg.zzk();
        return new zzkl(zzkc0.zzc, v, zzkc0.zze, zzyk0, zzkc0.zzs, zzkm0, zzkc0.zzf, 0x8000000000000001L);
    }

    // 检测为 Lambda 实现
    final Boolean zze() [...]

    // 检测为 Lambda 实现
    final void zzf(int v, boolean z) [...]

    @Override  // com.google.android.gms.internal.ads.zzvz
    public final void zzg(zzwa zzwa0) {
        this.zzi.zzc(9, ((zzue)zzwa0)).zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzkz
    public final void zzh() {
        this.zzi.zzf(2);
        this.zzi.zzi(22);
    }

    @Override  // com.google.android.gms.internal.ads.zzud
    public final void zzi(zzue zzue0) {
        this.zzi.zzc(8, zzue0).zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzya
    public final void zzj() {
        this.zzi.zzi(10);
    }

    public final void zzk() {
        this.zzi.zzb(29).zza();
    }

    public final void zzl(zzbq zzbq0, int v, long v1) {
        zzka zzka0 = new zzka(zzbq0, v, v1);
        this.zzi.zzc(3, zzka0).zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzld
    public final void zzm(zzlf zzlf0) {
        synchronized(this) {
            if(!this.zzA && this.zzk.getThread().isAlive()) {
                this.zzi.zzc(14, zzlf0).zza();
                return;
            }
            zzdo.zzf("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            zzlf0.zzh(false);
        }
    }

    public final void zzn(boolean z, int v, int v1) {
        this.zzi.zzd(1, ((int)z), v | v1 << 4).zza();
    }

    public final void zzo() {
        this.zzi.zzb(6).zza();
    }

    public final boolean zzp() {
        synchronized(this) {
            if(!this.zzA && this.zzk.getThread().isAlive()) {
                this.zzi.zzi(7);
                this.zzai(() -> Boolean.valueOf(this.zzA), this.zzt);
                return this.zzA;
            }
            return true;
        }
    }

    public final boolean zzq(@Nullable Object object0, long v) {
        synchronized(this) {
            if(!this.zzA && this.zzk.getThread().isAlive()) {
                AtomicBoolean atomicBoolean0 = new AtomicBoolean();
                Pair pair0 = new Pair(object0, atomicBoolean0);
                this.zzi.zzc(30, pair0).zza();
                if(v != 0x8000000000000001L) {
                    this.zzai(new zzjt(atomicBoolean0), v);
                    return atomicBoolean0.get();
                }
            }
            return true;
        }
    }

    public final void zzr(List list0, int v, long v1, zzwb zzwb0) {
        zzjw zzjw0 = new zzjw(list0, zzwb0, v, v1, null);
        this.zzi.zzc(17, zzjw0).zza();
    }

    // 检测为 Lambda 实现
    static final void zzs(zzlf zzlf0) [...]

    private final long zzt(zzbq zzbq0, Object object0, long v) {
        zzbq0.zze(zzbq0.zzn(object0, this.zzm).zzc, this.zzl, 0L);
        if(this.zzl.zzf != 0x8000000000000001L && this.zzl.zzb()) {
            zzbp zzbp0 = this.zzl;
            if(zzbp0.zzi) {
                return zzbp0.zzg == 0x8000000000000001L ? zzei.zzs(System.currentTimeMillis() - this.zzl.zzf) - v : zzei.zzs(zzbp0.zzg + SystemClock.elapsedRealtime() - this.zzl.zzf) - v;
            }
        }
        return 0x8000000000000001L;
    }

    private final long zzu() {
        return this.zzv(this.zzy.zzq);
    }

    private final long zzv(long v) {
        zzkl zzkl0 = this.zzr.zzd();
        return zzkl0 == null ? 0L : Math.max(0L, v - (this.zzL - zzkl0.zze()));
    }

    private final long zzw(zzug zzug0, long v, boolean z) throws zzib {
        return this.zzr.zze() == this.zzr.zzh() ? this.zzx(zzug0, v, false, z) : this.zzx(zzug0, v, true, z);
    }

    private final long zzx(zzug zzug0, long v, boolean z, boolean z1) throws zzib {
        this.zzac();
        this.zzah(false, true);
        if(z1 || this.zzy.zze == 3) {
            this.zzZ(2);
        }
        zzkl zzkl0 = this.zzr.zze();
        zzkl zzkl1;
        for(zzkl1 = zzkl0; zzkl1 != null && !zzug0.equals(zzkl1.zzg.zza); zzkl1 = zzkl1.zzg()) {
        }
        if(z || zzkl0 != zzkl1 || zzkl1 != null && zzkl1.zze() + v < 0L) {
            this.zzC();
            if(zzkl1 != null) {
                while(this.zzr.zze() != zzkl1) {
                    this.zzr.zza();
                }
                this.zzr.zzu(zzkl1);
                zzkl1.zzq(1000000000000L);
                this.zzD();
            }
        }
        if(zzkl1 == null) {
            this.zzr.zzl();
            this.zzT(v);
        }
        else {
            this.zzr.zzu(zzkl1);
            if(!zzkl1.zze) {
                zzkl1.zzg = zzkl1.zzg.zzb(v);
            }
            else if(zzkl1.zzf) {
                v = zzkl1.zza.zze(v);
                zzkl1.zza.zzj(v - this.zzn, false);
            }
            this.zzT(v);
            this.zzK();
        }
        this.zzG(false);
        this.zzi.zzi(2);
        return v;
    }

    private final Pair zzy(zzbq zzbq0) {
        if(zzbq0.zzo()) {
            return Pair.create(zzlb.zzh(), 0L);
        }
        int v = zzbq0.zzg(this.zzH);
        Pair pair0 = zzbq0.zzl(this.zzl, this.zzm, v, 0x8000000000000001L);
        zzug zzug0 = this.zzr.zzk(zzbq0, pair0.first, 0L);
        long v1 = (long)(((Long)pair0.second));
        if(zzug0.zzb()) {
            zzbq0.zzn(zzug0.zza, this.zzm);
            return Pair.create(zzug0, 0L);
        }
        return Pair.create(zzug0, v1);
    }

    @Nullable
    private static Pair zzz(zzbq zzbq0, zzka zzka0, boolean z, int v, boolean z1, zzbp zzbp0, zzbo zzbo0) {
        Pair pair0;
        zzbq zzbq1 = zzka0.zza;
        if(zzbq0.zzo()) {
            return null;
        }
        zzbq zzbq2 = zzbq1.zzo() ? zzbq0 : zzbq1;
        try {
            pair0 = zzbq2.zzl(zzbp0, zzbo0, zzka0.zzb, zzka0.zzc);
        }
        catch(IndexOutOfBoundsException unused_ex) {
            return null;
        }
        if(zzbq0.equals(zzbq2)) {
            return pair0;
        }
        if(zzbq0.zza(pair0.first) != -1) {
            return !zzbq2.zzn(pair0.first, zzbo0).zzf || zzbq2.zze(zzbo0.zzc, zzbp0, 0L).zzn != zzbq2.zza(pair0.first) ? pair0 : zzbq0.zzl(zzbp0, zzbo0, zzbq0.zzn(pair0.first, zzbo0).zzc, zzka0.zzc);
        }
        int v1 = zzkc.zzb(zzbp0, zzbo0, v, z1, pair0.first, zzbq2, zzbq0);
        return v1 == -1 ? null : zzbq0.zzl(zzbp0, zzbo0, v1, 0x8000000000000001L);
    }
}

