package com.bytedance.adsdk.ugeno.PjT.PjT;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path.Op;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import com.bytedance.adsdk.ugeno.Zh.ReZ;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class JQp extends PjT {
    private boolean Au;
    private Path DWo;
    private Paint JQp;
    private float ReZ;
    private boolean SM;
    private String XX;
    private float cr;
    private float cz;
    private Path qj;
    private Path xf;
    private PorterDuffXfermode xs;

    public JQp(ReZ reZ0, JSONObject jSONObject0) {
        super(reZ0, jSONObject0);
        this.Au = true;
        this.SM = true;
        Paint paint0 = new Paint();
        this.JQp = paint0;
        paint0.setAntiAlias(true);
        this.Zh.qj().setLayerType(2, null);
        this.xs = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.DWo = new Path();
        this.qj = new Path();
        this.xf = new Path();
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.PjT.PjT
    public void PjT(int v, int v1) {
        if(v > 0 && this.Au) {
            this.ReZ = (float)v;
            this.Au = false;
        }
        if(v1 > 0 && this.SM) {
            this.cr = (float)v1;
            this.SM = false;
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.PjT.PjT
    public void PjT(Canvas canvas0) {
        if(this.Zh.xH() > 0.0f) {
            int v = (int)(this.ReZ * this.Zh.xH());
            int v1 = (int)(this.cr * this.Zh.xH());
            this.JQp.setXfermode(this.xs);
            String s = this.XX;
            s.hashCode();
            switch(s) {
                case "bottom": {
                    canvas0.drawRect(0.0f, ((float)v1), this.ReZ, this.cr, this.JQp);
                    break;
                }
                case "center": {
                    this.DWo.reset();
                    this.qj.reset();
                    this.xf.reset();
                    Path.Direction path$Direction0 = Path.Direction.CW;
                    this.DWo.addCircle(this.ReZ / 2.0f, this.cr / 2.0f, ((float)v), path$Direction0);
                    this.qj.addRect(this.ReZ / 2.0f, 0.0f, this.ReZ, this.cr, path$Direction0);
                    Path.Op path$Op0 = Path.Op.DIFFERENCE;
                    this.qj.op(this.DWo, path$Op0);
                    this.xf.addRect(0.0f, 0.0f, this.ReZ / 2.0f, this.cr, path$Direction0);
                    this.xf.op(this.DWo, path$Op0);
                    canvas0.drawPath(this.qj, this.JQp);
                    canvas0.drawPath(this.xf, this.JQp);
                    return;
                }
                case "left": {
                    canvas0.drawRect(0.0f, 0.0f, this.ReZ - ((float)v), this.cr, this.JQp);
                    return;
                }
                case "right": {
                    canvas0.drawRect(((float)v), 0.0f, this.ReZ, this.cr, this.JQp);
                    return;
                }
                case "top": {
                    canvas0.drawRect(0.0f, 0.0f, this.ReZ, this.cr - ((float)v1), this.JQp);
                }
            }
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.PjT.PjT
    public List ReZ() {
        PropertyValuesHolder propertyValuesHolder0 = PropertyValuesHolder.ofFloat(this.cr(), new float[]{this.cz, 1.0f});
        List list0 = new ArrayList();
        list0.add(propertyValuesHolder0);
        return list0;
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.PjT.PjT
    public void Zh() {
        this.cz = (float)this.PjT.optDouble("start", 0.0);
        this.XX = this.PjT.optString("direction", "center");
    }
}

