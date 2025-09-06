package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzfd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbga;
import d4.c;
import h4.m;

public final class NativeAdView extends FrameLayout {
    @c
    private final FrameLayout zza;
    @Nullable
    @c
    private final zzbga zzb;

    public NativeAdView(@NonNull Context context0) {
        super(context0);
        this.zza = this.zzd(context0);
        this.zzb = this.zze();
    }

    public NativeAdView(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.zza = this.zzd(context0);
        this.zzb = this.zze();
    }

    public NativeAdView(@NonNull Context context0, @NonNull AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.zza = this.zzd(context0);
        this.zzb = this.zze();
    }

    @TargetApi(21)
    public NativeAdView(@NonNull Context context0, @NonNull AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.zza = this.zzd(context0);
        this.zzb = this.zze();
    }

    @Override  // android.view.ViewGroup
    public final void addView(@NonNull View view0, int v, @NonNull ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.addView(view0, v, viewGroup$LayoutParams0);
        super.bringChildToFront(this.zza);
    }

    @Override  // android.view.ViewGroup
    public final void bringChildToFront(@NonNull View view0) {
        super.bringChildToFront(view0);
        FrameLayout frameLayout0 = this.zza;
        if(frameLayout0 != view0) {
            super.bringChildToFront(frameLayout0);
        }
    }

    public void destroy() {
        zzbga zzbga0 = this.zzb;
        if(zzbga0 == null) {
            return;
        }
        try {
            zzbga0.zzc();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("Unable to destroy native ad view", remoteException0);
        }
    }

