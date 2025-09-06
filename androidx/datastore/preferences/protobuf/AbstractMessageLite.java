package androidx.datastore.preferences.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class AbstractMessageLite implements MessageLite {
    public static abstract class Builder implements androidx.datastore.preferences.protobuf.MessageLite.Builder {
        static final class LimitedInputStream extends FilterInputStream {
            private int a;

            LimitedInputStream(InputStream inputStream0, int v) {
                super(inputStream0);
                this.a = v;
            }

            @Override
            public int available() throws IOException {
                return Math.min(super.available(), this.a);
            }

            @Override
            public int read() throws IOException {
                if(this.a <= 0) {
                    return -1;
                }
                int v = super.read();
                if(v >= 0) {
                    --this.a;
                }
                return v;
            }

            @Override
            public int read(byte[] arr_b, int v, int v1) throws IOException {
                int v2 = this.a;
                if(v2 <= 0) {
                    return -1;
                }
                int v3 = super.read(arr_b, v, Math.min(v1, v2));
                if(v3 >= 0) {
                    this.a -= v3;
                }
                return v3;
            }

            @Override
            public long skip(long v) throws IOException {
                long v1 = super.skip(Math.min(v, this.a));
                if(v1 >= 0L) {
                    this.a = (int)(((long)this.a) - v1);
                }
                return v1;
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder A6(CodedInputStream codedInputStream0) throws IOException {
            return this.O(codedInputStream0);
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder A8(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return this.N(byteString0, extensionRegistryLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder F3(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return this.S(inputStream0, extensionRegistryLite0);
        }

        @Deprecated
        protected static void G(Iterable iterable0, Collection collection0) {
            Builder.H(iterable0, ((List)collection0));
        }

        protected static void H(Iterable iterable0, List list0) {
            Internal.d(iterable0);
            if(iterable0 instanceof LazyStringList) {
                List list1 = ((LazyStringList)iterable0).getUnderlyingElements();
                int v = list0.size();
                for(Object object0: list1) {
                    if(object0 == null) {
                        String s = "Element at index " + (((LazyStringList)list0).size() - v) + " is null.";
                        for(int v1 = ((LazyStringList)list0).size() - 1; v1 >= v; --v1) {
                            ((LazyStringList)list0).remove(v1);
                        }
                        throw new NullPointerException(s);
                    }
                    if(object0 instanceof ByteString) {
                        ((LazyStringList)list0).i1(((ByteString)object0));
                    }
                    else {
                        ((LazyStringList)list0).add(((String)object0));
                    }
                }
                return;
            }
            if(iterable0 instanceof PrimitiveNonBoxingCollection) {
                list0.addAll(((Collection)iterable0));
                return;
            }
            Builder.I(iterable0, list0);
        }

        private static void I(Iterable iterable0, List list0) {
            if(list0 instanceof ArrayList && iterable0 instanceof Collection) {
                ((ArrayList)list0).ensureCapacity(list0.size() + ((Collection)iterable0).size());
            }
            int v = list0.size();
            for(Object object0: iterable0) {
                if(object0 == null) {
                    String s = "Element at index " + (list0.size() - v) + " is null.";
                    for(int v1 = list0.size() - 1; v1 >= v; --v1) {
                        list0.remove(v1);
                    }
                    throw new NullPointerException(s);
                }
                list0.add(object0);
            }
        }

        public abstract Builder J();

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public boolean Ja(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            int v = inputStream0.read();
            if(v == -1) {
                return false;
            }
            this.S(new LimitedInputStream(inputStream0, CodedInputStream.O(v, inputStream0)), extensionRegistryLite0);
            return true;
        }

        private String K(String s) [...] // 潜在的解密器

        protected abstract Builder L(AbstractMessageLite arg1);

        public Builder M(ByteString byteString0) throws InvalidProtocolBufferException {
            try {
                CodedInputStream codedInputStream0 = byteString0.H();
                this.O(codedInputStream0);
                codedInputStream0.a(0);
                return this;
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                throw invalidProtocolBufferException0;
            }
            catch(IOException iOException0) {
                throw new RuntimeException("Reading androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder from a ByteString threw an IOException (should never happen).", iOException0);
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder M6(byte[] arr_b, int v, int v1, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return this.V(arr_b, v, v1, extensionRegistryLite0);
        }

        public Builder N(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            try {
                CodedInputStream codedInputStream0 = byteString0.H();
                this.P(codedInputStream0, extensionRegistryLite0);
                codedInputStream0.a(0);
                return this;
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                throw invalidProtocolBufferException0;
            }
            catch(IOException iOException0) {
                throw new RuntimeException("Reading androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder from a ByteString threw an IOException (should never happen).", iOException0);
            }
        }

        public Builder O(CodedInputStream codedInputStream0) throws IOException {
            return this.P(codedInputStream0, ExtensionRegistryLite.d());
        }

        public abstract Builder P(CodedInputStream arg1, ExtensionRegistryLite arg2) throws IOException;

        public Builder Q(MessageLite messageLite0) {
            if(!this.getDefaultInstanceForType().getClass().isInstance(messageLite0)) {
                throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
            }
            return this.L(((AbstractMessageLite)messageLite0));
        }

        public Builder R(InputStream inputStream0) throws IOException {
            CodedInputStream codedInputStream0 = CodedInputStream.j(inputStream0);
            this.O(codedInputStream0);
            codedInputStream0.a(0);
            return this;
        }

        public Builder S(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            CodedInputStream codedInputStream0 = CodedInputStream.j(inputStream0);
            this.P(codedInputStream0, extensionRegistryLite0);
            codedInputStream0.a(0);
            return this;
        }

        public Builder T(byte[] arr_b) throws InvalidProtocolBufferException {
            return this.U(arr_b, 0, arr_b.length);
        }

        public Builder U(byte[] arr_b, int v, int v1) throws InvalidProtocolBufferException {
            try {
                CodedInputStream codedInputStream0 = CodedInputStream.q(arr_b, v, v1);
                this.O(codedInputStream0);
                codedInputStream0.a(0);
                return this;
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                throw invalidProtocolBufferException0;
            }
            catch(IOException iOException0) {
                throw new RuntimeException("Reading androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder from a byte array threw an IOException (should never happen).", iOException0);
            }
        }

        public Builder V(byte[] arr_b, int v, int v1, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            try {
                CodedInputStream codedInputStream0 = CodedInputStream.q(arr_b, v, v1);
                this.P(codedInputStream0, extensionRegistryLite0);
                codedInputStream0.a(0);
                return this;
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                throw invalidProtocolBufferException0;
            }
            catch(IOException iOException0) {
                throw new RuntimeException("Reading androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder from a byte array threw an IOException (should never happen).", iOException0);
            }
        }

        public Builder W(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return this.V(arr_b, 0, arr_b.length, extensionRegistryLite0);
        }

        protected static UninitializedMessageException X(MessageLite messageLite0) {
            return new UninitializedMessageException(messageLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder Z7(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return this.P(codedInputStream0, extensionRegistryLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder clone() {
            return this.J();
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return this.J();
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder l1(MessageLite messageLite0) {
            return this.Q(messageLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public boolean mergeDelimitedFrom(InputStream inputStream0) throws IOException {
            return this.Ja(inputStream0, ExtensionRegistryLite.d());
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(InputStream inputStream0) throws IOException {
            return this.R(inputStream0);
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return this.T(arr_b);
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(byte[] arr_b, int v, int v1) throws InvalidProtocolBufferException {
            return this.U(arr_b, v, v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder v8(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return this.W(arr_b, extensionRegistryLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder z6(ByteString byteString0) throws InvalidProtocolBufferException {
            return this.M(byteString0);
        }
    }

    public interface InternalOneOfEnum {
        int getNumber();
    }

    protected int memoizedHashCode;

    public AbstractMessageLite() {
        this.memoizedHashCode = 0;
    }

    protected static void G(Iterable iterable0, List list0) {
        Builder.H(iterable0, list0);
    }

    protected static void H(ByteString byteString0) throws IllegalArgumentException {
        if(!byteString0.E()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    int I() {
        throw new UnsupportedOperationException();
    }

    int J(Schema schema0) {
        int v = this.I();
        if(v == -1) {
            v = schema0.getSerializedSize(this);
            this.M(v);
        }
        return v;
    }

    private String K(String s) [...] // 潜在的解密器

    UninitializedMessageException L() {
        return new UninitializedMessageException(this);
    }

    void M(int v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    protected static void i(Iterable iterable0, Collection collection0) {
        Builder.H(iterable0, ((List)collection0));
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageLite
    public byte[] toByteArray() {
        try {
            byte[] arr_b = new byte[this.getSerializedSize()];
            CodedOutputStream codedOutputStream0 = CodedOutputStream.A0(arr_b);
            this.n(codedOutputStream0);
            codedOutputStream0.m();
            return arr_b;
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Serializing androidx.datastore.preferences.protobuf.AbstractMessageLite to a byte array threw an IOException (should never happen).", iOException0);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageLite
    public ByteString toByteString() {
        try {
            CodedBuilder byteString$CodedBuilder0 = ByteString.G(this.getSerializedSize());
            this.n(byteString$CodedBuilder0.b());
            return byteString$CodedBuilder0.a();
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Serializing androidx.datastore.preferences.protobuf.AbstractMessageLite to a ByteString threw an IOException (should never happen).", iOException0);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageLite
    public void writeDelimitedTo(OutputStream outputStream0) throws IOException {
        int v = this.getSerializedSize();
        CodedOutputStream codedOutputStream0 = CodedOutputStream.x0(outputStream0, CodedOutputStream.W(CodedOutputStream.Y(v) + v));
        codedOutputStream0.m1(v);
        this.n(codedOutputStream0);
        codedOutputStream0.r0();
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageLite
    public void writeTo(OutputStream outputStream0) throws IOException {
        CodedOutputStream codedOutputStream0 = CodedOutputStream.x0(outputStream0, CodedOutputStream.W(this.getSerializedSize()));
        this.n(codedOutputStream0);
        codedOutputStream0.r0();
    }
}

