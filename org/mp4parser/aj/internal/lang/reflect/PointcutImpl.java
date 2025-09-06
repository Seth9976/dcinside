package org.mp4parser.aj.internal.lang.reflect;

import java.lang.reflect.Method;
import java.util.StringTokenizer;
import org.mp4parser.aj.lang.reflect.AjType;
import org.mp4parser.aj.lang.reflect.AjTypeSystem;
import org.mp4parser.aj.lang.reflect.Pointcut;
import org.mp4parser.aj.lang.reflect.PointcutExpression;

public class PointcutImpl implements Pointcut {
    private final Method baseMethod;
    private final AjType declaringType;
    private final String name;
    private String[] parameterNames;
    private final PointcutExpression pc;

    protected PointcutImpl(String s, String s1, Method method0, AjType ajType0, String s2) {
        this.parameterNames = new String[0];
        this.name = s;
        this.pc = new PointcutExpressionImpl(s1);
        this.baseMethod = method0;
        this.declaringType = ajType0;
        this.parameterNames = this.splitOnComma(s2);
    }

    @Override  // org.mp4parser.aj.lang.reflect.Pointcut
    public AjType getDeclaringType() {
        return this.declaringType;
    }

    @Override  // org.mp4parser.aj.lang.reflect.Pointcut
    public int getModifiers() {
        return this.baseMethod.getModifiers();
    }

    @Override  // org.mp4parser.aj.lang.reflect.Pointcut
    public String getName() {
        return this.name;
    }

    @Override  // org.mp4parser.aj.lang.reflect.Pointcut
    public String[] getParameterNames() {
        return this.parameterNames;
    }

    @Override  // org.mp4parser.aj.lang.reflect.Pointcut
    public AjType[] getParameterTypes() {
        Class[] arr_class = this.baseMethod.getParameterTypes();
        AjType[] arr_ajType = new AjType[arr_class.length];
        for(int v = 0; v < arr_class.length; ++v) {
            arr_ajType[v] = AjTypeSystem.getAjType(arr_class[v]);
        }
        return arr_ajType;
    }

    @Override  // org.mp4parser.aj.lang.reflect.Pointcut
    public PointcutExpression getPointcutExpression() {
        return this.pc;
    }

    private String[] splitOnComma(String s) {
        StringTokenizer stringTokenizer0 = new StringTokenizer(s, ",");
        int v = stringTokenizer0.countTokens();
        String[] arr_s = new String[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_s[v1] = stringTokenizer0.nextToken().trim();
        }
        return arr_s;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer0 = new StringBuffer();
        stringBuffer0.append(this.getName());
        stringBuffer0.append("(");
        AjType[] arr_ajType = this.getParameterTypes();
        int v = 0;
        while(v < arr_ajType.length) {
            stringBuffer0.append(arr_ajType[v].getName());
            if(this.parameterNames != null && this.parameterNames[v] != null) {
                stringBuffer0.append(" ");
                stringBuffer0.append(this.parameterNames[v]);
            }
            ++v;
            if(v < arr_ajType.length) {
                stringBuffer0.append(",");
            }
        }
        stringBuffer0.append(") : ");
        stringBuffer0.append(this.getPointcutExpression().asString());
        return stringBuffer0.toString();
    }
}

