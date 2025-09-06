package com.facebook.datasource;

import com.facebook.common.internal.n;
import java.util.Map;

public class m extends a {
    @Override  // com.facebook.datasource.a
    public boolean o(Throwable throwable0) {
        return super.o(((Throwable)n.i(throwable0)));
    }

    @Override  // com.facebook.datasource.a
    public boolean r(float f) {
        return super.r(f);
    }

    @Override  // com.facebook.datasource.a
    public boolean u(Object object0, boolean z, Map map0) {
        return super.u(n.i(object0), z, map0);
    }

    public static m x() {
        return new m();
    }

    public boolean y(Object object0) {
        return super.u(n.i(object0), true, null);
    }
}

