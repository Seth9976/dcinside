package com.bytedance.sdk.component.JQp.ReZ.PjT.Zh;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.JQp.ReZ.PjT.ReZ;
import com.bytedance.sdk.component.JQp.ub;

public class Zh implements ub {
    private int PjT;
    private ReZ ReZ;
    private int Zh;

    public Zh(int v, int v1) {
        this.Zh = v;
        this.PjT = v1;
        this.ReZ = new ReZ(v) {
            final Zh PjT;

            protected int PjT(String s, Bitmap bitmap0) {
                return bitmap0 == null ? 0 : Zh.PjT(bitmap0);
            }

            @Override  // com.bytedance.sdk.component.JQp.ReZ.PjT.ReZ
            protected int Zh(Object object0, Object object1) {
                return this.PjT(((String)object0), ((Bitmap)object1));
            }
        };
    }

    public static int PjT(Bitmap bitmap0) {
        return bitmap0 == null ? 0 : bitmap0.getAllocationByteCount();
    }

    public Bitmap PjT(String s) {
        return (Bitmap)this.ReZ.PjT(s);
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
            this.ReZ.PjT(s, bitmap0);
            return true;
        }
        return false;
    }

    @Override  // com.bytedance.sdk.component.JQp.PjT
    public boolean Zh(Object object0) {
        return this.Zh(((String)object0));
    }

    public boolean Zh(String s) {
        return this.ReZ.PjT(s) != null;
    }
}

