package org.bson;

import java.util.Collection;
import java.util.Iterator;

final class p0 {
    public static String a(String s, Collection collection0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        Iterator iterator0 = collection0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            stringBuilder0.append(object0);
            if(!iterator0.hasNext()) {
                break;
            }
            stringBuilder0.append(s);
        }
        return stringBuilder0.toString();
    }
}

