package Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

import org.dgb.archive.entities.Role;
import org.dgb.archive.entities.Utilisateur;
import org.dgb.archive.metier.IAdminMetier;
import org.springframework.beans.factory.parsing.ReaderEventListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
                IAdminMetier metier = (IAdminMetier) context.getBean("metier");	
                
          /*     metier.ajouterUtilisateur(new Utilisateur("Azzouni","Nazih","div1","dir1","sdir1",9,'f',"bn_azzouni@esi.dz","nazih_azzouni","123"));
                metier.ajouterUtilisateur(new Utilisateur("Ferhat","Abdennour","div1","dir1","sdir1",9,'f',"aa_ferhat@esi.dz","abdennour_ferhat","456"));
                System.out.println("fin insertion");  
                
                
                metier.ajouterRole(new Role("ROLE_Admin"));
                metier.ajouterRole(new Role("ROLE_Archiviste"));
                System.out.println("-------Fin ajouter roles------");

                metier.attribuerUserRole(1, 1);
                metier.attribuerUserRole(1, 2);
                System.out.println("-------Fin attribuer roles------");

               List<Role> rol = metier.getListRole();
                for(Role roles:rol){
                    System.out.println(roles.getIdRole()+" "+roles.getNomRole());
                    
                     }
                System.out.println("-------Fin afficher roles------");
               List<Utilisateur> usr = metier.listUsersParRole("Admin");
                for(Utilisateur users:usr){
                    System.out.println(users.getNom()+" "+users.getPrenom());
                    
                     }
                
                System.out.println("-------Fin list Users roles------");
                List<Utilisateur> usrs = metier.listUsersParRole(1);
                 for(Utilisateur users:usrs){
                     System.out.println(users.getNom()+" "+users.getPrenom());
                     
                      }
                 
                 System.out.println("-------Fin list Users roles------");
                 List<Role> rr = metier.listRoleUser("nazih");
                  for(Role rr2:rr){
                      System.out.println(rr2.getNomRole());
                      
                       }
                  System.out.println("-------Fin list roles Users------");

                  
                  List<Role> rrr = metier.listRoleUser(1);
                  for(Role rr2:rrr){
                      System.out.println(rr2.getNomRole());
                      
                       }*/
               /* 
                Scanner sc= new Scanner(System.in);
                String chif=sc.nextLine();
                int a=Integer.parseInt(chif);
                System.out.println(a);
                Utilisateur u = metier.rechUtilisateur(a);
                System.out.println("-----------------------------------");

                System.out.println("Nom : "+u.getNom());
                System.out.println("prénom: "+u.getPrenom());
                System.out.println("Division: "+u.getDivision());
                System.out.println("Direction: "+u.getDirection());
                System.out.println("Sous Direction: "+u.getSousdirection());
                System.out.println("Email: "+u.getEmail());
                System.out.println("Nom Utilisateur: "+u.getUsername());
                System.out.println("fin rech par id"); 
                System.out.println("-----------------------------------");
                
                List<Utilisateur> usr = metier.rechUtilisateurParEmail("esi");
                for(Utilisateur users:usr){
                    System.out.println(users.getEmail());


                }
                System.out.println("fin rech par email"); 

                System.out.println("-----------------------------------\n");

                System.out.println("******************************************");
                List<Utilisateur> user = metier.getListUsers();
                for(Utilisateur users:user){
                    System.out.println(users.getNom()+" "+ users.getPrenom());
                    


                }
                System.out.println("******************************************");
                System.out.println("fin list users"); 

        metier.supprimerUtilisateur(a);
        
        System.out.println("******************************************");
        List<Utilisateur> us = metier.getListUsers();
        for(Utilisateur users:us){
            System.out.println(users.getNom()+" "+ users.getPrenom());
            


        }
        System.out.println("******************************************");
        System.out.println("fin list users"); */
 
              int swValue;

                // Display menu graphics
         do{
        	    System.out.println("==================================");
                System.out.println("|              MENU               |");
                System.out.println("==================================");
                System.out.println("| Options:                        |");
                System.out.println("|        1. Inserer User          |");
                System.out.println("|        2. Rech User par ID      |");
                System.out.println("|        3. Rech User par Username|");
                System.out.println("|        4. Rech User par Email   |");
                System.out.println("|        5. List Users            |");
                System.out.println("|        6. Inserer Role          |");
                System.out.println("|        7. List Roles            |");
                System.out.println("|        8. Ajouter Role à User   |");
                System.out.println("|        9. List Users par role   |");
                System.out.println("|       10. List Roles d'un user  |");
                System.out.println("|       11. Supprimer User        |");
                System.out.println("|       12. Exit                  |");
                System.out.println("===================================");
                Scanner sc= new Scanner(System.in);
                String chif=sc.nextLine();
                swValue = Integer.parseInt(chif);
                // Switch construct
                switch (swValue) {
                case 1:
                   System.out.println("La division : ");
                	 Scanner sc2= new Scanner(System.in);
                     String div=sc2.nextLine();
                     System.out.println("La direction : ");

                     Scanner sc3= new Scanner(System.in);
                     String dir=sc3.nextLine();
                     System.out.println("La sous direction : ");

                     Scanner sc4= new Scanner(System.in);
                     String sdir=sc4.nextLine();
                     System.out.println("Etage : ");

                     Scanner sc10= new Scanner(System.in);
                     String etag=sc10.nextLine();
                     int etage = Integer.parseInt(etag);
                     System.out.println("La zone : ");

                     Scanner sc11= new Scanner(System.in);
                     String zon=sc11.nextLine();
                     char zone = zon.charAt(0);
                     System.out.println("Le nom : ");

                     Scanner sc5= new Scanner(System.in);
                     String nom=sc5.nextLine();
                     System.out.println("Le prénom : ");

                     Scanner sc6= new Scanner(System.in);
                     String prenom=sc6.nextLine();
                     System.out.println("Email : ");

                     Scanner sc7= new Scanner(System.in);
                     String email=sc7.nextLine();
                     Scanner sc8= new Scanner(System.in);
                     System.out.println("nom d'utilisateur : ");

                     String username=sc8.nextLine();
                     Scanner sc9= new Scanner(System.in);
                     System.out.println("Mot de passe : ");

                     String password=sc9.nextLine();
                     Scanner sc21= new Scanner(System.in);
                     
                     
                     metier.ajouterUtilisateur(new Utilisateur(nom,prenom,div,dir,sdir,etage,zone,email,username,password));
                  break;
                case 2:
                    System.out.println("Entrer l'ID");

                	Scanner sc12= new Scanner(System.in);
                    String id=sc12.nextLine();
                    int a=Integer.parseInt(id);
                    //System.out.println(a);
                    Utilisateur u = metier.rechUtilisateur(a);
                    System.out.println("-----------------------------------");

                    System.out.println("Nom : "+u.getNom());
                    System.out.println("prénom: "+u.getPrenom());
                    System.out.println("Division: "+u.getDivision());
                    System.out.println("Direction: "+u.getDirection());
                    System.out.println("Sous Direction: "+u.getSousdirection());
                    System.out.println("Email: "+u.getEmail());
                    System.out.println("Nom Utilisateur: "+u.getUsername());
                    System.out.println("fin rech par id"); 
                    System.out.println("-----------------------------------");
                  break;
                case 3:
                	System.out.println("Entrer l'username :");

                	Scanner sc13= new Scanner(System.in);
                    String nom_user=sc13.nextLine();
                    //System.out.println(a);
                    
                    List<Utilisateur> usr = metier.rechUtilisateurParUsername(nom_user);
                    for(Utilisateur users:usr){


                    
                    System.out.println("-----------------------------------");
     
                    System.out.println("Nom : "+users.getNom());
                    System.out.println("prénom: "+users.getPrenom());
                    System.out.println("Division: "+users.getDivision());
                    System.out.println("Direction: "+users.getDirection());
                    System.out.println("Sous Direction: "+users.getSousdirection());
                    System.out.println("Email: "+users.getEmail());
                    System.out.println("Nom Utilisateur: "+users.getUsername());
                   
                    System.out.println("-----------------------------------");
                    }
                  break;
                case 4:
                	System.out.println("Entrer l'email :");

                	Scanner sc14= new Scanner(System.in);
                    String mail=sc14.nextLine();
                    //System.out.println(a);
                    
                    List<Utilisateur> usrs = metier.rechUtilisateurParEmail(mail);
                    for(Utilisateur users:usrs){


                    
                    System.out.println("-----------------------------------");
     
                    System.out.println("Nom : "+users.getNom());
                    System.out.println("prénom: "+users.getPrenom());
                    System.out.println("Division: "+users.getDivision());
                    System.out.println("Direction: "+users.getDirection());
                    System.out.println("Sous Direction: "+users.getSousdirection());
                    System.out.println("Email: "+users.getEmail());
                    System.out.println("Nom Utilisateur: "+users.getUsername());
                   
                    System.out.println("-----------------------------------");
                    }
                    break;
                case 5 :
                	 System.out.println("******************************************");
                     List<Utilisateur> user = metier.getListUsers();
                     for(Utilisateur users:user){
                         System.out.println(users.getNom()+" "+ users.getPrenom());
                         


                     }
                     System.out.println("******************************************");
                     System.out.println("fin list users"); 
                     break;
                     
                case 6:
                	 System.out.println("Libellé du Role : ");
                	 Scanner sc15= new Scanner(System.in);
                     String nom_role=sc15.nextLine();
                     metier.ajouterRole(new Role(nom_role));
                     break;
                case 7 :
                	List<Role> rol = metier.getListRole();
                    System.out.println("******************************************");

                    for(Role roles:rol){
                        System.out.println("----------------------------------------");

                        System.out.println(roles.getIdRole()+" "+roles.getNomRole());
                        
                         }
                    System.out.println("-----------------------------------------");
                    break;
                case 8:
                	 System.out.println("Entrer l'ID User");

                 	Scanner sc16= new Scanner(System.in);
                     String idu=sc16.nextLine();
                     int iduser=Integer.parseInt(idu);
                     
                     System.out.println("Entrer l'ID Role");

                  	Scanner sc17= new Scanner(System.in);
                      String idr=sc17.nextLine();
                      int idrole=Integer.parseInt(idr);
                      
                      metier.attribuerUserRole(iduser, idrole);
                      break;
                case 9:
                	 System.out.println("Entrer l'ID Role");

                   	Scanner sc18= new Scanner(System.in);
                       String idrr=sc18.nextLine();
                       int idrole2=Integer.parseInt(idrr);
                    System.out.println("******************************************");

                	  List<Utilisateur> usrss = metier.listUsersParRole(idrole2);
                      for(Utilisateur users:usrss){
                          System.out.println("-----------------------------------------");

                          System.out.println(users.getNom()+" "+users.getPrenom());
                          System.out.println("-----------------------------------------");

                           }
                      
                      System.out.println("-------Fin list Users roles------");
                      break;
                case 10 :
                	 System.out.println("Entrer l'ID User");

                   	Scanner sc19= new Scanner(System.in);
                       String iduu=sc19.nextLine();
                       int iduserr=Integer.parseInt(iduu);
                	System.out.println("------------------------------------");

                    
                    List<Role> rrr = metier.listRoleUser(1);
                    for(Role rr2:rrr){
                        System.out.println(rr2.getNomRole());
                        
                         }
                    break;
                case 11:
               	 System.out.println("Entrer l'ID User");
                	Scanner sc20= new Scanner(System.in);

               	String iduuu=sc20.nextLine();
                int iduserrr=Integer.parseInt(iduuu);
                metier.supprimerUtilisateur(iduserrr);
                
                case 12 :
                	System.out.println("EXIT.......");
                	break;
                default:
                  System.out.println("Invalid selection");
                  break; // This break is not really necessary
                }
                
                
              }while(swValue!=12);
         
	}


	

	}
