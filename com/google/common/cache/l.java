package com.google.common.cache;

import J1.b;
import O1.a;
import com.google.common.base.t;
import com.google.common.collect.Q2;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

@b
@i
public interface l extends t, c {
    @a
    Object D(Object arg1);

    @a
    Q2 F(Iterable arg1) throws ExecutionException;

    void I(Object arg1);

    @Override  // com.google.common.base.t
    @Deprecated
    Object apply(Object arg1);

    @Override  // com.google.common.cache.c
    ConcurrentMap c();

    @a
    Object get(Object arg1) throws ExecutionException;
}

