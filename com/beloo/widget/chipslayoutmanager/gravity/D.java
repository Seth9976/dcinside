package com.beloo.widget.chipslayoutmanager.gravity;

import android.graphics.Rect;

class d implements o {
    @Override  // com.beloo.widget.chipslayoutmanager.gravity.o
    public Rect a(int v, int v1, Rect rect0) {
        if(rect0.top < v) {
            throw new IllegalArgumentException("top point of input rect can\'t be lower than minTop");
        }
        if(rect0.bottom > v1) {
            throw new IllegalArgumentException("bottom point of input rect can\'t be bigger than maxTop");
        }
        Rect rect1 = new Rect(rect0);
        int v2 = (v1 - v - (rect1.bottom - rect1.top)) / 2;
        rect1.top = v + v2;
        rect1.bottom = v1 - v2;
        return rect1;
    }
}

