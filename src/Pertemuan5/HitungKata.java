/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author ASUS
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class HitungKata {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan kalimat: ");
        String kalimat = br.readLine().trim();

        if (kalimat.isEmpty()) {
            System.out.println("Jumlah kata: 0");
        } else {
            String[] kata = kalimat.split("\\s+");
            System.out.println("Jumlah kata: " + kata.length);
        }
    }
}

