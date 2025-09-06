package com.beloo.widget.chipslayoutmanager.gravity;

import android.graphics.Rect;

class c implements o {
    @Override  // com.beloo.widget.chipslayoutmanager.gravity.o
    public Rect a(int v, int v1, Rect rect0) {
        Rect rect1 = new Rect(rect0);
        int v2 = (v1 - v - (rect1.right - rect1.left)) / 2;
        rect1.left = v + v2;
        rect1.right = v1 - v2;
        return rect1;
    }
}

