package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FilenameFilter;

public final class j implements FilenameFilter {
    @Override
    public final boolean accept(File file0, String s) {
        return l.d(file0, s);
    }
}

