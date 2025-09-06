package androidx.core.app;

import android.content.res.Configuration;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class MultiWindowModeChangedInfo {
    private final boolean a;
    @RequiresApi(26)
    @m
    private Configuration b;

    public MultiWindowModeChangedInfo(boolean z) {
        this.a = z;
    }

    @RequiresApi(26)
    public MultiWindowModeChangedInfo(boolean z, @l Configuration configuration0) {
        L.p(configuration0, "newConfig");
        this(z);
        this.b = configuration0;
    }

    @RequiresApi(26)
    @l
    public final Configuration a() {
        Configuration configuration0 = this.b;
        if(configuration0 == null) {
            throw new IllegalStateException("MultiWindowModeChangedInfo must be constructed with the constructor that takes a Configuration to access the newConfig. Are you running on an API 26 or higher device that makes this information available?");
        }
        return configuration0;
    }

    public final boolean b() {
        return this.a;
    }
}

