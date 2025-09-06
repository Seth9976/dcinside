package com.vungle.ads.internal.network;

import java.io.IOException;
import y4.l;
import y4.m;

public interface a {
    void cancel();

    void enqueue(@l b arg1);

    @m
    f execute() throws IOException;

    boolean isCanceled();
}

