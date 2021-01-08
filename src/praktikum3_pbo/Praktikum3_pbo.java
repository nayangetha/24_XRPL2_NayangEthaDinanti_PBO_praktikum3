/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3_pbo;
import java.util.Scanner;
/**
 *
 * @author MOKLET1
 */
public class Praktikum3_pbo {

    //Variabel intence
    //Penyimpanan data dalam atribut dengan memnggunakan tipe data string
    String nis = "2883729192736";
    String nama = "Nayang Etha Dinanti";
    String tempat_lahir = "Kediri";
    String tanggal_lahir = "06 Maret 2005";
    String kelamin = "Perempuan";
    String alamat = "Jl. Gubernur Surya";
    String alamat_malang = "Jl. Danau Ranau";
    String motto = "Optimisme merupakan kepercayaan yang menuju pencapaian";
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Scanner
        Scanner input = new Scanner(System.in);
        
        //objek
        Praktikum3_pbo biodata = new Praktikum3_pbo();
        
        //Menampilkan hasil dengan memanggil semua atribut yang telah berisikan data pada variabel intence
        
        System.out.println("  BIODATA LENGKAP SISWA SMK TELKOM MALANG ANGKATAN 29");
        System.out.println("‣ Nama Siswa = "+biodata.nama);
        System.out.println("‣ NIS = "+biodata.nis);
        System.out.println("‣ Tempat Lahir Siswa = "+biodata.tempat_lahir);
        System.out.println("‣ Tanggal Lahir Siswa = "+biodata.tanggal_lahir);
        System.out.println("‣ Jenis Kelamin Siswa = "+biodata.kelamin);
        System.out.println("‣ Alamat Lengkap Siswa (Asli) = "+biodata.alamat);
        System.out.println("‣ Alamat Lengkap Siswa (Selama di Malang) = "+biodata.alamat_malang);
        System.out.println("‣ Motto Hidup Siswa = ~ "+biodata.motto+" ~ ");

    }
    
}
