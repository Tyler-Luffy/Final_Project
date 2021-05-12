/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final_Project;

import java.util.Scanner;
/**
 *
 * @author Tyler
 */
public class Ship_Comparisons {
    
    public static void main(String[] args)
    {

    
    int userinput = 0;    
        
    System.out.println("Welcome to World of Warships ships comparer.");
    System.out.println("Which ships would you like to compare.");
    System.out.println("To compare the Langely and Wyoming press 1");
    System.out.println("To compare the Langely and Phoenix press 2");
    System.out.println("To compare the Langely and Clemson press 3");
    System.out.println("To compare the Wyoming and Clemson press 4");
    System.out.println("To compare the Wyoming and Phoenix press 5");
    System.out.println("To compare the Phoenix and Clemson press 6");
        Scanner inputScanner = new Scanner(System.in);
    userinput = inputScanner.nextInt();
    if(userinput == 1)
        {
        LangvWyo();
        }
    else if(userinput == 2)
        {
        LangvPhoenix();   
        }
    else if(userinput == 3)
        {
        LangvClemson();
        }
    else if(userinput == 4)
        {
        WyovClemson();
        }
    else if(userinput == 5)
        {
        WyovPhoenix();
        }
    else if(userinput == 6)
        {
        PhoenixvClemson();
        }
    
    } //closes main
    public static void LangvWyo()
    { 
    
    ships langley = new ships();
    langley.survivablity = 40;
    langley.aircraft = 34;             //power of aircraft
    langley.artillery = 4;            //power of weapons
    langley.torpedos = 0;             //power of torps
    langley.antiair = 14;              //anti air capabilities
    langley.maneuverability = 16;      //self explanitory
    langley.concealment = 66;          //how easy are you spotted
    langley.avgdamage = 25881;    
        
    ships Wyoming = new ships();
    Wyoming.survivablity = 51;
    Wyoming.aircraft = 0;             //power of aircraft
    Wyoming.artillery = 75;            //power of weapons
    Wyoming.torpedos = 0;             //power of torps
    Wyoming.antiair = 19;              //anti air capabilities
    Wyoming.maneuverability = 22;      //self explanitory
    Wyoming.concealment = 45;
    Wyoming.avgdamage = 30741;
    
        int survival;
        survival = langley.survivablity - Wyoming.survivablity;
    System.out.println("The langley's survivabilty compared to the Wyoming's = " + survival);
        int airpower;
        airpower = langley.aircraft - Wyoming.aircraft;
    System.out.println("The langley's air power compared to the Wyoming's = " + airpower);
        int batterypower;
        batterypower = langley.artillery - Wyoming.artillery;
    System.out.println("The langley's Main battery power compared to the Wyoming's = " + batterypower);
        int torps;
        torps = langley.torpedos - Wyoming.torpedos;
    System.out.println("The langley's Torpies compared to the Wyoming's = " + torps);
        int aa;
        aa = langley.antiair - Wyoming.antiair;
    System.out.println("The langley's anti-air power compared to the Wyoming's = " + aa);
        int movement;
        movement = langley.maneuverability - Wyoming.maneuverability;
    System.out.println("The langley's over mobility compared to the Wyoming's = " + movement);   
        int sneaky;
        sneaky = langley.concealment - Wyoming.concealment;
    System.out.println("The langley's sneakiness compared to the Wyoming's = " + sneaky);
        int avgonlinedamage;
        avgonlinedamage = langley.avgdamage - Wyoming.avgdamage;
    System.out.println("The langley's average damage per game compared to the Wyoming's = " + avgonlinedamage); 
    }
    public static void LangvPhoenix()
    {
        
    ships langley = new ships();
    langley.survivablity = 40;
    langley.aircraft = 34;             //power of aircraft
    langley.artillery = 4;            //power of weapons
    langley.torpedos = 0;             //power of torps
    langley.antiair = 14;              //anti air capabilities
    langley.maneuverability = 16;      //self explanitory
    langley.concealment = 66;          //how easy are you spotted
    langley.avgdamage = 25881; 
        
    ships Phoenix = new ships();
    Phoenix.survivablity = 30;
    Phoenix.aircraft = 0;             //power of aircraft
    Phoenix.artillery = 36;            //power of weapons
    Phoenix.torpedos = 10;             //power of torps
    Phoenix.antiair = 10;              //anti air capabilities
    Phoenix.maneuverability = 62;      //self explanitory
    Phoenix.concealment = 53;          //how easy are you spotted
    Phoenix.avgdamage = 20797; 

        int survival;
        survival = langley.survivablity - Phoenix.survivablity;
    System.out.println("The langley's survivabilty compared to the Phoenix's = " + survival);
        int airpower;
        airpower = langley.aircraft - Phoenix.aircraft;
    System.out.println("The langley's air power compared to the Phoenix's = " + airpower);
        int batterypower;
        batterypower = langley.artillery - Phoenix.artillery;
    System.out.println("The langley's Main battery power compared to the Phoenix's = " + batterypower);
        int torps;
        torps = langley.torpedos - Phoenix.torpedos;
    System.out.println("The langley's Torpies compared to the Phoenix's = " + torps);
        int aa;
        aa = langley.antiair - Phoenix.antiair;
    System.out.println("The langley's anti-air power compared to the Phoenix's = " + aa);
        int movement;
        movement = langley.maneuverability - Phoenix.maneuverability;
    System.out.println("The langley's over mobility compared to the Phoenix's = " + movement);   
        int sneaky;
        sneaky = langley.concealment - Phoenix.concealment;
    System.out.println("The langley's sneakiness compared to the Phoenix's = " + sneaky);
        int avgonlinedamage;
        avgonlinedamage = langley.avgdamage - Phoenix.avgdamage;
    System.out.println("The langley's average damage per game compared to the Phoenix's = " + avgonlinedamage);    
    }
    public static void LangvClemson()
    {
    ships langley = new ships();
    langley.survivablity = 40;
    langley.aircraft = 34;             //power of aircraft
    langley.artillery = 4;            //power of weapons
    langley.torpedos = 0;             //power of torps
    langley.antiair = 14;              //anti air capabilities
    langley.maneuverability = 16;      //self explanitory
    langley.concealment = 66;          //how easy are you spotted
    langley.avgdamage = 25881;
    
    ships Clemson = new ships();
    Clemson.survivablity = 16;
    Clemson.aircraft = 0;             //power of aircraft
    Clemson.artillery = 10;            //power of weapons
    Clemson.torpedos = 22;             //power of torps
    Clemson.antiair = 4;              //anti air capabilities
    Clemson.maneuverability = 66;      //self explanitory
    Clemson.concealment = 86;          //how easy are you spotted
    Clemson.avgdamage = 20084;
    
    int survival;
        survival = langley.survivablity - Clemson.survivablity;
    System.out.println("The langley's survivabilty compared to the Clemson's = " + survival);
        int airpower;
        airpower = langley.aircraft - Clemson.aircraft;
    System.out.println("The langley's air power compared to the Clemson's = " + airpower);
        int batterypower;
        batterypower = langley.artillery - Clemson.artillery;
    System.out.println("The langley's Main battery power compared to the Clemson's = " + batterypower);
        int torps;
        torps = langley.torpedos - Clemson.torpedos;
    System.out.println("The langley's Torpies compared to the Clemson's = " + torps);
        int aa;
        aa = langley.antiair - Clemson.antiair;
    System.out.println("The langley's anti-air power compared to the Clemson's = " + aa);
        int movement;
        movement = langley.maneuverability - Clemson.maneuverability;
    System.out.println("The langley's over mobility compared to the Clemson's = " + movement);   
        int sneaky;
        sneaky = langley.concealment - Clemson.concealment;
    System.out.println("The langley's sneakiness compared to the Clemson's = " + sneaky);
        int avgonlinedamage;
        avgonlinedamage = langley.avgdamage - Clemson.avgdamage;
    System.out.println("The langley's average damage per game compared to the Clemson's = " + avgonlinedamage);    
    }
    public static void WyovClemson()
    {
    ships Wyoming = new ships();
    Wyoming.survivablity = 51;
    Wyoming.aircraft = 0;             //power of aircraft
    Wyoming.artillery = 75;            //power of weapons
    Wyoming.torpedos = 0;             //power of torps
    Wyoming.antiair = 19;              //anti air capabilities
    Wyoming.maneuverability = 22;      //self explanitory
    Wyoming.concealment = 45;
    Wyoming.avgdamage = 30741;
    
    ships Clemson = new ships();
    Clemson.survivablity = 16;
    Clemson.aircraft = 0;             //power of aircraft
    Clemson.artillery = 10;            //power of weapons
    Clemson.torpedos = 22;             //power of torps
    Clemson.antiair = 4;              //anti air capabilities
    Clemson.maneuverability = 66;      //self explanitory
    Clemson.concealment = 86;          //how easy are you spotted
    Clemson.avgdamage = 20084;
    
    int survival;
        survival = Wyoming.survivablity - Clemson.survivablity;
    System.out.println("The Wyoming's survivabilty compared to the Clemson's = " + survival);
        int airpower;
        airpower = Wyoming.aircraft - Clemson.aircraft;
    System.out.println("The Wyoming's air power compared to the Clemson's = " + airpower);
        int batterypower;
        batterypower = Wyoming.artillery - Clemson.artillery;
    System.out.println("The Wyoming's Main battery power compared to the Clemson's = " + batterypower);
        int torps;
        torps = Wyoming.torpedos - Clemson.torpedos;
    System.out.println("The Wyoming's Torpies compared to the Clemson's = " + torps);
        int aa;
        aa = Wyoming.antiair - Clemson.antiair;
    System.out.println("The Wyoming's anti-air power compared to the Clemson's = " + aa);
        int movement;
        movement = Wyoming.maneuverability - Clemson.maneuverability;
    System.out.println("The Wyoming's over mobility compared to the Clemson's = " + movement);   
        int sneaky;
        sneaky = Wyoming.concealment - Clemson.concealment;
    System.out.println("The Wyoming's sneakiness compared to the Clemson's = " + sneaky);
        int avgonlinedamage;
        avgonlinedamage = Wyoming.avgdamage - Clemson.avgdamage;
    System.out.println("The Wyoming's average damage per game compared to the Clemson's = " + avgonlinedamage);    
    }
    public static void WyovPhoenix()
    {
    ships Wyoming = new ships();
    Wyoming.survivablity = 51;
    Wyoming.aircraft = 0;             //power of aircraft
    Wyoming.artillery = 75;            //power of weapons
    Wyoming.torpedos = 0;             //power of torps
    Wyoming.antiair = 19;              //anti air capabilities
    Wyoming.maneuverability = 22;      //self explanitory
    Wyoming.concealment = 45;
    Wyoming.avgdamage = 30741;
    
    ships Phoenix = new ships();
    Phoenix.survivablity = 30;
    Phoenix.aircraft = 0;             //power of aircraft
    Phoenix.artillery = 36;            //power of weapons
    Phoenix.torpedos = 10;             //power of torps
    Phoenix.antiair = 10;              //anti air capabilities
    Phoenix.maneuverability = 62;      //self explanitory
    Phoenix.concealment = 53;          //how easy are you spotted
    Phoenix.avgdamage = 20797;
    
    int survival;
        survival = Wyoming.survivablity - Phoenix.survivablity;
    System.out.println("The Wyoming's survivabilty compared to the Clemson's = " + survival);
        int airpower;
        airpower = Wyoming.aircraft - Phoenix.aircraft;
    System.out.println("The Wyoming's air power compared to the Phoenix's = " + airpower);
        int batterypower;
        batterypower = Wyoming.artillery - Phoenix.artillery;
    System.out.println("The Wyoming's Main battery power compared to the Phoenix's = " + batterypower);
        int torps;
        torps = Wyoming.torpedos - Phoenix.torpedos;
    System.out.println("The Wyoming's Torpies compared to the Phoenix's = " + torps);
        int aa;
        aa = Wyoming.antiair - Phoenix.antiair;
    System.out.println("The Wyoming's anti-air power compared to the Phoenix's = " + aa);
        int movement;
        movement = Wyoming.maneuverability - Phoenix.maneuverability;
    System.out.println("The Wyoming's over mobility compared to the Phoenix's = " + movement);   
        int sneaky;
        sneaky = Wyoming.concealment - Phoenix.concealment;
    System.out.println("The Wyoming's sneakiness compared to the Phoenix's = " + sneaky);
        int avgonlinedamage;
        avgonlinedamage = Wyoming.avgdamage - Phoenix.avgdamage;
    System.out.println("The Wyoming's average damage per game compared to the Phoenix's = " + avgonlinedamage);    
    }
    public static void PhoenixvClemson()
    {
    ships Phoenix = new ships();
    Phoenix.survivablity = 30;
    Phoenix.aircraft = 0;             //power of aircraft
    Phoenix.artillery = 36;            //power of weapons
    Phoenix.torpedos = 10;             //power of torps
    Phoenix.antiair = 10;              //anti air capabilities
    Phoenix.maneuverability = 62;      //self explanitory
    Phoenix.concealment = 53;          //how easy are you spotted
    Phoenix.avgdamage = 20797;
    
    ships Clemson = new ships();
    Clemson.survivablity = 16;
    Clemson.aircraft = 0;             //power of aircraft
    Clemson.artillery = 10;            //power of weapons
    Clemson.torpedos = 22;             //power of torps
    Clemson.antiair = 4;              //anti air capabilities
    Clemson.maneuverability = 66;      //self explanitory
    Clemson.concealment = 86;          //how easy are you spotted
    Clemson.avgdamage = 20084;
    
    int survival;
        survival = Phoenix.survivablity - Clemson.survivablity;
    System.out.println("The Phoenix's survivabilty compared to the Clemson's = " + survival);
        int airpower;
        airpower = Phoenix.aircraft - Clemson.aircraft;
    System.out.println("The Phoenix's air power compared to the Clemson's = " + airpower);
        int batterypower;
        batterypower = Phoenix.artillery - Clemson.artillery;
    System.out.println("The Phoenix's Main battery power compared to the Clemson's = " + batterypower);
        int torps;
        torps = Phoenix.torpedos - Clemson.torpedos;
    System.out.println("The Phoenix's Torpies compared to the Clemson's = " + torps);
        int aa;
        aa = Phoenix.antiair - Clemson.antiair;
    System.out.println("The Phoenix's anti-air power compared to the Clemson's = " + aa);
        int movement;
        movement = Phoenix.maneuverability - Clemson.maneuverability;
    System.out.println("The Phoenix's over mobility compared to the Clemson's = " + movement);   
        int sneaky;
        sneaky = Phoenix.concealment - Clemson.concealment;
    System.out.println("The Phoenix's sneakiness compared to the Clemson's = " + sneaky);
        int avgonlinedamage;
        avgonlinedamage = Phoenix.avgdamage - Clemson.avgdamage;
    System.out.println("The Phoenix's average damage per game compared to the Clemson's = " + avgonlinedamage);    
    } 
}
