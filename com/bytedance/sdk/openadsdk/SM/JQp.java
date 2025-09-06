package com.bytedance.sdk.openadsdk.SM;

import com.bytedance.sdk.component.JQp.SM;
import com.bytedance.sdk.component.JQp.ltE;

public class JQp implements ltE {
    private final String JQp;
    private static int PjT;
    private long ReZ;
    private long Zh;
    private boolean cr;

    static {
    }

    public JQp() {
        this.Zh = 0L;
        ++JQp.PjT;
        this.JQp = "image_request_" + JQp.PjT;
    }

    @Override  // com.bytedance.sdk.component.JQp.ltE
    public void PjT(String s, SM sM0) {
        if(!this.cr) {
            sM0.PjT();
            sM0.Zh();
            sM0.ReZ();
            this.cr = true;
        }
        this.Zh = System.currentTimeMillis();
    }

    private String ReZ(String s, SM sM0) [...] // Inlined contents

    @Override  // com.bytedance.sdk.component.JQp.ltE
    public void Zh(String s, SM sM0) {
        this.ReZ += System.currentTimeMillis() - this.Zh;
    }
}

