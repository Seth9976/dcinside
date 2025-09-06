package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import h4.d;
import j..util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

final class zzvk implements zzacq, zzue, zzvv, zzyq, zzyu {
    private zzadm zzA;
    private long zzB;
    private boolean zzC;
    private int zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private int zzH;
    private boolean zzI;
    private long zzJ;
    private long zzK;
    private boolean zzL;
    private int zzM;
    private boolean zzN;
    private boolean zzO;
    private final zzyk zzP;
    private static final Map zzb;
    private static final zzab zzc;
    private final Uri zzd;
    private final zzfy zze;
    private final zzrf zzf;
    private final zzuq zzg;
    private final zzra zzh;
    private final zzvg zzi;
    private final long zzj;
    private final long zzk;
    private final zzyy zzl;
    private final zzuz zzm;
    private final zzda zzn;
    private final Runnable zzo;
    private final Runnable zzp;
    private final Handler zzq;
    @Nullable
    private zzud zzr;
    @Nullable
    private zzafr zzs;
    private zzvx[] zzt;
    private zzvi[] zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private zzvj zzz;

    static {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("Icy-MetaData", "1");
        zzvk.zzb = DesugarCollections.unmodifiableMap(hashMap0);
        zzz zzz0 = new zzz();
        zzz0.zzM("icy");
        zzz0.zzaa("application/x-icy");
        zzvk.zzc = zzz0.zzag();
    }

    public zzvk(Uri uri0, zzfy zzfy0, zzuz zzuz0, zzrf zzrf0, zzra zzra0, zzyo zzyo0, zzuq zzuq0, zzvg zzvg0, zzyk zzyk0, @Nullable String s, int v, boolean z, long v1, @Nullable zzzg zzzg0) {
        this.zzd = uri0;
        this.zze = zzfy0;
        this.zzf = zzrf0;
        this.zzh = zzra0;
        this.zzg = zzuq0;
        this.zzi = zzvg0;
        this.zzP = zzyk0;
        this.zzj = (long)v;
        this.zzl = new zzyy("ProgressiveMediaPeriod");
        this.zzm = zzuz0;
        this.zzk = v1;
        this.zzn = new zzda(zzcx.zza);
        this.zzo = () -> if(!this.zzO && !this.zzw && this.zzv && this.zzA != null) {
            zzvx[] arr_zzvx = this.zzt;
            for(int v = 0; true; ++v) {
                if(v >= arr_zzvx.length) {
                    this.zzn.zzc();
                    int v1 = this.zzt.length;
                    zzbr[] arr_zzbr = new zzbr[v1];
                    boolean[] arr_z = new boolean[v1];
                    for(int v2 = 0; v2 < v1; ++v2) {
                        zzab zzab0 = this.zzt[v2].zzi();
                        zzab0.getClass();
                        boolean z = zzbb.zzg(zzab0.zzo);
                        boolean z1 = z || zzbb.zzi(zzab0.zzo);
                        arr_z[v2] = z1;
                        this.zzx |= z1;
                        this.zzy = this.zzk != 0x8000000000000001L && v1 == 1 && zzbb.zzh(zzab0.zzo);
                        zzafr zzafr0 = this.zzs;
                        if(zzafr0 != null) {
                            if(z || this.zzu[v2].zzb) {
                                zzay zzay0 = zzab0.zzl == null ? new zzay(0x8000000000000001L, new zzax[]{zzafr0}) : zzab0.zzl.zzc(new zzax[]{zzafr0});
                                zzz zzz0 = zzab0.zzb();
                                zzz0.zzT(zzay0);
                                zzab0 = zzz0.zzag();
                            }
                            if(z && zzab0.zzh == -1 && zzab0.zzi == -1) {
                                int v3 = zzafr0.zza;
                                if(v3 != -1) {
                                    zzz zzz1 = zzab0.zzb();
                                    zzz1.zzy(v3);
                                    zzab0 = zzz1.zzag();
                                }
                            }
                        }
                        zzab zzab1 = zzab0.zzc(this.zzf.zza(zzab0));
                        arr_zzbr[v2] = new zzbr(Integer.toString(v2), new zzab[]{zzab1});
                        this.zzG |= zzab1.zzu;
                    }
                    this.zzz = new zzvj(new zzwj(arr_zzbr), arr_z);
                    if(this.zzy && this.zzB == 0x8000000000000001L) {
                        this.zzB = this.zzk;
                        this.zzA = new zzve(this, this.zzA);
                    }
                    long v4 = this.zzB;
                    boolean z2 = this.zzA.zzh();
                    this.zzi.zza(v4, z2, this.zzC);
                    this.zzw = true;
                    zzud zzud0 = this.zzr;
                    zzud0.getClass();
                    zzud0.zzi(this);
                    break;
                }
                if(arr_zzvx[v].zzi() == null) {
                    break;
                }
            }
        };
        this.zzp = () -> if(!this.zzO) {
            zzud zzud0 = this.zzr;
            zzud0.getClass();
            zzud0.zzg(this);
        };
        this.zzq = zzei.zzy(null);
        this.zzu = new zzvi[0];
        this.zzt = new zzvx[0];
        this.zzK = 0x8000000000000001L;
        this.zzD = 1;
    }

