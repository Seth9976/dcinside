package com.dcinside.app.image;

import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;

public enum f0 {
    NORMAL,
    POLL,
    VIDEO_THUMBNAIL,
    ALBUM,
    AUTO_DOWNLOAD,
    AUTO_IMAGE;

    private static final f0[] g;
    private static final a h;

    static {
        f0.g = arr_f0;
        L.p(arr_f0, "entries");
        f0.h = new d(arr_f0);
    }

    private static final f0[] a() [...] // Inlined contents

    @l
    public static a b() {
        return f0.h;
    }
}

