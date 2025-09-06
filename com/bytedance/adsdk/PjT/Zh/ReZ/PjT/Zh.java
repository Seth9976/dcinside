package com.bytedance.adsdk.PjT.Zh.ReZ.PjT;

import com.bytedance.adsdk.PjT.Zh.ReZ.PjT;
import com.bytedance.adsdk.PjT.Zh.Zh.PjT.Owx;
import java.util.Deque;

public class Zh extends cz {
    @Override  // com.bytedance.adsdk.PjT.Zh.ReZ.PjT.cz
    public int PjT(String s, int v, Deque deque0, PjT pjT0) {
        if(39 != this.PjT(v, s)) {
            return pjT0.PjT(s, v, deque0);
        }
        int v1 = s.length();
        int v2;
        for(v2 = v + 1; v2 < v1 && this.PjT(v2, s) != 39; ++v2) {
        }
        if(this.PjT(v2, s) != 39) {
            throw new com.bytedance.adsdk.PjT.PjT.PjT("String expression not surrounded by \'", s.substring(v));
        }
        deque0.push(new Owx(s.substring(v + 1, v2)));
        return v2 + 1;
    }
}

