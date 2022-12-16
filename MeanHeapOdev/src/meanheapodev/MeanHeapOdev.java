/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meanheapodev;

import java.util.Scanner;

/**
 *
 * @author Zeynep DEMİR 02200201032
 */
public class MeanHeapOdev {
    // eğer i bir yaprak düğümse doğru olarak döndür
	public static boolean minHeapKontrol(int[] A, int i)
	{
		// eğer i bir yaprak düğümse, tüm yaprak düğümleri heap olduğundan true döndür
		if (2*i + 2 > A.length) {
			return true;
		}

		// i dahili bir düğümse

		// özyineli bir şekilde sol çocuğun düğüm olup olmadığını kontrol et
		boolean sol = (A[i] <= A[2*i + 1]) && minHeapKontrol(A, 2*i + 1);

		// özyineli bir şekilde sağ çocuğun düğüm olup olmadığını kontrol et
		boolean sag = (2*i + 2 == A.length) ||
						(A[i] <= A[2*i + 2] && minHeapKontrol(A, 2*i + 2));

		// eğer hem sağ hem de sol düğüm heapse true döndür
		return sol && sag;
	}

	public static void main(String[] args)
	{
             Scanner reader = new Scanner(System.in);
             System.out.print("Bir Sayı Girin: ");
             int sayi1 = reader.nextInt();
             int sayi2 = reader.nextInt();
             int sayi3 = reader.nextInt();
		int[] A = {sayi1, sayi2, sayi3};

		// heapin kökü olarak 0 dan başlat
		int index = 0;

		if (minHeapKontrol(A, index)) {
			System.out.println("evet min heaptir");
		}
		else {
			System.out.println("hayir min heap degildir");
		}
	}
}



	 