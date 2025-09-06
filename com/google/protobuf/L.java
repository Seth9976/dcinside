package com.google.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@k
final class l implements a0 {
    static class a {
        static final int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] arr_v = new int[FieldType.values().length];
            a.$SwitchMap$com$google$protobuf$WireFormat$FieldType = arr_v;
            try {
                arr_v[FieldType.BOOL.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.BYTES.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.DOUBLE.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.ENUM.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.FIXED32.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.FIXED64.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.FLOAT.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.INT32.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.INT64.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.MESSAGE.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.SFIXED32.ordinal()] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.SFIXED64.ordinal()] = 12;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.SINT32.ordinal()] = 13;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.SINT64.ordinal()] = 14;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.STRING.ordinal()] = 15;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.UINT32.ordinal()] = 16;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.UINT64.ordinal()] = 17;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private static final int FIXED32_MULTIPLE_MASK = 3;
    private static final int FIXED64_MULTIPLE_MASK = 7;
    private static final int NEXT_TAG_UNSET;
    private int endGroupTag;
    private final CodedInputStream input;
    private int nextTag;
    private int tag;

    private l(CodedInputStream codedInputStream0) {
        this.nextTag = 0;
        CodedInputStream codedInputStream1 = (CodedInputStream)Internal.checkNotNull(codedInputStream0, "input");
        this.input = codedInputStream1;
        codedInputStream1.wrapper = this;
    }

    public static l forCodedInput(CodedInputStream codedInputStream0) {
        l l0 = codedInputStream0.wrapper;
        return l0 == null ? new l(codedInputStream0) : l0;
    }

    @Override  // com.google.protobuf.a0
    public int getFieldNumber() throws IOException {
        int v = this.nextTag;
        if(v != 0) {
            this.tag = v;
            this.nextTag = 0;
            return this.tag == 0 || this.tag == this.endGroupTag ? 0x7FFFFFFF : this.tag >>> 3;
        }
        this.tag = this.input.readTag();
        return this.tag == 0 || this.tag == this.endGroupTag ? 0x7FFFFFFF : this.tag >>> 3;
    }

    @Override  // com.google.protobuf.a0
    public int getTag() {
        return this.tag;
    }

    @Override  // com.google.protobuf.a0
    public void mergeGroupField(Object object0, c0 c00, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        this.requireWireType(3);
        this.mergeGroupFieldInternal(object0, c00, extensionRegistryLite0);
    }

    private void mergeGroupFieldInternal(Object object0, c0 c00, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        int v1;
        try {
            v1 = this.endGroupTag;
            this.endGroupTag = this.tag >>> 3 << 3 | 4;
            c00.mergeFrom(object0, this, extensionRegistryLite0);
            if(this.tag == this.endGroupTag) {
                return;
            }
        }
        finally {
            this.endGroupTag = v1;
        }
        throw InvalidProtocolBufferException.parseFailure();
    }

    @Override  // com.google.protobuf.a0
    public void mergeMessageField(Object object0, c0 c00, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        this.requireWireType(2);
        this.mergeMessageFieldInternal(object0, c00, extensionRegistryLite0);
    }

    private void mergeMessageFieldInternal(Object object0, c0 c00, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        int v = this.input.readUInt32();
        CodedInputStream codedInputStream0 = this.input;
        if(codedInputStream0.recursionDepth >= codedInputStream0.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int v1 = codedInputStream0.pushLimit(v);
        ++this.input.recursionDepth;
        c00.mergeFrom(object0, this, extensionRegistryLite0);
        this.input.checkLastTagWas(0);
        --this.input.recursionDepth;
        this.input.popLimit(v1);
    }

    @Override  // com.google.protobuf.a0
    public boolean readBool() throws IOException {
        this.requireWireType(0);
        return this.input.readBool();
    }

    @Override  // com.google.protobuf.a0
    public void readBoolList(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof g) {
            switch(this.tag & 7) {
                case 0: {
                    do {
                        ((g)list0).addBoolean(this.input.readBool());
                        if(this.input.isAtEnd()) {
                            return;
                        }
                        v = this.input.readTag();
                    }
                    while(v == this.tag);
                    this.nextTag = v;
                    return;
                }
                case 2: {
                    int v1 = this.input.readUInt32();
                    int v2 = this.input.getTotalBytesRead() + v1;
                    do {
                        ((g)list0).addBoolean(this.input.readBool());
                    }
                    while(this.input.getTotalBytesRead() < v2);
                    this.requirePosition(v2);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }
        switch(this.tag & 7) {
            case 0: {
                do {
                    list0.add(Boolean.valueOf(this.input.readBool()));
                    if(this.input.isAtEnd()) {
                        return;
                    }
                    v3 = this.input.readTag();
                }
                while(v3 == this.tag);
                this.nextTag = v3;
                return;
            }
            case 2: {
                int v4 = this.input.readUInt32();
                int v5 = this.input.getTotalBytesRead() + v4;
                do {
                    list0.add(Boolean.valueOf(this.input.readBool()));
                }
                while(this.input.getTotalBytesRead() < v5);
                this.requirePosition(v5);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    @Override  // com.google.protobuf.a0
    public ByteString readBytes() throws IOException {
        this.requireWireType(2);
        return this.input.readBytes();
    }

    @Override  // com.google.protobuf.a0
    public void readBytesList(List list0) throws IOException {
        int v;
        if((this.tag & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list0.add(this.readBytes());
            if(this.input.isAtEnd()) {
                return;
            }
            v = this.input.readTag();
        }
        while(v == this.tag);
        this.nextTag = v;
    }

    @Override  // com.google.protobuf.a0
    public double readDouble() throws IOException {
        this.requireWireType(1);
        return this.input.readDouble();
    }

    @Override  // com.google.protobuf.a0
    public void readDoubleList(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof o) {
            switch(this.tag & 7) {
                case 1: {
                    do {
                        ((o)list0).addDouble(this.input.readDouble());
                        if(this.input.isAtEnd()) {
                            return;
                        }
                        v = this.input.readTag();
                    }
                    while(v == this.tag);
                    this.nextTag = v;
                    return;
                }
                case 2: {
                    int v1 = this.input.readUInt32();
                    this.verifyPackedFixed64Length(v1);
                    int v2 = this.input.getTotalBytesRead();
                    do {
                        ((o)list0).addDouble(this.input.readDouble());
                    }
                    while(this.input.getTotalBytesRead() < v2 + v1);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }
        switch(this.tag & 7) {
            case 1: {
                do {
                    list0.add(this.input.readDouble());
                    if(this.input.isAtEnd()) {
                        return;
                    }
                    v3 = this.input.readTag();
                }
                while(v3 == this.tag);
                this.nextTag = v3;
                return;
            }
            case 2: {
                int v4 = this.input.readUInt32();
                this.verifyPackedFixed64Length(v4);
                int v5 = this.input.getTotalBytesRead();
                do {
                    list0.add(this.input.readDouble());
                }
                while(this.input.getTotalBytesRead() < v5 + v4);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    @Override  // com.google.protobuf.a0
    public int readEnum() throws IOException {
        this.requireWireType(0);
        return this.input.readEnum();
    }

    @Override  // com.google.protobuf.a0
    public void readEnumList(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof w) {
            switch(this.tag & 7) {
                case 0: {
                    do {
                        ((w)list0).addInt(this.input.readEnum());
                        if(this.input.isAtEnd()) {
                            return;
                        }
                        v = this.input.readTag();
                    }
                    while(v == this.tag);
                    this.nextTag = v;
                    return;
                }
                case 2: {
                    int v1 = this.input.readUInt32();
                    int v2 = this.input.getTotalBytesRead() + v1;
                    do {
                        ((w)list0).addInt(this.input.readEnum());
                    }
                    while(this.input.getTotalBytesRead() < v2);
                    this.requirePosition(v2);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }
        switch(this.tag & 7) {
            case 0: {
                do {
                    list0.add(this.input.readEnum());
                    if(this.input.isAtEnd()) {
                        return;
                    }
                    v3 = this.input.readTag();
                }
                while(v3 == this.tag);
                this.nextTag = v3;
                return;
            }
            case 2: {
                int v4 = this.input.readUInt32();
                int v5 = this.input.getTotalBytesRead() + v4;
                do {
                    list0.add(this.input.readEnum());
                }
                while(this.input.getTotalBytesRead() < v5);
                this.requirePosition(v5);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    private Object readField(FieldType wireFormat$FieldType0, Class class0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        switch(wireFormat$FieldType0) {
            case 1: {
                return Boolean.valueOf(this.readBool());
            }
            case 2: {
                return this.readBytes();
            }
            case 3: {
                return this.readDouble();
            }
            case 4: {
                return this.readEnum();
            }
            case 5: {
                return this.readFixed32();
            }
            case 6: {
                return this.readFixed64();
            }
            case 7: {
                return this.readFloat();
            }
            case 8: {
                return this.readInt32();
            }
            case 9: {
                return this.readInt64();
            }
            case 10: {
                return this.readMessage(class0, extensionRegistryLite0);
            }
            case 11: {
                return this.readSFixed32();
            }
            case 12: {
                return this.readSFixed64();
            }
            case 13: {
                return this.readSInt32();
            }
            case 14: {
                return this.readSInt64();
            }
            case 15: {
                return this.readStringRequireUtf8();
            }
            case 16: {
                return this.readUInt32();
            }
            case 17: {
                return this.readUInt64();
            }
            default: {
                throw new IllegalArgumentException("unsupported field type.");
            }
        }
    }

    @Override  // com.google.protobuf.a0
    public int readFixed32() throws IOException {
        this.requireWireType(5);
        return this.input.readFixed32();
    }

    @Override  // com.google.protobuf.a0
    public void readFixed32List(List list0) throws IOException {
        int v5;
        int v2;
        if(list0 instanceof w) {
            switch(this.tag & 7) {
                case 2: {
                    int v = this.input.readUInt32();
                    this.verifyPackedFixed32Length(v);
                    int v1 = this.input.getTotalBytesRead();
                    do {
                        ((w)list0).addInt(this.input.readFixed32());
                    }
                    while(this.input.getTotalBytesRead() < v1 + v);
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
            do {
                ((w)list0).addInt(this.input.readFixed32());
                if(this.input.isAtEnd()) {
                    return;
                }
                v2 = this.input.readTag();
            }
            while(v2 == this.tag);
            this.nextTag = v2;
            return;
        }
        switch(this.tag & 7) {
            case 2: {
                int v3 = this.input.readUInt32();
                this.verifyPackedFixed32Length(v3);
                int v4 = this.input.getTotalBytesRead();
                do {
                    list0.add(this.input.readFixed32());
                }
                while(this.input.getTotalBytesRead() < v4 + v3);
                return;
            }
            case 5: {
                break;
            }
            default: {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
        do {
            list0.add(this.input.readFixed32());
            if(this.input.isAtEnd()) {
                return;
            }
            v5 = this.input.readTag();
        }
        while(v5 == this.tag);
        this.nextTag = v5;
    }

    @Override  // com.google.protobuf.a0
    public long readFixed64() throws IOException {
        this.requireWireType(1);
        return this.input.readFixed64();
    }

    @Override  // com.google.protobuf.a0
    public void readFixed64List(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof F) {
            switch(this.tag & 7) {
                case 1: {
                    do {
                        ((F)list0).addLong(this.input.readFixed64());
                        if(this.input.isAtEnd()) {
                            return;
                        }
                        v = this.input.readTag();
                    }
                    while(v == this.tag);
                    this.nextTag = v;
                    return;
                }
                case 2: {
                    int v1 = this.input.readUInt32();
                    this.verifyPackedFixed64Length(v1);
                    int v2 = this.input.getTotalBytesRead();
                    do {
                        ((F)list0).addLong(this.input.readFixed64());
                    }
                    while(this.input.getTotalBytesRead() < v2 + v1);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }
        switch(this.tag & 7) {
            case 1: {
                do {
                    list0.add(this.input.readFixed64());
                    if(this.input.isAtEnd()) {
                        return;
                    }
                    v3 = this.input.readTag();
                }
                while(v3 == this.tag);
                this.nextTag = v3;
                return;
            }
            case 2: {
                int v4 = this.input.readUInt32();
                this.verifyPackedFixed64Length(v4);
                int v5 = this.input.getTotalBytesRead();
                do {
                    list0.add(this.input.readFixed64());
                }
                while(this.input.getTotalBytesRead() < v5 + v4);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    @Override  // com.google.protobuf.a0
    public float readFloat() throws IOException {
        this.requireWireType(5);
        return this.input.readFloat();
    }

    @Override  // com.google.protobuf.a0
    public void readFloatList(List list0) throws IOException {
        int v5;
        int v2;
        if(list0 instanceof t) {
            switch(this.tag & 7) {
                case 2: {
                    int v = this.input.readUInt32();
                    this.verifyPackedFixed32Length(v);
                    int v1 = this.input.getTotalBytesRead();
                    do {
                        ((t)list0).addFloat(this.input.readFloat());
                    }
                    while(this.input.getTotalBytesRead() < v1 + v);
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
            do {
                ((t)list0).addFloat(this.input.readFloat());
                if(this.input.isAtEnd()) {
                    return;
                }
                v2 = this.input.readTag();
            }
            while(v2 == this.tag);
            this.nextTag = v2;
            return;
        }
        switch(this.tag & 7) {
            case 2: {
                int v3 = this.input.readUInt32();
                this.verifyPackedFixed32Length(v3);
                int v4 = this.input.getTotalBytesRead();
                do {
                    list0.add(this.input.readFloat());
                }
                while(this.input.getTotalBytesRead() < v4 + v3);
                return;
            }
            case 5: {
                break;
            }
            default: {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
        do {
            list0.add(this.input.readFloat());
            if(this.input.isAtEnd()) {
                return;
            }
            v5 = this.input.readTag();
        }
        while(v5 == this.tag);
        this.nextTag = v5;
    }

    private Object readGroup(c0 c00, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        Object object0 = c00.newInstance();
        this.mergeGroupFieldInternal(object0, c00, extensionRegistryLite0);
        c00.makeImmutable(object0);
        return object0;
    }

    @Override  // com.google.protobuf.a0
    @Deprecated
    public Object readGroup(Class class0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        this.requireWireType(3);
        return this.readGroup(X.getInstance().schemaFor(class0), extensionRegistryLite0);
    }

    @Override  // com.google.protobuf.a0
    @Deprecated
    public Object readGroupBySchemaWithCheck(c0 c00, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        this.requireWireType(3);
        return this.readGroup(c00, extensionRegistryLite0);
    }

    @Override  // com.google.protobuf.a0
    @Deprecated
    public void readGroupList(List list0, c0 c00, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        if((this.tag & 7) != 3) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int v = this.tag;
        while(true) {
            list0.add(this.readGroup(c00, extensionRegistryLite0));
            if(this.input.isAtEnd() || this.nextTag != 0) {
                break;
            }
            int v1 = this.input.readTag();
            if(v1 != v) {
                this.nextTag = v1;
                return;
            }
        }
    }

    @Override  // com.google.protobuf.a0
    @Deprecated
    public void readGroupList(List list0, Class class0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        this.readGroupList(list0, X.getInstance().schemaFor(class0), extensionRegistryLite0);
    }

    @Override  // com.google.protobuf.a0
    public int readInt32() throws IOException {
        this.requireWireType(0);
        return this.input.readInt32();
    }

    @Override  // com.google.protobuf.a0
    public void readInt32List(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof w) {
            switch(this.tag & 7) {
                case 0: {
                    do {
                        ((w)list0).addInt(this.input.readInt32());
                        if(this.input.isAtEnd()) {
                            return;
                        }
                        v = this.input.readTag();
                    }
                    while(v == this.tag);
                    this.nextTag = v;
                    return;
                }
                case 2: {
                    int v1 = this.input.readUInt32();
                    int v2 = this.input.getTotalBytesRead() + v1;
                    do {
                        ((w)list0).addInt(this.input.readInt32());
                    }
                    while(this.input.getTotalBytesRead() < v2);
                    this.requirePosition(v2);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }
        switch(this.tag & 7) {
            case 0: {
                do {
                    list0.add(this.input.readInt32());
                    if(this.input.isAtEnd()) {
                        return;
                    }
                    v3 = this.input.readTag();
                }
                while(v3 == this.tag);
                this.nextTag = v3;
                return;
            }
            case 2: {
                int v4 = this.input.readUInt32();
                int v5 = this.input.getTotalBytesRead() + v4;
                do {
                    list0.add(this.input.readInt32());
                }
                while(this.input.getTotalBytesRead() < v5);
                this.requirePosition(v5);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    @Override  // com.google.protobuf.a0
    public long readInt64() throws IOException {
        this.requireWireType(0);
        return this.input.readInt64();
    }

    @Override  // com.google.protobuf.a0
    public void readInt64List(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof F) {
            switch(this.tag & 7) {
                case 0: {
                    do {
                        ((F)list0).addLong(this.input.readInt64());
                        if(this.input.isAtEnd()) {
                            return;
                        }
                        v = this.input.readTag();
                    }
                    while(v == this.tag);
                    this.nextTag = v;
                    return;
                }
                case 2: {
                    int v1 = this.input.readUInt32();
                    int v2 = this.input.getTotalBytesRead() + v1;
                    do {
                        ((F)list0).addLong(this.input.readInt64());
                    }
                    while(this.input.getTotalBytesRead() < v2);
                    this.requirePosition(v2);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }
        switch(this.tag & 7) {
            case 0: {
                do {
                    list0.add(this.input.readInt64());
                    if(this.input.isAtEnd()) {
                        return;
                    }
                    v3 = this.input.readTag();
                }
                while(v3 == this.tag);
                this.nextTag = v3;
                return;
            }
            case 2: {
                int v4 = this.input.readUInt32();
                int v5 = this.input.getTotalBytesRead() + v4;
                do {
                    list0.add(this.input.readInt64());
                }
                while(this.input.getTotalBytesRead() < v5);
                this.requirePosition(v5);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    @Override  // com.google.protobuf.a0
    public void readMap(Map map0, b mapEntryLite$b0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        this.requireWireType(2);
        int v = this.input.readUInt32();
        int v1 = this.input.pushLimit(v);
        Object object0 = mapEntryLite$b0.defaultKey;
        Object object1 = mapEntryLite$b0.defaultValue;
        try {
        alab1:
            while(true) {
                while(true) {
                    int v3 = this.getFieldNumber();
                    if(v3 == 0x7FFFFFFF || this.input.isAtEnd()) {
                        break alab1;
                    }
                    try {
                        switch(v3) {
                            case 1: {
                                object0 = this.readField(mapEntryLite$b0.keyType, null, null);
                                continue;
                            }
                            case 2: {
                                goto label_14;
                            }
                            default: {
                                if(this.skipField()) {
                                    continue;
                                }
                            }
                        }
                        throw new InvalidProtocolBufferException("Unable to parse map entry.");
                    label_14:
                        Class class0 = mapEntryLite$b0.defaultValue.getClass();
                        object1 = this.readField(mapEntryLite$b0.valueType, class0, extensionRegistryLite0);
                        continue;
                    }
                    catch(InvalidWireTypeException unused_ex) {
                    }
                    break;
                }
                if(!this.skipField()) {
                    throw new InvalidProtocolBufferException("Unable to parse map entry.");
                }
            }
            map0.put(object0, object1);
        }
        finally {
            this.input.popLimit(v1);
        }
    }

    private Object readMessage(c0 c00, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        Object object0 = c00.newInstance();
        this.mergeMessageFieldInternal(object0, c00, extensionRegistryLite0);
        c00.makeImmutable(object0);
        return object0;
    }

    @Override  // com.google.protobuf.a0
    public Object readMessage(Class class0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        this.requireWireType(2);
        return this.readMessage(X.getInstance().schemaFor(class0), extensionRegistryLite0);
    }

    @Override  // com.google.protobuf.a0
    public Object readMessageBySchemaWithCheck(c0 c00, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        this.requireWireType(2);
        return this.readMessage(c00, extensionRegistryLite0);
    }

    @Override  // com.google.protobuf.a0
    public void readMessageList(List list0, c0 c00, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        if((this.tag & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int v = this.tag;
        while(true) {
            list0.add(this.readMessage(c00, extensionRegistryLite0));
            if(this.input.isAtEnd() || this.nextTag != 0) {
                break;
            }
            int v1 = this.input.readTag();
            if(v1 != v) {
                this.nextTag = v1;
                return;
            }
        }
    }

    @Override  // com.google.protobuf.a0
    public void readMessageList(List list0, Class class0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        this.readMessageList(list0, X.getInstance().schemaFor(class0), extensionRegistryLite0);
    }

    @Override  // com.google.protobuf.a0
    public int readSFixed32() throws IOException {
        this.requireWireType(5);
        return this.input.readSFixed32();
    }

    @Override  // com.google.protobuf.a0
    public void readSFixed32List(List list0) throws IOException {
        int v5;
        int v2;
        if(list0 instanceof w) {
            switch(this.tag & 7) {
                case 2: {
                    int v = this.input.readUInt32();
                    this.verifyPackedFixed32Length(v);
                    int v1 = this.input.getTotalBytesRead();
                    do {
                        ((w)list0).addInt(this.input.readSFixed32());
                    }
                    while(this.input.getTotalBytesRead() < v1 + v);
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
            do {
                ((w)list0).addInt(this.input.readSFixed32());
                if(this.input.isAtEnd()) {
                    return;
                }
                v2 = this.input.readTag();
            }
            while(v2 == this.tag);
            this.nextTag = v2;
            return;
        }
        switch(this.tag & 7) {
            case 2: {
                int v3 = this.input.readUInt32();
                this.verifyPackedFixed32Length(v3);
                int v4 = this.input.getTotalBytesRead();
                do {
                    list0.add(this.input.readSFixed32());
                }
                while(this.input.getTotalBytesRead() < v4 + v3);
                return;
            }
            case 5: {
                break;
            }
            default: {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
        do {
            list0.add(this.input.readSFixed32());
            if(this.input.isAtEnd()) {
                return;
            }
            v5 = this.input.readTag();
        }
        while(v5 == this.tag);
        this.nextTag = v5;
    }

    @Override  // com.google.protobuf.a0
    public long readSFixed64() throws IOException {
        this.requireWireType(1);
        return this.input.readSFixed64();
    }

    @Override  // com.google.protobuf.a0
    public void readSFixed64List(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof F) {
            switch(this.tag & 7) {
                case 1: {
                    do {
                        ((F)list0).addLong(this.input.readSFixed64());
                        if(this.input.isAtEnd()) {
                            return;
                        }
                        v = this.input.readTag();
                    }
                    while(v == this.tag);
                    this.nextTag = v;
                    return;
                }
                case 2: {
                    int v1 = this.input.readUInt32();
                    this.verifyPackedFixed64Length(v1);
                    int v2 = this.input.getTotalBytesRead();
                    do {
                        ((F)list0).addLong(this.input.readSFixed64());
                    }
                    while(this.input.getTotalBytesRead() < v2 + v1);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }
        switch(this.tag & 7) {
            case 1: {
                do {
                    list0.add(this.input.readSFixed64());
                    if(this.input.isAtEnd()) {
                        return;
                    }
                    v3 = this.input.readTag();
                }
                while(v3 == this.tag);
                this.nextTag = v3;
                return;
            }
            case 2: {
                int v4 = this.input.readUInt32();
                this.verifyPackedFixed64Length(v4);
                int v5 = this.input.getTotalBytesRead();
                do {
                    list0.add(this.input.readSFixed64());
                }
                while(this.input.getTotalBytesRead() < v5 + v4);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    @Override  // com.google.protobuf.a0
    public int readSInt32() throws IOException {
        this.requireWireType(0);
        return this.input.readSInt32();
    }

    @Override  // com.google.protobuf.a0
    public void readSInt32List(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof w) {
            switch(this.tag & 7) {
                case 0: {
                    do {
                        ((w)list0).addInt(this.input.readSInt32());
                        if(this.input.isAtEnd()) {
                            return;
                        }
                        v = this.input.readTag();
                    }
                    while(v == this.tag);
                    this.nextTag = v;
                    return;
                }
                case 2: {
                    int v1 = this.input.readUInt32();
                    int v2 = this.input.getTotalBytesRead() + v1;
                    do {
                        ((w)list0).addInt(this.input.readSInt32());
                    }
                    while(this.input.getTotalBytesRead() < v2);
                    this.requirePosition(v2);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }
        switch(this.tag & 7) {
            case 0: {
                do {
                    list0.add(this.input.readSInt32());
                    if(this.input.isAtEnd()) {
                        return;
                    }
                    v3 = this.input.readTag();
                }
                while(v3 == this.tag);
                this.nextTag = v3;
                return;
            }
            case 2: {
                int v4 = this.input.readUInt32();
                int v5 = this.input.getTotalBytesRead() + v4;
                do {
                    list0.add(this.input.readSInt32());
                }
                while(this.input.getTotalBytesRead() < v5);
                this.requirePosition(v5);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    @Override  // com.google.protobuf.a0
    public long readSInt64() throws IOException {
        this.requireWireType(0);
        return this.input.readSInt64();
    }

    @Override  // com.google.protobuf.a0
    public void readSInt64List(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof F) {
            switch(this.tag & 7) {
                case 0: {
                    do {
                        ((F)list0).addLong(this.input.readSInt64());
                        if(this.input.isAtEnd()) {
                            return;
                        }
                        v = this.input.readTag();
                    }
                    while(v == this.tag);
                    this.nextTag = v;
                    return;
                }
                case 2: {
                    int v1 = this.input.readUInt32();
                    int v2 = this.input.getTotalBytesRead() + v1;
                    do {
                        ((F)list0).addLong(this.input.readSInt64());
                    }
                    while(this.input.getTotalBytesRead() < v2);
                    this.requirePosition(v2);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }
        switch(this.tag & 7) {
            case 0: {
                do {
                    list0.add(this.input.readSInt64());
                    if(this.input.isAtEnd()) {
                        return;
                    }
                    v3 = this.input.readTag();
                }
                while(v3 == this.tag);
                this.nextTag = v3;
                return;
            }
            case 2: {
                int v4 = this.input.readUInt32();
                int v5 = this.input.getTotalBytesRead() + v4;
                do {
                    list0.add(this.input.readSInt64());
                }
                while(this.input.getTotalBytesRead() < v5);
                this.requirePosition(v5);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    @Override  // com.google.protobuf.a0
    public String readString() throws IOException {
        this.requireWireType(2);
        return this.input.readString();
    }

    @Override  // com.google.protobuf.a0
    public void readStringList(List list0) throws IOException {
        this.readStringListInternal(list0, false);
    }

    public void readStringListInternal(List list0, boolean z) throws IOException {
        int v1;
        int v;
        if((this.tag & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        if(list0 instanceof LazyStringList && !z) {
            do {
                ((LazyStringList)list0).add(this.readBytes());
                if(this.input.isAtEnd()) {
                    return;
                }
                v = this.input.readTag();
            }
            while(v == this.tag);
            this.nextTag = v;
            return;
        }
        do {
            list0.add((z ? this.readStringRequireUtf8() : this.readString()));
            if(this.input.isAtEnd()) {
                return;
            }
            v1 = this.input.readTag();
        }
        while(v1 == this.tag);
        this.nextTag = v1;
    }

    @Override  // com.google.protobuf.a0
    public void readStringListRequireUtf8(List list0) throws IOException {
        this.readStringListInternal(list0, true);
    }

    @Override  // com.google.protobuf.a0
    public String readStringRequireUtf8() throws IOException {
        this.requireWireType(2);
        return this.input.readStringRequireUtf8();
    }

    @Override  // com.google.protobuf.a0
    public int readUInt32() throws IOException {
        this.requireWireType(0);
        return this.input.readUInt32();
    }

    @Override  // com.google.protobuf.a0
    public void readUInt32List(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof w) {
            switch(this.tag & 7) {
                case 0: {
                    do {
                        ((w)list0).addInt(this.input.readUInt32());
                        if(this.input.isAtEnd()) {
                            return;
                        }
                        v = this.input.readTag();
                    }
                    while(v == this.tag);
                    this.nextTag = v;
                    return;
                }
                case 2: {
                    int v1 = this.input.readUInt32();
                    int v2 = this.input.getTotalBytesRead() + v1;
                    do {
                        ((w)list0).addInt(this.input.readUInt32());
                    }
                    while(this.input.getTotalBytesRead() < v2);
                    this.requirePosition(v2);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }
        switch(this.tag & 7) {
            case 0: {
                do {
                    list0.add(this.input.readUInt32());
                    if(this.input.isAtEnd()) {
                        return;
                    }
                    v3 = this.input.readTag();
                }
                while(v3 == this.tag);
                this.nextTag = v3;
                return;
            }
            case 2: {
                int v4 = this.input.readUInt32();
                int v5 = this.input.getTotalBytesRead() + v4;
                do {
                    list0.add(this.input.readUInt32());
                }
                while(this.input.getTotalBytesRead() < v5);
                this.requirePosition(v5);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    @Override  // com.google.protobuf.a0
    public long readUInt64() throws IOException {
        this.requireWireType(0);
        return this.input.readUInt64();
    }

    @Override  // com.google.protobuf.a0
    public void readUInt64List(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof F) {
            switch(this.tag & 7) {
                case 0: {
                    do {
                        ((F)list0).addLong(this.input.readUInt64());
                        if(this.input.isAtEnd()) {
                            return;
                        }
                        v = this.input.readTag();
                    }
                    while(v == this.tag);
                    this.nextTag = v;
                    return;
                }
                case 2: {
                    int v1 = this.input.readUInt32();
                    int v2 = this.input.getTotalBytesRead() + v1;
                    do {
                        ((F)list0).addLong(this.input.readUInt64());
                    }
                    while(this.input.getTotalBytesRead() < v2);
                    this.requirePosition(v2);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }
        switch(this.tag & 7) {
            case 0: {
                do {
                    list0.add(this.input.readUInt64());
                    if(this.input.isAtEnd()) {
                        return;
                    }
                    v3 = this.input.readTag();
                }
                while(v3 == this.tag);
                this.nextTag = v3;
                return;
            }
            case 2: {
                int v4 = this.input.readUInt32();
                int v5 = this.input.getTotalBytesRead() + v4;
                do {
                    list0.add(this.input.readUInt64());
                }
                while(this.input.getTotalBytesRead() < v5);
                this.requirePosition(v5);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    private void requirePosition(int v) throws IOException {
        if(this.input.getTotalBytesRead() != v) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private void requireWireType(int v) throws IOException {
        if((this.tag & 7) != v) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    @Override  // com.google.protobuf.a0
    public boolean shouldDiscardUnknownFields() {
        return this.input.shouldDiscardUnknownFields();
    }

    @Override  // com.google.protobuf.a0
    public boolean skipField() throws IOException {
        if(!this.input.isAtEnd()) {
            return this.tag == this.endGroupTag ? false : this.input.skipField(this.tag);
        }
        return false;
    }

    private void verifyPackedFixed32Length(int v) throws IOException {
        if((v & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    private void verifyPackedFixed64Length(int v) throws IOException {
        if((v & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }
}

