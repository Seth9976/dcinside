package com.bytedance.adsdk.ugeno.cr.Zh;

import com.bytedance.adsdk.ugeno.Zh.ReZ;
import com.bytedance.adsdk.ugeno.cr.Zh;
import com.bytedance.adsdk.ugeno.cr.cr;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

public abstract class PjT {
    public static class com.bytedance.adsdk.ugeno.cr.Zh.PjT.PjT {
        public static PjT PjT(ReZ reZ0, String s, com.bytedance.adsdk.ugeno.cr.cz.PjT cz$PjT0) {
            if(cz$PjT0 == null) {
                return null;
            }
            Zh zh0 = cr.PjT(cz$PjT0.Zh());
            if(zh0 == null) {
                return new com.bytedance.adsdk.ugeno.cr.Zh.ReZ(reZ0, s, cz$PjT0);
            }
            PjT pjT0 = zh0.PjT(reZ0, s, cz$PjT0);
            return pjT0 == null ? new com.bytedance.adsdk.ugeno.cr.Zh.ReZ(reZ0, s, cz$PjT0) : pjT0;
        }
    }

    protected String JQp;
    public static final HashSet PjT;
    protected ReZ ReZ;
    protected String XX;
    protected com.bytedance.adsdk.ugeno.cr.cz.PjT Zh;
    protected String cr;
    protected Map cz;

    static {
        PjT.PjT = new HashSet(Arrays.asList(new String[]{"convert", "dislike", "openAppPermission", "openAppPolicy", "openPrivacy", "openAppFunction", "close", "skip", "videoControl", "pauseVideo", "resumeVideo", "muteVideo", "preventEvent"}));
    }

    public PjT(ReZ reZ0, String s, com.bytedance.adsdk.ugeno.cr.cz.PjT cz$PjT0) {
        this.ReZ = reZ0;
        this.Zh = cz$PjT0;
        this.XX = s;
        this.Zh();
    }

    public abstract void PjT();

    private void Zh() {
        if(this.Zh == null) {
            return;
        }
        this.cr = "global";
        this.JQp = this.Zh.Zh();
        this.cz = this.Zh.ReZ();
    }
}

