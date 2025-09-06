package codes.side.andcolorpicker.view.picker;

import kotlin.jvm.internal.W;
import y4.m;

final class d extends W {
    d(b b0) {
        super(b0, b.class, "minUpdating", "getMinUpdating()Z", 0);
    }

    @Override  // kotlin.jvm.internal.W
    @m
    public Object get() {
        return Boolean.valueOf(((b)this.receiver).d);
    }

    @Override  // kotlin.jvm.internal.W
    public void set(@m Object object0) {
        ((b)this.receiver).d = ((Boolean)object0).booleanValue();
    }
}

