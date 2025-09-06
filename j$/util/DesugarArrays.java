package j$.util;

import j..util.stream.Stream;
import j..util.stream.StreamSupport;

public final class DesugarArrays {
    public static Stream stream(Object[] arr_object) {
        return StreamSupport.stream(Spliterators.m(arr_object, 0, arr_object.length), false);
    }
}

