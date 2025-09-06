package androidx.compose.ui.platform;

import kotlin.jvm.internal.L;
import y4.l;

public final class w {
    public static boolean a(OpenEndRange openEndRange0, @l Comparable comparable0) {
        L.p(comparable0, "value");
        return comparable0.compareTo(openEndRange0.getStart()) >= 0 && comparable0.compareTo(openEndRange0.b()) < 0;
    }

    public static boolean b(OpenEndRange openEndRange0) {
        return openEndRange0.getStart().compareTo(openEndRange0.b()) >= 0;
    }
}

