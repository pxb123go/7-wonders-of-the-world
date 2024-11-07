class Wonders{
    void location(){
        System.out.println("It is located in: ");
    }
}
class TheGreatPyramidofGiza extends Wonders{
    void location(){
        System.out.println("It is located in: Egypt");
    }
}
class TheHangingGardensofBabylon extends Wonders{
    void location(){
        System.out.println("It is located in: what is now Iraq, but the exact location is debated ");
    }
}
class TheStatueofZeusatOlympia extends Wonders{
    void location(){
        System.out.println("It is located in:  Greece  ");
    }
}
class TheTempleofArtemisatEphesus extends Wonders{
    void location(){
        System.out.println("It is located in: Turkey ");
    }
}
class TheMausoleumatHalicarnassus extends Wonders{
    void location(){
        System.out.println("It is located in: what is now southeastern Turkey ");
    }
}
class TheColossusofRhodes extends Wonders{
    void location(){
        System.out.println("It is located in: the island of Rhodes in the Mediterranean Sea  ");
    }
}
class TheLighthouseofAlexandria extends Wonders{
    void location(){
        System.out.println("It is located in: Egypt");
    }
}
class program{
    public static void main(String[] args) {
       Wonders h=new Wonders();
       TheGreatPyramidofGiza T=new TheGreatPyramidofGiza();
       TheHangingGardensofBabylon n=new TheHangingGardensofBabylon();
       TheColossusofRhodes i=new TheColossusofRhodes();
       TheLighthouseofAlexandria z=new TheLighthouseofAlexandria();
       TheMausoleumatHalicarnassus y=new TheMausoleumatHalicarnassus();
       TheStatueofZeusatOlympia x=new TheStatueofZeusatOlympia();
       TheTempleofArtemisatEphesus w=new TheTempleofArtemisatEphesus();
       

       
       h.location();
       T.location();
       n.location();
       i.location();
       z.location();
       y.location();
       x.location();
       w.location();
    }
}