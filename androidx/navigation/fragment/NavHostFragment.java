package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.annotation.CallSuper;
import androidx.annotation.NavigationRes;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelStore;
import androidx.navigation.NavController;
import androidx.navigation.NavHost;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigation;
import androidx.navigation.Navigator;
import androidx.navigation.R.styleable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import y4.m;
import z3.j;
import z3.n;

public class NavHostFragment extends Fragment implements NavHost {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        @j
        @n
        public final NavHostFragment a(@NavigationRes int v) {
            return Companion.c(this, v, null, 2, null);
        }

        @l
        @j
        @n
        public final NavHostFragment b(@NavigationRes int v, @m Bundle bundle0) {
            Bundle bundle1;
            if(v == 0) {
                bundle1 = null;
            }
            else {
                bundle1 = new Bundle();
                bundle1.putInt("android-support-nav:fragment:graphId", v);
            }
            if(bundle0 != null) {
                if(bundle1 == null) {
                    bundle1 = new Bundle();
                }
                bundle1.putBundle("android-support-nav:fragment:startDestinationArgs", bundle0);
            }
            NavHostFragment navHostFragment0 = new NavHostFragment();
            if(bundle1 != null) {
                navHostFragment0.setArguments(bundle1);
            }
            return navHostFragment0;
        }

        public static NavHostFragment c(Companion navHostFragment$Companion0, int v, Bundle bundle0, int v1, Object object0) {
            if((v1 & 2) != 0) {
                bundle0 = null;
            }
            return navHostFragment$Companion0.b(v, bundle0);
        }

