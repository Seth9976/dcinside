package org.mp4parser.aj.internal.lang.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.StringTokenizer;
import org.mp4parser.aj.lang.reflect.AjTypeSystem;

public class StringToType {
    public static Type[] commaSeparatedListToTypeArray(String s, Class class0) throws ClassNotFoundException {
        StringTokenizer stringTokenizer0 = new StringTokenizer(s, ",");
        Type[] arr_type = new Type[stringTokenizer0.countTokens()];
        for(int v = 0; stringTokenizer0.hasMoreTokens(); ++v) {
            arr_type[v] = StringToType.stringToType(stringTokenizer0.nextToken().trim(), class0);
        }
        return arr_type;
    }

    private static Type makeParameterizedType(String s, Class class0) throws ClassNotFoundException {
        int v = s.indexOf(60);
        Class class1 = Class.forName(s.substring(0, v), false, class0.getClassLoader());
        return new ParameterizedType() {
            @Override
            public Type[] getActualTypeArguments() {
                return StringToType.commaSeparatedListToTypeArray(s.substring(v + 1, s.lastIndexOf(62)), class0);
            }

            @Override
            public Type getOwnerType() {
                return class1.getEnclosingClass();
            }

            @Override
            public Type getRawType() {
                return class1;
            }
        };
    }

    public static Type stringToType(String s, Class class0) throws ClassNotFoundException {
        try {
            return s.indexOf("<") == -1 ? AjTypeSystem.getAjType(Class.forName(s, false, class0.getClassLoader())) : StringToType.makeParameterizedType(s, class0);
        }
        catch(ClassNotFoundException unused_ex) {
            TypeVariable[] arr_typeVariable = class0.getTypeParameters();
            for(int v = 0; v < arr_typeVariable.length; ++v) {
                if(arr_typeVariable[v].getName().equals(s)) {
                    return arr_typeVariable[v];
                }
            }
            throw new ClassNotFoundException(s);
        }
    }
}

