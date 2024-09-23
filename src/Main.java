class Main {

    public static void main(String[] args) {
      System.out.println("Animal class example");
      
      Animal bird = new Animal();
      bird.setNumberOfLegs(2);
      bird.setSound ("tweet");
      System.out.print ("bird goes ");
      bird.speak();
      
      Animal cow = new Animal("moo", 3);
      System.out.println("the cow has " + bird.getNumberOfLegs() + 
                         " legs and it goes: " + cow.getSound());
    }
    
  }