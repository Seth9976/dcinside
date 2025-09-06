package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.c;
import com.google.gson.stream.d;
import com.google.gson.t;
import com.google.gson.y;
import j..util.Objects;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class DefaultDateTypeAdapter extends TypeAdapter {
    static class a {
    }

    public static abstract class b {
        class com.google.gson.internal.bind.DefaultDateTypeAdapter.b.a extends b {
            com.google.gson.internal.bind.DefaultDateTypeAdapter.b.a(Class class0) {
            }

            @Override  // com.google.gson.internal.bind.DefaultDateTypeAdapter$b
            protected Date f(Date date0) {
                return date0;
            }
        }

        private final Class a;
        public static final b b;

        static {
            b.b = new com.google.gson.internal.bind.DefaultDateTypeAdapter.b.a(Date.class);
        }

        protected b(Class class0) {
            this.a = class0;
        }

        public final y a(int v) {
            return this.e(new DefaultDateTypeAdapter(this, v, null));
        }

        public final y b(int v, int v1) {
            return this.e(new DefaultDateTypeAdapter(this, v, v1, null));
        }

        public final y c(String s) {
            return this.e(new DefaultDateTypeAdapter(this, s, null));
        }

        public final y d() {
            return this.e(new DefaultDateTypeAdapter(this, 2, 2, null));
        }

        private y e(DefaultDateTypeAdapter defaultDateTypeAdapter0) {
            return TypeAdapters.b(this.a, defaultDateTypeAdapter0);
        }

        protected abstract Date f(Date arg1);
    }

    private final b a;
    private final List b;
    private static final String c = "DefaultDateTypeAdapter";

    private DefaultDateTypeAdapter(b defaultDateTypeAdapter$b0, int v) {
        ArrayList arrayList0 = new ArrayList();
        this.b = arrayList0;
        Objects.requireNonNull(defaultDateTypeAdapter$b0);
        this.a = defaultDateTypeAdapter$b0;
        Locale locale0 = Locale.US;
        arrayList0.add(DateFormat.getDateInstance(v, locale0));
        if(!Locale.getDefault().equals(locale0)) {
            arrayList0.add(DateFormat.getDateInstance(v));
        }
    }

    private DefaultDateTypeAdapter(b defaultDateTypeAdapter$b0, int v, int v1) {
        ArrayList arrayList0 = new ArrayList();
        this.b = arrayList0;
        Objects.requireNonNull(defaultDateTypeAdapter$b0);
        this.a = defaultDateTypeAdapter$b0;
        Locale locale0 = Locale.US;
        arrayList0.add(DateFormat.getDateTimeInstance(v, v1, locale0));
        if(!Locale.getDefault().equals(locale0)) {
            arrayList0.add(DateFormat.getDateTimeInstance(v, v1));
        }
    }

    DefaultDateTypeAdapter(b defaultDateTypeAdapter$b0, int v, int v1, a defaultDateTypeAdapter$a0) {
        this(defaultDateTypeAdapter$b0, v, v1);
    }

    DefaultDateTypeAdapter(b defaultDateTypeAdapter$b0, int v, a defaultDateTypeAdapter$a0) {
        this(defaultDateTypeAdapter$b0, v);
    }

    private DefaultDateTypeAdapter(b defaultDateTypeAdapter$b0, String s) {
        ArrayList arrayList0 = new ArrayList();
        this.b = arrayList0;
        Objects.requireNonNull(defaultDateTypeAdapter$b0);
        this.a = defaultDateTypeAdapter$b0;
        Locale locale0 = Locale.US;
        arrayList0.add(new SimpleDateFormat(s, locale0));
        if(!Locale.getDefault().equals(locale0)) {
            arrayList0.add(new SimpleDateFormat(s));
        }
    }

    DefaultDateTypeAdapter(b defaultDateTypeAdapter$b0, String s, a defaultDateTypeAdapter$a0) {
        this(defaultDateTypeAdapter$b0, s);
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
        synchronized(this.b) {
            Iterator iterator0 = this.b.iterator();
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
        Date date0 = this.j(a0);
        return this.a.f(date0);
    }

    public void l(d d0, Date date0) throws IOException {
        String s;
        if(date0 == null) {
            d0.v();
            return;
        }
        DateFormat dateFormat0 = (DateFormat)this.b.get(0);
        synchronized(this.b) {
            s = dateFormat0.format(date0);
        }
        d0.E0(s);
    }

    @Override
    public String toString() {
        DateFormat dateFormat0 = (DateFormat)this.b.get(0);
        return dateFormat0 instanceof SimpleDateFormat ? "DefaultDateTypeAdapter(" + ((SimpleDateFormat)dateFormat0).toPattern() + ')' : "DefaultDateTypeAdapter(" + dateFormat0.getClass().getSimpleName() + ')';
    }
}

