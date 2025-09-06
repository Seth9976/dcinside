package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;

public final class zzbik implements zzfuc {
    public final String zza;

    public zzbik(String s) {
        this.zza = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuc
    public final Object apply(Object object0) {
        String s = this.zza;
        if(((String)object0) != null) {
            if(((Boolean)zzbek.zzf.zze()).booleanValue()) {
                String s1 = Uri.parse(s).getHost();
                int v = 0;
                while(v < 3) {
                    if(s1.endsWith(new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"}[v])) {
                        goto label_10;
                    }
                    ++v;
                }
                return s;
            }
        label_10:
            if(!TextUtils.isEmpty("@click_attok@")) {
                s = s.replace("@click_attok@", ((String)object0));
            }
            if(!TextUtils.isEmpty("attok")) {
                Uri uri0 = Uri.parse(s);
                return TextUtils.isEmpty(uri0.getQueryParameter("attok")) ? uri0.buildUpon().appendQueryParameter("attok", ((String)object0)).toString() : s;
            }
        }
        return s;
    }
}

