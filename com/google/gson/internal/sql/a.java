package com.google.gson.internal.sql;

import com.google.gson.internal.bind.DefaultDateTypeAdapter.b;
import com.google.gson.y;
import java.sql.Timestamp;
import java.util.Date;

public final class a {
    class com.google.gson.internal.sql.a.a extends b {
        com.google.gson.internal.sql.a.a(Class class0) {
        }

        @Override  // com.google.gson.internal.bind.DefaultDateTypeAdapter$b
        protected Date f(Date date0) {
            return this.g(date0);
        }

        protected java.sql.Date g(Date date0) {
            return new java.sql.Date(date0.getTime());
        }
    }

    class com.google.gson.internal.sql.a.b extends b {
        com.google.gson.internal.sql.a.b(Class class0) {
        }

        @Override  // com.google.gson.internal.bind.DefaultDateTypeAdapter$b
        protected Date f(Date date0) {
            return this.g(date0);
        }

        protected Timestamp g(Date date0) {
            return new Timestamp(date0.getTime());
        }
    }

    public static final boolean a;
    public static final b b;
    public static final b c;
    public static final y d;
    public static final y e;
    public static final y f;

    static {
        a.a = true;
        a.b = new com.google.gson.internal.sql.a.a(java.sql.Date.class);
        a.c = new com.google.gson.internal.sql.a.b(Timestamp.class);
        a.d = SqlDateTypeAdapter.b;
        a.e = SqlTimeTypeAdapter.b;
        a.f = SqlTimestampTypeAdapter.b;
    }
}

