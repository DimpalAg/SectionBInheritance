/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 24/08/20
 *  Time: 1:54 PM
 *  File Name : Main.java
 * */
package execution;

import definitions.transport.FourWheeler;
import definitions.transport.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.travel();
        FourWheeler myFourWheeler = new FourWheeler();
        myFourWheeler.travel();
    }
}