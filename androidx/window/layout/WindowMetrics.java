package androidx.window.layout;

import android.graphics.Rect;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.window.core.Bounds;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class WindowMetrics {
    @l
    private final Bounds a;

    @RestrictTo({Scope.e})
    public WindowMetrics(@l Rect rect0) {
        L.p(rect0, "bounds");
        this(new Bounds(rect0));
    }

    public WindowMetrics(@l Bounds bounds0) {
        L.p(bounds0, "_bounds");
        super();
        this.a = bounds0;
    }

    @l
    public final Rect a() {
        return this.a.i();
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return L.g(WindowMetrics.class, class0) ? L.g(this.a, ((WindowMetrics)object0).a) : false;
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
        return "WindowMetrics { bounds: " + this.a() + " }";
    }
}

