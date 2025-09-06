package com.google.crypto.tink.internal;

import com.google.crypto.tink.subtle.L;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

public final class c {
    static class a {
        BigInteger a;
        BigInteger b;
        BigInteger c;
        static final a d;

        static {
            a.d = new a(BigInteger.ONE, BigInteger.ONE, BigInteger.ZERO);
        }

        a(BigInteger bigInteger0, BigInteger bigInteger1, BigInteger bigInteger2) {
            this.a = bigInteger0;
            this.b = bigInteger1;
            this.c = bigInteger2;
        }

        boolean a() {
            return this.c.equals(BigInteger.ZERO);
        }

        ECPoint b(BigInteger bigInteger0) {
            if(this.a()) {
                return ECPoint.POINT_INFINITY;
            }
            BigInteger bigInteger1 = this.c.modInverse(bigInteger0);
            BigInteger bigInteger2 = bigInteger1.multiply(bigInteger1).mod(bigInteger0);
            return new ECPoint(this.a.multiply(bigInteger2).mod(bigInteger0), this.b.multiply(bigInteger2).mod(bigInteger0).multiply(bigInteger1).mod(bigInteger0));
        }
    }

    public static final ECParameterSpec a;
    public static final ECParameterSpec b;
    public static final ECParameterSpec c;
    private static final BigInteger d;
    private static final BigInteger e;
    private static final BigInteger f;
    private static final BigInteger g;

    static {
        c.a = c.f();
        c.b = c.g();
        c.c = c.h();
        c.d = BigInteger.valueOf(2L);
        c.e = BigInteger.valueOf(3L);
        c.f = BigInteger.valueOf(4L);
        c.g = BigInteger.valueOf(8L);
    }

    static a a(a c$a0, a c$a1, BigInteger bigInteger0, BigInteger bigInteger1) {
        if(c$a0.a()) {
            return c$a1;
        }
        if(c$a1.a()) {
            return c$a0;
        }
        BigInteger bigInteger2 = c$a0.c.multiply(c$a0.c).mod(bigInteger1);
        BigInteger bigInteger3 = c$a1.c.multiply(c$a1.c).mod(bigInteger1);
        BigInteger bigInteger4 = c$a0.a.multiply(bigInteger3).mod(bigInteger1);
        BigInteger bigInteger5 = c$a1.a.multiply(bigInteger2).mod(bigInteger1);
        BigInteger bigInteger6 = c$a0.b.multiply(c$a1.c).mod(bigInteger1).multiply(bigInteger3).mod(bigInteger1);
        BigInteger bigInteger7 = c$a1.b.multiply(c$a0.c).mod(bigInteger1).multiply(bigInteger2).mod(bigInteger1);
        if(bigInteger4.equals(bigInteger5)) {
            return bigInteger6.equals(bigInteger7) ? c.c(c$a0, bigInteger0, bigInteger1) : a.d;
        }
        BigInteger bigInteger8 = bigInteger5.subtract(bigInteger4).mod(bigInteger1);
        BigInteger bigInteger9 = bigInteger8.multiply(c.f).multiply(bigInteger8).mod(bigInteger1);
        BigInteger bigInteger10 = bigInteger8.multiply(bigInteger9).mod(bigInteger1);
        BigInteger bigInteger11 = bigInteger7.subtract(bigInteger6).multiply(c.d).mod(bigInteger1);
        BigInteger bigInteger12 = bigInteger4.multiply(bigInteger9).mod(bigInteger1);
        BigInteger bigInteger13 = bigInteger11.multiply(bigInteger11).mod(bigInteger1).subtract(bigInteger10).subtract(bigInteger12.multiply(c.d)).mod(bigInteger1);
        BigInteger bigInteger14 = bigInteger11.multiply(bigInteger12.subtract(bigInteger13)).subtract(bigInteger6.multiply(c.d).multiply(bigInteger10)).mod(bigInteger1);
        BigInteger bigInteger15 = c$a0.c.add(c$a1.c);
        return new a(bigInteger13, bigInteger14, bigInteger15.multiply(bigInteger15).mod(bigInteger1).subtract(bigInteger2).subtract(bigInteger3).multiply(bigInteger8).mod(bigInteger1));
    }

