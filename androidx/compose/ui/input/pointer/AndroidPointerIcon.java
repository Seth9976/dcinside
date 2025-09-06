package androidx.compose.ui.input.pointer;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class AndroidPointerIcon implements PointerIcon {
    @l
    private final android.view.PointerIcon b;

    public AndroidPointerIcon(@l android.view.PointerIcon pointerIcon0) {
        L.p(pointerIcon0, "pointerIcon");
        super();
        this.b = pointerIcon0;
    }

    @l
    public final android.view.PointerIcon a() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!L.g(AndroidPointerIcon.class, class0)) {
            return false;
        }
        L.n(object0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        return L.g(this.b, ((AndroidPointerIcon)object0).b);
    }

    @Override
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "AndroidPointerIcon(pointerIcon=" + this.b + ')';
    }
}

