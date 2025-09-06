package org.mp4parser.aj.internal.lang.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import org.mp4parser.aj.lang.reflect.AjType;
import org.mp4parser.aj.lang.reflect.AjTypeSystem;
import org.mp4parser.aj.lang.reflect.InterTypeConstructorDeclaration;

public class InterTypeConstructorDeclarationImpl extends InterTypeDeclarationImpl implements InterTypeConstructorDeclaration {
    private Method baseMethod;

    public InterTypeConstructorDeclarationImpl(AjType ajType0, String s, int v, Method method0) {
        super(ajType0, s, v);
        this.baseMethod = method0;
    }

    @Override  // org.mp4parser.aj.lang.reflect.InterTypeConstructorDeclaration
    public AjType[] getExceptionTypes() {
        Class[] arr_class = this.baseMethod.getExceptionTypes();
        AjType[] arr_ajType = new AjType[arr_class.length];
        for(int v = 0; v < arr_class.length; ++v) {
            arr_ajType[v] = AjTypeSystem.getAjType(arr_class[v]);
        }
        return arr_ajType;
    }

    @Override  // org.mp4parser.aj.lang.reflect.InterTypeConstructorDeclaration
    public Type[] getGenericParameterTypes() {
        Type[] arr_type = this.baseMethod.getGenericParameterTypes();
        Type[] arr_type1 = new AjType[arr_type.length - 1];
        for(int v = 1; v < arr_type.length; ++v) {
            Type type0 = arr_type[v];
            arr_type1[v - 1] = type0 instanceof Class ? AjTypeSystem.getAjType(((Class)type0)) : type0;
        }
        return arr_type1;
    }

    @Override  // org.mp4parser.aj.lang.reflect.InterTypeConstructorDeclaration
    public AjType[] getParameterTypes() {
        Class[] arr_class = this.baseMethod.getParameterTypes();
        AjType[] arr_ajType = new AjType[arr_class.length - 1];
        for(int v = 1; v < arr_class.length; ++v) {
            arr_ajType[v - 1] = AjTypeSystem.getAjType(arr_class[v]);
        }
        return arr_ajType;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer0 = new StringBuffer();
        stringBuffer0.append(Modifier.toString(this.getModifiers()));
        stringBuffer0.append(" ");
        stringBuffer0.append(this.targetTypeName);
        stringBuffer0.append(".new");
        stringBuffer0.append("(");
        AjType[] arr_ajType = this.getParameterTypes();
        for(int v = 0; v < arr_ajType.length - 1; ++v) {
            stringBuffer0.append(arr_ajType[v].toString());
            stringBuffer0.append(", ");
        }
        if(arr_ajType.length > 0) {
            stringBuffer0.append(arr_ajType[arr_ajType.length - 1].toString());
        }
        stringBuffer0.append(")");
        return stringBuffer0.toString();
    }
}

