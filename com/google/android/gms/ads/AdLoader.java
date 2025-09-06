package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.formats.zzf;
import com.google.android.gms.ads.formats.zzi;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzei;
import com.google.android.gms.ads.internal.client.zzfi;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomClickListener;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomFormatAdLoadedListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbej;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbha;
import com.google.android.gms.internal.ads.zzbhd;
import com.google.android.gms.internal.ads.zzbia;
import com.google.android.gms.internal.ads.zzbic;
import com.google.android.gms.internal.ads.zzbid;
import com.google.android.gms.internal.ads.zzbpa;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzbst;

public class AdLoader {
    public static class Builder {
        private final Context zza;
        private final zzbu zzb;

        public Builder(@NonNull Context context0, @NonNull String s) {
            Context context1 = (Context)Preconditions.checkNotNull(context0, "context cannot be null");
            zzbu zzbu0 = zzbc.zza().zzd(context0, s, new zzbpa());
            super();
            this.zza = context1;
            this.zzb = zzbu0;
        }

        @NonNull
        public AdLoader build() {
            try {
                zzbr zzbr0 = this.zzb.zze();
                return new AdLoader(this.zza, zzbr0, zzr.zza);
            }
            catch(RemoteException remoteException0) {
                zzo.zzh("Failed to build AdLoader.", remoteException0);
                zzbr zzbr1 = new zzfi().zzc();
                return new AdLoader(this.zza, zzbr1, zzr.zza);
            }
        }

        @NonNull
        public Builder forAdManagerAdView(@NonNull OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener0, @NonNull AdSize[] arr_adSize) {
            if(arr_adSize == null || arr_adSize.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                zzs zzs0 = new zzs(this.zza, arr_adSize);
                zzbic zzbic0 = new zzbic(onAdManagerAdViewLoadedListener0);
                this.zzb.zzj(zzbic0, zzs0);
            }
            catch(RemoteException remoteException0) {
                zzo.zzk("Failed to add Google Ad Manager banner ad listener", remoteException0);
            }
            return this;
        }

        @NonNull
        public Builder forCustomFormatAd(@NonNull String s, @NonNull OnCustomFormatAdLoadedListener nativeCustomFormatAd$OnCustomFormatAdLoadedListener0, @Nullable OnCustomClickListener nativeCustomFormatAd$OnCustomClickListener0) {
            zzbsr zzbsr0 = new zzbsr(nativeCustomFormatAd$OnCustomFormatAdLoadedListener0, nativeCustomFormatAd$OnCustomClickListener0);
            try {
                zzbhd zzbhd0 = zzbsr0.zzb();
                zzbha zzbha0 = zzbsr0.zza();
                this.zzb.zzh(s, zzbhd0, zzbha0);
            }
            catch(RemoteException remoteException0) {
                zzo.zzk("Failed to add custom format ad listener", remoteException0);
            }
            return this;
        }

        @NonNull
        public Builder forNativeAd(@NonNull OnNativeAdLoadedListener nativeAd$OnNativeAdLoadedListener0) {
            try {
                zzbst zzbst0 = new zzbst(nativeAd$OnNativeAdLoadedListener0);
                this.zzb.zzk(zzbst0);
            }
            catch(RemoteException remoteException0) {
                zzo.zzk("Failed to add google native ad listener", remoteException0);
            }
            return this;
        }

        @NonNull
        public Builder withAdListener(@NonNull AdListener adListener0) {
            try {
                zzg zzg0 = new zzg(adListener0);
                this.zzb.zzl(zzg0);
            }
            catch(RemoteException remoteException0) {
                zzo.zzk("Failed to set AdListener.", remoteException0);
            }
            return this;
        }

        @NonNull
        public Builder withAdManagerAdViewOptions(@NonNull AdManagerAdViewOptions adManagerAdViewOptions0) {
            try {
                this.zzb.zzm(adManagerAdViewOptions0);
            }
            catch(RemoteException remoteException0) {
                zzo.zzk("Failed to specify Ad Manager banner ad options", remoteException0);
            }
            return this;
        }

