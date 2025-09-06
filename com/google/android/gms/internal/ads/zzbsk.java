package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo;
import java.util.ArrayList;
import java.util.List;

public final class zzbsk extends AdChoicesInfo {
    private final List zza;
    private String zzb;

    public zzbsk(zzbfp zzbfp0) {
        this.zza = new ArrayList();
        try {
            this.zzb = zzbfp0.zzg();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            this.zzb = "";
        }
        try {
            for(Object object0: zzbfp0.zzh()) {
                zzbfw zzbfw0 = object0 instanceof IBinder ? zzbfv.zzg(((IBinder)object0)) : null;
                if(zzbfw0 != null) {
                    zzbsm zzbsm0 = new zzbsm(zzbfw0);
                    this.zza.add(zzbsm0);
                }
            }
            return;
        }
        catch(RemoteException remoteException1) {
        }
        zzo.zzh("", remoteException1);
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd$AdChoicesInfo
    public final List getImages() {
        return this.zza;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd$AdChoicesInfo
    public final CharSequence getText() {
        return this.zzb;
    }
}

