package com.dcinside.app.bookmark;

import com.dcinside.app.settings.c.a;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class h implements a {
    @l
    private final String a;
    @l
    private final List b;

    public h(@l String s, @l List list0) {
        L.p(s, "count");
        L.p(list0, "items");
        super();
        this.a = s;
        this.b = list0;
    }

    @Override  // com.dcinside.app.settings.c$a
    public boolean a(@l a c$a0) {
        L.p(c$a0, "other");
        return false;
    }

    @l
    public final String b() {
        return this.a;
    }

    @l
    public final List c() {
        return this.b;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof h && L.g(this.a, ((h)object0).a) && this.b.hashCode() == ((h)object0).b.hashCode();
    }

    @Override  // com.dcinside.app.settings.c$a
    public void f() {
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }
}