    @Override  // android.view.ViewGroup
    public final boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent0) {
        if(this.zzb != null && ((Boolean)zzbe.zzc().zza(zzbcl.zzls)).booleanValue()) {
            try {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(motionEvent0);
                this.zzb.zzd(iObjectWrapper0);
                return super.dispatchTouchEvent(motionEvent0);
            }
            catch(RemoteException remoteException0) {
                zzo.zzh("Unable to call handleTouchEvent on delegate", remoteException0);
                return super.dispatchTouchEvent(motionEvent0);
            }
        }
        return super.dispatchTouchEvent(motionEvent0);
    }

    @Nullable
    public AdChoicesView getAdChoicesView() {
        View view0 = this.zza("3011");
        return view0 instanceof AdChoicesView ? ((AdChoicesView)view0) : null;
    }

    @Nullable
    public final View getAdvertiserView() {
        return this.zza("3005");
    }

    @Nullable
    public final View getBodyView() {
        return this.zza("3004");
    }

    @Nullable
    public final View getCallToActionView() {
        return this.zza("3002");
    }

    @Nullable
    public final View getHeadlineView() {
        return this.zza("3001");
    }

    @Nullable
    public final View getIconView() {
        return this.zza("3003");
    }

    @Nullable
    public final View getImageView() {
        return this.zza("3008");
    }

    @Nullable
    public final MediaView getMediaView() {
        View view0 = this.zza("3010");
        if(view0 instanceof MediaView) {
            return (MediaView)view0;
        }
        if(view0 != null) {
            zzo.zze("View is not an instance of MediaView");
        }
        return null;
    }

    @Nullable
    public final View getPriceView() {
        return this.zza("3007");
    }

    @Nullable
    public final View getStarRatingView() {
        return this.zza("3009");
    }

    @Nullable
    public final View getStoreView() {
        return this.zza("3006");
    }

    @Override  // android.view.View
    public final void onVisibilityChanged(@NonNull View view0, int v) {
        super.onVisibilityChanged(view0, v);
        zzbga zzbga0 = this.zzb;
        if(zzbga0 == null) {
            return;
        }
        try {
            zzbga0.zze(ObjectWrapper.wrap(view0), v);
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("Unable to call onVisibilityChanged on delegate", remoteException0);
        }
    }

    @Override  // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.zza);
    }

    @Override  // android.view.ViewGroup
    public final void removeView(@NonNull View view0) {
        if(this.zza == view0) {
            return;
        }
        super.removeView(view0);
    }

    public void setAdChoicesView(@Nullable AdChoicesView adChoicesView0) {
        this.zzf("3011", adChoicesView0);
    }

    public final void setAdvertiserView(@Nullable View view0) {
        this.zzf("3005", view0);
    }

    public final void setBodyView(@Nullable View view0) {
        this.zzf("3004", view0);
    }

    public final void setCallToActionView(@Nullable View view0) {
        this.zzf("3002", view0);
    }

    public final void setClickConfirmingView(@Nullable View view0) {
        zzbga zzbga0 = this.zzb;
        if(zzbga0 == null) {
            return;
        }
        try {
            zzbga0.zzdu(ObjectWrapper.wrap(view0));
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("Unable to call setClickConfirmingView on delegate", remoteException0);
        }
    }

    public final void setHeadlineView(@Nullable View view0) {
        this.zzf("3001", view0);
    }

    public final void setIconView(@Nullable View view0) {
        this.zzf("3003", view0);
    }

    public final void setImageView(@Nullable View view0) {
        this.zzf("3008", view0);
    }

    public final void setMediaView(@Nullable MediaView mediaView0) {
        this.zzf("3010", mediaView0);
        if(mediaView0 == null) {
            return;
        }
        mediaView0.zza(new zzb(this));
        mediaView0.zzb(new zzc(this));
    }

    public void setNativeAd(@NonNull NativeAd nativeAd0) {
        zzbga zzbga0 = this.zzb;
        if(zzbga0 == null) {
            return;
        }
        try {
            zzbga0.zzdx(((IObjectWrapper)nativeAd0.zza()));
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("Unable to call setNativeAd on delegate", remoteException0);
        }
    }

    public final void setPriceView(@Nullable View view0) {
        this.zzf("3007", view0);
    }

    public final void setStarRatingView(@Nullable View view0) {
        this.zzf("3009", view0);
    }

    public final void setStoreView(@Nullable View view0) {
        this.zzf("3006", view0);
    }

    @Nullable
    protected final View zza(@NonNull String s) {
        zzbga zzbga0 = this.zzb;
        if(zzbga0 != null) {
            try {
                IObjectWrapper iObjectWrapper0 = zzbga0.zzb(s);
                if(iObjectWrapper0 != null) {
                    return (View)ObjectWrapper.unwrap(iObjectWrapper0);
                }
            }
            catch(RemoteException remoteException0) {
                zzo.zzh("Unable to call getAssetView on delegate", remoteException0);
            }
        }
        return null;
    }

    final void zzb(MediaContent mediaContent0) {
        zzbga zzbga0 = this.zzb;
        if(zzbga0 == null) {
            return;
        }
        try {
            if(mediaContent0 instanceof zzfd) {
                zzbga0.zzdv(((zzfd)mediaContent0).zzc());
                return;
            }
            if(mediaContent0 == null) {
                zzbga0.zzdv(null);
                return;
            }
            zzo.zze("Use MediaContent provided by NativeAd.getMediaContent");
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzo.zzh("Unable to call setMediaContent on delegate", remoteException0);
    }

    final void zzc(ImageView.ScaleType imageView$ScaleType0) {
        zzbga zzbga0 = this.zzb;
        if(zzbga0 != null && imageView$ScaleType0 != null) {
            try {
                zzbga0.zzdw(ObjectWrapper.wrap(imageView$ScaleType0));
            }
            catch(RemoteException remoteException0) {
                zzo.zzh("Unable to call setMediaViewImageScaleType on delegate", remoteException0);
            }
        }
    }

    private final FrameLayout zzd(Context context0) {
        FrameLayout frameLayout0 = new FrameLayout(context0);
        frameLayout0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.addView(frameLayout0);
        return frameLayout0;
    }

    // 去混淆评级： 低(20)
    @Nullable
    @m({"overlayFrame"})
    private final zzbga zze() {
        return this.isInEditMode() ? null : zzbc.zza().zzj(this.zza.getContext(), this, this.zza);
    }

    private final void zzf(String s, @Nullable View view0) {
        zzbga zzbga0 = this.zzb;
        if(zzbga0 == null) {
            return;
        }
        try {
            zzbga0.zzdt(s, ObjectWrapper.wrap(view0));
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("Unable to call setAssetView on delegate", remoteException0);
        }
    }
}

