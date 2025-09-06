package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.BoolRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.D;
import com.google.android.material.internal.FlowLayout;
import com.google.android.material.internal.a.b;
import java.util.List;
import java.util.Set;

public class ChipGroup extends FlowLayout {
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(int v, int v1) {
            super(v, v1);
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

    @Deprecated
    public interface c {
        void a(@NonNull ChipGroup arg1, @IdRes int arg2);
    }

    public interface d {
        void a(@NonNull ChipGroup arg1, @NonNull List arg2);
    }

    class e implements ViewGroup.OnHierarchyChangeListener {
        private ViewGroup.OnHierarchyChangeListener a;
        final ChipGroup b;

        private e() {
        }

        e(a chipGroup$a0) {
        }

        @Override  // android.view.ViewGroup$OnHierarchyChangeListener
        public void onChildViewAdded(View view0, View view1) {
            if(view0 == ChipGroup.this && view1 instanceof Chip) {
                if(view1.getId() == -1) {
                    view1.setId(ViewCompat.F());
                }
                ChipGroup.this.h.e(((Chip)view1));
            }
            ViewGroup.OnHierarchyChangeListener viewGroup$OnHierarchyChangeListener0 = this.a;
            if(viewGroup$OnHierarchyChangeListener0 != null) {
                viewGroup$OnHierarchyChangeListener0.onChildViewAdded(view0, view1);
            }
        }

        @Override  // android.view.ViewGroup$OnHierarchyChangeListener
        public void onChildViewRemoved(View view0, View view1) {
            ChipGroup chipGroup0 = ChipGroup.this;
            if(view0 == chipGroup0 && view1 instanceof Chip) {
                chipGroup0.h.o(((Chip)view1));
            }
            ViewGroup.OnHierarchyChangeListener viewGroup$OnHierarchyChangeListener0 = this.a;
            if(viewGroup$OnHierarchyChangeListener0 != null) {
                viewGroup$OnHierarchyChangeListener0.onChildViewRemoved(view0, view1);
            }
        }
    }

    @Dimension
    private int e;
    @Dimension
    private int f;
    @Nullable
    private d g;
    private final com.google.android.material.internal.a h;
    private final int i;
    @NonNull
    private final e j;
    private static final int k;

    static {
        ChipGroup.k = style.Widget_MaterialComponents_ChipGroup;
    }

    public ChipGroup(Context context0) {
        this(context0, null);
    }

    public ChipGroup(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.chipGroupStyle);
    }

    public ChipGroup(Context context0, AttributeSet attributeSet0, int v) {
        class a implements b {
            final ChipGroup a;

            @Override  // com.google.android.material.internal.a$b
            public void a(Set set0) {
                if(ChipGroup.this.g != null) {
                    d chipGroup$d0 = ChipGroup.this.g;
                    List list0 = ChipGroup.this.h.j(ChipGroup.this);
                    chipGroup$d0.a(ChipGroup.this, list0);
                }
            }
        }

        super(I1.a.c(context0, attributeSet0, v, ChipGroup.k), attributeSet0, v);
        com.google.android.material.internal.a a0 = new com.google.android.material.internal.a();
        this.h = a0;
        e chipGroup$e0 = new e(this, null);
        this.j = chipGroup$e0;
        TypedArray typedArray0 = D.k(this.getContext(), attributeSet0, styleable.ChipGroup, v, ChipGroup.k, new int[0]);
        int v1 = typedArray0.getDimensionPixelOffset(styleable.ChipGroup_chipSpacing, 0);
        this.setChipSpacingHorizontal(typedArray0.getDimensionPixelOffset(styleable.ChipGroup_chipSpacingHorizontal, v1));
        this.setChipSpacingVertical(typedArray0.getDimensionPixelOffset(styleable.ChipGroup_chipSpacingVertical, v1));
        this.setSingleLine(typedArray0.getBoolean(styleable.ChipGroup_singleLine, false));
        this.setSingleSelection(typedArray0.getBoolean(styleable.ChipGroup_singleSelection, false));
        this.setSelectionRequired(typedArray0.getBoolean(styleable.ChipGroup_selectionRequired, false));
        this.i = typedArray0.getResourceId(styleable.ChipGroup_checkedChip, -1);
        typedArray0.recycle();
        a0.p(new a(this));
        super.setOnHierarchyChangeListener(chipGroup$e0);
        ViewCompat.b2(this, 1);
    }

    @Override  // com.google.android.material.internal.FlowLayout
    public boolean c() {
        return super.c();
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return super.checkLayoutParams(viewGroup$LayoutParams0) && viewGroup$LayoutParams0 instanceof LayoutParams;
    }

