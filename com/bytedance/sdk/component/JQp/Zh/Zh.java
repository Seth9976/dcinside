package com.bytedance.sdk.component.JQp.Zh;

import com.bytedance.sdk.component.JQp.JQp;
import com.bytedance.sdk.component.JQp.fDm;

public class Zh implements JQp {
    private String PjT;
    private boolean ReZ;
    private boolean Zh;
    private fDm cr;

    public Zh(String s, boolean z, boolean z1, fDm fDm0) {
        this.PjT = s;
        this.Zh = z;
        this.ReZ = z1;
        this.cr = fDm0;
    }

    @Override  // com.bytedance.sdk.component.JQp.JQp
    public String PjT() {
        return this.PjT;
    }

    @Override  // com.bytedance.sdk.component.JQp.JQp
    public boolean ReZ() {
        return this.ReZ;
    }

    @Override  // com.bytedance.sdk.component.JQp.JQp
    public boolean Zh() {
        return this.Zh;
    }
}

