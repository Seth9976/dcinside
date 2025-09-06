package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public final class s extends Writer {
    private final g a;
    private OutputStream b;
    private byte[] c;
    private final int d;
    private int e;
    private int f;
    static final int g = 0xD800;
    static final int h = 0xDBFF;
    static final int i = 0xDC00;
    static final int j = 0xDFFF;

    public s(g g0, OutputStream outputStream0) {
        this.a = g0;
        this.b = outputStream0;
        byte[] arr_b = g0.q();
        this.c = arr_b;
        this.d = arr_b.length - 4;
        this.e = 0;
    }

    protected int a(int v) throws IOException {
        int v1 = this.f;
        this.f = 0;
        if(v < 0xDC00 || v > 0xDFFF) {
            throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(v1) + ", second 0x" + Integer.toHexString(v) + "; illegal combination");
        }
        return v - 0x35FDC00 + 0x400 * v1;
    }

    @Override
    public Writer append(char c) throws IOException {
        this.write(((int)c));
        return this;
    }

    @Override
    public Appendable append(char c) throws IOException {
        return this.append(c);
    }

    protected static void b(int v) throws IOException {
        throw new IOException(s.c(v));
    }

    protected static String c(int v) {
        if(v > 0x10FFFF) {
            return "Illegal character point (0x" + Integer.toHexString(v) + ") to output; max is 0x10FFFF as per RFC 4627";
        }
        if(v >= 0xD800) {
            return v > 0xDBFF ? "Unmatched second part of surrogate pair (0x" + Integer.toHexString(v) + ")" : "Unmatched first part of surrogate pair (0x" + Integer.toHexString(v) + ")";
        }
        return "Illegal character point (0x" + Integer.toHexString(v) + ") to output";
    }

    @Override
    public void close() throws IOException {
        OutputStream outputStream0 = this.b;
        if(outputStream0 != null) {
            int v = this.e;
            if(v > 0) {
                outputStream0.write(this.c, 0, v);
                this.e = 0;
            }
            OutputStream outputStream1 = this.b;
            this.b = null;
            byte[] arr_b = this.c;
            if(arr_b != null) {
                this.c = null;
                this.a.h0(arr_b);
            }
            outputStream1.close();
            int v1 = this.f;
            this.f = 0;
            if(v1 > 0) {
                s.b(v1);
            }
        }
        this.a.close();
    }

    @Override
    public void flush() throws IOException {
        OutputStream outputStream0 = this.b;
        if(outputStream0 != null) {
            int v = this.e;
            if(v > 0) {
                outputStream0.write(this.c, 0, v);
                this.e = 0;
            }
            this.b.flush();
        }
    }

    @Override
    public void write(int v) throws IOException {
        int v4;
        if(this.f > 0) {
            v = this.a(v);
        }
        else if(v >= 0xD800 && v <= 0xDFFF) {
            if(v > 0xDBFF) {
                s.b(v);
            }
            this.f = v;
            return;
        }
        int v1 = this.e;
        if(v1 >= this.d) {
            this.b.write(this.c, 0, v1);
            this.e = 0;
        }
        if(v < 0x80) {
            int v2 = this.e;
            this.e = v2 + 1;
            this.c[v2] = (byte)v;
            return;
        }
        int v3 = this.e;
        if(v < 0x800) {
            byte[] arr_b = this.c;
            arr_b[v3] = (byte)(v >> 6 | 0xC0);
            v4 = v3 + 2;
            arr_b[v3 + 1] = (byte)(v & 0x3F | 0x80);
        }
        else if(v <= 0xFFFF) {
            byte[] arr_b1 = this.c;
            arr_b1[v3] = (byte)(v >> 12 | 0xE0);
            arr_b1[v3 + 1] = (byte)(v >> 6 & 0x3F | 0x80);
            v4 = v3 + 3;
            arr_b1[v3 + 2] = (byte)(v & 0x3F | 0x80);
        }
        else {
            if(v > 0x10FFFF) {
                s.b(v);
            }
            byte[] arr_b2 = this.c;
            arr_b2[v3] = (byte)(v >> 18 | 0xF0);
            arr_b2[v3 + 1] = (byte)(v >> 12 & 0x3F | 0x80);
            arr_b2[v3 + 2] = (byte)(v >> 6 & 0x3F | 0x80);
            v4 = v3 + 4;
            arr_b2[v3 + 3] = (byte)(v & 0x3F | 0x80);
        }
        this.e = v4;
    }

    @Override
    public void write(String s) throws IOException {
        this.write(s, 0, s.length());
    }

    @Override
    public void write(String s, int v, int v1) throws IOException {
        if(v1 < 2) {
            if(v1 == 1) {
                this.write(s.charAt(v));
            }
            return;
        }
        if(this.f > 0) {
            --v1;
            this.write(this.a(s.charAt(v)));
            ++v;
        }
        int v2 = this.e;
        byte[] arr_b = this.c;
        int v3 = this.d;
        int v4 = v1 + v;
    label_12:
        while(v < v4) {
            if(v2 >= v3) {
                this.b.write(arr_b, 0, v2);
                v2 = 0;
            }
            int v5 = v + 1;
            int v6 = s.charAt(v);
            if(v6 < 0x80) {
                int v7 = v2 + 1;
                arr_b[v2] = (byte)v6;
                int v8 = v4 - v5;
                int v9 = v3 - v7;
                if(v8 > v9) {
                    v8 = v9;
                }
                int v10 = v8 + v5;
                while(true) {
                    v = v5;
                    v2 = v7;
                    if(v >= v10) {
                        continue label_12;
                    }
                    v5 = v + 1;
                    v6 = s.charAt(v);
                    if(v6 >= 0x80) {
                        break;
                    }
                    v7 = v2 + 1;
                    arr_b[v2] = (byte)v6;
                }
            }
            if(v6 < 0x800) {
                int v11 = v2 + 1;
                arr_b[v2] = (byte)(v6 >> 6 | 0xC0);
                v2 += 2;
                arr_b[v11] = (byte)(v6 & 0x3F | 0x80);
            }
            else if(v6 < 0xD800 || v6 > 0xDFFF) {
                arr_b[v2] = (byte)(v6 >> 12 | 0xE0);
                int v14 = v2 + 2;
                arr_b[v2 + 1] = (byte)(v6 >> 6 & 0x3F | 0x80);
                v2 += 3;
                arr_b[v14] = (byte)(v6 & 0x3F | 0x80);
            }
            else {
                if(v6 > 0xDBFF) {
                    this.e = v2;
                    s.b(v6);
                }
                this.f = v6;
                if(v5 >= v4) {
                    break;
                }
                v = v5 + 1;
                int v12 = this.a(s.charAt(v5));
                if(v12 > 0x10FFFF) {
                    this.e = v2;
                    s.b(v12);
                }
                arr_b[v2] = (byte)(v12 >> 18 | 0xF0);
                arr_b[v2 + 1] = (byte)(v12 >> 12 & 0x3F | 0x80);
                int v13 = v2 + 3;
                arr_b[v2 + 2] = (byte)(v12 >> 6 & 0x3F | 0x80);
                v2 += 4;
                arr_b[v13] = (byte)(v12 & 0x3F | 0x80);
                continue;
            }
            v = v5;
        }
        this.e = v2;
    }

    @Override
    public void write(char[] arr_c) throws IOException {
        this.write(arr_c, 0, arr_c.length);
    }

    @Override
    public void write(char[] arr_c, int v, int v1) throws IOException {
        if(v1 < 2) {
            if(v1 == 1) {
                this.write(((int)arr_c[v]));
            }
            return;
        }
        if(this.f > 0) {
            --v1;
            this.write(this.a(((int)arr_c[v])));
            ++v;
        }
        int v2 = this.e;
        byte[] arr_b = this.c;
        int v3 = this.d;
        int v4 = v1 + v;
    label_12:
        while(v < v4) {
            if(v2 >= v3) {
                this.b.write(arr_b, 0, v2);
                v2 = 0;
            }
            int v5 = v + 1;
            int v6 = arr_c[v];
            if(v6 < 0x80) {
                int v7 = v2 + 1;
                arr_b[v2] = (byte)v6;
                int v8 = v4 - v5;
                int v9 = v3 - v7;
                if(v8 > v9) {
                    v8 = v9;
                }
                int v10 = v8 + v5;
                while(true) {
                    v = v5;
                    v2 = v7;
                    if(v >= v10) {
                        continue label_12;
                    }
                    v5 = v + 1;
                    v6 = arr_c[v];
                    if(v6 >= 0x80) {
                        break;
                    }
                    v7 = v2 + 1;
                    arr_b[v2] = (byte)v6;
                }
            }
            if(v6 < 0x800) {
                int v11 = v2 + 1;
                arr_b[v2] = (byte)(v6 >> 6 | 0xC0);
                v2 += 2;
                arr_b[v11] = (byte)(v6 & 0x3F | 0x80);
            }
            else if(v6 < 0xD800 || v6 > 0xDFFF) {
                arr_b[v2] = (byte)(v6 >> 12 | 0xE0);
                int v14 = v2 + 2;
                arr_b[v2 + 1] = (byte)(v6 >> 6 & 0x3F | 0x80);
                v2 += 3;
                arr_b[v14] = (byte)(v6 & 0x3F | 0x80);
            }
            else {
                if(v6 > 0xDBFF) {
                    this.e = v2;
                    s.b(v6);
                }
                this.f = v6;
                if(v5 >= v4) {
                    break;
                }
                v = v5 + 1;
                int v12 = this.a(((int)arr_c[v5]));
                if(v12 > 0x10FFFF) {
                    this.e = v2;
                    s.b(v12);
                }
                arr_b[v2] = (byte)(v12 >> 18 | 0xF0);
                arr_b[v2 + 1] = (byte)(v12 >> 12 & 0x3F | 0x80);
                int v13 = v2 + 3;
                arr_b[v2 + 2] = (byte)(v12 >> 6 & 0x3F | 0x80);
                v2 += 4;
                arr_b[v13] = (byte)(v12 & 0x3F | 0x80);
                continue;
            }
            v = v5;
        }
        this.e = v2;
    }
}

