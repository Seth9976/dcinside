package com.beloo.widget.chipslayoutmanager.gravity;

import android.graphics.Rect;
import com.beloo.widget.chipslayoutmanager.layouter.a;
import com.beloo.widget.chipslayoutmanager.layouter.o;
import java.util.List;

class e implements q {
    @Override  // com.beloo.widget.chipslayoutmanager.gravity.q
    public void a(a a0, List list0) {
        int v = m.b(a0);
        for(Object object0: list0) {
            Rect rect0 = ((o)object0).b();
            rect0.top += v / 2;
            rect0.bottom += v / 2;
        }
    }
}

