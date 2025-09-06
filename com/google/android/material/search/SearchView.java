package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.activity.BackEventCompat;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.Toolbar.OnMenuItemClickListener;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.color.v;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.D;
import com.google.android.material.internal.E;
import com.google.android.material.internal.M.e;
import com.google.android.material.internal.M;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.i;
import com.google.android.material.motion.b;
import com.google.android.material.motion.h;
import com.google.android.material.shape.l;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class SearchView extends FrameLayout implements AttachedBehavior, b {
    public static class Behavior extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior {
        public Behavior() {
        }

        public Behavior(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }

        public boolean N(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull SearchView searchView0, @NonNull View view0) {
            if(!searchView0.D() && view0 instanceof SearchBar) {
                searchView0.setupWithSearchBar(((SearchBar)view0));
            }
            return false;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public boolean p(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1) {
            return this.N(coordinatorLayout0, ((SearchView)view0), view1);
        }
    }

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
        int d;

        static {
            SavedState.CREATOR = new a();
        }

        public SavedState(Parcel parcel0) {
            this(parcel0, null);
        }

        public SavedState(Parcel parcel0, @Nullable ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.c = parcel0.readString();
            this.d = parcel0.readInt();
        }

        public SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeString(this.c);
            parcel0.writeInt(this.d);
        }
    }

    public interface com.google.android.material.search.SearchView.b {
        void a(@NonNull SearchView arg1, @NonNull c arg2, @NonNull c arg3);
    }

    public static enum c {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN;

    }

    private boolean A;
    @NonNull
    private c B;
    private Map C;
    private static final long D = 100L;
    private static final int E;
    final View a;
    final ClippableRoundedCornerLayout b;
    final View c;
    final View d;
    final FrameLayout e;
    final FrameLayout f;
    final MaterialToolbar g;
    final Toolbar h;
    final TextView i;
    final EditText j;
    final ImageButton k;
    final View l;
    final TouchObserverFrameLayout m;
    private final boolean n;
    private final F o;
    @NonNull
    private final com.google.android.material.motion.c p;
    private final boolean q;
    private final F1.a r;
    private final Set s;
    @Nullable
    private SearchBar t;
    private int u;
    private boolean v;
    private boolean w;
    private boolean x;
    @ColorInt
    private final int y;
    private boolean z;

    static {
        SearchView.E = style.Widget_Material3_SearchView;
    }

    public SearchView(@NonNull Context context0) {
        this(context0, null);
    }

    public SearchView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.materialSearchViewStyle);
    }

    public SearchView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(I1.a.c(context0, attributeSet0, v, SearchView.E), attributeSet0, v);
        this.p = new com.google.android.material.motion.c(this);
        this.s = new LinkedHashSet();
        this.u = 16;
        this.B = c.b;
        Context context1 = this.getContext();
        TypedArray typedArray0 = D.k(context1, attributeSet0, styleable.SearchView, v, SearchView.E, new int[0]);
        this.y = typedArray0.getColor(styleable.SearchView_backgroundTint, 0);
        int v1 = typedArray0.getResourceId(styleable.SearchView_headerLayout, -1);
        int v2 = typedArray0.getResourceId(styleable.SearchView_android_textAppearance, -1);
        String s = typedArray0.getString(styleable.SearchView_android_text);
        String s1 = typedArray0.getString(styleable.SearchView_android_hint);
        String s2 = typedArray0.getString(styleable.SearchView_searchPrefixText);
        boolean z = typedArray0.getBoolean(styleable.SearchView_useDrawerArrowDrawable, false);
        this.v = typedArray0.getBoolean(styleable.SearchView_animateNavigationIcon, true);
        this.w = typedArray0.getBoolean(styleable.SearchView_animateMenuItems, true);
        boolean z1 = typedArray0.getBoolean(styleable.SearchView_hideNavigationIcon, false);
        this.x = typedArray0.getBoolean(styleable.SearchView_autoShowKeyboard, true);
        this.q = typedArray0.getBoolean(styleable.SearchView_backHandlingEnabled, true);
        typedArray0.recycle();
        LayoutInflater.from(context1).inflate(layout.mtrl_search_view, this);
        this.n = true;
        this.a = this.findViewById(id.open_search_view_scrim);
        this.b = (ClippableRoundedCornerLayout)this.findViewById(id.open_search_view_root);
        this.c = this.findViewById(id.open_search_view_background);
        this.d = this.findViewById(id.open_search_view_status_bar_spacer);
        this.e = (FrameLayout)this.findViewById(id.open_search_view_header_container);
        this.f = (FrameLayout)this.findViewById(id.open_search_view_toolbar_container);
        this.g = (MaterialToolbar)this.findViewById(id.open_search_view_toolbar);
        this.h = (Toolbar)this.findViewById(id.open_search_view_dummy_toolbar);
        this.i = (TextView)this.findViewById(id.open_search_view_search_prefix);
        this.j = (EditText)this.findViewById(id.open_search_view_edit_text);
        this.k = (ImageButton)this.findViewById(id.open_search_view_clear_button);
        this.l = this.findViewById(id.open_search_view_divider);
        this.m = (TouchObserverFrameLayout)this.findViewById(id.open_search_view_content_container);
        this.o = new F(this);
        this.r = new F1.a(context1);
        this.d0();
        this.X();
        this.setUpHeaderLayout(v1);
        this.setSearchPrefixText(s2);
        this.b0(v2, s, s1);
        this.W(z, z1);
        this.Y();
        this.Z();
        this.c0();
    }

    // 去混淆评级： 低(20)
    private boolean A() {
        return this.B.equals(c.b) || this.B.equals(c.a);
    }

    public boolean B() {
        return this.w;
    }

    private boolean C(@NonNull Toolbar toolbar0) {
        return DrawableCompat.q(toolbar0.getNavigationIcon()) instanceof DrawerArrowDrawable;
    }

    public boolean D() {
        return this.t != null;
    }

    // 去混淆评级： 低(20)
    public boolean E() {
        return this.B.equals(c.d) || this.B.equals(c.c);
    }

    @RestrictTo({Scope.b})
    public boolean F() {
        return this.z;
    }

    // 检测为 Lambda 实现
    private void G() [...]

    // 检测为 Lambda 实现
    private void H() [...]

    // 检测为 Lambda 实现
    private void I(View view0) [...]

    // 检测为 Lambda 实现
    private void J(View view0) [...]

    // 检测为 Lambda 实现
    private boolean K(View view0, MotionEvent motionEvent0) [...]

    // 检测为 Lambda 实现
    private static WindowInsetsCompat L(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v, int v1, View view0, WindowInsetsCompat windowInsetsCompat0) [...]

    private static boolean M(View view0, MotionEvent motionEvent0) [...] // Inlined contents

    // 检测为 Lambda 实现
    private WindowInsetsCompat N(View view0, WindowInsetsCompat windowInsetsCompat0) [...]

    // 检测为 Lambda 实现
    private WindowInsetsCompat O(View view0, WindowInsetsCompat windowInsetsCompat0, e m$e0) [...]

    // 检测为 Lambda 实现
    private void P(View view0) [...]

    public void Q() {
        this.e.removeAllViews();
        this.e.setVisibility(8);
    }

    public void R(@NonNull View view0) {
        this.e.removeView(view0);
        if(this.e.getChildCount() == 0) {
            this.e.setVisibility(8);
        }
    }

    public void S(@NonNull com.google.android.material.search.SearchView.b searchView$b0) {
        this.s.remove(searchView$b0);
    }

    public void T() {
        q q0 = () -> {
            if(this.j.requestFocus()) {
                this.j.sendAccessibilityEvent(8);
            }
            M.C(this.j, this.z);
        };
        this.j.postDelayed(q0, 100L);
    }

    void U() {
        if(this.x) {
            this.T();
        }
    }

    private void V(@NonNull c searchView$c0, boolean z) {
        if(this.B.equals(searchView$c0)) {
            return;
        }
        if(z) {
            if(searchView$c0 == c.d) {
                this.setModalForAccessibility(true);
            }
            else if(searchView$c0 == c.b) {
                this.setModalForAccessibility(false);
            }
        }
        c searchView$c1 = this.B;
        this.B = searchView$c0;
        for(Object object0: new LinkedHashSet(this.s)) {
            ((com.google.android.material.search.SearchView.b)object0).a(this, searchView$c1, searchView$c0);
        }
        this.i0(searchView$c0);
    }

    private void W(boolean z, boolean z1) {
        if(z1) {
            this.g.setNavigationIcon(null);
            return;
        }
        m m0 = (View view0) -> this.v();
        this.g.setNavigationOnClickListener(m0);
        if(z) {
            DrawerArrowDrawable drawerArrowDrawable0 = new DrawerArrowDrawable(this.getContext());
            drawerArrowDrawable0.p(v.d(this, attr.colorOnSurface));
            this.g.setNavigationIcon(drawerArrowDrawable0);
        }
    }

    private void X() {
        this.setUpBackgroundViewElevationOverlay(this.getOverlayElevation());
    }

    private void Y() {
        class com.google.android.material.search.SearchView.a implements TextWatcher {
            final SearchView a;

            @Override  // android.text.TextWatcher
            public void afterTextChanged(Editable editable0) {
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
                int v3 = charSequence0.length() <= 0 ? 8 : 0;
                SearchView.this.k.setVisibility(v3);
            }
        }

        o o0 = (View view0) -> {
            this.u();
            this.U();
        };
        this.k.setOnClickListener(o0);
        com.google.android.material.search.SearchView.a searchView$a0 = new com.google.android.material.search.SearchView.a(this);
        this.j.addTextChangedListener(searchView$a0);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void Z() {
        w w0 = (View view0, MotionEvent motionEvent0) -> {
            if(this.x()) {
                this.t();
            }
            return false;
        };
        this.m.setOnTouchListener(w0);
    }

    private void a0() {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.l.getLayoutParams();
        p p0 = (View view0, WindowInsetsCompat windowInsetsCompat0) -> {
            viewGroup$MarginLayoutParams0.leftMargin = viewGroup$MarginLayoutParams0.leftMargin + windowInsetsCompat0.p();
            viewGroup$MarginLayoutParams0.rightMargin = viewGroup$MarginLayoutParams0.rightMargin + windowInsetsCompat0.q();
            return windowInsetsCompat0;
        };
        ViewCompat.m2(this.l, p0);
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(this.n) {
            this.m.addView(view0, v, viewGroup$LayoutParams0);
            return;
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    @Override  // com.google.android.material.motion.b
    public void b(@NonNull BackEventCompat backEventCompat0) {
        if(!this.A() && this.t != null) {
            this.o.a0(backEventCompat0);
        }
    }

    private void b0(@StyleRes int v, String s, String s1) {
        if(v != -1) {
            TextViewCompat.D(this.j, v);
        }
        this.j.setText(s);
        this.j.setHint(s1);
    }

    @Override  // com.google.android.material.motion.b
    public void c(@NonNull BackEventCompat backEventCompat0) {
        if(!this.A() && this.t != null && Build.VERSION.SDK_INT >= 34) {
            this.o.f0(backEventCompat0);
        }
    }

    private void c0() {
        this.f0();
        this.a0();
        this.e0();
    }

    @Override  // com.google.android.material.motion.b
    public void d() {
        if(this.A()) {
            return;
        }
        BackEventCompat backEventCompat0 = this.o.S();
        if(Build.VERSION.SDK_INT >= 34 && this.t != null && backEventCompat0 != null) {
            this.o.p();
            return;
        }
        this.v();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void d0() {
        com.google.android.material.search.v v0 = (View view0, MotionEvent motionEvent0) -> true;
        this.b.setOnTouchListener(v0);
    }

    private void e0() {
        this.setUpStatusBarSpacer(this.getStatusBarHeight());
        s s0 = (View view0, WindowInsetsCompat windowInsetsCompat0) -> {
            int v = windowInsetsCompat0.r();
            this.setUpStatusBarSpacer(v);
            if(!this.A) {
                this.setStatusBarSpacerEnabledInternal(v > 0);
            }
            return windowInsetsCompat0;
        };
        ViewCompat.m2(this.d, s0);
    }

    @Override  // com.google.android.material.motion.b
    public void f() {
        if(!this.A() && this.t != null && Build.VERSION.SDK_INT >= 34) {
            this.o.o();
        }
    }

    private void f0() {
        r r0 = (View view0, WindowInsetsCompat windowInsetsCompat0, e m$e0) -> {
            boolean z = M.s(this.g);
            int v = z ? m$e0.c : m$e0.a;
            int v1 = z ? m$e0.a : m$e0.c;
            int v2 = windowInsetsCompat0.p();
            int v3 = m$e0.b;
            int v4 = windowInsetsCompat0.q();
            this.g.setPadding(v + v2, v3, v1 + v4, m$e0.d);
            return windowInsetsCompat0;
        };
        M.h(this.g, r0);
    }

    // 检测为 Lambda 实现
    public void g0() [...]

    @Nullable
    private Window getActivityWindow() {
        Activity activity0 = com.google.android.material.internal.c.a(this.getContext());
        return activity0 == null ? null : activity0.getWindow();
    }

    @VisibleForTesting
    h getBackHelper() {
        return this.o.r();
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$AttachedBehavior
    @NonNull
    public androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior getBehavior() {
        return new Behavior();
    }

    @NonNull
    public c getCurrentTransitionState() {
        return this.B;
    }

    @DrawableRes
    @RestrictTo({Scope.b})
    protected int getDefaultNavigationIconResource() [...] // 潜在的解密器

    @NonNull
    public EditText getEditText() {
        return this.j;
    }

    @Nullable
    public CharSequence getHint() {
        return this.j.getHint();
    }

    private float getOverlayElevation() {
        SearchBar searchBar0 = this.t;
        return searchBar0 == null ? this.getResources().getDimension(dimen.m3_searchview_elevation) : searchBar0.getCompatElevation();
    }

    @NonNull
    public TextView getSearchPrefix() {
        return this.i;
    }

    @Nullable
    public CharSequence getSearchPrefixText() {
        return this.i.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.u;
    }

    @Px
    private int getStatusBarHeight() {
        int v = this.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return v <= 0 ? 0 : this.getResources().getDimensionPixelSize(v);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @NonNull
    public Editable getText() {
        return this.j.getText();
    }

    @NonNull
    public Toolbar getToolbar() {
        return this.g;
    }

    @SuppressLint({"InlinedApi"})
    private void h0(ViewGroup viewGroup0, boolean z) {
        for(int v = 0; v < viewGroup0.getChildCount(); ++v) {
            View view0 = viewGroup0.getChildAt(v);
            if(view0 != this) {
                if(view0.findViewById(this.b.getId()) != null) {
                    this.h0(((ViewGroup)view0), z);
                }
                else if(z) {
                    this.C.put(view0, view0.getImportantForAccessibility());
                    ViewCompat.b2(view0, 4);
                }
                else if(this.C != null && this.C.containsKey(view0)) {
                    ViewCompat.b2(view0, ((int)(((Integer)this.C.get(view0)))));
                }
            }
        }
    }

    private void i0(@NonNull c searchView$c0) {
        if(this.t != null && this.q) {
            if(searchView$c0.equals(c.d)) {
                this.p.c();
                return;
            }
            if(searchView$c0.equals(c.b)) {
                this.p.f();
            }
        }
    }

    private void j0() {
        MaterialToolbar materialToolbar0 = this.g;
        if(materialToolbar0 == null) {
            return;
        }
        if(this.C(materialToolbar0)) {
            return;
        }
        if(this.t == null) {
            this.g.setNavigationIcon(0x7F08022E);  // drawable:ic_arrow_back_black_24
            return;
        }
        Drawable drawable0 = DrawableCompat.r(AppCompatResources.b(this.getContext(), 0x7F08022E).mutate());  // drawable:ic_arrow_back_black_24
        if(this.g.getNavigationIconTint() != null) {
            DrawableCompat.n(drawable0, ((int)this.g.getNavigationIconTint()));
        }
        i i0 = new i(this.t.getNavigationIcon(), drawable0);
        this.g.setNavigationIcon(i0);
        this.k0();
    }

    private void k0() {
        ImageButton imageButton0 = E.e(this.g);
        if(imageButton0 == null) {
            return;
        }
        int v = this.b.getVisibility() == 0 ? 1 : 0;
        Drawable drawable0 = DrawableCompat.q(imageButton0.getDrawable());
        if(drawable0 instanceof DrawerArrowDrawable) {
            ((DrawerArrowDrawable)drawable0).setProgress(((float)v));
        }
        if(drawable0 instanceof i) {
            ((i)drawable0).a(((float)v));
        }
    }

    public void l0() {
        Window window0 = this.getActivityWindow();
        if(window0 != null) {
            this.u = window0.getAttributes().softInputMode;
        }
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        l.e(this);
    }

    @Override  // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.l0();
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).a());
        this.setText(((SavedState)parcelable0).c);
        this.setVisible(((SavedState)parcelable0).d == 0);
    }

    @Override  // android.view.View
    @NonNull
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        Editable editable0 = this.getText();
        parcelable0.c = editable0 == null ? null : editable0.toString();
        parcelable0.d = this.b.getVisibility();
        return parcelable0;
    }

    // 检测为 Lambda 实现
    public static boolean p(View view0, MotionEvent motionEvent0) [...]

    public void r(@NonNull View view0) {
        this.e.addView(view0);
        this.e.setVisibility(0);
    }

    public void s(@NonNull com.google.android.material.search.SearchView.b searchView$b0) {
        this.s.add(searchView$b0);
    }

    public void setAnimatedNavigationIcon(boolean z) {
        this.v = z;
    }

    public void setAutoShowKeyboard(boolean z) {
        this.x = z;
    }

    @Override  // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        this.setUpBackgroundViewElevationOverlay(f);
    }

    public void setHint(@StringRes int v) {
        this.j.setHint(v);
    }

    public void setHint(@Nullable CharSequence charSequence0) {
        this.j.setHint(charSequence0);
    }

    public void setMenuItemsAnimated(boolean z) {
        this.w = z;
    }

    public void setModalForAccessibility(boolean z) {
        ViewGroup viewGroup0 = (ViewGroup)this.getRootView();
        if(z) {
            this.C = new HashMap(viewGroup0.getChildCount());
        }
        this.h0(viewGroup0, z);
        if(!z) {
            this.C = null;
        }
    }

    public void setOnMenuItemClickListener(@Nullable OnMenuItemClickListener toolbar$OnMenuItemClickListener0) {
        this.g.setOnMenuItemClickListener(toolbar$OnMenuItemClickListener0);
    }

    public void setSearchPrefixText(@Nullable CharSequence charSequence0) {
        this.i.setText(charSequence0);
        int v = TextUtils.isEmpty(charSequence0) ? 8 : 0;
        this.i.setVisibility(v);
    }

    @RestrictTo({Scope.b})
    public void setStatusBarSpacerEnabled(boolean z) {
        this.A = true;
        this.setStatusBarSpacerEnabledInternal(z);
    }

    private void setStatusBarSpacerEnabledInternal(boolean z) {
        this.d.setVisibility((z ? 0 : 8));
    }

    public void setText(@StringRes int v) {
        this.j.setText(v);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(@Nullable CharSequence charSequence0) {
        this.j.setText(charSequence0);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z) {
        this.g.setTouchscreenBlocksFocus(z);
    }

    void setTransitionState(@NonNull c searchView$c0) {
        this.V(searchView$c0, true);
    }

    private void setUpBackgroundViewElevationOverlay(float f) {
        F1.a a0 = this.r;
        if(a0 != null && this.c != null) {
            int v = a0.e(this.y, f);
            this.c.setBackgroundColor(v);
        }
    }

    private void setUpHeaderLayout(int v) {
        if(v != -1) {
            this.r(LayoutInflater.from(this.getContext()).inflate(v, this.e, false));
        }
    }

    private void setUpStatusBarSpacer(@Px int v) {
        if(this.d.getLayoutParams().height != v) {
            this.d.getLayoutParams().height = v;
            this.d.requestLayout();
        }
    }

    @RestrictTo({Scope.b})
    public void setUseWindowInsetsController(boolean z) {
        this.z = z;
    }

    public void setVisible(boolean z) {
        boolean z1 = true;
        boolean z2 = this.b.getVisibility() == 0;
        this.b.setVisibility((z ? 0 : 8));
        this.k0();
        c searchView$c0 = z ? c.d : c.b;
        if(z2 == z) {
            z1 = false;
        }
        this.V(searchView$c0, z1);
    }

    public void setupWithSearchBar(@Nullable SearchBar searchBar0) {
        this.t = searchBar0;
        this.o.X(searchBar0);
        if(searchBar0 != null) {
            searchBar0.setOnClickListener((View view0) -> this.g0());
            if(Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar0.setHandwritingDelegatorCallback(() -> if(!this.B.equals(c.d) && !this.B.equals(c.c)) {
                        this.o.Z();
                    });
                    this.j.setIsHandwritingDelegate(true);
                }
                catch(LinkageError unused_ex) {
                }
            }
        }
        this.j0();
        this.X();
        this.i0(this.getCurrentTransitionState());
    }

    public void t() {
        n n0 = () -> {
            this.j.clearFocus();
            SearchBar searchBar0 = this.t;
            if(searchBar0 != null) {
                searchBar0.requestFocus();
            }
            M.r(this.j, this.z);
        };
        this.j.post(n0);
    }

    public void u() {
        this.j.setText("");
    }

    public void v() {
        if(!this.B.equals(c.b) && !this.B.equals(c.a)) {
            this.o.M();
        }
    }

    public void w(@MenuRes int v) {
        this.g.x(v);
    }

    boolean x() {
        return this.u == 0x30;
    }

    public boolean y() {
        return this.v;
    }

    public boolean z() {
        return this.x;
    }
}

