package org.bson.json;

class z implements p {
    private final String a;
    private int b;
    private boolean c;

    z(String s) {
        this.a = s;
    }

    @Override  // org.bson.json.p
    public int B() {
        return this.b;
    }

    @Override  // org.bson.json.p
    public void a(int v) {
    }

    @Override  // org.bson.json.p
    public void b(int v) {
        this.c = false;
        if(v != -1 && this.a.charAt(this.b - 1) == v) {
            --this.b;
        }
    }

    @Override  // org.bson.json.p
    public void c(int v) {
        if(v > this.b) {
            throw new IllegalStateException("mark cannot reset ahead of position, only back");
        }
        this.b = v;
    }

    @Override  // org.bson.json.p
    public int getPosition() {
        return this.b;
    }

    @Override  // org.bson.json.p
    public int read() {
        if(this.c) {
            throw new v("Trying to read past EOF.");
        }
        if(this.b >= this.a.length()) {
            this.c = true;
            return -1;
        }
        int v = this.b;
        this.b = v + 1;
        return this.a.charAt(v);
    }
}

