package com.beloo.widget.chipslayoutmanager.gravity;

import android.graphics.Rect;

class x implements o {
    @Override  // com.beloo.widget.chipslayoutmanager.gravity.o
    public Rect a(int v, int v1, Rect rect0) {
        Rect rect1 = new Rect(rect0);
        int v2 = rect1.left;
        if(v2 > v) {
            rect1.right -= v2 - v;
            rect1.left = v;
        }
        return rect1;
    }
}

