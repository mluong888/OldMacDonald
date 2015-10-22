class Chick implements Animal {     
     private String myType;     
     private String mySound;
     
     public Chick(String type, String sound1, String sound2){
        int x = (int)(Math.random()*2);
        if (x==0)
        {
            mySound = sound1;
        }
        else
        {
            mySound = sound2;
        }
        myType=type;
     }      
     /*public Chick(String type, String sound)     {         
         myType = type;         
         mySound = sound;     
     }   */  
     public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}