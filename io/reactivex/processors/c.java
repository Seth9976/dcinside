package io.reactivex.processors;

import d3.d;
import d3.f;
import d3.g;
import io.reactivex.l;
import io.reactivex.q;
import org.reactivestreams.b;

public abstract class c extends l implements q, b {
    @g
    public abstract Throwable O8();

    public abstract boolean P8();

    public abstract boolean Q8();

    public abstract boolean R8();

    @d
    @f
    public final c S8() {
        return this instanceof io.reactivex.processors.g ? this : new io.reactivex.processors.g(this);
    }
}

