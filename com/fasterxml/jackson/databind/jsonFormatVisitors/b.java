package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;

public interface b extends f {
    public static class a implements b {
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

        @Override  // com.fasterxml.jackson.databind.jsonFormatVisitors.b
        public void c(e e0, m m0) throws o {
        }

        @Override  // com.fasterxml.jackson.databind.jsonFormatVisitors.b
        public void d(d d0) throws o {
        }

        @Override  // com.fasterxml.jackson.databind.jsonFormatVisitors.f
        public void j(I i0) {
            this.a = i0;
        }
    }

    void c(e arg1, m arg2) throws o;

    void d(d arg1) throws o;
}

