package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdFormat;
import j..util.function.BiFunction.-CC;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class zzen implements BiFunction {
    @Override
    public BiFunction andThen(Function function0) {
        return BiFunction.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0, Object object1) {
        AdFormat adFormat0 = (AdFormat)object0;
        return (int)(((Integer)object1) == null ? 1 : ((int)(((Integer)object1))) + 1);
    }
}

