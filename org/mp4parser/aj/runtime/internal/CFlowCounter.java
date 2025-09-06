package org.mp4parser.aj.runtime.internal;

import org.mp4parser.aj.runtime.internal.cflowstack.ThreadCounter;
import org.mp4parser.aj.runtime.internal.cflowstack.ThreadStackFactory;
import org.mp4parser.aj.runtime.internal.cflowstack.ThreadStackFactoryImpl11;
import org.mp4parser.aj.runtime.internal.cflowstack.ThreadStackFactoryImpl;

public class CFlowCounter {
    private ThreadCounter flowHeightHandler;
    private static ThreadStackFactory tsFactory;

    static {
        CFlowCounter.selectFactoryForVMVersion();
    }

    public CFlowCounter() {
        this.flowHeightHandler = CFlowCounter.tsFactory.getNewThreadCounter();
    }

    public void dec() {
        this.flowHeightHandler.dec();
        if(!this.flowHeightHandler.isNotZero()) {
            this.flowHeightHandler.removeThreadCounter();
        }
    }

    private static String getSystemPropertyWithoutSecurityException(String s, String s1) [...] // 潜在的解密器

    private static ThreadStackFactory getThreadLocalStackFactory() {
        return new ThreadStackFactoryImpl();
    }

    private static ThreadStackFactory getThreadLocalStackFactoryFor11() {
        return new ThreadStackFactoryImpl11();
    }

    // 去混淆评级： 低(20)
    public static String getThreadStackFactoryClassName() {
        return "org.mp4parser.aj.runtime.internal.cflowstack.ThreadStackFactoryImpl";
    }

    public void inc() {
        this.flowHeightHandler.inc();
    }

    public boolean isValid() {
        return this.flowHeightHandler.isNotZero();
    }

    // 去混淆评级： 中等(65)
    private static void selectFactoryForVMVersion() {
        CFlowCounter.tsFactory = CFlowCounter.getThreadLocalStackFactory();
    }
}

