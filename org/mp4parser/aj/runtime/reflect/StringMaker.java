package org.mp4parser.aj.runtime.reflect;

import java.lang.reflect.Modifier;

class StringMaker {
    int cacheOffset;
    boolean includeArgs;
    boolean includeEnclosingPoint;
    boolean includeJoinPointTypeName;
    boolean includeModifiers;
    boolean includeThrows;
    static StringMaker longStringMaker;
    static StringMaker middleStringMaker;
    boolean shortKindName;
    boolean shortPrimaryTypeNames;
    static StringMaker shortStringMaker;
    boolean shortTypeNames;

    static {
        StringMaker stringMaker0 = new StringMaker();
        StringMaker.shortStringMaker = stringMaker0;
        stringMaker0.shortTypeNames = true;
        stringMaker0.includeArgs = false;
        stringMaker0.includeThrows = false;
        stringMaker0.includeModifiers = false;
        stringMaker0.shortPrimaryTypeNames = true;
        stringMaker0.includeJoinPointTypeName = false;
        stringMaker0.includeEnclosingPoint = false;
        stringMaker0.cacheOffset = 0;
        StringMaker stringMaker1 = new StringMaker();
        StringMaker.middleStringMaker = stringMaker1;
        stringMaker1.shortTypeNames = true;
        stringMaker1.includeArgs = true;
        stringMaker1.includeThrows = false;
        stringMaker1.includeModifiers = false;
        stringMaker1.shortPrimaryTypeNames = false;
        StringMaker.shortStringMaker.cacheOffset = 1;
        StringMaker stringMaker2 = new StringMaker();
        StringMaker.longStringMaker = stringMaker2;
        stringMaker2.shortTypeNames = false;
        stringMaker2.includeArgs = true;
        stringMaker2.includeThrows = false;
        stringMaker2.includeModifiers = true;
        stringMaker2.shortPrimaryTypeNames = false;
        stringMaker2.shortKindName = false;
        stringMaker2.cacheOffset = 2;
    }

    StringMaker() {
        this.shortTypeNames = true;
        this.includeArgs = true;
        this.includeThrows = false;
        this.includeModifiers = false;
        this.shortPrimaryTypeNames = false;
        this.includeJoinPointTypeName = true;
        this.includeEnclosingPoint = true;
        this.shortKindName = true;
    }

    public void addSignature(StringBuffer stringBuffer0, Class[] arr_class) {
        if(arr_class == null) {
            return;
        }
        if(!this.includeArgs) {
            if(arr_class.length == 0) {
                stringBuffer0.append("()");
                return;
            }
            stringBuffer0.append("(..)");
            return;
        }
        stringBuffer0.append("(");
        this.addTypeNames(stringBuffer0, arr_class);
        stringBuffer0.append(")");
    }

    public void addThrows(StringBuffer stringBuffer0, Class[] arr_class) {
        if(this.includeThrows && arr_class != null && arr_class.length != 0) {
            stringBuffer0.append(" throws ");
            this.addTypeNames(stringBuffer0, arr_class);
        }
    }

    public void addTypeNames(StringBuffer stringBuffer0, Class[] arr_class) {
        for(int v = 0; v < arr_class.length; ++v) {
            if(v > 0) {
                stringBuffer0.append(", ");
            }
            stringBuffer0.append(this.makeTypeName(arr_class[v]));
        }
    }

    String makeKindName(String s) {
        int v = s.lastIndexOf(45);
        return v == -1 ? s : s.substring(v + 1);
    }

    String makeModifiersString(int v) {
        if(!this.includeModifiers) {
            return "";
        }
        String s = Modifier.toString(v);
        return s.length() == 0 ? "" : s + " ";
    }

    public String makePrimaryTypeName(Class class0, String s) {
        return this.makeTypeName(class0, s, this.shortPrimaryTypeNames);
    }

    public String makeTypeName(Class class0) {
        return this.makeTypeName(class0, class0.getName(), this.shortTypeNames);
    }

    String makeTypeName(Class class0, String s, boolean z) {
        if(class0 == null) {
            return "ANONYMOUS";
        }
        if(class0.isArray()) {
            Class class1 = class0.getComponentType();
            return this.makeTypeName(class1, class1.getName(), z) + "[]";
        }
        return z ? this.stripPackageName(s).replace('$', '.') : s.replace('$', '.');
    }

    String stripPackageName(String s) {
        int v = s.lastIndexOf(46);
        return v == -1 ? s : s.substring(v + 1);
    }
}

