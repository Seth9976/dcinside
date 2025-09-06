package com.bytedance.sdk.component.adexpress.dynamic.animation.PjT;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.cr.PjT;

public class ReZ {
    private static volatile ReZ PjT;

    public static ReZ PjT() {
        if(ReZ.PjT == null) {
            Class class0 = ReZ.class;
            __monitor_enter(class0);
            try {
                if(ReZ.PjT == null) {
                    ReZ.PjT = new ReZ();
                }
                __monitor_exit(class0);
                return ReZ.PjT;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return ReZ.PjT;
    }

    public cr PjT(View view0, PjT pjT0) {
        if(pjT0 == null) {
            return null;
        }
        if(view0.getParent() != null) {
            ((ViewGroup)view0.getParent()).setClipChildren(false);
        }
        if(view0.getParent().getParent() != null) {
            ((ViewGroup)view0.getParent().getParent()).setClipChildren(false);
        }
        if("scale".equals(pjT0.SM())) {
            return new qj(view0, pjT0);
        }
        if("translate".equals(pjT0.SM())) {
            return new qla(view0, pjT0);
        }
        if("ripple".equals(pjT0.SM())) {
            return new Au(view0, pjT0);
        }
        if("marquee".equals(pjT0.SM())) {
            return new XX(view0, pjT0);
        }
        if("waggle".equals(pjT0.SM())) {
            return new xE(view0, pjT0);
        }
        if("shine".equals(pjT0.SM())) {
            return new xf(view0, pjT0);
        }
        if("swing".equals(pjT0.SM())) {
            return new fDm(view0, pjT0);
        }
        if("fade".equals(pjT0.SM())) {
            return new com.bytedance.sdk.component.adexpress.dynamic.animation.PjT.PjT(view0, pjT0);
        }
        if("rubIn".equals(pjT0.SM())) {
            return new DWo(view0, pjT0);
        }
        if("rotate".equals(pjT0.SM())) {
            return new SM(view0, pjT0);
        }
        if("cutIn".equals(pjT0.SM())) {
            return new cz(view0, pjT0);
        }
        if("stretch".equals(pjT0.SM())) {
            return new xs(view0, pjT0);
        }
        return "bounce".equals(pjT0.SM()) ? new JQp(view0, pjT0) : null;
    }
}

