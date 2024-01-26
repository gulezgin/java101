
package bruteforce;




public class BruteForce {

    public static void main(String[] args)  {
        StringBuilder builder = new StringBuilder();
        
        builder.append("yakup");
        builder.append("merhaba");
        builder.append("bilgisayar");
        
        String str = builder.toString();
        //System.out.print(str);

        String harfler ="" + str.charAt(0);
        for (int i = 1; i < str.length(); i++){
                Boolean ayni=false;
                for(int j = 0; j < harfler.length(); i++){
                        if(str.charAt(i)==harfler.charAt(j)){
                                ayni = true;
                                break;
                                }
                            }
                if(ayni==false){
                        harfler = harfler + str.charAt(i);
                }
        char [] unluler = {'a','e','ı','o','i','ö','u','ü'};
      
        for(int s =0; s<harfler.length(); s++) {
			for(int f =0; f<harfler.length(); f++) {
				for(int r =0; r<harfler.length(); r++) {
					for(int e=0; e<harfler.length(); e++) {
						for(int x =0; x<harfler.length(); x++) {
							Boolean olamaz= true;
							String st = "" + harfler.charAt(s) + harfler.charAt(f) + harfler.charAt(r) + harfler.charAt(e) + harfler.charAt(x);
							//System.out.println(st);
                                                        if(st.charAt(2)=='y') {
								olamaz= false;
							}
							for(int l=0; l<unluler.length; l++) {
								if(st.charAt(0)==unluler[l]) {
									olamaz= false;
								}
							}
							
							if(olamaz==true) {
								System.out.println(st + "\n");
							}
							
							
						}	
					}	
				}	
			}
			
		}
        
        }
    }
}