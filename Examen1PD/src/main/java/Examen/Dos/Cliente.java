package Examen.Dos;

public class Cliente {

    public static void main (String []args){
        Televisor tele = new Televisor();

        tele.setSo("android");
        tele.setVersionSo("11.0");
        tele.setPulgadas(80);
        tele.setResolucion(50);
        tele.setPuerto(true);
        tele.setUsb(4);
        tele.setControl(true);
        tele.setBluetooth(true);
        tele.setSerial("");

        Televisor tele1 = (Televisor) tele.clone();
        tele1.setSerial("1234359786");

        Televisor tele2 = (Televisor) tele.clone();
        tele2.setSerial("3456784591");

        Televisor tele3 = (Televisor) tele.clone();
        tele3.setSerial("4769023671");

        Televisor tele4 = (Televisor) tele.clone();
        tele4.setSerial("3671098765");

        Televisor tele5 = (Televisor) tele.clone();
        tele5.setSerial("7890512345");

        tele1.show();
        tele2.show();
        tele3.show();
        tele4.show();
        tele5.show();


    }

}
