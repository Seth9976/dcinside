package androidx.navigation;

import android.annotation.SuppressLint;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

@SuppressLint({"TypeParameterUnusedInFormals"})
public class NavigatorProvider {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        @n
        public final String a(@l Class class0) {
            L.p(class0, "navigatorClass");
            String s = (String)NavigatorProvider.c.get(class0);
            if(s == null) {
                Name navigator$Name0 = (Name)class0.getAnnotation(Name.class);
                s = navigator$Name0 == null ? null : navigator$Name0.value();
                if(!this.b(s)) {
                    throw new IllegalArgumentException(("No @Navigator.Name annotation found for " + class0.getSimpleName()).toString());
                }
                NavigatorProvider.c.put(class0, s);
            }
            L.m(s);
            return s;
        }

        public final boolean b(@m String s) {
            return s != null && s.length() > 0;
        }
    }

    @l
    private final Map a;
    @l
    public static final Companion b;
    @l
    private static final Map c;

    static {
        NavigatorProvider.b = new Companion(null);
        NavigatorProvider.c = new LinkedHashMap();
    }

    public NavigatorProvider() {
        this.a = new LinkedHashMap();
    }

    @m
    public final Navigator b(@l Navigator navigator0) {
        L.p(navigator0, "navigator");
        Class class0 = navigator0.getClass();
        return this.c(NavigatorProvider.b.a(class0), navigator0);
    }

    @CallSuper
    @m
    public Navigator c(@l String s, @l Navigator navigator0) {
        L.p(s, "name");
        L.p(navigator0, "navigator");
        if(!NavigatorProvider.b.b(s)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        Navigator navigator1 = (Navigator)this.a.get(s);
        if(L.g(navigator1, navigator0)) {
            return navigator0;
        }
        if(navigator1 != null && navigator1.c()) {
            throw new IllegalStateException(("Navigator " + navigator0 + " is replacing an already attached " + navigator1).toString());
        }
        if(navigator0.c()) {
            throw new IllegalStateException(("Navigator " + navigator0 + " is already attached to another NavController").toString());
        }
        return (Navigator)this.a.put(s, navigator0);
    }

    @l
    @n
    public static final String d(@l Class class0) {
        return NavigatorProvider.b.a(class0);
    }

    @l
    public final Navigator e(@l Class class0) {
        L.p(class0, "navigatorClass");
        return this.f(NavigatorProvider.b.a(class0));
    }

    @CallSuper
    @l
    public Navigator f(@l String s) {
        L.p(s, "name");
        if(!NavigatorProvider.b.b(s)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        Navigator navigator0 = (Navigator)this.a.get(s);
        if(navigator0 == null) {
            throw new IllegalStateException("Could not find Navigator with name \"" + s + "\". You must call NavController.addNavigator() for each navigation type.");
        }
        return navigator0;
    }

    @RestrictTo({Scope.b})
    @l
    public final Map g() {
        return Y.D0(this.a);
    }
}

