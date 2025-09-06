package androidx.datastore.preferences.protobuf;

final class ProtobufLists {
    public static BooleanList a() {
        return BooleanArrayList.g();
    }

    public static DoubleList b() {
        return DoubleArrayList.g();
    }

    public static FloatList c() {
        return FloatArrayList.g();
    }

    public static IntList d() {
        return IntArrayList.g();
    }

    public static LongList e() {
        return LongArrayList.g();
    }

    public static ProtobufList f() {
        return ProtobufArrayList.c();
    }

    public static ProtobufList g(ProtobufList internal$ProtobufList0) {
        int v = internal$ProtobufList0.size();
        return v == 0 ? internal$ProtobufList0.mutableCopyWithCapacity(10) : internal$ProtobufList0.mutableCopyWithCapacity(v * 2);
    }

    public static BooleanList h() {
        return new BooleanArrayList();
    }

    public static DoubleList i() {
        return new DoubleArrayList();
    }

    public static FloatList j() {
        return new FloatArrayList();
    }

    public static IntList k() {
        return new IntArrayList();
    }

    public static LongList l() {
        return new LongArrayList();
    }
}

