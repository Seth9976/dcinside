package com.google.android.material.search;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.appbar.AppBarLayout.LayoutParams;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.color.v;
import com.google.android.material.internal.D;
import com.google.android.material.internal.E;
import com.google.android.material.shape.k;
import com.google.android.material.shape.l;
import com.google.android.material.shape.p;

public class SearchBar extends Toolbar {
    static class SavedState extends AbsSavedState {
        class a implements Parcelable.ClassLoaderCreator {
            a() {
                super();
            }

            public SavedState a(Parcel parcel0) {
                return new SavedState(parcel0);
            }

            public SavedState b(Parcel parcel0, ClassLoader classLoader0) {
                return new SavedState(parcel0, classLoader0);
            }

            public SavedState[] c(int v) {
                return new SavedState[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$ClassLoaderCreator
            public Object createFromParcel(Parcel parcel0, ClassLoader classLoader0) {
                return this.b(parcel0, classLoader0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.c(v);
            }
        }

        public static final Parcelable.Creator CREATOR;
        String c;

        static {
            SavedState.CREATOR = new a();
        }

        public SavedState(Parcel parcel0) {
            this(parcel0, null);
        }

        public SavedState(Parcel parcel0, @Nullable ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.c = parcel0.readString();
        }

        public SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeString(this.c);
        }
    }

    public static class ScrollingViewBehavior extends com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior {
        private boolean h;

        public ScrollingViewBehavior() {
            this.h = false;
        }

        public ScrollingViewBehavior(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.h = false;
        }

        @Override  // com.google.android.material.appbar.HeaderScrollingViewBehavior
        protected boolean e0() {
            return true;
        }

        private void j0(AppBarLayout appBarLayout0) {
            appBarLayout0.setBackgroundColor(0);
            if(Build.VERSION.SDK_INT == 21) {
                appBarLayout0.setOutlineProvider(null);
                return;
            }
            appBarLayout0.setTargetElevation(0.0f);
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior
        public boolean p(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1) {
            boolean z = super.p(coordinatorLayout0, view0, view1);
            if(!this.h && view1 instanceof AppBarLayout) {
                this.h = true;
                this.j0(((AppBarLayout)view1));
            }
            return z;
        }
    }

    public static abstract class b {
        public void a() {
        }

        public void b() {
        }
    }

    private final TextView Q8;
    private final boolean R8;
    private final boolean S8;
    private final j T8;
    private final Drawable U8;
    private final boolean V8;
    private final boolean W8;
    @Nullable
    private View X8;
    @Nullable
    private Integer Y8;
    @Nullable
    private Drawable Z8;
    private int a9;
    private boolean b9;
    private k c9;
    @Nullable
    private final AccessibilityManager d9;
    private final TouchExplorationStateChangeListener e9;
    private static final int f9 = 0;
    private static final int g9 = 53;
    private static final String h9 = "http://schemas.android.com/apk/res-auto";

    static {
        SearchBar.f9 = style.Widget_Material3_SearchBar;
    }

    public SearchBar(@NonNull Context context0) {
        this(context0, null);
    }

    public SearchBar(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.materialSearchBarStyle);
    }

