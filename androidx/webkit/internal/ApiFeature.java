package androidx.webkit.internal;

import android.os.Build.VERSION;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import j..util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.chromium.support_lib_boundary.util.a;

public abstract class ApiFeature implements ConditionallySupportedFeature {
    static class LAZY_HOLDER {
        static final Set a;

        static {
            LAZY_HOLDER.a = new HashSet(Arrays.asList(WebViewGlueCommunicator.d().a()));
        }
    }

    public static class M extends ApiFeature {
        M(@NonNull String s, @NonNull String s1) {
            super(s, s1);
        }

        @Override  // androidx.webkit.internal.ApiFeature
        public final boolean c() [...] // 潜在的解密器
    }

    public static class N extends ApiFeature {
        N(@NonNull String s, @NonNull String s1) {
            super(s, s1);
        }

        @Override  // androidx.webkit.internal.ApiFeature
        public final boolean c() [...] // 潜在的解密器
    }

    public static class NoFramework extends ApiFeature {
        NoFramework(@NonNull String s, @NonNull String s1) {
            super(s, s1);
        }

        @Override  // androidx.webkit.internal.ApiFeature
        public final boolean c() {
            return false;
        }
    }

    public static class O extends ApiFeature {
        O(@NonNull String s, @NonNull String s1) {
            super(s, s1);
        }

        @Override  // androidx.webkit.internal.ApiFeature
        public final boolean c() [...] // 潜在的解密器
    }

    public static class O_MR1 extends ApiFeature {
        O_MR1(@NonNull String s, @NonNull String s1) {
            super(s, s1);
        }

        @Override  // androidx.webkit.internal.ApiFeature
        public final boolean c() [...] // 潜在的解密器
    }

    public static class P extends ApiFeature {
        P(@NonNull String s, @NonNull String s1) {
            super(s, s1);
        }

        @Override  // androidx.webkit.internal.ApiFeature
        public final boolean c() [...] // 潜在的解密器
    }

    public static class Q extends ApiFeature {
        Q(@NonNull String s, @NonNull String s1) {
            super(s, s1);
        }

        @Override  // androidx.webkit.internal.ApiFeature
        public final boolean c() [...] // 潜在的解密器
    }

    public static class T extends ApiFeature {
        T(@NonNull String s, @NonNull String s1) {
            super(s, s1);
        }

        @Override  // androidx.webkit.internal.ApiFeature
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    private final String a;
    private final String b;
    private static final Set c;

    static {
        ApiFeature.c = new HashSet();
    }

    ApiFeature(@NonNull String s, @NonNull String s1) {
        this.a = s;
        this.b = s1;
        ApiFeature.c.add(this);
    }

    @Override  // androidx.webkit.internal.ConditionallySupportedFeature
    @NonNull
    public String a() {
        return this.a;
    }

    @NonNull
    @VisibleForTesting
    public static Set b() {
        return LAZY_HOLDER.a;
    }

    public abstract boolean c();

    @ChecksSdkIntAtLeast(api = 21)
    public boolean d() {
        return a.b(LAZY_HOLDER.a, this.b);
    }

    @NonNull
    public static Set e() {
        return DesugarCollections.unmodifiableSet(ApiFeature.c);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.webkit.internal.ConditionallySupportedFeature
    public boolean isSupported() {
        return this.c() || this.d();
    }
}

