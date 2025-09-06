package com.google.android.gms.ads.mediation.customevent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;

@Deprecated
public final class CustomEventExtras {
    private final HashMap zza;

    public CustomEventExtras() {
        this.zza = new HashMap();
    }

    @Nullable
    public Object getExtra(@NonNull String s) {
        return this.zza.get(s);
    }

    public void setExtra(@NonNull String s, @NonNull Object object0) {
        this.zza.put(s, object0);
    }
}

