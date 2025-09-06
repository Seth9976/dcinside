package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination.ClassType;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator.Name;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.r0;
import y4.l;
import y4.m;

@Name("fragment")
public class FragmentNavigator extends Navigator {
    static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @ClassType(Fragment.class)
    public static class Destination extends NavDestination {
        @m
        private String l;

        public Destination(@l Navigator navigator0) {
            L.p(navigator0, "fragmentNavigator");
            super(navigator0);
        }

        public Destination(@l NavigatorProvider navigatorProvider0) {
            L.p(navigatorProvider0, "navigatorProvider");
            this(navigatorProvider0.e(FragmentNavigator.class));
        }

        @Override  // androidx.navigation.NavDestination
        @CallSuper
        public void A(@l Context context0, @l AttributeSet attributeSet0) {
            L.p(context0, "context");
            L.p(attributeSet0, "attrs");
            super.A(context0, attributeSet0);
            TypedArray typedArray0 = context0.getResources().obtainAttributes(attributeSet0, styleable.FragmentNavigator);
            L.o(typedArray0, "context.resources.obtain…leable.FragmentNavigator)");
            String s = typedArray0.getString(styleable.FragmentNavigator_android_name);
            if(s != null) {
                this.O(s);
            }
            typedArray0.recycle();
        }

        @l
        public final String N() {
            String s = this.l;
            if(s == null) {
                throw new IllegalStateException("Fragment class was not set");
            }
            return s;
        }

        @l
        public final Destination O(@l String s) {
            L.p(s, "className");
            this.l = s;
            return this;
        }

        // 去混淆评级： 低(30)
        @Override  // androidx.navigation.NavDestination
        public boolean equals(@m Object object0) {
            return object0 != null && object0 instanceof Destination && super.equals(object0) && L.g(this.l, ((Destination)object0).l);
        }

        @Override  // androidx.navigation.NavDestination
        public int hashCode() {
            int v = super.hashCode();
            return this.l == null ? v * 0x1F : v * 0x1F + this.l.hashCode();
        }

