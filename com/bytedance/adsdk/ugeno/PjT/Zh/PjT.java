package com.bytedance.adsdk.ugeno.PjT.Zh;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.PjT.cr;
import com.bytedance.adsdk.ugeno.Zh.ReZ;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeMap;

public abstract class PjT {
    protected List JQp;
    protected Context PjT;
    protected Map ReZ;
    protected ReZ XX;
    protected String Zh;
    protected cr cr;
    protected List cz;

    public PjT(Context context0, ReZ reZ0, String s, Map map0) {
        this.PjT = context0;
        this.Zh = s;
        this.ReZ = map0;
        this.cz = new ArrayList();
        this.JQp = new ArrayList();
        this.cr = cr.PjT(this.Zh);
        this.XX = reZ0;
    }

    public List JQp() {
        String s = this.cr.Zh();
        this.cr();
        PropertyValuesHolder propertyValuesHolder0 = PropertyValuesHolder.ofKeyframe(s, ((Keyframe[])this.JQp.toArray(new Keyframe[0])));
        TypeEvaluator typeEvaluator0 = this.cz();
        if(typeEvaluator0 != null) {
            propertyValuesHolder0.setEvaluator(typeEvaluator0);
        }
        this.cz.add(propertyValuesHolder0);
        return this.cz;
    }

    public abstract void PjT(float arg1, String arg2);

    public boolean PjT() {
        return this.ReZ == null || this.ReZ.size() <= 0 ? false : this.ReZ.containsKey(0.0f);
    }

    public void ReZ() {
        if(this.ReZ != null && this.ReZ.size() > 0) {
            Map map0 = this.ReZ;
            if(map0 instanceof TreeMap) {
                Float float0 = (Float)((TreeMap)map0).lastKey();
                if(((float)float0) != 100.0f) {
                    this.PjT(100.0f, ((String)this.ReZ.get(float0)));
                }
            }
        }
    }

    public abstract void Zh();

    public void cr() {
        if(this.ReZ != null && this.ReZ.size() > 0) {
            if(!this.PjT()) {
                this.Zh();
            }
            for(Object object0: this.ReZ.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(map$Entry0 != null) {
                    this.PjT(((float)(((Float)map$Entry0.getKey()))) / 100.0f, ((String)map$Entry0.getValue()));
                }
            }
            this.ReZ();
        }
    }

    public abstract TypeEvaluator cz();
}

