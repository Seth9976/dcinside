package com.bytedance.sdk.component.adexpress.dynamic.PjT;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.cr;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DWo;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Jo;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.KM;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Lrd;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Owx;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Qf;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.RD;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ReZ;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.SM;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Sks;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.XX;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Yo;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ZX;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cRA;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cz;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fDm;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.gK;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.iZZ;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.qj;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.qla;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tT;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ub;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xE;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xf;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xs;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.yIW;

public class Zh {
    public static JQp PjT(Context context0, DynamicRootView dynamicRootView0, Au au0) {
        if(context0 != null && dynamicRootView0 != null && au0 != null && au0.DWo() != null) {
            switch(au0.DWo().PjT()) {
                case -1: {
                    return new Qf(context0, dynamicRootView0, au0);
                }
                case 0: {
                    return new cRA(context0, dynamicRootView0, au0);
                }
                case 1: {
                    return new qj(context0, dynamicRootView0, au0);
                }
                case 2: {
                    return new XX(context0, dynamicRootView0, au0);
                }
                case 3: {
                    return new SM(context0, dynamicRootView0, au0);
                }
                case 4: {
                    return new xs(context0, dynamicRootView0, au0);
                }
                case 5: {
                    return new fDm(context0, dynamicRootView0, au0);
                }
                case 7: {
                    return new Jo(context0, dynamicRootView0, au0);
                }
                case 8: {
                    return new gK(context0, dynamicRootView0, au0);
                }
                case 10: {
                    return new xE(context0, dynamicRootView0, au0);
                }
                case 11: {
                    return new Lrd(context0, dynamicRootView0, au0);
                }
                case 12: {
                    return new DWo(context0, dynamicRootView0, au0);
                }
                case 13: {
                    return new yIW(context0, dynamicRootView0, au0);
                }
                case 14: {
                    return new iZZ(context0, dynamicRootView0, au0);
                }
                case 15: {
                    return cr.Zh() ? new Yo(context0, dynamicRootView0, au0) : new KM(context0, dynamicRootView0, au0);
                }
                case 16: {
                    return new qj(context0, dynamicRootView0, au0);
                }
                case 6: 
                case 9: 
                case 17: {
                    return new cz(context0, dynamicRootView0, au0);
                }
                case 18: {
                    return new tT(context0, dynamicRootView0, au0);
                }
                case 19: {
                    return new Sks(context0, dynamicRootView0, au0);
                }
                case 20: {
                    return new Owx(context0, dynamicRootView0, au0);
                }
                case 21: {
                    return new RD(context0, dynamicRootView0, au0);
                }
                case 22: {
                    return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Au(context0, dynamicRootView0, au0);
                }
                case 23: {
                    return new ub(context0, dynamicRootView0, au0);
                }
                case 24: {
                    return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cr(context0, dynamicRootView0, au0);
                }
                case 25: {
                    return new xf(context0, dynamicRootView0, au0);
                }
                case 26: {
                    return "vertical".equals(au0.DWo().JQp().na()) ? new ZX(context0, dynamicRootView0, au0) : new ReZ(context0, dynamicRootView0, au0);
                }
                case 27: {
                    return new KM(context0, dynamicRootView0, au0);
                }
                case 28: {
                    if(cr.Zh()) {
                        com.bytedance.sdk.component.adexpress.Zh.xs xs0 = dynamicRootView0.getRenderRequest();
                        return xs0 == null ? null : new qla(context0, dynamicRootView0, au0, xs0.Lrd());
                    }
                    break;
                }
                default: {
                    return null;
                }
            }
        }
        return null;
    }
}

