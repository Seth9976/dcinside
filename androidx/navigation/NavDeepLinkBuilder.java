package androidx.navigation;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.IdRes;
import androidx.annotation.NavigationRes;
import androidx.core.app.TaskStackBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.k;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.j;

public final class NavDeepLinkBuilder {
    static final class DeepLinkDestination {
        private final int a;
        @m
        private final Bundle b;

        public DeepLinkDestination(int v, @m Bundle bundle0) {
            this.a = v;
            this.b = bundle0;
        }

        @m
        public final Bundle a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }
    }

    static final class PermissiveNavigatorProvider extends NavigatorProvider {
        @l
        private final Navigator d;

        public PermissiveNavigatorProvider() {
            this.d = new androidx.navigation.NavDeepLinkBuilder.PermissiveNavigatorProvider.mDestNavigator.1();
            this.b(new NavGraphNavigator(this));

            public final class androidx.navigation.NavDeepLinkBuilder.PermissiveNavigatorProvider.mDestNavigator.1 extends Navigator {
                @Override  // androidx.navigation.Navigator
                @l
                public NavDestination a() {
                    return new NavDestination("permissive");
                }

                @Override  // androidx.navigation.Navigator
                @m
                public NavDestination d(@l NavDestination navDestination0, @m Bundle bundle0, @m NavOptions navOptions0, @m Extras navigator$Extras0) {
                    L.p(navDestination0, "destination");
                    throw new IllegalStateException("navigate is not supported");
                }

                @Override  // androidx.navigation.Navigator
                public boolean k() {
                    throw new IllegalStateException("popBackStack is not supported");
                }
            }

        }

        @Override  // androidx.navigation.NavigatorProvider
        @l
        public Navigator f(@l String s) {
            L.p(s, "name");
            try {
                return super.f(s);
            }
            catch(IllegalStateException unused_ex) {
                return this.d;
            }
        }
    }

    @l
    private final Context a;
    @l
    private final Intent b;
    @m
    private NavGraph c;
    @l
    private final List d;
    @m
    private Bundle e;

    public NavDeepLinkBuilder(@l Context context0) {
        L.p(context0, "context");
        Intent intent0;
        super();
        this.a = context0;
        if(context0 instanceof Activity) {
            intent0 = new Intent(context0, context0.getClass());
        }
        else {
            intent0 = context0.getPackageManager().getLaunchIntentForPackage("com.dcinside.app.android");
            if(intent0 == null) {
                intent0 = new Intent();
            }
        }
        intent0.addFlags(0x10008000);
        this.b = intent0;
        this.d = new ArrayList();
    }

    public NavDeepLinkBuilder(@l NavController navController0) {
        L.p(navController0, "navController");
        this(navController0.F());
        this.c = navController0.K();
    }

    @l
    @j
    public final NavDeepLinkBuilder a(@IdRes int v) {
        return NavDeepLinkBuilder.e(this, v, null, 2, null);
    }

    @l
    @j
    public final NavDeepLinkBuilder b(@IdRes int v, @m Bundle bundle0) {
        DeepLinkDestination navDeepLinkBuilder$DeepLinkDestination0 = new DeepLinkDestination(v, bundle0);
        this.d.add(navDeepLinkBuilder$DeepLinkDestination0);
        if(this.c != null) {
            this.v();
        }
        return this;
    }

    @l
    @j
    public final NavDeepLinkBuilder c(@l String s) {
        L.p(s, "route");
        return NavDeepLinkBuilder.f(this, s, null, 2, null);
    }

    @l
    @j
    public final NavDeepLinkBuilder d(@l String s, @m Bundle bundle0) {
        L.p(s, "route");
        DeepLinkDestination navDeepLinkBuilder$DeepLinkDestination0 = new DeepLinkDestination(NavDestination.j.a(s).hashCode(), bundle0);
        this.d.add(navDeepLinkBuilder$DeepLinkDestination0);
        if(this.c != null) {
            this.v();
        }
        return this;
    }

    public static NavDeepLinkBuilder e(NavDeepLinkBuilder navDeepLinkBuilder0, int v, Bundle bundle0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            bundle0 = null;
        }
        return navDeepLinkBuilder0.b(v, bundle0);
    }

    public static NavDeepLinkBuilder f(NavDeepLinkBuilder navDeepLinkBuilder0, String s, Bundle bundle0, int v, Object object0) {
        if((v & 2) != 0) {
            bundle0 = null;
        }
        return navDeepLinkBuilder0.d(s, bundle0);
    }

    @l
    public final PendingIntent g() {
        int v;
        Bundle bundle0 = this.e;
        if(bundle0 == null) {
            v = 0;
        }
        else {
            v = 0;
            for(Object object0: bundle0.keySet()) {
                Object object1 = bundle0.get(((String)object0));
                v = v * 0x1F + (object1 == null ? 0 : object1.hashCode());
            }
        }
        for(Object object2: this.d) {
            v = v * 0x1F + ((DeepLinkDestination)object2).b();
            Bundle bundle1 = ((DeepLinkDestination)object2).a();
            if(bundle1 != null) {
                for(Object object3: bundle1.keySet()) {
                    Object object4 = bundle1.get(((String)object3));
                    v = v * 0x1F + (object4 == null ? 0 : object4.hashCode());
                }
            }
        }
        PendingIntent pendingIntent0 = this.h().n(v, 0xC000000);
        L.m(pendingIntent0);
        return pendingIntent0;
    }

    @l
    public final TaskStackBuilder h() {
        if(this.c == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
        if(this.d.isEmpty()) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
        this.i();
        TaskStackBuilder taskStackBuilder0 = TaskStackBuilder.h(this.a).b(new Intent(this.b));
        L.o(taskStackBuilder0, "create(context)\n        …rentStack(Intent(intent))");
        int v = taskStackBuilder0.l();
        for(int v1 = 0; v1 < v; ++v1) {
            Intent intent0 = taskStackBuilder0.i(v1);
            if(intent0 != null) {
                intent0.putExtra("android-support-nav:controller:deepLinkIntent", this.b);
            }
        }
        return taskStackBuilder0;
    }

    private final void i() {
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        NavDestination navDestination0 = null;
        for(Object object0: this.d) {
            int v = ((DeepLinkDestination)object0).b();
            Bundle bundle0 = ((DeepLinkDestination)object0).a();
            NavDestination navDestination1 = this.j(v);
            if(navDestination1 == null) {
                throw new IllegalArgumentException("Navigation destination " + NavDestination.j.b(this.a, v) + " cannot be found in the navigation graph " + this.c);
            }
            int[] arr_v = navDestination1.i(navDestination0);
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                arrayList0.add(((int)arr_v[v1]));
                arrayList1.add(bundle0);
            }
            navDestination0 = navDestination1;
        }
        int[] arr_v1 = u.U5(arrayList0);
        this.b.putExtra("android-support-nav:controller:deepLinkIds", arr_v1);
        this.b.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList1);
    }

    private final NavDestination j(@IdRes int v) {
        k k0 = new k();
        NavGraph navGraph0 = this.c;
        L.m(navGraph0);
        k0.add(navGraph0);
        while(!k0.isEmpty()) {
            NavDestination navDestination0 = (NavDestination)k0.removeFirst();
            if(navDestination0.q() == v) {
                return navDestination0;
            }
            if(navDestination0 instanceof NavGraph) {
                for(Object object0: ((NavGraph)navDestination0)) {
                    k0.add(((NavDestination)object0));
                }
            }
        }
        return null;
    }

    @l
    public final NavDeepLinkBuilder k(@m Bundle bundle0) {
        this.e = bundle0;
        this.b.putExtra("android-support-nav:controller:deepLinkExtras", bundle0);
        return this;
    }

    @l
    public final NavDeepLinkBuilder l(@l ComponentName componentName0) {
        L.p(componentName0, "componentName");
        this.b.setComponent(componentName0);
        return this;
    }

    @l
    public final NavDeepLinkBuilder m(@l Class class0) {
        L.p(class0, "activityClass");
        return this.l(new ComponentName(this.a, class0));
    }

    @l
    @j
    public final NavDeepLinkBuilder n(@IdRes int v) {
        return NavDeepLinkBuilder.r(this, v, null, 2, null);
    }

    @l
    @j
    public final NavDeepLinkBuilder o(@IdRes int v, @m Bundle bundle0) {
        this.d.clear();
        DeepLinkDestination navDeepLinkBuilder$DeepLinkDestination0 = new DeepLinkDestination(v, bundle0);
        this.d.add(navDeepLinkBuilder$DeepLinkDestination0);
        if(this.c != null) {
            this.v();
        }
        return this;
    }

    @l
    @j
    public final NavDeepLinkBuilder p(@l String s) {
        L.p(s, "destRoute");
        return NavDeepLinkBuilder.s(this, s, null, 2, null);
    }

    @l
    @j
    public final NavDeepLinkBuilder q(@l String s, @m Bundle bundle0) {
        L.p(s, "destRoute");
        this.d.clear();
        DeepLinkDestination navDeepLinkBuilder$DeepLinkDestination0 = new DeepLinkDestination(NavDestination.j.a(s).hashCode(), bundle0);
        this.d.add(navDeepLinkBuilder$DeepLinkDestination0);
        if(this.c != null) {
            this.v();
        }
        return this;
    }

    public static NavDeepLinkBuilder r(NavDeepLinkBuilder navDeepLinkBuilder0, int v, Bundle bundle0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            bundle0 = null;
        }
        return navDeepLinkBuilder0.o(v, bundle0);
    }

    public static NavDeepLinkBuilder s(NavDeepLinkBuilder navDeepLinkBuilder0, String s, Bundle bundle0, int v, Object object0) {
        if((v & 2) != 0) {
            bundle0 = null;
        }
        return navDeepLinkBuilder0.q(s, bundle0);
    }

    @l
    public final NavDeepLinkBuilder t(@NavigationRes int v) {
        PermissiveNavigatorProvider navDeepLinkBuilder$PermissiveNavigatorProvider0 = new PermissiveNavigatorProvider();
        return this.u(new NavInflater(this.a, navDeepLinkBuilder$PermissiveNavigatorProvider0).b(v));
    }

    @l
    public final NavDeepLinkBuilder u(@l NavGraph navGraph0) {
        L.p(navGraph0, "navGraph");
        this.c = navGraph0;
        this.v();
        return this;
    }

    private final void v() {
        for(Object object0: this.d) {
            int v = ((DeepLinkDestination)object0).b();
            if(this.j(v) == null) {
                throw new IllegalArgumentException("Navigation destination " + NavDestination.j.b(this.a, v) + " cannot be found in the navigation graph " + this.c);
            }
            if(false) {
                break;
            }
        }
    }
}

