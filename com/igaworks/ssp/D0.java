package com.igaworks.ssp;

import java.util.ArrayList;

public class d0 {
    private boolean a;
    private boolean b;
    private int c;
    private String d;
    private ArrayList e;
    private ArrayList f;
    private Z g;
    private int h;
    private boolean i;
    private String j;
    private ArrayList k;
    private boolean l;
    private String m;
    private String n;
    private int o;
    private String p;
    private boolean q;

    public d0() {
        this.a = false;
        this.b = false;
        this.c = 0;
        this.d = "";
        this.h = 0;
        this.i = false;
        this.j = "";
        this.k = new ArrayList();
        this.l = false;
        this.m = null;
        this.n = "";
        this.o = 0;
        this.p = "";
        this.q = false;
    }

    public d0(d0 d00) {
        this.a = false;
        this.b = false;
        this.c = 0;
        this.d = "";
        this.h = 0;
        this.i = false;
        this.j = "";
        this.k = new ArrayList();
        this.l = false;
        this.m = null;
        this.n = "";
        this.o = 0;
        this.p = "";
        this.q = false;
        this.a = d00.q();
        this.b = d00.p();
        this.c = d00.h();
        this.d = "";
        this.e = d00.b();
        this.f = d00.c();
        this.g = d00.e();
        this.h = d00.g();
        this.i = d00.m();
        this.j = "";
        this.k = d00.l();
        this.l = d00.o();
        this.m = d00.d();
        this.o = d00.k();
        this.n = "";
        this.p = "";
        this.q = d00.n();
    }

    public String a() [...] // 潜在的解密器

    public void a(int v) {
        this.h = v;
    }

    public void a(Z z0) {
        this.g = z0;
    }

    public void a(String s) {
        this.n = s;
    }

    public void a(ArrayList arrayList0) {
        this.e = arrayList0;
    }

    public void a(boolean z) {
        this.i = z;
    }

    public ArrayList b() {
        return this.e;
    }

    public void b(int v) {
        this.c = v;
    }

    public void b(String s) {
        this.m = s;
    }

    public void b(ArrayList arrayList0) {
        this.f = arrayList0;
    }

    public void b(boolean z) {
        this.q = z;
    }

    public ArrayList c() {
        return this.f;
    }

    public void c(int v) {
        this.o = v;
    }

    public void c(String s) {
        this.p = s;
    }

    public void c(ArrayList arrayList0) {
        this.k = arrayList0;
    }

    public void c(boolean z) {
        this.l = z;
    }

    public String d() {
        return this.m;
    }

    public void d(String s) {
        this.d = s;
    }

    public void d(boolean z) {
        this.b = z;
    }

    public Z e() {
        return this.g;
    }

    public void e(String s) {
        this.j = s;
    }

    public void e(boolean z) {
        this.a = z;
    }

    public String f() [...] // 潜在的解密器

    public int g() {
        return this.h;
    }

    public int h() {
        return this.c;
    }

    public String i() [...] // 潜在的解密器

    public String j() [...] // 潜在的解密器

    public int k() {
        return this.o;
    }

    public ArrayList l() {
        return this.k;
    }

    public boolean m() {
        return this.i;
    }

    public boolean n() {
        return this.q;
    }

    public boolean o() {
        return this.l;
    }

    public boolean p() {
        return this.b;
    }

    public boolean q() {
        return this.a;
    }
}

