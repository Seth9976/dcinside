package androidx.media3.common.util;

import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.UnknownHostException;
import w4.d;

@UnstableApi
public final class Log {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface LogLevel {
    }

    public interface Logger {
        public static final Logger a;

        static {
            Logger.a = new Logger() {
                @Override  // androidx.media3.common.util.Log$Logger
                public void e(String s, String s1, @Nullable Throwable throwable0) {
                    android.util.Log.e(s, Log.a(s1, throwable0));
                }

                @Override  // androidx.media3.common.util.Log$Logger
                public void f(String s, String s1, @Nullable Throwable throwable0) {
                    android.util.Log.d(s, Log.a(s1, throwable0));
                }

                @Override  // androidx.media3.common.util.Log$Logger
                public void g(String s, String s1, @Nullable Throwable throwable0) {
                    android.util.Log.i(s, Log.a(s1, throwable0));
                }

                @Override  // androidx.media3.common.util.Log$Logger
                public void w(String s, String s1, @Nullable Throwable throwable0) {
                    android.util.Log.w(s, Log.a(s1, throwable0));
                }
            };
        }

        void e(String arg1, String arg2, @Nullable Throwable arg3);

        void f(String arg1, String arg2, @Nullable Throwable arg3);

        void g(String arg1, String arg2, @Nullable Throwable arg3);

        void w(String arg1, String arg2, @Nullable Throwable arg3);
    }

    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 0x7FFFFFFF;
    private static final Object f = null;
    @GuardedBy("lock")
    private static int g = 0;
    @GuardedBy("lock")
    private static boolean h = true;
    @GuardedBy("lock")
    private static Logger i;

    static {
        Log.f = new Object();
        Log.i = Logger.a;
    }

    @d
    public static String a(String s, @Nullable Throwable throwable0) {
        String s1 = Log.g(throwable0);
        return TextUtils.isEmpty(s1) ? s : s + "\n  " + s1.replace("\n", "\n  ") + '\n';
    }

    @d
    public static void b(@Size(max = 23L) String s, String s1) {
        synchronized(Log.f) {
            if(Log.g == 0) {
                Log.i.f(s, s1, null);
            }
        }
    }

    @d
    public static void c(@Size(max = 23L) String s, String s1, @Nullable Throwable throwable0) {
        synchronized(Log.f) {
            if(Log.g == 0) {
                Log.i.f(s, s1, throwable0);
            }
        }
    }

    @d
    public static void d(@Size(max = 23L) String s, String s1) {
        synchronized(Log.f) {
            if(Log.g <= 3) {
                Log.i.e(s, s1, null);
            }
        }
    }

    @d
    public static void e(@Size(max = 23L) String s, String s1, @Nullable Throwable throwable0) {
        synchronized(Log.f) {
            if(Log.g <= 3) {
                Log.i.e(s, s1, throwable0);
            }
        }
    }

    @d
    public static int f() {
        synchronized(Log.f) {
        }
        return Log.g;
    }

    @Nullable
    @d
    public static String g(@Nullable Throwable throwable0) {
        if(throwable0 == null) {
            return null;
        }
        synchronized(Log.f) {
            if(Log.j(throwable0)) {
                return "UnknownHostException (no network)";
            }
            if(!Log.h) {
                return throwable0.getMessage();
            }
        }
        return android.util.Log.getStackTraceString(throwable0).trim().replace("\t", "    ");
    }

    @d
    public static void h(@Size(max = 23L) String s, String s1) {
        synchronized(Log.f) {
            if(Log.g <= 1) {
                Log.i.g(s, s1, null);
            }
        }
    }

    @d
    public static void i(@Size(max = 23L) String s, String s1, @Nullable Throwable throwable0) {
        synchronized(Log.f) {
            if(Log.g <= 1) {
                Log.i.g(s, s1, throwable0);
            }
        }
    }

    @d
    private static boolean j(@Nullable Throwable throwable0) {
        while(throwable0 != null) {
            if(throwable0 instanceof UnknownHostException) {
                return true;
            }
            throwable0 = throwable0.getCause();
        }
        return false;
    }

    public static void k(int v) {
        synchronized(Log.f) {
            Log.g = v;
        }
    }

    public static void l(boolean z) {
        synchronized(Log.f) {
            Log.h = z;
        }
    }

    public static void m(Logger log$Logger0) {
        synchronized(Log.f) {
            Log.i = log$Logger0;
        }
    }

    @d
    public static void n(@Size(max = 23L) String s, String s1) {
        synchronized(Log.f) {
            if(Log.g <= 2) {
                Log.i.w(s, s1, null);
            }
        }
    }

    @d
    public static void o(@Size(max = 23L) String s, String s1, @Nullable Throwable throwable0) {
        synchronized(Log.f) {
            if(Log.g <= 2) {
                Log.i.w(s, s1, throwable0);
            }
        }
    }
}

