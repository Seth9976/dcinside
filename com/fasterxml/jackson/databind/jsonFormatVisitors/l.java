package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;

public interface l extends f {
    public static class a implements l {
        protected I a;

        public a() {
        }

        public a(I i0) {
            this.a = i0;
        }

        @Override  // com.fasterxml.jackson.databind.jsonFormatVisitors.f
        public I a() {
            return this.a;
        }

        @Override  // com.fasterxml.jackson.databind.jsonFormatVisitors.l
        public void h(String s, e e0, m m0) throws o {
        }

        @Override  // com.fasterxml.jackson.databind.jsonFormatVisitors.l
        public void i(d d0) throws o {
        }

        @Override  // com.fasterxml.jackson.databind.jsonFormatVisitors.f
        public void j(I i0) {
            this.a = i0;
        }

        @Override  // com.fasterxml.jackson.databind.jsonFormatVisitors.l
        public void l(d d0) throws o {
        }

        @Override  // com.fasterxml.jackson.databind.jsonFormatVisitors.l
        public void m(String s, e e0, m m0) throws o {
        }
    }

    void h(String arg1, e arg2, m arg3) throws o;

    void i(d arg1) throws o;

    void l(d arg1) throws o;

    void m(String arg1, e arg2, m arg3) throws o;
}

