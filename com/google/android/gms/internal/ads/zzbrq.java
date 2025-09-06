package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzc;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbrq extends zzbrc {
    private final RtbAdapter zza;
    private MediationInterstitialAd zzb;
    private MediationRewardedAd zzc;
    private MediationAppOpenAd zzd;
    private String zze;

    public zzbrq(RtbAdapter rtbAdapter0) {
        this.zze = "";
        this.zza = rtbAdapter0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    @Nullable
    public final zzeb zze() {
        RtbAdapter rtbAdapter0 = this.zza;
        if(rtbAdapter0 instanceof zza) {
            try {
                return ((zza)rtbAdapter0).getVideoController();
            }
            catch(Throwable throwable0) {
                zzo.zzh("", throwable0);
            }
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final zzbrs zzf() throws RemoteException {
        return zzbrs.zza(this.zza.getVersionInfo());
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final zzbrs zzg() throws RemoteException {
        return zzbrs.zza(this.zza.getSDKVersionInfo());
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final void zzh(IObjectWrapper iObjectWrapper0, String s, Bundle bundle0, Bundle bundle1, zzs zzs0, zzbrg zzbrg0) throws RemoteException {
        AdFormat adFormat0;
        try {
            zzbro zzbro0 = new zzbro(this, zzbrg0);
            RtbAdapter rtbAdapter0 = this.zza;
            switch(s) {
                case "app_open": {
                    adFormat0 = AdFormat.APP_OPEN_AD;
                    break;
                }
                case "app_open_ad": {
                    if(!((Boolean)zzbe.zzc().zza(zzbcl.zzlI)).booleanValue()) {
                        throw new IllegalArgumentException("Internal Error");
                    }
                    adFormat0 = AdFormat.APP_OPEN_AD;
                    break;
                }
                case "banner": {
                    adFormat0 = AdFormat.BANNER;
                    break;
                }
                case "interstitial": {
                    adFormat0 = AdFormat.INTERSTITIAL;
                    break;
                }
                case "native": {
                    adFormat0 = AdFormat.NATIVE;
                    break;
                }
                case "rewarded": {
                    adFormat0 = AdFormat.REWARDED;
                    break;
                }
                case "rewarded_interstitial": {
                    adFormat0 = AdFormat.REWARDED_INTERSTITIAL;
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Internal Error");
                }
            }
            MediationConfiguration mediationConfiguration0 = new MediationConfiguration(adFormat0, bundle1);
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(mediationConfiguration0);
            rtbAdapter0.collectSignals(new RtbSignalData(((Context)ObjectWrapper.unwrap(iObjectWrapper0)), arrayList0, bundle0, zzc.zzc(zzs0.zze, zzs0.zzb, zzs0.zza)), zzbro0);
            return;
        }
        catch(Throwable throwable0) {
        }
        zzo.zzh("Error generating signals for RTB", throwable0);
        zzbpb.zza(iObjectWrapper0, throwable0, "adapter.collectSignals");
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final void zzi(String s, String s1, zzm zzm0, IObjectWrapper iObjectWrapper0, zzbqo zzbqo0, zzbpk zzbpk0) throws RemoteException {
        try {
            zzbrn zzbrn0 = new zzbrn(this, zzbqo0, zzbpk0);
            Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
            Bundle bundle0 = zzbrq.zzw(s1);
            Bundle bundle1 = this.zzv(zzm0);
            boolean z = zzbrq.zzx(zzm0);
            String s2 = zzbrq.zzy(s1, zzm0);
            MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration0 = new MediationAppOpenAdConfiguration(((Context)object0), s, bundle0, bundle1, z, zzm0.zzk, zzm0.zzg, zzm0.zzt, s2, this.zze);
            this.zza.loadRtbAppOpenAd(mediationAppOpenAdConfiguration0, zzbrn0);
        }
        catch(Throwable throwable0) {
            zzo.zzh("Adapter failed to render app open ad.", throwable0);
            zzbpb.zza(iObjectWrapper0, throwable0, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final void zzj(String s, String s1, zzm zzm0, IObjectWrapper iObjectWrapper0, zzbqr zzbqr0, zzbpk zzbpk0, zzs zzs0) throws RemoteException {
        try {
            zzbri zzbri0 = new zzbri(this, zzbqr0, zzbpk0);
            Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
            Bundle bundle0 = zzbrq.zzw(s1);
            Bundle bundle1 = this.zzv(zzm0);
            boolean z = zzbrq.zzx(zzm0);
            String s2 = zzbrq.zzy(s1, zzm0);
            AdSize adSize0 = zzc.zzc(zzs0.zze, zzs0.zzb, zzs0.zza);
            MediationBannerAdConfiguration mediationBannerAdConfiguration0 = new MediationBannerAdConfiguration(((Context)object0), s, bundle0, bundle1, z, zzm0.zzk, zzm0.zzg, zzm0.zzt, s2, adSize0, this.zze);
            this.zza.loadRtbBannerAd(mediationBannerAdConfiguration0, zzbri0);
        }
        catch(Throwable throwable0) {
            zzo.zzh("Adapter failed to render banner ad.", throwable0);
            zzbpb.zza(iObjectWrapper0, throwable0, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final void zzk(String s, String s1, zzm zzm0, IObjectWrapper iObjectWrapper0, zzbqr zzbqr0, zzbpk zzbpk0, zzs zzs0) throws RemoteException {
        try {
            zzbrj zzbrj0 = new zzbrj(this, zzbqr0, zzbpk0);
            Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
            Bundle bundle0 = zzbrq.zzw(s1);
            Bundle bundle1 = this.zzv(zzm0);
            boolean z = zzbrq.zzx(zzm0);
            String s2 = zzbrq.zzy(s1, zzm0);
            AdSize adSize0 = zzc.zzc(zzs0.zze, zzs0.zzb, zzs0.zza);
            MediationBannerAdConfiguration mediationBannerAdConfiguration0 = new MediationBannerAdConfiguration(((Context)object0), s, bundle0, bundle1, z, zzm0.zzk, zzm0.zzg, zzm0.zzt, s2, adSize0, this.zze);
            this.zza.loadRtbInterscrollerAd(mediationBannerAdConfiguration0, zzbrj0);
        }
        catch(Throwable throwable0) {
            zzo.zzh("Adapter failed to render interscroller ad.", throwable0);
            zzbpb.zza(iObjectWrapper0, throwable0, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final void zzl(String s, String s1, zzm zzm0, IObjectWrapper iObjectWrapper0, zzbqu zzbqu0, zzbpk zzbpk0) throws RemoteException {
        try {
            zzbrk zzbrk0 = new zzbrk(this, zzbqu0, zzbpk0);
            Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
            Bundle bundle0 = zzbrq.zzw(s1);
            Bundle bundle1 = this.zzv(zzm0);
            boolean z = zzbrq.zzx(zzm0);
            String s2 = zzbrq.zzy(s1, zzm0);
            MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration0 = new MediationInterstitialAdConfiguration(((Context)object0), s, bundle0, bundle1, z, zzm0.zzk, zzm0.zzg, zzm0.zzt, s2, this.zze);
            this.zza.loadRtbInterstitialAd(mediationInterstitialAdConfiguration0, zzbrk0);
        }
        catch(Throwable throwable0) {
            zzo.zzh("Adapter failed to render interstitial ad.", throwable0);
            zzbpb.zza(iObjectWrapper0, throwable0, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final void zzm(String s, String s1, zzm zzm0, IObjectWrapper iObjectWrapper0, zzbqx zzbqx0, zzbpk zzbpk0) throws RemoteException {
        this.zzn(s, s1, zzm0, iObjectWrapper0, zzbqx0, zzbpk0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final void zzn(String s, String s1, zzm zzm0, IObjectWrapper iObjectWrapper0, zzbqx zzbqx0, zzbpk zzbpk0, zzbfl zzbfl0) throws RemoteException {
        try {
            zzbrl zzbrl0 = new zzbrl(this, zzbqx0, zzbpk0);
            Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
            Bundle bundle0 = zzbrq.zzw(s1);
            Bundle bundle1 = this.zzv(zzm0);
            boolean z = zzbrq.zzx(zzm0);
            String s2 = zzbrq.zzy(s1, zzm0);
            MediationNativeAdConfiguration mediationNativeAdConfiguration0 = new MediationNativeAdConfiguration(((Context)object0), s, bundle0, bundle1, z, zzm0.zzk, zzm0.zzg, zzm0.zzt, s2, this.zze, zzbfl0);
            this.zza.loadRtbNativeAdMapper(mediationNativeAdConfiguration0, zzbrl0);
        }
        catch(Throwable throwable0) {
            zzo.zzh("Adapter failed to render native ad.", throwable0);
            zzbpb.zza(iObjectWrapper0, throwable0, "adapter.loadRtbNativeAdMapper");
            String s3 = throwable0.getMessage();
            if(!TextUtils.isEmpty(s3) && s3.equals("Method is not found")) {
                try {
                    zzbrm zzbrm0 = new zzbrm(this, zzbqx0, zzbpk0);
                    Object object1 = ObjectWrapper.unwrap(iObjectWrapper0);
                    Bundle bundle2 = zzbrq.zzw(s1);
                    Bundle bundle3 = this.zzv(zzm0);
                    boolean z1 = zzbrq.zzx(zzm0);
                    String s4 = zzbrq.zzy(s1, zzm0);
                    MediationNativeAdConfiguration mediationNativeAdConfiguration1 = new MediationNativeAdConfiguration(((Context)object1), s, bundle2, bundle3, z1, zzm0.zzk, zzm0.zzg, zzm0.zzt, s4, this.zze, zzbfl0);
                    this.zza.loadRtbNativeAd(mediationNativeAdConfiguration1, zzbrm0);
                    return;
                }
                catch(Throwable throwable1) {
                    zzo.zzh("Adapter failed to render native ad.", throwable1);
                    zzbpb.zza(iObjectWrapper0, throwable1, "adapter.loadRtbNativeAd");
                    throw new RemoteException();
                }
            }
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final void zzo(String s, String s1, zzm zzm0, IObjectWrapper iObjectWrapper0, zzbra zzbra0, zzbpk zzbpk0) throws RemoteException {
        try {
            zzbrp zzbrp0 = new zzbrp(this, zzbra0, zzbpk0);
            Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
            Bundle bundle0 = zzbrq.zzw(s1);
            Bundle bundle1 = this.zzv(zzm0);
            boolean z = zzbrq.zzx(zzm0);
            String s2 = zzbrq.zzy(s1, zzm0);
            MediationRewardedAdConfiguration mediationRewardedAdConfiguration0 = new MediationRewardedAdConfiguration(((Context)object0), s, bundle0, bundle1, z, zzm0.zzk, zzm0.zzg, zzm0.zzt, s2, this.zze);
            this.zza.loadRtbRewardedInterstitialAd(mediationRewardedAdConfiguration0, zzbrp0);
        }
        catch(Throwable throwable0) {
            zzo.zzh("Adapter failed to render rewarded interstitial ad.", throwable0);
            zzbpb.zza(iObjectWrapper0, throwable0, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final void zzp(String s, String s1, zzm zzm0, IObjectWrapper iObjectWrapper0, zzbra zzbra0, zzbpk zzbpk0) throws RemoteException {
        try {
            zzbrp zzbrp0 = new zzbrp(this, zzbra0, zzbpk0);
            Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
            Bundle bundle0 = zzbrq.zzw(s1);
            Bundle bundle1 = this.zzv(zzm0);
            boolean z = zzbrq.zzx(zzm0);
            String s2 = zzbrq.zzy(s1, zzm0);
            MediationRewardedAdConfiguration mediationRewardedAdConfiguration0 = new MediationRewardedAdConfiguration(((Context)object0), s, bundle0, bundle1, z, zzm0.zzk, zzm0.zzg, zzm0.zzt, s2, this.zze);
            this.zza.loadRtbRewardedAd(mediationRewardedAdConfiguration0, zzbrp0);
        }
        catch(Throwable throwable0) {
            zzo.zzh("Adapter failed to render rewarded ad.", throwable0);
            zzbpb.zza(iObjectWrapper0, throwable0, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final void zzq(String s) {
        this.zze = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final boolean zzr(IObjectWrapper iObjectWrapper0) throws RemoteException {
        MediationAppOpenAd mediationAppOpenAd0 = this.zzd;
        if(mediationAppOpenAd0 != null) {
            try {
                mediationAppOpenAd0.showAd(((Context)ObjectWrapper.unwrap(iObjectWrapper0)));
            }
            catch(Throwable throwable0) {
                zzo.zzh("", throwable0);
                zzbpb.zza(iObjectWrapper0, throwable0, "adapter.showRtbAppOpenAd");
            }
            return true;
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final boolean zzs(IObjectWrapper iObjectWrapper0) throws RemoteException {
        MediationInterstitialAd mediationInterstitialAd0 = this.zzb;
        if(mediationInterstitialAd0 != null) {
            try {
                mediationInterstitialAd0.showAd(((Context)ObjectWrapper.unwrap(iObjectWrapper0)));
            }
            catch(Throwable throwable0) {
                zzo.zzh("", throwable0);
                zzbpb.zza(iObjectWrapper0, throwable0, "adapter.showRtbInterstitialAd");
            }
            return true;
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final boolean zzt(IObjectWrapper iObjectWrapper0) throws RemoteException {
        MediationRewardedAd mediationRewardedAd0 = this.zzc;
        if(mediationRewardedAd0 != null) {
            try {
                mediationRewardedAd0.showAd(((Context)ObjectWrapper.unwrap(iObjectWrapper0)));
            }
            catch(Throwable throwable0) {
                zzo.zzh("", throwable0);
                zzbpb.zza(iObjectWrapper0, throwable0, "adapter.showRtbRewardedAd");
            }
            return true;
        }
        return false;
    }

    private final Bundle zzv(zzm zzm0) {
        Bundle bundle0 = zzm0.zzm;
        if(bundle0 != null) {
            Bundle bundle1 = bundle0.getBundle(this.zza.getClass().getName());
            return bundle1 == null ? new Bundle() : bundle1;
        }
        return new Bundle();
    }

    private static final Bundle zzw(String s) throws RemoteException {
        zzo.zzj(("Server parameters: " + s));
        try {
            Bundle bundle0 = new Bundle();
            if(s != null) {
                JSONObject jSONObject0 = new JSONObject(s);
                Bundle bundle1 = new Bundle();
                Iterator iterator0 = jSONObject0.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    bundle1.putString(((String)object0), jSONObject0.getString(((String)object0)));
                }
                return bundle1;
            }
            return bundle0;
        }
        catch(JSONException jSONException0) {
            zzo.zzh("", jSONException0);
            throw new RemoteException();
        }
    }

    // 去混淆评级： 低(20)
    private static final boolean zzx(zzm zzm0) {
        return zzm0.zzf || zzf.zzr();
    }

    @Nullable
    private static final String zzy(String s, zzm zzm0) {
        String s1;
        try {
            s1 = zzm0.zzu;
            return new JSONObject(s).getString("max_ad_content_rating");
        }
        catch(JSONException unused_ex) {
            return s1;
        }
    }
}

