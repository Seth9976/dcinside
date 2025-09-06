package androidx.work.impl.model;

import java.util.HashMap;
import kotlin.jvm.functions.Function1;

public final class f implements Function1 {
    public final WorkSpecDao_Impl a;

    public f(WorkSpecDao_Impl workSpecDao_Impl0) {
        this.a = workSpecDao_Impl0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return this.a.b0(((HashMap)object0));
    }
}

