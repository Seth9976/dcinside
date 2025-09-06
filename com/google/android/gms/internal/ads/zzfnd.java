package com.google.android.gms.internal.ads;

import android.os.Build;
import androidx.annotation.VisibleForTesting;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

public final class zzfnd {
    @VisibleForTesting
    protected static final byte[] zza;
    @VisibleForTesting
    protected static final byte[] zzb;
    private final byte[] zzc;
    private final byte[] zzd;

    static {
        zzfnd.zza = new byte[]{61, 0x7A, 18, 35, 1, -102, -93, -99, -98, (byte)0xA0, -29, 67, 106, -73, (byte)0xC0, (byte)0x89, 107, -5, 0x4F, -74, 0x79, -12, -34, 0x5F, -25, -62, 0x3F, 50, 108, (byte)0x8F, -103, 74};
        zzfnd.zzb = new byte[]{-110, -13, -34, 70, -83, 43, 97, 21, -44, 16, -54, (byte)0x83, -28, -57, (byte)0x83, (byte)0x81, -7, 17, 102, -69, 0x74, (byte)0x87, (byte)0xB1, 43, -13, 120, 58, 55, -29, -108, 0x5F, 83};
    }

    public zzfnd() {
        this.zzc = zzfnd.zzb;
        this.zzd = zzfnd.zza;
    }

    public final boolean zza(File file0) throws GeneralSecurityException {
        X509Certificate[][] arr2_x509Certificate;
        String s = file0.getAbsolutePath();
        try {
            arr2_x509Certificate = zzaos.zza(s);
        }
        catch(zzaoo zzaoo0) {
            throw new GeneralSecurityException("Package is not signed", zzaoo0);
        }
        catch(IOException | RuntimeException iOException0) {
            throw new GeneralSecurityException("Failed to verify signatures", iOException0);
        }
        if(arr2_x509Certificate.length != 1) {
            throw new GeneralSecurityException("APK has more than one signature.");
        }
        X509Certificate x509Certificate0 = arr2_x509Certificate[0][0];
        byte[] arr_b = MessageDigest.getInstance("SHA-256").digest(x509Certificate0.getEncoded());
        return Arrays.equals(this.zzd, arr_b) || !"user".equals(Build.TYPE) && Arrays.equals(this.zzc, arr_b);
    }
}

