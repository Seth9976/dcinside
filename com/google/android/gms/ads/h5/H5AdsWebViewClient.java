package com.google.android.gms.ads.h5;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.internal.ads.zzbkk;
import com.google.android.gms.internal.ads.zzbkx;

@RequiresApi(api = 21)
public final class H5AdsWebViewClient extends zzbkk {
    private final zzbkx zza;

    public H5AdsWebViewClient(@NonNull Context context0, @NonNull WebView webView0) {
        this.zza = new zzbkx(context0, webView0);
    }

    public void clearAdObjects() {
        this.zza.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzbkk
    @NonNull
    protected WebViewClient getDelegate() {
        return this.zza;
    }

    @Nullable
    public WebViewClient getDelegateWebViewClient() {
        return this.zza.getDelegate();
    }

    public void setDelegateWebViewClient(@Nullable WebViewClient webViewClient0) {
        this.zza.zzb(webViewClient0);
    }
}

