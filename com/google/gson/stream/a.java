package com.google.gson.stream;

import com.google.gson.internal.f;
import j..util.Objects;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class a implements Closeable {
    class com.google.gson.stream.a.a extends f {
        com.google.gson.stream.a.a() {
            super();
        }

        @Override  // com.google.gson.internal.f
        public void a(a a0) throws IOException {
            if(a0 instanceof com.google.gson.internal.bind.a) {
                ((com.google.gson.internal.bind.a)a0).l1();
                return;
            }
            switch((a0.h == 0 ? a0.f() : a0.h)) {
                case 12: {
                    a0.h = 8;
                    return;
                }
                case 13: {
                    a0.h = 9;
                    return;
                }
                case 14: {
                    a0.h = 10;
                    return;
                }
                default: {
                    throw new IllegalStateException("Expected a name but was " + a0.f0() + a0.t());
                }
            }
        }
    }

    private static final int A = 10;
    private static final int B = 11;
    private static final int C = 12;
    private static final int D = 13;
    private static final int E = 14;
    private static final int F = 15;
    private static final int G = 16;
    private static final int H = 17;
    private static final int I = 0;
    private static final int J = 1;
    private static final int K = 2;
    private static final int L = 3;
    private static final int M = 4;
    private static final int N = 5;
    private static final int O = 6;
    private static final int P = 7;
    static final int Q = 0x400;
    private final Reader a;
    private boolean b;
    private final char[] c;
    private int d;
    private int e;
    private int f;
    private int g;
    int h;
    private long i;
    private int j;
    private String k;
    private int[] l;
    private int m;
    private String[] n;
    private int[] o;
    private static final long p = -922337203685477580L;
    private static final int q = 0;
    private static final int r = 1;
    private static final int s = 2;
    private static final int t = 3;
    private static final int u = 4;
    private static final int v = 5;
    private static final int w = 6;
    private static final int x = 7;
    private static final int y = 8;
    private static final int z = 9;

    static {
        f.a = new com.google.gson.stream.a.a();
    }

    public a(Reader reader0) {
        this.b = false;
        this.c = new char[0x400];
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        int[] arr_v = new int[0x20];
        this.l = arr_v;
        this.m = 1;
        arr_v[0] = 6;
        this.n = new String[0x20];
        this.o = new int[0x20];
        Objects.requireNonNull(reader0, "in == null");
        this.a = reader0;
    }

    public final void E0(boolean z) {
        this.b = z;
    }

    public long L() throws IOException {
        int v = this.h == 0 ? this.f() : this.h;
        switch(v) {
            case 8: {
            label_9:
                this.k = v == 10 ? this.e0() : this.Y(((char)(v == 8 ? 39 : 34)));
                try {
                    long v2 = Long.parseLong(this.k);
                    this.h = 0;
                    int v3 = this.m - 1;
                    ++this.o[v3];
                    return v2;
                }
                catch(NumberFormatException unused_ex) {
                    goto label_20;
                }
            }
            case 15: {
                this.h = 0;
                int v1 = this.m - 1;
                ++this.o[v1];
                return this.i;
            label_7:
                if(v != 9 && v != 10) {
                    throw new IllegalStateException("Expected a long but was " + this.f0() + this.t());
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
        this.k = new String(this.c, this.d, this.j);
        this.d += this.j;
    label_20:
        this.h = 11;
        double f = Double.parseDouble(this.k);
        if(((double)(((long)f))) != f) {
            throw new NumberFormatException("Expected a long but was " + this.k + this.t());
        }
        this.k = null;
        this.h = 0;
        int v4 = this.m - 1;
        ++this.o[v4];
        return (long)f;
    }

    private void L0(char c) throws IOException {
        char[] arr_c = this.c;
        do {
            int v = this.d;
            int v1 = this.e;
            while(v < v1) {
                int v2 = arr_c[v];
                if(v2 == c) {
                    this.d = v + 1;
                    return;
                }
                switch(v2) {
                    case 10: {
                        ++this.f;
                        this.g = v + 1;
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
                this.d = v + 1;
                this.x0();
                v = this.d;
                v1 = this.e;
            }
            this.d = v;
        }
        while(this.k(1));
        throw this.b1("Unterminated string");
    }

    public String Q() throws IOException {
        String s;
        switch((this.h == 0 ? this.f() : this.h)) {
            case 12: {
                s = this.Y('\'');
                break;
            }
            case 13: {
                s = this.Y('\"');
                break;
            }
            case 14: {
                s = this.e0();
                break;
            }
            default: {
                throw new IllegalStateException("Expected a name but was " + this.f0() + this.t());
            }
        }
        this.h = 0;
        this.n[this.m - 1] = s;
        return s;
    }

    private int R(boolean z) throws IOException {
        char[] arr_c = this.c;
        int v = this.d;
        int v1 = this.e;
        while(true) {
            if(v == v1) {
                this.d = v;
                if(!this.k(1)) {
                    if(z) {
                        throw new EOFException("End of input" + this.t());
                    }
                    return -1;
                }
                v = this.d;
                v1 = this.e;
            }
            int v2 = arr_c[v];
            switch(v2) {
                case 10: {
                    ++this.f;
                    this.g = v + 1;
                    break;
                }
                case 9: 
                case 13: 
                case 0x20: {
                    break;
                }
                case 35: {
                    this.d = v + 1;
                    this.c();
                    this.Y0();
                    v = this.d;
                    v1 = this.e;
                    continue;
                }
                case 0x2F: {
                    this.d = v + 1;
                    if(v + 1 == v1) {
                        this.d = v;
                        boolean z1 = this.k(2);
                        ++this.d;
                        if(!z1) {
                            return 0x2F;
                        }
                    }
                    this.c();
                    int v3 = this.d;
                    switch(arr_c[v3]) {
                        case 42: {
                            this.d = v3 + 1;
                            if(!this.T0("*/")) {
                                throw this.b1("Unterminated comment");
                            }
                            v = this.d + 2;
                            v1 = this.e;
                            continue;
                        }
                        case 0x2F: {
                            this.d = v3 + 1;
                            this.Y0();
                            v = this.d;
                            v1 = this.e;
                            continue;
                        }
                        default: {
                            return 0x2F;
                        }
                    }
                }
                default: {
                    this.d = v + 1;
                    return v2;
                }
            }
            ++v;
        }
    }

    public void T() throws IOException {
        if((this.h == 0 ? this.f() : this.h) != 7) {
            throw new IllegalStateException("Expected null but was " + this.f0() + this.t());
        }
        this.h = 0;
        int v = this.m - 1;
        ++this.o[v];
    }

    private boolean T0(String s) throws IOException {
        int v = s.length();
    alab1:
        while(true) {
            if(this.d + v > this.e && !this.k(v)) {
                return false;
            }
            int v2 = this.d;
            if(this.c[v2] == 10) {
                ++this.f;
                this.g = v2 + 1;
            }
            else {
                for(int v1 = 0; true; ++v1) {
                    if(v1 >= v) {
                        break alab1;
                    }
                    if(this.c[this.d + v1] != s.charAt(v1)) {
                        break;
                    }
                }
            }
            ++this.d;
        }
        return true;
    }

    private String Y(char c) throws IOException {
        int v3;
        char[] arr_c = this.c;
        StringBuilder stringBuilder0 = null;
        do {
            int v = this.d;
            int v1 = this.e;
        alab1:
            while(true) {
                int v2 = v1;
                v3 = v;
                while(true) {
                    if(v >= v2) {
                        break alab1;
                    }
                    int v4 = arr_c[v];
                    if(v4 == c) {
                        this.d = v + 1;
                        int v5 = v + 1 - v3 - 1;
                        if(stringBuilder0 == null) {
                            return new String(arr_c, v3, v5);
                        }
                        stringBuilder0.append(arr_c, v3, v5);
                        return stringBuilder0.toString();
                    }
                    switch(v4) {
                        case 10: {
                            ++this.f;
                            this.g = v + 1;
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
                    this.d = v + 1;
                    int v6 = v + 1 - v3;
                    if(stringBuilder0 == null) {
                        stringBuilder0 = new StringBuilder(Math.max(v6 * 2, 16));
                    }
                    stringBuilder0.append(arr_c, v3, v6 - 1);
                    stringBuilder0.append(this.x0());
                    v = this.d;
                    v1 = this.e;
                    break;
                }
            }
            if(stringBuilder0 == null) {
                stringBuilder0 = new StringBuilder(Math.max((v - v3) * 2, 16));
            }
            stringBuilder0.append(arr_c, v3, v - v3);
            this.d = v;
        }
        while(this.k(1));
        throw this.b1("Unterminated string");
    }

    private void Y0() throws IOException {
        while(this.d < this.e || this.k(1)) {
            int v = this.d;
            int v1 = v + 1;
            this.d = v1;
            int v2 = this.c[v];
            if(v2 == 10) {
                ++this.f;
                this.g = v1;
                return;
            }
            if(v2 == 13) {
                break;
            }
        }
    }

    public void Y1() throws IOException {
        int v = 0;
        do {
            switch((this.h == 0 ? this.f() : this.h)) {
                case 1: {
                    this.u0(3);
                    ++v;
                    break;
                }
                case 2: {
                    if(v == 0) {
                        this.n[this.m - 1] = null;
                    }
                    --this.m;
                    --v;
                    break;
                }
                case 3: {
                    this.u0(1);
                    ++v;
                    break;
                }
                case 4: {
                    --this.m;
                    --v;
                    break;
                }
                case 8: {
                    this.L0('\'');
                    break;
                }
                case 9: {
                    this.L0('\"');
                    break;
                }
                case 10: {
                    this.a1();
                    break;
                }
                case 12: {
                    this.L0('\'');
                    if(v == 0) {
                        this.n[this.m - 1] = "<skipped>";
                    }
                    break;
                }
                case 13: {
                    this.L0('\"');
                    if(v == 0) {
                        this.n[this.m - 1] = "<skipped>";
                    }
                    break;
                }
                case 14: {
                    this.a1();
                    if(v == 0) {
                        this.n[this.m - 1] = "<skipped>";
                    }
                    break;
                }
                case 16: {
                    this.d += this.j;
                    break;
                }
                case 17: {
                    return;
                }
            }
            this.h = 0;
        }
        while(v > 0);
        int v1 = this.m - 1;
        ++this.o[v1];
    }

    public void a() throws IOException {
        if((this.h == 0 ? this.f() : this.h) != 3) {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + this.f0() + this.t());
        }
        this.u0(1);
        this.o[this.m - 1] = 0;
        this.h = 0;
    }

    private void a1() throws IOException {
        int v1;
        do {
            int v = 0;
        alab1:
            while(true) {
                v1 = this.d;
                if(v1 + v >= this.e) {
                    goto label_9;
                }
                switch(this.c[v1 + v]) {
                    case 35: 
                    case 0x2F: 
                    case 59: 
                    case 61: 
                    case 92: {
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
                        this.d += v;
                        return;
                    }
                    default: {
                        ++v;
                    }
                }
            }
            this.c();
            this.d += v;
            return;
        label_9:
            this.d = v1 + v;
        }
        while(this.k(1));
    }

    public void b() throws IOException {
        if((this.h == 0 ? this.f() : this.h) != 1) {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + this.f0() + this.t());
        }
        this.u0(3);
        this.h = 0;
    }

    private IOException b1(String s) throws IOException {
        throw new e(s + this.t());
    }

    private void c() throws IOException {
        if(!this.b) {
            throw this.b1("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    @Override
    public void close() throws IOException {
        this.h = 0;
        this.l[0] = 8;
        this.m = 1;
        this.a.close();
    }

    public String d0() throws IOException {
        String s;
    alab1:
        switch(this.h) {
            case 0: {
                switch(this.f()) {
                    case 8: {
                        s = this.Y('\'');
                        break alab1;
                    }
                    case 9: {
                        s = this.Y('\"');
                        break alab1;
                    }
                    case 10: {
                        s = this.e0();
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
                        s = new String(this.c, this.d, this.j);
                        this.d += this.j;
                        break alab1;
                    }
                    default: {
                        throw new IllegalStateException("Expected a string but was " + this.f0() + this.t());
                    }
                }
            }
            case 8: {
                s = this.Y('\'');
                break;
            }
            case 9: {
                s = this.Y('\"');
                break;
            }
            case 10: {
                s = this.e0();
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
                s = new String(this.c, this.d, this.j);
                this.d += this.j;
                break;
            }
            default: {
                throw new IllegalStateException("Expected a string but was " + this.f0() + this.t());
            }
        }
        this.h = 0;
        int v = this.m - 1;
        ++this.o[v];
        return s;
    }

    private void e() throws IOException {
        this.R(true);
        int v = this.d;
        this.d = v - 1;
        if(v + 4 > this.e && !this.k(5)) {
            return;
        }
        int v1 = this.d;
        if(this.c[v1] == 41 && this.c[v1 + 1] == 93 && this.c[v1 + 2] == 0x7D && this.c[v1 + 3] == 39 && this.c[v1 + 4] == 10) {
            this.d = v1 + 5;
        }
    }

    private String e0() throws IOException {
        String s;
        StringBuilder stringBuilder0 = null;
        int v = 0;
        do {
            int v1 = 0;
        alab1:
            while(true) {
                int v2 = this.d;
                if(v2 + v1 < this.e) {
                    switch(this.c[v2 + v1]) {
                        case 35: 
                        case 0x2F: 
                        case 59: 
                        case 61: 
                        case 92: {
                            this.c();
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
                if(v1 >= this.c.length) {
                    goto label_14;
                }
                if(!this.k(v1 + 1)) {
                    break;
                }
            }
            v = v1;
            break;
        label_14:
            if(stringBuilder0 == null) {
                stringBuilder0 = new StringBuilder(Math.max(v1, 16));
            }
            stringBuilder0.append(this.c, this.d, v1);
            this.d += v1;
        }
        while(this.k(1));
        if(stringBuilder0 == null) {
            s = new String(this.c, this.d, v);
        }
        else {
            stringBuilder0.append(this.c, this.d, v);
            s = stringBuilder0.toString();
        }
        this.d += v;
        return s;
    }

    int f() throws IOException {
        int[] arr_v = this.l;
        int v = this.m;
        int v1 = arr_v[v - 1];
        if(v1 == 1) {
            arr_v[v - 1] = 2;
            goto label_37;
        }
        if(v1 == 2) {
            switch(this.R(true)) {
                case 44: {
                    goto label_37;
                }
                case 59: {
                    this.c();
                    goto label_37;
                }
                case 93: {
                    this.h = 4;
                    return 4;
                }
                default: {
                    throw this.b1("Unterminated array");
                }
            }
        }
        if(v1 != 3 && v1 != 5) {
            switch(v1) {
                case 4: {
                    arr_v[v - 1] = 5;
                    int v2 = this.R(true);
                    if(v2 != 58) {
                        if(v2 != 61) {
                            throw this.b1("Expected \':\'");
                        }
                        this.c();
                        if(this.d < this.e || this.k(1)) {
                            int v3 = this.d;
                            if(this.c[v3] == 62) {
                                this.d = v3 + 1;
                                break;
                            }
                        }
                    }
                    break;
                }
                case 6: {
                    if(this.b) {
                        this.e();
                    }
                    this.l[this.m - 1] = 7;
                    break;
                }
                case 7: {
                    if(this.R(false) == -1) {
                        this.h = 17;
                        return 17;
                    }
                    this.c();
                    --this.d;
                    break;
                }
                case 8: {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        label_37:
            int v4 = this.R(true);
            switch(v4) {
                case 34: {
                    this.h = 9;
                    return 9;
                }
                case 39: {
                    this.c();
                    this.h = 8;
                    return 8;
                }
                case 44: 
                case 59: {
                    break;
                }
                case 91: {
                    this.h = 3;
                    return 3;
                }
                case 93: {
                    if(v1 == 1) {
                        this.h = 4;
                        return 4;
                    }
                    break;
                }
                default: {
                    if(v4 != 0x7B) {
                        --this.d;
                        int v5 = this.h0();
                        if(v5 != 0) {
                            return v5;
                        }
                        int v6 = this.l0();
                        if(v6 != 0) {
                            return v6;
                        }
                        if(!this.s(this.c[this.d])) {
                            throw this.b1("Expected value");
                        }
                        this.c();
                        this.h = 10;
                        return 10;
                    }
                    this.h = 1;
                    return 1;
                }
            }
            if(v1 != 1 && v1 != 2) {
                throw this.b1("Unexpected value");
            }
            this.c();
            --this.d;
            this.h = 7;
            return 7;
        }
        arr_v[v - 1] = 4;
        if(v1 == 5) {
            switch(this.R(true)) {
                case 44: {
                    break;
                }
                case 59: {
                    this.c();
                    break;
                }
                case 0x7D: {
                    this.h = 2;
                    return 2;
                }
                default: {
                    throw this.b1("Unterminated object");
                }
            }
        }
        int v7 = this.R(true);
        switch(v7) {
            case 34: {
                this.h = 13;
                return 13;
            }
            case 39: {
                this.c();
                this.h = 12;
                return 12;
            }
            default: {
                if(v7 != 0x7D) {
                    this.c();
                    --this.d;
                    if(!this.s(((char)v7))) {
                        throw this.b1("Expected name");
                    }
                    this.h = 14;
                    return 14;
                }
                if(v1 == 5) {
                    throw this.b1("Expected name");
                }
                this.h = 2;
                return 2;
            }
        }
    }

    public c f0() throws IOException {
        switch((this.h == 0 ? this.f() : this.h)) {
            case 1: {
                return c.c;
            }
            case 2: {
                return c.d;
            }
            case 3: {
                return c.a;
            }
            case 4: {
                return c.b;
            }
            case 5: 
            case 6: {
                return c.h;
            }
            case 7: {
                return c.i;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                return c.f;
            }
            case 12: 
            case 13: 
            case 14: {
                return c.e;
            }
            case 15: 
            case 16: {
                return c.g;
            }
            case 17: {
                return c.j;
            }
            default: {
                throw new AssertionError();
            }
        }
    }

    public String getPath() {
        return this.n(false);
    }

    private int h0() throws IOException {
        int v;
        String s1;
        String s;
        switch(this.c[this.d]) {
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
            if(this.d + v2 >= this.e && !this.k(v2 + 1)) {
                return 0;
            }
            int v3 = this.c[this.d + v2];
            if(v3 != s.charAt(v2) && v3 != s1.charAt(v2)) {
                return 0;
            }
        }
        if((this.d + v1 < this.e || this.k(v1 + 1)) && this.s(this.c[this.d + v1])) {
            return 0;
        }
        this.d += v1;
        this.h = v;
        return v;
    }

    public void i() throws IOException {
        if((this.h == 0 ? this.f() : this.h) != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + this.f0() + this.t());
        }
        int v = this.m;
        this.m = v - 1;
        ++this.o[v - 2];
        this.h = 0;
    }

    public void j() throws IOException {
        if((this.h == 0 ? this.f() : this.h) != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + this.f0() + this.t());
        }
        int v = this.m;
        this.m = v - 1;
        this.n[v - 1] = null;
        ++this.o[v - 2];
        this.h = 0;
    }

    private boolean k(int v) throws IOException {
        char[] arr_c = this.c;
        int v1 = this.d;
        this.g -= v1;
        int v2 = this.e;
        if(v2 == v1) {
            this.e = 0;
        }
        else {
            int v3 = v2 - v1;
            this.e = v3;
            System.arraycopy(arr_c, v1, arr_c, 0, v3);
        }
        this.d = 0;
        int v4;
        while((v4 = this.a.read(arr_c, this.e, arr_c.length - this.e)) != -1) {
            int v5 = this.e + v4;
            this.e = v5;
            if(this.f == 0 && this.g == 0 && v5 > 0 && arr_c[0] == 0xFEFF) {
                ++this.d;
                this.g = 1;
                ++v;
            }
            if(v5 >= v) {
                return true;
            }
        }
        return false;
    }

    private int l0() throws IOException {
        char[] arr_c = this.c;
        int v = this.d;
        int v1 = this.e;
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
                if(!this.k(v2 + 1)) {
                    goto label_36;
                }
                v = this.d;
                v1 = this.e;
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
                    if(!this.s(((char)v6))) {
                    label_36:
                        if(v3 == 2 && v4 != 0 && (v5 != 0x8000000000000000L || z) && (v5 != 0L || !z)) {
                            if(!z) {
                                v5 = -v5;
                            }
                            this.i = v5;
                            this.d += v2;
                            this.h = 15;
                            return 15;
                        }
                        if(v3 != 2 && v3 != 4 && v3 != 7) {
                            return 0;
                        }
                        this.j = v2;
                        this.h = 16;
                        return 16;
                    }
                    return 0;
                }
            }
            ++v2;
        }
    }

    private String n(boolean z) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append('$');
        for(int v = 0; true; ++v) {
            int v1 = this.m;
            if(v >= v1) {
                break;
            }
            switch(this.l[v]) {
                case 1: 
                case 2: {
                    int v2 = this.o[v];
                    if(z && v2 > 0 && v == v1 - 1) {
                        --v2;
                    }
                    stringBuilder0.append('[');
                    stringBuilder0.append(v2);
                    stringBuilder0.append(']');
                    break;
                }
                case 3: 
                case 4: 
                case 5: {
                    stringBuilder0.append('.');
                    String s = this.n[v];
                    if(s != null) {
                        stringBuilder0.append(s);
                    }
                }
            }
        }
        return stringBuilder0.toString();
    }

    public String o() {
        return this.n(true);
    }

    public boolean p() throws IOException {
        int v = this.h == 0 ? this.f() : this.h;
        return v != 2 && v != 4 && v != 17;
    }

    public final boolean q() {
        return this.b;
    }

    private boolean s(char c) throws IOException {
        switch(c) {
            case 35: 
            case 0x2F: 
            case 59: 
            case 61: 
            case 92: {
                this.c();
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

    String t() {
        return " at line " + (this.f + 1) + " column " + (this.d - this.g + 1) + " path " + this.getPath();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + this.t();
    }

    private void u0(int v) {
        int v1 = this.m;
        int[] arr_v = this.l;
        if(v1 == arr_v.length) {
            this.l = Arrays.copyOf(arr_v, v1 * 2);
            this.o = Arrays.copyOf(this.o, v1 * 2);
            this.n = (String[])Arrays.copyOf(this.n, v1 * 2);
        }
        int v2 = this.m;
        this.m = v2 + 1;
        this.l[v2] = v;
    }

    public boolean v() throws IOException {
        switch((this.h == 0 ? this.f() : this.h)) {
            case 5: {
                this.h = 0;
                int v = this.m - 1;
                ++this.o[v];
                return true;
            }
            case 6: {
                this.h = 0;
                int v1 = this.m - 1;
                ++this.o[v1];
                return false;
            }
            default: {
                throw new IllegalStateException("Expected a boolean but was " + this.f0() + this.t());
            }
        }
    }

    public double w() throws IOException {
        int v = this.h == 0 ? this.f() : this.h;
        switch(v) {
            case 8: 
            case 9: {
                this.k = this.Y(((char)(v == 8 ? 39 : 34)));
                break;
            }
            case 10: {
                this.k = this.e0();
                break;
            }
            case 11: {
                break;
            }
            case 15: {
                this.h = 0;
                int v1 = this.m - 1;
                ++this.o[v1];
                return (double)this.i;
            }
            case 16: {
                this.k = new String(this.c, this.d, this.j);
                this.d += this.j;
                break;
            }
            default: {
                throw new IllegalStateException("Expected a double but was " + this.f0() + this.t());
            }
        }
        this.h = 11;
        double f = Double.parseDouble(this.k);
        if(!this.b && (Double.isNaN(f) || Double.isInfinite(f))) {
            throw new e("JSON forbids NaN and infinities: " + f + this.t());
        }
        this.k = null;
        this.h = 0;
        int v2 = this.m - 1;
        ++this.o[v2];
        return f;
    }

    public int x() throws IOException {
        int v = this.h == 0 ? this.f() : this.h;
        switch(v) {
            case 8: {
            label_12:
                this.k = v == 10 ? this.e0() : this.Y(((char)(v == 8 ? 39 : 34)));
                try {
                    int v3 = Integer.parseInt(this.k);
                    this.h = 0;
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
                    throw new NumberFormatException("Expected an int but was " + this.i + this.t());
                }
                this.h = 0;
                int v2 = this.m - 1;
                ++this.o[v2];
                return v1;
            label_10:
                if(v != 9 && v != 10) {
                    throw new IllegalStateException("Expected an int but was " + this.f0() + this.t());
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
        this.k = new String(this.c, this.d, this.j);
        this.d += this.j;
    label_23:
        this.h = 11;
        double f = Double.parseDouble(this.k);
        if(((double)(((int)f))) != f) {
            throw new NumberFormatException("Expected an int but was " + this.k + this.t());
        }
        this.k = null;
        this.h = 0;
        int v5 = this.m - 1;
        ++this.o[v5];
        return (int)f;
    }

    private char x0() throws IOException {
        int v4;
        if(this.d == this.e && !this.k(1)) {
            throw this.b1("Unterminated escape sequence");
        }
        int v = this.d;
        this.d = v + 1;
        char c = this.c[v];
        switch(c) {
            case 10: {
                ++this.f;
                this.g = v + 1;
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
                if(v + 5 > this.e && !this.k(4)) {
                    throw this.b1("Unterminated escape sequence");
                }
                int v1 = this.d;
                int v2 = v1 + 4;
                char c1 = '\u0000';
                while(v1 < v2) {
                    int v3 = this.c[v1];
                    if(v3 >= 0x30 && v3 <= 57) {
                        v4 = v3 - 0x30;
                    }
                    else if(v3 < 97 || v3 > 102) {
                        if(v3 < 65 || v3 > 70) {
                            throw new NumberFormatException("\\u" + new String(this.c, this.d, 4));
                        }
                        v4 = v3 - 55;
                    }
                    else {
                        v4 = v3 - 87;
                    }
                    c1 = (char)(((char)(c1 << 4)) + v4);
                    ++v1;
                }
                this.d += 4;
                return c1;
            }
            default: {
                throw this.b1("Invalid escape sequence");
            }
        }
        return c;
    }
}

