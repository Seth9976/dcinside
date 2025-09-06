package androidx.datastore.preferences.protobuf;

import java.io.IOException;

public class LazyFieldLite {
    private ByteString a;
    private ExtensionRegistryLite b;
    protected volatile MessageLite c;
    private volatile ByteString d;
    private static final ExtensionRegistryLite e;

    static {
        LazyFieldLite.e = ExtensionRegistryLite.d();
    }

    public LazyFieldLite() {
    }

    public LazyFieldLite(ExtensionRegistryLite extensionRegistryLite0, ByteString byteString0) {
        LazyFieldLite.a(extensionRegistryLite0, byteString0);
        this.b = extensionRegistryLite0;
        this.a = byteString0;
    }

    private static void a(ExtensionRegistryLite extensionRegistryLite0, ByteString byteString0) {
        if(extensionRegistryLite0 == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if(byteString0 == null) {
            throw new NullPointerException("found null ByteString");
        }
    }

    public void b() {
        this.a = null;
        this.c = null;
        this.d = null;
    }

    public boolean c() {
        return this.d == ByteString.e || this.c == null && (this.a == null || this.a == ByteString.e);
    }

    protected void d(MessageLite messageLite0) {
        if(this.c != null) {
            return;
        }
        synchronized(this) {
            if(this.c != null) {
                return;
            }
            try {
                if(this.a == null) {
                    this.c = messageLite0;
                    this.d = ByteString.e;
                }
                else {
                    this.c = (MessageLite)messageLite0.getParserForType().l(this.a, this.b);
                    this.d = this.a;
                }
            }
            catch(InvalidProtocolBufferException unused_ex) {
                this.c = messageLite0;
                this.d = ByteString.e;
            }
        }
    }

    public static LazyFieldLite e(MessageLite messageLite0) {
        LazyFieldLite lazyFieldLite0 = new LazyFieldLite();
        lazyFieldLite0.m(messageLite0);
        return lazyFieldLite0;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof LazyFieldLite)) {
            return false;
        }
        MessageLite messageLite0 = this.c;
        MessageLite messageLite1 = ((LazyFieldLite)object0).c;
        if(messageLite0 == null && messageLite1 == null) {
            return this.n().equals(((LazyFieldLite)object0).n());
        }
        if(messageLite0 != null && messageLite1 != null) {
            return messageLite0.equals(messageLite1);
        }
        return messageLite0 == null ? this.g(messageLite1.getDefaultInstanceForType()).equals(messageLite1) : messageLite0.equals(((LazyFieldLite)object0).g(messageLite0.getDefaultInstanceForType()));
    }

    public int f() {
        if(this.d != null) {
            return this.d.size();
        }
        ByteString byteString0 = this.a;
        if(byteString0 != null) {
            return byteString0.size();
        }
        return this.c == null ? 0 : this.c.getSerializedSize();
    }

    public MessageLite g(MessageLite messageLite0) {
        this.d(messageLite0);
        return this.c;
    }

    public void h(LazyFieldLite lazyFieldLite0) {
        if(lazyFieldLite0.c()) {
            return;
        }
        if(this.c()) {
            this.k(lazyFieldLite0);
            return;
        }
        if(this.b == null) {
            this.b = lazyFieldLite0.b;
        }
        ByteString byteString0 = this.a;
        if(byteString0 != null) {
            ByteString byteString1 = lazyFieldLite0.a;
            if(byteString1 != null) {
                this.a = byteString0.j(byteString1);
                return;
            }
        }
        if(this.c == null && lazyFieldLite0.c != null) {
            this.m(LazyFieldLite.j(lazyFieldLite0.c, this.a, this.b));
            return;
        }
        if(this.c != null && lazyFieldLite0.c == null) {
            this.m(LazyFieldLite.j(this.c, lazyFieldLite0.a, lazyFieldLite0.b));
            return;
        }
        this.m(this.c.toBuilder().l1(lazyFieldLite0.c).build());
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public void i(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        if(this.c()) {
            this.l(codedInputStream0.x(), extensionRegistryLite0);
            return;
        }
        if(this.b == null) {
            this.b = extensionRegistryLite0;
        }
        ByteString byteString0 = this.a;
        if(byteString0 != null) {
            this.l(byteString0.j(codedInputStream0.x()), this.b);
            return;
        }
        try {
            this.m(this.c.toBuilder().Z7(codedInputStream0, extensionRegistryLite0).build());
        }
        catch(InvalidProtocolBufferException unused_ex) {
        }
    }

    private static MessageLite j(MessageLite messageLite0, ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) {
        try {
            return messageLite0.toBuilder().A8(byteString0, extensionRegistryLite0).build();
        }
        catch(InvalidProtocolBufferException unused_ex) {
            return messageLite0;
        }
    }

    public void k(LazyFieldLite lazyFieldLite0) {
        this.a = lazyFieldLite0.a;
        this.c = lazyFieldLite0.c;
        this.d = lazyFieldLite0.d;
        ExtensionRegistryLite extensionRegistryLite0 = lazyFieldLite0.b;
        if(extensionRegistryLite0 != null) {
            this.b = extensionRegistryLite0;
        }
    }

    public void l(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) {
        LazyFieldLite.a(extensionRegistryLite0, byteString0);
        this.a = byteString0;
        this.b = extensionRegistryLite0;
        this.c = null;
        this.d = null;
    }

    public MessageLite m(MessageLite messageLite0) {
        MessageLite messageLite1 = this.c;
        this.a = null;
        this.d = null;
        this.c = messageLite0;
        return messageLite1;
    }

    public ByteString n() {
        if(this.d != null) {
            return this.d;
        }
        ByteString byteString0 = this.a;
        if(byteString0 != null) {
            return byteString0;
        }
        synchronized(this) {
            if(this.d != null) {
                return this.d;
            }
            this.d = this.c == null ? ByteString.e : this.c.toByteString();
            return this.d;
        }
    }

    void o(Writer writer0, int v) throws IOException {
        if(this.d != null) {
            writer0.a(v, this.d);
            return;
        }
        ByteString byteString0 = this.a;
        if(byteString0 != null) {
            writer0.a(v, byteString0);
            return;
        }
        if(this.c != null) {
            writer0.writeMessage(v, this.c);
            return;
        }
        writer0.a(v, ByteString.e);
    }
}

