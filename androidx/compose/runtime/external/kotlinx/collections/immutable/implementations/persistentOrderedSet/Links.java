package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import y4.l;
import y4.m;

public final class Links {
    @m
    private final Object a;
    @m
    private final Object b;

    public Links() {
        this(EndOfChain.a, EndOfChain.a);
    }

    public Links(@m Object object0) {
        this(object0, EndOfChain.a);
    }

    public Links(@m Object object0, @m Object object1) {
        this.a = object0;
        this.b = object1;
    }

    public final boolean a() {
        return this.b != EndOfChain.a;
    }

    public final boolean b() {
        return this.a != EndOfChain.a;
    }

    @m
    public final Object c() {
        return this.b;
    }

    @m
    public final Object d() {
        return this.a;
    }

    @l
    public final Links e(@m Object object0) {
        return new Links(this.a, object0);
    }

    @l
    public final Links f(@m Object object0) {
        return new Links(object0, this.b);
    }
}

