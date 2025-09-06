package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.G;
import com.fasterxml.jackson.databind.c;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.type.d;
import com.fasterxml.jackson.databind.type.e;
import com.fasterxml.jackson.databind.type.i;
import com.fasterxml.jackson.databind.type.l;

public interface t {
    public static class a implements t {
        @Override  // com.fasterxml.jackson.databind.ser.t
        public r a(G g0, l l0, c c0, j j0, r r0) {
            return this.b(g0, l0, c0);
        }

        @Override  // com.fasterxml.jackson.databind.ser.t
        public r b(G g0, m m0, c c0) {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.ser.t
        public r c(G g0, d d0, c c0, j j0, r r0) {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.ser.t
        public r d(G g0, i i0, c c0, r r0, j j0, r r1) {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.ser.t
        public r e(G g0, com.fasterxml.jackson.databind.type.j j0, c c0, r r0, j j1, r r1) {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.ser.t
        public r f(G g0, com.fasterxml.jackson.databind.type.a a0, c c0, j j0, r r0) {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.ser.t
        public r g(G g0, e e0, c c0, j j0, r r0) {
            return null;
        }
    }

    r a(G arg1, l arg2, c arg3, j arg4, r arg5);

    r b(G arg1, m arg2, c arg3);

    r c(G arg1, d arg2, c arg3, j arg4, r arg5);

    r d(G arg1, i arg2, c arg3, r arg4, j arg5, r arg6);

    r e(G arg1, com.fasterxml.jackson.databind.type.j arg2, c arg3, r arg4, j arg5, r arg6);

    r f(G arg1, com.fasterxml.jackson.databind.type.a arg2, c arg3, j arg4, r arg5);

    r g(G arg1, e arg2, c arg3, j arg4, r arg5);
}

