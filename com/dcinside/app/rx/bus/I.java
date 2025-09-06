package com.dcinside.app.rx.bus;

import kotlin.jvm.internal.L;
import y4.l;

public final class i {
    @l
    private final String a;
    @l
    private final String b;

    public i(@l String s, @l String s1) {
        L.p(s, "message");
        L.p(s1, "galleryId");
        super();
        this.a = s;
        this.b = s1;
    }

    @l
    public final String a() {
        return this.b;
    }

    @l
    public final String b() {
        return this.a;
    }
}

