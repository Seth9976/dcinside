package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.annotation.BoolRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.D;
import com.google.android.material.internal.M;
import com.google.android.material.shape.e;
import com.google.android.material.shape.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class MaterialButtonToggleGroup extends LinearLayout {
    class a implements Comparator {
        final MaterialButtonToggleGroup a;

        public int b(MaterialButton materialButton0, MaterialButton materialButton1) {
            int v = Boolean.valueOf(materialButton0.isChecked()).compareTo(Boolean.valueOf(materialButton1.isChecked()));
            if(v != 0) {
                return v;
            }
            int v1 = Boolean.valueOf(materialButton0.isPressed()).compareTo(Boolean.valueOf(materialButton1.isPressed()));
            return v1 == 0 ? MaterialButtonToggleGroup.this.indexOfChild(materialButton0).compareTo(MaterialButtonToggleGroup.this.indexOfChild(materialButton1)) : v1;
        }

        @Override
        public int compare(Object object0, Object object1) {
            return this.b(((MaterialButton)object0), ((MaterialButton)object1));
        }
    }

    static class c {
        e a;
        e b;
        e c;
        e d;
        private static final e e;

        static {
            c.e = new com.google.android.material.shape.a(0.0f);
        }

        c(e e0, e e1, e e2, e e3) {
            this.a = e0;
            this.b = e2;
            this.c = e3;
            this.d = e1;
        }

        public static c a(c materialButtonToggleGroup$c0) {
            return new c(c.e, materialButtonToggleGroup$c0.d, c.e, materialButtonToggleGroup$c0.c);
        }

        // 去混淆评级： 低(20)
        public static c b(c materialButtonToggleGroup$c0, View view0) {
            return M.s(view0) ? c.c(materialButtonToggleGroup$c0) : c.d(materialButtonToggleGroup$c0);
        }

        public static c c(c materialButtonToggleGroup$c0) {
            return new c(materialButtonToggleGroup$c0.a, materialButtonToggleGroup$c0.d, c.e, c.e);
        }

        public static c d(c materialButtonToggleGroup$c0) {
            return new c(c.e, c.e, materialButtonToggleGroup$c0.b, materialButtonToggleGroup$c0.c);
        }

        // 去混淆评级： 低(20)
        public static c e(c materialButtonToggleGroup$c0, View view0) {
            return M.s(view0) ? c.d(materialButtonToggleGroup$c0) : c.c(materialButtonToggleGroup$c0);
        }

        public static c f(c materialButtonToggleGroup$c0) {
            return new c(materialButtonToggleGroup$c0.a, c.e, materialButtonToggleGroup$c0.b, c.e);
        }
    }

    public interface d {
        void a(MaterialButtonToggleGroup arg1, @IdRes int arg2, boolean arg3);
    }

    class com.google.android.material.button.MaterialButtonToggleGroup.e implements com.google.android.material.button.MaterialButton.c {
        final MaterialButtonToggleGroup a;

        private com.google.android.material.button.MaterialButtonToggleGroup.e() {
        }

        com.google.android.material.button.MaterialButtonToggleGroup.e(a materialButtonToggleGroup$a0) {
        }

        @Override  // com.google.android.material.button.MaterialButton$c
        public void a(@NonNull MaterialButton materialButton0, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    private final List a;
    private final com.google.android.material.button.MaterialButtonToggleGroup.e b;
    private final LinkedHashSet c;
    private final Comparator d;
    private Integer[] e;
    private boolean f;
    private boolean g;
    private boolean h;
    @IdRes
    private final int i;
    private Set j;
    private static final String k = "MButtonToggleGroup";
    private static final int l;

    static {
        MaterialButtonToggleGroup.l = style.Widget_MaterialComponents_MaterialButtonToggleGroup;
    }

    public MaterialButtonToggleGroup(@NonNull Context context0) {
        this(context0, null);
    }

    public MaterialButtonToggleGroup(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.materialButtonToggleGroupStyle);
    }

    public MaterialButtonToggleGroup(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(I1.a.c(context0, attributeSet0, v, MaterialButtonToggleGroup.l), attributeSet0, v);
        this.a = new ArrayList();
        this.b = new com.google.android.material.button.MaterialButtonToggleGroup.e(this, null);
        this.c = new LinkedHashSet();
        this.d = new a(this);
        this.f = false;
        this.j = new HashSet();
        TypedArray typedArray0 = D.k(this.getContext(), attributeSet0, styleable.MaterialButtonToggleGroup, v, MaterialButtonToggleGroup.l, new int[0]);
        this.setSingleSelection(typedArray0.getBoolean(styleable.MaterialButtonToggleGroup_singleSelection, false));
        this.i = typedArray0.getResourceId(styleable.MaterialButtonToggleGroup_checkedButton, -1);
        this.h = typedArray0.getBoolean(styleable.MaterialButtonToggleGroup_selectionRequired, false);
        this.setChildrenDrawingOrderEnabled(true);
        this.setEnabled(typedArray0.getBoolean(styleable.MaterialButtonToggleGroup_android_enabled, true));
        typedArray0.recycle();
        ViewCompat.b2(this, 1);
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        class b extends AccessibilityDelegateCompat {
            final MaterialButtonToggleGroup d;

            @Override  // androidx.core.view.AccessibilityDelegateCompat
            public void g(View view0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
                super.g(view0, accessibilityNodeInfoCompat0);
                accessibilityNodeInfoCompat0.n1(CollectionItemInfoCompat.j(0, 1, MaterialButtonToggleGroup.this.k(view0), 1, false, ((MaterialButton)view0).isChecked()));
            }
        }

        if(!(view0 instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
        this.setGeneratedIdIfNeeded(((MaterialButton)view0));
        this.setupButtonChild(((MaterialButton)view0));
        this.f(((MaterialButton)view0).getId(), ((MaterialButton)view0).isChecked());
        p p0 = ((MaterialButton)view0).getShapeAppearanceModel();
        c materialButtonToggleGroup$c0 = new c(p0.r(), p0.j(), p0.t(), p0.l());
        this.a.add(materialButtonToggleGroup$c0);
        ((MaterialButton)view0).setEnabled(this.isEnabled());
        ViewCompat.J1(((MaterialButton)view0), new b(this));
    }

    public void b(@NonNull d materialButtonToggleGroup$d0) {
        this.c.add(materialButtonToggleGroup$d0);
    }

    private void c() {
        int v = this.getFirstVisibleChildIndex();
        if(v == -1) {
            return;
        }
        for(int v1 = v + 1; v1 < this.getChildCount(); ++v1) {
            MaterialButton materialButton0 = this.j(v1);
            int v2 = Math.min(materialButton0.getStrokeWidth(), this.j(v1 - 1).getStrokeWidth());
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = this.d(materialButton0);
            if(this.getOrientation() == 0) {
                MarginLayoutParamsCompat.g(linearLayout$LayoutParams0, 0);
                MarginLayoutParamsCompat.h(linearLayout$LayoutParams0, -v2);
                linearLayout$LayoutParams0.topMargin = 0;
            }
            else {
                linearLayout$LayoutParams0.bottomMargin = 0;
                linearLayout$LayoutParams0.topMargin = -v2;
                MarginLayoutParamsCompat.h(linearLayout$LayoutParams0, 0);
            }
            materialButton0.setLayoutParams(linearLayout$LayoutParams0);
        }
        this.r(v);
    }

    @NonNull
    private LinearLayout.LayoutParams d(@NonNull View view0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        return viewGroup$LayoutParams0 instanceof LinearLayout.LayoutParams ? ((LinearLayout.LayoutParams)viewGroup$LayoutParams0) : new LinearLayout.LayoutParams(viewGroup$LayoutParams0.width, viewGroup$LayoutParams0.height);
    }

    @Override  // android.view.ViewGroup
    protected void dispatchDraw(@NonNull Canvas canvas0) {
        this.w();
        super.dispatchDraw(canvas0);
    }

    public void e(@IdRes int v) {
        this.f(v, true);
    }

    private void f(@IdRes int v, boolean z) {
        if(v == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + -1);
            return;
        }
        HashSet hashSet0 = new HashSet(this.j);
        if(z && !hashSet0.contains(v)) {
            if(this.g && !hashSet0.isEmpty()) {
                hashSet0.clear();
            }
            hashSet0.add(v);
            this.v(hashSet0);
            return;
        }
        if(!z && hashSet0.contains(v)) {
            if(!this.h || hashSet0.size() > 1) {
                hashSet0.remove(v);
            }
            this.v(hashSet0);
        }
    }

    public void g() {
        this.v(new HashSet());
    }

    @IdRes
    public int getCheckedButtonId() {
        return this.g && !this.j.isEmpty() ? this.j.iterator().next() : -1;
    }

    @NonNull
    public List getCheckedButtonIds() {
        List list0 = new ArrayList();
        for(int v = 0; v < this.getChildCount(); ++v) {
            int v1 = this.j(v).getId();
            if(this.j.contains(v1)) {
                list0.add(v1);
            }
        }
        return list0;
    }

    @Override  // android.view.ViewGroup
    protected int getChildDrawingOrder(int v, int v1) {
        Integer[] arr_integer = this.e;
        if(arr_integer != null && v1 < arr_integer.length) {
            return (int)arr_integer[v1];
        }
        Log.w("MButtonToggleGroup", "Child order wasn\'t updated");
        return v1;
    }

    private int getFirstVisibleChildIndex() {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.m(v1)) {
                return v1;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for(int v = this.getChildCount() - 1; v >= 0; --v) {
            if(this.m(v)) {
                return v;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int v1 = 0;
        for(int v = 0; v < this.getChildCount(); ++v) {
            if(this.getChildAt(v) instanceof MaterialButton && this.m(v)) {
                ++v1;
            }
        }
        return v1;
    }

    public void h() {
        this.c.clear();
    }

    private void i(@IdRes int v, boolean z) {
        for(Object object0: this.c) {
            ((d)object0).a(this, v, z);
        }
    }

    private MaterialButton j(int v) {
        return (MaterialButton)this.getChildAt(v);
    }

    private int k(@Nullable View view0) {
        if(!(view0 instanceof MaterialButton)) {
            return -1;
        }
        int v1 = 0;
        for(int v = 0; v < this.getChildCount(); ++v) {
            if(this.getChildAt(v) == view0) {
                return v1;
            }
            if(this.getChildAt(v) instanceof MaterialButton && this.m(v)) {
                ++v1;
            }
        }
        return -1;
    }

    @Nullable
    private c l(int v, int v1, int v2) {
        c materialButtonToggleGroup$c0 = (c)this.a.get(v);
        if(v1 == v2) {
            return materialButtonToggleGroup$c0;
        }
        boolean z = this.getOrientation() == 0;
        if(v == v1) {
            return z ? c.e(materialButtonToggleGroup$c0, this) : c.f(materialButtonToggleGroup$c0);
        }
        if(v == v2) {
            return z ? c.b(materialButtonToggleGroup$c0, this) : c.a(materialButtonToggleGroup$c0);
        }
        return null;
    }

    private boolean m(int v) {
        return this.getChildAt(v).getVisibility() != 8;
    }

    public boolean n() {
        return this.h;
    }

    public boolean o() {
        return this.g;
    }

    @Override  // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int v = this.i;
        if(v != -1) {
            this.v(Collections.singleton(v));
        }
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        AccessibilityNodeInfoCompat.t2(accessibilityNodeInfo0).m1(CollectionInfoCompat.h(1, this.getVisibleButtonCount(), false, (this.o() ? 1 : 2)));
    }

    @Override  // android.widget.LinearLayout
    protected void onMeasure(int v, int v1) {
        this.x();
        this.c();
        super.onMeasure(v, v1);
    }

    @Override  // android.view.ViewGroup
    public void onViewRemoved(View view0) {
        super.onViewRemoved(view0);
        if(view0 instanceof MaterialButton) {
            ((MaterialButton)view0).setOnPressedChangeListenerInternal(null);
        }
        int v = this.indexOfChild(view0);
        if(v >= 0) {
            this.a.remove(v);
        }
        this.x();
        this.c();
    }

    void p(@NonNull MaterialButton materialButton0, boolean z) {
        if(this.f) {
            return;
        }
        this.f(materialButton0.getId(), z);
    }

    public void q(@NonNull d materialButtonToggleGroup$d0) {
        this.c.remove(materialButtonToggleGroup$d0);
    }

    private void r(int v) {
        if(this.getChildCount() != 0 && v != -1) {
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)this.j(v).getLayoutParams();
            if(this.getOrientation() == 1) {
                linearLayout$LayoutParams0.topMargin = 0;
                linearLayout$LayoutParams0.bottomMargin = 0;
                return;
            }
            MarginLayoutParamsCompat.g(linearLayout$LayoutParams0, 0);
            MarginLayoutParamsCompat.h(linearLayout$LayoutParams0, 0);
            linearLayout$LayoutParams0.leftMargin = 0;
            linearLayout$LayoutParams0.rightMargin = 0;
        }
    }

    private void s(@IdRes int v, boolean z) {
        View view0 = this.findViewById(v);
        if(view0 instanceof MaterialButton) {
            this.f = true;
            ((MaterialButton)view0).setChecked(z);
            this.f = false;
        }
    }

    @Override  // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for(int v = 0; v < this.getChildCount(); ++v) {
            this.j(v).setEnabled(z);
        }
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton0) {
        if(materialButton0.getId() == -1) {
            materialButton0.setId(ViewCompat.F());
        }
    }

    public void setSelectionRequired(boolean z) {
        this.h = z;
    }

    public void setSingleSelection(@BoolRes int v) {
        this.setSingleSelection(this.getResources().getBoolean(v));
    }

    public void setSingleSelection(boolean z) {
        if(this.g != z) {
            this.g = z;
            this.g();
        }
        this.y();
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton0) {
        materialButton0.setMaxLines(1);
        materialButton0.setEllipsize(TextUtils.TruncateAt.END);
        materialButton0.setCheckable(true);
        materialButton0.setOnPressedChangeListenerInternal(this.b);
        materialButton0.setShouldDrawSurfaceColorStroke(true);
    }

    public void t(@IdRes int v) {
        this.f(v, false);
    }

    private static void u(com.google.android.material.shape.p.b p$b0, @Nullable c materialButtonToggleGroup$c0) {
        if(materialButtonToggleGroup$c0 == null) {
            p$b0.o(0.0f);
            return;
        }
        p$b0.L(materialButtonToggleGroup$c0.a).y(materialButtonToggleGroup$c0.d).Q(materialButtonToggleGroup$c0.b).D(materialButtonToggleGroup$c0.c);
    }

    private void v(Set set0) {
        Set set1 = this.j;
        this.j = new HashSet(set0);
        for(int v = 0; v < this.getChildCount(); ++v) {
            int v1 = this.j(v).getId();
            this.s(v1, set0.contains(v1));
            if(set1.contains(v1) != set0.contains(v1)) {
                this.i(v1, set0.contains(v1));
            }
        }
        this.invalidate();
    }

    private void w() {
        TreeMap treeMap0 = new TreeMap(this.d);
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            treeMap0.put(this.j(v1), v1);
        }
        this.e = (Integer[])treeMap0.values().toArray(new Integer[0]);
    }

    @VisibleForTesting
    void x() {
        int v = this.getChildCount();
        int v1 = this.getFirstVisibleChildIndex();
        int v2 = this.getLastVisibleChildIndex();
        for(int v3 = 0; v3 < v; ++v3) {
            MaterialButton materialButton0 = this.j(v3);
            if(materialButton0.getVisibility() != 8) {
                com.google.android.material.shape.p.b p$b0 = materialButton0.getShapeAppearanceModel().v();
                MaterialButtonToggleGroup.u(p$b0, this.l(v3, v1, v2));
                materialButton0.setShapeAppearanceModel(p$b0.m());
            }
        }
    }

    private void y() {
        for(int v = 0; v < this.getChildCount(); ++v) {
            Class class0 = this.g ? RadioButton.class : ToggleButton.class;
            this.j(v).setA11yClassName(class0.getName());
        }
    }
}

