package thinking.of.oop;


/*
 * StringBuilder/StringBuffer �O�ݩ�String�����S���s�b, �@�뱡�p�UString�u�n�Ыؤ���n���קﳣ�|�B�~�Ыؤ@�ӷs����,
 * �]���z�LStringBuilder/StringBuffer ���Ѫ�append/delete��k�h��String�����, �i�H�z�Ѭ��@���Ы�StringBuilder/StringBuffer
 * �O���|�ߧY�ͦ���, �ӬO�|�b�w�s�̰����, �u����̫�եίS�w����Ƥ~�|�u���ͦ�String�b�O���餤.
 * 
 * 
 * StringBuilder ������k StringBuffer����, �u�OStringBuffer��󤤦�synchronized����r, �Ω󦳦h�Ӱ�����|�P�ɹ�o�ǭȰ���諸�ɭ�
 * �קK�Ȫ�race condition���D
 */
public class StringBuilderStringBuffer {

  public static void main(String[] args) {
    // �c�y��k�̥i�H�ǤJcapacity value, �p�G���G���j�p�i�H���e�w��, �i�H�����]�wcapacity, �קK�ݭn�۰��X�R�����p
    StringBuilder sb = new StringBuilder();
    StringBuffer sb1 = new StringBuffer();

    // �����append��k, �|�۰��ˬdcapacity, �p�Gcapacity�����h�|�۰��X�Rcapacity.
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

    // ����append��k�Mcapacity�����Y, �����append��k�ɷ|�h�ˬdcapacity������,�������ܷ|�۰��X�Rcapacity.
    // �U��Ҥl�i�H�o�{�쥻capacity=34, ��append���ר����j��string, �hcapacity=70
    System.out.println(sb.capacity());
    System.out.println(sb.length());
    sb.append("11111111111111111111111111");
    System.out.println(sb.capacity());
    System.out.println(sb.length());

    /*
     * capacity�q�`�j��ثeString������, �]�����O�F�@�ǪŶ� ���p�A�Ʊ���n�ϥΧ��o�ǪŶ�, �i�H�z�LtrimToSize��k
     */
    sb.trimToSize();
    System.out.println(sb.capacity());
    System.out.println(sb.length());

  }

}
