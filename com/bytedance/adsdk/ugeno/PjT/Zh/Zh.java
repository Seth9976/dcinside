package com.bytedance.adsdk.ugeno.PjT.Zh;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.PjT.cr;
import com.bytedance.adsdk.ugeno.XX.Au;
import com.bytedance.adsdk.ugeno.Zh.ReZ;
import java.util.TreeMap;

public class Zh extends PjT {
    public Zh(Context context0, ReZ reZ0, String s, TreeMap treeMap0) {
        super(context0, reZ0, s, treeMap0);
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.Zh.PjT
    public void PjT(float f, String s) {
        Keyframe keyframe0 = Keyframe.ofFloat(f, (this.Zh.startsWith("translate") || this.cr == cr.xf ? Au.PjT(this.PjT, com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s, 0.0f)) : com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s, 0.0f)));
        this.JQp.add(keyframe0);
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.Zh.PjT
    public void Zh() {
        float f;
        switch(this.cr) {
            case 1: {
                f = this.XX.fDm();
                break;
            }
            case 2: {
                f = this.XX.qla();
                break;
            }
            case 3: {
                f = this.XX.xE();
                break;
            }
            case 4: {
                f = this.XX.ub();
                break;
            }
            case 5: {
                f = this.XX.gK();
                break;
            }
            case 6: {
                f = this.XX.ltE();
                break;
            }
            case 7: {
                f = this.XX.Owx();
                break;
            }
            case 8: {
                f = this.XX.RD();
                break;
            }
            case 9: {
                f = this.XX.Sks();
                break;
            }
            default: {
                f = 0.0f;
            }
        }
        Keyframe keyframe0 = Keyframe.ofFloat(0.0f, f);
        this.JQp.add(keyframe0);
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.Zh.PjT
    public TypeEvaluator cz() {
        return new FloatEvaluator();
    }
}

