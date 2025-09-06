package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.a;
import com.google.gson.stream.c;
import com.google.gson.stream.d;
import com.google.gson.t;
import com.google.gson.y;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

final class SqlDateTypeAdapter extends TypeAdapter {
    private final DateFormat a;
    static final y b;

    static {
        SqlDateTypeAdapter.b = new y() {
            @Override  // com.google.gson.y
            public TypeAdapter a(Gson gson0, a a0) {
                return a0.f() == Date.class ? new SqlDateTypeAdapter(null) : null;
            }
        };
    }

    private SqlDateTypeAdapter() {
        this.a = new SimpleDateFormat("MMM d, yyyy");
    }

    SqlDateTypeAdapter(com.google.gson.internal.sql.SqlDateTypeAdapter.1 sqlDateTypeAdapter$10) {
    }

    @Override  // com.google.gson.TypeAdapter
    public Object e(com.google.gson.stream.a a0) throws IOException {
        return this.j(a0);
    }

    @Override  // com.google.gson.TypeAdapter
    public void i(d d0, Object object0) throws IOException {
        this.k(d0, ((Date)object0));
    }

    public Date j(com.google.gson.stream.a a0) throws IOException {
        java.util.Date date0;
        if(a0.f0() == c.i) {
            a0.T();
            return null;
        }
        String s = a0.d0();
        try {
            synchronized(this) {
                date0 = this.a.parse(s);
            }
            return new Date(date0.getTime());
        }
        catch(ParseException parseException0) {
            throw new t("Failed parsing \'" + s + "\' as SQL Date; at path " + a0.o(), parseException0);
        }
    }

    public void k(d d0, Date date0) throws IOException {
        String s;
        if(date0 == null) {
            d0.v();
            return;
        }
        synchronized(this) {
            s = this.a.format(date0);
        }
        d0.E0(s);
    }
}

