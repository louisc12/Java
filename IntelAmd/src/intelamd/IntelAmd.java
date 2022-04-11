/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intelamd;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dolly
 */
public class IntelAmd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AreaComun1 areacomun1 = new AreaComun1();
        AreaComun2 areacomun2 = new AreaComun2();
        
        // HILOS
        FabricaDeAMD fabamd = new FabricaDeAMD(areacomun1);
        FabricaDeINTEL fabintel = new FabricaDeINTEL(areacomun1);
        LineaFabricacion linea = new LineaFabricacion(areacomun1);
        Recolector1 recolector1 = new Recolector1(areacomun1, areacomun2);
        Recolector2 recolector2 =  new Recolector2(areacomun1, areacomun2);   
        Recolector3 recolector3 = new Recolector3(areacomun1, areacomun2);
        Consumidor1 cons1 = new Consumidor1(areacomun2);
        Consumidor2 cons2 = new Consumidor2(areacomun2);
        Consumidor3 cons3 = new Consumidor3(areacomun2);
        Consumidor4 cons4 = new Consumidor4(areacomun2);
        Consumidor5 cons5 = new Consumidor5(areacomun2);
        
        Thread thread1 = new Thread(fabamd);
        Thread thread2 = new Thread(fabintel);
        Thread thread3 = new Thread(linea);
        Thread thread4 = new Thread(recolector1);
        Thread thread5 = new Thread(recolector2);
        Thread thread6 = new Thread(recolector3);
        Thread thread7 = new Thread(cons1);
        Thread thread8 = new Thread(cons2);
        Thread thread9 = new Thread(cons3);
        Thread thread10 = new Thread(cons4);
        Thread thread11 = new Thread(cons5);
        
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
        thread11.start();
        
        
        while(thread1.isAlive() || thread2.isAlive() || thread3.isAlive() || thread4.isAlive() || thread5.isAlive() || thread6.isAlive() || thread7.isAlive() || thread8.isAlive() || thread9.isAlive()|| thread10.isAlive() || thread11.isAlive()){
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(IntelAmd.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        System.out.println("¿Qué núcleo alcanzó más veces el estado de prueba? : ");
        if(areacomun1.getContadoramd()>areacomun1.getContadorintel()){
            System.out.println("Se produjeron más de AMD" );
        }else
            System.out.println("Se produjeron más de INTEL");
        
        System.out.println("¿Cuál fue el numero de veces que cada consumidor no pudo satisfacer su demanda?: ");
        System.out.println(areacomun2.getContador_cons1());
        System.out.println(areacomun2.getContador_cons2());
        System.out.println(areacomun2.getContador_cons3());
        System.out.println(areacomun2.getContador_cons4());
        System.out.println(areacomun2.getContador_cons5());
        
    }
    
}
