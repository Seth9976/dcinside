package org.bson.json;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

class y implements p {
    private final Reader a;
    private final List b;
    private final int c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private char[] h;
    private int i;
    private int j;

    y(Reader reader0) {
        this(reader0, 16);
    }

    y(Reader reader0, int v) {
        this.b = new ArrayList();
        this.c = v;
        this.a = reader0;
        this.e();
    }

    @Override  // org.bson.json.p
    public int B() {
        if(this.j == 0) {
            this.i = this.d;
        }
        if(!this.b.contains(this.d)) {
            this.b.add(this.d);
        }
        return this.d;
    }

    @Override  // org.bson.json.p
    public void a(int v) {
        int v1 = this.b.indexOf(v);
        if(v1 == -1) {
            return;
        }
        this.b.subList(v1, this.b.size()).clear();
    }

    @Override  // org.bson.json.p
    public void b(int v) {
        this.g = false;
        if(v != -1 && this.e == v) {
            this.f = true;
            --this.d;
        }
    }

    @Override  // org.bson.json.p
    public void c(int v) {
        if(v > this.d) {
            throw new IllegalStateException("mark cannot reset ahead of position, only back");
        }
        int v1 = this.b.indexOf(v);
        if(v1 == -1) {
            throw new IllegalArgumentException("mark invalidated");
        }
        if(v != this.d) {
            this.f = false;
        }
        this.b.subList(v1, this.b.size()).clear();
        this.d = v;
    }

    private void d(char c) {
        if(!this.b.isEmpty()) {
            int v = this.j;
            char[] arr_c = this.h;
            if(v == arr_c.length) {
                char[] arr_c1 = new char[arr_c.length * 2];
                System.arraycopy(arr_c, 0, arr_c1, 0, v);
                this.h = arr_c1;
            }
            int v1 = this.j;
            this.h[v1] = c;
            this.j = v1 + 1;
        }
    }

    private void e() {
        this.i = -1;
        this.j = 0;
        this.h = new char[this.c];
    }

    @Override  // org.bson.json.p
    public int getPosition() {
        return this.d;
    }

    @Override  // org.bson.json.p
    public int read() {
        if(this.g) {
            throw new v("Trying to read past EOF.");
        }
        if(this.f) {
            this.f = false;
            int v = this.e;
            this.e = -1;
            ++this.d;
            return v;
        }
        int v1 = this.d;
        int v2 = this.i;
        if(v1 - v2 < this.j) {
            int v3 = this.h[v1 - v2];
            this.e = v3;
            this.d = v1 + 1;
            return v3;
        }
        if(this.b.isEmpty()) {
            this.e();
        }
        try {
            int v4 = this.a.read();
            if(v4 != -1) {
                this.e = v4;
                this.d(((char)v4));
            }
            ++this.d;
            if(v4 == -1) {
                this.g = true;
            }
            return v4;
        }
        catch(IOException iOException0) {
        }
        throw new v(iOException0);
    }
}

