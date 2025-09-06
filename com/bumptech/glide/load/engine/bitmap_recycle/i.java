package com.bumptech.glide.load.engine.bitmap_recycle;

public final class i implements a {
    private static final String a = "IntegerArrayPool";

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.a
    public int a(Object object0) {
        return this.c(((int[])object0));
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.a
    public int b() {
        return 4;
    }

    public int c(int[] arr_v) {
        return arr_v.length;
    }

    public int[] d(int v) {
        return new int[v];
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.a
    public String getTag() {
        return "IntegerArrayPool";
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.a
    public Object newArray(int v) {
        return this.d(v);
    }
}

