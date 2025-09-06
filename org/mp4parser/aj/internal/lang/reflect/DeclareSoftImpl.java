package org.mp4parser.aj.internal.lang.reflect;

import org.mp4parser.aj.lang.reflect.AjType;
import org.mp4parser.aj.lang.reflect.AjTypeSystem;
import org.mp4parser.aj.lang.reflect.DeclareSoft;
import org.mp4parser.aj.lang.reflect.PointcutExpression;

public class DeclareSoftImpl implements DeclareSoft {
    private AjType declaringType;
    private AjType exceptionType;
    private String missingTypeName;
    private PointcutExpression pointcut;

    public DeclareSoftImpl(AjType ajType0, String s, String s1) {
        this.declaringType = ajType0;
        this.pointcut = new PointcutExpressionImpl(s);
        try {
            this.exceptionType = AjTypeSystem.getAjType(Class.forName(s1, false, ajType0.getJavaClass().getClassLoader()));
        }
        catch(ClassNotFoundException unused_ex) {
            this.missingTypeName = s1;
        }
    }

    @Override  // org.mp4parser.aj.lang.reflect.DeclareSoft
    public AjType getDeclaringType() {
        return this.declaringType;
    }

    @Override  // org.mp4parser.aj.lang.reflect.DeclareSoft
    public PointcutExpression getPointcutExpression() {
        return this.pointcut;
    }

    @Override  // org.mp4parser.aj.lang.reflect.DeclareSoft
    public AjType getSoftenedExceptionType() throws ClassNotFoundException {
        if(this.missingTypeName != null) {
            throw new ClassNotFoundException(this.missingTypeName);
        }
        return this.exceptionType;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer0 = new StringBuffer();
        stringBuffer0.append("declare soft : ");
        if(this.missingTypeName == null) {
            stringBuffer0.append(null);
        }
        else {
            stringBuffer0.append(this.exceptionType.getName());
        }
        stringBuffer0.append(" : ");
        stringBuffer0.append(this.getPointcutExpression().asString());
        return stringBuffer0.toString();
    }
}

