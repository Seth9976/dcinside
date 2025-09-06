package io.reactivex;

import d3.f;
import d3.g;
import io.reactivex.disposables.c;

public interface n extends k {
    boolean b(@f Throwable arg1);

    void c(@g e3.f arg1);

    void d(@g c arg1);

    long e();

    boolean isCancelled();

    @f
    n serialize();
}

