/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nganhangacb;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class AccountList {
    
        private int n;
        private ArrayList<Account> accList;
        public AccountList() {
            accList=new ArrayList<Account>(10);
            }

    public AccountList(int n) {
        this.n = n;
    }
    public void them(Account ac){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap so luong can them");
         n = sc.nextInt();
         
    }   
}

