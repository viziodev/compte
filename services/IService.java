package services;

import models.Client;

public interface IService {
      //1-Creer client
      void  addClient(Client client); 
      //2-Lister les Clients
      void showClient();
      //3-Creer un Compte, on lui affecte un client
      //4-Lister les Comptes
      //5-Lister les comptes par Type
      //6-Lister les comptes d'un client
      //7-Faire une Operation
           //1-Depot
           //2-Retrait
           //3-Virement
           //4-Consultation
}
