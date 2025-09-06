package com.google.firebase.crashlytics.internal.persistence;

import java.io.File;
import java.io.FilenameFilter;

public final class b implements FilenameFilter {
    @Override
    public final boolean accept(File file0, String s) {
        return e.v(file0, s);
    }
}

