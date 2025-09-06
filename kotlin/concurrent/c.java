package kotlin.concurrent;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.b0;
import kotlin.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.i;

@i(name = "TimersKt")
public final class c {
    @f
    private static final Timer a(String s, boolean z, long v, long v1, Function1 function10) {
        L.p(function10, "action");
        Timer timer0 = c.k(s, z);
        timer0.scheduleAtFixedRate(new a(function10), v, v1);
        return timer0;
    }

    @f
    private static final Timer b(String s, boolean z, Date date0, long v, Function1 function10) {
        L.p(date0, "startAt");
        L.p(function10, "action");
        Timer timer0 = c.k(s, z);
        timer0.scheduleAtFixedRate(new a(function10), date0, v);
        return timer0;
    }

    static Timer c(String s, boolean z, long v, long v1, Function1 function10, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = null;
        }
        if((v2 & 2) != 0) {
            z = false;
        }
        if((v2 & 4) != 0) {
            v = 0L;
        }
        L.p(function10, "action");
        Timer timer0 = c.k(s, z);
        timer0.scheduleAtFixedRate(new a(function10), v, v1);
        return timer0;
    }

    static Timer d(String s, boolean z, Date date0, long v, Function1 function10, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = null;
        }
        if((v1 & 2) != 0) {
            z = false;
        }
        L.p(date0, "startAt");
        L.p(function10, "action");
        Timer timer0 = c.k(s, z);
        timer0.scheduleAtFixedRate(new a(function10), date0, v);
        return timer0;
    }

    @f
    private static final TimerTask e(Timer timer0, long v, long v1, Function1 function10) {
        L.p(timer0, "<this>");
        L.p(function10, "action");
        TimerTask timerTask0 = new a(function10);
        timer0.schedule(timerTask0, v, v1);
        return timerTask0;
    }

    @f
    private static final TimerTask f(Timer timer0, long v, Function1 function10) {
        L.p(timer0, "<this>");
        L.p(function10, "action");
        TimerTask timerTask0 = new a(function10);
        timer0.schedule(timerTask0, v);
        return timerTask0;
    }

    @f
    private static final TimerTask g(Timer timer0, Date date0, long v, Function1 function10) {
        L.p(timer0, "<this>");
        L.p(date0, "time");
        L.p(function10, "action");
        TimerTask timerTask0 = new a(function10);
        timer0.schedule(timerTask0, date0, v);
        return timerTask0;
    }

    @f
    private static final TimerTask h(Timer timer0, Date date0, Function1 function10) {
        L.p(timer0, "<this>");
        L.p(date0, "time");
        L.p(function10, "action");
        TimerTask timerTask0 = new a(function10);
        timer0.schedule(timerTask0, date0);
        return timerTask0;
    }

    @f
    private static final TimerTask i(Timer timer0, long v, long v1, Function1 function10) {
        L.p(timer0, "<this>");
        L.p(function10, "action");
        TimerTask timerTask0 = new a(function10);
        timer0.scheduleAtFixedRate(timerTask0, v, v1);
        return timerTask0;
    }

    @f
    private static final TimerTask j(Timer timer0, Date date0, long v, Function1 function10) {
        L.p(timer0, "<this>");
        L.p(date0, "time");
        L.p(function10, "action");
        TimerTask timerTask0 = new a(function10);
        timer0.scheduleAtFixedRate(timerTask0, date0, v);
        return timerTask0;
    }

    @b0
    @l
    public static final Timer k(@m String s, boolean z) {
        return s == null ? new Timer(z) : new Timer(s, z);
    }

    @f
    private static final Timer l(String s, boolean z, long v, long v1, Function1 function10) {
        L.p(function10, "action");
        Timer timer0 = c.k(s, z);
        timer0.schedule(new a(function10), v, v1);
        return timer0;
    }

    @f
    private static final Timer m(String s, boolean z, Date date0, long v, Function1 function10) {
        L.p(date0, "startAt");
        L.p(function10, "action");
        Timer timer0 = c.k(s, z);
        timer0.schedule(new a(function10), date0, v);
        return timer0;
    }

    static Timer n(String s, boolean z, long v, long v1, Function1 function10, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = null;
        }
        if((v2 & 2) != 0) {
            z = false;
        }
        if((v2 & 4) != 0) {
            v = 0L;
        }
        L.p(function10, "action");
        Timer timer0 = c.k(s, z);
        timer0.schedule(new a(function10), v, v1);
        return timer0;
    }

    static Timer o(String s, boolean z, Date date0, long v, Function1 function10, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = null;
        }
        if((v1 & 2) != 0) {
            z = false;
        }
        L.p(date0, "startAt");
        L.p(function10, "action");
        Timer timer0 = c.k(s, z);
        timer0.schedule(new a(function10), date0, v);
        return timer0;
    }

    @f
    private static final TimerTask p(Function1 function10) {
        public static final class a extends TimerTask {
            final Function1 a;

            public a(Function1 function10) {
                this.a = function10;
                super();
            }

            @Override
            public void run() {
                this.a.invoke(this);
            }
        }

        L.p(function10, "action");
        return new a(function10);
    }
}

