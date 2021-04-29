package com.company;

public class UserManager extends User{
    public void addUser(User user){
        System.out.println(user.getFirstName()+" "+user.getSecondName()+" İsimli kullanıcının bilgileri sisteme eklendi.");
    }

    public void removeUser(User user){
        System.out.println(user.getFirstName()+" "+user.getSecondName()+" İsimli kullanıcının bilgileri sistemden silindi.");
    }

    public void updateUser(User user){
        System.out.println(user.getFirstName()+" "+user.getSecondName()+" İsimli kullanıcının bilgileri sistemde güncellendi.");
    }
}
