package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Comparator;

public final class zzp implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return RequestConfiguration.zza.indexOf(((String)object0)) - RequestConfiguration.zza.indexOf(((String)object1));
    }
}

