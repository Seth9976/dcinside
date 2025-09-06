package org.mp4parser.aj.lang.reflect;

public interface CodeSignature extends MemberSignature {
    Class[] getExceptionTypes();

    String[] getParameterNames();

    Class[] getParameterTypes();
}

