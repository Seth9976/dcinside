package com.google.android.gms.internal.ads;

import j..util.function.Function.-CC;
import java.util.function.Function;

public final class zzfjr implements Function {
    public final Class zza;

    public zzfjr(Class class0) {
        this.zza = class0;
    }

    @Override
    public Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return this.zza.cast(object0);
    }

    @Override
    public Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

