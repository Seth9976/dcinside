package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.id;
import androidx.appcompat.R.styleable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.ViewPropertyAnimatorCompatSet;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

@RestrictTo({Scope.c})
public class WindowDecorActionBar extends ActionBar implements ActionBarVisibilityCallback {
    @RestrictTo({Scope.c})
    public class ActionModeImpl extends ActionMode implements Callback {
        private final Context c;
        private final MenuBuilder d;
        private androidx.appcompat.view.ActionMode.Callback e;
        private WeakReference f;
        final WindowDecorActionBar g;

        public ActionModeImpl(Context context0, androidx.appcompat.view.ActionMode.Callback actionMode$Callback0) {
            this.c = context0;
            this.e = actionMode$Callback0;
            MenuBuilder menuBuilder0 = new MenuBuilder(context0).a0(1);
            this.d = menuBuilder0;
            menuBuilder0.Y(this);
        }

        @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
        public boolean a(@NonNull MenuBuilder menuBuilder0, @NonNull MenuItem menuItem0) {
            return this.e == null ? false : this.e.b(this, menuItem0);
        }

        @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
        public void b(@NonNull MenuBuilder menuBuilder0) {
            if(this.e == null) {
                return;
            }
            this.k();
            WindowDecorActionBar.this.o.o();
        }

        @Override  // androidx.appcompat.view.ActionMode
        public void c() {
            WindowDecorActionBar windowDecorActionBar0 = WindowDecorActionBar.this;
            if(windowDecorActionBar0.v != this) {
                return;
            }
            if(WindowDecorActionBar.E0(windowDecorActionBar0.D, windowDecorActionBar0.E, false)) {
                this.e.d(this);
            }
            else {
                WindowDecorActionBar.this.w = this;
                WindowDecorActionBar.this.x = this.e;
            }
            this.e = null;
            WindowDecorActionBar.this.D0(false);
            WindowDecorActionBar.this.o.p();
            WindowDecorActionBar.this.l.setHideOnContentScrollEnabled(WindowDecorActionBar.this.J);
            WindowDecorActionBar.this.v = null;
        }

        @Override  // androidx.appcompat.view.ActionMode
        public View d() {
            return this.f == null ? null : ((View)this.f.get());
        }

        @Override  // androidx.appcompat.view.ActionMode
        public Menu e() {
            return this.d;
        }

        @Override  // androidx.appcompat.view.ActionMode
        public MenuInflater f() {
            return new SupportMenuInflater(this.c);
        }

        @Override  // androidx.appcompat.view.ActionMode
        public CharSequence g() {
            return WindowDecorActionBar.this.o.getSubtitle();
        }

        @Override  // androidx.appcompat.view.ActionMode
        public CharSequence i() {
            return WindowDecorActionBar.this.o.getTitle();
        }

        @Override  // androidx.appcompat.view.ActionMode
        public void k() {
            if(WindowDecorActionBar.this.v != this) {
                return;
            }
            this.d.n0();
            try {
                this.e.c(this, this.d);
            }
            finally {
                this.d.m0();
            }
        }

        @Override  // androidx.appcompat.view.ActionMode
        public boolean l() {
            return WindowDecorActionBar.this.o.s();
        }

        @Override  // androidx.appcompat.view.ActionMode
        public void n(View view0) {
            WindowDecorActionBar.this.o.setCustomView(view0);
            this.f = new WeakReference(view0);
        }

        @Override  // androidx.appcompat.view.ActionMode
        public void o(int v) {
            this.p(WindowDecorActionBar.this.i.getResources().getString(v));
        }

        @Override  // androidx.appcompat.view.ActionMode
        public void p(CharSequence charSequence0) {
            WindowDecorActionBar.this.o.setSubtitle(charSequence0);
        }

        @Override  // androidx.appcompat.view.ActionMode
        public void r(int v) {
            this.s(WindowDecorActionBar.this.i.getResources().getString(v));
        }

        @Override  // androidx.appcompat.view.ActionMode
        public void s(CharSequence charSequence0) {
            WindowDecorActionBar.this.o.setTitle(charSequence0);
        }

        @Override  // androidx.appcompat.view.ActionMode
        public void t(boolean z) {
            super.t(z);
            WindowDecorActionBar.this.o.setTitleOptional(z);
        }

        public boolean u() {
            this.d.n0();
            try {
                return this.e.a(this, this.d);
            }
            finally {
                this.d.m0();
            }
        }

        public void v(MenuBuilder menuBuilder0, boolean z) {
        }

        public void w(SubMenuBuilder subMenuBuilder0) {
        }

