/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg5.poo;

/**
 *
 * @author Estudiante
 */
public class Principal {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.number = 5;
        cuenta.balance = 200;
        cuenta.owner="Valeria";
        
        System.out.println(cuenta.number);
        cuenta.deposit(200);
        System.out.println(cuenta.balance);
        
    }
}
