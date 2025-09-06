package com.beloo.widget.chipslayoutmanager.gravity;

import android.graphics.Rect;
import com.beloo.widget.chipslayoutmanager.layouter.a;
import com.beloo.widget.chipslayoutmanager.layouter.o;
import java.util.List;

class h implements q {
    @Override  // com.beloo.widget.chipslayoutmanager.gravity.q
    public void a(a a0, List list0) {
        int v = m.b(a0) / a0.f();
        int v1 = v;
        for(Object object0: list0) {
            Rect rect0 = ((o)object0).b();
            if(rect0.top == a0.m()) {
                int v2 = rect0.top;
                int v3 = a0.m();
                rect0.top = a0.m();
                rect0.bottom = rect0.bottom - (v2 - v3) + v1;
            }
            else {
                rect0.top += v1;
                v1 += v;
                rect0.bottom += v1;
            }
        }
    }
}

