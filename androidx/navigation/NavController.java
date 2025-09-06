package androidx.navigation;

import A3.a;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.annotation.NavigationRes;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.app.TaskStackBuilder;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.D;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.k;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0.f;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlin.sequences.p;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.K;
import kotlinx.coroutines.flow.U;
import kotlinx.coroutines.flow.W;
import kotlinx.coroutines.flow.i;
import y4.l;
import y4.m;
import z3.j;
import z3.n;

public class NavController {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @NavDeepLinkSaveStateControl
        @n
        public final void a(boolean z) {
            NavController.U = z;
        }

        public static void b() {
        }
    }

    final class NavControllerNavigatorState extends NavigatorState {
        @l
        private final Navigator g;
        final NavController h;

        public NavControllerNavigatorState(@l Navigator navigator0) {
            L.p(navigator0, "navigator");
            this.h = navController0;
            super();
            this.g = navigator0;
        }

        @Override  // androidx.navigation.NavigatorState
        @l
        public NavBackStackEntry a(@l NavDestination navDestination0, @m Bundle bundle0) {
            L.p(navDestination0, "destination");
            State lifecycle$State0 = this.h.L();
            NavControllerViewModel navControllerViewModel0 = this.h.q;
            return androidx.navigation.NavBackStackEntry.Companion.b(NavBackStackEntry.n, this.h.F(), navDestination0, bundle0, lifecycle$State0, navControllerViewModel0, null, null, 0x60, null);
        }

        @Override  // androidx.navigation.NavigatorState
        public void e(@l NavBackStackEntry navBackStackEntry0) {
            L.p(navBackStackEntry0, "entry");
            boolean z = L.g(this.h.A.get(navBackStackEntry0), Boolean.TRUE);
            super.e(navBackStackEntry0);
            this.h.A.remove(navBackStackEntry0);
            if(!this.h.C().contains(navBackStackEntry0)) {
                this.h.V0(navBackStackEntry0);
                if(navBackStackEntry0.getLifecycle().b().b(State.c)) {
                    navBackStackEntry0.m(State.a);
                }
                k k0 = this.h.C();
                if(!(k0 instanceof Collection) || !k0.isEmpty()) {
                    for(Object object0: k0) {
                        if(!L.g(((NavBackStackEntry)object0).g(), navBackStackEntry0.g())) {
                            continue;
                        }
                        this.h.W0();
                        this.h.i.d(this.h.F0());
                        return;
                    }
                }
                if(!z) {
                    NavControllerViewModel navControllerViewModel0 = this.h.q;
                    if(navControllerViewModel0 != null) {
                        navControllerViewModel0.d(navBackStackEntry0.g());
                    }
                }
                this.h.W0();
                this.h.i.d(this.h.F0());
                return;
            }
            if(!this.d()) {
                this.h.W0();
                this.h.i.d(this.h.F0());
            }
        }

        @Override  // androidx.navigation.NavigatorState
        public void g(@l NavBackStackEntry navBackStackEntry0, boolean z) {
            L.p(navBackStackEntry0, "popUpTo");
            Navigator navigator0 = this.h.w.f(navBackStackEntry0.f().t());
            if(L.g(navigator0, this.g)) {
                Function1 function10 = this.h.z;
                if(function10 != null) {
                    function10.invoke(navBackStackEntry0);
                    super.g(navBackStackEntry0, z);
                    return;
                }
                androidx.navigation.NavController.NavControllerNavigatorState.pop.1 navController$NavControllerNavigatorState$pop$10 = new a(navBackStackEntry0, z) {
                    final NavControllerNavigatorState e;
                    final NavBackStackEntry f;
                    final boolean g;

                    {
                        this.e = navController$NavControllerNavigatorState0;
                        this.f = navBackStackEntry0;
                        this.g = z;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        this.e.super.g(this.f, this.g);
                    }
                };
                this.h.y0(navBackStackEntry0, navController$NavControllerNavigatorState$pop$10);
                return;
            }
            Object object0 = this.h.x.get(navigator0);
            L.m(object0);
            ((NavControllerNavigatorState)object0).g(navBackStackEntry0, z);
        }

        @Override  // androidx.navigation.NavigatorState
        public void h(@l NavBackStackEntry navBackStackEntry0, boolean z) {
            L.p(navBackStackEntry0, "popUpTo");
            super.h(navBackStackEntry0, z);
            this.h.A.put(navBackStackEntry0, Boolean.valueOf(z));
        }

        @Override  // androidx.navigation.NavigatorState
        public void i(@l NavBackStackEntry navBackStackEntry0) {
            L.p(navBackStackEntry0, "backStackEntry");
            Navigator navigator0 = this.h.w.f(navBackStackEntry0.f().t());
            if(L.g(navigator0, this.g)) {
                Function1 function10 = this.h.y;
                if(function10 != null) {
                    function10.invoke(navBackStackEntry0);
                    this.m(navBackStackEntry0);
                    return;
                }
                Log.i("NavController", "Ignoring add of destination " + navBackStackEntry0.f() + " outside of the call to navigate(). ");
                return;
            }
            Object object0 = this.h.x.get(navigator0);
            if(object0 == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + navBackStackEntry0.f().t() + " should already be created").toString());
            }
            ((NavControllerNavigatorState)object0).i(navBackStackEntry0);
        }

        public final void m(@l NavBackStackEntry navBackStackEntry0) {
            L.p(navBackStackEntry0, "backStackEntry");
            super.i(navBackStackEntry0);
        }

        @l
        public final Navigator n() {
            return this.g;
        }
    }

    public interface OnDestinationChangedListener {
        void a(@l NavController arg1, @l NavDestination arg2, @m Bundle arg3);
    }

    @l
    private final Map A;
    private int B;
    @l
    private final List C;
    @l
    private final D D;
    @l
    private final kotlinx.coroutines.flow.D E;
    @l
    private final i F;
    @l
    public static final Companion G = null;
    @l
    private static final String H = "NavController";
    @l
    private static final String I = "android-support-nav:controller:navigatorState";
    @l
    private static final String J = "android-support-nav:controller:navigatorState:names";
    @l
    private static final String K = "android-support-nav:controller:backStack";
    @l
    private static final String L = "android-support-nav:controller:backStackDestIds";
    @l
    private static final String M = "android-support-nav:controller:backStackIds";
    @l
    private static final String N = "android-support-nav:controller:backStackStates";
    @l
    private static final String O = "android-support-nav:controller:backStackStates:";
    @RestrictTo({Scope.b})
    @l
    public static final String P = "android-support-nav:controller:deepLinkIds";
    @RestrictTo({Scope.b})
    @l
    public static final String Q = "android-support-nav:controller:deepLinkArgs";
    @RestrictTo({Scope.b})
    @l
    public static final String R = "android-support-nav:controller:deepLinkExtras";
    @RestrictTo({Scope.b})
    @l
    public static final String S = "android-support-nav:controller:deepLinkHandled";
    @l
    public static final String T = "android-support-nav:controller:deepLinkIntent";
    private static boolean U;
    @l
    private final Context a;
    @m
    private Activity b;
    @m
    private NavInflater c;
    @m
    private NavGraph d;
    @m
    private Bundle e;
    @m
    private Parcelable[] f;
    private boolean g;
    @l
    private final k h;
    @l
    private final E i;
    @l
    private final U j;
    @l
    private final Map k;
    @l
    private final Map l;
    @l
    private final Map m;
    @l
    private final Map n;
    @m
    private LifecycleOwner o;
    @m
    private OnBackPressedDispatcher p;
    @m
    private NavControllerViewModel q;
    @l
    private final CopyOnWriteArrayList r;
    @l
    private State s;
    @l
    private final LifecycleObserver t;
    @l
    private final OnBackPressedCallback u;
    private boolean v;
    @l
    private NavigatorProvider w;
    @l
    private final Map x;
    @m
    private Function1 y;
    @m
    private Function1 z;

    static {
        NavController.G = new Companion(null);
        NavController.U = true;
    }

    public NavController(@l Context context0) {
        Object object0 = null;
        L.p(context0, "context");
        super();
        this.a = context0;
        for(Object object1: p.n(context0, androidx.navigation.NavController.activity.1.e)) {
            if(((Context)object1) instanceof Activity) {
                object0 = object1;
                break;
            }
        }
        this.b = (Activity)object0;
        this.h = new k();
        E e0 = W.a(u.H());
        this.i = e0;
        this.j = kotlinx.coroutines.flow.k.m(e0);
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.n = new LinkedHashMap();
        this.r = new CopyOnWriteArrayList();
        this.s = State.b;
        this.t = (LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) -> {
            L.p(this, "this$0");
            L.p(lifecycleOwner0, "<anonymous parameter 0>");
            L.p(lifecycle$Event0, "event");
            State lifecycle$State0 = lifecycle$Event0.d();
            L.o(lifecycle$State0, "event.targetState");
            this.s = lifecycle$State0;
            if(this.d != null) {
                for(Object object0: this.C()) {
                    ((NavBackStackEntry)object0).j(lifecycle$Event0);
                }
            }
        };
        this.u = new OnBackPressedCallback() {
            final NavController d;

            {
                this.d = navController0;
                super(false);
            }

            @Override  // androidx.activity.OnBackPressedCallback
            public void g() {
                this.d.s0();
            }
        };
        this.v = true;
        this.w = new NavigatorProvider();
        this.x = new LinkedHashMap();
        this.A = new LinkedHashMap();
        this.w.b(new NavGraphNavigator(this.w));
        this.w.b(new ActivityNavigator(this.a));
        this.C = new ArrayList();
        this.D = kotlin.E.a(new a() {
            final NavController e;

            {
                this.e = navController0;
                super(0);
            }

            @l
            public final NavInflater b() {
                NavInflater navInflater0 = this.e.c;
                return navInflater0 == null ? new NavInflater(this.e.F(), this.e.w) : navInflater0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
        kotlinx.coroutines.flow.D d0 = K.b(1, 0, kotlinx.coroutines.channels.i.b, 2, null);
        this.E = d0;
        this.F = kotlinx.coroutines.flow.k.l(d0);

        final class androidx.navigation.NavController.activity.1 extends N implements Function1 {
            public static final androidx.navigation.NavController.activity.1 e;

            static {
                androidx.navigation.NavController.activity.1.e = new androidx.navigation.NavController.activity.1();
            }

            androidx.navigation.NavController.activity.1() {
                super(1);
            }

            @m
            public final Context a(@l Context context0) {
                L.p(context0, "it");
                return context0 instanceof ContextWrapper ? ((ContextWrapper)context0).getBaseContext() : null;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Context)object0));
            }
        }

    }

    @RestrictTo({Scope.b})
    @m
    public final NavDestination A(@l String s) {
        NavDestination navDestination0;
        L.p(s, "destinationRoute");
        NavGraph navGraph0 = this.d;
        if(navGraph0 == null) {
            return null;
        }
        L.m(navGraph0);
        if(L.g(navGraph0.v(), s)) {
            return this.d;
        }
        NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)this.C().p();
        if(navBackStackEntry0 == null) {
            navDestination0 = this.d;
            L.m(navDestination0);
        }
        else {
            navDestination0 = navBackStackEntry0.f();
            if(navDestination0 == null) {
                navDestination0 = this.d;
                L.m(navDestination0);
            }
        }
        if(navDestination0 instanceof NavGraph) {
            return ((NavGraph)navDestination0).W(s);
        }
        NavGraph navGraph1 = navDestination0.u();
        L.m(navGraph1);
        return navGraph1.W(s);
    }

    @MainThread
    private final boolean A0(@IdRes int v, boolean z, boolean z1) {
        if(this.C().isEmpty()) {
            return false;
        }
        NavDestination navDestination0 = null;
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: u.X4(this.C())) {
            NavDestination navDestination1 = ((NavBackStackEntry)object0).f();
            Navigator navigator0 = this.w.f(navDestination1.t());
            if(z || navDestination1.q() != v) {
                arrayList0.add(navigator0);
            }
            if(navDestination1.q() == v) {
                navDestination0 = navDestination1;
                break;
            }
        }
        if(navDestination0 == null) {
            Log.i("NavController", "Ignoring popBackStack to destination " + NavDestination.j.b(this.a, v) + " as it was not found on the current back stack");
            return false;
        }
        kotlin.jvm.internal.l0.a l0$a0 = new kotlin.jvm.internal.l0.a();
        k k0 = new k();
        for(Object object1: arrayList0) {
            kotlin.jvm.internal.l0.a l0$a1 = new kotlin.jvm.internal.l0.a();
            this.z0(((Navigator)object1), ((NavBackStackEntry)this.C().last()), z1, new Function1(l0$a0, this, z1, k0) {
                final kotlin.jvm.internal.l0.a e;
                final kotlin.jvm.internal.l0.a f;
                final NavController g;
                final boolean h;
                final k i;

                {
                    this.e = l0$a0;
                    this.f = l0$a1;
                    this.g = navController0;
                    this.h = z;
                    this.i = k0;
                    super(1);
                }

                public final void a(@l NavBackStackEntry navBackStackEntry0) {
                    L.p(navBackStackEntry0, "entry");
                    this.e.a = true;
                    this.f.a = true;
                    this.g.D0(navBackStackEntry0, this.h, this.i);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((NavBackStackEntry)object0));
                    return S0.a;
                }
            });
            if(!l0$a1.a) {
                break;
            }
        }
        if(z1) {
            if(!z) {
                for(Object object2: p.Z2(p.n(navDestination0, androidx.navigation.NavController.popBackStackInternal.3.e), new Function1() {
                    final NavController e;

                    {
                        this.e = navController0;
                        super(1);
                    }

                    @l
                    public final Boolean a(@l NavDestination navDestination0) {
                        L.p(navDestination0, "destination");
                        return Boolean.valueOf(!this.e.m.containsKey(navDestination0.q()));
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((NavDestination)object0));
                    }
                })) {
                    NavBackStackEntryState navBackStackEntryState0 = (NavBackStackEntryState)k0.j();
                    this.m.put(((NavDestination)object2).q(), (navBackStackEntryState0 == null ? null : navBackStackEntryState0.d()));
                }
            }
            if(!k0.isEmpty()) {
                NavBackStackEntryState navBackStackEntryState1 = (NavBackStackEntryState)k0.first();
                for(Object object3: p.Z2(p.n(this.y(navBackStackEntryState1.c()), androidx.navigation.NavController.popBackStackInternal.6.e), new Function1() {
                    final NavController e;

                    {
                        this.e = navController0;
                        super(1);
                    }

                    @l
                    public final Boolean a(@l NavDestination navDestination0) {
                        L.p(navDestination0, "destination");
                        return Boolean.valueOf(!this.e.m.containsKey(navDestination0.q()));
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((NavDestination)object0));
                    }
                })) {
                    this.m.put(((NavDestination)object3).q(), navBackStackEntryState1.d());
                }
                this.n.put(navBackStackEntryState1.d(), k0);
            }
        }
        this.X0();
        return l0$a0.a;

        final class androidx.navigation.NavController.popBackStackInternal.3 extends N implements Function1 {
            public static final androidx.navigation.NavController.popBackStackInternal.3 e;

            static {
                androidx.navigation.NavController.popBackStackInternal.3.e = new androidx.navigation.NavController.popBackStackInternal.3();
            }

            androidx.navigation.NavController.popBackStackInternal.3() {
                super(1);
            }

            @m
            public final NavDestination a(@l NavDestination navDestination0) {
                L.p(navDestination0, "destination");
                NavGraph navGraph0 = navDestination0.u();
                return navGraph0 != null && navGraph0.c0() == navDestination0.q() ? navDestination0.u() : null;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((NavDestination)object0));
            }
        }


        final class androidx.navigation.NavController.popBackStackInternal.6 extends N implements Function1 {
            public static final androidx.navigation.NavController.popBackStackInternal.6 e;

            static {
                androidx.navigation.NavController.popBackStackInternal.6.e = new androidx.navigation.NavController.popBackStackInternal.6();
            }

            androidx.navigation.NavController.popBackStackInternal.6() {
                super(1);
            }

            @m
            public final NavDestination a(@l NavDestination navDestination0) {
                L.p(navDestination0, "destination");
                NavGraph navGraph0 = navDestination0.u();
                return navGraph0 != null && navGraph0.c0() == navDestination0.q() ? navDestination0.u() : null;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((NavDestination)object0));
            }
        }

    }

    private final String B(int[] arr_v) {
        NavGraph navGraph0 = this.d;
        for(int v = 0; true; ++v) {
            NavDestination navDestination0 = null;
            if(v >= arr_v.length) {
                break;
            }
            int v1 = arr_v[v];
            if(v == 0) {
                NavGraph navGraph1 = this.d;
                L.m(navGraph1);
                if(navGraph1.q() == v1) {
                    navDestination0 = this.d;
                }
            }
            else {
                L.m(navGraph0);
                navDestination0 = navGraph0.U(v1);
            }
            if(navDestination0 == null) {
                return NavDestination.j.b(this.a, v1);
            }
            if(v != arr_v.length - 1 && navDestination0 instanceof NavGraph) {
                NavGraph navGraph2;
                for(navGraph2 = (NavGraph)navDestination0; true; navGraph2 = (NavGraph)navGraph2.U(navGraph2.c0())) {
                    L.m(navGraph2);
                    if(!(navGraph2.U(navGraph2.c0()) instanceof NavGraph)) {
                        break;
                    }
                }
                navGraph0 = navGraph2;
            }
        }
        return null;
    }

    static void B0(NavController navController0, Navigator navigator0, NavBackStackEntry navBackStackEntry0, boolean z, Function1 function10, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if((v & 4) != 0) {
            function10 = androidx.navigation.NavController.popBackStackInternal.1.e;
        }
        navController0.z0(navigator0, navBackStackEntry0, z, function10);

        final class androidx.navigation.NavController.popBackStackInternal.1 extends N implements Function1 {
            public static final androidx.navigation.NavController.popBackStackInternal.1 e;

            static {
                androidx.navigation.NavController.popBackStackInternal.1.e = new androidx.navigation.NavController.popBackStackInternal.1();
            }

            androidx.navigation.NavController.popBackStackInternal.1() {
                super(1);
            }

            public final void a(@l NavBackStackEntry navBackStackEntry0) {
                L.p(navBackStackEntry0, "it");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((NavBackStackEntry)object0));
                return S0.a;
            }
        }

    }

    @RestrictTo({Scope.b})
    @l
    public k C() {
        return this.h;
    }

    static boolean C0(NavController navController0, int v, boolean z, boolean z1, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if((v1 & 4) != 0) {
            z1 = false;
        }
        return navController0.A0(v, z, z1);
    }

    @l
    public NavBackStackEntry D(@IdRes int v) {
        Object object0 = null;
        k k0 = this.C();
        ListIterator listIterator0 = k0.listIterator(k0.size());
        while(listIterator0.hasPrevious()) {
            Object object1 = listIterator0.previous();
            if(((NavBackStackEntry)object1).f().q() == v) {
                object0 = object1;
                break;
            }
        }
        if(((NavBackStackEntry)object0) == null) {
            throw new IllegalArgumentException(("No destination with ID " + v + " is on the NavController\'s back stack. The current destination is " + this.I()).toString());
        }
        return (NavBackStackEntry)object0;
    }

    private final void D0(NavBackStackEntry navBackStackEntry0, boolean z, k k0) {
        NavBackStackEntry navBackStackEntry1 = (NavBackStackEntry)this.C().last();
        if(!L.g(navBackStackEntry1, navBackStackEntry0)) {
            throw new IllegalStateException(("Attempted to pop " + navBackStackEntry0.f() + ", which is not the top of the back stack (" + navBackStackEntry1.f() + ')').toString());
        }
        this.C().removeLast();
        Navigator navigator0 = this.N().f(navBackStackEntry1.f().t());
        NavControllerNavigatorState navController$NavControllerNavigatorState0 = (NavControllerNavigatorState)this.x.get(navigator0);
        boolean z1 = true;
        if(navController$NavControllerNavigatorState0 == null) {
        label_11:
            if(!this.l.containsKey(navBackStackEntry1)) {
                z1 = false;
            }
        }
        else {
            U u0 = navController$NavControllerNavigatorState0.c();
            if(u0 == null) {
                goto label_11;
            }
            else {
                Set set0 = (Set)u0.getValue();
                if(set0 == null || !set0.contains(navBackStackEntry1)) {
                    goto label_11;
                }
            }
        }
        State lifecycle$State0 = navBackStackEntry1.getLifecycle().b();
        State lifecycle$State1 = State.c;
        if(lifecycle$State0.b(lifecycle$State1)) {
            if(z) {
                navBackStackEntry1.m(lifecycle$State1);
                k0.addFirst(new NavBackStackEntryState(navBackStackEntry1));
            }
            if(z1) {
                navBackStackEntry1.m(lifecycle$State1);
            }
            else {
                navBackStackEntry1.m(State.a);
                this.V0(navBackStackEntry1);
            }
        }
        if(!z && !z1) {
            NavControllerViewModel navControllerViewModel0 = this.q;
            if(navControllerViewModel0 != null) {
                navControllerViewModel0.d(navBackStackEntry1.g());
            }
        }
    }

    @l
    public final NavBackStackEntry E(@l String s) {
        Object object0 = null;
        L.p(s, "route");
        k k0 = this.C();
        ListIterator listIterator0 = k0.listIterator(k0.size());
        while(listIterator0.hasPrevious()) {
            Object object1 = listIterator0.previous();
            if(L.g(((NavBackStackEntry)object1).f().v(), s)) {
                object0 = object1;
                break;
            }
        }
        if(((NavBackStackEntry)object0) == null) {
            throw new IllegalArgumentException(("No destination with route " + s + " is on the NavController\'s back stack. The current destination is " + this.I()).toString());
        }
        return (NavBackStackEntry)object0;
    }

    static void E0(NavController navController0, NavBackStackEntry navBackStackEntry0, boolean z, k k0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
        }
        if((v & 2) != 0) {
            z = false;
        }
        if((v & 4) != 0) {
            k0 = new k();
        }
        navController0.D0(navBackStackEntry0, z, k0);
    }

    @RestrictTo({Scope.b})
    @l
    public final Context F() {
        return this.a;
    }

    @l
    public final List F0() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.x.values()) {
            Iterable iterable0 = (Iterable)((NavControllerNavigatorState)object0).c().getValue();
            ArrayList arrayList1 = new ArrayList();
            for(Object object1: iterable0) {
                if(!arrayList0.contains(((NavBackStackEntry)object1)) && !((NavBackStackEntry)object1).h().b(State.d)) {
                    arrayList1.add(object1);
                }
            }
            u.q0(arrayList0, arrayList1);
        }
        ArrayList arrayList2 = new ArrayList();
        for(Object object2: this.C()) {
            if(!arrayList0.contains(((NavBackStackEntry)object2)) && ((NavBackStackEntry)object2).h().b(State.d)) {
                arrayList2.add(object2);
            }
        }
        u.q0(arrayList0, arrayList2);
        List list0 = new ArrayList();
        for(Object object3: arrayList0) {
            if(!(((NavBackStackEntry)object3).f() instanceof NavGraph)) {
                list0.add(object3);
            }
        }
        return list0;
    }

    @m
    public NavBackStackEntry G() {
        return (NavBackStackEntry)this.C().p();
    }

    public void G0(@l OnDestinationChangedListener navController$OnDestinationChangedListener0) {
        L.p(navController$OnDestinationChangedListener0, "listener");
        this.r.remove(navController$OnDestinationChangedListener0);
    }

    @l
    public final i H() {
        return this.F;
    }

    @CallSuper
    public void H0(@m Bundle bundle0) {
        if(bundle0 == null) {
            return;
        }
        bundle0.setClassLoader(this.a.getClassLoader());
        this.e = bundle0.getBundle("android-support-nav:controller:navigatorState");
        this.f = bundle0.getParcelableArray("android-support-nav:controller:backStack");
        this.n.clear();
        int[] arr_v = bundle0.getIntArray("android-support-nav:controller:backStackDestIds");
        ArrayList arrayList0 = bundle0.getStringArrayList("android-support-nav:controller:backStackIds");
        if(arr_v != null && arrayList0 != null) {
            int v = 0;
            for(int v1 = 0; v < arr_v.length; ++v1) {
                Integer integer0 = (int)arr_v[v];
                Object object0 = arrayList0.get(v1);
                this.m.put(integer0, object0);
                ++v;
            }
        }
        ArrayList arrayList1 = bundle0.getStringArrayList("android-support-nav:controller:backStackStates");
        if(arrayList1 != null) {
            for(Object object1: arrayList1) {
                String s = (String)object1;
                Parcelable[] arr_parcelable = bundle0.getParcelableArray("android-support-nav:controller:backStackStates:" + s);
                if(arr_parcelable != null) {
                    Map map0 = this.n;
                    L.o(s, "id");
                    k k0 = new k(arr_parcelable.length);
                    Iterator iterator1 = kotlin.jvm.internal.i.a(arr_parcelable);
                    while(iterator1.hasNext()) {
                        Object object2 = iterator1.next();
                        if(((Parcelable)object2) == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        }
                        k0.add(((NavBackStackEntryState)(((Parcelable)object2))));
                    }
                    map0.put(s, k0);
                }
            }
        }
        this.g = bundle0.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    @m
    public NavDestination I() {
        NavBackStackEntry navBackStackEntry0 = this.G();
        return navBackStackEntry0 == null ? null : navBackStackEntry0.f();
    }

    private final boolean I0(int v, Bundle bundle0, NavOptions navOptions0, Extras navigator$Extras0) {
        String s1;
        if(!this.m.containsKey(v)) {
            return false;
        }
        String s = (String)this.m.get(v);
        u.G0(this.m.values(), new Function1() {
            final String e;

            {
                this.e = s;
                super(1);
            }

            @l
            public final Boolean b(@m String s) {
                return Boolean.valueOf(L.g(s, this.e));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((String)object0));
            }
        });
        List list0 = this.S(((k)v0.k(this.n).remove(s)));
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: list0) {
            if(!(((NavBackStackEntry)object0).f() instanceof NavGraph)) {
                arrayList1.add(object0);
            }
        }
        for(Object object1: arrayList1) {
            NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)object1;
            List list1 = (List)u.v3(arrayList0);
            if(list1 == null) {
                s1 = null;
            }
            else {
                NavBackStackEntry navBackStackEntry1 = (NavBackStackEntry)u.p3(list1);
                if(navBackStackEntry1 != null) {
                    NavDestination navDestination0 = navBackStackEntry1.f();
                    if(navDestination0 != null) {
                        s1 = navDestination0.t();
                    }
                }
            }
            if(L.g(s1, navBackStackEntry0.f().t())) {
                list1.add(navBackStackEntry0);
            }
            else {
                arrayList0.add(u.S(new NavBackStackEntry[]{navBackStackEntry0}));
            }
        }
        kotlin.jvm.internal.l0.a l0$a0 = new kotlin.jvm.internal.l0.a();
        for(Object object2: arrayList0) {
            this.o0(this.w.f(((NavBackStackEntry)u.B2(((List)object2))).f().t()), ((List)object2), navOptions0, navigator$Extras0, new Function1(list0, new f(), this, bundle0) {
                final kotlin.jvm.internal.l0.a e;
                final List f;
                final f g;
                final NavController h;
                final Bundle i;

                {
                    this.e = l0$a0;
                    this.f = list0;
                    this.g = l0$f0;
                    this.h = navController0;
                    this.i = bundle0;
                    super(1);
                }

                public final void a(@l NavBackStackEntry navBackStackEntry0) {
                    List list0;
                    L.p(navBackStackEntry0, "entry");
                    this.e.a = true;
                    int v = this.f.indexOf(navBackStackEntry0);
                    if(v == -1) {
                        list0 = u.H();
                    }
                    else {
                        list0 = this.f.subList(this.g.a, v + 1);
                        this.g.a = v + 1;
                    }
                    this.h.o(navBackStackEntry0.f(), this.i, navBackStackEntry0, list0);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((NavBackStackEntry)object0));
                    return S0.a;
                }
            });
        }
        return l0$a0.a;
    }

    private final int J() {
        k k0 = this.C();
        int v = 0;
        if(!(k0 instanceof Collection) || !k0.isEmpty()) {
            for(Object object0: k0) {
                if(!(((NavBackStackEntry)object0).f() instanceof NavGraph)) {
                    ++v;
                    if(v < 0) {
                        u.Y();
                    }
                }
            }
        }
        return v;
    }

    @CallSuper
    @m
    public Bundle J0() {
        Bundle bundle2;
        ArrayList arrayList0 = new ArrayList();
        Bundle bundle0 = new Bundle();
        for(Object object0: this.w.g().entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            Bundle bundle1 = ((Navigator)((Map.Entry)object0).getValue()).i();
            if(bundle1 != null) {
                arrayList0.add(s);
                bundle0.putBundle(s, bundle1);
            }
        }
        if(arrayList0.isEmpty()) {
            bundle2 = null;
        }
        else {
            bundle2 = new Bundle();
            bundle0.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList0);
            bundle2.putBundle("android-support-nav:controller:navigatorState", bundle0);
        }
        if(!this.C().isEmpty()) {
            if(bundle2 == null) {
                bundle2 = new Bundle();
            }
            Parcelable[] arr_parcelable = new Parcelable[this.C().size()];
            int v = 0;
            for(Object object1: this.C()) {
                arr_parcelable[v] = new NavBackStackEntryState(((NavBackStackEntry)object1));
                ++v;
            }
            bundle2.putParcelableArray("android-support-nav:controller:backStack", arr_parcelable);
        }
        if(!this.m.isEmpty()) {
            if(bundle2 == null) {
                bundle2 = new Bundle();
            }
            int[] arr_v = new int[this.m.size()];
            ArrayList arrayList1 = new ArrayList();
            int v1 = 0;
            for(Object object2: this.m.entrySet()) {
                int v2 = ((Number)((Map.Entry)object2).getKey()).intValue();
                String s1 = (String)((Map.Entry)object2).getValue();
                arr_v[v1] = v2;
                arrayList1.add(s1);
                ++v1;
            }
            bundle2.putIntArray("android-support-nav:controller:backStackDestIds", arr_v);
            bundle2.putStringArrayList("android-support-nav:controller:backStackIds", arrayList1);
        }
        if(!this.n.isEmpty()) {
            if(bundle2 == null) {
                bundle2 = new Bundle();
            }
            ArrayList arrayList2 = new ArrayList();
            for(Object object3: this.n.entrySet()) {
                String s2 = (String)((Map.Entry)object3).getKey();
                k k0 = (k)((Map.Entry)object3).getValue();
                arrayList2.add(s2);
                Parcelable[] arr_parcelable1 = new Parcelable[k0.size()];
                int v3 = 0;
                for(Object object4: k0) {
                    if(v3 < 0) {
                        u.Z();
                    }
                    arr_parcelable1[v3] = (NavBackStackEntryState)object4;
                    ++v3;
                }
                bundle2.putParcelableArray("android-support-nav:controller:backStackStates:" + s2, arr_parcelable1);
            }
            bundle2.putStringArrayList("android-support-nav:controller:backStackStates", arrayList2);
        }
        if(this.g) {
            if(bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android-support-nav:controller:deepLinkHandled", this.g);
        }
        return bundle2;
    }

    @MainThread
    @l
    public NavGraph K() {
        NavGraph navGraph0 = this.d;
        if(navGraph0 == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        return navGraph0;
    }

    @CallSuper
    @MainThread
    public void K0(@NavigationRes int v) {
        this.N0(this.M().b(v), null);
    }

    @l
    public final State L() {
        return this.o == null ? State.c : this.s;
    }

    @CallSuper
    @MainThread
    public void L0(@NavigationRes int v, @m Bundle bundle0) {
        this.N0(this.M().b(v), bundle0);
    }

    @l
    public NavInflater M() {
        return (NavInflater)this.D.getValue();
    }

    @CallSuper
    @MainThread
    public void M0(@l NavGraph navGraph0) {
        L.p(navGraph0, "graph");
        this.N0(navGraph0, null);
    }

    @l
    public NavigatorProvider N() {
        return this.w;
    }

    @CallSuper
    @MainThread
    public void N0(@l NavGraph navGraph0, @m Bundle bundle0) {
        L.p(navGraph0, "graph");
        if(!L.g(this.d, navGraph0)) {
            NavGraph navGraph1 = this.d;
            if(navGraph1 != null) {
                for(Object object0: new ArrayList(this.m.keySet())) {
                    L.o(((Integer)object0), "id");
                    this.t(((int)(((Integer)object0))));
                }
                NavController.C0(this, navGraph1.q(), true, false, 4, null);
            }
            this.d = navGraph0;
            this.r0(bundle0);
            return;
        }
        int v = navGraph0.Z().y();
        for(int v1 = 0; v1 < v; ++v1) {
            NavDestination navDestination0 = (NavDestination)navGraph0.Z().z(v1);
            NavGraph navGraph2 = this.d;
            L.m(navGraph2);
            navGraph2.Z().v(v1, navDestination0);
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: this.C()) {
                if(navDestination0 != null && ((NavBackStackEntry)object1).f().q() == navDestination0.q()) {
                    arrayList0.add(object1);
                }
            }
            for(Object object2: arrayList0) {
                L.o(navDestination0, "newDestination");
                ((NavBackStackEntry)object2).l(navDestination0);
            }
        }
    }

    @m
    public NavBackStackEntry O() {
        Iterator iterator0 = u.X4(this.C()).iterator();
        if(iterator0.hasNext()) {
            iterator0.next();
        }
        for(Object object0: p.e(iterator0)) {
            if(!(((NavBackStackEntry)object0).f() instanceof NavGraph)) {
                return (NavBackStackEntry)object0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public final void O0(@l State lifecycle$State0) {
        L.p(lifecycle$State0, "<set-?>");
        this.s = lifecycle$State0;
    }

    @l
    public ViewModelStoreOwner P(@IdRes int v) {
        if(this.q == null) {
            throw new IllegalStateException("You must call setViewModelStore() before calling getViewModelStoreOwner().");
        }
        ViewModelStoreOwner viewModelStoreOwner0 = this.D(v);
        if(!(((NavBackStackEntry)viewModelStoreOwner0).f() instanceof NavGraph)) {
            throw new IllegalArgumentException(("No NavGraph with ID " + v + " is on the NavController\'s back stack").toString());
        }
        return viewModelStoreOwner0;
    }

    @RestrictTo({Scope.b})
    public void P0(@l LifecycleOwner lifecycleOwner0) {
        L.p(lifecycleOwner0, "owner");
        if(L.g(lifecycleOwner0, this.o)) {
            return;
        }
        LifecycleOwner lifecycleOwner1 = this.o;
        if(lifecycleOwner1 != null) {
            Lifecycle lifecycle0 = lifecycleOwner1.getLifecycle();
            if(lifecycle0 != null) {
                lifecycle0.d(this.t);
            }
        }
        this.o = lifecycleOwner0;
        lifecycleOwner0.getLifecycle().a(this.t);
    }

    @l
    public final U Q() {
        return this.j;
    }

    @RestrictTo({Scope.b})
    public void Q0(@l NavigatorProvider navigatorProvider0) {
        L.p(navigatorProvider0, "navigatorProvider");
        if(!this.C().isEmpty()) {
            throw new IllegalStateException("NavigatorProvider must be set before setGraph call");
        }
        this.w = navigatorProvider0;
    }

    @MainThread
    public boolean R(@m Intent intent0) {
        NavDestination navDestination2;
        int[] arr_v2;
        if(intent0 == null) {
            return false;
        }
        Bundle bundle0 = intent0.getExtras();
        int[] arr_v = bundle0 == null ? null : bundle0.getIntArray("android-support-nav:controller:deepLinkIds");
        ArrayList arrayList0 = bundle0 == null ? null : bundle0.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
        Bundle bundle1 = new Bundle();
        Bundle bundle2 = bundle0 == null ? null : bundle0.getBundle("android-support-nav:controller:deepLinkExtras");
        if(bundle2 != null) {
            bundle1.putAll(bundle2);
        }
        if(arr_v != null && arr_v.length != 0) {
            arr_v2 = arr_v;
        }
        else {
            NavGraph navGraph0 = this.d;
            L.m(navGraph0);
            DeepLinkMatch navDestination$DeepLinkMatch0 = navGraph0.z(new NavDeepLinkRequest(intent0));
            if(navDestination$DeepLinkMatch0 == null) {
                arr_v2 = arr_v;
            }
            else {
                NavDestination navDestination0 = navDestination$DeepLinkMatch0.b();
                int[] arr_v1 = NavDestination.j(navDestination0, null, 1, null);
                Bundle bundle3 = navDestination0.g(navDestination$DeepLinkMatch0.c());
                if(bundle3 != null) {
                    bundle1.putAll(bundle3);
                }
                arr_v2 = arr_v1;
                arrayList0 = null;
            }
        }
        if(arr_v2 != null && arr_v2.length != 0) {
            String s = this.B(arr_v2);
            if(s != null) {
                Log.i("NavController", "Could not find destination " + s + " in the navigation graph, ignoring the deep link from " + intent0);
                return false;
            }
            bundle1.putParcelable("android-support-nav:controller:deepLinkIntent", intent0);
            Bundle[] arr_bundle = new Bundle[arr_v2.length];
            for(int v1 = 0; v1 < arr_v2.length; ++v1) {
                Bundle bundle4 = new Bundle();
                bundle4.putAll(bundle1);
                if(arrayList0 != null) {
                    Bundle bundle5 = (Bundle)arrayList0.get(v1);
                    if(bundle5 != null) {
                        bundle4.putAll(bundle5);
                    }
                }
                arr_bundle[v1] = bundle4;
            }
            int v2 = intent0.getFlags();
            if((0x10000000 & v2) != 0 && (v2 & 0x8000) == 0) {
                intent0.addFlags(0x8000);
                TaskStackBuilder taskStackBuilder0 = TaskStackBuilder.h(this.a).b(intent0);
                L.o(taskStackBuilder0, "create(context)\n        …ntWithParentStack(intent)");
                taskStackBuilder0.r();
                Activity activity0 = this.b;
                if(activity0 != null) {
                    activity0.finish();
                    activity0.overridePendingTransition(0, 0);
                }
                return true;
            }
            if((0x10000000 & v2) != 0) {
                if(!this.C().isEmpty()) {
                    NavGraph navGraph1 = this.d;
                    L.m(navGraph1);
                    NavController.C0(this, navGraph1.q(), true, false, 4, null);
                }
                for(int v = 0; v < arr_v2.length; ++v) {
                    int v3 = arr_v2[v];
                    Bundle bundle6 = arr_bundle[v];
                    NavDestination navDestination1 = this.y(v3);
                    if(navDestination1 == null) {
                        throw new IllegalStateException("Deep Linking failed: destination " + NavDestination.j.b(this.a, v3) + " cannot be found from the current destination " + this.I());
                    }
                    this.f0(navDestination1, bundle6, NavOptionsBuilderKt.a(new Function1(this) {
                        final NavDestination e;
                        final NavController f;

                        {
                            this.e = navDestination0;
                            this.f = navController0;
                            super(1);
                        }

                        public final void a(@l NavOptionsBuilder navOptionsBuilder0) {
                            L.p(navOptionsBuilder0, "$this$navOptions");
                            navOptionsBuilder0.a(androidx.navigation.NavController.handleDeepLink.2.1.e);
                            NavDestination navDestination0 = this.e;
                            if(navDestination0 instanceof NavGraph) {
                                kotlin.sequences.m m0 = NavDestination.j.c(navDestination0);
                                NavController navController0 = this.f;
                                for(Object object0: m0) {
                                    NavDestination navDestination1 = navController0.I();
                                    if(L.g(((NavDestination)object0), (navDestination1 == null ? null : navDestination1.u()))) {
                                        return;
                                    }
                                    if(false) {
                                        break;
                                    }
                                }
                                NavGraph navGraph0 = this.f.K();
                                navOptionsBuilder0.i(NavGraph.p.a(navGraph0).q(), androidx.navigation.NavController.handleDeepLink.2.2.e);
                            }

                            final class androidx.navigation.NavController.handleDeepLink.2.1 extends N implements Function1 {
                                public static final androidx.navigation.NavController.handleDeepLink.2.1 e;

                                static {
                                    androidx.navigation.NavController.handleDeepLink.2.1.e = new androidx.navigation.NavController.handleDeepLink.2.1();
                                }

                                androidx.navigation.NavController.handleDeepLink.2.1() {
                                    super(1);
                                }

                                public final void a(@l AnimBuilder animBuilder0) {
                                    L.p(animBuilder0, "$this$anim");
                                    animBuilder0.e(0);
                                    animBuilder0.f(0);
                                }

                                @Override  // kotlin.jvm.functions.Function1
                                public Object invoke(Object object0) {
                                    this.a(((AnimBuilder)object0));
                                    return S0.a;
                                }
                            }


                            final class androidx.navigation.NavController.handleDeepLink.2.2 extends N implements Function1 {
                                public static final androidx.navigation.NavController.handleDeepLink.2.2 e;

                                static {
                                    androidx.navigation.NavController.handleDeepLink.2.2.e = new androidx.navigation.NavController.handleDeepLink.2.2();
                                }

                                androidx.navigation.NavController.handleDeepLink.2.2() {
                                    super(1);
                                }

                                public final void a(@l PopUpToBuilder popUpToBuilder0) {
                                    L.p(popUpToBuilder0, "$this$popUpTo");
                                    popUpToBuilder0.d(true);
                                }

                                @Override  // kotlin.jvm.functions.Function1
                                public Object invoke(Object object0) {
                                    this.a(((PopUpToBuilder)object0));
                                    return S0.a;
                                }
                            }

                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.a(((NavOptionsBuilder)object0));
                            return S0.a;
                        }
                    }), null);
                }
                return true;
            }
            NavGraph navGraph2 = this.d;
            for(int v4 = 0; v4 < arr_v2.length; ++v4) {
                int v5 = arr_v2[v4];
                Bundle bundle7 = arr_bundle[v4];
                if(v4 == 0) {
                    navDestination2 = this.d;
                }
                else {
                    L.m(navGraph2);
                    navDestination2 = navGraph2.U(v5);
                }
                if(navDestination2 == null) {
                    throw new IllegalStateException("Deep Linking failed: destination " + NavDestination.j.b(this.a, v5) + " cannot be found in graph " + navGraph2);
                }
                if(v4 == arr_v2.length - 1) {
                    Builder navOptions$Builder0 = new Builder();
                    NavGraph navGraph4 = this.d;
                    L.m(navGraph4);
                    this.f0(navDestination2, bundle7, Builder.k(navOptions$Builder0, navGraph4.q(), true, false, 4, null).b(0).c(0).a(), null);
                }
                else if(navDestination2 instanceof NavGraph) {
                    NavGraph navGraph3;
                    for(navGraph3 = (NavGraph)navDestination2; true; navGraph3 = (NavGraph)navGraph3.U(navGraph3.c0())) {
                        L.m(navGraph3);
                        if(!(navGraph3.U(navGraph3.c0()) instanceof NavGraph)) {
                            break;
                        }
                    }
                    navGraph2 = navGraph3;
                }
            }
            this.g = true;
            return true;
        }
        return false;
    }

    @RestrictTo({Scope.b})
    public void R0(@l OnBackPressedDispatcher onBackPressedDispatcher0) {
        L.p(onBackPressedDispatcher0, "dispatcher");
        if(L.g(onBackPressedDispatcher0, this.p)) {
            return;
        }
        LifecycleOwner lifecycleOwner0 = this.o;
        if(lifecycleOwner0 == null) {
            throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
        }
        this.u.k();
        this.p = onBackPressedDispatcher0;
        onBackPressedDispatcher0.i(lifecycleOwner0, this.u);
        Lifecycle lifecycle0 = lifecycleOwner0.getLifecycle();
        lifecycle0.d(this.t);
        lifecycle0.a(this.t);
    }

    private final List S(k k0) {
        NavDestination navDestination0;
        List list0 = new ArrayList();
        NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)this.C().p();
        if(navBackStackEntry0 == null) {
            navDestination0 = this.K();
        }
        else {
            navDestination0 = navBackStackEntry0.f();
            if(navDestination0 == null) {
                navDestination0 = this.K();
            }
        }
        if(k0 != null) {
            for(Object object0: k0) {
                NavBackStackEntryState navBackStackEntryState0 = (NavBackStackEntryState)object0;
                NavDestination navDestination1 = this.z(navDestination0, navBackStackEntryState0.c());
                if(navDestination1 == null) {
                    throw new IllegalStateException(("Restore State failed: destination " + NavDestination.j.b(this.a, navBackStackEntryState0.c()) + " cannot be found from the current destination " + navDestination0).toString());
                }
                State lifecycle$State0 = this.L();
                list0.add(navBackStackEntryState0.f(this.a, navDestination1, lifecycle$State0, this.q));
                navDestination0 = navDestination1;
            }
        }
        return list0;
    }

    @RestrictTo({Scope.b})
    public void S0(@l ViewModelStore viewModelStore0) {
        L.p(viewModelStore0, "viewModelStore");
        androidx.navigation.NavControllerViewModel.Companion navControllerViewModel$Companion0 = NavControllerViewModel.b;
        if(L.g(this.q, navControllerViewModel$Companion0.a(viewModelStore0))) {
            return;
        }
        if(!this.C().isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        this.q = navControllerViewModel$Companion0.a(viewModelStore0);
    }

    // 检测为 Lambda 实现
    private static final void T(NavController navController0, LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) [...]

    private final boolean T0() {
        int v = 0;
        if(!this.g) {
            return false;
        }
        Activity activity0 = this.b;
        L.m(activity0);
        Intent intent0 = activity0.getIntent();
        Bundle bundle0 = intent0.getExtras();
        L.m(bundle0);
        int[] arr_v = bundle0.getIntArray("android-support-nav:controller:deepLinkIds");
        L.m(arr_v);
        List list0 = kotlin.collections.l.Sy(arr_v);
        ArrayList arrayList0 = bundle0.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
        int v1 = ((Number)u.O0(list0)).intValue();
        if(arrayList0 != null) {
            Bundle bundle1 = (Bundle)u.O0(arrayList0);
        }
        if(list0.isEmpty()) {
            return false;
        }
        NavDestination navDestination0 = this.z(this.K(), v1);
        if(navDestination0 instanceof NavGraph) {
            v1 = NavGraph.p.a(((NavGraph)navDestination0)).q();
        }
        NavDestination navDestination1 = this.I();
        if(navDestination1 != null && v1 == navDestination1.q()) {
            NavDeepLinkBuilder navDeepLinkBuilder0 = this.u();
            Bundle bundle2 = BundleKt.b(new V[]{r0.a("android-support-nav:controller:deepLinkIntent", intent0)});
            Bundle bundle3 = bundle0.getBundle("android-support-nav:controller:deepLinkExtras");
            if(bundle3 != null) {
                bundle2.putAll(bundle3);
            }
            navDeepLinkBuilder0.k(bundle2);
            for(Object object0: list0) {
                if(v < 0) {
                    u.Z();
                }
                navDeepLinkBuilder0.b(((Number)object0).intValue(), (arrayList0 == null ? null : ((Bundle)arrayList0.get(v))));
                ++v;
            }
            navDeepLinkBuilder0.h().r();
            Activity activity1 = this.b;
            if(activity1 != null) {
                activity1.finish();
            }
            return true;
        }
        return false;
    }

    private final void U(NavBackStackEntry navBackStackEntry0, NavBackStackEntry navBackStackEntry1) {
        this.k.put(navBackStackEntry0, navBackStackEntry1);
        if(this.l.get(navBackStackEntry1) == null) {
            AtomicInteger atomicInteger0 = new AtomicInteger(0);
            this.l.put(navBackStackEntry1, atomicInteger0);
        }
        Object object0 = this.l.get(navBackStackEntry1);
        L.m(object0);
        ((AtomicInteger)object0).incrementAndGet();
    }

    private final boolean U0() {
        NavDestination navDestination0 = this.I();
        L.m(navDestination0);
        int v = navDestination0.q();
        for(NavGraph navGraph0 = navDestination0.u(); navGraph0 != null; navGraph0 = navGraph0.u()) {
            if(navGraph0.c0() != v) {
                Bundle bundle0 = new Bundle();
                Activity activity0 = this.b;
                if(activity0 != null) {
                    L.m(activity0);
                    if(activity0.getIntent() != null) {
                        Activity activity1 = this.b;
                        L.m(activity1);
                        if(activity1.getIntent().getData() != null) {
                            Activity activity2 = this.b;
                            L.m(activity2);
                            bundle0.putParcelable("android-support-nav:controller:deepLinkIntent", activity2.getIntent());
                            NavGraph navGraph1 = this.d;
                            L.m(navGraph1);
                            Activity activity3 = this.b;
                            L.m(activity3);
                            Intent intent0 = activity3.getIntent();
                            L.o(intent0, "activity!!.intent");
                            DeepLinkMatch navDestination$DeepLinkMatch0 = navGraph1.z(new NavDeepLinkRequest(intent0));
                            if(navDestination$DeepLinkMatch0 != null) {
                                bundle0.putAll(navDestination$DeepLinkMatch0.b().g(navDestination$DeepLinkMatch0.c()));
                            }
                        }
                    }
                }
                NavDeepLinkBuilder.r(new NavDeepLinkBuilder(this), navGraph0.q(), null, 2, null).k(bundle0).h().r();
                Activity activity4 = this.b;
                if(activity4 != null) {
                    activity4.finish();
                }
                return true;
            }
            v = navGraph0.q();
        }
        return false;
    }

    @MainThread
    public void V(@IdRes int v) {
        this.W(v, null);
    }

    @m
    public final NavBackStackEntry V0(@l NavBackStackEntry navBackStackEntry0) {
        L.p(navBackStackEntry0, "child");
        NavBackStackEntry navBackStackEntry1 = (NavBackStackEntry)this.k.remove(navBackStackEntry0);
        Integer integer0 = null;
        if(navBackStackEntry1 == null) {
            return null;
        }
        AtomicInteger atomicInteger0 = (AtomicInteger)this.l.get(navBackStackEntry1);
        if(atomicInteger0 != null) {
            integer0 = atomicInteger0.decrementAndGet();
        }
        if(integer0 != null && ((int)integer0) == 0) {
            Navigator navigator0 = this.w.f(navBackStackEntry1.f().t());
            NavControllerNavigatorState navController$NavControllerNavigatorState0 = (NavControllerNavigatorState)this.x.get(navigator0);
            if(navController$NavControllerNavigatorState0 != null) {
                navController$NavControllerNavigatorState0.e(navBackStackEntry1);
            }
            this.l.remove(navBackStackEntry1);
        }
        return navBackStackEntry1;
    }

    @MainThread
    public void W(@IdRes int v, @m Bundle bundle0) {
        this.X(v, bundle0, null);
    }

    public final void W0() {
        Boolean boolean0;
        List list0 = u.Y5(this.C());
        if(list0.isEmpty()) {
            return;
        }
        NavDestination navDestination0 = null;
        NavDestination navDestination1 = ((NavBackStackEntry)u.p3(list0)).f();
        if(navDestination1 instanceof FloatingWindow) {
            for(Object object0: u.X4(list0)) {
                NavDestination navDestination2 = ((NavBackStackEntry)object0).f();
                if(!(navDestination2 instanceof NavGraph) && !(navDestination2 instanceof FloatingWindow)) {
                    navDestination0 = navDestination2;
                    break;
                }
            }
        }
        HashMap hashMap0 = new HashMap();
        for(Object object1: u.X4(list0)) {
            NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)object1;
            State lifecycle$State0 = navBackStackEntry0.h();
            NavDestination navDestination3 = navBackStackEntry0.f();
            if(navDestination1 != null && navDestination3.q() == navDestination1.q()) {
                State lifecycle$State1 = State.e;
                if(lifecycle$State0 != lifecycle$State1) {
                    Navigator navigator0 = this.N().f(navBackStackEntry0.f().t());
                    NavControllerNavigatorState navController$NavControllerNavigatorState0 = (NavControllerNavigatorState)this.x.get(navigator0);
                    if(navController$NavControllerNavigatorState0 == null) {
                        boolean0 = null;
                    }
                    else {
                        U u0 = navController$NavControllerNavigatorState0.c();
                        if(u0 != null) {
                            Set set0 = (Set)u0.getValue();
                            if(set0 != null) {
                                boolean0 = Boolean.valueOf(set0.contains(navBackStackEntry0));
                            }
                        }
                    }
                    if(!L.g(boolean0, Boolean.TRUE)) {
                        AtomicInteger atomicInteger0 = (AtomicInteger)this.l.get(navBackStackEntry0);
                        if(atomicInteger0 == null || atomicInteger0.get() != 0) {
                            hashMap0.put(navBackStackEntry0, lifecycle$State1);
                            goto label_38;
                        }
                    }
                    hashMap0.put(navBackStackEntry0, State.d);
                }
            label_38:
                navDestination1 = navDestination1.u();
            }
            else if(navDestination0 != null && navDestination3.q() == navDestination0.q()) {
                if(lifecycle$State0 == State.e) {
                    navBackStackEntry0.m(State.d);
                }
                else {
                    State lifecycle$State2 = State.d;
                    if(lifecycle$State0 != lifecycle$State2) {
                        hashMap0.put(navBackStackEntry0, lifecycle$State2);
                    }
                }
                navDestination0 = navDestination0.u();
            }
            else {
                navBackStackEntry0.m(State.c);
            }
        }
        for(Object object2: list0) {
            NavBackStackEntry navBackStackEntry1 = (NavBackStackEntry)object2;
            State lifecycle$State3 = (State)hashMap0.get(navBackStackEntry1);
            if(lifecycle$State3 == null) {
                navBackStackEntry1.n();
            }
            else {
                navBackStackEntry1.m(lifecycle$State3);
            }
        }
    }

    @MainThread
    public void X(@IdRes int v, @m Bundle bundle0, @m NavOptions navOptions0) {
        this.Y(v, bundle0, navOptions0, null);
    }

    private final void X0() {
        boolean z = true;
        OnBackPressedCallback onBackPressedCallback0 = this.u;
        if(!this.v || this.J() <= 1) {
            z = false;
        }
        onBackPressedCallback0.m(z);
    }

    @MainThread
    public void Y(@IdRes int v, @m Bundle bundle0, @m NavOptions navOptions0, @m Extras navigator$Extras0) {
        int v1;
        NavDestination navDestination0 = this.C().isEmpty() ? this.d : ((NavBackStackEntry)this.C().last()).f();
        if(navDestination0 == null) {
            throw new IllegalStateException("no current navigation node");
        }
        NavAction navAction0 = navDestination0.k(v);
        Bundle bundle1 = null;
        if(navAction0 == null) {
            v1 = v;
        }
        else {
            if(navOptions0 == null) {
                navOptions0 = navAction0.c();
            }
            v1 = navAction0.b();
            Bundle bundle2 = navAction0.a();
            if(bundle2 != null) {
                bundle1 = new Bundle();
                bundle1.putAll(bundle2);
            }
        }
        if(bundle0 != null) {
            if(bundle1 == null) {
                bundle1 = new Bundle();
            }
            bundle1.putAll(bundle0);
        }
        if(v1 == 0 && navOptions0 != null && navOptions0.f() != -1) {
            this.t0(navOptions0.f(), navOptions0.h());
            return;
        }
        if(v1 == 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
        }
        NavDestination navDestination1 = this.y(v1);
        if(navDestination1 == null) {
            String s = NavDestination.j.b(this.a, v1);
            throw navAction0 == null ? new IllegalArgumentException("Navigation action/destination " + s + " cannot be found from the current destination " + navDestination0) : new IllegalArgumentException(("Navigation destination " + s + " referenced from action " + NavDestination.j.b(this.a, v) + " cannot be found from the current destination " + navDestination0).toString());
        }
        this.f0(navDestination1, bundle1, navOptions0, navigator$Extras0);
    }

    @MainThread
    public void Z(@l Uri uri0) {
        L.p(uri0, "deepLink");
        this.c0(new NavDeepLinkRequest(uri0, null, null));
    }

    @MainThread
    public void a0(@l Uri uri0, @m NavOptions navOptions0) {
        L.p(uri0, "deepLink");
        this.e0(new NavDeepLinkRequest(uri0, null, null), navOptions0, null);
    }

    @MainThread
    public void b0(@l Uri uri0, @m NavOptions navOptions0, @m Extras navigator$Extras0) {
        L.p(uri0, "deepLink");
        this.e0(new NavDeepLinkRequest(uri0, null, null), navOptions0, navigator$Extras0);
    }

    @MainThread
    public void c0(@l NavDeepLinkRequest navDeepLinkRequest0) {
        L.p(navDeepLinkRequest0, "request");
        this.d0(navDeepLinkRequest0, null);
    }

    @MainThread
    public void d0(@l NavDeepLinkRequest navDeepLinkRequest0, @m NavOptions navOptions0) {
        L.p(navDeepLinkRequest0, "request");
        this.e0(navDeepLinkRequest0, navOptions0, null);
    }

    public static final boolean e() [...] // 潜在的解密器

    @MainThread
    public void e0(@l NavDeepLinkRequest navDeepLinkRequest0, @m NavOptions navOptions0, @m Extras navigator$Extras0) {
        L.p(navDeepLinkRequest0, "request");
        NavGraph navGraph0 = this.d;
        L.m(navGraph0);
        DeepLinkMatch navDestination$DeepLinkMatch0 = navGraph0.z(navDeepLinkRequest0);
        if(navDestination$DeepLinkMatch0 == null) {
            throw new IllegalArgumentException("Navigation destination that matches request " + navDeepLinkRequest0 + " cannot be found in the navigation graph " + this.d);
        }
        Bundle bundle0 = navDestination$DeepLinkMatch0.b().g(navDestination$DeepLinkMatch0.c());
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        Intent intent0 = new Intent();
        intent0.setDataAndType(navDeepLinkRequest0.c(), navDeepLinkRequest0.b());
        intent0.setAction(navDeepLinkRequest0.a());
        bundle0.putParcelable("android-support-nav:controller:deepLinkIntent", intent0);
        this.f0(navDestination$DeepLinkMatch0.b(), bundle0, navOptions0, navigator$Extras0);
    }

    @MainThread
    private final void f0(NavDestination navDestination0, Bundle bundle0, NavOptions navOptions0, Extras navigator$Extras0) {
        State lifecycle$State0;
        boolean z;
        Iterator iterator0 = this.x.values().iterator();
        while(true) {
            z = true;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            ((NavControllerNavigatorState)object0).k(true);
        }
        kotlin.jvm.internal.l0.a l0$a0 = new kotlin.jvm.internal.l0.a();
        boolean z1 = navOptions0 == null || navOptions0.f() == -1 ? false : this.A0(navOptions0.f(), navOptions0.h(), navOptions0.j());
        Bundle bundle1 = navDestination0.g(bundle0);
        if(navOptions0 == null || !navOptions0.k() || !this.m.containsKey(navDestination0.q())) {
            NavBackStackEntry navBackStackEntry0 = this.G();
            Navigator navigator0 = this.w.f(navDestination0.t());
            if(navOptions0 == null || !navOptions0.i() || navBackStackEntry0 == null) {
                lifecycle$State0 = this.L();
                this.o0(navigator0, u.k(androidx.navigation.NavBackStackEntry.Companion.b(NavBackStackEntry.n, this.a, navDestination0, bundle1, lifecycle$State0, this.q, null, null, 0x60, null)), navOptions0, navigator$Extras0, new Function1(this, navDestination0, bundle1) {
                    final kotlin.jvm.internal.l0.a e;
                    final NavController f;
                    final NavDestination g;
                    final Bundle h;

                    {
                        this.e = l0$a0;
                        this.f = navController0;
                        this.g = navDestination0;
                        this.h = bundle0;
                        super(1);
                    }

                    public final void a(@l NavBackStackEntry navBackStackEntry0) {
                        L.p(navBackStackEntry0, "it");
                        this.e.a = true;
                        NavController.p(this.f, this.g, this.h, navBackStackEntry0, null, 8, null);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((NavBackStackEntry)object0));
                        return S0.a;
                    }
                });
                z = false;
            }
            else {
                NavDestination navDestination1 = navBackStackEntry0.f();
                if(navDestination1 == null || navDestination0.q() != navDestination1.q()) {
                    lifecycle$State0 = this.L();
                    this.o0(navigator0, u.k(androidx.navigation.NavBackStackEntry.Companion.b(NavBackStackEntry.n, this.a, navDestination0, bundle1, lifecycle$State0, this.q, null, null, 0x60, null)), navOptions0, navigator$Extras0, new Function1(this, navDestination0, bundle1) {
                        final kotlin.jvm.internal.l0.a e;
                        final NavController f;
                        final NavDestination g;
                        final Bundle h;

                        {
                            this.e = l0$a0;
                            this.f = navController0;
                            this.g = navDestination0;
                            this.h = bundle0;
                            super(1);
                        }

                        public final void a(@l NavBackStackEntry navBackStackEntry0) {
                            L.p(navBackStackEntry0, "it");
                            this.e.a = true;
                            NavController.p(this.f, this.g, this.h, navBackStackEntry0, null, 8, null);
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.a(((NavBackStackEntry)object0));
                            return S0.a;
                        }
                    });
                    z = false;
                }
                else {
                    this.V0(((NavBackStackEntry)this.C().removeLast()));
                    NavBackStackEntry navBackStackEntry1 = new NavBackStackEntry(navBackStackEntry0, bundle1);
                    this.C().addLast(navBackStackEntry1);
                    NavGraph navGraph0 = navBackStackEntry1.f().u();
                    if(navGraph0 != null) {
                        this.U(navBackStackEntry1, this.D(navGraph0.q()));
                    }
                    navigator0.g(navBackStackEntry1);
                }
            }
        }
        else {
            l0$a0.a = this.I0(navDestination0.q(), bundle1, navOptions0, navigator$Extras0);
            z = false;
        }
        this.X0();
        for(Object object1: this.x.values()) {
            ((NavControllerNavigatorState)object1).k(false);
        }
        if(!z1 && !l0$a0.a && !z) {
            this.W0();
            return;
        }
        this.v();
    }

    @MainThread
    public void g0(@l NavDirections navDirections0) {
        L.p(navDirections0, "directions");
        this.X(navDirections0.d(), navDirections0.c(), null);
    }

    @MainThread
    public void h0(@l NavDirections navDirections0, @m NavOptions navOptions0) {
        L.p(navDirections0, "directions");
        this.X(navDirections0.d(), navDirections0.c(), navOptions0);
    }

    @MainThread
    public void i0(@l NavDirections navDirections0, @l Extras navigator$Extras0) {
        L.p(navDirections0, "directions");
        L.p(navigator$Extras0, "navigatorExtras");
        this.Y(navDirections0.d(), navDirections0.c(), null, navigator$Extras0);
    }

    @j
    public final void j0(@l String s) {
        L.p(s, "route");
        NavController.n0(this, s, null, null, 6, null);
    }

    @j
    public final void k0(@l String s, @m NavOptions navOptions0) {
        L.p(s, "route");
        NavController.n0(this, s, navOptions0, null, 4, null);
    }

    @j
    public final void l0(@l String s, @m NavOptions navOptions0, @m Extras navigator$Extras0) {
        L.p(s, "route");
        Uri uri0 = Uri.parse(NavDestination.j.a(s));
        L.h(uri0, "Uri.parse(this)");
        this.e0(androidx.navigation.NavDeepLinkRequest.Builder.d.c(uri0).a(), navOptions0, navigator$Extras0);
    }

    public final void m0(@l String s, @l Function1 function10) {
        L.p(s, "route");
        L.p(function10, "builder");
        NavController.n0(this, s, NavOptionsBuilderKt.a(function10), null, 4, null);
    }

    public static void n0(NavController navController0, String s, NavOptions navOptions0, Extras navigator$Extras0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if((v & 2) != 0) {
            navOptions0 = null;
        }
        if((v & 4) != 0) {
            navigator$Extras0 = null;
        }
        navController0.l0(s, navOptions0, navigator$Extras0);
    }

    private final void o(NavDestination navDestination0, Bundle bundle0, NavBackStackEntry navBackStackEntry0, List list0) {
        Object object2;
        k k1;
        NavGraph navGraph1;
        List list2;
        Object object1;
        List list1 = list0;
        NavDestination navDestination1 = navBackStackEntry0.f();
        if(!(navDestination1 instanceof FloatingWindow)) {
            while(!this.C().isEmpty() && ((NavBackStackEntry)this.C().last()).f() instanceof FloatingWindow && NavController.C0(this, ((NavBackStackEntry)this.C().last()).f().q(), true, false, 4, null)) {
            }
        }
        k k0 = new k();
        Object object0 = null;
        if(navDestination0 instanceof NavGraph) {
            NavDestination navDestination2 = navDestination1;
            while(true) {
                L.m(navDestination2);
                NavGraph navGraph0 = navDestination2.u();
                if(navGraph0 == null) {
                    navGraph1 = null;
                    k1 = k0;
                    list2 = list1;
                }
                else {
                    ListIterator listIterator0 = list1.listIterator(list0.size());
                    while(listIterator0.hasPrevious()) {
                        object1 = listIterator0.previous();
                        if(!L.g(((NavBackStackEntry)object1).f(), navGraph0)) {
                            continue;
                        }
                        goto label_18;
                    }
                    object1 = null;
                label_18:
                    NavBackStackEntry navBackStackEntry1 = (NavBackStackEntry)object1;
                    if(navBackStackEntry1 == null) {
                        State lifecycle$State0 = this.L();
                        navBackStackEntry1 = androidx.navigation.NavBackStackEntry.Companion.b(NavBackStackEntry.n, this.a, navGraph0, bundle0, lifecycle$State0, this.q, null, null, 0x60, null);
                    }
                    k0.addFirst(navBackStackEntry1);
                    if(this.C().isEmpty() || ((NavBackStackEntry)this.C().last()).f() != navGraph0) {
                        list2 = list0;
                        navGraph1 = navGraph0;
                        k1 = k0;
                    }
                    else {
                        list2 = list0;
                        navGraph1 = navGraph0;
                        k1 = k0;
                        NavController.E0(this, ((NavBackStackEntry)this.C().last()), false, null, 6, null);
                    }
                }
                if(navGraph1 == null || navGraph1 == navDestination0) {
                    break;
                }
                k0 = k1;
                list1 = list2;
                navDestination2 = navGraph1;
            }
        }
        else {
            k1 = k0;
            list2 = list1;
        }
        NavDestination navDestination3 = k1.isEmpty() ? navDestination1 : ((NavBackStackEntry)k1.first()).f();
        while(navDestination3 != null && this.y(navDestination3.q()) == null) {
            navDestination3 = navDestination3.u();
            if(navDestination3 != null) {
                ListIterator listIterator1 = list2.listIterator(list0.size());
                while(listIterator1.hasPrevious()) {
                    object2 = listIterator1.previous();
                    if(!L.g(((NavBackStackEntry)object2).f(), navDestination3)) {
                        continue;
                    }
                    goto label_53;
                }
                object2 = null;
            label_53:
                NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry)object2;
                if(navBackStackEntry2 == null) {
                    Bundle bundle1 = navDestination3.g(bundle0);
                    State lifecycle$State1 = this.L();
                    navBackStackEntry2 = androidx.navigation.NavBackStackEntry.Companion.b(NavBackStackEntry.n, this.a, navDestination3, bundle1, lifecycle$State1, this.q, null, null, 0x60, null);
                }
                k1.addFirst(navBackStackEntry2);
            }
        }
        NavDestination navDestination4 = k1.isEmpty() ? navDestination1 : ((NavBackStackEntry)k1.first()).f();
        while(!this.C().isEmpty() && ((NavBackStackEntry)this.C().last()).f() instanceof NavGraph && ((NavGraph)((NavBackStackEntry)this.C().last()).f()).V(navDestination4.q(), false) == null) {
            NavController.E0(this, ((NavBackStackEntry)this.C().last()), false, null, 6, null);
        }
        NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry)this.C().j();
        if(navBackStackEntry3 == null) {
            navBackStackEntry3 = (NavBackStackEntry)k1.j();
        }
        if(!L.g((navBackStackEntry3 == null ? null : navBackStackEntry3.f()), this.d)) {
            ListIterator listIterator2 = list2.listIterator(list0.size());
            while(listIterator2.hasPrevious()) {
                Object object3 = listIterator2.previous();
                NavGraph navGraph2 = this.d;
                L.m(navGraph2);
                if(L.g(((NavBackStackEntry)object3).f(), navGraph2)) {
                    object0 = object3;
                    break;
                }
                if(false) {
                    break;
                }
            }
            NavBackStackEntry navBackStackEntry4 = (NavBackStackEntry)object0;
            if(navBackStackEntry4 == null) {
                NavGraph navGraph3 = this.d;
                L.m(navGraph3);
                NavGraph navGraph4 = this.d;
                L.m(navGraph4);
                Bundle bundle2 = navGraph4.g(bundle0);
                State lifecycle$State2 = this.L();
                navBackStackEntry4 = androidx.navigation.NavBackStackEntry.Companion.b(NavBackStackEntry.n, this.a, navGraph3, bundle2, lifecycle$State2, this.q, null, null, 0x60, null);
            }
            k1.addFirst(navBackStackEntry4);
        }
        for(Object object4: k1) {
            Navigator navigator0 = this.w.f(((NavBackStackEntry)object4).f().t());
            Object object5 = this.x.get(navigator0);
            if(object5 == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + navDestination0.t() + " should already be created").toString());
            }
            ((NavControllerNavigatorState)object5).m(((NavBackStackEntry)object4));
        }
        this.C().addAll(k1);
        this.C().add(navBackStackEntry0);
        for(Object object6: u.E4(k1, navBackStackEntry0)) {
            NavBackStackEntry navBackStackEntry5 = (NavBackStackEntry)object6;
            NavGraph navGraph5 = navBackStackEntry5.f().u();
            if(navGraph5 != null) {
                this.U(navBackStackEntry5, this.D(navGraph5.q()));
            }
        }
    }

    private final void o0(Navigator navigator0, List list0, NavOptions navOptions0, Extras navigator$Extras0, Function1 function10) {
        this.y = function10;
        navigator0.e(list0, navOptions0, navigator$Extras0);
        this.y = null;
    }

    static void p(NavController navController0, NavDestination navDestination0, Bundle bundle0, NavBackStackEntry navBackStackEntry0, List list0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
        }
        if((v & 8) != 0) {
            list0 = u.H();
        }
        navController0.o(navDestination0, bundle0, navBackStackEntry0, list0);
    }

    static void p0(NavController navController0, Navigator navigator0, List list0, NavOptions navOptions0, Extras navigator$Extras0, Function1 function10, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateInternal");
        }
        if((v & 8) != 0) {
            function10 = androidx.navigation.NavController.navigateInternal.1.e;
        }
        navController0.o0(navigator0, list0, navOptions0, navigator$Extras0, function10);

        final class androidx.navigation.NavController.navigateInternal.1 extends N implements Function1 {
            public static final androidx.navigation.NavController.navigateInternal.1 e;

            static {
                androidx.navigation.NavController.navigateInternal.1.e = new androidx.navigation.NavController.navigateInternal.1();
            }

            androidx.navigation.NavController.navigateInternal.1() {
                super(1);
            }

            public final void a(@l NavBackStackEntry navBackStackEntry0) {
                L.p(navBackStackEntry0, "it");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((NavBackStackEntry)object0));
                return S0.a;
            }
        }

    }

    public void q(@l OnDestinationChangedListener navController$OnDestinationChangedListener0) {
        L.p(navController$OnDestinationChangedListener0, "listener");
        this.r.add(navController$OnDestinationChangedListener0);
        if(!this.C().isEmpty()) {
            NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)this.C().last();
            navController$OnDestinationChangedListener0.a(this, navBackStackEntry0.f(), navBackStackEntry0.d());
        }
    }

    @MainThread
    public boolean q0() {
        Bundle bundle0;
        if(this.J() == 1) {
            Activity activity0 = this.b;
            int[] arr_v = null;
            if(activity0 == null) {
                bundle0 = null;
            }
            else {
                Intent intent0 = activity0.getIntent();
                bundle0 = intent0 == null ? null : intent0.getExtras();
            }
            if(bundle0 != null) {
                arr_v = bundle0.getIntArray("android-support-nav:controller:deepLinkIds");
            }
            return arr_v == null ? this.U0() : this.T0();
        }
        return this.s0();
    }

    // 去混淆评级： 低(20)
    @MainThread
    public final boolean r(@IdRes int v) {
        return this.t(v) && this.v();
    }

    @MainThread
    private final void r0(Bundle bundle0) {
        Bundle bundle1 = this.e;
        if(bundle1 != null) {
            ArrayList arrayList0 = bundle1.getStringArrayList("android-support-nav:controller:navigatorState:names");
            if(arrayList0 != null) {
                for(Object object0: arrayList0) {
                    NavigatorProvider navigatorProvider0 = this.w;
                    L.o(((String)object0), "name");
                    Navigator navigator0 = navigatorProvider0.f(((String)object0));
                    Bundle bundle2 = bundle1.getBundle(((String)object0));
                    if(bundle2 != null) {
                        navigator0.h(bundle2);
                    }
                }
            }
        }
        Parcelable[] arr_parcelable = this.f;
        if(arr_parcelable != null) {
            for(int v = 0; v < arr_parcelable.length; ++v) {
                NavBackStackEntryState navBackStackEntryState0 = (NavBackStackEntryState)arr_parcelable[v];
                NavDestination navDestination0 = this.y(navBackStackEntryState0.c());
                if(navDestination0 == null) {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + NavDestination.j.b(this.a, navBackStackEntryState0.c()) + " cannot be found from the current destination " + this.I());
                }
                State lifecycle$State0 = this.L();
                NavBackStackEntry navBackStackEntry0 = navBackStackEntryState0.f(this.a, navDestination0, lifecycle$State0, this.q);
                Navigator navigator1 = this.w.f(navDestination0.t());
                Map map0 = this.x;
                NavControllerNavigatorState navController$NavControllerNavigatorState0 = map0.get(navigator1);
                if(navController$NavControllerNavigatorState0 == null) {
                    navController$NavControllerNavigatorState0 = new NavControllerNavigatorState(this, navigator1);
                    map0.put(navigator1, navController$NavControllerNavigatorState0);
                }
                this.C().add(navBackStackEntry0);
                navController$NavControllerNavigatorState0.m(navBackStackEntry0);
                NavGraph navGraph0 = navBackStackEntry0.f().u();
                if(navGraph0 != null) {
                    this.U(navBackStackEntry0, this.D(navGraph0.q()));
                }
            }
            this.X0();
            this.f = null;
        }
        Iterable iterable0 = this.w.g().values();
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: iterable0) {
            if(!((Navigator)object1).c()) {
                arrayList1.add(object1);
            }
        }
        for(Object object2: arrayList1) {
            Navigator navigator2 = (Navigator)object2;
            Map map1 = this.x;
            NavControllerNavigatorState navController$NavControllerNavigatorState1 = map1.get(navigator2);
            if(navController$NavControllerNavigatorState1 == null) {
                navController$NavControllerNavigatorState1 = new NavControllerNavigatorState(this, navigator2);
                map1.put(navigator2, navController$NavControllerNavigatorState1);
            }
            navigator2.f(navController$NavControllerNavigatorState1);
        }
        if(this.d == null || !this.C().isEmpty()) {
            this.v();
        }
        else {
            if(this.g) {
                goto label_64;
            }
            Activity activity0 = this.b;
            if(activity0 == null) {
                goto label_64;
            }
            L.m(activity0);
            if(!this.R(activity0.getIntent())) {
            label_64:
                NavGraph navGraph1 = this.d;
                L.m(navGraph1);
                this.f0(navGraph1, bundle0, null, null);
            }
        }
    }

    @MainThread
    public final boolean s(@l String s) {
        L.p(s, "route");
        return this.r(NavDestination.j.a(s).hashCode());
    }

    @MainThread
    public boolean s0() {
        if(this.C().isEmpty()) {
            return false;
        }
        NavDestination navDestination0 = this.I();
        L.m(navDestination0);
        return this.t0(navDestination0.q(), true);
    }

    @MainThread
    private final boolean t(@IdRes int v) {
        for(Object object0: this.x.values()) {
            ((NavControllerNavigatorState)object0).k(true);
        }
        boolean z = this.I0(v, null, null, null);
        for(Object object1: this.x.values()) {
            ((NavControllerNavigatorState)object1).k(false);
        }
        return z && this.A0(v, true, false);
    }

    @MainThread
    public boolean t0(@IdRes int v, boolean z) {
        return this.u0(v, z, false);
    }

    @l
    public NavDeepLinkBuilder u() {
        return new NavDeepLinkBuilder(this);
    }

    // 去混淆评级： 低(20)
    @MainThread
    public boolean u0(@IdRes int v, boolean z, boolean z1) {
        return this.A0(v, z, z1) && this.v();
    }

    private final boolean v() {
        while(!this.C().isEmpty() && ((NavBackStackEntry)this.C().last()).f() instanceof NavGraph) {
            NavController.E0(this, ((NavBackStackEntry)this.C().last()), false, null, 6, null);
        }
        NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)this.C().p();
        if(navBackStackEntry0 != null) {
            this.C.add(navBackStackEntry0);
        }
        ++this.B;
        this.W0();
        int v = this.B - 1;
        this.B = v;
        if(v == 0) {
            List list0 = u.Y5(this.C);
            this.C.clear();
            for(Object object0: list0) {
                NavBackStackEntry navBackStackEntry1 = (NavBackStackEntry)object0;
                for(Object object1: this.r) {
                    ((OnDestinationChangedListener)object1).a(this, navBackStackEntry1.f(), navBackStackEntry1.d());
                }
                this.E.d(navBackStackEntry1);
            }
            List list1 = this.F0();
            this.i.d(list1);
        }
        return navBackStackEntry0 != null;
    }

    @MainThread
    @j
    public final boolean v0(@l String s, boolean z) {
        L.p(s, "route");
        return NavController.x0(this, s, z, false, 4, null);
    }

    @NavDeepLinkSaveStateControl
    @n
    public static final void w(boolean z) {
        NavController.G.a(z);
    }

    @MainThread
    @j
    public final boolean w0(@l String s, boolean z, boolean z1) {
        L.p(s, "route");
        return this.u0(NavDestination.j.a(s).hashCode(), z, z1);
    }

    @RestrictTo({Scope.b})
    public void x(boolean z) {
        this.v = z;
        this.X0();
    }

    public static boolean x0(NavController navController0, String s, boolean z, boolean z1, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if((v & 4) != 0) {
            z1 = false;
        }
        return navController0.w0(s, z, z1);
    }

    @RestrictTo({Scope.b})
    @m
    public final NavDestination y(@IdRes int v) {
        NavDestination navDestination0;
        NavGraph navGraph0 = this.d;
        if(navGraph0 == null) {
            return null;
        }
        L.m(navGraph0);
        if(navGraph0.q() == v) {
            return this.d;
        }
        NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)this.C().p();
        if(navBackStackEntry0 == null) {
            navDestination0 = this.d;
            L.m(navDestination0);
        }
        else {
            navDestination0 = navBackStackEntry0.f();
            if(navDestination0 == null) {
                navDestination0 = this.d;
                L.m(navDestination0);
                return this.z(navDestination0, v);
            }
        }
        return this.z(navDestination0, v);
    }

    public final void y0(@l NavBackStackEntry navBackStackEntry0, @l a a0) {
        L.p(navBackStackEntry0, "popUpTo");
        L.p(a0, "onComplete");
        int v = this.C().indexOf(navBackStackEntry0);
        if(v < 0) {
            Log.i("NavController", "Ignoring pop of " + navBackStackEntry0 + " as it was not found on the current back stack");
            return;
        }
        if(v + 1 != this.C().size()) {
            this.A0(((NavBackStackEntry)this.C().get(v + 1)).f().q(), true, false);
        }
        NavController.E0(this, navBackStackEntry0, false, null, 6, null);
        a0.invoke();
        this.X0();
        this.v();
    }

    private final NavDestination z(NavDestination navDestination0, @IdRes int v) {
        if(navDestination0.q() == v) {
            return navDestination0;
        }
        if(navDestination0 instanceof NavGraph) {
            return ((NavGraph)navDestination0).U(v);
        }
        NavGraph navGraph0 = navDestination0.u();
        L.m(navGraph0);
        return navGraph0.U(v);
    }

    private final void z0(Navigator navigator0, NavBackStackEntry navBackStackEntry0, boolean z, Function1 function10) {
        this.z = function10;
        navigator0.j(navBackStackEntry0, z);
        this.z = null;
    }
}

