package androidx.core.service.quicksettings;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.PendingIntentCompat;

public class PendingIntentActivityWrapper {
    private final Context a;
    private final int b;
    private final Intent c;
    private final int d;
    private final Bundle e;
    private final PendingIntent f;
    private final boolean g;

    public PendingIntentActivityWrapper(Context context0, int v, Intent intent0, int v1, Bundle bundle0, boolean z) {
        this.a = context0;
        this.b = v;
        this.c = intent0;
        this.d = v1;
        this.e = bundle0;
        this.g = z;
        this.f = this.a();
    }

    public PendingIntentActivityWrapper(Context context0, int v, Intent intent0, int v1, boolean z) {
        this(context0, v, intent0, v1, null, z);
    }

    private PendingIntent a() {
        return this.e == null ? PendingIntentCompat.e(this.a, this.b, this.c, this.d, this.g) : PendingIntentCompat.d(this.a, this.b, this.c, this.d, this.e, this.g);
    }

    public Context b() {
        return this.a;
    }

    public int c() {
        return this.d;
    }

    public Intent d() {
        return this.c;
    }

    public Bundle e() {
        return this.e;
    }

    public PendingIntent f() {
        return this.f;
    }

    public int g() {
        return this.b;
    }

    public boolean h() {
        return this.g;
    }
}

