package org.ccil.cowan.tagsoup;

import org.xml.sax.Attributes;

public class a implements Attributes {
    int a;
    String[] b;

    public a() {
        this.a = 0;
        this.b = null;
    }

    public a(Attributes attributes0) {
        this.g(attributes0);
    }

    public void a(String s, String s1, String s2, String s3, String s4) {
        this.d(this.a + 1);
        String[] arr_s = this.b;
        int v = this.a;
        arr_s[v * 5] = s;
        arr_s[v * 5 + 1] = s1;
        arr_s[v * 5 + 2] = s2;
        arr_s[v * 5 + 3] = s3;
        arr_s[v * 5 + 4] = s4;
        this.a = v + 1;
    }

    private void b(int v) throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException("Attempt to modify attribute at illegal index: " + v);
    }

    public void c() {
        if(this.b != null) {
            for(int v = 0; v < this.a * 5; ++v) {
                this.b[v] = null;
            }
        }
        this.a = 0;
    }

    private void d(int v) {
        int v1;
        if(v <= 0) {
            return;
        }
        String[] arr_s = this.b;
        if(arr_s == null || arr_s.length == 0) {
            v1 = 25;
        }
        else {
            if(arr_s.length >= v * 5) {
                return;
            }
            v1 = arr_s.length;
        }
        while(v1 < v * 5) {
            v1 *= 2;
        }
        String[] arr_s1 = new String[v1];
        int v2 = this.a;
        if(v2 > 0) {
            System.arraycopy(this.b, 0, arr_s1, 0, v2 * 5);
        }
        this.b = arr_s1;
    }

    public void e(int v) {
        if(v >= 0) {
            int v1 = this.a;
            if(v < v1) {
                if(v < v1 - 1) {
                    System.arraycopy(this.b, (v + 1) * 5, this.b, v * 5, (v1 - v - 1) * 5);
                }
                int v2 = this.a;
                int v3 = (v2 - 1) * 5;
                String[] arr_s = this.b;
                arr_s[v3] = null;
                arr_s[v3 + 1] = null;
                arr_s[v3 + 2] = null;
                arr_s[v3 + 3] = null;
                arr_s[v3 + 4] = null;
                this.a = v2 - 1;
                return;
            }
        }
        this.b(v);
    }

    public void f(int v, String s, String s1, String s2, String s3, String s4) {
        if(v >= 0 && v < this.a) {
            String[] arr_s = this.b;
            arr_s[v * 5] = s;
            arr_s[v * 5 + 1] = s1;
            arr_s[v * 5 + 2] = s2;
            arr_s[v * 5 + 3] = s3;
            arr_s[v * 5 + 4] = s4;
            return;
        }
        this.b(v);
    }

    public void g(Attributes attributes0) {
        this.c();
        int v = attributes0.getLength();
        this.a = v;
        if(v > 0) {
            this.b = new String[v * 5];
            for(int v1 = 0; v1 < this.a; ++v1) {
                String[] arr_s = this.b;
                arr_s[v1 * 5] = attributes0.getURI(v1);
                String[] arr_s1 = this.b;
                arr_s1[v1 * 5 + 1] = attributes0.getLocalName(v1);
                String[] arr_s2 = this.b;
                arr_s2[v1 * 5 + 2] = attributes0.getQName(v1);
                String[] arr_s3 = this.b;
                arr_s3[v1 * 5 + 3] = attributes0.getType(v1);
                String[] arr_s4 = this.b;
                arr_s4[v1 * 5 + 4] = attributes0.getValue(v1);
            }
        }
    }

    @Override  // org.xml.sax.Attributes
    public int getIndex(String s) {
        int v = this.a * 5;
        for(int v1 = 0; v1 < v; v1 += 5) {
            if(this.b[v1 + 2].equals(s)) {
                return v1 / 5;
            }
        }
        return -1;
    }

    @Override  // org.xml.sax.Attributes
    public int getIndex(String s, String s1) {
        int v = this.a * 5;
        for(int v1 = 0; v1 < v; v1 += 5) {
            if(this.b[v1].equals(s) && this.b[v1 + 1].equals(s1)) {
                return v1 / 5;
            }
        }
        return -1;
    }

    @Override  // org.xml.sax.Attributes
    public int getLength() {
        return this.a;
    }

    @Override  // org.xml.sax.Attributes
    public String getLocalName(int v) {
        return v < 0 || v >= this.a ? null : this.b[v * 5 + 1];
    }

    @Override  // org.xml.sax.Attributes
    public String getQName(int v) {
        return v < 0 || v >= this.a ? null : this.b[v * 5 + 2];
    }

    @Override  // org.xml.sax.Attributes
    public String getType(int v) {
        return v < 0 || v >= this.a ? null : this.b[v * 5 + 3];
    }

    @Override  // org.xml.sax.Attributes
    public String getType(String s) {
        int v = this.a * 5;
        for(int v1 = 0; v1 < v; v1 += 5) {
            if(this.b[v1 + 2].equals(s)) {
                return this.b[v1 + 3];
            }
        }
        return null;
    }

    @Override  // org.xml.sax.Attributes
    public String getType(String s, String s1) {
        int v = this.a * 5;
        for(int v1 = 0; v1 < v; v1 += 5) {
            if(this.b[v1].equals(s) && this.b[v1 + 1].equals(s1)) {
                return this.b[v1 + 3];
            }
        }
        return null;
    }

    @Override  // org.xml.sax.Attributes
    public String getURI(int v) {
        return v < 0 || v >= this.a ? null : this.b[v * 5];
    }

    @Override  // org.xml.sax.Attributes
    public String getValue(int v) {
        return v < 0 || v >= this.a ? null : this.b[v * 5 + 4];
    }

    @Override  // org.xml.sax.Attributes
    public String getValue(String s) {
        int v = this.a * 5;
        for(int v1 = 0; v1 < v; v1 += 5) {
            if(this.b[v1 + 2].equals(s)) {
                return this.b[v1 + 4];
            }
        }
        return null;
    }

    @Override  // org.xml.sax.Attributes
    public String getValue(String s, String s1) {
        int v = this.a * 5;
        for(int v1 = 0; v1 < v; v1 += 5) {
            if(this.b[v1].equals(s) && this.b[v1 + 1].equals(s1)) {
                return this.b[v1 + 4];
            }
        }
        return null;
    }

    public void h(int v, String s) {
        if(v >= 0 && v < this.a) {
            this.b[v * 5 + 1] = s;
            return;
        }
        this.b(v);
    }

    public void i(int v, String s) {
        if(v >= 0 && v < this.a) {
            this.b[v * 5 + 2] = s;
            return;
        }
        this.b(v);
    }

    public void j(int v, String s) {
        if(v >= 0 && v < this.a) {
            this.b[v * 5 + 3] = s;
            return;
        }
        this.b(v);
    }

    public void k(int v, String s) {
        if(v >= 0 && v < this.a) {
            this.b[v * 5] = s;
            return;
        }
        this.b(v);
    }

    public void l(int v, String s) {
        if(v >= 0 && v < this.a) {
            this.b[v * 5 + 4] = s;
            return;
        }
        this.b(v);
    }
}

