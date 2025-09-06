package com.google.firebase.crashlytics.internal.persistence;

import java.io.File;
import java.io.FilenameFilter;

public final class f implements FilenameFilter {
    public final String a;

    public f(String s) {
        this.a = s;
    }

    @Override
    public final boolean accept(File file0, String s) {
        return g.t(this.a, file0, s);
    }
}

