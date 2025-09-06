package com.dcinside.app.util;

import com.dcinside.app.Application;
import java.io.File;
import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public enum wk {
    WRITE_COPY("write_copy"),
    IMAGE_EDIT("ImageEdit"),
    IMAGE("image");

    @l
    private final String a;
    private static final wk[] e;
    private static final a f;

    static {
        wk.e = arr_wk;
        L.p(arr_wk, "entries");
        wk.f = new d(arr_wk);
    }

    private wk(String s1) {
        this.a = s1;
    }

    private static final wk[] a() [...] // Inlined contents

    @l
    public static a b() {
        return wk.f;
    }

    @m
    public final File c() {
        File file0 = new File(Application.e.c().getCacheDir(), this.a);
        return file0.exists() || file0.mkdir() ? file0 : null;
    }

    @m
    public final String d() {
        File file0 = this.c();
        return file0 == null ? null : file0.getPath();
    }
}

