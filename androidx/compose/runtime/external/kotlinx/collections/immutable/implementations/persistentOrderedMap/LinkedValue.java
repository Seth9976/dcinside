package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import y4.l;
import y4.m;

public final class LinkedValue {
    private final Object a;
    @m
    private final Object b;
    @m
    private final Object c;

    public LinkedValue(Object object0) {
        this(object0, EndOfChain.a, EndOfChain.a);
    }

    public LinkedValue(Object object0, @m Object object1) {
        this(object0, object1, EndOfChain.a);
    }

    public LinkedValue(Object object0, @m Object object1, @m Object object2) {
        this.a = object0;
        this.b = object1;
        this.c = object2;
    }

    public final boolean a() {
        return this.c != EndOfChain.a;
    }

    public final boolean b() {
        return this.b != EndOfChain.a;
    }

    @m
    public final Object c() {
        return this.c;
    }

    @m
    public final Object d() {
        return this.b;
    }

    public final Object e() {
        return this.a;
    }

    @l
    public final LinkedValue f(@m Object object0) {
        return new LinkedValue(this.a, this.b, object0);
    }

    @l
    public final LinkedValue g(@m Object object0) {
        return new LinkedValue(this.a, object0, this.c);
    }

    @l
    public final LinkedValue h(Object object0) {
        return new LinkedValue(object0, this.b, this.c);
    }
}

