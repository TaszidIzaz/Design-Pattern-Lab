//The scenario is that i want to use a transfer cable as a charging cable.
// So i made a Adapter that will let me use the Data cable as an charger
//In the output we can see the USB cable is being used for charging .

class Main
{
    public static void main(String args[])
    {
        Android a1 = new Android();
        Cable c1 = new USB();

        Cable Adapter = new Adapter(a1);

        System.out.println("Android is...");
        a1.charge();

        System.out.println("Data is...");
        c1.transfer();

        System.out.println("Adapter is used for...");
        Adapter.transfer();
    }
}

