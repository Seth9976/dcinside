package androidx.navigation.ui;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.customview.widget.Openable;
import androidx.navigation.ActivityNavigator.Destination;
import androidx.navigation.NavController.OnDestinationChangedListener;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavOptions;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;
import java.lang.ref.WeakReference;
import java.util.Set;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.j;
import z3.n;

public final class NavigationUI {
    @l
    public static final NavigationUI a;

    static {
        NavigationUI.a = new NavigationUI();
    }

    @NavigationUiSaveStateControl
    @n
    public static final void A(@l NavigationView navigationView0, @l NavController navController0, boolean z) {
        L.p(navigationView0, "navigationView");
        L.p(navController0, "navController");
        if(z) {
            throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default");
        }
        navigationView0.setNavigationItemSelectedListener((MenuItem menuItem0) -> {
            L.p(navController0, "$navController");
            L.p(navigationView0, "$navigationView");
            L.p(menuItem0, "item");
            boolean z1 = NavigationUI.m(menuItem0, navController0, false);
            if(z1) {
                ViewParent viewParent0 = navigationView0.getParent();
                if(viewParent0 instanceof Openable) {
                    ((Openable)viewParent0).close();
                    return true;
                }
                BottomSheetBehavior bottomSheetBehavior0 = NavigationUI.g(navigationView0);
                if(bottomSheetBehavior0 != null) {
                    bottomSheetBehavior0.g(5);
                }
            }
            return z1;
        });
        navController0.q(new OnDestinationChangedListener() {
            @Override  // androidx.navigation.NavController$OnDestinationChangedListener
            public void a(@l NavController navController0, @l NavDestination navDestination0, @m Bundle bundle0) {
                L.p(navController0, "controller");
                L.p(navDestination0, "destination");
                NavigationView navigationView0 = (NavigationView)new WeakReference(navigationView0).get();
                if(navigationView0 == null) {
                    navController0.G0(this);
                    return;
                }
                Menu menu0 = navigationView0.getMenu();
                L.o(menu0, "view.menu");
                int v = menu0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    MenuItem menuItem0 = menu0.getItem(v1);
                    L.h(menuItem0, "getItem(index)");
                    menuItem0.setChecked(NavigationUI.h(navDestination0, menuItem0.getItemId()));
                }
            }
        });
    }

    public static void B(Toolbar toolbar0, NavController navController0, AppBarConfiguration appBarConfiguration0, int v, Object object0) {
        if((v & 4) != 0) {
            appBarConfiguration0 = new Builder(navController0.K()).a();
        }
        NavigationUI.t(toolbar0, navController0, appBarConfiguration0);
    }

    public static void C(CollapsingToolbarLayout collapsingToolbarLayout0, Toolbar toolbar0, NavController navController0, AppBarConfiguration appBarConfiguration0, int v, Object object0) {
        if((v & 8) != 0) {
            appBarConfiguration0 = new Builder(navController0.K()).a();
        }
        NavigationUI.w(collapsingToolbarLayout0, toolbar0, navController0, appBarConfiguration0);
    }

    // 检测为 Lambda 实现
    private static final void D(NavController navController0, AppBarConfiguration appBarConfiguration0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void E(NavController navController0, AppBarConfiguration appBarConfiguration0, View view0) [...]

    // 检测为 Lambda 实现
    private static final boolean F(NavController navController0, NavigationView navigationView0, MenuItem menuItem0) [...]

    // 检测为 Lambda 实现
    private static final boolean G(NavController navController0, boolean z, NavigationView navigationView0, MenuItem menuItem0) [...]

    // 检测为 Lambda 实现
    private static final boolean H(NavController navController0, MenuItem menuItem0) [...]

    // 检测为 Lambda 实现
    private static final boolean I(NavController navController0, boolean z, MenuItem menuItem0) [...]

    @RestrictTo({Scope.b})
    @m
    @n
    public static final BottomSheetBehavior g(@l View view0) {
        L.p(view0, "view");
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(!(viewGroup$LayoutParams0 instanceof LayoutParams)) {
            ViewParent viewParent0 = view0.getParent();
            return viewParent0 instanceof View ? NavigationUI.g(((View)viewParent0)) : null;
        }
        Behavior coordinatorLayout$Behavior0 = ((LayoutParams)viewGroup$LayoutParams0).f();
        return coordinatorLayout$Behavior0 instanceof BottomSheetBehavior ? ((BottomSheetBehavior)coordinatorLayout$Behavior0) : null;
    }

    @n
    public static final boolean h(@l NavDestination navDestination0, @IdRes int v) {
        L.p(navDestination0, "<this>");
        for(Object object0: NavDestination.j.c(navDestination0)) {
            if(((NavDestination)object0).q() == v) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @n
    public static final boolean i(@l NavDestination navDestination0, @l Set set0) {
        L.p(navDestination0, "<this>");
        L.p(set0, "destinationIds");
        for(Object object0: NavDestination.j.c(navDestination0)) {
            if(set0.contains(((NavDestination)object0).q())) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @n
    public static final boolean j(@l NavController navController0, @m Openable openable0) {
        L.p(navController0, "navController");
        return NavigationUI.k(navController0, new Builder(navController0.K()).d(openable0).a());
    }

    @n
    public static final boolean k(@l NavController navController0, @l AppBarConfiguration appBarConfiguration0) {
        L.p(navController0, "navController");
        L.p(appBarConfiguration0, "configuration");
        Openable openable0 = appBarConfiguration0.c();
        NavDestination navDestination0 = navController0.I();
        if(openable0 != null && navDestination0 != null && NavigationUI.i(navDestination0, appBarConfiguration0.d())) {
            openable0.open();
            return true;
        }
        if(!navController0.q0()) {
            OnNavigateUpListener appBarConfiguration$OnNavigateUpListener0 = appBarConfiguration0.b();
            return appBarConfiguration$OnNavigateUpListener0 == null ? false : appBarConfiguration$OnNavigateUpListener0.a();
        }
        return true;
    }

    @n
    public static final boolean l(@l MenuItem menuItem0, @l NavController navController0) {
        L.p(menuItem0, "item");
        L.p(navController0, "navController");
        androidx.navigation.NavOptions.Builder navOptions$Builder0 = new androidx.navigation.NavOptions.Builder().d(true).m(true);
        NavDestination navDestination0 = navController0.I();
        L.m(navDestination0);
        NavGraph navGraph0 = navDestination0.u();
        L.m(navGraph0);
        if(navGraph0.U(menuItem0.getItemId()) instanceof Destination) {
            navOptions$Builder0.b(anim.nav_default_enter_anim).c(anim.nav_default_exit_anim).e(anim.nav_default_pop_enter_anim).f(anim.nav_default_pop_exit_anim);
        }
        else {
            navOptions$Builder0.b(animator.nav_default_enter_anim).c(animator.nav_default_exit_anim).e(animator.nav_default_pop_enter_anim).f(animator.nav_default_pop_exit_anim);
        }
        if((menuItem0.getOrder() & 0x30000) == 0) {
            NavGraph navGraph1 = navController0.K();
            navOptions$Builder0.h(NavGraph.p.a(navGraph1).q(), false, true);
        }
        NavOptions navOptions0 = navOptions$Builder0.a();
        try {
            navController0.X(menuItem0.getItemId(), null, navOptions0);
            NavDestination navDestination1 = navController0.I();
            return navDestination1 == null || !NavigationUI.h(navDestination1, menuItem0.getItemId()) ? false : true;
        }
        catch(IllegalArgumentException unused_ex) {
            return false;
        }
    }

    @NavigationUiSaveStateControl
    @n
    public static final boolean m(@l MenuItem menuItem0, @l NavController navController0, boolean z) {
        L.p(menuItem0, "item");
        L.p(navController0, "navController");
        if(!z) {
            androidx.navigation.NavOptions.Builder navOptions$Builder0 = new androidx.navigation.NavOptions.Builder().d(true);
            NavDestination navDestination0 = navController0.I();
            L.m(navDestination0);
            NavGraph navGraph0 = navDestination0.u();
            L.m(navGraph0);
            if(navGraph0.U(menuItem0.getItemId()) instanceof Destination) {
                navOptions$Builder0.b(anim.nav_default_enter_anim).c(anim.nav_default_exit_anim).e(anim.nav_default_pop_enter_anim).f(anim.nav_default_pop_exit_anim);
            }
            else {
                navOptions$Builder0.b(animator.nav_default_enter_anim).c(animator.nav_default_exit_anim).e(animator.nav_default_pop_enter_anim).f(animator.nav_default_pop_exit_anim);
            }
            if((menuItem0.getOrder() & 0x30000) == 0) {
                NavGraph navGraph1 = navController0.K();
                androidx.navigation.NavOptions.Builder.k(navOptions$Builder0, NavGraph.p.a(navGraph1).q(), false, false, 4, null);
            }
            NavOptions navOptions0 = navOptions$Builder0.a();
            try {
                navController0.X(menuItem0.getItemId(), null, navOptions0);
                NavDestination navDestination1 = navController0.I();
                return navDestination1 == null || !NavigationUI.h(navDestination1, menuItem0.getItemId()) ? false : true;
            }
            catch(IllegalArgumentException unused_ex) {
                return false;
            }
        }
        throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default");
    }

    @j
    @n
    public static final void n(@l AppCompatActivity appCompatActivity0, @l NavController navController0) {
        L.p(appCompatActivity0, "activity");
        L.p(navController0, "navController");
        NavigationUI.q(appCompatActivity0, navController0, null, 4, null);
    }

    @n
    public static final void o(@l AppCompatActivity appCompatActivity0, @l NavController navController0, @m Openable openable0) {
        L.p(appCompatActivity0, "activity");
        L.p(navController0, "navController");
        NavigationUI.p(appCompatActivity0, navController0, new Builder(navController0.K()).d(openable0).a());
    }

    @j
    @n
    public static final void p(@l AppCompatActivity appCompatActivity0, @l NavController navController0, @l AppBarConfiguration appBarConfiguration0) {
        L.p(appCompatActivity0, "activity");
        L.p(navController0, "navController");
        L.p(appBarConfiguration0, "configuration");
        navController0.q(new ActionBarOnDestinationChangedListener(appCompatActivity0, appBarConfiguration0));
    }

    public static void q(AppCompatActivity appCompatActivity0, NavController navController0, AppBarConfiguration appBarConfiguration0, int v, Object object0) {
        if((v & 4) != 0) {
            appBarConfiguration0 = new Builder(navController0.K()).a();
        }
        NavigationUI.p(appCompatActivity0, navController0, appBarConfiguration0);
    }

    @j
    @n
    public static final void r(@l Toolbar toolbar0, @l NavController navController0) {
        L.p(toolbar0, "toolbar");
        L.p(navController0, "navController");
        NavigationUI.B(toolbar0, navController0, null, 4, null);
    }

    @n
    public static final void s(@l Toolbar toolbar0, @l NavController navController0, @m Openable openable0) {
        L.p(toolbar0, "toolbar");
        L.p(navController0, "navController");
        NavigationUI.t(toolbar0, navController0, new Builder(navController0.K()).d(openable0).a());
    }

    @j
    @n
    public static final void t(@l Toolbar toolbar0, @l NavController navController0, @l AppBarConfiguration appBarConfiguration0) {
        L.p(toolbar0, "toolbar");
        L.p(navController0, "navController");
        L.p(appBarConfiguration0, "configuration");
        navController0.q(new ToolbarOnDestinationChangedListener(toolbar0, appBarConfiguration0));
        toolbar0.setNavigationOnClickListener((View view0) -> {
            L.p(navController0, "$navController");
            L.p(appBarConfiguration0, "$configuration");
            NavigationUI.k(navController0, appBarConfiguration0);
        });
    }

    @j
    @n
    public static final void u(@l CollapsingToolbarLayout collapsingToolbarLayout0, @l Toolbar toolbar0, @l NavController navController0) {
        L.p(collapsingToolbarLayout0, "collapsingToolbarLayout");
        L.p(toolbar0, "toolbar");
        L.p(navController0, "navController");
        NavigationUI.C(collapsingToolbarLayout0, toolbar0, navController0, null, 8, null);
    }

    @n
    public static final void v(@l CollapsingToolbarLayout collapsingToolbarLayout0, @l Toolbar toolbar0, @l NavController navController0, @m Openable openable0) {
        L.p(collapsingToolbarLayout0, "collapsingToolbarLayout");
        L.p(toolbar0, "toolbar");
        L.p(navController0, "navController");
        NavigationUI.w(collapsingToolbarLayout0, toolbar0, navController0, new Builder(navController0.K()).d(openable0).a());
    }

    @j
    @n
    public static final void w(@l CollapsingToolbarLayout collapsingToolbarLayout0, @l Toolbar toolbar0, @l NavController navController0, @l AppBarConfiguration appBarConfiguration0) {
        L.p(collapsingToolbarLayout0, "collapsingToolbarLayout");
        L.p(toolbar0, "toolbar");
        L.p(navController0, "navController");
        L.p(appBarConfiguration0, "configuration");
        navController0.q(new CollapsingToolbarOnDestinationChangedListener(collapsingToolbarLayout0, toolbar0, appBarConfiguration0));
        toolbar0.setNavigationOnClickListener((View view0) -> {
            L.p(navController0, "$navController");
            L.p(appBarConfiguration0, "$configuration");
            NavigationUI.k(navController0, appBarConfiguration0);
        });
    }

    @n
    public static final void x(@l NavigationBarView navigationBarView0, @l NavController navController0) {
        L.p(navigationBarView0, "navigationBarView");
        L.p(navController0, "navController");
        navigationBarView0.setOnItemSelectedListener((MenuItem menuItem0) -> {
            L.p(navController0, "$navController");
            L.p(menuItem0, "item");
            return NavigationUI.l(menuItem0, navController0);
        });
        navController0.q(new OnDestinationChangedListener() {
            @Override  // androidx.navigation.NavController$OnDestinationChangedListener
            public void a(@l NavController navController0, @l NavDestination navDestination0, @m Bundle bundle0) {
                L.p(navController0, "controller");
                L.p(navDestination0, "destination");
                NavigationBarView navigationBarView0 = (NavigationBarView)new WeakReference(navigationBarView0).get();
                if(navigationBarView0 == null) {
                    navController0.G0(this);
                    return;
                }
                Menu menu0 = navigationBarView0.getMenu();
                L.o(menu0, "view.menu");
                int v = menu0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    MenuItem menuItem0 = menu0.getItem(v1);
                    L.h(menuItem0, "getItem(index)");
                    if(NavigationUI.h(navDestination0, menuItem0.getItemId())) {
                        menuItem0.setChecked(true);
                    }
                }
            }
        });
    }

    @NavigationUiSaveStateControl
    @n
    public static final void y(@l NavigationBarView navigationBarView0, @l NavController navController0, boolean z) {
        L.p(navigationBarView0, "navigationBarView");
        L.p(navController0, "navController");
        if(z) {
            throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default");
        }
        navigationBarView0.setOnItemSelectedListener((MenuItem menuItem0) -> {
            L.p(navController0, "$navController");
            L.p(menuItem0, "item");
            return NavigationUI.m(menuItem0, navController0, false);
        });
        navController0.q(new OnDestinationChangedListener() {
            @Override  // androidx.navigation.NavController$OnDestinationChangedListener
            public void a(@l NavController navController0, @l NavDestination navDestination0, @m Bundle bundle0) {
                L.p(navController0, "controller");
                L.p(navDestination0, "destination");
                NavigationBarView navigationBarView0 = (NavigationBarView)new WeakReference(navigationBarView0).get();
                if(navigationBarView0 == null) {
                    navController0.G0(this);
                    return;
                }
                Menu menu0 = navigationBarView0.getMenu();
                L.o(menu0, "view.menu");
                int v = menu0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    MenuItem menuItem0 = menu0.getItem(v1);
                    L.h(menuItem0, "getItem(index)");
                    if(NavigationUI.h(navDestination0, menuItem0.getItemId())) {
                        menuItem0.setChecked(true);
                    }
                }
            }
        });
    }

    @n
    public static final void z(@l NavigationView navigationView0, @l NavController navController0) {
        L.p(navigationView0, "navigationView");
        L.p(navController0, "navController");
        navigationView0.setNavigationItemSelectedListener((MenuItem menuItem0) -> {
            L.p(navController0, "$navController");
            L.p(navigationView0, "$navigationView");
            L.p(menuItem0, "item");
            boolean z = NavigationUI.l(menuItem0, navController0);
            if(z) {
                ViewParent viewParent0 = navigationView0.getParent();
                if(viewParent0 instanceof Openable) {
                    ((Openable)viewParent0).close();
                    return true;
                }
                BottomSheetBehavior bottomSheetBehavior0 = NavigationUI.g(navigationView0);
                if(bottomSheetBehavior0 != null) {
                    bottomSheetBehavior0.g(5);
                }
            }
            return z;
        });
        navController0.q(new OnDestinationChangedListener() {
            @Override  // androidx.navigation.NavController$OnDestinationChangedListener
            public void a(@l NavController navController0, @l NavDestination navDestination0, @m Bundle bundle0) {
                L.p(navController0, "controller");
                L.p(navDestination0, "destination");
                NavigationView navigationView0 = (NavigationView)new WeakReference(navigationView0).get();
                if(navigationView0 == null) {
                    navController0.G0(this);
                    return;
                }
                Menu menu0 = navigationView0.getMenu();
                L.o(menu0, "view.menu");
                int v = menu0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    MenuItem menuItem0 = menu0.getItem(v1);
                    L.h(menuItem0, "getItem(index)");
                    menuItem0.setChecked(NavigationUI.h(navDestination0, menuItem0.getItemId()));
                }
            }
        });
    }
}

