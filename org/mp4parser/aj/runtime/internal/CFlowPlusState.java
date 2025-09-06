package org.mp4parser.aj.runtime.internal;

import org.mp4parser.aj.runtime.CFlow;

public class CFlowPlusState extends CFlow {
    private Object[] state;

    public CFlowPlusState(Object[] arr_object) {
        this.state = arr_object;
    }

    public CFlowPlusState(Object[] arr_object, Object object0) {
        super(object0);
        this.state = arr_object;
    }

    @Override  // org.mp4parser.aj.runtime.CFlow
    public Object get(int v) {
        return this.state[v];
    }
}

