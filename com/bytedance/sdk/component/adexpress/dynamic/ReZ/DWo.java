package com.bytedance.sdk.component.adexpress.dynamic.ReZ;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.Zh.xs;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp;

public class DWo {
    public static XX PjT(Context context0, JQp jQp0, com.bytedance.sdk.component.adexpress.dynamic.cr.XX xX0, com.bytedance.sdk.component.adexpress.dynamic.cr.DWo dWo0, xs xs0) {
        XX xX1 = null;
        if(context0 != null && jQp0 != null && xX0 != null) {
            String s = xX0.IJ();
            String s1 = xs0.Lrd();
            s.hashCode();
            switch(s) {
                case "0": {
                    return new com.bytedance.sdk.component.adexpress.dynamic.ReZ.JQp(context0, jQp0, xX0);
                }
                case "1": {
                    return new ReZ(context0, jQp0, xX0);
                }
                case "10": {
                    return new cr(context0, jQp0, xX0);
                }
                case "11": {
                    return new fDm(context0, jQp0, xX0);
                }
                case "12": {
                    return new xE(context0, jQp0, xX0);
                }
                case "13": {
                    return new ub(context0, jQp0, xX0);
                }
                case "14": {
                    return new xf(context0, jQp0, xX0);
                }
                case "16": {
                    return new qla(context0, jQp0, xX0, s, dWo0.PjT(), dWo0.Zh(), dWo0.cr(), dWo0.XX());
                }
                case "17": {
                    return new ltE(context0, jQp0, xX0, s, dWo0);
                }
                case "18": {
                    return new ltE(context0, jQp0, xX0, s, dWo0);
                }
                case "2": {
                    return new Zh(context0, jQp0, xX0);
                }
                case "20": {
                    if(com.bytedance.sdk.component.adexpress.cr.Zh()) {
                        return new qj(context0, jQp0, xX0, s1 + "static/lotties/glass-swipe/glass-swipe.json", "20");
                    }
                    if(!TextUtils.isEmpty(s1)) {
                        xX1 = s1 + "brush_mask.json";
                    }
                    return new qj(context0, jQp0, xX0, ((String)xX1), "20");
                }
                case "22": {
                    return com.bytedance.sdk.component.adexpress.cr.Zh() ? new qj(context0, jQp0, xX0, s1 + "static/lotties/202327swiper-up-star/index.json", "22") : new gK(context0, jQp0, xX0);
                }
                case "23": {
                    if(com.bytedance.sdk.component.adexpress.cr.Zh()) {
                        return new qj(context0, jQp0, xX0, s1 + "static/lotties/202327swiper-up-star/click.json", "23");
                    }
                    break;
                }
                case "24": {
                    if(com.bytedance.sdk.component.adexpress.cr.Zh()) {
                        return new PjT(context0, jQp0, xX0);
                    }
                    if(!TextUtils.isEmpty(s1)) {
                        xX1 = s1 + "swiper_up_star.json";
                    }
                    return new qj(context0, jQp0, xX0, ((String)xX1), "24");
                }
                case "25": {
                    if(com.bytedance.sdk.component.adexpress.cr.Zh()) {
                        return new qj(context0, jQp0, xX0, s1 + "static/lotties/gesture-slide.json", "25");
                    }
                    break;
                }
                case "29": {
                    return new cz(context0, jQp0, xX0, dWo0.PjT(), dWo0.Zh(), dWo0.cr(), dWo0.XX());
                }
                case "5": {
                    return xX0.VY() == 1 ? new ub(context0, jQp0, xX0, xX0.xu()) : new xE(context0, jQp0, xX0);
                }
                case "6": {
                    return new fDm(context0, jQp0, xX0);
                }
                case "7": {
                    return new xf(context0, jQp0, xX0);
                }
                case "8": {
                    return new com.bytedance.sdk.component.adexpress.dynamic.ReZ.xs(context0, jQp0, xX0);
                }
                case "9": {
                    return new qla(context0, jQp0, xX0, s, dWo0.PjT(), dWo0.Zh(), dWo0.cr(), dWo0.XX());
                }
                default: {
                    return null;
                }
            }
        }
        return null;
    }
}