    public SearchBar(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(I1.a.c(context0, attributeSet0, v, SearchBar.f9), attributeSet0, v);
        this.a9 = -1;
        this.e9 = (boolean z) -> this.setFocusableInTouchMode(z);
        Context context1 = this.getContext();
        this.H0(attributeSet0);
        this.U8 = AppCompatResources.b(context1, 0x7F0802DD);  // drawable:ic_search_black_24
        this.T8 = new j();
        TypedArray typedArray0 = D.k(context1, attributeSet0, styleable.SearchBar, v, SearchBar.f9, new int[0]);
        p p0 = p.e(context1, attributeSet0, v, SearchBar.f9).m();
        int v1 = typedArray0.getColor(styleable.SearchBar_backgroundTint, 0);
        float f = typedArray0.getDimension(styleable.SearchBar_elevation, 0.0f);
        this.S8 = typedArray0.getBoolean(styleable.SearchBar_defaultMarginsEnabled, true);
        this.b9 = typedArray0.getBoolean(styleable.SearchBar_defaultScrollFlagsEnabled, true);
        boolean z = typedArray0.getBoolean(styleable.SearchBar_hideNavigationIcon, false);
        this.W8 = typedArray0.getBoolean(styleable.SearchBar_forceDefaultNavigationOnClickListener, false);
        this.V8 = typedArray0.getBoolean(styleable.SearchBar_tintNavigationIcon, true);
        if(typedArray0.hasValue(styleable.SearchBar_navigationIconTint)) {
            this.Y8 = typedArray0.getColor(9, -1);
        }
        int v2 = typedArray0.getResourceId(styleable.SearchBar_android_textAppearance, -1);
        String s = typedArray0.getString(styleable.SearchBar_android_text);
        String s1 = typedArray0.getString(styleable.SearchBar_android_hint);
        float f1 = typedArray0.getDimension(styleable.SearchBar_strokeWidth, -1.0f);
        int v3 = typedArray0.getColor(styleable.SearchBar_strokeColor, 0);
        typedArray0.recycle();
        if(!z) {
            this.m0();
        }
        this.setClickable(true);
        this.setFocusable(true);
        LayoutInflater.from(context1).inflate(layout.mtrl_search_bar, this);
        this.R8 = true;
        this.Q8 = (TextView)this.findViewById(id.open_search_bar_text_view);
        ViewCompat.X1(this, f);
        this.n0(v2, s, s1);
        this.l0(p0, v1, f, f1, v3);
        this.d9 = (AccessibilityManager)this.getContext().getSystemService("accessibility");
        this.E0();
    }

    public boolean A0(@NonNull b searchBar$b0) {
        return this.T8.F(searchBar$b0);
    }

    private void B0() {
        if(this.S8 && this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            Resources resources0 = this.getResources();
            int v = resources0.getDimensionPixelSize(dimen.m3_searchbar_margin_horizontal);
            int v1 = resources0.getDimensionPixelSize(0x7F07025D);  // dimen:m3_searchbar_margin_vertical
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.getLayoutParams();
            viewGroup$MarginLayoutParams0.leftMargin = this.g0(viewGroup$MarginLayoutParams0.leftMargin, v);
            viewGroup$MarginLayoutParams0.topMargin = this.g0(viewGroup$MarginLayoutParams0.topMargin, v1);
            viewGroup$MarginLayoutParams0.rightMargin = this.g0(viewGroup$MarginLayoutParams0.rightMargin, v);
            viewGroup$MarginLayoutParams0.bottomMargin = this.g0(viewGroup$MarginLayoutParams0.bottomMargin, v1);
        }
    }

    private void C0() {
        int v1;
        if(Build.VERSION.SDK_INT < 34) {
            return;
        }
        boolean z = true;
        int v = 0;
        if(this.getLayoutDirection() != 1) {
            z = false;
        }
        ImageButton imageButton0 = E.e(this);
        if(imageButton0 == null || !imageButton0.isClickable()) {
            v1 = 0;
        }
        else if(z) {
            v1 = this.getWidth() - imageButton0.getLeft();
        }
        else {
            v1 = imageButton0.getRight();
        }
        ActionMenuView actionMenuView0 = E.b(this);
        if(actionMenuView0 != null) {
            v = z ? actionMenuView0.getRight() : this.getWidth() - actionMenuView0.getLeft();
        }
        int v2 = z ? v : v1;
        if(!z) {
            v1 = v;
        }
        this.setHandwritingBoundsOffsets(((float)(-v2)), 0.0f, ((float)(-v1)), 0.0f);
    }

