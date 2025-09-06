package com.google.android.gms.internal.ads;

import android.os.Handler.Callback;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer.FrameCallback;
import android.view.Choreographer;

final class zzaao implements Handler.Callback, Choreographer.FrameCallback {
    public volatile long zza;
    private static final zzaao zzb;
    private final Handler zzc;
    private final HandlerThread zzd;
    private Choreographer zze;
    private int zzf;

    static {
        zzaao.zzb = new zzaao();
    }

    private zzaao() {
        this.zza = 0x8000000000000001L;
        HandlerThread handlerThread0 = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.zzd = handlerThread0;
        handlerThread0.start();
        Handler handler0 = new Handler(handlerThread0.getLooper(), this);
        this.zzc = handler0;
        handler0.sendEmptyMessage(1);
    }

    @Override  // android.view.Choreographer$FrameCallback
    public final void doFrame(long v) {
        this.zza = v;
        Choreographer choreographer0 = this.zze;
        choreographer0.getClass();
        choreographer0.postFrameCallbackDelayed(this, 500L);
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        switch(message0.what) {
            case 1: {
                try {
                    this.zze = Choreographer.getInstance();
                }
                catch(RuntimeException runtimeException0) {
                    zzdo.zzg("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", runtimeException0);
                }
                return true;
            }
            case 2: {
                Choreographer choreographer0 = this.zze;
                if(choreographer0 != null) {
                    int v = this.zzf + 1;
                    this.zzf = v;
                    if(v == 1) {
                        choreographer0.postFrameCallback(this);
                    }
                }
                return true;
            }
            case 3: {
                Choreographer choreographer1 = this.zze;
                if(choreographer1 != null) {
                    int v1 = this.zzf - 1;
                    this.zzf = v1;
                    if(v1 == 0) {
                        choreographer1.removeFrameCallback(this);
                        this.zza = 0x8000000000000001L;
                    }
                }
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static zzaao zza() {
        return zzaao.zzb;
    }

    public final void zzb() {
        this.zzc.sendEmptyMessage(2);
    }

    public final void zzc() {
        this.zzc.sendEmptyMessage(3);
    }
}

