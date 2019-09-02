/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uabcscoin;

import controller.CtrlLogin;

/**
 *
 * @author Alumno
 */
public class Uabcscoin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        VLogin view = new VLogin();
        CtrlLogin controller = new CtrlLogin(view);
        controller.init();
    }
    
}
