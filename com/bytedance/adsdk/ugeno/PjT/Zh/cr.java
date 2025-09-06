package com.bytedance.adsdk.ugeno.PjT.Zh;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.XX.Au;
import com.bytedance.adsdk.ugeno.Zh.ReZ;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

public class cr extends PjT {
    private List Au;

    public cr(Context context0, ReZ reZ0, String s, Map map0) {
        super(context0, reZ0, s, map0);
        this.Au = new ArrayList();
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.Zh.PjT
    public List JQp() {
        String s = this.cr.Zh();
        this.cr();
        PropertyValuesHolder propertyValuesHolder0 = PropertyValuesHolder.ofKeyframe((s + "X"), ((Keyframe[])this.JQp.toArray(new Keyframe[0])));
        this.cz.add(propertyValuesHolder0);
        PropertyValuesHolder propertyValuesHolder1 = PropertyValuesHolder.ofKeyframe((s + "Y"), ((Keyframe[])this.Au.toArray(new Keyframe[0])));
        this.cz.add(propertyValuesHolder1);
        TypeEvaluator typeEvaluator0 = this.cz();
        if(typeEvaluator0 != null) {
            propertyValuesHolder0.setEvaluator(typeEvaluator0);
            propertyValuesHolder1.setEvaluator(typeEvaluator0);
        }
        return this.cz;
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.Zh.PjT
    public void PjT(float f, String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        try {
            JSONArray jSONArray0 = new JSONArray(s);
            if(jSONArray0.length() != 2) {
                return;
            }
            float f1 = (float)jSONArray0.optDouble(0);
            float f2 = (float)jSONArray0.optDouble(1);
            if(this.cr == com.bytedance.adsdk.ugeno.PjT.cr.PjT) {
                f1 = Au.PjT(this.PjT, f1);
                f2 = Au.PjT(this.PjT, f2);
            }
            Keyframe keyframe0 = Keyframe.ofFloat(f, f1);
            this.JQp.add(keyframe0);
            Keyframe keyframe1 = Keyframe.ofFloat(f, f2);
            this.Au.add(keyframe1);
        }
        catch(JSONException unused_ex) {
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.Zh.PjT
    public void Zh() {
        Keyframe keyframe1;
        Keyframe keyframe0;
        switch(this.cr) {
            case 1: {
                keyframe0 = Keyframe.ofFloat(0.0f, this.XX.fDm());
                keyframe1 = Keyframe.ofFloat(0.0f, this.XX.qla());
                break;
            }
            case 2: {
                keyframe0 = Keyframe.ofFloat(0.0f, this.XX.xE());
                keyframe1 = Keyframe.ofFloat(0.0f, this.XX.ub());
                break;
            }
            default: {
                keyframe0 = null;
                keyframe1 = null;
            }
        }
        if(keyframe0 != null) {
            this.JQp.add(keyframe0);
        }
        if(keyframe1 != null) {
            this.Au.add(keyframe1);
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.Zh.PjT
    public TypeEvaluator cz() {
        return new FloatEvaluator();
    }
}

