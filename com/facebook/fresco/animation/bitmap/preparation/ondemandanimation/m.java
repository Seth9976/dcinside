package com.facebook.fresco.animation.bitmap.preparation.ondemandanimation;

import java.util.Date;
import kotlin.jvm.internal.L;
import y4.l;

final class m {
    @l
    private final j a;
    @l
    private final Date b;

    public m(@l j j0, @l Date date0) {
        L.p(j0, "frameLoader");
        L.p(date0, "insertedTime");
        super();
        this.a = j0;
        this.b = date0;
    }

    @l
    public final j a() {
        return this.a;
    }

    @l
    public final Date b() {
        return this.b;
    }
}

