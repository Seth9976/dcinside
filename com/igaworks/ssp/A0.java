package com.igaworks.ssp;

import j..util.concurrent.ConcurrentHashMap;

public class a0 {
    private String a;
    private int b;
    private ConcurrentHashMap c;
    private int d;
    private int e;

    public a0() {
        this.b = -1;
        this.e = 2;
    }

    public int a() {
        return this.b;
    }

    public String a(String s) {
        synchronized(this) {
            return this.c != null && this.c.containsKey(s) ? ((String)this.c.get(s)) : null;
        }
    }

    public void a(int v) {
        this.b = v;
    }

    public void a(String s, String s1) {
        synchronized(this) {
            if(this.c == null) {
                this.c = new ConcurrentHashMap();
            }
            this.c.put(s, s1);
        }
    }

    public int b() {
        return this.e;
    }

    public void b(int v) {
        this.d = v;
    }

    public void b(String s) {
        this.a = s;
    }

    public void c(int v) {
        this.e = v;
    }
}

