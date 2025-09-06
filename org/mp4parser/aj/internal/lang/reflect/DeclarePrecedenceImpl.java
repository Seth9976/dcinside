package org.mp4parser.aj.internal.lang.reflect;

import java.util.StringTokenizer;
import org.mp4parser.aj.lang.reflect.AjType;
import org.mp4parser.aj.lang.reflect.DeclarePrecedence;
import org.mp4parser.aj.lang.reflect.TypePattern;

public class DeclarePrecedenceImpl implements DeclarePrecedence {
    private AjType declaringType;
    private TypePattern[] precedenceList;
    private String precedenceString;

    public DeclarePrecedenceImpl(String s, AjType ajType0) {
        this.declaringType = ajType0;
        this.precedenceString = s;
        if(s.startsWith("(")) {
            s = s.substring(1, s.length() - 1);
        }
        StringTokenizer stringTokenizer0 = new StringTokenizer(s, ",");
        this.precedenceList = new TypePattern[stringTokenizer0.countTokens()];
        for(int v = 0; true; ++v) {
            TypePattern[] arr_typePattern = this.precedenceList;
            if(v >= arr_typePattern.length) {
                break;
            }
            arr_typePattern[v] = new TypePatternImpl(stringTokenizer0.nextToken().trim());
        }
    }

    @Override  // org.mp4parser.aj.lang.reflect.DeclarePrecedence
    public AjType getDeclaringType() {
        return this.declaringType;
    }

    @Override  // org.mp4parser.aj.lang.reflect.DeclarePrecedence
    public TypePattern[] getPrecedenceOrder() {
        return this.precedenceList;
    }

    @Override
    public String toString() {
        return "declare precedence : " + this.precedenceString;
    }
}

