package com.google.firebase.encoders.proto;

public final class a {
    static final class com.google.firebase.encoders.proto.a.a implements d {
        private final int H2;
        private final com.google.firebase.encoders.proto.d.a I2;

        com.google.firebase.encoders.proto.a.a(int v, com.google.firebase.encoders.proto.d.a d$a0) {
            this.H2 = v;
            this.I2 = d$a0;
        }

        @Override
        public Class annotationType() {
            return d.class;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof d)) {
                return false;
            }
            int v = ((d)object0).tag();
            if(this.H2 == v) {
                com.google.firebase.encoders.proto.d.a d$a0 = ((d)object0).intEncoding();
                return this.I2.equals(d$a0);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return (0xDE0D66 ^ this.H2) + (this.I2.hashCode() ^ 2041407134);
        }

        @Override  // com.google.firebase.encoders.proto.d
        public com.google.firebase.encoders.proto.d.a intEncoding() {
            return this.I2;
        }

        @Override  // com.google.firebase.encoders.proto.d
        public int tag() {
            return this.H2;
        }

        @Override
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf" + '(' + "tag=" + this.H2 + "intEncoding=" + this.I2 + ')';
        }
    }

    private int a;
    private com.google.firebase.encoders.proto.d.a b;

    public a() {
        this.b = com.google.firebase.encoders.proto.d.a.a;
    }

    public d a() {
        return new com.google.firebase.encoders.proto.a.a(this.a, this.b);
    }

    public static a b() {
        return new a();
    }

    public a c(com.google.firebase.encoders.proto.d.a d$a0) {
        this.b = d$a0;
        return this;
    }

    public a d(int v) {
        this.a = v;
        return this;
    }
}

