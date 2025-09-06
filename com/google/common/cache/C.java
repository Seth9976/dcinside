package com.google.common.cache;

import J1.b;
import O1.a;
import O1.f;
import com.google.common.collect.Q2;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

@b
@f("Use CacheBuilder.newBuilder().build()")
@i
public interface c {
    void A();

    Q2 B(Iterable arg1);

    h C();

    void H(@O1.c("K") Object arg1);

    ConcurrentMap c();

    void j();

    @a
    Object l(Object arg1, Callable arg2) throws ExecutionException;

    void put(Object arg1, Object arg2);

    void putAll(Map arg1);

    long size();

    @a
    @o3.a
    Object u(@O1.c("K") Object arg1);

    void y(Iterable arg1);
}

