package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.annotation.Nullable;
import java.io.IOException;

@SuppressLint({"HandlerLeak"})
final class zzys extends Handler implements Runnable {
    final zzyy zza;
    private final zzyt zzb;
    private final long zzc;
    @Nullable
    private zzyq zzd;
    @Nullable
    private IOException zze;
    private int zzf;
    @Nullable
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    public zzys(zzyy zzyy0, Looper looper0, zzyt zzyt0, zzyq zzyq0, int v, long v1) {
        this.zza = zzyy0;
        super(looper0);
        this.zzb = zzyt0;
        this.zzd = zzyq0;
        this.zzc = v1;
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        if(!this.zzi) {
            int v = message0.what;
            if(v == 1) {
                this.zzd();
                return;
            }
            if(v != 4) {
                this.zza.zzd = null;
                long v1 = SystemClock.elapsedRealtime();
                long v2 = v1 - this.zzc;
                zzyq zzyq0 = this.zzd;
                zzyq0.getClass();
                if(this.zzh) {
                    zzyq0.zzJ(this.zzb, v1, v2, false);
                    return;
                }
                switch(message0.what) {
                    case 2: {
                        try {
                            zzyq0.zzK(this.zzb, v1, v2);
                        }
                        catch(RuntimeException runtimeException0) {
                            zzdo.zzd("LoadTask", "Unexpected exception handling load completed", runtimeException0);
                            zzyw zzyw0 = new zzyw(runtimeException0);
                            this.zza.zze = zzyw0;
                        }
                        return;
                    }
                    case 3: {
                        this.zze = (IOException)message0.obj;
                        int v3 = this.zzf + 1;
                        this.zzf = v3;
                        zzyr zzyr0 = zzyq0.zzu(this.zzb, v1, v2, ((IOException)message0.obj), v3);
                        if(zzyr0.zza == 3) {
                            this.zza.zze = this.zze;
                            return;
                        }
                        switch(zzyr0.zza) {
                            case 1: {
                                this.zzf = 1;
                                this.zzc((zzyr0.zzb == 0x8000000000000001L ? ((long)Math.min((this.zzf - 1) * 1000, 5000)) : zzyr0.zzb));
                                return;
                            }
                            case 2: {
                                return;
                            }
                            default: {
                                this.zzc((zzyr0.zzb == 0x8000000000000001L ? ((long)Math.min((this.zzf - 1) * 1000, 5000)) : zzyr0.zzb));
                                return;
                            }
                        }
                    }
                    default: {
                        return;
                    }
                }
            }
            throw (Error)message0.obj;
        }
    }

    @Override
    public final void run() {
        try {
            __monitor_enter(this);
            this.zzg = Thread.currentThread();
            __monitor_exit(this);
            if(!this.zzh) {
                Trace.beginSection(("load:" + this.zzb.getClass().getSimpleName()));
                try {
                    this.zzb.zzh();
                }
                finally {
                    Trace.endSection();
                }
            }
            synchronized(this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if(!this.zzi) {
                this.sendEmptyMessage(2);
                return;
            label_27:
                if(!this.zzi) {
                    goto label_28;
                }
            }
            return;
        }
        catch(IOException iOException0) {
            goto label_27;
        }
        catch(Exception exception0) {
            goto label_30;
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            goto label_34;
        }
        catch(Error error0) {
            goto label_38;
        }
    label_28:
        this.obtainMessage(3, iOException0).sendToTarget();
        return;
    label_30:
        if(!this.zzi) {
            zzdo.zzd("LoadTask", "Unexpected exception loading stream", exception0);
            this.obtainMessage(3, new zzyw(exception0)).sendToTarget();
            return;
        label_34:
            if(!this.zzi) {
                zzdo.zzd("LoadTask", "OutOfMemory error loading stream", outOfMemoryError0);
                this.obtainMessage(3, new zzyw(outOfMemoryError0)).sendToTarget();
                return;
            label_38:
                if(!this.zzi) {
                    zzdo.zzd("LoadTask", "Unexpected error loading stream", error0);
                    this.obtainMessage(4, error0).sendToTarget();
                }
                throw error0;
            }
        }
    }

    public final void zza(boolean z) {
        this.zzi = z;
        this.zze = null;
        if(this.hasMessages(1)) {
            this.zzh = true;
            this.removeMessages(1);
            if(!z) {
                this.sendEmptyMessage(2);
            }
        }
        else {
            synchronized(this) {
                this.zzh = true;
                this.zzb.zzg();
                Thread thread0 = this.zzg;
                if(thread0 != null) {
                    thread0.interrupt();
                }
            }
        }
        if(z) {
            this.zza.zzd = null;
            long v1 = SystemClock.elapsedRealtime();
            zzyq zzyq0 = this.zzd;
            zzyq0.getClass();
            zzyq0.zzJ(this.zzb, v1, v1 - this.zzc, true);
            this.zzd = null;
        }
    }

    public final void zzb(int v) throws IOException {
        IOException iOException0 = this.zze;
        if(iOException0 != null && this.zzf > v) {
            throw iOException0;
        }
    }

    public final void zzc(long v) {
        zzcw.zzf(this.zza.zzd == null);
        this.zza.zzd = this;
        if(v > 0L) {
            this.sendEmptyMessageDelayed(1, v);
            return;
        }
        this.zzd();
    }

    private final void zzd() {
        SystemClock.elapsedRealtime();
        this.zzd.getClass();
        this.zze = null;
        zzzg zzzg0 = this.zza.zzc;
        zzys zzys0 = this.zza.zzd;
        zzys0.getClass();
        zzzg0.execute(zzys0);
    }
}

