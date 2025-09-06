package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class zzfme extends zzfma {
    private WebView zza;
    private Long zzb;
    private final Map zzc;

    public zzfme(String s, Map map0, String s1) {
        super(s);
        this.zzb = null;
        this.zzc = map0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfma
    public final void zzc() {
        super.zzc();
        long v = this.zzb == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - ((long)this.zzb), TimeUnit.NANOSECONDS);
        new Handler().postDelayed(new zzfmd(this), Math.max(4000L - v, 2000L));
        this.zza = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfma
    public final void zzi(zzfkt zzfkt0, zzfkr zzfkr0) {
        JSONObject jSONObject0 = new JSONObject();
        Map map0 = zzfkr0.zzi();
        Iterator iterator0 = map0.keySet().iterator();
        if(!iterator0.hasNext()) {
            this.zzj(zzfkt0, zzfkr0, jSONObject0);
            return;
        }
        Object object0 = iterator0.next();
        zzfld zzfld0 = (zzfld)map0.get(((String)object0));
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfma
    public final void zzo() {
        WebView webView0 = new WebView(zzflp.zzb().zza());
        this.zza = webView0;
        webView0.getSettings().setJavaScriptEnabled(true);
        this.zza.getSettings().setAllowContentAccess(false);
        this.zza.getSettings().setAllowFileAccess(false);
        this.zza.setWebViewClient(new zzfmc(this));
        this.zzn(this.zza);
        zzflr.zzk(this.zza, null);
        Iterator iterator0 = this.zzc.keySet().iterator();
        if(!iterator0.hasNext()) {
            this.zzb = System.nanoTime();
            return;
        }
        Object object0 = iterator0.next();
        zzfld zzfld0 = (zzfld)this.zzc.get(((String)object0));
        throw null;
    }
}

