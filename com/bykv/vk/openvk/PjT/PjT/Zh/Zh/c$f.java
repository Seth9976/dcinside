package com.bykv.vk.openvk.PjT.PjT.Zh.Zh;

import android.text.TextUtils;
import com.bytedance.sdk.component.Zh.PjT.qj;
import com.bytedance.sdk.component.Zh.PjT.qla;
import com.bytedance.sdk.component.Zh.PjT.xs.PjT;
import com.bytedance.sdk.component.Zh.PjT.xs;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Map;
import s.b;

public class c.f implements c.e {
    private qj a;

    public c.f() {
        this.a = b.i();
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c$e
    public c.c a(c.b c$b0) throws IOException {
        PjT xs$PjT0 = new PjT();
        try {
            Map map0 = c$b0.e;
            if(map0 != null) {
                for(Object object0: map0.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object0;
                    String s = (String)map$Entry0.getKey();
                    if(!TextUtils.isEmpty(s)) {
                        String s1 = (String)map$Entry0.getValue();
                        if(s1 == null) {
                            s1 = "";
                        }
                        xs$PjT0.Zh(s, s1);
                    }
                }
            }
            xs xs0 = xs$PjT0.Zh(c$b0.b).PjT().PjT("videoPreloadLowVersion").PjT(6).Zh();
            qla qla0 = this.a.PjT(xs0).Zh();
            qla0.ReZ();
            return new c.g(qla0, c$b0);
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }
}

