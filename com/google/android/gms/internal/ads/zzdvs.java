package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdLoader.Builder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.t0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import jeb.synthetic.FIN;

public final class zzdvs extends zzdt {
    @VisibleForTesting
    final Map zza;
    private final Context zzb;
    private final WeakReference zzc;
    private final zzdvg zzd;
    private final zzgcs zze;
    private zzduv zzf;

    zzdvs(Context context0, WeakReference weakReference0, zzdvg zzdvg0, zzdvt zzdvt0, zzgcs zzgcs0) {
        this.zza = new HashMap();
        this.zzb = context0;
        this.zzc = weakReference0;
        this.zzd = zzdvg0;
        this.zze = zzgcs0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdu
    public final void zze(String s, IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1) {
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        ViewGroup viewGroup0 = (ViewGroup)ObjectWrapper.unwrap(iObjectWrapper1);
        if(context0 != null && viewGroup0 != null) {
            Object object0 = this.zza.get(s);
            if(object0 != null) {
                this.zza.remove(s);
            }
            if(object0 instanceof AdView) {
                zzdvt.zza(context0, viewGroup0, ((AdView)object0));
                return;
            }
            if(object0 instanceof NativeAd) {
                zzdvt.zzb(context0, viewGroup0, ((NativeAd)object0));
            }
        }
    }

    public final void zzf(zzduv zzduv0) {
        this.zzf = zzduv0;
    }

    // 检测为 Lambda 实现
    protected final void zzg(String s, Object object0, String s1) [...]

    public final void zzh(String s, String s1, String s2) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        switch(s1) {
            case "APP_OPEN_AD": {
                AppOpenAd.load(this.zzj(), s, zzdvs.zzk(), 1, new zzdvk(this, s, s2));
                FIN.finallyExec$NT(v);
                return;
            }
            case "BANNER": {
                AdView adView0 = new AdView(this.zzj());
                adView0.setAdSize(AdSize.BANNER);
                adView0.setAdUnitId(s);
                adView0.setAdListener(new zzdvl(this, s, adView0, s2));
                adView0.loadAd(zzdvs.zzk());
                FIN.finallyExec$NT(v);
                return;
            }
            case "INTERSTITIAL": {
                InterstitialAd.load(this.zzj(), s, zzdvs.zzk(), new zzdvm(this, s, s2));
                FIN.finallyExec$NT(v);
                return;
            }
            case "NATIVE": {
                Builder adLoader$Builder0 = new Builder(this.zzj(), s);
                adLoader$Builder0.forNativeAd((Object object0) -> synchronized(this) {
                    this.zza.put(s, object0);
                    this.zzm(zzdvs.zzl(object0), s2);
                });
                adLoader$Builder0.withAdListener(new zzdvp(this, s2));
                adLoader$Builder0.build().loadAd(zzdvs.zzk());
                FIN.finallyExec$NT(v);
                return;
            }
            case "REWARDED": {
                RewardedAd.load(this.zzj(), s, zzdvs.zzk(), new zzdvn(this, s, s2));
                FIN.finallyExec$NT(v);
                return;
            }
            case "REWARDED_INTERSTITIAL": {
                RewardedInterstitialAd.load(this.zzj(), s, zzdvs.zzk(), new zzdvo(this, s, s2));
                FIN.finallyExec$NT(v);
                return;
            }
            default: {
                FIN.finallyCodeBegin$NT(v);
                __monitor_exit(this);
                FIN.finallyCodeEnd$NT(v);
            }
        }
    }

