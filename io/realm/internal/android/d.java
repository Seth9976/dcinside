package io.realm.internal.android;

public class d {
    public static byte[] a(Byte[] arr_byte) {
        byte[] arr_b = new byte[arr_byte.length];
        for(int v = 0; v < arr_byte.length; ++v) {
            Byte byte0 = arr_byte[v];
            if(byte0 == null) {
                throw new IllegalArgumentException("Byte arrays cannot contain null values.");
            }
            arr_b[v] = (byte)byte0;
        }
        return arr_b;
    }

    public static Byte[] b(byte[] arr_b) {
        Byte[] arr_byte = new Byte[arr_b.length];
        for(int v = 0; v < arr_b.length; ++v) {
            arr_byte[v] = (byte)arr_b[v];
        }
        return arr_byte;
    }
}

