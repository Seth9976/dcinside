package com.google.common.collect;

import J1.b;

@b
@C1
public enum y {
    OPEN(false),
    CLOSED(true);

    final boolean a;

    private y(boolean z) {
        this.a = z;
    }

    private static y[] a() [...] // Inlined contents

    // 去混淆评级： 低(20)
    static y b(boolean z) {
        return z ? y.c : y.b;
    }
}