        @NonNull
        public Builder withNativeAdOptions(@NonNull NativeAdOptions nativeAdOptions0) {
            try {
                zzga zzga0 = nativeAdOptions0.getVideoOptions() == null ? null : new zzga(nativeAdOptions0.getVideoOptions());
                this.zzb.zzo(new zzbfl(4, nativeAdOptions0.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions0.shouldRequestMultipleImages(), nativeAdOptions0.getAdChoicesPlacement(), zzga0, nativeAdOptions0.zzc(), nativeAdOptions0.getMediaAspectRatio(), nativeAdOptions0.zza(), nativeAdOptions0.zzb(), nativeAdOptions0.zzd() - 1));
                return this;
            }
            catch(RemoteException remoteException0) {
            }
            zzo.zzk("Failed to specify native ad options", remoteException0);
            return this;
        }

        @Deprecated
        public final Builder zza(String s, com.google.android.gms.ads.formats.zzg zzg0, @Nullable zzf zzf0) {
            zzbia zzbia0 = new zzbia(zzg0, zzf0);
            try {
                zzbhd zzbhd0 = zzbia0.zzd();
                zzbha zzbha0 = zzbia0.zzc();
                this.zzb.zzh(s, zzbhd0, zzbha0);
            }
            catch(RemoteException remoteException0) {
                zzo.zzk("Failed to add custom template ad listener", remoteException0);
            }
            return this;
        }

        @Deprecated
        public final Builder zzb(zzi zzi0) {
            try {
                zzbid zzbid0 = new zzbid(zzi0);
                this.zzb.zzk(zzbid0);
            }
            catch(RemoteException remoteException0) {
                zzo.zzk("Failed to add google native ad listener", remoteException0);
            }
            return this;
        }

        @NonNull
        @Deprecated
        public final Builder zzc(@NonNull com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions0) {
            try {
                zzbfl zzbfl0 = new zzbfl(nativeAdOptions0);
                this.zzb.zzo(zzbfl0);
            }
            catch(RemoteException remoteException0) {
                zzo.zzk("Failed to specify native ad options", remoteException0);
            }
            return this;
        }
    }

    private final zzr zza;
    private final Context zzb;
    private final zzbr zzc;

    AdLoader(Context context0, zzbr zzbr0, zzr zzr0) {
        this.zzb = context0;
        this.zzc = zzbr0;
        this.zza = zzr0;
    }

    public boolean isLoading() {
        try {
            return this.zzc.zzi();
        }
        catch(RemoteException remoteException0) {
            zzo.zzk("Failed to check if ad is loading.", remoteException0);
            return false;
        }
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd(@NonNull AdRequest adRequest0) {
        this.zzb(adRequest0.zza);
    }

    public void loadAd(@NonNull AdManagerAdRequest adManagerAdRequest0) {
        this.zzb(adManagerAdRequest0.zza);
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAds(@NonNull AdRequest adRequest0, int v) {
        try {
            zzm zzm0 = this.zza.zza(this.zzb, adRequest0.zza);
            this.zzc.zzh(zzm0, v);
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("Failed to load ads.", remoteException0);
        }
    }

    // 检测为 Lambda 实现
    final void zza(zzei zzei0) [...]

    private final void zzb(zzei zzei0) {
        zzbcl.zza(this.zzb);
        if(((Boolean)zzbej.zzc.zze()).booleanValue() && ((Boolean)zzbe.zzc().zza(zzbcl.zzla)).booleanValue()) {
            zza zza0 = () -> try {
                zzm zzm0 = this.zza.zza(this.zzb, zzei0);
                this.zzc.zzg(zzm0);
            }
            catch(RemoteException remoteException0) {
                zzo.zzh("Failed to load ad.", remoteException0);
            };
            zzb.zzb.execute(zza0);
            return;
        }
        try {
            zzm zzm0 = this.zza.zza(this.zzb, zzei0);
            this.zzc.zzg(zzm0);
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("Failed to load ad.", remoteException0);
        }
    }
}

