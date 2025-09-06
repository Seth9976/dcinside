package com.fasterxml.jackson.databind.deser.std;

import java.math.BigDecimal;
import java.math.BigInteger;

public final class f {
    public static BigDecimal a(BigDecimal bigDecimal0) {
        return bigDecimal0.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal0.stripTrailingZeros();
    }
}

