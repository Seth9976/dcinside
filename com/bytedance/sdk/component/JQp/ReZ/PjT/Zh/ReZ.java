package com.bytedance.sdk.component.JQp.ReZ.PjT.Zh;

import com.bytedance.sdk.component.JQp.gK;

public class ReZ implements gK {
    private int PjT;
    private com.bytedance.sdk.component.JQp.ReZ.PjT.ReZ ReZ;
    private int Zh;

    public ReZ(int v, int v1) {
        this.Zh = v;
        this.PjT = v1;
        this.ReZ = new com.bytedance.sdk.component.JQp.ReZ.PjT.ReZ(v) {
            final ReZ PjT;

            protected int PjT(String s, byte[] arr_b) {
                return arr_b == null ? 0 : arr_b.length;
            }

            @Override  // com.bytedance.sdk.component.JQp.ReZ.PjT.ReZ
            protected int Zh(Object object0, Object object1) {
                return this.PjT(((String)object0), ((byte[])object1));
            }
        };
    }

    @Override  // com.bytedance.sdk.component.JQp.PjT
    public Object PjT(Object object0) {
        return this.PjT(((String)object0));
    }

    @Override  // com.bytedance.sdk.component.JQp.PjT
    public boolean PjT(Object object0, Object object1) {
        return this.PjT(((String)object0), ((byte[])object1));
    }

    public boolean PjT(String s, byte[] arr_b) {
        if(s != null && arr_b != null) {
            this.ReZ.PjT(s, arr_b);
            return true;
        }
        return false;
    }

    public byte[] PjT(String s) {
        return (byte[])this.ReZ.PjT(s);
    }

    @Override  // com.bytedance.sdk.component.JQp.PjT
    public boolean Zh(Object object0) {
        return this.Zh(((String)object0));
    }

    public boolean Zh(String s) {
        return this.ReZ.PjT(s) != null;
    }
}

