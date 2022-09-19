class Adapter implements Cable
    {
    Charger android;
    public Adapter(Charger android){

        this.android = android;
    }

    public void transfer()
    {
        android.charge();
    }
}