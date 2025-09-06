package com.google.common.io;

import J1.c;
import J1.d;
import O1.a;
import java.io.IOException;

@c
@d
@q
abstract class x {
    private StringBuilder a;
    private boolean b;

    x() {
        this.a = new StringBuilder();
    }

    protected void a(char[] arr_c, int v, int v1) throws IOException {
        int v2 = !this.b || v1 <= 0 || !this.c(arr_c[v] == 10) ? v : v + 1;
        int v3 = v + v1;
        int v4 = v2;
        while(v2 < v3) {
            switch(arr_c[v2]) {
                case 10: {
                    this.a.append(arr_c, v4, v2 - v4);
                    this.c(true);
                    v4 = v2 + 1;
                    break;
                }
                case 13: {
                    this.a.append(arr_c, v4, v2 - v4);
                    this.b = true;
                    if(v2 + 1 < v3 && this.c(arr_c[v2 + 1] == 10)) {
                        ++v2;
                    }
                    v4 = v2 + 1;
                }
            }
            ++v2;
        }
        this.a.append(arr_c, v4, v3 - v4);
    }

    protected void b() throws IOException {
        if(this.b || this.a.length() > 0) {
            this.c(false);
        }
    }

    @a
    private boolean c(boolean z) throws IOException {
        String s;
        if(!this.b) {
            s = z ? "\n" : "";
        }
        else if(z) {
            s = "\r\n";
        }
        else {
            s = "\r";
        }
        this.d(this.a.toString(), s);
        this.a = new StringBuilder();
        this.b = false;
        return z;
    }

    protected abstract void d(String arg1, String arg2) throws IOException;
}