    private void D0() {
        if(this.getLayoutParams() instanceof LayoutParams) {
            LayoutParams appBarLayout$LayoutParams0 = (LayoutParams)this.getLayoutParams();
            if(this.b9) {
                if(appBarLayout$LayoutParams0.c() == 0) {
                    appBarLayout$LayoutParams0.h(53);
                }
            }
            else if(appBarLayout$LayoutParams0.c() == 53) {
                appBarLayout$LayoutParams0.h(0);
            }
        }
    }

    private void E0() {
        class com.google.android.material.search.SearchBar.a implements View.OnAttachStateChangeListener {
            final SearchBar a;

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view0) {
                AccessibilityManagerCompat.b(SearchBar.this.d9, SearchBar.this.e9);
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view0) {
                AccessibilityManagerCompat.h(SearchBar.this.d9, SearchBar.this.e9);
            }
        }

        AccessibilityManager accessibilityManager0 = this.d9;
        if(accessibilityManager0 != null) {
            if(accessibilityManager0.isEnabled() && this.d9.isTouchExplorationEnabled()) {
                this.setFocusableInTouchMode(true);
            }
            this.addOnAttachStateChangeListener(new com.google.android.material.search.SearchBar.a(this));
        }
    }

    public void F0() {
        this.post(() -> this.T8.J(this));
    }

    public void G0() {
        this.T8.K(this);
    }

    private void H0(@Nullable AttributeSet attributeSet0) {
        if(attributeSet0 == null) {
            return;
        }
        if(attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "title") != null) {
            throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
        }
        if(attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") != null) {
            throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
        }
    }

    public void Z(@NonNull AnimatorListenerAdapter animatorListenerAdapter0) {
        this.T8.h(animatorListenerAdapter0);
    }

