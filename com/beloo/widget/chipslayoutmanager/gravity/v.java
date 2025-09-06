package com.beloo.widget.chipslayoutmanager.gravity;

import android.graphics.Rect;
import com.beloo.widget.chipslayoutmanager.layouter.a;
import com.beloo.widget.chipslayoutmanager.layouter.o;
import java.util.List;

class v implements q {
    @Override  // com.beloo.widget.chipslayoutmanager.gravity.q
    public void a(a a0, List list0) {
        int v = m.a(a0) / a0.f();
        int v1 = v;
        for(Object object0: list0) {
            Rect rect0 = ((o)object0).b();
            if(rect0.left == a0.d()) {
                int v2 = rect0.left;
                int v3 = a0.d();
                rect0.left = a0.d();
                rect0.right = rect0.right - (v2 - v3) + v1;
            }
            else {
                rect0.left += v1;
                v1 += v;
                rect0.right += v1;
            }
        }
    }
}

