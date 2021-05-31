package Examen.Dos;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Televisor implements ITelevisor{

    private String so;
    private String versionSo;
    private int pulgadas;
    private int resolucion;
    private Boolean puerto;
    private int usb;
    private Boolean control;
    private Boolean bluetooth;
    private String serial;

    public Televisor(){}

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public String getVersionSo() {
        return versionSo;
    }

    public void setVersionSo(String versionSo) {
        this.versionSo = versionSo;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getPuerto() {
        return puerto;
    }

    public void setPuerto(Boolean puerto) {
        this.puerto = puerto;
    }

    public int getUsb() {
        return usb;
    }

    public void setUsb(int usb) {
        this.usb = usb;
    }

    public Boolean getControl() {
        return control;
    }

    public void setControl(Boolean control) {
        this.control = control;
    }

    public Boolean getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(Boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public Object clone(){
        Televisor objClone = new Televisor();
        objClone.setSo(this.so);
        objClone.setVersionSo(this.versionSo);
        objClone.setPulgadas(this.pulgadas);
        objClone.setResolucion(this.resolucion);
        objClone.setPuerto(this.puerto);
        objClone.setUsb(this.usb);
        objClone.setControl(this.control);
        objClone.setBluetooth(this.bluetooth);
        objClone.setSerial(this.serial);
        return objClone;
    }

    public void show(){
        System.out.println("****************************");
        System.out.println("Sistema Operativo: " + so);
        System.out.println("Version del SO: " + versionSo);
        System.out.println("Pulgadas: " + pulgadas);
        System.out.println("Resolucion: " + resolucion);
        System.out.println("Puerto HDMI: " + puerto);
        System.out.println("Puertos USB: " + usb);
        System.out.println("Control remoto: " + control);
        System.out.println("Bluetooth: " + bluetooth);
        System.out.println("Serial: " + serial);

    }

}
