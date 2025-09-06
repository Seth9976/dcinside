package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzdy;
import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class zzfjz implements Predicate {
    public final Class zza;

    public zzfjz(Class class0) {
        this.zza = class0;
    }

    @Override
    public Predicate and(Predicate predicate0) {
        return Predicate.-CC.$default$and(this, predicate0);
    }

    @Override
    public Predicate negate() {
        return Predicate.-CC.$default$negate(this);
    }

    @Override
    public Predicate or(Predicate predicate0) {
        return Predicate.-CC.$default$or(this, predicate0);
    }

    @Override
    public final boolean test(Object object0) {
        return this.zza.isInstance(((zzdy)object0));
    }
}

