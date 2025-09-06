package com.google.android.gms.internal.consent_sdk;

import android.annotation.TargetApi;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

final class zzbt extends WebViewClient {
    final zzbu zza;

    zzbt(zzbu zzbu0, zzbs zzbs0) {
        this.zza = zzbu0;
        super();
    }

    @Override  // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView0, String s) {
        if(zzbu.zzf(this.zza, s)) {
            this.zza.zzb.zze(s);
        }
    }

    @Override  // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView0, String s) {
        if(!this.zza.zzc) {
            Log.d("UserMessagingPlatform", "Wall html loaded.");
            zzbu.zzb(this.zza, true);
        }
    }

    @Override  // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView0, int v, String s, String s1) {
        this.zza.zzb.zzf(v, s, s1);
    }

    @Override  // android.webkit.WebViewClient
    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView0, WebResourceRequest webResourceRequest0) {
        String s = webResourceRequest0.getUrl().toString();
        if(zzbu.zzf(this.zza, s)) {
            this.zza.zzb.zze(s);
            return true;
        }
        return false;
    }

    @Override  // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView0, String s) {
        if(zzbu.zzf(this.zza, s)) {
            this.zza.zzb.zze(s);
            return true;
        }
        return false;
    }
}

