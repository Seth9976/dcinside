package androidx.compose.foundation.lazy;

import A3.q;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class LazyListIntervalContent implements LazyLayoutIntervalContent {
    @m
    private final Function1 a;
    @l
    private final Function1 b;
    @l
    private final q c;

    public LazyListIntervalContent(@m Function1 function10, @l Function1 function11, @l q q0) {
        L.p(function11, "type");
        L.p(q0, "item");
        super();
        this.a = function10;
        this.b = function11;
        this.c = q0;
    }

    @l
    public final q a() {
        return this.c;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    @m
    public Function1 getKey() {
        return this.a;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    @l
    public Function1 getType() {
        return this.b;
    }
}