        public boolean x(SubMenuBuilder subMenuBuilder0) {
            if(this.e == null) {
                return false;
            }
            if(!subMenuBuilder0.hasVisibleItems()) {
                return true;
            }
            new MenuPopupHelper(WindowDecorActionBar.this.z(), subMenuBuilder0).l();
            return true;
        }
    }

    @RestrictTo({Scope.c})
    public class TabImpl extends Tab {
        private TabListener b;
        private Object c;
        private Drawable d;
        private CharSequence e;
        private CharSequence f;
        private int g;
        private View h;
        final WindowDecorActionBar i;

        public TabImpl() {
            this.g = -1;
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public CharSequence a() {
            return this.f;
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public View b() {
            return this.h;
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public Drawable c() {
            return this.d;
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public int d() {
            return this.g;
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public Object e() {
            return this.c;
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public CharSequence f() {
            return this.e;
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public void g() {
            WindowDecorActionBar.this.R(this);
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public Tab h(int v) {
            return this.i(WindowDecorActionBar.this.i.getResources().getText(v));
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public Tab i(CharSequence charSequence0) {
            this.f = charSequence0;
            int v = this.g;
            if(v >= 0) {
                WindowDecorActionBar.this.q.m(v);
            }
            return this;
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public Tab j(int v) {
            return this.k(LayoutInflater.from(WindowDecorActionBar.this.z()).inflate(v, null));
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public Tab k(View view0) {
            this.h = view0;
            int v = this.g;
            if(v >= 0) {
                WindowDecorActionBar.this.q.m(v);
            }
            return this;
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public Tab l(int v) {
            return this.m(AppCompatResources.b(WindowDecorActionBar.this.i, v));
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public Tab m(Drawable drawable0) {
            this.d = drawable0;
            int v = this.g;
            if(v >= 0) {
                WindowDecorActionBar.this.q.m(v);
            }
            return this;
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public Tab n(TabListener actionBar$TabListener0) {
            this.b = actionBar$TabListener0;
            return this;
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public Tab o(Object object0) {
            this.c = object0;
            return this;
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public Tab p(int v) {
            return this.q(WindowDecorActionBar.this.i.getResources().getText(v));
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public Tab q(CharSequence charSequence0) {
            this.e = charSequence0;
            int v = this.g;
            if(v >= 0) {
                WindowDecorActionBar.this.q.m(v);
            }
            return this;
        }

        public TabListener r() {
            return this.b;
        }

        public void s(int v) {
            this.g = v;
        }
    }

    private boolean A;
    private int B;
    boolean C;
    boolean D;
    boolean E;
    private boolean F;
    private boolean G;
    ViewPropertyAnimatorCompatSet H;
    private boolean I;
    boolean J;
    final ViewPropertyAnimatorListener K;
    final ViewPropertyAnimatorListener L;
    final ViewPropertyAnimatorUpdateListener M;
    private static final String N = "WindowDecorActionBar";
    private static final Interpolator O = null;
    private static final Interpolator P = null;
    private static final int Q = -1;
    private static final long R = 100L;
    private static final long S = 200L;
    Context i;
    private Context j;
    private Activity k;
    ActionBarOverlayLayout l;
    ActionBarContainer m;
    DecorToolbar n;
    ActionBarContextView o;
    View p;
    ScrollingTabContainerView q;
    private ArrayList r;
    private TabImpl s;
    private int t;
    private boolean u;
    ActionModeImpl v;
    ActionMode w;
    androidx.appcompat.view.ActionMode.Callback x;
    private boolean y;
    private ArrayList z;

    static {
        WindowDecorActionBar.O = new AccelerateInterpolator();
        WindowDecorActionBar.P = new DecelerateInterpolator();
    }

    public WindowDecorActionBar(Activity activity0, boolean z) {
        this.r = new ArrayList();
        this.t = -1;
        this.z = new ArrayList();
        this.B = 0;
        this.C = true;
        this.G = true;
        this.K = new ViewPropertyAnimatorListenerAdapter() {
            final WindowDecorActionBar a;

            @Override  // androidx.core.view.ViewPropertyAnimatorListenerAdapter
            public void b(View view0) {
                WindowDecorActionBar windowDecorActionBar0 = WindowDecorActionBar.this;
                if(windowDecorActionBar0.C) {
                    View view1 = windowDecorActionBar0.p;
                    if(view1 != null) {
                        view1.setTranslationY(0.0f);
                        WindowDecorActionBar.this.m.setTranslationY(0.0f);
                    }
                }
                WindowDecorActionBar.this.m.setVisibility(8);
                WindowDecorActionBar.this.m.setTransitioning(false);
                WindowDecorActionBar.this.H = null;
                WindowDecorActionBar.this.G0();
                ActionBarOverlayLayout actionBarOverlayLayout0 = WindowDecorActionBar.this.l;
                if(actionBarOverlayLayout0 != null) {
                    ViewCompat.D1(actionBarOverlayLayout0);
                }
            }
        };
        this.L = new ViewPropertyAnimatorListenerAdapter() {
            final WindowDecorActionBar a;

            @Override  // androidx.core.view.ViewPropertyAnimatorListenerAdapter
            public void b(View view0) {
                WindowDecorActionBar.this.H = null;
                WindowDecorActionBar.this.m.requestLayout();
            }
        };
        this.M = new ViewPropertyAnimatorUpdateListener() {
            final WindowDecorActionBar a;

            @Override  // androidx.core.view.ViewPropertyAnimatorUpdateListener
            public void a(View view0) {
                ((View)WindowDecorActionBar.this.m.getParent()).invalidate();
            }
        };
        this.k = activity0;
        View view0 = activity0.getWindow().getDecorView();
        this.P0(view0);
        if(!z) {
            this.p = view0.findViewById(0x1020002);
        }
    }

    public WindowDecorActionBar(Dialog dialog0) {
        this.r = new ArrayList();
        this.t = -1;
        this.z = new ArrayList();
        this.B = 0;
        this.C = true;
        this.G = true;
        this.K = new ViewPropertyAnimatorListenerAdapter() {
            final WindowDecorActionBar a;

            @Override  // androidx.core.view.ViewPropertyAnimatorListenerAdapter
            public void b(View view0) {
                WindowDecorActionBar windowDecorActionBar0 = WindowDecorActionBar.this;
                if(windowDecorActionBar0.C) {
                    View view1 = windowDecorActionBar0.p;
                    if(view1 != null) {
                        view1.setTranslationY(0.0f);
                        WindowDecorActionBar.this.m.setTranslationY(0.0f);
                    }
                }
                WindowDecorActionBar.this.m.setVisibility(8);
                WindowDecorActionBar.this.m.setTransitioning(false);
                WindowDecorActionBar.this.H = null;
                WindowDecorActionBar.this.G0();
                ActionBarOverlayLayout actionBarOverlayLayout0 = WindowDecorActionBar.this.l;
                if(actionBarOverlayLayout0 != null) {
                    ViewCompat.D1(actionBarOverlayLayout0);
                }
            }
        };
        this.L = new ViewPropertyAnimatorListenerAdapter() {
            final WindowDecorActionBar a;

            @Override  // androidx.core.view.ViewPropertyAnimatorListenerAdapter
            public void b(View view0) {
                WindowDecorActionBar.this.H = null;
                WindowDecorActionBar.this.m.requestLayout();
            }
        };
        this.M = new ViewPropertyAnimatorUpdateListener() {
            final WindowDecorActionBar a;

            @Override  // androidx.core.view.ViewPropertyAnimatorUpdateListener
            public void a(View view0) {
                ((View)WindowDecorActionBar.this.m.getParent()).invalidate();
            }
        };
        this.P0(dialog0.getWindow().getDecorView());
    }

    @RestrictTo({Scope.c})
    public WindowDecorActionBar(View view0) {
        this.r = new ArrayList();
        this.t = -1;
        this.z = new ArrayList();
        this.B = 0;
        this.C = true;
        this.G = true;
        this.K = new ViewPropertyAnimatorListenerAdapter() {
            final WindowDecorActionBar a;

            @Override  // androidx.core.view.ViewPropertyAnimatorListenerAdapter
            public void b(View view0) {
                WindowDecorActionBar windowDecorActionBar0 = WindowDecorActionBar.this;
                if(windowDecorActionBar0.C) {
                    View view1 = windowDecorActionBar0.p;
                    if(view1 != null) {
                        view1.setTranslationY(0.0f);
                        WindowDecorActionBar.this.m.setTranslationY(0.0f);
                    }
                }
                WindowDecorActionBar.this.m.setVisibility(8);
                WindowDecorActionBar.this.m.setTransitioning(false);
                WindowDecorActionBar.this.H = null;
                WindowDecorActionBar.this.G0();
                ActionBarOverlayLayout actionBarOverlayLayout0 = WindowDecorActionBar.this.l;
                if(actionBarOverlayLayout0 != null) {
                    ViewCompat.D1(actionBarOverlayLayout0);
                }
            }
        };
        this.L = new ViewPropertyAnimatorListenerAdapter() {
            final WindowDecorActionBar a;

            @Override  // androidx.core.view.ViewPropertyAnimatorListenerAdapter
            public void b(View view0) {
                WindowDecorActionBar.this.H = null;
                WindowDecorActionBar.this.m.requestLayout();
            }
        };
        this.M = new ViewPropertyAnimatorUpdateListener() {
            final WindowDecorActionBar a;

            @Override  // androidx.core.view.ViewPropertyAnimatorUpdateListener
            public void a(View view0) {
                ((View)WindowDecorActionBar.this.m.getParent()).invalidate();
            }
        };
        this.P0(view0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public CharSequence A() {
        return this.n.getTitle();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void A0(CharSequence charSequence0) {
        this.n.setWindowTitle(charSequence0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void B() {
        if(!this.D) {
            this.D = true;
            this.T0(false);
        }
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void B0() {
        if(this.D) {
            this.D = false;
            this.T0(false);
        }
    }

    @Override  // androidx.appcompat.app.ActionBar
    public ActionMode C0(androidx.appcompat.view.ActionMode.Callback actionMode$Callback0) {
        ActionModeImpl windowDecorActionBar$ActionModeImpl0 = this.v;
        if(windowDecorActionBar$ActionModeImpl0 != null) {
            windowDecorActionBar$ActionModeImpl0.c();
        }
        this.l.setHideOnContentScrollEnabled(false);
        this.o.t();
        ActionModeImpl windowDecorActionBar$ActionModeImpl1 = new ActionModeImpl(this, this.o.getContext(), actionMode$Callback0);
        if(windowDecorActionBar$ActionModeImpl1.u()) {
            this.v = windowDecorActionBar$ActionModeImpl1;
            windowDecorActionBar$ActionModeImpl1.k();
            this.o.q(windowDecorActionBar$ActionModeImpl1);
            this.D0(true);
            return windowDecorActionBar$ActionModeImpl1;
        }
        return null;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public boolean D() {
        return this.l.B();
    }

    public void D0(boolean z) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat1;
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0;
        if(z) {
            this.S0();
        }
        else {
            this.O0();
        }
        if(this.R0()) {
            if(z) {
                viewPropertyAnimatorCompat0 = this.n.I(4, 100L);
                viewPropertyAnimatorCompat1 = this.o.n(0, 200L);
            }
            else {
                viewPropertyAnimatorCompat1 = this.n.I(0, 200L);
                viewPropertyAnimatorCompat0 = this.o.n(8, 100L);
            }
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet0 = new ViewPropertyAnimatorCompatSet();
            viewPropertyAnimatorCompatSet0.d(viewPropertyAnimatorCompat0, viewPropertyAnimatorCompat1);
            viewPropertyAnimatorCompatSet0.h();
            return;
        }
        if(z) {
            this.n.setVisibility(4);
            this.o.setVisibility(0);
            return;
        }
        this.n.setVisibility(0);
        this.o.setVisibility(8);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public boolean E() {
        int v = this.q();
        return this.G && (v == 0 || this.r() < v);
    }

    // 去混淆评级： 低(40)
    static boolean E0(boolean z, boolean z1, boolean z2) {
        return z2 ? true : !z && !z1;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public boolean F() {
        return this.n != null && this.n.l();
    }

    private void F0() {
        if(this.s != null) {
            this.R(null);
        }
        this.r.clear();
        ScrollingTabContainerView scrollingTabContainerView0 = this.q;
        if(scrollingTabContainerView0 != null) {
            scrollingTabContainerView0.k();
        }
        this.t = -1;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public Tab G() {
        return new TabImpl(this);
    }

    void G0() {
        androidx.appcompat.view.ActionMode.Callback actionMode$Callback0 = this.x;
        if(actionMode$Callback0 != null) {
            actionMode$Callback0.d(this.w);
            this.w = null;
            this.x = null;
        }
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void H(Configuration configuration0) {
        this.Q0(ActionBarPolicy.b(this.i).g());
    }

    private void H0(Tab actionBar$Tab0, int v) {
        if(((TabImpl)actionBar$Tab0).r() == null) {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
        ((TabImpl)actionBar$Tab0).s(v);
        this.r.add(v, ((TabImpl)actionBar$Tab0));
        int v1 = this.r.size();
        while(true) {
            ++v;
            if(v >= v1) {
                break;
            }
            ((TabImpl)this.r.get(v)).s(v);
        }
    }

    public void I0(boolean z) {
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet0 = this.H;
        if(viewPropertyAnimatorCompatSet0 != null) {
            viewPropertyAnimatorCompatSet0.a();
        }
        if(this.B == 0 && (this.I || z)) {
            this.m.setAlpha(1.0f);
            this.m.setTransitioning(true);
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet1 = new ViewPropertyAnimatorCompatSet();
            float f = (float)(-this.m.getHeight());
            if(z) {
                int[] arr_v = {0, 0};
                this.m.getLocationInWindow(arr_v);
                f -= (float)arr_v[1];
            }
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0 = ViewCompat.h(this.m).B(f);
            viewPropertyAnimatorCompat0.x(this.M);
            viewPropertyAnimatorCompatSet1.c(viewPropertyAnimatorCompat0);
            if(this.C) {
                View view0 = this.p;
                if(view0 != null) {
                    viewPropertyAnimatorCompatSet1.c(ViewCompat.h(view0).B(f));
                }
            }
            viewPropertyAnimatorCompatSet1.f(WindowDecorActionBar.O);
            viewPropertyAnimatorCompatSet1.e(0xFAL);
            viewPropertyAnimatorCompatSet1.g(this.K);
            this.H = viewPropertyAnimatorCompatSet1;
            viewPropertyAnimatorCompatSet1.h();
            return;
        }
        this.K.b(null);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public boolean J(int v, KeyEvent keyEvent0) {
        ActionModeImpl windowDecorActionBar$ActionModeImpl0 = this.v;
        if(windowDecorActionBar$ActionModeImpl0 == null) {
            return false;
        }
        Menu menu0 = windowDecorActionBar$ActionModeImpl0.e();
        if(menu0 != null) {
            menu0.setQwertyMode(KeyCharacterMap.load((keyEvent0 == null ? -1 : keyEvent0.getDeviceId())).getKeyboardType() != 1);
            return menu0.performShortcut(v, keyEvent0, 0);
        }
        return false;
    }

    public void J0(boolean z) {
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet0 = this.H;
        if(viewPropertyAnimatorCompatSet0 != null) {
            viewPropertyAnimatorCompatSet0.a();
        }
        this.m.setVisibility(0);
        if(this.B != 0 || !this.I && !z) {
            this.m.setAlpha(1.0f);
            this.m.setTranslationY(0.0f);
            if(this.C) {
                View view1 = this.p;
                if(view1 != null) {
                    view1.setTranslationY(0.0f);
                }
            }
            this.L.b(null);
        }
        else {
            this.m.setTranslationY(0.0f);
            float f = (float)(-this.m.getHeight());
            if(z) {
                int[] arr_v = {0, 0};
                this.m.getLocationInWindow(arr_v);
                f -= (float)arr_v[1];
            }
            this.m.setTranslationY(f);
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet1 = new ViewPropertyAnimatorCompatSet();
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0 = ViewCompat.h(this.m).B(0.0f);
            viewPropertyAnimatorCompat0.x(this.M);
            viewPropertyAnimatorCompatSet1.c(viewPropertyAnimatorCompat0);
            if(this.C) {
                View view0 = this.p;
                if(view0 != null) {
                    view0.setTranslationY(f);
                    viewPropertyAnimatorCompatSet1.c(ViewCompat.h(this.p).B(0.0f));
                }
            }
            viewPropertyAnimatorCompatSet1.f(WindowDecorActionBar.P);
            viewPropertyAnimatorCompatSet1.e(0xFAL);
            viewPropertyAnimatorCompatSet1.g(this.L);
            this.H = viewPropertyAnimatorCompatSet1;
            viewPropertyAnimatorCompatSet1.h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout0 = this.l;
        if(actionBarOverlayLayout0 != null) {
            ViewCompat.D1(actionBarOverlayLayout0);
        }
    }

    private void K0() {
        if(this.q != null) {
            return;
        }
        ScrollingTabContainerView scrollingTabContainerView0 = new ScrollingTabContainerView(this.i);
        if(this.A) {
            scrollingTabContainerView0.setVisibility(0);
            this.n.M(scrollingTabContainerView0);
        }
        else {
            if(this.t() == 2) {
                scrollingTabContainerView0.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout0 = this.l;
                if(actionBarOverlayLayout0 != null) {
                    ViewCompat.D1(actionBarOverlayLayout0);
                }
            }
            else {
                scrollingTabContainerView0.setVisibility(8);
            }
            this.m.setTabContainer(scrollingTabContainerView0);
        }
        this.q = scrollingTabContainerView0;
    }

    private DecorToolbar L0(View view0) {
        if(view0 instanceof DecorToolbar) {
            return (DecorToolbar)view0;
        }
        if(!(view0 instanceof Toolbar)) {
            throw new IllegalStateException("Can\'t make a decor toolbar out of " + (view0 == null ? "null" : view0.getClass().getSimpleName()));
        }
        return ((Toolbar)view0).getWrapper();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void M() {
        this.F0();
    }

    public boolean M0() {
        return this.n.e();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void N(OnMenuVisibilityListener actionBar$OnMenuVisibilityListener0) {
        this.z.remove(actionBar$OnMenuVisibilityListener0);
    }

    public boolean N0() {
        return this.n.i();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void O(Tab actionBar$Tab0) {
        this.P(actionBar$Tab0.d());
    }

    private void O0() {
        if(this.F) {
            this.F = false;
            this.T0(false);
        }
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void P(int v) {
        if(this.q == null) {
            return;
        }
        int v1 = this.s == null ? this.t : this.s.d();
        this.q.l(v);
        TabImpl windowDecorActionBar$TabImpl0 = (TabImpl)this.r.remove(v);
        if(windowDecorActionBar$TabImpl0 != null) {
            windowDecorActionBar$TabImpl0.s(-1);
        }
        int v2 = this.r.size();
        for(int v3 = v; v3 < v2; ++v3) {
            ((TabImpl)this.r.get(v3)).s(v3);
        }
        if(v1 == v) {
            this.R((this.r.isEmpty() ? null : ((Tab)this.r.get(Math.max(0, v - 1)))));
        }
    }

    private void P0(View view0) {
        ActionBarOverlayLayout actionBarOverlayLayout0 = (ActionBarOverlayLayout)view0.findViewById(id.decor_content_parent);
        this.l = actionBarOverlayLayout0;
        if(actionBarOverlayLayout0 != null) {
            actionBarOverlayLayout0.setActionBarVisibilityCallback(this);
        }
        this.n = this.L0(view0.findViewById(id.action_bar));
        this.o = (ActionBarContextView)view0.findViewById(id.action_context_bar);
        ActionBarContainer actionBarContainer0 = (ActionBarContainer)view0.findViewById(id.action_bar_container);
        this.m = actionBarContainer0;
        DecorToolbar decorToolbar0 = this.n;
        if(decorToolbar0 == null || this.o == null || actionBarContainer0 == null) {
            throw new IllegalStateException(this.getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.i = decorToolbar0.getContext();
        boolean z = (this.n.B() & 4) != 0;
        if(z) {
            this.u = true;
        }
        ActionBarPolicy actionBarPolicy0 = ActionBarPolicy.b(this.i);
        this.l0(actionBarPolicy0.a() || z);
        this.Q0(actionBarPolicy0.g());
        TypedArray typedArray0 = this.i.obtainStyledAttributes(null, styleable.ActionBar, attr.actionBarStyle, 0);
        if(typedArray0.getBoolean(styleable.ActionBar_hideOnContentScroll, false)) {
            this.g0(true);
        }
        int v = typedArray0.getDimensionPixelSize(styleable.ActionBar_elevation, 0);
        if(v != 0) {
            this.e0(((float)v));
        }
        typedArray0.recycle();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public boolean Q() {
        ViewGroup viewGroup0 = this.n.J();
        if(viewGroup0 != null && !viewGroup0.hasFocus()) {
            viewGroup0.requestFocus();
            return true;
        }
        return false;
    }

    private void Q0(boolean z) {
        this.A = z;
        if(z) {
            this.m.setTabContainer(null);
            this.n.M(this.q);
        }
        else {
            this.n.M(null);
            this.m.setTabContainer(this.q);
        }
        boolean z1 = true;
        boolean z2 = this.t() == 2;
        ScrollingTabContainerView scrollingTabContainerView0 = this.q;
        if(scrollingTabContainerView0 != null) {
            if(z2) {
                scrollingTabContainerView0.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout0 = this.l;
                if(actionBarOverlayLayout0 != null) {
                    ViewCompat.D1(actionBarOverlayLayout0);
                }
            }
            else {
                scrollingTabContainerView0.setVisibility(8);
            }
        }
        this.n.u(!this.A && z2);
        ActionBarOverlayLayout actionBarOverlayLayout1 = this.l;
        if(this.A || !z2) {
            z1 = false;
        }
        actionBarOverlayLayout1.setHasNonEmbeddedTabs(z1);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void R(Tab actionBar$Tab0) {
        int v = -1;
        if(this.t() != 2) {
            if(actionBar$Tab0 != null) {
                v = actionBar$Tab0.d();
            }
            this.t = v;
            return;
        }
        FragmentTransaction fragmentTransaction0 = !(this.k instanceof FragmentActivity) || this.n.J().isInEditMode() ? null : ((FragmentActivity)this.k).getSupportFragmentManager().u().w();
        TabImpl windowDecorActionBar$TabImpl0 = this.s;
        if(windowDecorActionBar$TabImpl0 != actionBar$Tab0) {
            ScrollingTabContainerView scrollingTabContainerView0 = this.q;
            if(actionBar$Tab0 != null) {
                v = actionBar$Tab0.d();
            }
            scrollingTabContainerView0.setTabSelected(v);
            TabImpl windowDecorActionBar$TabImpl1 = this.s;
            if(windowDecorActionBar$TabImpl1 != null) {
                windowDecorActionBar$TabImpl1.r().c(this.s, fragmentTransaction0);
            }
            this.s = (TabImpl)actionBar$Tab0;
            if(((TabImpl)actionBar$Tab0) != null) {
                ((TabImpl)actionBar$Tab0).r().a(this.s, fragmentTransaction0);
            }
        }
        else if(windowDecorActionBar$TabImpl0 != null) {
            windowDecorActionBar$TabImpl0.r().b(this.s, fragmentTransaction0);
            this.q.c(actionBar$Tab0.d());
        }
        if(fragmentTransaction0 != null && !fragmentTransaction0.A()) {
            fragmentTransaction0.q();
        }
    }

    private boolean R0() {
        return this.m.isLaidOut();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void S(Drawable drawable0) {
        this.m.setPrimaryBackground(drawable0);
    }

    private void S0() {
        if(!this.F) {
            this.F = true;
            this.T0(false);
        }
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void T(int v) {
        this.U(LayoutInflater.from(this.z()).inflate(v, this.n.J(), false));
    }

    private void T0(boolean z) {
        if(WindowDecorActionBar.E0(this.D, this.E, this.F)) {
            if(!this.G) {
                this.G = true;
                this.J0(z);
            }
        }
        else if(this.G) {
            this.G = false;
            this.I0(z);
        }
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void U(View view0) {
        this.n.C(view0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void V(View view0, LayoutParams actionBar$LayoutParams0) {
        view0.setLayoutParams(actionBar$LayoutParams0);
        this.n.C(view0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void W(boolean z) {
        if(!this.u) {
            this.X(z);
        }
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void X(boolean z) {
        this.Z((z ? 4 : 0), 4);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void Y(int v) {
        if((v & 4) != 0) {
            this.u = true;
        }
        this.n.m(v);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void Z(int v, int v1) {
        int v2 = this.n.B();
        if((v1 & 4) != 0) {
            this.u = true;
        }
        this.n.m(v & v1 | ~v1 & v2);
    }

    @Override  // androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback
    public void a() {
        if(this.E) {
            this.E = false;
            this.T0(true);
        }
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void a0(boolean z) {
        this.Z((z ? 16 : 0), 16);
    }

    @Override  // androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback
    public void b() {
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void b0(boolean z) {
        this.Z((z ? 2 : 0), 2);
    }

    @Override  // androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback
    public void c() {
        if(!this.E) {
            this.E = true;
            this.T0(true);
        }
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void c0(boolean z) {
        this.Z((z ? 8 : 0), 8);
    }

    @Override  // androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback
    public void d() {
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet0 = this.H;
        if(viewPropertyAnimatorCompatSet0 != null) {
            viewPropertyAnimatorCompatSet0.a();
            this.H = null;
        }
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void d0(boolean z) {
        this.Z(((int)z), 1);
    }

    @Override  // androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback
    public void e(boolean z) {
        this.C = z;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void e0(float f) {
        ViewCompat.X1(this.m, f);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void f(OnMenuVisibilityListener actionBar$OnMenuVisibilityListener0) {
        this.z.add(actionBar$OnMenuVisibilityListener0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void f0(int v) {
        if(v != 0 && !this.l.C()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
        }
        this.l.setActionBarHideOffset(v);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void g(Tab actionBar$Tab0) {
        this.j(actionBar$Tab0, this.r.isEmpty());
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void g0(boolean z) {
        if(z && !this.l.C()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.J = z;
        this.l.setHideOnContentScrollEnabled(z);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void h(Tab actionBar$Tab0, int v) {
        this.i(actionBar$Tab0, v, this.r.isEmpty());
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void h0(int v) {
        this.n.r(v);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void i(Tab actionBar$Tab0, int v, boolean z) {
        this.K0();
        this.q.a(actionBar$Tab0, v, z);
        this.H0(actionBar$Tab0, v);
        if(z) {
            this.R(actionBar$Tab0);
        }
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void i0(CharSequence charSequence0) {
        this.n.n(charSequence0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void j(Tab actionBar$Tab0, boolean z) {
        this.K0();
        this.q.b(actionBar$Tab0, z);
        this.H0(actionBar$Tab0, this.r.size());
        if(z) {
            this.R(actionBar$Tab0);
        }
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void j0(int v) {
        this.n.O(v);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void k0(Drawable drawable0) {
        this.n.E(drawable0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public boolean l() {
        if(this.n != null && this.n.k()) {
            this.n.collapseActionView();
            return true;
        }
        return false;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void l0(boolean z) {
        this.n.K(z);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void m(boolean z) {
        if(z == this.y) {
            return;
        }
        this.y = z;
        int v = this.z.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((OnMenuVisibilityListener)this.z.get(v1)).a(z);
        }
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void m0(int v) {
        this.n.setIcon(v);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public View n() {
        return this.n.w();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void n0(Drawable drawable0) {
        this.n.setIcon(drawable0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public int o() {
        return this.n.B();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void o0(SpinnerAdapter spinnerAdapter0, OnNavigationListener actionBar$OnNavigationListener0) {
        this.n.Q(spinnerAdapter0, new NavItemSelectedListener(actionBar$OnNavigationListener0));
    }

    @Override  // androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback
    public void onWindowVisibilityChanged(int v) {
        this.B = v;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public float p() {
        return ViewCompat.V(this.m);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void p0(int v) {
        this.n.setLogo(v);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public int q() {
        return this.m.getHeight();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void q0(Drawable drawable0) {
        this.n.x(drawable0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public int r() {
        return this.l.getActionBarHideOffset();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void r0(int v) {
        int v1 = this.n.o();
        if(v1 == 2) {
            this.t = this.u();
            this.R(null);
            this.q.setVisibility(8);
        }
        if(v1 != v && !this.A) {
            ActionBarOverlayLayout actionBarOverlayLayout0 = this.l;
            if(actionBarOverlayLayout0 != null) {
                ViewCompat.D1(actionBarOverlayLayout0);
            }
        }
        this.n.p(v);
        boolean z = false;
        if(v == 2) {
            this.K0();
            this.q.setVisibility(0);
            int v2 = this.t;
            if(v2 != -1) {
                this.s0(v2);
                this.t = -1;
            }
        }
        this.n.u(v == 2 && !this.A);
        ActionBarOverlayLayout actionBarOverlayLayout1 = this.l;
        if(v == 2 && !this.A) {
            z = true;
        }
        actionBarOverlayLayout1.setHasNonEmbeddedTabs(z);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public int s() {
        switch(this.n.o()) {
            case 1: {
                return this.n.t();
            }
            case 2: {
                return this.r.size();
            }
            default: {
                return 0;
            }
        }
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void s0(int v) {
        switch(this.n.o()) {
            case 1: {
                this.n.G(v);
                return;
            }
            case 2: {
                this.R(((Tab)this.r.get(v)));
                return;
            }
            default: {
                throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
            }
        }
    }

    @Override  // androidx.appcompat.app.ActionBar
    public int t() {
        return this.n.o();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void t0(boolean z) {
        this.I = z;
        if(!z) {
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet0 = this.H;
            if(viewPropertyAnimatorCompatSet0 != null) {
                viewPropertyAnimatorCompatSet0.a();
            }
        }
    }

    @Override  // androidx.appcompat.app.ActionBar
    public int u() {
        switch(this.n.o()) {
            case 1: {
                return this.n.q();
            }
            case 2: {
                return this.s == null ? -1 : this.s.d();
            }
            default: {
                return -1;
            }
        }
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void u0(Drawable drawable0) {
    }

    @Override  // androidx.appcompat.app.ActionBar
    public Tab v() {
        return this.s;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void v0(Drawable drawable0) {
        this.m.setStackedBackground(drawable0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public CharSequence w() {
        return this.n.S();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void w0(int v) {
        this.x0(this.i.getString(v));
    }

    @Override  // androidx.appcompat.app.ActionBar
    public Tab x(int v) {
        return (Tab)this.r.get(v);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void x0(CharSequence charSequence0) {
        this.n.F(charSequence0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public int y() {
        return this.r.size();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void y0(int v) {
        this.z0(this.i.getString(v));
    }

    @Override  // androidx.appcompat.app.ActionBar
    public Context z() {
        if(this.j == null) {
            TypedValue typedValue0 = new TypedValue();
            this.i.getTheme().resolveAttribute(attr.actionBarWidgetTheme, typedValue0, true);
            int v = typedValue0.resourceId;
            if(v != 0) {
                this.j = new ContextThemeWrapper(this.i, v);
                return this.j;
            }
            this.j = this.i;
        }
        return this.j;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void z0(CharSequence charSequence0) {
        this.n.setTitle(charSequence0);
    }
}

