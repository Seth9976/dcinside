package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;

final class zzpq {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private boolean zzG;
    private long zzH;
    private zzcx zzI;
    private final zzpp zza;
    private final long[] zzb;
    @Nullable
    private AudioTrack zzc;
    private int zzd;
    @Nullable
    private zzpo zze;
    private int zzf;
    private boolean zzg;
    private long zzh;
    private float zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    @Nullable
    private Method zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzpq(zzpp zzpp0) {
        this.zza = zzpp0;
        try {
            this.zzm = AudioTrack.class.getMethod("getLatency", null);
        }
        catch(NoSuchMethodException unused_ex) {
        }
        this.zzb = new long[10];
        this.zzI = zzcx.zza;
    }

    public final long zza(boolean z) {
        long v10;
        AudioTrack audioTrack0 = this.zzc;
        audioTrack0.getClass();
        if(audioTrack0.getPlayState() == 3) {
            long v = this.zzI.zzc();
            if(v / 1000L - this.zzl >= 30000L) {
                long v1 = this.zzm();
                if(v1 != 0L) {
                    this.zzb[this.zzv] = zzei.zzr(v1, this.zzi) - v / 1000L;
                    this.zzv = (this.zzv + 1) % 10;
                    int v2 = this.zzw;
                    if(v2 < 10) {
                        this.zzw = v2 + 1;
                    }
                    this.zzl = v / 1000L;
                    this.zzk = 0L;
                    int v3 = 0;
                    while(true) {
                        int v4 = this.zzw;
                        if(v3 >= v4) {
                            goto label_20;
                        }
                        this.zzk += this.zzb[v3] / ((long)v4);
                        ++v3;
                    }
                }
            }
            else {
            label_20:
                if(!this.zzg) {
                    zzpo zzpo0 = this.zze;
                    zzpo0.getClass();
                    if(zzpo0.zzg(v / 1000L)) {
                        long v5 = zzpo0.zzb();
                        long v6 = zzpo0.zza();
                        long v7 = this.zzm();
                        if(Math.abs(v5 - v / 1000L) > 5000000L) {
                            this.zza.zzd(v6, v5, v / 1000L, v7);
                            zzpo0.zzd();
                        }
                        else if(Math.abs(zzei.zzt(v6, this.zzf) - v7) > 5000000L) {
                            this.zza.zzc(v6, v5, v / 1000L, v7);
                            zzpo0.zzd();
                        }
                        else {
                            zzpo0.zzc();
                        }
                    }
                    if(this.zzp) {
                        Method method0 = this.zzm;
                        if(method0 != null && v / 1000L - this.zzq >= 500000L) {
                            try {
                                AudioTrack audioTrack1 = this.zzc;
                                if(audioTrack1 == null) {
                                    throw null;
                                }
                                long v8 = Math.max(((long)(((int)(((Integer)method0.invoke(audioTrack1, null)))))) * 1000L - this.zzh, 0L);
                                this.zzn = v8;
                                if(v8 > 5000000L) {
                                    this.zza.zza(v8);
                                    this.zzn = 0L;
                                }
                            }
                            catch(Exception unused_ex) {
                                this.zzm = null;
                            }
                            this.zzq = v / 1000L;
                        }
                    }
                }
            }
        }
        long v9 = this.zzI.zzc();
        zzpo zzpo1 = this.zze;
        zzpo1.getClass();
        boolean z1 = zzpo1.zzf();
        if(z1) {
            v10 = zzei.zzt(zzpo1.zza(), this.zzf) + zzei.zzq(v9 / 1000L - zzpo1.zzb(), this.zzi);
        }
        else {
            long v11 = this.zzw == 0 ? this.zzm() : zzei.zzq(this.zzk + v9 / 1000L, this.zzi);
            v10 = z ? v11 : Math.max(0L, v11 - this.zzn);
        }
        if(this.zzD != z1) {
            this.zzF = this.zzC;
            this.zzE = this.zzB;
        }
        long v12 = v9 / 1000L - this.zzF;
        if(v12 < 1000000L) {
            long v13 = v12 * 1000L / 1000000L;
            v10 = (v10 * v13 + (1000L - v13) * (this.zzE + zzei.zzq(v12, this.zzi))) / 1000L;
        }
        if(!this.zzj) {
            long v14 = this.zzB;
            if(v10 > v14) {
                this.zzj = true;
                float f = this.zzi;
                long v15 = zzei.zzr(zzei.zzv(v10 - v14), f);
                long v16 = this.zzI.zza();
                long v17 = zzei.zzv(v15);
                this.zza.zzb(v16 - v17);
            }
        }
        this.zzC = v9 / 1000L;
        this.zzB = v10;
        this.zzD = z1;
        return v10;
    }

    public final void zzb(long v) {
        this.zzz = this.zzl();
        this.zzx = zzei.zzs(this.zzI.zzb());
        this.zzA = v;
    }

    public final void zzc() {
        this.zzn();
        this.zzc = null;
        this.zze = null;
    }

