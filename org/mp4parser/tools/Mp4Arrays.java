package org.mp4parser.tools;

public final class Mp4Arrays {
    public static byte[] copyOfAndAppend(byte[] arr_b, byte[] arr_b1) {
        if(arr_b == null) {
            arr_b = new byte[0];
        }
        if(arr_b1 == null) {
            arr_b1 = new byte[0];
        }
        byte[] arr_b2 = new byte[arr_b.length + arr_b1.length];
        System.arraycopy(arr_b, 0, arr_b2, 0, arr_b.length);
        System.arraycopy(arr_b1, 0, arr_b2, arr_b.length, arr_b1.length);
        return arr_b2;
    }

    public static double[] copyOfAndAppend(double[] arr_f, double[] arr_f1) {
        if(arr_f == null) {
            arr_f = new double[0];
        }
        if(arr_f1 == null) {
            arr_f1 = new double[0];
        }
        double[] arr_f2 = new double[arr_f.length + arr_f1.length];
        System.arraycopy(arr_f, 0, arr_f2, 0, arr_f.length);
        System.arraycopy(arr_f1, 0, arr_f2, arr_f.length, arr_f1.length);
        return arr_f2;
    }

    public static int[] copyOfAndAppend(int[] arr_v, int[] arr_v1) {
        if(arr_v == null) {
            arr_v = new int[0];
        }
        if(arr_v1 == null) {
            arr_v1 = new int[0];
        }
        int[] arr_v2 = new int[arr_v.length + arr_v1.length];
        System.arraycopy(arr_v, 0, arr_v2, 0, arr_v.length);
        System.arraycopy(arr_v1, 0, arr_v2, arr_v.length, arr_v1.length);
        return arr_v2;
    }

    public static long[] copyOfAndAppend(long[] arr_v, long[] arr_v1) {
        if(arr_v == null) {
            arr_v = new long[0];
        }
        if(arr_v1 == null) {
            arr_v1 = new long[0];
        }
        long[] arr_v2 = new long[arr_v.length + arr_v1.length];
        System.arraycopy(arr_v, 0, arr_v2, 0, arr_v.length);
        System.arraycopy(arr_v1, 0, arr_v2, arr_v.length, arr_v1.length);
        return arr_v2;
    }
}

