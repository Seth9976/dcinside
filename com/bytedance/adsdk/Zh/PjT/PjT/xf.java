package com.bytedance.adsdk.Zh.PjT.PjT;

import android.annotation.TargetApi;
import android.graphics.Path.Op;
import android.graphics.Path;
import com.bytedance.adsdk.Zh.ReZ.Zh.SM;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@TargetApi(19)
public class xf implements DWo, xs {
    private final List JQp;
    private final Path PjT;
    private final Path ReZ;
    private final Path Zh;
    private final String cr;
    private final SM cz;

    public xf(SM sM0) {
        this.PjT = new Path();
        this.Zh = new Path();
        this.ReZ = new Path();
        this.JQp = new ArrayList();
        this.cr = sM0.PjT();
        this.cz = sM0;
    }

    private void PjT() {
        for(int v = 0; v < this.JQp.size(); ++v) {
            Path path0 = ((xs)this.JQp.get(v)).cr();
            this.ReZ.addPath(path0);
        }
    }

    @TargetApi(19)
    private void PjT(Path.Op path$Op0) {
        this.Zh.reset();
        this.PjT.reset();
        for(int v = this.JQp.size() - 1; v > 0; --v) {
            xs xs0 = (xs)this.JQp.get(v);
            if(xs0 instanceof cr) {
                cr cr0 = (cr)xs0;
                List list0 = cr0.Zh();
                for(int v1 = list0.size() - 1; v1 >= 0; --v1) {
                    Path path0 = ((xs)list0.get(v1)).cr();
                    path0.transform(cr0.ReZ());
                    this.Zh.addPath(path0);
                }
            }
            else {
                Path path1 = xs0.cr();
                this.Zh.addPath(path1);
            }
        }
        xs xs1 = (xs)this.JQp.get(0);
        if(xs1 instanceof cr) {
            List list1 = ((cr)xs1).Zh();
            for(int v2 = 0; v2 < list1.size(); ++v2) {
                Path path2 = ((xs)list1.get(v2)).cr();
                path2.transform(((cr)xs1).ReZ());
                this.PjT.addPath(path2);
            }
        }
        else {
            Path path3 = xs1.cr();
            this.PjT.set(path3);
        }
        this.ReZ.op(this.PjT, this.Zh, path$Op0);
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.ReZ
    public void PjT(List list0, List list1) {
        for(int v = 0; v < this.JQp.size(); ++v) {
            ((xs)this.JQp.get(v)).PjT(list0, list1);
        }
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.DWo
    public void PjT(ListIterator listIterator0) {
        while(listIterator0.hasPrevious() && listIterator0.previous() != this) {
        }
        while(listIterator0.hasPrevious()) {
            ReZ reZ0 = (ReZ)listIterator0.previous();
            if(reZ0 instanceof xs) {
                this.JQp.add(((xs)reZ0));
                listIterator0.remove();
            }
        }
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.xs
    public Path cr() {
        this.ReZ.reset();
        if(this.cz.ReZ()) {
            return this.ReZ;
        }
        switch(this.cz.Zh()) {
            case 1: {
                this.PjT();
                return this.ReZ;
            }
            case 2: {
                this.PjT(Path.Op.UNION);
                return this.ReZ;
            }
            case 3: {
                this.PjT(Path.Op.REVERSE_DIFFERENCE);
                return this.ReZ;
            }
            case 4: {
                this.PjT(Path.Op.INTERSECT);
                return this.ReZ;
            }
            case 5: {
                this.PjT(Path.Op.XOR);
                return this.ReZ;
            }
            default: {
                return this.ReZ;
            }
        }
    }
}

