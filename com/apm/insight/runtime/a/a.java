package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;

final class a extends c {
    a(Context context0, b b0, d d0) {
        super(CrashType.ANR, context0, b0, d0);
    }

    @Override  // com.apm.insight.runtime.a.c
    public final com.apm.insight.entity.a a(com.apm.insight.entity.a a0) {
        com.apm.insight.entity.a a1 = super.a(a0);
        Header header0 = Header.a(this.b);
        Header.a(header0);
        Header.b(header0);
        header0.c();
        header0.d();
        header0.e();
        a1.a(header0);
        a1.a("process_name", com.apm.insight.l.a.d(this.b));
        com.apm.insight.a.a(a1, header0, this.a);
        return a1;
    }
}

