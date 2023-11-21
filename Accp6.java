package accp6;

class kendaraan {
    String nama;
    public void gerak(){
        System.out.println("Kendaraan Bergerak");
    }
}

class mobil extends kendaraan{
    String nama = "mobil";
    
    public void bbm(){
        System.out.println("- "+nama + " menggunakan BBM jenis solar");
    }
    public void gerak(){
        System.out.println("- "+nama + " Bergerak dengan cepat");
    } 
}

class motor extends kendaraan{
    String nama = "motor";
    
    public void bbm(){
        System.out.println("- "+nama + " menggunakan BBM jenis pertalite");
    }
    public void gerak(){
        System.out.println("- "+nama + " Bergerak dengan sedang");
} 
}
public class Accp6 {
    public static void main(String[] args) {
        mobil mobil = new mobil();
        motor motor = new motor();
        
        System.out.println("JENIS-JENIS KENDARAAN: \n");
        mobil.bbm(); 
        mobil.gerak(); 
        System.out.println(" ");
        motor.bbm(); 
        motor.gerak();
    }
    
}
