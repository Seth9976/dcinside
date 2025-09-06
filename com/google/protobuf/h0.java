package com.google.protobuf;

import java.io.IOException;

@k
abstract class h0 {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    static {
    }

    abstract void addFixed32(Object arg1, int arg2, int arg3);

    abstract void addFixed64(Object arg1, int arg2, long arg3);

    abstract void addGroup(Object arg1, int arg2, Object arg3);

    abstract void addLengthDelimited(Object arg1, int arg2, ByteString arg3);

    abstract void addVarint(Object arg1, int arg2, long arg3);

    abstract Object getBuilderFromMessage(Object arg1);

    abstract Object getFromMessage(Object arg1);

    abstract int getSerializedSize(Object arg1);

    abstract int getSerializedSizeAsMessageSet(Object arg1);

    abstract void makeImmutable(Object arg1);

    abstract Object merge(Object arg1, Object arg2);

    private final void mergeFrom(Object object0, a0 a00, int v) throws IOException {
        while(a00.getFieldNumber() != 0x7FFFFFFF && this.mergeOneFieldFrom(object0, a00, v)) {
        }
    }

    final boolean mergeOneFieldFrom(Object object0, a0 a00, int v) throws IOException {
        int v1 = a00.getTag();
        switch(v1 & 7) {
            case 0: {
                this.addVarint(object0, v1 >>> 3, a00.readInt64());
                return true;
            }
            case 1: {
                this.addFixed64(object0, v1 >>> 3, a00.readFixed64());
                return true;
            }
            default: {
                if((v1 & 7) != 2) {
                    switch(v1 & 7) {
                        case 3: {
                            Object object1 = this.newBuilder();
                            if(v + 1 >= h0.recursionLimit) {
                                throw InvalidProtocolBufferException.recursionLimitExceeded();
                            }
                            this.mergeFrom(object1, a00, v + 1);
                            if((v1 >>> 3 << 3 | 4) != a00.getTag()) {
                                throw InvalidProtocolBufferException.invalidEndTag();
                            }
                            this.addGroup(object0, v1 >>> 3, this.toImmutable(object1));
                            return true;
                        }
                        case 4: {
                            return false;
                        }
                        default: {
                            if((v1 & 7) != 5) {
                                throw InvalidProtocolBufferException.invalidWireType();
                            }
                            this.addFixed32(object0, v1 >>> 3, a00.readFixed32());
                            return true;
                        }
                    }
                }
                this.addLengthDelimited(object0, v1 >>> 3, a00.readBytes());
                return true;
            }
        }
    }

    abstract Object newBuilder();

    abstract void setBuilderToMessage(Object arg1, Object arg2);

    public void setRecursionLimit(int v) {
        h0.recursionLimit = v;
    }

    abstract void setToMessage(Object arg1, Object arg2);

    abstract boolean shouldDiscardUnknownFields(a0 arg1);

    abstract Object toImmutable(Object arg1);

    abstract void writeAsMessageSetTo(Object arg1, Writer arg2) throws IOException;

    abstract void writeTo(Object arg1, Writer arg2) throws IOException;
}

