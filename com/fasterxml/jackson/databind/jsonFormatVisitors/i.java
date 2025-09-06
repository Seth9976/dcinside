package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;

public interface i extends f {
    public static class a implements i {
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

        @Override  // com.fasterxml.jackson.databind.jsonFormatVisitors.f
        public void j(I i0) {
            this.a = i0;
        }

        @Override  // com.fasterxml.jackson.databind.jsonFormatVisitors.i
        public void n(e e0, m m0) throws o {
        }

        @Override  // com.fasterxml.jackson.databind.jsonFormatVisitors.i
        public void o(e e0, m m0) throws o {
        }
    }

    void n(e arg1, m arg2) throws o;

    void o(e arg1, m arg2) throws o;
}

