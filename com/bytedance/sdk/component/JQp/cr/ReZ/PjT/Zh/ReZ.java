package com.bytedance.sdk.component.JQp.cr.ReZ.PjT.Zh;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.JQp.cr.ReZ.PjT.PjT;
import com.bytedance.sdk.component.JQp.ub;

public class ReZ implements ub {
    private final ub PjT;
    private final PjT Zh;

    public ReZ(ub ub0) {
        this(ub0, null);
    }

    public ReZ(ub ub0, PjT pjT0) {
        this.PjT = ub0;
        this.Zh = pjT0;
    }

    public Bitmap PjT(String s) {
        return (Bitmap)this.PjT.PjT(s);
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
        return this.PjT.PjT(s, bitmap0);
    }

    @Override  // com.bytedance.sdk.component.JQp.PjT
    public boolean Zh(Object object0) {
        return this.Zh(((String)object0));
    }

    public boolean Zh(String s) {
        return this.PjT.Zh(s);
    }
}

