package com.beloo.widget.chipslayoutmanager.gravity;

import android.graphics.Rect;
import com.beloo.widget.chipslayoutmanager.layouter.a;
import com.beloo.widget.chipslayoutmanager.layouter.o;
import java.util.List;

class g implements q {
    @Override  // com.beloo.widget.chipslayoutmanager.gravity.q
    public void a(a a0, List list0) {
        if(a0.f() == 1) {
            return;
        }
        int v = m.b(a0);
        int v1 = a0.f();
        int v2 = 0;
        for(Object object0: list0) {
            Rect rect0 = ((o)object0).b();
            if(rect0.top == a0.m()) {
                int v3 = rect0.top;
                int v4 = a0.m();
                rect0.top = a0.m();
                rect0.bottom -= v3 - v4;
            }
            else {
                v2 += v / (v1 - 1);
                rect0.top += v2;
                rect0.bottom += v2;
            }
        }
    }
}

