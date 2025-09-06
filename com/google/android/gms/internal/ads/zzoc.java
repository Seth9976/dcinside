package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec.CryptoException;
import android.media.MediaDrm.MediaDrmStateException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics.Builder;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent.Builder;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.exoplayer.analytics.W0;
import androidx.media3.exoplayer.analytics.X0;
import androidx.media3.exoplayer.analytics.n1;
import androidx.media3.exoplayer.analytics.p1;
import androidx.media3.exoplayer.analytics.q1;
import androidx.media3.exoplayer.analytics.r1;
import androidx.media3.exoplayer.analytics.s1;
import h4.e;
import h4.m;
import j..util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;

@RequiresApi(0x1F)
public final class zzoc implements zzlw, zzod {
    private final Context zza;
    private final zzoe zzb;
    private final PlaybackSession zzc;
    private final long zzd;
    private final zzbp zze;
    private final zzbo zzf;
    private final HashMap zzg;
    private final HashMap zzh;
    @Nullable
    private String zzi;
    @Nullable
    private PlaybackMetrics.Builder zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    @Nullable
    private zzbd zzn;
    @Nullable
    private zzob zzo;
    @Nullable
    private zzob zzp;
    @Nullable
    private zzob zzq;
    @Nullable
    private zzab zzr;
    @Nullable
    private zzab zzs;
    @Nullable
    private zzab zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;

    private zzoc(Context context0, PlaybackSession playbackSession0) {
        this.zza = context0.getApplicationContext();
        this.zzc = playbackSession0;
        this.zze = new zzbp();
        this.zzf = new zzbo();
        this.zzh = new HashMap();
        this.zzg = new HashMap();
        this.zzd = SystemClock.elapsedRealtime();
        this.zzl = 0;
        this.zzm = 0;
        zzoa zzoa0 = new zzoa(zzoa.zza);
        this.zzb = zzoa0;
        zzoa0.zzh(this);
    }

    public final LogSessionId zza() {
        return this.zzc.getSessionId();
    }

    @Nullable
    public static zzoc zzb(Context context0) {
        MediaMetricsManager mediaMetricsManager0 = X0.a(context0.getSystemService("media_metrics"));
        return mediaMetricsManager0 == null ? null : new zzoc(context0, mediaMetricsManager0.createPlaybackSession());
    }

    @Override  // com.google.android.gms.internal.ads.zzod
    public final void zzc(zzlu zzlu0, String s) {
        if(zzlu0.zzd != null && zzlu0.zzd.zzb()) {
            return;
        }
        this.zzs();
        this.zzi = s;
        this.zzj = q1.a().setPlayerName("AndroidXMedia3").setPlayerVersion("1.5.0-beta01");
        this.zzv(zzlu0.zzb, zzlu0.zzd);
    }

