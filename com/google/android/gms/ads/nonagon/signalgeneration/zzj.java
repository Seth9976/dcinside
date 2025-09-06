package com.google.android.gms.ads.nonagon.signalgeneration;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbkk;
import com.google.android.gms.internal.ads.zzgcs;
import java.util.Locale;
import java.util.concurrent.Executor;

public final class zzj extends zzbkk {
    private final WebView zza;
    private final zzf zzb;
    private final Executor zzc;
    @Nullable
    private WebViewClient zzd;

    public zzj(WebView webView0, zzf zzf0, @UiThread zzgcs zzgcs0) {
        this.zza = webView0;
        this.zzb = zzf0;
        this.zzc = zzgcs0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbkk
    @Nullable
    protected final WebViewClient getDelegate() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzbkk
    public final void onPageFinished(WebView webView0, String s) {
        this.zzc();
        super.onPageFinished(webView0, s);
    }

    @Override  // com.google.android.gms.internal.ads.zzbkk
    public final void onPageStarted(WebView webView0, String s, Bitmap bitmap0) {
        this.zzc();
        super.onPageStarted(webView0, s, bitmap0);
    }

    // 检测为 Lambda 实现
    final void zza() [...]

    public final void zzb() {
        zzh zzh0 = () -> {
            WebViewClient webViewClient0;
            WebView webView0;
            try {
                webView0 = this.zza;
                if(Build.VERSION.SDK_INT >= 26) {
                    webViewClient0 = webView0.getWebViewClient();
                    goto label_10;
                }
                if(WebViewFeature.a("GET_WEB_VIEW_CLIENT")) {
                    goto label_5;
                }
            }
            catch(IllegalStateException unused_ex) {
            }
            return;
            try {
            label_5:
                webViewClient0 = WebViewCompat.p(webView0);
            }
            catch(RuntimeException runtimeException0) {
                try {
                    zzv.zzp().zzw(runtimeException0, "AdUtil.getWebViewClient");
                }
                catch(IllegalStateException unused_ex) {
                }
                return;
            }
        label_10:
            if(webViewClient0 == this) {
                return;
            }
            if(webViewClient0 != null) {
                this.zzd = webViewClient0;
            }
            this.zza.setWebViewClient(this);
            this.zzc();
        };
        this.zzc.execute(zzh0);
    }

    private final void zzc() {
        Locale locale0 = Locale.getDefault();
        String s = (String)zzbe.zzc().zza(zzbcl.zzjF);
        Object[] arr_object = {this.zzb.zza()};
        this.zza.evaluateJavascript(String.format(locale0, s, arr_object), null);
    }
}

