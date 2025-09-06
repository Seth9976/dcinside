package androidx.emoji2.text.flatbuffer;

interface ReadWriteBuf extends ReadBuf {
    void a(float arg1);

    void b(int arg1);

    void c(long arg1);

    void d(double arg1);

    void e(short arg1);

    void f(boolean arg1);

    void h(byte arg1);

    void i(byte[] arg1, int arg2, int arg3);

    boolean j(int arg1);

    void k(int arg1, byte arg2);

    int l();

    @Override  // androidx.emoji2.text.flatbuffer.ReadBuf
    int limit();

    void m(int arg1, byte[] arg2, int arg3, int arg4);

    void o(int arg1, short arg2);

    void setBoolean(int arg1, boolean arg2);

    void setDouble(int arg1, double arg2);

    void setFloat(int arg1, float arg2);

    void setInt(int arg1, int arg2);

    void setLong(int arg1, long arg2);
}

