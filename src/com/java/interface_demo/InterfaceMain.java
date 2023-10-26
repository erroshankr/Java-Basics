package com.java.interface_demo;

public class InterfaceMain {
    public static void main(String[] args) {

        // case 1:
        WiproHrManager hrManager = new WiproHrManager();
        hrManager.displayName();
        hrManager.displayRole();

        // case 2:
        WiproProjectManager projectManager = new WiproProjectManager();
        projectManager.displayName();
        projectManager.displayRole();

        // case 3:
        WiproMgr wiproMgr1 = new WiproHrManager();
        wiproMgr1.displayName();
        wiproMgr1.displayRole();

        // case 4:
        WiproMgr wiproMgr2 = new WiproProjectManager(); // compile time check
        wiproMgr2.displayName();
        wiproMgr2.displayRole();

        System.out.println(wiproMgr2 instanceof Manager);
        System.out.println(wiproMgr2 instanceof Director);

       /* // case 5:
        Manager manager = new WiproHrManager();
    //    Manager m1 = new WiproMgr(); -> Not Possible
         manager.displayName();
    //     manager.displayRole();  --> Not possible

        // case 6:
        Manager m2 = new WiproProjectManager();
        Director d1 = new WiproProjectManager();*/

       WiproProjectManager m3 = new WiproProjectEmployee(); // Compile time Polymorphism/ Static binding
       m3.displayRole();  // conflict is resolved during RUNTIME --> RUN TIME POLYMORPHISM, Dynamic Polymorphism, Dynamic Method Dispatch, Dynamic Binding
       m3.displayName();


    }
}
