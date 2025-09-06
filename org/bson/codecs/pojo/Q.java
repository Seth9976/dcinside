package org.bson.codecs.pojo;

import org.bson.O;
import org.bson.types.ObjectId;

public final class q {
    class a implements p {
        a() {
            super();
        }

        @Override  // org.bson.codecs.pojo.p
        public Object a() {
            return this.b();
        }

        public ObjectId b() {
            return new ObjectId();
        }

        @Override  // org.bson.codecs.pojo.p
        public Class getType() {
            return ObjectId.class;
        }
    }

    class b implements p {
        b() {
            super();
        }

        @Override  // org.bson.codecs.pojo.p
        public Object a() {
            return this.b();
        }

        public O b() {
            return new O();
        }

        @Override  // org.bson.codecs.pojo.p
        public Class getType() {
            return O.class;
        }
    }

    public static final p a;
    public static final p b;

    static {
        q.a = new a();
        q.b = new b();
    }
}

