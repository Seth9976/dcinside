package androidx.fragment.app;

import A3.o;
import android.os.Bundle;
import kotlin.jvm.internal.L;
import y4.l;

public final class FragmentKt {
    public static final void b(@l Fragment fragment0, @l String s) {
        L.p(fragment0, "<this>");
        L.p(s, "requestKey");
        fragment0.getParentFragmentManager().d(s);
    }

    public static final void c(@l Fragment fragment0, @l String s) {
        L.p(fragment0, "<this>");
        L.p(s, "requestKey");
        fragment0.getParentFragmentManager().b(s);
    }

    public static final void d(@l Fragment fragment0, @l String s, @l Bundle bundle0) {
        L.p(fragment0, "<this>");
        L.p(s, "requestKey");
        L.p(bundle0, "result");
        fragment0.getParentFragmentManager().a(s, bundle0);
    }

    public static final void e(@l Fragment fragment0, @l String s, @l o o0) {
        L.p(fragment0, "<this>");
        L.p(s, "requestKey");
        L.p(o0, "listener");
        fragment0.getParentFragmentManager().c(s, fragment0, (String s, Bundle bundle0) -> {
            L.p(o0, "$tmp0");
            L.p(s, "p0");
            L.p(bundle0, "p1");
            o0.invoke(s, bundle0);
        });
    }

    // 检测为 Lambda 实现
    private static final void f(o o0, String s, Bundle bundle0) [...]
}

