package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsCallback;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbdn extends CustomTabsCallback {
    private final AtomicBoolean zza;
    private final List zzb;
    private final zzbdq zzc;
    @Nullable
    private final CustomTabsCallback zzd;
    private final zzdsb zze;

    zzbdn(@NonNull zzbdq zzbdq0, @Nullable CustomTabsCallback customTabsCallback0, zzdsb zzdsb0) {
        this.zza = new AtomicBoolean(false);
        this.zzd = customTabsCallback0;
        this.zzc = zzbdq0;
        this.zze = zzdsb0;
        this.zzb = Arrays.asList(((String)zzbe.zzc().zza(zzbcl.zzjL)).split(","));
    }

    @Override  // androidx.browser.customtabs.CustomTabsCallback
    public final void extraCallback(String s, @Nullable Bundle bundle0) {
        CustomTabsCallback customTabsCallback0 = this.zzd;
        if(customTabsCallback0 != null) {
            customTabsCallback0.extraCallback(s, bundle0);
        }
    }

    @Override  // androidx.browser.customtabs.CustomTabsCallback
    @Nullable
    public final Bundle extraCallbackWithResult(String s, @Nullable Bundle bundle0) {
        return this.zzd == null ? null : this.zzd.extraCallbackWithResult(s, bundle0);
    }

    @Override  // androidx.browser.customtabs.CustomTabsCallback
    public final void onActivityResized(int v, int v1, Bundle bundle0) {
        CustomTabsCallback customTabsCallback0 = this.zzd;
        if(customTabsCallback0 != null) {
            customTabsCallback0.onActivityResized(v, v1, bundle0);
        }
    }

    @Override  // androidx.browser.customtabs.CustomTabsCallback
    public final void onMessageChannelReady(@Nullable Bundle bundle0) {
        this.zza.set(false);
        CustomTabsCallback customTabsCallback0 = this.zzd;
        if(customTabsCallback0 != null) {
            customTabsCallback0.onMessageChannelReady(bundle0);
        }
    }

    @Override  // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int v, @Nullable Bundle bundle0) {
        this.zza.set(false);
        CustomTabsCallback customTabsCallback0 = this.zzd;
        if(customTabsCallback0 != null) {
            customTabsCallback0.onNavigationEvent(v, bundle0);
        }
        long v1 = zzv.zzC().currentTimeMillis();
        this.zzc.zzi(v1);
        if(this.zzc != null && (this.zzb != null && this.zzb.contains(String.valueOf(v)))) {
            this.zzc.zzf();
            this.zzb("pact_reqpmc");
        }
    }

    @Override  // androidx.browser.customtabs.CustomTabsCallback
    public final void onPostMessage(String s, @Nullable Bundle bundle0) {
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            if(jSONObject0.optInt("gpa", -1) == 0) {
                this.zza.set(true);
                this.zzb("pact_con");
                String s1 = jSONObject0.getString("paw_id");
                this.zzc.zzh(s1);
            }
        }
        catch(JSONException jSONException0) {
            zze.zzb("Message is not in JSON format: ", jSONException0);
        }
        CustomTabsCallback customTabsCallback0 = this.zzd;
        if(customTabsCallback0 != null) {
            customTabsCallback0.onPostMessage(s, bundle0);
        }
    }

    @Override  // androidx.browser.customtabs.CustomTabsCallback
    public final void onRelationshipValidationResult(int v, Uri uri0, boolean z, @Nullable Bundle bundle0) {
        CustomTabsCallback customTabsCallback0 = this.zzd;
        if(customTabsCallback0 != null) {
            customTabsCallback0.onRelationshipValidationResult(v, uri0, z, bundle0);
        }
    }

    public final Boolean zza() {
        return Boolean.valueOf(this.zza.get());
    }

    private final void zzb(String s) {
        Pair[] arr_pair = {new Pair("pe", s)};
        zzaa.zzd(this.zze, null, "pact_action", arr_pair);
    }
}

