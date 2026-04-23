public class Main{
public static void main (String[] args){
  Animal animais[] = new Animal[10];
  Animal doguinho = new Animal("Rex",4,10.0,0);
  Animal marlin = new Peixe("naja",0,3.5,0,0);
  //Peixe marlin = new Peixe("naja",0,3.5,0,0);
  animais[2] = new Passaro("Blu",2,50.0,0);
  animais[0]= doguinho;
  animais[1] = marlin;
//  animais[1].mover();
//  animais[0].mover();
  //animais[0].setNome("doguinho");
  for(Animal b: animais){
    b.mover();
  }


  }
}
