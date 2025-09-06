package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzfd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd.Image;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import java.util.List;

public final class zzbss implements NativeCustomFormatAd {
    private final zzbgq zza;
    private DisplayOpenMeasurement zzb;

    @VisibleForTesting
    public zzbss(zzbgq zzbgq0) {
        this.zza = zzbgq0;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void destroy() {
        try {
            this.zza.zzl();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    @Nullable
    public final List getAvailableAssetNames() {
        try {
            return this.zza.zzk();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    @Nullable
    public final String getCustomFormatId() {
        try {
            return this.zza.zzi();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if(this.zzb == null && this.zza.zzq()) {
                this.zzb = new zzbsl(this.zza);
                return this.zzb;
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
        return this.zzb;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    @Nullable
    public final Image getImage(String s) {
        try {
            zzbfw zzbfw0 = this.zza.zzg(s);
            if(zzbfw0 != null) {
                return new zzbsm(zzbfw0);
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
        return null;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    @Nullable
    public final MediaContent getMediaContent() {
        try {
            if(this.zza.zzf() != null) {
                return new zzfd(this.zza.zzf(), this.zza);
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
        return null;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    @Nullable
    public final CharSequence getText(String s) {
        try {
            return this.zza.zzj(s);
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void performClick(String s) {
        try {
            this.zza.zzn(s);
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void recordImpression() {
        try {
            this.zza.zzo();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
    }
}

