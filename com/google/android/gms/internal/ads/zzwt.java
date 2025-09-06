package com.google.android.gms.internal.ads;

import java.util.Comparator;

public final class zzwt implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        if(((int)(((Integer)object0))) == -1) {
            return ((int)(((Integer)object1))) == -1 ? 0 : -1;
        }
        return ((int)(((Integer)object1))) == -1 ? 1 : ((int)(((Integer)object0))) - ((int)(((Integer)object1)));
    }
}

