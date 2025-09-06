package org.slf4j;

import org.slf4j.helpers.c;
import org.slf4j.helpers.m;
import org.slf4j.impl.StaticMarkerBinder;

public class e {
    static IMarkerFactory a;

    static {
        try {
            e.a = e.a();
        }
        catch(NoClassDefFoundError unused_ex) {
            e.a = new c();
        }
        catch(Exception exception0) {
            m.d("Unexpected failure while binding MarkerFactory", exception0);
        }
    }

    private static IMarkerFactory a() throws NoClassDefFoundError {
        try {
            return StaticMarkerBinder.getSingleton().getMarkerFactory();
        }
        catch(NoSuchMethodError unused_ex) {
            return StaticMarkerBinder.SINGLETON.getMarkerFactory();
        }
    }

    public static d b(String s) {
        return e.a.c(s);
    }

    public static IMarkerFactory c() {
        return e.a;
    }

    public static d d(String s) {
        return e.a.a(s);
    }
}

