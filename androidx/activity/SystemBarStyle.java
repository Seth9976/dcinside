package androidx.activity;

import android.content.res.Resources;
import androidx.annotation.ColorInt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import z3.j;
import z3.n;

public final class SystemBarStyle {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        @j
        @n
        public final SystemBarStyle a(@ColorInt int v, @ColorInt int v1) {
            return Companion.c(this, v, v1, null, 4, null);
        }

        @l
        @j
        @n
        public final SystemBarStyle b(@ColorInt int v, @ColorInt int v1, @l Function1 function10) {
            L.p(function10, "detectDarkMode");
            return new SystemBarStyle(v, v1, 0, function10, null);
        }

        public static SystemBarStyle c(Companion systemBarStyle$Companion0, int v, int v1, Function1 function10, int v2, Object object0) {
            if((v2 & 4) != 0) {
                function10 = androidx.activity.SystemBarStyle.Companion.auto.1.e;
            }
            return systemBarStyle$Companion0.b(v, v1, function10);

            final class androidx.activity.SystemBarStyle.Companion.auto.1 extends N implements Function1 {
                public static final androidx.activity.SystemBarStyle.Companion.auto.1 e;

                static {
                    androidx.activity.SystemBarStyle.Companion.auto.1.e = new androidx.activity.SystemBarStyle.Companion.auto.1();
                }

                androidx.activity.SystemBarStyle.Companion.auto.1() {
                    super(1);
                }

                @l
                public final Boolean a(@l Resources resources0) {
                    L.p(resources0, "resources");
                    return (resources0.getConfiguration().uiMode & 0x30) == 0x20;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((Resources)object0));
                }
            }

        }

        @l
        @n
        public final SystemBarStyle d(@ColorInt int v) {
            return new SystemBarStyle(v, v, 2, androidx.activity.SystemBarStyle.Companion.dark.1.e, null);

            final class androidx.activity.SystemBarStyle.Companion.dark.1 extends N implements Function1 {
                public static final androidx.activity.SystemBarStyle.Companion.dark.1 e;

                static {
                    androidx.activity.SystemBarStyle.Companion.dark.1.e = new androidx.activity.SystemBarStyle.Companion.dark.1();
                }

                androidx.activity.SystemBarStyle.Companion.dark.1() {
                    super(1);
                }

                @l
                public final Boolean a(@l Resources resources0) {
                    L.p(resources0, "<anonymous parameter 0>");
                    return true;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((Resources)object0));
                }
            }

        }

        @l
        @n
        public final SystemBarStyle e(@ColorInt int v, @ColorInt int v1) {
            return new SystemBarStyle(v, v1, 1, androidx.activity.SystemBarStyle.Companion.light.1.e, null);

            final class androidx.activity.SystemBarStyle.Companion.light.1 extends N implements Function1 {
                public static final androidx.activity.SystemBarStyle.Companion.light.1 e;

                static {
                    androidx.activity.SystemBarStyle.Companion.light.1.e = new androidx.activity.SystemBarStyle.Companion.light.1();
                }

                androidx.activity.SystemBarStyle.Companion.light.1() {
                    super(1);
                }

                @l
                public final Boolean a(@l Resources resources0) {
                    L.p(resources0, "<anonymous parameter 0>");
                    return false;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((Resources)object0));
                }
            }

        }
    }

    private final int a;
    private final int b;
    private final int c;
    @l
    private final Function1 d;
    @l
    public static final Companion e;

    static {
        SystemBarStyle.e = new Companion(null);
    }

    private SystemBarStyle(int v, int v1, int v2, Function1 function10) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = function10;
    }

    public SystemBarStyle(int v, int v1, int v2, Function1 function10, w w0) {
        this(v, v1, v2, function10);
    }

    @l
    @j
    @n
    public static final SystemBarStyle a(@ColorInt int v, @ColorInt int v1) {
        return SystemBarStyle.e.a(v, v1);
    }

    @l
    @j
    @n
    public static final SystemBarStyle b(@ColorInt int v, @ColorInt int v1, @l Function1 function10) {
        return SystemBarStyle.e.b(v, v1, function10);
    }

    @l
    @n
    public static final SystemBarStyle c(@ColorInt int v) {
        return SystemBarStyle.e.d(v);
    }

    public final int d() {
        return this.b;
    }

    @l
    public final Function1 e() {
        return this.d;
    }

    public final int f() {
        return this.c;
    }

    // 去混淆评级： 低(20)
    public final int g(boolean z) {
        return z ? this.b : this.a;
    }

    public final int h(boolean z) {
        if(this.c == 0) {
            return 0;
        }
        return z ? this.b : this.a;
    }

    @l
    @n
    public static final SystemBarStyle i(@ColorInt int v, @ColorInt int v1) {
        return SystemBarStyle.e.e(v, v1);
    }
}

