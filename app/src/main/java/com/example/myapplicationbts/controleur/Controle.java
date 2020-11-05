package com.example.myapplicationbts.controleur;

import com.example.myapplicationbts.modele.Profil;

public final class Controle {

    private static Controle instance = null;
    private Profil profil;

    private Controle(){
        super();
    }


    public static final Controle getInstance(){
        if(instance == null ){
            Controle.instance = new Controle();


        }
        return Controle.instance;
    }

    public void creerProfil( String produit,int nbrProduit){
        profil = new profil();
    }




}
