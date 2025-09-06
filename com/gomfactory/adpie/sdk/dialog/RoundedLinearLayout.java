package com.gomfactory.adpie.sdk.dialog;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class RoundedLinearLayout extends LinearLayout {
    float mCornerRadius;
    Path mPath;

    public RoundedLinearLayout(Context context0) {
        super(context0);
        this.setLayerType(2, null);
    }

    public RoundedLinearLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.setLayerType(2, null);
    }

    @Override  // android.view.View
    public void draw(Canvas canvas0) {
        try {
            canvas0.save();
            canvas0.clipPath(this.mPath);
            super.draw(canvas0);
            canvas0.restore();
        }
        catch(UnsupportedOperationException unused_ex) {
        }
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        RectF rectF0 = new RectF(0.0f, 0.0f, ((float)v), ((float)v1));
        Path path0 = new Path();
        this.mPath = path0;
        path0.addRoundRect(rectF0, this.mCornerRadius, this.mCornerRadius, Path.Direction.CW);
        this.mPath.close();
    }

    public void setCornerRadius(int v) {
        this.mCornerRadius = (float)v;
        this.invalidate();
    }
}

