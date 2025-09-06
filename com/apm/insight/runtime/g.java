package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.ICommonParams;
import com.apm.insight.nativecrash.b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class g {
    private String a;
    private int b;

    public g() {
        this.a = null;
        this.b = -1;
    }

    public static b a(Context context0) {
        return new b(context0, new ICommonParams() {
            @Override  // com.apm.insight.ICommonParams
            public final Map getCommonParams() {
                return new HashMap();
            }

            @Override  // com.apm.insight.ICommonParams
            public final String getDeviceId() {
                return null;
            }

            @Override  // com.apm.insight.ICommonParams
            public final List getPatchInfo() {
                return null;
            }

            @Override  // com.apm.insight.ICommonParams
            public final Map getPluginInfo() {
                return null;
            }

            @Override  // com.apm.insight.ICommonParams
            public final String getSessionId() {
                return null;
            }

            @Override  // com.apm.insight.ICommonParams
            public final long getUserId() {
                return 0L;
            }
        });
    }

    // 去混淆评级： 低(32)
    public final String a() {
        if(!TextUtils.isEmpty(this.a) && !"0".equals(this.a)) {
            return this.a;
        }
        this.a = "0";
        return "0";
    }

    public final void a(String s) {
        this.a = s;
        o.a().a(s);
    }

    public final boolean b() {
        return this.a != null;
    }
}

