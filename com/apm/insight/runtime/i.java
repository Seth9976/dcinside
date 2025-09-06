package com.apm.insight.runtime;

import android.os.SystemClock;
import android.util.Printer;
import com.apm.insight.a;
import java.util.ArrayList;
import java.util.List;

public class i {
    private static i a;
    private long b;
    private final List c;
    private final List d;
    private boolean e;

    static {
    }

    private i() {
        this.b = -1L;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = false;
    }

    public static i a() {
        if(i.a == null) {
            Class class0 = i.class;
            synchronized(class0) {
                if(i.a == null) {
                    i.a = new i();
                }
            }
        }
        return i.a;
    }

    private static void a(List list0, String s) {
        if(list0 != null && !list0.isEmpty()) {
            try {
                int v = list0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    Printer printer0 = (Printer)list0.get(v1);
                    if(printer0 == null) {
                        break;
                    }
                    printer0.println(s);
                }
            }
            catch(Throwable throwable0) {
                a.a(throwable0);
            }
        }
    }

    final void a(String s) {
        try {
            this.b = -1L;
            i.a(this.c, s);
        }
        catch(Exception exception0) {
            a.a(exception0);
        }
    }

    final void b(String s) {
        this.b = SystemClock.uptimeMillis();
        try {
            i.a(this.d, s);
        }
        catch(Exception exception0) {
            a.b(exception0);
        }
    }

    public final boolean b() {
        return this.b != -1L && SystemClock.uptimeMillis() - this.b > 5000L;
    }

    static Printer c() {
        return null;
    }

    final class com.apm.insight.runtime.i.1 implements Printer {
        @Override  // android.util.Printer
        public final void println(String s) {
            if(s == null) {
                return;
            }
            switch(s.charAt(0)) {
                case 60: {
                    i.a().b(s);
                    return;
                }
                case 62: {
                    i.a().a(s);
                }
            }
        }
    }

}

