package androidx.media3.exoplayer.analytics;

import android.media.metrics.LogSessionId;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import j..util.Objects;

@UnstableApi
public final class PlayerId {
    @RequiresApi(0x1F)
    static final class LogSessionIdApi31 {
        public final LogSessionId a;
        public static final LogSessionIdApi31 b;

        static {
            LogSessionIdApi31.b = new LogSessionIdApi31(LogSessionId.LOG_SESSION_ID_NONE);
        }

        public LogSessionIdApi31(LogSessionId logSessionId0) {
            this.a = logSessionId0;
        }
    }

    public final String a;
    @Nullable
    private final LogSessionIdApi31 b;
    @Nullable
    private final Object c;
    public static final PlayerId d;

    static {
        PlayerId.d = Util.a >= 0x1F ? new PlayerId(LogSessionIdApi31.b, "") : new PlayerId("");
    }

    @RequiresApi(0x1F)
    public PlayerId(LogSessionId logSessionId0, String s) {
        this(new LogSessionIdApi31(logSessionId0), s);
    }

    private PlayerId(LogSessionIdApi31 playerId$LogSessionIdApi310, String s) {
        this.b = playerId$LogSessionIdApi310;
        this.a = s;
        this.c = new Object();
    }

    public PlayerId(String s) {
        Assertions.i(Util.a < 0x1F);
        this.a = s;
        this.b = null;
        this.c = new Object();
    }

    @RequiresApi(0x1F)
    public LogSessionId a() {
        return ((LogSessionIdApi31)Assertions.g(this.b)).a;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof PlayerId ? Objects.equals(this.a, ((PlayerId)object0).a) && Objects.equals(this.b, ((PlayerId)object0).b) && Objects.equals(this.c, ((PlayerId)object0).c) : false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c});
    }
}

