package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View.MeasureSpec;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.Placeholder;
import androidx.constraintlayout.widget.VirtualLayout;

public class MotionPlaceholder extends VirtualLayout {
    Placeholder m;
    private static final String n = "MotionPlaceholder";

    public MotionPlaceholder(Context context0) {
        super(context0);
    }

    public MotionPlaceholder(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public MotionPlaceholder(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    public MotionPlaceholder(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v);
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    public void I(ConstraintWidgetContainer constraintWidgetContainer0, Helper helper0, SparseArray sparseArray0) {
    }

    @Override  // androidx.constraintlayout.widget.VirtualLayout
    public void L(androidx.constraintlayout.core.widgets.VirtualLayout virtualLayout0, int v, int v1) {
        int v2 = View.MeasureSpec.getMode(v);
        int v3 = View.MeasureSpec.getSize(v);
        int v4 = View.MeasureSpec.getMode(v1);
        int v5 = View.MeasureSpec.getSize(v1);
        if(virtualLayout0 != null) {
            virtualLayout0.w2(v2, v3, v4, v5);
            this.setMeasuredDimension(virtualLayout0.r2(), virtualLayout0.q2());
            return;
        }
        this.setMeasuredDimension(0, 0);
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    @SuppressLint({"WrongCall"})
    protected void onMeasure(int v, int v1) {
        this.L(this.m, v, v1);
    }

    @Override  // androidx.constraintlayout.widget.VirtualLayout
    protected void z(AttributeSet attributeSet0) {
        super.z(attributeSet0);
        this.d = new Placeholder();
        this.K();
    }
}

