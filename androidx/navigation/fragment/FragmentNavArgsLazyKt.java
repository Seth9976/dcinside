package androidx.navigation.fragment;

import A3.a;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavArgs;
import androidx.navigation.NavArgsLazy;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import y4.l;

public final class FragmentNavArgsLazyKt {
    @MainThread
    public static final NavArgsLazy a(Fragment fragment0) {
        L.p(fragment0, "<this>");
        L.y(4, "Args");
        return new NavArgsLazy(m0.d(NavArgs.class), new a(fragment0) {
            final Fragment e;

            {
                this.e = fragment0;
                super(0);
            }

            @l
            public final Bundle b() {
                Bundle bundle0 = this.e.getArguments();
                if(bundle0 == null) {
                    throw new IllegalStateException("Fragment " + this.e + " has null arguments");
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

