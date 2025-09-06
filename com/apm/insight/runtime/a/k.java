package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.entity.a;

final class k extends c {
    k(Context context0, b b0, d d0) {
        super(CrashType.LAUNCH, context0, b0, d0);
    }

    @Override  // com.apm.insight.runtime.a.c
    public final a a(int v, a a0) {
        a a1 = super.a(v, a0);
        switch(v) {
            case 0: {
                Header header1 = Header.a(this.b);
                header1.c();
                a1.a(header1);
                com.apm.insight.a.a(a1, header1, this.a);
                return a1;
            }
            case 1: {
                Header header0 = a1.d();
                header0.d();
                header0.e();
                return a1;
            }
            case 2: {
                Header.a(a1.d());
                try {
                    a1.d().f().put("launch_did", com.apm.insight.i.a.a(this.b));
                }
                catch(Throwable unused_ex) {
                }
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

