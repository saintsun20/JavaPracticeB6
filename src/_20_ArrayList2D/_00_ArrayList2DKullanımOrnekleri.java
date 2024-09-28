package _20_ArrayList2D;


import java.util.ArrayList;

public class _00_ArrayList2DKullanımOrnekleri {
    public static void main(String[] args) {
        // 2D ArrayList oluşturma
        ArrayList<ArrayList<Integer>>twoDArrayList=new ArrayList<>();

        // Satır ekleme
        ArrayList<Integer> satir1=new ArrayList<>();
        satir1.add(1);
        satir1.add(2);
        satir1.add(3);
        twoDArrayList.add(satir1); // Birinci satırı 2D ArrayList'e ekliyoruz.

        ArrayList<Integer> satir2=new ArrayList<>();
        satir2.add(4);
        satir2.add(5);
        satir2.add(6);
        twoDArrayList.add(satir2); // İkinci satırı 2D ArrayList'e ekliyoruz.

        ArrayList<Integer> satir3=new ArrayList<>();
        satir3.add(7);
        satir3.add(8);
        satir3.add(9);
        twoDArrayList.add(satir3);// Üçüncü satırı 2D ArrayList'e ekliyoruz.

        // Eleman Okuma
        System.out.println("twoDArrayList.get(0).get(2) = " + twoDArrayList.get(0).get(2));

        // Eleman güncelleme
        twoDArrayList.get(0).set(2,8);

        System.out.println("twoDArrayList.get(0).get(2) = " + twoDArrayList.get(0).get(2));


    }
}
