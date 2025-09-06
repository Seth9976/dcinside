package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;

public class Constraints extends ViewGroup {
    public static class LayoutParams extends androidx.constraintlayout.widget.ConstraintLayout.LayoutParams {
        public float V0;
        public boolean W0;
        public float X0;
        public float Y0;
        public float Z0;
        public float a1;
        public float b1;
        public float c1;
        public float d1;
        public float e1;
        public float f1;
        public float g1;
        public float h1;

        public LayoutParams(int v, int v1) {
            super(v, v1);
            this.V0 = 1.0f;
            this.W0 = false;
            this.X0 = 0.0f;
            this.Y0 = 0.0f;
            this.Z0 = 0.0f;
            this.a1 = 0.0f;
            this.b1 = 1.0f;
            this.c1 = 1.0f;
            this.d1 = 0.0f;
            this.e1 = 0.0f;
            this.f1 = 0.0f;
            this.g1 = 0.0f;
            this.h1 = 0.0f;
        }

        public LayoutParams(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.V0 = 1.0f;
            this.W0 = false;
            this.X0 = 0.0f;
            this.Y0 = 0.0f;
            this.Z0 = 0.0f;
            this.a1 = 0.0f;
            this.b1 = 1.0f;
            this.c1 = 1.0f;
            this.d1 = 0.0f;
            this.e1 = 0.0f;
            this.f1 = 0.0f;
            this.g1 = 0.0f;
            this.h1 = 0.0f;
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ConstraintSet);
            int v1 = typedArray0.getIndexCount();
            for(int v = 0; v < v1; ++v) {
                int v2 = typedArray0.getIndex(v);
                if(v2 == styleable.ConstraintSet_android_alpha) {
                    this.V0 = typedArray0.getFloat(v2, this.V0);
                }
                else if(v2 == styleable.ConstraintSet_android_elevation) {
                    this.X0 = typedArray0.getFloat(v2, this.X0);
                    this.W0 = true;
                }
                else if(v2 == styleable.ConstraintSet_android_rotationX) {
                    this.Z0 = typedArray0.getFloat(v2, this.Z0);
                }
                else if(v2 == styleable.ConstraintSet_android_rotationY) {
                    this.a1 = typedArray0.getFloat(v2, this.a1);
                }
                else if(v2 == styleable.ConstraintSet_android_rotation) {
                    this.Y0 = typedArray0.getFloat(v2, this.Y0);
                }
                else if(v2 == styleable.ConstraintSet_android_scaleX) {
                    this.b1 = typedArray0.getFloat(v2, this.b1);
                }
                else if(v2 == styleable.ConstraintSet_android_scaleY) {
                    this.c1 = typedArray0.getFloat(v2, this.c1);
                }
                else if(v2 == styleable.ConstraintSet_android_transformPivotX) {
                    this.d1 = typedArray0.getFloat(v2, this.d1);
                }
                else if(v2 == styleable.ConstraintSet_android_transformPivotY) {
                    this.e1 = typedArray0.getFloat(v2, this.e1);
                }
                else if(v2 == styleable.ConstraintSet_android_translationX) {
                    this.f1 = typedArray0.getFloat(v2, this.f1);
                }
                else if(v2 == styleable.ConstraintSet_android_translationY) {
                    this.g1 = typedArray0.getFloat(v2, this.g1);
                }
                else if(v2 == styleable.ConstraintSet_android_translationZ) {
                    this.h1 = typedArray0.getFloat(v2, this.h1);
                }
            }
            typedArray0.recycle();
        }

        public LayoutParams(LayoutParams constraints$LayoutParams0) {
            super(constraints$LayoutParams0);
            this.V0 = 1.0f;
            this.W0 = false;
            this.X0 = 0.0f;
            this.Y0 = 0.0f;
            this.Z0 = 0.0f;
            this.a1 = 0.0f;
            this.b1 = 1.0f;
            this.c1 = 1.0f;
            this.d1 = 0.0f;
            this.e1 = 0.0f;
            this.f1 = 0.0f;
            this.g1 = 0.0f;
            this.h1 = 0.0f;
        }
    }

    ConstraintSet a;
    public static final String b = "Constraints";

    public Constraints(Context context0) {
        super(context0);
        super.setVisibility(8);
    }

    public Constraints(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.c();
        super.setVisibility(8);
    }

    public Constraints(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.c();
        super.setVisibility(8);
    }

    protected LayoutParams a() {
        return new LayoutParams(-2, -2);
    }

    public LayoutParams b(AttributeSet attributeSet0) {
        return new LayoutParams(this.getContext(), attributeSet0);
    }

    private void c() {
        Log.v("Constraints", " ################# init");
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.a();
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.b(attributeSet0);
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(viewGroup$LayoutParams0);
    }

    public ConstraintSet getConstraintSet() {
        if(this.a == null) {
            this.a = new ConstraintSet();
        }
        this.a.J(this);
        return this.a;
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
    }
}

