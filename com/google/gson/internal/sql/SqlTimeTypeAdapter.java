package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.a;
import com.google.gson.stream.c;
import com.google.gson.stream.d;
import com.google.gson.t;
import com.google.gson.y;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

final class SqlTimeTypeAdapter extends TypeAdapter {
    private final DateFormat a;
    static final y b;

    static {
        SqlTimeTypeAdapter.b = new y() {
            @Override  // com.google.gson.y
            public TypeAdapter a(Gson gson0, a a0) {
                return a0.f() == Time.class ? new SqlTimeTypeAdapter(null) : null;
            }
        };
    }

    private SqlTimeTypeAdapter() {
        this.a = new SimpleDateFormat("hh:mm:ss a");
    }

    SqlTimeTypeAdapter(com.google.gson.internal.sql.SqlTimeTypeAdapter.1 sqlTimeTypeAdapter$10) {
    }

    @Override  // com.google.gson.TypeAdapter
    public Object e(com.google.gson.stream.a a0) throws IOException {
        return this.j(a0);
    }

    @Override  // com.google.gson.TypeAdapter
    public void i(d d0, Object object0) throws IOException {
        this.k(d0, ((Time)object0));
    }

    public Time j(com.google.gson.stream.a a0) throws IOException {
        if(a0.f0() == c.i) {
            a0.T();
            return null;
        }
        String s = a0.d0();
        try {
            return new Time(this.a.parse(s).getTime());
        }
        catch(Throwable throwable0) {
            try {
                throw throwable0;
            }
            catch(ParseException parseException0) {
                throw new t("Failed parsing \'" + s + "\' as SQL Time; at path " + a0.o(), parseException0);
            }
        }
    }

    public void k(d d0, Time time0) throws IOException {
        String s;
        if(time0 == null) {
            d0.v();
            return;
        }
        synchronized(this) {
            s = this.a.format(time0);
        }
        d0.E0(s);
    }
}