    public void a0(@NonNull AnimatorListenerAdapter animatorListenerAdapter0) {
        this.T8.i(animatorListenerAdapter0);
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(this.R8 && this.X8 == null && !(view0 instanceof ActionMenuView)) {
            this.X8 = view0;
            view0.setAlpha(0.0f);
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    public void b0(@NonNull b searchBar$b0) {
        this.T8.j(searchBar$b0);
    }

    public void c0() {
        this.Q8.setText("");
    }

    @O1.a
    public boolean d0(@NonNull View view0) {
        return this.e0(view0, null);
    }

    @O1.a
    public boolean e0(@NonNull View view0, @Nullable AppBarLayout appBarLayout0) {
        return this.f0(view0, appBarLayout0, false);
    }

    @O1.a
    public boolean f0(@NonNull View view0, @Nullable AppBarLayout appBarLayout0, boolean z) {
        if(view0.getVisibility() == 0 && !this.o0() || this.q0()) {
            this.T8.H(this, view0, appBarLayout0, z);
            return true;
        }
        return false;
    }

    private int g0(int v, int v1) {
        return v == 0 ? v1 : v;
    }

    @Nullable
    public View getCenterView() {
        return this.X8;
    }

    float getCompatElevation() {
        k k0 = this.c9;
        return k0 == null ? ViewCompat.V(this) : k0.y();
    }

    public float getCornerSize() {
        return this.c9.T();
    }

    @DimenRes
    @RestrictTo({Scope.b})
    protected int getDefaultMarginVerticalResource() [...] // 潜在的解密器

    @DrawableRes
    @RestrictTo({Scope.b})
    protected int getDefaultNavigationIconResource() [...] // 潜在的解密器

    @Nullable
    public CharSequence getHint() {
        return this.Q8.getHint();
    }

    int getMenuResId() {
        return this.a9;
    }

    @ColorInt
    public int getStrokeColor() {
        return this.c9.O().getDefaultColor();
    }

    @Dimension
    public float getStrokeWidth() {
        return this.c9.R();
    }

    @NonNull
    public CharSequence getText() {
        return this.Q8.getText();
    }

    @NonNull
    public TextView getTextView() {
        return this.Q8;
    }

    @O1.a
    public boolean h0(@NonNull View view0) {
        return this.i0(view0, null);
    }

    @O1.a
    public boolean i0(@NonNull View view0, @Nullable AppBarLayout appBarLayout0) {
        return this.j0(view0, appBarLayout0, false);
    }

    @O1.a
    public boolean j0(@NonNull View view0, @Nullable AppBarLayout appBarLayout0, boolean z) {
        if(view0.getVisibility() != 0 && !this.q0() || this.o0()) {
            this.T8.I(this, view0, appBarLayout0, z);
            return true;
        }
        return false;
    }

    private ColorStateList k0(@ColorInt int v, @ColorInt int v1) {
        int v2 = v.s(v, v1);
        return new ColorStateList(new int[][]{new int[]{0x10100A7}, new int[]{0x101009C}, new int[0]}, new int[]{v2, v2, v});
    }

    private void l0(p p0, @ColorInt int v, float f, float f1, @ColorInt int v1) {
        k k0 = new k(p0);
        this.c9 = k0;
        k0.a0(this.getContext());
        this.c9.o0(f);
        if(f1 >= 0.0f) {
            this.c9.E0(f1, v1);
        }
        int v2 = v.d(this, attr.colorControlHighlight);
        this.c9.p0(ColorStateList.valueOf(v));
        ViewCompat.R1(this, new RippleDrawable(ColorStateList.valueOf(v2), this.c9, this.c9));
    }

    private void m0() {
        this.setNavigationIcon((this.getNavigationIcon() == null ? this.U8 : this.getNavigationIcon()));
        this.setNavigationIconDecorative(true);
    }

    private void n0(@StyleRes int v, String s, String s1) {
        if(v != -1) {
            TextViewCompat.D(this.Q8, v);
        }
        this.setText(s);
        this.setHint(s1);
        if(this.getNavigationIcon() == null) {
            MarginLayoutParamsCompat.h(((ViewGroup.MarginLayoutParams)this.Q8.getLayoutParams()), this.getResources().getDimensionPixelSize(dimen.m3_searchbar_text_margin_start_no_navigation_icon));
        }
    }

    public boolean o0() {
        return this.T8.x();
    }

    @Override  // androidx.appcompat.widget.Toolbar
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        l.f(this, this.c9);
        this.B0();
        this.D0();
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setClassName("android.widget.EditText");
        int v = Build.VERSION.SDK_INT;
        accessibilityNodeInfo0.setEditable(this.isEnabled());
        CharSequence charSequence0 = this.getText();
        boolean z = TextUtils.isEmpty(charSequence0);
        if(v >= 26) {
            accessibilityNodeInfo0.setHintText(this.getHint());
            accessibilityNodeInfo0.setShowingHintText(z);
        }
        if(z) {
            charSequence0 = this.getHint();
        }
        accessibilityNodeInfo0.setText(charSequence0);
    }

    @Override  // androidx.appcompat.widget.Toolbar
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        this.u0();
        this.C0();
    }

