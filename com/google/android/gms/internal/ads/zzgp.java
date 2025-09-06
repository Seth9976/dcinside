package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

public class zzgp extends zzfz {
    public final int zzb;

    public zzgp(zzgd zzgd0, int v, int v1) {
        super(2008);
        this.zzb = 1;
    }

    public zzgp(IOException iOException0, zzgd zzgd0, int v, int v1) {
        super(iOException0, zzgp.zzb(v, v1));
        this.zzb = v1;
    }

    public zzgp(String s, zzgd zzgd0, int v, int v1) {
        super(s, zzgp.zzb(v, v1));
        this.zzb = v1;
    }

    public zzgp(String s, @Nullable IOException iOException0, zzgd zzgd0, int v, int v1) {
        super(s, iOException0, zzgp.zzb(v, v1));
        this.zzb = v1;
    }

    public static zzgp zza(IOException iOException0, zzgd zzgd0, int v) {
        int v1;
        String s = iOException0.getMessage();
        if(iOException0 instanceof SocketTimeoutException) {
            v1 = 2002;
        }
        else if(iOException0 instanceof InterruptedIOException) {
            v1 = 1004;
        }
        else {
            v1 = s == null || !zzftt.zza(s).matches("cleartext.*not permitted.*") ? 2001 : 2007;
        }
        return v1 == 2007 ? new zzgo(iOException0, zzgd0) : new zzgp(iOException0, zzgd0, v1, v);
    }

    private static int zzb(int v, int v1) [...] // 潜在的解密器
}

