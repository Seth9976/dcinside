package com.bytedance.sdk.openadsdk.Lrd.Zh;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.utils.wN;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class JQp {
    public static class PjT {
        public int PjT;
        public int Zh;

        public PjT(int v) {
            this.Zh = -1;
            this.PjT = v;
        }
    }

    private static final Map PjT;

    static {
        JQp.PjT = new ConcurrentHashMap();
    }

    private static Zh PjT(View view0, Owx owx0, boolean z, PjT jQp$PjT0) {
        if(view0 != null && owx0 != null && owx0.dIF() != null) {
            Integer integer0 = JQp.Zh(owx0);
            Map map0 = JQp.PjT;
            if(map0.containsKey(integer0)) {
                Zh zh0 = (Zh)map0.get(integer0);
                if(zh0 != null) {
                    zh0.PjT(view0);
                }
                return zh0;
            }
            Zh zh1 = Zh.PjT(z, integer0, view0, owx0, jQp$PjT0);
            map0.put(integer0, zh1);
            return zh1;
        }
        return null;
    }

    public static Zh PjT(Integer integer0) {
        return (Zh)JQp.PjT.get(integer0);
    }

    public static void PjT(View view0, Owx owx0, PjT jQp$PjT0) {
        if(view0 != null && owx0 != null && !owx0.KP()) {
            boolean z = JQp.ReZ(owx0);
            if(cRA.Zh(owx0) && jQp$PjT0 != null) {
                jQp$PjT0.PjT = -1;
            }
            JQp.PjT(JQp.PjT(view0, owx0, z, jQp$PjT0));
        }
    }

    private static void PjT(Zh zh0) {
        if(zh0 == null) {
            return;
        }
        zh0.PjT();
    }

    public static void PjT(Zh zh0, int v) {
        if(zh0 == null) {
            return;
        }
        zh0.PjT(v);
    }

    public static void PjT(Owx owx0) {
        if(owx0 != null && owx0.dIF() != null) {
            Integer integer0 = JQp.Zh(owx0);
            Zh zh0 = (Zh)JQp.PjT.get(integer0);
            if(zh0 != null) {
                zh0.DWo();
            }
            JQp.Zh(integer0);
        }
    }

    public static void PjT(Owx owx0, int v) {
        if(owx0 != null && owx0.dIF() != null) {
            Integer integer0 = JQp.Zh(owx0);
            JQp.PjT(((Zh)JQp.PjT.get(integer0)), v);
        }
    }

    private static boolean ReZ(Owx owx0) {
        if(owx0 == null) {
            return false;
        }
        String s = wN.PjT(owx0);
        if(("open_ad".equals(s) || "fullscreen_interstitial_ad".equals(s) || "rewarded_video".equals(s)) && !cRA.Zh(owx0)) {
            switch(owx0.RD()) {
                case 5: 
                case 33: {
                    break;
                }
                default: {
                    return Owx.JQp(owx0) && owx0.MWx() != null;
                }
            }
        }
        return false;
    }

    public static Integer Zh(Owx owx0) {
        return (owx0.ydj() + owx0.dIF()).hashCode();
    }

    public static void Zh(Integer integer0) {
        JQp.PjT.remove(integer0);
    }
}

