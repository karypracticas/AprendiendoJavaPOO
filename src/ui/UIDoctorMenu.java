package ui;

import java.util.Scanner;

public class UIDoctorMenu {

    public static void showDoctorMenu(){
        int response = 0;

        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome " + UIMenu.doctorlogged);
            System.out.println("1. Add available appointment");
            System.out.println("2. Show schedule");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    showAddAvailableAppointment();
                    break;
                case 2:
                    checkDoctorAvailableAppointments();
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        }while (response != 0);
    }

    private static void showAddAvailableAppointment(){
        System.out.println("Add your appointment");
    }

    private static void checkDoctorAvailableAppointments(){
        System.out.println("This is the schedule");

    }
}


