package androidx.navigation;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.navigation.common.R.styleable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.collections.Y;
import kotlin.collections.k;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.w;
import kotlin.sequences.p;
import kotlin.text.v;
import s3.a;
import s3.b;
import s3.e;
import s3.f;
import y4.l;
import y4.m;
import z3.j;
import z3.n;

public class NavDestination {
    @Retention(RetentionPolicy.CLASS)
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @e(a.b)
    @f(allowedTargets = {b.b, b.a})
    public @interface ClassType {
        Class value();
    }

    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @RestrictTo({Scope.b})
        @l
        public final String a(@m String s) {
            return s == null ? "" : "android-app://androidx.navigation/" + s;
        }

        @RestrictTo({Scope.b})
        @l
        @n
        public final String b(@l Context context0, int v) {
            String s;
            L.p(context0, "context");
            if(v <= 0xFFFFFF) {
                return String.valueOf(v);
            }
            try {
                s = context0.getResources().getResourceName(v);
            }
            catch(Resources.NotFoundException unused_ex) {
                s = String.valueOf(v);
            }
            L.o(s, "try {\n                co….toString()\n            }");
            return s;
        }

        @l
        public final kotlin.sequences.m c(@l NavDestination navDestination0) {
            L.p(navDestination0, "<this>");
            return p.n(navDestination0, androidx.navigation.NavDestination.Companion.hierarchy.1.e);

            final class androidx.navigation.NavDestination.Companion.hierarchy.1 extends N implements Function1 {
                public static final androidx.navigation.NavDestination.Companion.hierarchy.1 e;

                static {
                    androidx.navigation.NavDestination.Companion.hierarchy.1.e = new androidx.navigation.NavDestination.Companion.hierarchy.1();
                }

                androidx.navigation.NavDestination.Companion.hierarchy.1() {
                    super(1);
                }

                @m
                public final NavDestination a(@l NavDestination navDestination0) {
                    L.p(navDestination0, "it");
                    return navDestination0.u();
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((NavDestination)object0));
                }
            }

        }

        @n
        public static void d(NavDestination navDestination0) {
        }

        @l
        @n
        protected final Class e(@l Context context0, @l String s, @l Class class0) {
            L.p(context0, "context");
            L.p(s, "name");
            L.p(class0, "expectedClassType");
            String s1 = s.charAt(0) == 46 ? "com.dcinside.app.android" + s : s;
            Class class1 = (Class)NavDestination.k.get(s1);
            if(class1 == null) {
                try {
                    class1 = Class.forName(s1, true, context0.getClassLoader());
                    NavDestination.k.put(s, class1);
                }
                catch(ClassNotFoundException classNotFoundException0) {
                    throw new IllegalArgumentException(classNotFoundException0);
                }
            }
            L.m(class1);
            if(!class0.isAssignableFrom(class1)) {
                throw new IllegalArgumentException((s1 + " must be a subclass of " + class0).toString());
            }
            return class1;
        }

        @RestrictTo({Scope.b})
        @l
        @n
        public final Class f(@l Context context0, @l String s, @l Class class0) {
            L.p(context0, "context");
            L.p(s, "name");
            L.p(class0, "expectedClassType");
            return NavDestination.B(context0, s, class0);
        }
    }

    @RestrictTo({Scope.b})
    public static final class DeepLinkMatch implements Comparable {
        @l
        private final NavDestination a;
        @m
        private final Bundle b;
        private final boolean c;
        private final boolean d;
        private final int e;

        public DeepLinkMatch(@l NavDestination navDestination0, @m Bundle bundle0, boolean z, boolean z1, int v) {
            L.p(navDestination0, "destination");
            super();
            this.a = navDestination0;
            this.b = bundle0;
            this.c = z;
            this.d = z1;
            this.e = v;
        }

        public int a(@l DeepLinkMatch navDestination$DeepLinkMatch0) {
            L.p(navDestination$DeepLinkMatch0, "other");
            boolean z = this.c;
            if(z && !navDestination$DeepLinkMatch0.c) {
                return 1;
            }
            if(!z && navDestination$DeepLinkMatch0.c) {
                return -1;
            }
            Bundle bundle0 = this.b;
            if(bundle0 != null && navDestination$DeepLinkMatch0.b == null) {
                return 1;
            }
            if(bundle0 == null && navDestination$DeepLinkMatch0.b != null) {
                return -1;
            }
            if(bundle0 != null) {
                L.m(navDestination$DeepLinkMatch0.b);
                int v = bundle0.size() - navDestination$DeepLinkMatch0.b.size();
                if(v > 0) {
                    return 1;
                }
                if(v < 0) {
                    return -1;
                }
            }
            boolean z1 = this.d;
            if(z1 && !navDestination$DeepLinkMatch0.d) {
                return 1;
            }
            return z1 || !navDestination$DeepLinkMatch0.d ? this.e - navDestination$DeepLinkMatch0.e : -1;
        }

        @l
        public final NavDestination b() {
            return this.a;
        }

        @m
        public final Bundle c() {
            return this.b;
        }

        @Override
        public int compareTo(Object object0) {
            return this.a(((DeepLinkMatch)object0));
        }
    }

    @l
    private final String a;
    @m
    private NavGraph b;
    @m
    private String c;
    @m
    private CharSequence d;
    @l
    private final List e;
    @l
    private final SparseArrayCompat f;
    @l
    private Map g;
    private int h;
    @m
    private String i;
    @l
    public static final Companion j;
    @l
    private static final Map k;

    static {
        NavDestination.j = new Companion(null);
        NavDestination.k = new LinkedHashMap();
    }

    public NavDestination(@l Navigator navigator0) {
        L.p(navigator0, "navigator");
        Class class0 = navigator0.getClass();
        this(NavigatorProvider.b.a(class0));
    }

    public NavDestination(@l String s) {
        L.p(s, "navigatorName");
        super();
        this.a = s;
        this.e = new ArrayList();
        this.f = new SparseArrayCompat();
        this.g = new LinkedHashMap();
    }

    @CallSuper
    public void A(@l Context context0, @l AttributeSet attributeSet0) {
        L.p(context0, "context");
        L.p(attributeSet0, "attrs");
        TypedArray typedArray0 = context0.getResources().obtainAttributes(attributeSet0, styleable.Navigator);
        L.o(typedArray0, "context.resources.obtain…s, R.styleable.Navigator)");
        this.K(typedArray0.getString(styleable.Navigator_route));
        if(typedArray0.hasValue(styleable.Navigator_android_id)) {
            this.H(typedArray0.getResourceId(1, 0));
            this.c = NavDestination.j.b(context0, this.h);
        }
        this.d = typedArray0.getText(styleable.Navigator_android_label);
        typedArray0.recycle();
    }

    @l
    @n
    protected static final Class B(@l Context context0, @l String s, @l Class class0) {
        return NavDestination.j.e(context0, s, class0);
    }

    @RestrictTo({Scope.b})
    @l
    @n
    public static final Class C(@l Context context0, @l String s, @l Class class0) {
        return NavDestination.j.f(context0, s, class0);
    }

    public final void D(@IdRes int v, @IdRes int v1) {
        this.E(v, new NavAction(v1, null, null, 6, null));
    }

    public final void E(@IdRes int v, @l NavAction navAction0) {
        L.p(navAction0, "action");
        if(!this.M()) {
            throw new UnsupportedOperationException("Cannot add action " + v + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
        if(v == 0) {
            throw new IllegalArgumentException("Cannot have an action with actionId 0");
        }
        this.f.o(v, navAction0);
    }

    public final void F(@IdRes int v) {
        this.f.r(v);
    }

    public final void G(@l String s) {
        L.p(s, "argumentName");
        this.g.remove(s);
    }

    public final void H(@IdRes int v) {
        this.h = v;
        this.c = null;
    }

    public final void I(@m CharSequence charSequence0) {
        this.d = charSequence0;
    }

    @RestrictTo({Scope.b})
    public final void J(@m NavGraph navGraph0) {
        this.b = navGraph0;
    }

    public final void K(@m String s) {
        if(s == null) {
            this.H(0);
        }
        else if(!v.x3(s)) {
            String s1 = NavDestination.j.a(s);
            this.H(s1.hashCode());
            this.d(s1);
        }
        else {
            throw new IllegalArgumentException("Cannot have an empty route");
        }
        Object object0 = null;
        Collection collection0 = this.e;
        for(Object object1: this.e) {
            if(L.g(((NavDeepLink)object1).k(), NavDestination.j.a(this.i))) {
                object0 = object1;
                break;
            }
        }
        v0.a(collection0).remove(object0);
        this.i = s;
    }

    @RestrictTo({Scope.b})
    public boolean M() {
        return true;
    }

    public final void b(@l String s, @l NavArgument navArgument0) {
        L.p(s, "argumentName");
        L.p(navArgument0, "argument");
        this.g.put(s, navArgument0);
    }

    public final void c(@l NavDeepLink navDeepLink0) {
        L.p(navDeepLink0, "navDeepLink");
        Map map0 = this.l();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            NavArgument navArgument0 = (NavArgument)map$Entry0.getValue();
            if(!navArgument0.d() && !navArgument0.c()) {
                linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        Set set0 = linkedHashMap0.keySet();
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: set0) {
            if(!navDeepLink0.e().contains(((String)object1))) {
                arrayList0.add(object1);
            }
        }
        if(!arrayList0.isEmpty()) {
            throw new IllegalArgumentException(("Deep link " + navDeepLink0.k() + " can\'t be used to open destination " + this + ".\nFollowing required arguments are missing: " + arrayList0).toString());
        }
        this.e.add(navDeepLink0);
    }

    public final void d(@l String s) {
        L.p(s, "uriPattern");
        this.c(new Builder().g(s).a());
    }

    @Override
    public boolean equals(@m Object object0) {
        boolean z1;
        if(object0 != null && object0 instanceof NavDestination) {
            boolean z = u.i3(this.e, ((NavDestination)object0).e).size() == this.e.size();
            if(this.f.y() == ((NavDestination)object0).f.y()) {
                for(Object object1: p.e(SparseArrayKt.k(this.f))) {
                    if(((NavDestination)object0).f.e(((NavAction)object1))) {
                        continue;
                    }
                    goto label_13;
                }
                z1 = true;
                Iterator iterator1 = p.e(SparseArrayKt.k(((NavDestination)object0).f)).iterator();
                while(true) {
                    if(!iterator1.hasNext()) {
                        goto label_14;
                    }
                    Object object2 = iterator1.next();
                    if(!this.f.e(((NavAction)object2))) {
                        break;
                    }
                }
            }
        label_13:
            z1 = false;
        label_14:
            if(this.l().size() == ((NavDestination)object0).l().size()) {
                for(Object object3: Y.T0(this.l())) {
                    if(!((NavDestination)object0).l().containsKey(((Map.Entry)object3).getKey()) || !L.g(((NavDestination)object0).l().get(((Map.Entry)object3).getKey()), ((Map.Entry)object3).getValue())) {
                        return this.h == ((NavDestination)object0).h && L.g(this.i, ((NavDestination)object0).i) && z && z1 && false;
                    }
                }
                for(Object object4: Y.T0(((NavDestination)object0).l())) {
                    if(!this.l().containsKey(((Map.Entry)object4).getKey()) || !L.g(this.l().get(((Map.Entry)object4).getKey()), ((Map.Entry)object4).getValue())) {
                        return this.h == ((NavDestination)object0).h && L.g(this.i, ((NavDestination)object0).i) && z && z1 && false;
                    }
                }
                return this.h == ((NavDestination)object0).h && L.g(this.i, ((NavDestination)object0).i) && z && z1;
            }
            return this.h == ((NavDestination)object0).h && L.g(this.i, ((NavDestination)object0).i) && z && z1 && false;
        }
        return false;
    }

    @RestrictTo({Scope.b})
    @m
    public final Bundle g(@m Bundle bundle0) {
        if(bundle0 == null && (this.g == null || this.g.isEmpty())) {
            return null;
        }
        Bundle bundle1 = new Bundle();
        for(Object object0: this.g.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            ((NavArgument)((Map.Entry)object0).getValue()).e(s, bundle1);
        }
        if(bundle0 != null) {
            bundle1.putAll(bundle0);
            for(Object object1: this.g.entrySet()) {
                String s1 = (String)((Map.Entry)object1).getKey();
                NavArgument navArgument0 = (NavArgument)((Map.Entry)object1).getValue();
                if(!navArgument0.f(s1, bundle1)) {
                    throw new IllegalArgumentException(("Wrong argument type for \'" + s1 + "\' in argument bundle. " + navArgument0.b().c() + " expected.").toString());
                }
                if(false) {
                    break;
                }
            }
        }
        return bundle1;
    }

    @RestrictTo({Scope.b})
    @l
    @j
    public final int[] h() {
        return NavDestination.j(this, null, 1, null);
    }

    @Override
    public int hashCode() {
        int v = this.h * 0x1F + (this.i == null ? 0 : this.i.hashCode());
        for(Object object0: this.e) {
            String s = ((NavDeepLink)object0).k();
            String s1 = ((NavDeepLink)object0).d();
            String s2 = ((NavDeepLink)object0).g();
            v = ((v * 0x1F + (s == null ? 0 : s.hashCode())) * 0x1F + (s1 == null ? 0 : s1.hashCode())) * 0x1F + (s2 == null ? 0 : s2.hashCode());
        }
        Iterator iterator1 = SparseArrayKt.k(this.f);
        while(iterator1.hasNext()) {
            Object object1 = iterator1.next();
            NavAction navAction0 = (NavAction)object1;
            NavOptions navOptions0 = navAction0.c();
            v = (v * 0x1F + navAction0.b()) * 0x1F + (navOptions0 == null ? 0 : navOptions0.hashCode());
            Bundle bundle0 = navAction0.a();
            if(bundle0 != null) {
                Set set0 = bundle0.keySet();
                if(set0 != null) {
                    L.o(set0, "keySet()");
                    for(Object object2: set0) {
                        Bundle bundle1 = navAction0.a();
                        L.m(bundle1);
                        Object object3 = bundle1.get(((String)object2));
                        v = v * 0x1F + (object3 == null ? 0 : object3.hashCode());
                    }
                }
            }
        }
        for(Object object4: this.l().keySet()) {
            Object object5 = this.l().get(((String)object4));
            v = (v * 0x1F + ((String)object4).hashCode()) * 0x1F + (object5 == null ? 0 : object5.hashCode());
        }
        return v;
    }

    @RestrictTo({Scope.b})
    @l
    @j
    public final int[] i(@m NavDestination navDestination0) {
        k k0 = new k();
        for(NavDestination navDestination1 = this; true; navDestination1 = navGraph0) {
            L.m(navDestination1);
            NavGraph navGraph0 = navDestination1.b;
            if((navDestination0 == null ? null : navDestination0.b) != null) {
                NavGraph navGraph1 = navDestination0.b;
                L.m(navGraph1);
                if(navGraph1.U(navDestination1.h) == navDestination1) {
                    k0.addFirst(navDestination1);
                    break;
                }
            }
            if(navGraph0 == null || navGraph0.c0() != navDestination1.h) {
                k0.addFirst(navDestination1);
            }
            if(L.g(navGraph0, navDestination0) || navGraph0 == null) {
                break;
            }
        }
        Iterable iterable0 = u.V5(k0);
        ArrayList arrayList0 = new ArrayList(u.b0(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(((NavDestination)object0).h);
        }
        return u.U5(arrayList0);
    }

    public static int[] j(NavDestination navDestination0, NavDestination navDestination1, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
        }
        if((v & 1) != 0) {
            navDestination1 = null;
        }
        return navDestination0.i(navDestination1);
    }

    @m
    public final NavAction k(@IdRes int v) {
        NavAction navAction0 = this.f.m() ? null : ((NavAction)this.f.g(v));
        if(navAction0 == null) {
            return this.b == null ? null : this.b.k(v);
        }
        return navAction0;
    }

    @l
    public final Map l() {
        return Y.D0(this.g);
    }

    @RestrictTo({Scope.b})
    @l
    public String m() {
        return this.c == null ? String.valueOf(this.h) : this.c;
    }

    @RestrictTo({Scope.b})
    @l
    @n
    public static final String o(@l Context context0, int v) {
        return NavDestination.j.b(context0, v);
    }

    @l
    public static final kotlin.sequences.m p(@l NavDestination navDestination0) {
        return NavDestination.j.c(navDestination0);
    }

    @IdRes
    public final int q() {
        return this.h;
    }

    @m
    public final CharSequence r() {
        return this.d;
    }

    @l
    public final String t() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.getClass().getSimpleName());
        stringBuilder0.append("(");
        String s = this.c;
        if(s == null) {
            stringBuilder0.append("0x");
            stringBuilder0.append(Integer.toHexString(this.h));
        }
        else {
            stringBuilder0.append(s);
        }
        stringBuilder0.append(")");
        if(this.i != null && !v.x3(this.i)) {
            stringBuilder0.append(" route=");
            stringBuilder0.append(this.i);
        }
        if(this.d != null) {
            stringBuilder0.append(" label=");
            stringBuilder0.append(this.d);
        }
        String s1 = stringBuilder0.toString();
        L.o(s1, "sb.toString()");
        return s1;
    }

    @m
    public final NavGraph u() {
        return this.b;
    }

    @m
    public final String v() {
        return this.i;
    }

    public boolean x(@l Uri uri0) {
        L.p(uri0, "deepLink");
        return this.y(new NavDeepLinkRequest(uri0, null, null));
    }

    public boolean y(@l NavDeepLinkRequest navDeepLinkRequest0) {
        L.p(navDeepLinkRequest0, "deepLinkRequest");
        return this.z(navDeepLinkRequest0) != null;
    }

    @RestrictTo({Scope.b})
    @m
    public DeepLinkMatch z(@l NavDeepLinkRequest navDeepLinkRequest0) {
        L.p(navDeepLinkRequest0, "navDeepLinkRequest");
        if(this.e.isEmpty()) {
            return null;
        }
        DeepLinkMatch navDestination$DeepLinkMatch0 = null;
        for(Object object0: this.e) {
            NavDeepLink navDeepLink0 = (NavDeepLink)object0;
            Uri uri0 = navDeepLinkRequest0.c();
            Bundle bundle0 = uri0 == null ? null : navDeepLink0.f(uri0, this.l());
            String s = navDeepLinkRequest0.a();
            boolean z = s != null && L.g(s, navDeepLink0.d());
            String s1 = navDeepLinkRequest0.b();
            int v = s1 == null ? -1 : navDeepLink0.h(s1);
            if(bundle0 != null || z || v > -1) {
                DeepLinkMatch navDestination$DeepLinkMatch1 = new DeepLinkMatch(this, bundle0, navDeepLink0.l(), z, v);
                if(navDestination$DeepLinkMatch0 == null || navDestination$DeepLinkMatch1.a(navDestination$DeepLinkMatch0) > 0) {
                    navDestination$DeepLinkMatch0 = navDestination$DeepLinkMatch1;
                }
            }
        }
        return navDestination$DeepLinkMatch0;
    }
}

