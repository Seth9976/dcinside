package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.crashlytics.internal.persistence.g;
import j..util.Objects;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class l {
    private final g a;
    @Nullable
    private String b;
    @Nullable
    private String c;
    private static final String d = "aqs.";
    private static final FilenameFilter e;
    private static final Comparator f;

    static {
        l.e = (File file0, String s) -> s.startsWith("aqs.");
        l.f = (File file0, File file1) -> Long.compare(file1.lastModified(), file0.lastModified());
    }

    l(g g0) {
        this.b = null;
        this.c = null;
        this.a = g0;
    }

    @Nullable
    public String c(@NonNull String s) {
        synchronized(this) {
            return Objects.equals(this.b, s) ? this.c : l.g(this.a, s);
        }
    }

    // 检测为 Lambda 实现
    private static boolean d(File file0, String s) [...]

    // 检测为 Lambda 实现
    private static int e(File file0, File file1) [...]

    private static void f(g g0, @Nullable String s, @Nullable String s1) {
        if(s != null && s1 != null) {
            try {
                g0.r(s, "aqs." + s1).createNewFile();
            }
            catch(IOException iOException0) {
                com.google.firebase.crashlytics.internal.g.f().n("Failed to persist App Quality Sessions session id.", iOException0);
            }
        }
    }

    @Nullable
    @VisibleForTesting
    static String g(g g0, @NonNull String s) {
        List list0 = g0.s(s, l.e);
        if(list0.isEmpty()) {
            com.google.firebase.crashlytics.internal.g.f().m("Unable to read App Quality Sessions session id.");
            return null;
        }
        return ((File)Collections.min(list0, l.f)).getName().substring(4);
    }

    public void h(@NonNull String s) {
        synchronized(this) {
            if(!Objects.equals(this.c, s)) {
                l.f(this.a, this.b, s);
                this.c = s;
            }
        }
    }

    public void i(@Nullable String s) {
        synchronized(this) {
            if(!Objects.equals(this.b, s)) {
                l.f(this.a, s, this.c);
                this.b = s;
            }
        }
    }
}