    public final void zzd(AudioTrack audioTrack0, boolean z, int v, int v1, int v2) {
        boolean z1 = true;
        this.zzc = audioTrack0;
        this.zzd = v2;
        this.zze = new zzpo(audioTrack0);
        this.zzf = audioTrack0.getSampleRate();
        if(!z || zzei.zza >= 23) {
            z1 = false;
        }
        else if(v != 5) {
            if(v == 6) {
                v = 6;
            }
            else {
                z1 = false;
            }
        }
        this.zzg = z1;
        boolean z2 = zzei.zzJ(v);
        this.zzp = z2;
        this.zzh = z2 ? zzei.zzt(v2 / v1, this.zzf) : 0x8000000000000001L;
        this.zzs = 0L;
        this.zzt = 0L;
        this.zzG = false;
        this.zzH = 0L;
        this.zzu = 0L;
        this.zzo = false;
        this.zzx = 0x8000000000000001L;
        this.zzy = 0x8000000000000001L;
        this.zzq = 0L;
        this.zzn = 0L;
        this.zzi = 1.0f;
    }

    public final void zze(zzcx zzcx0) {
        this.zzI = zzcx0;
    }

    public final void zzf() {
        if(this.zzx != 0x8000000000000001L) {
            this.zzx = zzei.zzs(this.zzI.zzb());
        }
        zzpo zzpo0 = this.zze;
        zzpo0.getClass();
        zzpo0.zze();
    }

    public final boolean zzg(long v) {
        if(v <= zzei.zzp(this.zza(false), this.zzf)) {
            if(this.zzg) {
                AudioTrack audioTrack0 = this.zzc;
                audioTrack0.getClass();
                return audioTrack0.getPlayState() == 2 && this.zzl() == 0L;
            }
            return false;
        }
        return true;
    }

    public final boolean zzh() {
        AudioTrack audioTrack0 = this.zzc;
        audioTrack0.getClass();
        return audioTrack0.getPlayState() == 3;
    }

    public final boolean zzi(long v) {
        return this.zzy != 0x8000000000000001L && v > 0L && this.zzI.zzb() - this.zzy >= 200L;
    }

    public final boolean zzj(long v) {
        AudioTrack audioTrack0 = this.zzc;
        audioTrack0.getClass();
        int v1 = audioTrack0.getPlayState();
        if(this.zzg) {
            switch(v1) {
                case 1: {
                    if(this.zzl() != 0L) {
                        v1 = 1;
                        break;
                    }
                    return false;
                }
                case 2: {
                    this.zzo = false;
                    return false;
                }
            }
        }
        boolean z = this.zzo;
        boolean z1 = this.zzg(v);
        this.zzo = z1;
        if(z && !z1 && v1 != 1) {
            int v2 = this.zzd;
            long v3 = zzei.zzv(this.zzh);
            this.zza.zze(v2, v3);
        }
        return true;
    }

    public final boolean zzk() {
        this.zzn();
        if(this.zzx == 0x8000000000000001L) {
            zzpo zzpo0 = this.zze;
            zzpo0.getClass();
            zzpo0.zze();
            return true;
        }
        this.zzz = this.zzl();
        return false;
    }

    private final long zzl() {
        long v = this.zzI.zzb();
        int v1 = 2;
        if(this.zzx != 0x8000000000000001L) {
            AudioTrack audioTrack0 = this.zzc;
            audioTrack0.getClass();
            if(audioTrack0.getPlayState() == 2) {
                return this.zzz;
            }
            long v2 = zzei.zzp(zzei.zzq(zzei.zzs(v) - this.zzx, this.zzi), this.zzf);
            return Math.min(this.zzA, this.zzz + v2);
        }
        if(v - this.zzr >= 5L) {
            AudioTrack audioTrack1 = this.zzc;
            audioTrack1.getClass();
            int v3 = audioTrack1.getPlayState();
            if(v3 != 1) {
                long v4 = ((long)audioTrack1.getPlaybackHeadPosition()) & 0xFFFFFFFFL;
                if(this.zzg) {
                    if(v3 != 2) {
                        v1 = v3;
                    }
                    else if(v4 == 0L) {
                        this.zzu = this.zzs;
                    }
                    v4 += this.zzu;
                    v3 = v1;
                }
                if(zzei.zza > 29) {
                label_33:
                    if(this.zzs > v4) {
                        ++this.zzt;
                    }
                    this.zzs = v4;
                }
                else if(v4 != 0L) {
                    this.zzy = 0x8000000000000001L;
                    goto label_33;
                }
                else if(this.zzs <= 0L || v3 != 3) {
                    this.zzy = 0x8000000000000001L;
                    v4 = 0L;
                    goto label_33;
                }
                else if(this.zzy == 0x8000000000000001L) {
                    this.zzy = v;
                }
            }
            this.zzr = v;
        }
        return this.zzs + this.zzH + (this.zzt << 0x20);
    }

    private final long zzm() {
        return zzei.zzt(this.zzl(), this.zzf);
    }

    private final void zzn() {
        this.zzk = 0L;
        this.zzw = 0;
        this.zzv = 0;
        this.zzl = 0L;
        this.zzC = 0L;
        this.zzF = 0L;
        this.zzj = false;
    }
}

