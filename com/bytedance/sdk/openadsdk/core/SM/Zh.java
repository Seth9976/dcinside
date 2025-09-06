package com.bytedance.sdk.openadsdk.core.SM;

import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

public class Zh {
    static class PjT {
        private static final Zh PjT;

        static {
            PjT.PjT = new Zh(null);
        }
    }

    private static com.bytedance.sdk.openadsdk.core.SM.PjT PjT;
    private String Zh;

    private Zh() {
        this.Zh = null;
        Zh.PjT = new com.bytedance.sdk.openadsdk.core.SM.PjT();
    }

    Zh(com.bytedance.sdk.openadsdk.core.SM.Zh.1 zh$10) {
    }

    // 去混淆评级： 低(20)
    public String JQp() [...] // 潜在的解密器

    public Map PjT(String s, byte[] arr_b) {
        com.bytedance.sdk.openadsdk.core.SM.PjT pjT0 = Zh.PjT;
        return pjT0 != null ? pjT0.PjT(s, arr_b) : new HashMap();
    }

    public void PjT() {
        com.bytedance.sdk.openadsdk.core.SM.PjT pjT0 = Zh.PjT;
        if(pjT0 != null) {
            pjT0.ReZ();
        }
    }

    public void PjT(MotionEvent motionEvent0) {
        com.bytedance.sdk.openadsdk.core.SM.PjT pjT0 = Zh.PjT;
        if(pjT0 != null) {
            pjT0.PjT(motionEvent0);
        }
    }

    public void PjT(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.SM.PjT pjT0 = Zh.PjT;
        if(pjT0 != null) {
            pjT0.PjT(s);
        }
    }

    public void PjT(@NonNull String s, Map map0) {
        com.bytedance.sdk.openadsdk.core.SM.PjT pjT0 = Zh.PjT;
        if(pjT0 != null) {
            pjT0.PjT(s, map0);
        }
    }

    public void PjT(Map map0) {
        com.bytedance.sdk.openadsdk.core.SM.PjT pjT0 = Zh.PjT;
        if(pjT0 != null) {
            pjT0.PjT(map0);
        }
    }

    public boolean ReZ() [...] // 潜在的解密器

    public int XX() [...] // 潜在的解密器

    public static Zh Zh() {
        return PjT.PjT;
    }

    public void Zh(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.SM.PjT pjT0 = Zh.PjT;
        if(pjT0 != null) {
            pjT0.Zh(s);
        }
    }

    // 去混淆评级： 低(40)
    public String cr() [...] // 潜在的解密器

    public long cz() {
        return Zh.PjT == null ? 0L : Zh.PjT.cz();
    }

    class com.bytedance.sdk.openadsdk.core.SM.Zh.1 {
    }

}

