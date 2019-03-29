
//Assignment #2: Simulation: The Tortoise and the Hare Race


public class TortoiseAndHareRace {

	//Declaring Variables
	private int t = 1;
	private int h = 1;
	private int finish = 70;
	private int pos;
	private int time;
	
	
  public TortoiseAndHareRace()
  {
	  time = 0;
	  
	  while(t != finish && h != finish)
	  {
		  hare();
		  tortoise();
		  display();
		  
		  //Increment time
	      ++time;
	  }
	  
	  //Display the output of which animal won 
	  if (t > h)
		  System.out.println("\nTORTOISE WINS!!! YAY!!!");
	  else if (h > t)
		  System.out.println("HARE WINS. YUCH!!!");
	  else 
		  System.out.println("IT'S A TIE");
	  //Display the time taken to complete the race
	  System.out.println("The time elapsed is " +time+ " seconds");
  }
  
    public void tortoise()
    {
    	//To find the random moves of tortoise
    	pos = (int)(1 + Math.random()*10);
    	
    	//Fast Plod
    	if (pos >= 1 && pos <= 5)
    		t +=3; 
        
    	//Slip
    	else if(pos == 6 || pos ==7)
    		t -= 6;
    
    	//Slow Plod
    	else
    		t += 1;
    	
    	if (t<1)
    		t = 1;
    	
    	else if(t > finish)
    		t = finish;
    }
    
    public void hare()
    {
    	//To find the random moves of hare
    	pos = (int)(1 + Math.random()*10); 
    	
    	//Sleep
    	if (pos == 1 || pos == 2)
    		h += 0;
    	
    	//Big Hop
    	else if (pos == 3 || pos == 4)
    		h += 9; 
    
    	//Big Slip
    	else if(pos == 5)
    		h -= 12;
    
    	//Small Hop
    	else if (pos >= 6 && pos <= 8)
    		h += 1;
    	
    	//Small Slip
    	else
    		h -= 2;
    	
    	if (h<1)
    		h = 1;
    	
    	else if(h > finish)
    		h = finish;
    }
  
    public void display()
    {
    	
    	for (int position = 1; position <= finish; position++)
    		
    		//Check if tortoise and hare are at the same position
    		if (position == t && position == h)
               System.out.print("OUCH!!!");
    	
    		//If the position is of hare display H
    		else if ( position == h)
    			System.out.print("H");
    	
    	    //If the position is of tortoise display T
    		else if ( position == t)
    			System.out.print("T");
    	 
    		//If the position is empty
    		else
    			System.out.print("-");
    	
    	    System.out.println();
    	    
    	    //Delays program by 1 second
    	    try {
    			Thread.sleep(1000);
    		}catch(InterruptedException ex) {
    			
    		}
    }
	
    //Main Function
    public static void main(String[] args) {
	
		System.out.println("ON YOUR MARK, GET SET\nBANG!!!!\nAND THEY'RE OFF!!!!\n");
		TortoiseAndHareRace TH = new TortoiseAndHareRace ();	
	}

}
