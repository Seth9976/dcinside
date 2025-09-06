package org.mp4parser.aj.runtime.internal;

import java.util.Stack;
import org.mp4parser.aj.lang.NoAspectBoundException;
import org.mp4parser.aj.runtime.CFlow;
import org.mp4parser.aj.runtime.internal.cflowstack.ThreadStack;
import org.mp4parser.aj.runtime.internal.cflowstack.ThreadStackFactory;
import org.mp4parser.aj.runtime.internal.cflowstack.ThreadStackFactoryImpl11;
import org.mp4parser.aj.runtime.internal.cflowstack.ThreadStackFactoryImpl;

public class CFlowStack {
    private ThreadStack stackProxy;
    private static ThreadStackFactory tsFactory;

    static {
        CFlowStack.selectFactoryForVMVersion();
    }

    public CFlowStack() {
        this.stackProxy = CFlowStack.tsFactory.getNewThreadStack();
    }

    public Object get(int v) {
        CFlow cFlow0 = this.peekCFlow();
        return cFlow0 == null ? null : cFlow0.get(v);
    }

    private static String getSystemPropertyWithoutSecurityException(String s, String s1) [...] // 潜在的解密器

    private static ThreadStackFactory getThreadLocalStackFactory() {
        return new ThreadStackFactoryImpl();
    }

    private static ThreadStackFactory getThreadLocalStackFactoryFor11() {
        return new ThreadStackFactoryImpl11();
    }

    private Stack getThreadStack() {
        return this.stackProxy.getThreadStack();
    }

    // 去混淆评级： 低(20)
    public static String getThreadStackFactoryClassName() {
        return "org.mp4parser.aj.runtime.internal.cflowstack.ThreadStackFactoryImpl";
    }

    public boolean isValid() {
        return !this.getThreadStack().isEmpty();
    }

    public Object peek() {
        Stack stack0 = this.getThreadStack();
        if(stack0.isEmpty()) {
            throw new NoAspectBoundException();
        }
        return stack0.peek();
    }

    public CFlow peekCFlow() {
        Stack stack0 = this.getThreadStack();
        return stack0.isEmpty() ? null : ((CFlow)stack0.peek());
    }

    public Object peekInstance() {
        CFlow cFlow0 = this.peekCFlow();
        if(cFlow0 == null) {
            throw new NoAspectBoundException();
        }
        return cFlow0.getAspect();
    }

    public CFlow peekTopCFlow() {
        Stack stack0 = this.getThreadStack();
        return stack0.isEmpty() ? null : ((CFlow)stack0.elementAt(0));
    }

    public void pop() {
        Stack stack0 = this.getThreadStack();
        stack0.pop();
        if(stack0.isEmpty()) {
            this.stackProxy.removeThreadStack();
        }
    }

    public void push(Object object0) {
        this.getThreadStack().push(object0);
    }

    public void push(Object[] arr_object) {
        this.getThreadStack().push(new CFlowPlusState(arr_object));
    }

    public void pushInstance(Object object0) {
        this.getThreadStack().push(new CFlow(object0));
    }

    // 去混淆评级： 中等(65)
    private static void selectFactoryForVMVersion() {
        CFlowStack.tsFactory = CFlowStack.getThreadLocalStackFactory();
    }
}

