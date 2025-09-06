package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.internal.L;
import y4.l;

public final class NavType.Companion.FloatType.1 extends NavType {
    NavType.Companion.FloatType.1() {
        super(false);
    }

    @Override  // androidx.navigation.NavType
    public Object b(Bundle bundle0, String s) {
        return this.j(bundle0, s);
    }

    @Override  // androidx.navigation.NavType
    @l
    public String c() {
        return "float";
    }

    @Override  // androidx.navigation.NavType
    public Object h(String s) {
        return this.k(s);
    }

    @Override  // androidx.navigation.NavType
    public void i(Bundle bundle0, String s, Object object0) {
        this.l(bundle0, s, ((Number)object0).floatValue());
    }

    @l
    public Float j(@l Bundle bundle0, @l String s) {
        L.p(bundle0, "bundle");
        L.p(s, "key");
        Object object0 = bundle0.get(s);
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
        return (Float)object0;
    }

    @l
    public Float k(@l String s) {
        L.p(s, "value");
        return Float.parseFloat(s);
    }

    public void l(@l Bundle bundle0, @l String s, float f) {
        L.p(bundle0, "bundle");
        L.p(s, "key");
        bundle0.putFloat(s, f);
    }
}

