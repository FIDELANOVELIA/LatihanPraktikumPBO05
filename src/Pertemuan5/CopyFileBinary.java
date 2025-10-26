/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author ASUS
 */
import java.io.*;

public class CopyFileBinary {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Cara pakai: java CopyFileCharacter input.txt output.txt");
            return;
        }

        String sumber = args[0];
        String tujuan = args[1];

        try (FileReader fr = new FileReader(sumber);
             FileWriter fw = new FileWriter(tujuan)) {

            int karakter;
            while ((karakter = fr.read()) != -1) {
                fw.write(karakter);
            }

            System.out.println("File berhasil disalin ke " + tujuan);
        } catch (IOException e) {
            System.out.println("Gagal menyalin file: " + e.getMessage());
        }
    }
}
