package com.bytedance.adsdk.PjT.Zh.ReZ.PjT;

import com.bytedance.adsdk.PjT.Zh.ReZ.PjT;
import com.bytedance.adsdk.PjT.Zh.Zh.PjT.DWo;
import java.util.Deque;

public class JQp extends cz {
    @Override  // com.bytedance.adsdk.PjT.Zh.ReZ.PjT.cz
    public int PjT(String s, int v, Deque deque0, PjT pjT0) {
        int v1;
        for(v1 = v; true; ++v1) {
            int v2 = this.PjT(v1, s);
            if(!com.bytedance.adsdk.PjT.Zh.JQp.PjT.Zh(((char)v2)) && !com.bytedance.adsdk.PjT.Zh.JQp.PjT.ReZ(((char)v2))) {
                break;
            }
        }
        if(v2 != 40) {
            return pjT0.PjT(s, v, deque0);
        }
        deque0.push(new DWo(s.substring(v, v1)));
        return v1 + 1;
    }
}

