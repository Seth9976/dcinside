package com.bytedance.sdk.component.JQp.PjT;

import com.bytedance.sdk.component.JQp.SM;
import com.bytedance.sdk.component.JQp.xf;
import com.bytedance.sdk.component.utils.xE;
import java.util.WeakHashMap;

public class Zh {
    public static xf PjT() {
        return new xf() {
            private WeakHashMap PjT;

            {
                this.PjT = new WeakHashMap();
            }

            private String PjT(String s) {
                String s1 = (String)this.PjT.get(s);
                if(s1 == null) {
                    s1 = xE.PjT(s);
                    this.PjT.put(s, s1);
                }
                return s1;
            }

            @Override  // com.bytedance.sdk.component.JQp.xf
            public String PjT(SM sM0) {
                return this.PjT(sM0.PjT() + "#width=" + sM0.Zh() + "#height=" + sM0.ReZ() + "#scaletype=" + sM0.cr() + "#bitmapConfig=" + sM0.JQp());
            }

            @Override  // com.bytedance.sdk.component.JQp.xf
            public String Zh(SM sM0) {
                return this.PjT(sM0.PjT());
            }
        };
    }
}

