package com.fasterxml.jackson.core.io;

import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class r extends Reader {
    protected final g a;
    protected InputStream b;
    protected byte[] c;
    protected int d;
    protected int e;
    protected final boolean f;
    protected char g;
    protected int h;
    protected int i;
    protected final boolean j;
    protected char[] k;
    protected static final int l = 0x10FFFF;
    protected static final char m;

    public r(g g0, InputStream inputStream0, byte[] arr_b, int v, int v1, boolean z) {
        boolean z1 = false;
        this.g = '\u0000';
        this.a = g0;
        this.b = inputStream0;
        this.c = arr_b;
        this.d = v;
        this.e = v1;
        this.f = z;
        if(inputStream0 != null) {
            z1 = true;
        }
        this.j = z1;
    }

    private void a() {
        byte[] arr_b = this.c;
        if(arr_b != null) {
            this.c = null;
            g g0 = this.a;
            if(g0 != null) {
                g0.e0(arr_b);
            }
        }
    }

    private boolean b(int v) throws IOException {
        InputStream inputStream0 = this.b;
        if(inputStream0 != null) {
            byte[] arr_b = this.c;
            if(arr_b != null) {
                this.i += this.e - v;
                if(v > 0) {
                    int v1 = this.d;
                    if(v1 > 0) {
                        System.arraycopy(arr_b, v1, arr_b, 0, v);
                        this.d = 0;
                    }
                    this.e = v;
                }
                else {
                    this.d = 0;
                    int v2 = inputStream0.read(arr_b);
                    if(v2 < 1) {
                        this.e = 0;
                        if(v2 < 0) {
                            if(this.j) {
                                this.a();
                            }
                            return false;
                        }
                        this.f();
                    }
                    this.e = v2;
                }
                int v3;
                while((v3 = this.e) < 4) {
                    int v4 = this.b.read(this.c, v3, this.c.length - v3);
                    if(v4 < 1) {
                        if(v4 < 0) {
                            if(this.j) {
                                this.a();
                            }
                            this.i(this.e, 4);
                        }
                        this.f();
                    }
                    this.e += v4;
                }
                return true;
            }
        }
        return false;
    }

    private void c(char[] arr_c, int v, int v1) throws IOException {
        throw new ArrayIndexOutOfBoundsException(String.format("read(buf,%d,%d), cbuf[%d]", v, v1, ((int)arr_c.length)));
    }

    @Override
    public void close() throws IOException {
        InputStream inputStream0 = this.b;
        if(inputStream0 != null) {
            this.b = null;
            this.a();
            inputStream0.close();
        }
    }

    private void e(int v, int v1, String s) throws IOException {
        throw new CharConversionException("Invalid UTF-32 character 0x" + Integer.toHexString(v) + s + " at char #" + (this.h + v1) + ", byte #" + (this.i + this.d - 1) + ")");
    }

    private void f() throws IOException {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }

    private void i(int v, int v1) throws IOException {
        throw new CharConversionException("Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + v + ", needed " + v1 + ", at char #" + this.h + ", byte #" + (this.i + v) + ")");
    }

    @Override
    public int read() throws IOException {
        if(this.k == null) {
            this.k = new char[1];
        }
        return this.read(this.k, 0, 1) < 1 ? -1 : this.k[0];
    }

    @Override
    public int read(char[] arr_c, int v, int v1) throws IOException {
        int v8;
        int v7;
        int v3;
        if(this.c == null) {
            return -1;
        }
        if(v1 < 1) {
            return v1;
        }
        if(v < 0 || v + v1 > arr_c.length) {
            this.c(arr_c, v, v1);
        }
        int v2 = v1 + v;
        char c = this.g;
        if(c == 0) {
            int v4 = this.e - this.d;
            if(v4 < 4 && !this.b(v4)) {
                if(v4 == 0) {
                    return -1;
                }
                this.i(this.e - this.d, 4);
            }
            v3 = v;
        }
        else {
            v3 = v + 1;
            arr_c[v] = c;
            this.g = '\u0000';
        }
        int v5 = this.e - 4;
        while(v3 < v2) {
            int v6 = this.d;
            if(v6 > v5) {
                break;
            }
            if(this.f) {
                byte[] arr_b = this.c;
                v7 = arr_b[v6] << 8 | arr_b[v6 + 1] & 0xFF;
                v8 = arr_b[v6 + 3] & 0xFF | (arr_b[v6 + 2] & 0xFF) << 8;
            }
            else {
                byte[] arr_b1 = this.c;
                int v9 = arr_b1[v6] & 0xFF | (arr_b1[v6 + 1] & 0xFF) << 8;
                v7 = arr_b1[v6 + 3] << 8 | arr_b1[v6 + 2] & 0xFF;
                v8 = v9;
            }
            this.d = v6 + 4;
            if(v7 != 0) {
                int v10 = v8 | (0xFFFF & v7) - 1 << 16;
                if((0xFFFF & v7) > 16) {
                    this.e(v10, v3 - v, " (above 0x0010ffff)");
                }
                arr_c[v3] = (char)((v10 >> 10) + 0xD800);
                if(v3 + 1 >= v2) {
                    this.g = (char)v10;
                    ++v3;
                    break;
                }
                v8 = v10 & 0x3FF | 0xDC00;
                ++v3;
            }
            arr_c[v3] = (char)v8;
            ++v3;
        }
        int v11 = v3 - v;
        this.h += v11;
        return v11;
    }
}

