package com.bytedance.adsdk.ugeno.PjT.PjT;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.Zh.ReZ;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class Zh extends PjT {
    private int JQp;
    private int ReZ;
    private static final int XX;
    private int cr;
    private Paint cz;

    static {
        Zh.XX = Color.parseColor("#7ed321");
    }

    public Zh(ReZ reZ0, JSONObject jSONObject0) {
        super(reZ0, jSONObject0);
        Paint paint0 = new Paint();
        this.cz = paint0;
        paint0.setAntiAlias(true);
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.PjT.PjT
    public void PjT(int v, int v1) {
        this.cr = v / 2;
        this.JQp = v1 / 2;
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.PjT.PjT
    public void PjT(Canvas canvas0) {
        try {
            if(this.Zh.VY() > 0.0f) {
                this.cz.setColor(this.ReZ);
                this.cz.setAlpha(((int)((1.0f - this.Zh.VY()) * 255.0f)));
                ((ViewGroup)this.Zh.qj().getParent()).setClipChildren(true);
                canvas0.drawCircle(((float)this.cr), ((float)this.JQp), ((float)(Math.min(this.cr, this.JQp) * 2)) * this.Zh.VY(), this.cz);
            }
        }
        catch(Throwable throwable0) {
            Log.d("BaseEffectWrapper", "ripple animation error " + throwable0.getMessage());
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
        this.ReZ = com.bytedance.adsdk.ugeno.XX.PjT.PjT(this.PjT.optString("backgroundColor"), Zh.XX);
    }
}