    @Override  // com.google.android.gms.internal.ads.zzod
    public final void zzd(zzlu zzlu0, String s, boolean z) {
        if((zzlu0.zzd == null || !zzlu0.zzd.zzb()) && s.equals(this.zzi)) {
            this.zzs();
        }
        this.zzg.remove(s);
        this.zzh.remove(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzlw
    public final void zze(zzlu zzlu0, zzab zzab0, zzht zzht0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzlw
    public final void zzf(zzlu zzlu0, int v, long v1, long v2) {
        zzug zzug0 = zzlu0.zzd;
        if(zzug0 != null) {
            String s = this.zzb.zzf(zzlu0.zzb, zzug0);
            Long long0 = (Long)this.zzh.get(s);
            Long long1 = (Long)this.zzg.get(s);
            long v3 = 0L;
            this.zzh.put(s, ((long)((long0 == null ? 0L : ((long)long0)) + v1)));
            HashMap hashMap0 = this.zzg;
            if(long1 != null) {
                v3 = (long)long1;
            }
            hashMap0.put(s, ((long)(v3 + ((long)v))));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzlw
    public final void zzg(zzlu zzlu0, zzuc zzuc0) {
        zzug zzug0 = zzlu0.zzd;
        if(zzug0 != null) {
            zzuc0.zzb.getClass();
            String s = this.zzb.zzf(zzlu0.zzb, zzug0);
            zzob zzob0 = new zzob(zzuc0.zzb, 0, s);
            switch(zzuc0.zza) {
                case 1: {
                    this.zzp = zzob0;
                    return;
                }
                case 0: 
                case 2: {
                    this.zzo = zzob0;
                    return;
                }
                case 3: {
                    this.zzq = zzob0;
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzlw
    public final void zzh(zzlu zzlu0, int v, long v1) {
    }

    @Override  // com.google.android.gms.internal.ads.zzlw
    public final void zzi(zzbk zzbk0, zzlv zzlv0) {
        int v12;
        int v11;
        int v10;
        int v8;
        int v7;
        zzu zzu0;
        if(zzlv0.zzb() != 0) {
            for(int v = 0; v < zzlv0.zzb(); ++v) {
                int v1 = zzlv0.zza(v);
                zzlu zzlu0 = zzlv0.zzc(v1);
                if(v1 == 0) {
                    this.zzb.zzk(zzlu0);
                }
                else if(v1 == 11) {
                    this.zzb.zzj(zzlu0, this.zzk);
                }
                else {
                    this.zzb.zzi(zzlu0);
                }
            }
            long v2 = SystemClock.elapsedRealtime();
            if(zzlv0.zzd(0)) {
                zzlu zzlu1 = zzlv0.zzc(0);
                if(this.zzj != null) {
                    this.zzv(zzlu1.zzb, zzlu1.zzd);
                }
            }
            if(zzlv0.zzd(2) && this.zzj != null) {
                zzfxn zzfxn0 = zzbk0.zzo().zza();
                int v3 = zzfxn0.size();
            alab1:
                for(int v4 = 0; true; ++v4) {
                    zzu0 = null;
                    if(v4 >= v3) {
                        break;
                    }
                    zzbx zzbx0 = (zzbx)zzfxn0.get(v4);
                    for(int v5 = 0; v5 < zzbx0.zza; ++v5) {
                        if(zzbx0.zzd(v5)) {
                            zzu zzu1 = zzbx0.zzb(v5).zzs;
                            if(zzu1 != null) {
                                zzu0 = zzu1;
                                break alab1;
                            }
                        }
                    }
                }
                if(zzu0 != null) {
                    PlaybackMetrics.Builder playbackMetrics$Builder0 = this.zzj;
                    for(int v6 = 0; true; ++v6) {
                        v7 = 1;
                        if(v6 >= zzu0.zzb) {
                            break;
                        }
                        UUID uUID0 = zzu0.zza(v6).zza;
                        if(uUID0.equals(zzh.zzd)) {
                            v7 = 3;
                            break;
                        }
                        if(uUID0.equals(zzh.zze)) {
                            v7 = 2;
                            break;
                        }
                        if(uUID0.equals(zzh.zzc)) {
                            v7 = 6;
                            break;
                        }
                    }
                    playbackMetrics$Builder0.setDrmType(v7);
                }
            }
            if(zzlv0.zzd(0x3F3)) {
                ++this.zzy;
            }
            zzbd zzbd0 = this.zzn;
            if(zzbd0 != null) {
                Context context0 = this.zza;
                if(zzbd0.zza == 1001) {
                    v8 = 20;
                    v10 = 0;
                }
                else {
                    boolean z = ((zzib)zzbd0).zzc == 1;
                    v8 = 35;
                    int v9 = ((zzib)zzbd0).zzg;
                    Throwable throwable0 = zzbd0.getCause();
                    throwable0.getClass();
                    if(!(throwable0 instanceof IOException)) {
                        if(z && (v9 == 0 || v9 == 1)) {
                            v10 = 0;
                        }
                        else if(z && v9 == 3) {
                            v8 = 15;
                            v10 = 0;
                        }
                        else if(z && v9 == 2) {
                            v8 = 23;
                            v10 = 0;
                        }
                        else if(throwable0 instanceof zzsj) {
                            v10 = zzei.zzm(((zzsj)throwable0).zzd);
                            v8 = 13;
                        }
                        else if(throwable0 instanceof zzsf) {
                            v10 = ((zzsf)throwable0).zzb;
                            v8 = 14;
                        }
                        else if(throwable0 instanceof OutOfMemoryError) {
                            v8 = 14;
                            v10 = 0;
                        }
                        else if(throwable0 instanceof zzpi) {
                            v10 = ((zzpi)throwable0).zza;
                            v8 = 17;
                        }
                        else if(throwable0 instanceof zzpl) {
                            v10 = ((zzpl)throwable0).zza;
                            v8 = 18;
                        }
                        else if(throwable0 instanceof MediaCodec.CryptoException) {
                            v11 = ((MediaCodec.CryptoException)throwable0).getErrorCode();
                            v10 = v11;
                            v8 = zzoc.zzr(v11);
                        }
                        else {
                            v8 = 22;
                            v10 = 0;
                        }
                    }
                    else if(throwable0 instanceof zzgr) {
                        v10 = ((zzgr)throwable0).zzc;
                        v8 = 5;
                    }
                    else if(throwable0 instanceof zzgq || throwable0 instanceof zzbc) {
                        v8 = 11;
                        v10 = 0;
                    }
                    else if(throwable0 instanceof zzgp || throwable0 instanceof zzgz) {
                        if(zzdw.zzb(context0).zza() == 1) {
                            v8 = 3;
                        }
                        else {
                            Throwable throwable4 = throwable0.getCause();
                            if(throwable4 instanceof UnknownHostException) {
                                v8 = 6;
                            }
                            else if(throwable4 instanceof SocketTimeoutException) {
                                v8 = 7;
                            }
                            else if(!(throwable0 instanceof zzgp) || ((zzgp)throwable0).zzb != 1) {
                                v8 = 8;
                            }
                            else {
                                v8 = 4;
                            }
                        }
                        v10 = 0;
                    }
                    else if(zzbd0.zza == 1002) {
                        v8 = 21;
                        v10 = 0;
                    }
                    else if(throwable0 instanceof zzqy) {
                        Throwable throwable1 = throwable0.getCause();
                        throwable1.getClass();
                        if(throwable1 instanceof MediaDrm.MediaDrmStateException) {
                            v11 = zzei.zzm(((MediaDrm.MediaDrmStateException)throwable1).getDiagnosticInfo());
                            v10 = v11;
                            v8 = zzoc.zzr(v11);
                        }
                        else {
                            if(zzei.zza >= 23 && W0.a(throwable1)) {
                                v8 = 27;
                            }
                            else if(throwable1 instanceof NotProvisionedException) {
                                v8 = 24;
                            }
                            else if(throwable1 instanceof DeniedByServerException) {
                                v8 = 29;
                            }
                            else if(throwable1 instanceof zzri) {
                                v8 = 23;
                            }
                            else if(throwable1 instanceof zzqx) {
                                v8 = 28;
                            }
                            else {
                                v8 = 30;
                            }
                            v10 = 0;
                        }
                    }
                    else {
                        if(!(throwable0 instanceof zzgm) || !(throwable0.getCause() instanceof FileNotFoundException)) {
                            v8 = 9;
                        }
                        else {
                            Throwable throwable2 = throwable0.getCause();
                            throwable2.getClass();
                            Throwable throwable3 = throwable2.getCause();
                            v8 = !(throwable3 instanceof ErrnoException) || ((ErrnoException)throwable3).errno != OsConstants.EACCES ? 0x1F : 0x20;
                        }
                        v10 = 0;
                    }
                }
                PlaybackErrorEvent playbackErrorEvent0 = r1.a().setTimeSinceCreatedMillis(v2 - this.zzd).setErrorCode(v8).setSubErrorCode(v10).setException(zzbd0).build();
                this.zzc.reportPlaybackErrorEvent(playbackErrorEvent0);
                this.zzz = true;
                this.zzn = null;
            }
            if(zzlv0.zzd(2)) {
                zzby zzby0 = zzbk0.zzo();
                boolean z1 = zzby0.zzb(2);
                boolean z2 = zzby0.zzb(1);
                boolean z3 = zzby0.zzb(3);
                if(z1 || z2) {
                label_178:
                    if(!z1) {
                        this.zzw(v2, null, 0);
                    }
                    if(!z2) {
                        this.zzt(v2, null, 0);
                    }
                    if(!z3) {
                        this.zzu(v2, null, 0);
                    }
                }
                else if(z3) {
                    z3 = true;
                    goto label_178;
                }
            }
            if(this.zzy(this.zzo)) {
                zzab zzab0 = this.zzo.zza;
                if(zzab0.zzw != -1) {
                    this.zzw(v2, zzab0, 0);
                    this.zzo = null;
                }
            }
            if(this.zzy(this.zzp)) {
                this.zzt(v2, this.zzp.zza, 0);
                this.zzp = null;
            }
            if(this.zzy(this.zzq)) {
                this.zzu(v2, this.zzq.zza, 0);
                this.zzq = null;
            }
            switch(zzdw.zzb(this.zza).zza()) {
                case 0: {
                    v12 = 0;
                    break;
                }
                case 1: {
                    v12 = 9;
                    break;
                }
                case 2: {
                    v12 = 2;
                    break;
                }
                case 3: {
                    v12 = 4;
                    break;
                }
                case 4: {
                    v12 = 5;
                    break;
                }
                case 5: {
                    v12 = 6;
                    break;
                }
                case 7: {
                    v12 = 3;
                    break;
                }
                case 9: {
                    v12 = 8;
                    break;
                }
                case 10: {
                    v12 = 7;
                    break;
                }
                default: {
                    v12 = 1;
                }
            }
            if(v12 != this.zzm) {
                this.zzm = v12;
                NetworkEvent networkEvent0 = p1.a().setNetworkType(v12).setTimeSinceCreatedMillis(v2 - this.zzd).build();
                this.zzc.reportNetworkEvent(networkEvent0);
            }
            if(zzbk0.zzf() != 2) {
                this.zzu = false;
            }
            if(((zzlr)zzbk0).zzC() == null) {
                this.zzv = false;
            }
            else if(zzlv0.zzd(10)) {
                this.zzv = true;
            }
            int v13 = 4;
            int v14 = zzbk0.zzf();
            if(this.zzu) {
                v13 = 5;
            }
            else if(this.zzv) {
                v13 = 13;
            }
            else {
                switch(v14) {
                    case 1: {
                        v13 = this.zzl == 0 ? this.zzl : 12;
                        break;
                    }
                    case 2: {
                        if(this.zzl == 0 || this.zzl == 2 || this.zzl == 12) {
                            v13 = 2;
                        }
                        else if(!zzbk0.zzu()) {
                            v13 = 7;
                        }
                        else if(zzbk0.zzg() == 0) {
                            v13 = 6;
                        }
                        else {
                            v13 = 10;
                        }
                        break;
                    }
                    case 3: {
                        if(zzbk0.zzu()) {
                            v13 = zzbk0.zzg() == 0 ? 3 : 9;
                        }
                        break;
                    }
                    case 4: {
                        v13 = 11;
                        break;
                    }
                    default: {
                        v13 = this.zzl;
                    }
                }
            }
            if(this.zzl != v13) {
                this.zzl = v13;
                this.zzz = true;
                PlaybackStateEvent playbackStateEvent0 = s1.a().setState(this.zzl).setTimeSinceCreatedMillis(v2 - this.zzd).build();
                this.zzc.reportPlaybackStateEvent(playbackStateEvent0);
            }
            if(zzlv0.zzd(0x404)) {
                zzlu zzlu2 = zzlv0.zzc(0x404);
                this.zzb.zzg(zzlu2);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzlw
    public final void zzj(zzlu zzlu0, zztx zztx0, zzuc zzuc0, IOException iOException0, boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzlw
    public final void zzk(zzlu zzlu0, int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzlw
    public final void zzl(zzlu zzlu0, zzbd zzbd0) {
        this.zzn = zzbd0;
    }

    @Override  // com.google.android.gms.internal.ads.zzlw
    public final void zzm(zzlu zzlu0, zzbi zzbi0, zzbi zzbi1, int v) {
        if(v == 1) {
            this.zzu = true;
            v = 1;
        }
        this.zzk = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzlw
    public final void zzn(zzlu zzlu0, Object object0, long v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzlw
    public final void zzo(zzlu zzlu0, zzhs zzhs0) {
        this.zzw += zzhs0.zzg;
        this.zzx += zzhs0.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzlw
    public final void zzp(zzlu zzlu0, zzab zzab0, zzht zzht0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzlw
    public final void zzq(zzlu zzlu0, zzcd zzcd0) {
        zzob zzob0 = this.zzo;
        if(zzob0 != null) {
            zzab zzab0 = zzob0.zza;
            if(zzab0.zzw == -1) {
                zzz zzz0 = zzab0.zzb();
                zzz0.zzaf(zzcd0.zzb);
                zzz0.zzK(zzcd0.zzc);
                this.zzo = new zzob(zzz0.zzag(), 0, zzob0.zzc);
            }
        }
    }

    @SuppressLint({"SwitchIntDef"})
    private static int zzr(int v) {
        switch(zzei.zzl(v)) {
            case 6002: {
                return 24;
            }
            case 6003: {
                return 28;
            }
            case 6004: {
                return 25;
            }
            case 6005: {
                return 26;
            }
            default: {
                return 27;
            }
        }
    }

    private final void zzs() {
        PlaybackMetrics.Builder playbackMetrics$Builder0 = this.zzj;
        if(playbackMetrics$Builder0 != null && this.zzz) {
            playbackMetrics$Builder0.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            Long long0 = (Long)this.zzg.get(this.zzi);
            this.zzj.setNetworkTransferDurationMillis((long0 == null ? 0L : ((long)long0)));
            Long long1 = (Long)this.zzh.get(this.zzi);
            this.zzj.setNetworkBytesRead((long1 == null ? 0L : ((long)long1)));
            this.zzj.setStreamSource((long1 == null || ((long)long1) <= 0L ? 0 : 1));
            PlaybackMetrics playbackMetrics0 = this.zzj.build();
            this.zzc.reportPlaybackMetrics(playbackMetrics0);
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long v, @Nullable zzab zzab0, int v1) {
        if(Objects.equals(this.zzs, zzab0)) {
            return;
        }
        int v2 = this.zzs == null ? 1 : 0;
        this.zzs = zzab0;
        this.zzx(0, v, zzab0, v2);
    }

    private final void zzu(long v, @Nullable zzab zzab0, int v1) {
        if(Objects.equals(this.zzt, zzab0)) {
            return;
        }
        int v2 = this.zzt == null ? 1 : 0;
        this.zzt = zzab0;
        this.zzx(2, v, zzab0, v2);
    }

    @m({"metricsBuilder"})
    private final void zzv(zzbq zzbq0, @Nullable zzug zzug0) {
        PlaybackMetrics.Builder playbackMetrics$Builder0 = this.zzj;
        if(zzug0 != null) {
            int v = zzbq0.zza(zzug0.zza);
            if(v != -1) {
                int v1 = 0;
                zzbq0.zzd(v, this.zzf, false);
                zzbq0.zze(this.zzf.zzc, this.zze, 0L);
                zzam zzam0 = this.zze.zzd.zzb;
                int v2 = 2;
                if(zzam0 != null) {
                    switch(zzei.zzo(zzam0.zza)) {
                        case 0: {
                            v1 = 3;
                            break;
                        }
                        case 1: {
                            v1 = 5;
                            break;
                        }
                        case 2: {
                            v1 = 4;
                            break;
                        }
                        default: {
                            v1 = 1;
                        }
                    }
                }
                playbackMetrics$Builder0.setStreamType(v1);
                long v3 = this.zze.zzm;
                if(v3 != 0x8000000000000001L && !this.zze.zzk && !this.zze.zzi && !this.zze.zzb()) {
                    playbackMetrics$Builder0.setMediaDurationMillis(zzei.zzv(v3));
                }
                if(!this.zze.zzb()) {
                    v2 = 1;
                }
                playbackMetrics$Builder0.setPlaybackType(v2);
                this.zzz = true;
            }
        }
    }

    private final void zzw(long v, @Nullable zzab zzab0, int v1) {
        if(Objects.equals(this.zzr, zzab0)) {
            return;
        }
        int v2 = this.zzr == null ? 1 : 0;
        this.zzr = zzab0;
        this.zzx(1, v, zzab0, v2);
    }

    private final void zzx(int v, long v1, @Nullable zzab zzab0, int v2) {
        TrackChangeEvent.Builder trackChangeEvent$Builder0 = n1.a(v).setTimeSinceCreatedMillis(v1 - this.zzd);
        if(zzab0 == null) {
            trackChangeEvent$Builder0.setTrackState(0);
        }
        else {
            trackChangeEvent$Builder0.setTrackState(1);
            trackChangeEvent$Builder0.setTrackChangeReason((v2 == 1 ? 2 : 1));
            String s = zzab0.zzn;
            if(s != null) {
                trackChangeEvent$Builder0.setContainerMimeType(s);
            }
            String s1 = zzab0.zzo;
            if(s1 != null) {
                trackChangeEvent$Builder0.setSampleMimeType(s1);
            }
            String s2 = zzab0.zzk;
            if(s2 != null) {
                trackChangeEvent$Builder0.setCodecName(s2);
            }
            int v3 = zzab0.zzj;
            if(v3 != -1) {
                trackChangeEvent$Builder0.setBitrate(v3);
            }
            int v4 = zzab0.zzv;
            if(v4 != -1) {
                trackChangeEvent$Builder0.setWidth(v4);
            }
            int v5 = zzab0.zzw;
            if(v5 != -1) {
                trackChangeEvent$Builder0.setHeight(v5);
            }
            int v6 = zzab0.zzD;
            if(v6 != -1) {
                trackChangeEvent$Builder0.setChannelCount(v6);
            }
            int v7 = zzab0.zzE;
            if(v7 != -1) {
                trackChangeEvent$Builder0.setAudioSampleRate(v7);
            }
            String s3 = zzab0.zzd;
            if(s3 != null) {
                String[] arr_s = s3.split("-", -1);
                Pair pair0 = Pair.create(arr_s[0], (arr_s.length < 2 ? null : arr_s[1]));
                trackChangeEvent$Builder0.setLanguage(((String)pair0.first));
                Object object0 = pair0.second;
                if(object0 != null) {
                    trackChangeEvent$Builder0.setLanguageRegion(((String)object0));
                }
            }
            float f = zzab0.zzx;
            if(f != -1.0f) {
                trackChangeEvent$Builder0.setVideoFrameRate(f);
            }
        }
        this.zzz = true;
        TrackChangeEvent trackChangeEvent0 = trackChangeEvent$Builder0.build();
        this.zzc.reportTrackChangeEvent(trackChangeEvent0);
    }

    @e(expression = {"#1"}, result = true)
    private final boolean zzy(@Nullable zzob zzob0) {
        if(zzob0 != null) {
            String s = this.zzb.zze();
            return zzob0.zzc.equals(s);
        }
        return false;
    }
}

