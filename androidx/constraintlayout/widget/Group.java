package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;

public class Group extends ConstraintHelper {
    public Group(Context context0) {
        super(context0);
    }

    public Group(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public Group(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    public void F(ConstraintLayout constraintLayout0) {
        LayoutParams constraintLayout$LayoutParams0 = (LayoutParams)this.getLayoutParams();
        constraintLayout$LayoutParams0.v0.d2(0);
        constraintLayout$LayoutParams0.v0.z1(0);
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q();
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    protected void s(ConstraintLayout constraintLayout0) {
        this.r(constraintLayout0);
    }

    @Override  // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        this.q();
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
        super.setVisibility(v);
        this.q();
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    protected void z(AttributeSet attributeSet0) {
        super.z(attributeSet0);
        this.e = false;
    }
}

