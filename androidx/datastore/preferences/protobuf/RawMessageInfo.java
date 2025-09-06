package androidx.datastore.preferences.protobuf;

final class RawMessageInfo implements MessageInfo {
    private final MessageLite a;
    private final String b;
    private final Object[] c;
    private final int d;

    RawMessageInfo(MessageLite messageLite0, String s, Object[] arr_object) {
        this.a = messageLite0;
        this.b = s;
        this.c = arr_object;
        int v = s.charAt(0);
        if(v < 0xD800) {
            this.d = v;
            return;
        }
        int v1 = v & 0x1FFF;
        int v2 = 13;
        int v4;
        for(int v3 = 1; (v4 = s.charAt(v3)) >= 0xD800; ++v3) {
            v1 |= (v4 & 0x1FFF) << v2;
            v2 += 13;
        }
        this.d = v1 | v4 << v2;
    }

    Object[] a() {
        return this.c;
    }

    String b() {
        return this.b;
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageInfo
    public MessageLite getDefaultInstance() {
        return this.a;
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageInfo
    public ProtoSyntax getSyntax() {
        return (this.d & 1) == 1 ? ProtoSyntax.a : ProtoSyntax.b;
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageInfo
    public boolean isMessageSetWireFormat() {
        return (this.d & 2) == 2;
    }
}

