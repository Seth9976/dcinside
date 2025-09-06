package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.internal.L;
import kotlin.text.c;
import kotlin.text.v;
import y4.l;

public final class NavType.Companion.LongType.1 extends NavType {
    NavType.Companion.LongType.1() {
        super(false);
    }

    @Override  // androidx.navigation.NavType
    public Object b(Bundle bundle0, String s) {
        return this.j(bundle0, s);
    }

    @Override  // androidx.navigation.NavType
    @l
    public String c() {
        return "long";
    }

    @Override  // androidx.navigation.NavType
    public Object h(String s) {
        return this.k(s);
    }

    @Override  // androidx.navigation.NavType
    public void i(Bundle bundle0, String s, Object object0) {
        this.l(bundle0, s, ((Number)object0).longValue());
    }

    @l
    public Long j(@l Bundle bundle0, @l String s) {
        L.p(bundle0, "bundle");
        L.p(s, "key");
        Object object0 = bundle0.get(s);
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }
        return (Long)object0;
    }

    @l
    public Long k(@l String s) {
        String s1;
        L.p(s, "value");
        if(v.N1(s, "L", false, 2, null)) {
            s1 = s.substring(0, s.length() - 1);
            L.o(s1, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        else {
            s1 = s;
        }
        if(v.v2(s, "0x", false, 2, null)) {
            String s2 = s1.substring(2);
            L.o(s2, "this as java.lang.String).substring(startIndex)");
            return Long.parseLong(s2, c.a(16));
        }
        return Long.parseLong(s1);
    }

    public void l(@l Bundle bundle0, @l String s, long v) {
        L.p(bundle0, "bundle");
        L.p(s, "key");
        bundle0.putLong(s, v);
    }
}

