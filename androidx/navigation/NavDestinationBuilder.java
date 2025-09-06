package androidx.navigation;

import androidx.annotation.IdRes;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;
import y4.m;

@NavDestinationDsl
public class NavDestinationBuilder {
    @l
    private final Navigator a;
    private final int b;
    @m
    private final String c;
    @m
    private CharSequence d;
    @l
    private Map e;
    @l
    private List f;
    @l
    private Map g;

    @k(message = "Use routes to build your NavDestination instead", replaceWith = @c0(expression = "NavDestinationBuilder(navigator, route = id.toString())", imports = {}))
    public NavDestinationBuilder(@l Navigator navigator0, @IdRes int v) {
        L.p(navigator0, "navigator");
        this(navigator0, v, null);
    }

    public NavDestinationBuilder(@l Navigator navigator0, @IdRes int v, @m String s) {
        L.p(navigator0, "navigator");
        super();
        this.a = navigator0;
        this.b = v;
        this.c = s;
        this.e = new LinkedHashMap();
        this.f = new ArrayList();
        this.g = new LinkedHashMap();
    }

    public NavDestinationBuilder(@l Navigator navigator0, @m String s) {
        L.p(navigator0, "navigator");
        this(navigator0, -1, s);
    }

    @k(message = "Building NavDestinations using IDs with the Kotlin DSL has been deprecated in favor of using routes. When using routes there is no need for actions.")
    public final void a(int v, @l Function1 function10) {
        L.p(function10, "actionBuilder");
        Map map0 = this.g;
        NavActionBuilder navActionBuilder0 = new NavActionBuilder();
        function10.invoke(navActionBuilder0);
        map0.put(v, navActionBuilder0.a());
    }

    public final void b(@l String s, @l Function1 function10) {
        L.p(s, "name");
        L.p(function10, "argumentBuilder");
        Map map0 = this.e;
        NavArgumentBuilder navArgumentBuilder0 = new NavArgumentBuilder();
        function10.invoke(navArgumentBuilder0);
        map0.put(s, navArgumentBuilder0.a());
    }

    @l
    public NavDestination c() {
        NavDestination navDestination0 = this.a.a();
        String s = this.c;
        if(s != null) {
            navDestination0.K(s);
        }
        int v = this.b;
        if(v != -1) {
            navDestination0.H(v);
        }
        navDestination0.I(this.d);
        for(Object object0: this.e.entrySet()) {
            navDestination0.b(((String)((Map.Entry)object0).getKey()), ((NavArgument)((Map.Entry)object0).getValue()));
        }
        for(Object object1: this.f) {
            navDestination0.c(((NavDeepLink)object1));
        }
        for(Object object2: this.g.entrySet()) {
            navDestination0.E(((Number)((Map.Entry)object2).getKey()).intValue(), ((NavAction)((Map.Entry)object2).getValue()));
        }
        return navDestination0;
    }

    public final void d(@l String s) {
        L.p(s, "uriPattern");
        this.f.add(new NavDeepLink(s));
    }

    public final void e(@l Function1 function10) {
        L.p(function10, "navDeepLink");
        List list0 = this.f;
        NavDeepLinkDslBuilder navDeepLinkDslBuilder0 = new NavDeepLinkDslBuilder();
        function10.invoke(navDeepLinkDslBuilder0);
        list0.add(navDeepLinkDslBuilder0.a());
    }

    public final int f() {
        return this.b;
    }

    @m
    public final CharSequence g() {
        return this.d;
    }

    @l
    protected final Navigator h() {
        return this.a;
    }

    @m
    public final String i() {
        return this.c;
    }

    public final void j(@m CharSequence charSequence0) {
        this.d = charSequence0;
    }
}

