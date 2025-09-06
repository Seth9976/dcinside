package com.bytedance.adsdk.ugeno.PjT.Zh;

import android.animation.ArgbEvaluator;
import android.animation.IntEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.PjT.cr;
import java.util.TreeMap;

public class ReZ extends PjT {
    public ReZ(Context context0, com.bytedance.adsdk.ugeno.Zh.ReZ reZ0, String s, TreeMap treeMap0) {
        super(context0, reZ0, s, treeMap0);
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.Zh.PjT
    public void PjT(float f, String s) {
        Keyframe keyframe0 = this.cr == cr.qj ? Keyframe.ofInt(f, com.bytedance.adsdk.ugeno.XX.PjT.PjT(s)) : Keyframe.ofInt(f, com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s, 0));
        this.JQp.add(keyframe0);
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.Zh.PjT
    public void Zh() {
        if(this.cr == cr.qj) {
            Keyframe keyframe0 = Keyframe.ofInt(0.0f, this.XX.ig());
            this.JQp.add(keyframe0);
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.Zh.PjT
    public TypeEvaluator cz() {
        return this.cr == cr.qj ? new ArgbEvaluator() : new IntEvaluator();
    }
}

