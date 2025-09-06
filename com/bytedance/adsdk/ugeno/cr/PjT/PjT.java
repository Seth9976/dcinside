package com.bytedance.adsdk.ugeno.cr.PjT;

import java.util.HashMap;
import java.util.Map;

public class PjT {
    private volatile Map PjT;

    public PjT() {
        this.PjT = new HashMap();
    }

    public ReZ PjT(String s) {
        if(this.PjT.containsKey(s) && this.PjT.get(s) != null) {
            return (ReZ)this.PjT.get(s);
        }
        ReZ reZ0 = new Zh();
        this.PjT.put(s, reZ0);
        return reZ0;
    }

    public void PjT(String s, ReZ reZ0) {
        if(this.PjT.containsKey(s) && this.PjT.get(s) != null) {
            return;
        }
        this.PjT.put(s, reZ0);
    }
}

