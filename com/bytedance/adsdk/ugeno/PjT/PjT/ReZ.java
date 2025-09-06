package com.bytedance.adsdk.ugeno.PjT.PjT;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader.TileMode;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class ReZ extends PjT {
    private Paint Au;
    private LinearGradient DWo;
    private float JQp;
    private String ReZ;
    private PorterDuffXfermode SM;
    private Paint XX;
    private float cr;
    private View cz;
    private Matrix qj;

    public ReZ(com.bytedance.adsdk.ugeno.Zh.ReZ reZ0, JSONObject jSONObject0) {
        super(reZ0, jSONObject0);
        this.cz = this.Zh.qj();
        Paint paint0 = new Paint();
        this.XX = paint0;
        paint0.setAntiAlias(true);
        this.cz.setLayerType(2, null);
        this.SM = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.Au = new Paint();
        this.qj = new Matrix();
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.PjT.PjT
    public void PjT(int v, int v1) {
        this.cr = (float)v;
        this.JQp = (float)v1;
        String s = this.ReZ;
        s.hashCode();
        switch(s) {
            case "bottom": {
                this.DWo = new LinearGradient(0.0f, -this.JQp, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                return;
            }
            case "left": {
                this.DWo = new LinearGradient(this.cr, 0.0f, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                return;
            }
            case "right": {
                this.DWo = new LinearGradient(-this.cr, 0.0f, 0.0f, this.JQp, 0, -1, Shader.TileMode.CLAMP);
                return;
            }
            case "top": {
                this.DWo = new LinearGradient(0.0f, this.JQp, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
            }
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.PjT.PjT
    public void PjT(Canvas canvas0) {
        try {
            if(this.Zh.dwk() > 0.0f) {
                int v = (int)(this.cr * this.Zh.dwk());
                int v1 = (int)(this.JQp * this.Zh.dwk());
                this.XX.setXfermode(this.SM);
                switch(this.ReZ) {
                    case "bottom": {
                        canvas0.drawRect(0.0f, ((float)v1), this.cr, this.JQp, this.XX);
                        this.qj.setTranslate(0.0f, ((float)v1));
                        this.DWo.setLocalMatrix(this.qj);
                        this.Au.setShader(this.DWo);
                        if(this.Zh.dwk() <= 1.0f && this.Zh.dwk() > 0.9f) {
                            this.Au.setAlpha(((int)(255.0f - this.Zh.dwk() * 255.0f)));
                        }
                        canvas0.drawRect(0.0f, 0.0f, this.cr, ((float)v1), this.Au);
                        return;
                    }
                    case "left": {
                        canvas0.drawRect(0.0f, 0.0f, this.cr - ((float)v), this.JQp, this.XX);
                        this.qj.setTranslate(this.cr - ((float)v), 0.0f);
                        this.DWo.setLocalMatrix(this.qj);
                        this.Au.setShader(this.DWo);
                        if(this.Zh.dwk() <= 1.0f && this.Zh.dwk() > 0.9f) {
                            this.Au.setAlpha(((int)(255.0f - this.Zh.dwk() * 255.0f)));
                        }
                        canvas0.drawRect(this.cr, this.JQp, this.cr - ((float)v), 0.0f, this.Au);
                        return;
                    }
                    case "right": {
                        canvas0.drawRect(((float)v), 0.0f, this.cr, this.JQp, this.XX);
                        this.qj.setTranslate(((float)v), this.JQp);
                        this.DWo.setLocalMatrix(this.qj);
                        this.Au.setShader(this.DWo);
                        if(this.Zh.dwk() <= 1.0f && this.Zh.dwk() > 0.9f) {
                            this.Au.setAlpha(((int)(255.0f - this.Zh.dwk() * 255.0f)));
                        }
                        canvas0.drawRect(0.0f, 0.0f, ((float)v), this.JQp, this.Au);
                        break;
                    }
                    case "top": {
                        canvas0.drawRect(0.0f, 0.0f, this.cr, this.JQp - ((float)v1), this.XX);
                        this.qj.setTranslate(0.0f, this.JQp - ((float)v1));
                        this.DWo.setLocalMatrix(this.qj);
                        this.Au.setShader(this.DWo);
                        if(this.Zh.dwk() <= 1.0f && this.Zh.dwk() > 0.9f) {
                            this.Au.setAlpha(((int)(255.0f - this.Zh.dwk() * 255.0f)));
                        }
                        canvas0.drawRect(this.cr, this.JQp, 0.0f, this.JQp - ((float)v1), this.Au);
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        Log.e("BaseEffectWrapper", throwable0.getMessage());
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.PjT.PjT
    public List ReZ() {
        List list0 = new ArrayList();
        list0.add(PropertyValuesHolder.ofFloat("rubIn", new float[]{0.0f, 1.0f}));
        list0.add(PropertyValuesHolder.ofFloat("alpha", new float[]{0.0f, 1.0f}));
        return list0;
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.PjT.PjT
    public void Zh() {
        this.ReZ = this.PjT.optString("direction", "left");
    }
}

