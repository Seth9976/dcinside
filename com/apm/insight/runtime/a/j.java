package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.entity.a;

final class j extends c {
    j(Context context0, b b0, d d0) {
        super(CrashType.JAVA, context0, b0, d0);
    }

    @Override  // com.apm.insight.runtime.a.c
    public final a a(int v, a a0) {
        a a1 = super.a(v, a0);
        switch(v) {
            case 0: {
                a1.a("app_count", 1);
                a1.a("magic_tag", "ss_app_log");
                Header header0 = Header.a(this.b);
                header0.c();
                a1.a(header0);
                com.apm.insight.a.a(a1, header0, this.a);
                return a1;
            }
            case 1: {
                Header header1 = a1.d();
                header1.d();
                header1.e();
                return a1;
            }
            case 2: {
                Header.a(a1.d());
                return a1;
            }
            case 5: {
                Header.b(a1.d());
                return a1;
            }
            default: {
                return a1;
            }
        }
    }
}

