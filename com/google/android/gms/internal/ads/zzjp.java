package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

final class zzjp extends zzg implements zzim {
    private boolean zzA;
    private zzlp zzB;
    private zzil zzC;
    private zzbg zzD;
    private zzav zzE;
    @Nullable
    private Object zzF;
    @Nullable
    private Surface zzG;
    private int zzH;
    private zzdz zzI;
    private int zzJ;
    private zze zzK;
    private float zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private int zzP;
    private zzav zzQ;
    private zzlb zzR;
    private int zzS;
    private long zzT;
    private final zzix zzU;
    private zzwb zzV;
    final zzyc zzb;
    final zzbg zzc;
    public static final int zzd;
    private final zzda zze;
    private final Context zzf;
    private final zzbk zzg;
    private final zzlj[] zzh;
    private final zzyb zzi;
    private final zzdh zzj;
    private final zzkc zzk;
    private final zzdn zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzbo zzn;
    private final List zzo;
    private final boolean zzp;
    private final zzlt zzq;
    private final Looper zzr;
    private final zzyj zzs;
    private final zzcx zzt;
    private final zzjl zzu;
    private final zzjm zzv;
    private final zzhq zzw;
    private final long zzx;
    private int zzy;
    private int zzz;

    static {
        zzas.zzb("media3.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public zzjp(zzik zzik0, @Nullable zzbk zzbk0) {
        zzog zzog0;
        zzda zzda0 = new zzda(zzcx.zza);
        this.zze = zzda0;
        try {
            zzdo.zze("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.5.0-beta01] [" + zzei.zze + "]");
            Context context0 = zzik0.zza.getApplicationContext();
            this.zzf = context0;
            zzlt zzlt0 = (zzlt)zzik0.zzh.apply(zzik0.zzb);
            this.zzq = zzlt0;
            this.zzP = zzik0.zzj;
            this.zzK = zzik0.zzk;
            this.zzH = zzik0.zzl;
            this.zzM = false;
            this.zzx = zzik0.zzp;
            zzjl zzjl0 = new zzjl(this, null);
            this.zzu = zzjl0;
            zzjm zzjm0 = new zzjm(null);
            this.zzv = zzjm0;
            Handler handler0 = new Handler(zzik0.zzi);
            zzlj[] arr_zzlj = ((zzid)zzik0.zzc).zza.zza(handler0, zzjl0, zzjl0, zzjl0, zzjl0);
            this.zzh = arr_zzlj;
            zzyb zzyb0 = (zzyb)zzik0.zze.zza();
            this.zzi = zzyb0;
            zzik.zza(((zzie)zzik0.zzd).zza);
            zzyn zzyn0 = zzyn.zzh(((zzih)zzik0.zzg).zza);
            this.zzs = zzyn0;
            this.zzp = zzik0.zzm;
            this.zzB = zzik0.zzn;
            Looper looper0 = zzik0.zzi;
            this.zzr = looper0;
            zzcx zzcx0 = zzik0.zzb;
            this.zzt = zzcx0;
            this.zzg = zzbk0;
            zzdn zzdn0 = new zzdn(looper0, zzcx0, new zziw(this));
            this.zzl = zzdn0;
            CopyOnWriteArraySet copyOnWriteArraySet0 = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet0;
            this.zzo = new ArrayList();
            this.zzV = new zzwb(0);
            this.zzC = zzil.zza;
            zzyc zzyc0 = new zzyc(new zzln[2], new zzxv[2], zzby.zza, null);
            this.zzb = zzyc0;
            this.zzn = new zzbo();
            zzbf zzbf0 = new zzbf();
            zzbf0.zzc(new int[]{1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 0x1F, 20, 30, 21, 35, 22, 24, 27, 28, 0x20});
            zzyb0.zzn();
            zzbf0.zzd(29, true);
            zzbf0.zzd(23, false);
            zzbf0.zzd(25, false);
            zzbf0.zzd(33, false);
            zzbf0.zzd(26, false);
            zzbf0.zzd(34, false);
            zzbg zzbg0 = zzbf0.zze();
            this.zzc = zzbg0;
            zzbf zzbf1 = new zzbf();
            zzbf1.zzb(zzbg0);
            zzbf1.zza(4);
            zzbf1.zza(10);
            this.zzD = zzbf1.zze();
            this.zzj = zzcx0.zzd(looper0, null);
            zzix zzix0 = new zzix(this);
            this.zzU = zzix0;
            this.zzR = zzlb.zzg(zzyc0);
            zzlt0.zzS(zzbk0, looper0);
            if(zzei.zza >= 0x1F) {
                boolean z = zzik0.zzq;
                String s = zzik0.zzs;
                zzoc zzoc0 = zzoc.zzb(context0);
                if(zzoc0 == null) {
                    zzdo.zzf("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    zzog0 = new zzog(LogSessionId.LOG_SESSION_ID_NONE, s);
                }
                else {
                    if(z) {
                        this.zzy(zzoc0);
                    }
                    zzog0 = new zzog(zzoc0.zza(), s);
                }
            }
            else {
                zzog0 = new zzog(zzik0.zzs);
            }
            this.zzk = new zzkc(arr_zzlj, zzyb0, zzyc0, ((zzkg)zzik0.zzf.zza()), zzyn0, 0, false, zzlt0, this.zzB, zzik0.zzt, zzik0.zzo, false, false, looper0, zzcx0, zzix0, zzog0, null, this.zzC);
            this.zzL = 1.0f;
            this.zzE = zzav.zza;
            this.zzQ = zzav.zza;
            this.zzS = -1;
            AudioManager audioManager0 = (AudioManager)context0.getSystemService("audio");
            this.zzJ = audioManager0 == null ? -1 : audioManager0.generateAudioSessionId();
            this.zzN = true;
            zzdn0.zzb(zzlt0);
            zzyn0.zzf(new Handler(looper0), zzlt0);
            copyOnWriteArraySet0.add(zzjl0);
            new zzhl(zzik0.zza, handler0, zzjl0);
            this.zzw = new zzhq(zzik0.zza, handler0, zzjl0);
            zzik0.zza.getApplicationContext();
            zzik0.zza.getApplicationContext();
            new zzo(0).zza();
            this.zzI = zzdz.zza;
            zzyb0.zzk(this.zzK);
            this.zzaa(1, 10, this.zzJ);
            this.zzaa(2, 10, this.zzJ);
            this.zzaa(1, 3, this.zzK);
            this.zzaa(2, 4, this.zzH);
            this.zzaa(2, 5, 0);
            this.zzaa(1, 9, Boolean.valueOf(this.zzM));
            this.zzaa(2, 7, zzjm0);
            this.zzaa(6, 8, zzjm0);
            this.zzaa(-1, 16, this.zzP);
        }
        catch(Throwable throwable0) {
            this.zze.zze();
            throw throwable0;
        }
        zzda0.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzim
    public final void zzA(zzlw zzlw0) {
        this.zzah();
        this.zzq.zzR(zzlw0);
    }

    @Override  // com.google.android.gms.internal.ads.zzim
    public final void zzB(zzui zzui0) {
        this.zzah();
        List list0 = Collections.singletonList(zzui0);
        this.zzah();
        this.zzah();
        this.zzR(this.zzR);
        this.zzk();
        ++this.zzy;
        boolean z = false;
        if(!this.zzo.isEmpty()) {
            int v = this.zzo.size();
            for(int v1 = v - 1; v1 >= 0; --v1) {
                this.zzo.remove(v1);
            }
            this.zzV = this.zzV.zzh(0, v);
        }
        ArrayList arrayList0 = new ArrayList();
        for(int v2 = 0; v2 < list0.size(); ++v2) {
            zzky zzky0 = new zzky(((zzui)list0.get(v2)), this.zzp);
            arrayList0.add(zzky0);
            zzjn zzjn0 = new zzjn(zzky0.zzb, zzky0.zza);
            this.zzo.add(v2, zzjn0);
        }
        this.zzV = this.zzV.zzg(0, arrayList0.size());
        zzlh zzlh0 = new zzlh(this.zzo, this.zzV);
        if(!zzlh0.zzo() && zzlh0.zzc() < 0) {
            throw new zzac(zzlh0, -1, 0x8000000000000001L);
        }
        int v3 = zzlh0.zzg(false);
        zzlb zzlb0 = this.zzY(this.zzR, zzlh0, this.zzX(zzlh0, v3, 0x8000000000000001L));
        zzlb zzlb1 = zzlb0.zze((v3 == -1 || zzlb0.zze == 1 || (zzlh0.zzo() || v3 >= zzlh0.zzc()) ? zzlb0.zze : 2));
        this.zzk.zzr(arrayList0, v3, zzei.zzs(0x8000000000000001L), this.zzV);
        if(!this.zzR.zzb.zza.equals(zzlb1.zzb.zza) && !this.zzR.zza.zzo()) {
            z = true;
        }
        this.zzaf(zzlb1, 0, z, 4, this.zzU(zzlb1), -1, false);
    }

    @Nullable
    public final zzib zzE() {
        this.zzah();
        return this.zzR.zzf;
    }

    static void zzK(zzjp zzjp0, SurfaceTexture surfaceTexture0) {
        Surface surface0 = new Surface(surfaceTexture0);
        zzjp0.zzac(surface0);
        zzjp0.zzG = surface0;
    }

    static void zzL(zzjp zzjp0, Object object0) {
        zzjp0.zzac(null);
    }

    final void zzN(zzjz zzjz0) {
        zziy zziy0 = () -> {
            long v3;
            int v = this.zzy - zzjz0.zzb;
            this.zzy = v;
            boolean z = true;
            if(zzjz0.zzc) {
                this.zzz = zzjz0.zzd;
                this.zzA = true;
            }
            if(v == 0) {
                zzbq zzbq0 = zzjz0.zza.zza;
                if(!this.zzR.zza.zzo() && zzbq0.zzo()) {
                    this.zzS = -1;
                    this.zzT = 0L;
                }
                if(!zzbq0.zzo()) {
                    List list0 = ((zzlh)zzbq0).zzw();
                    zzcw.zzf(list0.size() == this.zzo.size());
                    for(int v1 = 0; v1 < list0.size(); ++v1) {
                        ((zzjn)this.zzo.get(v1)).zzc(((zzbq)list0.get(v1)));
                    }
                }
                long v2 = 0x8000000000000001L;
                if(!this.zzA) {
                    z = false;
                }
                else if(zzjz0.zza.zzb.equals(this.zzR.zzb) && zzjz0.zza.zzd == this.zzR.zzs) {
                    z = false;
                }
                else {
                    if(zzbq0.zzo() || zzjz0.zza.zzb.zzb()) {
                        v3 = zzjz0.zza.zzd;
                    }
                    else {
                        v3 = zzjz0.zza.zzd;
                        this.zzW(zzbq0, zzjz0.zza.zzb, v3);
                    }
                    v2 = v3;
                }
                this.zzA = false;
                this.zzaf(zzjz0.zza, 1, z, this.zzz, v2, -1, false);
            }
        };
        this.zzj.zzh(zziy0);
    }

    // 检测为 Lambda 实现
    final void zzO(zzjz zzjz0) [...]

    // 检测为 Lambda 实现
    final void zzP(zzbh zzbh0) [...]

    // 去混淆评级： 低(20)
    private final int zzR(zzlb zzlb0) {
        return zzlb0.zza.zzo() ? this.zzS : zzlb0.zza.zzn(zzlb0.zzb.zza, this.zzn).zzc;
    }

    private static int zzS(int v) [...] // 潜在的解密器

    private final long zzT(zzlb zzlb0) {
        if(zzlb0.zzb.zzb()) {
            zzlb0.zza.zzn(zzlb0.zzb.zza, this.zzn);
            long v = zzlb0.zzc;
            if(v == 0x8000000000000001L) {
                int v1 = this.zzR(zzlb0);
                zzlb0.zza.zze(v1, this.zza, 0L);
                return zzei.zzv(0L);
            }
            return zzei.zzv(v) + zzei.zzv(0L);
        }
        return zzei.zzv(this.zzU(zzlb0));
    }

    private final long zzU(zzlb zzlb0) {
        if(zzlb0.zza.zzo()) {
            return zzei.zzs(this.zzT);
        }
        long v = zzlb0.zzs;
        if(zzlb0.zzb.zzb()) {
            return v;
        }
        this.zzW(zzlb0.zza, zzlb0.zzb, v);
        return v;
    }

    private static long zzV(zzlb zzlb0) {
        zzbp zzbp0 = new zzbp();
        zzbo zzbo0 = new zzbo();
        zzlb0.zza.zzn(zzlb0.zzb.zza, zzbo0);
        long v = zzlb0.zzc;
        if(v == 0x8000000000000001L) {
            v = 0L;
            zzlb0.zza.zze(zzbo0.zzc, zzbp0, 0L);
        }
        return v;
    }

    private final long zzW(zzbq zzbq0, zzug zzug0, long v) {
        zzbq0.zzn(zzug0.zza, this.zzn);
        return v;
    }

    @Nullable
    private final Pair zzX(zzbq zzbq0, int v, long v1) {
        if(zzbq0.zzo()) {
            this.zzS = v;
            if(v1 == 0x8000000000000001L) {
                v1 = 0L;
            }
            this.zzT = v1;
            return null;
        }
        if(v != -1 && v < zzbq0.zzc()) {
            return zzbq0.zzl(this.zza, this.zzn, v, zzei.zzs(v1));
        }
        v = zzbq0.zzg(false);
        zzbq0.zze(v, this.zza, 0L);
        v1 = zzei.zzv(0L);
        return zzbq0.zzl(this.zza, this.zzn, v, zzei.zzs(v1));
    }

    private final zzlb zzY(zzlb zzlb0, zzbq zzbq0, @Nullable Pair pair0) {
        zzcw.zzd(zzbq0.zzo() || pair0 != null);
        zzbq zzbq1 = zzlb0.zza;
        long v = this.zzT(zzlb0);
        zzlb zzlb1 = zzlb0.zzf(zzbq0);
        if(zzbq0.zzo()) {
            zzug zzug0 = zzlb.zzh();
            long v1 = zzei.zzs(this.zzT);
            zzlb zzlb2 = zzlb1.zzb(zzug0, v1, v1, v1, 0L, zzwj.zza, this.zzb, zzfxn.zzn()).zza(zzug0);
            zzlb2.zzq = zzlb2.zzs;
            return zzlb2;
        }
        Object object0 = zzlb1.zzb.zza;
        boolean z = object0.equals(pair0.first);
        zzug zzug1 = z ? zzlb1.zzb : new zzug(pair0.first, -1L);
        long v2 = (long)(((Long)pair0.second));
        long v3 = zzei.zzs(v);
        if(!zzbq1.zzo()) {
            zzbq1.zzn(object0, this.zzn);
        }
        if(z) {
            int v4 = Long.compare(v2, v3);
            if(v4 >= 0) {
                if(v4 != 0) {
                    goto label_28;
                }
                int v5 = zzbq0.zza(zzlb1.zzk.zza);
                if(v5 == -1 || zzbq0.zzd(v5, this.zzn, false).zzc != zzbq0.zzn(zzug1.zza, this.zzn).zzc) {
                    zzbq0.zzn(zzug1.zza, this.zzn);
                    long v6 = zzug1.zzb() ? this.zzn.zzf(zzug1.zzb, zzug1.zzc) : this.zzn.zzd;
                    zzlb1 = zzlb1.zzb(zzug1, zzlb1.zzs, zzlb1.zzs, zzlb1.zzd, v6 - zzlb1.zzs, zzlb1.zzh, zzlb1.zzi, zzlb1.zzj).zza(zzug1);
                    zzlb1.zzq = v6;
                    return zzlb1;
                label_28:
                    zzcw.zzf(!zzug1.zzb());
                    long v7 = Math.max(0L, zzlb1.zzr - (v2 - v3));
                    long v8 = zzlb1.zzk.equals(zzlb1.zzb) ? v2 + v7 : zzlb1.zzq;
                    zzlb1 = zzlb1.zzb(zzug1, v2, v2, v2, v7, zzlb1.zzh, zzlb1.zzi, zzlb1.zzj);
                    zzlb1.zzq = v8;
                    return zzlb1;
                }
            }
            else {
                goto label_34;
            }
        }
        else {
        label_34:
            zzcw.zzf(!zzug1.zzb());
            zzwj zzwj0 = z ? zzlb1.zzh : zzwj.zza;
            zzyc zzyc0 = z ? zzlb1.zzi : this.zzb;
            List list0 = z ? zzlb1.zzj : zzfxn.zzn();
            zzlb1 = zzlb1.zzb(zzug1, v2, v2, v2, 0L, zzwj0, zzyc0, list0).zza(zzug1);
            zzlb1.zzq = v2;
        }
        return zzlb1;
    }

    private final void zzZ(int v, int v1) {
        if(v == this.zzI.zzb() && v1 == this.zzI.zza()) {
            return;
        }
        this.zzI = new zzdz(v, v1);
        zzit zzit0 = new zzit(v, v1);
        this.zzl.zzd(24, zzit0);
        this.zzl.zzc();
        this.zzaa(2, 14, new zzdz(v, v1));
    }

    @Override  // com.google.android.gms.internal.ads.zzg
    public final void zza(int v, long v1, int v2, boolean z) {
        this.zzah();
        if(v != -1) {
            zzcw.zzd(v >= 0);
            zzbq zzbq0 = this.zzR.zza;
            if(zzbq0.zzo() || v < zzbq0.zzc()) {
                this.zzq.zzu();
                ++this.zzy;
                if(this.zzw()) {
                    zzdo.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                    zzjz zzjz0 = new zzjz(this.zzR);
                    zzjz0.zza(1);
                    this.zzU.zza.zzN(zzjz0);
                    return;
                }
                zzlb zzlb0 = this.zzR.zze != 3 && (this.zzR.zze != 4 || zzbq0.zzo()) ? this.zzR : this.zzR.zze(2);
                int v3 = this.zzd();
                zzlb zzlb1 = this.zzY(zzlb0, zzbq0, this.zzX(zzbq0, v, v1));
                this.zzk.zzl(zzbq0, v, zzei.zzs(v1));
                this.zzaf(zzlb1, 0, true, 1, this.zzU(zzlb1), v3, false);
            }
        }
    }

    private final void zzaa(int v, int v1, @Nullable Object object0) {
        zzlj[] arr_zzlj = this.zzh;
        for(int v2 = 0; v2 < 2; ++v2) {
            zzlj zzlj0 = arr_zzlj[v2];
            if(v == -1 || zzlj0.zzb() == v) {
                int v3 = this.zzR(this.zzR);
                zzlf zzlf0 = new zzlf(this.zzk, zzlj0, this.zzR.zza, (v3 == -1 ? 0 : v3), this.zzt, this.zzk.zzc());
                zzlf0.zzf(v1);
                zzlf0.zze(object0);
                zzlf0.zzd();
            }
        }
    }

    private final void zzab() {
        this.zzaa(1, 2, ((float)(this.zzL * this.zzw.zza())));
    }

    private final void zzac(@Nullable Object object0) {
        boolean z = this.zzk.zzq(object0, (this.zzF == null || this.zzF == object0 ? 0x8000000000000001L : this.zzx));
        this.zzF = object0;
        if(!z) {
            this.zzad(zzib.zzd(new zzkd(3), 1003));
        }
    }

    private final void zzad(@Nullable zzib zzib0) {
        zzlb zzlb0 = this.zzR.zza(this.zzR.zzb);
        zzlb0.zzq = zzlb0.zzs;
        zzlb0.zzr = 0L;
        zzlb zzlb1 = zzlb0.zze(1);
        if(zzib0 != null) {
            zzlb1 = zzlb1.zzd(zzib0);
        }
        ++this.zzy;
        this.zzk.zzo();
        this.zzaf(zzlb1, 0, false, 5, 0x8000000000000001L, -1, false);
    }

    private final void zzae(boolean z, int v, int v1) {
        int v2 = 0;
        boolean z1 = z && v != -1;
        if(v == 0) {
            v2 = 1;
        }
        zzlb zzlb0 = this.zzR;
        if(zzlb0.zzl == z1 && zzlb0.zzn == v2 && zzlb0.zzm == v1) {
            return;
        }
        ++this.zzy;
        zzlb zzlb1 = zzlb0.zzc(z1, v1, v2);
        this.zzk.zzn(z1, v1, v2);
        this.zzaf(zzlb1, 0, false, 5, 0x8000000000000001L, -1, false);
    }

    private final void zzaf(zzlb zzlb0, int v, boolean z, int v1, long v2, int v3, boolean z1) {
        boolean z18;
        boolean z17;
        boolean z13;
        boolean z12;
        boolean z9;
        Object object4;
        zzar zzar3;
        Object object3;
        int v20;
        long v18;
        long v17;
        int v16;
        int v15;
        zzar zzar2;
        Object object1;
        Object object0;
        int v14;
        int v13;
        zzav zzav0;
        zzar zzar0;
        boolean z5;
        int v6;
        boolean z4;
        boolean z3;
        int v5;
        Pair pair1;
        Pair pair0;
        zzlb zzlb1 = this.zzR;
        this.zzR = zzlb0;
        boolean z2 = zzlb1.zza.equals(zzlb0.zza);
        zzbq zzbq0 = zzlb1.zza;
        zzbq zzbq1 = zzlb0.zza;
        if(zzbq1.zzo() && zzbq0.zzo()) {
            pair0 = new Pair(Boolean.FALSE, -1);
            pair1 = pair0;
            v5 = v1;
            z3 = z;
        }
        else if(zzbq1.zzo() != zzbq0.zzo()) {
            pair0 = new Pair(Boolean.TRUE, 3);
            pair1 = pair0;
            v5 = v1;
            z3 = z;
        }
        else if(!zzbq0.zze(zzbq0.zzn(zzlb1.zzb.zza, this.zzn).zzc, this.zza, 0L).zzb.equals(zzbq1.zze(zzbq1.zzn(zzlb0.zzb.zza, this.zzn).zzc, this.zza, 0L).zzb)) {
            if(!z) {
                z4 = false;
                z5 = false;
            label_27:
                if(!z4 || v1 != 1) {
                    if(z2) {
                        throw new IllegalStateException();
                    }
                    v6 = 3;
                }
                else {
                    z4 = z5;
                    v6 = 2;
                }
                pair1 = new Pair(Boolean.TRUE, v6);
                v5 = v1;
                z3 = z4;
            }
            else if(v1 == 0) {
                v1 = 0;
                z4 = true;
                v6 = 1;
                pair1 = new Pair(Boolean.TRUE, v6);
                v5 = v1;
                z3 = z4;
            }
            else {
                z4 = true;
                z5 = true;
                goto label_27;
            }
        }
        else if(!z) {
            v5 = v1;
            z3 = false;
            pair1 = new Pair(Boolean.FALSE, -1);
        }
        else if(v1 != 0) {
            v5 = v1;
            z3 = true;
            pair1 = new Pair(Boolean.FALSE, -1);
        }
        else if(zzlb1.zzb.zzd < zzlb0.zzb.zzd) {
            pair1 = new Pair(Boolean.TRUE, 0);
            z3 = true;
            v5 = 0;
        }
        else {
            z3 = true;
            v5 = 0;
            pair1 = new Pair(Boolean.FALSE, -1);
        }
        boolean z6 = ((Boolean)pair1.first).booleanValue();
        int v7 = (int)(((Integer)pair1.second));
        if(z6) {
            if(zzlb0.zza.zzo()) {
                zzar0 = null;
            }
            else {
                zzbo zzbo0 = zzlb0.zza.zzn(zzlb0.zzb.zza, this.zzn);
                zzar0 = zzlb0.zza.zze(zzbo0.zzc, this.zza, 0L).zzd;
            }
            this.zzQ = zzav.zza;
        }
        else {
            zzar0 = null;
        }
        if(z6 || !zzlb1.zzj.equals(zzlb0.zzj)) {
            zzat zzat0 = this.zzQ.zza();
            List list0 = zzlb0.zzj;
            int v8 = 0;
            for(int v4 = 0; v8 < list0.size(); v4 = 0) {
                zzay zzay0 = (zzay)list0.get(v8);
                while(v4 < zzay0.zza()) {
                    zzay0.zzb(v4).zza(zzat0);
                    ++v4;
                }
                ++v8;
            }
            this.zzQ = zzat0.zzu();
        }
        zzbq zzbq2 = this.zzn();
        if(zzbq2.zzo()) {
            zzav0 = this.zzQ;
        }
        else {
            zzar zzar1 = zzbq2.zze(this.zzd(), this.zza, 0L).zzd;
            zzat zzat1 = this.zzQ.zza();
            zzat1.zzb(zzar1.zzd);
            zzav0 = zzat1.zzu();
        }
        boolean z7 = zzav0.equals(this.zzE);
        this.zzE = zzav0;
        boolean z8 = zzlb1.zzl != zzlb0.zzl;
        int v9 = zzlb1.zze == zzlb0.zze ? 0 : 1;
        if(v9 != 0 || z8) {
            this.zzag();
        }
        int v10 = zzlb1.zzg == zzlb0.zzg ? 0 : 1;
        if(!z2) {
            zzin zzin0 = new zzin(zzlb0, v);
            this.zzl.zzd(0, zzin0);
        }
        if(z3) {
            zzbo zzbo1 = new zzbo();
            if(zzlb1.zza.zzo()) {
                v13 = v9;
                v14 = v10;
                v15 = v3;
                object1 = null;
                zzar2 = null;
                object0 = null;
                v16 = -1;
            }
            else {
                zzlb1.zza.zzn(zzlb1.zzb.zza, zzbo1);
                int v11 = zzbo1.zzc;
                int v12 = zzlb1.zza.zza(zzlb1.zzb.zza);
                v13 = v9;
                v14 = v10;
                zzbp zzbp0 = zzlb1.zza.zze(v11, this.zza, 0L);
                object0 = zzlb1.zzb.zza;
                object1 = zzbp0.zzb;
                zzar2 = this.zza.zzd;
                v15 = v11;
                v16 = v12;
            }
            if(v5 != 0) {
                if(zzlb1.zzb.zzb()) {
                    v17 = zzlb1.zzs;
                    v18 = zzjp.zzV(zzlb1);
                }
                else {
                    v17 = zzlb1.zzs;
                    v18 = v17;
                }
            }
            else if(zzlb1.zzb.zzb()) {
                v17 = zzbo1.zzf(zzlb1.zzb.zzb, zzlb1.zzb.zzc);
                v18 = zzjp.zzV(zzlb1);
            }
            else {
                v17 = zzlb1.zzb.zze == -1 ? zzbo1.zzd : zzjp.zzV(this.zzR);
                v18 = v17;
            }
            zzbi zzbi0 = new zzbi(object1, v15, zzar2, object0, v16, zzei.zzv(v17), zzei.zzv(v18), zzlb1.zzb.zzb, zzlb1.zzb.zzc);
            int v19 = this.zzd();
            if(this.zzR.zza.zzo()) {
                object3 = null;
                zzar3 = null;
                object4 = null;
                v20 = -1;
            }
            else {
                Object object2 = this.zzR.zzb.zza;
                this.zzR.zza.zzn(object2, this.zzn);
                v20 = this.zzR.zza.zza(object2);
                object3 = this.zzR.zza.zze(v19, this.zza, 0L).zzb;
                zzar3 = this.zza.zzd;
                object4 = object2;
            }
            long v21 = zzei.zzv(v2);
            zzjd zzjd0 = new zzjd(v5, zzbi0, new zzbi(object3, v19, zzar3, object4, v20, v21, (this.zzR.zzb.zzb() ? zzei.zzv(zzjp.zzV(this.zzR)) : v21), this.zzR.zzb.zzb, this.zzR.zzb.zzc));
            this.zzl.zzd(11, zzjd0);
        }
        else {
            v13 = v9;
            v14 = v10;
        }
        if(z6) {
            zzje zzje0 = new zzje(zzar0, v7);
            z9 = true;
            this.zzl.zzd(1, zzje0);
        }
        else {
            z9 = true;
        }
        if(zzlb1.zzf != zzlb0.zzf) {
            zzjf zzjf0 = new zzjf(zzlb0);
            this.zzl.zzd(10, zzjf0);
            if(zzlb0.zzf != null) {
                zzjg zzjg0 = new zzjg(zzlb0);
                this.zzl.zzd(10, zzjg0);
            }
        }
        zzyc zzyc0 = zzlb0.zzi;
        if(zzlb1.zzi != zzyc0) {
            this.zzi.zzp(zzyc0.zze);
            zzjh zzjh0 = new zzjh(zzlb0);
            this.zzl.zzd(2, zzjh0);
        }
        if(!z7) {
            zzio zzio0 = new zzio(this.zzE);
            this.zzl.zzd(14, zzio0);
        }
        if(v14 != 0) {
            zzip zzip0 = new zzip(zzlb0);
            this.zzl.zzd(3, zzip0);
        }
        if(v13 != 0 || z8) {
            zziq zziq0 = new zziq(zzlb0);
            this.zzl.zzd(-1, zziq0);
        }
        if(v13 != 0) {
            zzir zzir0 = new zzir(zzlb0);
            this.zzl.zzd(4, zzir0);
        }
        if(z8 || zzlb1.zzm != zzlb0.zzm) {
            zziv zziv0 = new zziv(zzlb0);
            this.zzl.zzd(5, zziv0);
        }
        if(zzlb1.zzn != zzlb0.zzn) {
            zzja zzja0 = new zzja(zzlb0);
            this.zzl.zzd(6, zzja0);
        }
        if(zzlb1.zzi() != zzlb0.zzi()) {
            zzjb zzjb0 = new zzjb(zzlb0);
            this.zzl.zzd(7, zzjb0);
        }
        if(!zzlb1.zzo.equals(zzlb0.zzo)) {
            zzjc zzjc0 = new zzjc(zzlb0);
            this.zzl.zzd(12, zzjc0);
        }
        zzbg zzbg0 = this.zzD;
        zzbk zzbk0 = this.zzg;
        zzbg zzbg1 = this.zzc;
        boolean z10 = zzbk0.zzw();
        zzbq zzbq3 = ((zzg)zzbk0).zzn();
        boolean z11 = !zzbq3.zzo() && zzbq3.zze(((zzg)zzbk0).zzd(), ((zzg)zzbk0).zza, 0L).zzh;
        zzbq zzbq4 = ((zzg)zzbk0).zzn();
        if(zzbq4.zzo()) {
            z12 = false;
        }
        else {
            int v22 = ((zzg)zzbk0).zzd();
            ((zzg)zzbk0).zzh();
            ((zzg)zzbk0).zzv();
            z12 = zzbq4.zzk(v22, 0, false) == -1 ? false : true;
        }
        zzbq zzbq5 = ((zzg)zzbk0).zzn();
        if(zzbq5.zzo()) {
            z13 = false;
        }
        else {
            int v23 = ((zzg)zzbk0).zzd();
            ((zzg)zzbk0).zzh();
            ((zzg)zzbk0).zzv();
            z13 = zzbq5.zzj(v23, 0, false) == -1 ? false : true;
        }
        zzbq zzbq6 = ((zzg)zzbk0).zzn();
        boolean z14 = !zzbq6.zzo() && zzbq6.zze(((zzg)zzbk0).zzd(), ((zzg)zzbk0).zza, 0L).zzb();
        zzbq zzbq7 = ((zzg)zzbk0).zzn();
        boolean z15 = !zzbq7.zzo() && zzbq7.zze(((zzg)zzbk0).zzd(), ((zzg)zzbk0).zza, 0L).zzi;
        boolean z16 = zzbk0.zzn().zzo();
        zzbf zzbf0 = new zzbf();
        zzbf0.zzb(zzbg1);
        zzbf0.zzd(4, !z10);
        zzbf0.zzd(5, z11 && !z10);
        zzbf0.zzd(6, z12 && !z10);
        if(z16 || !z12 && z14 && !z11) {
            z17 = false;
        }
        else if(!z10) {
            z17 = true;
        }
        else {
            z17 = false;
        }
        zzbf0.zzd(7, z17);
        zzbf0.zzd(8, z13 && !z10);
        if(z16 || !z13 && (!z14 || !z15)) {
            z18 = false;
        }
        else if(!z10) {
            z18 = true;
        }
        else {
            z18 = false;
        }
        zzbf0.zzd(9, z18);
        zzbf0.zzd(10, !z10);
        zzbf0.zzd(11, z11 && !z10);
        if(!z11 || z10) {
            z9 = false;
        }
        zzbf0.zzd(12, z9);
        zzbg zzbg2 = zzbf0.zze();
        this.zzD = zzbg2;
        if(!zzbg2.equals(zzbg0)) {
            zziz zziz0 = (zzbh zzbh0) -> zzbh0.zza(this.zzD);
            this.zzl.zzd(13, zziz0);
        }
        this.zzl.zzc();
    }

    private final void zzag() {
        switch(this.zzf()) {
            case 2: 
            case 3: {
                this.zzah();
                this.zzu();
                this.zzu();
            }
        }
    }

    private final void zzah() {
        this.zze.zzb();
        if(Thread.currentThread() != this.zzr.getThread()) {
            Object[] arr_object = {"jeb-dexdec-sb-st-8739", this.zzr.getThread().getName()};
            String s = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: \'%s\'\nExpected thread: \'%s\'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", arr_object);
            if(this.zzN) {
                throw new IllegalStateException(s);
            }
            zzdo.zzg("ExoPlayerImpl", s, (this.zzO ? null : new IllegalStateException()));
            this.zzO = true;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbk
    public final int zzb() {
        this.zzah();
        return this.zzw() ? this.zzR.zzb.zzb : -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbk
    public final int zzc() {
        this.zzah();
        return this.zzw() ? this.zzR.zzb.zzc : -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbk
    public final int zzd() {
        this.zzah();
        int v = this.zzR(this.zzR);
        return v == -1 ? 0 : v;
    }

    @Override  // com.google.android.gms.internal.ads.zzbk
    public final int zze() {
        this.zzah();
        return this.zzR.zza.zzo() ? 0 : this.zzR.zza.zza(this.zzR.zzb.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzbk
    public final int zzf() {
        this.zzah();
        return this.zzR.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzbk
    public final int zzg() {
        this.zzah();
        return this.zzR.zzn;
    }

    @Override  // com.google.android.gms.internal.ads.zzbk
    public final int zzh() {
        this.zzah();
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbk
    public final long zzi() {
        this.zzah();
        if(this.zzw()) {
            return this.zzR.zzk.equals(this.zzR.zzb) ? zzei.zzv(this.zzR.zzq) : this.zzl();
        }
        this.zzah();
        if(this.zzR.zza.zzo()) {
            return this.zzT;
        }
        zzlb zzlb0 = this.zzR;
        long v = 0L;
        if(zzlb0.zzk.zzd != zzlb0.zzb.zzd) {
            int v1 = this.zzd();
            return zzei.zzv(zzlb0.zza.zze(v1, this.zza, 0L).zzm);
        }
        long v2 = zzlb0.zzq;
        if(this.zzR.zzk.zzb()) {
            this.zzR.zza.zzn(this.zzR.zzk.zza, this.zzn).zzg(this.zzR.zzk.zzb);
        }
        else {
            v = v2;
        }
        this.zzW(this.zzR.zza, this.zzR.zzk, v);
        return zzei.zzv(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzbk
    public final long zzj() {
        this.zzah();
        return this.zzT(this.zzR);
    }

    @Override  // com.google.android.gms.internal.ads.zzbk
    public final long zzk() {
        this.zzah();
        return zzei.zzv(this.zzU(this.zzR));
    }

    @Override  // com.google.android.gms.internal.ads.zzbk
    public final long zzl() {
        this.zzah();
        if(!this.zzw()) {
            zzbq zzbq0 = this.zzn();
            return zzbq0.zzo() ? 0x8000000000000001L : zzei.zzv(zzbq0.zze(this.zzd(), this.zza, 0L).zzm);
        }
        zzug zzug0 = this.zzR.zzb;
        this.zzR.zza.zzn(zzug0.zza, this.zzn);
        return zzei.zzv(this.zzn.zzf(zzug0.zzb, zzug0.zzc));
    }

    @Override  // com.google.android.gms.internal.ads.zzbk
    public final long zzm() {
        this.zzah();
        return zzei.zzv(this.zzR.zzr);
    }

    @Override  // com.google.android.gms.internal.ads.zzbk
    public final zzbq zzn() {
        this.zzah();
        return this.zzR.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzbk
    public final zzby zzo() {
        this.zzah();
        return this.zzR.zzi.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzbk
    public final void zzp() {
        this.zzah();
        boolean z = this.zzu();
        int v = 2;
        this.zzw.zzb(z, 2);
        this.zzae(z, 1, 1);
        zzlb zzlb0 = this.zzR;
        if(zzlb0.zze != 1) {
            return;
        }
        zzlb zzlb1 = zzlb0.zzd(null);
        if(zzlb1.zza.zzo()) {
            v = 4;
        }
        zzlb zzlb2 = zzlb1.zze(v);
        ++this.zzy;
        this.zzk.zzk();
        this.zzaf(zzlb2, 1, false, 5, 0x8000000000000001L, -1, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzbk
    public final void zzq(boolean z) {
        this.zzah();
        int v = this.zzf();
        this.zzw.zzb(z, v);
        this.zzae(z, 1, 1);
    }

    @Override  // com.google.android.gms.internal.ads.zzbk
    public final void zzr(@Nullable Surface surface0) {
        this.zzah();
        this.zzac(surface0);
        int v = surface0 == null ? 0 : -1;
        this.zzZ(v, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzbk
    public final void zzs(float f) {
        this.zzah();
        float f1 = Math.max(0.0f, Math.min(f, 1.0f));
        if(this.zzL == f1) {
            return;
        }
        this.zzL = f1;
        this.zzab();
        zzis zzis0 = new zzis(f1);
        this.zzl.zzd(22, zzis0);
        this.zzl.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzbk
    public final void zzt() {
        this.zzah();
        boolean z = this.zzu();
        this.zzw.zzb(z, 1);
        this.zzad(null);
        zzfxn.zzl(zzfxn.zzn());
    }

    @Override  // com.google.android.gms.internal.ads.zzbk
    public final boolean zzu() {
        this.zzah();
        return this.zzR.zzl;
    }

    @Override  // com.google.android.gms.internal.ads.zzbk
    public final boolean zzv() {
        this.zzah();
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzbk
    public final boolean zzw() {
        this.zzah();
        return this.zzR.zzb.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzim
    public final int zzx() {
        this.zzah();
        return 2;
    }

    @Override  // com.google.android.gms.internal.ads.zzim
    public final void zzy(zzlw zzlw0) {
        this.zzq.zzt(zzlw0);
    }

    @Override  // com.google.android.gms.internal.ads.zzim
    public final void zzz() {
        zzdo.zze("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.5.0-beta01] [" + zzei.zze + "] [" + "media3.common" + "]");
        this.zzah();
        this.zzw.zzd();
        if(!this.zzk.zzp()) {
            zziu zziu0 = new zziu();
            this.zzl.zzd(10, zziu0);
            this.zzl.zzc();
        }
        this.zzl.zze();
        this.zzj.zze(null);
        this.zzs.zzg(this.zzq);
        zzlb zzlb0 = this.zzR.zze(1);
        this.zzR = zzlb0;
        zzlb zzlb1 = zzlb0.zza(zzlb0.zzb);
        this.zzR = zzlb1;
        zzlb1.zzq = zzlb1.zzs;
        this.zzR.zzr = 0L;
        this.zzq.zzQ();
        this.zzi.zzj();
        Surface surface0 = this.zzG;
        if(surface0 != null) {
            surface0.release();
            this.zzG = null;
        }
    }
}

