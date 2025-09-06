package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.a;
import com.google.gson.stream.c;
import com.google.gson.stream.d;
import com.google.gson.t;
import com.google.gson.y;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class DateTypeAdapter extends TypeAdapter {
    private final List a;
    public static final y b;

    static {
        DateTypeAdapter.b = new y() {
            @Override  // com.google.gson.y
            public TypeAdapter a(Gson gson0, a a0) {
                return a0.f() == Date.class ? new DateTypeAdapter() : null;
            }
        };
    }

    public DateTypeAdapter() {
        ArrayList arrayList0 = new ArrayList();
        this.a = arrayList0;
        Locale locale0 = Locale.US;
        arrayList0.add(DateFormat.getDateTimeInstance(2, 2, locale0));
        if(!Locale.getDefault().equals(locale0)) {
            arrayList0.add(DateFormat.getDateTimeInstance(2, 2));
        }
    }

    @Override  // com.google.gson.TypeAdapter
    public Object e(com.google.gson.stream.a a0) throws IOException {
        return this.k(a0);
    }

    @Override  // com.google.gson.TypeAdapter
    public void i(d d0, Object object0) throws IOException {
        this.l(d0, ((Date)object0));
    }

    private Date j(com.google.gson.stream.a a0) throws IOException {
        String s = a0.d0();
        synchronized(this.a) {
            Iterator iterator0 = this.a.iterator();
        label_5:
            if(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                DateFormat dateFormat0 = (DateFormat)object0;
                try {
                    return dateFormat0.parse(s);
                }
                catch(ParseException unused_ex) {
                    goto label_5;
                }
            }
        }
        try {
            return x2.a.g(s, new ParsePosition(0));
        }
        catch(ParseException parseException0) {
            throw new t("Failed parsing \'" + s + "\' as Date; at path " + a0.o(), parseException0);
        }
    }

    public Date k(com.google.gson.stream.a a0) throws IOException {
        if(a0.f0() == c.i) {
            a0.T();
            return null;
        }
        return this.j(a0);
    }

    public void l(d d0, Date date0) throws IOException {
        String s;
        if(date0 == null) {
            d0.v();
            return;
        }
        DateFormat dateFormat0 = (DateFormat)this.a.get(0);
        synchronized(this.a) {
            s = dateFormat0.format(date0);
        }
        d0.E0(s);
    }
}

