package androidx.window.layout;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class WindowLayoutInfo {
    @l
    private final List a;

    @RestrictTo({Scope.e})
    public WindowLayoutInfo(@l List list0) {
        L.p(list0, "displayFeatures");
        super();
        this.a = list0;
    }

    @l
    public final List a() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return L.g(WindowLayoutInfo.class, class0) ? L.g(this.a, ((WindowLayoutInfo)object0).a) : false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    @l
    public String toString() {
        return u.m3(this.a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }
}