    public final void zzi(String s, String s1) {
        synchronized(this) {
            Activity activity0 = this.zzd.zzg();
            if(activity0 != null) {
                Object object0 = this.zza.get(s);
                if(object0 != null) {
                    zzbcc zzbcc0 = zzbcl.zzjm;
                    if(!((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue() || object0 instanceof AppOpenAd || object0 instanceof InterstitialAd || object0 instanceof RewardedAd || object0 instanceof RewardedInterstitialAd) {
                        this.zza.remove(s);
                    }
                    this.zzn(zzdvs.zzl(object0), s1);
                    if(object0 instanceof AppOpenAd) {
                        ((AppOpenAd)object0).show(activity0);
                        return;
                    }
                    if(object0 instanceof InterstitialAd) {
                        ((InterstitialAd)object0).show(activity0);
                        return;
                    }
                    if(object0 instanceof RewardedAd) {
                        ((RewardedAd)object0).show(activity0, new zzdvi());
                        return;
                    }
                    if(object0 instanceof RewardedInterstitialAd) {
                        ((RewardedInterstitialAd)object0).show(activity0, new zzdvj());
                        return;
                    }
                    if(((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue() && (object0 instanceof AdView || object0 instanceof NativeAd)) {
                        Intent intent0 = new Intent();
                        Context context0 = this.zzj();
                        intent0.setClassName(context0, "com.google.android.gms.ads.OutOfContextTestingActivity");
                        intent0.putExtra("adUnit", s);
                        zzs.zzT(context0, intent0);
                    }
                }
            }
        }
    }

    private final Context zzj() {
        Context context0 = (Context)this.zzc.get();
        return context0 == null ? this.zzb : context0;
    }

    private static AdRequest zzk() {
        Bundle bundle0 = new Bundle();
        bundle0.putString("request_origin", "inspector_ooct");
        return ((com.google.android.gms.ads.AdRequest.Builder)new com.google.android.gms.ads.AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle0)).build();
    }

    private static String zzl(Object object0) {
        ResponseInfo responseInfo0;
        if(object0 instanceof LoadAdError) {
            responseInfo0 = ((LoadAdError)object0).getResponseInfo();
            goto label_20;
        }
        else if(object0 instanceof AppOpenAd) {
            responseInfo0 = ((AppOpenAd)object0).getResponseInfo();
            goto label_20;
        }
        else if(object0 instanceof InterstitialAd) {
            responseInfo0 = ((InterstitialAd)object0).getResponseInfo();
            goto label_20;
        }
        else if(object0 instanceof RewardedAd) {
            responseInfo0 = ((RewardedAd)object0).getResponseInfo();
            goto label_20;
        }
        else if(object0 instanceof RewardedInterstitialAd) {
            responseInfo0 = ((RewardedInterstitialAd)object0).getResponseInfo();
            goto label_20;
        }
        else if(object0 instanceof AdView) {
            responseInfo0 = ((AdView)object0).getResponseInfo();
            goto label_20;
        }
        else if(object0 instanceof NativeAd) {
            responseInfo0 = ((NativeAd)object0).getResponseInfo();
        label_20:
            if(responseInfo0 != null) {
                zzdy zzdy0 = responseInfo0.zzc();
                if(zzdy0 != null) {
                    try {
                        return zzdy0.zzh();
                    }
                    catch(RemoteException unused_ex) {
                    }
                }
            }
        }
        return "";
    }

    private final void zzm(String s, String s1) {
        t0 t00;
        synchronized(this) {
            try {
                t00 = this.zzf.zzb(s);
            }
            catch(NullPointerException nullPointerException0) {
                zzv.zzp().zzw(nullPointerException0, "OutOfContextTester.setAdAsOutOfContext");
                this.zzd.zzk(s1);
                return;
            }
        }
        zzgch.zzr(t00, new zzdvq(this, s1), this.zze);
    }

    private final void zzn(String s, String s1) {
        t0 t00;
        synchronized(this) {
            try {
                t00 = this.zzf.zzb(s);
            }
            catch(NullPointerException nullPointerException0) {
                zzv.zzp().zzw(nullPointerException0, "OutOfContextTester.setAdAsShown");
                this.zzd.zzk(s1);
                return;
            }
        }
        zzgch.zzr(t00, new zzdvr(this, s1), this.zze);
    }
}

