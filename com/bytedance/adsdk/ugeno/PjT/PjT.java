package com.bytedance.adsdk.ugeno.PjT;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.bytedance.adsdk.ugeno.Zh.ReZ;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

public class PjT {
    private int JQp;
    private ReZ PjT;
    private ValueAnimator ReZ;
    private Zh Zh;
    private Context cr;
    private com.bytedance.adsdk.ugeno.PjT.PjT.PjT cz;

    public PjT(Context context0, ReZ reZ0, Zh zh0) {
        this.PjT = reZ0;
        this.Zh = zh0;
        this.cr = context0;
    }

    public void PjT() {
        ValueAnimator valueAnimator0 = this.ReZ;
        if(valueAnimator0 != null && this.JQp != -2) {
            valueAnimator0.start();
        }
    }

    public void PjT(int v, int v1) {
        com.bytedance.adsdk.ugeno.PjT.PjT.PjT pjT0 = this.cz;
        if(pjT0 != null) {
            pjT0.PjT(v, v1);
        }
    }

    public void PjT(Canvas canvas0) {
        com.bytedance.adsdk.ugeno.PjT.PjT.PjT pjT0 = this.cz;
        if(pjT0 != null) {
            pjT0.PjT(canvas0);
        }
    }

    public ValueAnimator ReZ() {
        com.bytedance.adsdk.ugeno.PjT.Zh.ReZ reZ0;
        Zh zh0 = this.Zh;
        if(zh0 != null && this.PjT != null) {
            Map map0 = zh0.Zh();
            ArrayList arrayList0 = new ArrayList();
            if(map0 != null && !map0.isEmpty()) {
                for(Object object0: map0.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object0;
                    if(map$Entry0 != null) {
                        String s = (String)map$Entry0.getKey();
                        String s1 = cr.PjT(s).ReZ();
                        s1.hashCode();
                        switch(s1) {
                            case "float": {
                                reZ0 = new com.bytedance.adsdk.ugeno.PjT.Zh.Zh(this.cr, this.PjT, s, ((TreeMap)map$Entry0.getValue()));
                                break;
                            }
                            case "int": {
                                reZ0 = new com.bytedance.adsdk.ugeno.PjT.Zh.ReZ(this.cr, this.PjT, s, ((TreeMap)map$Entry0.getValue()));
                                break;
                            }
                            case "point": {
                                reZ0 = new com.bytedance.adsdk.ugeno.PjT.Zh.cr(this.cr, this.PjT, s, ((Map)map$Entry0.getValue()));
                                break;
                            }
                            default: {
                                reZ0 = null;
                            }
                        }
                        if(reZ0 != null) {
                            arrayList0.addAll(reZ0.JQp());
                        }
                    }
                }
            }
            JSONObject jSONObject0 = this.Zh.PjT();
            if(jSONObject0 != null) {
                com.bytedance.adsdk.ugeno.PjT.PjT.PjT pjT0 = com.bytedance.adsdk.ugeno.PjT.PjT.PjT.PjT.PjT(this.PjT, jSONObject0);
                this.cz = pjT0;
                if(pjT0 != null) {
                    arrayList0.addAll(pjT0.ReZ());
                }
            }
            View view0 = this.PjT.qj();
            if(view0 == null) {
                return null;
            }
            com.bytedance.adsdk.ugeno.PjT.Zh.PjT zh$PjT0 = this.Zh.XX();
            if(zh$PjT0 != null) {
                view0.post(new Runnable() {
                    final PjT ReZ;

                    @Override
                    public void run() {
                        int v = view0.getWidth();
                        int v1 = view0.getHeight();
                        float f = (float)com.bytedance.adsdk.ugeno.PjT.ReZ.PjT(zh$PjT0.PjT, v);
                        view0.setPivotX(f);
                        float f1 = (float)com.bytedance.adsdk.ugeno.PjT.ReZ.PjT(zh$PjT0.Zh, v1);
                        view0.setPivotY(f1);
                    }
                });
            }
            ValueAnimator valueAnimator0 = ObjectAnimator.ofPropertyValuesHolder(view0, ((PropertyValuesHolder[])arrayList0.toArray(new PropertyValuesHolder[0])));
            this.JQp = com.bytedance.adsdk.ugeno.PjT.ReZ.PjT(this.Zh.cr());
            valueAnimator0.setDuration(this.Zh.ReZ());
            int v = this.JQp;
            if(v != -2) {
                valueAnimator0.setRepeatCount(v);
            }
            valueAnimator0.setStartDelay(this.Zh.cz());
            valueAnimator0.setRepeatMode(com.bytedance.adsdk.ugeno.PjT.ReZ.PjT(this.Zh.JQp()));
            valueAnimator0.setInterpolator(com.bytedance.adsdk.ugeno.PjT.ReZ.Zh(this.Zh.Au()));
            this.ReZ = valueAnimator0;
            return valueAnimator0;
        }
        return null;
    }

    public void Zh() {
        ValueAnimator valueAnimator0 = this.ReZ;
        if(valueAnimator0 != null) {
            valueAnimator0.cancel();
        }
    }
}

