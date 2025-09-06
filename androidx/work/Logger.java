package androidx.work;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.b})
public abstract class Logger {
    public static class LogcatLogger extends Logger {
        private final int f;

        public LogcatLogger(int v) {
            super(v);
            this.f = v;
        }

        @Override  // androidx.work.Logger
        public void a(@NonNull String s, @NonNull String s1) {
            if(this.f <= 3) {
                Log.d(s, s1);
            }
        }

        @Override  // androidx.work.Logger
        public void b(@NonNull String s, @NonNull String s1, @NonNull Throwable throwable0) {
            if(this.f <= 3) {
                Log.d(s, s1, throwable0);
            }
        }

        @Override  // androidx.work.Logger
        public void c(@NonNull String s, @NonNull String s1) {
            if(this.f <= 6) {
                Log.e(s, s1);
            }
        }

        @Override  // androidx.work.Logger
        public void d(@NonNull String s, @NonNull String s1, @NonNull Throwable throwable0) {
            if(this.f <= 6) {
                Log.e(s, s1, throwable0);
            }
        }

        @Override  // androidx.work.Logger
        public void f(@NonNull String s, @NonNull String s1) {
            if(this.f <= 4) {
                Log.i(s, s1);
            }
        }

        @Override  // androidx.work.Logger
        public void g(@NonNull String s, @NonNull String s1, @NonNull Throwable throwable0) {
            if(this.f <= 4) {
                Log.i(s, s1, throwable0);
            }
        }

        @Override  // androidx.work.Logger
        public void j(@NonNull String s, @NonNull String s1) {
            if(this.f <= 2) {
                Log.v(s, s1);
            }
        }

        @Override  // androidx.work.Logger
        public void k(@NonNull String s, @NonNull String s1, @NonNull Throwable throwable0) {
            if(this.f <= 2) {
                Log.v(s, s1, throwable0);
            }
        }

        @Override  // androidx.work.Logger
        public void l(@NonNull String s, @NonNull String s1) {
            if(this.f <= 5) {
                Log.w(s, s1);
            }
        }

        @Override  // androidx.work.Logger
        public void m(@NonNull String s, @NonNull String s1, @NonNull Throwable throwable0) {
            if(this.f <= 5) {
                Log.w(s, s1, throwable0);
            }
        }
    }

    private static final Object a = null;
    private static volatile Logger b = null;
    private static final String c = "WM-";
    private static final int d = 23;
    private static final int e = 20;

    static {
        Logger.a = new Object();
    }

    public Logger(int v) {
    }

    public abstract void a(@NonNull String arg1, @NonNull String arg2);

    public abstract void b(@NonNull String arg1, @NonNull String arg2, @NonNull Throwable arg3);

    public abstract void c(@NonNull String arg1, @NonNull String arg2);

    public abstract void d(@NonNull String arg1, @NonNull String arg2, @NonNull Throwable arg3);

    @NonNull
    public static Logger e() {
        synchronized(Logger.a) {
            if(Logger.b == null) {
                Logger.b = new LogcatLogger(3);
            }
            return Logger.b;
        }
    }

    public abstract void f(@NonNull String arg1, @NonNull String arg2);

    public abstract void g(@NonNull String arg1, @NonNull String arg2, @NonNull Throwable arg3);

    public static void h(@NonNull Logger logger0) {
        synchronized(Logger.a) {
            if(Logger.b == null) {
                Logger.b = logger0;
            }
        }
    }

    @NonNull
    public static String i(@NonNull String s) [...] // 潜在的解密器

    public abstract void j(@NonNull String arg1, @NonNull String arg2);

    public abstract void k(@NonNull String arg1, @NonNull String arg2, @NonNull Throwable arg3);

    public abstract void l(@NonNull String arg1, @NonNull String arg2);

    public abstract void m(@NonNull String arg1, @NonNull String arg2, @NonNull Throwable arg3);
}