    public void g(@IdRes int v) {
        this.h.f(v);
    }

    @Override  // android.view.ViewGroup
    @NonNull
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override  // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new LayoutParams(this.getContext(), attributeSet0);
    }

    @Override  // android.view.ViewGroup
    @NonNull
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return new LayoutParams(viewGroup$LayoutParams0);
    }

    @IdRes
    public int getCheckedChipId() {
        return this.h.k();
    }

    @NonNull
    public List getCheckedChipIds() {
        return this.h.j(this);
    }

    @Dimension
    public int getChipSpacingHorizontal() {
        return this.e;
    }

    @Dimension
    public int getChipSpacingVertical() {
        return this.f;
    }

    private int getVisibleChipCount() {
        int v1 = 0;
        for(int v = 0; v < this.getChildCount(); ++v) {
            if(this.getChildAt(v) instanceof Chip && this.j(v)) {
                ++v1;
            }
        }
        return v1;
    }

    public void h() {
        this.h.h();
    }

    int i(@Nullable View view0) {
        if(!(view0 instanceof Chip)) {
            return -1;
        }
        int v1 = 0;
        for(int v = 0; v < this.getChildCount(); ++v) {
            View view1 = this.getChildAt(v);
            if(view1 instanceof Chip && this.j(v)) {
                if(((Chip)view1) == view0) {
                    return v1;
                }
                ++v1;
            }
        }
        return -1;
    }

    private boolean j(int v) {
        return this.getChildAt(v).getVisibility() == 0;
    }

    public boolean k() {
        return this.h.l();
    }

    public boolean l() {
        return this.h.m();
    }

    @Override  // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int v = this.i;
        if(v != -1) {
            this.h.f(v);
        }
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        AccessibilityNodeInfoCompat.t2(accessibilityNodeInfo0).m1(CollectionInfoCompat.h(this.getRowCount(), (this.c() ? this.getVisibleChipCount() : -1), false, (this.l() ? 1 : 2)));
    }

    public void setChipSpacing(@Dimension int v) {
        this.setChipSpacingHorizontal(v);
        this.setChipSpacingVertical(v);
    }

    public void setChipSpacingHorizontal(@Dimension int v) {
        if(this.e != v) {
            this.e = v;
            this.setItemSpacing(v);
            this.requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(@DimenRes int v) {
        this.setChipSpacingHorizontal(this.getResources().getDimensionPixelOffset(v));
    }

    public void setChipSpacingResource(@DimenRes int v) {
        this.setChipSpacing(this.getResources().getDimensionPixelOffset(v));
    }

    public void setChipSpacingVertical(@Dimension int v) {
        if(this.f != v) {
            this.f = v;
            this.setLineSpacing(v);
            this.requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(@DimenRes int v) {
        this.setChipSpacingVertical(this.getResources().getDimensionPixelOffset(v));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable0) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(@Nullable Drawable drawable0) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int v) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(@Nullable c chipGroup$c0) {
        class com.google.android.material.chip.ChipGroup.b implements d {
            final c a;
            final ChipGroup b;

            com.google.android.material.chip.ChipGroup.b(c chipGroup$c0) {
                this.a = chipGroup$c0;
                super();
            }

            @Override  // com.google.android.material.chip.ChipGroup$d
            public void a(@NonNull ChipGroup chipGroup0, @NonNull List list0) {
                if(!ChipGroup.this.h.m()) {
                    return;
                }
                int v = ChipGroup.this.getCheckedChipId();
                this.a.a(chipGroup0, v);
            }
        }

        if(chipGroup$c0 == null) {
            this.setOnCheckedStateChangeListener(null);
            return;
        }
        this.setOnCheckedStateChangeListener(new com.google.android.material.chip.ChipGroup.b(this, chipGroup$c0));
    }

    public void setOnCheckedStateChangeListener(@Nullable d chipGroup$d0) {
        this.g = chipGroup$d0;
    }

    @Override  // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener viewGroup$OnHierarchyChangeListener0) {
        this.j.a = viewGroup$OnHierarchyChangeListener0;
    }

    public void setSelectionRequired(boolean z) {
        this.h.q(z);
    }

    @Deprecated
    public void setShowDividerHorizontal(int v) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int v) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(@BoolRes int v) {
        this.setSingleLine(this.getResources().getBoolean(v));
    }

    @Override  // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(@BoolRes int v) {
        this.setSingleSelection(this.getResources().getBoolean(v));
    }

    public void setSingleSelection(boolean z) {
        this.h.r(z);
    }
}

