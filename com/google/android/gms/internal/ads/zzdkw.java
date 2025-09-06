package com.google.android.gms.internal.ads;

import j..util.function.Function.-CC;
import java.util.function.Function;
import org.json.JSONObject;

public final class zzdkw implements Function {
    @Override
    public Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return ((JSONObject)object0).optJSONArray("flags");
    }

    @Override
    public Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

