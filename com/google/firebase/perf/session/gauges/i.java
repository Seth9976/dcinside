package com.google.firebase.perf.session.gauges;

import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager;
import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.logging.a;
import com.google.firebase.perf.util.j;
import com.google.firebase.perf.util.m;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class i {
    private final Runtime a;
    private final ActivityManager b;
    private final ActivityManager.MemoryInfo c;
    private final Context d;
    private static final a e;

    static {
        i.e = a.e();
    }

    i(Context context0) {
        this(Runtime.getRuntime(), context0);
    }

    @VisibleForTesting
    i(Runtime runtime0, Context context0) {
        this.a = runtime0;
        this.d = context0;
        ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
        this.b = activityManager0;
        ActivityManager.MemoryInfo activityManager$MemoryInfo0 = new ActivityManager.MemoryInfo();
        this.c = activityManager$MemoryInfo0;
        activityManager0.getMemoryInfo(activityManager$MemoryInfo0);
    }

    public int a() {
        return m.d(j.f.e(this.c.totalMem));
    }

    public int b() {
        return m.d(j.f.e(this.a.maxMemory()));
    }

    public int c() {
        long v = (long)this.b.getMemoryClass();
        return m.d(j.d.e(v));
    }

    @VisibleForTesting
    int d(String s) {
        String s1;
        try(BufferedReader bufferedReader0 = new BufferedReader(new FileReader(s))) {
            do {
                s1 = bufferedReader0.readLine();
                if(s1 == null) {
                    return 0;
                }
            }
            while(!s1.startsWith("MemTotal"));
            Matcher matcher0 = Pattern.compile("\\d+").matcher(s1);
            return matcher0.find() ? Integer.parseInt(matcher0.group()) : 0;
        }
        catch(IOException iOException0) {
        }
        catch(NumberFormatException numberFormatException0) {
            i.e.l("Unable to parse \'" + s + "\' file: " + numberFormatException0.getMessage());
            return 0;
        }
        i.e.l("Unable to read \'" + s + "\' file: " + iOException0.getMessage());
        return 0;
    }
}

