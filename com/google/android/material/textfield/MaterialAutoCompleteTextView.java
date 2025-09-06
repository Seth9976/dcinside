package com.google.android.material.textfield;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.ArrayRes;
import androidx.annotation.ColorInt;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.layout;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.color.v;
import com.google.android.material.internal.D;
import com.google.android.material.internal.l;
import com.google.android.material.resources.d;
import com.google.android.material.shape.k;
import java.util.List;

public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {
    class b extends ArrayAdapter {
        @Nullable
        private ColorStateList a;
        @Nullable
        private ColorStateList b;
        final MaterialAutoCompleteTextView c;

        b(@NonNull Context context0, int v, @NonNull String[] arr_s) {
            super(context0, v, arr_s);
            this.f();
        }

        @Nullable
        private ColorStateList a() {
            if(this.c() && this.d()) {
                int[] arr_v = {0x1010367, 0xFEFEFF59};
                int[] arr_v1 = {0x10100A1, 0xFEFEFF59};
                int v = MaterialAutoCompleteTextView.this.l.getColorForState(arr_v1, 0);
                int v1 = MaterialAutoCompleteTextView.this.l.getColorForState(arr_v, 0);
                int[] arr_v2 = {v.s(MaterialAutoCompleteTextView.this.k, v), v.s(MaterialAutoCompleteTextView.this.k, v1), MaterialAutoCompleteTextView.this.k};
                return new ColorStateList(new int[][]{arr_v1, arr_v, new int[0]}, arr_v2);
            }
            return null;
        }

        @Nullable
        private Drawable b() {
            if(this.c()) {
                Drawable drawable0 = new ColorDrawable(MaterialAutoCompleteTextView.this.k);
                if(this.b != null) {
                    DrawableCompat.o(drawable0, this.a);
                    return new RippleDrawable(this.b, drawable0, null);
                }
                return drawable0;
            }
            return null;
        }

        private boolean c() {
            return MaterialAutoCompleteTextView.this.k != 0;
        }

        private boolean d() {
            return MaterialAutoCompleteTextView.this.l != null;
        }

        private ColorStateList e() {
            if(!this.d()) {
                return null;
            }
            int[] arr_v = {0x10100A7};
            int[] arr_v1 = {MaterialAutoCompleteTextView.this.l.getColorForState(arr_v, 0), 0};
            return new ColorStateList(new int[][]{arr_v, new int[0]}, arr_v1);
        }

        void f() {
            this.b = this.e();
            this.a = this.a();
        }

        @Override  // android.widget.ArrayAdapter
        public View getView(int v, @Nullable View view0, ViewGroup viewGroup0) {
            View view1 = super.getView(v, view0, viewGroup0);
            if(view1 instanceof TextView) {
                ViewCompat.R1(((TextView)view1), (MaterialAutoCompleteTextView.this.getText().toString().contentEquals(((TextView)view1).getText()) ? this.b() : null));
            }
            return view1;
        }
    }

    @NonNull
    private final ListPopupWindow e;
    @Nullable
    private final AccessibilityManager f;
    @NonNull
    private final Rect g;
    @LayoutRes
    private final int h;
    private final float i;
    @Nullable
    private ColorStateList j;
    private int k;
    @Nullable
    private ColorStateList l;
    private static final int m = 15;
    private static final String n = "SwitchAccess";

    public MaterialAutoCompleteTextView(@NonNull Context context0) {
        this(context0, null);
    }

    public MaterialAutoCompleteTextView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.autoCompleteTextViewStyle);
    }

    public MaterialAutoCompleteTextView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        class a implements AdapterView.OnItemClickListener {
            final MaterialAutoCompleteTextView a;

            @Override  // android.widget.AdapterView$OnItemClickListener
            public void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
                Object object0 = v >= 0 ? MaterialAutoCompleteTextView.this.getAdapter().getItem(v) : MaterialAutoCompleteTextView.this.e.B();
                MaterialAutoCompleteTextView.this.m(object0);
                AdapterView.OnItemClickListener adapterView$OnItemClickListener0 = MaterialAutoCompleteTextView.this.getOnItemClickListener();
                if(adapterView$OnItemClickListener0 != null) {
                    if(view0 == null || v < 0) {
                        view0 = MaterialAutoCompleteTextView.this.e.E();
                        v = MaterialAutoCompleteTextView.this.e.D();
                        v1 = MaterialAutoCompleteTextView.this.e.C();
                    }
                    adapterView$OnItemClickListener0.onItemClick(MaterialAutoCompleteTextView.this.e.j(), view0, v, v1);
                }
                MaterialAutoCompleteTextView.this.e.dismiss();
            }
        }

        super(I1.a.c(context0, attributeSet0, v, 0), attributeSet0, v);
        this.g = new Rect();
        Context context1 = this.getContext();
        TypedArray typedArray0 = D.k(context1, attributeSet0, styleable.MaterialAutoCompleteTextView, v, style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if(typedArray0.hasValue(styleable.MaterialAutoCompleteTextView_android_inputType) && typedArray0.getInt(0, 0) == 0) {
            this.setKeyListener(null);
        }
        this.h = typedArray0.getResourceId(styleable.MaterialAutoCompleteTextView_simpleItemLayout, layout.mtrl_auto_complete_simple_item);
        this.i = (float)typedArray0.getDimensionPixelOffset(styleable.MaterialAutoCompleteTextView_android_popupElevation, dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if(typedArray0.hasValue(styleable.MaterialAutoCompleteTextView_dropDownBackgroundTint)) {
            this.j = ColorStateList.valueOf(typedArray0.getColor(2, 0));
        }
        this.k = typedArray0.getColor(styleable.MaterialAutoCompleteTextView_simpleItemSelectedColor, 0);
        this.l = d.a(context1, typedArray0, styleable.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor);
        this.f = (AccessibilityManager)context1.getSystemService("accessibility");
        ListPopupWindow listPopupWindow0 = new ListPopupWindow(context1);
        this.e = listPopupWindow0;
        listPopupWindow0.c0(true);
        listPopupWindow0.R(this);
        listPopupWindow0.Z(2);
        listPopupWindow0.p(this.getAdapter());
        listPopupWindow0.e0(new a(this));
        if(typedArray0.hasValue(styleable.MaterialAutoCompleteTextView_simpleItems)) {
            this.setSimpleItems(typedArray0.getResourceId(6, 0));
        }
        typedArray0.recycle();
    }

    @Override  // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if(this.h()) {
            this.e.dismiss();
            return;
        }
        super.dismissDropDown();
    }

    @Nullable
    private TextInputLayout g() {
        for(ViewParent viewParent0 = this.getParent(); viewParent0 != null; viewParent0 = viewParent0.getParent()) {
            if(viewParent0 instanceof TextInputLayout) {
                return (TextInputLayout)viewParent0;
            }
        }
        return null;
    }

    @Nullable
    public ColorStateList getDropDownBackgroundTintList() {
        return this.j;
    }

    @Override  // android.widget.TextView
    @Nullable
    public CharSequence getHint() {
        TextInputLayout textInputLayout0 = this.g();
        return textInputLayout0 == null || !textInputLayout0.c0() ? super.getHint() : textInputLayout0.getHint();
    }

    public float getPopupElevation() {
        return this.i;
    }

    public int getSimpleItemSelectedColor() {
        return this.k;
    }

    @Nullable
    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.l;
    }

    // 去混淆评级： 低(20)
    private boolean h() {
        return this.j() || this.i();
    }

    private boolean i() {
        if(this.f != null && this.f.isEnabled()) {
            List list0 = this.f.getEnabledAccessibilityServiceList(16);
            if(list0 != null) {
                for(Object object0: list0) {
                    if(((AccessibilityServiceInfo)object0).getSettingsActivityName() != null && ((AccessibilityServiceInfo)object0).getSettingsActivityName().contains("SwitchAccess")) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    private boolean j() {
        return this.f != null && this.f.isTouchExplorationEnabled();
    }

    private int k() {
        ListAdapter listAdapter0 = this.getAdapter();
        TextInputLayout textInputLayout0 = this.g();
        int v = 0;
        if(listAdapter0 != null && textInputLayout0 != null) {
            int v1 = View.MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0);
            int v2 = View.MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0);
            int v3 = Math.max(0, this.e.D());
            int v4 = Math.min(listAdapter0.getCount(), v3 + 15);
            int v5 = Math.max(0, v4 - 15);
            View view0 = null;
            int v6 = 0;
            while(v5 < v4) {
                int v7 = listAdapter0.getItemViewType(v5);
                if(v7 != v) {
                    view0 = null;
                    v = v7;
                }
                view0 = listAdapter0.getView(v5, view0, textInputLayout0);
                if(view0.getLayoutParams() == null) {
                    view0.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                }
                view0.measure(v1, v2);
                v6 = Math.max(v6, view0.getMeasuredWidth());
                ++v5;
            }
            Drawable drawable0 = this.e.d();
            if(drawable0 != null) {
                drawable0.getPadding(this.g);
                v6 += this.g.left + this.g.right;
            }
            return v6 + textInputLayout0.getEndIconView().getMeasuredWidth();
        }
        return 0;
    }

    private void l() {
        TextInputLayout textInputLayout0 = this.g();
        if(textInputLayout0 != null) {
            textInputLayout0.L0();
        }
    }

    private void m(Object object0) {
        this.setText(this.convertSelectionToString(object0), false);
    }

    @Override  // android.widget.AutoCompleteTextView
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout0 = this.g();
        if(textInputLayout0 != null && textInputLayout0.c0() && super.getHint() == null && l.d()) {
            this.setHint("");
        }
    }

    @Override  // android.widget.AutoCompleteTextView
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.dismiss();
    }

    @Override  // android.widget.TextView
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(View.MeasureSpec.getMode(v) == 0x80000000) {
            this.setMeasuredDimension(Math.min(Math.max(this.getMeasuredWidth(), this.k()), View.MeasureSpec.getSize(v)), this.getMeasuredHeight());
        }
    }

    @Override  // android.widget.AutoCompleteTextView
    public void onWindowFocusChanged(boolean z) {
        if(this.h()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override  // android.widget.AutoCompleteTextView
    public void setAdapter(@Nullable ListAdapter listAdapter0) {
        super.setAdapter(listAdapter0);
        ListAdapter listAdapter1 = this.getAdapter();
        this.e.p(listAdapter1);
    }

    @Override  // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable0) {
        super.setDropDownBackgroundDrawable(drawable0);
        ListPopupWindow listPopupWindow0 = this.e;
        if(listPopupWindow0 != null) {
            listPopupWindow0.a(drawable0);
        }
    }

    public void setDropDownBackgroundTint(@ColorInt int v) {
        this.setDropDownBackgroundTintList(ColorStateList.valueOf(v));
    }

    public void setDropDownBackgroundTintList(@Nullable ColorStateList colorStateList0) {
        this.j = colorStateList0;
        Drawable drawable0 = this.getDropDownBackground();
        if(drawable0 instanceof k) {
            ((k)drawable0).p0(this.j);
        }
    }

    @Override  // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener adapterView$OnItemSelectedListener0) {
        super.setOnItemSelectedListener(adapterView$OnItemSelectedListener0);
        AdapterView.OnItemSelectedListener adapterView$OnItemSelectedListener1 = this.getOnItemSelectedListener();
        this.e.f0(adapterView$OnItemSelectedListener1);
    }

    @Override  // android.widget.TextView
    public void setRawInputType(int v) {
        super.setRawInputType(v);
        this.l();
    }

    public void setSimpleItemSelectedColor(int v) {
        this.k = v;
        if(this.getAdapter() instanceof b) {
            ((b)this.getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(@Nullable ColorStateList colorStateList0) {
        this.l = colorStateList0;
        if(this.getAdapter() instanceof b) {
            ((b)this.getAdapter()).f();
        }
    }

    public void setSimpleItems(@ArrayRes int v) {
        this.setSimpleItems(this.getResources().getStringArray(v));
    }

    public void setSimpleItems(@NonNull String[] arr_s) {
        this.setAdapter(new b(this, this.getContext(), this.h, arr_s));
    }

    @Override  // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if(this.h()) {
            this.e.show();
            return;
        }
        super.showDropDown();
    }
}

