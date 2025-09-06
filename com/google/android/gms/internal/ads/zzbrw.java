package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent.Builder;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

public final class zzbrw implements MediationInterstitialAdapter {
    private Activity zza;
    private MediationInterstitialListener zzb;
    private Uri zzc;

    @Override  // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onDestroy() {
        zzo.zze("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onPause() {
        zzo.zze("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onResume() {
        zzo.zze("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context0, MediationInterstitialListener mediationInterstitialListener0, Bundle bundle0, MediationAdRequest mediationAdRequest0, Bundle bundle1) {
        this.zzb = mediationInterstitialListener0;
        if(mediationInterstitialListener0 == null) {
            zzo.zzj("Listener not set for mediation. Returning.");
            return;
        }
        if(context0 instanceof Activity) {
            if(!zzbdm.zzg(context0)) {
                zzo.zzj("Default browser does not support custom tabs. Bailing out.");
                this.zzb.onAdFailedToLoad(this, 0);
                return;
            }
            String s = bundle0.getString("tab_url");
            if(TextUtils.isEmpty(s)) {
                zzo.zzj("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.zzb.onAdFailedToLoad(this, 0);
                return;
            }
            this.zza = (Activity)context0;
            this.zzc = Uri.parse(s);
            this.zzb.onAdLoaded(this);
            return;
        }
        zzo.zzj("AdMobCustomTabs can only work with Activity context. Bailing out.");
        this.zzb.onAdFailedToLoad(this, 0);
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        CustomTabsIntent customTabsIntent0 = new Builder().d();
        customTabsIntent0.a.setData(this.zzc);
        zzbrv zzbrv0 = new zzbrv(this, new AdOverlayInfoParcel(new zzc(customTabsIntent0.a, null), null, new zzbru(this), null, new VersionInfoParcel(0, 0, false), null, null, ""));
        zzs.zza.post(zzbrv0);
        zzv.zzp().zzq();
    }
}

