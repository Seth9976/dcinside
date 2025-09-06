package com.bytedance.adsdk.PjT.Zh.ReZ.PjT;

import com.bytedance.adsdk.PjT.Zh.JQp.PjT;
import com.bytedance.adsdk.PjT.Zh.Zh.PjT.Sks;
import com.bytedance.adsdk.PjT.Zh.Zh.PjT.XX;
import java.util.Deque;

public class ReZ extends cz {
    private int PjT(String s, int v, Deque deque0) {
        int v2;
        for(int v1 = 0; true; ++v1) {
            v2 = v1 + v;
            int v3 = this.PjT(v2, s);
            if(!PjT.Zh(((char)v3)) && !PjT.ReZ(((char)v3)) && 46 != v3 && 91 != v3 && 93 != v3 && 0x5F != v3 && 45 != v3 && 36 != v3) {
                break;
            }
        }
        String s1 = s.substring(v, v2);
        if(com.bytedance.adsdk.PjT.Zh.cr.PjT.PjT(s1) != null) {
            deque0.push(new XX(s1));
            return v2;
        }
        deque0.push(new Sks(s1));
        return v2;
    }

    @Override  // com.bytedance.adsdk.PjT.Zh.ReZ.PjT.cz
    public int PjT(String s, int v, Deque deque0, com.bytedance.adsdk.PjT.Zh.ReZ.PjT pjT0) {
        int v1 = this.PjT(v, s);
        return PjT.Zh(((char)v1)) || v1 == 36 ? this.PjT(s, v, deque0) : pjT0.PjT(s, v, deque0);
    }
}