        @Override  // androidx.navigation.NavDestination
        @l
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(super.toString());
            stringBuilder0.append(" class=");
            String s = this.l;
            if(s == null) {
                stringBuilder0.append("null");
            }
            else {
                stringBuilder0.append(s);
            }
            String s1 = stringBuilder0.toString();
            L.o(s1, "sb.toString()");
            return s1;
        }
    }

    public static final class Extras implements androidx.navigation.Navigator.Extras {
        public static final class Builder {
            @l
            private final LinkedHashMap a;

            public Builder() {
                this.a = new LinkedHashMap();
            }

            @l
            public final Builder a(@l View view0, @l String s) {
                L.p(view0, "sharedElement");
                L.p(s, "name");
                this.a.put(view0, s);
                return this;
            }

            @l
            public final Builder b(@l Map map0) {
                L.p(map0, "sharedElements");
                for(Object object0: map0.entrySet()) {
                    this.a(((View)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
                }
                return this;
            }

            @l
            public final Extras c() {
                return new Extras(this.a);
            }
        }

        @l
        private final LinkedHashMap a;

        public Extras(@l Map map0) {
            L.p(map0, "sharedElements");
            super();
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            this.a = linkedHashMap0;
            linkedHashMap0.putAll(map0);
        }

        @l
        public final Map a() {
            return Y.D0(this.a);
        }
    }

    @l
    private final Context c;
    @l
    private final FragmentManager d;
    private final int e;
    @l
    private final Set f;
    @l
    private static final Companion g = null;
    @Deprecated
    @l
    private static final String h = "FragmentNavigator";
    @Deprecated
    @l
    private static final String i = "androidx-nav-fragment:navigator:savedIds";

    static {
        FragmentNavigator.g = new Companion(null);
    }

    public FragmentNavigator(@l Context context0, @l FragmentManager fragmentManager0, int v) {
        L.p(context0, "context");
        L.p(fragmentManager0, "fragmentManager");
        super();
        this.c = context0;
        this.d = fragmentManager0;
        this.e = v;
        this.f = new LinkedHashSet();
    }

    @Override  // androidx.navigation.Navigator
    public NavDestination a() {
        return this.l();
    }

    @Override  // androidx.navigation.Navigator
    public void e(@l List list0, @m NavOptions navOptions0, @m androidx.navigation.Navigator.Extras navigator$Extras0) {
        L.p(list0, "entries");
        if(this.d.d1()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        for(Object object0: list0) {
            this.o(((NavBackStackEntry)object0), navOptions0, navigator$Extras0);
        }
    }

    @Override  // androidx.navigation.Navigator
    public void g(@l NavBackStackEntry navBackStackEntry0) {
        L.p(navBackStackEntry0, "backStackEntry");
        if(this.d.d1()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        FragmentTransaction fragmentTransaction0 = this.m(navBackStackEntry0, null);
        if(((List)this.b().b().getValue()).size() > 1) {
            this.d.u1(navBackStackEntry0.g(), 1);
            fragmentTransaction0.o(navBackStackEntry0.g());
        }
        fragmentTransaction0.q();
        this.b().f(navBackStackEntry0);
    }

    @Override  // androidx.navigation.Navigator
    public void h(@l Bundle bundle0) {
        L.p(bundle0, "savedState");
        ArrayList arrayList0 = bundle0.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if(arrayList0 != null) {
            this.f.clear();
            u.q0(this.f, arrayList0);
        }
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.navigation.Navigator
    @m
    public Bundle i() {
        return this.f.isEmpty() ? null : BundleKt.b(new V[]{r0.a("androidx-nav-fragment:navigator:savedIds", new ArrayList(this.f))});
    }

    @Override  // androidx.navigation.Navigator
    public void j(@l NavBackStackEntry navBackStackEntry0, boolean z) {
        L.p(navBackStackEntry0, "popUpTo");
        if(this.d.d1()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        if(z) {
            List list0 = (List)this.b().b().getValue();
            NavBackStackEntry navBackStackEntry1 = (NavBackStackEntry)u.B2(list0);
            for(Object object0: u.X4(list0.subList(list0.indexOf(navBackStackEntry0), list0.size()))) {
                NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry)object0;
                if(L.g(navBackStackEntry2, navBackStackEntry1)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + navBackStackEntry2);
                }
                else {
                    this.d.R1(navBackStackEntry2.g());
                    this.f.add(navBackStackEntry2.g());
                }
            }
        }
        else {
            this.d.u1(navBackStackEntry0.g(), 1);
        }
        this.b().g(navBackStackEntry0, z);
    }

    @l
    public Destination l() {
        return new Destination(this);
    }

    private final FragmentTransaction m(NavBackStackEntry navBackStackEntry0, NavOptions navOptions0) {
        Bundle bundle0 = navBackStackEntry0.d();
        String s = ((Destination)navBackStackEntry0.f()).N();
        int v = 0;
        if(s.charAt(0) == 46) {
            s = "com.dcinside.app.android" + s;
        }
        Fragment fragment0 = this.d.G0().a(this.c.getClassLoader(), s);
        L.o(fragment0, "fragmentManager.fragment…t.classLoader, className)");
        fragment0.setArguments(bundle0);
        FragmentTransaction fragmentTransaction0 = this.d.u();
        L.o(fragmentTransaction0, "fragmentManager.beginTransaction()");
        int v1 = navOptions0 == null ? -1 : navOptions0.a();
        int v2 = navOptions0 == null ? -1 : navOptions0.b();
        int v3 = navOptions0 == null ? -1 : navOptions0.c();
        int v4 = navOptions0 == null ? -1 : navOptions0.d();
        if(v1 != -1 || v2 != -1 || v3 != -1 || v4 != -1) {
            if(v1 == -1) {
                v1 = 0;
            }
            if(v2 == -1) {
                v2 = 0;
            }
            if(v3 == -1) {
                v3 = 0;
            }
            if(v4 != -1) {
                v = v4;
            }
            fragmentTransaction0.N(v1, v2, v3, v);
        }
        fragmentTransaction0.C(this.e, fragment0);
        fragmentTransaction0.P(fragment0);
        fragmentTransaction0.Q(true);
        return fragmentTransaction0;
    }

    @k(message = "Set a custom {@link androidx.fragment.app.FragmentFactory} via\n      {@link FragmentManager#setFragmentFactory(FragmentFactory)} to control\n      instantiation of Fragments.")
    @l
    public Fragment n(@l Context context0, @l FragmentManager fragmentManager0, @l String s, @m Bundle bundle0) {
        L.p(context0, "context");
        L.p(fragmentManager0, "fragmentManager");
        L.p(s, "className");
        Fragment fragment0 = fragmentManager0.G0().a(context0.getClassLoader(), s);
        L.o(fragment0, "fragmentManager.fragment…t.classLoader, className)");
        return fragment0;
    }

    private final void o(NavBackStackEntry navBackStackEntry0, NavOptions navOptions0, androidx.navigation.Navigator.Extras navigator$Extras0) {
        boolean z = ((List)this.b().b().getValue()).isEmpty();
        if(navOptions0 != null && !z && navOptions0.k() && this.f.remove(navBackStackEntry0.g())) {
            this.d.J1(navBackStackEntry0.g());
            this.b().i(navBackStackEntry0);
            return;
        }
        FragmentTransaction fragmentTransaction0 = this.m(navBackStackEntry0, navOptions0);
        if(!z) {
            fragmentTransaction0.o(navBackStackEntry0.g());
        }
        if(navigator$Extras0 instanceof Extras) {
            for(Object object0: ((Extras)navigator$Extras0).a().entrySet()) {
                fragmentTransaction0.n(((View)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
            }
        }
        fragmentTransaction0.q();
        this.b().i(navBackStackEntry0);
    }
}

