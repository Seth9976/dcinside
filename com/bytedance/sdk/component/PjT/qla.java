package com.bytedance.sdk.component.PjT;

import android.text.TextUtils;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Map;

public final class qla {
    private final Map PjT;

    private qla() {
        this.PjT = new ConcurrentHashMap();
    }

    public static qla PjT() {
        return new qla();
    }

    public qla PjT(String s, Object object0) {
        if(!TextUtils.isEmpty(s) && object0 != null) {
            this.PjT.put(s, object0);
        }
        return this;
    }

    public String Zh() [...] // 潜在的解密器
}

