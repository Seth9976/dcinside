package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class StructuralMessageInfo implements MessageInfo {
    public static final class Builder {
        private final List a;
        private ProtoSyntax b;
        private boolean c;
        private boolean d;
        private int[] e;
        private Object f;

        public Builder() {
            this.e = null;
            this.a = new ArrayList();
        }

        public Builder(int v) {
            this.e = null;
            this.a = new ArrayList(v);
        }

        public StructuralMessageInfo a() {
            if(this.c) {
                throw new IllegalStateException("Builder can only build once");
            }
            if(this.b == null) {
                throw new IllegalStateException("Must specify a proto syntax");
            }
            this.c = true;
            Collections.sort(this.a);
            return new StructuralMessageInfo(this.b, this.d, this.e, ((FieldInfo[])this.a.toArray(new FieldInfo[0])), this.f);
        }

        public void b(int[] arr_v) {
            this.e = arr_v;
        }

        public void c(Object object0) {
            this.f = object0;
        }

        public void d(FieldInfo fieldInfo0) {
            if(this.c) {
                throw new IllegalStateException("Builder can only build once");
            }
            this.a.add(fieldInfo0);
        }

        public void e(boolean z) {
            this.d = z;
        }

        public void f(ProtoSyntax protoSyntax0) {
            this.b = (ProtoSyntax)Internal.e(protoSyntax0, "syntax");
        }
    }

    private final ProtoSyntax a;
    private final boolean b;
    private final int[] c;
    private final FieldInfo[] d;
    private final MessageLite e;

    StructuralMessageInfo(ProtoSyntax protoSyntax0, boolean z, int[] arr_v, FieldInfo[] arr_fieldInfo, Object object0) {
        this.a = protoSyntax0;
        this.b = z;
        this.c = arr_v;
        this.d = arr_fieldInfo;
        this.e = (MessageLite)Internal.e(object0, "defaultInstance");
    }

    public int[] a() {
        return this.c;
    }

    public FieldInfo[] b() {
        return this.d;
    }

    public static Builder c() {
        return new Builder();
    }

    public static Builder d(int v) {
        return new Builder(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageInfo
    public MessageLite getDefaultInstance() {
        return this.e;
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageInfo
    public ProtoSyntax getSyntax() {
        return this.a;
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageInfo
    public boolean isMessageSetWireFormat() {
        return this.b;
    }
}

