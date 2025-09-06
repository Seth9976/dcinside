package com.google.android.gms.internal.ads;

import j..util.Objects;
import java.io.IOException;
import java.util.Iterator;
import o3.a;

public final class zzfuf {
    static final CharSequence zza(@a Object object0) {
        Objects.requireNonNull(object0);
        return object0 instanceof CharSequence ? ((CharSequence)object0) : object0.toString();
    }

    public static final StringBuilder zzb(StringBuilder stringBuilder0, Iterable iterable0, String s) {
        zzfuf.zzc(stringBuilder0, iterable0.iterator(), s);
        return stringBuilder0;
    }

    public static final StringBuilder zzc(StringBuilder stringBuilder0, Iterator iterator0, String s) {
        try {
            if(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                stringBuilder0.append(zzfuf.zza(object0));
                while(iterator0.hasNext()) {
                    stringBuilder0.append(s);
                    Object object1 = iterator0.next();
                    stringBuilder0.append(zzfuf.zza(object1));
                }
            }
            return stringBuilder0;
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }
}

