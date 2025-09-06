package androidx.datastore.preferences.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

public interface Parser {
    Object a(byte[] arg1, ExtensionRegistryLite arg2) throws InvalidProtocolBufferException;

    Object b(byte[] arg1, ExtensionRegistryLite arg2) throws InvalidProtocolBufferException;

    Object c(CodedInputStream arg1) throws InvalidProtocolBufferException;

    Object d(CodedInputStream arg1, ExtensionRegistryLite arg2) throws InvalidProtocolBufferException;

    Object e(byte[] arg1, int arg2, int arg3, ExtensionRegistryLite arg4) throws InvalidProtocolBufferException;

    Object f(ByteString arg1) throws InvalidProtocolBufferException;

    Object g(ByteString arg1) throws InvalidProtocolBufferException;

    Object h(InputStream arg1, ExtensionRegistryLite arg2) throws InvalidProtocolBufferException;

    Object i(CodedInputStream arg1, ExtensionRegistryLite arg2) throws InvalidProtocolBufferException;

    Object j(InputStream arg1, ExtensionRegistryLite arg2) throws InvalidProtocolBufferException;

    Object k(InputStream arg1, ExtensionRegistryLite arg2) throws InvalidProtocolBufferException;

    Object l(ByteString arg1, ExtensionRegistryLite arg2) throws InvalidProtocolBufferException;

    Object m(byte[] arg1, int arg2, int arg3, ExtensionRegistryLite arg4) throws InvalidProtocolBufferException;

    Object n(ByteString arg1, ExtensionRegistryLite arg2) throws InvalidProtocolBufferException;

    Object o(InputStream arg1, ExtensionRegistryLite arg2) throws InvalidProtocolBufferException;

    Object p(ByteBuffer arg1, ExtensionRegistryLite arg2) throws InvalidProtocolBufferException;

    Object parseDelimitedFrom(InputStream arg1) throws InvalidProtocolBufferException;

    Object parseFrom(InputStream arg1) throws InvalidProtocolBufferException;

    Object parseFrom(ByteBuffer arg1) throws InvalidProtocolBufferException;

    Object parseFrom(byte[] arg1) throws InvalidProtocolBufferException;

    Object parseFrom(byte[] arg1, int arg2, int arg3) throws InvalidProtocolBufferException;

    Object parsePartialDelimitedFrom(InputStream arg1) throws InvalidProtocolBufferException;

    Object parsePartialFrom(InputStream arg1) throws InvalidProtocolBufferException;

    Object parsePartialFrom(byte[] arg1) throws InvalidProtocolBufferException;

    Object parsePartialFrom(byte[] arg1, int arg2, int arg3) throws InvalidProtocolBufferException;

    Object q(CodedInputStream arg1) throws InvalidProtocolBufferException;
}

