package thinking.of.oop;


/*
 * StringBuilder/StringBuffer 是屬於String類中特殊的存在, 一般情況下String只要創建之後要做修改都會額外創建一個新的值,
 * 因此透過StringBuilder/StringBuffer 提供的append/delete方法去對String做更改, 可以理解為一旦創建StringBuilder/StringBuffer
 * 是不會立即生成的, 而是會在緩存裡做更改, 只有當最後調用特定的函數才會真正生成String在記憶體中.
 * 
 * 
 * StringBuilder 有的方法 StringBuffer都有, 只是StringBuffer文件中有synchronized關鍵字, 用於有多個執行緒會同時對這些值做更改的時候
 * 避免值的race condition問題
 */
public class StringBuilderStringBuffer {

  public static void main(String[] args) {
    // 構造方法裡可以傳入capacity value, 如果結果的大小可以提前預知, 可以直接設定capacity, 避免需要自動擴充的情況
    StringBuilder sb = new StringBuilder();
    StringBuffer sb1 = new StringBuffer();

    // 當執行append方法, 會自動檢查capacity, 如果capacity不夠則會自動擴充capacity.
    sb.append("Welcome");
    sb.append(' ');
    sb.append("to");
    sb.append(' ');
    sb.append("Java");
    System.out.println(sb.toString());  

    sb.insert(11, "HTML and ");
    System.out.println(sb.toString());

    sb.delete(8, 11);
    System.out.println(sb.toString());

    sb.deleteCharAt(8);
    System.out.println(sb.toString());

    // 實驗append方法和capacity的關係, 當執行append方法時會去檢查capacity夠不夠,不夠的話會自動擴充capacity.
    // 下方例子可以發現原本capacity=34, 當append長度足夠大的string, 則capacity=70
    System.out.println(sb.capacity());
    System.out.println(sb.length());
    sb.append("11111111111111111111111111");
    System.out.println(sb.capacity());
    System.out.println(sb.length());

    /*
     * capacity通常大於目前String的長度, 因此浪費了一些空間 假如你希望能恰好使用完這些空間, 可以透過trimToSize方法
     */
    sb.trimToSize();
    System.out.println(sb.capacity());
    System.out.println(sb.length());

  }

}
