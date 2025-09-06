package com.google.android.material.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments;
import com.google.android.material.R.attr;
import com.google.android.material.R.string;
import com.google.android.material.R.style;

public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {
    class a extends g {
        final BottomSheetDragHandleView a;

        @Override  // com.google.android.material.bottomsheet.BottomSheetBehavior$g
        public void b(@NonNull View view0, float f) {
        }

        @Override  // com.google.android.material.bottomsheet.BottomSheetBehavior$g
        public void c(@NonNull View view0, int v) {
            BottomSheetDragHandleView.this.k(v);
        }
    }

    @Nullable
    private final AccessibilityManager a;
    @Nullable
    private BottomSheetBehavior b;
    private boolean c;
    private boolean d;
    private boolean e;
    private final String f;
    private final String g;
    private final String h;
    private final g i;
    private static final int j;

    static {
        BottomSheetDragHandleView.j = style.Widget_Material3_BottomSheet_DragHandle;
    }

    public BottomSheetDragHandleView(@NonNull Context context0) {
        this(context0, null);
    }

    public BottomSheetDragHandleView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.bottomSheetDragHandleStyle);
    }

    public BottomSheetDragHandleView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        class b extends AccessibilityDelegateCompat {
            final BottomSheetDragHandleView d;

            @Override  // androidx.core.view.AccessibilityDelegateCompat
            public void h(View view0, @NonNull AccessibilityEvent accessibilityEvent0) {
                super.h(view0, accessibilityEvent0);
                if(accessibilityEvent0.getEventType() == 1) {
                    BottomSheetDragHandleView.this.g();
                }
            }
        }

        super(I1.a.c(context0, attributeSet0, v, BottomSheetDragHandleView.j), attributeSet0, v);
        this.f = this.getResources().getString(string.bottomsheet_action_expand);
        this.g = this.getResources().getString(string.bottomsheet_action_collapse);
        this.h = this.getResources().getString(string.bottomsheet_drag_handle_clicked);
        this.i = new a(this);
        this.a = (AccessibilityManager)this.getContext().getSystemService("accessibility");
        this.l();
        ViewCompat.J1(this, new b(this));
    }

    private void f(String s) {
        if(this.a == null) {
            return;
        }
        AccessibilityEvent accessibilityEvent0 = AccessibilityEvent.obtain(0x4000);
        accessibilityEvent0.getText().add(s);
        this.a.sendAccessibilityEvent(accessibilityEvent0);
    }

    private boolean g() {
        boolean z = false;
        if(!this.d) {
            return false;
        }
        this.f(this.h);
        if(!this.b.R0()) {
            z = true;
        }
        int v = this.b.getState();
        int v1 = 6;
        int v2 = 3;
        if(v != 4) {
            if(v != 3) {
                if(!this.e) {
                    v2 = 4;
                }
                v1 = v2;
            }
            else if(!z) {
                v1 = 4;
            }
        }
        else if(!z) {
            v1 = 3;
        }
        this.b.g(v1);
        return true;
    }

    @Nullable
    private BottomSheetBehavior h() {
        Behavior coordinatorLayout$Behavior0;
        View view0 = this;
    alab1:
        while(true) {
            do {
                view0 = BottomSheetDragHandleView.i(view0);
                if(view0 == null) {
                    break alab1;
                }
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                if(!(viewGroup$LayoutParams0 instanceof LayoutParams)) {
                    continue alab1;
                }
                coordinatorLayout$Behavior0 = ((LayoutParams)viewGroup$LayoutParams0).f();
            }
            while(!(coordinatorLayout$Behavior0 instanceof BottomSheetBehavior));
            return (BottomSheetBehavior)coordinatorLayout$Behavior0;
        }
        return null;
    }

    @Nullable
    private static View i(View view0) {
        ViewParent viewParent0 = view0.getParent();
        return viewParent0 instanceof View ? ((View)viewParent0) : null;
    }

    // 检测为 Lambda 实现
    private boolean j(View view0, CommandArguments accessibilityViewCommand$CommandArguments0) [...]

    private void k(int v) {
        switch(v) {
            case 3: {
                this.e = false;
                break;
            }
            case 4: {
                this.e = true;
            }
        }
        ViewCompat.C1(this, AccessibilityActionCompat.j, (this.e ? this.f : this.g), (View view0, CommandArguments accessibilityViewCommand$CommandArguments0) -> this.g());
    }

    private void l() {
        int v = 1;
        this.d = this.c && this.b != null;
        if(this.b == null) {
            v = 2;
        }
        ViewCompat.b2(this, v);
        this.setClickable(this.d);
    }

    @Override  // android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z) {
        this.c = z;
        this.l();
    }

    @Override  // android.widget.ImageView
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.setBottomSheetBehavior(this.h());
        AccessibilityManager accessibilityManager0 = this.a;
        if(accessibilityManager0 != null) {
            accessibilityManager0.addAccessibilityStateChangeListener(this);
            this.onAccessibilityStateChanged(this.a.isEnabled());
        }
    }

    @Override  // android.widget.ImageView
    protected void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager0 = this.a;
        if(accessibilityManager0 != null) {
            accessibilityManager0.removeAccessibilityStateChangeListener(this);
        }
        this.setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    private void setBottomSheetBehavior(@Nullable BottomSheetBehavior bottomSheetBehavior0) {
        BottomSheetBehavior bottomSheetBehavior1 = this.b;
        if(bottomSheetBehavior1 != null) {
            bottomSheetBehavior1.Y0(this.i);
            this.b.d1(null);
        }
        this.b = bottomSheetBehavior0;
        if(bottomSheetBehavior0 != null) {
            bottomSheetBehavior0.d1(this);
            this.k(this.b.getState());
            this.b.h0(this.i);
        }
        this.l();
    }
}

