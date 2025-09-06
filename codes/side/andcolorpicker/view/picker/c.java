package codes.side.andcolorpicker.view.picker;

import kotlin.jvm.internal.W;
import y4.m;

final class c extends W {
    c(b b0) {
        super(b0, b.class, "maxUpdating", "getMaxUpdating()Z", 0);
    }

    @Override  // kotlin.jvm.internal.W
    @m
    public Object get() {
        return Boolean.valueOf(((b)this.receiver).e);
    }

    @Override  // kotlin.jvm.internal.W
    public void set(@m Object object0) {
        ((b)this.receiver).e = ((Boolean)object0).booleanValue();
    }
}

