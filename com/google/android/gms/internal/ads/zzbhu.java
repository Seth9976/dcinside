package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdi;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzbhu extends UnifiedNativeAd {
    private final zzbht zza;
    private final List zzb;
    private final zzbfx zzc;
    private final VideoController zzd;
    private final List zze;

    public zzbhu(zzbht zzbht0) {
        zzbfw zzbfw0;
        this.zzb = new ArrayList();
        this.zzd = new VideoController();
        this.zze = new ArrayList();
        this.zza = zzbht0;
        zzbfx zzbfx0 = null;
        try {
            List list0 = zzbht0.zzu();
            if(list0 != null) {
                Iterator iterator0 = list0.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    Object object0 = iterator0.next();
                    if(object0 instanceof IBinder && ((IBinder)object0) != null) {
                        IInterface iInterface0 = ((IBinder)object0).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        zzbfw0 = iInterface0 instanceof zzbfw ? ((zzbfw)iInterface0) : new zzbfu(((IBinder)object0));
                    }
                    else {
                        zzbfw0 = null;
                    }
                    if(zzbfw0 != null) {
                        zzbfx zzbfx1 = new zzbfx(zzbfw0);
                        this.zzb.add(zzbfx1);
                    }
                }
            }
            goto label_26;
        }
        catch(RemoteException remoteException0) {
        }
        zzo.zzh("", remoteException0);
        try {
        label_26:
            List list1 = this.zza.zzv();
            if(list1 != null) {
                Iterator iterator1 = list1.iterator();
                while(true) {
                    if(!iterator1.hasNext()) {
                        break;
                    }
                    Object object1 = iterator1.next();
                    zzdh zzdh0 = object1 instanceof IBinder ? zzdg.zzb(((IBinder)object1)) : null;
                    if(zzdh0 != null) {
                        zzdi zzdi0 = new zzdi(zzdh0);
                        this.zze.add(zzdi0);
                    }
                }
            }
            goto label_39;
        }
        catch(RemoteException remoteException1) {
        }
        zzo.zzh("", remoteException1);
        try {
        label_39:
            zzbfw zzbfw1 = this.zza.zzk();
            if(zzbfw1 != null) {
                zzbfx0 = new zzbfx(zzbfw1);
            }
        }
        catch(RemoteException remoteException2) {
            zzo.zzh("", remoteException2);
        }
        try {
            this.zzc = zzbfx0;
            if(this.zza.zzi() != null) {
                new zzbfq(this.zza.zzi());
            }
        }
        catch(RemoteException remoteException3) {
            zzo.zzh("", remoteException3);
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(Bundle bundle0) {
        try {
            this.zza.zzz(bundle0);
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(Bundle bundle0) {
        try {
            return this.zza.zzJ(bundle0);
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return false;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(Bundle bundle0) {
        try {
            this.zza.zzC(bundle0);
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController zza() {
        try {
            if(this.zza.zzh() != null) {
                zzeb zzeb0 = this.zza.zzh();
                this.zzd.zzb(zzeb0);
                return this.zzd;
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("Exception occurred while getting video controller", remoteException0);
        }
        return this.zzd;
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Image zzb() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final Double zzc() {
        try {
            double f = this.zza.zze();
            return f == -1.0 ? null : f;
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final Object zzd() {
        try {
            IObjectWrapper iObjectWrapper0 = this.zza.zzl();
            if(iObjectWrapper0 != null) {
                return ObjectWrapper.unwrap(iObjectWrapper0);
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
        return null;
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final String zze() {
        try {
            return this.zza.zzn();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final String zzf() {
        try {
            return this.zza.zzo();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final String zzg() {
        try {
            return this.zza.zzp();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final String zzh() {
        try {
            return this.zza.zzq();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final String zzi() {
        try {
            return this.zza.zzs();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final String zzj() {
        try {
            return this.zza.zzt();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List zzk() {
        return this.zzb;
    }
}

