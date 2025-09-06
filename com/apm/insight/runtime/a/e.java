package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.a;

public final class e extends c {
    e(Context context0, b b0, d d0) {
        super(CrashType.BLOCK, context0, b0, d0);
    }

    @Override  // com.apm.insight.runtime.a.c
    public final a a(a a0) {
        a a1 = super.a(a0);
        com.apm.insight.a.a(a1, null, this.a);
        return a1;
    }

    @Override  // com.apm.insight.runtime.a.c
    protected final boolean b() {
        return true;
    }

    @Override  // com.apm.insight.runtime.a.c
    protected final boolean c() {
        return false;
    }
}

