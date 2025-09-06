package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout.LayoutParams;
import androidx.annotation.GravityInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.styleable;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class LinearLayoutCompat extends ViewGroup {
    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(int v, int v1) {
            super(v, v1);
        }

        public LayoutParams(int v, int v1, float f) {
            super(v, v1, f);
        }

        public LayoutParams(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }

        public LayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
        }
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface OrientationMode {
    }

    private static final String A = "androidx.appcompat.widget.LinearLayoutCompat";
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private float g;
    private boolean h;
    private int[] i;
    private int[] j;
    private Drawable k;
    private int l;
    private int m;
    private int n;
    private int o;
    public static final int p = 0;
    public static final int q = 1;
    public static final int r = 0;
    public static final int s = 1;
    public static final int t = 2;
    public static final int u = 4;
    private static final int v = 4;
    private static final int w = 0;
    private static final int x = 1;
    private static final int y = 2;
    private static final int z = 3;

    public LinearLayoutCompat(@NonNull Context context0) {
        this(context0, null);
    }

    public LinearLayoutCompat(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public LinearLayoutCompat(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.e = 0x800033;
        TintTypedArray tintTypedArray0 = TintTypedArray.G(context0, attributeSet0, styleable.LinearLayoutCompat, v, 0);
        ViewCompat.H1(this, context0, styleable.LinearLayoutCompat, attributeSet0, tintTypedArray0.B(), v, 0);
        int v1 = tintTypedArray0.o(styleable.LinearLayoutCompat_android_orientation, -1);
        if(v1 >= 0) {
            this.setOrientation(v1);
        }
        int v2 = tintTypedArray0.o(styleable.LinearLayoutCompat_android_gravity, -1);
        if(v2 >= 0) {
            this.setGravity(v2);
        }
        if(!tintTypedArray0.a(styleable.LinearLayoutCompat_android_baselineAligned, true)) {
            this.setBaselineAligned(false);
        }
        this.g = tintTypedArray0.j(styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.b = tintTypedArray0.o(styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.h = tintTypedArray0.a(styleable.LinearLayoutCompat_measureWithLargestChild, false);
        this.setDividerDrawable(tintTypedArray0.h(styleable.LinearLayoutCompat_divider));
        this.n = tintTypedArray0.o(styleable.LinearLayoutCompat_showDividers, 0);
        this.o = tintTypedArray0.g(styleable.LinearLayoutCompat_dividerPadding, 0);
        tintTypedArray0.I();
    }

    void A(View view0, int v, int v1, int v2, int v3, int v4) {
        this.measureChildWithMargins(view0, v1, v2, v3, v4);
    }

    void B(int v, int v1) {
        int v32;
        int v31;
        int v29;
        int v37;
        int v36;
        float f5;
        int v24;
        int v22;
        int v21;
        int v19;
        boolean z6;
        View view1;
        boolean z5;
        boolean z4;
        int v12;
        int v13;
        this.f = 0;
        int v2 = this.getVirtualChildCount();
        int v3 = View.MeasureSpec.getMode(v);
        int v4 = View.MeasureSpec.getMode(v1);
        if(this.i == null || this.j == null) {
            this.i = new int[4];
            this.j = new int[4];
        }
        int[] arr_v = this.i;
        int[] arr_v1 = this.j;
        arr_v[3] = -1;
        arr_v[2] = -1;
        arr_v[1] = -1;
        arr_v[0] = -1;
        arr_v1[3] = -1;
        arr_v1[2] = -1;
        arr_v1[1] = -1;
        arr_v1[0] = -1;
        boolean z = this.a;
        boolean z1 = this.h;
        float f = 0.0f;
        int v5 = 0;
        int v6 = 0;
        int v7 = 0;
        int v8 = 0;
        int v9 = 0;
        boolean z2 = false;
        int v10 = 0;
        int v11 = 1;
        boolean z3 = false;
        while(v5 < v2) {
            View view0 = this.u(v5);
            if(view0 == null) {
                this.f = this.f;
            }
            else if(view0.getVisibility() != 8) {
                if(this.v(v5)) {
                    this.f += this.l;
                }
                LayoutParams linearLayoutCompat$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                float f1 = linearLayoutCompat$LayoutParams0.weight;
                float f2 = f + f1;
                if(v3 != 0x40000000 || linearLayoutCompat$LayoutParams0.width != 0 || f1 <= 0.0f) {
                    if(linearLayoutCompat$LayoutParams0.width != 0 || f1 <= 0.0f) {
                        v13 = 0x80000000;
                    }
                    else {
                        linearLayoutCompat$LayoutParams0.width = -2;
                        v13 = 0;
                    }
                    v12 = v5;
                    z4 = z1;
                    z5 = z;
                    this.A(view0, v12, v, (f2 == 0.0f ? this.f : 0), v1, 0);
                    if(v13 != 0x80000000) {
                        linearLayoutCompat$LayoutParams0.width = v13;
                    }
                    int v14 = view0.getMeasuredWidth();
                    if(v3 == 0x40000000) {
                        view1 = view0;
                        this.f += linearLayoutCompat$LayoutParams0.leftMargin + v14 + linearLayoutCompat$LayoutParams0.rightMargin;
                    }
                    else {
                        view1 = view0;
                        this.f = Math.max(this.f, this.f + v14 + linearLayoutCompat$LayoutParams0.leftMargin + linearLayoutCompat$LayoutParams0.rightMargin);
                    }
                    if(z4) {
                        v6 = Math.max(v14, v6);
                    }
                }
                else {
                    if(v3 == 0x40000000) {
                        this.f += linearLayoutCompat$LayoutParams0.leftMargin + linearLayoutCompat$LayoutParams0.rightMargin;
                    }
                    else {
                        this.f = Math.max(this.f, linearLayoutCompat$LayoutParams0.leftMargin + this.f + linearLayoutCompat$LayoutParams0.rightMargin);
                    }
                    if(z) {
                        view0.measure(0, 0);
                        v12 = v5;
                        z4 = z1;
                        z5 = true;
                        view1 = view0;
                    }
                    else {
                        v12 = v5;
                        z4 = z1;
                        z5 = false;
                        view1 = view0;
                        z2 = true;
                    }
                }
                if(v4 == 0x40000000 || linearLayoutCompat$LayoutParams0.height != -1) {
                    z6 = false;
                }
                else {
                    z6 = true;
                    z3 = true;
                }
                int v15 = linearLayoutCompat$LayoutParams0.topMargin + linearLayoutCompat$LayoutParams0.bottomMargin;
                int v16 = view1.getMeasuredHeight() + v15;
                v10 = View.combineMeasuredStates(v10, view1.getMeasuredState());
                if(z5) {
                    int v17 = view1.getBaseline();
                    if(v17 != -1) {
                        int v18 = (((linearLayoutCompat$LayoutParams0.gravity >= 0 ? linearLayoutCompat$LayoutParams0.gravity : this.e) & 0x70) >> 4 & -2) >> 1;
                        arr_v[v18] = Math.max(arr_v[v18], v17);
                        arr_v1[v18] = Math.max(arr_v1[v18], v16 - v17);
                    }
                }
                v7 = Math.max(v7, v16);
                v11 = v11 == 0 || linearLayoutCompat$LayoutParams0.height != -1 ? 0 : 1;
                if(linearLayoutCompat$LayoutParams0.weight > 0.0f) {
                    if(!z6) {
                        v15 = v16;
                    }
                    v9 = Math.max(v9, v15);
                }
                else {
                    if(!z6) {
                        v15 = v16;
                    }
                    v8 = Math.max(v8, v15);
                }
                v19 = v12;
                f = f2;
                goto label_108;
            }
            v19 = v5;
            z4 = z1;
            z5 = z;
        label_108:
            v5 = v19 + 1;
            z1 = z4;
            z = z5;
        }
        if(this.f > 0 && this.v(v2)) {
            this.f += this.l;
        }
        int v20 = arr_v[1];
        if(v20 != -1 || arr_v[0] != -1 || arr_v[2] != -1 || arr_v[3] != -1) {
            v22 = v10;
            v21 = Math.max(v7, Math.max(arr_v[3], Math.max(arr_v[0], Math.max(v20, arr_v[2]))) + Math.max(arr_v1[3], Math.max(arr_v1[0], Math.max(arr_v1[1], arr_v1[2]))));
        }
        else {
            v21 = v7;
            v22 = v10;
        }
        if(z1 && (v3 == 0x80000000 || v3 == 0)) {
            this.f = 0;
            int v23 = 0;
            while(v23 < v2) {
                View view2 = this.u(v23);
                if(view2 == null) {
                    this.f = this.f;
                }
                else if(view2.getVisibility() != 8) {
                    LayoutParams linearLayoutCompat$LayoutParams1 = (LayoutParams)view2.getLayoutParams();
                    if(v3 == 0x40000000) {
                        this.f += linearLayoutCompat$LayoutParams1.leftMargin + v6 + linearLayoutCompat$LayoutParams1.rightMargin;
                        v24 = v21;
                    }
                    else {
                        v24 = v21;
                        this.f = Math.max(this.f, this.f + v6 + linearLayoutCompat$LayoutParams1.leftMargin + linearLayoutCompat$LayoutParams1.rightMargin);
                    }
                    goto label_139;
                }
                v24 = v21;
            label_139:
                ++v23;
                v21 = v24;
            }
        }
        int v25 = v21;
        int v26 = this.f + (this.getPaddingLeft() + this.getPaddingRight());
        this.f = v26;
        int v27 = View.resolveSizeAndState(Math.max(v26, this.getSuggestedMinimumWidth()), v, 0);
        int v28 = (0xFFFFFF & v27) - this.f;
        if(z2 || v28 != 0 && f > 0.0f) {
            float f3 = this.g;
            if(f3 > 0.0f) {
                f = f3;
            }
            arr_v[3] = -1;
            arr_v[2] = -1;
            arr_v[1] = -1;
            arr_v[0] = -1;
            arr_v1[3] = -1;
            arr_v1[2] = -1;
            arr_v1[1] = -1;
            arr_v1[0] = -1;
            this.f = 0;
            int v33 = v8;
            v32 = v22;
            int v34 = -1;
            int v35 = 0;
            while(v35 < v2) {
                View view4 = this.u(v35);
                if(view4 != null && view4.getVisibility() != 8) {
                    LayoutParams linearLayoutCompat$LayoutParams2 = (LayoutParams)view4.getLayoutParams();
                    float f4 = linearLayoutCompat$LayoutParams2.weight;
                    if(f4 > 0.0f) {
                        int v38 = (int)(((float)v28) * f4 / f);
                        int v39 = v28 - v38;
                        v37 = v2;
                        int v40 = ViewGroup.getChildMeasureSpec(v1, this.getPaddingTop() + this.getPaddingBottom() + linearLayoutCompat$LayoutParams2.topMargin + linearLayoutCompat$LayoutParams2.bottomMargin, linearLayoutCompat$LayoutParams2.height);
                        if(linearLayoutCompat$LayoutParams2.width != 0 || v3 != 0x40000000) {
                            int v41 = view4.getMeasuredWidth() + v38;
                            if(v41 < 0) {
                                v41 = 0;
                            }
                            view4.measure(View.MeasureSpec.makeMeasureSpec(v41, 0x40000000), v40);
                        }
                        else {
                            if(v38 <= 0) {
                                v38 = 0;
                            }
                            view4.measure(View.MeasureSpec.makeMeasureSpec(v38, 0x40000000), v40);
                        }
                        v32 = View.combineMeasuredStates(v32, view4.getMeasuredState() & 0xFF000000);
                        f -= f4;
                        v36 = v39;
                    }
                    else {
                        v36 = v28;
                        v37 = v2;
                    }
                    if(v3 == 0x40000000) {
                        this.f += view4.getMeasuredWidth() + linearLayoutCompat$LayoutParams2.leftMargin + linearLayoutCompat$LayoutParams2.rightMargin;
                        f5 = f;
                    }
                    else {
                        int v42 = this.f;
                        f5 = f;
                        this.f = Math.max(v42, view4.getMeasuredWidth() + v42 + linearLayoutCompat$LayoutParams2.leftMargin + linearLayoutCompat$LayoutParams2.rightMargin);
                    }
                    boolean z7 = v4 != 0x40000000 && linearLayoutCompat$LayoutParams2.height == -1;
                    int v43 = linearLayoutCompat$LayoutParams2.topMargin + linearLayoutCompat$LayoutParams2.bottomMargin;
                    int v44 = view4.getMeasuredHeight() + v43;
                    v34 = Math.max(v34, v44);
                    if(!z7) {
                        v43 = v44;
                    }
                    int v45 = Math.max(v33, v43);
                    int v46 = v11 == 0 || linearLayoutCompat$LayoutParams2.height != -1 ? 0 : 1;
                    if(z) {
                        int v47 = view4.getBaseline();
                        if(v47 != -1) {
                            int v48 = (((linearLayoutCompat$LayoutParams2.gravity >= 0 ? linearLayoutCompat$LayoutParams2.gravity : this.e) & 0x70) >> 4 & -2) >> 1;
                            arr_v[v48] = Math.max(arr_v[v48], v47);
                            arr_v1[v48] = Math.max(arr_v1[v48], v44 - v47);
                        }
                    }
                    v11 = v46;
                    v33 = v45;
                    f = f5;
                }
                else {
                    v36 = v28;
                    v37 = v2;
                }
                ++v35;
                v28 = v36;
                v2 = v37;
            }
            v31 = v2;
            this.f += this.getPaddingLeft() + this.getPaddingRight();
            int v49 = arr_v[1];
            v25 = v49 != -1 || arr_v[0] != -1 || arr_v[2] != -1 || arr_v[3] != -1 ? Math.max(v34, Math.max(arr_v[3], Math.max(arr_v[0], Math.max(v49, arr_v[2]))) + Math.max(arr_v1[3], Math.max(arr_v1[0], Math.max(arr_v1[1], arr_v1[2])))) : v34;
            v29 = v33;
        }
        else {
            v29 = Math.max(v8, v9);
            if(z1 && v3 != 0x40000000) {
                for(int v30 = 0; v30 < v2; ++v30) {
                    View view3 = this.u(v30);
                    if(view3 != null && view3.getVisibility() != 8 && ((LayoutParams)view3.getLayoutParams()).weight > 0.0f) {
                        view3.measure(View.MeasureSpec.makeMeasureSpec(v6, 0x40000000), View.MeasureSpec.makeMeasureSpec(view3.getMeasuredHeight(), 0x40000000));
                    }
                }
            }
            v31 = v2;
            v32 = v22;
        }
        if(v11 != 0 || v4 == 0x40000000) {
            v29 = v25;
        }
        this.setMeasuredDimension(v27 | 0xFF000000 & v32, View.resolveSizeAndState(Math.max(v29 + (this.getPaddingTop() + this.getPaddingBottom()), this.getSuggestedMinimumHeight()), v1, v32 << 16));
        if(z3) {
            this.m(v31, v);
        }
    }

    int C(int v) [...] // Inlined contents

    void D(int v, int v1) {
        int v34;
        int v32;
        int v44;
        int v38;
        int v27;
        boolean z3;
        int v19;
        int v18;
        int v17;
        int v16;
        int v15;
        View view1;
        int v14;
        int v20;
        int v13;
        this.f = 0;
        int v2 = this.getVirtualChildCount();
        int v3 = View.MeasureSpec.getMode(v);
        int v4 = View.MeasureSpec.getMode(v1);
        int v5 = this.b;
        boolean z = this.h;
        float f = 0.0f;
        int v6 = 0;
        int v7 = 0;
        int v8 = 0;
        int v9 = 0;
        int v10 = 0;
        int v11 = 0;
        boolean z1 = false;
        int v12 = 1;
        boolean z2 = false;
        while(v11 < v2) {
            View view0 = this.u(v11);
            if(view0 == null) {
                this.f = this.f;
                v13 = v2;
            }
            else if(view0.getVisibility() == 8) {
                v13 = v2;
            }
            else {
                if(this.v(v11)) {
                    this.f += this.m;
                }
                LayoutParams linearLayoutCompat$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                float f1 = linearLayoutCompat$LayoutParams0.weight;
                float f2 = f + f1;
                if(v4 != 0x40000000 || linearLayoutCompat$LayoutParams0.height != 0 || f1 <= 0.0f) {
                    if(linearLayoutCompat$LayoutParams0.height != 0 || f1 <= 0.0f) {
                        v20 = 0x80000000;
                    }
                    else {
                        linearLayoutCompat$LayoutParams0.height = -2;
                        v20 = 0;
                    }
                    v16 = v6;
                    v17 = v7;
                    v18 = v9;
                    v13 = v2;
                    v15 = v10;
                    v19 = v11;
                    this.A(view0, v11, v, 0, v1, (f2 == 0.0f ? this.f : 0));
                    if(v20 != 0x80000000) {
                        linearLayoutCompat$LayoutParams0.height = v20;
                    }
                    int v21 = view0.getMeasuredHeight();
                    view1 = view0;
                    this.f = Math.max(this.f, this.f + v21 + linearLayoutCompat$LayoutParams0.topMargin + linearLayoutCompat$LayoutParams0.bottomMargin);
                    v14 = z ? Math.max(v21, v8) : v8;
                }
                else {
                    this.f = Math.max(this.f, linearLayoutCompat$LayoutParams0.topMargin + this.f + linearLayoutCompat$LayoutParams0.bottomMargin);
                    v14 = v8;
                    view1 = view0;
                    v15 = v10;
                    v16 = v6;
                    v17 = v7;
                    z1 = true;
                    v18 = v9;
                    v13 = v2;
                    v19 = v11;
                }
                if(v5 >= 0 && v5 == v19 + 1) {
                    this.c = this.f;
                }
                if(v19 < v5 && linearLayoutCompat$LayoutParams0.weight > 0.0f) {
                    throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won\'t work.  Either remove the weight, or don\'t set mBaselineAlignedChildIndex.");
                }
                if(v3 == 0x40000000 || linearLayoutCompat$LayoutParams0.width != -1) {
                    z3 = false;
                }
                else {
                    z3 = true;
                    z2 = true;
                }
                int v22 = linearLayoutCompat$LayoutParams0.leftMargin + linearLayoutCompat$LayoutParams0.rightMargin;
                int v23 = view1.getMeasuredWidth() + v22;
                int v24 = Math.max(v17, v23);
                int v25 = View.combineMeasuredStates(v16, view1.getMeasuredState());
                v12 = v12 == 0 || linearLayoutCompat$LayoutParams0.width != -1 ? 0 : 1;
                if(linearLayoutCompat$LayoutParams0.weight > 0.0f) {
                    if(!z3) {
                        v22 = v23;
                    }
                    v9 = Math.max(v18, v22);
                }
                else {
                    if(!z3) {
                        v22 = v23;
                    }
                    v15 = Math.max(v15, v22);
                    v9 = v18;
                }
                v8 = v14;
                v7 = v24;
                f = f2;
                v10 = v15;
                v11 = v19;
                v6 = v25;
            }
            ++v11;
            v2 = v13;
        }
        int v26 = v7;
        if(this.f > 0) {
            v27 = v2;
            if(this.v(v27)) {
                this.f += this.m;
            }
        }
        else {
            v27 = v2;
        }
        if(z && (v4 == 0x80000000 || v4 == 0)) {
            this.f = 0;
            for(int v28 = 0; v28 < v27; ++v28) {
                View view2 = this.u(v28);
                if(view2 == null) {
                    this.f = this.f;
                }
                else if(view2.getVisibility() != 8) {
                    LayoutParams linearLayoutCompat$LayoutParams1 = (LayoutParams)view2.getLayoutParams();
                    this.f = Math.max(this.f, this.f + v8 + linearLayoutCompat$LayoutParams1.topMargin + linearLayoutCompat$LayoutParams1.bottomMargin);
                }
            }
        }
        int v29 = this.f + (this.getPaddingTop() + this.getPaddingBottom());
        this.f = v29;
        int v30 = View.resolveSizeAndState(Math.max(v29, this.getSuggestedMinimumHeight()), v1, 0);
        int v31 = (0xFFFFFF & v30) - this.f;
        if(z1 || v31 != 0 && f > 0.0f) {
            float f3 = this.g;
            if(f3 > 0.0f) {
                f = f3;
            }
            this.f = 0;
            int v35 = v31;
            int v36 = v10;
            v34 = v6;
            int v37 = 0;
            while(v37 < v27) {
                View view4 = this.u(v37);
                if(view4.getVisibility() == 8) {
                    v38 = v35;
                }
                else {
                    LayoutParams linearLayoutCompat$LayoutParams2 = (LayoutParams)view4.getLayoutParams();
                    float f4 = linearLayoutCompat$LayoutParams2.weight;
                    if(f4 > 0.0f) {
                        int v39 = (int)(((float)v35) * f4 / f);
                        v38 = v35 - v39;
                        int v40 = ViewGroup.getChildMeasureSpec(v, this.getPaddingLeft() + this.getPaddingRight() + linearLayoutCompat$LayoutParams2.leftMargin + linearLayoutCompat$LayoutParams2.rightMargin, linearLayoutCompat$LayoutParams2.width);
                        if(linearLayoutCompat$LayoutParams2.height != 0 || v4 != 0x40000000) {
                            int v41 = view4.getMeasuredHeight() + v39;
                            if(v41 < 0) {
                                v41 = 0;
                            }
                            view4.measure(v40, View.MeasureSpec.makeMeasureSpec(v41, 0x40000000));
                        }
                        else {
                            if(v39 <= 0) {
                                v39 = 0;
                            }
                            view4.measure(v40, View.MeasureSpec.makeMeasureSpec(v39, 0x40000000));
                        }
                        v34 = View.combineMeasuredStates(v34, view4.getMeasuredState() & 0xFFFFFF00);
                        f -= f4;
                    }
                    else {
                        v38 = v35;
                    }
                    int v42 = linearLayoutCompat$LayoutParams2.leftMargin + linearLayoutCompat$LayoutParams2.rightMargin;
                    int v43 = view4.getMeasuredWidth() + v42;
                    v26 = Math.max(v26, v43);
                    if(v3 == 0x40000000) {
                        v44 = v34;
                    }
                    else {
                        v44 = v34;
                        if(linearLayoutCompat$LayoutParams2.width == -1) {
                            goto label_169;
                        }
                    }
                    v42 = v43;
                label_169:
                    int v45 = v12 == 0 || linearLayoutCompat$LayoutParams2.width != -1 ? 0 : 1;
                    int v46 = this.f;
                    this.f = Math.max(v46, view4.getMeasuredHeight() + v46 + linearLayoutCompat$LayoutParams2.topMargin + linearLayoutCompat$LayoutParams2.bottomMargin);
                    v12 = v45;
                    v34 = v44;
                    v36 = Math.max(v36, v42);
                }
                ++v37;
                v35 = v38;
            }
            this.f += this.getPaddingTop() + this.getPaddingBottom();
            v32 = v36;
        }
        else {
            v32 = Math.max(v10, v9);
            if(z && v4 != 0x40000000) {
                for(int v33 = 0; v33 < v27; ++v33) {
                    View view3 = this.u(v33);
                    if(view3 != null && view3.getVisibility() != 8 && ((LayoutParams)view3.getLayoutParams()).weight > 0.0f) {
                        view3.measure(View.MeasureSpec.makeMeasureSpec(view3.getMeasuredWidth(), 0x40000000), View.MeasureSpec.makeMeasureSpec(v8, 0x40000000));
                    }
                }
            }
            v34 = v6;
        }
        if(v12 != 0 || v3 == 0x40000000) {
            v32 = v26;
        }
        this.setMeasuredDimension(View.resolveSizeAndState(Math.max(v32 + (this.getPaddingLeft() + this.getPaddingRight()), this.getSuggestedMinimumWidth()), v, v34), v30);
        if(z2) {
            this.n(v27, v1);
        }
    }

    private void E(View view0, int v, int v1, int v2, int v3) {
        view0.layout(v, v1, v2 + v, v3 + v1);
    }

    @Override  // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof LayoutParams;
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.o();
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.p(attributeSet0);
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return this.q(viewGroup$LayoutParams0);
    }

    @Override  // android.view.View
    public int getBaseline() {
        if(this.b < 0) {
            return super.getBaseline();
        }
        int v = this.getChildCount();
        int v1 = this.b;
        if(v <= v1) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View view0 = this.getChildAt(v1);
        int v2 = view0.getBaseline();
        if(v2 == -1) {
            if(this.b != 0) {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn\'t know how to get its baseline.");
            }
            return -1;
        }
        int v3 = this.c;
        if(this.d == 1) {
            switch(this.e & 0x70) {
                case 16: {
                    v3 += (this.getBottom() - this.getTop() - this.getPaddingTop() - this.getPaddingBottom() - this.f) / 2;
                    break;
                }
                case 80: {
                    return this.getBottom() - this.getTop() - this.getPaddingBottom() - this.f + ((LayoutParams)view0.getLayoutParams()).topMargin + v2;
                }
                default: {
                    return v3 + ((LayoutParams)view0.getLayoutParams()).topMargin + v2;
                }
            }
        }
        return v3 + ((LayoutParams)view0.getLayoutParams()).topMargin + v2;
    }

    public int getBaselineAlignedChildIndex() {
        return this.b;
    }

    public Drawable getDividerDrawable() {
        return this.k;
    }

    public int getDividerPadding() {
        return this.o;
    }

    @RestrictTo({Scope.c})
    public int getDividerWidth() {
        return this.l;
    }

    @GravityInt
    public int getGravity() {
        return this.e;
    }

    public int getOrientation() {
        return this.d;
    }

    public int getShowDividers() {
        return this.n;
    }

    int getVirtualChildCount() {
        return this.getChildCount();
    }

    public float getWeightSum() {
        return this.g;
    }

    void i(Canvas canvas0) {
        int v2;
        int v = this.getVirtualChildCount();
        boolean z = ViewUtils.b(this);
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.u(v1);
            if(view0 != null && view0.getVisibility() != 8 && this.v(v1)) {
                LayoutParams linearLayoutCompat$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                this.l(canvas0, (z ? view0.getRight() + linearLayoutCompat$LayoutParams0.rightMargin : view0.getLeft() - linearLayoutCompat$LayoutParams0.leftMargin - this.l));
            }
        }
        if(this.v(v)) {
            View view1 = this.u(v - 1);
            if(view1 != null) {
                LayoutParams linearLayoutCompat$LayoutParams1 = (LayoutParams)view1.getLayoutParams();
                v2 = z ? view1.getLeft() - linearLayoutCompat$LayoutParams1.leftMargin - this.l : view1.getRight() + linearLayoutCompat$LayoutParams1.rightMargin;
            }
            else if(z) {
                v2 = this.getPaddingLeft();
            }
            else {
                v2 = this.getWidth() - this.getPaddingRight() - this.l;
            }
            this.l(canvas0, v2);
        }
    }

    void j(Canvas canvas0) {
        int v2;
        int v = this.getVirtualChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.u(v1);
            if(view0 != null && view0.getVisibility() != 8 && this.v(v1)) {
                LayoutParams linearLayoutCompat$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                this.k(canvas0, view0.getTop() - linearLayoutCompat$LayoutParams0.topMargin - this.m);
            }
        }
        if(this.v(v)) {
            View view1 = this.u(v - 1);
            if(view1 == null) {
                v2 = this.getHeight() - this.getPaddingBottom() - this.m;
            }
            else {
                LayoutParams linearLayoutCompat$LayoutParams1 = (LayoutParams)view1.getLayoutParams();
                v2 = view1.getBottom() + linearLayoutCompat$LayoutParams1.bottomMargin;
            }
            this.k(canvas0, v2);
        }
    }

    void k(Canvas canvas0, int v) {
        this.k.setBounds(this.getPaddingLeft() + this.o, v, this.getWidth() - this.getPaddingRight() - this.o, this.m + v);
        this.k.draw(canvas0);
    }

    void l(Canvas canvas0, int v) {
        this.k.setBounds(v, this.getPaddingTop() + this.o, this.l + v, this.getHeight() - this.getPaddingBottom() - this.o);
        this.k.draw(canvas0);
    }

    private void m(int v, int v1) {
        int v2 = View.MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0x40000000);
        for(int v3 = 0; v3 < v; ++v3) {
            View view0 = this.u(v3);
            if(view0.getVisibility() != 8) {
                LayoutParams linearLayoutCompat$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                if(linearLayoutCompat$LayoutParams0.height == -1) {
                    int v4 = linearLayoutCompat$LayoutParams0.width;
                    linearLayoutCompat$LayoutParams0.width = view0.getMeasuredWidth();
                    this.measureChildWithMargins(view0, v1, 0, v2, 0);
                    linearLayoutCompat$LayoutParams0.width = v4;
                }
            }
        }
    }

    private void n(int v, int v1) {
        int v2 = View.MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0x40000000);
        for(int v3 = 0; v3 < v; ++v3) {
            View view0 = this.u(v3);
            if(view0.getVisibility() != 8) {
                LayoutParams linearLayoutCompat$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                if(linearLayoutCompat$LayoutParams0.width == -1) {
                    int v4 = linearLayoutCompat$LayoutParams0.height;
                    linearLayoutCompat$LayoutParams0.height = view0.getMeasuredHeight();
                    this.measureChildWithMargins(view0, v2, 0, v1, 0);
                    linearLayoutCompat$LayoutParams0.height = v4;
                }
            }
        }
    }

    protected LayoutParams o() {
        int v = this.d;
        if(v == 0) {
            return new LayoutParams(-2, -2);
        }
        return v == 1 ? new LayoutParams(-1, -2) : null;
    }

    @Override  // android.view.View
    protected void onDraw(@NonNull Canvas canvas0) {
        if(this.k == null) {
            return;
        }
        if(this.d == 1) {
            this.j(canvas0);
            return;
        }
        this.i(canvas0);
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(accessibilityEvent0);
        accessibilityEvent0.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        if(this.d == 1) {
            this.z(v, v1, v2, v3);
            return;
        }
        this.y(v, v1, v2, v3);
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        if(this.d == 1) {
            this.D(v, v1);
            return;
        }
        this.B(v, v1);
    }

    public LayoutParams p(AttributeSet attributeSet0) {
        return new LayoutParams(this.getContext(), attributeSet0);
    }

    protected LayoutParams q(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(viewGroup$LayoutParams0 instanceof LayoutParams) {
            return new LayoutParams(((LayoutParams)viewGroup$LayoutParams0));
        }
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new LayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new LayoutParams(viewGroup$LayoutParams0);
    }

    int r(View view0, int v) [...] // Inlined contents

    int s(View view0) [...] // Inlined contents

    public void setBaselineAligned(boolean z) {
        this.a = z;
    }

    public void setBaselineAlignedChildIndex(int v) {
        if(v < 0 || v >= this.getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + this.getChildCount() + ")");
        }
        this.b = v;
    }

    public void setDividerDrawable(Drawable drawable0) {
        if(drawable0 == this.k) {
            return;
        }
        this.k = drawable0;
        boolean z = false;
        if(drawable0 == null) {
            this.l = 0;
            this.m = 0;
        }
        else {
            this.l = drawable0.getIntrinsicWidth();
            this.m = drawable0.getIntrinsicHeight();
        }
        if(drawable0 == null) {
            z = true;
        }
        this.setWillNotDraw(z);
        this.requestLayout();
    }

    public void setDividerPadding(int v) {
        this.o = v;
    }

    public void setGravity(@GravityInt int v) {
        if(this.e != v) {
            if((0x800007 & v) == 0) {
                v |= 0x800003;
            }
            if((v & 0x70) == 0) {
                v |= 0x30;
            }
            this.e = v;
            this.requestLayout();
        }
    }

    public void setHorizontalGravity(int v) {
        int v1 = this.e;
        if((0x800007 & v1) != (v & 0x800007)) {
            this.e = v & 0x800007 | 0xFF7FFFF8 & v1;
            this.requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.h = z;
    }

    public void setOrientation(int v) {
        if(this.d != v) {
            this.d = v;
            this.requestLayout();
        }
    }

    public void setShowDividers(int v) {
        if(v != this.n) {
            this.requestLayout();
        }
        this.n = v;
    }

    public void setVerticalGravity(int v) {
        int v1 = this.e;
        if((v1 & 0x70) != (v & 0x70)) {
            this.e = v & 0x70 | v1 & 0xFFFFFF8F;
            this.requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.g = Math.max(0.0f, f);
    }

    @Override  // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    int t(View view0) [...] // Inlined contents

    View u(int v) {
        return this.getChildAt(v);
    }

    @RestrictTo({Scope.a})
    protected boolean v(int v) {
        if(v == 0) {
            return (this.n & 1) != 0;
        }
        if(v == this.getChildCount()) {
            return (this.n & 4) != 0;
        }
        if((this.n & 2) != 0) {
            for(int v1 = v - 1; v1 >= 0; --v1) {
                if(this.getChildAt(v1).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean w() {
        return this.a;
    }

    public boolean x() {
        return this.h;
    }

    void y(int v, int v1, int v2, int v3) {
        int v18;
        int v12;
        int v11;
        int v10;
        boolean z = ViewUtils.b(this);
        int v4 = this.getPaddingTop();
        int v5 = v3 - v1;
        int v6 = this.getPaddingBottom();
        int v7 = this.getPaddingBottom();
        int v8 = this.getVirtualChildCount();
        int v9 = this.e & 0x70;
        boolean z1 = this.a;
        int[] arr_v = this.i;
        int[] arr_v1 = this.j;
        switch(GravityCompat.d(0x800007 & this.e, this.getLayoutDirection())) {
            case 1: {
                v10 = this.getPaddingLeft() + (v2 - v - this.f) / 2;
                break;
            }
            case 5: {
                v10 = this.getPaddingLeft() + v2 - v - this.f;
                break;
            }
            default: {
                v10 = this.getPaddingLeft();
            }
        }
        if(z) {
            v11 = v8 - 1;
            v12 = -1;
        }
        else {
            v11 = 0;
            v12 = 1;
        }
        for(int v13 = 0; v13 < v8; ++v13) {
            int v14 = v11 + v12 * v13;
            View view0 = this.u(v14);
            if(view0 != null && view0.getVisibility() != 8) {
                int v15 = view0.getMeasuredWidth();
                int v16 = view0.getMeasuredHeight();
                LayoutParams linearLayoutCompat$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                int v17 = !z1 || linearLayoutCompat$LayoutParams0.height == -1 ? -1 : view0.getBaseline();
                switch((linearLayoutCompat$LayoutParams0.gravity >= 0 ? linearLayoutCompat$LayoutParams0.gravity : v9) & 0x70) {
                    case 16: {
                        v18 = (v5 - v4 - v7 - v16) / 2 + v4 + linearLayoutCompat$LayoutParams0.topMargin - linearLayoutCompat$LayoutParams0.bottomMargin;
                        break;
                    }
                    case 0x30: {
                        v18 = linearLayoutCompat$LayoutParams0.topMargin + v4;
                        if(v17 != -1) {
                            v18 += arr_v[1] - v17;
                        }
                        break;
                    }
                    case 80: {
                        v18 = v5 - v6 - v16 - linearLayoutCompat$LayoutParams0.bottomMargin;
                        if(v17 != -1) {
                            int v19 = view0.getMeasuredHeight();
                            v18 -= arr_v1[2] - (v19 - v17);
                        }
                        break;
                    }
                    default: {
                        v18 = v4;
                    }
                }
                if(this.v(v14)) {
                    v10 += this.l;
                }
                int v20 = linearLayoutCompat$LayoutParams0.leftMargin + v10;
                this.E(view0, v20, v18, v15, v16);
                v10 = v20 + (v15 + linearLayoutCompat$LayoutParams0.rightMargin);
            }
        }
    }

    void z(int v, int v1, int v2, int v3) {
        int v14;
        int v10;
        int v4 = this.getPaddingLeft();
        int v5 = v2 - v;
        int v6 = this.getPaddingRight();
        int v7 = this.getPaddingRight();
        int v8 = this.getVirtualChildCount();
        int v9 = this.e & 0x800007;
        switch(this.e & 0x70) {
            case 16: {
                v10 = this.getPaddingTop() + (v3 - v1 - this.f) / 2;
                break;
            }
            case 80: {
                v10 = this.getPaddingTop() + v3 - v1 - this.f;
                break;
            }
            default: {
                v10 = this.getPaddingTop();
            }
        }
        for(int v11 = 0; v11 < v8; ++v11) {
            View view0 = this.u(v11);
            if(view0 != null && view0.getVisibility() != 8) {
                int v12 = view0.getMeasuredWidth();
                int v13 = view0.getMeasuredHeight();
                LayoutParams linearLayoutCompat$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                switch(GravityCompat.d((linearLayoutCompat$LayoutParams0.gravity >= 0 ? linearLayoutCompat$LayoutParams0.gravity : v9), this.getLayoutDirection()) & 7) {
                    case 1: {
                        v14 = (v5 - v4 - v7 - v12) / 2 + v4 + linearLayoutCompat$LayoutParams0.leftMargin - linearLayoutCompat$LayoutParams0.rightMargin;
                        break;
                    }
                    case 5: {
                        v14 = v5 - v6 - v12 - linearLayoutCompat$LayoutParams0.rightMargin;
                        break;
                    }
                    default: {
                        v14 = linearLayoutCompat$LayoutParams0.leftMargin + v4;
                    }
                }
                if(this.v(v11)) {
                    v10 += this.m;
                }
                int v15 = v10 + linearLayoutCompat$LayoutParams0.topMargin;
                this.E(view0, v14, v15, v12, v13);
                v10 = v15 + (v13 + linearLayoutCompat$LayoutParams0.bottomMargin);
            }
        }
    }
}

