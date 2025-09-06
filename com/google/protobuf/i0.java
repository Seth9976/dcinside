package com.google.protobuf;

import java.io.IOException;

@k
class i0 extends h0 {
    void addFixed32(UnknownFieldSetLite unknownFieldSetLite0, int v, int v1) {
        unknownFieldSetLite0.storeField(v << 3 | 5, v1);
    }

    @Override  // com.google.protobuf.h0
    void addFixed32(Object object0, int v, int v1) {
        this.addFixed32(((UnknownFieldSetLite)object0), v, v1);
    }

    void addFixed64(UnknownFieldSetLite unknownFieldSetLite0, int v, long v1) {
        unknownFieldSetLite0.storeField(v << 3 | 1, v1);
    }

    @Override  // com.google.protobuf.h0
    void addFixed64(Object object0, int v, long v1) {
        this.addFixed64(((UnknownFieldSetLite)object0), v, v1);
    }

    void addGroup(UnknownFieldSetLite unknownFieldSetLite0, int v, UnknownFieldSetLite unknownFieldSetLite1) {
        unknownFieldSetLite0.storeField(v << 3 | 3, unknownFieldSetLite1);
    }

    @Override  // com.google.protobuf.h0
    void addGroup(Object object0, int v, Object object1) {
        this.addGroup(((UnknownFieldSetLite)object0), v, ((UnknownFieldSetLite)object1));
    }

    void addLengthDelimited(UnknownFieldSetLite unknownFieldSetLite0, int v, ByteString byteString0) {
        unknownFieldSetLite0.storeField(v << 3 | 2, byteString0);
    }

    @Override  // com.google.protobuf.h0
    void addLengthDelimited(Object object0, int v, ByteString byteString0) {
        this.addLengthDelimited(((UnknownFieldSetLite)object0), v, byteString0);
    }

    void addVarint(UnknownFieldSetLite unknownFieldSetLite0, int v, long v1) {
        unknownFieldSetLite0.storeField(v << 3, v1);
    }

    @Override  // com.google.protobuf.h0
    void addVarint(Object object0, int v, long v1) {
        this.addVarint(((UnknownFieldSetLite)object0), v, v1);
    }

    UnknownFieldSetLite getBuilderFromMessage(Object object0) {
        UnknownFieldSetLite unknownFieldSetLite0 = this.getFromMessage(object0);
        if(unknownFieldSetLite0 == UnknownFieldSetLite.getDefaultInstance()) {
            unknownFieldSetLite0 = UnknownFieldSetLite.newInstance();
            this.setToMessage(object0, unknownFieldSetLite0);
        }
        return unknownFieldSetLite0;
    }

    @Override  // com.google.protobuf.h0
    Object getBuilderFromMessage(Object object0) {
        return this.getBuilderFromMessage(object0);
    }

    UnknownFieldSetLite getFromMessage(Object object0) {
        return ((GeneratedMessageLite)object0).unknownFields;
    }

    @Override  // com.google.protobuf.h0
    Object getFromMessage(Object object0) {
        return this.getFromMessage(object0);
    }

    int getSerializedSize(UnknownFieldSetLite unknownFieldSetLite0) {
        return unknownFieldSetLite0.getSerializedSize();
    }

    @Override  // com.google.protobuf.h0
    int getSerializedSize(Object object0) {
        return this.getSerializedSize(((UnknownFieldSetLite)object0));
    }

    int getSerializedSizeAsMessageSet(UnknownFieldSetLite unknownFieldSetLite0) {
        return unknownFieldSetLite0.getSerializedSizeAsMessageSet();
    }

    @Override  // com.google.protobuf.h0
    int getSerializedSizeAsMessageSet(Object object0) {
        return this.getSerializedSizeAsMessageSet(((UnknownFieldSetLite)object0));
    }

    @Override  // com.google.protobuf.h0
    void makeImmutable(Object object0) {
        this.getFromMessage(object0).makeImmutable();
    }

    UnknownFieldSetLite merge(UnknownFieldSetLite unknownFieldSetLite0, UnknownFieldSetLite unknownFieldSetLite1) {
        if(UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLite1)) {
            return unknownFieldSetLite0;
        }
        return UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLite0) ? UnknownFieldSetLite.mutableCopyOf(unknownFieldSetLite0, unknownFieldSetLite1) : unknownFieldSetLite0.mergeFrom(unknownFieldSetLite1);
    }

    @Override  // com.google.protobuf.h0
    Object merge(Object object0, Object object1) {
        return this.merge(((UnknownFieldSetLite)object0), ((UnknownFieldSetLite)object1));
    }

    UnknownFieldSetLite newBuilder() {
        return UnknownFieldSetLite.newInstance();
    }

    @Override  // com.google.protobuf.h0
    Object newBuilder() {
        return this.newBuilder();
    }

    void setBuilderToMessage(Object object0, UnknownFieldSetLite unknownFieldSetLite0) {
        this.setToMessage(object0, unknownFieldSetLite0);
    }

    @Override  // com.google.protobuf.h0
    void setBuilderToMessage(Object object0, Object object1) {
        this.setBuilderToMessage(object0, ((UnknownFieldSetLite)object1));
    }

    void setToMessage(Object object0, UnknownFieldSetLite unknownFieldSetLite0) {
        ((GeneratedMessageLite)object0).unknownFields = unknownFieldSetLite0;
    }

    @Override  // com.google.protobuf.h0
    void setToMessage(Object object0, Object object1) {
        this.setToMessage(object0, ((UnknownFieldSetLite)object1));
    }

    @Override  // com.google.protobuf.h0
    boolean shouldDiscardUnknownFields(a0 reader) {
        return false;
    }

    UnknownFieldSetLite toImmutable(UnknownFieldSetLite unknownFieldSetLite0) {
        unknownFieldSetLite0.makeImmutable();
        return unknownFieldSetLite0;
    }

    @Override  // com.google.protobuf.h0
    Object toImmutable(Object object0) {
        return this.toImmutable(((UnknownFieldSetLite)object0));
    }

    void writeAsMessageSetTo(UnknownFieldSetLite unknownFieldSetLite0, Writer writer0) throws IOException {
        unknownFieldSetLite0.writeAsMessageSetTo(writer0);
    }

    @Override  // com.google.protobuf.h0
    void writeAsMessageSetTo(Object object0, Writer writer0) throws IOException {
        this.writeAsMessageSetTo(((UnknownFieldSetLite)object0), writer0);
    }

    void writeTo(UnknownFieldSetLite unknownFieldSetLite0, Writer writer0) throws IOException {
        unknownFieldSetLite0.writeTo(writer0);
    }

    @Override  // com.google.protobuf.h0
    void writeTo(Object object0, Writer writer0) throws IOException {
        this.writeTo(((UnknownFieldSetLite)object0), writer0);
    }
}

