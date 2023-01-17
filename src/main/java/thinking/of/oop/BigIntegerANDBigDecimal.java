package thinking.of.oop;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerANDBigDecimal {

  public static void main(String[] args) {
    // BigInteger and BigDecimal 類型可以用來表示任意大小和精度的整數和十進制數字.
    // 用於特殊情況, 需要大小超過基本數據類型時候的計算
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
