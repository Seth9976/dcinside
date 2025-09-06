package com.google.android.gms.ads.internal.client;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbft;
import com.google.android.gms.internal.ads.zzbgq;

public final class zzfd implements MediaContent {
    private final zzbft zza;
    private final VideoController zzb;
    @Nullable
    private final zzbgq zzc;

    public zzfd(zzbft zzbft0, @Nullable zzbgq zzbgq0) {
        this.zzb = new VideoController();
        this.zza = zzbft0;
        this.zzc = zzbgq0;
    }

    @Override  // com.google.android.gms.ads.MediaContent
    public final float getAspectRatio() {
        try {
            return this.zza.zze();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return 0.0f;
        }
    }

    @Override  // com.google.android.gms.ads.MediaContent
    public final float getCurrentTime() {
        try {
            return this.zza.zzf();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return 0.0f;
        }
    }

    @Override  // com.google.android.gms.ads.MediaContent
    public final float getDuration() {
        try {
            return this.zza.zzg();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return 0.0f;
        }
    }

    @Override  // com.google.android.gms.ads.MediaContent
    @Nullable
    public final Drawable getMainImage() {
        try {
            IObjectWrapper iObjectWrapper0 = this.zza.zzi();
            if(iObjectWrapper0 != null) {
                return (Drawable)ObjectWrapper.unwrap(iObjectWrapper0);
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
        return null;
    }

    @Override  // com.google.android.gms.ads.MediaContent
    public final VideoController getVideoController() {
        try {
            if(this.zza.zzh() != null) {
                zzeb zzeb0 = this.zza.zzh();
                this.zzb.zzb(zzeb0);
                return this.zzb;
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("Exception occurred while getting video controller", remoteException0);
        }
        return this.zzb;
    }

    @Override  // com.google.android.gms.ads.MediaContent
    public final boolean hasVideoContent() {
        try {
            return this.zza.zzl();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return false;
        }
    }

    @Override  // com.google.android.gms.ads.MediaContent
    public final void setMainImage(@Nullable Drawable drawable0) {
        try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(drawable0);
            this.zza.zzj(iObjectWrapper0);
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.MediaContent
    @Nullable
    public final zzbgq zza() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.ads.MediaContent
    public final boolean zzb() {
        try {
            return this.zza.zzk();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return false;
        }
    }

    public final zzbft zzc() {
        return this.zza;
    }
}

