package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.n;
import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class d {
    public static enum a {
        ONLY_INCLUDE_ALL,
        INCLUDE_ALL_AND_PATH,
        INCLUDE_NON_NULL;

    }

    public static final d a;

    static {
        d.a = new d();
    }

    protected boolean a() {
        return true;
    }

    public void b() {
    }

    public void c() {
    }

    public d d() {
        return this;
    }

    public d e() {
        return this;
    }

    public boolean f() {
        return this.a();
    }

    public boolean g(boolean z) {
        return this.a();
    }

    public d h(int v) {
        return this;
    }

    public boolean i(Object object0) {
        return this.a();
    }

    public boolean j(boolean z) {
        return false;
    }

    public boolean k(boolean z) {
        return false;
    }

    public boolean l() {
        return this.a();
    }

    public boolean m(double f) {
        return this.a();
    }

    public boolean n(float f) {
        return this.a();
    }

    public boolean o(int v) {
        return this.a();
    }

    public boolean p(long v) {
        return this.a();
    }

    public boolean q(BigDecimal bigDecimal0) {
        return this.a();
    }

    public boolean r(BigInteger bigInteger0) {
        return this.a();
    }

    public d s(String s) {
        return this;
    }

    public boolean t() {
        return this.a();
    }

    @Override
    public String toString() {
        return this == d.a ? "TokenFilter.INCLUDE_ALL" : super.toString();
    }

    public d u(int v) [...] // Inlined contents

    public boolean v(Reader reader0, int v) {
        return this.a();
    }

    public boolean w(String s) {
        return this.a();
    }

    public boolean x(n n0) throws IOException {
        return this.a();
    }
}

