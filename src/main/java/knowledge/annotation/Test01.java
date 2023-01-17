package knowledge.annotation;

public class Test01 {

  public static void main(String[] args) {
    testDecrecated();
  }


  // 內建註解, 表達以下方法不建議使用, 有更好的方法可以替代.
  @Deprecated
  public static void testDecrecated() {

  }

  // 內建註解, 消除一些警告(ex: 宣告變數但沒有使用)
  @SuppressWarnings("unused")
  public static void unusedMethod() {

  }

}
