package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import o3.j;

@j
public abstract class zzazl {
    protected final Object zza;
    @Nullable
    private static MessageDigest zzb;

    static {
    }

    public zzazl() {
        this.zza = new Object();
    }

    @Nullable
    protected final MessageDigest zza() {
        synchronized(this.zza) {
            MessageDigest messageDigest0 = zzazl.zzb;
            if(messageDigest0 != null) {
                return messageDigest0;
            }
            for(int v1 = 0; v1 < 2; ++v1) {
                try {
                    zzazl.zzb = MessageDigest.getInstance("MD5");
                }
                catch(NoSuchAlgorithmException unused_ex) {
                }
            }
            return zzazl.zzb;
        }
    }

    abstract byte[] zzb(String arg1);
}

