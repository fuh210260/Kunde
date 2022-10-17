public class TestKunde {
     public static void test() {
         Kunde k;
         
         k = new Kunde();
         
         System.out.println(k.toString());      //Variant 3 (einkaeufe > 0 && guthaben > 0)
         
         k.setGuthaben(0);
         System.out.println(k.toString());      //Variant 2 (einkaeufe > 0 && guthaben == 0)
         
         k.setEinkaeufe(0);
         System.out.println(k.toString());      //Variant 1 (einkaeufe == 0 && guthaben == 0)
         
         k.setGuthaben(10);
         System.out.println(k.toString());      //Variant 4 (einkaeufe == 0 && guthaben > 0)
     }
}