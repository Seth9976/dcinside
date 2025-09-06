package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting.OnRoutingChangedListener;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(24)
final class zzqf {
    private final AudioTrack zza;
    private final zzon zzb;
    @Nullable
    private AudioRouting.OnRoutingChangedListener zzc;

    public zzqf(AudioTrack audioTrack0, zzon zzon0) {
        this.zza = audioTrack0;
        this.zzb = zzon0;
        this.zzc = (AudioRouting audioRouting0) -> if(this.zzc != null && audioRouting0.getRoutedDevice() != null) {
            AudioDeviceInfo audioDeviceInfo0 = audioRouting0.getRoutedDevice();
            this.zzb.zzh(audioDeviceInfo0);
        };
        Handler handler0 = new Handler(Looper.myLooper());
        audioTrack0.addOnRoutingChangedListener(this.zzc, handler0);
    }

    // 检测为 Lambda 实现
    public static void zza(zzqf zzqf0, AudioRouting audioRouting0) [...]

    public final void zzb() {
        AudioRouting.OnRoutingChangedListener audioRouting$OnRoutingChangedListener0 = this.zzc;
        audioRouting$OnRoutingChangedListener0.getClass();
        this.zza.removeOnRoutingChangedListener(audioRouting$OnRoutingChangedListener0);
        this.zzc = null;
    }
}

