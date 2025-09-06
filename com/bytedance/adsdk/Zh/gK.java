package com.bytedance.adsdk.Zh;

import android.util.Pair;
import com.bytedance.adsdk.Zh.cz.cr;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class gK {
    private boolean PjT;
    private final Map ReZ;
    private final Set Zh;
    private final Comparator cr;

    public gK() {
        this.PjT = false;
        this.Zh = new PjT();
        this.ReZ = new HashMap();
        this.cr = new Comparator() {
            final gK PjT;

            public int PjT(Pair pair0, Pair pair1) {
                float f = (float)(((Float)pair0.second));
                float f1 = (float)(((Float)pair1.second));
                if(f1 > f) {
                    return 1;
                }
                return f > f1 ? -1 : 0;
            }

            @Override
            public int compare(Object object0, Object object1) {
                return this.PjT(((Pair)object0), ((Pair)object1));
            }
        };
    }

    public void PjT(String s, float f) {
        if(!this.PjT) {
            return;
        }
        cr cr0 = (cr)this.ReZ.get(s);
        if(cr0 == null) {
            cr0 = new cr();
            this.ReZ.put(s, cr0);
        }
        cr0.PjT(f);
        if(s.equals("__container")) {
            Iterator iterator0 = this.Zh.iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
            }
        }
    }

    void PjT(boolean z) {
        this.PjT = z;
    }
}

