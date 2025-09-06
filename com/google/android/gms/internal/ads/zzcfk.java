package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzn;
import o3.j;

@j
public final class zzcfk {
    public static final zzcex zza(Context context0, zzcgr zzcgr0, String s, boolean z, boolean z1, @Nullable zzava zzava0, @Nullable zzbds zzbds0, VersionInfoParcel versionInfoParcel0, @Nullable zzbda zzbda0, @Nullable zzn zzn0, @Nullable zza zza0, zzbbj zzbbj0, @Nullable zzfbo zzfbo0, @Nullable zzfbr zzfbr0, @Nullable zzebv zzebv0, @Nullable zzfcn zzfcn0) throws zzcfj {
        Object object0;
        zzbcl.zza(context0);
        try {
            zzcfg zzcfg0 = new zzcfg(context0, zzcgr0, s, z, z1, zzava0, zzbds0, versionInfoParcel0, null, zzn0, zza0, zzbbj0, zzfbo0, zzfbr0, zzfcn0, zzebv0);
            StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(strictMode$ThreadPolicy0).permitDiskReads().permitDiskWrites().build());
                object0 = zzcfg0.zza();
            }
            finally {
                StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
            }
            return (zzcex)object0;
        }
        catch(Throwable throwable0) {
        }
        throw new zzcfj("Webview initialization failed.", throwable0);
    }
}

