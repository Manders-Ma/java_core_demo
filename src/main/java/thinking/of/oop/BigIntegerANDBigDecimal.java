package thinking.of.oop;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerANDBigDecimal {

  public static void main(String[] args) {
    // BigInteger and BigDecimal �����i�H�ΨӪ�ܥ��N�j�p�M��ת���ƩM�Q�i��Ʀr.
    // �Ω�S���p, �ݭn�j�p�W�L�򥻼ƾ������ɭԪ��p��
    BigInteger a = new BigInteger("9999999999999999999");
    BigInteger b = new BigInteger("2");

    BigInteger c = a.multiply(b);
    System.out.println(c);
    
    BigDecimal a1 = new BigDecimal("1.0");
    BigDecimal b1 = new BigDecimal("3");
    
    BigDecimal c1 = a1.divide(b1, 20, BigDecimal.ROUND_UP);
    System.out.println(c1);

  }

}
