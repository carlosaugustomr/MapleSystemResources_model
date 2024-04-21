/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Login;

/**
 *
 * @author carlo
 */
public class LoginController {

    private final Login view;
    public LoginController(Login view){
        this.view = view;
        
    }
    public void fizTarefa(){
        System.out.print("busquei algo do banco de dados");
        this.view.exibeMensagem("Execuei o fiz tarefa"); 
    }
}
