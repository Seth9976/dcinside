package com.bytedance.adsdk.PjT.Zh.ReZ.PjT;

import com.bytedance.adsdk.PjT.Zh.Zh.PjT.qla;
import com.bytedance.adsdk.PjT.Zh.Zh.PjT;
import com.bytedance.adsdk.PjT.Zh.cr.ReZ;
import java.util.Deque;

public class XX extends cz {
    private boolean PjT(String s, int v, Deque deque0) {
        if(45 == this.PjT(v, s)) {
            if(deque0.peek() != null && !ReZ.PjT(((PjT)deque0.peek()).PjT())) {
                return false;
            }
            if(!com.bytedance.adsdk.PjT.Zh.JQp.PjT.ReZ(this.PjT(v + 1, s))) {
                throw new IllegalArgumentException("Unrecognized - symbol, not a negative number or operator, problem range:" + s.substring(0, v));
            }
            return true;
        }
        return com.bytedance.adsdk.PjT.Zh.JQp.PjT.ReZ(this.PjT(v, s));
    }

    @Override  // com.bytedance.adsdk.PjT.Zh.ReZ.PjT.cz
    public int PjT(String s, int v, Deque deque0, com.bytedance.adsdk.PjT.Zh.ReZ.PjT pjT0) {
        if(!this.PjT(s, v, deque0)) {
            return pjT0.PjT(s, v, deque0);
        }
        int v1 = this.PjT(v, s) == 45 ? v + 1 : v;
        boolean z = false;
        while(true) {
            int v2 = this.PjT(v1, s);
            if(!com.bytedance.adsdk.PjT.Zh.JQp.PjT.ReZ(((char)v2)) && (z || v2 != 46)) {
                break;
            }
            ++v1;
            if(v2 == 46) {
                z = true;
            }
        }
        if(v2 == 46) {
            throw new IllegalArgumentException("Illegal negative number format, problem interval:" + s.substring(v, v1));
        }
        deque0.push(new qla(s.substring(v, v1)));
        return v1;
    }
}

