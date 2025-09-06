package androidx.work.impl.model;

import java.util.HashMap;
import kotlin.jvm.functions.Function1;

public final class b implements Function1 {
    public final RawWorkInfoDao_Impl a;

    public b(RawWorkInfoDao_Impl rawWorkInfoDao_Impl0) {
        this.a = rawWorkInfoDao_Impl0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return this.a.l(((HashMap)object0));
    }
}

