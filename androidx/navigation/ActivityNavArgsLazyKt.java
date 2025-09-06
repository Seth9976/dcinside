package androidx.navigation;

import A3.a;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.MainThread;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import y4.l;

public final class ActivityNavArgsLazyKt {
    @MainThread
    public static final NavArgsLazy a(Activity activity0) {
        L.p(activity0, "<this>");
        L.y(4, "Args");
        return new NavArgsLazy(m0.d(NavArgs.class), new a(activity0) {
            final Activity e;

            {
                this.e = activity0;
                super(0);
            }

            @l
            public final Bundle b() {
                Bundle bundle0;
                Intent intent0 = this.e.getIntent();
                if(intent0 == null) {
                    bundle0 = null;
                }
                else {
                    Activity activity0 = this.e;
                    bundle0 = intent0.getExtras();
                    if(bundle0 == null) {
                        throw new IllegalStateException("Activity " + activity0 + " has null extras in " + intent0);
                    }
                }
                if(bundle0 == null) {
                    throw new IllegalStateException("Activity " + this.e + " has a null Intent");
                }
                return bundle0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
    }
}

