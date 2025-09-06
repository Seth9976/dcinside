package androidx.media3.common;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

@UnstableApi
public class ParserException extends IOException {
    public final boolean a;
    public final int b;

    protected ParserException(@Nullable String s, @Nullable Throwable throwable0, boolean z, int v) {
        super(s, throwable0);
        this.a = z;
        this.b = v;
    }

    public static ParserException a(@Nullable String s, @Nullable Throwable throwable0) {
        return new ParserException(s, throwable0, true, 1);
    }

    public static ParserException b(@Nullable String s, @Nullable Throwable throwable0) {
        return new ParserException(s, throwable0, true, 0);
    }

    public static ParserException c(@Nullable String s, @Nullable Throwable throwable0) {
        return new ParserException(s, throwable0, true, 4);
    }

    public static ParserException d(@Nullable String s, @Nullable Throwable throwable0) {
        return new ParserException(s, throwable0, false, 4);
    }

    public static ParserException e(@Nullable String s) {
        return new ParserException(s, null, false, 1);
    }

    @Override
    @Nullable
    public String getMessage() {
        return super.getMessage() + "{contentIsMalformed=" + this.a + ", dataType=" + this.b + "}";
    }
}

