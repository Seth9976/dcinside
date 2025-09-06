package com.bytedance.adsdk.Zh.PjT;

import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.os.Build.VERSION;
import android.os.LocaleList;
import com.bytedance.adsdk.Zh.cz.JQp;

public class PjT extends Paint {
    public PjT() {
    }

    public PjT(int v) {
        super(v);
    }

    public PjT(int v, PorterDuff.Mode porterDuff$Mode0) {
        super(v);
        this.setXfermode(new PorterDuffXfermode(porterDuff$Mode0));
    }

    public PjT(PorterDuff.Mode porterDuff$Mode0) {
        this.setXfermode(new PorterDuffXfermode(porterDuff$Mode0));
    }

    @Override  // android.graphics.Paint
    public void setAlpha(int v) {
        if(Build.VERSION.SDK_INT < 29) {
            this.setColor(JQp.PjT(v, 0, 0xFF) << 24 | this.getColor() & 0xFFFFFF);
            return;
        }
        super.setAlpha(JQp.PjT(v, 0, 0xFF));
    }

    @Override  // android.graphics.Paint
    public void setTextLocales(LocaleList localeList0) {
    }
}

