package edunova;

import javax.swing.JOptionPane;

public class Spirala {

	public static void main(String[] args) {
		
		int m = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj redaka!"));
		int n = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj stupaca!"));
			
		
			int p[][] = new int [m][n];
			int broj = 1;
		     
		    
		     int maxRedak = (m-1);
		     int maxStupac = (n-1);
		     int minRedak = 0 ;
		     int minStupac = 0 ;
		     
		    
		     while(true)
		     {
		    	 if(maxRedak < minRedak || maxStupac < minStupac) break;
		    	 
		    	 	
		    		
		         // skorz dolje
		         for(int j = maxStupac; j >= minStupac; j--) {
		        	 p[maxRedak][j] = broj++;
		         }
		        maxRedak--;                  
		        
		        if(maxRedak < minRedak || maxStupac < minStupac) break;
		      

		   	 
		         //skorz ljevo
		     
		         for(int i = maxRedak; i >= minRedak; i--) {
		        	 p[i][minStupac] = broj++;
		        	 
		         }
		         minStupac++;   
		         
		         if(maxRedak < minRedak || maxStupac < minStupac) break;

		    	 
		    	 // gore skroz
		       
		         for(int j = minStupac; j<=maxStupac; j++) {
		        	 p[minRedak][j] = broj++;
		        	 }
		         minRedak++; 

		    	 //skroz desno
		         for(int i = minRedak; i <=maxRedak; i++) {
	        	 p[i][maxStupac] = broj++;
	        	 }
		         maxStupac--;
		         if(maxRedak < minRedak || maxStupac < minStupac) break;

		    
		         
		     }
		     
		     for(int i=0;i<m;i++)
		     {
		    	 for(int j=0;j<n;j++)
		    	 {
		    		 if(p[i][j]< 10)
		    			 System.out.print(p[i][j]+ "   ");
		    		 if(p[i][j] > 9 && p[i][j ]< 100)
		    			 System.out.print(p[i][j]+ "  ");
		    		 if(p[i][j] > 99)
		    			 System.out.print(p[i][j]+ " ");
		    	 }
		    	 System.out.println();
		     }
		     
		     
		     
		 }
}

