package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.c.a;
import com.bykv.vk.openvk.preload.a.d.b;
import com.bykv.vk.openvk.preload.a.d;
import com.bykv.vk.openvk.preload.a.p;
import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.s;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class c extends r {
    public static final s a;
    private final List b;

    static {
        c.a = new s() {
            @Override  // com.bykv.vk.openvk.preload.a.s
            public final r a(d d0, a a0) {
                return a0.a() == Date.class ? new c() : null;
            }
        };
    }

    public c() {
        ArrayList arrayList0 = new ArrayList();
        this.b = arrayList0;
        Locale locale0 = Locale.US;
        arrayList0.add(DateFormat.getDateTimeInstance(2, 2, locale0));
        if(!Locale.getDefault().equals(locale0)) {
            arrayList0.add(DateFormat.getDateTimeInstance(2, 2));
        }
    }

    private Date a(String s) {
        synchronized(this) {
            Iterator iterator0 = this.b.iterator();
        label_3:
            if(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                DateFormat dateFormat0 = (DateFormat)object0;
                try {
                    return dateFormat0.parse(s);
                }
                catch(ParseException unused_ex) {
                    goto label_3;
                }
            }
            try {
                return com.bykv.vk.openvk.preload.a.b.a.a.a.a(s, new ParsePosition(0));
            }
            catch(ParseException parseException0) {
                throw new p(s, parseException0);
            }
        }
    }

    private void a(com.bykv.vk.openvk.preload.a.d.c c0, Date date0) throws IOException {
        synchronized(this) {
            if(date0 == null) {
                c0.h();
                return;
            }
            c0.b(((DateFormat)this.b.get(0)).format(date0));
        }
    }

    @Override  // com.bykv.vk.openvk.preload.a.r
    public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
        if(a0.f() == b.i) {
            a0.j();
            return null;
        }
        return this.a(a0.h());
    }

    @Override  // com.bykv.vk.openvk.preload.a.r
    public final void a(com.bykv.vk.openvk.preload.a.d.c c0, Object object0) throws IOException {
        this.a(c0, ((Date)object0));
    }
}

