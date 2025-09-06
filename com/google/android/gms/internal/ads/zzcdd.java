package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

final class zzcdd implements Runnable {
    final String zza;
    final String zzb;
    final String zzc;
    final String zzd;
    final zzcde zze;

    zzcdd(zzcde zzcde0, String s, String s1, String s2, String s3) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = s2;
        this.zzd = s3;
        this.zze = zzcde0;
        super();
    }

    @Override
    public final void run() {
        int v;
        HashMap hashMap0 = new HashMap();
        hashMap0.put("event", "precacheCanceled");
        hashMap0.put("src", this.zza);
        if(!TextUtils.isEmpty(this.zzb)) {
            hashMap0.put("cachedSrc", this.zzb);
        }
        switch(this.zzc) {
            case "badUrl": {
                v = 8;
                break;
            }
            case "contentLengthMissing": {
                v = 0;
                break;
            }
            case "downloadTimeout": {
                v = 9;
                break;
            }
            case "error": {
                v = 1;
                break;
            }
            case "expireFailed": {
                v = 6;
                break;
            }
            case "externalAbort": {
                v = 10;
                break;
            }
            case "inProgress": {
                v = 2;
                break;
            }
            case "interrupted": {
                v = 3;
                break;
            }
            case "noCacheDir": {
                v = 7;
                break;
            }
            case "noop": {
                v = 4;
                break;
            }
            case "playerFailed": {
                v = 5;
                break;
            }
            case "sizeExceeded": {
                v = 11;
                break;
            }
            default: {
                v = -1;
            }
        }
        String s = "internal";
        switch(v) {
            case 6: 
            case 7: {
                s = "io";
                break;
            }
            case 8: 
            case 9: {
                s = "network";
                break;
            }
            case 10: 
            case 11: {
                s = "policy";
            }
        }
        hashMap0.put("type", s);
        hashMap0.put("reason", this.zzc);
        if(!TextUtils.isEmpty(this.zzd)) {
            hashMap0.put("message", this.zzd);
        }
        zzcde.zze(this.zze, "onPrecacheEvent", hashMap0);
    }
}

