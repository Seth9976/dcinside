package com.dcinside.app.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class TouchPressConsumeView extends FrameLayout {
    @j
    public TouchPressConsumeView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 2, null);
    }

    @j
    public TouchPressConsumeView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        super(context0, attributeSet0);
    }

    public TouchPressConsumeView(Context context0, AttributeSet attributeSet0, int v, w w0) {
        if((v & 2) != 0) {
            attributeSet0 = null;
        }
        this(context0, attributeSet0);
    }

    @Override  // android.view.View
    public boolean dispatchGenericMotionEvent(@m MotionEvent motionEvent0) {
        return motionEvent0 != null && motionEvent0.getButtonState() == 1 ? true : super.dispatchGenericMotionEvent(motionEvent0);
    }
}

