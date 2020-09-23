package Lab6;

import java.util.StringTokenizer;

public class Example_StringToken {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("สารสนเทศ (Information) หมายถึง ข้อมูลที่มีสาระอยู่ในตัว สามารถสื่อความหมายให้เกิด\n" +
                "การเข้าใจกับผู้ที่ต้องการใช้ข้อมูลนั้น และสามารถที่จะนำไปใช้ประโยชน์ต่อไปได้\n" +
                "การที่จะได้มาซึ่งสารสนเทศที่ต้องการนั้นจะต้องนำข้อมูล (data) ที่เกี่ยวข้องกับเรื่องที่สนใจ\n" +
                "มาทำการประมวลผลเสียก่อน ");
        StringTokenizer strToken = new StringTokenizer(str.toString());
        int countWord = strToken.countTokens();
        System.out.println("Word count: "+countWord);

        while (strToken.hasMoreTokens()){
            System.out.println(strToken.nextToken());
        }
    }
}
