package com.bykv.vk.openvk.preload.a;

import com.bykv.vk.openvk.preload.a.d.b;
import com.bykv.vk.openvk.preload.a.d.c;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

final class a extends r {
    private final Class a;
    private final List b;

    public a(Class class0, int v, int v1) {
        ArrayList arrayList0 = new ArrayList();
        this.b = arrayList0;
        this.a = a.a(class0);
        Locale locale0 = Locale.US;
        arrayList0.add(DateFormat.getDateTimeInstance(v, v1, locale0));
        if(!Locale.getDefault().equals(locale0)) {
            arrayList0.add(DateFormat.getDateTimeInstance(v, v1));
        }
    }

    a(Class class0, String s) {
        ArrayList arrayList0 = new ArrayList();
        this.b = arrayList0;
        this.a = a.a(class0);
        Locale locale0 = Locale.US;
        arrayList0.add(new SimpleDateFormat(s, locale0));
        if(!Locale.getDefault().equals(locale0)) {
            arrayList0.add(new SimpleDateFormat(s));
        }
    }

    private static Class a(Class class0) {
        Class class1 = Date.class;
        if(class0 != class1) {
            Class class2 = java.sql.Date.class;
            if(class0 != class2) {
                Class class3 = Timestamp.class;
                if(class0 != class3) {
                    throw new IllegalArgumentException("Date type must be one of " + class1 + ", " + class3 + ", or " + class2 + " but was " + class0);
                }
            }
        }
        return class0;
    }

    private Date a(String s) {
        synchronized(this.b) {
            Iterator iterator0 = this.b.iterator();
        label_4:
            if(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                DateFormat dateFormat0 = (DateFormat)object0;
                try {
                    return dateFormat0.parse(s);
                }
                catch(ParseException unused_ex) {
                    goto label_4;
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

    @Override  // com.bykv.vk.openvk.preload.a.r
    public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
        if(a0.f() == b.i) {
            a0.j();
            return null;
        }
        Date date0 = this.a(a0.h());
        Class class0 = this.a;
        if(class0 == Date.class) {
            return date0;
        }
        if(class0 == Timestamp.class) {
            return new Timestamp(date0.getTime());
        }
        if(class0 != java.sql.Date.class) {
            throw new AssertionError();
        }
        return new java.sql.Date(date0.getTime());
    }

    @Override  // com.bykv.vk.openvk.preload.a.r
    public final void a(c c0, Object object0) throws IOException {
        if(((Date)object0) == null) {
            c0.h();
            return;
        }
        synchronized(this.b) {
            c0.b(((DateFormat)this.b.get(0)).format(((Date)object0)));
        }
    }

    @Override
    public final String toString() {
        DateFormat dateFormat0 = (DateFormat)this.b.get(0);
        return dateFormat0 instanceof SimpleDateFormat ? "DefaultDateTypeAdapter(" + ((SimpleDateFormat)dateFormat0).toPattern() + ')' : "DefaultDateTypeAdapter(" + dateFormat0.getClass().getSimpleName() + ')';
    }
}

