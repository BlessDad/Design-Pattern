public class Main {
    public static void main(String[] args) {
        Song s1 = new Song();
        s1.setDiscountMode("NonDiscounted");
        Song s2 = new Song();
        s2.setDiscountMode("NonDiscounted");

        Song s3 = new Song();
        s3.setDiscountMode("OnSale");

        Song s4 = new Song();
        s4.setDiscountMode("TodayEvent");

        CartForSongs c = new CartForSongs();
        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);
        System.out.println(c.calculateTotalPrice());
    }
}