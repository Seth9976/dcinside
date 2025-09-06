package com.unity3d.ads.adplayer;

import kotlin.jvm.internal.w;

public abstract class AdPlayerError extends Exception {
    private AdPlayerError(String s) {
        super(s);
    }

    public AdPlayerError(String s, w w0) {
        this(s);
    }
}

