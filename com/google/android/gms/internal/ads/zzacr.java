package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import w4.d;

public final class zzacr {
    public static int zza(zzaco zzaco0, byte[] arr_b, int v, int v1) throws IOException {
        int v2;
        for(v2 = 0; v2 < v1; v2 += v3) {
            int v3 = zzaco0.zzb(arr_b, v + v2, v1 - v2);
            if(v3 == -1) {
                break;
            }
        }
        return v2;
    }

    @d
    public static void zzb(boolean z, @Nullable String s) throws zzbc {
        if(!z) {
            throw zzbc.zza(s, null);
        }
    }

    public static boolean zzc(zzaco zzaco0, byte[] arr_b, int v, int v1, boolean z) throws IOException {
        try {
            return zzaco0.zzm(arr_b, 0, v1, z);
        }
        catch(EOFException eOFException0) {
            if(!z) {
                throw eOFException0;
            }
            return false;
        }
    }

    public static boolean zzd(zzaco zzaco0, byte[] arr_b, int v, int v1) throws IOException {
        try {
            zzaco0.zzi(arr_b, v, v1);
            return true;
        }
        catch(EOFException unused_ex) {
            return false;
        }
    }

    public static boolean zze(zzaco zzaco0, int v) throws IOException {
        try {
            zzaco0.zzk(v);
            return true;
        }
        catch(EOFException unused_ex) {
            return false;
        }
    }
}

