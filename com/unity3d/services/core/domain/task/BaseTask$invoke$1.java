package com.unity3d.services.core.domain.task;

import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.e0;
import y4.l;
import y4.m;

@f(c = "com.unity3d.services.core.domain.task.BaseTask$DefaultImpls", f = "BaseTask.kt", i = {}, l = {11}, m = "invoke-gIAlu-s", n = {}, s = {})
final class BaseTask.invoke.1 extends d {
    int label;
    Object result;

    BaseTask.invoke.1(kotlin.coroutines.d d0) {
        super(d0);
    }

    @Override  // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object object0) {
        this.result = object0;
        this.label |= 0x80000000;
        Object object1 = DefaultImpls.invoke-gIAlu-s(null, null, this);
        return object1 == b.l() ? object1 : e0.a(object1);
    }
}

