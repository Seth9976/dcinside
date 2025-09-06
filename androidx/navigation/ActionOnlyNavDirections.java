package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class ActionOnlyNavDirections implements NavDirections {
    private final int a;
    @l
    private final Bundle b;

    public ActionOnlyNavDirections(int v) {
        this.a = v;
        this.b = new Bundle();
    }

    public final int a() {
        return this.d();
    }

    @l
    public final ActionOnlyNavDirections b(int v) {
        return new ActionOnlyNavDirections(v);
    }

    @Override  // androidx.navigation.NavDirections
    @l
    public Bundle c() {
        return this.b;
    }

    @Override  // androidx.navigation.NavDirections
    public int d() {
        return this.a;
    }

    public static ActionOnlyNavDirections e(ActionOnlyNavDirections actionOnlyNavDirections0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = actionOnlyNavDirections0.d();
        }
        return actionOnlyNavDirections0.b(v);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return L.g(ActionOnlyNavDirections.class, class0) && this.d() == ((ActionOnlyNavDirections)object0).d();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.d() + 0x1F;
    }

    @Override
    @l
    public String toString() {
        return "ActionOnlyNavDirections(actionId=" + this.d() + ')';
    }
}

