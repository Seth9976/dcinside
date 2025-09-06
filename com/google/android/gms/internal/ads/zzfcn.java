package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

public final class zzfcn {
    private final zzava zza;

    @VisibleForTesting
    public zzfcn(zzava zzava0) {
        this.zza = zzava0;
    }

    public final Uri zza(Uri uri0, Context context0, View view0, @Nullable Activity activity0) throws zzavb {
        try {
            String s = uri0.getQueryParameter("ai");
            return zzfcn.zzb(uri0, this.zza.zzc().zze(context0, s, view0, activity0));
        }
        catch(UnsupportedOperationException unused_ex) {
            throw new zzavb("Provided Uri is not in a valid state");
        }
    }

    private static final Uri zzb(Uri uri0, String s) throws zzavb {
        if(uri0 == null) {
            goto label_27;
        }
        try {
            try {
                String s1 = uri0.getHost();
                String s2 = uri0.getPath();
                if(s1 != null && s1.equals("ad.doubleclick.net") && s2 != null && s2.contains(";")) {
                    goto label_4;
                }
            }
            catch(NullPointerException unused_ex) {
            }
            goto label_27;
        label_4:
            if(uri0.toString().contains("dc_ms=")) {
                throw new zzavb("Parameter already exists: dc_ms");
            }
            String s3 = uri0.toString();
            int v = s3.indexOf(";adurl");
            if(v != -1) {
                StringBuilder stringBuilder0 = new StringBuilder(s3.substring(0, v + 1));
                stringBuilder0.append("dc_ms");
                stringBuilder0.append("=");
                stringBuilder0.append(s);
                stringBuilder0.append(";");
                stringBuilder0.append(s3, v + 1, s3.length());
                return Uri.parse(stringBuilder0.toString());
            }
            String s4 = uri0.getEncodedPath();
            if(s4 == null) {
                throw new zzavb("Provided Uri is not in a valid state");
            }
            int v1 = s3.indexOf(s4);
            StringBuilder stringBuilder1 = new StringBuilder(s3.substring(0, s4.length() + v1));
            stringBuilder1.append(";");
            stringBuilder1.append("dc_ms");
            stringBuilder1.append("=");
            stringBuilder1.append(s);
            stringBuilder1.append(";");
            stringBuilder1.append(s3, v1 + s4.length(), s3.length());
            return Uri.parse(stringBuilder1.toString());
        label_27:
            if(uri0.getQueryParameter("ms") != null) {
                throw new zzavb("Query parameter already exists: ms");
            }
            String s5 = uri0.toString();
            int v2 = s5.indexOf("&adurl");
            if(v2 == -1) {
                v2 = s5.indexOf("?adurl");
            }
            if(v2 != -1) {
                StringBuilder stringBuilder2 = new StringBuilder(s5.substring(0, v2 + 1));
                stringBuilder2.append("ms");
                stringBuilder2.append("=");
                stringBuilder2.append(s);
                stringBuilder2.append("&");
                stringBuilder2.append(s5, v2 + 1, s5.length());
                return Uri.parse(stringBuilder2.toString());
            }
            return uri0.buildUpon().appendQueryParameter("ms", s).build();
        }
        catch(UnsupportedOperationException unused_ex) {
            throw new zzavb("Provided Uri is not in a valid state");
        }
    }
}

