package com.google.android.datatransport.runtime.scheduling.persistence;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.datatransport.runtime.j;
import com.google.android.datatransport.runtime.r;
import java.io.Closeable;

@WorkerThread
public interface d extends Closeable {
    int A();

    @Nullable
    k K3(r arg1, j arg2);

    long Q2(r arg1);

    boolean S2(r arg1);

    void V1(Iterable arg1);

    void V2(Iterable arg1);

    Iterable g3(r arg1);

    Iterable k2();

    void u(r arg1, long arg2);
}

