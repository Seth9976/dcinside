package com.bytedance.sdk.component.JQp.cr.ReZ.PjT.Zh;

import com.bytedance.sdk.component.JQp.cr.ReZ.PjT.ReZ;
import com.bytedance.sdk.component.JQp.gK;

public class Zh implements gK {
    private long PjT;
    private int ReZ;
    private int Zh;
    private ReZ cr;

    public Zh(int v, int v1) {
        this.PjT = 0x100000L;
        this.ReZ = v;
        this.Zh = v1;
        this.cr = new ReZ(v1);
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
            try {
                if(((long)arr_b.length) > this.PjT) {
                    return false;
                }
                this.cr.PjT(s, arr_b);
                return true;
            }
            catch(Throwable unused_ex) {
            }
        }
        return false;
    }

    public byte[] PjT(String s) {
        try {
            return (byte[])this.cr.PjT(s);
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    @Override  // com.bytedance.sdk.component.JQp.PjT
    public boolean Zh(Object object0) {
        return this.Zh(((String)object0));
    }

    public boolean Zh(String s) {
        try {
            if(this.cr.PjT(s) != null) {
                return true;
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }
}