    @Override  // androidx.appcompat.widget.Toolbar
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        this.x0(v, v1);
    }

    @Override  // androidx.appcompat.widget.Toolbar
    protected void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).a());
        this.setText(((SavedState)parcelable0).c);
    }

    @Override  // androidx.appcompat.widget.Toolbar
    @NonNull
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        CharSequence charSequence0 = this.getText();
        parcelable0.c = charSequence0 == null ? null : charSequence0.toString();
        return parcelable0;
    }

    public boolean p0() {
        return this.b9;
    }

    public boolean q0() {
        return this.T8.y();
    }

    public boolean r0() {
        return this.T8.z();
    }

    // 检测为 Lambda 实现
    private void s0(boolean z) [...]

    public void setCenterView(@Nullable View view0) {
        View view1 = this.X8;
        if(view1 != null) {
            this.removeView(view1);
            this.X8 = null;
        }
        if(view0 != null) {
            this.addView(view0);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z) {
        this.b9 = z;
        this.D0();
    }

    @Override  // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        k k0 = this.c9;
        if(k0 != null) {
            k0.o0(f);
        }
    }

    public void setHint(@StringRes int v) {
        this.Q8.setHint(v);
    }

    public void setHint(@Nullable CharSequence charSequence0) {
        this.Q8.setHint(charSequence0);
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable0) {
        super.setNavigationIcon(this.w0(drawable0));
    }

    private void setNavigationIconDecorative(boolean z) {
        ImageButton imageButton0 = E.e(this);
        if(imageButton0 == null) {
            return;
        }
        imageButton0.setClickable(!z);
        imageButton0.setFocusable(!z);
        Drawable drawable0 = imageButton0.getBackground();
        if(drawable0 != null) {
            this.Z8 = drawable0;
        }
        imageButton0.setBackgroundDrawable((z ? null : this.Z8));
        this.C0();
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener view$OnClickListener0) {
        if(this.W8) {
            return;
        }
        super.setNavigationOnClickListener(view$OnClickListener0);
        this.setNavigationIconDecorative(view$OnClickListener0 == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z) {
        this.T8.G(z);
    }

    public void setStrokeColor(@ColorInt int v) {
        if(this.getStrokeColor() != v) {
            this.c9.G0(ColorStateList.valueOf(v));
        }
    }

    public void setStrokeWidth(@Dimension float f) {
        if(this.getStrokeWidth() != f) {
            this.c9.J0(f);
        }
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence0) {
    }

    public void setText(@StringRes int v) {
        this.Q8.setText(v);
    }

    public void setText(@Nullable CharSequence charSequence0) {
        this.Q8.setText(charSequence0);
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence0) {
    }

    // 检测为 Lambda 实现
    private void t0() [...]

    private void u0() {
        View view0 = this.X8;
        if(view0 == null) {
            return;
        }
        int v = view0.getMeasuredWidth();
        int v1 = this.getMeasuredWidth() / 2 - v / 2;
        int v2 = this.X8.getMeasuredHeight();
        int v3 = this.getMeasuredHeight() / 2 - v2 / 2;
        this.v0(this.X8, v1, v3, v1 + v, v3 + v2);
    }

    private void v0(View view0, int v, int v1, int v2, int v3) {
        if(ViewCompat.e0(this) == 1) {
            view0.layout(this.getMeasuredWidth() - v2, v1, this.getMeasuredWidth() - v, v3);
            return;
        }
        view0.layout(v, v1, v2, v3);
    }

    @Nullable
    private Drawable w0(@Nullable Drawable drawable0) {
        if(this.V8 && drawable0 != null) {
            Integer integer0 = this.Y8;
            int v = integer0 == null ? v.d(this, (drawable0 == this.U8 ? attr.colorOnSurfaceVariant : attr.colorOnSurface)) : ((int)integer0);
            drawable0 = DrawableCompat.r(drawable0.mutate());
            DrawableCompat.n(drawable0, v);
        }
        return drawable0;
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void x(@MenuRes int v) {
        Menu menu0 = this.getMenu();
        if(menu0 instanceof MenuBuilder) {
            ((MenuBuilder)menu0).n0();
        }
        super.x(v);
        this.a9 = v;
        if(menu0 instanceof MenuBuilder) {
            ((MenuBuilder)menu0).m0();
        }
    }

    private void x0(int v, int v1) {
        View view0 = this.X8;
        if(view0 != null) {
            view0.measure(v, v1);
        }
    }

    public boolean y0(@NonNull AnimatorListenerAdapter animatorListenerAdapter0) {
        return this.T8.D(animatorListenerAdapter0);
    }

    public boolean z0(@NonNull AnimatorListenerAdapter animatorListenerAdapter0) {
        return this.T8.E(animatorListenerAdapter0);
    }
}

