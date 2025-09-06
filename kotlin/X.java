package kotlin;

import java.io.Serializable;
import y4.l;

public final class x implements Serializable, D {
    private final Object a;

    public x(Object object0) {
        this.a = object0;
    }

    @Override  // kotlin.D
    public Object getValue() {
        return this.a;
    }

    @Override  // kotlin.D
    public boolean isInitialized() {
        return true;
    }

    @Override
    @l
    public String toString() {
        return String.valueOf(this.getValue());
    }
}

