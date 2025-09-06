package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.MainThread;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.styleable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.core.view.GravityCompat;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleOwner;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup implements MenuHost {
    @RequiresApi(33)
    static class Api33Impl {
        @DoNotInline
        @Nullable
        static OnBackInvokedDispatcher a(@NonNull View view0) {
            return view0.findOnBackInvokedDispatcher();
        }

        @DoNotInline
        @NonNull
        static OnBackInvokedCallback b(@NonNull Runnable runnable0) {
            Objects.requireNonNull(runnable0);
            return new T(runnable0);
        }

        @DoNotInline
        static void c(@NonNull Object object0, @NonNull Object object1) {
            ((OnBackInvokedDispatcher)object0).registerOnBackInvokedCallback(1000000, ((OnBackInvokedCallback)object1));
        }

        @DoNotInline
        static void d(@NonNull Object object0, @NonNull Object object1) {
            ((OnBackInvokedDispatcher)object0).unregisterOnBackInvokedCallback(((OnBackInvokedCallback)object1));
        }
    }

    class ExpandedActionViewMenuPresenter implements MenuPresenter {
        MenuBuilder a;
        MenuItemImpl b;
        final Toolbar c;

        @Override  // androidx.appcompat.view.menu.MenuPresenter
        public Parcelable a() {
            return null;
        }

        @Override  // androidx.appcompat.view.menu.MenuPresenter
        public void c(MenuBuilder menuBuilder0, boolean z) {
        }

        @Override  // androidx.appcompat.view.menu.MenuPresenter
        public void d(Parcelable parcelable0) {
        }

        @Override  // androidx.appcompat.view.menu.MenuPresenter
        public boolean e(MenuBuilder menuBuilder0, MenuItemImpl menuItemImpl0) {
            Toolbar.this.g();
            ViewParent viewParent0 = Toolbar.this.h.getParent();
            Toolbar toolbar0 = Toolbar.this;
            if(viewParent0 != toolbar0) {
                if(viewParent0 instanceof ViewGroup) {
                    ((ViewGroup)viewParent0).removeView(toolbar0.h);
                }
                Toolbar.this.addView(Toolbar.this.h);
            }
            Toolbar.this.i = menuItemImpl0.getActionView();
            this.b = menuItemImpl0;
            ViewParent viewParent1 = Toolbar.this.i.getParent();
            Toolbar toolbar1 = Toolbar.this;
            if(viewParent1 != toolbar1) {
                if(viewParent1 instanceof ViewGroup) {
                    ((ViewGroup)viewParent1).removeView(toolbar1.i);
                }
                LayoutParams toolbar$LayoutParams0 = Toolbar.this.m();
                toolbar$LayoutParams0.a = Toolbar.this.n & 0x70 | 0x800003;
                toolbar$LayoutParams0.b = 2;
                Toolbar.this.i.setLayoutParams(toolbar$LayoutParams0);
                Toolbar.this.addView(Toolbar.this.i);
            }
            Toolbar.this.J();
            Toolbar.this.requestLayout();
            menuItemImpl0.t(true);
            View view0 = Toolbar.this.i;
            if(view0 instanceof CollapsibleActionView) {
                ((CollapsibleActionView)view0).c();
            }
            Toolbar.this.U();
            return true;
        }

        @Override  // androidx.appcompat.view.menu.MenuPresenter
        public void f(boolean z) {
            if(this.b != null) {
                MenuBuilder menuBuilder0 = this.a;
                if(menuBuilder0 != null) {
                    int v = menuBuilder0.size();
                    for(int v1 = 0; v1 < v; ++v1) {
                        if(this.a.getItem(v1) == this.b) {
                            return;
                        }
                    }
                }
                this.h(this.a, this.b);
            }
        }

        @Override  // androidx.appcompat.view.menu.MenuPresenter
        public boolean g() {
            return false;
        }

        @Override  // androidx.appcompat.view.menu.MenuPresenter
        public int getId() {
            return 0;
        }

        @Override  // androidx.appcompat.view.menu.MenuPresenter
        public boolean h(MenuBuilder menuBuilder0, MenuItemImpl menuItemImpl0) {
            View view0 = Toolbar.this.i;
            if(view0 instanceof CollapsibleActionView) {
                ((CollapsibleActionView)view0).b();
            }
            Toolbar.this.removeView(Toolbar.this.i);
            Toolbar.this.removeView(Toolbar.this.h);
            Toolbar.this.i = null;
            Toolbar.this.a();
            this.b = null;
            Toolbar.this.requestLayout();
            menuItemImpl0.t(false);
            Toolbar.this.U();
            return true;
        }

        @Override  // androidx.appcompat.view.menu.MenuPresenter
        public void i(Context context0, MenuBuilder menuBuilder0) {
            MenuBuilder menuBuilder1 = this.a;
            if(menuBuilder1 != null) {
                MenuItemImpl menuItemImpl0 = this.b;
                if(menuItemImpl0 != null) {
                    menuBuilder1.g(menuItemImpl0);
                }
            }
            this.a = menuBuilder0;
        }

        @Override  // androidx.appcompat.view.menu.MenuPresenter
        public void k(Callback menuPresenter$Callback0) {
        }

        @Override  // androidx.appcompat.view.menu.MenuPresenter
        public boolean l(SubMenuBuilder subMenuBuilder0) {
            return false;
        }

        @Override  // androidx.appcompat.view.menu.MenuPresenter
        public MenuView m(ViewGroup viewGroup0) {
            return null;
        }
    }

    public static class LayoutParams extends androidx.appcompat.app.ActionBar.LayoutParams {
        int b;
        static final int c = 0;
        static final int d = 1;
        static final int e = 2;

        public LayoutParams(int v) {
            this(-2, -1, v);
        }

        public LayoutParams(int v, int v1) {
            super(v, v1);
            this.b = 0;
            this.a = 0x800013;
        }

        public LayoutParams(int v, int v1, int v2) {
            super(v, v1);
            this.b = 0;
            this.a = v2;
        }

        public LayoutParams(@NonNull Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.b = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.b = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
            this.b = 0;
            this.a(viewGroup$MarginLayoutParams0);
        }

        public LayoutParams(androidx.appcompat.app.ActionBar.LayoutParams actionBar$LayoutParams0) {
            super(actionBar$LayoutParams0);
            this.b = 0;
        }

        public LayoutParams(LayoutParams toolbar$LayoutParams0) {
            super(toolbar$LayoutParams0);
            this.b = toolbar$LayoutParams0.b;
        }

        void a(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            this.leftMargin = viewGroup$MarginLayoutParams0.leftMargin;
            this.topMargin = viewGroup$MarginLayoutParams0.topMargin;
            this.rightMargin = viewGroup$MarginLayoutParams0.rightMargin;
            this.bottomMargin = viewGroup$MarginLayoutParams0.bottomMargin;
        }
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem arg1);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR;
        int c;
        boolean d;

        static {
            SavedState.CREATOR = new Parcelable.ClassLoaderCreator() {
                public SavedState a(Parcel parcel0) {
                    return new SavedState(parcel0, null);
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
            };
        }

        public SavedState(Parcel parcel0) {
            this(parcel0, null);
        }

        public SavedState(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.c = parcel0.readInt();
            this.d = parcel0.readInt() != 0;
        }

        public SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(this.c);
            parcel0.writeInt(((int)this.d));
        }
    }

    private ColorStateList A;
    private boolean B;
    private boolean C;
    private final ArrayList D;
    private final ArrayList E;
    private final int[] F;
    final MenuHostHelper G;
    private ArrayList H;
    OnMenuItemClickListener I;
    private final androidx.appcompat.widget.ActionMenuView.OnMenuItemClickListener J;
    private ToolbarWidgetWrapper K;
    private ActionMenuPresenter L;
    private ExpandedActionViewMenuPresenter M;
    private OnBackInvokedDispatcher M8;
    private Callback N;
    private boolean N8;
    androidx.appcompat.view.menu.MenuBuilder.Callback O;
    private final Runnable O8;
    private boolean P;
    private static final String P8 = "Toolbar";
    private OnBackInvokedCallback Q;
    ActionMenuView a;
    private TextView b;
    private TextView c;
    private ImageButton d;
    private ImageView e;
    private Drawable f;
    private CharSequence g;
    ImageButton h;
    View i;
    private Context j;
    private int k;
    private int l;
    private int m;
    int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private RtlSpacingHelper t;
    private int u;
    private int v;
    private int w;
    private CharSequence x;
    private CharSequence y;
    private ColorStateList z;

    public Toolbar(@NonNull Context context0) {
        this(context0, null);
    }

    public Toolbar(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.toolbarStyle);
    }

    public Toolbar(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.w = 0x800013;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new int[2];
        this.G = new MenuHostHelper(() -> {
            for(Object object0: this.H) {
                this.getMenu().removeItem(((MenuItem)object0).getItemId());
            }
            this.H();
        });
        this.H = new ArrayList();
        this.J = new androidx.appcompat.widget.ActionMenuView.OnMenuItemClickListener() {
            final Toolbar a;

            @Override  // androidx.appcompat.widget.ActionMenuView$OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem0) {
                if(Toolbar.this.G.j(menuItem0)) {
                    return true;
                }
                OnMenuItemClickListener toolbar$OnMenuItemClickListener0 = Toolbar.this.I;
                return toolbar$OnMenuItemClickListener0 == null ? false : toolbar$OnMenuItemClickListener0.onMenuItemClick(menuItem0);
            }
        };
        this.O8 = () -> Toolbar.this.a != null && Toolbar.this.a.T();
        TintTypedArray tintTypedArray0 = TintTypedArray.G(this.getContext(), attributeSet0, styleable.Toolbar, v, 0);
        ViewCompat.H1(this, context0, styleable.Toolbar, attributeSet0, tintTypedArray0.B(), v, 0);
        this.l = tintTypedArray0.u(styleable.Toolbar_titleTextAppearance, 0);
        this.m = tintTypedArray0.u(styleable.Toolbar_subtitleTextAppearance, 0);
        this.w = tintTypedArray0.p(styleable.Toolbar_android_gravity, this.w);
        this.n = tintTypedArray0.p(styleable.Toolbar_buttonGravity, 0x30);
        int v1 = tintTypedArray0.f(styleable.Toolbar_titleMargin, 0);
        if(tintTypedArray0.C(styleable.Toolbar_titleMargins)) {
            v1 = tintTypedArray0.f(27, v1);
        }
        this.s = v1;
        this.r = v1;
        this.q = v1;
        this.p = v1;
        int v2 = tintTypedArray0.f(styleable.Toolbar_titleMarginStart, -1);
        if(v2 >= 0) {
            this.p = v2;
        }
        int v3 = tintTypedArray0.f(styleable.Toolbar_titleMarginEnd, -1);
        if(v3 >= 0) {
            this.q = v3;
        }
        int v4 = tintTypedArray0.f(styleable.Toolbar_titleMarginTop, -1);
        if(v4 >= 0) {
            this.r = v4;
        }
        int v5 = tintTypedArray0.f(styleable.Toolbar_titleMarginBottom, -1);
        if(v5 >= 0) {
            this.s = v5;
        }
        this.o = tintTypedArray0.g(styleable.Toolbar_maxButtonHeight, -1);
        int v6 = tintTypedArray0.f(styleable.Toolbar_contentInsetStart, 0x80000000);
        int v7 = tintTypedArray0.f(styleable.Toolbar_contentInsetEnd, 0x80000000);
        int v8 = tintTypedArray0.g(styleable.Toolbar_contentInsetLeft, 0);
        int v9 = tintTypedArray0.g(styleable.Toolbar_contentInsetRight, 0);
        this.h();
        this.t.e(v8, v9);
        if(v6 != 0x80000000 || v7 != 0x80000000) {
            this.t.g(v6, v7);
        }
        this.u = tintTypedArray0.f(styleable.Toolbar_contentInsetStartWithNavigation, 0x80000000);
        this.v = tintTypedArray0.f(styleable.Toolbar_contentInsetEndWithActions, 0x80000000);
        this.f = tintTypedArray0.h(styleable.Toolbar_collapseIcon);
        this.g = tintTypedArray0.x(styleable.Toolbar_collapseContentDescription);
        CharSequence charSequence0 = tintTypedArray0.x(styleable.Toolbar_title);
        if(!TextUtils.isEmpty(charSequence0)) {
            this.setTitle(charSequence0);
        }
        CharSequence charSequence1 = tintTypedArray0.x(styleable.Toolbar_subtitle);
        if(!TextUtils.isEmpty(charSequence1)) {
            this.setSubtitle(charSequence1);
        }
        this.j = this.getContext();
        this.setPopupTheme(tintTypedArray0.u(styleable.Toolbar_popupTheme, 0));
        Drawable drawable0 = tintTypedArray0.h(styleable.Toolbar_navigationIcon);
        if(drawable0 != null) {
            this.setNavigationIcon(drawable0);
        }
        CharSequence charSequence2 = tintTypedArray0.x(styleable.Toolbar_navigationContentDescription);
        if(!TextUtils.isEmpty(charSequence2)) {
            this.setNavigationContentDescription(charSequence2);
        }
        Drawable drawable1 = tintTypedArray0.h(styleable.Toolbar_logo);
        if(drawable1 != null) {
            this.setLogo(drawable1);
        }
        CharSequence charSequence3 = tintTypedArray0.x(styleable.Toolbar_logoDescription);
        if(!TextUtils.isEmpty(charSequence3)) {
            this.setLogoDescription(charSequence3);
        }
        if(tintTypedArray0.C(styleable.Toolbar_titleTextColor)) {
            this.setTitleTextColor(tintTypedArray0.d(29));
        }
        if(tintTypedArray0.C(styleable.Toolbar_subtitleTextColor)) {
            this.setSubtitleTextColor(tintTypedArray0.d(20));
        }
        if(tintTypedArray0.C(styleable.Toolbar_menu)) {
            this.x(tintTypedArray0.u(14, 0));
        }
        tintTypedArray0.I();
    }

    @RestrictTo({Scope.c})
    public boolean A() {
        return this.a != null && this.a.M();
    }

    public boolean B() {
        return this.a != null && this.a.N();
    }

    @RestrictTo({Scope.c})
    public boolean C() {
        TextView textView0 = this.b;
        if(textView0 == null) {
            return false;
        }
        Layout layout0 = textView0.getLayout();
        if(layout0 == null) {
            return false;
        }
        int v = layout0.getLineCount();
        for(int v1 = 0; v1 < v; ++v1) {
            if(layout0.getEllipsisCount(v1) > 0) {
                return true;
            }
        }
        return false;
    }

    private int D(View view0, int v, int[] arr_v, int v1) {
        LayoutParams toolbar$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        int v2 = toolbar$LayoutParams0.leftMargin - arr_v[0];
        int v3 = v + Math.max(0, v2);
        arr_v[0] = Math.max(0, -v2);
        int v4 = this.q(view0, v1);
        int v5 = view0.getMeasuredWidth();
        view0.layout(v3, v4, v3 + v5, view0.getMeasuredHeight() + v4);
        return v3 + (v5 + toolbar$LayoutParams0.rightMargin);
    }

    private int E(View view0, int v, int[] arr_v, int v1) {
        LayoutParams toolbar$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        int v2 = toolbar$LayoutParams0.rightMargin - arr_v[1];
        int v3 = v - Math.max(0, v2);
        arr_v[1] = Math.max(0, -v2);
        int v4 = this.q(view0, v1);
        int v5 = view0.getMeasuredWidth();
        view0.layout(v3 - v5, v4, v3, view0.getMeasuredHeight() + v4);
        return v3 - (v5 + toolbar$LayoutParams0.leftMargin);
    }

    private int F(View view0, int v, int v1, int v2, int v3, int[] arr_v) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        int v4 = viewGroup$MarginLayoutParams0.leftMargin - arr_v[0];
        int v5 = viewGroup$MarginLayoutParams0.rightMargin - arr_v[1];
        int v6 = Math.max(0, v4) + Math.max(0, v5);
        arr_v[0] = Math.max(0, -v4);
        arr_v[1] = Math.max(0, -v5);
        view0.measure(ViewGroup.getChildMeasureSpec(v, this.getPaddingLeft() + this.getPaddingRight() + v6 + v1, viewGroup$MarginLayoutParams0.width), ViewGroup.getChildMeasureSpec(v2, this.getPaddingTop() + this.getPaddingBottom() + viewGroup$MarginLayoutParams0.topMargin + viewGroup$MarginLayoutParams0.bottomMargin + v3, viewGroup$MarginLayoutParams0.height));
        return view0.getMeasuredWidth() + v6;
    }

    private void G(View view0, int v, int v1, int v2, int v3, int v4) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        int v5 = ViewGroup.getChildMeasureSpec(v, this.getPaddingLeft() + this.getPaddingRight() + viewGroup$MarginLayoutParams0.leftMargin + viewGroup$MarginLayoutParams0.rightMargin + v1, viewGroup$MarginLayoutParams0.width);
        int v6 = ViewGroup.getChildMeasureSpec(v2, this.getPaddingTop() + this.getPaddingBottom() + viewGroup$MarginLayoutParams0.topMargin + viewGroup$MarginLayoutParams0.bottomMargin + v3, viewGroup$MarginLayoutParams0.height);
        int v7 = View.MeasureSpec.getMode(v6);
        if(v7 != 0x40000000 && v4 >= 0) {
            if(v7 != 0) {
                v4 = Math.min(View.MeasureSpec.getSize(v6), v4);
            }
            v6 = View.MeasureSpec.makeMeasureSpec(v4, 0x40000000);
        }
        view0.measure(v5, v6);
    }

    private void H() {
        Menu menu0 = this.getMenu();
        ArrayList arrayList0 = this.getCurrentMenuItems();
        MenuInflater menuInflater0 = this.getMenuInflater();
        this.G.h(menu0, menuInflater0);
        ArrayList arrayList1 = this.getCurrentMenuItems();
        arrayList1.removeAll(arrayList0);
        this.H = arrayList1;
    }

    private void I() {
        this.removeCallbacks(this.O8);
        this.post(this.O8);
    }

    void J() {
        for(int v = this.getChildCount() - 1; v >= 0; --v) {
            View view0 = this.getChildAt(v);
            if(((LayoutParams)view0.getLayoutParams()).b != 2 && view0 != this.a) {
                this.removeViewAt(v);
                this.E.add(view0);
            }
        }
    }

    public void K(int v, int v1) {
        this.h();
        this.t.e(v, v1);
    }

    public void L(int v, int v1) {
        this.h();
        this.t.g(v, v1);
    }

    @RestrictTo({Scope.a})
    public void M(MenuBuilder menuBuilder0, ActionMenuPresenter actionMenuPresenter0) {
        if(menuBuilder0 == null && this.a == null) {
            return;
        }
        this.k();
        MenuBuilder menuBuilder1 = this.a.R();
        if(menuBuilder1 == menuBuilder0) {
            return;
        }
        if(menuBuilder1 != null) {
            menuBuilder1.T(this.L);
            menuBuilder1.T(this.M);
        }
        if(this.M == null) {
            this.M = new ExpandedActionViewMenuPresenter(this);
        }
        actionMenuPresenter0.K(true);
        if(menuBuilder0 == null) {
            actionMenuPresenter0.i(this.j, null);
            this.M.i(this.j, null);
            actionMenuPresenter0.f(true);
            this.M.f(true);
        }
        else {
            menuBuilder0.c(actionMenuPresenter0, this.j);
            menuBuilder0.c(this.M, this.j);
        }
        this.a.setPopupTheme(this.k);
        this.a.setPresenter(actionMenuPresenter0);
        this.L = actionMenuPresenter0;
        this.U();
    }

    @RestrictTo({Scope.c})
    public void N(Callback menuPresenter$Callback0, androidx.appcompat.view.menu.MenuBuilder.Callback menuBuilder$Callback0) {
        this.N = menuPresenter$Callback0;
        this.O = menuBuilder$Callback0;
        ActionMenuView actionMenuView0 = this.a;
        if(actionMenuView0 != null) {
            actionMenuView0.S(menuPresenter$Callback0, menuBuilder$Callback0);
        }
    }

    public void O(Context context0, @StyleRes int v) {
        this.m = v;
        TextView textView0 = this.c;
        if(textView0 != null) {
            textView0.setTextAppearance(context0, v);
        }
    }

    public void P(int v, int v1, int v2, int v3) {
        this.p = v;
        this.r = v1;
        this.q = v2;
        this.s = v3;
        this.requestLayout();
    }

    public void Q(Context context0, @StyleRes int v) {
        this.l = v;
        TextView textView0 = this.b;
        if(textView0 != null) {
            textView0.setTextAppearance(context0, v);
        }
    }

    private boolean R() {
        if(!this.P) {
            return false;
        }
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            if(this.S(view0) && view0.getMeasuredWidth() > 0 && view0.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean S(View view0) {
        return view0 != null && view0.getParent() == this && view0.getVisibility() != 8;
    }

    // 检测为 Lambda 实现
    public boolean T() [...]

    void U() {
        if(Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher0 = Api33Impl.a(this);
            boolean z = this.v() && onBackInvokedDispatcher0 != null && this.isAttachedToWindow() && this.N8;
            if(z && this.M8 == null) {
                if(this.Q == null) {
                    this.Q = Api33Impl.b(() -> {
                        MenuItemImpl menuItemImpl0 = this.M == null ? null : this.M.b;
                        if(menuItemImpl0 != null) {
                            menuItemImpl0.collapseActionView();
                        }
                    });
                }
                Api33Impl.c(onBackInvokedDispatcher0, this.Q);
                this.M8 = onBackInvokedDispatcher0;
                return;
            }
            if(!z) {
                OnBackInvokedDispatcher onBackInvokedDispatcher1 = this.M8;
                if(onBackInvokedDispatcher1 != null) {
                    Api33Impl.d(onBackInvokedDispatcher1, this.Q);
                    this.M8 = null;
                }
            }
        }
    }

    void a() {
        for(int v = this.E.size() - 1; v >= 0; --v) {
            this.addView(((View)this.E.get(v)));
        }
        this.E.clear();
    }

    @Override  // androidx.core.view.MenuHost
    @MainThread
    public void addMenuProvider(@NonNull MenuProvider menuProvider0) {
        this.G.c(menuProvider0);
    }

    @Override  // androidx.core.view.MenuHost
    @MainThread
    public void addMenuProvider(@NonNull MenuProvider menuProvider0, @NonNull LifecycleOwner lifecycleOwner0) {
        this.G.d(menuProvider0, lifecycleOwner0);
    }

    @Override  // androidx.core.view.MenuHost
    @SuppressLint({"LambdaLast"})
    @MainThread
    public void addMenuProvider(@NonNull MenuProvider menuProvider0, @NonNull LifecycleOwner lifecycleOwner0, @NonNull State lifecycle$State0) {
        this.G.e(menuProvider0, lifecycleOwner0, lifecycle$State0);
    }

    private void b(List list0, int v) {
        boolean z = this.getLayoutDirection() == 1;
        int v2 = this.getChildCount();
        int v3 = GravityCompat.d(v, this.getLayoutDirection());
        list0.clear();
        if(z) {
            for(int v4 = v2 - 1; v4 >= 0; --v4) {
                View view0 = this.getChildAt(v4);
                LayoutParams toolbar$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                if(toolbar$LayoutParams0.b == 0 && this.S(view0) && this.p(toolbar$LayoutParams0.a) == v3) {
                    list0.add(view0);
                }
            }
            return;
        }
        for(int v1 = 0; v1 < v2; ++v1) {
            View view1 = this.getChildAt(v1);
            LayoutParams toolbar$LayoutParams1 = (LayoutParams)view1.getLayoutParams();
            if(toolbar$LayoutParams1.b == 0 && this.S(view1) && this.p(toolbar$LayoutParams1.a) == v3) {
                list0.add(view1);
            }
        }
    }

    private void c(View view0, boolean z) {
        LayoutParams toolbar$LayoutParams0;
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            toolbar$LayoutParams0 = this.m();
        }
        else {
            toolbar$LayoutParams0 = this.checkLayoutParams(viewGroup$LayoutParams0) ? ((LayoutParams)viewGroup$LayoutParams0) : this.o(viewGroup$LayoutParams0);
        }
        toolbar$LayoutParams0.b = 1;
        if(z && this.i != null) {
            view0.setLayoutParams(toolbar$LayoutParams0);
            this.E.add(view0);
            return;
        }
        this.addView(view0, toolbar$LayoutParams0);
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return super.checkLayoutParams(viewGroup$LayoutParams0) && viewGroup$LayoutParams0 instanceof LayoutParams;
    }

    @RestrictTo({Scope.c})
    public boolean d() {
        return this.getVisibility() == 0 && (this.a != null && this.a.O());
    }

    // 检测为 Lambda 实现
    public void e() [...]

    public void f() {
        ActionMenuView actionMenuView0 = this.a;
        if(actionMenuView0 != null) {
            actionMenuView0.F();
        }
    }

    void g() {
        if(this.h == null) {
            AppCompatImageButton appCompatImageButton0 = new AppCompatImageButton(this.getContext(), null, attr.toolbarNavigationButtonStyle);
            this.h = appCompatImageButton0;
            appCompatImageButton0.setImageDrawable(this.f);
            this.h.setContentDescription(this.g);
            LayoutParams toolbar$LayoutParams0 = this.m();
            toolbar$LayoutParams0.a = this.n & 0x70 | 0x800003;
            toolbar$LayoutParams0.b = 2;
            this.h.setLayoutParams(toolbar$LayoutParams0);
            this.h.setOnClickListener((/* 缺少LAMBDA参数 */) -> {
                MenuItemImpl menuItemImpl0 = Toolbar.this.M == null ? null : Toolbar.this.M.b;
                if(menuItemImpl0 != null) {
                    menuItemImpl0.collapseActionView();
                }
            });
        }

        class androidx.appcompat.widget.Toolbar.4 implements View.OnClickListener {
            final Toolbar a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                Toolbar.this.e();
            }
        }

    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.m();
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.n(attributeSet0);
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return this.o(viewGroup$LayoutParams0);
    }

    @Nullable
    public CharSequence getCollapseContentDescription() {
        return this.h == null ? null : this.h.getContentDescription();
    }

    @Nullable
    public Drawable getCollapseIcon() {
        return this.h == null ? null : this.h.getDrawable();
    }

    public int getContentInsetEnd() {
        return this.t == null ? 0 : this.t.a();
    }

    public int getContentInsetEndWithActions() {
        return this.v == 0x80000000 ? this.getContentInsetEnd() : this.v;
    }

    public int getContentInsetLeft() {
        return this.t == null ? 0 : this.t.b();
    }

    public int getContentInsetRight() {
        return this.t == null ? 0 : this.t.c();
    }

    public int getContentInsetStart() {
        return this.t == null ? 0 : this.t.d();
    }

    public int getContentInsetStartWithNavigation() {
        return this.u == 0x80000000 ? this.getContentInsetStart() : this.u;
    }

    public int getCurrentContentInsetEnd() {
        ActionMenuView actionMenuView0 = this.a;
        if(actionMenuView0 != null) {
            MenuBuilder menuBuilder0 = actionMenuView0.R();
            return menuBuilder0 == null || !menuBuilder0.hasVisibleItems() ? this.getContentInsetEnd() : Math.max(this.getContentInsetEnd(), Math.max(this.v, 0));
        }
        return this.getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return this.getLayoutDirection() == 1 ? this.getCurrentContentInsetEnd() : this.getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return this.getLayoutDirection() == 1 ? this.getCurrentContentInsetStart() : this.getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return this.getNavigationIcon() == null ? this.getContentInsetStart() : Math.max(this.getContentInsetStart(), Math.max(this.u, 0));
    }

    private ArrayList getCurrentMenuItems() {
        ArrayList arrayList0 = new ArrayList();
        Menu menu0 = this.getMenu();
        for(int v = 0; v < menu0.size(); ++v) {
            arrayList0.add(menu0.getItem(v));
        }
        return arrayList0;
    }

    public Drawable getLogo() {
        return this.e == null ? null : this.e.getDrawable();
    }

    public CharSequence getLogoDescription() {
        return this.e == null ? null : this.e.getContentDescription();
    }

    public Menu getMenu() {
        this.j();
        return this.a.getMenu();
    }

    private MenuInflater getMenuInflater() {
        return new SupportMenuInflater(this.getContext());
    }

    @Nullable
    @VisibleForTesting
    View getNavButtonView() {
        return this.d;
    }

    @Nullable
    public CharSequence getNavigationContentDescription() {
        return this.d == null ? null : this.d.getContentDescription();
    }

    @Nullable
    public Drawable getNavigationIcon() {
        return this.d == null ? null : this.d.getDrawable();
    }

    ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.L;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        this.j();
        return this.a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.j;
    }

    @StyleRes
    public int getPopupTheme() {
        return this.k;
    }

    public CharSequence getSubtitle() {
        return this.y;
    }

    @Nullable
    @VisibleForTesting
    final TextView getSubtitleTextView() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.x;
    }

    public int getTitleMarginBottom() {
        return this.s;
    }

    public int getTitleMarginEnd() {
        return this.q;
    }

    public int getTitleMarginStart() {
        return this.p;
    }

    public int getTitleMarginTop() {
        return this.r;
    }

    @Nullable
    @VisibleForTesting
    final TextView getTitleTextView() {
        return this.b;
    }

    @RestrictTo({Scope.c})
    public DecorToolbar getWrapper() {
        if(this.K == null) {
            this.K = new ToolbarWidgetWrapper(this, true);
        }
        return this.K;
    }

    private void h() {
        if(this.t == null) {
            this.t = new RtlSpacingHelper();
        }
    }

    private void i() {
        if(this.e == null) {
            this.e = new AppCompatImageView(this.getContext());
        }
    }

    // 检测为 Lambda 实现
    @Override  // androidx.core.view.MenuHost
    @MainThread
    public void invalidateMenu() [...]

    private void j() {
        this.k();
        if(this.a.R() == null) {
            MenuBuilder menuBuilder0 = (MenuBuilder)this.a.getMenu();
            if(this.M == null) {
                this.M = new ExpandedActionViewMenuPresenter(this);
            }
            this.a.setExpandedActionViewsExclusive(true);
            menuBuilder0.c(this.M, this.j);
            this.U();
        }
    }

    private void k() {
        if(this.a == null) {
            ActionMenuView actionMenuView0 = new ActionMenuView(this.getContext());
            this.a = actionMenuView0;
            actionMenuView0.setPopupTheme(this.k);
            this.a.setOnMenuItemClickListener(this.J);
            this.a.S(this.N, new androidx.appcompat.view.menu.MenuBuilder.Callback() {
                final Toolbar a;

                @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
                public boolean a(@NonNull MenuBuilder menuBuilder0, @NonNull MenuItem menuItem0) {
                    androidx.appcompat.view.menu.MenuBuilder.Callback menuBuilder$Callback0 = Toolbar.this.O;
                    return menuBuilder$Callback0 != null && menuBuilder$Callback0.a(menuBuilder0, menuItem0);
                }

                @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
                public void b(@NonNull MenuBuilder menuBuilder0) {
                    if(!Toolbar.this.a.N()) {
                        Toolbar.this.G.k(menuBuilder0);
                    }
                    androidx.appcompat.view.menu.MenuBuilder.Callback menuBuilder$Callback0 = Toolbar.this.O;
                    if(menuBuilder$Callback0 != null) {
                        menuBuilder$Callback0.b(menuBuilder0);
                    }
                }
            });
            LayoutParams toolbar$LayoutParams0 = this.m();
            toolbar$LayoutParams0.a = this.n & 0x70 | 0x800005;
            this.a.setLayoutParams(toolbar$LayoutParams0);
            this.c(this.a, false);
        }
    }

    private void l() {
        if(this.d == null) {
            this.d = new AppCompatImageButton(this.getContext(), null, attr.toolbarNavigationButtonStyle);
            LayoutParams toolbar$LayoutParams0 = this.m();
            toolbar$LayoutParams0.a = this.n & 0x70 | 0x800003;
            this.d.setLayoutParams(toolbar$LayoutParams0);
        }
    }

    protected LayoutParams m() {
        return new LayoutParams(-2, -2);
    }

    public LayoutParams n(AttributeSet attributeSet0) {
        return new LayoutParams(this.getContext(), attributeSet0);
    }

    protected LayoutParams o(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(viewGroup$LayoutParams0 instanceof LayoutParams) {
            return new LayoutParams(((LayoutParams)viewGroup$LayoutParams0));
        }
        if(viewGroup$LayoutParams0 instanceof androidx.appcompat.app.ActionBar.LayoutParams) {
            return new LayoutParams(((androidx.appcompat.app.ActionBar.LayoutParams)viewGroup$LayoutParams0));
        }
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new LayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new LayoutParams(viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U();
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.removeCallbacks(this.O8);
        this.U();
    }

    @Override  // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        if(v == 9) {
            this.C = false;
        }
        if(!this.C && (v == 9 && !super.onHoverEvent(motionEvent0))) {
            this.C = true;
        }
        if(v == 3 || v == 10) {
            this.C = false;
        }
        return true;
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v43;
        int v39;
        int v35;
        int v34;
        int v30;
        int v26;
        int v23;
        int v19;
        int v14;
        int v13;
        boolean z1 = this.getLayoutDirection() == 1;
        int v4 = this.getWidth();
        int v5 = this.getHeight();
        int v6 = this.getPaddingLeft();
        int v7 = this.getPaddingRight();
        int v8 = this.getPaddingTop();
        int v9 = this.getPaddingBottom();
        int v10 = v4 - v7;
        int[] arr_v = this.F;
        arr_v[1] = 0;
        arr_v[0] = 0;
        int v11 = ViewCompat.j0(this);
        int v12 = v11 < 0 ? 0 : Math.min(v11, v3 - v1);
        if(!this.S(this.d)) {
            v14 = v6;
            v13 = v10;
        }
        else if(z1) {
            v13 = this.E(this.d, v10, arr_v, v12);
            v14 = v6;
        }
        else {
            v14 = this.D(this.d, v6, arr_v, v12);
            v13 = v10;
        }
        if(this.S(this.h)) {
            if(z1) {
                v13 = this.E(this.h, v13, arr_v, v12);
            }
            else {
                v14 = this.D(this.h, v14, arr_v, v12);
            }
        }
        if(this.S(this.a)) {
            if(z1) {
                v14 = this.D(this.a, v14, arr_v, v12);
            }
            else {
                v13 = this.E(this.a, v13, arr_v, v12);
            }
        }
        int v15 = this.getCurrentContentInsetLeft();
        int v16 = this.getCurrentContentInsetRight();
        arr_v[0] = Math.max(0, v15 - v14);
        arr_v[1] = Math.max(0, v16 - (v10 - v13));
        int v17 = Math.max(v14, v15);
        int v18 = Math.min(v13, v10 - v16);
        if(this.S(this.i)) {
            if(z1) {
                v18 = this.E(this.i, v18, arr_v, v12);
            }
            else {
                v17 = this.D(this.i, v17, arr_v, v12);
            }
        }
        if(this.S(this.e)) {
            if(z1) {
                v18 = this.E(this.e, v18, arr_v, v12);
            }
            else {
                v17 = this.D(this.e, v17, arr_v, v12);
            }
        }
        boolean z2 = this.S(this.b);
        boolean z3 = this.S(this.c);
        if(z2) {
            LayoutParams toolbar$LayoutParams0 = (LayoutParams)this.b.getLayoutParams();
            v19 = toolbar$LayoutParams0.topMargin + this.b.getMeasuredHeight() + toolbar$LayoutParams0.bottomMargin;
        }
        else {
            v19 = 0;
        }
        if(z3) {
            LayoutParams toolbar$LayoutParams1 = (LayoutParams)this.c.getLayoutParams();
            v19 += toolbar$LayoutParams1.topMargin + this.c.getMeasuredHeight() + toolbar$LayoutParams1.bottomMargin;
        }
        if(z2 || z3) {
            TextView textView0 = z3 ? this.c : this.b;
            LayoutParams toolbar$LayoutParams2 = (LayoutParams)(z2 ? this.b : this.c).getLayoutParams();
            LayoutParams toolbar$LayoutParams3 = (LayoutParams)textView0.getLayoutParams();
            boolean z4 = z2 && this.b.getMeasuredWidth() > 0 || z3 && this.c.getMeasuredWidth() > 0;
            switch(this.w & 0x70) {
                case 0x30: {
                    v23 = v17;
                    v26 = this.getPaddingTop() + toolbar$LayoutParams2.topMargin + this.r;
                    break;
                }
                case 80: {
                    v23 = v17;
                    v26 = v5 - v9 - toolbar$LayoutParams3.bottomMargin - this.s - v19;
                    break;
                }
                default: {
                    int v20 = (v5 - v8 - v9 - v19) / 2;
                    int v21 = toolbar$LayoutParams2.topMargin;
                    int v22 = this.r;
                    v23 = v17;
                    if(v20 < v21 + v22) {
                        v20 = v21 + v22;
                    }
                    else {
                        int v24 = v5 - v9 - v19 - v20 - v8;
                        int v25 = this.s;
                        if(v24 < toolbar$LayoutParams2.bottomMargin + v25) {
                            v20 = Math.max(0, v20 - (toolbar$LayoutParams3.bottomMargin + v25 - v24));
                        }
                    }
                    v26 = v8 + v20;
                }
            }
            if(z1) {
                int v27 = (z4 ? this.p : 0) - arr_v[1];
                v18 -= Math.max(0, v27);
                arr_v[1] = Math.max(0, -v27);
                if(z2) {
                    LayoutParams toolbar$LayoutParams4 = (LayoutParams)this.b.getLayoutParams();
                    int v28 = v18 - this.b.getMeasuredWidth();
                    int v29 = this.b.getMeasuredHeight() + v26;
                    this.b.layout(v28, v26, v18, v29);
                    v30 = v28 - this.q;
                    v26 = v29 + toolbar$LayoutParams4.bottomMargin;
                }
                else {
                    v30 = v18;
                }
                if(z3) {
                    int v31 = v26 + ((LayoutParams)this.c.getLayoutParams()).topMargin;
                    int v32 = this.c.getMeasuredWidth();
                    int v33 = this.c.getMeasuredHeight();
                    this.c.layout(v18 - v32, v31, v18, v33 + v31);
                    v34 = v18 - this.q;
                }
                else {
                    v34 = v18;
                }
                if(z4) {
                    v18 = Math.min(v30, v34);
                }
                v17 = v23;
                v35 = 0;
            }
            else {
                v35 = 0;
                int v36 = (z4 ? this.p : 0) - arr_v[0];
                v17 = v23 + Math.max(0, v36);
                arr_v[0] = Math.max(0, -v36);
                if(z2) {
                    LayoutParams toolbar$LayoutParams5 = (LayoutParams)this.b.getLayoutParams();
                    int v37 = this.b.getMeasuredWidth() + v17;
                    int v38 = this.b.getMeasuredHeight() + v26;
                    this.b.layout(v17, v26, v37, v38);
                    v39 = v37 + this.q;
                    v26 = v38 + toolbar$LayoutParams5.bottomMargin;
                }
                else {
                    v39 = v17;
                }
                if(z3) {
                    int v40 = v26 + ((LayoutParams)this.c.getLayoutParams()).topMargin;
                    int v41 = this.c.getMeasuredWidth() + v17;
                    int v42 = this.c.getMeasuredHeight();
                    this.c.layout(v17, v40, v41, v42 + v40);
                    v43 = v41 + this.q;
                }
                else {
                    v43 = v17;
                }
                if(z4) {
                    v17 = Math.max(v39, v43);
                }
            }
        }
        else {
            v35 = 0;
        }
        this.b(this.D, 3);
        int v44 = this.D.size();
        int v45 = v17;
        for(int v46 = 0; v46 < v44; ++v46) {
            v45 = this.D(((View)this.D.get(v46)), v45, arr_v, v12);
        }
        this.b(this.D, 5);
        int v47 = this.D.size();
        for(int v48 = 0; v48 < v47; ++v48) {
            v18 = this.E(((View)this.D.get(v48)), v18, arr_v, v12);
        }
        this.b(this.D, 1);
        int v49 = this.u(this.D, arr_v);
        int v50 = v6 + (v4 - v6 - v7) / 2 - v49 / 2;
        int v51 = v49 + v50;
        if(v50 >= v45) {
            v45 = v51 <= v18 ? v50 : v50 - (v51 - v18);
        }
        int v52 = this.D.size();
        while(v35 < v52) {
            v45 = this.D(((View)this.D.get(v35)), v45, arr_v, v12);
            ++v35;
        }
        this.D.clear();
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        int v19;
        int v18;
        int v17;
        int v8;
        int v5;
        int v4;
        int v3;
        int[] arr_v = this.F;
        boolean z = ViewUtils.b(this);
        int v2 = 0;
        if(this.S(this.d)) {
            this.G(this.d, v, 0, v1, 0, this.o);
            v3 = this.d.getMeasuredWidth() + this.s(this.d);
            v4 = Math.max(0, this.d.getMeasuredHeight() + this.t(this.d));
            v5 = View.combineMeasuredStates(0, this.d.getMeasuredState());
        }
        else {
            v3 = 0;
            v4 = 0;
            v5 = 0;
        }
        if(this.S(this.h)) {
            this.G(this.h, v, 0, v1, 0, this.o);
            v3 = this.h.getMeasuredWidth() + this.s(this.h);
            v4 = Math.max(v4, this.h.getMeasuredHeight() + this.t(this.h));
            v5 = View.combineMeasuredStates(v5, this.h.getMeasuredState());
        }
        int v6 = this.getCurrentContentInsetStart();
        int v7 = Math.max(v6, v3);
        arr_v[z] = Math.max(0, v6 - v3);
        if(this.S(this.a)) {
            this.G(this.a, v, v7, v1, 0, this.o);
            v8 = this.a.getMeasuredWidth() + this.s(this.a);
            v4 = Math.max(v4, this.a.getMeasuredHeight() + this.t(this.a));
            v5 = View.combineMeasuredStates(v5, this.a.getMeasuredState());
        }
        else {
            v8 = 0;
        }
        int v9 = this.getCurrentContentInsetEnd();
        int v10 = v7 + Math.max(v9, v8);
        arr_v[!z] = Math.max(0, v9 - v8);
        if(this.S(this.i)) {
            v10 += this.F(this.i, v, v10, v1, 0, arr_v);
            v4 = Math.max(v4, this.i.getMeasuredHeight() + this.t(this.i));
            v5 = View.combineMeasuredStates(v5, this.i.getMeasuredState());
        }
        if(this.S(this.e)) {
            v10 += this.F(this.e, v, v10, v1, 0, arr_v);
            v4 = Math.max(v4, this.e.getMeasuredHeight() + this.t(this.e));
            v5 = View.combineMeasuredStates(v5, this.e.getMeasuredState());
        }
        int v11 = this.getChildCount();
        for(int v12 = 0; v12 < v11; ++v12) {
            View view0 = this.getChildAt(v12);
            if(((LayoutParams)view0.getLayoutParams()).b == 0 && this.S(view0)) {
                v10 += this.F(view0, v, v10, v1, 0, arr_v);
                v4 = Math.max(v4, view0.getMeasuredHeight() + this.t(view0));
                v5 = View.combineMeasuredStates(v5, view0.getMeasuredState());
            }
        }
        int v13 = this.r + this.s;
        int v14 = this.p + this.q;
        if(this.S(this.b)) {
            this.F(this.b, v, v10 + v14, v1, v13, arr_v);
            int v15 = this.b.getMeasuredWidth();
            int v16 = this.s(this.b);
            v17 = this.b.getMeasuredHeight() + this.t(this.b);
            v18 = View.combineMeasuredStates(v5, this.b.getMeasuredState());
            v19 = v15 + v16;
        }
        else {
            v18 = v5;
            v19 = 0;
            v17 = 0;
        }
        if(this.S(this.c)) {
            v19 = Math.max(v19, this.F(this.c, v, v10 + v14, v1, v17 + v13, arr_v));
            v17 += this.c.getMeasuredHeight() + this.t(this.c);
            v18 = View.combineMeasuredStates(v18, this.c.getMeasuredState());
        }
        int v20 = this.getPaddingLeft();
        int v21 = this.getPaddingRight();
        int v22 = this.getPaddingTop();
        int v23 = this.getPaddingBottom();
        int v24 = View.resolveSizeAndState(Math.max(v10 + v19 + (v20 + v21), this.getSuggestedMinimumWidth()), v, 0xFF000000 & v18);
        int v25 = View.resolveSizeAndState(Math.max(Math.max(v4, v17) + (v22 + v23), this.getSuggestedMinimumHeight()), v1, v18 << 16);
        if(!this.R()) {
            v2 = v25;
        }
        this.setMeasuredDimension(v24, v2);
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).a());
        MenuBuilder menuBuilder0 = this.a == null ? null : this.a.R();
        int v = ((SavedState)parcelable0).c;
        if(v != 0 && this.M != null && menuBuilder0 != null) {
            MenuItem menuItem0 = menuBuilder0.findItem(v);
            if(menuItem0 != null) {
                menuItem0.expandActionView();
            }
        }
        if(((SavedState)parcelable0).d) {
            this.I();
        }
    }

    @Override  // android.view.View
    public void onRtlPropertiesChanged(int v) {
        super.onRtlPropertiesChanged(v);
        this.h();
        this.t.f(v == 1);
    }

    @Override  // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        ExpandedActionViewMenuPresenter toolbar$ExpandedActionViewMenuPresenter0 = this.M;
        if(toolbar$ExpandedActionViewMenuPresenter0 != null) {
            MenuItemImpl menuItemImpl0 = toolbar$ExpandedActionViewMenuPresenter0.b;
            if(menuItemImpl0 != null) {
                parcelable0.c = menuItemImpl0.getItemId();
            }
        }
        parcelable0.d = this.B();
        return parcelable0;
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        if(v == 0) {
            this.B = false;
        }
        if(!this.B && (v == 0 && !super.onTouchEvent(motionEvent0))) {
            this.B = true;
        }
        if(v == 1 || v == 3) {
            this.B = false;
        }
        return true;
    }

    private int p(int v) {
        int v1 = this.getLayoutDirection();
        int v2 = GravityCompat.d(v, v1);
        if((v2 & 7) != 1 && (v2 & 7) != 3 && (v2 & 7) != 5) {
            return v1 == 1 ? 5 : 3;
        }
        return v2 & 7;
    }

    private int q(View view0, int v) {
        LayoutParams toolbar$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        int v1 = view0.getMeasuredHeight();
        int v2 = v <= 0 ? 0 : (v1 - v) / 2;
        switch(this.r(toolbar$LayoutParams0.a)) {
            case 0x30: {
                return this.getPaddingTop() - v2;
            }
            case 80: {
                return this.getHeight() - this.getPaddingBottom() - v1 - toolbar$LayoutParams0.bottomMargin - v2;
            }
            default: {
                int v3 = this.getPaddingTop();
                int v4 = this.getPaddingBottom();
                int v5 = this.getHeight();
                int v6 = (v5 - v3 - v4 - v1) / 2;
                int v7 = toolbar$LayoutParams0.topMargin;
                if(v6 < v7) {
                    return v3 + v7;
                }
                int v8 = v5 - v4 - v1 - v6 - v3;
                int v9 = toolbar$LayoutParams0.bottomMargin;
                if(v8 < v9) {
                    v6 = Math.max(0, v6 - (v9 - v8));
                }
                return v3 + v6;
            }
        }
    }

    private int r(int v) {
        int v1 = v & 0x70;
        return v1 == 16 || v1 == 0x30 || v1 == 80 ? v1 : this.w & 0x70;
    }

    @Override  // androidx.core.view.MenuHost
    @MainThread
    public void removeMenuProvider(@NonNull MenuProvider menuProvider0) {
        this.G.l(menuProvider0);
    }

    private int s(View view0) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        return viewGroup$MarginLayoutParams0.getMarginStart() + viewGroup$MarginLayoutParams0.getMarginEnd();
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if(this.N8 != z) {
            this.N8 = z;
            this.U();
        }
    }

    public void setCollapseContentDescription(@StringRes int v) {
        this.setCollapseContentDescription((v == 0 ? null : this.getContext().getText(v)));
    }

    public void setCollapseContentDescription(@Nullable CharSequence charSequence0) {
        if(!TextUtils.isEmpty(charSequence0)) {
            this.g();
        }
        ImageButton imageButton0 = this.h;
        if(imageButton0 != null) {
            imageButton0.setContentDescription(charSequence0);
        }
    }

    public void setCollapseIcon(@DrawableRes int v) {
        this.setCollapseIcon(AppCompatResources.b(this.getContext(), v));
    }

    public void setCollapseIcon(@Nullable Drawable drawable0) {
        if(drawable0 != null) {
            this.g();
            this.h.setImageDrawable(drawable0);
            return;
        }
        ImageButton imageButton0 = this.h;
        if(imageButton0 != null) {
            imageButton0.setImageDrawable(this.f);
        }
    }

    @RestrictTo({Scope.c})
    public void setCollapsible(boolean z) {
        this.P = z;
        this.requestLayout();
    }

    public void setContentInsetEndWithActions(int v) {
        if(v < 0) {
            v = 0x80000000;
        }
        if(v != this.v) {
            this.v = v;
            if(this.getNavigationIcon() != null) {
                this.requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int v) {
        if(v < 0) {
            v = 0x80000000;
        }
        if(v != this.u) {
            this.u = v;
            if(this.getNavigationIcon() != null) {
                this.requestLayout();
            }
        }
    }

    public void setLogo(@DrawableRes int v) {
        this.setLogo(AppCompatResources.b(this.getContext(), v));
    }

    public void setLogo(Drawable drawable0) {
        if(drawable0 != null) {
            this.i();
            if(!this.z(this.e)) {
                this.c(this.e, true);
            }
        }
        else if(this.e != null && this.z(this.e)) {
            this.removeView(this.e);
            this.E.remove(this.e);
        }
        ImageView imageView0 = this.e;
        if(imageView0 != null) {
            imageView0.setImageDrawable(drawable0);
        }
    }

    public void setLogoDescription(@StringRes int v) {
        this.setLogoDescription(this.getContext().getText(v));
    }

    public void setLogoDescription(CharSequence charSequence0) {
        if(!TextUtils.isEmpty(charSequence0)) {
            this.i();
        }
        ImageView imageView0 = this.e;
        if(imageView0 != null) {
            imageView0.setContentDescription(charSequence0);
        }
    }

    public void setNavigationContentDescription(@StringRes int v) {
        this.setNavigationContentDescription((v == 0 ? null : this.getContext().getText(v)));
    }

    public void setNavigationContentDescription(@Nullable CharSequence charSequence0) {
        if(!TextUtils.isEmpty(charSequence0)) {
            this.l();
        }
        ImageButton imageButton0 = this.d;
        if(imageButton0 != null) {
            imageButton0.setContentDescription(charSequence0);
            TooltipCompat.a(this.d, charSequence0);
        }
    }

    public void setNavigationIcon(@DrawableRes int v) {
        this.setNavigationIcon(AppCompatResources.b(this.getContext(), v));
    }

    public void setNavigationIcon(@Nullable Drawable drawable0) {
        if(drawable0 != null) {
            this.l();
            if(!this.z(this.d)) {
                this.c(this.d, true);
            }
        }
        else if(this.d != null && this.z(this.d)) {
            this.removeView(this.d);
            this.E.remove(this.d);
        }
        ImageButton imageButton0 = this.d;
        if(imageButton0 != null) {
            imageButton0.setImageDrawable(drawable0);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener view$OnClickListener0) {
        this.l();
        this.d.setOnClickListener(view$OnClickListener0);
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener toolbar$OnMenuItemClickListener0) {
        this.I = toolbar$OnMenuItemClickListener0;
    }

    public void setOverflowIcon(@Nullable Drawable drawable0) {
        this.j();
        this.a.setOverflowIcon(drawable0);
    }

    public void setPopupTheme(@StyleRes int v) {
        if(this.k != v) {
            this.k = v;
            if(v == 0) {
                this.j = this.getContext();
                return;
            }
            this.j = new ContextThemeWrapper(this.getContext(), v);
        }
    }

    public void setSubtitle(@StringRes int v) {
        this.setSubtitle(this.getContext().getText(v));
    }

    public void setSubtitle(CharSequence charSequence0) {
        if(!TextUtils.isEmpty(charSequence0)) {
            if(this.c == null) {
                Context context0 = this.getContext();
                AppCompatTextView appCompatTextView0 = new AppCompatTextView(context0);
                this.c = appCompatTextView0;
                appCompatTextView0.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int v = this.m;
                if(v != 0) {
                    this.c.setTextAppearance(context0, v);
                }
                ColorStateList colorStateList0 = this.A;
                if(colorStateList0 != null) {
                    this.c.setTextColor(colorStateList0);
                }
            }
            if(!this.z(this.c)) {
                this.c(this.c, true);
            }
        }
        else if(this.c != null && this.z(this.c)) {
            this.removeView(this.c);
            this.E.remove(this.c);
        }
        TextView textView0 = this.c;
        if(textView0 != null) {
            textView0.setText(charSequence0);
        }
        this.y = charSequence0;
    }

    public void setSubtitleTextColor(@ColorInt int v) {
        this.setSubtitleTextColor(ColorStateList.valueOf(v));
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList0) {
        this.A = colorStateList0;
        TextView textView0 = this.c;
        if(textView0 != null) {
            textView0.setTextColor(colorStateList0);
        }
    }

    public void setTitle(@StringRes int v) {
        this.setTitle(this.getContext().getText(v));
    }

    public void setTitle(CharSequence charSequence0) {
        if(!TextUtils.isEmpty(charSequence0)) {
            if(this.b == null) {
                Context context0 = this.getContext();
                AppCompatTextView appCompatTextView0 = new AppCompatTextView(context0);
                this.b = appCompatTextView0;
                appCompatTextView0.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int v = this.l;
                if(v != 0) {
                    this.b.setTextAppearance(context0, v);
                }
                ColorStateList colorStateList0 = this.z;
                if(colorStateList0 != null) {
                    this.b.setTextColor(colorStateList0);
                }
            }
            if(!this.z(this.b)) {
                this.c(this.b, true);
            }
        }
        else if(this.b != null && this.z(this.b)) {
            this.removeView(this.b);
            this.E.remove(this.b);
        }
        TextView textView0 = this.b;
        if(textView0 != null) {
            textView0.setText(charSequence0);
        }
        this.x = charSequence0;
    }

    public void setTitleMarginBottom(int v) {
        this.s = v;
        this.requestLayout();
    }

    public void setTitleMarginEnd(int v) {
        this.q = v;
        this.requestLayout();
    }

    public void setTitleMarginStart(int v) {
        this.p = v;
        this.requestLayout();
    }

    public void setTitleMarginTop(int v) {
        this.r = v;
        this.requestLayout();
    }

    public void setTitleTextColor(@ColorInt int v) {
        this.setTitleTextColor(ColorStateList.valueOf(v));
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList0) {
        this.z = colorStateList0;
        TextView textView0 = this.b;
        if(textView0 != null) {
            textView0.setTextColor(colorStateList0);
        }
    }

    private int t(View view0) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        return viewGroup$MarginLayoutParams0.topMargin + viewGroup$MarginLayoutParams0.bottomMargin;
    }

    private int u(List list0, int[] arr_v) {
        int v = arr_v[0];
        int v1 = arr_v[1];
        int v2 = list0.size();
        int v3 = 0;
        int v4 = 0;
        while(v3 < v2) {
            View view0 = (View)list0.get(v3);
            LayoutParams toolbar$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            int v5 = toolbar$LayoutParams0.leftMargin - v;
            int v6 = toolbar$LayoutParams0.rightMargin - v1;
            v4 += Math.max(0, v5) + view0.getMeasuredWidth() + Math.max(0, v6);
            ++v3;
            v1 = Math.max(0, -v6);
            v = Math.max(0, -v5);
        }
        return v4;
    }

    public boolean v() {
        return this.M != null && this.M.b != null;
    }

    public boolean w() {
        return this.a != null && this.a.L();
    }

    public void x(@MenuRes int v) {
        this.getMenuInflater().inflate(v, this.getMenu());
    }

    public boolean y() {
        return this.N8;
    }

    private boolean z(View view0) {
        return view0.getParent() == this || this.E.contains(view0);
    }

    class androidx.appcompat.widget.Toolbar.2 implements Runnable {
        final Toolbar a;

        @Override
        public void run() {
            Toolbar.this.T();
        }
    }

}

