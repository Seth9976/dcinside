package org.mp4parser.aj.lang.reflect;

import org.mp4parser.aj.lang.Signature;

public interface CatchClauseSignature extends Signature {
    String getParameterName();

    Class getParameterType();
}

