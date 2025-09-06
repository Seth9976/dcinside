package com.google.android.datatransport.runtime;

import android.annotation.SuppressLint;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import r3.f;
import y1.e;

@e
abstract class k {
    @SuppressLint({"ThreadPoolCreation"})
    @f
    @y1.f
    static Executor a() {
        return new p(Executors.newSingleThreadExecutor());
    }
}

