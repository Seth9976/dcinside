package com.bytedance.sdk.component.Zh.PjT.Zh;

final class JQp {
    boolean JQp;
    final byte[] PjT;
    int ReZ;
    JQp XX;
    int Zh;
    boolean cr;
    JQp cz;

    JQp() {
        this.PjT = new byte[0x2000];
        this.JQp = true;
        this.cr = false;
    }

    JQp(byte[] arr_b, int v, int v1, boolean z, boolean z1) {
        this.PjT = arr_b;
        this.Zh = v;
        this.ReZ = v1;
        this.cr = z;
        this.JQp = z1;
    }

    final JQp PjT() {
        this.cr = true;
        return new JQp(this.PjT, this.Zh, this.ReZ, true, false);
    }

    public final JQp PjT(JQp jQp0) {
        jQp0.XX = this;
        jQp0.cz = this.cz;
        this.cz.XX = jQp0;
        this.cz = jQp0;
        return jQp0;
    }

    public final JQp Zh() {
        JQp jQp0 = this.cz;
        JQp jQp1 = this.XX;
        if(jQp1 != null) {
            jQp1.cz = jQp0;
        }
        JQp jQp2 = this.cz;
        if(jQp2 != null) {
            jQp2.XX = jQp1;
        }
        this.cz = null;
        this.XX = null;
        return jQp0 == this ? null : jQp0;
    }
}

