package androidx.window.layout;

import kotlin.jvm.internal.L;
import y4.l;

final class EmptyDecorator implements WindowInfoTrackerDecorator {
    @l
    public static final EmptyDecorator a;

    static {
        EmptyDecorator.a = new EmptyDecorator();
    }

    @Override  // androidx.window.layout.WindowInfoTrackerDecorator
    @l
    public WindowInfoTracker a(@l WindowInfoTracker windowInfoTracker0) {
        L.p(windowInfoTracker0, "tracker");
        return windowInfoTracker0;
    }
}

