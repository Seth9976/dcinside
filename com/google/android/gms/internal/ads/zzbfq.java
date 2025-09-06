package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.ArrayList;
import java.util.List;

public final class zzbfq extends AdChoicesInfo {
    private final zzbfp zza;
    private final List zzb;
    private String zzc;

    public zzbfq(zzbfp zzbfp0) {
        this.zzb = new ArrayList();
        this.zza = zzbfp0;
        try {
            this.zzc = zzbfp0.zzg();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            this.zzc = "";
        }
        try {
            for(Object object0: zzbfp0.zzh()) {
                zzbfw zzbfw0 = null;
                if(object0 instanceof IBinder && ((IBinder)object0) != null) {
                    IInterface iInterface0 = ((IBinder)object0).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbfw0 = iInterface0 instanceof zzbfw ? ((zzbfw)iInterface0) : new zzbfu(((IBinder)object0));
                }
                if(zzbfw0 != null) {
                    zzbfx zzbfx0 = new zzbfx(zzbfw0);
                    this.zzb.add(zzbfx0);
                }
            }
            return;
        }
        catch(RemoteException remoteException1) {
        }
        zzo.zzh("", remoteException1);
    }

    @Override  // com.google.android.gms.ads.formats.NativeAd$AdChoicesInfo
    public final List getImages() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.ads.formats.NativeAd$AdChoicesInfo
    public final CharSequence getText() {
        return this.zzc;
    }
}

