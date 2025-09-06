package com.bytedance.adsdk.PjT.Zh.JQp.PjT;

public class Zh {
    private static boolean PjT(double f, Number number0) {
        if(!(number0 instanceof Integer) && !(number0 instanceof Short) && !(number0 instanceof Byte)) {
            if(number0 instanceof Long) {
                return f == ((double)number0.longValue());
            }
            if(number0 instanceof Float) {
                return f == ((double)number0.floatValue());
            }
            if(!(number0 instanceof Double)) {
                throw new UnsupportedOperationException(number0.getClass().getName() + "This type of addition operation is not supported");
            }
            return f == number0.doubleValue();
        }
        return f == ((double)number0.intValue());
    }

    private static boolean PjT(float f, Number number0) {
        if(!(number0 instanceof Integer) && !(number0 instanceof Short) && !(number0 instanceof Byte)) {
            if(number0 instanceof Long) {
                return f == ((float)number0.longValue());
            }
            if(number0 instanceof Float) {
                return f == number0.floatValue();
            }
            if(!(number0 instanceof Double)) {
                throw new UnsupportedOperationException(number0.getClass().getName() + "This type of addition operation is not supported");
            }
            return ((double)f) == number0.doubleValue();
        }
        return f == ((float)number0.intValue());
    }

    private static boolean PjT(int v, Number number0) {
        if(!(number0 instanceof Integer) && !(number0 instanceof Short) && !(number0 instanceof Byte)) {
            if(number0 instanceof Long) {
                return ((long)v) == number0.longValue();
            }
            if(number0 instanceof Float) {
                return ((float)v) == number0.floatValue();
            }
            if(!(number0 instanceof Double)) {
                throw new UnsupportedOperationException(number0.getClass().getName() + "This type of addition operation is not supported");
            }
            return ((double)v) == number0.doubleValue();
        }
        return v == number0.intValue();
    }

    private static boolean PjT(long v, Number number0) {
        if(!(number0 instanceof Integer) && !(number0 instanceof Short) && !(number0 instanceof Byte)) {
            if(number0 instanceof Long) {
                return v == number0.longValue();
            }
            if(number0 instanceof Float) {
                return ((float)v) == number0.floatValue();
            }
            if(!(number0 instanceof Double)) {
                throw new UnsupportedOperationException(number0.getClass().getName() + "This type of addition operation is not supported");
            }
            return ((double)v) == number0.doubleValue();
        }
        return v == ((long)number0.intValue());
    }

    public static boolean PjT(Number number0, Number number1) {
        if(!(number0 instanceof Integer) && !(number0 instanceof Short) && !(number0 instanceof Byte)) {
            if(number0 instanceof Long) {
                return Zh.PjT(number0.longValue(), number1);
            }
            if(number0 instanceof Float) {
                return Zh.PjT(number0.floatValue(), number1);
            }
            if(!(number0 instanceof Double)) {
                throw new UnsupportedOperationException(number0.getClass().getName() + "This type of addition operation is not supported");
            }
            return Zh.PjT(number0.doubleValue(), number1);
        }
        return Zh.PjT(number0.intValue(), number1);
    }
}

