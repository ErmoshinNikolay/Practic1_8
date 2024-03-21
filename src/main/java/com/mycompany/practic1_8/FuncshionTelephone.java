/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practic1_8;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Erm
 */
public class FuncshionTelephone {
    private List<Telephone> telephoneList = new ArrayList<>();
    
    public void addTelephone(Telephone telephone){
        if(!telephoneList.stream().anyMatch(p->p.getSeriaNumber().equals(telephone.getSeriaNumber()))){
            telephoneList.add(telephone);
        }
        else{
            System.out.println("Телефон с таким серийным номером уже существует");
            
        }
    }
public void removeTelephone(String seriaNumber){
    telephoneList.removeIf(p->p.getSeriaNumber().equals(seriaNumber));
    
}  
public void removeAllTelephones(){
    telephoneList.clear();
    System.out.println("Все телефоны удалены");
    
}
public void PrintTelephones(){
    System.out.println("Текущий список телефонов:");
    if (telephoneList.isEmpty()){
        System.out.println("Список пуст:");
    }
    else{
        for(Telephone telephone: telephoneList){
            System.out.println(telephone);
        }
    }
    
}
}
