package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.entity.a;

final class h extends c {
    h(Context context0, b b0, d d0) {
        super(CrashType.DART, context0, b0, d0);
    }

    @Override  // com.apm.insight.runtime.a.c
    public final a a(a a0) {
        a a1 = super.a(a0);
        Header header0 = Header.a(this.b);
        Header.a(header0);
        Header.b(header0);
        header0.c();
        header0.d();
        header0.e();
        a1.a(header0);
        com.apm.insight.a.a(a1, header0, this.a);
        return a1;
    }
}

