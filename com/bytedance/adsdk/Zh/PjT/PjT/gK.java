package com.bytedance.adsdk.Zh.PjT.PjT;

import android.graphics.Path.FillType;
import android.graphics.Path;
import com.bytedance.adsdk.Zh.PjT.Zh.PjT.PjT;
import com.bytedance.adsdk.Zh.ReZ.Zh.ub;
import com.bytedance.adsdk.Zh.SM;
import java.util.ArrayList;
import java.util.List;

public class gK implements xs, PjT {
    private final com.bytedance.adsdk.Zh.PjT.Zh.xs JQp;
    private final Path PjT;
    private final boolean ReZ;
    private final Zh XX;
    private final String Zh;
    private final SM cr;
    private boolean cz;

    public gK(SM sM0, com.bytedance.adsdk.Zh.ReZ.ReZ.PjT pjT0, ub ub0) {
        this.PjT = new Path();
        this.XX = new Zh();
        this.Zh = ub0.PjT();
        this.ReZ = ub0.ReZ();
        this.cr = sM0;
        com.bytedance.adsdk.Zh.PjT.Zh.xs xs0 = ub0.Zh().cr();
        this.JQp = xs0;
        pjT0.PjT(xs0);
        xs0.PjT(this);
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$PjT
    public void PjT() {
        this.Zh();
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.ReZ
    public void PjT(List list0, List list1) {
        List list2 = null;
        for(int v = 0; v < list0.size(); ++v) {
            ReZ reZ0 = (ReZ)list0.get(v);
            if(reZ0 instanceof RD && ((RD)reZ0).Zh() == com.bytedance.adsdk.Zh.ReZ.Zh.ltE.PjT.PjT) {
                this.XX.PjT(((RD)reZ0));
                ((RD)reZ0).PjT(this);
            }
            else if(reZ0 instanceof ltE) {
                if(list2 == null) {
                    list2 = new ArrayList();
                }
                list2.add(((ltE)reZ0));
            }
        }
        this.JQp.PjT(list2);
    }

    private void Zh() {
        this.cz = false;
        this.cr.invalidateSelf();
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.xs
    public Path cr() {
        if(this.cz) {
            return this.PjT;
        }
        this.PjT.reset();
        if(this.ReZ) {
            this.cz = true;
            return this.PjT;
        }
        Path path0 = (Path)this.JQp.XX();
        if(path0 == null) {
            return this.PjT;
        }
        this.PjT.set(path0);
        this.PjT.setFillType(Path.FillType.EVEN_ODD);
        this.XX.PjT(this.PjT);
        this.cz = true;
        return this.PjT;
    }
}

