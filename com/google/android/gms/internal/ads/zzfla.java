package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Timer;

public final class zzfla {
    private final zzflc zza;
    private final WebView zzb;
    private zzfnb zzc;
    private final HashMap zzd;
    private final zzflo zze;

    private zzfla(zzflc zzflc0, WebView webView0, boolean z) {
        HashMap hashMap0 = new HashMap();
        this.zzd = hashMap0;
        this.zze = new zzflo();
        zzfmk.zza();
        this.zza = zzflc0;
        this.zzb = webView0;
        if(this.zza() != webView0) {
            for(Object object0: hashMap0.values()) {
                ((zzfkp)object0).zzd(webView0);
            }
            this.zzc = new zzfnb(webView0);
        }
        if(!WebViewFeature.a("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        this.zzh();
        zzfkz zzfkz0 = new zzfkz(this);
        HashSet hashSet0 = new HashSet(Arrays.asList(new String[]{"*"}));
        WebViewCompat.b(this.zzb, "omidJsSessionService", hashSet0, zzfkz0);
    }

    @Nullable
    final View zza() {
        return this.zzc == null ? null : ((View)this.zzc.get());
    }

    public static zzfla zzb(zzflc zzflc0, WebView webView0, boolean z) {
        return new zzfla(zzflc0, webView0, true);
    }

    static void zzc(zzfla zzfla0, String s) {
        zzfkp zzfkp0 = (zzfkp)zzfla0.zzd.get(s);
        if(zzfkp0 != null) {
            zzfkp0.zzc();
            zzfla0.zzd.remove(s);
        }
    }

    static void zze(zzfla zzfla0, String s) {
        zzfkt zzfkt0 = new zzfkt(zzfkq.zza(zzfku.zza, zzfkx.zza, zzflb.zzb, zzflb.zzb, false), zzfkr.zzb(zzfla0.zza, zzfla0.zzb, null, null), s);
        zzfla0.zzd.put(s, zzfkt0);
        zzfkt0.zzd(zzfla0.zza());
        for(Object object0: zzfla0.zze.zza()) {
            zzfkt0.zzb(((View)((zzfln)object0).zzb().get()), ((zzfln)object0).zza(), ((zzfln)object0).zzc());
        }
        zzfkt0.zze();
    }

    public final void zzf(View view0, zzfkw zzfkw0, @Nullable String s) {
        for(Object object0: this.zzd.values()) {
            ((zzfkp)object0).zzb(view0, zzfkw0, "Ad overlay");
        }
        this.zze.zzb(view0, zzfkw0, "Ad overlay");
    }

    public final void zzg(zzcfo zzcfo0) {
        for(Object object0: this.zzd.values()) {
            ((zzfkp)object0).zzc();
        }
        Timer timer0 = new Timer();
        timer0.schedule(new zzfky(this, zzcfo0, timer0), 1000L);
    }

    private final void zzh() {
        WebViewCompat.w(this.zzb, "omidJsSessionService");
    }
}

