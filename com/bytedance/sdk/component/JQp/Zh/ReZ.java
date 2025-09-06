package com.bytedance.sdk.component.JQp.Zh;

import com.bytedance.sdk.component.JQp.XX;
import com.bytedance.sdk.component.JQp.cz;
import java.util.Map;

public class ReZ implements cz {
    private XX JQp;
    Map PjT;
    private Object ReZ;
    private int Zh;
    private String cr;

    public ReZ(int v, Object object0, String s) {
        this.Zh = v;
        this.ReZ = object0;
        this.cr = s;
    }

    public ReZ(int v, Object object0, String s, Map map0) {
        this(v, object0, s);
        this.PjT = map0;
    }

    @Override  // com.bytedance.sdk.component.JQp.cz
    public Map JQp() {
        return this.PjT;
    }

    @Override  // com.bytedance.sdk.component.JQp.cz
    public XX PjT() {
        return this.JQp;
    }

    public void PjT(XX xX0) {
        this.JQp = xX0;
    }

    @Override  // com.bytedance.sdk.component.JQp.cz
    public Object ReZ() {
        return this.ReZ;
    }

    @Override  // com.bytedance.sdk.component.JQp.cz
    public int Zh() {
        return this.Zh;
    }

    @Override  // com.bytedance.sdk.component.JQp.cz
    public String cr() {
        return this.cr;
    }
}

