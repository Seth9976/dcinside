package org.mp4parser.aj.internal.lang.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import org.mp4parser.aj.lang.reflect.AjType;
import org.mp4parser.aj.lang.reflect.AjTypeSystem;
import org.mp4parser.aj.lang.reflect.InterTypeMethodDeclaration;

public class InterTypeMethodDeclarationImpl extends InterTypeDeclarationImpl implements InterTypeMethodDeclaration {
    private Method baseMethod;
    private AjType[] exceptionTypes;
    private Type[] genericParameterTypes;
    private Type genericReturnType;
    private String name;
    private int parameterAdjustmentFactor;
    private AjType[] parameterTypes;
    private AjType returnType;

    public InterTypeMethodDeclarationImpl(AjType ajType0, String s, int v, String s1, Method method0) {
        super(ajType0, s, v);
        this.parameterAdjustmentFactor = 1;
        this.name = s1;
        this.baseMethod = method0;
    }

    public InterTypeMethodDeclarationImpl(AjType ajType0, AjType ajType1, Method method0, int v) {
        super(ajType0, ajType1, v);
        this.parameterAdjustmentFactor = 0;
        this.name = method0.getName();
        this.baseMethod = method0;
    }

    @Override  // org.mp4parser.aj.lang.reflect.InterTypeMethodDeclaration
    public AjType[] getExceptionTypes() {
        Class[] arr_class = this.baseMethod.getExceptionTypes();
        AjType[] arr_ajType = new AjType[arr_class.length];
        for(int v = 0; v < arr_class.length; ++v) {
            arr_ajType[v] = AjTypeSystem.getAjType(arr_class[v]);
        }
        return arr_ajType;
    }

    @Override  // org.mp4parser.aj.lang.reflect.InterTypeMethodDeclaration
    public Type[] getGenericParameterTypes() {
        Type[] arr_type = this.baseMethod.getGenericParameterTypes();
        int v = this.parameterAdjustmentFactor;
        Type[] arr_type1 = new AjType[arr_type.length - v];
        while(v < arr_type.length) {
            Type type0 = arr_type[v];
            if(type0 instanceof Class) {
                int v1 = v - this.parameterAdjustmentFactor;
                arr_type1[v1] = AjTypeSystem.getAjType(((Class)type0));
            }
            else {
                arr_type1[v - this.parameterAdjustmentFactor] = type0;
            }
            ++v;
        }
        return arr_type1;
    }

    @Override  // org.mp4parser.aj.lang.reflect.InterTypeMethodDeclaration
    public Type getGenericReturnType() {
        Type type0 = this.baseMethod.getGenericReturnType();
        return type0 instanceof Class ? AjTypeSystem.getAjType(((Class)type0)) : type0;
    }

    @Override  // org.mp4parser.aj.lang.reflect.InterTypeMethodDeclaration
    public String getName() {
        return this.name;
    }

    @Override  // org.mp4parser.aj.lang.reflect.InterTypeMethodDeclaration
    public AjType[] getParameterTypes() {
        Class[] arr_class = this.baseMethod.getParameterTypes();
        int v = this.parameterAdjustmentFactor;
        AjType[] arr_ajType = new AjType[arr_class.length - v];
        while(v < arr_class.length) {
            int v1 = v - this.parameterAdjustmentFactor;
            arr_ajType[v1] = AjTypeSystem.getAjType(arr_class[v]);
            ++v;
        }
        return arr_ajType;
    }

    @Override  // org.mp4parser.aj.lang.reflect.InterTypeMethodDeclaration
    public AjType getReturnType() {
        return AjTypeSystem.getAjType(this.baseMethod.getReturnType());
    }

    @Override  // org.mp4parser.aj.lang.reflect.InterTypeMethodDeclaration
    public TypeVariable[] getTypeParameters() {
        return this.baseMethod.getTypeParameters();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer0 = new StringBuffer();
        stringBuffer0.append(Modifier.toString(this.getModifiers()));
        stringBuffer0.append(" ");
        stringBuffer0.append(this.getReturnType().toString());
        stringBuffer0.append(" ");
        stringBuffer0.append(this.targetTypeName);
        stringBuffer0.append(".");
        stringBuffer0.append(this.getName());
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

