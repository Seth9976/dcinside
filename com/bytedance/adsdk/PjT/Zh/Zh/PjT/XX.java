package com.bytedance.adsdk.PjT.Zh.Zh.PjT;

import com.bytedance.adsdk.PjT.Zh.Zh.PjT;
import com.bytedance.adsdk.PjT.Zh.cr.JQp;
import com.bytedance.adsdk.PjT.Zh.cr.cz;
import java.util.Map;

public class XX implements PjT {
    private final Object PjT;

    public XX(String s) {
        if(s.equalsIgnoreCase("true")) {
            this.PjT = Boolean.TRUE;
            return;
        }
        if(s.equalsIgnoreCase("false")) {
            this.PjT = Boolean.FALSE;
            return;
        }
        if(!s.equalsIgnoreCase("null")) {
            throw new IllegalArgumentException();
        }
        this.PjT = null;
    }

    @Override  // com.bytedance.adsdk.PjT.Zh.Zh.PjT
    public JQp PjT() {
        return cz.qj;
    }

    @Override  // com.bytedance.adsdk.PjT.Zh.Zh.PjT
    public Object PjT(Map map0) {
        return this.PjT;
    }

    @Override  // com.bytedance.adsdk.PjT.Zh.Zh.PjT
    public String Zh() {
        return this.PjT == null ? "NULL" : this.PjT.toString();
    }

    @Override
    public String toString() {
        return "KeywordNode [keywordValue=" + this.PjT + "]";
    }
}

