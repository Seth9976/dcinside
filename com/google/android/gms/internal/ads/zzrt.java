package com.google.android.gms.internal.ads;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.Callback;
import android.media.MediaCodec.CodecException;
import android.media.MediaCodec.CryptoException;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.collection.CircularIntArray;
import java.util.ArrayDeque;

@RequiresApi(23)
final class zzrt extends MediaCodec.Callback {
    private final Object zza;
    private final HandlerThread zzb;
    private Handler zzc;
    @GuardedBy("lock")
    private final CircularIntArray zzd;
    @GuardedBy("lock")
    private final CircularIntArray zze;
    @GuardedBy("lock")
    private final ArrayDeque zzf;
    @GuardedBy("lock")
    private final ArrayDeque zzg;
    @GuardedBy("lock")
    @Nullable
    private MediaFormat zzh;
    @GuardedBy("lock")
    @Nullable
    private MediaFormat zzi;
    @GuardedBy("lock")
    @Nullable
    private MediaCodec.CodecException zzj;
    @GuardedBy("lock")
    @Nullable
    private MediaCodec.CryptoException zzk;
    @GuardedBy("lock")
    private long zzl;
    @GuardedBy("lock")
    private boolean zzm;
    @GuardedBy("lock")
    @Nullable
    private IllegalStateException zzn;
    @GuardedBy("lock")
    @Nullable
    private zzsc zzo;

    zzrt(HandlerThread handlerThread0) {
        this.zza = new Object();
        this.zzb = handlerThread0;
        this.zzd = new CircularIntArray();
        this.zze = new CircularIntArray();
        this.zzf = new ArrayDeque();
        this.zzg = new ArrayDeque();
    }

    @Override  // android.media.MediaCodec$Callback
    public final void onCryptoError(MediaCodec mediaCodec0, MediaCodec.CryptoException mediaCodec$CryptoException0) {
        synchronized(this.zza) {
            this.zzk = mediaCodec$CryptoException0;
        }
    }

    @Override  // android.media.MediaCodec$Callback
    public final void onError(MediaCodec mediaCodec0, MediaCodec.CodecException mediaCodec$CodecException0) {
        synchronized(this.zza) {
            this.zzj = mediaCodec$CodecException0;
        }
    }

    @Override  // android.media.MediaCodec$Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec0, int v) {
        synchronized(this.zza) {
            this.zzd.b(v);
            zzsc zzsc0 = this.zzo;
            if(zzsc0 != null) {
                zzsn zzsn0 = ((zzsk)zzsc0).zza;
                if(zzsn0.zzo != null) {
                    zzsn0.zzo.zza();
                }
            }
        }
    }

    @Override  // android.media.MediaCodec$Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec0, int v, MediaCodec.BufferInfo mediaCodec$BufferInfo0) {
        synchronized(this.zza) {
            MediaFormat mediaFormat0 = this.zzi;
            if(mediaFormat0 != null) {
                this.zzi(mediaFormat0);
                this.zzi = null;
            }
            this.zze.b(v);
            this.zzf.add(mediaCodec$BufferInfo0);
            zzsc zzsc0 = this.zzo;
            if(zzsc0 != null) {
                zzsn zzsn0 = ((zzsk)zzsc0).zza;
                if(zzsn0.zzo != null) {
                    zzsn0.zzo.zza();
                }
            }
        }
    }

    @Override  // android.media.MediaCodec$Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec0, MediaFormat mediaFormat0) {
        synchronized(this.zza) {
            this.zzi(mediaFormat0);
            this.zzi = null;
        }
    }

    public final int zza() {
        synchronized(this.zza) {
            this.zzk();
            int v1 = -1;
            if(this.zzl()) {
                return -1;
            }
            if(!this.zzd.h()) {
                v1 = this.zzd.i();
            }
            return v1;
        }
    }

    public final int zzb(MediaCodec.BufferInfo mediaCodec$BufferInfo0) {
        synchronized(this.zza) {
            this.zzk();
            if(this.zzl()) {
                return -1;
            }
            if(this.zze.h()) {
                return -1;
            }
            int v1 = this.zze.i();
            if(v1 >= 0) {
                zzcw.zzb(this.zzh);
                MediaCodec.BufferInfo mediaCodec$BufferInfo1 = (MediaCodec.BufferInfo)this.zzf.remove();
                mediaCodec$BufferInfo0.set(mediaCodec$BufferInfo1.offset, mediaCodec$BufferInfo1.size, mediaCodec$BufferInfo1.presentationTimeUs, mediaCodec$BufferInfo1.flags);
            }
            else if(v1 == -2) {
                this.zzh = (MediaFormat)this.zzg.remove();
                v1 = -2;
            }
            return v1;
        }
    }

    public final MediaFormat zzc() {
        synchronized(this.zza) {
            MediaFormat mediaFormat0 = this.zzh;
            if(mediaFormat0 != null) {
                return mediaFormat0;
            }
        }
        throw new IllegalStateException();
    }

    // 检测为 Lambda 实现
    public static void zzd(zzrt zzrt0) [...]

    public final void zze() {
        synchronized(this.zza) {
            ++this.zzl;
            this.zzc.post(() -> synchronized(this.zza) {
                if(this.zzm) {
                    return;
                }
                long v1 = this.zzl - 1L;
                this.zzl = v1;
                int v2 = Long.compare(v1, 0L);
                if(v2 > 0) {
                    return;
                }
                if(v2 < 0) {
                    IllegalStateException illegalStateException0 = new IllegalStateException();
                    synchronized(this.zza) {
                        this.zzn = illegalStateException0;
                    }
                    return;
                }
                this.zzj();
            });
        }
    }

    public final void zzf(MediaCodec mediaCodec0) {
        zzcw.zzf(this.zzc == null);
        this.zzb.start();
        Handler handler0 = new Handler(this.zzb.getLooper());
        mediaCodec0.setCallback(this, handler0);
        this.zzc = handler0;
    }

    public final void zzg(zzsc zzsc0) {
        synchronized(this.zza) {
            this.zzo = zzsc0;
        }
    }

    public final void zzh() {
        synchronized(this.zza) {
            this.zzm = true;
            this.zzb.quit();
            this.zzj();
        }
    }

    @GuardedBy("lock")
    private final void zzi(MediaFormat mediaFormat0) {
        this.zze.b(-2);
        this.zzg.add(mediaFormat0);
    }

    @GuardedBy("lock")
    private final void zzj() {
        if(!this.zzg.isEmpty()) {
            this.zzi = (MediaFormat)this.zzg.getLast();
        }
        this.zzd.c();
        this.zze.c();
        this.zzf.clear();
        this.zzg.clear();
    }

    @GuardedBy("lock")
    private final void zzk() {
        IllegalStateException illegalStateException0 = this.zzn;
        if(illegalStateException0 == null) {
            MediaCodec.CodecException mediaCodec$CodecException0 = this.zzj;
            if(mediaCodec$CodecException0 == null) {
                MediaCodec.CryptoException mediaCodec$CryptoException0 = this.zzk;
                if(mediaCodec$CryptoException0 == null) {
                    return;
                }
                this.zzk = null;
                throw mediaCodec$CryptoException0;
            }
            this.zzj = null;
            throw mediaCodec$CodecException0;
        }
        this.zzn = null;
        throw illegalStateException0;
    }

    @GuardedBy("lock")
    private final boolean zzl() {
        return this.zzl > 0L || this.zzm;
    }
}

