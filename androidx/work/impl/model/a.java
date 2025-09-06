package androidx.work.impl.model;

import java.util.HashMap;
import kotlin.jvm.functions.Function1;

public final class a implements Function1 {
    public final RawWorkInfoDao_Impl a;

    public a(RawWorkInfoDao_Impl rawWorkInfoDao_Impl0) {
        this.a = rawWorkInfoDao_Impl0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return this.a.m(((HashMap)object0));
    }
}

