package org.mp4parser.aj.internal.lang.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import org.mp4parser.aj.lang.annotation.AdviceName;
import org.mp4parser.aj.lang.reflect.Advice;
import org.mp4parser.aj.lang.reflect.AdviceKind;
import org.mp4parser.aj.lang.reflect.AjType;
import org.mp4parser.aj.lang.reflect.AjTypeSystem;
import org.mp4parser.aj.lang.reflect.PointcutExpression;

public class AdviceImpl implements Advice {
    private static final String AJC_INTERNAL = "org.mp4parser.aj.runtime.internal";
    private final Method adviceMethod;
    private AjType[] exceptionTypes;
    private Type[] genericParameterTypes;
    private boolean hasExtraParam;
    private final AdviceKind kind;
    private AjType[] parameterTypes;
    private PointcutExpression pointcutExpression;

    protected AdviceImpl(Method method0, String s, AdviceKind adviceKind0) {
        this.hasExtraParam = false;
        this.kind = adviceKind0;
        this.adviceMethod = method0;
        this.pointcutExpression = new PointcutExpressionImpl(s);
    }

    protected AdviceImpl(Method method0, String s, AdviceKind adviceKind0, String s1) {
        this(method0, s, adviceKind0);
        this.hasExtraParam = true;
    }

    @Override  // org.mp4parser.aj.lang.reflect.Advice
    public AjType getDeclaringType() {
        return AjTypeSystem.getAjType(this.adviceMethod.getDeclaringClass());
    }

    @Override  // org.mp4parser.aj.lang.reflect.Advice
    public AjType[] getExceptionTypes() {
        if(this.exceptionTypes == null) {
            Class[] arr_class = this.adviceMethod.getExceptionTypes();
            this.exceptionTypes = new AjType[arr_class.length];
            for(int v = 0; v < arr_class.length; ++v) {
                AjType[] arr_ajType = this.exceptionTypes;
                arr_ajType[v] = AjTypeSystem.getAjType(arr_class[v]);
            }
        }
        return this.exceptionTypes;
    }

    @Override  // org.mp4parser.aj.lang.reflect.Advice
    public Type[] getGenericParameterTypes() {
        if(this.genericParameterTypes == null) {
            Type[] arr_type = this.adviceMethod.getGenericParameterTypes();
            int v2 = 0;
            for(int v1 = 0; v1 < arr_type.length; ++v1) {
                Type type0 = arr_type[v1];
                if(type0 instanceof Class && ((Class)type0).getPackage().getName().equals("org.mp4parser.aj.runtime.internal")) {
                    ++v2;
                }
            }
            this.genericParameterTypes = new Type[arr_type.length - v2];
            for(int v = 0; true; ++v) {
                Type[] arr_type1 = this.genericParameterTypes;
                if(v >= arr_type1.length) {
                    break;
                }
                Type type1 = arr_type[v];
                arr_type1[v] = type1 instanceof Class ? AjTypeSystem.getAjType(((Class)type1)) : type1;
            }
        }
        return this.genericParameterTypes;
    }

    @Override  // org.mp4parser.aj.lang.reflect.Advice
    public AdviceKind getKind() {
        return this.kind;
    }

    @Override  // org.mp4parser.aj.lang.reflect.Advice
    public String getName() {
        String s = this.adviceMethod.getName();
        if(s.startsWith("ajc$")) {
            AdviceName adviceName0 = (AdviceName)this.adviceMethod.getAnnotation(AdviceName.class);
            return adviceName0 == null ? "" : adviceName0.value();
        }
        return s;
    }

    @Override  // org.mp4parser.aj.lang.reflect.Advice
    public AjType[] getParameterTypes() {
        if(this.parameterTypes == null) {
            Class[] arr_class = this.adviceMethod.getParameterTypes();
            int v2 = 0;
            for(int v1 = 0; v1 < arr_class.length; ++v1) {
                if(arr_class[v1].getPackage().getName().equals("org.mp4parser.aj.runtime.internal")) {
                    ++v2;
                }
            }
            this.parameterTypes = new AjType[arr_class.length - v2];
            for(int v = 0; true; ++v) {
                AjType[] arr_ajType = this.parameterTypes;
                if(v >= arr_ajType.length) {
                    break;
                }
                arr_ajType[v] = AjTypeSystem.getAjType(arr_class[v]);
            }
        }
        return this.parameterTypes;
    }

    @Override  // org.mp4parser.aj.lang.reflect.Advice
    public PointcutExpression getPointcutExpression() {
        return this.pointcutExpression;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer0 = new StringBuffer();
        if(this.getName().length() > 0) {
            stringBuffer0.append("@AdviceName(\"");
            stringBuffer0.append(this.getName());
            stringBuffer0.append("\") ");
        }
        if(this.getKind() == AdviceKind.AROUND) {
            stringBuffer0.append(this.adviceMethod.getGenericReturnType().toString());
            stringBuffer0.append(" ");
        }
        switch(this.getKind()) {
            case 1: {
                stringBuffer0.append("after(");
                break;
            }
            case 2: {
                stringBuffer0.append("after(");
                break;
            }
            case 3: {
                stringBuffer0.append("after(");
                break;
            }
            case 4: {
                stringBuffer0.append("around(");
                break;
            }
            case 5: {
                stringBuffer0.append("before(");
            }
        }
        AjType[] arr_ajType = this.getParameterTypes();
        int v = this.hasExtraParam ? arr_ajType.length - 1 : arr_ajType.length;
        int v1 = 0;
        int v2 = 0;
        while(v2 < v) {
            stringBuffer0.append(arr_ajType[v2].getName());
            ++v2;
            if(v2 < v) {
                stringBuffer0.append(",");
            }
        }
        stringBuffer0.append(") ");
        int v3 = org.mp4parser.aj.internal.lang.reflect.AdviceImpl.1.$SwitchMap$org$aspectj$lang$reflect$AdviceKind[this.getKind().ordinal()];
        if(v3 == 2) {
            stringBuffer0.append("returning");
            if(this.hasExtraParam) {
                stringBuffer0.append("(");
                stringBuffer0.append(arr_ajType[v - 1].getName());
                stringBuffer0.append(") ");
            }
        label_39:
            stringBuffer0.append("throwing");
            if(this.hasExtraParam) {
                stringBuffer0.append("(");
                stringBuffer0.append(arr_ajType[v - 1].getName());
                stringBuffer0.append(") ");
            }
        }
        else if(v3 != 3) {
        }
        else {
            goto label_39;
        }
        AjType[] arr_ajType1 = this.getExceptionTypes();
        if(arr_ajType1.length > 0) {
            stringBuffer0.append("throws ");
            while(v1 < arr_ajType1.length) {
                stringBuffer0.append(arr_ajType1[v1].getName());
                ++v1;
                if(v1 < arr_ajType1.length) {
                    stringBuffer0.append(",");
                }
            }
            stringBuffer0.append(" ");
        }
        stringBuffer0.append(": ");
        stringBuffer0.append(this.getPointcutExpression().asString());
        return stringBuffer0.toString();
    }
}

