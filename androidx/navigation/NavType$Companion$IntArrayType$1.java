package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class NavType.Companion.IntArrayType.1 extends NavType {
    NavType.Companion.IntArrayType.1() {
        super(true);
    }

    @Override  // androidx.navigation.NavType
    public Object b(Bundle bundle0, String s) {
        return this.j(bundle0, s);
    }

    @Override  // androidx.navigation.NavType
    @l
    public String c() {
        return "integer[]";
    }

    @Override  // androidx.navigation.NavType
    public Object h(String s) {
        return this.k(s);
    }

    @Override  // androidx.navigation.NavType
    public void i(Bundle bundle0, String s, Object object0) {
        this.l(bundle0, s, ((int[])object0));
    }

    @m
    public int[] j(@l Bundle bundle0, @l String s) {
        L.p(bundle0, "bundle");
        L.p(s, "key");
        return (int[])bundle0.get(s);
    }

    @l
    public int[] k(@l String s) {
        L.p(s, "value");
        throw new UnsupportedOperationException("Arrays don\'t support default values.");
    }

    public void l(@l Bundle bundle0, @l String s, @m int[] arr_v) {
        L.p(bundle0, "bundle");
        L.p(s, "key");
        bundle0.putIntArray(s, arr_v);
    }
}

