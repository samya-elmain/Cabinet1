package com.company;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception {

        int choice = -1;
        int choix = -1;
        Scanner s = new Scanner(System.in);
        File file = new File("Patient.txt");
        File fradio = new File("Radio.txt");
        ArrayList<Patient> al = new ArrayList<Patient>();
        ArrayList<Radio> ar = new ArrayList<Radio>();
        ObjectOutputStream oos = null;
        ObjectOutputStream oos1 = null;
        ObjectInputStream ois = null;
        ObjectInputStream ois1 = null;
        ListIterator li = null;
        do {
            System.out.println("1-Gestion des patients");
            System.out.println("2-Gestion des radios");
            System.out.println("0-EXIT");
            System.out.println("ENTRER VOTRE CHOIX: ");
            choix = s.nextInt();
            switch (choix) {
                case 1:
                    if (file.isFile()) {
                        ois = new ObjectInputStream(new FileInputStream(file));
                        al = (ArrayList<Patient>) ois.readObject();
                        ois.close();
                    }
                    do {
                        System.out.println("1-INSERT");
                        System.out.println("2-DISPLAY");
                        System.out.println("3-SEARCH");
                        System.out.println("4-DELETE");
                        System.out.println("5-UPDATE");
                        System.out.println("0-EXIT");
                        System.out.println("ENTER YOUR CHOICE: ");
                        choice = s.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("Enter how many patients do you want to insert: ");
                                int n = s.nextInt();
                                for (int i = 0; i < n; i++) {
                                    System.out.println("Entrer l'ID du patient: ");
                                    int IDpatient = s.nextInt();
                                    s.nextLine();
                                    System.out.println("Entrer la cin du patient: ");
                                    String cin = s.nextLine();
                                    System.out.println("Entrer le nom du patient: ");
                                    String nom = s.nextLine();
                                    System.out.println("Entrer le prenom du patient: ");
                                    String prenom = s.nextLine();
                                    System.out.println("Entrer la date de naissance du patient: ");
                                    int date = s.nextInt();
                                    s.nextLine();
                                    System.out.println("Entrer le sexe du patient: ");
                                    String sexe = s.nextLine();
                                    al.add(new Patient(IDpatient, date, cin, nom, prenom, sexe));
                                }
                                oos = new ObjectOutputStream(new FileOutputStream(file));
                                oos.writeObject(al);
                                oos.close();
                                break;
                            case 2:
                                if (file.isFile()) {
                                    ois = new ObjectInputStream(new FileInputStream(file));
                                    al = (ArrayList<Patient>) ois.readObject();
                                    ois.close();
                                    li = al.listIterator();
                                    while (li.hasNext())
                                        System.out.println(li.next());
                                }
                                break;
                            case 3:
                                if (file.isFile()) {
                                    ois = new ObjectInputStream(new FileInputStream(file));
                                    al = (ArrayList<Patient>) ois.readObject();
                                    ois.close();
                                    boolean found = false;
                                    System.out.println("Entrer l'ID du patient: ");
                                    int IDPatient = s.nextInt();
                                    li = al.listIterator();
                                    while (li.hasNext()) {
                                        Patient e = (Patient) li.next();
                                        if (e.getIDPatient() == IDPatient) {
                                            System.out.println(e);
                                            found = true;
                                        }
                                    }
                                    if (!found)
                                        System.out.println("Record not found...!");
                                } else {
                                    System.out.println("File not found...!");
                                }
                                break;
                            case 4:
                                if (file.isFile()) {
                                    ois = new ObjectInputStream(new FileInputStream(file));
                                    al = (ArrayList<Patient>) ois.readObject();
                                    ois.close();
                                    boolean found = false;
                                    System.out.println("Entrer l'ID du patient que vous voulez suppimer: ");
                                    int IDPatient = s.nextInt();
                                    li = al.listIterator();
                                    while (li.hasNext()) {
                                        Patient e = (Patient) li.next();
                                        if (e.getIDPatient() == IDPatient) {
                                            li.remove();
                                            found = true;
                                        }
                                    }
                                    if (found) {
                                        oos = new ObjectOutputStream(new FileOutputStream(file));
                                        oos.writeObject(al);
                                        oos.close();
                                        System.out.println("Record deleted sucessfully...!");
                                    } else {
                                        System.out.println("Record not found...!");
                                    }
                                } else {
                                    System.out.println("File not found...!");
                                }
                                break;
                            case 5:
                                if (file.isFile()) {
                                    ois = new ObjectInputStream(new FileInputStream(file));
                                    al = (ArrayList<Patient>) ois.readObject();
                                    ois.close();
                                    boolean found = false;
                                    System.out.println("Entrer l'ID du patient que vous voulez modifier: ");
                                    int IDPatient = s.nextInt();
                                    li = al.listIterator();
                                    while (li.hasNext()) {
                                        Patient e = (Patient) li.next();
                                        if (e.getIDPatient() == IDPatient) {
                                            System.out.println("Entrer la cin du patient: ");
                                            String cin = s.nextLine();
                                            System.out.println("Entrer le nom du patient: ");
                                            String nom = s.nextLine();
                                            System.out.println("Entrer le prenom du patient: ");
                                            String prenom = s.nextLine();
                                            System.out.println("Entrer la date de naissance du patient: ");
                                            int date = s.nextInt();
                                            s.nextLine();
                                            System.out.println("Entrer le sexe du patient: ");
                                            String sexe = s.nextLine();
                                            li.set(new Patient(IDPatient, date, cin, nom, prenom, sexe));
                                            found = true;
                                        }
                                    }
                                    if (found) {
                                        oos = new ObjectOutputStream(new FileOutputStream(file));
                                        oos.writeObject(al);
                                        oos.close();
                                        System.out.println("Record deleted sucessfully...!");
                                    } else {
                                        System.out.println("Record not found...!");
                                    }
                                } else {
                                    System.out.println("File not found...!");
                                }
                                break;
                        }
                    } while (choice != 0);
                break;
                case 2:
                    if (fradio.isFile()) {
                        ois1 = new ObjectInputStream(new FileInputStream(fradio));
                        ar = (ArrayList<Radio>) ois1.readObject();
                        ois1.close();
                    }
                    do {
                        System.out.println("1-INSERT");
                        System.out.println("2-DISPLAY");
                        System.out.println("3-SEARCH");
                        System.out.println("4-DELETE");
                        System.out.println("5-UPDATE");
                        System.out.println("0-EXIT");
                        System.out.println("ENTER YOUR CHOICE: ");
                        choice = s.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("Enter how many radios do you want to insert: ");
                                int n = s.nextInt();
                                for (int i = 0; i < n; i++) {
                                    System.out.println("Entrer l'ID du Radio: ");
                                    int IdRadio = s.nextInt();
                                    s.nextLine();
                                    System.out.println("Entrer des remarques positives: ");
                                    String RP = s.nextLine();
                                    System.out.println("Entrer des remarques negatives: ");
                                    String RN = s.nextLine();
                                    System.out.println("Entrer des remarques generles: ");
                                    String RG = s.nextLine();
                                    System.out.println("Entrer la date de la radio: ");
                                    int DR = s.nextInt();
                                    s.nextLine();
                                    System.out.println("Entrer le chemin image: ");
                                    String CI = s.nextLine();
                                    ar.add(new Radio(IdRadio, RP, RN, RG, DR, CI));
                                }
                                oos1 = new ObjectOutputStream(new FileOutputStream(fradio));
                                oos1.writeObject(ar);
                                oos1.close();
                                break;
                            case 2:
                                if (fradio.isFile()) {
                                    ois1 = new ObjectInputStream(new FileInputStream(fradio));
                                    ar = (ArrayList<Radio>) ois1.readObject();
                                    ois1.close();
                                    li = ar.listIterator();
                                    while (li.hasNext())
                                        System.out.println(li.next());
                                }
                                break;
                            case 3:
                                if (fradio.isFile()) {
                                    ois1 = new ObjectInputStream(new FileInputStream(fradio));
                                    ar = (ArrayList<Radio>) ois1.readObject();
                                    ois1.close();
                                    boolean found = false;
                                    System.out.println("Entrer l'ID du Radio: ");
                                    int IdRadio = s.nextInt();
                                    li = ar.listIterator();
                                    while (li.hasNext()) {
                                        Radio e = (Radio) li.next();
                                        if (e.getIdRadio() == IdRadio) {
                                            System.out.println(e);
                                            found = true;
                                        }
                                    }
                                    if (!found)
                                        System.out.println("Record not found...!");
                                } else {
                                    System.out.println("File not found...!");
                                }
                                break;
                            case 4:
                                if (fradio.isFile()) {
                                    ois1 = new ObjectInputStream(new FileInputStream(fradio));
                                    ar = (ArrayList<Radio>) ois1.readObject();
                                    ois1.close();
                                    boolean found = false;
                                    System.out.println("Entrer l'ID du Radio que vous voulez suppimer: ");
                                    int IdRadio = s.nextInt();
                                    li = ar.listIterator();
                                    while (li.hasNext()) {
                                        Radio e = (Radio) li.next();
                                        if (e.getIdRadio() == IdRadio) {
                                            li.remove();
                                            found = true;
                                        }
                                    }
                                    if (found) {
                                        oos1 = new ObjectOutputStream(new FileOutputStream(fradio));
                                        oos1.writeObject(ar);
                                        oos1.close();
                                        System.out.println("Record deleted sucessfully...!");
                                    } else {
                                        System.out.println("Record not found...!");
                                    }
                                } else {
                                    System.out.println("File not found...!");
                                }
                                break;
                            case 5:
                                if (fradio.isFile()) {
                                    ois1 = new ObjectInputStream(new FileInputStream(fradio));
                                    ar = (ArrayList<Radio>) ois1.readObject();
                                    ois1.close();
                                    boolean found = false;
                                    System.out.println("Entrer l'ID du Radio que vous voulez modifier: ");
                                    int IdRadio = s.nextInt();
                                    li = ar.listIterator();
                                    while (li.hasNext()) {
                                        Radio e = (Radio) li.next();
                                        if (e.getIdRadio() == IdRadio) {
                                            System.out.println("Entrer des remarques positives: ");
                                            String RP = s.nextLine();
                                            System.out.println("Entrer des remarques negatives: ");
                                            String RN = s.nextLine();
                                            System.out.println("Entrer des remarques generles: ");
                                            String RG = s.nextLine();
                                            System.out.println("Entrer la date de la radio: ");
                                            int DR = s.nextInt();
                                            s.nextLine();
                                            System.out.println("Entrer le chemin image: ");
                                            String CI = s.nextLine();
                                            li.set(new Radio(IdRadio, RP, RN, RG, DR, CI));
                                            found = true;
                                        }
                                    }
                                    if (found) {
                                        oos1 = new ObjectOutputStream(new FileOutputStream(fradio));
                                        oos1.writeObject(ar);
                                        oos1.close();
                                        System.out.println("Record deleted sucessfully...!");
                                    } else {
                                        System.out.println("Record not found...!");
                                    }
                                } else {
                                    System.out.println("File not found...!");
                                }
                                break;

                        }
                    } while (choice != 0);
               }
               break;
        }while (choix != 0);
    }
}
