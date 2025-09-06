package pl.droidsonroids.relinker;

import android.content.Context;
import java.io.File;

public class e {
    public interface a {
        void a(Context arg1, String[] arg2, String arg3, File arg4, f arg5);
    }

    public interface b {
        void a(String arg1);

        String b(String arg1);

        String[] c();

        void d(String arg1);

        String e(String arg1);
    }

    public interface c {
        void a(Throwable arg1);

        void success();
    }

    public interface d {
        void a(String arg1);
    }

    public static f a() {
        return new f().c();
    }

    public static void b(Context context0, String s) {
        e.d(context0, s, null, null);
    }

    public static void c(Context context0, String s, String s1) {
        e.d(context0, s, s1, null);
    }

    public static void d(Context context0, String s, String s1, c e$c0) {
        new f().h(context0, s, s1, e$c0);
    }

    public static void e(Context context0, String s, c e$c0) {
        e.d(context0, s, null, e$c0);
    }

    public static f f(d e$d0) {
        return new f().k(e$d0);
    }

    public static f g() {
        return new f().n();
    }
}

