package androidx.compose.foundation.lazy.grid;

import y4.l;

public interface LazyGridItemInfo {
    public static final class Companion {
        static final Companion a = null;
        public static final int b = -1;
        public static final int c = -1;

        static {
            Companion.a = new Companion();
        }
    }

    @l
    public static final Companion a = null;
    public static final int b = -1;
    public static final int c = -1;

    static {
        LazyGridItemInfo.a = Companion.a;
    }

    long a();

    long b();

    int c();

    int getColumn();

    int getIndex();

    @l
    Object getKey();
}

