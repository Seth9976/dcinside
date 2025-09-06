package com.unity3d.ads.adplayer;

import y4.l;

public enum HandlerType {
    CALLBACK("handleCallback"),
    INVOCATION("handleInvocation"),
    EVENT("handleEvent");

    @l
    private final String jsPath;

    private static final HandlerType[] $values() [...] // Inlined contents

    private HandlerType(String s1) {
        this.jsPath = s1;
    }

    @l
    public final String getJsPath() {
        return this.jsPath;
    }
}