    static void zzC(zzvk zzvk0) {
        zzva zzva0 = () -> zzvk0.zzI = true;
        zzvk0.zzq.post(zzva0);
    }

    @Override  // com.google.android.gms.internal.ads.zzacq
    public final void zzD() {
        this.zzv = true;
        this.zzq.post(this.zzo);
    }

    // 检测为 Lambda 实现
    final void zzE() [...]

    // 检测为 Lambda 实现
    final void zzF() [...]

    // 检测为 Lambda 实现
    final void zzG(zzadm zzadm0) [...]

    final void zzH() throws IOException {
        this.zzl.zzi(zzyo.zza(this.zzD));
    }

    final void zzI(int v) throws IOException {
        this.zzt[v].zzn();
        this.zzH();
    }

    @Override  // com.google.android.gms.internal.ads.zzyq
    public final void zzJ(zzyt zzyt0, long v, long v1, boolean z) {
        zzgx zzgx0 = ((zzvf)zzyt0).zzd;
        zztx zztx0 = new zztx(((zzvf)zzyt0).zzb, ((zzvf)zzyt0).zzl, zzgx0.zzh(), zzgx0.zzi(), v, v1, zzgx0.zzg());
        long v2 = this.zzB;
        zzuc zzuc0 = new zzuc(1, -1, null, 0, null, zzei.zzv(((zzvf)zzyt0).zzk), zzei.zzv(v2));
        this.zzg.zze(zztx0, zzuc0);
        if(!z) {
            zzvx[] arr_zzvx = this.zzt;
            for(int v3 = 0; v3 < arr_zzvx.length; ++v3) {
                arr_zzvx[v3].zzq(false);
            }
            if(this.zzH > 0) {
                zzud zzud0 = this.zzr;
                zzud0.getClass();
                zzud0.zzg(this);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzyq
    public final void zzK(zzyt zzyt0, long v, long v1) {
        if(this.zzB == 0x8000000000000001L) {
            zzadm zzadm0 = this.zzA;
            if(zzadm0 != null) {
                boolean z = zzadm0.zzh();
                long v2 = this.zzR(true);
                long v3 = v2 == 0x8000000000000000L ? 0L : v2 + 10000L;
                this.zzB = v3;
                this.zzi.zza(v3, z, this.zzC);
            }
        }
        zzgx zzgx0 = ((zzvf)zzyt0).zzd;
        zztx zztx0 = new zztx(((zzvf)zzyt0).zzb, ((zzvf)zzyt0).zzl, zzgx0.zzh(), zzgx0.zzi(), v, v1, zzgx0.zzg());
        long v4 = this.zzB;
        zzuc zzuc0 = new zzuc(1, -1, null, 0, null, zzei.zzv(((zzvf)zzyt0).zzk), zzei.zzv(v4));
        this.zzg.zzf(zztx0, zzuc0);
        this.zzN = true;
        zzud zzud0 = this.zzr;
        zzud0.getClass();
        zzud0.zzg(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzyu
    public final void zzL() {
        zzvx[] arr_zzvx = this.zzt;
        for(int v = 0; v < arr_zzvx.length; ++v) {
            arr_zzvx[v].zzp();
        }
        this.zzm.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzvv
    public final void zzM(zzab zzab0) {
        this.zzq.post(this.zzo);
    }

    public final void zzN() {
        if(this.zzw) {
            zzvx[] arr_zzvx = this.zzt;
            for(int v = 0; v < arr_zzvx.length; ++v) {
                arr_zzvx[v].zzo();
            }
        }
        this.zzl.zzj(this);
        this.zzq.removeCallbacksAndMessages(null);
        this.zzr = null;
        this.zzO = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzacq
    public final void zzO(zzadm zzadm0) {
        zzvd zzvd0 = () -> {
            zzadm zzadm1 = this.zzs == null ? zzadm0 : new zzadl(0x8000000000000001L, 0L);
            this.zzA = zzadm1;
            this.zzB = zzadm0.zza();
            boolean z = false;
            int v = 1;
            if(!this.zzI && zzadm0.zza() == 0x8000000000000001L) {
                z = true;
            }
            this.zzC = z;
            if(z) {
                v = 7;
            }
            this.zzD = v;
            if(this.zzw) {
                long v1 = this.zzB;
                boolean z1 = zzadm0.zzh();
                this.zzi.zza(v1, z1, this.zzC);
                return;
            }
            this.zzU();
        };
        this.zzq.post(zzvd0);
    }

    // 去混淆评级： 低(20)
    final boolean zzP(int v) {
        return !this.zzZ() && this.zzt[v].zzy(this.zzN);
    }

    private final int zzQ() {
        zzvx[] arr_zzvx = this.zzt;
        int v1 = 0;
        for(int v = 0; v < arr_zzvx.length; ++v) {
            v1 += arr_zzvx[v].zzd();
        }
        return v1;
    }

    private final long zzR(boolean z) {
        long v1 = 0x8000000000000000L;
        for(int v = 0; true; ++v) {
            zzvx[] arr_zzvx = this.zzt;
            if(v >= arr_zzvx.length) {
                break;
            }
            if(z) {
                v1 = Math.max(v1, arr_zzvx[v].zzh());
            }
            else {
                zzvj zzvj0 = this.zzz;
                zzvj0.getClass();
                if(zzvj0.zzc[v]) {
                    v1 = Math.max(v1, arr_zzvx[v].zzh());
                }
            }
        }
        return v1;
    }

    private final zzadt zzS(zzvi zzvi0) {
        int v = this.zzt.length;
        for(int v1 = 0; v1 < v; ++v1) {
            if(zzvi0.equals(this.zzu[v1])) {
                return this.zzt[v1];
            }
        }
        if(this.zzv) {
            zzdo.zzf("ProgressiveMediaPeriod", "Extractor added new track (id=" + zzvi0.zza + ") after finishing tracks.");
            return new zzaci();
        }
        zzvx zzvx0 = new zzvx(this.zzP, this.zzf, this.zzh);
        zzvx0.zzv(this);
        zzvi[] arr_zzvi = (zzvi[])Arrays.copyOf(this.zzu, v + 1);
        arr_zzvi[v] = zzvi0;
        this.zzu = arr_zzvi;
        zzvx[] arr_zzvx = (zzvx[])Arrays.copyOf(this.zzt, v + 1);
        arr_zzvx[v] = zzvx0;
        this.zzt = arr_zzvx;
        return zzvx0;
    }

    @d({"trackState", "seekMap"})
    private final void zzT() {
        zzcw.zzf(this.zzw);
        this.zzz.getClass();
        this.zzA.getClass();
    }

    // 检测为 Lambda 实现
    private final void zzU() [...]

    private final void zzV(int v) {
        this.zzT();
        zzvj zzvj0 = this.zzz;
        boolean[] arr_z = zzvj0.zzd;
        if(!arr_z[v]) {
            zzab zzab0 = zzvj0.zza.zzb(v).zzb(0);
            zzuc zzuc0 = new zzuc(1, zzbb.zzb(zzab0.zzo), zzab0, 0, null, zzei.zzv(this.zzJ), 0x8000000000000001L);
            this.zzg.zzd(zzuc0);
            arr_z[v] = true;
        }
    }

    private final void zzW(int v) {
        this.zzT();
        if(this.zzL && this.zzz.zzb[v] && !this.zzt[v].zzy(false)) {
            this.zzK = 0L;
            this.zzL = false;
            this.zzF = true;
            this.zzJ = 0L;
            this.zzM = 0;
            zzvx[] arr_zzvx = this.zzt;
            for(int v1 = 0; v1 < arr_zzvx.length; ++v1) {
                arr_zzvx[v1].zzq(false);
            }
            zzud zzud0 = this.zzr;
            zzud0.getClass();
            zzud0.zzg(this);
        }
    }

    private final void zzX() {
        zzvf zzvf0 = new zzvf(this, this.zzd, this.zze, this.zzm, this, this.zzn);
        if(this.zzw) {
            zzcw.zzf(this.zzY());
            if(this.zzB != 0x8000000000000001L && this.zzK > this.zzB) {
                this.zzN = true;
                this.zzK = 0x8000000000000001L;
                return;
            }
            zzadm zzadm0 = this.zzA;
            zzadm0.getClass();
            zzvf.zzf(zzvf0, zzadm0.zzg(this.zzK).zza.zzc, this.zzK);
            zzvx[] arr_zzvx = this.zzt;
            for(int v = 0; v < arr_zzvx.length; ++v) {
                arr_zzvx[v].zzu(this.zzK);
            }
            this.zzK = 0x8000000000000001L;
        }
        this.zzM = this.zzQ();
        zztx zztx0 = new zztx(zzvf0.zzb, zzvf0.zzl, this.zzl.zza(zzvf0, this, zzyo.zza(this.zzD)));
        long v1 = this.zzB;
        zzuc zzuc0 = new zzuc(1, -1, null, 0, null, zzei.zzv(zzvf0.zzk), zzei.zzv(v1));
        this.zzg.zzh(zztx0, zzuc0);
    }

    private final boolean zzY() {
        return this.zzK != 0x8000000000000001L;
    }

    // 去混淆评级： 低(20)
    private final boolean zzZ() {
        return this.zzF || this.zzY();
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zza(long v, zzlp zzlp0) {
        this.zzT();
        if(!this.zzA.zzh()) {
            return 0L;
        }
        zzadk zzadk0 = this.zzA.zzg(v);
        zzadn zzadn0 = zzadk0.zza;
        zzadn zzadn1 = zzadk0.zzb;
        long v1 = zzlp0.zzc;
        if(v1 == 0L) {
            if(zzlp0.zzd != 0L) {
                v1 = 0L;
                goto label_12;
            }
            return v;
        }
    label_12:
        long v2 = zzadn0.zzb;
        long v3 = v - v1;
        long v4 = v + zzlp0.zzd;
        long v5 = zzlp0.zzd ^ v4;
        if(((v ^ v1) & (v ^ v3)) < 0L) {
            v3 = 0x8000000000000000L;
        }
        if(((v ^ v4) & v5) < 0L) {
            v4 = 0x7FFFFFFFFFFFFFFFL;
        }
        boolean z = true;
        boolean z1 = v3 <= v2 && v2 <= v4;
        long v6 = zzadn1.zzb;
        if(v3 > v6 || v6 > v4) {
            z = false;
        }
        if(z1 && z) {
            return Math.abs(v2 - v) <= Math.abs(v6 - v) ? v2 : v6;
        }
        if(z1) {
            return v2;
        }
        return z ? v6 : v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zzb() {
        long v;
        this.zzT();
        if(!this.zzN && this.zzH != 0) {
            if(this.zzY()) {
                return this.zzK;
            }
            if(this.zzx) {
                v = 0x7FFFFFFFFFFFFFFFL;
                for(int v1 = 0; v1 < this.zzt.length; ++v1) {
                    if(this.zzz.zzb[v1] && this.zzz.zzc[v1] && !this.zzt[v1].zzx()) {
                        v = Math.min(v, this.zzt[v1].zzh());
                    }
                }
            }
            else {
                v = 0x7FFFFFFFFFFFFFFFL;
            }
            if(v == 0x7FFFFFFFFFFFFFFFL) {
                v = this.zzR(false);
            }
            return v == 0x8000000000000000L ? this.zzJ : v;
        }
        return 0x8000000000000000L;
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zzc() {
        return this.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zzd() {
        if(this.zzG) {
            this.zzG = false;
            return this.zzJ;
        }
        if(this.zzF && (this.zzN || this.zzQ() > this.zzM)) {
            this.zzF = false;
            return this.zzJ;
        }
        return 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zze(long v) {
        this.zzT();
        boolean[] arr_z = this.zzz.zzb;
        if(!this.zzA.zzh()) {
            v = 0L;
        }
        this.zzF = false;
        long v2 = this.zzJ;
        this.zzJ = v;
        if(this.zzY()) {
            this.zzK = v;
            return v;
        }
        if(this.zzD != 7 && (this.zzN || this.zzl.zzl())) {
            int v3 = 0;
            while(v3 < this.zzt.length) {
                zzvx zzvx0 = this.zzt[v3];
                if((zzvx0.zzb() != 0 || v2 != v) && (!(this.zzy ? zzvx0.zzz(zzvx0.zza()) : zzvx0.zzA(v, false)) && (arr_z[v3] || !this.zzx))) {
                    goto label_19;
                }
                ++v3;
            }
            return v;
        }
    label_19:
        this.zzL = false;
        this.zzK = v;
        this.zzN = false;
        this.zzG = false;
        zzyy zzyy0 = this.zzl;
        if(zzyy0.zzl()) {
            zzvx[] arr_zzvx = this.zzt;
            for(int v1 = 0; v1 < arr_zzvx.length; ++v1) {
                arr_zzvx[v1].zzk();
            }
            this.zzl.zzg();
            return v;
        }
        zzyy0.zzh();
        zzvx[] arr_zzvx1 = this.zzt;
        for(int v4 = 0; v4 < arr_zzvx1.length; ++v4) {
            arr_zzvx1[v4].zzq(false);
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final long zzf(zzxv[] arr_zzxv, boolean[] arr_z, zzvy[] arr_zzvy, boolean[] arr_z1, long v) {
        boolean z;
        this.zzT();
        zzwj zzwj0 = this.zzz.zza;
        boolean[] arr_z2 = this.zzz.zzc;
        int v1 = this.zzH;
        int v2 = 0;
        for(int v3 = 0; v3 < arr_zzxv.length; ++v3) {
            zzvy zzvy0 = arr_zzvy[v3];
            if(zzvy0 != null && (arr_zzxv[v3] == null || !arr_z[v3])) {
                int v4 = ((zzvh)zzvy0).zzb;
                zzcw.zzf(arr_z2[v4]);
                --this.zzH;
                arr_z2[v4] = false;
                arr_zzvy[v3] = null;
            }
        }
        if(!this.zzE) {
            z = v != 0L && !this.zzy;
        }
        else if(v1 == 0) {
            z = true;
        }
        else {
            z = false;
        }
        for(int v5 = 0; v5 < arr_zzxv.length; ++v5) {
            if(arr_zzvy[v5] == null) {
                zzxv zzxv0 = arr_zzxv[v5];
                if(zzxv0 != null) {
                    zzcw.zzf(zzxv0.zzd() == 1);
                    zzcw.zzf(zzxv0.zza(0) == 0);
                    int v6 = zzwj0.zza(zzxv0.zzg());
                    zzcw.zzf(!arr_z2[v6]);
                    ++this.zzH;
                    arr_z2[v6] = true;
                    boolean z1 = this.zzG;
                    this.zzG = zzxv0.zzf().zzu | z1;
                    arr_zzvy[v5] = new zzvh(this, v6);
                    arr_z1[v5] = true;
                    if(!z) {
                        zzvx zzvx0 = this.zzt[v6];
                        z = zzvx0.zzb() != 0 && !zzvx0.zzA(v, true);
                    }
                }
            }
        }
        if(this.zzH == 0) {
            this.zzL = false;
            this.zzF = false;
            this.zzG = false;
            if(this.zzl.zzl()) {
                zzvx[] arr_zzvx = this.zzt;
                while(v2 < arr_zzvx.length) {
                    arr_zzvx[v2].zzk();
                    ++v2;
                }
                this.zzl.zzg();
            }
            else {
                this.zzN = false;
                zzvx[] arr_zzvx1 = this.zzt;
                for(int v7 = 0; v7 < arr_zzvx1.length; ++v7) {
                    arr_zzvx1[v7].zzq(false);
                }
            }
        }
        else if(z) {
            v = this.zze(v);
            while(v2 < arr_zzvy.length) {
                if(arr_zzvy[v2] != null) {
                    arr_z1[v2] = true;
                }
                ++v2;
            }
        }
        this.zzE = true;
        return v;
    }

    final int zzg(int v, zzke zzke0, zzhh zzhh0, int v1) {
        if(this.zzZ()) {
            return -3;
        }
        this.zzV(v);
        int v2 = this.zzt[v].zze(zzke0, zzhh0, v1, this.zzN);
        if(v2 == -3) {
            this.zzW(v);
        }
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final zzwj zzh() {
        this.zzT();
        return this.zzz.zza;
    }

    final int zzi(int v, long v1) {
        if(this.zzZ()) {
            return 0;
        }
        this.zzV(v);
        zzvx zzvx0 = this.zzt[v];
        int v2 = zzvx0.zzc(v1, this.zzN);
        zzvx0.zzw(v2);
        if(v2 == 0) {
            this.zzW(v);
            return 0;
        }
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final void zzj(long v, boolean z) {
        if(!this.zzy) {
            this.zzT();
            if(!this.zzY()) {
                boolean[] arr_z = this.zzz.zzc;
                for(int v1 = 0; v1 < this.zzt.length; ++v1) {
                    this.zzt[v1].zzj(v, false, arr_z[v1]);
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final void zzk() throws IOException {
        this.zzH();
        if(this.zzN && !this.zzw) {
            throw zzbc.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final void zzl(zzud zzud0, long v) {
        this.zzr = zzud0;
        this.zzn.zze();
        this.zzX();
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final void zzm(long v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzue
    public final boolean zzo(zzkj zzkj0) {
        if(!this.zzN) {
            zzyy zzyy0 = this.zzl;
            if(!zzyy0.zzk() && !this.zzL && (!this.zzw || this.zzH != 0)) {
                boolean z = this.zzn.zze();
                if(!zzyy0.zzl()) {
                    this.zzX();
                    return true;
                }
                return z;
            }
        }
        return false;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzue
    public final boolean zzp() {
        return this.zzl.zzl() && this.zzn.zzd();
    }

    static long zzr(zzvk zzvk0, boolean z) {
        return zzvk0.zzR(true);
    }

    @Override  // com.google.android.gms.internal.ads.zzyq
    public final zzyr zzu(zzyt zzyt0, long v, long v1, IOException iOException0, int v2) {
        zzyr zzyr0;
        long v3;
        zzgx zzgx0 = ((zzvf)zzyt0).zzd;
        zztx zztx0 = new zztx(((zzvf)zzyt0).zzb, ((zzvf)zzyt0).zzl, zzgx0.zzh(), zzgx0.zzi(), v, v1, zzgx0.zzg());
        if(iOException0 instanceof zzbc || iOException0 instanceof FileNotFoundException || iOException0 instanceof zzgo || iOException0 instanceof zzyw) {
        label_10:
            v3 = 0x8000000000000001L;
        }
        else {
            Throwable throwable0 = iOException0;
            while(throwable0 != null) {
                if(throwable0 instanceof zzfz && ((zzfz)throwable0).zza == 2008) {
                    goto label_10;
                }
                throwable0 = throwable0.getCause();
            }
            v3 = (long)Math.min((v2 - 1) * 1000, 5000);
        }
        if(v3 == 0x8000000000000001L) {
            zzyr0 = zzyy.zzb;
        }
        else {
            int v4 = this.zzQ();
            boolean z = v4 > this.zzM;
            if(this.zzI || this.zzA != null && this.zzA.zza() != 0x8000000000000001L) {
                this.zzM = v4;
                zzyr0 = zzyy.zzb(z, v3);
            }
            else {
                boolean z1 = this.zzw;
                if(!z1 || this.zzZ()) {
                    this.zzF = z1;
                    this.zzJ = 0L;
                    this.zzM = 0;
                    zzvx[] arr_zzvx = this.zzt;
                    for(int v5 = 0; v5 < arr_zzvx.length; ++v5) {
                        arr_zzvx[v5].zzq(false);
                    }
                    zzvf.zzf(((zzvf)zzyt0), 0L, 0L);
                    zzyr0 = zzyy.zzb(z, v3);
                }
                else {
                    this.zzL = true;
                    zzyr0 = zzyy.zza;
                }
            }
        }
        boolean z2 = zzyr0.zzc();
        long v6 = this.zzB;
        zzuc zzuc0 = new zzuc(1, -1, null, 0, null, zzei.zzv(((zzvf)zzyt0).zzk), zzei.zzv(v6));
        this.zzg.zzg(zztx0, zzuc0, iOException0, !z2);
        return zzyr0;
    }

    final zzadt zzv() {
        return this.zzS(new zzvi(0, true));
    }

    @Override  // com.google.android.gms.internal.ads.zzacq
    public final zzadt zzw(int v, int v1) {
        return this.zzS(new zzvi(v, false));
    }
}

