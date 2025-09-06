package androidx.activity.result;

import A3.a;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.D;
import kotlin.E;
import kotlin.S0;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class ActivityResultCallerLauncher extends ActivityResultLauncher {
    @l
    private final ActivityResultLauncher a;
    @l
    private final ActivityResultContract b;
    private final Object c;
    @l
    private final D d;
    @l
    private final ActivityResultContract e;

    public ActivityResultCallerLauncher(@l ActivityResultLauncher activityResultLauncher0, @l ActivityResultContract activityResultContract0, Object object0) {
        L.p(activityResultLauncher0, "launcher");
        L.p(activityResultContract0, "callerContract");
        super();
        this.a = activityResultLauncher0;
        this.b = activityResultContract0;
        this.c = object0;
        this.d = E.a(new a() {
            final ActivityResultCallerLauncher e;

            {
                this.e = activityResultCallerLauncher0;
                super(0);
            }

            @l
            public final androidx.activity.result.ActivityResultCallerLauncher.resultContract.2.1 b() {
                return new ActivityResultContract() {
                    @Override  // androidx.activity.result.contract.ActivityResultContract
                    public Intent a(Context context0, Object object0) {
                        return this.d(context0, ((S0)object0));
                    }

                    @Override  // androidx.activity.result.contract.ActivityResultContract
                    public Object c(int v, @m Intent intent0) {
                        return this.a.e().c(v, intent0);
                    }

                    @l
                    public Intent d(@l Context context0, @l S0 s00) {
                        L.p(context0, "context");
                        L.p(s00, "input");
                        return this.a.e().a(context0, this.a.f());
                    }
                };
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
        this.e = this.g();
    }

    @Override  // androidx.activity.result.ActivityResultLauncher
    @l
    public ActivityResultContract a() {
        return this.e;
    }

    @Override  // androidx.activity.result.ActivityResultLauncher
    public void c(Object object0, ActivityOptionsCompat activityOptionsCompat0) {
        this.h(((S0)object0), activityOptionsCompat0);
    }

    @Override  // androidx.activity.result.ActivityResultLauncher
    public void d() {
        this.a.d();
    }

    @l
    public final ActivityResultContract e() {
        return this.b;
    }

    public final Object f() {
        return this.c;
    }

    private final ActivityResultContract g() {
        return (ActivityResultContract)this.d.getValue();
    }

    public void h(@l S0 s00, @m ActivityOptionsCompat activityOptionsCompat0) {
        L.p(s00, "input");
        this.a.c(this.c, activityOptionsCompat0);
    }
}

