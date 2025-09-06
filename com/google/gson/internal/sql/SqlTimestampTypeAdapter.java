package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.a;
import com.google.gson.stream.d;
import com.google.gson.y;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

class SqlTimestampTypeAdapter extends TypeAdapter {
    private final TypeAdapter a;
    static final y b;

    static {
        SqlTimestampTypeAdapter.b = new y() {
            @Override  // com.google.gson.y
            public TypeAdapter a(Gson gson0, a a0) {
                return a0.f() == Timestamp.class ? new SqlTimestampTypeAdapter(gson0.u(Date.class), null) : null;
            }
        };
    }

    private SqlTimestampTypeAdapter(TypeAdapter typeAdapter0) {
        this.a = typeAdapter0;
    }

    SqlTimestampTypeAdapter(TypeAdapter typeAdapter0, com.google.gson.internal.sql.SqlTimestampTypeAdapter.1 sqlTimestampTypeAdapter$10) {
        this(typeAdapter0);
    }

    @Override  // com.google.gson.TypeAdapter
    public Object e(com.google.gson.stream.a a0) throws IOException {
        return this.j(a0);
    }

    @Override  // com.google.gson.TypeAdapter
    public void i(d d0, Object object0) throws IOException {
        this.k(d0, ((Timestamp)object0));
    }

    public Timestamp j(com.google.gson.stream.a a0) throws IOException {
        Date date0 = (Date)this.a.e(a0);
        return date0 == null ? null : new Timestamp(date0.getTime());
    }

    public void k(d d0, Timestamp timestamp0) throws IOException {
        this.a.i(d0, timestamp0);
    }
}

