package com.bytedance.adsdk.ugeno.PjT.PjT;

import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.Shader.TileMode;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.XX.Au;
import com.bytedance.adsdk.ugeno.Zh.ReZ;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class cr extends PjT {
    private int Au;
    private int DWo;
    private Path JQp;
    private int ReZ;
    private float SM;
    private int XX;
    private Paint cr;
    private com.bytedance.adsdk.ugeno.XX.PjT.PjT cz;
    private static final float fDm;
    private float gK;
    private int qj;
    private static final float qla;
    private static final float ub;
    private static final float xE;
    private boolean xf;
    private Path xs;

    static {
        cr.fDm = 0.523599f;
        cr.qla = 0.57735f;
        cr.xE = 0.866025f;
        cr.ub = 0.5f;
    }

    public cr(ReZ reZ0, JSONObject jSONObject0) {
        super(reZ0, jSONObject0);
        this.xf = true;
        Paint paint0 = new Paint();
        this.cr = paint0;
        paint0.setAntiAlias(true);
        this.JQp = new Path();
        this.SM = this.Zh.Sks();
        this.xs = new Path();
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.PjT.PjT
    public void PjT(int v, int v1) {
        try {
            this.DWo = v;
            this.qj = v1;
            RectF rectF0 = new RectF(0.0f, 0.0f, ((float)v), ((float)v1));
            this.JQp.addRoundRect(rectF0, this.SM, this.SM, Path.Direction.CW);
        }
        catch(Throwable unused_ex) {
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.PjT.PjT
    @SuppressLint({"DrawAllocation"})
    public void PjT(Canvas canvas0) {
        try {
            if(this.Zh.tY() > 0.0f) {
                float f = (((float)this.DWo) + ((float)this.DWo) * cr.qla) * this.Zh.tY();
                this.xs.reset();
                this.xs.moveTo(f, 0.0f);
                float f1 = f - ((float)this.qj) * cr.qla;
                this.xs.lineTo(f1, ((float)this.qj));
                this.xs.lineTo(f1 + ((float)this.ReZ), ((float)this.qj));
                this.xs.lineTo(((float)this.ReZ) + f, 0.0f);
                this.xs.close();
                float f2 = cr.xE * this.gK;
                float f3 = this.gK * cr.ub;
                LinearGradient linearGradient0 = !this.xf || this.cz == null ? new LinearGradient(f, 0.0f, f + f2, f3, new int[]{this.Au, this.XX, this.Au}, null, Shader.TileMode.CLAMP) : new LinearGradient(f, 0.0f, f + f2, f3, this.cz.Zh, null, Shader.TileMode.CLAMP);
                this.cr.setShader(linearGradient0);
                Path path0 = this.JQp;
                if(path0 != null) {
                    canvas0.clipPath(path0, Region.Op.INTERSECT);
                }
                canvas0.drawPath(this.xs, this.cr);
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.PjT.PjT
    public List ReZ() {
        PropertyValuesHolder propertyValuesHolder0 = PropertyValuesHolder.ofFloat(this.cr(), new float[]{0.0f, 1.0f});
        List list0 = new ArrayList();
        list0.add(propertyValuesHolder0);
        return list0;
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.PjT.PjT
    public void Zh() {
        this.ReZ = (int)Au.PjT(this.Zh.qj().getContext(), ((float)this.PjT.optInt("shineWidth", 30)));
        String s = "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))";
        String s1 = this.PjT.optString("backgroundColor", "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))");
        if(!TextUtils.isEmpty(s1)) {
            s = s1;
        }
        if(s.startsWith("linear")) {
            this.cz = com.bytedance.adsdk.ugeno.XX.PjT.Zh(s);
        }
        else {
            int v = com.bytedance.adsdk.ugeno.XX.PjT.PjT(s);
            this.XX = v;
            this.Au = com.bytedance.adsdk.ugeno.XX.PjT.PjT(v, 0x20);
            this.xf = false;
        }
        this.gK = cr.xE * ((float)this.ReZ);
    }
}

