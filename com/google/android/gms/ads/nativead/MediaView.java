package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbgq;

public class MediaView extends FrameLayout {
    @Nullable
    private MediaContent zza;
    private boolean zzb;
    private ImageView.ScaleType zzc;
    private boolean zzd;
    private zzb zze;
    private zzc zzf;

    public MediaView(@NonNull Context context0) {
        super(context0);
    }

    public MediaView(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public MediaView(@NonNull Context context0, @NonNull AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @TargetApi(21)
    public MediaView(@NonNull Context context0, @NonNull AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
    }

    @Nullable
    public MediaContent getMediaContent() {
        return this.zza;
    }

    public void setImageScaleType(@NonNull ImageView.ScaleType imageView$ScaleType0) {
        this.zzd = true;
        this.zzc = imageView$ScaleType0;
        zzc zzc0 = this.zzf;
        if(zzc0 != null) {
            zzc0.zza.zzc(imageView$ScaleType0);
        }
    }

    public void setMediaContent(@Nullable MediaContent mediaContent0) {
        boolean z;
        this.zzb = true;
        this.zza = mediaContent0;
        zzb zzb0 = this.zze;
        if(zzb0 != null) {
            zzb0.zza.zzb(mediaContent0);
        }
        if(mediaContent0 == null) {
            return;
        }
        else {
            try {
                zzbgq zzbgq0 = mediaContent0.zza();
                if(zzbgq0 != null) {
                    if(mediaContent0.hasVideoContent()) {
                        z = zzbgq0.zzs(ObjectWrapper.wrap(this));
                        goto label_13;
                    }
                    else if(mediaContent0.zzb()) {
                        z = zzbgq0.zzr(ObjectWrapper.wrap(this));
                    label_13:
                        if(!z) {
                            this.removeAllViews();
                            return;
                        }
                    }
                    else {
                        this.removeAllViews();
                    }
                }
                return;
            }
            catch(RemoteException remoteException0) {
            }
        }
        this.removeAllViews();
        zzo.zzh("", remoteException0);
    }

    protected final void zza(zzb zzb0) {
        synchronized(this) {
            this.zze = zzb0;
            if(this.zzb) {
                zzb0.zza.zzb(this.zza);
            }
        }
    }

    protected final void zzb(zzc zzc0) {
        synchronized(this) {
            this.zzf = zzc0;
            if(this.zzd) {
                zzc0.zza.zzc(this.zzc);
            }
        }
    }
}

