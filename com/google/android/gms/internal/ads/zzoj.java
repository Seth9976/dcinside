package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import androidx.annotation.RequiresApi;
import j..util.Objects;

@RequiresApi(23)
final class zzoj extends AudioDeviceCallback {
    final zzon zza;

    zzoj(zzon zzon0, zzom zzom0) {
        this.zza = zzon0;
        super();
    }

    @Override  // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] arr_audioDeviceInfo) {
        zzoi zzoi0 = zzoi.zzc(this.zza.zza, this.zza.zzh, this.zza.zzg);
        this.zza.zzj(zzoi0);
    }

    @Override  // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] arr_audioDeviceInfo) {
        zzoo zzoo0 = this.zza.zzg;
        for(int v = 0; v < arr_audioDeviceInfo.length; ++v) {
            if(Objects.equals(arr_audioDeviceInfo[v], zzoo0)) {
                zzon.zze(this.zza, null);
                break;
            }
        }
        zzoi zzoi0 = zzoi.zzc(this.zza.zza, this.zza.zzh, this.zza.zzg);
        this.zza.zzj(zzoi0);
    }
}

