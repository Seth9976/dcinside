package com.bytedance.adsdk.PjT.Zh.ReZ.PjT;

import com.bytedance.adsdk.PjT.Zh.ReZ.PjT;
import com.bytedance.adsdk.PjT.Zh.Zh.PjT.xE;
import com.bytedance.adsdk.PjT.Zh.cr.ReZ;
import java.util.Deque;

public class Au extends cz {
    @Override  // com.bytedance.adsdk.PjT.Zh.ReZ.PjT.cz
    public int PjT(String s, int v, Deque deque0, PjT pjT0) {
        if(!com.bytedance.adsdk.PjT.Zh.JQp.PjT.cr(this.PjT(v, s))) {
            return pjT0.PjT(s, v, deque0);
        }
        String s1 = new String(new char[]{this.PjT(v, s), this.PjT(v + 1, s)});
        if(ReZ.PjT(s1) != null) {
            deque0.push(new xE(ReZ.PjT(s1)));
            return v + 2;
        }
        String s2 = String.valueOf(this.PjT(v, s));
        if(ReZ.PjT(s2) == null) {
            throw new IllegalArgumentException("Unrecognized:" + s2 + "examine:" + s.substring(0, v));
        }
        deque0.push(new xE(ReZ.PjT(s2)));
        return v + 1;
    }
}

