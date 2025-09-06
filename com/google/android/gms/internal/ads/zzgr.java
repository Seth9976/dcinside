package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Map;

public final class zzgr extends zzgp {
    public final int zzc;

    public zzgr(int v, @Nullable String s, @Nullable IOException iOException0, Map map0, zzgd zzgd0, byte[] arr_b) {
        super("Response code: " + v, iOException0, zzgd0, 2004, 1);
        this.zzc = v;
    }
}

