package androidx.datastore.preferences.protobuf;

import java.io.IOException;

abstract class UnknownFieldSchema {
    abstract void a(Object arg1, int arg2, int arg3);

    abstract void b(Object arg1, int arg2, long arg3);

    abstract void c(Object arg1, int arg2, Object arg3);

    abstract void d(Object arg1, int arg2, ByteString arg3);

    abstract void e(Object arg1, int arg2, long arg3);

    abstract Object f(Object arg1);

    abstract Object g(Object arg1);

    abstract int h(Object arg1);

    abstract int i(Object arg1);

    abstract void j(Object arg1);

    abstract Object k(Object arg1, Object arg2);

    final void l(Object object0, Reader reader0) throws IOException {
        while(reader0.getFieldNumber() != 0x7FFFFFFF && this.m(object0, reader0)) {
        }
    }

    final boolean m(Object object0, Reader reader0) throws IOException {
        int v = reader0.getTag();
        switch(v & 7) {
            case 0: {
                this.e(object0, v >>> 3, reader0.readInt64());
                return true;
            }
            case 1: {
                this.b(object0, v >>> 3, reader0.readFixed64());
                return true;
            }
            default: {
                if((v & 7) != 2) {
                    switch(v & 7) {
                        case 3: {
                            Object object1 = this.n();
                            this.l(object1, reader0);
                            if((v >>> 3 << 3 | 4) != reader0.getTag()) {
                                throw InvalidProtocolBufferException.b();
                            }
                            this.c(object0, v >>> 3, this.r(object1));
                            return true;
                        }
                        case 4: {
                            return false;
                        }
                        default: {
                            if((v & 7) != 5) {
                                throw InvalidProtocolBufferException.e();
                            }
                            this.a(object0, v >>> 3, reader0.readFixed32());
                            return true;
                        }
                    }
                }
                this.d(object0, v >>> 3, reader0.readBytes());
                return true;
            }
        }
    }

    abstract Object n();

    abstract void o(Object arg1, Object arg2);

    abstract void p(Object arg1, Object arg2);

    abstract boolean q(Reader arg1);

    abstract Object r(Object arg1);

    abstract void s(Object arg1, Writer arg2) throws IOException;

    abstract void t(Object arg1, Writer arg2) throws IOException;
}

