package androidx.compose.ui.input.pointer;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class AndroidPointerIconType implements PointerIcon {
    private final int b;

    public AndroidPointerIconType(int v) {
        this.b = v;
    }

    public final int a() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!L.g(AndroidPointerIconType.class, class0)) {
            return false;
        }
        L.n(object0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.b == ((AndroidPointerIconType)object0).b;
    }

    @Override
    public int hashCode() {
        return this.b;
    }

    @Override
    @l
    public String toString() {
        return "AndroidPointerIcon(type=" + this.b + ')';
    }
}

