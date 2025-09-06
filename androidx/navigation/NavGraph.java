package androidx.navigation;

import B3.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.navigation.common.R.styleable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.c0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.sequences.p;
import kotlin.text.v;
import y4.l;
import y4.m;
import z3.n;

public class NavGraph extends NavDestination implements a, Iterable {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        @n
        public final NavDestination a(@l NavGraph navGraph0) {
            L.p(navGraph0, "<this>");
            return (NavDestination)p.f1(p.n(navGraph0.U(navGraph0.c0()), androidx.navigation.NavGraph.Companion.findStartDestination.1.e));

            final class androidx.navigation.NavGraph.Companion.findStartDestination.1 extends N implements Function1 {
                public static final androidx.navigation.NavGraph.Companion.findStartDestination.1 e;

                static {
                    androidx.navigation.NavGraph.Companion.findStartDestination.1.e = new androidx.navigation.NavGraph.Companion.findStartDestination.1();
                }

                androidx.navigation.NavGraph.Companion.findStartDestination.1() {
                    super(1);
                }

                @m
                public final NavDestination a(@l NavDestination navDestination0) {
                    L.p(navDestination0, "it");
                    return navDestination0 instanceof NavGraph ? ((NavGraph)navDestination0).U(((NavGraph)navDestination0).c0()) : null;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((NavDestination)object0));
                }
            }

        }
    }

    @l
    private final SparseArrayCompat l;
    private int m;
    @m
    private String n;
    @m
    private String o;
    @l
    public static final Companion p;

    static {
        NavGraph.p = new Companion(null);
    }

    public NavGraph(@l Navigator navigator0) {
        L.p(navigator0, "navGraphNavigator");
        super(navigator0);
        this.l = new SparseArrayCompat();
    }

    @Override  // androidx.navigation.NavDestination
    public void A(@l Context context0, @l AttributeSet attributeSet0) {
        L.p(context0, "context");
        L.p(attributeSet0, "attrs");
        super.A(context0, attributeSet0);
        TypedArray typedArray0 = context0.getResources().obtainAttributes(attributeSet0, styleable.NavGraphNavigator);
        L.o(typedArray0, "context.resources.obtain…vGraphNavigator\n        )");
        this.j0(typedArray0.getResourceId(styleable.NavGraphNavigator_startDestination, 0));
        this.n = NavDestination.j.b(context0, this.m);
        typedArray0.recycle();
    }

    public final void N(@l NavGraph navGraph0) {
        L.p(navGraph0, "other");
        Iterator iterator0 = navGraph0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            iterator0.remove();
            this.O(((NavDestination)object0));
        }
    }

    public final void O(@l NavDestination navDestination0) {
        L.p(navDestination0, "node");
        int v = navDestination0.q();
        String s = navDestination0.v();
        if(v == 0 && s == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        if(this.v() != null && L.g(s, this.v())) {
            throw new IllegalArgumentException(("Destination " + navDestination0 + " cannot have the same route as graph " + this).toString());
        }
        if(v == this.q()) {
            throw new IllegalArgumentException(("Destination " + navDestination0 + " cannot have the same id as graph " + this).toString());
        }
        NavDestination navDestination1 = (NavDestination)this.l.g(v);
        if(navDestination1 == navDestination0) {
            return;
        }
        if(navDestination0.u() != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if(navDestination1 != null) {
            navDestination1.J(null);
        }
        navDestination0.J(this);
        this.l.o(navDestination0.q(), navDestination0);
    }

    public final void P(@l Collection collection0) {
        L.p(collection0, "nodes");
        for(Object object0: collection0) {
            NavDestination navDestination0 = (NavDestination)object0;
            if(navDestination0 != null) {
                this.O(navDestination0);
            }
        }
    }

    public final void S(@l NavDestination[] arr_navDestination) {
        L.p(arr_navDestination, "nodes");
        for(int v = 0; v < arr_navDestination.length; ++v) {
            this.O(arr_navDestination[v]);
        }
    }

    @m
    public final NavDestination U(@IdRes int v) {
        return this.V(v, true);
    }

    @RestrictTo({Scope.b})
    @m
    public final NavDestination V(@IdRes int v, boolean z) {
        NavDestination navDestination0 = (NavDestination)this.l.g(v);
        if(navDestination0 == null) {
            if(z && this.u() != null) {
                NavGraph navGraph0 = this.u();
                L.m(navGraph0);
                return navGraph0.U(v);
            }
            return null;
        }
        return navDestination0;
    }

    @m
    public final NavDestination W(@m String s) {
        return s == null || v.x3(s) ? null : this.X(s, true);
    }

    @RestrictTo({Scope.b})
    @m
    public final NavDestination X(@l String s, boolean z) {
        L.p(s, "route");
        int v = NavDestination.j.a(s).hashCode();
        NavDestination navDestination0 = (NavDestination)this.l.g(v);
        if(navDestination0 == null) {
            if(z && this.u() != null) {
                NavGraph navGraph0 = this.u();
                L.m(navGraph0);
                return navGraph0.W(s);
            }
            return null;
        }
        return navDestination0;
    }

    @l
    @n
    public static final NavDestination Y(@l NavGraph navGraph0) {
        return NavGraph.p.a(navGraph0);
    }

    @RestrictTo({Scope.b})
    @l
    public final SparseArrayCompat Z() {
        return this.l;
    }

    @RestrictTo({Scope.b})
    @l
    public final String a0() {
        if(this.n == null) {
            this.n = this.o == null ? String.valueOf(this.m) : this.o;
        }
        String s = this.n;
        L.m(s);
        return s;
    }

    @IdRes
    @k(message = "Use getStartDestinationId instead.", replaceWith = @c0(expression = "startDestinationId", imports = {}))
    public final int b0() {
        return this.c0();
    }

    @IdRes
    public final int c0() {
        return this.m;
    }

    public final void clear() {
        Iterator iterator0 = this.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
            iterator0.remove();
        }
    }

    @m
    public final String d0() {
        return this.o;
    }

    @Override  // androidx.navigation.NavDestination
    public boolean equals(@m Object object0) {
        if(object0 != null && object0 instanceof NavGraph) {
            List list0 = p.d3(p.e(SparseArrayKt.k(this.l)));
            Iterator iterator0 = SparseArrayKt.k(((NavGraph)object0).l);
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                list0.remove(((NavDestination)object1));
            }
            return super.equals(object0) && this.l.y() == ((NavGraph)object0).l.y() && this.c0() == ((NavGraph)object0).c0() && list0.isEmpty();
        }
        return false;
    }

    public final void g0(@l NavDestination navDestination0) {
        L.p(navDestination0, "node");
        int v = this.l.k(navDestination0.q());
        if(v >= 0) {
            ((NavDestination)this.l.z(v)).J(null);
            this.l.t(v);
        }
    }

    public final void h0(int v) {
        this.j0(v);
    }

    @Override  // androidx.navigation.NavDestination
    public int hashCode() {
        int v = this.c0();
        SparseArrayCompat sparseArrayCompat0 = this.l;
        int v1 = sparseArrayCompat0.y();
        for(int v2 = 0; v2 < v1; ++v2) {
            v = (v * 0x1F + sparseArrayCompat0.n(v2)) * 0x1F + ((NavDestination)sparseArrayCompat0.z(v2)).hashCode();
        }
        return v;
    }

    public final void i0(@l String s) {
        L.p(s, "startDestRoute");
        this.k0(s);
    }

    @Override
    @l
    public final Iterator iterator() {
        return new Object() {
            private int a;
            private boolean b;

            {
                this.a = -1;
            }

            @l
            public NavDestination a() {
                if(!this.hasNext()) {
                    throw new NoSuchElementException();
                }
                this.b = true;
                int v = this.a + 1;
                this.a = v;
                Object object0 = this.c.Z().z(v);
                L.o(object0, "nodes.valueAt(++index)");
                return (NavDestination)object0;
            }

            @Override
            public boolean hasNext() {
                return this.a + 1 < this.c.Z().y();
            }

            @Override
            public Object next() {
                return this.a();
            }

            @Override
            public void remove() {
                if(!this.b) {
                    throw new IllegalStateException("You must call next() before you can remove an element");
                }
                SparseArrayCompat sparseArrayCompat0 = this.c.Z();
                ((NavDestination)sparseArrayCompat0.z(this.a)).J(null);
                sparseArrayCompat0.t(this.a);
                --this.a;
                this.b = false;
            }
        };
    }

    private final void j0(int v) {
        if(v == this.q()) {
            throw new IllegalArgumentException(("Start destination " + v + " cannot use the same id as the graph " + this).toString());
        }
        if(this.o != null) {
            this.k0(null);
        }
        this.m = v;
        this.n = null;
    }

    private final void k0(String s) {
        int v;
        if(s == null) {
            v = 0;
        }
        else {
            if(L.g(s, this.v())) {
                throw new IllegalArgumentException(("Start destination " + s + " cannot use the same route as the graph " + this).toString());
            }
            if(v.x3(s)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            v = NavDestination.j.a(s).hashCode();
        }
        this.m = v;
        this.o = s;
    }

    @Override  // androidx.navigation.NavDestination
    @RestrictTo({Scope.b})
    @l
    public String m() {
        return this.q() == 0 ? "the root navigation" : super.m();
    }

    @Override  // androidx.navigation.NavDestination
    @l
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(super.toString());
        NavDestination navDestination0 = this.W(this.o);
        if(navDestination0 == null) {
            navDestination0 = this.U(this.c0());
        }
        stringBuilder0.append(" startDestination=");
        if(navDestination0 == null) {
            String s = this.o;
            if(s == null) {
                String s1 = this.n;
                if(s1 == null) {
                    stringBuilder0.append("0x" + Integer.toHexString(this.m));
                }
                else {
                    stringBuilder0.append(s1);
                }
            }
            else {
                stringBuilder0.append(s);
            }
        }
        else {
            stringBuilder0.append("{");
            stringBuilder0.append(navDestination0.toString());
            stringBuilder0.append("}");
        }
        String s2 = stringBuilder0.toString();
        L.o(s2, "sb.toString()");
        return s2;
    }

    @Override  // androidx.navigation.NavDestination
    @RestrictTo({Scope.b})
    @m
    public DeepLinkMatch z(@l NavDeepLinkRequest navDeepLinkRequest0) {
        L.p(navDeepLinkRequest0, "navDeepLinkRequest");
        DeepLinkMatch navDestination$DeepLinkMatch0 = super.z(navDeepLinkRequest0);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this) {
            DeepLinkMatch navDestination$DeepLinkMatch1 = ((NavDestination)object0).z(navDeepLinkRequest0);
            if(navDestination$DeepLinkMatch1 != null) {
                arrayList0.add(navDestination$DeepLinkMatch1);
            }
        }
        return (DeepLinkMatch)u.P3(u.Q(new DeepLinkMatch[]{navDestination$DeepLinkMatch0, ((DeepLinkMatch)u.P3(arrayList0))}));
    }
}

