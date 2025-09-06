package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination.ClassType;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator.Extras;
import androidx.navigation.Navigator.Name;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.NavigatorState;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Name("dialog")
public final class DialogFragmentNavigator extends Navigator {
    static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @ClassType(DialogFragment.class)
    public static class Destination extends NavDestination implements FloatingWindow {
        @m
        private String l;

        public Destination(@l Navigator navigator0) {
            L.p(navigator0, "fragmentNavigator");
            super(navigator0);
        }

        public Destination(@l NavigatorProvider navigatorProvider0) {
            L.p(navigatorProvider0, "navigatorProvider");
            this(navigatorProvider0.e(DialogFragmentNavigator.class));
        }

        @Override  // androidx.navigation.NavDestination
        @CallSuper
        public void A(@l Context context0, @l AttributeSet attributeSet0) {
            L.p(context0, "context");
            L.p(attributeSet0, "attrs");
            super.A(context0, attributeSet0);
            TypedArray typedArray0 = context0.getResources().obtainAttributes(attributeSet0, styleable.DialogFragmentNavigator);
            L.o(typedArray0, "context.resources.obtain…ntNavigator\n            )");
            String s = typedArray0.getString(styleable.DialogFragmentNavigator_android_name);
            if(s != null) {
                this.O(s);
            }
            typedArray0.recycle();
        }

        @l
        public final String N() {
            String s = this.l;
            if(s == null) {
                throw new IllegalStateException("DialogFragment class was not set");
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
    }

    @l
    private final Context c;
    @l
    private final FragmentManager d;
    @l
    private final Set e;
    @l
    private final LifecycleEventObserver f;
    @l
    private static final Companion g = null;
    @Deprecated
    @l
    private static final String h = "DialogFragmentNavigator";

    static {
        DialogFragmentNavigator.g = new Companion(null);
    }

    public DialogFragmentNavigator(@l Context context0, @l FragmentManager fragmentManager0) {
        L.p(context0, "context");
        L.p(fragmentManager0, "fragmentManager");
        super();
        this.c = context0;
        this.d = fragmentManager0;
        this.e = new LinkedHashSet();
        this.f = (LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) -> {
            L.p(this, "this$0");
            L.p(lifecycleOwner0, "source");
            L.p(lifecycle$Event0, "event");
            if(lifecycle$Event0 == Event.ON_CREATE) {
                Iterable iterable0 = (Iterable)this.b().b().getValue();
                if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                    for(Object object0: iterable0) {
                        if(L.g(((NavBackStackEntry)object0).g(), ((DialogFragment)lifecycleOwner0).getTag())) {
                            return;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
                ((DialogFragment)lifecycleOwner0).dismiss();
                return;
            }
            if(lifecycle$Event0 == Event.ON_STOP && !((DialogFragment)lifecycleOwner0).requireDialog().isShowing()) {
                Object object1 = null;
                List list0 = (List)this.b().b().getValue();
                ListIterator listIterator0 = list0.listIterator(list0.size());
                while(listIterator0.hasPrevious()) {
                    Object object2 = listIterator0.previous();
                    if(L.g(((NavBackStackEntry)object2).g(), ((DialogFragment)lifecycleOwner0).getTag())) {
                        object1 = object2;
                        break;
                    }
                }
                if(object1 == null) {
                    throw new IllegalStateException(("Dialog " + ((DialogFragment)lifecycleOwner0) + " has already been popped off of the Navigation back stack").toString());
                }
                if(!L.g(u.v3(list0), ((NavBackStackEntry)object1))) {
                    Log.i("DialogFragmentNavigator", "Dialog " + ((DialogFragment)lifecycleOwner0) + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                }
                this.j(((NavBackStackEntry)object1), false);
            }
        };
    }

    @Override  // androidx.navigation.Navigator
    public NavDestination a() {
        return this.n();
    }

    @Override  // androidx.navigation.Navigator
    public void e(@l List list0, @m NavOptions navOptions0, @m Extras navigator$Extras0) {
        L.p(list0, "entries");
        if(this.d.d1()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        for(Object object0: list0) {
            this.o(((NavBackStackEntry)object0));
        }
    }

    @Override  // androidx.navigation.Navigator
    public void f(@l NavigatorState navigatorState0) {
        L.p(navigatorState0, "state");
        super.f(navigatorState0);
        for(Object object0: ((List)navigatorState0.b().getValue())) {
            NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)object0;
            DialogFragment dialogFragment0 = (DialogFragment)this.d.s0(navBackStackEntry0.g());
            if(dialogFragment0 != null) {
                Lifecycle lifecycle0 = dialogFragment0.getLifecycle();
                if(lifecycle0 != null) {
                    lifecycle0.a(this.f);
                    continue;
                }
            }
            this.e.add(navBackStackEntry0.g());
        }
        b b0 = (FragmentManager fragmentManager0, Fragment fragment0) -> {
            L.p(this, "this$0");
            L.p(fragmentManager0, "<anonymous parameter 0>");
            L.p(fragment0, "childFragment");
            if(v0.a(this.e).remove(fragment0.getTag())) {
                fragment0.getLifecycle().a(this.f);
            }
        };
        this.d.o(b0);
    }

    @Override  // androidx.navigation.Navigator
    public void j(@l NavBackStackEntry navBackStackEntry0, boolean z) {
        L.p(navBackStackEntry0, "popUpTo");
        if(this.d.d1()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list0 = (List)this.b().b().getValue();
        for(Object object0: u.X4(list0.subList(list0.indexOf(navBackStackEntry0), list0.size()))) {
            Fragment fragment0 = this.d.s0(((NavBackStackEntry)object0).g());
            if(fragment0 != null) {
                fragment0.getLifecycle().d(this.f);
                ((DialogFragment)fragment0).dismiss();
            }
        }
        this.b().g(navBackStackEntry0, z);
    }

    @l
    public Destination n() {
        return new Destination(this);
    }

    private final void o(NavBackStackEntry navBackStackEntry0) {
        Destination dialogFragmentNavigator$Destination0 = (Destination)navBackStackEntry0.f();
        String s = dialogFragmentNavigator$Destination0.N();
        if(s.charAt(0) == 46) {
            s = "com.dcinside.app.android" + s;
        }
        Fragment fragment0 = this.d.G0().a(this.c.getClassLoader(), s);
        L.o(fragment0, "fragmentManager.fragment…ader, className\n        )");
        Class class0 = fragment0.getClass();
        if(!DialogFragment.class.isAssignableFrom(class0)) {
            throw new IllegalArgumentException(("Dialog destination " + dialogFragmentNavigator$Destination0.N() + " is not an instance of DialogFragment").toString());
        }
        ((DialogFragment)fragment0).setArguments(navBackStackEntry0.d());
        ((DialogFragment)fragment0).getLifecycle().a(this.f);
        ((DialogFragment)fragment0).show(this.d, navBackStackEntry0.g());
        this.b().i(navBackStackEntry0);
    }

    // 检测为 Lambda 实现
    private static final void p(DialogFragmentNavigator dialogFragmentNavigator0, LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) [...]

    // 检测为 Lambda 实现
    private static final void q(DialogFragmentNavigator dialogFragmentNavigator0, FragmentManager fragmentManager0, Fragment fragment0) [...]
}

