package com.google.firebase.crashlytics.internal.persistence;

import java.io.File;
import java.io.FilenameFilter;

public final class c implements FilenameFilter {
    @Override
    public final boolean accept(File file0, String s) {
        return e.t(file0, s);
    }
}

