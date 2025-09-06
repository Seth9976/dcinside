package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.decoder.c;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

@RequiresApi(23)
final class zzrr implements zzse {
    @GuardedBy("MESSAGE_PARAMS_INSTANCE_POOL")
    private static final ArrayDeque zza;
    private static final Object zzb;
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzda zzg;
    private boolean zzh;

    static {
        zzrr.zza = new ArrayDeque();
        zzrr.zzb = new Object();
    }

    public zzrr(MediaCodec mediaCodec0, HandlerThread handlerThread0) {
        zzda zzda0 = new zzda(zzcx.zza);
        super();
        this.zzc = mediaCodec0;
        this.zzd = handlerThread0;
        this.zzg = zzda0;
        this.zzf = new AtomicReference();
    }

    static void zza(zzrr zzrr0, Message message0) {
        zzrq zzrq1;
        zzrq zzrq0 = null;
        switch(message0.what) {
            case 1: {
                zzrq1 = (zzrq)message0.obj;
                try {
                    zzrr0.zzc.queueInputBuffer(zzrq1.zza, 0, zzrq1.zzc, zzrq1.zze, zzrq1.zzf);
                }
                catch(RuntimeException runtimeException0) {
                    zzro.zza(zzrr0.zzf, null, runtimeException0);
                }
                zzrq0 = zzrq1;
                break;
            }
            case 2: {
                zzrq1 = (zzrq)message0.obj;
                int v = zzrq1.zza;
                long v1 = zzrq1.zze;
                int v2 = zzrq1.zzf;
                try {
                    synchronized(zzrr.zzb) {
                        zzrr0.zzc.queueSecureInputBuffer(v, 0, zzrq1.zzd, v1, v2);
                    }
                }
                catch(RuntimeException runtimeException1) {
                    zzro.zza(zzrr0.zzf, null, runtimeException1);
                }
                zzrq0 = zzrq1;
                break;
            }
            case 3: {
                zzrr0.zzg.zze();
                break;
            }
            case 4: {
                Bundle bundle0 = (Bundle)message0.obj;
                try {
                    zzrr0.zzc.setParameters(bundle0);
                }
                catch(RuntimeException runtimeException2) {
                    zzro.zza(zzrr0.zzf, null, runtimeException2);
                }
                break;
            }
            default: {
                IllegalStateException illegalStateException0 = new IllegalStateException(String.valueOf(message0.what));
                zzro.zza(zzrr0.zzf, null, illegalStateException0);
            }
        }
        if(zzrq0 != null) {
            synchronized(zzrr.zza) {
                zzrr.zza.add(zzrq0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzse
    public final void zzb() {
        if(this.zzh) {
            try {
                Handler handler0 = this.zze;
                if(handler0 == null) {
                    throw null;
                }
                handler0.removeCallbacksAndMessages(null);
                this.zzg.zzc();
                Handler handler1 = this.zze;
                if(handler1 == null) {
                    throw null;
                }
                handler1.obtainMessage(3).sendToTarget();
                this.zzg.zza();
                return;
            }
            catch(InterruptedException interruptedException0) {
            }
            Thread.currentThread().interrupt();
            throw new IllegalStateException(interruptedException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzse
    public final void zzc() {
        RuntimeException runtimeException0 = (RuntimeException)this.zzf.getAndSet(null);
        if(runtimeException0 != null) {
            throw runtimeException0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzse
    public final void zzd(int v, int v1, int v2, long v3, int v4) {
        this.zzc();
        zzrq zzrq0 = zzrr.zzi();
        zzrq0.zza(v, 0, v2, v3, v4);
        this.zze.obtainMessage(1, zzrq0).sendToTarget();
    }

    @Override  // com.google.android.gms.internal.ads.zzse
    public final void zze(int v, int v1, zzhe zzhe0, long v2, int v3) {
        this.zzc();
        zzrq zzrq0 = zzrr.zzi();
        zzrq0.zza(v, 0, 0, v2, 0);
        MediaCodec.CryptoInfo mediaCodec$CryptoInfo0 = zzrq0.zzd;
        mediaCodec$CryptoInfo0.numSubSamples = zzhe0.zzf;
        mediaCodec$CryptoInfo0.numBytesOfClearData = zzrr.zzk(zzhe0.zzd, mediaCodec$CryptoInfo0.numBytesOfClearData);
        mediaCodec$CryptoInfo0.numBytesOfEncryptedData = zzrr.zzk(zzhe0.zze, mediaCodec$CryptoInfo0.numBytesOfEncryptedData);
        byte[] arr_b = zzrr.zzj(zzhe0.zzb, mediaCodec$CryptoInfo0.key);
        arr_b.getClass();
        mediaCodec$CryptoInfo0.key = arr_b;
        byte[] arr_b1 = zzrr.zzj(zzhe0.zza, mediaCodec$CryptoInfo0.iv);
        arr_b1.getClass();
        mediaCodec$CryptoInfo0.iv = arr_b1;
        mediaCodec$CryptoInfo0.mode = zzhe0.zzc;
        if(zzei.zza >= 24) {
            mediaCodec$CryptoInfo0.setPattern(c.a(zzhe0.zzg, zzhe0.zzh));
        }
        this.zze.obtainMessage(2, zzrq0).sendToTarget();
    }

    @Override  // com.google.android.gms.internal.ads.zzse
    public final void zzf(Bundle bundle0) {
        this.zzc();
        this.zze.obtainMessage(4, bundle0).sendToTarget();
    }

    @Override  // com.google.android.gms.internal.ads.zzse
    public final void zzg() {
        if(this.zzh) {
            this.zzb();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzse
    public final void zzh() {
        if(!this.zzh) {
            this.zzd.start();
            this.zze = new zzrp(this, this.zzd.getLooper());
            this.zzh = true;
        }
    }

    private static zzrq zzi() {
        ArrayDeque arrayDeque0 = zzrr.zza;
        synchronized(arrayDeque0) {
            if(arrayDeque0.isEmpty()) {
                return new zzrq();
            }
        }
        return (zzrq)arrayDeque0.removeFirst();
    }

    @Nullable
    private static byte[] zzj(@Nullable byte[] arr_b, @Nullable byte[] arr_b1) {
        if(arr_b == null) {
            return arr_b1;
        }
        if(arr_b1 != null && arr_b1.length >= arr_b.length) {
            System.arraycopy(arr_b, 0, arr_b1, 0, arr_b.length);
            return arr_b1;
        }
        return Arrays.copyOf(arr_b, arr_b.length);
    }

    @Nullable
    private static int[] zzk(@Nullable int[] arr_v, @Nullable int[] arr_v1) {
        if(arr_v == null) {
            return arr_v1;
        }
        if(arr_v1 != null && arr_v1.length >= arr_v.length) {
            System.arraycopy(arr_v, 0, arr_v1, 0, arr_v.length);
            return arr_v1;
        }
        return Arrays.copyOf(arr_v, arr_v.length);
    }
}

