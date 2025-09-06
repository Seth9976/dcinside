package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

public final class zzeci implements zzeck {
    public final VersionInfoParcel zza;
    public final WebView zzb;

    public zzeci(VersionInfoParcel versionInfoParcel0, WebView webView0, boolean z) {
        this.zza = versionInfoParcel0;
        this.zzb = webView0;
    }

    @Override  // com.google.android.gms.internal.ads.zzeck
    public final Object zza() {
        return zzfla.zzb(zzflc.zza("Google", this.zza.buddyApkVersion + "." + this.zza.clientJarVersion), this.zzb, true);
    }
}

