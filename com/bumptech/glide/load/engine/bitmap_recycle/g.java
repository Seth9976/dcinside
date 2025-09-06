package com.bumptech.glide.load.engine.bitmap_recycle;

public final class g implements a {
    private static final String a = "ByteArrayPool";

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.a
    public int a(Object object0) {
        return this.c(((byte[])object0));
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.a
    public int b() {
        return 1;
    }

    public int c(byte[] arr_b) {
        return arr_b.length;
    }

    public byte[] d(int v) {
        return new byte[v];
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.a
    public String getTag() {
        return "ByteArrayPool";
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.a
    public Object newArray(int v) {
        return this.d(v);
    }
}

