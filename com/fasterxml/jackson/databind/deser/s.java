package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.c;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.jsontype.f;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.type.d;
import com.fasterxml.jackson.databind.type.e;
import com.fasterxml.jackson.databind.type.i;
import com.fasterxml.jackson.databind.type.j;
import com.fasterxml.jackson.databind.type.l;

public interface s {
    public static abstract class a implements s {
        @Override  // com.fasterxml.jackson.databind.deser.s
        public boolean a(g g0, Class class0) {
            return false;
        }

        @Override  // com.fasterxml.jackson.databind.deser.s
        public n b(m m0, g g0, c c0) throws o {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.deser.s
        public n c(e e0, g g0, c c0, f f0, n n0) throws o {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.deser.s
        public n d(com.fasterxml.jackson.databind.type.a a0, g g0, c c0, f f0, n n0) throws o {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.deser.s
        public n e(l l0, g g0, c c0, f f0, n n0) throws o {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.deser.s
        public n f(Class class0, g g0, c c0) throws o {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.deser.s
        public n g(i i0, g g0, c c0, com.fasterxml.jackson.databind.s s0, f f0, n n0) throws o {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.deser.s
        public n h(Class class0, g g0, c c0) throws o {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.deser.s
        public n i(d d0, g g0, c c0, f f0, n n0) throws o {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.deser.s
        public n j(j j0, g g0, c c0, com.fasterxml.jackson.databind.s s0, f f0, n n0) throws o {
            return null;
        }
    }

    boolean a(g arg1, Class arg2);

    n b(m arg1, g arg2, c arg3) throws o;

    n c(e arg1, g arg2, c arg3, f arg4, n arg5) throws o;

    n d(com.fasterxml.jackson.databind.type.a arg1, g arg2, c arg3, f arg4, n arg5) throws o;

    n e(l arg1, g arg2, c arg3, f arg4, n arg5) throws o;

    n f(Class arg1, g arg2, c arg3) throws o;

    n g(i arg1, g arg2, c arg3, com.fasterxml.jackson.databind.s arg4, f arg5, n arg6) throws o;

    n h(Class arg1, g arg2, c arg3) throws o;

    n i(d arg1, g arg2, c arg3, f arg4, n arg5) throws o;

    n j(j arg1, g arg2, c arg3, com.fasterxml.jackson.databind.s arg4, f arg5, n arg6) throws o;
}

