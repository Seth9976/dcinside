package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;

public interface g extends f {
    public static class a implements g {
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

        @Override  // com.fasterxml.jackson.databind.jsonFormatVisitors.g
        public h b(m m0) throws o {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.jsonFormatVisitors.g
        public l e(m m0) throws o {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.jsonFormatVisitors.g
        public i f(m m0) throws o {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.jsonFormatVisitors.g
        public com.fasterxml.jackson.databind.jsonFormatVisitors.m g(m m0) throws o {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.jsonFormatVisitors.f
        public void j(I i0) {
            this.a = i0;
        }

        @Override  // com.fasterxml.jackson.databind.jsonFormatVisitors.g
        public j k(m m0) throws o {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.jsonFormatVisitors.g
        public com.fasterxml.jackson.databind.jsonFormatVisitors.a p(m m0) throws o {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.jsonFormatVisitors.g
        public k q(m m0) throws o {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.jsonFormatVisitors.g
        public b r(m m0) throws o {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.jsonFormatVisitors.g
        public c s(m m0) throws o {
            return null;
        }
    }

    h b(m arg1) throws o;

    l e(m arg1) throws o;

    i f(m arg1) throws o;

    com.fasterxml.jackson.databind.jsonFormatVisitors.m g(m arg1) throws o;

    j k(m arg1) throws o;

    com.fasterxml.jackson.databind.jsonFormatVisitors.a p(m arg1) throws o;

    k q(m arg1) throws o;

    b r(m arg1) throws o;

    c s(m arg1) throws o;
}

