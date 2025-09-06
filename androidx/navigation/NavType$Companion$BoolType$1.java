package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class NavType.Companion.BoolType.1 extends NavType {
    NavType.Companion.BoolType.1() {
        super(false);
    }

    @Override  // androidx.navigation.NavType
    public Object b(Bundle bundle0, String s) {
        return this.j(bundle0, s);
    }

    @Override  // androidx.navigation.NavType
    @l
    public String c() {
        return "boolean";
    }

    @Override  // androidx.navigation.NavType
    public Object h(String s) {
        return this.k(s);
    }

    @Override  // androidx.navigation.NavType
    public void i(Bundle bundle0, String s, Object object0) {
        this.l(bundle0, s, ((Boolean)object0).booleanValue());
    }

    @m
    public Boolean j(@l Bundle bundle0, @l String s) {
        L.p(bundle0, "bundle");
        L.p(s, "key");
        return (Boolean)bundle0.get(s);
    }

    @l
    public Boolean k(@l String s) {
        L.p(s, "value");
        if(L.g(s, "true")) {
            return true;
        }
        if(!L.g(s, "false")) {
            throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
        }
        return false;
    }

    public void l(@l Bundle bundle0, @l String s, boolean z) {
        L.p(bundle0, "bundle");
        L.p(s, "key");
        bundle0.putBoolean(s, z);
    }
}

