package com.google.firebase.crashlytics.internal.persistence;

import java.io.File;
import java.util.Comparator;

public final class d implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return e.x(((File)object0), ((File)object1));
    }
}

