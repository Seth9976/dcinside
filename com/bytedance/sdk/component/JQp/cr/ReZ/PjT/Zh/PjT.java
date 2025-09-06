package com.bytedance.sdk.component.JQp.cr.ReZ.PjT.Zh;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.JQp.cr.ReZ.PjT.ReZ;
import com.bytedance.sdk.component.JQp.ub;

public class PjT implements ub {
    private long PjT;
    private int ReZ;
    private int Zh;
    private ReZ cr;

    public PjT(int v, int v1) {
        this.PjT = 0x400000L;
        this.Zh = v1;
        this.ReZ = v;
        this.cr = new ReZ(v1);
    }

    public static int PjT(Bitmap bitmap0) {
        return bitmap0 == null ? 0 : bitmap0.getAllocationByteCount();
    }

    public Bitmap PjT(String s) {
        try {
            return (Bitmap)this.cr.PjT(s);
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    @Override  // com.bytedance.sdk.component.JQp.PjT
    public Object PjT(Object object0) {
        return this.PjT(((String)object0));
    }

    @Override  // com.bytedance.sdk.component.JQp.PjT
    public boolean PjT(Object object0, Object object1) {
        return this.PjT(((String)object0), ((Bitmap)object1));
    }

    public boolean PjT(String s, Bitmap bitmap0) {
        if(s != null && bitmap0 != null) {
            try {
                int v = PjT.PjT(bitmap0);
                if(((long)v) <= this.PjT && v != 0) {
                    this.cr.PjT(s, bitmap0);
                    return true;
                }
                return false;
            }
            catch(Throwable unused_ex) {
            }
        }
        return false;
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

