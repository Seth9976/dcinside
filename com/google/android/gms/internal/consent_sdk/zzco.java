package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.Set;

public final class zzco {
    @Nullable
    public static zzcm zza(Context context0, String s) {
        String s1;
        if(!TextUtils.isEmpty(s)) {
            String[] arr_s = s.split("/", -1);
            if(arr_s.length == 1) {
                s1 = arr_s[0];
                return TextUtils.isEmpty("com.dcinside.app.android_preferences") || TextUtils.isEmpty(s1) ? null : new zzcm("com.dcinside.app.android_preferences", s1);
            }
            if(arr_s.length == 2) {
                String s2 = arr_s[0];
                s1 = arr_s[1];
                return TextUtils.isEmpty(s2) || TextUtils.isEmpty(s1) ? null : new zzcm(s2, s1);
            }
        }
        return null;
    }

    public static void zzb(Context context0, Set set0) {
        zzcn zzcn0 = new zzcn(context0);
        for(Object object0: set0) {
            String s = (String)object0;
            zzcm zzcm0 = zzco.zza(context0, s);
            if(zzcm0 == null) {
                Log.d("UserMessagingPlatform", "clearKeys: unable to process key: " + s);
            }
            else {
                zzcn0.zzd(zzcm0.zza).remove(zzcm0.zzb);
            }
        }
        zzcn0.zzb();
    }
}