        @l
        @n
        public final NavController d(@l Fragment fragment0) {
            L.p(fragment0, "fragment");
            for(Fragment fragment1 = fragment0; fragment1 != null; fragment1 = fragment1.getParentFragment()) {
                if(fragment1 instanceof NavHostFragment) {
                    NavController navController0 = ((NavHostFragment)fragment1).a;
                    if(navController0 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
                    }
                    return navController0;
                }
                Fragment fragment2 = fragment1.getParentFragmentManager().N0();
                if(fragment2 instanceof NavHostFragment) {
                    NavController navController1 = ((NavHostFragment)fragment2).a;
                    if(navController1 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
                    }
                    return navController1;
                }
            }
            View view0 = null;
            View view1 = fragment0.getView();
            if(view1 != null) {
                return Navigation.k(view1);
            }
            DialogFragment dialogFragment0 = fragment0 instanceof DialogFragment ? ((DialogFragment)fragment0) : null;
            if(dialogFragment0 != null) {
                Dialog dialog0 = dialogFragment0.getDialog();
                if(dialog0 != null) {
                    Window window0 = dialog0.getWindow();
                    if(window0 != null) {
                        view0 = window0.getDecorView();
                    }
                }
            }
            if(view0 == null) {
                throw new IllegalStateException("Fragment " + fragment0 + " does not have a NavController set");
            }
            return Navigation.k(view0);
        }
    }

    @m
    private NavHostController a;
    @m
    private Boolean b;
    @m
    private View c;
    private int d;
    private boolean e;
    @l
    public static final Companion f = null;
    @RestrictTo({Scope.b})
    @l
    public static final String g = "android-support-nav:fragment:graphId";
    @RestrictTo({Scope.b})
    @l
    public static final String h = "android-support-nav:fragment:startDestinationArgs";
    @l
    private static final String i = "android-support-nav:fragment:navControllerState";
    @l
    private static final String j = "android-support-nav:fragment:defaultHost";

    static {
        NavHostFragment.f = new Companion(null);
    }

    @Override  // androidx.navigation.NavHost
    @l
    public final NavController U() {
        NavController navController0 = this.a;
        if(navController0 == null) {
            throw new IllegalStateException("NavController is not available before onCreate()");
        }
        return navController0;
    }

    @l
    @j
    @n
    public static final NavHostFragment j0(@NavigationRes int v) {
        return NavHostFragment.f.a(v);
    }

    @l
    @j
    @n
    public static final NavHostFragment k0(@NavigationRes int v, @m Bundle bundle0) {
        return NavHostFragment.f.b(v, bundle0);
    }

    @k(message = "Use {@link #onCreateNavController(NavController)}")
    @l
    protected Navigator l0() {
        Context context0 = this.requireContext();
        L.o(context0, "requireContext()");
        FragmentManager fragmentManager0 = this.getChildFragmentManager();
        L.o(fragmentManager0, "childFragmentManager");
        return new FragmentNavigator(context0, fragmentManager0, this.n0());
    }

    @l
    @n
    public static final NavController m0(@l Fragment fragment0) {
        return NavHostFragment.f.d(fragment0);
    }

    private final int n0() {
        int v = this.getId();
        return v != -1 && v != 0 ? v : id.nav_host_fragment_container;
    }

    @CallSuper
    @k(message = "Override {@link #onCreateNavHostController(NavHostController)} to gain\n      access to the full {@link NavHostController} that is created by this NavHostFragment.")
    protected void o0(@l NavController navController0) {
        L.p(navController0, "navController");
        Context context0 = this.requireContext();
        L.o(context0, "requireContext()");
        FragmentManager fragmentManager0 = this.getChildFragmentManager();
        L.o(fragmentManager0, "childFragmentManager");
        navController0.N().b(new DialogFragmentNavigator(context0, fragmentManager0));
        navController0.N().b(this.l0());
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    public void onAttach(@l Context context0) {
        L.p(context0, "context");
        super.onAttach(context0);
        if(this.e) {
            this.getParentFragmentManager().u().P(this).q();
        }
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    public void onCreate(@m Bundle bundle0) {
        Bundle bundle2;
        Context context0 = this.requireContext();
        L.o(context0, "requireContext()");
        NavHostController navHostController0 = new NavHostController(context0);
        this.a = navHostController0;
        L.m(navHostController0);
        navHostController0.P0(this);
        while(context0 instanceof ContextWrapper) {
            if(context0 instanceof OnBackPressedDispatcherOwner) {
                NavHostController navHostController1 = this.a;
                L.m(navHostController1);
                OnBackPressedDispatcher onBackPressedDispatcher0 = ((OnBackPressedDispatcherOwner)context0).getOnBackPressedDispatcher();
                L.o(onBackPressedDispatcher0, "context as OnBackPressed…).onBackPressedDispatcher");
                navHostController1.R0(onBackPressedDispatcher0);
                break;
            }
            context0 = ((ContextWrapper)context0).getBaseContext();
            L.o(context0, "context.baseContext");
        }
        NavHostController navHostController2 = this.a;
        L.m(navHostController2);
        int v = 0;
        navHostController2.x(this.b != null && this.b.booleanValue());
        Bundle bundle1 = null;
        this.b = null;
        NavHostController navHostController3 = this.a;
        L.m(navHostController3);
        ViewModelStore viewModelStore0 = this.getViewModelStore();
        L.o(viewModelStore0, "viewModelStore");
        navHostController3.S0(viewModelStore0);
        NavHostController navHostController4 = this.a;
        L.m(navHostController4);
        this.p0(navHostController4);
        if(bundle0 == null) {
            bundle2 = null;
        }
        else {
            bundle2 = bundle0.getBundle("android-support-nav:fragment:navControllerState");
            if(bundle0.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.e = true;
                this.getParentFragmentManager().u().P(this).q();
            }
            this.d = bundle0.getInt("android-support-nav:fragment:graphId");
        }
        if(bundle2 != null) {
            NavHostController navHostController5 = this.a;
            L.m(navHostController5);
            navHostController5.H0(bundle2);
        }
        if(this.d == 0) {
            Bundle bundle3 = this.getArguments();
            if(bundle3 != null) {
                v = bundle3.getInt("android-support-nav:fragment:graphId");
            }
            if(bundle3 != null) {
                bundle1 = bundle3.getBundle("android-support-nav:fragment:startDestinationArgs");
            }
            if(v != 0) {
                NavHostController navHostController7 = this.a;
                L.m(navHostController7);
                navHostController7.L0(v, bundle1);
            }
        }
        else {
            NavHostController navHostController6 = this.a;
            L.m(navHostController6);
            navHostController6.K0(this.d);
        }
        super.onCreate(bundle0);
    }

    @Override  // androidx.fragment.app.Fragment
    @m
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        Context context0 = layoutInflater0.getContext();
        L.o(context0, "inflater.context");
        View view0 = new FragmentContainerView(context0);
        view0.setId(this.n0());
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        View view0 = this.c;
        if(view0 != null && Navigation.k(view0) == this.a) {
            Navigation.n(view0, null);
        }
        this.c = null;
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    public void onInflate(@l Context context0, @l AttributeSet attributeSet0, @m Bundle bundle0) {
        L.p(context0, "context");
        L.p(attributeSet0, "attrs");
        super.onInflate(context0, attributeSet0, bundle0);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.NavHost);
        L.o(typedArray0, "context.obtainStyledAttr…yleable.NavHost\n        )");
        int v = typedArray0.getResourceId(styleable.NavHost_navGraph, 0);
        if(v != 0) {
            this.d = v;
        }
        typedArray0.recycle();
        TypedArray typedArray1 = context0.obtainStyledAttributes(attributeSet0, androidx.navigation.fragment.R.styleable.NavHostFragment);
        L.o(typedArray1, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if(typedArray1.getBoolean(androidx.navigation.fragment.R.styleable.NavHostFragment_defaultNavHost, false)) {
            this.e = true;
        }
        typedArray1.recycle();
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    public void onPrimaryNavigationFragmentChanged(boolean z) {
        NavHostController navHostController0 = this.a;
        if(navHostController0 != null) {
            navHostController0.x(z);
            return;
        }
        this.b = Boolean.valueOf(z);
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    public void onSaveInstanceState(@l Bundle bundle0) {
        L.p(bundle0, "outState");
        super.onSaveInstanceState(bundle0);
        NavHostController navHostController0 = this.a;
        L.m(navHostController0);
        Bundle bundle1 = navHostController0.J0();
        if(bundle1 != null) {
            bundle0.putBundle("android-support-nav:fragment:navControllerState", bundle1);
        }
        if(this.e) {
            bundle0.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int v = this.d;
        if(v != 0) {
            bundle0.putInt("android-support-nav:fragment:graphId", v);
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        if(!(view0 instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view0 + " is not a ViewGroup").toString());
        }
        Navigation.n(view0, this.a);
        if(view0.getParent() != null) {
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            this.c = (View)viewParent0;
            L.m(((View)viewParent0));
            if(((View)viewParent0).getId() == this.getId()) {
                View view1 = this.c;
                L.m(view1);
                Navigation.n(view1, this.a);
            }
        }
    }

    @CallSuper
    protected void p0(@l NavHostController navHostController0) {
        L.p(navHostController0, "navHostController");
        this.o0(navHostController0);
    }
}

