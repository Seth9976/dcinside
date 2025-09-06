package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzdy;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class zzfka implements Function {
    public final Class zza;

    public zzfka(Class class0) {
        this.zza = class0;
    }

    @Override
    public Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return (zzcvm)this.zza.cast(((zzdy)object0));
    }

    @Override
    public Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

