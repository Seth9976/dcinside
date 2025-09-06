package com.google.firebase.crashlytics.internal.persistence;

import java.io.File;
import java.util.Comparator;

public final class a implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return e.u(((File)object0), ((File)object1));
    }
}

