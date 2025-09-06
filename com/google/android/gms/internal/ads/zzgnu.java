package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

public final class zzgnu {
    static {
        Charset.forName("UTF-8");
    }

    public static final zzgvo zza(String s) throws GeneralSecurityException {
        byte[] arr_b = new byte[s.length()];
        for(int v = 0; v < s.length(); ++v) {
            int v1 = s.charAt(v);
            if(v1 < 33 || v1 > 0x7E) {
                throw new GeneralSecurityException("Not a printable ASCII character: " + ((char)v1));
            }
            arr_b[v] = (byte)v1;
        }
        return zzgvo.zzb(arr_b);
    }

    public static final zzgvo zzb(String s) {
        byte[] arr_b = new byte[s.length()];
        for(int v = 0; v < s.length(); ++v) {
            int v1 = s.charAt(v);
            if(v1 < 33 || v1 > 0x7E) {
                throw new zzgnt("Not a printable ASCII character: " + ((char)v1));
            }
            arr_b[v] = (byte)v1;
        }
        return zzgvo.zzb(arr_b);
    }

    public static boolean zzc(byte[] arr_b, byte[] arr_b1) {
        if(arr_b1.length >= arr_b.length) {
            for(int v = 0; v < arr_b.length; ++v) {
                if(arr_b1[v] != arr_b[v]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}

