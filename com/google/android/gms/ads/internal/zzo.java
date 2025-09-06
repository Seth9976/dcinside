package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzfdk;

final class zzo extends WebViewClient {
    final zzu zza;

    zzo(zzu zzu0) {
        this.zza = zzu0;
        super();
    }

    @Override  // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceError webResourceError0) {
        zzu zzu0 = this.zza;
        if(zzu0.zzg != null) {
            try {
                zzu0.zzg.zzf(zzfdk.zzd(1, null, null));
            }
            catch(RemoteException remoteException0) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
        zzu zzu1 = this.zza;
        if(zzu1.zzg != null) {
            try {
                zzu1.zzg.zze(0);
            }
            catch(RemoteException remoteException1) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", remoteException1);
            }
        }
    }

    @Override  // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView0, String s) {
        if(s.startsWith(this.zza.zzq())) {
            return false;
        }
        if(s.startsWith("gmsg://noAdLoaded")) {
            zzu zzu0 = this.zza;
            if(zzu0.zzg != null) {
                try {
                    zzu0.zzg.zzf(zzfdk.zzd(3, null, null));
                }
                catch(RemoteException remoteException0) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", remoteException0);
                }
            }
            zzu zzu1 = this.zza;
            if(zzu1.zzg != null) {
                try {
                    zzu1.zzg.zze(3);
                }
                catch(RemoteException remoteException1) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", remoteException1);
                }
            }
            this.zza.zzV(0);
            return true;
        }
        if(s.startsWith("gmsg://scriptLoadFailed")) {
            zzu zzu2 = this.zza;
            if(zzu2.zzg != null) {
                try {
                    zzu2.zzg.zzf(zzfdk.zzd(1, null, null));
                }
                catch(RemoteException remoteException2) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", remoteException2);
                }
            }
            zzu zzu3 = this.zza;
            if(zzu3.zzg != null) {
                try {
                    zzu3.zzg.zze(0);
                }
                catch(RemoteException remoteException3) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", remoteException3);
                }
            }
            this.zza.zzV(0);
            return true;
        }
        if(s.startsWith("gmsg://adResized")) {
            zzu zzu4 = this.zza;
            if(zzu4.zzg != null) {
                try {
                    zzu4.zzg.zzi();
                }
                catch(RemoteException remoteException4) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", remoteException4);
                }
            }
            int v = this.zza.zzb(s);
            this.zza.zzV(v);
            return true;
        }
        if(s.startsWith("gmsg://")) {
            return true;
        }
        zzu zzu5 = this.zza;
        if(zzu5.zzg != null) {
            try {
                zzu5.zzg.zzc();
                this.zza.zzg.zzh();
            }
            catch(RemoteException remoteException5) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", remoteException5);
            }
        }
        String s1 = zzu.zzo(this.zza, s);
        zzu.zzw(this.zza, s1);
        return true;
    }
}

