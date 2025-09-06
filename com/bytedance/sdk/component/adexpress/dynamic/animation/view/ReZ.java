package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.Shader.TileMode;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.PjT.PjT.PjT;
import com.bytedance.sdk.component.adexpress.dynamic.cr.XX;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.qj;

public class ReZ {
    private int JQp;
    Paint PjT;
    Path ReZ;
    Path Zh;
    private int cr;
    private int cz;

    public ReZ() {
        this.Zh = new Path();
        this.ReZ = new Path();
        Paint paint0 = new Paint();
        this.PjT = paint0;
        paint0.setAntiAlias(true);
    }

    public void PjT(Canvas canvas0, IAnimation iAnimation0, View view0) {
        int v2;
        float[] arr_f;
        String s;
        int v = 0;
        if(iAnimation0.getRippleValue() != 0.0f) {
            if(PjT.PjT().ReZ() != null) {
                try {
                    s = "";
                    s = (String)view0.getTag(0x7D06FFD8);
                    arr_f = null;
                    arr_f = XX.Zh(s);
                }
                catch(Exception unused_ex) {
                }
                if(s.startsWith("#")) {
                    this.PjT.setColor(Color.parseColor(s));
                    this.PjT.setAlpha(90);
                }
                else if(arr_f != null) {
                    int v1 = com.bytedance.sdk.component.adexpress.cr.XX.PjT(arr_f[3] * (1.0f - iAnimation0.getRippleValue()), arr_f[0] / 256.0f, arr_f[1] / 256.0f, arr_f[2] / 256.0f);
                    this.PjT.setColor(v1);
                }
            }
            ((ViewGroup)view0.getParent()).setClipChildren(true);
            canvas0.drawCircle(((float)this.cr), ((float)this.JQp), ((float)(Math.min(this.cr, this.JQp) * 2)) * iAnimation0.getRippleValue(), this.PjT);
        }
        if(iAnimation0.getShineValue() != 0.0f) {
            if(view0.getParent() != null) {
                ((ViewGroup)view0.getParent()).setClipChildren(true);
            }
            if(view0.getParent().getParent() != null) {
                ((ViewGroup)view0.getParent().getParent()).setClipChildren(true);
            }
            this.Zh.reset();
            try {
                v2 = 0;
                v2 = (int)(((Integer)view0.getTag(0x7D06FFD7)));
            }
            catch(Exception unused_ex) {
            }
            if(v2 >= 0) {
                int v3 = ((int)(((float)(this.cr * 4 + v2 * 2 + this.JQp * 2)) * iAnimation0.getShineValue())) - (this.JQp * 2 + v2);
                LinearGradient linearGradient0 = new LinearGradient(((float)v3), 0.0f, ((float)((v2 + this.JQp) / 2 + v3)), ((float)(this.JQp / 2)), new int[]{Color.parseColor("#20ffffff"), Color.parseColor("#60ffffff"), Color.parseColor("#65ffffff")}, null, Shader.TileMode.MIRROR);
                this.PjT.setShader(linearGradient0);
                this.PjT.setStrokeWidth(((float)(this.cr * 2)));
                Path path0 = this.ReZ;
                if(path0 != null) {
                    canvas0.clipPath(path0, Region.Op.INTERSECT);
                }
                canvas0.drawLine(((float)v3), 0.0f, ((float)(v3 + v2 + this.JQp)), ((float)this.JQp), this.PjT);
            }
        }
        if(iAnimation0.getMarqueeValue() != 0.0f) {
            try {
                v = (int)(((Integer)view0.getTag(0x7D06FFD5)));
            }
            catch(Exception unused_ex) {
            }
            if(v >= 0) {
                this.Zh.reset();
                this.Zh.moveTo(0.0f, 0.0f);
                this.Zh.lineTo(((float)(this.cr * 2)), 0.0f);
                this.Zh.lineTo(((float)(this.cr * 2)), ((float)(this.JQp * 2)));
                this.Zh.lineTo(0.0f, ((float)(this.JQp * 2)));
                this.Zh.lineTo(0.0f, 0.0f);
                LinearGradient linearGradient1 = new LinearGradient(0.0f, 0.0f, ((float)(this.cr * 2)), ((float)(this.JQp * 2)), new int[]{((int)(iAnimation0.getMarqueeValue() * -65536.0f)), ((int)((1.0f - iAnimation0.getMarqueeValue()) * -65536.0f))}, null, Shader.TileMode.CLAMP);
                this.PjT.setShader(linearGradient1);
                this.PjT.setColor(0xFFFF0000);
                this.PjT.setStyle(Paint.Style.STROKE);
                this.PjT.setStrokeWidth(((float)v));
                canvas0.drawPath(this.Zh, this.PjT);
            }
        }
    }

    public void PjT(View view0, float f) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        int v = (int)(((float)this.cz) * f);
        viewGroup$LayoutParams0.width = v;
        view0.setTranslationX(((float)((this.cz - v) / 2)));
        if(view0 instanceof qj) {
            for(int v1 = 0; v1 < ((ViewGroup)view0).getChildCount(); ++v1) {
                ((ViewGroup)view0).getChildAt(v1).setTranslationX(((float)(-(this.cz - viewGroup$LayoutParams0.width) / 2)));
            }
        }
        view0.setLayoutParams(viewGroup$LayoutParams0);
    }

    public void PjT(View view0, int v, int v1) {
        this.cr = v / 2;
        this.JQp = v1 / 2;
        if(this.cz == 0 && view0.getLayoutParams().width > 0) {
            this.cz = view0.getLayoutParams().width;
        }
        try {
            String s = "";
            s = (String)view0.getTag(0x7D06FFD6);
            RectF rectF0 = new RectF(0.0f, 0.0f, ((float)v), ((float)v1));
            this.ReZ.addRoundRect(rectF0, ((float)(v1 / 2)), ((float)(v1 / 2)), Path.Direction.CW);
        }
        catch(Exception unused_ex) {
        }
        if("right".equals(s)) {
            view0.setPivotX(((float)(this.cr * 2)));
            view0.setPivotY(((float)this.JQp));
            return;
        }
        if("left".equals(s)) {
            view0.setPivotX(0.0f);
            view0.setPivotY(((float)this.JQp));
            return;
        }
        view0.setPivotX(((float)this.cr));
        view0.setPivotY(((float)this.JQp));
    }
}

