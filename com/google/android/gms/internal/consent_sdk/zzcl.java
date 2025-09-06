package com.google.android.gms.internal.consent_sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings.Secure;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class zzcl {
    @GuardedBy("DeviceId.class")
    @Nullable
    private static String zza;

    public static String zza(Context context0) {
        synchronized(zzcl.class) {
            if(zzcl.zza == null) {
                ContentResolver contentResolver0 = context0.getContentResolver();
                String s = contentResolver0 == null ? null : Settings.Secure.getString(contentResolver0, "android_id");
                if(s == null || zzct.zza(true)) {
                    s = "emulator";
                }
                zzcl.zza = zzcl.zzb(s);
            }
            return zzcl.zza;
        }
    }

    private static String zzb(String s) {
        for(int v = 0; true; ++v) {
            try {
                MessageDigest messageDigest0 = MessageDigest.getInstance("MD5");
                messageDigest0.update(s.getBytes());
                return String.format("%032X", new BigInteger(1, messageDigest0.digest()));
            }
            catch(NoSuchAlgorithmException unused_ex) {
            }
            catch(ArithmeticException unused_ex) {
                break;
            }
        }
        return "";
    }
}

