package com.google.android.gms.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzfz;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.annotation.KeepForSdk;
import jeb.synthetic.FIN;

public final class VideoController {
    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    @KeepForSdk
    public static final int PLAYBACK_STATE_ENDED = 3;
    @KeepForSdk
    public static final int PLAYBACK_STATE_PAUSED = 2;
    @KeepForSdk
    public static final int PLAYBACK_STATE_PLAYING = 1;
    @KeepForSdk
    public static final int PLAYBACK_STATE_READY = 5;
    @KeepForSdk
    public static final int PLAYBACK_STATE_UNKNOWN;
    private final Object zza;
    @Nullable
    private zzeb zzb;
    @Nullable
    private VideoLifecycleCallbacks zzc;

    public VideoController() {
        this.zza = new Object();
    }

    @KeepForSdk
    public int getPlaybackState() {
        Object object0 = this.zza;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        zzeb zzeb0 = this.zzb;
        if(zzeb0 == null) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v);
            return 0;
        }
        try {
            int v1 = zzeb0.zzh();
            FIN.finallyExec$NT(v);
            return v1;
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("Unable to call getPlaybackState on video controller.", remoteException0);
            FIN.finallyExec$NT(v);
            return 0;
        }
    }

    @Nullable
    public VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        synchronized(this.zza) {
        }
        return this.zzc;
    }

    public boolean hasVideoContent() {
        synchronized(this.zza) {
        }
        return this.zzb != null;
    }

    public boolean isClickToExpandEnabled() {
        Object object0 = this.zza;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        zzeb zzeb0 = this.zzb;
        if(zzeb0 == null) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v);
            return false;
        }
        try {
            boolean z = zzeb0.zzo();
            FIN.finallyExec$NT(v);
            return z;
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("Unable to call isClickToExpandEnabled.", remoteException0);
            FIN.finallyExec$NT(v);
            return false;
        }
    }

    public boolean isCustomControlsEnabled() {
        Object object0 = this.zza;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        zzeb zzeb0 = this.zzb;
        if(zzeb0 == null) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v);
            return false;
        }
        try {
            boolean z = zzeb0.zzp();
            FIN.finallyExec$NT(v);
            return z;
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("Unable to call isUsingCustomPlayerControls.", remoteException0);
            FIN.finallyExec$NT(v);
            return false;
        }
    }

    public boolean isMuted() {
        Object object0 = this.zza;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        zzeb zzeb0 = this.zzb;
        if(zzeb0 == null) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v);
            return true;
        }
        try {
            boolean z = zzeb0.zzq();
            FIN.finallyExec$NT(v);
            return z;
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("Unable to call isMuted on video controller.", remoteException0);
            FIN.finallyExec$NT(v);
            return true;
        }
    }

    public void mute(boolean z) {
        synchronized(this.zza) {
            zzeb zzeb0 = this.zzb;
            if(zzeb0 == null) {
                return;
            }
            try {
                zzeb0.zzj(z);
            }
            catch(RemoteException remoteException0) {
                zzo.zzh("Unable to call mute on video controller.", remoteException0);
            }
        }
    }

    public void pause() {
        synchronized(this.zza) {
            zzeb zzeb0 = this.zzb;
            if(zzeb0 == null) {
                return;
            }
            try {
                zzeb0.zzk();
            }
            catch(RemoteException remoteException0) {
                zzo.zzh("Unable to call pause on video controller.", remoteException0);
            }
        }
    }

    public void play() {
        synchronized(this.zza) {
            zzeb zzeb0 = this.zzb;
            if(zzeb0 == null) {
                return;
            }
            try {
                zzeb0.zzl();
            }
            catch(RemoteException remoteException0) {
                zzo.zzh("Unable to call play on video controller.", remoteException0);
            }
        }
    }

    public void setVideoLifecycleCallbacks(@Nullable VideoLifecycleCallbacks videoController$VideoLifecycleCallbacks0) {
        zzfz zzfz0;
        synchronized(this.zza) {
            this.zzc = videoController$VideoLifecycleCallbacks0;
            zzeb zzeb0 = this.zzb;
            if(zzeb0 == null) {
                return;
            }
            if(videoController$VideoLifecycleCallbacks0 == null) {
                zzfz0 = null;
            }
            else {
                try {
                    zzfz0 = new zzfz(videoController$VideoLifecycleCallbacks0);
                label_14:
                    zzeb0.zzm(zzfz0);
                    return;
                }
                catch(RemoteException remoteException0) {
                }
                zzo.zzh("Unable to call setVideoLifecycleCallbacks on video controller.", remoteException0);
                return;
            }
            goto label_14;
        }
    }

    public void stop() {
        synchronized(this.zza) {
            zzeb zzeb0 = this.zzb;
            if(zzeb0 == null) {
                return;
            }
            try {
                zzeb0.zzn();
            }
            catch(RemoteException remoteException0) {
                zzo.zzh("Unable to call stop on video controller.", remoteException0);
            }
        }
    }

    @Nullable
    public final zzeb zza() {
        synchronized(this.zza) {
        }
        return this.zzb;
    }

    public final void zzb(@Nullable zzeb zzeb0) {
        synchronized(this.zza) {
            this.zzb = zzeb0;
            VideoLifecycleCallbacks videoController$VideoLifecycleCallbacks0 = this.zzc;
            if(videoController$VideoLifecycleCallbacks0 != null) {
                this.setVideoLifecycleCallbacks(videoController$VideoLifecycleCallbacks0);
            }
        }
    }
}

