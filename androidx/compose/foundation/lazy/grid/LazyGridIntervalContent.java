package androidx.compose.foundation.lazy.grid;

import A3.o;
import A3.q;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class LazyGridIntervalContent implements LazyLayoutIntervalContent {
    @m
    private final Function1 a;
    @l
    private final o b;
    @l
    private final Function1 c;
    @l
    private final q d;

    public LazyGridIntervalContent(@m Function1 function10, @l o o0, @l Function1 function11, @l q q0) {
        L.p(o0, "span");
        L.p(function11, "type");
        L.p(q0, "item");
        super();
        this.a = function10;
        this.b = o0;
        this.c = function11;
        this.d = q0;
    }

    @l
    public final q a() {
        return this.d;
    }

    @l
    public final o b() {
        return this.b;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    @m
    public Function1 getKey() {
        return this.a;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    @l
    public Function1 getType() {
        return this.c;
    }
}

