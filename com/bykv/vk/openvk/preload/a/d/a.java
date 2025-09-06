package com.bykv.vk.openvk.preload.a.d;

import com.bykv.vk.openvk.preload.a.b.e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class a implements Closeable {
    int a;
    private final Reader b;
    private boolean c;
    private final char[] d;
    private int e;
    private int f;
    private int g;
    private int h;
    private long i;
    private int j;
    private String k;
    private int[] l;
    private int m;
    private String[] n;
    private int[] o;

    static {
        e.a = new e() {
            @Override  // com.bykv.vk.openvk.preload.a.b.e
            public final void a(a a0) throws IOException {
                if(!(a0 instanceof com.bykv.vk.openvk.preload.a.b.a.e)) {
                    switch((a0.a == 0 ? a0.q() : a0.a)) {
                        case 12: {
                            a0.a = 8;
                            return;
                        }
                        case 13: {
                            a0.a = 9;
                            return;
                        }
                        case 14: {
                            a0.a = 10;
                            return;
                        }
                        default: {
                            throw new IllegalStateException("Expected a name but was " + a0.f() + a0.r());
                        }
                    }
                }
                throw null;
            }
        };
    }

    public a(Reader reader0) {
        this.c = false;
        this.d = new char[0x400];
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.a = 0;
        int[] arr_v = new int[0x20];
        this.l = arr_v;
        this.m = 1;
        arr_v[0] = 6;
        this.n = new String[0x20];
        this.o = new int[0x20];
        if(reader0 == null) {
            throw new NullPointerException("in == null");
        }
        this.b = reader0;
    }

    private void a(int v) {
        int v1 = this.m;
        int[] arr_v = this.l;
        if(v1 == arr_v.length) {
            this.l = Arrays.copyOf(arr_v, v1 << 1);
            this.o = Arrays.copyOf(this.o, v1 << 1);
            this.n = (String[])Arrays.copyOf(this.n, v1 << 1);
        }
        int v2 = this.m;
        this.m = v2 + 1;
        this.l[v2] = v;
    }

    private boolean a(char c) throws IOException {
        switch(c) {
            case 35: 
            case 0x2F: 
            case 59: 
            case 61: 
            case 92: {
                this.v();
                break;
            }
            case 9: 
            case 10: 
            case 12: 
            case 13: 
            case 0x20: 
            case 44: 
            case 58: 
            case 91: 
            case 93: 
            case 0x7B: 
            case 0x7D: {
                break;
            }
            default: {
                return true;
            }
        }
        return false;
    }

    private boolean a(String s) throws IOException {
        int v = s.length();
    alab1:
        while(true) {
            if(this.e + v > this.f && !this.b(v)) {
                return false;
            }
            int v2 = this.e;
            if(this.d[v2] == 10) {
                ++this.g;
                this.h = v2 + 1;
            }
            else {
                for(int v1 = 0; true; ++v1) {
                    if(v1 >= v) {
                        break alab1;
                    }
                    if(this.d[this.e + v1] != s.charAt(v1)) {
                        break;
                    }
                }
            }
            ++this.e;
        }
        return true;
    }

    public void a() throws IOException {
        if((this.a == 0 ? this.q() : this.a) != 3) {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + this.f() + this.r());
        }
        this.a(1);
        this.o[this.m - 1] = 0;
        this.a = 0;
    }

    public final void a(boolean z) {
        this.c = z;
    }

    private int b(boolean z) throws IOException {
        char[] arr_c = this.d;
        int v = this.e;
        int v1 = this.f;
        while(true) {
            if(v == v1) {
                this.e = v;
                if(this.b(1)) {
                    v = this.e;
                    v1 = this.f;
                    goto label_12;
                }
                if(z) {
                    throw new EOFException("End of input" + this.r());
                }
                return -1;
            }
        label_12:
            int v2 = arr_c[v];
            switch(v2) {
                case 10: {
                    ++this.g;
                    this.h = v + 1;
                    break;
                }
                case 9: 
                case 13: 
                case 0x20: {
                    break;
                }
                case 35: {
                    this.e = v + 1;
                    this.v();
                    this.w();
                    v = this.e;
                    v1 = this.f;
                    continue;
                }
                case 0x2F: {
                    this.e = v + 1;
                    if(v + 1 == v1) {
                        this.e = v;
                        boolean z1 = this.b(2);
                        ++this.e;
                        if(!z1) {
                            return 0x2F;
                        }
                    }
                    this.v();
                    int v3 = this.e;
                    switch(arr_c[v3]) {
                        case 42: {
                            this.e = v3 + 1;
                            if(!this.a("*/")) {
                                throw this.b("Unterminated comment");
                            }
                            v = this.e + 2;
                            v1 = this.f;
                            continue;
                        }
                        case 0x2F: {
                            this.e = v3 + 1;
                            this.w();
                            v = this.e;
                            v1 = this.f;
                            continue;
                        }
                        default: {
                            return 0x2F;
                        }
                    }
                }
                default: {
                    this.e = v + 1;
                    return v2;
                }
            }
            ++v;
        }
    }

    private IOException b(String s) throws IOException {
        throw new d(s + this.r());
    }

    private String b(char c) throws IOException {
        char[] arr_c = this.d;
        StringBuilder stringBuilder0 = null;
    alab1:
        while(true) {
            int v = this.e;
            int v1 = this.f;
            int v2 = v;
            while(v2 < v1) {
                int v3 = arr_c[v2];
                if(v3 == c) {
                    this.e = v2 + 1;
                    int v4 = v2 + 1 - v - 1;
                    if(stringBuilder0 == null) {
                        return new String(arr_c, v, v4);
                    }
                    stringBuilder0.append(arr_c, v, v4);
                    return stringBuilder0.toString();
                }
                switch(v3) {
                    case 10: {
                        ++this.g;
                        this.h = v2 + 1;
                        ++v2;
                        continue;
                    }
                    case 92: {
                        break;
                    }
                    default: {
                        ++v2;
                        continue;
                    }
                }
                this.e = v2 + 1;
                int v5 = v2 + 1 - v;
                if(stringBuilder0 == null) {
                    stringBuilder0 = new StringBuilder(Math.max(v5 << 1, 16));
                }
                stringBuilder0.append(arr_c, v, v5 - 1);
                stringBuilder0.append(this.x());
                continue alab1;
            }
            if(stringBuilder0 == null) {
                stringBuilder0 = new StringBuilder(Math.max(v2 - v << 1, 16));
            }
            stringBuilder0.append(arr_c, v, v2 - v);
            this.e = v2;
            if(!this.b(1)) {
                break;
            }
        }
        throw this.b("Unterminated string");
    }

    private boolean b(int v) throws IOException {
        char[] arr_c = this.d;
        int v1 = this.e;
        this.h -= v1;
        int v2 = this.f;
        if(v2 == v1) {
            this.f = 0;
        }
        else {
            int v3 = v2 - v1;
            this.f = v3;
            System.arraycopy(arr_c, v1, arr_c, 0, v3);
        }
        this.e = 0;
        int v4;
        while((v4 = this.b.read(arr_c, this.f, arr_c.length - this.f)) != -1) {
            int v5 = this.f + v4;
            this.f = v5;
            if(this.g == 0 && this.h == 0 && v5 > 0 && arr_c[0] == 0xFEFF) {
                ++this.e;
                this.h = 1;
                ++v;
            }
            if(v5 >= v) {
                return true;
            }
        }
        return false;
    }

    public void b() throws IOException {
        if((this.a == 0 ? this.q() : this.a) != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + this.f() + this.r());
        }
        int v = this.m;
        this.m = v - 1;
        ++this.o[v - 2];
        this.a = 0;
    }

    private void c(char c) throws IOException {
        char[] arr_c = this.d;
    alab1:
        while(true) {
            int v = this.e;
            int v1 = this.f;
            while(v < v1) {
                int v2 = arr_c[v];
                if(v2 == c) {
                    this.e = v + 1;
                    return;
                }
                switch(v2) {
                    case 10: {
                        ++this.g;
                        this.h = v + 1;
                        ++v;
                        continue;
                    }
                    case 92: {
                        break;
                    }
                    default: {
                        ++v;
                        continue;
                    }
                }
                this.e = v + 1;
                this.x();
                continue alab1;
            }
            this.e = v;
            if(!this.b(1)) {
                break;
            }
        }
        throw this.b("Unterminated string");
    }

    public void c() throws IOException {
        if((this.a == 0 ? this.q() : this.a) != 1) {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + this.f() + this.r());
        }
        this.a(3);
        this.a = 0;
    }

    @Override
    public void close() throws IOException {
        this.a = 0;
        this.l[0] = 8;
        this.m = 1;
        this.b.close();
    }

    public void d() throws IOException {
        if((this.a == 0 ? this.q() : this.a) != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + this.f() + this.r());
        }
        int v = this.m;
        this.m = v - 1;
        this.n[v - 1] = null;
        ++this.o[v - 2];
        this.a = 0;
    }

    public boolean e() throws IOException {
        int v = this.a == 0 ? this.q() : this.a;
        return v != 2 && v != 4;
    }

    public b f() throws IOException {
        switch((this.a == 0 ? this.q() : this.a)) {
            case 1: {
                return b.c;
            }
            case 2: {
                return b.d;
            }
            case 3: {
                return b.a;
            }
            case 4: {
                return b.b;
            }
            case 5: 
            case 6: {
                return b.h;
            }
            case 7: {
                return b.i;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                return b.f;
            }
            case 12: 
            case 13: 
            case 14: {
                return b.e;
            }
            case 15: 
            case 16: {
                return b.g;
            }
            case 17: {
                return b.j;
            }
            default: {
                throw new AssertionError();
            }
        }
    }

    public String g() throws IOException {
        String s;
        switch((this.a == 0 ? this.q() : this.a)) {
            case 12: {
                s = this.b('\'');
                break;
            }
            case 13: {
                s = this.b('\"');
                break;
            }
            case 14: {
                s = this.u();
                break;
            }
            default: {
                throw new IllegalStateException("Expected a name but was " + this.f() + this.r());
            }
        }
        this.a = 0;
        this.n[this.m - 1] = s;
        return s;
    }

    public String h() throws IOException {
        String s;
    alab1:
        switch(this.a) {
            case 0: {
                switch(this.q()) {
                    case 8: {
                        s = this.b('\'');
                        break alab1;
                    }
                    case 9: {
                        s = this.b('\"');
                        break alab1;
                    }
                    case 10: {
                        s = this.u();
                        break alab1;
                    }
                    case 11: {
                        s = this.k;
                        this.k = null;
                        break alab1;
                    }
                    case 15: {
                        s = Long.toString(this.i);
                        break alab1;
                    }
                    case 16: {
                        s = new String(this.d, this.e, this.j);
                        this.e += this.j;
                        break alab1;
                    }
                    default: {
                        throw new IllegalStateException("Expected a string but was " + this.f() + this.r());
                    }
                }
            }
            case 8: {
                s = this.b('\'');
                break;
            }
            case 9: {
                s = this.b('\"');
                break;
            }
            case 10: {
                s = this.u();
                break;
            }
            case 11: {
                s = this.k;
                this.k = null;
                break;
            }
            case 15: {
                s = Long.toString(this.i);
                break;
            }
            case 16: {
                s = new String(this.d, this.e, this.j);
                this.e += this.j;
                break;
            }
            default: {
                throw new IllegalStateException("Expected a string but was " + this.f() + this.r());
            }
        }
        this.a = 0;
        int v = this.m - 1;
        ++this.o[v];
        return s;
    }

    public boolean i() throws IOException {
        switch((this.a == 0 ? this.q() : this.a)) {
            case 5: {
                this.a = 0;
                int v = this.m - 1;
                ++this.o[v];
                return true;
            }
            case 6: {
                this.a = 0;
                int v1 = this.m - 1;
                ++this.o[v1];
                return false;
            }
            default: {
                throw new IllegalStateException("Expected a boolean but was " + this.f() + this.r());
            }
        }
    }

    public void j() throws IOException {
        if((this.a == 0 ? this.q() : this.a) != 7) {
            throw new IllegalStateException("Expected null but was " + this.f() + this.r());
        }
        this.a = 0;
        int v = this.m - 1;
        ++this.o[v];
    }

    public double k() throws IOException {
        int v = this.a == 0 ? this.q() : this.a;
        switch(v) {
            case 8: 
            case 9: {
                this.k = this.b(((char)(v == 8 ? 39 : 34)));
                break;
            }
            case 10: {
                this.k = this.u();
                break;
            }
            case 11: {
                break;
            }
            case 15: {
                this.a = 0;
                int v1 = this.m - 1;
                ++this.o[v1];
                return (double)this.i;
            }
            case 16: {
                this.k = new String(this.d, this.e, this.j);
                this.e += this.j;
                break;
            }
            default: {
                throw new IllegalStateException("Expected a double but was " + this.f() + this.r());
            }
        }
        this.a = 11;
        double f = Double.parseDouble(this.k);
        if(!this.c && (Double.isNaN(f) || Double.isInfinite(f))) {
            throw new d("JSON forbids NaN and infinities: " + f + this.r());
        }
        this.k = null;
        this.a = 0;
        int v2 = this.m - 1;
        ++this.o[v2];
        return f;
    }

    public long l() throws IOException {
        int v = this.a == 0 ? this.q() : this.a;
        switch(v) {
            case 8: {
            label_9:
                this.k = v == 10 ? this.u() : this.b(((char)(v == 8 ? 39 : 34)));
                try {
                    long v2 = Long.parseLong(this.k);
                    this.a = 0;
                    int v3 = this.m - 1;
                    ++this.o[v3];
                    return v2;
                }
                catch(NumberFormatException unused_ex) {
                    goto label_20;
                }
            }
            case 15: {
                this.a = 0;
                int v1 = this.m - 1;
                ++this.o[v1];
                return this.i;
            label_7:
                if(v != 9 && v != 10) {
                    throw new IllegalStateException("Expected a long but was " + this.f() + this.r());
                }
                goto label_9;
            }
            case 16: {
                break;
            }
            default: {
                goto label_7;
            }
        }
        this.k = new String(this.d, this.e, this.j);
        this.e += this.j;
    label_20:
        this.a = 11;
        double f = Double.parseDouble(this.k);
        if(((double)(((long)f))) != f) {
            throw new NumberFormatException("Expected a long but was " + this.k + this.r());
        }
        this.k = null;
        this.a = 0;
        int v4 = this.m - 1;
        ++this.o[v4];
        return (long)f;
    }

    public int m() throws IOException {
        int v = this.a == 0 ? this.q() : this.a;
        switch(v) {
            case 8: {
            label_12:
                this.k = v == 10 ? this.u() : this.b(((char)(v == 8 ? 39 : 34)));
                try {
                    int v3 = Integer.parseInt(this.k);
                    this.a = 0;
                    int v4 = this.m - 1;
                    ++this.o[v4];
                    return v3;
                }
                catch(NumberFormatException unused_ex) {
                    goto label_23;
                }
            }
            case 15: {
                int v1 = (int)this.i;
                if(this.i != ((long)v1)) {
                    throw new NumberFormatException("Expected an int but was " + this.i + this.r());
                }
                this.a = 0;
                int v2 = this.m - 1;
                ++this.o[v2];
                return v1;
            label_10:
                if(v != 9 && v != 10) {
                    throw new IllegalStateException("Expected an int but was " + this.f() + this.r());
                }
                goto label_12;
            }
            case 16: {
                break;
            }
            default: {
                goto label_10;
            }
        }
        this.k = new String(this.d, this.e, this.j);
        this.e += this.j;
    label_23:
        this.a = 11;
        double f = Double.parseDouble(this.k);
        if(((double)(((int)f))) != f) {
            throw new NumberFormatException("Expected an int but was " + this.k + this.r());
        }
        this.k = null;
        this.a = 0;
        int v5 = this.m - 1;
        ++this.o[v5];
        return (int)f;
    }

    public void n() throws IOException {
        int v3;
        int v2;
        int v = 0;
        do {
            int v1 = this.a;
        alab1:
            switch(v1) {
                case 0: {
                    v1 = this.q();
                    switch(v1) {
                        case 1: {
                            this.a(3);
                            ++v;
                            break alab1;
                        }
                        case 2: {
                            --this.m;
                            --v;
                            break alab1;
                        }
                        case 3: {
                            this.a(1);
                            ++v;
                            break alab1;
                        }
                        case 4: {
                            --this.m;
                            --v;
                            break alab1;
                        }
                        case 10: 
                        case 14: {
                            break;
                        }
                        default: {
                        label_6:
                            if(v1 == 8 || v1 == 12) {
                                this.c('\'');
                            }
                            else if(v1 == 9 || v1 == 13) {
                                this.c('\"');
                            }
                            else if(v1 == 16) {
                                this.e += this.j;
                            }
                            break alab1;
                        }
                    }
                    v2 = 0;
                    goto label_40;
                }
                case 1: {
                    this.a(3);
                    ++v;
                    break;
                }
                case 2: {
                    --this.m;
                    --v;
                    break;
                }
                case 3: {
                    this.a(1);
                    ++v;
                    break;
                }
                case 4: {
                    --this.m;
                    --v;
                    break;
                }
                case 10: 
                case 14: {
                    while(true) {
                        v2 = 0;
                    alab2:
                        while(true) {
                        label_40:
                            v3 = this.e;
                            if(v3 + v2 >= this.f) {
                                goto label_50;
                            }
                            int v4 = this.d[v3 + v2];
                            if(v4 == 9 || v4 == 10 || v4 == 12 || v4 == 13) {
                                this.e += v2;
                                break alab1;
                            }
                            switch(v4) {
                                case 35: 
                                case 0x2F: 
                                case 59: 
                                case 61: 
                                case 92: {
                                    break alab2;
                                }
                                case 0x20: 
                                case 44: 
                                case 58: 
                                case 91: 
                                case 93: 
                                case 0x7B: 
                                case 0x7D: {
                                    this.e += v2;
                                    break alab1;
                                }
                                default: {
                                    ++v2;
                                }
                            }
                        }
                        this.v();
                        this.e += v2;
                        break alab1;
                    label_50:
                        this.e = v3 + v2;
                        if(this.b(1)) {
                            continue;
                        }
                        break alab1;
                    }
                }
                default: {
                    goto label_6;
                }
            }
            this.a = 0;
        }
        while(v != 0);
        int v5 = this.m;
        ++this.o[v5 - 1];
        this.n[v5 - 1] = "null";
    }

    public String o() {
        StringBuilder stringBuilder0 = new StringBuilder("$");
        int v = this.m;
        for(int v1 = 0; v1 < v; ++v1) {
            switch(this.l[v1]) {
                case 1: 
                case 2: {
                    stringBuilder0.append('[');
                    stringBuilder0.append(this.o[v1]);
                    stringBuilder0.append(']');
                    break;
                }
                case 3: 
                case 4: 
                case 5: {
                    stringBuilder0.append('.');
                    String s = this.n[v1];
                    if(s != null) {
                        stringBuilder0.append(s);
                    }
                }
            }
        }
        return stringBuilder0.toString();
    }

    public final boolean p() {
        return this.c;
    }

    final int q() throws IOException {
        int[] arr_v = this.l;
        int v = this.m;
        int v1 = arr_v[v - 1];
        if(v1 == 1) {
            arr_v[v - 1] = 2;
            goto label_37;
        }
        if(v1 == 2) {
            switch(this.b(true)) {
                case 44: {
                    goto label_37;
                }
                case 59: {
                    this.v();
                    goto label_37;
                }
                case 93: {
                    this.a = 4;
                    return 4;
                }
                default: {
                    throw this.b("Unterminated array");
                }
            }
        }
        if(v1 != 3 && v1 != 5) {
            switch(v1) {
                case 4: {
                    arr_v[v - 1] = 5;
                    int v2 = this.b(true);
                    if(v2 != 58) {
                        if(v2 != 61) {
                            throw this.b("Expected \':\'");
                        }
                        this.v();
                        if(this.e < this.f || this.b(1)) {
                            int v3 = this.e;
                            if(this.d[v3] == 62) {
                                this.e = v3 + 1;
                                break;
                            }
                        }
                    }
                    break;
                }
                case 6: {
                    if(this.c) {
                        this.y();
                    }
                    this.l[this.m - 1] = 7;
                    break;
                }
                case 7: {
                    if(this.b(false) == -1) {
                        this.a = 17;
                        return 17;
                    }
                    this.v();
                    --this.e;
                    break;
                }
                case 8: {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        label_37:
            int v4 = this.b(true);
            switch(v4) {
                case 34: {
                    this.a = 9;
                    return 9;
                }
                case 39: {
                    this.v();
                    this.a = 8;
                    return 8;
                }
                case 44: 
                case 59: {
                    break;
                }
                case 91: {
                    this.a = 3;
                    return 3;
                }
                case 93: {
                    if(v1 == 1) {
                        this.a = 4;
                        return 4;
                    }
                    break;
                }
                default: {
                    if(v4 != 0x7B) {
                        --this.e;
                        int v5 = this.s();
                        if(v5 != 0) {
                            return v5;
                        }
                        int v6 = this.t();
                        if(v6 != 0) {
                            return v6;
                        }
                        if(!this.a(this.d[this.e])) {
                            throw this.b("Expected value");
                        }
                        this.v();
                        this.a = 10;
                        return 10;
                    }
                    this.a = 1;
                    return 1;
                }
            }
            if(v1 != 1 && v1 != 2) {
                throw this.b("Unexpected value");
            }
            this.v();
            --this.e;
            this.a = 7;
            return 7;
        }
        arr_v[v - 1] = 4;
        if(v1 == 5) {
            switch(this.b(true)) {
                case 44: {
                    break;
                }
                case 59: {
                    this.v();
                    break;
                }
                case 0x7D: {
                    this.a = 2;
                    return 2;
                }
                default: {
                    throw this.b("Unterminated object");
                }
            }
        }
        int v7 = this.b(true);
        switch(v7) {
            case 34: {
                this.a = 13;
                return 13;
            }
            case 39: {
                this.v();
                this.a = 12;
                return 12;
            }
            default: {
                if(v7 != 0x7D) {
                    this.v();
                    --this.e;
                    if(!this.a(((char)v7))) {
                        throw this.b("Expected name");
                    }
                    this.a = 14;
                    return 14;
                }
                if(v1 == 5) {
                    throw this.b("Expected name");
                }
                this.a = 2;
                return 2;
            }
        }
    }

    final String r() {
        return " at line " + (this.g + 1) + " column " + (this.e - this.h + 1) + " path " + this.o();
    }

    private int s() throws IOException {
        int v;
        String s1;
        String s;
        switch(this.d[this.e]) {
            case 70: 
            case 102: {
                s = "false";
                s1 = "FALSE";
                v = 6;
                break;
            }
            case 78: 
            case 110: {
                s = "null";
                s1 = "NULL";
                v = 7;
                break;
            }
            case 84: 
            case 0x74: {
                s = "true";
                s1 = "TRUE";
                v = 5;
                break;
            }
            default: {
                return 0;
            }
        }
        int v1 = s.length();
        for(int v2 = 1; v2 < v1; ++v2) {
            if(this.e + v2 >= this.f && !this.b(v2 + 1)) {
                return 0;
            }
            int v3 = this.d[this.e + v2];
            if(v3 != s.charAt(v2) && v3 != s1.charAt(v2)) {
                return 0;
            }
        }
        if((this.e + v1 < this.f || this.b(v1 + 1)) && this.a(this.d[this.e + v1])) {
            return 0;
        }
        this.e += v1;
        this.a = v;
        return v;
    }

    private int t() throws IOException {
        char[] arr_c = this.d;
        int v = this.e;
        int v1 = this.f;
        int v2 = 0;
        int v3 = 0;
        int v4 = 1;
        long v5 = 0L;
        boolean z = false;
        while(true) {
            if(v + v2 == v1) {
                if(v2 == arr_c.length) {
                    return 0;
                }
                if(!this.b(v2 + 1)) {
                    goto label_37;
                }
                v = this.e;
                v1 = this.f;
            }
            int v6 = arr_c[v + v2];
        alab1:
            switch(v6) {
                case 43: {
                    if(v3 != 5) {
                        return 0;
                    }
                    v3 = 6;
                    break;
                }
                case 45: {
                    switch(v3) {
                        case 0: {
                            v3 = 1;
                            z = true;
                            break alab1;
                        }
                        case 5: {
                            v3 = 6;
                            break alab1;
                        }
                        default: {
                            return 0;
                        }
                    }
                }
                case 46: {
                    if(v3 == 2) {
                        v3 = 3;
                        break;
                    }
                    return 0;
                }
                case 69: 
                case 101: {
                    if(v3 != 2 && v3 != 4) {
                        return 0;
                    }
                    v3 = 5;
                    break;
                }
                default: {
                    if(v6 >= 0x30 && v6 <= 57) {
                        if(v3 == 0 || v3 == 1) {
                            v5 = (long)(-(v6 - 0x30));
                            v3 = 2;
                        }
                        else {
                            switch(v3) {
                                case 2: {
                                    if(v5 == 0L) {
                                        return 0;
                                    }
                                    long v7 = 10L * v5 - ((long)(v6 - 0x30));
                                    int v8 = Long.compare(v5, -922337203685477580L);
                                    v4 &= (v8 > 0 || v8 == 0 && v7 < v5 ? 1 : 0);
                                    v5 = v7;
                                    break;
                                }
                                case 3: {
                                    v3 = 4;
                                    break;
                                }
                                case 5: 
                                case 6: {
                                    v3 = 7;
                                }
                            }
                        }
                        break;
                    }
                    else if(this.a(((char)v6))) {
                        return 0;
                    }
                label_37:
                    if(v3 == 2 && v4 != 0 && (v5 != 0x8000000000000000L || z) && (v5 != 0L || !z)) {
                        if(!z) {
                            v5 = -v5;
                        }
                        this.i = v5;
                        this.e += v2;
                        this.a = 15;
                        return 15;
                    }
                    if(v3 != 2 && v3 != 4 && v3 != 7) {
                        return 0;
                    }
                    this.j = v2;
                    this.a = 16;
                    return 16;
                }
            }
            ++v2;
        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + this.r();
    }

    private String u() throws IOException {
        String s;
        StringBuilder stringBuilder0 = null;
        int v = 0;
        do {
            int v1 = 0;
        alab1:
            while(true) {
                int v2 = this.e;
                if(v2 + v1 < this.f) {
                    switch(this.d[v2 + v1]) {
                        case 35: 
                        case 0x2F: 
                        case 59: 
                        case 61: 
                        case 92: {
                            this.v();
                            break alab1;
                        }
                        case 9: 
                        case 10: 
                        case 12: 
                        case 13: 
                        case 0x20: 
                        case 44: 
                        case 58: 
                        case 91: 
                        case 93: 
                        case 0x7B: 
                        case 0x7D: {
                            break alab1;
                        }
                        default: {
                            ++v1;
                            continue;
                        }
                    }
                }
                if(v1 >= this.d.length) {
                    goto label_14;
                }
                if(!this.b(v1 + 1)) {
                    break;
                }
            }
            v = v1;
            break;
        label_14:
            if(stringBuilder0 == null) {
                stringBuilder0 = new StringBuilder(Math.max(v1, 16));
            }
            stringBuilder0.append(this.d, this.e, v1);
            this.e += v1;
        }
        while(this.b(1));
        if(stringBuilder0 == null) {
            s = new String(this.d, this.e, v);
        }
        else {
            stringBuilder0.append(this.d, this.e, v);
            s = stringBuilder0.toString();
        }
        this.e += v;
        return s;
    }

    private void v() throws IOException {
        if(!this.c) {
            throw this.b("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void w() throws IOException {
        while(this.e < this.f || this.b(1)) {
            int v = this.e;
            int v1 = v + 1;
            this.e = v1;
            int v2 = this.d[v];
            if(v2 == 10) {
                ++this.g;
                this.h = v1;
                return;
            }
            if(v2 == 13) {
                break;
            }
        }
    }

    private char x() throws IOException {
        int v4;
        if(this.e == this.f && !this.b(1)) {
            throw this.b("Unterminated escape sequence");
        }
        int v = this.e;
        this.e = v + 1;
        char c = this.d[v];
        switch(c) {
            case 10: {
                ++this.g;
                this.h = v + 1;
                break;
            }
            case 34: 
            case 39: 
            case 0x2F: 
            case 92: {
                break;
            }
            case 98: {
                return '\b';
            }
            case 102: {
                return '\f';
            }
            case 110: {
                return '\n';
            }
            case 0x72: {
                return '\r';
            }
            case 0x74: {
                return '\t';
            }
            case 0x75: {
                if(v + 5 > this.f && !this.b(4)) {
                    throw this.b("Unterminated escape sequence");
                }
                int v1 = this.e;
                int v2 = v1 + 4;
                char c1 = '\u0000';
                while(v1 < v2) {
                    int v3 = this.d[v1];
                    if(v3 >= 0x30 && v3 <= 57) {
                        v4 = v3 - 0x30;
                    }
                    else if(v3 < 97 || v3 > 102) {
                        if(v3 < 65 || v3 > 70) {
                            throw new NumberFormatException("\\u" + new String(this.d, this.e, 4));
                        }
                        v4 = v3 - 55;
                    }
                    else {
                        v4 = v3 - 87;
                    }
                    c1 = (char)(((char)(c1 << 4)) + v4);
                    ++v1;
                }
                this.e += 4;
                return c1;
            }
            default: {
                throw this.b("Invalid escape sequence");
            }
        }
        return c;
    }

    private void y() throws IOException {
        this.b(true);
        int v = this.e;
        this.e = v - 1;
        if(v + 4 > this.f && !this.b(5)) {
            return;
        }
        if(this.d[v - 1] == 41 && this.d[v] == 93 && this.d[v + 1] == 0x7D && this.d[v + 2] == 39 && this.d[v + 3] == 10) {
            this.e += 5;
        }
    }
}

