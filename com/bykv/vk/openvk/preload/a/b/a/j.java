package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.c.a;
import com.bykv.vk.openvk.preload.a.d.b;
import com.bykv.vk.openvk.preload.a.d.c;
import com.bykv.vk.openvk.preload.a.d;
import com.bykv.vk.openvk.preload.a.p;
import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.s;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import jeb.synthetic.FIN;

public final class j extends r {
    public static final s a;
    private final DateFormat b;

    static {
        j.a = new s() {
            @Override  // com.bykv.vk.openvk.preload.a.s
            public final r a(d d0, a a0) {
                return a0.a() == Time.class ? new j() : null;
            }
        };
    }

    public j() {
        this.b = new SimpleDateFormat("hh:mm:ss a");
    }

    private void a(c c0, Time time0) throws IOException {
        synchronized(this) {
            c0.b((time0 == null ? null : this.b.format(time0)));
        }
    }

    @Override  // com.bykv.vk.openvk.preload.a.r
    public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
        return this.b(a0);
    }

    @Override  // com.bykv.vk.openvk.preload.a.r
    public final void a(c c0, Object object0) throws IOException {
        this.a(c0, ((Time)object0));
    }

    private Time b(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(a0.f() == b.i) {
            a0.j();
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(this);
            FIN.finallyCodeEnd$NT(v);
            return null;
        }
        try {
            String s = a0.h();
            Time time0 = new Time(this.b.parse(s).getTime());
            FIN.finallyExec$NT(v);
            return time0;
        }
        catch(ParseException parseException0) {
            FIN.finallyExec$NT(v);
            throw new p(parseException0);
        }
    }
}