    public static void b(ECPoint eCPoint0, EllipticCurve ellipticCurve0) throws GeneralSecurityException {
        BigInteger bigInteger0 = c.d(ellipticCurve0);
        BigInteger bigInteger1 = eCPoint0.getAffineX();
        BigInteger bigInteger2 = eCPoint0.getAffineY();
        if(bigInteger1 == null || bigInteger2 == null) {
            throw new GeneralSecurityException("point is at infinity");
        }
        if(bigInteger1.signum() == -1 || bigInteger1.compareTo(bigInteger0) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        }
        if(bigInteger2.signum() == -1 || bigInteger2.compareTo(bigInteger0) >= 0) {
            throw new GeneralSecurityException("y is out of range");
        }
        if(!bigInteger2.multiply(bigInteger2).mod(bigInteger0).equals(bigInteger1.multiply(bigInteger1).add(ellipticCurve0.getA()).multiply(bigInteger1).add(ellipticCurve0.getB()).mod(bigInteger0))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    static a c(a c$a0, BigInteger bigInteger0, BigInteger bigInteger1) {
        if(c$a0.b.equals(BigInteger.ZERO)) {
            return a.d;
        }
        BigInteger bigInteger2 = c$a0.a.multiply(c$a0.a).mod(bigInteger1);
        BigInteger bigInteger3 = c$a0.b.multiply(c$a0.b).mod(bigInteger1);
        BigInteger bigInteger4 = bigInteger3.multiply(bigInteger3).mod(bigInteger1);
        BigInteger bigInteger5 = c$a0.c.multiply(c$a0.c).mod(bigInteger1);
        BigInteger bigInteger6 = c$a0.a.add(bigInteger3);
        BigInteger bigInteger7 = bigInteger6.multiply(bigInteger6).mod(bigInteger1).subtract(bigInteger2).subtract(bigInteger4).multiply(c.d);
        BigInteger bigInteger8 = bigInteger2.multiply(c.e).add(bigInteger0.multiply(bigInteger5).multiply(bigInteger5).mod(bigInteger1));
        BigInteger bigInteger9 = bigInteger8.multiply(bigInteger8).mod(bigInteger1).subtract(bigInteger7.multiply(c.d)).mod(bigInteger1);
        BigInteger bigInteger10 = bigInteger8.multiply(bigInteger7.subtract(bigInteger9)).mod(bigInteger1).subtract(bigInteger4.multiply(c.g)).mod(bigInteger1);
        BigInteger bigInteger11 = c$a0.b.add(c$a0.c);
        return new a(bigInteger9, bigInteger10, bigInteger11.multiply(bigInteger11).mod(bigInteger1).subtract(bigInteger3).subtract(bigInteger5).mod(bigInteger1));
    }

    public static BigInteger d(EllipticCurve ellipticCurve0) throws GeneralSecurityException {
        ECField eCField0 = ellipticCurve0.getField();
        if(!(eCField0 instanceof ECFieldFp)) {
            throw new GeneralSecurityException("Only curves over prime order fields are supported");
        }
        return ((ECFieldFp)eCField0).getP();
    }

    private static ECParameterSpec e(String s, String s1, String s2, String s3, String s4) {
        BigInteger bigInteger0 = new BigInteger(s);
        BigInteger bigInteger1 = new BigInteger(s1);
        BigInteger bigInteger2 = bigInteger0.subtract(new BigInteger("3"));
        BigInteger bigInteger3 = new BigInteger(s2, 16);
        BigInteger bigInteger4 = new BigInteger(s3, 16);
        BigInteger bigInteger5 = new BigInteger(s4, 16);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger0), bigInteger2, bigInteger3), new ECPoint(bigInteger4, bigInteger5), bigInteger1, 1);
    }

    private static ECParameterSpec f() {
        return c.e("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
    }

    private static ECParameterSpec g() {
        return c.e("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
    }

    private static ECParameterSpec h() {
        return c.e("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
    }

    // 去混淆评级： 低(30)
    public static boolean i(ECParameterSpec eCParameterSpec0) {
        return c.j(eCParameterSpec0, c.a) || c.j(eCParameterSpec0, c.b) || c.j(eCParameterSpec0, c.c);
    }

    // 去混淆评级： 低(30)
    public static boolean j(ECParameterSpec eCParameterSpec0, ECParameterSpec eCParameterSpec1) {
        return eCParameterSpec0.getCurve().equals(eCParameterSpec1.getCurve()) && eCParameterSpec0.getGenerator().equals(eCParameterSpec1.getGenerator()) && eCParameterSpec0.getOrder().equals(eCParameterSpec1.getOrder()) && eCParameterSpec0.getCofactor() == eCParameterSpec1.getCofactor();
    }

    public static ECPoint k(BigInteger bigInteger0, ECParameterSpec eCParameterSpec0) throws GeneralSecurityException {
        if(!c.i(eCParameterSpec0)) {
            throw new GeneralSecurityException("spec must be NIST P256, P384 or P521");
        }
        if(bigInteger0.signum() != 1) {
            throw new GeneralSecurityException("k must be positive");
        }
        if(bigInteger0.compareTo(eCParameterSpec0.getOrder()) >= 0) {
            throw new GeneralSecurityException("k must be smaller than the order of the generator");
        }
        EllipticCurve ellipticCurve0 = eCParameterSpec0.getCurve();
        ECPoint eCPoint0 = eCParameterSpec0.getGenerator();
        c.b(eCPoint0, ellipticCurve0);
        BigInteger bigInteger1 = eCParameterSpec0.getCurve().getA();
        BigInteger bigInteger2 = c.d(ellipticCurve0);
        a c$a0 = c.l(ECPoint.POINT_INFINITY, bigInteger2);
        a c$a1 = c.l(eCPoint0, bigInteger2);
        for(int v = bigInteger0.bitLength(); v >= 0; --v) {
            if(bigInteger0.testBit(v)) {
                c$a0 = c.a(c$a0, c$a1, bigInteger1, bigInteger2);
                c$a1 = c.c(c$a1, bigInteger1, bigInteger2);
            }
            else {
                c$a1 = c.a(c$a0, c$a1, bigInteger1, bigInteger2);
                c$a0 = c.c(c$a0, bigInteger1, bigInteger2);
            }
        }
        ECPoint eCPoint1 = c$a0.b(bigInteger2);
        c.b(eCPoint1, ellipticCurve0);
        return eCPoint1;
    }

    static a l(ECPoint eCPoint0, BigInteger bigInteger0) {
        if(eCPoint0.equals(ECPoint.POINT_INFINITY)) {
            return a.d;
        }
        BigInteger bigInteger1 = new BigInteger(1, L.c((bigInteger0.bitLength() + 8) / 8)).mod(bigInteger0);
        BigInteger bigInteger2 = bigInteger1.multiply(bigInteger1).mod(bigInteger0);
        BigInteger bigInteger3 = bigInteger2.multiply(bigInteger1).mod(bigInteger0);
        return new a(eCPoint0.getAffineX().multiply(bigInteger2).mod(bigInteger0), eCPoint0.getAffineY().multiply(bigInteger3).mod(bigInteger0), bigInteger1);
    }
}

