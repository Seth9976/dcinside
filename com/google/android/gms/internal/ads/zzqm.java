package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack.Builder;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.exoplayer.audio.c0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzqm implements zzpm {
    private zzbe zzA;
    private boolean zzB;
    private long zzC;
    private long zzD;
    private long zzE;
    private long zzF;
    private int zzG;
    private boolean zzH;
    private boolean zzI;
    private long zzJ;
    private float zzK;
    @Nullable
    private ByteBuffer zzL;
    private int zzM;
    @Nullable
    private ByteBuffer zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private int zzS;
    private zzf zzT;
    @Nullable
    private zzoo zzU;
    private long zzV;
    private boolean zzW;
    private boolean zzX;
    @Nullable
    private Looper zzY;
    private long zzZ;
    private static final Object zza;
    private long zzaa;
    private Handler zzab;
    private final zzqc zzac;
    private final zzps zzad;
    @GuardedBy("releaseExecutorLock")
    @Nullable
    private static ScheduledExecutorService zzb;
    @GuardedBy("releaseExecutorLock")
    private static int zzc;
    @Nullable
    private final Context zzd;
    private final zzpr zze;
    private final zzqw zzf;
    private final zzfxn zzg;
    private final zzfxn zzh;
    private final zzpq zzi;
    private final ArrayDeque zzj;
    private zzqk zzk;
    private final zzqg zzl;
    private final zzqg zzm;
    private final zzpz zzn;
    @Nullable
    private zzog zzo;
    @Nullable
    private zzpj zzp;
    @Nullable
    private zzqb zzq;
    private zzqb zzr;
    private zzce zzs;
    @Nullable
    private AudioTrack zzt;
    private zzoi zzu;
    private zzon zzv;
    @Nullable
    private zzqf zzw;
    private zze zzx;
    @Nullable
    private zzqd zzy;
    private zzqd zzz;

    static {
        zzqm.zza = new Object();
    }

    zzqm(zzqa zzqa0, zzql zzql0) {
        Context context0 = zzqa0.zza;
        this.zzd = context0;
        this.zzx = zze.zza;
        this.zzu = context0 == null ? zzqa0.zzb : zzoi.zzc(context0, zze.zza, null);
        this.zzac = zzqa0.zzf;
        zzps zzps0 = zzqa0.zzg;
        zzps0.getClass();
        this.zzad = zzps0;
        this.zzi = new zzpq(new zzqh(this, null));
        zzpr zzpr0 = new zzpr();
        this.zze = zzpr0;
        zzqw zzqw0 = new zzqw();
        this.zzf = zzqw0;
        this.zzg = zzfxn.zzq(new zzcl(), zzpr0, zzqw0);
        this.zzh = zzfxn.zzo(new zzqv());
        this.zzK = 1.0f;
        this.zzS = 0;
        this.zzT = new zzf(0, 0.0f);
        this.zzz = new zzqd(zzbe.zza, 0L, 0L, null);
        this.zzA = zzbe.zza;
        this.zzB = false;
        this.zzj = new ArrayDeque();
        this.zzl = new zzqg();
        this.zzm = new zzqg();
        this.zzn = zzqa0.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzpm
    public final boolean zzA(zzab zzab0) {
        return this.zza(zzab0) != 0;
    }

    // 检测为 Lambda 实现
    public static void zzG(zzqm zzqm0) [...]

    static void zzH(zzqm zzqm0, boolean z) {
        zzqm0.zzQ = true;
    }

    // 检测为 Lambda 实现
    static void zzI(AudioTrack audioTrack0, zzpj zzpj0, Handler handler0, zzpg zzpg0) [...]

    public final void zzJ(zzoi zzoi0) {
        String s = "null";
        Looper looper0 = Looper.myLooper();
        Looper looper1 = this.zzY;
        if(looper1 != looper0) {
            String s1 = looper1 == null ? "null" : looper1.getThread().getName();
            if(looper0 != null) {
                s = looper0.getThread().getName();
            }
            throw new IllegalStateException("Current looper (" + s + ") is not the playback looper (" + s1 + ")");
        }
        if(!zzoi0.equals(this.zzu)) {
            this.zzu = zzoi0;
            zzpj zzpj0 = this.zzp;
            if(zzpj0 != null) {
                ((zzqq)zzpj0).zza.zzB();
            }
        }
    }

    static boolean zzK() {
        synchronized(zzqm.zza) {
        }
        return zzqm.zzc > 0;
    }

    private final long zzL() {
        return this.zzr.zzc == 0 ? this.zzC / ((long)this.zzr.zzb) : this.zzD;
    }

    private final long zzM() {
        return this.zzr.zzc == 0 ? (this.zzE + ((long)this.zzr.zzd) - 1L) / ((long)this.zzr.zzd) : this.zzF;
    }

    private final AudioTrack zzN(zzqb zzqb0) throws zzpi {
        try {
            return zzqm.zzac(zzqb0.zza(), this.zzx, this.zzS, zzqb0.zza);
        }
        catch(zzpi zzpi0) {
            zzpj zzpj0 = this.zzp;
            if(zzpj0 != null) {
                zzpj0.zza(zzpi0);
            }
            throw zzpi0;
        }
    }

    private final void zzO(long v) {
        boolean z;
        zzbe zzbe0;
        if(this.zzab()) {
            zzbe0 = this.zzA;
            this.zzac.zzc(zzbe0);
        }
        else {
            zzbe0 = zzbe.zza;
        }
        this.zzA = zzbe0;
        if(this.zzab()) {
            z = this.zzB;
            this.zzac.zzd(z);
        }
        else {
            z = false;
        }
        this.zzB = z;
        zzqb zzqb0 = this.zzr;
        zzqd zzqd0 = new zzqd(zzbe0, Math.max(0L, v), zzei.zzt(this.zzM(), zzqb0.zze), null);
        this.zzj.add(zzqd0);
        this.zzX();
        zzpj zzpj0 = this.zzp;
        if(zzpj0 != null) {
            ((zzqq)zzpj0).zza.zzc.zzw(this.zzB);
        }
    }

    private final void zzP(long v) throws zzpl {
        if(this.zzN != null && !this.zzm.zzc()) {
            int v1 = this.zzN.remaining();
            boolean z = true;
            int v2 = this.zzt.write(this.zzN, v1, 1);
            this.zzV = SystemClock.elapsedRealtime();
            if(v2 < 0) {
                if((zzei.zza < 24 || v2 != -6) && v2 != 0xFFFFFFE0) {
                    z = false;
                }
                else if(this.zzM() <= 0L) {
                    if(zzqm.zzaa(this.zzt)) {
                        this.zzQ();
                    }
                    else {
                        z = false;
                    }
                }
                zzpl zzpl0 = new zzpl(v2, this.zzr.zza, z);
                zzpj zzpj0 = this.zzp;
                if(zzpj0 != null) {
                    zzpj0.zza(zzpl0);
                }
                if(!zzpl0.zzb) {
                    this.zzm.zzb(zzpl0);
                    return;
                }
                this.zzu = zzoi.zza;
                throw zzpl0;
            }
            this.zzm.zza();
            if(zzqm.zzaa(this.zzt)) {
                if(this.zzF > 0L) {
                    this.zzX = false;
                }
                if(this.zzR) {
                    zzpj zzpj1 = this.zzp;
                    if(zzpj1 != null && v2 < v1) {
                        zzqq zzqq0 = (zzqq)zzpj1;
                    }
                }
            }
            int v3 = this.zzr.zzc;
            if(v3 == 0) {
                this.zzE += (long)v2;
            }
            if(v2 == v1) {
                if(v3 != 0) {
                    if(this.zzN != this.zzL) {
                        z = false;
                    }
                    zzcw.zzf(z);
                    this.zzF += ((long)this.zzG) * ((long)this.zzM);
                }
                this.zzN = null;
            }
        }
    }

    private final void zzQ() {
        if(this.zzr.zzc == 1) {
            this.zzW = true;
        }
    }

    private final void zzR() {
        if(this.zzv == null && this.zzd != null) {
            this.zzY = Looper.myLooper();
            zzpw zzpw0 = new zzpw(this);
            zzon zzon0 = new zzon(this.zzd, zzpw0, this.zzx, this.zzU);
            this.zzv = zzon0;
            this.zzu = zzon0.zzc();
        }
    }

    private final void zzS() {
        if(!this.zzP) {
            this.zzP = true;
            long v = this.zzM();
            this.zzi.zzb(v);
            if(zzqm.zzaa(this.zzt)) {
                this.zzQ = false;
            }
            this.zzt.stop();
        }
    }

    private final void zzT(long v) throws zzpl {
        this.zzP(v);
        if(this.zzN == null) {
            if(this.zzs.zzh()) {
                while(!this.zzs.zzg()) {
                    while(true) {
                        ByteBuffer byteBuffer0 = this.zzs.zzb();
                        if(!byteBuffer0.hasRemaining()) {
                            break;
                        }
                        this.zzV(byteBuffer0);
                        this.zzP(v);
                        if(this.zzN != null) {
                            return;
                        }
                    }
                    if(this.zzL != null && this.zzL.hasRemaining()) {
                        this.zzs.zze(this.zzL);
                        continue;
                    }
                    return;
                }
            }
            else {
                ByteBuffer byteBuffer1 = this.zzL;
                if(byteBuffer1 != null) {
                    this.zzV(byteBuffer1);
                    this.zzP(v);
                }
            }
        }
    }

    private final void zzU(zzbe zzbe0) {
        zzqd zzqd0 = new zzqd(zzbe0, 0x8000000000000001L, 0x8000000000000001L, null);
        if(this.zzZ()) {
            this.zzy = zzqd0;
            return;
        }
        this.zzz = zzqd0;
    }

    private final void zzV(ByteBuffer byteBuffer0) {
        ByteBuffer byteBuffer2;
        int v6;
        float f1;
        zzcw.zzf(this.zzN == null);
        if(byteBuffer0.hasRemaining()) {
            if(this.zzr.zzc == 0) {
                int v = (int)zzei.zzp(zzei.zzs(20L), this.zzr.zze);
                long v1 = this.zzM();
                if(v1 < ((long)v)) {
                    int v2 = this.zzr.zzg;
                    int v3 = this.zzr.zzd;
                    ByteBuffer byteBuffer1 = ByteBuffer.allocateDirect(byteBuffer0.remaining()).order(ByteOrder.nativeOrder());
                    int v4 = byteBuffer0.position();
                    int v5 = (int)v1;
                    while(byteBuffer0.hasRemaining() && v5 < v) {
                        switch(v2) {
                            case 2: {
                                v6 = (byteBuffer0.get() & 0xFF) << 16 | (byteBuffer0.get() & 0xFF) << 24;
                                break;
                            }
                            case 3: {
                                v6 = (byteBuffer0.get() & 0xFF) << 24;
                                break;
                            }
                            case 4: {
                                float f = Math.max(-1.0f, Math.min(byteBuffer0.getFloat(), 1.0f));
                                if(f < 0.0f) {
                                    f = -f;
                                    f1 = -2147483648.0f;
                                }
                                else {
                                    f1 = 2147483648.0f;
                                }
                                v6 = (int)(f * f1);
                                break;
                            }
                            case 21: {
                                v6 = (byteBuffer0.get() & 0xFF) << 8 | (byteBuffer0.get() & 0xFF) << 16 | (byteBuffer0.get() & 0xFF) << 24;
                                break;
                            }
                            case 22: {
                                v6 = byteBuffer0.get() & 0xFF | (byteBuffer0.get() & 0xFF) << 8 | (byteBuffer0.get() & 0xFF) << 16 | (byteBuffer0.get() & 0xFF) << 24;
                                break;
                            }
                            case 0x10000000: {
                                v6 = (byteBuffer0.get() & 0xFF) << 24 | (byteBuffer0.get() & 0xFF) << 16;
                                break;
                            }
                            case 0x50000000: {
                                v6 = (byteBuffer0.get() & 0xFF) << 24 | (byteBuffer0.get() & 0xFF) << 16 | (byteBuffer0.get() & 0xFF) << 8;
                                break;
                            }
                            default: {
                                if(v2 != 0x60000000) {
                                    throw new IllegalStateException();
                                }
                                v6 = (byteBuffer0.get() & 0xFF) << 24 | (byteBuffer0.get() & 0xFF) << 16 | (byteBuffer0.get() & 0xFF) << 8 | byteBuffer0.get() & 0xFF;
                                break;
                            }
                        }
                        int v7 = (int)(((long)v6) * ((long)v5) / ((long)v));
                        switch(v2) {
                            case 2: {
                                byteBuffer1.put(((byte)(v7 >> 16)));
                                byteBuffer1.put(((byte)(v7 >> 24)));
                                break;
                            }
                            case 3: {
                                byteBuffer1.put(((byte)(v7 >> 24)));
                                break;
                            }
                            case 4: {
                                if(v7 < 0) {
                                    byteBuffer1.putFloat(-((float)v7) / -2147483648.0f);
                                }
                                else {
                                    byteBuffer1.putFloat(((float)v7) / 2147483648.0f);
                                }
                                break;
                            }
                            case 21: {
                                byteBuffer1.put(((byte)(v7 >> 8)));
                                byteBuffer1.put(((byte)(v7 >> 16)));
                                byteBuffer1.put(((byte)(v7 >> 24)));
                                break;
                            }
                            case 22: {
                                byteBuffer1.put(((byte)v7));
                                byteBuffer1.put(((byte)(v7 >> 8)));
                                byteBuffer1.put(((byte)(v7 >> 16)));
                                byteBuffer1.put(((byte)(v7 >> 24)));
                                break;
                            }
                            case 0x10000000: {
                                byteBuffer1.put(((byte)(v7 >> 24)));
                                byteBuffer1.put(((byte)(v7 >> 16)));
                                break;
                            }
                            case 0x50000000: {
                                byteBuffer1.put(((byte)(v7 >> 24)));
                                byteBuffer1.put(((byte)(v7 >> 16)));
                                byteBuffer1.put(((byte)(v7 >> 8)));
                                break;
                            }
                            case 0x60000000: {
                                byteBuffer1.put(((byte)(v7 >> 24)));
                                byteBuffer1.put(((byte)(v7 >> 16)));
                                byteBuffer1.put(((byte)(v7 >> 8)));
                                byteBuffer1.put(((byte)v7));
                                break;
                            }
                            default: {
                                throw new IllegalStateException();
                            }
                        }
                        if(byteBuffer0.position() == v4 + v3) {
                            ++v5;
                            v4 = byteBuffer0.position();
                        }
                    }
                    byteBuffer1.put(byteBuffer0);
                    byteBuffer1.flip();
                    byteBuffer2 = byteBuffer1;
                }
                else {
                    byteBuffer2 = byteBuffer0;
                }
            }
            else {
                byteBuffer2 = byteBuffer0;
            }
            this.zzN = byteBuffer2;
        }
    }

    private final void zzW() {
        if(this.zzZ()) {
            this.zzt.setVolume(this.zzK);
        }
    }

    private final void zzX() {
        this.zzs = this.zzr.zzi;
        this.zzr.zzi.zzc();
    }

    private final boolean zzY() throws zzpl {
        if(!this.zzs.zzh()) {
            this.zzP(0x8000000000000000L);
            return this.zzN == null;
        }
        this.zzs.zzd();
        this.zzT(0x8000000000000000L);
        return this.zzs.zzg() && (this.zzN == null || !this.zzN.hasRemaining());
    }

    private final boolean zzZ() {
        return this.zzt != null;
    }

    @Override  // com.google.android.gms.internal.ads.zzpm
    public final int zza(zzab zzab0) {
        this.zzR();
        if("audio/raw".equals(zzab0.zzo)) {
            if(!zzei.zzJ(zzab0.zzF)) {
                zzdo.zzf("DefaultAudioSink", "Invalid PCM encoding: " + zzab0.zzF);
                return 0;
            }
            return zzab0.zzF == 2 ? 2 : 1;
        }
        return this.zzu.zzb(zzab0, this.zzx) == null ? 0 : 2;
    }

    private static boolean zzaa(AudioTrack audioTrack0) {
        return zzei.zza >= 29 && audioTrack0.isOffloadedPlayback();
    }

    private final boolean zzab() {
        return this.zzr.zzc == 0;
    }

    private static final AudioTrack zzac(zzpg zzpg0, zze zze0, int v, zzab zzab0) throws zzpi {
        AudioTrack audioTrack0;
        try {
            int v1 = zzei.zza;
            if(v1 >= 23) {
                AudioFormat audioFormat0 = zzei.zzx(zzpg0.zzb, zzpg0.zzc, zzpg0.zza);
                zzc zzc0 = zze0.zza();
                AudioTrack.Builder audioTrack$Builder0 = c0.a().setAudioAttributes(zzc0.zza).setAudioFormat(audioFormat0).setTransferMode(1).setBufferSizeInBytes(zzpg0.zze).setSessionId(v);
                if(v1 >= 29) {
                    audioTrack$Builder0.setOffloadedPlayback(zzpg0.zzd);
                }
                audioTrack0 = audioTrack$Builder0.build();
            }
            else {
                zzc zzc1 = zze0.zza();
                AudioFormat audioFormat1 = zzei.zzx(zzpg0.zzb, zzpg0.zzc, zzpg0.zza);
                audioTrack0 = new AudioTrack(zzc1.zza, audioFormat1, zzpg0.zze, 1, v);
            }
        }
        catch(UnsupportedOperationException | IllegalArgumentException unsupportedOperationException0) {
            throw new zzpi(0, zzpg0.zzb, zzpg0.zzc, zzpg0.zza, zzab0, zzpg0.zzd, unsupportedOperationException0);
        }
        int v2 = audioTrack0.getState();
        if(v2 == 1) {
            return audioTrack0;
        }
        try {
            audioTrack0.release();
        }
        catch(Exception unused_ex) {
        }
        throw new zzpi(v2, zzpg0.zzb, zzpg0.zzc, zzpg0.zza, zzab0, zzpg0.zzd, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzpm
    public final long zzb(boolean z) {
        long v4;
        if(this.zzZ() && !this.zzI) {
            long v = this.zzi.zza(z);
            zzqb zzqb0 = this.zzr;
            long v1 = Math.min(v, zzei.zzt(this.zzM(), zzqb0.zze));
            while(!this.zzj.isEmpty() && v1 >= ((zzqd)this.zzj.getFirst()).zzc) {
                this.zzz = (zzqd)this.zzj.remove();
            }
            long v2 = v1 - this.zzz.zzc;
            if(this.zzj.isEmpty()) {
                long v3 = this.zzac.zza(v2);
                v4 = this.zzz.zzb + v3;
            }
            else {
                zzqd zzqd0 = (zzqd)this.zzj.getFirst();
                v4 = zzqd0.zzb - zzei.zzq(zzqd0.zzc - v1, this.zzz.zza.zzb);
            }
            long v5 = this.zzac.zzb();
            long v6 = zzei.zzt(v5, this.zzr.zze);
            long v7 = this.zzZ;
            if(v5 > v7) {
                long v8 = zzei.zzt(v5 - v7, this.zzr.zze);
                this.zzZ = v5;
                this.zzaa += v8;
                if(this.zzab == null) {
                    this.zzab = new Handler(Looper.myLooper());
                }
                this.zzab.removeCallbacksAndMessages(null);
                this.zzab.postDelayed(() -> if(this.zzaa >= 300000L) {
                    zzqs.zzah(((zzqq)this.zzp).zza, true);
                    this.zzaa = 0L;
                }, 100L);
            }
            return v4 + v6;
        }
        return 0x8000000000000000L;
    }

    @Override  // com.google.android.gms.internal.ads.zzpm
    public final zzbe zzc() {
        return this.zzA;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzpm
    public final zzor zzd(zzab zzab0) {
        return this.zzW ? zzor.zza : this.zzad.zza(zzab0, this.zzx);
    }

    @Override  // com.google.android.gms.internal.ads.zzpm
    public final void zze(zzab zzab0, int v, @Nullable int[] arr_v) throws zzph {
        int v13;
        int v12;
        int v6;
        int v5;
        zzce zzce1;
        int v4;
        int v3;
        int v2;
        zzcf zzcf1;
        int v1;
        this.zzR();
        if("audio/raw".equals(zzab0.zzo)) {
            zzcw.zzd(zzei.zzJ(zzab0.zzF));
            v1 = zzei.zzk(zzab0.zzF) * zzab0.zzD;
            zzfxk zzfxk0 = new zzfxk();
            zzfxk0.zzh(this.zzg);
            zzfxk0.zzg(this.zzac.zze());
            zzce zzce0 = new zzce(zzfxk0.zzi());
            if(zzce0.equals(this.zzs)) {
                zzce0 = this.zzs;
            }
            this.zzf.zzq(zzab0.zzG, zzab0.zzH);
            this.zze.zzo(arr_v);
            zzcf zzcf0 = new zzcf(zzab0.zzE, zzab0.zzD, zzab0.zzF);
            try {
                zzcf1 = zzce0.zza(zzcf0);
            }
            catch(zzcg zzcg0) {
                throw new zzph(zzcg0, zzab0);
            }
            v2 = zzcf1.zzd;
            v3 = zzcf1.zzb;
            v4 = zzei.zzi(zzcf1.zzc);
            zzce1 = zzce0;
            v5 = zzei.zzk(v2) * zzcf1.zzc;
            v6 = 0;
        }
        else {
            zzce zzce2 = new zzce(zzfxn.zzn());
            int v7 = zzab0.zzE;
            Pair pair0 = this.zzu.zzb(zzab0, this.zzx);
            if(pair0 == null) {
                throw new zzph("Unable to configure passthrough for: " + zzab0, zzab0);
            }
            v2 = (int)(((Integer)pair0.first));
            zzce1 = zzce2;
            v3 = v7;
            v4 = (int)(((Integer)pair0.second));
            v1 = -1;
            v6 = 2;
            v5 = -1;
        }
        if(v2 == 0) {
            throw new zzph("Invalid output encoding (mode=" + v6 + ") for: " + zzab0, zzab0);
        }
        if(v4 == 0) {
            throw new zzph("Invalid output channel config (mode=" + v6 + ") for: " + zzab0, zzab0);
        }
        int v8 = !"audio/vnd.dts.hd;profile=lbr".equals(zzab0.zzo) || zzab0.zzj != -1 ? zzab0.zzj : 768000;
        int v9 = AudioTrack.getMinBufferSize(v3, v4, v2);
        zzcw.zzf(v9 != -2);
        int v10 = v5 == -1 ? 1 : v5;
        int v11 = 250000;
        if(v6 == 0) {
            v12 = 0;
            v13 = Math.max(zzqo.zza(250000, v3, v10), Math.min(v9 * 4, zzqo.zza(750000, v3, v10)));
        }
        else {
            switch(v2) {
                case 5: {
                    v11 = 500000;
                    break;
                }
                case 8: {
                    v11 = 1000000;
                    v2 = 8;
                }
            }
            v12 = v6;
            v13 = zzgaq.zzb(((long)v11) * ((long)(v8 == -1 ? zzqo.zzb(v2) : zzgaj.zzb(v8, 8, RoundingMode.CEILING))) / 1000000L);
        }
        this.zzW = false;
        zzqb zzqb0 = new zzqb(zzab0, v1, v12, v5, v3, v4, v2, (Math.max(v9, ((int)(((double)v13)))) + v10 - 1) / v10 * v10, zzce1, false, false, false);
        if(this.zzZ()) {
            this.zzq = zzqb0;
            return;
        }
        this.zzr = zzqb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzpm
    public final void zzf() {
        if(this.zzZ()) {
            this.zzC = 0L;
            this.zzD = 0L;
            this.zzE = 0L;
            this.zzF = 0L;
            this.zzX = false;
            this.zzG = 0;
            this.zzz = new zzqd(this.zzA, 0L, 0L, null);
            this.zzJ = 0L;
            this.zzy = null;
            this.zzj.clear();
            this.zzL = null;
            this.zzM = 0;
            this.zzN = null;
            this.zzP = false;
            this.zzO = false;
            this.zzQ = false;
            this.zzf.zzp();
            this.zzX();
            if(this.zzi.zzh()) {
                this.zzt.pause();
            }
            if(zzqm.zzaa(this.zzt)) {
                zzqk zzqk0 = this.zzk;
                zzqk0.getClass();
                zzqk0.zzb(this.zzt);
            }
            zzpg zzpg0 = this.zzr.zza();
            zzqb zzqb0 = this.zzq;
            if(zzqb0 != null) {
                this.zzr = zzqb0;
                this.zzq = null;
            }
            this.zzi.zzc();
            if(zzei.zza >= 24) {
                zzqf zzqf0 = this.zzw;
                if(zzqf0 != null) {
                    zzqf0.zzb();
                    this.zzw = null;
                }
            }
            AudioTrack audioTrack0 = this.zzt;
            zzpj zzpj0 = this.zzp;
            Handler handler0 = new Handler(Looper.myLooper());
            Object object0 = zzqm.zza;
            synchronized(object0) {
                if(zzqm.zzb == null) {
                    zzqm.zzb = Executors.newSingleThreadScheduledExecutor(new zzeh("ExoPlayer:AudioTrackReleaseThread"));
                }
                ++zzqm.zzc;
                zzqm.zzb.schedule(() -> try {
                    audioTrack0.flush();
                    audioTrack0.release();
                }
                finally {
                    if(zzpj0 != null && handler0.getLooper().getThread().isAlive()) {
                        handler0.post(new zzpv(zzpj0, zzpg0));
                    }
                    Object object0 = zzqm.zza;
                    synchronized(object0) {
                        int v2 = zzqm.zzc - 1;
                        zzqm.zzc = v2;
                        if(v2 == 0) {
                            zzqm.zzb.shutdown();
                            zzqm.zzb = null;
                        }
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            }
            this.zzt = null;
        }
        this.zzm.zza();
        this.zzl.zza();
        this.zzZ = 0L;
        this.zzaa = 0L;
        Handler handler1 = this.zzab;
        if(handler1 != null) {
            handler1.removeCallbacksAndMessages(null);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzpm
    public final void zzg() {
        this.zzH = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzpm
    public final void zzh() {
        this.zzR = false;
        if(this.zzZ() && (this.zzi.zzk() || zzqm.zzaa(this.zzt))) {
            this.zzt.pause();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzpm
    public final void zzi() {
        this.zzR = true;
        if(this.zzZ()) {
            this.zzi.zzf();
            this.zzt.play();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzpm
    public final void zzj() throws zzpl {
        if(!this.zzO && this.zzZ() && this.zzY()) {
            this.zzS();
            this.zzO = true;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzpm
    public final void zzk() {
        zzon zzon0 = this.zzv;
        if(zzon0 != null) {
            zzon0.zzi();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzpm
    public final void zzl() {
        this.zzf();
        zzfxn zzfxn0 = this.zzg;
        int v = zzfxn0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((zzch)zzfxn0.get(v1)).zzf();
        }
        zzfxn zzfxn1 = this.zzh;
        int v2 = zzfxn1.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            ((zzch)zzfxn1.get(v3)).zzf();
        }
        zzce zzce0 = this.zzs;
        if(zzce0 != null) {
            zzce0.zzf();
        }
        this.zzR = false;
        this.zzW = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzpm
    public final void zzm(zze zze0) {
        if(this.zzx.equals(zze0)) {
            return;
        }
        this.zzx = zze0;
        zzon zzon0 = this.zzv;
        if(zzon0 != null) {
            zzon0.zzg(zze0);
        }
        this.zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzpm
    public final void zzn(int v) {
        if(this.zzS != v) {
            this.zzS = v;
            this.zzf();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzpm
    public final void zzo(zzf zzf0) {
        if(this.zzT.equals(zzf0)) {
            return;
        }
        this.zzT = zzf0;
    }

    @Override  // com.google.android.gms.internal.ads.zzpm
    public final void zzp(zzcx zzcx0) {
        this.zzi.zze(zzcx0);
    }

    @Override  // com.google.android.gms.internal.ads.zzpm
    public final void zzq(zzpj zzpj0) {
        this.zzp = zzpj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzpm
    @RequiresApi(29)
    public final void zzr(int v, int v1) {
        AudioTrack audioTrack0 = this.zzt;
        if(audioTrack0 != null) {
            zzqm.zzaa(audioTrack0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzpm
    public final void zzs(zzbe zzbe0) {
        this.zzA = new zzbe(Math.max(0.1f, Math.min(zzbe0.zzb, 8.0f)), Math.max(0.1f, Math.min(zzbe0.zzc, 8.0f)));
        this.zzU(zzbe0);
    }

    @Override  // com.google.android.gms.internal.ads.zzpm
    public final void zzt(@Nullable zzog zzog0) {
        this.zzo = zzog0;
    }

    @Override  // com.google.android.gms.internal.ads.zzpm
    @RequiresApi(23)
    public final void zzu(@Nullable AudioDeviceInfo audioDeviceInfo0) {
        this.zzU = audioDeviceInfo0 == null ? null : new zzoo(audioDeviceInfo0);
        zzon zzon0 = this.zzv;
        if(zzon0 != null) {
            zzon0.zzh(audioDeviceInfo0);
        }
        AudioTrack audioTrack0 = this.zzt;
        if(audioTrack0 != null) {
            zzpx.zza(audioTrack0, this.zzU);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzpm
    public final void zzv(boolean z) {
        this.zzB = z;
        this.zzU(this.zzA);
    }

    @Override  // com.google.android.gms.internal.ads.zzpm
    public final void zzw(float f) {
        if(this.zzK != f) {
            this.zzK = f;
            this.zzW();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzpm
    public final boolean zzx(ByteBuffer byteBuffer0, long v, int v1) throws zzpi, zzpl {
        int v8;
        int v7;
        int v9;
        int v5;
        int v13;
        zzqb zzqb3;
        AudioTrack audioTrack0;
        zzcw.zzd(this.zzL == null || byteBuffer0 == this.zzL);
        if(this.zzq != null) {
            if(!this.zzY()) {
                return false;
            }
            zzqb zzqb0 = this.zzq;
            if(this.zzr.zzc != zzqb0.zzc || this.zzr.zzg != zzqb0.zzg || this.zzr.zze != zzqb0.zze || this.zzr.zzf != zzqb0.zzf || this.zzr.zzd != zzqb0.zzd) {
                this.zzS();
                if(this.zzy()) {
                    return false;
                }
                this.zzf();
            }
            else {
                this.zzr = zzqb0;
                this.zzq = null;
                if(this.zzt != null && zzqm.zzaa(this.zzt)) {
                }
            }
            this.zzO(v);
        }
        if(!this.zzZ()) {
            try {
                if(this.zzl.zzc()) {
                    return false;
                }
                goto label_18;
            }
            catch(zzpi zzpi0) {
                goto label_68;
            }
            return false;
            try {
            label_18:
                zzqb zzqb1 = this.zzr;
                if(zzqb1 == null) {
                    throw null;
                }
                audioTrack0 = this.zzN(zzqb1);
                goto label_34;
            }
            catch(zzpi zzpi1) {
                try {
                    zzqb zzqb2 = this.zzr;
                    if(zzqb2.zzh > 1000000) {
                        zzqb3 = new zzqb(zzqb2.zza, zzqb2.zzb, zzqb2.zzc, zzqb2.zzd, zzqb2.zze, zzqb2.zzf, zzqb2.zzg, 1000000, zzqb2.zzi, false, false, false);
                        audioTrack0 = this.zzN(zzqb3);
                        this.zzr = zzqb3;
                        goto label_34;
                    }
                    goto label_32;
                }
                catch(zzpi zzpi0) {
                    goto label_68;
                }
                try {
                    audioTrack0 = this.zzN(zzqb3);
                    this.zzr = zzqb3;
                    goto label_34;
                }
                catch(zzpi zzpi2) {
                    try {
                        zzpi1.addSuppressed(zzpi2);
                    label_32:
                        this.zzQ();
                        throw zzpi1;
                    label_34:
                        this.zzt = audioTrack0;
                        if(zzqm.zzaa(audioTrack0)) {
                            AudioTrack audioTrack1 = this.zzt;
                            if(this.zzk == null) {
                                this.zzk = new zzqk(this);
                            }
                            this.zzk.zza(audioTrack1);
                        }
                        int v2 = zzei.zza;
                        if(v2 >= 0x1F) {
                            zzog zzog0 = this.zzo;
                            if(zzog0 != null) {
                                AudioTrack audioTrack2 = this.zzt;
                                LogSessionId logSessionId0 = zzog0.zza();
                                if(!logSessionId0.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                                    audioTrack2.setLogSessionId(logSessionId0);
                                }
                            }
                        }
                        this.zzS = this.zzt.getAudioSessionId();
                        this.zzi.zzd(this.zzt, this.zzr.zzc == 2, this.zzr.zzg, this.zzr.zzd, this.zzr.zzh);
                        this.zzW();
                        zzoo zzoo0 = this.zzU;
                        if(zzoo0 != null && v2 >= 23) {
                            zzpx.zza(this.zzt, zzoo0);
                            zzon zzon0 = this.zzv;
                            if(zzon0 != null) {
                                zzon0.zzh(this.zzU.zza);
                            }
                        }
                        if(v2 >= 24) {
                            zzon zzon1 = this.zzv;
                            if(zzon1 != null) {
                                this.zzw = new zzqf(this.zzt, zzon1);
                            }
                        }
                        this.zzI = true;
                        zzpj zzpj0 = this.zzp;
                        if(zzpj0 != null) {
                            zzpg zzpg0 = this.zzr.zza();
                            ((zzqq)zzpj0).zza.zzc.zzc(zzpg0);
                            goto label_72;
                        label_68:
                            if(zzpi0.zzb) {
                                throw zzpi0;
                            }
                            goto label_69;
                        }
                        goto label_72;
                    }
                    catch(zzpi zzpi0) {
                        goto label_68;
                    }
                }
            }
        label_69:
            this.zzl.zzb(zzpi0);
            return false;
        }
    label_72:
        this.zzl.zza();
        if(this.zzI) {
            this.zzJ = Math.max(0L, v);
            this.zzH = false;
            this.zzI = false;
            this.zzO(v);
            if(this.zzR) {
                this.zzi();
            }
        }
        long v3 = this.zzM();
        if(!this.zzi.zzj(v3)) {
            return false;
        }
        if(this.zzL == null) {
            zzcw.zzd(byteBuffer0.order() == ByteOrder.LITTLE_ENDIAN);
            if(!byteBuffer0.hasRemaining()) {
                return true;
            }
            zzqb zzqb4 = this.zzr;
            if(zzqb4.zzc != 0 && this.zzG == 0) {
                int v4 = zzqb4.zzg;
            alab1:
                switch(v4) {
                    case 9: {
                        v5 = zzadg.zzc(zzei.zzj(byteBuffer0, byteBuffer0.position()));
                        if(v5 == -1) {
                            throw new IllegalArgumentException();
                        }
                        break;
                    }
                    case 11: 
                    case 12: {
                        v5 = 0x800;
                        break;
                    }
                    case 14: {
                        int v10 = byteBuffer0.position();
                        int v11 = byteBuffer0.limit();
                        for(int v12 = v10; true; ++v12) {
                            v13 = -1;
                            if(v12 > v11 - 10) {
                                break;
                            }
                            if((zzei.zzj(byteBuffer0, v12 + 4) & -2) == 0xF8726FBA) {
                                v13 = v12 - v10;
                                break;
                            }
                        }
                        v5 = v13 == -1 ? 0 : (40 << (byteBuffer0.get(byteBuffer0.position() + v13 + ((byteBuffer0.get(byteBuffer0.position() + v13 + 7) & 0xFF) == 0xBB ? 9 : 8)) >> 4 & 7)) * 16;
                        break;
                    }
                    case 15: {
                        v5 = 0x200;
                        break;
                    }
                    case 10: 
                    case 16: {
                    label_117:
                        v5 = 0x400;
                        break;
                    }
                    case 17: {
                        byte[] arr_b = new byte[16];
                        byteBuffer0.get(arr_b);
                        byteBuffer0.position(byteBuffer0.position());
                        v5 = zzabq.zza(new zzdx(arr_b, 16)).zzc;
                        break;
                    }
                    case 5: 
                    case 6: 
                    case 18: {
                        v5 = zzabn.zza(byteBuffer0);
                        break;
                    }
                    case 20: {
                        v5 = zzadi.zzb(byteBuffer0);
                        break;
                    }
                    case 7: 
                    case 8: 
                    case 30: {
                        switch(byteBuffer0.getInt(0)) {
                            case 0xE842C471: {
                                goto label_117;
                            }
                            case 0xF21B4140: {
                                v5 = 0x400;
                                break alab1;
                            }
                            case 0x25205864: {
                                v5 = 0x1000;
                                break alab1;
                            }
                            default: {
                                int v6 = byteBuffer0.position();
                                switch(byteBuffer0.get(v6)) {
                                    case -2: {
                                        v9 = (byteBuffer0.get(v6 + 5) & 1) << 6 | (byteBuffer0.get(v6 + 4) & 0xFC) >> 2;
                                        break;
                                    }
                                    case -1: {
                                        v7 = (byteBuffer0.get(v6 + 4) & 7) << 4;
                                        v8 = byteBuffer0.get(v6 + 7) & 60;
                                        v9 = v8 >> 2 | v7;
                                        break;
                                    }
                                    case 0x1F: {
                                        v7 = (byteBuffer0.get(v6 + 5) & 7) << 4;
                                        v8 = byteBuffer0.get(v6 + 6) & 60;
                                        v9 = v8 >> 2 | v7;
                                        break;
                                    }
                                    default: {
                                        v7 = (byteBuffer0.get(v6 + 4) & 1) << 6;
                                        v8 = byteBuffer0.get(v6 + 5) & 0xFC;
                                        v9 = v8 >> 2 | v7;
                                        break;
                                    }
                                }
                                v5 = (v9 + 1) * 0x20;
                                break alab1;
                            }
                        }
                    }
                    default: {
                        throw new IllegalStateException("Unexpected audio encoding: " + v4);
                    }
                }
                this.zzG = v5;
                if(v5 == 0) {
                    return true;
                }
            }
            if(this.zzy != null) {
                if(!this.zzY()) {
                    return false;
                }
                this.zzO(v);
                this.zzy = null;
            }
            zzqb zzqb5 = this.zzr;
            long v14 = this.zzJ + zzei.zzt(this.zzL() - this.zzf.zzo(), zzqb5.zza.zzE);
            if(!this.zzH && Math.abs(v14 - v) > 200000L) {
                zzpj zzpj1 = this.zzp;
                if(zzpj1 != null) {
                    zzpj1.zza(new zzpk(v, v14));
                }
                this.zzH = true;
            }
            if(this.zzH) {
                if(!this.zzY()) {
                    return false;
                }
                long v15 = v - v14;
                this.zzJ += v15;
                this.zzH = false;
                this.zzO(v);
                zzpj zzpj2 = this.zzp;
                if(zzpj2 != null && v15 != 0L) {
                    ((zzqq)zzpj2).zza.zzao();
                }
            }
            if(this.zzr.zzc == 0) {
                this.zzC += (long)byteBuffer0.remaining();
            }
            else {
                this.zzD += ((long)this.zzG) * ((long)v1);
            }
            this.zzL = byteBuffer0;
            this.zzM = v1;
        }
        this.zzT(v);
        if(!this.zzL.hasRemaining()) {
            this.zzL = null;
            this.zzM = 0;
            return true;
        }
        long v16 = this.zzM();
        if(this.zzi.zzi(v16)) {
            zzdo.zzf("DefaultAudioSink", "Resetting stalled audio track");
            this.zzf();
            return true;
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzpm
    public final boolean zzy() {
        if(this.zzZ() && (zzei.zza < 29 || !this.zzt.isOffloadedPlayback() || !this.zzQ)) {
            long v = this.zzM();
            return this.zzi.zzg(v);
        }
        return false;
    }

    // 去混淆评级： 低(30)
    @Override  // com.google.android.gms.internal.ads.zzpm
    public final boolean zzz() {
        return !this.zzZ() || this.zzO && !this.zzy();
    }
}

