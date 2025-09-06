package j$.util.concurrent;

abstract class u {
    static String a(Object object0, Object object1) {
        String s1;
        String s = "null";
        if(object0 == null) {
            s1 = "null";
        }
        else {
            s1 = object0.toString();
            if(s1 == null) {
                s1 = "null";
            }
        }
        int v = s1.length();
        if(object1 != null) {
            String s2 = object1.toString();
            if(s2 != null) {
                s = s2;
            }
        }
        char[] arr_c = new char[v + s.length() + 1];
        arr_c[v] = '=';
        return new String(arr_c);
    }
}

