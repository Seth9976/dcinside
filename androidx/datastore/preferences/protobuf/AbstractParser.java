package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public abstract class AbstractParser implements Parser {
    private static final ExtensionRegistryLite a;

    static {
        AbstractParser.a = ExtensionRegistryLite.d();
    }

    public MessageLite A(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return this.r(this.N(inputStream0, extensionRegistryLite0));
    }

    public MessageLite B(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return this.C(byteBuffer0, AbstractParser.a);
    }

    public MessageLite C(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStream0 = CodedInputStream.n(byteBuffer0);
        MessageLite messageLite0 = (MessageLite)this.i(codedInputStream0, extensionRegistryLite0);
        try {
            codedInputStream0.a(0);
            return this.r(messageLite0);
        }
        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
            throw invalidProtocolBufferException0.j(messageLite0);
        }
    }

    public MessageLite D(byte[] arr_b) throws InvalidProtocolBufferException {
        return this.G(arr_b, AbstractParser.a);
    }

    public MessageLite E(byte[] arr_b, int v, int v1) throws InvalidProtocolBufferException {
        return this.F(arr_b, v, v1, AbstractParser.a);
    }

    public MessageLite F(byte[] arr_b, int v, int v1, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return this.r(this.Q(arr_b, v, v1, extensionRegistryLite0));
    }

    public MessageLite G(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return this.F(arr_b, 0, arr_b.length, extensionRegistryLite0);
    }

    public MessageLite H(InputStream inputStream0) throws InvalidProtocolBufferException {
        return this.I(inputStream0, AbstractParser.a);
    }

    public MessageLite I(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        try {
            int v = inputStream0.read();
            return v == -1 ? null : this.N(new LimitedInputStream(inputStream0, CodedInputStream.O(v, inputStream0)), extensionRegistryLite0);
        }
        catch(IOException iOException0) {
            throw new InvalidProtocolBufferException(iOException0);
        }
    }

    public MessageLite J(ByteString byteString0) throws InvalidProtocolBufferException {
        return this.K(byteString0, AbstractParser.a);
    }

    public MessageLite K(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStream0 = byteString0.H();
        MessageLite messageLite0 = (MessageLite)this.i(codedInputStream0, extensionRegistryLite0);
        try {
            codedInputStream0.a(0);
            return messageLite0;
        }
        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
            throw invalidProtocolBufferException0.j(messageLite0);
        }
    }

    public MessageLite L(CodedInputStream codedInputStream0) throws InvalidProtocolBufferException {
        return (MessageLite)this.i(codedInputStream0, AbstractParser.a);
    }

    public MessageLite M(InputStream inputStream0) throws InvalidProtocolBufferException {
        return this.N(inputStream0, AbstractParser.a);
    }

    public MessageLite N(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStream0 = CodedInputStream.j(inputStream0);
        MessageLite messageLite0 = (MessageLite)this.i(codedInputStream0, extensionRegistryLite0);
        try {
            codedInputStream0.a(0);
            return messageLite0;
        }
        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
            throw invalidProtocolBufferException0.j(messageLite0);
        }
    }

    public MessageLite O(byte[] arr_b) throws InvalidProtocolBufferException {
        return this.Q(arr_b, 0, arr_b.length, AbstractParser.a);
    }

    public MessageLite P(byte[] arr_b, int v, int v1) throws InvalidProtocolBufferException {
        return this.Q(arr_b, v, v1, AbstractParser.a);
    }

    public MessageLite Q(byte[] arr_b, int v, int v1, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStream0 = CodedInputStream.q(arr_b, v, v1);
        MessageLite messageLite0 = (MessageLite)this.i(codedInputStream0, extensionRegistryLite0);
        try {
            codedInputStream0.a(0);
            return messageLite0;
        }
        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
            throw invalidProtocolBufferException0.j(messageLite0);
        }
    }

    public MessageLite R(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return this.Q(arr_b, 0, arr_b.length, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Parser
    public Object a(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return this.G(arr_b, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Parser
    public Object b(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return this.R(arr_b, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Parser
    public Object c(CodedInputStream codedInputStream0) throws InvalidProtocolBufferException {
        return this.L(codedInputStream0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Parser
    public Object d(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return this.y(codedInputStream0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Parser
    public Object e(byte[] arr_b, int v, int v1, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return this.Q(arr_b, v, v1, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Parser
    public Object f(ByteString byteString0) throws InvalidProtocolBufferException {
        return this.v(byteString0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Parser
    public Object g(ByteString byteString0) throws InvalidProtocolBufferException {
        return this.J(byteString0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Parser
    public Object h(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return this.I(inputStream0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Parser
    public Object j(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return this.u(inputStream0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Parser
    public Object k(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return this.A(inputStream0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Parser
    public Object l(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return this.w(byteString0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Parser
    public Object m(byte[] arr_b, int v, int v1, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return this.F(arr_b, v, v1, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Parser
    public Object n(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return this.K(byteString0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Parser
    public Object o(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return this.N(inputStream0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Parser
    public Object p(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return this.C(byteBuffer0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Parser
    public Object parseDelimitedFrom(InputStream inputStream0) throws InvalidProtocolBufferException {
        return this.t(inputStream0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Parser
    public Object parseFrom(InputStream inputStream0) throws InvalidProtocolBufferException {
        return this.z(inputStream0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Parser
    public Object parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return this.B(byteBuffer0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Parser
    public Object parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return this.D(arr_b);
    }

    @Override  // androidx.datastore.preferences.protobuf.Parser
    public Object parseFrom(byte[] arr_b, int v, int v1) throws InvalidProtocolBufferException {
        return this.E(arr_b, v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.Parser
    public Object parsePartialDelimitedFrom(InputStream inputStream0) throws InvalidProtocolBufferException {
        return this.H(inputStream0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Parser
    public Object parsePartialFrom(InputStream inputStream0) throws InvalidProtocolBufferException {
        return this.M(inputStream0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Parser
    public Object parsePartialFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return this.O(arr_b);
    }

    @Override  // androidx.datastore.preferences.protobuf.Parser
    public Object parsePartialFrom(byte[] arr_b, int v, int v1) throws InvalidProtocolBufferException {
        return this.P(arr_b, v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.Parser
    public Object q(CodedInputStream codedInputStream0) throws InvalidProtocolBufferException {
        return this.x(codedInputStream0);
    }

    private MessageLite r(MessageLite messageLite0) throws InvalidProtocolBufferException {
        if(messageLite0 != null && !messageLite0.isInitialized()) {
            throw this.s(messageLite0).a().j(messageLite0);
        }
        return messageLite0;
    }

    // 去混淆评级： 低(20)
    private UninitializedMessageException s(MessageLite messageLite0) {
        return messageLite0 instanceof AbstractMessageLite ? ((AbstractMessageLite)messageLite0).L() : new UninitializedMessageException(messageLite0);
    }

    public MessageLite t(InputStream inputStream0) throws InvalidProtocolBufferException {
        return this.u(inputStream0, AbstractParser.a);
    }

    public MessageLite u(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return this.r(this.I(inputStream0, extensionRegistryLite0));
    }

    public MessageLite v(ByteString byteString0) throws InvalidProtocolBufferException {
        return this.w(byteString0, AbstractParser.a);
    }

    public MessageLite w(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return this.r(this.K(byteString0, extensionRegistryLite0));
    }

    public MessageLite x(CodedInputStream codedInputStream0) throws InvalidProtocolBufferException {
        return this.y(codedInputStream0, AbstractParser.a);
    }

    public MessageLite y(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return this.r(((MessageLite)this.i(codedInputStream0, extensionRegistryLite0)));
    }

    public MessageLite z(InputStream inputStream0) throws InvalidProtocolBufferException {
        return this.A(inputStream0, AbstractParser.a);
    }
}

