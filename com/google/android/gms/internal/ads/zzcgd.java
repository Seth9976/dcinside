package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;

public final class zzcgd {
    private final zzcge zza;
    private final zzcgc zzb;

    public zzcgd(zzcge zzcge0, zzcgc zzcgc0) {
        this.zzb = zzcgc0;
        this.zza = zzcge0;
    }

    @JavascriptInterface
    public String getClickSignals(String s) {
        if(TextUtils.isEmpty(s)) {
            zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        zzava zzava0 = ((zzcgk)this.zza).zzI();
        if(zzava0 == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzauv zzauv0 = zzava0.zzc();
        if(zzauv0 == null) {
            zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if(this.zza.getContext() == null) {
            zze.zza("Context is null, ignoring.");
            return "";
        }
        return zzauv0.zze(this.zza.getContext(), s, ((zzcgm)this.zza).zzF(), this.zza.zzi());
    }

    @JavascriptInterface
    public String getViewSignals() {
        zzava zzava0 = ((zzcgk)this.zza).zzI();
        if(zzava0 == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzauv zzauv0 = zzava0.zzc();
        if(zzauv0 == null) {
            zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if(this.zza.getContext() == null) {
            zze.zza("Context is null, ignoring.");
            return "";
        }
        return zzauv0.zzh(this.zza.getContext(), ((zzcgm)this.zza).zzF(), this.zza.zzi());
    }

    @JavascriptInterface
    public void notify(String s) {
        if(TextUtils.isEmpty(s)) {
            zzo.zzj("URL is empty, ignoring message");
            return;
        }
        zzcgb zzcgb0 = () -> {
            Uri uri0 = Uri.parse(s);
            zzcff zzcff0 = ((zzcfw)this.zzb.zza).zzaO();
            if(zzcff0 == null) {
                zzo.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                return;
            }
            zzcff0.zzk(uri0);
        };
        zzs.zza.post(zzcgb0);
    }

    // 检测为 Lambda 实现
    final void zza(String s) [...]
}

