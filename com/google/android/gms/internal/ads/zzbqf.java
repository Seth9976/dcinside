package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzc;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbqf extends zzbpg {
    private final Object zza;
    private zzbqh zzb;
    private zzbwh zzc;
    private IObjectWrapper zzd;
    private View zze;
    private MediationInterstitialAd zzf;
    private UnifiedNativeAdMapper zzg;
    private NativeAdMapper zzh;
    private MediationRewardedAd zzi;
    private MediationInterscrollerAd zzj;
    private MediationAppOpenAd zzk;
    private final String zzl;

    public zzbqf(@NonNull Adapter adapter0) {
        this.zzl = "";
        this.zza = adapter0;
    }

    public zzbqf(@NonNull MediationAdapter mediationAdapter0) {
        this.zzl = "";
        this.zza = mediationAdapter0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzA(IObjectWrapper iObjectWrapper0, zzm zzm0, String s, zzbpk zzbpk0) throws RemoteException {
        Object object0 = this.zza;
        if(object0 instanceof Adapter) {
            zzo.zze("Requesting rewarded ad from adapter.");
            try {
                zzbqd zzbqd0 = new zzbqd(this, zzbpk0);
                Object object1 = ObjectWrapper.unwrap(iObjectWrapper0);
                Bundle bundle0 = this.zzW(s, zzm0, null);
                Bundle bundle1 = this.zzV(zzm0);
                boolean z = zzbqf.zzX(zzm0);
                String s1 = zzbqf.zzY(s, zzm0);
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration0 = new MediationRewardedAdConfiguration(((Context)object1), "", bundle0, bundle1, z, zzm0.zzk, zzm0.zzg, zzm0.zzt, s1, "");
                ((Adapter)this.zza).loadRewardedAd(mediationRewardedAdConfiguration0, zzbqd0);
                return;
            }
            catch(Exception exception0) {
                zzo.zzh("", exception0);
                zzbpb.zza(iObjectWrapper0, exception0, "adapter.loadRewardedAd");
                throw new RemoteException();
            }
        }
        String s2 = object0.getClass().getCanonicalName();
        zzo.zzj((Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s2));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzB(zzm zzm0, String s, String s1) throws RemoteException {
        Object object0 = this.zza;
        if(object0 instanceof Adapter) {
            this.zzA(this.zzd, zzm0, s, new zzbqi(((Adapter)object0), this.zzc));
            return;
        }
        String s2 = object0.getClass().getCanonicalName();
        zzo.zzj((Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s2));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzC(IObjectWrapper iObjectWrapper0, zzm zzm0, String s, zzbpk zzbpk0) throws RemoteException {
        Object object0 = this.zza;
        if(object0 instanceof Adapter) {
            zzo.zze("Requesting rewarded interstitial ad from adapter.");
            try {
                zzbqd zzbqd0 = new zzbqd(this, zzbpk0);
                Object object1 = ObjectWrapper.unwrap(iObjectWrapper0);
                Bundle bundle0 = this.zzW(s, zzm0, null);
                Bundle bundle1 = this.zzV(zzm0);
                boolean z = zzbqf.zzX(zzm0);
                String s1 = zzbqf.zzY(s, zzm0);
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration0 = new MediationRewardedAdConfiguration(((Context)object1), "", bundle0, bundle1, z, zzm0.zzk, zzm0.zzg, zzm0.zzt, s1, "");
                ((Adapter)this.zza).loadRewardedInterstitialAd(mediationRewardedAdConfiguration0, zzbqd0);
                return;
            }
            catch(Exception exception0) {
                zzbpb.zza(iObjectWrapper0, exception0, "adapter.loadRewardedInterstitialAd");
                throw new RemoteException();
            }
        }
        String s2 = object0.getClass().getCanonicalName();
        zzo.zzj((Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s2));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzD(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        Object object0 = this.zza;
        if(object0 instanceof OnContextChangedListener) {
            ((OnContextChangedListener)object0).onContextChanged(context0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzE() throws RemoteException {
        Object object0 = this.zza;
        if(!(object0 instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter)object0).onPause();
        }
        catch(Throwable throwable0) {
            zzo.zzh("", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzF() throws RemoteException {
        Object object0 = this.zza;
        if(!(object0 instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter)object0).onResume();
        }
        catch(Throwable throwable0) {
            zzo.zzh("", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzG(boolean z) throws RemoteException {
        Object object0 = this.zza;
        if(object0 instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener)object0).onImmersiveModeUpdated(z);
            }
            catch(Throwable throwable0) {
                zzo.zzh("", throwable0);
            }
            return;
        }
        String s = object0.getClass().getCanonicalName();
        zzo.zze((OnImmersiveModeUpdatedListener.class.getCanonicalName() + " #009 Class mismatch: " + s));
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzH(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Object object0 = this.zza;
        if(object0 instanceof Adapter) {
            zzo.zze("Show app open ad from adapter.");
            MediationAppOpenAd mediationAppOpenAd0 = this.zzk;
            if(mediationAppOpenAd0 != null) {
                try {
                    mediationAppOpenAd0.showAd(((Context)ObjectWrapper.unwrap(iObjectWrapper0)));
                    return;
                }
                catch(RuntimeException runtimeException0) {
                    zzbpb.zza(iObjectWrapper0, runtimeException0, "adapter.appOpen.showAd");
                    throw runtimeException0;
                }
            }
            zzo.zzg("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        String s = object0.getClass().getCanonicalName();
        zzo.zzj((Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzI() throws RemoteException {
        Object object0 = this.zza;
        if(object0 instanceof MediationInterstitialAdapter) {
            zzo.zze("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter)this.zza).showInterstitial();
                return;
            }
            catch(Throwable throwable0) {
                zzo.zzh("", throwable0);
                throw new RemoteException();
            }
        }
        String s = object0.getClass().getCanonicalName();
        zzo.zzj((MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + s));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzJ(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Object object0 = this.zza;
        if(!(object0 instanceof Adapter) && !(object0 instanceof MediationInterstitialAdapter)) {
            String s = object0.getClass().getCanonicalName();
            zzo.zzj((MediationInterstitialAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s));
            throw new RemoteException();
        }
        if(object0 instanceof MediationInterstitialAdapter) {
            this.zzI();
            return;
        }
        zzo.zze("Show interstitial ad from adapter.");
        MediationInterstitialAd mediationInterstitialAd0 = this.zzf;
        if(mediationInterstitialAd0 != null) {
            try {
                mediationInterstitialAd0.showAd(((Context)ObjectWrapper.unwrap(iObjectWrapper0)));
                return;
            }
            catch(RuntimeException runtimeException0) {
                zzbpb.zza(iObjectWrapper0, runtimeException0, "adapter.interstitial.showAd");
                throw runtimeException0;
            }
        }
        zzo.zzg("Can not show null mediation interstitial ad.");
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzK(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Object object0 = this.zza;
        if(object0 instanceof Adapter) {
            zzo.zze("Show rewarded ad from adapter.");
            MediationRewardedAd mediationRewardedAd0 = this.zzi;
            if(mediationRewardedAd0 != null) {
                try {
                    mediationRewardedAd0.showAd(((Context)ObjectWrapper.unwrap(iObjectWrapper0)));
                    return;
                }
                catch(RuntimeException runtimeException0) {
                    zzbpb.zza(iObjectWrapper0, runtimeException0, "adapter.rewarded.showAd");
                    throw runtimeException0;
                }
            }
            zzo.zzg("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        String s = object0.getClass().getCanonicalName();
        zzo.zzj((Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzL() throws RemoteException {
        Object object0 = this.zza;
        if(object0 instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd0 = this.zzi;
            if(mediationRewardedAd0 != null) {
                try {
                    mediationRewardedAd0.showAd(((Context)ObjectWrapper.unwrap(this.zzd)));
                    return;
                }
                catch(RuntimeException runtimeException0) {
                    zzbpb.zza(this.zzd, runtimeException0, "adapter.showVideo");
                    throw runtimeException0;
                }
            }
            zzo.zzg("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        String s = object0.getClass().getCanonicalName();
        zzo.zzj((Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final boolean zzM() {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final boolean zzN() throws RemoteException {
        if(!(this.zza instanceof Adapter) && !Objects.equals(this.zza.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            String s = this.zza.getClass().getCanonicalName();
            zzo.zzj((Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s));
            throw new RemoteException();
        }
        return this.zzc != null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    @Nullable
    public final zzbpp zzO() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    @Nullable
    public final zzbpq zzP() {
        return null;
    }

    private final Bundle zzV(zzm zzm0) {
        Bundle bundle0 = zzm0.zzm;
        if(bundle0 != null) {
            Bundle bundle1 = bundle0.getBundle(this.zza.getClass().getName());
            return bundle1 == null ? new Bundle() : bundle1;
        }
        return new Bundle();
    }

    private final Bundle zzW(String s, zzm zzm0, String s1) throws RemoteException {
        zzo.zze(("Server parameters: " + s));
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
                bundle0 = bundle1;
            }
            if(this.zza instanceof AdMobAdapter) {
                bundle0.putString("adJson", s1);
                if(zzm0 != null) {
                    bundle0.putInt("tagForChildDirectedTreatment", zzm0.zzg);
                }
            }
            bundle0.remove("max_ad_content_rating");
            return bundle0;
        }
        catch(Throwable throwable0) {
        }
        zzo.zzh("", throwable0);
        throw new RemoteException();
    }

    // 去混淆评级： 低(20)
    private static final boolean zzX(zzm zzm0) {
        return zzm0.zzf || zzf.zzr();
    }

    @Nullable
    private static final String zzY(String s, zzm zzm0) {
        String s1;
        try {
            s1 = zzm0.zzu;
            return new JSONObject(s).getString("max_ad_content_rating");
        }
        catch(JSONException unused_ex) {
            return s1;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final Bundle zze() {
        return new Bundle();
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final Bundle zzf() {
        return new Bundle();
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    @Nullable
    public final zzeb zzh() {
        Object object0 = this.zza;
        if(object0 instanceof zza) {
            try {
                return ((zza)object0).getVideoController();
            }
            catch(Throwable throwable0) {
                zzo.zzh("", throwable0);
            }
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    @Nullable
    public final zzbgq zzi() {
        zzbqh zzbqh0 = this.zzb;
        if(zzbqh0 != null) {
            zzbgr zzbgr0 = zzbqh0.zzc();
            return zzbgr0 instanceof zzbgr ? zzbgr0.zza() : null;
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    @Nullable
    public final zzbpn zzj() {
        MediationInterscrollerAd mediationInterscrollerAd0 = this.zzj;
        return mediationInterscrollerAd0 != null ? new zzbqg(mediationInterscrollerAd0) : null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    @Nullable
    public final zzbpt zzk() {
        Object object0 = this.zza;
        if(object0 instanceof MediationNativeAdapter) {
            zzbqh zzbqh0 = this.zzb;
            if(zzbqh0 != null) {
                UnifiedNativeAdMapper unifiedNativeAdMapper0 = zzbqh0.zza();
                if(unifiedNativeAdMapper0 != null) {
                    return new zzbql(unifiedNativeAdMapper0);
                }
            }
        }
        else if(object0 instanceof Adapter) {
            NativeAdMapper nativeAdMapper0 = this.zzh;
            if(nativeAdMapper0 != null) {
                return new zzbqj(nativeAdMapper0);
            }
            UnifiedNativeAdMapper unifiedNativeAdMapper1 = this.zzg;
            if(unifiedNativeAdMapper1 != null) {
                return new zzbql(unifiedNativeAdMapper1);
            }
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    @Nullable
    public final zzbrs zzl() {
        return this.zza instanceof Adapter ? zzbrs.zza(((Adapter)this.zza).getVersionInfo()) : null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    @Nullable
    public final zzbrs zzm() {
        return this.zza instanceof Adapter ? zzbrs.zza(((Adapter)this.zza).getSDKVersionInfo()) : null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final IObjectWrapper zzn() throws RemoteException {
        Object object0 = this.zza;
        if(object0 instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.wrap(((MediationBannerAdapter)object0).getBannerView());
            }
            catch(Throwable throwable0) {
                zzo.zzh("", throwable0);
                throw new RemoteException();
            }
        }
        if(object0 instanceof Adapter) {
            return ObjectWrapper.wrap(this.zze);
        }
        String s = object0.getClass().getCanonicalName();
        zzo.zzj((MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzo() throws RemoteException {
        Object object0 = this.zza;
        if(!(object0 instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter)object0).onDestroy();
        }
        catch(Throwable throwable0) {
            zzo.zzh("", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzp(IObjectWrapper iObjectWrapper0, zzm zzm0, String s, zzbwh zzbwh0, String s1) throws RemoteException {
        if(!(this.zza instanceof Adapter) && !Objects.equals(this.zza.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            String s2 = this.zza.getClass().getCanonicalName();
            zzo.zzj((Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s2));
            throw new RemoteException();
        }
        this.zzd = iObjectWrapper0;
        this.zzc = zzbwh0;
        zzbwh0.zzl(ObjectWrapper.wrap(this.zza));
    }

    // This method was un-flattened
    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzq(IObjectWrapper iObjectWrapper0, zzblr zzblr0, List list0) throws RemoteException {
        AdFormat adFormat0;
        if(!(this.zza instanceof Adapter)) {
            throw new RemoteException();
        }
        zzbpy zzbpy0 = new zzbpy(this, zzblr0);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            zzblx zzblx0 = (zzblx)object0;
            switch(zzblx0.zza) {
                case "app_open": {
                    adFormat0 = AdFormat.APP_OPEN_AD;
                    break;
                }
                case "app_open_ad": {
                    if(((Boolean)zzbe.zzc().zza(zzbcl.zzlI)).booleanValue()) {
                        adFormat0 = AdFormat.APP_OPEN_AD;
                        break;
                    }
                    else {
                        adFormat0 = null;
                        continue;
                    }
                    adFormat0 = AdFormat.REWARDED_INTERSTITIAL;
                    break;
                }
                case "banner": {
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
                    adFormat0 = null;
                    continue;
                }
            }
            arrayList0.add(new MediationConfiguration(adFormat0, zzblx0.zzb));
        }
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        ((Adapter)this.zza).initialize(context0, zzbpy0, arrayList0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzr(IObjectWrapper iObjectWrapper0, zzbwh zzbwh0, List list0) throws RemoteException {
        zzo.zzj("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzs(zzm zzm0, String s) throws RemoteException {
        this.zzB(zzm0, s, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzt(IObjectWrapper iObjectWrapper0, zzm zzm0, String s, zzbpk zzbpk0) throws RemoteException {
        Object object0 = this.zza;
        if(object0 instanceof Adapter) {
            zzo.zze("Requesting app open ad from adapter.");
            try {
                zzbqe zzbqe0 = new zzbqe(this, zzbpk0);
                Object object1 = ObjectWrapper.unwrap(iObjectWrapper0);
                Bundle bundle0 = this.zzW(s, zzm0, null);
                Bundle bundle1 = this.zzV(zzm0);
                boolean z = zzbqf.zzX(zzm0);
                String s1 = zzbqf.zzY(s, zzm0);
                MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration0 = new MediationAppOpenAdConfiguration(((Context)object1), "", bundle0, bundle1, z, zzm0.zzk, zzm0.zzg, zzm0.zzt, s1, "");
                ((Adapter)this.zza).loadAppOpenAd(mediationAppOpenAdConfiguration0, zzbqe0);
                return;
            }
            catch(Exception exception0) {
                zzo.zzh("", exception0);
                zzbpb.zza(iObjectWrapper0, exception0, "adapter.loadAppOpenAd");
                throw new RemoteException();
            }
        }
        String s2 = object0.getClass().getCanonicalName();
        zzo.zzj((Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s2));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzu(IObjectWrapper iObjectWrapper0, zzs zzs0, zzm zzm0, String s, zzbpk zzbpk0) throws RemoteException {
        this.zzv(iObjectWrapper0, zzs0, zzm0, s, null, zzbpk0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzv(IObjectWrapper iObjectWrapper0, zzs zzs0, zzm zzm0, String s, String s1, zzbpk zzbpk0) throws RemoteException {
        Object object0 = this.zza;
        if(!(object0 instanceof MediationBannerAdapter) && !(object0 instanceof Adapter)) {
            String s2 = object0.getClass().getCanonicalName();
            zzo.zzj((MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s2));
            throw new RemoteException();
        }
        zzo.zze("Requesting banner ad from adapter.");
        AdSize adSize0 = zzs0.zzn ? zzc.zzd(zzs0.zze, zzs0.zzb) : zzc.zzc(zzs0.zze, zzs0.zzb, zzs0.zza);
        Object object1 = this.zza;
        if(object1 instanceof MediationBannerAdapter) {
            try {
                HashSet hashSet0 = zzm0.zze == null ? null : new HashSet(zzm0.zze);
                Date date0 = zzm0.zzb == -1L ? null : new Date(zzm0.zzb);
                boolean z = zzbqf.zzX(zzm0);
                String s3 = zzbqf.zzY(s, zzm0);
                zzbpw zzbpw0 = new zzbpw(date0, zzm0.zzd, hashSet0, zzm0.zzk, z, zzm0.zzg, zzm0.zzr, zzm0.zzt, s3);
                Bundle bundle0 = zzm0.zzm == null ? null : zzm0.zzm.getBundle(((MediationBannerAdapter)object1).getClass().getName());
                ((MediationBannerAdapter)object1).requestBannerAd(((Context)ObjectWrapper.unwrap(iObjectWrapper0)), new zzbqh(zzbpk0), this.zzW(s, zzm0, s1), adSize0, zzbpw0, bundle0);
                return;
            }
            catch(Throwable throwable0) {
            }
            zzo.zzh("", throwable0);
            zzbpb.zza(iObjectWrapper0, throwable0, "adapter.requestBannerAd");
            throw new RemoteException();
        }
        if(object1 instanceof Adapter) {
            try {
                zzbpz zzbpz0 = new zzbpz(this, zzbpk0);
                Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
                Bundle bundle1 = this.zzW(s, zzm0, s1);
                Bundle bundle2 = this.zzV(zzm0);
                boolean z1 = zzbqf.zzX(zzm0);
                String s4 = zzbqf.zzY(s, zzm0);
                ((Adapter)object1).loadBannerAd(new MediationBannerAdConfiguration(context0, "", bundle1, bundle2, z1, zzm0.zzk, zzm0.zzg, zzm0.zzt, s4, adSize0, this.zzl), zzbpz0);
            }
            catch(Throwable throwable1) {
                zzo.zzh("", throwable1);
                zzbpb.zza(iObjectWrapper0, throwable1, "adapter.loadBannerAd");
                throw new RemoteException();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzw(IObjectWrapper iObjectWrapper0, zzs zzs0, zzm zzm0, String s, String s1, zzbpk zzbpk0) throws RemoteException {
        Object object0 = this.zza;
        if(object0 instanceof Adapter) {
            zzo.zze("Requesting interscroller ad from adapter.");
            try {
                zzbpx zzbpx0 = new zzbpx(this, zzbpk0, ((Adapter)this.zza));
                Object object1 = ObjectWrapper.unwrap(iObjectWrapper0);
                Bundle bundle0 = this.zzW(s, zzm0, s1);
                Bundle bundle1 = this.zzV(zzm0);
                boolean z = zzbqf.zzX(zzm0);
                String s2 = zzbqf.zzY(s, zzm0);
                AdSize adSize0 = zzc.zze(zzs0.zze, zzs0.zzb);
                MediationBannerAdConfiguration mediationBannerAdConfiguration0 = new MediationBannerAdConfiguration(((Context)object1), "", bundle0, bundle1, z, zzm0.zzk, zzm0.zzg, zzm0.zzt, s2, adSize0, "");
                ((Adapter)this.zza).loadInterscrollerAd(mediationBannerAdConfiguration0, zzbpx0);
                return;
            }
            catch(Exception exception0) {
                zzo.zzh("", exception0);
                zzbpb.zza(iObjectWrapper0, exception0, "adapter.loadInterscrollerAd");
                throw new RemoteException();
            }
        }
        String s3 = object0.getClass().getCanonicalName();
        zzo.zzj((Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s3));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzx(IObjectWrapper iObjectWrapper0, zzm zzm0, String s, zzbpk zzbpk0) throws RemoteException {
        this.zzy(iObjectWrapper0, zzm0, s, null, zzbpk0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzy(IObjectWrapper iObjectWrapper0, zzm zzm0, String s, String s1, zzbpk zzbpk0) throws RemoteException {
        Object object0 = this.zza;
        if(!(object0 instanceof MediationInterstitialAdapter) && !(object0 instanceof Adapter)) {
            String s2 = object0.getClass().getCanonicalName();
            zzo.zzj((MediationInterstitialAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s2));
            throw new RemoteException();
        }
        zzo.zze("Requesting interstitial ad from adapter.");
        Object object1 = this.zza;
        if(object1 instanceof MediationInterstitialAdapter) {
            try {
                HashSet hashSet0 = zzm0.zze == null ? null : new HashSet(zzm0.zze);
                Date date0 = zzm0.zzb == -1L ? null : new Date(zzm0.zzb);
                boolean z = zzbqf.zzX(zzm0);
                String s3 = zzbqf.zzY(s, zzm0);
                zzbpw zzbpw0 = new zzbpw(date0, zzm0.zzd, hashSet0, zzm0.zzk, z, zzm0.zzg, zzm0.zzr, zzm0.zzt, s3);
                Bundle bundle0 = zzm0.zzm == null ? null : zzm0.zzm.getBundle(((MediationInterstitialAdapter)object1).getClass().getName());
                ((MediationInterstitialAdapter)object1).requestInterstitialAd(((Context)ObjectWrapper.unwrap(iObjectWrapper0)), new zzbqh(zzbpk0), this.zzW(s, zzm0, s1), zzbpw0, bundle0);
                return;
            }
            catch(Throwable throwable0) {
            }
            zzo.zzh("", throwable0);
            zzbpb.zza(iObjectWrapper0, throwable0, "adapter.requestInterstitialAd");
            throw new RemoteException();
        }
        if(object1 instanceof Adapter) {
            try {
                zzbqa zzbqa0 = new zzbqa(this, zzbpk0);
                Object object2 = ObjectWrapper.unwrap(iObjectWrapper0);
                Bundle bundle1 = this.zzW(s, zzm0, s1);
                Bundle bundle2 = this.zzV(zzm0);
                boolean z1 = zzbqf.zzX(zzm0);
                String s4 = zzbqf.zzY(s, zzm0);
                ((Adapter)object1).loadInterstitialAd(new MediationInterstitialAdConfiguration(((Context)object2), "", bundle1, bundle2, z1, zzm0.zzk, zzm0.zzg, zzm0.zzt, s4, this.zzl), zzbqa0);
            }
            catch(Throwable throwable1) {
                zzo.zzh("", throwable1);
                zzbpb.zza(iObjectWrapper0, throwable1, "adapter.loadInterstitialAd");
                throw new RemoteException();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzz(IObjectWrapper iObjectWrapper0, zzm zzm0, String s, String s1, zzbpk zzbpk0, zzbfl zzbfl0, List list0) throws RemoteException {
        Object object0 = this.zza;
        if(!(object0 instanceof MediationNativeAdapter) && !(object0 instanceof Adapter)) {
            String s2 = object0.getClass().getCanonicalName();
            zzo.zzj((MediationNativeAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s2));
            throw new RemoteException();
        }
        zzo.zze("Requesting native ad from adapter.");
        Object object1 = this.zza;
        if(object1 instanceof MediationNativeAdapter) {
            try {
                HashSet hashSet0 = zzm0.zze == null ? null : new HashSet(zzm0.zze);
                Date date0 = zzm0.zzb == -1L ? null : new Date(zzm0.zzb);
                boolean z = zzbqf.zzX(zzm0);
                String s3 = zzbqf.zzY(s, zzm0);
                zzbqk zzbqk0 = new zzbqk(date0, zzm0.zzd, hashSet0, zzm0.zzk, z, zzm0.zzg, zzbfl0, list0, zzm0.zzr, zzm0.zzt, s3);
                Bundle bundle0 = zzm0.zzm == null ? null : zzm0.zzm.getBundle(((MediationNativeAdapter)object1).getClass().getName());
                this.zzb = new zzbqh(zzbpk0);
                ((MediationNativeAdapter)object1).requestNativeAd(((Context)ObjectWrapper.unwrap(iObjectWrapper0)), this.zzb, this.zzW(s, zzm0, s1), zzbqk0, bundle0);
                return;
            }
            catch(Throwable throwable0) {
            }
            zzo.zzh("", throwable0);
            zzbpb.zza(iObjectWrapper0, throwable0, "adapter.requestNativeAd");
            throw new RemoteException();
        }
        if(object1 instanceof Adapter) {
            try {
                zzbqc zzbqc0 = new zzbqc(this, zzbpk0);
                Object object2 = ObjectWrapper.unwrap(iObjectWrapper0);
                Bundle bundle1 = this.zzW(s, zzm0, s1);
                Bundle bundle2 = this.zzV(zzm0);
                boolean z1 = zzbqf.zzX(zzm0);
                String s4 = zzbqf.zzY(s, zzm0);
                ((Adapter)object1).loadNativeAdMapper(new MediationNativeAdConfiguration(((Context)object2), "", bundle1, bundle2, z1, zzm0.zzk, zzm0.zzg, zzm0.zzt, s4, this.zzl, zzbfl0), zzbqc0);
            }
            catch(Throwable throwable1) {
                zzo.zzh("", throwable1);
                zzbpb.zza(iObjectWrapper0, throwable1, "adapter.loadNativeAdMapper");
                String s5 = throwable1.getMessage();
                if(!TextUtils.isEmpty(s5) && s5.equals("Method is not found")) {
                    try {
                        zzbqb zzbqb0 = new zzbqb(this, zzbpk0);
                        Object object3 = ObjectWrapper.unwrap(iObjectWrapper0);
                        Bundle bundle3 = this.zzW(s, zzm0, s1);
                        Bundle bundle4 = this.zzV(zzm0);
                        boolean z2 = zzbqf.zzX(zzm0);
                        String s6 = zzbqf.zzY(s, zzm0);
                        MediationNativeAdConfiguration mediationNativeAdConfiguration0 = new MediationNativeAdConfiguration(((Context)object3), "", bundle3, bundle4, z2, zzm0.zzk, zzm0.zzg, zzm0.zzt, s6, this.zzl, zzbfl0);
                        ((Adapter)this.zza).loadNativeAd(mediationNativeAdConfiguration0, zzbqb0);
                        return;
                    }
                    catch(Throwable throwable2) {
                        zzo.zzh("", throwable2);
                        zzbpb.zza(iObjectWrapper0, throwable2, "adapter.loadNativeAd");
                        throw new RemoteException();
                    }
                }
                throw new RemoteException();
            }
        }
    }
}

