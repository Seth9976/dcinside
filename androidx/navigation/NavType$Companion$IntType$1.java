package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.internal.L;
import kotlin.text.c;
import kotlin.text.v;
import y4.l;

public final class NavType.Companion.IntType.1 extends NavType {
    NavType.Companion.IntType.1() {
        super(false);
    }

    @Override  // androidx.navigation.NavType
    public Object b(Bundle bundle0, String s) {
        return this.j(bundle0, s);
    }

    @Override  // androidx.navigation.NavType
    @l
    public String c() {
        return "integer";
    }

    @Override  // androidx.navigation.NavType
    public Object h(String s) {
        return this.k(s);
    }

    @Override  // androidx.navigation.NavType
    public void i(Bundle bundle0, String s, Object object0) {
        this.l(bundle0, s, ((Number)object0).intValue());
    }

    @l
    public Integer j(@l Bundle bundle0, @l String s) {
        L.p(bundle0, "bundle");
        L.p(s, "key");
        Object object0 = bundle0.get(s);
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        return (Integer)object0;
    }

    @l
    public Integer k(@l String s) {
        L.p(s, "value");
        if(v.v2(s, "0x", false, 2, null)) {
            String s1 = s.substring(2);
            L.o(s1, "this as java.lang.String).substring(startIndex)");
            return Integer.parseInt(s1, c.a(16));
        }
        return Integer.parseInt(s);
    }

    public void l(@l Bundle bundle0, @l String s, int v) {
        L.p(bundle0, "bundle");
        L.p(s, "key");
        bundle0.putInt(s, v);
    }
}

