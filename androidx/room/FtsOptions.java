package androidx.room;

import androidx.annotation.RequiresApi;
import y4.l;

public final class FtsOptions {
    public static enum MatchInfo {
        FTS3,
        FTS4;

        private static final MatchInfo[] a() [...] // Inlined contents
    }

    public static enum Order {
        ASC,
        DESC;

        private static final Order[] a() [...] // Inlined contents
    }

    @l
    public static final FtsOptions a = null;
    @l
    public static final String b = "simple";
    @l
    public static final String c = "porter";
    @l
    public static final String d = "icu";
    @RequiresApi(21)
    @l
    public static final String e = "unicode61";

    static {
        FtsOptions.a = new FtsOptions();
    }
}

